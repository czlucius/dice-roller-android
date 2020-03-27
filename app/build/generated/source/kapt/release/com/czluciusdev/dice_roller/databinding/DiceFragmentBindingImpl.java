package com.czluciusdev.dice_roller.databinding;
import com.czluciusdev.dice_roller.R;
import com.czluciusdev.dice_roller.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DiceFragmentBindingImpl extends DiceFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.diceCanvas, 2);
        sViewsWithIds.put(R.id.bottomApp, 3);
        sViewsWithIds.put(R.id.diceNumHolder, 4);
        sViewsWithIds.put(R.id.fabRoll, 5);
        sViewsWithIds.put(R.id.remove_area, 6);
        sViewsWithIds.put(R.id.imageView, 7);
        sViewsWithIds.put(R.id.textView, 8);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DiceFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private DiceFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.bottomappbar.BottomAppBar) bindings[3]
            , (android.widget.RelativeLayout) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.LinearLayout) bindings[4]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[5]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.TextView) bindings[8]
            );
        this.diceNum.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.czluciusdev.dice_roller.DiceViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.czluciusdev.dice_roller.DiceViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmDiceNumberString((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmDiceNumberString(androidx.lifecycle.LiveData<java.lang.String> VmDiceNumberString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.czluciusdev.dice_roller.DiceViewModel vm = mVm;
        androidx.lifecycle.LiveData<java.lang.String> vmDiceNumberString = null;
        java.lang.String vmDiceNumberStringGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (vm != null) {
                    // read vm.diceNumberString
                    vmDiceNumberString = vm.getDiceNumberString();
                }
                updateLiveDataRegistration(0, vmDiceNumberString);


                if (vmDiceNumberString != null) {
                    // read vm.diceNumberString.getValue()
                    vmDiceNumberStringGetValue = vmDiceNumberString.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.diceNum, vmDiceNumberStringGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.diceNumberString
        flag 1 (0x2L): vm
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}