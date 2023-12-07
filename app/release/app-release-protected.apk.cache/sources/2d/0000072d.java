package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class minusKey extends setNavigationIconTint implements SubMenu {
    private ActionMenuPresenter$SavedState$1 ViewPager$SavedState$1;
    public setNavigationIconTint setTextAlignment;

    public minusKey(Context context, setNavigationIconTint setnavigationicontint, ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1) {
        super(context);
        this.setTextAlignment = setnavigationicontint;
        this.ViewPager$SavedState$1 = actionMenuPresenter$SavedState$1;
    }

    @Override // o.setNavigationIconTint, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.setTextAlignment.setQwertyMode(z);
    }

    @Override // o.setNavigationIconTint
    public final boolean setNavigationOnClickListener() {
        return this.setTextAlignment.setNavigationOnClickListener();
    }

    @Override // o.setNavigationIconTint
    public final boolean setLayoutAnimation() {
        return this.setTextAlignment.setLayoutAnimation();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.ViewPager$SavedState$1;
    }

    @Override // o.setNavigationIconTint
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0 setnavigationicontint_menuhosthelper__externalsyntheticlambda0) {
        this.setTextAlignment.MenuHostHelper$$ExternalSyntheticLambda1(setnavigationicontint_menuhosthelper__externalsyntheticlambda0);
    }

    @Override // o.setNavigationIconTint
    public final setNavigationIconTint MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setTextAlignment.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // o.setNavigationIconTint
    final boolean MenuHostHelper$$ExternalSyntheticLambda0(setNavigationIconTint setnavigationicontint, MenuItem menuItem) {
        return super.MenuHostHelper$$ExternalSyntheticLambda0(setnavigationicontint, menuItem) || this.setTextAlignment.MenuHostHelper$$ExternalSyntheticLambda0(setnavigationicontint, menuItem);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.ViewPager$SavedState$1.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.ViewPager$SavedState$1.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.setIconTintList(drawable);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.setX(i);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.setX(charSequence);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.MenuHostHelper$$ExternalSyntheticLambda1(i);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        return (SubMenu) super.setY(view);
    }

    @Override // o.setNavigationIconTint
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1) {
        return this.setTextAlignment.MenuHostHelper$$ExternalSyntheticLambda0(actionMenuPresenter$SavedState$1);
    }

    @Override // o.setNavigationIconTint
    public final boolean setY(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1) {
        return this.setTextAlignment.setY(actionMenuPresenter$SavedState$1);
    }

    @Override // o.setNavigationIconTint
    public final String setY() {
        ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = this.ViewPager$SavedState$1;
        int itemId = actionMenuPresenter$SavedState$1 != null ? actionMenuPresenter$SavedState$1.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.setY());
        sb.append(":");
        sb.append(itemId);
        return sb.toString();
    }

    @Override // o.setNavigationIconTint, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.setTextAlignment.setGroupDividerEnabled(z);
    }

    @Override // o.setNavigationIconTint
    public final boolean setOnLongClickListener() {
        return this.setTextAlignment.setOnLongClickListener();
    }
}