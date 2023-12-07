package o;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;

/* loaded from: classes.dex */
public final class setBoxBackgroundMode {

    /* loaded from: classes.dex */
    public static final class setIconTintList {
        public static Uri setIconTintList(Cursor cursor) {
            return cursor.getNotificationUri();
        }

        public static boolean setY(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }
    }

    /* loaded from: classes.dex */
    public static final class setX {
        public static File setX(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* loaded from: classes.dex */
    public static final class setY {
    }
}