package o;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class getCallingUserHandle {
    private static Field setIconTintList;
    private static boolean setX;

    public static ColorStateList setY(CompoundButton compoundButton) {
        return getCallingUserHandle$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(compoundButton);
    }

    public static Drawable MenuHostHelper$$ExternalSyntheticLambda1(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return setIconTintList.setY(compoundButton);
        }
        if (!setX) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                setIconTintList = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            setX = true;
        }
        Field field = setIconTintList;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                setIconTintList = null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList {
        static Drawable setY(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }
}