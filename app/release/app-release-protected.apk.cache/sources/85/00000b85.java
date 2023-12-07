package o;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import o.setBaselineAlignBottom;
import o.setEnsureMinTouchTargetSize;
import o.setIconTint;
import o.setScrollBarDefaultDelayBeforeFade;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setErrorIconOnLongClickListener {
    private static final Drawable setMaxEms;
    private static final double setTextScaleX = Math.cos(Math.toRadians(45.0d));
    int MenuHostHelper$$ExternalSyntheticLambda0;
    final setWebViewClient MenuHostHelper$$ExternalSyntheticLambda1;
    Drawable ViewPager$SavedState$1;
    ColorStateList setAnimationFromJson;
    final setKeyListener setChipCornerRadius;
    setScrollBarDefaultDelayBeforeFade setIconSize;
    boolean setIconTintList;
    final setWebViewClient setLayoutAnimation;
    private setWebViewClient setLayoutDirection;
    private LayerDrawable setMinAndMaxProgress;
    setWebViewClient setNavigationOnClickListener;
    Drawable setOnLongClickListener;
    ColorStateList setTextAlignment;
    ColorStateList setUiOptions;
    int setUnboundedRipple;
    Drawable setX;
    int setY;
    int setZ;
    final Rect setOnNavigationItemSelectedListener = new Rect();
    boolean setCenterIfNoTextEnabled = false;

    static {
        setMaxEms = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public setErrorIconOnLongClickListener(setKeyListener setkeylistener, AttributeSet attributeSet, int i, int i2) {
        this.setChipCornerRadius = setkeylistener;
        setWebViewClient setwebviewclient = new setWebViewClient(setkeylistener.getContext(), attributeSet, i, i2);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setwebviewclient;
        setwebviewclient.setX(setkeylistener.getContext());
        setwebviewclient.setIconSize();
        setScrollBarDefaultDelayBeforeFade.setY sety = new setScrollBarDefaultDelayBeforeFade.setY(setwebviewclient.setChipIconTintResource.setTextAlignment);
        TypedArray obtainStyledAttributes = setkeylistener.getContext().obtainStyledAttributes(attributeSet, setIconTint.setIconTintList.setNavigationOnClickListener, i, R.style._res_0x7f15010e);
        if (obtainStyledAttributes.hasValue(3)) {
            float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
            sety.setNavigationOnClickListener = new setActionBarVisibilityCallback(dimension);
            sety.ViewPager$SavedState$1 = new setActionBarVisibilityCallback(dimension);
            sety.setIconTintList = new setActionBarVisibilityCallback(dimension);
            sety.setY = new setActionBarVisibilityCallback(dimension);
        }
        this.setLayoutAnimation = new setWebViewClient();
        setX(new setScrollBarDefaultDelayBeforeFade(sety, (byte) 0));
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX() {
        int layoutAnimation = (int) ((setTextAlignment() || setIconTintList() ? setLayoutAnimation() : 0.0f) - setUnboundedRipple());
        this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0(this.setOnNavigationItemSelectedListener.left + layoutAnimation, this.setOnNavigationItemSelectedListener.top + layoutAnimation, this.setOnNavigationItemSelectedListener.right + layoutAnimation, this.setOnNavigationItemSelectedListener.bottom + layoutAnimation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = setEnsureMinTouchTargetSize.setNavigationOnClickListener(drawable).mutate();
            this.setX = mutate;
            setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(mutate, this.setUiOptions);
            boolean isChecked = this.setChipCornerRadius.isChecked();
            Drawable drawable2 = this.setX;
            if (drawable2 != null) {
                drawable2.setAlpha(isChecked ? 255 : 0);
            }
        } else {
            this.setX = setMaxEms;
        }
        LayerDrawable layerDrawable = this.setMinAndMaxProgress;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.res_0x7f0a013b, this.setX);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int x;
        int i9;
        int i10;
        if (this.setMinAndMaxProgress != null) {
            if (this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1) {
                i3 = (int) Math.ceil(setNavigationOnClickListener() * 2.0f);
                i4 = (int) Math.ceil(setUiOptions() * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            if ((this.setY & 8388613) == 8388613) {
                i5 = ((i - this.MenuHostHelper$$ExternalSyntheticLambda0) - this.setUnboundedRipple) - i4;
            } else {
                i5 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            }
            if ((this.setY & 80) == 80) {
                i6 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            } else {
                i6 = ((i2 - this.MenuHostHelper$$ExternalSyntheticLambda0) - this.setUnboundedRipple) - i3;
            }
            int i11 = i6;
            if ((this.setY & 8388613) == 8388613) {
                i7 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            } else {
                i7 = ((i - this.MenuHostHelper$$ExternalSyntheticLambda0) - this.setUnboundedRipple) - i4;
            }
            if ((this.setY & 80) == 80) {
                i8 = ((i2 - this.MenuHostHelper$$ExternalSyntheticLambda0) - this.setUnboundedRipple) - i3;
            } else {
                i8 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            }
            x = setBaselineAlignBottom.setX.setX(this.setChipCornerRadius);
            if (x != 1) {
                i10 = i7;
                i9 = i5;
            } else {
                i9 = i7;
                i10 = i5;
            }
            this.setMinAndMaxProgress.setLayerInset(2, i9, i8, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        this.setIconSize = setscrollbardefaultdelaybeforefade;
        this.MenuHostHelper$$ExternalSyntheticLambda1.setShapeAppearanceModel(setscrollbardefaultdelaybeforefade);
        setWebViewClient setwebviewclient = this.MenuHostHelper$$ExternalSyntheticLambda1;
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = setwebviewclient.setChipIconTintResource.setTextAlignment;
        setwebviewclient.FragmentStateAdapter$2.set(setwebviewclient.getBounds());
        setwebviewclient.FragmentStateAdapter$5 = !setscrollbardefaultdelaybeforefade2.setIconTintList(setwebviewclient.FragmentStateAdapter$2);
        setWebViewClient setwebviewclient2 = this.setLayoutAnimation;
        if (setwebviewclient2 != null) {
            setwebviewclient2.setShapeAppearanceModel(setscrollbardefaultdelaybeforefade);
        }
        setWebViewClient setwebviewclient3 = this.setNavigationOnClickListener;
        if (setwebviewclient3 != null) {
            setwebviewclient3.setShapeAppearanceModel(setscrollbardefaultdelaybeforefade);
        }
        setWebViewClient setwebviewclient4 = this.setLayoutDirection;
        if (setwebviewclient4 != null) {
            setwebviewclient4.setShapeAppearanceModel(setscrollbardefaultdelaybeforefade);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable setY(Drawable drawable) {
        int i;
        int i2;
        if (this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1) {
            int ceil = (int) Math.ceil(setNavigationOnClickListener());
            i = (int) Math.ceil(setUiOptions());
            i2 = ceil;
        } else {
            i = 0;
            i2 = 0;
        }
        return new InsetDrawable(drawable, i, i2, i, i2) { // from class: o.setErrorIconOnLongClickListener.1
            @Override // android.graphics.drawable.Drawable
            public final int getMinimumHeight() {
                return -1;
            }

            @Override // android.graphics.drawable.Drawable
            public final int getMinimumWidth() {
                return -1;
            }

            @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
            public final boolean getPadding(Rect rect) {
                return false;
            }
        };
    }

    private float setNavigationOnClickListener() {
        return (setScrimVisibleHeightTrigger.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(this.setChipCornerRadius.setX) * 1.5f) + (setIconTintList() ? setLayoutAnimation() : 0.0f);
    }

    private float setUiOptions() {
        return setScrimVisibleHeightTrigger.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(this.setChipCornerRadius.setX) + (setIconTintList() ? setLayoutAnimation() : 0.0f);
    }

    private float setUnboundedRipple() {
        if (this.setChipCornerRadius.setY && this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1) {
            return (float) ((1.0d - setTextScaleX) * this.setChipCornerRadius.setUiOptions());
        }
        return 0.0f;
    }

    private boolean setTextAlignment() {
        if (this.setChipCornerRadius.setY) {
            setWebViewClient setwebviewclient = this.MenuHostHelper$$ExternalSyntheticLambda1;
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = setwebviewclient.setChipIconTintResource.setTextAlignment;
            setwebviewclient.FragmentStateAdapter$2.set(setwebviewclient.getBounds());
            if (!setscrollbardefaultdelaybeforefade.setIconTintList(setwebviewclient.FragmentStateAdapter$2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setIconTintList() {
        if (this.setChipCornerRadius.setY) {
            setWebViewClient setwebviewclient = this.MenuHostHelper$$ExternalSyntheticLambda1;
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = setwebviewclient.setChipIconTintResource.setTextAlignment;
            setwebviewclient.FragmentStateAdapter$2.set(setwebviewclient.getBounds());
            if (setscrollbardefaultdelaybeforefade.setIconTintList(setwebviewclient.FragmentStateAdapter$2) && this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1) {
                return true;
            }
        }
        return false;
    }

    private float setLayoutAnimation() {
        float f;
        float f2;
        float f3;
        setInitialScale setinitialscale = this.setIconSize.setLayoutAnimation;
        float onLongClickListener = this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener();
        float f4 = 0.0f;
        if (setinitialscale instanceof setButtonTintList) {
            f = (float) ((1.0d - setTextScaleX) * onLongClickListener);
        } else {
            f = setinitialscale instanceof setPreferKeepClear ? onLongClickListener / 2.0f : 0.0f;
        }
        setInitialScale setinitialscale2 = this.setIconSize.setTextAlignment;
        float uiOptions = this.MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions();
        if (setinitialscale2 instanceof setButtonTintList) {
            f2 = (float) ((1.0d - setTextScaleX) * uiOptions);
        } else {
            f2 = setinitialscale2 instanceof setPreferKeepClear ? uiOptions / 2.0f : 0.0f;
        }
        float max = Math.max(f, f2);
        setInitialScale setinitialscale3 = this.setIconSize.setIconTintList;
        float navigationOnClickListener = this.MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener();
        if (setinitialscale3 instanceof setButtonTintList) {
            f3 = (float) ((1.0d - setTextScaleX) * navigationOnClickListener);
        } else {
            f3 = setinitialscale3 instanceof setPreferKeepClear ? navigationOnClickListener / 2.0f : 0.0f;
        }
        setInitialScale setinitialscale4 = this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0;
        float y = this.MenuHostHelper$$ExternalSyntheticLambda1.setY();
        if (setinitialscale4 instanceof setButtonTintList) {
            f4 = (float) ((1.0d - setTextScaleX) * y);
        } else if (setinitialscale4 instanceof setPreferKeepClear) {
            f4 = y / 2.0f;
        }
        return Math.max(max, Math.max(f3, f4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.ViewPager$SavedState$1 == null) {
            this.ViewPager$SavedState$1 = setOnLongClickListener();
        }
        if (this.setMinAndMaxProgress == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.ViewPager$SavedState$1, this.setLayoutAnimation, this.setX});
            this.setMinAndMaxProgress = layerDrawable;
            layerDrawable.setId(2, R.id.res_0x7f0a013b);
        }
        return this.setMinAndMaxProgress;
    }

    private Drawable setOnLongClickListener() {
        if (setChipText.MenuHostHelper$$ExternalSyntheticLambda0) {
            this.setNavigationOnClickListener = new setWebViewClient(this.setIconSize);
            return new RippleDrawable(this.setTextAlignment, null, this.setNavigationOnClickListener);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        setWebViewClient setwebviewclient = new setWebViewClient(this.setIconSize);
        this.setLayoutDirection = setwebviewclient;
        ColorStateList colorStateList = this.setTextAlignment;
        if (setwebviewclient.setChipIconTintResource.setX != colorStateList) {
            setwebviewclient.setChipIconTintResource.setX = colorStateList;
            setwebviewclient.onStateChange(setwebviewclient.getState());
        }
        stateListDrawable.addState(new int[]{16842919}, this.setLayoutDirection);
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY() {
        ColorStateList colorStateList;
        Drawable drawable;
        if (setChipText.MenuHostHelper$$ExternalSyntheticLambda0 && (drawable = this.ViewPager$SavedState$1) != null) {
            ((RippleDrawable) drawable).setColor(this.setTextAlignment);
            return;
        }
        setWebViewClient setwebviewclient = this.setLayoutDirection;
        if (setwebviewclient == null || setwebviewclient.setChipIconTintResource.setX == (colorStateList = this.setTextAlignment)) {
            return;
        }
        setwebviewclient.setChipIconTintResource.setX = colorStateList;
        setwebviewclient.onStateChange(setwebviewclient.getState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        if (!this.setCenterIfNoTextEnabled) {
            this.setChipCornerRadius.setY(setY(this.MenuHostHelper$$ExternalSyntheticLambda1));
        }
        this.setChipCornerRadius.setForeground(setY(this.setOnLongClickListener));
    }
}