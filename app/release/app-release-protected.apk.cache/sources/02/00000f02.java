package o;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class setRightEdgeEffectColor {
    private static boolean MenuHostHelper$$ExternalSyntheticLambda0;
    private static Method MenuHostHelper$$ExternalSyntheticLambda1;
    private static Field setIconTintList;
    private static boolean setX;

    public static void setX(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        setY.setIconTintList(popupWindow, view, i, i2, i3);
    }

    public static void setIconTintList(PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT < 23) {
            if (!setX) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    setIconTintList = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                setX = true;
            }
            Field field = setIconTintList;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                    return;
                } catch (IllegalAccessException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e2);
                    return;
                }
            }
            return;
        }
        popupWindow.setOverlapAnchor(z);
    }

    public static void setY(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            setRightEdgeEffectColor$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(popupWindow, i);
            return;
        }
        if (!MenuHostHelper$$ExternalSyntheticLambda0) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                MenuHostHelper$$ExternalSyntheticLambda1 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            MenuHostHelper$$ExternalSyntheticLambda0 = true;
        }
        Method method = MenuHostHelper$$ExternalSyntheticLambda1;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    static class setY {
        static void setIconTintList(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }
}