package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import o.BackStackState$1;

/* loaded from: classes.dex */
public class setScrimVisibleHeightTrigger extends FrameLayout {
    public static final setFrame MenuHostHelper$$ExternalSyntheticLambda0;
    private static final int[] setOnLongClickListener = {16842801};
    public boolean MenuHostHelper$$ExternalSyntheticLambda1;
    final Rect setIconTintList;
    int setLayoutAnimation;
    final Rect setUiOptions;
    int setUnboundedRipple;
    public final setErrorShown setX;
    public boolean setY;

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    static {
        AbtRegistrar abtRegistrar = new AbtRegistrar();
        MenuHostHelper$$ExternalSyntheticLambda0 = abtRegistrar;
        abtRegistrar.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    public setScrimVisibleHeightTrigger(Context context) {
        this(context, null);
    }

    public setScrimVisibleHeightTrigger(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f04008e);
    }

    public setScrimVisibleHeightTrigger(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.setIconTintList = rect;
        this.setUiOptions = new Rect();
        setErrorShown seterrorshown = new setErrorShown() { // from class: o.setScrimVisibleHeightTrigger.4
            private Drawable setX;

            @Override // o.setErrorShown
            public final void MenuHostHelper$$ExternalSyntheticLambda0(Drawable drawable) {
                this.setX = drawable;
                setScrimVisibleHeightTrigger.this.setBackgroundDrawable(drawable);
            }

            @Override // o.setErrorShown
            public final boolean setY() {
                return setScrimVisibleHeightTrigger.this.MenuHostHelper$$ExternalSyntheticLambda1;
            }

            @Override // o.setErrorShown
            public final boolean setX() {
                return setScrimVisibleHeightTrigger.this.setY;
            }

            @Override // o.setErrorShown
            public final void setIconTintList(int i3, int i4, int i5, int i6) {
                setScrimVisibleHeightTrigger.this.setUiOptions.set(i3, i4, i5, i6);
                setScrimVisibleHeightTrigger setscrimvisibleheighttrigger = setScrimVisibleHeightTrigger.this;
                setScrimVisibleHeightTrigger.super.setPadding(i3 + setscrimvisibleheighttrigger.setIconTintList.left, i4 + setScrimVisibleHeightTrigger.this.setIconTintList.top, i5 + setScrimVisibleHeightTrigger.this.setIconTintList.right, i6 + setScrimVisibleHeightTrigger.this.setIconTintList.bottom);
            }

            @Override // o.setErrorShown
            public final Drawable MenuHostHelper$$ExternalSyntheticLambda0() {
                return this.setX;
            }

            @Override // o.setErrorShown
            public final View MenuHostHelper$$ExternalSyntheticLambda1() {
                return setScrimVisibleHeightTrigger.this;
            }
        };
        this.setX = seterrorshown;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BackStackState$1.setY.MenuHostHelper$$ExternalSyntheticLambda1, i, R.style._res_0x7f15010e);
        if (obtainStyledAttributes.hasValue(BackStackState$1.setY.setY)) {
            valueOf = obtainStyledAttributes.getColorStateList(BackStackState$1.setY.setY);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(setOnLongClickListener);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                getResources();
                i2 = -1;
            } else {
                getResources();
                i2 = -12434878;
            }
            valueOf = ColorStateList.valueOf(i2);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(BackStackState$1.setY.MenuHostHelper$$ExternalSyntheticLambda0, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(BackStackState$1.setY.setUnboundedRipple, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(BackStackState$1.setY.setUiOptions, 0.0f);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getBoolean(BackStackState$1.setY.setOnLongClickListener, false);
        this.setY = obtainStyledAttributes.getBoolean(BackStackState$1.setY.setLayoutAnimation, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(BackStackState$1.setY.setNavigationOnClickListener, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(BackStackState$1.setY.setChipCornerRadius, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(BackStackState$1.setY.setTextAlignment, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(BackStackState$1.setY.setCenterIfNoTextEnabled, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(BackStackState$1.setY.setIconSize, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.setUnboundedRipple = obtainStyledAttributes.getDimensionPixelSize(BackStackState$1.setY.setX, 0);
        this.setLayoutAnimation = obtainStyledAttributes.getDimensionPixelSize(BackStackState$1.setY.setIconTintList, 0);
        obtainStyledAttributes.recycle();
        MenuHostHelper$$ExternalSyntheticLambda0.setY(seterrorshown, context, colorStateList, dimension, dimension2, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != z) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
            MenuHostHelper$$ExternalSyntheticLambda0.setOnLongClickListener(this.setX);
        }
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.setIconTintList.set(i, i2, i3, i4);
        MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple(this.setX);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        setFrame setframe = MenuHostHelper$$ExternalSyntheticLambda0;
        if (!(setframe instanceof AbtRegistrar)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(setframe.MenuHostHelper$$ExternalSyntheticLambda1(this.setX)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(setframe.setY(this.setX)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.setUnboundedRipple = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.setLayoutAnimation = i;
        super.setMinimumHeight(i);
    }

    public void setCardBackgroundColor(int i) {
        MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(this.setX, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(this.setX, colorStateList);
    }

    public ColorStateList f_() {
        return MenuHostHelper$$ExternalSyntheticLambda0.setX(this.setX);
    }

    public int h_() {
        return this.setIconTintList.left;
    }

    public int i_() {
        return this.setIconTintList.right;
    }

    public int j_() {
        return this.setIconTintList.top;
    }

    public int g_() {
        return this.setIconTintList.bottom;
    }

    public void setRadius(float f) {
        MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(this.setX, f);
    }

    public float setOnLongClickListener() {
        return MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener(this.setX);
    }

    public void setCardElevation(float f) {
        MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(this.setX, f);
    }

    public void setMaxCardElevation(float f) {
        MenuHostHelper$$ExternalSyntheticLambda0.setX(this.setX, f);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.setY) {
            this.setY = z;
            MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions(this.setX);
        }
    }
}