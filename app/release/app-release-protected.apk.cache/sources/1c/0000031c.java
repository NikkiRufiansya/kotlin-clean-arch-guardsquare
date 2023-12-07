package o;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* renamed from: o.bm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0052bm implements Executor {
    private final Executor setY;
    public static final byte[] $$g = {62, -79, -77, -78};
    public static final int $$h = 59;
    public static final byte[] $$d = {31, -80, -88, -103, -14, 15, -43, 26, 12, -1, -26, 21, 5, 6, -40, 29, 10, 1, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -49, -65, 64, 12, -65, 72, -40, -42, 79, -14, 15, -27};
    public static final int $$e = 54;
    public static final byte[] $$a = {65, 51, -100, -34, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35};
    public static final int $$b = 164;
    private static byte[] setLayoutAnimation = {97, -108, 86, -98, 17, -6, 18, 1, -2, -1, -50, 57, 16, 3, 10, -11, 13, 10, -66, 25, 48, 3, 10, -11, 23, 0, -1, 5, 13, 10, -7, 15, 9, -45, 29, 22, -7, -33, 48, -7, 5, -5, 25, -17, -47, 66, -7, 17, -3, -53, 41, 42, -2, 5, -11, 12};
    public static final int setX = 57;
    private static long setNavigationOnClickListener = 6885478374224490124L;
    private static final Logger MenuHostHelper$$ExternalSyntheticLambda1 = Logger.getLogger(ExecutorC0052bm.class.getName());
    private final Deque<Runnable> setIconTintList = new ArrayDeque();
    private setX setUnboundedRipple = setX.IDLE;
    private long setOnLongClickListener = 0;
    private final setY MenuHostHelper$$ExternalSyntheticLambda0 = new setY(this, (byte) 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bm$setX */
    /* loaded from: classes.dex */
    public enum setX {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.ExecutorC0052bm.$$a
            int r7 = r7 * 25
            int r7 = r7 + 15
            int r8 = r8 * 38
            int r8 = 115 - r8
            int r6 = r6 * 14
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L1c
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L36
        L1c:
            r3 = 0
        L1d:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L36:
            int r9 = r9 + r7
            int r6 = r6 + 1
            int r7 = r9 + (-13)
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ExecutorC0052bm.a(int, short, byte, java.lang.Object[]):void");
    }

    private static void c(short s, int i, byte b, Object[] objArr) {
        int i2 = (b * 7) + 16;
        int i3 = s + 97;
        byte[] bArr = setLayoutAnimation;
        int i4 = 41 - i;
        byte[] bArr2 = new byte[i2];
        int i5 = -1;
        int i6 = i2 - 1;
        if (bArr == null) {
            i3 = (i6 + i3) - 4;
            i4++;
            i6 = i6;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i5 = -1;
        }
        while (true) {
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i6;
            i3 = (i3 + bArr[i4]) - 4;
            i4++;
            i6 = i8;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i5 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = o.ExecutorC0052bm.$$d
            int r7 = r7 * 2
            int r7 = 115 - r7
            int r8 = 59 - r8
            int r9 = 40 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            goto L32
        L16:
            r3 = 0
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r6
        L32:
            int r7 = r7 + r8
            r8 = r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ExecutorC0052bm.d(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r6 = r6 * 5
            int r6 = 121 - r6
            byte[] r0 = o.ExecutorC0052bm.$$g
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L1b
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L34
        L1b:
            r3 = 0
        L1c:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r0[r7]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L34:
            int r6 = -r6
            int r6 = r6 + r8
            int r7 = r7 + 1
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ExecutorC0052bm.e(byte, short, byte, java.lang.Object[]):void");
    }

    static /* synthetic */ long setIconTintList(ExecutorC0052bm executorC0052bm) {
        long j = executorC0052bm.setOnLongClickListener;
        executorC0052bm.setOnLongClickListener = 1 + j;
        return j;
    }

    public ExecutorC0052bm(Executor executor) {
        if (executor != null) {
            this.setY = executor;
            return;
        }
        throw new NullPointerException("null reference");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        if (runnable != null) {
            synchronized (this.setIconTintList) {
                if (this.setUnboundedRipple != setX.RUNNING && this.setUnboundedRipple != setX.QUEUED) {
                    long j = this.setOnLongClickListener;
                    Runnable runnable2 = new Runnable() { // from class: o.bm.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            runnable.run();
                        }

                        public final String toString() {
                            return runnable.toString();
                        }
                    };
                    this.setIconTintList.add(runnable2);
                    this.setUnboundedRipple = setX.QUEUING;
                    try {
                        this.setY.execute(this.MenuHostHelper$$ExternalSyntheticLambda0);
                        if (this.setUnboundedRipple != setX.QUEUING) {
                            return;
                        }
                        synchronized (this.setIconTintList) {
                            if (this.setOnLongClickListener == j && this.setUnboundedRipple == setX.QUEUING) {
                                this.setUnboundedRipple = setX.QUEUED;
                            }
                        }
                        return;
                    } catch (Error | RuntimeException e) {
                        synchronized (this.setIconTintList) {
                            if ((this.setUnboundedRipple == setX.IDLE || this.setUnboundedRipple == setX.QUEUING) && this.setIconTintList.removeLastOccurrence(runnable2)) {
                                r7 = true;
                            }
                            if (!(e instanceof RejectedExecutionException) || r7) {
                                throw e;
                            }
                        }
                        return;
                    }
                }
                this.setIconTintList.add(runnable);
                return;
            }
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: o.bm$setY */
    /* loaded from: classes.dex */
    final class setY implements Runnable {
        @CheckForNull
        private Runnable setY;
        private static byte[] setIconTintList = {53, 18, -76, 65, -16, 5, 2, 15, -7, -4, 34, -18, -8, 15, 6, -1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -36, -18, -8, 15, 6, -1};
        public static final int MenuHostHelper$$ExternalSyntheticLambda0 = C0564we.setX;

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0034). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 7
                int r6 = r6 + 99
                int r8 = r8 * 3
                int r8 = r8 + 13
                byte[] r0 = o.ExecutorC0052bm.setY.setIconTintList
                int r7 = r7 + 4
                byte[] r1 = new byte[r8]
                int r8 = r8 + (-1)
                r2 = 0
                if (r0 != 0) goto L19
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r9
                r9 = r8
                goto L34
            L19:
                r3 = 0
            L1a:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r7 = r7 + 1
                int r4 = r3 + 1
                if (r3 != r8) goto L2b
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2b:
                r3 = r0[r7]
                r5 = r8
                r8 = r6
                r6 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                r9 = r5
            L34:
                int r8 = r8 - r6
                int r6 = r8 + 2
                r8 = r9
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ExecutorC0052bm.setY.a(int, byte, byte, java.lang.Object[]):void");
        }

        private setY() {
        }

        /* synthetic */ setY(ExecutorC0052bm executorC0052bm, byte b) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                MenuHostHelper$$ExternalSyntheticLambda1();
            } catch (Error e) {
                synchronized (ExecutorC0052bm.this.setIconTintList) {
                    ExecutorC0052bm.this.setUnboundedRipple = setX.IDLE;
                    throw e;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
            r12.MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple = o.ExecutorC0052bm.setX.setY;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
            if (r1 == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
            r7 = new java.lang.Object[1];
            a((byte) (-o.ExecutorC0052bm.setY.setIconTintList[15]), o.ExecutorC0052bm.setY.setIconTintList[16], (byte) (-o.ExecutorC0052bm.setY.setIconTintList[15]), r7);
            r1 = java.lang.Class.forName((java.lang.String) r7[0]);
            r3 = o.ExecutorC0052bm.setY.setIconTintList[15];
            r6 = new java.lang.Object[1];
            a((byte) (o.ExecutorC0052bm.setY.setIconTintList[15] + 1), r3, (byte) (r3 + 1), r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00d2, code lost:
            ((java.lang.Thread) r1.getMethod((java.lang.String) r6[0], null).invoke(null, null)).interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00d6, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00d7, code lost:
            r1 = r0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
            if (r1 != null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00dd, code lost:
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00de, code lost:
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00df, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00e5, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00e6, code lost:
            r12.setY.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00ee, code lost:
            r7 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
            r8 = o.ExecutorC0052bm.MenuHostHelper$$ExternalSyntheticLambda1;
            r9 = java.util.logging.Level.SEVERE;
            r10 = new java.lang.StringBuilder();
            r10.append("Exception while executing runnable ");
            r10.append(r12.setY);
            r8.log(r9, r10.toString(), (java.lang.Throwable) r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void MenuHostHelper$$ExternalSyntheticLambda1() {
            /*
                Method dump skipped, instructions count: 357
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ExecutorC0052bm.setY.MenuHostHelper$$ExternalSyntheticLambda1():void");
        }

        public final String toString() {
            Runnable runnable = this.setY;
            if (runnable != null) {
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{running=");
                sb.append(runnable);
                sb.append("}");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
            sb2.append(ExecutorC0052bm.this.setUnboundedRipple);
            sb2.append("}");
            return sb2.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x047b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 1650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ExecutorC0052bm.toString():java.lang.String");
    }

    private static void b(int i, char[] cArr, Object[] objArr) {
        jD jDVar = new jD();
        char[] MenuHostHelper$$ExternalSyntheticLambda0 = jD.MenuHostHelper$$ExternalSyntheticLambda0(setNavigationOnClickListener ^ 2449010268519698653L, cArr, i);
        int i2 = 4;
        jDVar.setIconTintList = 4;
        while (jDVar.setIconTintList < MenuHostHelper$$ExternalSyntheticLambda0.length) {
            jDVar.setX = jDVar.setIconTintList - i2;
            int i3 = jDVar.setIconTintList;
            try {
                Object[] objArr2 = {Long.valueOf(MenuHostHelper$$ExternalSyntheticLambda0[jDVar.setIconTintList] ^ MenuHostHelper$$ExternalSyntheticLambda0[jDVar.setIconTintList % i2]), Long.valueOf(jDVar.setX), Long.valueOf(setNavigationOnClickListener)};
                Object obj = jC.setTextScaleX.get(-244088302);
                if (obj == null) {
                    byte b = (byte) ($$h & 5);
                    byte b2 = (byte) (b - 1);
                    Object[] objArr3 = new Object[1];
                    e(b, b2, b2, objArr3);
                    obj = ((Class) jC.setY(277 - (KeyEvent.getMaxKeyCode() >> 16), (char) (42263 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 3 - ExpandableListView.getPackedPositionChild(0L))).getMethod((String) objArr3[0], Long.TYPE, Long.TYPE, Long.TYPE);
                    jC.setTextScaleX.put(-244088302, obj);
                }
                MenuHostHelper$$ExternalSyntheticLambda0[i3] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr4 = {jDVar, jDVar};
                    Object obj2 = jC.setTextScaleX.get(467845792);
                    if (obj2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        Object[] objArr5 = new Object[1];
                        e(b3, b4, b4, objArr5);
                        obj2 = ((Class) jC.setY((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 304, (char) (36289 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 4 - TextUtils.getCapsMode("", 0, 0))).getMethod((String) objArr5[0], Object.class, Object.class);
                        jC.setTextScaleX.put(467845792, obj2);
                    }
                    ((Method) obj2).invoke(null, objArr4);
                    i2 = 4;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(MenuHostHelper$$ExternalSyntheticLambda0, 4, MenuHostHelper$$ExternalSyntheticLambda0.length - 4);
    }
}