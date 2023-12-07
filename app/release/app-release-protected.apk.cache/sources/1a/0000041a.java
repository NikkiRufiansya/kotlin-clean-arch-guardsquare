package o;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: o.eb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121eb {
    final ActivityManager.MemoryInfo MenuHostHelper$$ExternalSyntheticLambda0;
    final ActivityManager MenuHostHelper$$ExternalSyntheticLambda1;
    private final Context setIconTintList;
    final Runtime setX;

    static {
        C0106dm.setY();
    }

    public C0121eb(Context context) {
        this(Runtime.getRuntime(), context);
    }

    private C0121eb(Runtime runtime, Context context) {
        this.setX = runtime;
        this.setIconTintList = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}