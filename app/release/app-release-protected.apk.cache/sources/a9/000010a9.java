package o;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class setTransition implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}