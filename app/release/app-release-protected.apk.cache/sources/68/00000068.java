package androidx.lifecycle;

import o.pN;
import o.registerIn;
import o.setAllCaps;
import o.setCheckable;
import o.setTouchDelegate;
import o.setVerticalScrollBarEnabled;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements setCheckable {
    private final setAllCaps MenuHostHelper$$ExternalSyntheticLambda1;

    public SavedStateHandleAttacher(setAllCaps setallcaps) {
        pN.setY(setallcaps, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setallcaps;
    }

    @Override // o.setCheckable
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
        pN.setY(settouchdelegate, "");
        pN.setY(setx, "");
        if (!(setx == registerIn.setX.ON_CREATE)) {
            StringBuilder sb = new StringBuilder("Next event must be ON_CREATE, it was ");
            sb.append(setx);
            throw new IllegalStateException(sb.toString().toString());
        }
        settouchdelegate.MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda1(this);
        setAllCaps setallcaps = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setallcaps.setIconTintList) {
            return;
        }
        setallcaps.MenuHostHelper$$ExternalSyntheticLambda1 = setallcaps.setX.MenuHostHelper$$ExternalSyntheticLambda0("androidx.lifecycle.internal.SavedStateHandlesProvider");
        setallcaps.setIconTintList = true;
        setVerticalScrollBarEnabled setverticalscrollbarenabled = (setVerticalScrollBarEnabled) setallcaps.MenuHostHelper$$ExternalSyntheticLambda0.setY();
    }
}