package o;

/* loaded from: classes.dex */
public final class rA extends sF implements rB {
    public final rC MenuHostHelper$$ExternalSyntheticLambda0;

    @Override // o.InterfaceC0377pk
    public final /* synthetic */ nX setX(Throwable th) {
        rC rCVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
        sK sKVar = this.setY;
        if (sKVar == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            sKVar = null;
        }
        rCVar.setX(sKVar);
        return nX.setX;
    }

    public rA(rC rCVar) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = rCVar;
    }

    @Override // o.rM
    /* renamed from: setX  reason: avoid collision after fix types in other method */
    public final void setX2(Throwable th) {
        rC rCVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
        sK sKVar = this.setY;
        if (sKVar == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            sKVar = null;
        }
        rCVar.setX(sKVar);
    }

    @Override // o.rB
    public final boolean setY(Throwable th) {
        sK sKVar = this.setY;
        if (sKVar == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            sKVar = null;
        }
        return sKVar.setIconTintList(th);
    }

    @Override // o.rB
    public final sB setIconTintList() {
        sK sKVar = this.setY;
        if (sKVar == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            sKVar = null;
        }
        return sKVar;
    }
}