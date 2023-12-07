package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class setChipMinHeightResource extends setFillAlpha {
    private volatile Handler MenuHostHelper$$ExternalSyntheticLambda0;
    private static byte[] setIconTintList = {65, 51, -100, -34, 16, -5, -2, -15, 7, 4, -34, 18, 8, -15, -6, 1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1};
    public static final int MenuHostHelper$$ExternalSyntheticLambda1 = 172;
    private final Object setY = new Object();
    private final ExecutorService setX = Executors.newFixedThreadPool(4, new ThreadFactory() { // from class: o.setChipMinHeightResource.2
        private final AtomicInteger setY = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.setY.getAndIncrement())));
            return thread;
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0035). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = 16 - r8
            byte[] r0 = o.setChipMinHeightResource.setIconTintList
            int r6 = r6 * 7
            int r6 = 106 - r6
            int r7 = r7 * 12
            int r7 = 16 - r7
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L1b
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L35
        L1b:
            r3 = 0
        L1c:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L35:
            int r8 = r8 + r6
            int r7 = r7 + 1
            int r6 = r8 + 2
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setChipMinHeightResource.a(int, byte, int, java.lang.Object[]):void");
    }

    @Override // o.setFillAlpha
    public final void MenuHostHelper$$ExternalSyntheticLambda0(Runnable runnable) {
        this.setX.execute(runnable);
    }

    @Override // o.setFillAlpha
    public final void setIconTintList(Runnable runnable) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            synchronized (this.setY) {
                if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = setX(Looper.getMainLooper());
                }
            }
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.post(runnable);
    }

    @Override // o.setFillAlpha
    public final boolean setIconTintList() {
        Thread thread = Looper.getMainLooper().getThread();
        try {
            byte b = (byte) (setIconTintList[15] - 1);
            byte b2 = b;
            Object[] objArr = new Object[1];
            a(b, b2, b2, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = setIconTintList[15];
            byte b4 = b3;
            Object[] objArr2 = new Object[1];
            a(b3, b4, b4, objArr2);
            return thread == cls.getMethod((String) objArr2[0], null).invoke(null, null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static Handler setX(Looper looper) {
        Handler createAsync;
        if (Build.VERSION.SDK_INT >= 28) {
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}