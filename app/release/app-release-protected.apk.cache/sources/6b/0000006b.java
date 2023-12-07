package androidx.lifecycle;

import o.InterfaceC0376pj;
import o.InterfaceC0441ru;
import o.KeepName;
import o.nR;
import o.oK;
import o.pN;
import o.registerIn;
import o.registerIn$MenuHostHelper$$ExternalSyntheticLambda1;
import o.setCheckable;
import o.setTouchDelegate;

/* loaded from: classes.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements setCheckable {
    final /* synthetic */ registerIn MenuHostHelper$$ExternalSyntheticLambda0;
    final /* synthetic */ registerIn$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1;
    final /* synthetic */ InterfaceC0376pj<R> setIconTintList;
    final /* synthetic */ InterfaceC0441ru<R> setX;

    @Override // o.setCheckable
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
        Object x;
        pN.setY(settouchdelegate, "");
        pN.setY(setx, "");
        if (setx == registerIn.setX.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1)) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(this);
            oK oKVar = this.setX;
            InterfaceC0376pj<R> interfaceC0376pj = this.setIconTintList;
            try {
                nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                x = nR.setX(interfaceC0376pj.setIconTintList());
            } catch (Throwable th) {
                nR.setIconTintList seticontintlist2 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                pN.setY((Object) th, "");
                x = nR.setX(new nR.setX(th));
            }
            oKVar.MenuHostHelper$$ExternalSyntheticLambda0(x);
        } else if (setx == registerIn.setX.ON_DESTROY) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(this);
            KeepName keepName = new KeepName();
            nR.setIconTintList seticontintlist3 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            pN.setY((Object) keepName, "");
            this.setX.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(new nR.setX(keepName)));
        }
    }
}