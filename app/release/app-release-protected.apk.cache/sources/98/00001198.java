package o;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class uS {
    public static final int MenuHostHelper$$ExternalSyntheticLambda0;
    public static final long MenuHostHelper$$ExternalSyntheticLambda1;
    public static final int setIconTintList;
    public static uQ setOnLongClickListener;
    public static final long setUiOptions = C0529uz.MenuHostHelper$$ExternalSyntheticLambda0("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);
    public static final uV setX;
    public static final uV setY;

    static {
        int iconTintList = C0527ux.setIconTintList();
        if (iconTintList < 2) {
            iconTintList = 2;
        }
        setIconTintList = C0529uz.MenuHostHelper$$ExternalSyntheticLambda0("kotlinx.coroutines.scheduler.core.pool.size", iconTintList, 1, 0, 8);
        MenuHostHelper$$ExternalSyntheticLambda0 = C0529uz.MenuHostHelper$$ExternalSyntheticLambda0("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        MenuHostHelper$$ExternalSyntheticLambda1 = TimeUnit.SECONDS.toNanos(C0529uz.MenuHostHelper$$ExternalSyntheticLambda0("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        setOnLongClickListener = uP.setY;
        setY = new uT(0);
        setX = new uT(1);
    }
}