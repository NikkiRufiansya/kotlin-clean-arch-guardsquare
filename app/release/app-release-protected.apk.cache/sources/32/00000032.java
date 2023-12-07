package androidx.core.graphics.drawable;

import android.graphics.drawable.Icon;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class IconCompat$MenuHostHelper$$ExternalSyntheticLambda0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setY(Object obj) {
        int resId;
        if (Build.VERSION.SDK_INT >= 28) {
            resId = ((Icon) obj).getResId();
            return resId;
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }
}