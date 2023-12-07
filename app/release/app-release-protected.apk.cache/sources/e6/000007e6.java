package o;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class onAppEnteredForeground implements setTag<setEditableFactory> {
    private final nF<setSearchableInfo> MenuHostHelper$$ExternalSyntheticLambda0;
    private final nF<setCloseIconSize> MenuHostHelper$$ExternalSyntheticLambda1;
    private final nF<setChipBackgroundColorResource> setIconTintList;
    private final nF<Executor> setLayoutAnimation;
    private final nF<setSearchableInfo> setNavigationOnClickListener;
    private final nF<setOffscreenPageLimit> setOnLongClickListener;
    private final nF<setVerticalScrollbarPosition> setUnboundedRipple;
    private final nF<Context> setX;
    private final nF<setBoxBackgroundColorResource> setY;

    public onAppEnteredForeground(nF<Context> nFVar, nF<setBoxBackgroundColorResource> nFVar2, nF<setCloseIconSize> nFVar3, nF<setOffscreenPageLimit> nFVar4, nF<Executor> nFVar5, nF<setVerticalScrollbarPosition> nFVar6, nF<setSearchableInfo> nFVar7, nF<setSearchableInfo> nFVar8, nF<setChipBackgroundColorResource> nFVar9) {
        this.setX = nFVar;
        this.setY = nFVar2;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = nFVar3;
        this.setOnLongClickListener = nFVar4;
        this.setLayoutAnimation = nFVar5;
        this.setUnboundedRipple = nFVar6;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = nFVar7;
        this.setNavigationOnClickListener = nFVar8;
        this.setIconTintList = nFVar9;
    }

    @Override // o.nF
    public final /* synthetic */ Object setIconTintList() {
        return new setEditableFactory(this.setX.setIconTintList(), this.setY.setIconTintList(), this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(), this.setOnLongClickListener.setIconTintList(), this.setLayoutAnimation.setIconTintList(), this.setUnboundedRipple.setIconTintList(), this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(), this.setNavigationOnClickListener.setIconTintList(), this.setIconTintList.setIconTintList());
    }
}