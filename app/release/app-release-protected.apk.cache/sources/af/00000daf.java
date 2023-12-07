package o;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class setMovementMethod implements setTag<setBackgroundTintBlendMode> {
    private final nF<setCloseIconSize> MenuHostHelper$$ExternalSyntheticLambda0;
    private final nF<setVerticalScrollbarPosition> setIconTintList;
    private final nF<Executor> setX;
    private final nF<setOffscreenPageLimit> setY;

    public setMovementMethod(nF<Executor> nFVar, nF<setCloseIconSize> nFVar2, nF<setOffscreenPageLimit> nFVar3, nF<setVerticalScrollbarPosition> nFVar4) {
        this.setX = nFVar;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = nFVar2;
        this.setY = nFVar3;
        this.setIconTintList = nFVar4;
    }

    @Override // o.nF
    public final /* synthetic */ Object setIconTintList() {
        return new setBackgroundTintBlendMode(this.setX.setIconTintList(), this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(), this.setY.setIconTintList(), this.setIconTintList.setIconTintList());
    }
}