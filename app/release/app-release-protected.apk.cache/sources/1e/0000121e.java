package o;

import java.util.concurrent.Executor;

/* renamed from: o.ve  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class ExecutorC0535ve implements Executor {
    public static final ExecutorC0535ve MenuHostHelper$$ExternalSyntheticLambda1 = new ExecutorC0535ve();

    private ExecutorC0535ve() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}