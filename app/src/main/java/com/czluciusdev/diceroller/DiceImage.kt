package com.czluciusdev.diceroller

import android.content.Context
import android.widget.ImageView

class DiceImage(context: Context): androidx.appcompat.widget.AppCompatImageView(context) {
    var diceNumber: Int = 0
    var diceXMarginPercentage: Number? = null
    var dicePercentY: Number? = null
}