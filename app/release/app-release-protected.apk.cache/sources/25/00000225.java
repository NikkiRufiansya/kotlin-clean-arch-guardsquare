package o;

import android.os.Build;

/* loaded from: classes.dex */
public interface ProcessLifecycleInitializer {
    public static final boolean setIconTintList;

    static {
        setIconTintList = Build.VERSION.SDK_INT >= 27;
    }
}