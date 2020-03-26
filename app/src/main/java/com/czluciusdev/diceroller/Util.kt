package com.czluciusdev.diceroller

import android.content.Context
import android.view.animation.AnimationUtils
import android.widget.RelativeLayout
import androidx.annotation.DimenRes

//var heightValue: Int? = null
//var widthValue: Int? = null
//
//fun getPercentHeight(percent: Int): Int?{
//    if (heightValue == null) return null
//    if (percent > 100F && percent < 0F) return null
//    return heightValue!!.times((percent / 100))
//}
//
//fun getPercentWidth(percent: Int): Int?{
//    if (widthValue == null) return null
//    if (percent > 100F && percent < 0F) return null
//    return widthValue!!.times((percent / 100))
//}

fun calcX(diceCanvas: RelativeLayout, context: Context): Int {
    return (diceCanvas.width - getDimensResource(context, R.dimen.width_margin)).toInt()
}
fun calcY(diceCanvas: RelativeLayout, context: Context): Int {
    return (diceCanvas.height - getDimensResource(context, R.dimen.height_margin)).toInt()
}
fun getXY(percent: Float, total: Int): Int {
    return (total.toFloat() * (percent / 100)).toInt()
}



fun getDiceFromNum(num: Int): Int{

    return when(num){
        1 -> R.drawable.ic_dice1
        2 -> R.drawable.ic_dice2
        3 -> R.drawable.ic_dice3
        4 -> R.drawable.ic_dice4
        5 -> R.drawable.ic_dice5
        6 -> R.drawable.ic_dice6
        else -> throw IndexOutOfBoundsException("The Dice Number is not within 1 to 6")
    }

}

fun getDimensResource(context: Context?, @DimenRes dimenRes: Int): Float {
    return context!!.resources.getDimension(dimenRes)
}




