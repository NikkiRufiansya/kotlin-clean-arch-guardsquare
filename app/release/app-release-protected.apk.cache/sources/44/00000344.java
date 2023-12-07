package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes.dex */
public final class cL {
    private final bQ MenuHostHelper$$ExternalSyntheticLambda0;
    private boolean setIconTintList;
    private final Context setX;
    private final SharedPreferences setY;

    public cL(Context context, String str, bQ bQVar) {
        boolean y;
        context = Build.VERSION.SDK_INT >= 24 ? setLineHeight.setIconTintList(context) : context;
        this.setX = context;
        StringBuilder sb = new StringBuilder("com.google.firebase.common.prefs:");
        sb.append(str);
        SharedPreferences sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
        this.setY = sharedPreferences;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = bQVar;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            y = this.setY.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            y = setY();
        }
        this.setIconTintList = y;
    }

    public final boolean setIconTintList() {
        boolean z;
        synchronized (this) {
            z = this.setIconTintList;
        }
        return z;
    }

    private boolean setY() {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = this.setX.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.setX.getPackageName(), 128)) == null || ((PackageItemInfo) applicationInfo).metaData == null || !((PackageItemInfo) applicationInfo).metaData.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return ((PackageItemInfo) applicationInfo).metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}