package o;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import o.AppBarLayout$BaseBehavior;

/* loaded from: classes.dex */
class setEmptyView$MenuHostHelper$$ExternalSyntheticLambda1 extends setEmptyView$MenuHostHelper$$ExternalSyntheticLambda0 implements ActionProvider.VisibilityListener {
    private AppBarLayout$BaseBehavior.setIconTintList MenuHostHelper$$ExternalSyntheticLambda0;
    final /* synthetic */ setEmptyView setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setEmptyView$MenuHostHelper$$ExternalSyntheticLambda1(setEmptyView setemptyview, Context context, ActionProvider actionProvider) {
        super(setemptyview, context, actionProvider);
        this.setX = setemptyview;
    }

    @Override // o.AppBarLayout$BaseBehavior
    public View setX(MenuItem menuItem) {
        return ((setEmptyView$MenuHostHelper$$ExternalSyntheticLambda0) this).setIconTintList.onCreateActionView(menuItem);
    }

    @Override // o.AppBarLayout$BaseBehavior
    public boolean setX() {
        return ((setEmptyView$MenuHostHelper$$ExternalSyntheticLambda0) this).setIconTintList.overridesItemVisibility();
    }

    @Override // o.AppBarLayout$BaseBehavior
    public boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        return ((setEmptyView$MenuHostHelper$$ExternalSyntheticLambda0) this).setIconTintList.isVisible();
    }

    @Override // o.AppBarLayout$BaseBehavior
    public void MenuHostHelper$$ExternalSyntheticLambda0(AppBarLayout$BaseBehavior.setIconTintList seticontintlist) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = seticontintlist;
        ((setEmptyView$MenuHostHelper$$ExternalSyntheticLambda0) this).setIconTintList.setVisibilityListener(seticontintlist != null ? this : null);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public void onActionProviderVisibilityChanged(boolean z) {
        AppBarLayout$BaseBehavior.setIconTintList seticontintlist = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (seticontintlist != null) {
            seticontintlist.setX();
        }
    }
}