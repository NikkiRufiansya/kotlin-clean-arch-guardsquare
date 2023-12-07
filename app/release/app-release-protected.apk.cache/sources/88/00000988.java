package o;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* loaded from: classes.dex */
public final class setBaselineAlignedChildIndex {
    public static String MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return setBaselineAlignedChildIndex$MenuHostHelper$$ExternalSyntheticLambda1.setY(str);
        }
        return null;
    }

    public static int setY(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return setBaselineAlignedChildIndex$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList((AppOpsManager) setBaselineAlignedChildIndex$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    public static int setIconTintList(Context context, int i, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager MenuHostHelper$$ExternalSyntheticLambda1 = setX.MenuHostHelper$$ExternalSyntheticLambda1(context);
            int y = setX.setY(MenuHostHelper$$ExternalSyntheticLambda1, str, Binder.getCallingUid(), str2);
            return y != 0 ? y : setX.setY(MenuHostHelper$$ExternalSyntheticLambda1, str, i, context.getOpPackageName());
        }
        return setY(context, str, str2);
    }

    /* loaded from: classes.dex */
    static class setX {
        static AppOpsManager MenuHostHelper$$ExternalSyntheticLambda1(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }

        static int setY(AppOpsManager appOpsManager, String str, int i, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }
    }
}