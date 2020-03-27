package com.czluciusdev.dice_roller


import android.content.ClipData
import android.content.ClipDescription
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.*
import android.widget.RelativeLayout
import android.widget.RelativeLayout.LayoutParams.WRAP_CONTENT
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
//import com.czluciusdev.dice_roller.databinding.DiceFragmentBinding
import kotlinx.android.synthetic.main.dice_fragment.*


class DiceFragment : Fragment() {


    private val viewModel: DiceViewModel by viewModels()
    private lateinit var binding: com.czluciusdev.dice_roller.databinding.DiceFragmentBinding
    private var screenWidth: Int? = null
    private var screenHeight: Int? = null
    private lateinit var orientationEventListener: OrientationEventListener

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.dice_fragment, container, false)
        binding.vm = viewModel
        binding.lifecycleOwner = this
        restoreDice()
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
            }
            true
        }


        binding.fabRoll.setOnClickListener {
            if (viewModel.diceCollection.isNotEmpty()) {
                rollDice()
            } else {
                addDice()

            }
        }

        binding.removeArea.setOnDragListener(diceOnDragListener)

        return binding.root
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
        val context: Context,
        val binding: com.czluciusdev.dice_roller.databinding.DiceFragmentBinding
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
            binding.diceNum.animate().rotation(degrees)
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

    private fun infoNav() {
        this.findNavController().navigate(R.id.infoNav)
    }

    private fun removeDice(diceImage: DiceImage) {
        diceImage.visibility = View.GONE
        viewModel.diceCollection.remove(diceImage)
        viewModel.totalDiceNumber.value =
            viewModel.totalDiceNumber.value?.minus(diceImage.diceNumber)

    }

    private fun renderDice(
        xMarginPercent: Float,
        yMarginPercent: Float,
        newDiceImage: DiceImage,
        diceNumber: Int
    ) {
        if (screenWidth == null) {
            screenWidth = calcX(diceCanvas = binding.diceCanvas, context = context!!)
        }
        if (screenHeight == null) {
            screenHeight = calcY(diceCanvas = binding.diceCanvas, context = context!!)
        }
        //Layout Parameters for the Dice Image.
        val diceImageLayoutParams = RelativeLayout.LayoutParams(
            WRAP_CONTENT, WRAP_CONTENT
        )

        //Align with parent.
        diceImageLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT)
        diceImageLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP)


        //Set Margins.
        // Setting X axis margin
        diceImageLayoutParams.leftMargin = getXY(percent = xMarginPercent, total = screenWidth!!)
        // Setting Y axis margin
        diceImageLayoutParams.topMargin = getXY(percent = yMarginPercent, total = screenHeight!!)

        //Assign Parameters to Dice Image.
        newDiceImage.layoutParams = diceImageLayoutParams

        //Adding the Dice Image to the Dice Canvas.
        binding.diceCanvas.addView(newDiceImage)

        //Setting the Image
        newDiceImage.setImageResource(getDiceFromNum(diceNumber))

        //Animating the dice
        newDiceImage.animate().rotationBy((100..359).random().toFloat()).duration = 349
    }


    private fun addDice() {
        val diceXMarginPercentage = (0..100).random().toFloat()
        val diceYMarginPercentage = (0..100).random().toFloat()
        val newDiceImage = DiceImage(context!!)
        val diceNo = (1..6).random()

        //Renders the dice on screen
        renderDice(
            xMarginPercent = diceXMarginPercentage,
            yMarginPercent = diceYMarginPercentage,
            newDiceImage = newDiceImage,
            diceNumber = diceNo
        )

        //Set the Long Click Listener of the dice, to be able to drag the dice to the bin.
        newDiceImage.setOnLongClickListener(diceLongClickListener)


        //Change total dice value displayed on screen
        viewModel.totalDiceNumber.value = viewModel.totalDiceNumber.value!!.plus(diceNo)

        //Save Changes
        newDiceImage.diceXMarginPercentage = diceXMarginPercentage
        newDiceImage.dicePercentY = diceYMarginPercentage
        newDiceImage.diceNumber = diceNo
        viewModel.diceCollection.add(newDiceImage)
    }

    private fun rollDice() {

        var newTotalDiceNumber = 0
        //Recursively traverses through the collection of dices to "roll" them.
        viewModel.diceCollection.forEach {
            val diceNumber = (1..6).random()
            it.diceNumber = diceNumber
            newTotalDiceNumber += diceNumber
            val diceRes = getDiceFromNum(diceNumber)
            it.setImageResource(diceRes)
            it.animate().rotationBy((80..359).random().toFloat()).duration = 349
        }
        viewModel.totalDiceNumber.value = newTotalDiceNumber
    }

    private fun restoreDice() {
        if (viewModel.diceCollection.isEmpty()) return

        viewModel.diceCollection.forEach {
            //Redraw the image, so that e.g user changes to dark mode, image will also change.
            it.setImageResource(getDiceFromNum(it.diceNumber))
            binding.diceCanvas.addView(it)
        }

    }
}

