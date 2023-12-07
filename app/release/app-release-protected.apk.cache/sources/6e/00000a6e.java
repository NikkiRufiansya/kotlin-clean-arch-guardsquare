package o;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;

/* loaded from: classes.dex */
public class setColumnCount extends setLineHeight {
    protected setColumnCount() {
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(Activity activity) {
        setIconTintList.setX(activity);
    }

    public static void setX(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: o.setProgressTintBlendMode
                @Override // java.lang.Runnable
                public final void run() {
                    setColumnCount.MenuHostHelper$$ExternalSyntheticLambda1(activity);
                }
            });
        }
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(Activity activity) {
        if (activity.isFinishing() || setTitleEnabled.setX(activity)) {
            return;
        }
        activity.recreate();
    }

    /* loaded from: classes.dex */
    public static class setIconTintList {
        public static void setX(Activity activity) {
            activity.finishAffinity();
        }
    }
}