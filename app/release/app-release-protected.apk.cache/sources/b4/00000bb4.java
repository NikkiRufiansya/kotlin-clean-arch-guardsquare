package o;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class setExtendMotionSpec {
    public static String MenuHostHelper$$ExternalSyntheticLambda1(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String MenuHostHelper$$ExternalSyntheticLambda1(Context context, int i) {
        if (i != -1) {
            try {
                return context.getResources().getResourceEntryName(i);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder("?");
                sb.append(i);
                return sb.toString();
            }
        }
        return "UNKNOWN";
    }

    public static String setY() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sb = new StringBuilder(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")");
        return sb.toString();
    }
}