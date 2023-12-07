package o;

import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class V {
    public abstract long MenuHostHelper$$ExternalSyntheticLambda0();

    public abstract long MenuHostHelper$$ExternalSyntheticLambda1();

    public abstract long setIconTintList();

    public static V setX() {
        return new Q(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }
}