package o;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class setOptimizationLevel extends getStrokeColor {
    @Override // o.getStrokeColor
    protected Typeface setY(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.setX, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.setIconTintList.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // o.getStrokeColor
    protected Method MenuHostHelper$$ExternalSyntheticLambda0(Class<?> cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}