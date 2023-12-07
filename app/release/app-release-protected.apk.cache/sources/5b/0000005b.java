package androidx.lifecycle;

import o.oM;
import o.pN;
import o.registerIn;
import o.registerIn$MenuHostHelper$$ExternalSyntheticLambda1;
import o.sB;
import o.setCheckable;
import o.setInsetTop;
import o.setTouchDelegate;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends setInsetTop implements setCheckable {
    final registerIn MenuHostHelper$$ExternalSyntheticLambda1;
    private final oM setY;

    @Override // o.setInsetTop
    public final registerIn setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.rU
    public final oM setIconTintList() {
        return this.setY;
    }

    public LifecycleCoroutineScopeImpl(registerIn registerin, oM oMVar) {
        sB sBVar;
        pN.setY(registerin, "");
        pN.setY(oMVar, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = registerin;
        this.setY = oMVar;
        if (registerin.MenuHostHelper$$ExternalSyntheticLambda0() != registerIn$MenuHostHelper$$ExternalSyntheticLambda1.DESTROYED || (sBVar = (sB) this.setY.get(sB.MenuHostHelper$$ExternalSyntheticLambda1)) == null) {
            return;
        }
        sBVar.MenuHostHelper$$ExternalSyntheticLambda1(null);
    }

    @Override // o.setCheckable
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
        pN.setY(settouchdelegate, "");
        pN.setY(setx, "");
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0().compareTo(registerIn$MenuHostHelper$$ExternalSyntheticLambda1.DESTROYED) <= 0) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(this);
            sB sBVar = (sB) this.setY.get(sB.MenuHostHelper$$ExternalSyntheticLambda1);
            if (sBVar != null) {
                sBVar.MenuHostHelper$$ExternalSyntheticLambda1(null);
            }
        }
    }
}