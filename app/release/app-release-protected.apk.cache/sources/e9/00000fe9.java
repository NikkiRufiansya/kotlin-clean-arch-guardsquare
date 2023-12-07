package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setSubtitle$MenuHostHelper$$ExternalSyntheticLambda0 extends setAllowClickWhenDisabled {
    final /* synthetic */ setSubtitle MenuHostHelper$$ExternalSyntheticLambda1;
    float setX;
    float setY = 0.0f;
    float setIconTintList = 0.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setSubtitle$MenuHostHelper$$ExternalSyntheticLambda0(setSubtitle setsubtitle) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setsubtitle;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        float f3;
        float f4 = this.setY;
        if (f4 > 0.0f) {
            float f5 = this.setX;
            float f6 = f4 / f5;
            if (f6 < f) {
                f = f6;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius = f4 - (f5 * f);
            f2 = (this.setY * f) - (((this.setX * f) * f) / 2.0f);
            f3 = this.setIconTintList;
        } else {
            float f7 = this.setX;
            float f8 = (-f4) / f7;
            if (f8 < f) {
                f = f8;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius = f4 + (f7 * f);
            f2 = (this.setY * f) + (((this.setX * f) * f) / 2.0f);
            f3 = this.setIconTintList;
        }
        return f2 + f3;
    }

    @Override // o.setAllowClickWhenDisabled
    public final float MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius;
    }
}