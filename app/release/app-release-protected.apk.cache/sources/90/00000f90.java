package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;

/* loaded from: classes.dex */
public final class setSimpleItemSelectedColor {
    public static MenuItem setX(MenuItem menuItem, AppBarLayout$BaseBehavior appBarLayout$BaseBehavior) {
        if (menuItem instanceof setCustomSelectionActionModeCallback) {
            return ((setCustomSelectionActionModeCallback) menuItem).setY(appBarLayout$BaseBehavior);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof setCustomSelectionActionModeCallback) {
            ((setCustomSelectionActionModeCallback) menuItem).setY(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    public static void setIconTintList(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof setCustomSelectionActionModeCallback) {
            ((setCustomSelectionActionModeCallback) menuItem).setX(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            setX.setIconTintList(menuItem, charSequence);
        }
    }

    public static void setX(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof setCustomSelectionActionModeCallback) {
            ((setCustomSelectionActionModeCallback) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    public static void setY(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof setCustomSelectionActionModeCallback) {
            ((setCustomSelectionActionModeCallback) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            setX.setIconTintList(menuItem, c, i);
        }
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof setCustomSelectionActionModeCallback) {
            ((setCustomSelectionActionModeCallback) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            setX.setIconTintList(menuItem, colorStateList);
        }
    }

    public static void setIconTintList(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof setCustomSelectionActionModeCallback) {
            ((setCustomSelectionActionModeCallback) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            setX.setX(menuItem, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX {
        static MenuItem setIconTintList(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }

        static MenuItem setIconTintList(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        static MenuItem setIconTintList(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        static MenuItem setX(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }
    }
}