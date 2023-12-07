package o;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class aO implements ThreadFactory {
    private static final ThreadFactory setIconTintList = Executors.defaultThreadFactory();
    private final String MenuHostHelper$$ExternalSyntheticLambda0;
    private final AtomicLong MenuHostHelper$$ExternalSyntheticLambda1 = new AtomicLong();
    final int setX;
    final StrictMode.ThreadPolicy setY;

    public aO(String str, int i, @Nullable StrictMode.ThreadPolicy threadPolicy) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
        this.setX = i;
        this.setY = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        Thread newThread = setIconTintList.newThread(new Runnable() { // from class: o.aM
            @Override // java.lang.Runnable
            public final void run() {
                aO aOVar = aO.this;
                Runnable runnable2 = runnable;
                Process.setThreadPriority(aOVar.setX);
                StrictMode.ThreadPolicy threadPolicy = aOVar.setY;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.MenuHostHelper$$ExternalSyntheticLambda0, Long.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda1.getAndIncrement())));
        return newThread;
    }
}