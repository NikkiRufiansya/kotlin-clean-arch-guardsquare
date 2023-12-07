package o;

import android.content.Context;
import android.util.TypedValue;

/* loaded from: classes.dex */
public final class setShowDividerVertical {
    public static boolean setIconTintList(Context context, int i, boolean z) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            typedValue = null;
        }
        return (typedValue == null || typedValue.type != 18) ? z : typedValue.data != 0;
    }

    public static TypedValue setIconTintList(Context context, int i, String str) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            typedValue = null;
        }
        if (typedValue != null) {
            return typedValue;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }
}