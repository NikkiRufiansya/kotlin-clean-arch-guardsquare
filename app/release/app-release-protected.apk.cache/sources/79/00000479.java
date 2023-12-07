package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class flushPendingCommands {
    final float MenuHostHelper$$ExternalSyntheticLambda0;
    final float MenuHostHelper$$ExternalSyntheticLambda1;
    final float setIconTintList;
    private final float setNavigationOnClickListener;
    final float setOnLongClickListener;
    private final float setUiOptions;
    private final float setUnboundedRipple;
    final float setX;
    final float setY;

    private flushPendingCommands(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = f;
        this.setY = f2;
        this.setX = f3;
        this.setNavigationOnClickListener = f4;
        this.setUnboundedRipple = f5;
        this.setUiOptions = f6;
        this.setOnLongClickListener = f7;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = f8;
        this.setIconTintList = f9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static flushPendingCommands MenuHostHelper$$ExternalSyntheticLambda1(int i, FirebaseInstallationsKtxRegistrar firebaseInstallationsKtxRegistrar) {
        float pow;
        float[] MenuHostHelper$$ExternalSyntheticLambda1 = setScale.MenuHostHelper$$ExternalSyntheticLambda1(i);
        float[][] fArr = setScale.setX;
        float f = MenuHostHelper$$ExternalSyntheticLambda1[0];
        float[] fArr2 = fArr[0];
        float f2 = fArr2[0];
        float f3 = MenuHostHelper$$ExternalSyntheticLambda1[1];
        float f4 = fArr2[1];
        float f5 = MenuHostHelper$$ExternalSyntheticLambda1[2];
        float f6 = fArr2[2];
        float[] fArr3 = fArr[1];
        float f7 = fArr3[0];
        float f8 = fArr3[1];
        float f9 = fArr3[2];
        float[] fArr4 = fArr[2];
        float f10 = fArr4[0];
        float f11 = fArr4[1];
        float f12 = fArr4[2];
        float f13 = firebaseInstallationsKtxRegistrar.setUiOptions[0] * ((f2 * f) + (f4 * f3) + (f6 * f5));
        float f14 = firebaseInstallationsKtxRegistrar.setUiOptions[1] * ((f7 * f) + (f8 * f3) + (f9 * f5));
        float f15 = firebaseInstallationsKtxRegistrar.setUiOptions[2] * ((f * f10) + (f3 * f11) + (f5 * f12));
        float pow2 = (float) Math.pow((firebaseInstallationsKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1 * Math.abs(f13)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((firebaseInstallationsKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1 * Math.abs(f14)) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((firebaseInstallationsKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1 * Math.abs(f15)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f13) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f14) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f15) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f16 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d)) / 11.0f;
        float f17 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f18 = signum2 * 20.0f;
        float f19 = (((signum * 20.0f) + f18) + (21.0f * signum3)) / 20.0f;
        float f20 = (((signum * 40.0f) + f18) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f21 = atan2;
        float f22 = (3.1415927f * f21) / 180.0f;
        float pow5 = ((float) Math.pow((f20 * firebaseInstallationsKtxRegistrar.setLayoutAnimation) / firebaseInstallationsKtxRegistrar.setIconTintList, firebaseInstallationsKtxRegistrar.setX * firebaseInstallationsKtxRegistrar.setIconSize)) * 100.0f;
        float f23 = 4.0f / firebaseInstallationsKtxRegistrar.setX;
        float sqrt = (float) Math.sqrt(pow5 / 100.0f);
        float f24 = firebaseInstallationsKtxRegistrar.setIconTintList;
        float f25 = firebaseInstallationsKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0;
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, firebaseInstallationsKtxRegistrar.setOnLongClickListener), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f21) < 20.14d ? 360.0f + f21 : f21) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * firebaseInstallationsKtxRegistrar.setUnboundedRipple) * firebaseInstallationsKtxRegistrar.setNavigationOnClickListener) * ((float) Math.sqrt((f16 * f16) + (f17 * f17)))) / (f19 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        float f26 = pow6 * firebaseInstallationsKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0;
        float sqrt2 = (float) Math.sqrt((pow * firebaseInstallationsKtxRegistrar.setX) / (firebaseInstallationsKtxRegistrar.setIconTintList + 4.0f));
        float f27 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((0.0228f * f26) + 1.0f)) * 43.85965f;
        double d2 = f22;
        return new flushPendingCommands(f21, pow6, pow5, f25 * f23 * sqrt * (f24 + 4.0f), f26, sqrt2 * 50.0f, f27, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static flushPendingCommands setX(float f, float f2, float f3, FirebaseInstallationsKtxRegistrar firebaseInstallationsKtxRegistrar) {
        double d = f / 100.0d;
        float f4 = firebaseInstallationsKtxRegistrar.setIconTintList;
        float f5 = firebaseInstallationsKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0;
        float f6 = firebaseInstallationsKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0 * f2;
        float sqrt = (float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * firebaseInstallationsKtxRegistrar.setX) / (firebaseInstallationsKtxRegistrar.setIconTintList + 4.0f));
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((f6 * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new flushPendingCommands(f3, f2, f, (4.0f / firebaseInstallationsKtxRegistrar.setX) * ((float) Math.sqrt(d)) * (f4 + 4.0f) * f5, f6, sqrt * 50.0f, f7, log * ((float) Math.cos(d2)), ((float) Math.sin(d2)) * log);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int MenuHostHelper$$ExternalSyntheticLambda0(FirebaseInstallationsKtxRegistrar firebaseInstallationsKtxRegistrar) {
        float f;
        float f2 = this.setY;
        if (f2 != 0.0d) {
            float f3 = this.setX;
            if (f3 != 0.0d) {
                f = f2 / ((float) Math.sqrt(f3 / 100.0d));
                float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, firebaseInstallationsKtxRegistrar.setOnLongClickListener), 0.73d), 1.1111111111111112d);
                double d = (this.MenuHostHelper$$ExternalSyntheticLambda1 * 3.1415927f) / 180.0f;
                float f4 = firebaseInstallationsKtxRegistrar.setUnboundedRipple;
                float f5 = firebaseInstallationsKtxRegistrar.setNavigationOnClickListener;
                float pow2 = (firebaseInstallationsKtxRegistrar.setIconTintList * ((float) Math.pow(this.setX / 100.0d, (1.0d / firebaseInstallationsKtxRegistrar.setX) / firebaseInstallationsKtxRegistrar.setIconSize))) / firebaseInstallationsKtxRegistrar.setLayoutAnimation;
                float sin = (float) Math.sin(d);
                float cos = (float) Math.cos(d);
                float cos2 = (((0.305f + pow2) * 23.0f) * pow) / (((((((((float) (Math.cos(2.0d + d) + 3.8d)) * 0.25f) * 3846.1538f) * f4) * f5) * 23.0f) + ((11.0f * pow) * cos)) + ((pow * 108.0f) * sin));
                float f6 = cos * cos2;
                float f7 = cos2 * sin;
                float f8 = pow2 * 460.0f;
                float f9 = (((451.0f * f6) + f8) + (288.0f * f7)) / 1403.0f;
                float f10 = ((f8 - (891.0f * f6)) - (261.0f * f7)) / 1403.0f;
                float f11 = ((f8 - (f6 * 220.0f)) - (f7 * 6300.0f)) / 1403.0f;
                float pow3 = (float) Math.pow((float) Math.max(0.0d, (Math.abs(f9) * 27.13d) / (400.0d - Math.abs(f9))), 2.380952380952381d);
                float pow4 = (float) Math.pow((float) Math.max(0.0d, (Math.abs(f10) * 27.13d) / (400.0d - Math.abs(f10))), 2.380952380952381d);
                float signum = ((Math.signum(f9) * (100.0f / firebaseInstallationsKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1)) * pow3) / firebaseInstallationsKtxRegistrar.setUiOptions[0];
                float signum2 = ((Math.signum(f10) * (100.0f / firebaseInstallationsKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1)) * pow4) / firebaseInstallationsKtxRegistrar.setUiOptions[1];
                float signum3 = ((Math.signum(f11) * (100.0f / firebaseInstallationsKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1)) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d))) / firebaseInstallationsKtxRegistrar.setUiOptions[2];
                float[][] fArr = setScale.MenuHostHelper$$ExternalSyntheticLambda0;
                float[] fArr2 = fArr[0];
                float f12 = fArr2[0];
                float f13 = fArr2[1];
                float f14 = fArr2[2];
                float[] fArr3 = fArr[1];
                float f15 = fArr3[0];
                float f16 = fArr3[1];
                float f17 = fArr3[2];
                float[] fArr4 = fArr[2];
                return setExtended.setIconTintList((f12 * signum) + (f13 * signum2) + (f14 * signum3), (f15 * signum) + (f16 * signum2) + (f17 * signum3), (signum * fArr4[0]) + (signum2 * fArr4[1]) + (signum3 * fArr4[2]));
            }
        }
        f = 0.0f;
        float pow5 = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, firebaseInstallationsKtxRegistrar.setOnLongClickListener), 0.73d), 1.1111111111111112d);
        double d2 = (this.MenuHostHelper$$ExternalSyntheticLambda1 * 3.1415927f) / 180.0f;
        float f42 = firebaseInstallationsKtxRegistrar.setUnboundedRipple;
        float f52 = firebaseInstallationsKtxRegistrar.setNavigationOnClickListener;
        float pow22 = (firebaseInstallationsKtxRegistrar.setIconTintList * ((float) Math.pow(this.setX / 100.0d, (1.0d / firebaseInstallationsKtxRegistrar.setX) / firebaseInstallationsKtxRegistrar.setIconSize))) / firebaseInstallationsKtxRegistrar.setLayoutAnimation;
        float sin2 = (float) Math.sin(d2);
        float cos3 = (float) Math.cos(d2);
        float cos22 = (((0.305f + pow22) * 23.0f) * pow5) / (((((((((float) (Math.cos(2.0d + d2) + 3.8d)) * 0.25f) * 3846.1538f) * f42) * f52) * 23.0f) + ((11.0f * pow5) * cos3)) + ((pow5 * 108.0f) * sin2));
        float f62 = cos3 * cos22;
        float f72 = cos22 * sin2;
        float f82 = pow22 * 460.0f;
        float f92 = (((451.0f * f62) + f82) + (288.0f * f72)) / 1403.0f;
        float f102 = ((f82 - (891.0f * f62)) - (261.0f * f72)) / 1403.0f;
        float f112 = ((f82 - (f62 * 220.0f)) - (f72 * 6300.0f)) / 1403.0f;
        float pow32 = (float) Math.pow((float) Math.max(0.0d, (Math.abs(f92) * 27.13d) / (400.0d - Math.abs(f92))), 2.380952380952381d);
        float pow42 = (float) Math.pow((float) Math.max(0.0d, (Math.abs(f102) * 27.13d) / (400.0d - Math.abs(f102))), 2.380952380952381d);
        float signum4 = ((Math.signum(f92) * (100.0f / firebaseInstallationsKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1)) * pow32) / firebaseInstallationsKtxRegistrar.setUiOptions[0];
        float signum22 = ((Math.signum(f102) * (100.0f / firebaseInstallationsKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1)) * pow42) / firebaseInstallationsKtxRegistrar.setUiOptions[1];
        float signum32 = ((Math.signum(f112) * (100.0f / firebaseInstallationsKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1)) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f112) * 27.13d) / (400.0d - Math.abs(f112))), 2.380952380952381d))) / firebaseInstallationsKtxRegistrar.setUiOptions[2];
        float[][] fArr5 = setScale.MenuHostHelper$$ExternalSyntheticLambda0;
        float[] fArr22 = fArr5[0];
        float f122 = fArr22[0];
        float f132 = fArr22[1];
        float f142 = fArr22[2];
        float[] fArr32 = fArr5[1];
        float f152 = fArr32[0];
        float f162 = fArr32[1];
        float f172 = fArr32[2];
        float[] fArr42 = fArr5[2];
        return setExtended.setIconTintList((f122 * signum4) + (f132 * signum22) + (f142 * signum32), (f152 * signum4) + (f162 * signum22) + (f172 * signum32), (signum4 * fArr42[0]) + (signum22 * fArr42[1]) + (signum32 * fArr42[2]));
    }
}