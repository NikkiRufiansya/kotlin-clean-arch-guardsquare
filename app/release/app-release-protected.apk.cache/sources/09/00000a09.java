package o;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public class setChildIndicatorBoundsRelative<T> {
    private final setBoxStrokeErrorColor MenuHostHelper$$ExternalSyntheticLambda0;
    public int MenuHostHelper$$ExternalSyntheticLambda1;
    private float ViewPager$SavedState$1;
    private float setCenterIfNoTextEnabled;
    public float setIconSize;
    public T setIconTintList;
    public PointF setLayoutAnimation;
    public PointF setNavigationOnClickListener;
    public final float setOnLongClickListener;
    public int setTextAlignment;
    public final T setUiOptions;
    public final Interpolator setUnboundedRipple;
    public Float setX;
    public float setY;

    public setChildIndicatorBoundsRelative(setBoxStrokeErrorColor setboxstrokeerrorcolor, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.setIconSize = -3987645.8f;
        this.setY = -3987645.8f;
        this.setTextAlignment = 784923401;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 784923401;
        this.setCenterIfNoTextEnabled = Float.MIN_VALUE;
        this.ViewPager$SavedState$1 = Float.MIN_VALUE;
        this.setNavigationOnClickListener = null;
        this.setLayoutAnimation = null;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setboxstrokeerrorcolor;
        this.setUiOptions = t;
        this.setIconTintList = t2;
        this.setUnboundedRipple = interpolator;
        this.setOnLongClickListener = f;
        this.setX = f2;
    }

    public setChildIndicatorBoundsRelative(T t) {
        this.setIconSize = -3987645.8f;
        this.setY = -3987645.8f;
        this.setTextAlignment = 784923401;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 784923401;
        this.setCenterIfNoTextEnabled = Float.MIN_VALUE;
        this.ViewPager$SavedState$1 = Float.MIN_VALUE;
        this.setNavigationOnClickListener = null;
        this.setLayoutAnimation = null;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
        this.setUiOptions = t;
        this.setIconTintList = t;
        this.setUnboundedRipple = null;
        this.setOnLongClickListener = Float.MIN_VALUE;
        this.setX = Float.valueOf(Float.MAX_VALUE);
    }

    public final float setIconTintList() {
        setBoxStrokeErrorColor setboxstrokeerrorcolor = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setboxstrokeerrorcolor == null) {
            return 0.0f;
        }
        if (this.setCenterIfNoTextEnabled == Float.MIN_VALUE) {
            float f = this.setOnLongClickListener - setboxstrokeerrorcolor.setChipCornerRadius;
            setBoxStrokeErrorColor setboxstrokeerrorcolor2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            this.setCenterIfNoTextEnabled = f / (setboxstrokeerrorcolor2.MenuHostHelper$$ExternalSyntheticLambda1 - setboxstrokeerrorcolor2.setChipCornerRadius);
        }
        return this.setCenterIfNoTextEnabled;
    }

    public final float MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            return 1.0f;
        }
        if (this.ViewPager$SavedState$1 == Float.MIN_VALUE) {
            if (this.setX == null) {
                this.ViewPager$SavedState$1 = 1.0f;
            } else {
                float iconTintList = setIconTintList();
                float floatValue = this.setX.floatValue() - this.setOnLongClickListener;
                setBoxStrokeErrorColor setboxstrokeerrorcolor = this.MenuHostHelper$$ExternalSyntheticLambda0;
                this.ViewPager$SavedState$1 = iconTintList + (floatValue / (setboxstrokeerrorcolor.MenuHostHelper$$ExternalSyntheticLambda1 - setboxstrokeerrorcolor.setChipCornerRadius));
            }
        }
        return this.ViewPager$SavedState$1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Keyframe{startValue=");
        sb.append(this.setUiOptions);
        sb.append(", endValue=");
        sb.append(this.setIconTintList);
        sb.append(", startFrame=");
        sb.append(this.setOnLongClickListener);
        sb.append(", endFrame=");
        sb.append(this.setX);
        sb.append(", interpolator=");
        sb.append(this.setUnboundedRipple);
        sb.append('}');
        return sb.toString();
    }
}