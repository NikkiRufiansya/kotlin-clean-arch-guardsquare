package o;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public class getVisibleInsets implements TypeEvaluator<Matrix> {
    private final float[] setY = new float[9];
    private final float[] MenuHostHelper$$ExternalSyntheticLambda1 = new float[9];
    private final Matrix setIconTintList = new Matrix();

    @Override // android.animation.TypeEvaluator
    /* renamed from: setY */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.setY);
        matrix2.getValues(this.MenuHostHelper$$ExternalSyntheticLambda1);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
            float f2 = fArr[i];
            float f3 = this.setY[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.setIconTintList.setValues(this.MenuHostHelper$$ExternalSyntheticLambda1);
        return this.setIconTintList;
    }
}