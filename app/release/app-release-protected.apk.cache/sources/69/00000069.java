package androidx.lifecycle;

import o.getCallingUidOrThrow;
import o.registerIn;
import o.setCheckable;
import o.setTouchDelegate;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements setCheckable {
    public boolean MenuHostHelper$$ExternalSyntheticLambda0;
    public final String MenuHostHelper$$ExternalSyntheticLambda1;
    public final getCallingUidOrThrow setY;

    @Override // o.setCheckable
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
        if (setx == registerIn.setX.ON_DESTROY) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
            settouchdelegate.MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda1(this);
        }
    }
}