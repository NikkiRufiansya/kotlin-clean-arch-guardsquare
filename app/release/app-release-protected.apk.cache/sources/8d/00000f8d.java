package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import o.setShrinkMotionSpec;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setShrinkMotionSpec$MenuHostHelper$$ExternalSyntheticLambda0 {
    CharSequence ExtendableSavedState$1;
    final /* synthetic */ setShrinkMotionSpec FloatingActionButton$BaseBehavior;
    int SearchView$SavedState$1;
    int ViewPager$SavedState$1;
    boolean setAnimationFromJson;
    int setCenterIfNoTextEnabled;
    int setCheckedIconEnabled;
    boolean setChipCornerRadius;
    CharSequence setChipIconTintResource;
    Menu setContentScrimResource;
    char setGuidelinePercent;
    CharSequence setHasDecor;
    char setIconSize;
    boolean setIconified;
    AppBarLayout$BaseBehavior setLayoutAnimation;
    int setLayoutDirection;
    boolean setMaxEms;
    String setMinAndMaxProgress;
    int setNavigationOnClickListener;
    String setOnLongClickListener;
    CharSequence setOnNavigationItemSelectedListener;
    int setTextAlignment;
    int setTextScaleX;
    String setUiOptions;
    ColorStateList setZ = null;
    PorterDuff.Mode setTextAppearanceResource = null;
    int setX = 0;
    int setY = 0;
    int setIconTintList = 0;
    int MenuHostHelper$$ExternalSyntheticLambda0 = 0;
    boolean setUnboundedRipple = true;
    boolean MenuHostHelper$$ExternalSyntheticLambda1 = true;

    public setShrinkMotionSpec$MenuHostHelper$$ExternalSyntheticLambda0(setShrinkMotionSpec setshrinkmotionspec, Menu menu) {
        this.FloatingActionButton$BaseBehavior = setshrinkmotionspec;
        this.setContentScrimResource = menu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(MenuItem menuItem) {
        boolean z = true;
        menuItem.setChecked(this.setMaxEms).setVisible(this.setIconified).setEnabled(this.setAnimationFromJson).setCheckable(this.setCenterIfNoTextEnabled > 0).setTitleCondensed(this.setHasDecor).setIcon(this.setTextScaleX);
        int i = this.SearchView$SavedState$1;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.setMinAndMaxProgress != null) {
            if (this.FloatingActionButton$BaseBehavior.MenuHostHelper$$ExternalSyntheticLambda0.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuItem.setOnMenuItemClickListener(new setShrinkMotionSpec.setX(this.FloatingActionButton$BaseBehavior.MenuHostHelper$$ExternalSyntheticLambda1(), this.setMinAndMaxProgress));
        }
        if (this.setCenterIfNoTextEnabled >= 2) {
            if (menuItem instanceof ActionMenuPresenter$SavedState$1) {
                ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = (ActionMenuPresenter$SavedState$1) menuItem;
                actionMenuPresenter$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 = (actionMenuPresenter$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 & (-5)) | 4;
            } else if (menuItem instanceof setEmptyView) {
                ((setEmptyView) menuItem).setY();
            }
        }
        String str = this.setOnLongClickListener;
        if (str != null) {
            menuItem.setActionView((View) MenuHostHelper$$ExternalSyntheticLambda1(str, setShrinkMotionSpec.setX, this.FloatingActionButton$BaseBehavior.MenuHostHelper$$ExternalSyntheticLambda1));
        } else {
            z = false;
        }
        int i2 = this.setNavigationOnClickListener;
        if (i2 > 0) {
            if (!z) {
                menuItem.setActionView(i2);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = this.setLayoutAnimation;
        if (appBarLayout$BaseBehavior != null) {
            setSimpleItemSelectedColor.setX(menuItem, appBarLayout$BaseBehavior);
        }
        setSimpleItemSelectedColor.MenuHostHelper$$ExternalSyntheticLambda1(menuItem, this.setOnNavigationItemSelectedListener);
        setSimpleItemSelectedColor.setIconTintList(menuItem, this.ExtendableSavedState$1);
        setSimpleItemSelectedColor.setY(menuItem, this.setIconSize, this.ViewPager$SavedState$1);
        setSimpleItemSelectedColor.setX(menuItem, this.setGuidelinePercent, this.setCheckedIconEnabled);
        PorterDuff.Mode mode = this.setTextAppearanceResource;
        if (mode != null) {
            setSimpleItemSelectedColor.setIconTintList(menuItem, mode);
        }
        ColorStateList colorStateList = this.setZ;
        if (colorStateList != null) {
            setSimpleItemSelectedColor.MenuHostHelper$$ExternalSyntheticLambda0(menuItem, colorStateList);
        }
    }

    public final SubMenu setX() {
        this.setChipCornerRadius = true;
        SubMenu addSubMenu = this.setContentScrimResource.addSubMenu(this.setX, this.setLayoutDirection, this.setTextAlignment, this.setChipIconTintResource);
        setY(addSubMenu.getItem());
        return addSubMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> T MenuHostHelper$$ExternalSyntheticLambda1(String str, Class<?>[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.FloatingActionButton$BaseBehavior.MenuHostHelper$$ExternalSyntheticLambda0.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return (T) constructor.newInstance(objArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Cannot instantiate class: ");
            sb.append(str);
            Log.w("SupportMenuInflater", sb.toString(), e);
            return null;
        }
    }
}