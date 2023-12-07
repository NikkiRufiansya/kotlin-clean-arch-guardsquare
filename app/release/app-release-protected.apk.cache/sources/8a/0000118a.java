package o;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class uI extends AbstractC0466ss implements Executor {
    private static final rQ MenuHostHelper$$ExternalSyntheticLambda1;
    public static final uI setX = new uI();

    @Override // o.rQ
    public final String toString() {
        return "Dispatchers.IO";
    }

    private uI() {
    }

    static {
        uY uYVar = uY.setY;
        int iconTintList = C0527ux.setIconTintList();
        if (64 >= iconTintList) {
            iconTintList = 64;
        }
        MenuHostHelper$$ExternalSyntheticLambda1 = uYVar.setIconTintList(C0529uz.MenuHostHelper$$ExternalSyntheticLambda0("kotlinx.coroutines.io.parallelism", iconTintList, 0, 0, 12));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        MenuHostHelper$$ExternalSyntheticLambda1.setY(oL.setX, runnable);
    }

    @Override // o.rQ
    public final rQ setIconTintList(int i) {
        return uY.setY.setIconTintList(i);
    }

    @Override // o.rQ
    public final void setY(oM oMVar, Runnable runnable) {
        MenuHostHelper$$ExternalSyntheticLambda1.setY(oMVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }
}