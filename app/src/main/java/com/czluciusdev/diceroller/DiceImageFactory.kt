package com.czluciusdev.diceroller

import android.content.Context
import android.os.Parcel
import android.os.Parcelable

/**
 * Factory object for creating [DiceImage] objects.
 * Use function [instantiateDiceImage] to instantiate A Dice Image
 */
class DiceImageFactory private constructor() : Parcelable {

    private var diceNumber: Int = 0
    private var leftMarginPercent: Float = (0..100).random().toFloat()
    private var topMarginPercent: Float = (0..100).random().toFloat()

    constructor(diceImageInit: DiceImage) : this() {
        diceNumber = diceImageInit.diceNumber
        leftMarginPercent = diceImageInit.leftMarginPercent
        topMarginPercent = diceImageInit.topMarginPercent
    }

    constructor(parcel: Parcel) : this() {
        diceNumber = parcel.readInt()
        leftMarginPercent = parcel.readFloat()
        topMarginPercent = parcel.readFloat()
    }

    fun instantiateDiceImage(context: Context): DiceImage {
        return DiceImage(context, diceNumber, leftMarginPercent, topMarginPercent)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(diceNumber)
        parcel.writeFloat(leftMarginPercent)
        parcel.writeFloat(topMarginPercent)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DiceImageFactory> {
        override fun createFromParcel(parcel: Parcel): DiceImageFactory {
            return DiceImageFactory(parcel)
        }

        override fun newArray(size: Int): Array<DiceImageFactory?> {
            return arrayOfNulls(size)
        }
    }

}