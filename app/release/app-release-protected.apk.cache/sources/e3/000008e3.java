package o;

import o.nR;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class sH extends sU {
    private final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0;

    public sH(oM oMVar, InterfaceC0389pw<? super rU, ? super oK<? super nX>, ? extends Object> interfaceC0389pw) {
        super(oMVar, false);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = oP.MenuHostHelper$$ExternalSyntheticLambda0(interfaceC0389pw, this, this);
    }

    @Override // o.sK
    protected final void ViewPager$SavedState$1() {
        sH sHVar = this;
        try {
            oK y = oP.setY(this.MenuHostHelper$$ExternalSyntheticLambda0);
            nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            C0510ug.setIconTintList(y, nR.setX(nX.setX), null);
        } catch (Throwable th) {
            nR.setIconTintList seticontintlist2 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            pN.setY((Object) th, "");
            sHVar.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(new nR.setX(th)));
            throw th;
        }
    }
}