package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import o.setIconTint;

/* loaded from: classes.dex */
public class setScrollBarDefaultDelayBeforeFade {
    public static final setImageURI MenuHostHelper$$ExternalSyntheticLambda1 = new setSuffixTextAppearance(0.5f);
    public setInitialScale MenuHostHelper$$ExternalSyntheticLambda0;
    public setImageURI setCenterIfNoTextEnabled;
    public setImageURI setChipCornerRadius;
    public setInitialScale setIconTintList;
    public setInitialScale setLayoutAnimation;
    public setBackground setNavigationOnClickListener;
    setBackground setOnLongClickListener;
    public setInitialScale setTextAlignment;
    setBackground setUiOptions;
    public setImageURI setUnboundedRipple;
    public setImageURI setX;
    setBackground setY;

    /* loaded from: classes.dex */
    public interface setIconTintList {
        setImageURI setX(setImageURI setimageuri);
    }

    public /* synthetic */ setScrollBarDefaultDelayBeforeFade(setY sety, byte b) {
        this(sety);
    }

    /* loaded from: classes.dex */
    public static final class setY {
        setInitialScale MenuHostHelper$$ExternalSyntheticLambda0;
        setBackground MenuHostHelper$$ExternalSyntheticLambda1;
        public setImageURI ViewPager$SavedState$1;
        setInitialScale setChipCornerRadius;
        public setImageURI setIconTintList;
        public setBackground setLayoutAnimation;
        public setImageURI setNavigationOnClickListener;
        setBackground setOnLongClickListener;
        setBackground setUiOptions;
        setInitialScale setUnboundedRipple;
        setInitialScale setX;
        public setImageURI setY;

        public setY() {
            this.setUnboundedRipple = new setButtonTintList();
            this.setChipCornerRadius = new setButtonTintList();
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new setButtonTintList();
            this.setX = new setButtonTintList();
            this.setNavigationOnClickListener = new setActionBarVisibilityCallback(0.0f);
            this.ViewPager$SavedState$1 = new setActionBarVisibilityCallback(0.0f);
            this.setIconTintList = new setActionBarVisibilityCallback(0.0f);
            this.setY = new setActionBarVisibilityCallback(0.0f);
            this.setLayoutAnimation = new setBackground();
            this.setUiOptions = new setBackground();
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new setBackground();
            this.setOnLongClickListener = new setBackground();
        }

        public setY(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
            this.setUnboundedRipple = new setButtonTintList();
            this.setChipCornerRadius = new setButtonTintList();
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new setButtonTintList();
            this.setX = new setButtonTintList();
            this.setNavigationOnClickListener = new setActionBarVisibilityCallback(0.0f);
            this.ViewPager$SavedState$1 = new setActionBarVisibilityCallback(0.0f);
            this.setIconTintList = new setActionBarVisibilityCallback(0.0f);
            this.setY = new setActionBarVisibilityCallback(0.0f);
            this.setLayoutAnimation = new setBackground();
            this.setUiOptions = new setBackground();
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new setBackground();
            this.setOnLongClickListener = new setBackground();
            this.setUnboundedRipple = setscrollbardefaultdelaybeforefade.setLayoutAnimation;
            this.setChipCornerRadius = setscrollbardefaultdelaybeforefade.setTextAlignment;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setscrollbardefaultdelaybeforefade.setIconTintList;
            this.setX = setscrollbardefaultdelaybeforefade.MenuHostHelper$$ExternalSyntheticLambda0;
            this.setNavigationOnClickListener = setscrollbardefaultdelaybeforefade.setCenterIfNoTextEnabled;
            this.ViewPager$SavedState$1 = setscrollbardefaultdelaybeforefade.setChipCornerRadius;
            this.setIconTintList = setscrollbardefaultdelaybeforefade.setUnboundedRipple;
            this.setY = setscrollbardefaultdelaybeforefade.setX;
            this.setLayoutAnimation = setscrollbardefaultdelaybeforefade.setNavigationOnClickListener;
            this.setUiOptions = setscrollbardefaultdelaybeforefade.setUiOptions;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = setscrollbardefaultdelaybeforefade.setY;
            this.setOnLongClickListener = setscrollbardefaultdelaybeforefade.setOnLongClickListener;
        }

        static float MenuHostHelper$$ExternalSyntheticLambda0(setInitialScale setinitialscale) {
            if (setinitialscale instanceof setButtonTintList) {
                return ((setButtonTintList) setinitialscale).MenuHostHelper$$ExternalSyntheticLambda0;
            }
            if (setinitialscale instanceof setPreferKeepClear) {
                return ((setPreferKeepClear) setinitialscale).MenuHostHelper$$ExternalSyntheticLambda0;
            }
            return -1.0f;
        }
    }

    public static setY MenuHostHelper$$ExternalSyntheticLambda0(Context context, AttributeSet attributeSet, int i, int i2, setImageURI setimageuri) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setIconTint.setIconTintList.ExtendableSavedState$1, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return MenuHostHelper$$ExternalSyntheticLambda0(context, resourceId, resourceId2, setimageuri);
    }

    public static setY MenuHostHelper$$ExternalSyntheticLambda0(Context context, int i, int i2, setImageURI setimageuri) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(setIconTint.setIconTintList.setFilterTouchesWhenObscured);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            setImageURI iconTintList = setIconTintList(obtainStyledAttributes, 5, setimageuri);
            setImageURI iconTintList2 = setIconTintList(obtainStyledAttributes, 8, iconTintList);
            setImageURI iconTintList3 = setIconTintList(obtainStyledAttributes, 9, iconTintList);
            setImageURI iconTintList4 = setIconTintList(obtainStyledAttributes, 7, iconTintList);
            setImageURI iconTintList5 = setIconTintList(obtainStyledAttributes, 6, iconTintList);
            setY sety = new setY();
            setInitialScale MenuHostHelper$$ExternalSyntheticLambda0 = ImmLeaksCleaner.MenuHostHelper$$ExternalSyntheticLambda0(i4);
            sety.setUnboundedRipple = MenuHostHelper$$ExternalSyntheticLambda0;
            float MenuHostHelper$$ExternalSyntheticLambda02 = setY.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0);
            if (MenuHostHelper$$ExternalSyntheticLambda02 != -1.0f) {
                sety.setNavigationOnClickListener = new setActionBarVisibilityCallback(MenuHostHelper$$ExternalSyntheticLambda02);
            }
            sety.setNavigationOnClickListener = iconTintList2;
            setInitialScale MenuHostHelper$$ExternalSyntheticLambda03 = ImmLeaksCleaner.MenuHostHelper$$ExternalSyntheticLambda0(i5);
            sety.setChipCornerRadius = MenuHostHelper$$ExternalSyntheticLambda03;
            float MenuHostHelper$$ExternalSyntheticLambda04 = setY.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda03);
            if (MenuHostHelper$$ExternalSyntheticLambda04 != -1.0f) {
                sety.ViewPager$SavedState$1 = new setActionBarVisibilityCallback(MenuHostHelper$$ExternalSyntheticLambda04);
            }
            sety.ViewPager$SavedState$1 = iconTintList3;
            setInitialScale MenuHostHelper$$ExternalSyntheticLambda05 = ImmLeaksCleaner.MenuHostHelper$$ExternalSyntheticLambda0(i6);
            sety.MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda05;
            float MenuHostHelper$$ExternalSyntheticLambda06 = setY.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda05);
            if (MenuHostHelper$$ExternalSyntheticLambda06 != -1.0f) {
                sety.setIconTintList = new setActionBarVisibilityCallback(MenuHostHelper$$ExternalSyntheticLambda06);
            }
            sety.setIconTintList = iconTintList4;
            setInitialScale MenuHostHelper$$ExternalSyntheticLambda07 = ImmLeaksCleaner.MenuHostHelper$$ExternalSyntheticLambda0(i7);
            sety.setX = MenuHostHelper$$ExternalSyntheticLambda07;
            float MenuHostHelper$$ExternalSyntheticLambda08 = setY.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda07);
            if (MenuHostHelper$$ExternalSyntheticLambda08 != -1.0f) {
                sety.setY = new setActionBarVisibilityCallback(MenuHostHelper$$ExternalSyntheticLambda08);
            }
            sety.setY = iconTintList5;
            return sety;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static setImageURI setIconTintList(TypedArray typedArray, int i, setImageURI setimageuri) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return setimageuri;
        }
        if (peekValue.type == 5) {
            return new setActionBarVisibilityCallback(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return peekValue.type == 6 ? new setSuffixTextAppearance(peekValue.getFraction(1.0f, 1.0f)) : setimageuri;
    }

    private setScrollBarDefaultDelayBeforeFade(setY sety) {
        this.setLayoutAnimation = sety.setUnboundedRipple;
        this.setTextAlignment = sety.setChipCornerRadius;
        this.setIconTintList = sety.MenuHostHelper$$ExternalSyntheticLambda0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = sety.setX;
        this.setCenterIfNoTextEnabled = sety.setNavigationOnClickListener;
        this.setChipCornerRadius = sety.ViewPager$SavedState$1;
        this.setUnboundedRipple = sety.setIconTintList;
        this.setX = sety.setY;
        this.setNavigationOnClickListener = sety.setLayoutAnimation;
        this.setUiOptions = sety.setUiOptions;
        this.setY = sety.MenuHostHelper$$ExternalSyntheticLambda1;
        this.setOnLongClickListener = sety.setOnLongClickListener;
    }

    public setScrollBarDefaultDelayBeforeFade() {
        this.setLayoutAnimation = new setButtonTintList();
        this.setTextAlignment = new setButtonTintList();
        this.setIconTintList = new setButtonTintList();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new setButtonTintList();
        this.setCenterIfNoTextEnabled = new setActionBarVisibilityCallback(0.0f);
        this.setChipCornerRadius = new setActionBarVisibilityCallback(0.0f);
        this.setUnboundedRipple = new setActionBarVisibilityCallback(0.0f);
        this.setX = new setActionBarVisibilityCallback(0.0f);
        this.setNavigationOnClickListener = new setBackground();
        this.setUiOptions = new setBackground();
        this.setY = new setBackground();
        this.setOnLongClickListener = new setBackground();
    }

    public final boolean setIconTintList(RectF rectF) {
        boolean z = this.setOnLongClickListener.getClass().equals(setBackground.class) && this.setUiOptions.getClass().equals(setBackground.class) && this.setNavigationOnClickListener.getClass().equals(setBackground.class) && this.setY.getClass().equals(setBackground.class);
        float y = this.setCenterIfNoTextEnabled.setY(rectF);
        return z && ((this.setChipCornerRadius.setY(rectF) > y ? 1 : (this.setChipCornerRadius.setY(rectF) == y ? 0 : -1)) == 0 && (this.setX.setY(rectF) > y ? 1 : (this.setX.setY(rectF) == y ? 0 : -1)) == 0 && (this.setUnboundedRipple.setY(rectF) > y ? 1 : (this.setUnboundedRipple.setY(rectF) == y ? 0 : -1)) == 0) && ((this.setTextAlignment instanceof setButtonTintList) && (this.setLayoutAnimation instanceof setButtonTintList) && (this.setIconTintList instanceof setButtonTintList) && (this.MenuHostHelper$$ExternalSyntheticLambda0 instanceof setButtonTintList));
    }
}