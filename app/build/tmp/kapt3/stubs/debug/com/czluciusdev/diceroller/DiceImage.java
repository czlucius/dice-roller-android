package com.czluciusdev.diceroller;

import java.lang.System;

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
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0015\u001a\u00020\u0016H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lcom/czluciusdev/diceroller/DiceImage;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "diceNumber", "", "leftMarginPercent", "", "topMarginPercent", "(Landroid/content/Context;IFF)V", "(Landroid/content/Context;)V", "getDiceNumber", "()I", "setDiceNumber", "(I)V", "getLeftMarginPercent", "()F", "setLeftMarginPercent", "(F)V", "getTopMarginPercent", "setTopMarginPercent", "initialiseParameters", "", "app_debug"})
public final class DiceImage extends androidx.appcompat.widget.AppCompatImageView {
    private int diceNumber;
    private float leftMarginPercent;
    private float topMarginPercent;
    private java.util.HashMap _$_findViewCache;
    
    public final int getDiceNumber() {
        return 0;
    }
    
    public final void setDiceNumber(int p0) {
    }
    
    public final float getLeftMarginPercent() {
        return 0.0F;
    }
    
    public final void setLeftMarginPercent(float p0) {
    }
    
    public final float getTopMarginPercent() {
        return 0.0F;
    }
    
    public final void setTopMarginPercent(float p0) {
    }
    
    private final void initialiseParameters() {
    }
    
    public DiceImage(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public DiceImage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int diceNumber, float leftMarginPercent, float topMarginPercent) {
        super(null);
    }
}