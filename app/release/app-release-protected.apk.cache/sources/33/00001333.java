package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: o.xp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0603xp extends xI {
    private static final long MenuHostHelper$$ExternalSyntheticLambda0;
    private static C0603xp setUiOptions;
    public static final setX setX = new setX((byte) 0);
    private static final long setY;
    public boolean setIconTintList;
    private long setOnLongClickListener;
    private C0603xp setUnboundedRipple;

    protected void setY() {
    }

    public final void setIconTintList() {
        if (!(!this.setIconTintList)) {
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        }
        long layoutAnimation = setLayoutAnimation();
        boolean w_ = w_();
        if (layoutAnimation != 0 || w_) {
            this.setIconTintList = true;
            setX.setIconTintList(this, layoutAnimation, w_);
        }
    }

    public final IOException MenuHostHelper$$ExternalSyntheticLambda0(IOException iOException) {
        return setIconTintList(iOException);
    }

    protected IOException setIconTintList(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.xp$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList extends Thread {
        public setIconTintList() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0081 A[SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r9 = this;
            L0:
                java.lang.Class<o.xp> r0 = o.C0603xp.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                o.xp$setX r1 = o.C0603xp.setX     // Catch: java.lang.Throwable -> L8b
                o.xp r1 = o.C0603xp.MenuHostHelper$$ExternalSyntheticLambda1()     // Catch: java.lang.Throwable -> L8b
                o.pN.setX(r1)     // Catch: java.lang.Throwable -> L8b
                o.xp r1 = o.C0603xp.setX(r1)     // Catch: java.lang.Throwable -> L8b
                r2 = 0
                if (r1 != 0) goto L43
                long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L8b
                java.lang.Class<o.xp> r1 = o.C0603xp.class
                java.lang.Object r1 = (java.lang.Object) r1     // Catch: java.lang.Throwable -> L8b
                long r5 = o.C0603xp.MenuHostHelper$$ExternalSyntheticLambda0()     // Catch: java.lang.Throwable -> L8b
                r1.wait(r5)     // Catch: java.lang.Throwable -> L8b
                o.xp r1 = o.C0603xp.MenuHostHelper$$ExternalSyntheticLambda1()     // Catch: java.lang.Throwable -> L8b
                o.pN.setX(r1)     // Catch: java.lang.Throwable -> L8b
                o.xp r1 = o.C0603xp.setX(r1)     // Catch: java.lang.Throwable -> L8b
                if (r1 != 0) goto L41
                long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L8b
                long r5 = r5 - r3
                long r3 = o.C0603xp.setX()     // Catch: java.lang.Throwable -> L8b
                int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r1 < 0) goto L41
                o.xp r1 = o.C0603xp.MenuHostHelper$$ExternalSyntheticLambda1()     // Catch: java.lang.Throwable -> L8b
                goto L76
            L41:
                r1 = r2
                goto L76
            L43:
                long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L8b
                long r3 = o.C0603xp.setIconTintList(r1, r3)     // Catch: java.lang.Throwable -> L8b
                r5 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 <= 0) goto L65
                r5 = 1000000(0xf4240, double:4.940656E-318)
                long r7 = r3 / r5
                java.lang.Class<o.xp> r1 = o.C0603xp.class
                java.lang.Object r1 = (java.lang.Object) r1     // Catch: java.lang.Throwable -> L8b
                java.lang.Long.signum(r7)
                long r5 = r5 * r7
                long r3 = r3 - r5
                int r4 = (int) r3
                r1.wait(r7, r4)     // Catch: java.lang.Throwable -> L8b
                goto L41
            L65:
                o.xp r3 = o.C0603xp.MenuHostHelper$$ExternalSyntheticLambda1()     // Catch: java.lang.Throwable -> L8b
                o.pN.setX(r3)     // Catch: java.lang.Throwable -> L8b
                o.xp r4 = o.C0603xp.setX(r1)     // Catch: java.lang.Throwable -> L8b
                o.C0603xp.setY(r3, r4)     // Catch: java.lang.Throwable -> L8b
                o.C0603xp.setY(r1, r2)     // Catch: java.lang.Throwable -> L8b
            L76:
                o.xp r3 = o.C0603xp.MenuHostHelper$$ExternalSyntheticLambda1()     // Catch: java.lang.Throwable -> L8b
                if (r1 != r3) goto L81
                o.C0603xp.MenuHostHelper$$ExternalSyntheticLambda0(r2)     // Catch: java.lang.Throwable -> L8b
                monitor-exit(r0)
                return
            L81:
                o.nX r2 = o.nX.setX     // Catch: java.lang.Throwable -> L8b
                monitor-exit(r0)
                if (r1 == 0) goto L0
                r1.setY()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L8b:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.InterruptedException -> L0
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0603xp.setIconTintList.run():void");
        }
    }

    /* renamed from: o.xp$setX */
    /* loaded from: classes.dex */
    public static final class setX {
        private setX() {
        }

        public /* synthetic */ setX(byte b) {
            this();
        }

        static void setIconTintList(C0603xp c0603xp, long j, boolean z) {
            synchronized (C0603xp.class) {
                if (C0603xp.setUiOptions == null) {
                    C0603xp.setUiOptions = new C0603xp();
                    new setIconTintList().start();
                }
                long nanoTime = System.nanoTime();
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i != 0 && z) {
                    c0603xp.setOnLongClickListener = Math.min(j, c0603xp.v_() - nanoTime) + nanoTime;
                } else if (i != 0) {
                    c0603xp.setOnLongClickListener = j + nanoTime;
                } else if (z) {
                    c0603xp.setOnLongClickListener = c0603xp.v_();
                } else {
                    throw new AssertionError();
                }
                long iconTintList = C0603xp.setIconTintList(c0603xp, nanoTime);
                C0603xp c0603xp2 = C0603xp.setUiOptions;
                pN.setX(c0603xp2);
                while (c0603xp2.setUnboundedRipple != null) {
                    C0603xp c0603xp3 = c0603xp2.setUnboundedRipple;
                    pN.setX(c0603xp3);
                    if (iconTintList < C0603xp.setIconTintList(c0603xp3, nanoTime)) {
                        break;
                    }
                    c0603xp2 = c0603xp2.setUnboundedRipple;
                    pN.setX(c0603xp2);
                }
                c0603xp.setUnboundedRipple = c0603xp2.setUnboundedRipple;
                c0603xp2.setUnboundedRipple = c0603xp;
                if (c0603xp2 == C0603xp.setUiOptions) {
                    C0603xp.class.notify();
                }
                nX nXVar = nX.setX;
            }
        }

        public static boolean setY(C0603xp c0603xp) {
            synchronized (C0603xp.class) {
                for (C0603xp c0603xp2 = C0603xp.setUiOptions; c0603xp2 != null; c0603xp2 = c0603xp2.setUnboundedRipple) {
                    if (c0603xp2.setUnboundedRipple == c0603xp) {
                        c0603xp2.setUnboundedRipple = c0603xp.setUnboundedRipple;
                        c0603xp.setUnboundedRipple = null;
                        return false;
                    }
                }
                return true;
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        setY = millis;
        MenuHostHelper$$ExternalSyntheticLambda0 = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static final /* synthetic */ long setIconTintList(C0603xp c0603xp, long j) {
        return c0603xp.setOnLongClickListener - j;
    }
}