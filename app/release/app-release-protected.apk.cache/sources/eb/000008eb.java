package o;

import o.nR;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class sL<T> extends sC {
    private final C0444rx<T> MenuHostHelper$$ExternalSyntheticLambda0;

    @Override // o.InterfaceC0377pk
    public final /* bridge */ /* synthetic */ nX setX(Throwable th) {
        setX(th);
        return nX.setX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sL(C0444rx<? super T> c0444rx) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = c0444rx;
    }

    @Override // o.rM
    /* renamed from: setX  reason: avoid collision after fix types in other method */
    public final void setX2(Throwable th) {
        Object obj;
        sK sKVar = this.setY;
        if (sKVar == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            sKVar = null;
        }
        while (true) {
            obj = sKVar._state;
            if (!(obj instanceof AbstractC0524uu)) {
                break;
            }
            ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(sKVar);
        }
        rX.setIconTintList();
        if (obj instanceof rD) {
            nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            Throwable th2 = ((rD) obj).MenuHostHelper$$ExternalSyntheticLambda1;
            pN.setY((Object) th2, "");
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(new nR.setX(th2)));
            return;
        }
        nR.setIconTintList seticontintlist2 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(sG.MenuHostHelper$$ExternalSyntheticLambda0(obj)));
    }
}