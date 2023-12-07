package o;

import android.content.Context;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
class setEmptyView$MenuHostHelper$$ExternalSyntheticLambda0 extends AppBarLayout$BaseBehavior {
    final /* synthetic */ setEmptyView MenuHostHelper$$ExternalSyntheticLambda1;
    final ActionProvider setIconTintList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setEmptyView$MenuHostHelper$$ExternalSyntheticLambda0(setEmptyView setemptyview, Context context, ActionProvider actionProvider) {
        super(context);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setemptyview;
        this.setIconTintList = actionProvider;
    }

    @Override // o.AppBarLayout$BaseBehavior
    public View MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setIconTintList.onCreateActionView();
    }

    @Override // o.AppBarLayout$BaseBehavior
    public boolean setY() {
        return this.setIconTintList.onPerformDefaultAction();
    }

    @Override // o.AppBarLayout$BaseBehavior
    public boolean setIconTintList() {
        return this.setIconTintList.hasSubMenu();
    }

    @Override // o.AppBarLayout$BaseBehavior
    public void setX(SubMenu subMenu) {
        this.setIconTintList.onPrepareSubMenu(this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(subMenu));
    }
}