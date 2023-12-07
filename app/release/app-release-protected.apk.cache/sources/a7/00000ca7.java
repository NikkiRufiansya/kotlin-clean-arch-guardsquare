package o;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setIncludeFontPadding implements Executor {
    private final ArrayDeque<Runnable> MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayDeque<>();
    private final Executor setX;
    private Runnable setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setIncludeFontPadding(Executor executor) {
        this.setX = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        synchronized (this) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.offer(new Runnable() { // from class: o.setIncludeFontPadding.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        runnable.run();
                    } finally {
                        setIncludeFontPadding.this.setX();
                    }
                }
            });
            if (this.setY == null) {
                setX();
            }
        }
    }

    final void setX() {
        synchronized (this) {
            Runnable poll = this.MenuHostHelper$$ExternalSyntheticLambda1.poll();
            this.setY = poll;
            if (poll != null) {
                this.setX.execute(poll);
            }
        }
    }
}