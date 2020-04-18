package com.czluciusdev.diceroller

import android.content.Context
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.RelativeLayout
import androidx.core.content.ContextCompat

/**
 * A Class that stores the image of the Dice, with added properties:
 *
 * [diceNumber] - stores the number displayed on the Dice, from 1 to 6
 *
 * [leftMarginPercent] - stores the horizontal margin of the Dice as a percentage of the entire Dice Canvas, from left of screen
 *
 * [topMarginPercent] - equivalent of <em>leftMarginPercent</em>, stores margin in vertical dimension, from top of screen
 *
 * @constructor Creates a blank Dice Image to be populated with an Image Resource.
 */
class DiceImage(context: Context): androidx.appcompat.widget.AppCompatImageView(context){
    constructor(
        context: Context,
        diceNumber: Int,
        leftMarginPercent: Float,
        topMarginPercent: Float
    ) : this(context) {
        this.diceNumber = diceNumber
        this.leftMarginPercent = leftMarginPercent
        this.topMarginPercent = topMarginPercent
        setImageResource(getDiceFromNum(diceNumber))
        initialiseParameters()
    }


    var diceNumber: Int = 0
    var leftMarginPercent: Float = (0..100).random().toFloat()
    var topMarginPercent: Float = (0..100).random().toFloat()


    init {
        initialiseParameters()
        //Sets Dice Image
        setImageResource(getDiceFromNum((1..6).random()))
    }

    private fun initialiseParameters() {
        layoutParams = RelativeLayout.LayoutParams(
            WRAP_CONTENT, WRAP_CONTENT
        )
        (layoutParams as RelativeLayout.LayoutParams).apply {
            addRule(RelativeLayout.ALIGN_PARENT_LEFT)
            addRule(RelativeLayout.ALIGN_PARENT_TOP)
        }
    }


}