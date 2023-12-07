package o;

import android.content.Context;

/* loaded from: classes.dex */
public final class setProgressBackgroundTintList implements setTag<setComposition> {
    private final nF<setSearchableInfo> MenuHostHelper$$ExternalSyntheticLambda1;
    private final nF<setSearchableInfo> setIconTintList;
    private final nF<Context> setX;

    public setProgressBackgroundTintList(nF<Context> nFVar, nF<setSearchableInfo> nFVar2, nF<setSearchableInfo> nFVar3) {
        this.setX = nFVar;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = nFVar2;
        this.setIconTintList = nFVar3;
    }

    @Override // o.nF
    public final /* synthetic */ Object setIconTintList() {
        return new setComposition(this.setX.setIconTintList(), this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(), this.setIconTintList.setIconTintList());
    }
}