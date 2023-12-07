package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class setQuery {
    private static Method setX;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                setX = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    public static float MenuHostHelper$$ExternalSyntheticLambda0(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return MenuHostHelper$$ExternalSyntheticLambda1(viewConfiguration, context);
        }
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float setX(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return setX.setX(viewConfiguration);
        }
        return MenuHostHelper$$ExternalSyntheticLambda1(viewConfiguration, context);
    }

    private static float MenuHostHelper$$ExternalSyntheticLambda1(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = setX) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return setIconTintList.setX(viewConfiguration);
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static boolean setIconTintList(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT < 28) {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
            return identifier != 0 && resources.getBoolean(identifier);
        }
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX {
        static float setX(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList {
        static int setX(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }
    }
}