package o;

/* loaded from: classes.dex */
public class sD extends sK implements rF {
    private final boolean MenuHostHelper$$ExternalSyntheticLambda0;

    @Override // o.sK
    public final boolean o_() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sD(sB sBVar) {
        super(true);
        boolean z = true;
        setIconTintList(sBVar);
        rB rBVar = (rB) this._parentHandle;
        rA rAVar = rBVar instanceof rA ? (rA) rBVar : null;
        if (rAVar != null) {
            sK sKVar = rAVar.setY;
            if (sKVar == null) {
                pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                sKVar = null;
            }
            if (sKVar != null) {
                while (!sKVar.n_()) {
                    rB rBVar2 = (rB) sKVar._parentHandle;
                    rA rAVar2 = rBVar2 instanceof rA ? (rA) rBVar2 : null;
                    if (rAVar2 != null) {
                        sKVar = rAVar2.setY;
                        if (sKVar == null) {
                            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                            sKVar = null;
                            continue;
                        }
                        if (sKVar == null) {
                        }
                    }
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0 = z;
            }
        }
        z = false;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = z;
    }

    @Override // o.sK
    public final boolean n_() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }
}