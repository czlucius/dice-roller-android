package com.czluciusdev.diceroller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/czluciusdev/diceroller/DiceViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "diceCollection", "", "Lcom/czluciusdev/diceroller/DiceImage;", "getDiceCollection", "()Ljava/util/Collection;", "setDiceCollection", "(Ljava/util/Collection;)V", "diceNumberString", "Landroidx/lifecycle/LiveData;", "", "getDiceNumberString", "()Landroidx/lifecycle/LiveData;", "totalDiceNumber", "Landroidx/lifecycle/MutableLiveData;", "", "getTotalDiceNumber", "()Landroidx/lifecycle/MutableLiveData;", "app_release"})
public final class DiceViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> totalDiceNumber = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> diceNumberString = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.Collection<com.czluciusdev.diceroller.DiceImage> diceCollection;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getTotalDiceNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getDiceNumberString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<com.czluciusdev.diceroller.DiceImage> getDiceCollection() {
        return null;
    }
    
    public final void setDiceCollection(@org.jetbrains.annotations.NotNull()
    java.util.Collection<com.czluciusdev.diceroller.DiceImage> p0) {
    }
    
    public DiceViewModel() {
        super();
    }
}