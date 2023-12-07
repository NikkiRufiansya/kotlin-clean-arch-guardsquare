package o;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class eB {
    private static Boolean MenuHostHelper$$ExternalSyntheticLambda1;

    public static boolean setX(Context context) {
        Boolean bool = MenuHostHelper$$ExternalSyntheticLambda1;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(((PackageItemInfo) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128)).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            MenuHostHelper$$ExternalSyntheticLambda1 = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            C0106dm y = C0106dm.setY();
            StringBuilder sb = new StringBuilder("No perf logcat meta data found ");
            sb.append(e.getMessage());
            String obj = sb.toString();
            if (y.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = y.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setIconTintList(obj);
            }
            return false;
        }
    }
}