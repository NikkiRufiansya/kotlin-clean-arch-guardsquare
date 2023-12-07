package o;

import android.content.pm.PackageInfo;
import android.os.Build;

/* loaded from: classes.dex */
public final class read {
    public static long setX(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT < 28) {
            return packageInfo.versionCode;
        }
        return packageInfo.getLongVersionCode();
    }

    /* loaded from: classes.dex */
    static class setIconTintList {
    }
}