package o;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* loaded from: classes.dex */
public final class setItemAnimator {
    private static Method MenuHostHelper$$ExternalSyntheticLambda0;
    private static Method MenuHostHelper$$ExternalSyntheticLambda1;
    private static Method setIconTintList;
    private static Method setX;
    private static long setY;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                setY = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                setIconTintList = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                setX = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                MenuHostHelper$$ExternalSyntheticLambda1 = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                MenuHostHelper$$ExternalSyntheticLambda0 = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }
}