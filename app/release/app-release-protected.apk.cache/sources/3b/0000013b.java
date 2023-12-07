package o;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import o.AppBarLayout$BaseBehavior;
import o.setEnsureMinTouchTargetSize;

/* loaded from: classes.dex */
public final class ActionMenuPresenter$SavedState$1 implements setCustomSelectionActionModeCallback {
    private CharSequence ExtendableSavedState$1;
    private CharSequence FragmentStateAdapter$2;
    public setNavigationIconTint MenuHostHelper$$ExternalSyntheticLambda1;
    minusKey ViewPager$SavedState$1;
    private Drawable setAnimationFromJson;
    private View setCenterIfNoTextEnabled;
    private final int setCheckedIconEnabled;
    private MenuItem.OnMenuItemClickListener setChipCornerRadius;
    private ContextMenu.ContextMenuInfo setChipIconTintResource;
    private Intent setGuidelinePercent;
    private CharSequence setHasDecor;
    private final int setIconSize;
    final int setIconTintList;
    private MenuItem.OnActionExpandListener setIconified;
    char setLayoutAnimation;
    private final int setMaxEms;
    private Runnable setMinAndMaxProgress;
    public int setNavigationOnClickListener;
    private CharSequence setTextAlignment;
    char setUnboundedRipple;
    public AppBarLayout$BaseBehavior setY;
    int setUiOptions = 4096;
    int setOnLongClickListener = 4096;
    private int setTextScaleX = 0;
    private ColorStateList setTextAppearanceResource = null;
    private PorterDuff.Mode setLayoutDirection = null;
    private boolean setOnNavigationItemSelectedListener = false;
    private boolean setZ = false;
    private boolean SearchView$SavedState$1 = false;
    public int MenuHostHelper$$ExternalSyntheticLambda0 = 16;
    public boolean setX = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActionMenuPresenter$SavedState$1(setNavigationIconTint setnavigationicontint, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setnavigationicontint;
        this.setCheckedIconEnabled = i2;
        this.setMaxEms = i;
        this.setIconSize = i3;
        this.setIconTintList = i4;
        this.ExtendableSavedState$1 = charSequence;
        this.setNavigationOnClickListener = i5;
    }

    public final boolean setIconTintList() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.setChipCornerRadius;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            setNavigationIconTint setnavigationicontint = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setnavigationicontint.MenuHostHelper$$ExternalSyntheticLambda0(setnavigationicontint, this)) {
                return true;
            }
            if (this.setGuidelinePercent != null) {
                try {
                    this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0.startActivity(this.setGuidelinePercent);
                    return true;
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                }
            }
            AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = this.setY;
            return appBarLayout$BaseBehavior != null && appBarLayout$BaseBehavior.setY();
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.MenuHostHelper$$ExternalSyntheticLambda0 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 |= 16;
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda0 &= -17;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.setMaxEms;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.setCheckedIconEnabled;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.setIconSize;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.setGuidelinePercent;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.setGuidelinePercent = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.setLayoutAnimation;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.setLayoutAnimation == c) {
            return this;
        }
        this.setLayoutAnimation = Character.toLowerCase(c);
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.setLayoutAnimation == c && this.setOnLongClickListener == i) {
            return this;
        }
        this.setLayoutAnimation = Character.toLowerCase(c);
        this.setOnLongClickListener = KeyEvent.normalizeMetaState(i);
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.setOnLongClickListener;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.setUnboundedRipple;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.setUiOptions;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.setUnboundedRipple == c) {
            return this;
        }
        this.setUnboundedRipple = c;
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.setUnboundedRipple == c && this.setUiOptions == i) {
            return this;
        }
        this.setUnboundedRipple = c;
        this.setUiOptions = KeyEvent.normalizeMetaState(i);
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.setUnboundedRipple = c;
        this.setLayoutAnimation = Character.toLowerCase(c2);
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.setUnboundedRipple = c;
        this.setUiOptions = KeyEvent.normalizeMetaState(i);
        this.setLayoutAnimation = Character.toLowerCase(c2);
        this.setOnLongClickListener = KeyEvent.normalizeMetaState(i2);
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.ViewPager$SavedState$1;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.ViewPager$SavedState$1 != null;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.ExtendableSavedState$1;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.ExtendableSavedState$1 = charSequence;
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        minusKey minuskey = this.ViewPager$SavedState$1;
        if (minuskey != null) {
            minuskey.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        return setTitle(this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0.getString(i));
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.setHasDecor;
        return charSequence == null ? this.ExtendableSavedState$1 : charSequence;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.setHasDecor = charSequence;
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.setAnimationFromJson;
        if (drawable != null) {
            return setX(drawable);
        }
        if (this.setTextScaleX != 0) {
            Drawable iconTintList = setFilterTouchesWhenObscured.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0, this.setTextScaleX);
            this.setTextScaleX = 0;
            this.setAnimationFromJson = iconTintList;
            return setX(iconTintList);
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.setTextScaleX = 0;
        this.setAnimationFromJson = drawable;
        this.SearchView$SavedState$1 = true;
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.setAnimationFromJson = null;
        this.setTextScaleX = i;
        this.SearchView$SavedState$1 = true;
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.setTextAppearanceResource = colorStateList;
        this.setOnNavigationItemSelectedListener = true;
        this.SearchView$SavedState$1 = true;
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.setTextAppearanceResource;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.setLayoutDirection = mode;
        this.setZ = true;
        this.SearchView$SavedState$1 = true;
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.setLayoutDirection;
    }

    private Drawable setX(Drawable drawable) {
        if (drawable != null && this.SearchView$SavedState$1 && (this.setOnNavigationItemSelectedListener || this.setZ)) {
            drawable = setEnsureMinTouchTargetSize.setNavigationOnClickListener(drawable).mutate();
            if (this.setOnNavigationItemSelectedListener) {
                setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(drawable, this.setTextAppearanceResource);
            }
            if (this.setZ) {
                setEnsureMinTouchTargetSize.setX(drawable, this.setLayoutDirection);
            }
            this.SearchView$SavedState$1 = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.MenuHostHelper$$ExternalSyntheticLambda0 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i2;
        if (i != i2) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.MenuHostHelper$$ExternalSyntheticLambda0 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        if ((this.MenuHostHelper$$ExternalSyntheticLambda0 & 4) != 0) {
            setNavigationIconTint setnavigationicontint = this.MenuHostHelper$$ExternalSyntheticLambda1;
            int groupId = getGroupId();
            int size = setnavigationicontint.setNavigationOnClickListener.size();
            setnavigationicontint.setIconSize();
            for (int i = 0; i < size; i++) {
                ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = setnavigationicontint.setNavigationOnClickListener.get(i);
                if (actionMenuPresenter$SavedState$1.getGroupId() == groupId) {
                    if (((actionMenuPresenter$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 & 4) != 0) && actionMenuPresenter$SavedState$1.isCheckable()) {
                        actionMenuPresenter$SavedState$1.setY(actionMenuPresenter$SavedState$1 == this);
                    }
                }
            }
            setnavigationicontint.setUiOptions();
        } else {
            setY(z);
        }
        return this;
    }

    private void setY(boolean z) {
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i2;
        if (i != i2) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        }
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = this.setY;
        return (appBarLayout$BaseBehavior == null || !appBarLayout$BaseBehavior.setX()) ? (this.MenuHostHelper$$ExternalSyntheticLambda0 & 8) == 0 : (this.MenuHostHelper$$ExternalSyntheticLambda0 & 8) == 0 && this.setY.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i2;
        return i != i2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        if (MenuHostHelper$$ExternalSyntheticLambda1(z)) {
            setNavigationIconTint setnavigationicontint = this.MenuHostHelper$$ExternalSyntheticLambda1;
            setnavigationicontint.setOnLongClickListener = true;
            setnavigationicontint.setIconTintList(true);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.setChipCornerRadius = onMenuItemClickListener;
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.ExtendableSavedState$1;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.setChipIconTintResource;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.setNavigationOnClickListener = i;
        setNavigationIconTint setnavigationicontint = this.MenuHostHelper$$ExternalSyntheticLambda1;
        setnavigationicontint.setUnboundedRipple = true;
        setnavigationicontint.setIconTintList(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    /* renamed from: setIconTintList */
    public setCustomSelectionActionModeCallback setActionView(View view) {
        int i;
        this.setCenterIfNoTextEnabled = view;
        this.setY = null;
        if (view != null && view.getId() == -1 && (i = this.setCheckedIconEnabled) > 0) {
            view.setId(i);
        }
        setNavigationIconTint setnavigationicontint = this.MenuHostHelper$$ExternalSyntheticLambda1;
        setnavigationicontint.setUnboundedRipple = true;
        setnavigationicontint.setIconTintList(true);
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final View getActionView() {
        View view = this.setCenterIfNoTextEnabled;
        if (view != null) {
            return view;
        }
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = this.setY;
        if (appBarLayout$BaseBehavior != null) {
            View x = appBarLayout$BaseBehavior.setX(this);
            this.setCenterIfNoTextEnabled = x;
            return x;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // o.setCustomSelectionActionModeCallback
    public final AppBarLayout$BaseBehavior MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setY;
    }

    @Override // o.setCustomSelectionActionModeCallback
    public final setCustomSelectionActionModeCallback setY(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior) {
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior2 = this.setY;
        if (appBarLayout$BaseBehavior2 != null) {
            appBarLayout$BaseBehavior2.setUnboundedRipple();
        }
        this.setCenterIfNoTextEnabled = null;
        this.setY = appBarLayout$BaseBehavior;
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(true);
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior3 = this.setY;
        if (appBarLayout$BaseBehavior3 != null) {
            appBarLayout$BaseBehavior3.MenuHostHelper$$ExternalSyntheticLambda0(new AppBarLayout$BaseBehavior.setIconTintList() { // from class: o.ActionMenuPresenter$SavedState$1.1
                @Override // o.AppBarLayout$BaseBehavior.setIconTintList
                public final void setX() {
                    setNavigationIconTint setnavigationicontint = ActionMenuPresenter$SavedState$1.this.MenuHostHelper$$ExternalSyntheticLambda1;
                    setnavigationicontint.setOnLongClickListener = true;
                    setnavigationicontint.setIconTintList(true);
                }
            });
        }
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final boolean expandActionView() {
        if (setX()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.setIconified;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(this);
            }
            return false;
        }
        return false;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.setNavigationOnClickListener & 8) == 0) {
            return false;
        }
        if (this.setCenterIfNoTextEnabled == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.setIconified;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1.setY(this);
        }
        return false;
    }

    public final boolean setX() {
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior;
        if ((this.setNavigationOnClickListener & 8) != 0) {
            if (this.setCenterIfNoTextEnabled == null && (appBarLayout$BaseBehavior = this.setY) != null) {
                this.setCenterIfNoTextEnabled = appBarLayout$BaseBehavior.setX(this);
            }
            return this.setCenterIfNoTextEnabled != null;
        }
        return false;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.setX;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.setIconified = onActionExpandListener;
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback
    public final setCustomSelectionActionModeCallback setY(CharSequence charSequence) {
        this.setTextAlignment = charSequence;
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.setTextAlignment;
    }

    @Override // o.setCustomSelectionActionModeCallback
    public final setCustomSelectionActionModeCallback setX(CharSequence charSequence) {
        this.FragmentStateAdapter$2 = charSequence;
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.FragmentStateAdapter$2;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
        setActionView(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // android.view.MenuItem
    public final /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.setTextAlignment = charSequence;
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        return this;
    }

    @Override // o.setCustomSelectionActionModeCallback, android.view.MenuItem
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.FragmentStateAdapter$2 = charSequence;
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        return this;
    }
}