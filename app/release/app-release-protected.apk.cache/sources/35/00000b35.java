package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class setEmptyView extends setCloseIconEndPadding implements MenuItem {
    private final setCustomSelectionActionModeCallback setIconTintList;
    private Method setY;

    public setEmptyView(Context context, setCustomSelectionActionModeCallback setcustomselectionactionmodecallback) {
        super(context);
        if (setcustomselectionactionmodecallback == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.setIconTintList = setcustomselectionactionmodecallback;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.setIconTintList.getItemId();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.setIconTintList.getGroupId();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.setIconTintList.getOrder();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.setIconTintList.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.setIconTintList.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.setIconTintList.getTitle();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.setIconTintList.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.setIconTintList.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.setIconTintList.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.setIconTintList.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.setIconTintList.getIcon();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.setIconTintList.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.setIconTintList.getIntent();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.setIconTintList.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.setIconTintList.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.setIconTintList.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.setIconTintList.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.setIconTintList.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.setIconTintList.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.setIconTintList.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.setIconTintList.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.setIconTintList.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.setIconTintList.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.setIconTintList.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.setIconTintList.isCheckable();
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.setIconTintList.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.setIconTintList.isChecked();
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.setIconTintList.setVisible(z);
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.setIconTintList.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.setIconTintList.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.setIconTintList.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.setIconTintList.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.setIconTintList.setOnMenuItemClickListener(onMenuItemClickListener != null ? new setIconTintList(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.setIconTintList.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.setIconTintList.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.setIconTintList.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new setX(view);
        }
        this.setIconTintList.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        this.setIconTintList.setActionView(i);
        View actionView = this.setIconTintList.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.setIconTintList.setActionView(new setX(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.setIconTintList.getActionView();
        return actionView instanceof setX ? (View) ((setX) actionView).setIconTintList : actionView;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        setEmptyView$MenuHostHelper$$ExternalSyntheticLambda1 setemptyview_menuhosthelper__externalsyntheticlambda1 = new setEmptyView$MenuHostHelper$$ExternalSyntheticLambda1(this, this.MenuHostHelper$$ExternalSyntheticLambda0, actionProvider);
        setCustomSelectionActionModeCallback setcustomselectionactionmodecallback = this.setIconTintList;
        if (actionProvider == null) {
            setemptyview_menuhosthelper__externalsyntheticlambda1 = null;
        }
        setcustomselectionactionmodecallback.setY(setemptyview_menuhosthelper__externalsyntheticlambda1);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        AppBarLayout$BaseBehavior MenuHostHelper$$ExternalSyntheticLambda0 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 instanceof setEmptyView$MenuHostHelper$$ExternalSyntheticLambda0) {
            return ((setEmptyView$MenuHostHelper$$ExternalSyntheticLambda0) MenuHostHelper$$ExternalSyntheticLambda0).setIconTintList;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.setIconTintList.expandActionView();
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.setIconTintList.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.setIconTintList.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.setIconTintList.setOnActionExpandListener(onActionExpandListener != null ? new setY(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.setIconTintList.setY(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.setIconTintList.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.setIconTintList.setX(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.setIconTintList.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.setIconTintList.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.setIconTintList.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.setIconTintList.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.setIconTintList.getIconTintMode();
    }

    public final void setY() {
        try {
            if (this.setY == null) {
                this.setY = this.setIconTintList.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.setY.invoke(this.setIconTintList, Boolean.TRUE);
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    /* loaded from: classes.dex */
    class setIconTintList implements MenuItem.OnMenuItemClickListener {
        private final MenuItem.OnMenuItemClickListener setY;

        setIconTintList(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.setY = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.setY.onMenuItemClick(setEmptyView.this.setIconTintList(menuItem));
        }
    }

    /* loaded from: classes.dex */
    class setY implements MenuItem.OnActionExpandListener {
        private final MenuItem.OnActionExpandListener setY;

        setY(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.setY = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.setY.onMenuItemActionExpand(setEmptyView.this.setIconTintList(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.setY.onMenuItemActionCollapse(setEmptyView.this.setIconTintList(menuItem));
        }
    }

    /* loaded from: classes.dex */
    static class setX extends FrameLayout implements setChipSpacingVertical {
        final CollapsibleActionView setIconTintList;

        setX(View view) {
            super(view.getContext());
            this.setIconTintList = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // o.setChipSpacingVertical
        public final void setX() {
            this.setIconTintList.onActionViewExpanded();
        }

        @Override // o.setChipSpacingVertical
        public final void setIconTintList() {
            this.setIconTintList.onActionViewCollapsed();
        }
    }
}