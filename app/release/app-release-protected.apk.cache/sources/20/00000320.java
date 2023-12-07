package o;

import java.util.concurrent.Executor;

/* renamed from: o.bn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053bn {

    /* renamed from: o.bn$setX */
    /* loaded from: classes.dex */
    public enum setX implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}