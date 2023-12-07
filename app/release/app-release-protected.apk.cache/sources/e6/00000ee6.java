package o;

/* loaded from: classes.dex */
public final class setRating implements setItemRippleColor {
    public float MenuHostHelper$$ExternalSyntheticLambda0;
    public double setLayoutAnimation;
    public float setNavigationOnClickListener;
    public double setOnLongClickListener;
    private float setTextAlignment;
    public float setUiOptions;
    public float setUnboundedRipple;
    public double setY;
    public double setX = 0.5d;
    public boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;
    public int setIconTintList = 0;

    @Override // o.setItemRippleColor
    public final float setY() {
        return 0.0f;
    }

    @Override // o.setItemRippleColor
    public final float setIconTintList(float f) {
        setRating setrating = this;
        float f2 = f;
        double d = f2 - setrating.MenuHostHelper$$ExternalSyntheticLambda0;
        double d2 = setrating.setLayoutAnimation;
        double d3 = setrating.setX;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d2 / setrating.setUiOptions) * d) * 4.0d)) + 1.0d);
        double d4 = d / sqrt;
        int i = 0;
        while (i < sqrt) {
            double d5 = setrating.setNavigationOnClickListener;
            double d6 = setrating.setOnLongClickListener;
            int i2 = sqrt;
            int i3 = i;
            double d7 = setrating.setTextAlignment;
            double d8 = setrating.setUiOptions;
            double d9 = ((((((-d2) * (d5 - d6)) - (d7 * d3)) / d8) * d4) / 2.0d) + d7;
            double d10 = ((((-((d5 + ((d4 * d9) / 2.0d)) - d6)) * d2) - (d9 * d3)) / d8) * d4;
            double d11 = d10 / 2.0d;
            float f3 = (float) (d10 + d7);
            this.setTextAlignment = f3;
            float f4 = (float) (d5 + ((d7 + d11) * d4));
            this.setNavigationOnClickListener = f4;
            int i4 = this.setIconTintList;
            if (i4 > 0) {
                if (f4 < 0.0f && (i4 & 1) == 1) {
                    this.setNavigationOnClickListener = -f4;
                    this.setTextAlignment = -f3;
                }
                float f5 = this.setNavigationOnClickListener;
                if (f5 > 1.0f && (i4 & 2) == 2) {
                    this.setNavigationOnClickListener = 2.0f - f5;
                    this.setTextAlignment = -this.setTextAlignment;
                }
            }
            i = i3 + 1;
            f2 = f;
            setrating = this;
            sqrt = i2;
        }
        setRating setrating2 = setrating;
        setrating2.MenuHostHelper$$ExternalSyntheticLambda0 = f2;
        return setrating2.setNavigationOnClickListener;
    }

    @Override // o.setItemRippleColor
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        double d = this.setNavigationOnClickListener - this.setOnLongClickListener;
        double d2 = this.setLayoutAnimation;
        double d3 = this.setTextAlignment;
        return Math.sqrt((((d3 * d3) * ((double) this.setUiOptions)) + ((d2 * d) * d)) / d2) <= ((double) this.setUnboundedRipple);
    }
}