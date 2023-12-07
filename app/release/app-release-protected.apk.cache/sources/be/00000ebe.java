package o;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class setPreventCornerOverlap implements Closeable, rU {
    private final oM MenuHostHelper$$ExternalSyntheticLambda0;

    public setPreventCornerOverlap(oM oMVar) {
        pN.setY(oMVar, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = oMVar;
    }

    @Override // o.rU
    public final oM setIconTintList() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        sB sBVar = (sB) this.MenuHostHelper$$ExternalSyntheticLambda0.get(sB.MenuHostHelper$$ExternalSyntheticLambda1);
        if (sBVar != null) {
            sBVar.MenuHostHelper$$ExternalSyntheticLambda1(null);
        }
    }
}