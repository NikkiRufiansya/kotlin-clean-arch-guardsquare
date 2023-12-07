package o;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class setStartIconCheckable {
    private static long MenuHostHelper$$ExternalSyntheticLambda1;
    private static Method setX;

    public static boolean setIconTintList() {
        boolean isEnabled;
        try {
            if (setX == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return setY();
    }

    private static boolean setY() {
        try {
            if (setX == null) {
                MenuHostHelper$$ExternalSyntheticLambda1 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                setX = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) setX.invoke(null, Long.valueOf(MenuHostHelper$$ExternalSyntheticLambda1))).booleanValue();
        } catch (Exception e) {
            if (e instanceof InvocationTargetException) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            StringBuilder sb = new StringBuilder("Unable to call ");
            sb.append("isTagEnabled");
            sb.append(" via reflection");
            Log.v("Trace", sb.toString(), e);
            return false;
        }
    }
}