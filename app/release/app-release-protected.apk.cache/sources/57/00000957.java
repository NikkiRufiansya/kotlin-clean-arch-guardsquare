package o;

import o.nR;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
final class setAnimationFromUrl$MenuHostHelper$$ExternalSyntheticLambda1<T> extends AbstractC0368pb implements InterfaceC0389pw<rU, oK<? super T>, Object> {
    private /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0;
    final /* synthetic */ registerIn$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1;
    private int setIconTintList;
    final /* synthetic */ registerIn setX;
    final /* synthetic */ InterfaceC0389pw<rU, oK<? super T>, Object> setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public setAnimationFromUrl$MenuHostHelper$$ExternalSyntheticLambda1(registerIn registerin, registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1, InterfaceC0389pw<? super rU, ? super oK<? super T>, ? extends Object> interfaceC0389pw, oK<? super setAnimationFromUrl$MenuHostHelper$$ExternalSyntheticLambda1> oKVar) {
        super(2, oKVar);
        this.setX = registerin;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = registerin_menuhosthelper__externalsyntheticlambda1;
        this.setY = interfaceC0389pw;
    }

    @Override // o.oR
    public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
        setAnimationFromUrl$MenuHostHelper$$ExternalSyntheticLambda1 setanimationfromurl_menuhosthelper__externalsyntheticlambda1 = new setAnimationFromUrl$MenuHostHelper$$ExternalSyntheticLambda1(this.setX, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setY, oKVar);
        setanimationfromurl_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0 = obj;
        return setanimationfromurl_menuhosthelper__externalsyntheticlambda1;
    }

    @Override // o.InterfaceC0389pw
    public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(rU rUVar, Object obj) {
        setAnimationFromUrl$MenuHostHelper$$ExternalSyntheticLambda1 setanimationfromurl_menuhosthelper__externalsyntheticlambda1 = new setAnimationFromUrl$MenuHostHelper$$ExternalSyntheticLambda1(this.setX, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setY, (oK) obj);
        setanimationfromurl_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0 = rUVar;
        return setanimationfromurl_menuhosthelper__externalsyntheticlambda1.setY(nX.setX);
    }

    @Override // o.oR
    public final Object setY(Object obj) {
        setLayoutResource setlayoutresource;
        oJ oJVar = oJ.COROUTINE_SUSPENDED;
        int i = this.setIconTintList;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            setlayoutresource = (setLayoutResource) this.MenuHostHelper$$ExternalSyntheticLambda0;
            try {
                if (obj instanceof nR.setX) {
                    throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                }
            } catch (Throwable th) {
                th = th;
                setlayoutresource.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setlayoutresource.MenuHostHelper$$ExternalSyntheticLambda1);
                setTop settop = setlayoutresource.setX;
                settop.setY = true;
                settop.setIconTintList();
                throw th;
            }
        } else if (!(obj instanceof nR.setX)) {
            sB sBVar = (sB) ((rU) this.MenuHostHelper$$ExternalSyntheticLambda0).setIconTintList().get(sB.MenuHostHelper$$ExternalSyntheticLambda1);
            if (sBVar == null) {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
            setHideMotionSpec sethidemotionspec = new setHideMotionSpec();
            setLayoutResource setlayoutresource2 = new setLayoutResource(this.setX, this.MenuHostHelper$$ExternalSyntheticLambda1, sethidemotionspec.MenuHostHelper$$ExternalSyntheticLambda1, sBVar);
            try {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = setlayoutresource2;
                this.setIconTintList = 1;
                obj = C0435ro.setY(sethidemotionspec, this.setY, this);
                if (obj == oJVar) {
                    return oJVar;
                }
                setlayoutresource = setlayoutresource2;
            } catch (Throwable th2) {
                th = th2;
                setlayoutresource = setlayoutresource2;
                setlayoutresource.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setlayoutresource.MenuHostHelper$$ExternalSyntheticLambda1);
                setTop settop2 = setlayoutresource.setX;
                settop2.setY = true;
                settop2.setIconTintList();
                throw th;
            }
        } else {
            throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
        }
        setlayoutresource.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setlayoutresource.MenuHostHelper$$ExternalSyntheticLambda1);
        setTop settop3 = setlayoutresource.setX;
        settop3.setY = true;
        settop3.setIconTintList();
        return obj;
    }
}