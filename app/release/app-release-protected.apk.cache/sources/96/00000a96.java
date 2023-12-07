package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class setCompoundDrawableTintList implements Executor {
    private final Handler MenuHostHelper$$ExternalSyntheticLambda0 = new isVisible(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.post(runnable);
    }
}