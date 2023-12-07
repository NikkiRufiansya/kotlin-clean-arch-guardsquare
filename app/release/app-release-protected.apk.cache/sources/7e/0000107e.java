package o;

import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public final class setTitleCollapseMode {
    public static String setX(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return MenuHostHelper$$ExternalSyntheticLambda1("TRuntime.", str);
        }
        StringBuilder sb = new StringBuilder("TRuntime.");
        sb.append(str);
        return sb.toString();
    }

    private static String MenuHostHelper$$ExternalSyntheticLambda1(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String obj = sb.toString();
        return obj.length() > 23 ? obj.substring(0, 23) : obj;
    }

    public static void setX(String str, String str2, Object obj) {
        String x = setX(str);
        if (Log.isLoggable(x, 3)) {
            Log.d(x, String.format(str2, obj));
        }
    }

    public static void setY(String str, String str2, Object obj) {
        String x = setX(str);
        if (Log.isLoggable(x, 4)) {
            Log.i(x, String.format(str2, obj));
        }
    }
}