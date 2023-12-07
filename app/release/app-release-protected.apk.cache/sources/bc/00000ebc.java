package o;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
class setPressable extends setShrinkMotionSpecResource {
    private static boolean setIconTintList = true;
    private static boolean setX = true;

    @Override // o.findFragmentByTag
    public void setX(View view, Matrix matrix) {
        if (setIconTintList) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                setIconTintList = false;
            }
        }
    }

    @Override // o.findFragmentByTag
    public void MenuHostHelper$$ExternalSyntheticLambda0(View view, Matrix matrix) {
        if (setX) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                setX = false;
            }
        }
    }
}