package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: o.bl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0051bl implements Executor {
    INSTANCE;
    
    private static final Handler setX = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        setX.post(runnable);
    }
}