package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import o.setEnsureMinTouchTargetSize;

/* loaded from: classes.dex */
public final class setHint implements setCustomSelectionActionModeCallback {
    private MenuItem.OnMenuItemClickListener MenuHostHelper$$ExternalSyntheticLambda1;
    private CharSequence setAnimationFromJson;
    private char setChipCornerRadius;
    private CharSequence setIconTintList;
    private Drawable setNavigationOnClickListener;
    private CharSequence setOnNavigationItemSelectedListener;
    private Intent setTextAlignment;
    private char setTextScaleX;
    private Context setX;
    private CharSequence setZ;
    private int setMaxEms = 4096;
    private int setIconSize = 4096;
    private ColorStateList setUiOptions = null;
    private PorterDuff.Mode setLayoutAnimation = null;
    private boolean setOnLongClickListener = false;
    private boolean setUnboundedRipple = false;
    private int setY = 16;
    private final int setCenterIfNoTextEnabled = 16908332;
    private final int MenuHostHelper$$ExternalSyntheticLambda0 = 0;
    private final int ViewPager$SavedState$1 = 0;

    @Override // o.setCustomSelectionActionModeCallback
    public final AppBarLayout$BaseBehavior MenuHostHelper$$ExternalSyntheticLambda0() {
        return null;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    public setHint(Context context, CharSequence charSequence) {
        this.setX = context;
        this.setZ = charSequence;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.setChipCornerRadius;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.setIconSize;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.setNavigationOnClickListener;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.setTextAlignment;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.setCenterIfNoTextEnabled;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.setTextScaleX;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.setMaxEms;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.ViewPager$SavedState$1;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.setZ;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.setAnimationFromJson;
        return charSequence == null ? this.setZ : charSequence;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.setY & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.setY & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.setY & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.setY & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.setChipCornerRadius = Character.toLowerCase(c);
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.setChipCornerRadius = Character.toLowerCase(c);
        this.setIconSize = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.setY = (z ? 1 : 0) | (this.setY & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.setY = (z ? 2 : 0) | (this.setY & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.setY = (z ? 16 : 0) | (this.setY & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.setNavigationOnClickListener = drawable;
        setX();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        Drawable drawable;
        drawable = this.setX.getDrawable(i);
        this.setNavigationOnClickListener = drawable;
        setX();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.setTextAlignment = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.setTextScaleX = c;
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.setTextScaleX = c;
        this.setMaxEms = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.setTextScaleX = c;
        this.setChipCornerRadius = Character.toLowerCase(c2);
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.setTextScaleX = c;
        this.setMaxEms = KeyEvent.normalizeMetaState(i);
        this.setChipCornerRadius = Character.toLowerCase(c2);
        this.setIconSize = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.setZ = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.setZ = this.setX.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.setAnimationFromJson = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.setY = (z ? 0 : 8) | (this.setY & 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // o.setCustomSelectionActionModeCallback
    public final setCustomSelectionActionModeCallback setY(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // o.setCustomSelectionActionModeCallback
    public final setCustomSelectionActionModeCallback setY(CharSequence charSequence) {
        this.setIconTintList = charSequence;
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.setIconTintList;
    }

    @Override // o.setCustomSelectionActionModeCallback
    public final setCustomSelectionActionModeCallback setX(CharSequence charSequence) {
        this.setOnNavigationItemSelectedListener = charSequence;
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.setOnNavigationItemSelectedListener;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.setUiOptions = colorStateList;
        this.setOnLongClickListener = true;
        setX();
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.setUiOptions;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.setLayoutAnimation = mode;
        this.setUnboundedRipple = true;
        setX();
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.setLayoutAnimation;
    }

    private void setX() {
        Drawable drawable = this.setNavigationOnClickListener;
        if (drawable != null) {
            if (this.setOnLongClickListener || this.setUnboundedRipple) {
                Drawable navigationOnClickListener = setEnsureMinTouchTargetSize.setNavigationOnClickListener(drawable);
                this.setNavigationOnClickListener = navigationOnClickListener;
                Drawable mutate = navigationOnClickListener.mutate();
                this.setNavigationOnClickListener = mutate;
                if (this.setOnLongClickListener) {
                    setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(mutate, this.setUiOptions);
                }
                if (this.setUnboundedRipple) {
                    setEnsureMinTouchTargetSize.setX(this.setNavigationOnClickListener, this.setLayoutAnimation);
                }
            }
        }
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.setIconTintList = charSequence;
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.setOnNavigationItemSelectedListener = charSequence;
        return this;
    }
}