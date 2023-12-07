package o;

/* loaded from: classes.dex */
public final class NavigationBarView$SavedState$1 implements setItemRippleColor {
    public float MenuHostHelper$$ExternalSyntheticLambda0;
    private int MenuHostHelper$$ExternalSyntheticLambda1;
    private String ViewPager$SavedState$1;
    private float setCenterIfNoTextEnabled;
    private float setChipCornerRadius;
    private float setIconSize;
    private float setLayoutAnimation;
    private float setNavigationOnClickListener;
    private float setOnLongClickListener;
    private float setTextAlignment;
    private float setUiOptions;
    private float setUnboundedRipple;
    private float setY;
    public boolean setIconTintList = false;
    public boolean setX = false;

    private float MenuHostHelper$$ExternalSyntheticLambda1(float f) {
        float f2 = this.setNavigationOnClickListener;
        if (f <= f2) {
            float f3 = this.setUnboundedRipple;
            return f3 + (((this.setIconSize - f3) * f) / f2);
        }
        int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (i == 1) {
            return 0.0f;
        }
        float f4 = f - f2;
        float f5 = this.setLayoutAnimation;
        if (f4 < f5) {
            float f6 = this.setIconSize;
            return f6 + (((this.setChipCornerRadius - f6) * f4) / f5);
        } else if (i == 2) {
            return this.setUiOptions;
        } else {
            float f7 = f4 - f5;
            float f8 = this.setTextAlignment;
            if (f7 < f8) {
                float f9 = this.setChipCornerRadius;
                return f9 - ((f7 * f9) / f8);
            }
            return this.setCenterIfNoTextEnabled;
        }
    }

    @Override // o.setItemRippleColor
    public final float setY() {
        return this.setIconTintList ? -MenuHostHelper$$ExternalSyntheticLambda1(this.setY) : MenuHostHelper$$ExternalSyntheticLambda1(this.setY);
    }

    public final void setIconTintList(float f, float f2, float f3, float f4, float f5) {
        this.setX = false;
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.setUnboundedRipple = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float sqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (sqrt < f4) {
                this.ViewPager$SavedState$1 = "backward accelerate, decelerate";
                this.MenuHostHelper$$ExternalSyntheticLambda1 = 2;
                this.setUnboundedRipple = f;
                this.setIconSize = sqrt;
                this.setChipCornerRadius = 0.0f;
                float f8 = (sqrt - f) / f3;
                this.setNavigationOnClickListener = f8;
                this.setLayoutAnimation = sqrt / f3;
                this.setOnLongClickListener = ((f + sqrt) * f8) / 2.0f;
                this.setUiOptions = f2;
                this.setCenterIfNoTextEnabled = f2;
                return;
            }
            this.ViewPager$SavedState$1 = "backward accelerate cruse decelerate";
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 3;
            this.setUnboundedRipple = f;
            this.setIconSize = f4;
            this.setChipCornerRadius = f4;
            float f9 = (f4 - f) / f3;
            this.setNavigationOnClickListener = f9;
            float f10 = f4 / f3;
            this.setTextAlignment = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.setLayoutAnimation = ((f2 - f11) - f12) / f4;
            this.setOnLongClickListener = f11;
            this.setUiOptions = f2 - f12;
            this.setCenterIfNoTextEnabled = f2;
        } else if (f7 >= f2) {
            this.ViewPager$SavedState$1 = "hard stop";
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 1;
            this.setUnboundedRipple = f;
            this.setIconSize = 0.0f;
            this.setOnLongClickListener = f2;
            this.setNavigationOnClickListener = (2.0f * f2) / f;
        } else {
            float f13 = f2 - f7;
            float f14 = f13 / f;
            if (f14 + f6 < f5) {
                this.ViewPager$SavedState$1 = "cruse decelerate";
                this.MenuHostHelper$$ExternalSyntheticLambda1 = 2;
                this.setUnboundedRipple = f;
                this.setIconSize = f;
                this.setChipCornerRadius = 0.0f;
                this.setOnLongClickListener = f13;
                this.setUiOptions = f2;
                this.setNavigationOnClickListener = f14;
                this.setLayoutAnimation = f6;
                return;
            }
            float sqrt2 = (float) Math.sqrt((f3 * f2) + ((f * f) / 2.0f));
            float f15 = (sqrt2 - f) / f3;
            this.setNavigationOnClickListener = f15;
            float f16 = sqrt2 / f3;
            this.setLayoutAnimation = f16;
            if (sqrt2 < f4) {
                this.ViewPager$SavedState$1 = "accelerate decelerate";
                this.MenuHostHelper$$ExternalSyntheticLambda1 = 2;
                this.setUnboundedRipple = f;
                this.setIconSize = sqrt2;
                this.setChipCornerRadius = 0.0f;
                this.setNavigationOnClickListener = f15;
                this.setLayoutAnimation = f16;
                this.setOnLongClickListener = ((f + sqrt2) * f15) / 2.0f;
                this.setUiOptions = f2;
                return;
            }
            this.ViewPager$SavedState$1 = "accelerate cruse decelerate";
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 3;
            this.setUnboundedRipple = f;
            this.setIconSize = f4;
            this.setChipCornerRadius = f4;
            float f17 = (f4 - f) / f3;
            this.setNavigationOnClickListener = f17;
            float f18 = f4 / f3;
            this.setTextAlignment = f18;
            float f19 = ((f + f4) * f17) / 2.0f;
            float f20 = (f18 * f4) / 2.0f;
            this.setLayoutAnimation = ((f2 - f19) - f20) / f4;
            this.setOnLongClickListener = f19;
            this.setUiOptions = f2 - f20;
            this.setCenterIfNoTextEnabled = f2;
        }
    }

    @Override // o.setItemRippleColor
    public final float setIconTintList(float f) {
        float f2;
        this.setX = false;
        float f3 = this.setNavigationOnClickListener;
        if (f <= f3) {
            float f4 = this.setUnboundedRipple;
            f2 = (f4 * f) + ((((this.setIconSize - f4) * f) * f) / (f3 * 2.0f));
        } else {
            int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (i == 1) {
                f2 = this.setOnLongClickListener;
            } else {
                float f5 = f - f3;
                float f6 = this.setLayoutAnimation;
                if (f5 < f6) {
                    float f7 = this.setOnLongClickListener;
                    float f8 = this.setIconSize;
                    f2 = f7 + (f8 * f5) + ((((this.setChipCornerRadius - f8) * f5) * f5) / (f6 * 2.0f));
                } else if (i == 2) {
                    f2 = this.setUiOptions;
                } else {
                    float f9 = f5 - f6;
                    float f10 = this.setTextAlignment;
                    if (f9 <= f10) {
                        float f11 = this.setUiOptions;
                        float f12 = this.setChipCornerRadius * f9;
                        f2 = (f11 + f12) - ((f12 * f9) / (f10 * 2.0f));
                    } else {
                        this.setX = true;
                        f2 = this.setCenterIfNoTextEnabled;
                    }
                }
            }
        }
        this.setY = f;
        return this.setIconTintList ? this.MenuHostHelper$$ExternalSyntheticLambda0 - f2 : this.MenuHostHelper$$ExternalSyntheticLambda0 + f2;
    }

    @Override // o.setItemRippleColor
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        return (this.setIconTintList ? -MenuHostHelper$$ExternalSyntheticLambda1(this.setY) : MenuHostHelper$$ExternalSyntheticLambda1(this.setY)) < 1.0E-5f && Math.abs(this.setCenterIfNoTextEnabled - this.setY) < 1.0E-5f;
    }
}