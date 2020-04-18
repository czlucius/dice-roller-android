package com.czluciusdev.diceroller


import android.content.ClipData
import android.content.ClipDescription
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.RelativeLayout
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.dice_fragment.*

const val DICE_ARRAY_KEY: String = "DICE_ARRAY"
const val TAG = "DiceFragment"

class DiceFragment : Fragment() {


    private lateinit var binding: com.czluciusdev.diceroller.databinding.DiceFragmentBinding
    private var screenWidth: Int? = null
    private var screenHeight: Int? = null
    private lateinit var orientationEventListener: OrientationEventListener
    private var diceCollection: MutableCollection<DiceImage> = mutableSetOf()
    private var totalDiceNumber = 0
        set(value) {
            field = value
            binding.diceNum.text = value.toString()
        }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.dice_fragment, container, false)
        binding.lifecycleOwner = this

        orientationEventListener =
            OrientationListener(
                context!!,
                binding
            )// Listen to rotation changes
        //Initialisation finished.

        binding.bottomApp.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.add_menu -> addDice()
                R.id.info_menu -> infoNav()
                R.id.remove_all -> removeAll()
            }
            true
        }
        binding.removeArea.setOnDragListener(diceOnDragListener)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.post {
            initialiseFragment(savedInstanceState)
        }
    }




    override fun onStart() {
        orientationEventListener.enable()
        super.onStart()
    }

    override fun onStop() {
        orientationEventListener.disable()

        // Remove Views from previous layouts, so restoration is possible.
        diceCanvas.removeAllViews()
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        saveAllState(outState)
    }


    private val diceLongClickListener = View.OnLongClickListener {

        val clipData = ClipData.Item(it.tag as? CharSequence)
        val dragData = ClipData(
            it.tag as? CharSequence,
            arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN), clipData
        )
        val myShadow = View.DragShadowBuilder(it)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            it.startDragAndDrop(
                dragData,
                myShadow,
                it,
                0
            )
        } else {
            it.startDrag(
                dragData,
                myShadow,
                it,
                0
            )
        }
        return@OnLongClickListener true
    }


    private val diceOnDragListener = View.OnDragListener { diceRemovalArea, dragEvent ->
        val originalDice = (dragEvent.localState as DiceImage)
        when (dragEvent?.action) {
            DragEvent.ACTION_DRAG_STARTED -> {
                //Making the Dice invisible, during the drag operation
                originalDice.visibility = View.INVISIBLE

                //Animating the dice removal area to slide up from bottom
                diceRemovalArea!!.animate().translationY(0F)

                //Animating the FAB to move up so that it would not overlap with the dice removal area.
                binding.fabRoll.animate()
                    .translationY(-(getDimensResource(context, R.dimen.height_action_bar)))
            }

            DragEvent.ACTION_DRAG_ENDED -> {
                if (originalDice.visibility != View.GONE) {
                    originalDice.visibility = View.VISIBLE
                }
                diceRemovalArea!!.animate().translationY(
                    getDimensResource(context = context, dimenRes = R.dimen.height_action_bar)
                )
                binding.fabRoll.animate().translationY(0F)
                diceRemovalArea.alpha = 0.6F


            }
            DragEvent.ACTION_DRAG_ENTERED -> {
                diceRemovalArea.alpha = 1.0F
            }
            DragEvent.ACTION_DRAG_EXITED -> {
                diceRemovalArea.alpha = 0.6F
            }
            DragEvent.ACTION_DROP -> {
                removeDice(originalDice)
            }


        }
        true
    }


    private class OrientationListener(
        context: Context,
        val binding: com.czluciusdev.diceroller.databinding.DiceFragmentBinding
    ) :
        OrientationEventListener(context) {
        val rotation0 = Pair(35, 325)
        val rotation90 = Pair(235, 305)
        val rotation180 = Pair(145, 215)
        val rotation270 = Pair(55, 125)

        val rotationState0 = 1
        val rotationState90 = 2
        val rotationState180 = 3
        val rotationState270 = 4

        private var rotation: Int = 0

        fun animateViewsByDegrees(degrees: Float) {
            binding.fabRoll.animate().rotation(degrees)
            binding.diceNum.apply {
                pivotX = (left + width / 2).toFloat()
                animate().rotation(degrees)
            }
        }

        override fun onOrientationChanged(orientation: Int) {
            if (orientation < rotation0.first || orientation > rotation0.second && rotation != rotationState0) {
                animateViewsByDegrees(0F)
                rotation = rotationState0

            } else if (orientation > rotation90.first && orientation < rotation90.second && rotation != rotationState90) {
                animateViewsByDegrees(90F)
                rotation = rotationState90
            } else if (orientation > rotation180.first && orientation < rotation180.second && rotation != rotationState180) {

                animateViewsByDegrees(180F)
                rotation = rotationState180
            } else if (orientation > rotation270.first && orientation < rotation270.second && rotation != rotationState270) {
                animateViewsByDegrees(270F)
                rotation = rotationState270
            }
        }


    }


    //Functions


    private fun removeAll() {
        binding.diceCanvas.removeAllViews()
        diceCollection.clear()
        totalDiceNumber = 0
    }

    private fun infoNav() {
        this.findNavController().navigate(R.id.navigate_to_info)
    }

    private fun removeDice(diceImage: DiceImage) {
        diceImage.visibility = View.GONE
        diceCollection.remove(diceImage)
        totalDiceNumber -= diceImage.diceNumber
    }

    private fun renderDice(
        newDiceImage: DiceImage,
        diceNumber: Int
    ) {
        //Calculate total screen width and height
        if (screenHeight == null || screenHeight == 0 || screenWidth == null || screenWidth == 0){

            screenHeight = calcY(binding.diceCanvas, context!!)
            screenWidth = calcX(binding.diceCanvas, context!!)
        }

        //Layout Parameters for the Dice Image
        val diceImageLayoutParams = newDiceImage.layoutParams as RelativeLayout.LayoutParams

        //Set Margins.
        // Setting Left margin
        diceImageLayoutParams.leftMargin =
            getXY(percent = newDiceImage.leftMarginPercent, total = screenWidth!!)

        // Setting Top margin
        diceImageLayoutParams.topMargin =
            getXY(percent = newDiceImage.topMarginPercent, total = screenHeight!!)

        //Adding the Dice Image to the Dice Canvas.
        binding.diceCanvas.addView(newDiceImage)

        //Setting the Image
        newDiceImage.setImageResource(getDiceFromNum(diceNumber))

        //Animating the dice
        newDiceImage.animate().rotationBy((100..359).random().toFloat()).duration = 349

    }





    private fun addDice(newDiceImage: DiceImage = DiceImage(context!!), diceNumber: Int = (1..6).random()) {

        //Renders the dice on screen
        renderDice(
            newDiceImage = newDiceImage,
            diceNumber = diceNumber
        )

        //Change total dice value displayed on screen
        totalDiceNumber += diceNumber

        //Save Changes
        newDiceImage.diceNumber = diceNumber

        //Set the Long Click Listener of the dice, to be able to drag the dice to the bin.
        newDiceImage.setOnLongClickListener(diceLongClickListener)

        //Add to Collection for referencing
        diceCollection.add(newDiceImage)
    }


    private fun rollDice() {

        var newTotalDiceNumber = 0
        //Recursively traverses through the collection of dices to "roll" them.
        diceCollection.forEach {
            val diceNumber = (1..6).random()
            it.diceNumber = diceNumber
            newTotalDiceNumber += diceNumber
            val diceRes = getDiceFromNum(diceNumber)
            it.setImageResource(diceRes)
            it.animate().rotationBy((80..359).random().toFloat()).duration = 349
        }
        totalDiceNumber = newTotalDiceNumber
    }

    private fun saveAllState(outState: Bundle) {
        val savedState: ArrayList<DiceImageFactory> = arrayListOf()
        diceCollection.forEach {
            savedState.add(DiceImageFactory(it))
        }
        outState.putParcelableArrayList(DICE_ARRAY_KEY, savedState)
    }



    private fun restoreState(savedInstanceState: Bundle?) {

        if (savedInstanceState == null) return


        val restoredState =
            savedInstanceState.getParcelableArrayList<DiceImageFactory>(DICE_ARRAY_KEY)
        restoredState?.forEach {
            val diceImage = it.instantiateDiceImage(context!!)
            addDice(diceImage)
            diceCollection.add(diceImage)
        }
    }

    private fun initialiseFragment(savedInstanceState: Bundle?){
        Log.e(TAG, "initialiseFragment function executed" )
        calcScreenDimensions()
        restoreState(savedInstanceState)
        binding.fabRoll.setOnClickListener {
            if (diceCollection.isNotEmpty()) {
                rollDice()
            } else {
                addDice()
            }
        }
    }



    private fun calcScreenDimensions() {
        screenHeight = calcY(binding.diceCanvas, context!!)
        screenWidth = calcX(binding.diceCanvas, context!!)
    }


}

