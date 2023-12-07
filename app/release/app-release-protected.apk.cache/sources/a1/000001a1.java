package o;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
abstract class FirebaseCommonRegistrar implements Interpolator {
    private final float[] setIconTintList;
    private final float setX;

    /* JADX INFO: Access modifiers changed from: protected */
    public FirebaseCommonRegistrar(float[] fArr) {
        this.setIconTintList = fArr;
        this.setX = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.setIconTintList;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.setX;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.setIconTintList;
        float f4 = fArr2[min];
        return f4 + (f3 * (fArr2[min + 1] - f4));
    }
}