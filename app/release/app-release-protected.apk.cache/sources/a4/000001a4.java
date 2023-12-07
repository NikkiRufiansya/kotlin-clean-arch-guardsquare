package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FirebaseInstallationsKtxRegistrar {
    static final FirebaseInstallationsKtxRegistrar setY;
    final float MenuHostHelper$$ExternalSyntheticLambda0;
    final float MenuHostHelper$$ExternalSyntheticLambda1;
    final float setIconSize;
    final float setIconTintList;
    final float setLayoutAnimation;
    final float setNavigationOnClickListener;
    final float setOnLongClickListener;
    final float[] setUiOptions;
    final float setUnboundedRipple = 1.0f;
    final float setX;

    static {
        float[] fArr = setScale.MenuHostHelper$$ExternalSyntheticLambda1;
        float x = (float) ((setScale.setX(50.0f) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = setScale.setX;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0];
        float f3 = fArr[1];
        float f4 = fArr3[1];
        float f5 = fArr[2];
        float f6 = (f2 * f) + (f4 * f3) + (fArr3[2] * f5);
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[0] * f) + (fArr4[1] * f3) + (fArr4[2] * f5);
        float[] fArr5 = fArr2[2];
        float f8 = (f * fArr5[0]) + (f3 * fArr5[1]) + (f5 * fArr5[2]);
        float iconTintList = setScale.setIconTintList(0.59f, 0.69f, 1.0000002f);
        float exp = 1.0f - (((float) Math.exp(((-x) - 42.0f) / 92.0f)) * 0.2777778f);
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp};
        float f9 = 1.0f / ((5.0f * x) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float cbrt = (0.1f * f11 * f11 * ((float) Math.cbrt(x * 5.0d))) + (f10 * x);
        float x2 = setScale.setX(50.0f) / fArr[1];
        double d2 = x2;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f8) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f6) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f7) / 100.0d, 0.42d), pow2};
        float f12 = fArr7[0];
        float f13 = (f12 * 400.0f) / (f12 + 27.13f);
        float f14 = fArr7[1];
        setY = new FirebaseInstallationsKtxRegistrar(x2, ((f13 * 2.0f) + ((f14 * 400.0f) / (f14 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, iconTintList, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), ((float) Math.sqrt(d2)) + 1.48f);
    }

    private FirebaseInstallationsKtxRegistrar(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.setOnLongClickListener = f;
        this.setIconTintList = f2;
        this.setLayoutAnimation = f3;
        this.setNavigationOnClickListener = f4;
        this.setX = f5;
        this.setUiOptions = fArr;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = f7;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = f8;
        this.setIconSize = f9;
    }
}