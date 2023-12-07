package o;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public class setBoxStrokeColorStateList$MenuHostHelper$$ExternalSyntheticLambda1 extends setBoxStrokeColorStateList$MenuHostHelper$$ExternalSyntheticLambda0 {
    private static final RectF setUiOptions = new RectF();
    @Deprecated
    public float MenuHostHelper$$ExternalSyntheticLambda0;
    @Deprecated
    public float MenuHostHelper$$ExternalSyntheticLambda1;
    @Deprecated
    public float setIconTintList;
    @Deprecated
    public float setLayoutAnimation;
    @Deprecated
    public float setX;
    @Deprecated
    public float setY;

    public setBoxStrokeColorStateList$MenuHostHelper$$ExternalSyntheticLambda1(float f, float f2, float f3, float f4) {
        this.setY = f;
        this.setLayoutAnimation = f2;
        this.setX = f3;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = f4;
    }

    @Override // o.setBoxStrokeColorStateList$MenuHostHelper$$ExternalSyntheticLambda0
    public final void setIconTintList(Matrix matrix, Path path) {
        Matrix matrix2 = this.setOnLongClickListener;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = setUiOptions;
        rectF.set(this.setY, this.setLayoutAnimation, this.setX, this.MenuHostHelper$$ExternalSyntheticLambda0);
        path.arcTo(rectF, this.setIconTintList, this.MenuHostHelper$$ExternalSyntheticLambda1, false);
        path.transform(matrix);
    }
}