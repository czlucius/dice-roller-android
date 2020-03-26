package com.czluciusdev.diceroller

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {
    val totalDiceNumber = MutableLiveData<Int>()

    val diceNumberString: LiveData<String> = Transformations.map(totalDiceNumber) {
        return@map it.toString()
    }
    var diceCollection: MutableCollection<DiceImage> = mutableSetOf()


    init{
        totalDiceNumber.value = 0
    }

}
