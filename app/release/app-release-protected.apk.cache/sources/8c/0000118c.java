package o;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import o.AbstractC0403qj;

/* loaded from: classes.dex */
public final class uK implements Executor, Closeable {
    public static final C0528uy MenuHostHelper$$ExternalSyntheticLambda0;
    private static final /* synthetic */ AtomicIntegerFieldUpdater setCenterIfNoTextEnabled;
    static final /* synthetic */ AtomicLongFieldUpdater setIconTintList;
    private static byte[] setTextAlignment = {42, -75, 2, 31, 16, -5, -2, -15, 7, 4, -34, 18, 8, -15, -6, 1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1};
    public static final int setUiOptions = 175;
    static final /* synthetic */ AtomicLongFieldUpdater setY;
    public final uN MenuHostHelper$$ExternalSyntheticLambda1;
    volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;
    volatile /* synthetic */ long parkedWorkersStack;
    private int setChipCornerRadius;
    public final long setLayoutAnimation;
    public final C0525uv<setY> setNavigationOnClickListener;
    public final uN setOnLongClickListener;
    public final String setUnboundedRipple;
    public final int setX;

    /* loaded from: classes.dex */
    public enum setX {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 7
            int r8 = 106 - r8
            int r9 = r9 + 4
            int r7 = r7 * 3
            int r7 = 16 - r7
            byte[] r0 = o.uK.setTextAlignment
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L32
        L17:
            r3 = 0
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r7) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L32:
            int r9 = r9 + r8
            int r8 = r9 + 2
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.uK.a(byte, short, byte, java.lang.Object[]):void");
    }

    public uK(int i, int i2, long j, String str) {
        this.setX = i;
        this.setChipCornerRadius = i2;
        this.setLayoutAnimation = j;
        this.setUnboundedRipple = str;
        if (!(i > 0)) {
            StringBuilder sb = new StringBuilder("Core pool size ");
            sb.append(i);
            sb.append(" should be at least 1");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (!(i2 >= i)) {
            StringBuilder sb2 = new StringBuilder("Max pool size ");
            sb2.append(i2);
            sb2.append(" should be greater than or equals to core pool size ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        if (!(i2 <= 2097150)) {
            StringBuilder sb3 = new StringBuilder("Max pool size ");
            sb3.append(i2);
            sb3.append(" should not exceed maximal supported number of threads 2097150");
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        if (!(j > 0)) {
            StringBuilder sb4 = new StringBuilder("Idle worker keep alive time ");
            sb4.append(j);
            sb4.append(" must be positive");
            throw new IllegalArgumentException(sb4.toString().toString());
        }
        this.setOnLongClickListener = new uN();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new uN();
        this.parkedWorkersStack = 0L;
        this.setNavigationOnClickListener = new C0525uv<>(i + 1);
        this.controlState = i << 42;
        this._isTerminated = 0;
    }

    static {
        new uK$MenuHostHelper$$ExternalSyntheticLambda0((byte) 0);
        MenuHostHelper$$ExternalSyntheticLambda0 = new C0528uy("NOT_IN_STACK");
        setY = AtomicLongFieldUpdater.newUpdater(uK.class, "parkedWorkersStack");
        setIconTintList = AtomicLongFieldUpdater.newUpdater(uK.class, "controlState");
        setCenterIfNoTextEnabled = AtomicIntegerFieldUpdater.newUpdater(uK.class, "_isTerminated");
    }

    public final void setIconTintList(Runnable runnable, uV uVVar, boolean z) {
        boolean z2;
        setY MenuHostHelper$$ExternalSyntheticLambda02;
        uU iconTintList = setIconTintList(runnable, uVVar);
        uU x = setX(setX(), iconTintList, false);
        if (x != null && !MenuHostHelper$$ExternalSyntheticLambda0(x)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.setUnboundedRipple);
            sb.append(" was terminated");
            throw new RejectedExecutionException(sb.toString());
        } else if (iconTintList.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0() != 0) {
            setX(false);
        } else {
            while (true) {
                setY MenuHostHelper$$ExternalSyntheticLambda03 = MenuHostHelper$$ExternalSyntheticLambda0();
                if (MenuHostHelper$$ExternalSyntheticLambda03 != null) {
                    if (setY.setY.compareAndSet(MenuHostHelper$$ExternalSyntheticLambda03, -1, 0)) {
                        LockSupport.unpark(MenuHostHelper$$ExternalSyntheticLambda03);
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            if (z2 || setY(this.controlState)) {
                return;
            }
            do {
                MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0();
                if (MenuHostHelper$$ExternalSyntheticLambda02 == null) {
                    return;
                }
            } while (!setY.setY.compareAndSet(MenuHostHelper$$ExternalSyntheticLambda02, -1, 0));
            LockSupport.unpark(MenuHostHelper$$ExternalSyntheticLambda02);
        }
    }

    private static uU setIconTintList(Runnable runnable, uV uVVar) {
        long iconTintList = uS.setOnLongClickListener.setIconTintList();
        if (runnable instanceof uU) {
            uU uUVar = (uU) runnable;
            uUVar.setOnLongClickListener = iconTintList;
            uUVar.setLayoutAnimation = uVVar;
            return uUVar;
        }
        return new uR(runnable, iconTintList, uVVar);
    }

    final boolean setY(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        if (i < this.setX) {
            int MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1();
            if (MenuHostHelper$$ExternalSyntheticLambda1 == 1 && this.setX > 1) {
                MenuHostHelper$$ExternalSyntheticLambda1();
            }
            if (MenuHostHelper$$ExternalSyntheticLambda1 > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004d A[Catch: all -> 0x0082, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x000a, B:12:0x0022, B:16:0x0028, B:20:0x002e, B:22:0x0036, B:24:0x0040, B:30:0x004d, B:34:0x0064, B:38:0x006a, B:39:0x0075, B:40:0x0076, B:41:0x0081), top: B:45:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076 A[Catch: all -> 0x0082, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x000a, B:12:0x0022, B:16:0x0028, B:20:0x002e, B:22:0x0036, B:24:0x0040, B:30:0x004d, B:34:0x0064, B:38:0x006a, B:39:0x0075, B:40:0x0076, B:41:0x0081), top: B:45:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int MenuHostHelper$$ExternalSyntheticLambda1() {
        /*
            r10 = this;
            o.uv<o.uK$setY> r0 = r10.setNavigationOnClickListener
            monitor-enter(r0)
            int r1 = r10._isTerminated     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto La
            monitor-exit(r0)
            r0 = -1
            return r0
        La:
            long r1 = r10.controlState     // Catch: java.lang.Throwable -> L82
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r6 = (int) r5     // Catch: java.lang.Throwable -> L82
            r7 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r7
            r5 = 21
            long r1 = r1 >> r5
            int r2 = (int) r1     // Catch: java.lang.Throwable -> L82
            int r1 = r6 - r2
            r2 = 0
            if (r1 >= 0) goto L22
            r1 = 0
        L22:
            int r5 = r10.setX     // Catch: java.lang.Throwable -> L82
            if (r1 < r5) goto L28
            monitor-exit(r0)
            return r2
        L28:
            int r5 = r10.setChipCornerRadius     // Catch: java.lang.Throwable -> L82
            if (r6 < r5) goto L2e
            monitor-exit(r0)
            return r2
        L2e:
            long r5 = r10.controlState     // Catch: java.lang.Throwable -> L82
            long r5 = r5 & r3
            int r6 = (int) r5     // Catch: java.lang.Throwable -> L82
            r5 = 1
            int r6 = r6 + r5
            if (r6 <= 0) goto L4a
            o.uv<o.uK$setY> r7 = r10.setNavigationOnClickListener     // Catch: java.lang.Throwable -> L82
            java.util.concurrent.atomic.AtomicReferenceArray<T> r7 = r7.array     // Catch: java.lang.Throwable -> L82
            int r8 = r7.length()     // Catch: java.lang.Throwable -> L82
            if (r6 >= r8) goto L45
            java.lang.Object r7 = r7.get(r6)     // Catch: java.lang.Throwable -> L82
            goto L46
        L45:
            r7 = 0
        L46:
            if (r7 != 0) goto L4a
            r7 = 1
            goto L4b
        L4a:
            r7 = 0
        L4b:
            if (r7 == 0) goto L76
            o.uK$setY r7 = new o.uK$setY     // Catch: java.lang.Throwable -> L82
            r7.<init>(r10, r6)     // Catch: java.lang.Throwable -> L82
            o.uv<o.uK$setY> r8 = r10.setNavigationOnClickListener     // Catch: java.lang.Throwable -> L82
            r8.setIconTintList(r6, r7)     // Catch: java.lang.Throwable -> L82
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = o.uK.setIconTintList     // Catch: java.lang.Throwable -> L82
            long r8 = r8.incrementAndGet(r10)     // Catch: java.lang.Throwable -> L82
            long r3 = r3 & r8
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L82
            if (r6 != r4) goto L62
            r2 = 1
        L62:
            if (r2 == 0) goto L6a
            r7.start()     // Catch: java.lang.Throwable -> L82
            monitor-exit(r0)
            int r1 = r1 + r5
            return r1
        L6a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = "Failed requirement."
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L82
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L82
            throw r1     // Catch: java.lang.Throwable -> L82
        L76:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = "Failed requirement."
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L82
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L82
            throw r1     // Catch: java.lang.Throwable -> L82
        L82:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.uK.MenuHostHelper$$ExternalSyntheticLambda1():int");
    }

    private static uU setX(setY sety, uU uUVar, boolean z) {
        if (sety == null || sety.MenuHostHelper$$ExternalSyntheticLambda0 == setX.TERMINATED) {
            return uUVar;
        }
        if (uUVar.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0() == 0 && sety.MenuHostHelper$$ExternalSyntheticLambda0 == setX.BLOCKING) {
            return uUVar;
        }
        sety.setIconTintList = true;
        return sety.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(uUVar, z);
    }

    private final setY setX() {
        try {
            byte b = (byte) (setTextAlignment[15] - 1);
            Object[] objArr = new Object[1];
            a(b, b, setTextAlignment[22], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = setTextAlignment[15];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (-b3), objArr2);
            Object invoke = cls.getMethod((String) objArr2[0], null).invoke(null, null);
            setY sety = invoke instanceof setY ? (setY) invoke : null;
            if (sety == null || !pN.MenuHostHelper$$ExternalSyntheticLambda0(uK.this, this)) {
                return null;
            }
            return sety;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int length = this.setNavigationOnClickListener.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i6 < length) {
            AtomicReferenceArray<setY> atomicReferenceArray = this.setNavigationOnClickListener.array;
            setY sety = i6 < atomicReferenceArray.length() ? atomicReferenceArray.get(i6) : null;
            if (sety != null) {
                uW uWVar = sety.MenuHostHelper$$ExternalSyntheticLambda1;
                int i7 = uWVar.lastScheduledTask != null ? (uWVar.producerIndex - uWVar.consumerIndex) + 1 : uWVar.producerIndex - uWVar.consumerIndex;
                int i8 = uK$MenuHostHelper$$ExternalSyntheticLambda1.setY[sety.MenuHostHelper$$ExternalSyntheticLambda0.ordinal()];
                if (i8 == 1) {
                    i3++;
                } else if (i8 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i8 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i8 == 4) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i8 == 5) {
                    i5++;
                }
            }
            i6++;
        }
        long j = this.controlState;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.setUnboundedRipple);
        sb4.append('@');
        sb4.append(rZ.setY(this));
        sb4.append("[Pool Size {core = ");
        sb4.append(this.setX);
        sb4.append(", max = ");
        sb4.append(this.setChipCornerRadius);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(this.setX - ((int) ((9223367638808264704L & j) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public static void setY(uU uUVar) {
        try {
            uUVar.run();
        } catch (Throwable th) {
            byte b = (byte) (setTextAlignment[15] - 1);
            Object[] objArr = new Object[1];
            a(b, b, setTextAlignment[22], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = setTextAlignment[15];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (-b3), objArr2);
            Thread thread = (Thread) cls.getMethod((String) objArr2[0], null).invoke(null, null);
            thread.getUncaughtExceptionHandler().uncaughtException(thread, th);
        }
    }

    /* loaded from: classes.dex */
    public final class setY extends Thread {
        static final /* synthetic */ AtomicIntegerFieldUpdater setY = AtomicIntegerFieldUpdater.newUpdater(setY.class, "workerCtl");
        public setX MenuHostHelper$$ExternalSyntheticLambda0;
        public final uW MenuHostHelper$$ExternalSyntheticLambda1;
        volatile int indexInArray;
        volatile Object nextParkedWorker;
        public boolean setIconTintList;
        private int setNavigationOnClickListener;
        private long setUiOptions;
        private long setX;
        volatile /* synthetic */ int workerCtl;

        private setY() {
            setDaemon(true);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new uW();
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setX.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = uK.MenuHostHelper$$ExternalSyntheticLambda0;
            AbstractC0403qj.setIconTintList seticontintlist = AbstractC0403qj.MenuHostHelper$$ExternalSyntheticLambda0;
            this.setNavigationOnClickListener = AbstractC0403qj.MenuHostHelper$$ExternalSyntheticLambda1.setX();
        }

        private void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(uK.this.setUnboundedRipple);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public setY(uK uKVar, int i) {
            this();
            MenuHostHelper$$ExternalSyntheticLambda0(i);
        }

        private final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
            boolean z;
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 != setX.CPU_ACQUIRED) {
                uK uKVar = uK.this;
                while (true) {
                    long j = uKVar.controlState;
                    if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                        if (uK.setIconTintList.compareAndSet(uKVar, j, j - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0 = setX.CPU_ACQUIRED;
            }
            return true;
        }

        public final boolean MenuHostHelper$$ExternalSyntheticLambda1(setX setx) {
            setX setx2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            boolean z = setx2 == setX.CPU_ACQUIRED;
            if (z) {
                uK.setIconTintList.addAndGet(uK.this, 4398046511104L);
            }
            if (setx2 != setx) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = setx;
            }
            return z;
        }

        private int setY(int i) {
            int i2 = this.setNavigationOnClickListener;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.setNavigationOnClickListener = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
            if (r0 == null) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o.uU setIconTintList(boolean r3) {
            /*
                r2 = this;
                boolean r0 = r2.MenuHostHelper$$ExternalSyntheticLambda1()
                if (r0 == 0) goto Lb
                o.uU r3 = r2.MenuHostHelper$$ExternalSyntheticLambda0(r3)
                return r3
            Lb:
                if (r3 == 0) goto L20
                o.uW r3 = r2.MenuHostHelper$$ExternalSyntheticLambda1
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o.uW.MenuHostHelper$$ExternalSyntheticLambda1
                r1 = 0
                java.lang.Object r0 = r0.getAndSet(r3, r1)
                o.uU r0 = (o.uU) r0
                if (r0 != 0) goto L1e
                o.uU r0 = r3.setY()
            L1e:
                if (r0 != 0) goto L2b
            L20:
                o.uK r3 = o.uK.this
                o.uN r3 = r3.MenuHostHelper$$ExternalSyntheticLambda1
                java.lang.Object r3 = r3.MenuHostHelper$$ExternalSyntheticLambda1()
                r0 = r3
                o.uU r0 = (o.uU) r0
            L2b:
                if (r0 != 0) goto L32
                r3 = 1
                o.uU r0 = r2.setX(r3)
            L32:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.uK.setY.setIconTintList(boolean):o.uU");
        }

        private final uU MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
            uU x;
            uU x2;
            if (z) {
                boolean z2 = setY(uK.this.setX << 1) == 0;
                if (z2 && (x2 = setX()) != null) {
                    return x2;
                }
                uW uWVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
                uU uUVar = (uU) uW.MenuHostHelper$$ExternalSyntheticLambda1.getAndSet(uWVar, null);
                if (uUVar == null) {
                    uUVar = uWVar.setY();
                }
                if (uUVar != null) {
                    return uUVar;
                }
                if (!z2 && (x = setX()) != null) {
                    return x;
                }
            } else {
                uU x3 = setX();
                if (x3 != null) {
                    return x3;
                }
            }
            return setX(false);
        }

        private final uU setX() {
            if (setY(2) == 0) {
                uU MenuHostHelper$$ExternalSyntheticLambda1 = uK.this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1();
                return MenuHostHelper$$ExternalSyntheticLambda1 != null ? MenuHostHelper$$ExternalSyntheticLambda1 : uK.this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
            }
            uU MenuHostHelper$$ExternalSyntheticLambda12 = uK.this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
            return MenuHostHelper$$ExternalSyntheticLambda12 != null ? MenuHostHelper$$ExternalSyntheticLambda12 : uK.this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1();
        }

        private final uU setX(boolean z) {
            long y;
            rX.setIconTintList();
            int i = (int) (uK.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int y2 = setY(i);
            uK uKVar = uK.this;
            long j = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                y2++;
                if (y2 > i) {
                    y2 = 1;
                }
                AtomicReferenceArray<setY> atomicReferenceArray = uKVar.setNavigationOnClickListener.array;
                setY sety = y2 < atomicReferenceArray.length() ? atomicReferenceArray.get(y2) : null;
                if (sety != null && sety != this) {
                    rX.setIconTintList();
                    if (z) {
                        y = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(sety.MenuHostHelper$$ExternalSyntheticLambda1);
                    } else {
                        y = this.MenuHostHelper$$ExternalSyntheticLambda1.setY(sety.MenuHostHelper$$ExternalSyntheticLambda1);
                    }
                    if (y == -1) {
                        uW uWVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
                        uU uUVar = (uU) uW.MenuHostHelper$$ExternalSyntheticLambda1.getAndSet(uWVar, null);
                        return uUVar == null ? uWVar.setY() : uUVar;
                    } else if (y > 0) {
                        j = Math.min(j, y);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.setX = j;
            return null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            long j;
            int i;
            loop0: while (true) {
                boolean z = true;
                boolean z2 = false;
                while (uK.this._isTerminated == 0 && this.MenuHostHelper$$ExternalSyntheticLambda0 != setX.TERMINATED) {
                    uU iconTintList = setIconTintList(this.setIconTintList);
                    if (iconTintList != null) {
                        this.setX = 0L;
                        int MenuHostHelper$$ExternalSyntheticLambda0 = iconTintList.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0();
                        this.setUiOptions = 0L;
                        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == setX.PARKING) {
                            rX.setIconTintList();
                            this.MenuHostHelper$$ExternalSyntheticLambda0 = setX.BLOCKING;
                        }
                        if (MenuHostHelper$$ExternalSyntheticLambda0 != 0 && MenuHostHelper$$ExternalSyntheticLambda1(setX.BLOCKING)) {
                            uK uKVar = uK.this;
                            while (true) {
                                setY MenuHostHelper$$ExternalSyntheticLambda02 = uKVar.MenuHostHelper$$ExternalSyntheticLambda0();
                                if (MenuHostHelper$$ExternalSyntheticLambda02 != null) {
                                    if (setY.compareAndSet(MenuHostHelper$$ExternalSyntheticLambda02, -1, 0)) {
                                        LockSupport.unpark(MenuHostHelper$$ExternalSyntheticLambda02);
                                        break;
                                    }
                                } else {
                                    z = false;
                                    break;
                                }
                            }
                            if (!z && !uKVar.setY(uKVar.controlState)) {
                                while (true) {
                                    setY MenuHostHelper$$ExternalSyntheticLambda03 = uKVar.MenuHostHelper$$ExternalSyntheticLambda0();
                                    if (MenuHostHelper$$ExternalSyntheticLambda03 != null) {
                                        if (setY.compareAndSet(MenuHostHelper$$ExternalSyntheticLambda03, -1, 0)) {
                                            LockSupport.unpark(MenuHostHelper$$ExternalSyntheticLambda03);
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                        uK.setY(iconTintList);
                        if (MenuHostHelper$$ExternalSyntheticLambda0 != 0) {
                            uK.setIconTintList.addAndGet(uK.this, -2097152L);
                            if (this.MenuHostHelper$$ExternalSyntheticLambda0 != setX.TERMINATED) {
                                rX.setIconTintList();
                                this.MenuHostHelper$$ExternalSyntheticLambda0 = setX.DORMANT;
                            }
                        }
                    } else {
                        this.setIconTintList = false;
                        if (this.setX == 0) {
                            if (!(this.nextParkedWorker != uK.MenuHostHelper$$ExternalSyntheticLambda0)) {
                                uK uKVar2 = uK.this;
                                if (this.nextParkedWorker == uK.MenuHostHelper$$ExternalSyntheticLambda0) {
                                    do {
                                        j = uKVar2.parkedWorkersStack;
                                        int i2 = (int) (j & 2097151);
                                        i = this.indexInArray;
                                        rX.setIconTintList();
                                        AtomicReferenceArray<setY> atomicReferenceArray = uKVar2.setNavigationOnClickListener.array;
                                        this.nextParkedWorker = i2 < atomicReferenceArray.length() ? atomicReferenceArray.get(i2) : null;
                                    } while (!uK.setY.compareAndSet(uKVar2, j, i | ((2097152 + j) & (-2097152))));
                                }
                            } else {
                                rX.setIconTintList();
                                this.workerCtl = -1;
                                while (true) {
                                    if ((this.nextParkedWorker != uK.MenuHostHelper$$ExternalSyntheticLambda0) && this.workerCtl == -1 && uK.this._isTerminated == 0 && this.MenuHostHelper$$ExternalSyntheticLambda0 != setX.TERMINATED) {
                                        MenuHostHelper$$ExternalSyntheticLambda1(setX.PARKING);
                                        Thread.interrupted();
                                        if (this.setUiOptions == 0) {
                                            this.setUiOptions = System.nanoTime() + uK.this.setLayoutAnimation;
                                        }
                                        LockSupport.parkNanos(uK.this.setLayoutAnimation);
                                        if (System.nanoTime() - this.setUiOptions >= 0) {
                                            this.setUiOptions = 0L;
                                            C0525uv<setY> c0525uv = uK.this.setNavigationOnClickListener;
                                            uK uKVar3 = uK.this;
                                            synchronized (c0525uv) {
                                                if (uKVar3._isTerminated == 0) {
                                                    if (((int) (uKVar3.controlState & 2097151)) > uKVar3.setX) {
                                                        if (setY.compareAndSet(this, -1, 1)) {
                                                            int i3 = this.indexInArray;
                                                            MenuHostHelper$$ExternalSyntheticLambda0(0);
                                                            uKVar3.setX(this, i3, 0);
                                                            int andDecrement = (int) (uK.setIconTintList.getAndDecrement(uKVar3) & 2097151);
                                                            if (andDecrement != i3) {
                                                                AtomicReferenceArray<setY> atomicReferenceArray2 = uKVar3.setNavigationOnClickListener.array;
                                                                setY sety = andDecrement < atomicReferenceArray2.length() ? atomicReferenceArray2.get(andDecrement) : null;
                                                                pN.setX(sety);
                                                                setY sety2 = sety;
                                                                uKVar3.setNavigationOnClickListener.setIconTintList(i3, sety2);
                                                                sety2.MenuHostHelper$$ExternalSyntheticLambda0(i3);
                                                                uKVar3.setX(sety2, andDecrement, i3);
                                                            }
                                                            uKVar3.setNavigationOnClickListener.setIconTintList(andDecrement, null);
                                                            nX nXVar = nX.setX;
                                                            this.MenuHostHelper$$ExternalSyntheticLambda0 = setX.TERMINATED;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (z2) {
                            MenuHostHelper$$ExternalSyntheticLambda1(setX.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.setX);
                            this.setX = 0L;
                        } else {
                            z2 = true;
                        }
                    }
                }
            }
            MenuHostHelper$$ExternalSyntheticLambda1(setX.TERMINATED);
        }
    }

    private final boolean MenuHostHelper$$ExternalSyntheticLambda0(uU uUVar) {
        if (uUVar.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0() == 1) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1.setX(uUVar);
        }
        return this.setOnLongClickListener.setX(uUVar);
    }

    public final void setX(setY sety, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            if (i3 == i) {
                i3 = i2 == 0 ? MenuHostHelper$$ExternalSyntheticLambda0(sety) : i2;
            }
            if (i3 >= 0 && setY.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | i3)) {
                return;
            }
        }
    }

    final setY MenuHostHelper$$ExternalSyntheticLambda0() {
        while (true) {
            long j = this.parkedWorkersStack;
            int i = (int) (2097151 & j);
            AtomicReferenceArray<setY> atomicReferenceArray = this.setNavigationOnClickListener.array;
            setY sety = i < atomicReferenceArray.length() ? atomicReferenceArray.get(i) : null;
            if (sety == null) {
                return null;
            }
            int MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0(sety);
            if (MenuHostHelper$$ExternalSyntheticLambda02 >= 0 && setY.compareAndSet(this, j, MenuHostHelper$$ExternalSyntheticLambda02 | ((2097152 + j) & (-2097152)))) {
                sety.nextParkedWorker = MenuHostHelper$$ExternalSyntheticLambda0;
                return sety;
            }
        }
    }

    private final void setX(boolean z) {
        boolean z2;
        setY MenuHostHelper$$ExternalSyntheticLambda02;
        long addAndGet = setIconTintList.addAndGet(this, 2097152L);
        if (z) {
            return;
        }
        while (true) {
            setY MenuHostHelper$$ExternalSyntheticLambda03 = MenuHostHelper$$ExternalSyntheticLambda0();
            if (MenuHostHelper$$ExternalSyntheticLambda03 != null) {
                if (setY.setY.compareAndSet(MenuHostHelper$$ExternalSyntheticLambda03, -1, 0)) {
                    LockSupport.unpark(MenuHostHelper$$ExternalSyntheticLambda03);
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2 || setY(addAndGet)) {
            return;
        }
        do {
            MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0();
            if (MenuHostHelper$$ExternalSyntheticLambda02 == null) {
                return;
            }
        } while (!setY.setY.compareAndSet(MenuHostHelper$$ExternalSyntheticLambda02, -1, 0));
        LockSupport.unpark(MenuHostHelper$$ExternalSyntheticLambda02);
    }

    private static int MenuHostHelper$$ExternalSyntheticLambda0(setY sety) {
        Object obj = sety.nextParkedWorker;
        while (obj != MenuHostHelper$$ExternalSyntheticLambda0) {
            if (obj == null) {
                return 0;
            }
            setY sety2 = (setY) obj;
            int i = sety2.indexInArray;
            if (i != 0) {
                return i;
            }
            obj = sety2.nextParkedWorker;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[LOOP:0: B:11:0x001c->B:29:0x006c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006f A[EDGE_INSN: B:49:0x006f->B:30:0x006f ?: BREAK  , SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = o.uK.setCenterIfNoTextEnabled
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r10, r1, r2)
            if (r0 == 0) goto Lad
            o.uK$setY r0 = r10.setX()
            o.uv<o.uK$setY> r3 = r10.setNavigationOnClickListener
            monitor-enter(r3)
            long r4 = r10.controlState     // Catch: java.lang.Throwable -> Laa
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r3)
            if (r5 <= 0) goto L6f
            r3 = 1
        L1c:
            o.uv<o.uK$setY> r4 = r10.setNavigationOnClickListener
            java.util.concurrent.atomic.AtomicReferenceArray<T> r4 = r4.array
            int r6 = r4.length()
            r7 = 0
            if (r3 >= r6) goto L2c
            java.lang.Object r4 = r4.get(r3)
            goto L2d
        L2c:
            r4 = r7
        L2d:
            o.pN.setX(r4)
            o.uK$setY r4 = (o.uK.setY) r4
            if (r4 == r0) goto L6a
        L34:
            boolean r6 = r4.isAlive()
            if (r6 == 0) goto L46
            r6 = r4
            java.lang.Thread r6 = (java.lang.Thread) r6
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r8 = 10000(0x2710, double:4.9407E-320)
            r4.join(r8)
            goto L34
        L46:
            o.uK$setX r6 = r4.MenuHostHelper$$ExternalSyntheticLambda0
            o.rX.setIconTintList()
            o.uW r4 = r4.MenuHostHelper$$ExternalSyntheticLambda1
            o.uN r6 = r10.MenuHostHelper$$ExternalSyntheticLambda1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = o.uW.MenuHostHelper$$ExternalSyntheticLambda1
            java.lang.Object r7 = r8.getAndSet(r4, r7)
            o.uU r7 = (o.uU) r7
            if (r7 == 0) goto L5c
            r6.setX(r7)
        L5c:
            o.uU r7 = r4.setY()
            if (r7 != 0) goto L64
            r7 = 0
            goto L68
        L64:
            r6.setX(r7)
            r7 = 1
        L68:
            if (r7 != 0) goto L5c
        L6a:
            if (r3 == r5) goto L6f
            int r3 = r3 + 1
            goto L1c
        L6f:
            o.uN r1 = r10.MenuHostHelper$$ExternalSyntheticLambda1
            r1.setX()
            o.uN r1 = r10.setOnLongClickListener
            r1.setX()
        L79:
            if (r0 == 0) goto L81
            o.uU r1 = r0.setIconTintList(r2)
            if (r1 != 0) goto La6
        L81:
            o.uN r1 = r10.setOnLongClickListener
            java.lang.Object r1 = r1.MenuHostHelper$$ExternalSyntheticLambda1()
            o.uU r1 = (o.uU) r1
            if (r1 != 0) goto La6
            o.uN r1 = r10.MenuHostHelper$$ExternalSyntheticLambda1
            java.lang.Object r1 = r1.MenuHostHelper$$ExternalSyntheticLambda1()
            o.uU r1 = (o.uU) r1
            if (r1 != 0) goto La6
            if (r0 == 0) goto L9c
            o.uK$setX r1 = o.uK.setX.TERMINATED
            r0.MenuHostHelper$$ExternalSyntheticLambda1(r1)
        L9c:
            o.rX.setIconTintList()
            r0 = 0
            r10.parkedWorkersStack = r0
            r10.controlState = r0
            return
        La6:
            setY(r1)
            goto L79
        Laa:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.uK.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        setIconTintList(runnable, uS.setY, false);
    }
}