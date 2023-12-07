package androidx.lifecycle;

import o.AbstractC0368pb;
import o.InterfaceC0389pw;
import o.nR;
import o.nX;
import o.oJ;
import o.oK;
import o.rU;
import o.registerIn$MenuHostHelper$$ExternalSyntheticLambda1;
import o.sB;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl$MenuHostHelper$$ExternalSyntheticLambda1 extends AbstractC0368pb implements InterfaceC0389pw<rU, oK<? super nX>, Object> {
    private int MenuHostHelper$$ExternalSyntheticLambda0;
    private /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda1;
    final /* synthetic */ LifecycleCoroutineScopeImpl setIconTintList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScopeImpl$MenuHostHelper$$ExternalSyntheticLambda1(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, oK<? super LifecycleCoroutineScopeImpl$MenuHostHelper$$ExternalSyntheticLambda1> oKVar) {
        super(2, oKVar);
        this.setIconTintList = lifecycleCoroutineScopeImpl;
    }

    @Override // o.oR
    public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
        LifecycleCoroutineScopeImpl$MenuHostHelper$$ExternalSyntheticLambda1 lifecycleCoroutineScopeImpl$MenuHostHelper$$ExternalSyntheticLambda1 = new LifecycleCoroutineScopeImpl$MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList, oKVar);
        lifecycleCoroutineScopeImpl$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1 = obj;
        return lifecycleCoroutineScopeImpl$MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.InterfaceC0389pw
    public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(rU rUVar, oK<? super nX> oKVar) {
        LifecycleCoroutineScopeImpl$MenuHostHelper$$ExternalSyntheticLambda1 lifecycleCoroutineScopeImpl$MenuHostHelper$$ExternalSyntheticLambda1 = new LifecycleCoroutineScopeImpl$MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList, oKVar);
        lifecycleCoroutineScopeImpl$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1 = rUVar;
        return lifecycleCoroutineScopeImpl$MenuHostHelper$$ExternalSyntheticLambda1.setY(nX.setX);
    }

    @Override // o.oR
    public final Object setY(Object obj) {
        oJ oJVar = oJ.COROUTINE_SUSPENDED;
        if (!(obj instanceof nR.setX)) {
            rU rUVar = (rU) this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0().compareTo(registerIn$MenuHostHelper$$ExternalSyntheticLambda1.INITIALIZED) >= 0) {
                this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.setY(this.setIconTintList);
            } else {
                sB sBVar = (sB) rUVar.setIconTintList().get(sB.MenuHostHelper$$ExternalSyntheticLambda1);
                if (sBVar != null) {
                    sBVar.MenuHostHelper$$ExternalSyntheticLambda1(null);
                }
            }
            return nX.setX;
        }
        throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
    }
}