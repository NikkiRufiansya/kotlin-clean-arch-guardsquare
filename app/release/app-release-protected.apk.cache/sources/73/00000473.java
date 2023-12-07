package o;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public class findFragmentById {
    public static boolean setX(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return findFragmentById$MenuHostHelper$$ExternalSyntheticLambda0.setY(context);
        }
        return true;
    }
}