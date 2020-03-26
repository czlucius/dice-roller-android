package com.czluciusdev.diceroller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0016H\u0016J\b\u0010!\u001a\u00020\u0016H\u0016J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0002J(\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\fH\u0002J\b\u0010+\u001a\u00020\u0016H\u0002J\b\u0010,\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006."}, d2 = {"Lcom/czluciusdev/diceroller/DiceFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/czluciusdev/diceroller/databinding/DiceFragmentBinding;", "diceLongClickListener", "Landroid/view/View$OnLongClickListener;", "diceOnDragListener", "Landroid/view/View$OnDragListener;", "orientationEventListener", "Landroid/view/OrientationEventListener;", "screenHeight", "", "Ljava/lang/Integer;", "screenWidth", "viewModel", "Lcom/czluciusdev/diceroller/DiceViewModel;", "getViewModel", "()Lcom/czluciusdev/diceroller/DiceViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addDice", "", "infoNav", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "removeDice", "diceImage", "Lcom/czluciusdev/diceroller/DiceImage;", "renderDice", "xMarginPercent", "", "yMarginPercent", "newDiceImage", "diceNumber", "restoreDice", "rollDice", "OrientationListener", "app_debug"})
public final class DiceFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.czluciusdev.diceroller.databinding.DiceFragmentBinding binding;
    private java.lang.Integer screenWidth;
    private java.lang.Integer screenHeight;
    private android.view.OrientationEventListener orientationEventListener;
    private final android.view.View.OnLongClickListener diceLongClickListener = null;
    private final android.view.View.OnDragListener diceOnDragListener = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.czluciusdev.diceroller.DiceViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    private final void infoNav() {
    }
    
    private final void removeDice(com.czluciusdev.diceroller.DiceImage diceImage) {
    }
    
    private final void renderDice(float xMarginPercent, float yMarginPercent, com.czluciusdev.diceroller.DiceImage newDiceImage, int diceNumber) {
    }
    
    private final void addDice() {
    }
    
    private final void rollDice() {
    }
    
    private final void restoreDice() {
    }
    
    public DiceFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019\u00a8\u0006&"}, d2 = {"Lcom/czluciusdev/diceroller/DiceFragment$OrientationListener;", "Landroid/view/OrientationEventListener;", "context", "Landroid/content/Context;", "binding", "Lcom/czluciusdev/diceroller/databinding/DiceFragmentBinding;", "(Landroid/content/Context;Lcom/czluciusdev/diceroller/databinding/DiceFragmentBinding;)V", "getBinding", "()Lcom/czluciusdev/diceroller/databinding/DiceFragmentBinding;", "getContext", "()Landroid/content/Context;", "rotation", "", "rotation0", "Lkotlin/Pair;", "getRotation0", "()Lkotlin/Pair;", "rotation180", "getRotation180", "rotation270", "getRotation270", "rotation90", "getRotation90", "rotationState0", "getRotationState0", "()I", "rotationState180", "getRotationState180", "rotationState270", "getRotationState270", "rotationState90", "getRotationState90", "animateViewsByDegrees", "", "degrees", "", "onOrientationChanged", "orientation", "app_debug"})
    static final class OrientationListener extends android.view.OrientationEventListener {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Pair<java.lang.Integer, java.lang.Integer> rotation0 = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Pair<java.lang.Integer, java.lang.Integer> rotation90 = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Pair<java.lang.Integer, java.lang.Integer> rotation180 = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Pair<java.lang.Integer, java.lang.Integer> rotation270 = null;
        private final int rotationState0 = 1;
        private final int rotationState90 = 2;
        private final int rotationState180 = 3;
        private final int rotationState270 = 4;
        private int rotation;
        @org.jetbrains.annotations.NotNull()
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull()
        private final com.czluciusdev.diceroller.databinding.DiceFragmentBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.Pair<java.lang.Integer, java.lang.Integer> getRotation0() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.Pair<java.lang.Integer, java.lang.Integer> getRotation90() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.Pair<java.lang.Integer, java.lang.Integer> getRotation180() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.Pair<java.lang.Integer, java.lang.Integer> getRotation270() {
            return null;
        }
        
        public final int getRotationState0() {
            return 0;
        }
        
        public final int getRotationState90() {
            return 0;
        }
        
        public final int getRotationState180() {
            return 0;
        }
        
        public final int getRotationState270() {
            return 0;
        }
        
        public final void animateViewsByDegrees(float degrees) {
        }
        
        @java.lang.Override()
        public void onOrientationChanged(int orientation) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.czluciusdev.diceroller.databinding.DiceFragmentBinding getBinding() {
            return null;
        }
        
        public OrientationListener(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.czluciusdev.diceroller.databinding.DiceFragmentBinding binding) {
            super(null);
        }
    }
}