package o;

import android.content.Context;

/* loaded from: classes.dex */
public final class setTopEdgeEffectColor implements setTag<setButtonIconTintMode> {
    private final nF<setComposition> setX;
    private final nF<Context> setY;

    public setTopEdgeEffectColor(nF<Context> nFVar, nF<setComposition> nFVar2) {
        this.setY = nFVar;
        this.setX = nFVar2;
    }

    @Override // o.nF
    public final /* synthetic */ Object setIconTintList() {
        return new setButtonIconTintMode(this.setY.setIconTintList(), this.setX.setIconTintList());
    }
}