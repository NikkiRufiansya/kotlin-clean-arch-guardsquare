package o;

import o.nR;

/* loaded from: classes.dex */
public final class setInsetTop$MenuHostHelper$$ExternalSyntheticLambda1 extends AbstractC0368pb implements InterfaceC0389pw<rU, oK<? super nX>, Object> {
    final /* synthetic */ setInsetTop MenuHostHelper$$ExternalSyntheticLambda1;
    private int setIconTintList;
    final /* synthetic */ InterfaceC0389pw<rU, oK<? super nX>, Object> setY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public setInsetTop$MenuHostHelper$$ExternalSyntheticLambda1(setInsetTop setinsettop, InterfaceC0389pw<? super rU, ? super oK<? super nX>, ? extends Object> interfaceC0389pw, oK<? super setInsetTop$MenuHostHelper$$ExternalSyntheticLambda1> oKVar) {
        super(2, oKVar);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setinsettop;
        this.setY = interfaceC0389pw;
    }

    @Override // o.oR
    public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
        return new setInsetTop$MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1, this.setY, oKVar);
    }

    @Override // o.InterfaceC0389pw
    public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(rU rUVar, oK<? super nX> oKVar) {
        return new setInsetTop$MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1, this.setY, oKVar).setY(nX.setX);
    }

    @Override // o.oR
    public final Object setY(Object obj) {
        oJ oJVar = oJ.COROUTINE_SUSPENDED;
        int i = this.setIconTintList;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (obj instanceof nR.setX) {
                throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
            }
        } else if (!(obj instanceof nR.setX)) {
            registerIn y = this.MenuHostHelper$$ExternalSyntheticLambda1.setY();
            InterfaceC0389pw<rU, oK<? super nX>, Object> interfaceC0389pw = this.setY;
            this.setIconTintList = 1;
            registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1 = registerIn$MenuHostHelper$$ExternalSyntheticLambda1.CREATED;
            if (C0435ro.setY(C0457sj.setIconTintList().MenuHostHelper$$ExternalSyntheticLambda0(), new setAnimationFromUrl$MenuHostHelper$$ExternalSyntheticLambda1(y, registerin_menuhosthelper__externalsyntheticlambda1, interfaceC0389pw, null), this) == oJVar) {
                return oJVar;
            }
        } else {
            throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return nX.setX;
    }
}