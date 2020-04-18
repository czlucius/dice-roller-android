package com.czluciusdev.diceroller;

import java.lang.System;

/**
 * Factory object for creating [DiceImage] objects.
 * Use function [instantiateDiceImage] to instantiate A Dice Image
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\nH\u0016J\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/czluciusdev/diceroller/DiceImageFactory;", "Landroid/os/Parcelable;", "diceImageInit", "Lcom/czluciusdev/diceroller/DiceImage;", "(Lcom/czluciusdev/diceroller/DiceImage;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "diceNumber", "", "leftMarginPercent", "", "topMarginPercent", "describeContents", "instantiateDiceImage", "context", "Landroid/content/Context;", "writeToParcel", "", "flags", "CREATOR", "app_debug"})
public final class DiceImageFactory implements android.os.Parcelable {
    private int diceNumber;
    private float leftMarginPercent;
    private float topMarginPercent;
    public static final com.czluciusdev.diceroller.DiceImageFactory.CREATOR CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.czluciusdev.diceroller.DiceImage instantiateDiceImage(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    private DiceImageFactory() {
        super();
    }
    
    public DiceImageFactory(@org.jetbrains.annotations.NotNull()
    com.czluciusdev.diceroller.DiceImage diceImageInit) {
        super();
    }
    
    public DiceImageFactory(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/czluciusdev/diceroller/DiceImageFactory$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/czluciusdev/diceroller/DiceImageFactory;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/czluciusdev/diceroller/DiceImageFactory;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.czluciusdev.diceroller.DiceImageFactory> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.czluciusdev.diceroller.DiceImageFactory createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.czluciusdev.diceroller.DiceImageFactory[] newArray(int size) {
            return null;
        }
        
        private CREATOR() {
            super();
        }
    }
}