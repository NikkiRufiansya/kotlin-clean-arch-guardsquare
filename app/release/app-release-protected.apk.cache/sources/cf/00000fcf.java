package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import o.setAnimateShowBeforeLayout;
import o.setDecorPadding;

/* loaded from: classes.dex */
public abstract class setStatusBarForegroundResource extends ViewGroup implements TextInputLayout$SavedState$1 {
    private static final int[] setIconTintList = {16842912};
    private static final int[] setUiOptions = {-16842910};
    private final ColorStateList ExtendableSavedState$1;
    private final setColumnWidth FragmentStateAdapter$2;
    public setNavigationIconTint MenuHostHelper$$ExternalSyntheticLambda0;
    public int MenuHostHelper$$ExternalSyntheticLambda1;
    private final View.OnClickListener SearchView$SavedState$1;
    private boolean ViewPager$SavedState$1;
    private int setAnimationFromJson;
    private boolean setCenterIfNoTextEnabled;
    private int setCheckedIconEnabled;
    private int setChipCornerRadius;
    private int setChipIconTintResource;
    private int setGuidelinePercent;
    private final SparseArray<View.OnTouchListener> setHasDecor;
    private setScrollBarDefaultDelayBeforeFade setIconSize;
    private ColorStateList setIconified;
    int setLayoutAnimation;
    private int setLayoutDirection;
    private ColorStateList setMaxEms;
    private final setAnimateShowBeforeLayout.setY<setCounterTextColor> setMinAndMaxProgress;
    public int setNavigationOnClickListener;
    private ColorStateList setOnLongClickListener;
    private int setOnNavigationItemSelectedListener;
    private int setTextAlignment;
    private ColorStateList setTextAppearanceResource;
    private int setTextScaleX;
    writeObject setUnboundedRipple;
    setCounterTextColor[] setX;
    final SparseArray<setIconGravity> setY;
    private Drawable setZ;

    protected abstract setCounterTextColor MenuHostHelper$$ExternalSyntheticLambda1(Context context);

    public setStatusBarForegroundResource(Context context) {
        super(context);
        this.setMinAndMaxProgress = new setAnimateShowBeforeLayout.setX(5);
        this.setHasDecor = new SparseArray<>(5);
        this.setLayoutAnimation = 0;
        this.setNavigationOnClickListener = 0;
        this.setY = new SparseArray<>(5);
        this.setLayoutDirection = -1;
        this.setCheckedIconEnabled = -1;
        this.ViewPager$SavedState$1 = false;
        this.ExtendableSavedState$1 = setX();
        if (isInEditMode()) {
            this.FragmentStateAdapter$2 = null;
        } else {
            setItemPaddingBottom setitempaddingbottom = new setItemPaddingBottom();
            this.FragmentStateAdapter$2 = setitempaddingbottom;
            setitempaddingbottom.setX(0);
            Context context2 = getContext();
            getResources();
            setitempaddingbottom.setY(setChipMinHeight.setX(context2, R.attr.res_0x7f0402f1, 300));
            setitempaddingbottom.MenuHostHelper$$ExternalSyntheticLambda0(setChipMinHeight.MenuHostHelper$$ExternalSyntheticLambda0(getContext(), R.attr.res_0x7f040305, setCardElevation.MenuHostHelper$$ExternalSyntheticLambda0));
            setitempaddingbottom.MenuHostHelper$$ExternalSyntheticLambda1(new create());
        }
        this.SearchView$SavedState$1 = new View.OnClickListener() { // from class: o.setStatusBarForegroundResource.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = ((setCounterTextColor) view).setOnLongClickListener;
                if (setStatusBarForegroundResource.this.MenuHostHelper$$ExternalSyntheticLambda0.setX(actionMenuPresenter$SavedState$1, setStatusBarForegroundResource.this.setUnboundedRipple, 0)) {
                    return;
                }
                actionMenuPresenter$SavedState$1.setChecked(true);
            }
        };
        setBaselineAlignBottom.setUnboundedRipple(this, 1);
    }

    @Override // o.TextInputLayout$SavedState$1
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setNavigationIconTint setnavigationicontint) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setnavigationicontint;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        setDecorPadding.setY(accessibilityNodeInfo).setX(setDecorPadding.setX.setIconTintList(1, this.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple().size(), false, 1));
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.setMaxEms = colorStateList;
        setCounterTextColor[] setcountertextcolorArr = this.setX;
        if (setcountertextcolorArr != null) {
            for (setCounterTextColor setcountertextcolor : setcountertextcolorArr) {
                setcountertextcolor.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.setAnimationFromJson = i;
        setCounterTextColor[] setcountertextcolorArr = this.setX;
        if (setcountertextcolorArr != null) {
            for (setCounterTextColor setcountertextcolor : setcountertextcolorArr) {
                setcountertextcolor.setIconSize(i);
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.setIconified = colorStateList;
        setCounterTextColor[] setcountertextcolorArr = this.setX;
        if (setcountertextcolorArr != null) {
            for (setCounterTextColor setcountertextcolor : setcountertextcolorArr) {
                setcountertextcolor.setTextColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.setChipIconTintResource = i;
        setCounterTextColor[] setcountertextcolorArr = this.setX;
        if (setcountertextcolorArr != null) {
            for (setCounterTextColor setcountertextcolor : setcountertextcolorArr) {
                setcountertextcolor.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.setIconified;
                if (colorStateList != null) {
                    setcountertextcolor.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.setGuidelinePercent = i;
        setCounterTextColor[] setcountertextcolorArr = this.setX;
        if (setcountertextcolorArr != null) {
            for (setCounterTextColor setcountertextcolor : setcountertextcolorArr) {
                setcountertextcolor.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.setIconified;
                if (colorStateList != null) {
                    setcountertextcolor.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.setTextScaleX = i;
        setCounterTextColor[] setcountertextcolorArr = this.setX;
        if (setcountertextcolorArr != null) {
            for (setCounterTextColor setcountertextcolor : setcountertextcolorArr) {
                setcountertextcolor.setItemBackground(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.setLayoutDirection = i;
        setCounterTextColor[] setcountertextcolorArr = this.setX;
        if (setcountertextcolorArr != null) {
            for (setCounterTextColor setcountertextcolor : setcountertextcolorArr) {
                setcountertextcolor.setItemPaddingTop(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.setCheckedIconEnabled = i;
        setCounterTextColor[] setcountertextcolorArr = this.setX;
        if (setcountertextcolorArr != null) {
            for (setCounterTextColor setcountertextcolor : setcountertextcolorArr) {
                setcountertextcolor.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.setCenterIfNoTextEnabled = z;
        setCounterTextColor[] setcountertextcolorArr = this.setX;
        if (setcountertextcolorArr != null) {
            for (setCounterTextColor setcountertextcolor : setcountertextcolorArr) {
                setcountertextcolor.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.setOnNavigationItemSelectedListener = i;
        setCounterTextColor[] setcountertextcolorArr = this.setX;
        if (setcountertextcolorArr != null) {
            for (setCounterTextColor setcountertextcolor : setcountertextcolorArr) {
                setcountertextcolor.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.setChipCornerRadius = i;
        setCounterTextColor[] setcountertextcolorArr = this.setX;
        if (setcountertextcolorArr != null) {
            for (setCounterTextColor setcountertextcolor : setcountertextcolorArr) {
                setcountertextcolor.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.setTextAlignment = i;
        setCounterTextColor[] setcountertextcolorArr = this.setX;
        if (setcountertextcolorArr != null) {
            for (setCounterTextColor setcountertextcolor : setcountertextcolorArr) {
                setcountertextcolor.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        this.setIconSize = setscrollbardefaultdelaybeforefade;
        setCounterTextColor[] setcountertextcolorArr = this.setX;
        if (setcountertextcolorArr != null) {
            for (setCounterTextColor setcountertextcolor : setcountertextcolorArr) {
                setcountertextcolor.setActiveIndicatorDrawable(MenuHostHelper$$ExternalSyntheticLambda1());
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.setOnLongClickListener = colorStateList;
        setCounterTextColor[] setcountertextcolorArr = this.setX;
        if (setcountertextcolorArr != null) {
            for (setCounterTextColor setcountertextcolor : setcountertextcolorArr) {
                setcountertextcolor.setActiveIndicatorDrawable(MenuHostHelper$$ExternalSyntheticLambda1());
            }
        }
    }

    private Drawable MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.setIconSize == null || this.setOnLongClickListener == null) {
            return null;
        }
        setWebViewClient setwebviewclient = new setWebViewClient(this.setIconSize);
        ColorStateList colorStateList = this.setOnLongClickListener;
        if (setwebviewclient.setChipIconTintResource.setX != colorStateList) {
            setwebviewclient.setChipIconTintResource.setX = colorStateList;
            setwebviewclient.onStateChange(setwebviewclient.getState());
        }
        return setwebviewclient;
    }

    public void setItemBackground(Drawable drawable) {
        this.setZ = drawable;
        setCounterTextColor[] setcountertextcolorArr = this.setX;
        if (setcountertextcolorArr != null) {
            for (setCounterTextColor setcountertextcolor : setcountertextcolorArr) {
                setcountertextcolor.setItemBackground(drawable);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.setTextAppearanceResource = colorStateList;
        setCounterTextColor[] setcountertextcolorArr = this.setX;
        if (setcountertextcolorArr != null) {
            for (setCounterTextColor setcountertextcolor : setcountertextcolorArr) {
                setcountertextcolor.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
    }

    public void setItemOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.setHasDecor.remove(i);
        } else {
            this.setHasDecor.put(i, onTouchListener);
        }
        setCounterTextColor[] setcountertextcolorArr = this.setX;
        if (setcountertextcolorArr != null) {
            for (setCounterTextColor setcountertextcolor : setcountertextcolorArr) {
                if (setcountertextcolor.setOnLongClickListener.getItemId() == i) {
                    setcountertextcolor.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public final ColorStateList setX() {
        ColorStateList iconTintList;
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            iconTintList = setLineHeight.setIconTintList(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(R.attr.res_0x7f0400f8, typedValue, true)) {
                int i = typedValue.data;
                int defaultColor = iconTintList.getDefaultColor();
                int[] iArr = setUiOptions;
                return new ColorStateList(new int[][]{iArr, setIconTintList, EMPTY_STATE_SET}, new int[]{iconTintList.getColorForState(iArr, defaultColor), i, defaultColor});
            }
            return null;
        }
        return null;
    }

    public void setPresenter(writeObject writeobject) {
        this.setUnboundedRipple = writeobject;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        setIconGravity seticongravity;
        removeAllViews();
        setCounterTextColor[] setcountertextcolorArr = this.setX;
        if (setcountertextcolorArr != null) {
            for (setCounterTextColor setcountertextcolor : setcountertextcolorArr) {
                if (setcountertextcolor != null) {
                    this.setMinAndMaxProgress.setIconTintList(setcountertextcolor);
                    setcountertextcolor.setX(setcountertextcolor.MenuHostHelper$$ExternalSyntheticLambda0);
                    setcountertextcolor.setOnLongClickListener = null;
                    setcountertextcolor.setX = 0.0f;
                    setcountertextcolor.setUiOptions = false;
                }
            }
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.size() == 0) {
            this.setLayoutAnimation = 0;
            this.setNavigationOnClickListener = 0;
            this.setX = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.MenuHostHelper$$ExternalSyntheticLambda0.size(); i++) {
            hashSet.add(Integer.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda0.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.setY.size(); i2++) {
            int keyAt = this.setY.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.setY.delete(keyAt);
            }
        }
        this.setX = new setCounterTextColor[this.MenuHostHelper$$ExternalSyntheticLambda0.size()];
        int i3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        boolean z = i3 != -1 ? i3 == 0 : this.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple().size() > 3;
        for (int i4 = 0; i4 < this.MenuHostHelper$$ExternalSyntheticLambda0.size(); i4++) {
            this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            this.MenuHostHelper$$ExternalSyntheticLambda0.getItem(i4).setCheckable(true);
            this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1 = false;
            setCounterTextColor MenuHostHelper$$ExternalSyntheticLambda0 = this.setMinAndMaxProgress.MenuHostHelper$$ExternalSyntheticLambda0();
            if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda1(getContext());
            }
            this.setX[i4] = MenuHostHelper$$ExternalSyntheticLambda0;
            MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(this.setMaxEms);
            MenuHostHelper$$ExternalSyntheticLambda0.setIconSize(this.setAnimationFromJson);
            MenuHostHelper$$ExternalSyntheticLambda0.setTextColor(this.ExtendableSavedState$1);
            MenuHostHelper$$ExternalSyntheticLambda0.setTextAppearanceInactive(this.setChipIconTintResource);
            MenuHostHelper$$ExternalSyntheticLambda0.setTextAppearanceActive(this.setGuidelinePercent);
            MenuHostHelper$$ExternalSyntheticLambda0.setTextColor(this.setIconified);
            int i5 = this.setLayoutDirection;
            if (i5 != -1) {
                MenuHostHelper$$ExternalSyntheticLambda0.setItemPaddingTop(i5);
            }
            int i6 = this.setCheckedIconEnabled;
            if (i6 != -1) {
                MenuHostHelper$$ExternalSyntheticLambda0.setItemPaddingBottom(i6);
            }
            MenuHostHelper$$ExternalSyntheticLambda0.setActiveIndicatorWidth(this.setOnNavigationItemSelectedListener);
            MenuHostHelper$$ExternalSyntheticLambda0.setActiveIndicatorHeight(this.setChipCornerRadius);
            MenuHostHelper$$ExternalSyntheticLambda0.setActiveIndicatorMarginHorizontal(this.setTextAlignment);
            MenuHostHelper$$ExternalSyntheticLambda0.setActiveIndicatorDrawable(MenuHostHelper$$ExternalSyntheticLambda1());
            MenuHostHelper$$ExternalSyntheticLambda0.setActiveIndicatorResizeable(this.ViewPager$SavedState$1);
            MenuHostHelper$$ExternalSyntheticLambda0.setActiveIndicatorEnabled(this.setCenterIfNoTextEnabled);
            Drawable drawable = this.setZ;
            if (drawable != null) {
                MenuHostHelper$$ExternalSyntheticLambda0.setItemBackground(drawable);
            } else {
                MenuHostHelper$$ExternalSyntheticLambda0.setItemBackground(this.setTextScaleX);
            }
            MenuHostHelper$$ExternalSyntheticLambda0.setItemRippleColor(this.setTextAppearanceResource);
            MenuHostHelper$$ExternalSyntheticLambda0.setShifting(z);
            MenuHostHelper$$ExternalSyntheticLambda0.setLabelVisibilityMode(this.MenuHostHelper$$ExternalSyntheticLambda1);
            ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = (ActionMenuPresenter$SavedState$1) this.MenuHostHelper$$ExternalSyntheticLambda0.getItem(i4);
            MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(actionMenuPresenter$SavedState$1);
            MenuHostHelper$$ExternalSyntheticLambda0.setItemPosition(i4);
            int itemId = actionMenuPresenter$SavedState$1.getItemId();
            MenuHostHelper$$ExternalSyntheticLambda0.setOnTouchListener(this.setHasDecor.get(itemId));
            MenuHostHelper$$ExternalSyntheticLambda0.setOnClickListener(this.SearchView$SavedState$1);
            int i7 = this.setLayoutAnimation;
            if (i7 != 0 && itemId == i7) {
                this.setNavigationOnClickListener = i4;
            }
            int id = MenuHostHelper$$ExternalSyntheticLambda0.getId();
            if ((id != -1) && (seticongravity = this.setY.get(id)) != null) {
                MenuHostHelper$$ExternalSyntheticLambda0.setY(seticongravity);
            }
            addView(MenuHostHelper$$ExternalSyntheticLambda0);
        }
        int min = Math.min(this.MenuHostHelper$$ExternalSyntheticLambda0.size() - 1, this.setNavigationOnClickListener);
        this.setNavigationOnClickListener = min;
        this.MenuHostHelper$$ExternalSyntheticLambda0.getItem(min).setChecked(true);
    }

    public final void setY() {
        setColumnWidth setcolumnwidth;
        setNavigationIconTint setnavigationicontint = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setnavigationicontint == null || this.setX == null) {
            return;
        }
        int size = setnavigationicontint.size();
        if (size != this.setX.length) {
            MenuHostHelper$$ExternalSyntheticLambda0();
            return;
        }
        int i = this.setLayoutAnimation;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.MenuHostHelper$$ExternalSyntheticLambda0.getItem(i2);
            if (item.isChecked()) {
                this.setLayoutAnimation = item.getItemId();
                this.setNavigationOnClickListener = i2;
            }
        }
        if (i != this.setLayoutAnimation && (setcolumnwidth = this.FragmentStateAdapter$2) != null) {
            setHelperText.setIconTintList(this, setcolumnwidth);
        }
        int i3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        boolean z = i3 != -1 ? i3 == 0 : this.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple().size() > 3;
        for (int i4 = 0; i4 < size; i4++) {
            this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            this.setX[i4].setLabelVisibilityMode(this.MenuHostHelper$$ExternalSyntheticLambda1);
            this.setX[i4].setShifting(z);
            this.setX[i4].setIconTintList((ActionMenuPresenter$SavedState$1) this.MenuHostHelper$$ExternalSyntheticLambda0.getItem(i4));
            this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1 = false;
        }
    }
}