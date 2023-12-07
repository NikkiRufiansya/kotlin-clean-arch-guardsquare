package o;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class setOnApplyWindowInsetsListener {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T MenuHostHelper$$ExternalSyntheticLambda1(ExecutorService executorService, Callable<T> callable, int i) {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }

    /* loaded from: classes.dex */
    static class setY<T> implements Runnable {
        private Handler MenuHostHelper$$ExternalSyntheticLambda0;
        private Callable<T> MenuHostHelper$$ExternalSyntheticLambda1;
        private getGroupName<T> setY;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setY(Handler handler, Callable<T> callable, getGroupName<T> getgroupname) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = callable;
            this.setY = getgroupname;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = handler;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final T t;
            try {
                t = this.MenuHostHelper$$ExternalSyntheticLambda1.call();
            } catch (Exception unused) {
                t = null;
            }
            final getGroupName<T> getgroupname = this.setY;
            this.MenuHostHelper$$ExternalSyntheticLambda0.post(new Runnable() { // from class: o.setOnApplyWindowInsetsListener.setY.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    getgroupname.setY(t);
                }
            });
        }
    }
}