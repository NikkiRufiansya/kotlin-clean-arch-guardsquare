package o;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class FragmentStateAdapter$5 {
    static Field MenuHostHelper$$ExternalSyntheticLambda0;
    static boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private static Class<?> setIconTintList;
    private static Field setLayoutAnimation;
    private static boolean setNavigationOnClickListener;
    private static boolean setUnboundedRipple;
    static Field setX;
    static boolean setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        LongSparseArray longSparseArray;
        if (!setUnboundedRipple) {
            try {
                setIconTintList = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            setUnboundedRipple = true;
        }
        Class<?> cls = setIconTintList;
        if (cls == null) {
            return;
        }
        if (!setNavigationOnClickListener) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                setLayoutAnimation = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            setNavigationOnClickListener = true;
        }
        Field field = setLayoutAnimation;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}