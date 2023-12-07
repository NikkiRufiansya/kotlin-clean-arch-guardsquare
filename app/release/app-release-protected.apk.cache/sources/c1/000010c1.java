package o;

import android.util.Log;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class setTrimPathEnd implements Executor {
    private final Executor setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setTrimPathEnd(Executor executor) {
        this.setX = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        this.setX.execute(new Runnable(runnable) { // from class: o.setTrimPathEnd$MenuHostHelper$$ExternalSyntheticLambda0
            private final Runnable MenuHostHelper$$ExternalSyntheticLambda0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.MenuHostHelper$$ExternalSyntheticLambda0.run();
                } catch (Exception e) {
                    String x = setTitleCollapseMode.setX("Executor");
                    if (Log.isLoggable(x, 6)) {
                        Log.e(x, "Background execution failure.", e);
                    }
                }
            }
        });
    }
}