package com.czluciusdev.dice_roller

import android.content.Context

class DiceImage(context: Context): androidx.appcompat.widget.AppCompatImageView(context) {
    var diceNumber: Int = 0
    var diceXMarginPercentage: Number? = null
    var dicePercentY: Number? = null
}