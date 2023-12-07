package o;

/* loaded from: classes.dex */
public final class setTextInputAccessibilityDelegate extends setBackground implements Cloneable {
    public float MenuHostHelper$$ExternalSyntheticLambda0;
    public float MenuHostHelper$$ExternalSyntheticLambda1;
    public float setIconTintList;
    public float setOnLongClickListener;
    public float setX;
    public float setY = -1.0f;

    public setTextInputAccessibilityDelegate(float f, float f2, float f3) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = f;
        this.setOnLongClickListener = f2;
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.setX = f3;
        this.setIconTintList = 0.0f;
    }

    @Override // o.setBackground
    public final void setIconTintList(float f, float f2, float f3, setBoxStrokeColorStateList setboxstrokecolorstatelist) {
        float f4;
        float f5;
        float f6 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (f6 == 0.0f) {
            setboxstrokecolorstatelist.setX(f, 0.0f);
            return;
        }
        float f7 = ((this.MenuHostHelper$$ExternalSyntheticLambda1 * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.setOnLongClickListener;
        float f9 = f2 + this.setIconTintList;
        float f10 = (this.setX * f3) + ((1.0f - f3) * f7);
        if (f10 / f7 >= 1.0f) {
            setboxstrokecolorstatelist.setX(f, 0.0f);
            return;
        }
        float f11 = this.setY;
        float f12 = f11 * f3;
        boolean z = f11 == -1.0f || Math.abs((f11 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = f10;
            f5 = 0.0f;
        } else {
            f5 = 1.75f;
            f4 = 0.0f;
        }
        float f13 = f7 + f8;
        float f14 = f4 + f8;
        float sqrt = (float) Math.sqrt((f13 * f13) - (f14 * f14));
        float f15 = f9 - sqrt;
        float f16 = f9 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f14));
        float f17 = (90.0f - degrees) + f5;
        setboxstrokecolorstatelist.setX(f15, 0.0f);
        float f18 = f8 * 2.0f;
        setboxstrokecolorstatelist.setY(f15 - f8, 0.0f, f15 + f8, f18, 270.0f, degrees);
        if (z) {
            setboxstrokecolorstatelist.setY(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f17, (f17 * 2.0f) - 180.0f);
        } else {
            float f19 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            float f20 = f12 * 2.0f;
            float f21 = f9 - f7;
            float f22 = f12 + f19;
            setboxstrokecolorstatelist.setY(f21, -f22, f21 + f19 + f20, f22, 180.0f - f17, ((f17 * 2.0f) - 180.0f) / 2.0f);
            float f23 = f9 + f7;
            float f24 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            setboxstrokecolorstatelist.setX(f23 - ((f24 / 2.0f) + f12), f24 + f12);
            float f25 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            float f26 = f12 + f25;
            setboxstrokecolorstatelist.setY(f23 - (f20 + f25), -f26, f23, f26, 90.0f, f17 - 90.0f);
        }
        setboxstrokecolorstatelist.setY(f16 - f8, 0.0f, f16 + f8, f18, 270.0f - degrees, degrees);
        setboxstrokecolorstatelist.setX(f, 0.0f);
    }
}