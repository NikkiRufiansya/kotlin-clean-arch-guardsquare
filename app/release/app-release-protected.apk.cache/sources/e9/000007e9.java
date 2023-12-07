package o;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public final class onOptionsItemSelected {
    public static Intent MenuHostHelper$$ExternalSyntheticLambda0(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String x = setX(activity);
        if (x == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, x);
        try {
            if (MenuHostHelper$$ExternalSyntheticLambda1(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder("getParentActivityIntent: bad parentActivityName '");
            sb.append(x);
            sb.append("' in manifest");
            Log.e("NavUtils", sb.toString());
            return null;
        }
    }

    public static Intent setX(Context context, ComponentName componentName) {
        String MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(context, componentName);
        if (MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), MenuHostHelper$$ExternalSyntheticLambda1);
        if (MenuHostHelper$$ExternalSyntheticLambda1(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String setX(Activity activity) {
        try {
            return MenuHostHelper$$ExternalSyntheticLambda1(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static String MenuHostHelper$$ExternalSyntheticLambda1(Context context, ComponentName componentName) {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            i = 269222528;
        } else {
            i = Build.VERSION.SDK_INT >= 24 ? 787072 : 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (((PackageItemInfo) activityInfo).metaData == null || (string = ((PackageItemInfo) activityInfo).metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(string);
            return sb.toString();
        }
        return string;
    }

    /* loaded from: classes.dex */
    public static class setIconTintList {
        public static boolean setY(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }

        public static boolean setX(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }
    }
}