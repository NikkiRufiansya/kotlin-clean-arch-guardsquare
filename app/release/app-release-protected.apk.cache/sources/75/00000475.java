package o;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class findFragmentByTag {
    private static Field MenuHostHelper$$ExternalSyntheticLambda1;
    private static boolean setIconTintList;
    private static Method setX;
    private static boolean setY;

    public void setX(View view, float f) {
        Float f2 = (Float) view.getTag(R.id.res_0x7f0a0192);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    public float setY(View view) {
        Float f = (Float) view.getTag(R.id.res_0x7f0a0192);
        if (f != null) {
            return view.getAlpha() / f.floatValue();
        }
        return view.getAlpha();
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1(View view) {
        if (view.getTag(R.id.res_0x7f0a0192) == null) {
            view.setTag(R.id.res_0x7f0a0192, Float.valueOf(view.getAlpha()));
        }
    }

    public void setIconTintList(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(R.id.res_0x7f0a0192, null);
        }
    }

    public void setX(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            setX(view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            MenuHostHelper$$ExternalSyntheticLambda0(view2, matrix);
            matrix.postTranslate(view2.getScrollX(), view2.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1(View view, int i, int i2, int i3, int i4) {
        MenuHostHelper$$ExternalSyntheticLambda0();
        Method method = setX;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1(View view, int i) {
        if (!setY) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                MenuHostHelper$$ExternalSyntheticLambda1 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            setY = true;
        }
        Field field = MenuHostHelper$$ExternalSyntheticLambda1;
        if (field != null) {
            try {
                MenuHostHelper$$ExternalSyntheticLambda1.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0() {
        if (setIconTintList) {
            return;
        }
        try {
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            setX = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e) {
            Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
        }
        setIconTintList = true;
    }
}