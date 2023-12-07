package o;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setOnItemSelectedListener$MenuHostHelper$$ExternalSyntheticLambda0 {
    private final int ViewPager$SavedState$1;
    private setKeepScreenOn setCenterIfNoTextEnabled;
    private long setChipCornerRadius;
    private int setIconSize;
    setIconStartPadding setIconTintList;
    private Interpolator setLayoutAnimation;
    private long setNavigationOnClickListener;
    private int setOnLongClickListener;
    private float setTextAlignment;
    private final int setUiOptions;
    private float setUnboundedRipple;
    private boolean setX;
    private setUnboundedRippleResource setY = new setUnboundedRippleResource();
    boolean MenuHostHelper$$ExternalSyntheticLambda0 = false;
    Rect MenuHostHelper$$ExternalSyntheticLambda1 = new Rect();

    /* JADX INFO: Access modifiers changed from: package-private */
    public setOnItemSelectedListener$MenuHostHelper$$ExternalSyntheticLambda0(setKeepScreenOn setkeepscreenon, setIconStartPadding seticonstartpadding, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
        this.setX = false;
        this.setCenterIfNoTextEnabled = setkeepscreenon;
        this.setIconTintList = seticonstartpadding;
        this.setOnLongClickListener = i;
        this.setIconSize = i2;
        long nanoTime = System.nanoTime();
        this.setChipCornerRadius = nanoTime;
        this.setNavigationOnClickListener = nanoTime;
        setKeepScreenOn setkeepscreenon2 = this.setCenterIfNoTextEnabled;
        if (setkeepscreenon2.setX == null) {
            setkeepscreenon2.setX = new ArrayList<>();
        }
        setkeepscreenon2.setX.add(this);
        this.setLayoutAnimation = interpolator;
        this.ViewPager$SavedState$1 = i4;
        this.setUiOptions = i5;
        if (i3 == 3) {
            this.setX = true;
        }
        this.setUnboundedRipple = i == 0 ? Float.MAX_VALUE : 1.0f / i;
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            setIconTintList();
        } else {
            setX();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY() {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        int i = this.setIconSize;
        if (i != -1) {
            this.setUnboundedRipple = i == 0 ? Float.MAX_VALUE : 1.0f / i;
        }
        this.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0.invalidate();
        this.setNavigationOnClickListener = System.nanoTime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList() {
        long nanoTime = System.nanoTime();
        long j = this.setNavigationOnClickListener;
        this.setNavigationOnClickListener = nanoTime;
        float f = this.setTextAlignment - (((float) ((nanoTime - j) * 1.0E-6d)) * this.setUnboundedRipple);
        this.setTextAlignment = f;
        if (f < 0.0f) {
            this.setTextAlignment = 0.0f;
        }
        Interpolator interpolator = this.setLayoutAnimation;
        float interpolation = interpolator == null ? this.setTextAlignment : interpolator.getInterpolation(this.setTextAlignment);
        setIconStartPadding seticonstartpadding = this.setIconTintList;
        boolean y = seticonstartpadding.setY(seticonstartpadding.setTextAppearanceResource, interpolation, nanoTime, this.setY);
        if (this.setTextAlignment <= 0.0f) {
            if (this.ViewPager$SavedState$1 != -1) {
                this.setIconTintList.setTextAppearanceResource.setTag(this.ViewPager$SavedState$1, Long.valueOf(System.nanoTime()));
            }
            if (this.setUiOptions != -1) {
                this.setIconTintList.setTextAppearanceResource.setTag(this.setUiOptions, null);
            }
            this.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda1.add(this);
        }
        if (this.setTextAlignment > 0.0f || y) {
            this.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX() {
        long nanoTime = System.nanoTime();
        long j = this.setNavigationOnClickListener;
        this.setNavigationOnClickListener = nanoTime;
        float f = this.setTextAlignment + (((float) ((nanoTime - j) * 1.0E-6d)) * this.setUnboundedRipple);
        this.setTextAlignment = f;
        if (f >= 1.0f) {
            this.setTextAlignment = 1.0f;
        }
        Interpolator interpolator = this.setLayoutAnimation;
        float interpolation = interpolator == null ? this.setTextAlignment : interpolator.getInterpolation(this.setTextAlignment);
        setIconStartPadding seticonstartpadding = this.setIconTintList;
        boolean y = seticonstartpadding.setY(seticonstartpadding.setTextAppearanceResource, interpolation, nanoTime, this.setY);
        if (this.setTextAlignment >= 1.0f) {
            if (this.ViewPager$SavedState$1 != -1) {
                this.setIconTintList.setTextAppearanceResource.setTag(this.ViewPager$SavedState$1, Long.valueOf(System.nanoTime()));
            }
            if (this.setUiOptions != -1) {
                this.setIconTintList.setTextAppearanceResource.setTag(this.setUiOptions, null);
            }
            if (!this.setX) {
                this.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda1.add(this);
            }
        }
        if (this.setTextAlignment < 1.0f || y) {
            this.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0.invalidate();
        }
    }
}