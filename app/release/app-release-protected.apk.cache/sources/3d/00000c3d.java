package o;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class setHorizontalScrollBarEnabled<V> implements M<V> {
    private static final Object setUnboundedRipple;
    static final setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda1 setY;
    public volatile Object MenuHostHelper$$ExternalSyntheticLambda0;
    volatile setUiOptions setIconTintList;
    volatile setX setX;
    private static byte[] setNavigationOnClickListener = {119, -93, -18, -42, 16, -5, -2, -15, 7, 4, -34, 18, 8, -15, -6, 1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1};
    public static final int setOnLongClickListener = 197;
    static final boolean MenuHostHelper$$ExternalSyntheticLambda1 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger setUiOptions = Logger.getLogger(setHorizontalScrollBarEnabled.class.getName());

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x003b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 12
            int r8 = r8 + 4
            int r9 = r9 * 3
            int r9 = 16 - r9
            byte[] r0 = o.setHorizontalScrollBarEnabled.setNavigationOnClickListener
            int r7 = r7 * 7
            int r7 = 106 - r7
            byte[] r1 = new byte[r9]
            int r9 = r9 + (-1)
            r2 = 0
            if (r0 != 0) goto L1c
            r7 = r8
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L3b
        L1c:
            r3 = 0
        L1d:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r9) goto L2d
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2d:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L3b:
            int r8 = r8 + 1
            int r7 = r7 + r9
            int r7 = r7 + 2
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setHorizontalScrollBarEnabled.a(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T setX(T t) {
        return t;
    }

    protected void setX() {
    }

    static {
        setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda1 setlayoutanimation;
        try {
            byte b = setNavigationOnClickListener[15];
            Object[] objArr = new Object[1];
            a((byte) (setNavigationOnClickListener[15] - 1), b, (byte) (b - 1), objArr);
            setlayoutanimation = new setY(AtomicReferenceFieldUpdater.newUpdater(setUiOptions.class, Class.forName((String) objArr[0]), "setY"), AtomicReferenceFieldUpdater.newUpdater(setUiOptions.class, setUiOptions.class, "MenuHostHelper$$ExternalSyntheticLambda1"), AtomicReferenceFieldUpdater.newUpdater(setHorizontalScrollBarEnabled.class, setUiOptions.class, "setIconTintList"), AtomicReferenceFieldUpdater.newUpdater(setHorizontalScrollBarEnabled.class, setX.class, "setX"), AtomicReferenceFieldUpdater.newUpdater(setHorizontalScrollBarEnabled.class, Object.class, "MenuHostHelper$$ExternalSyntheticLambda0"));
            th = null;
        } catch (Throwable th) {
            th = th;
            setlayoutanimation = new setLayoutAnimation();
        }
        setY = setlayoutanimation;
        if (th != null) {
            setUiOptions.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        setUnboundedRipple = new Object();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setUiOptions {
        volatile setUiOptions MenuHostHelper$$ExternalSyntheticLambda1;
        volatile Thread setY;
        private static byte[] setX = {119, -93, -18, -42, -16, 5, 2, 15, -7, -4, 34, -18, -8, 15, 6, -1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -36, -18, -8, 15, 6, -1};
        public static final int setIconTintList = 73;
        static final setUiOptions MenuHostHelper$$ExternalSyntheticLambda0 = new setUiOptions((byte) 0);

        /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x0036). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = o.setHorizontalScrollBarEnabled.setUiOptions.setX
                int r7 = r7 * 3
                int r7 = 16 - r7
                int r8 = r8 * 12
                int r8 = r8 + 4
                int r6 = r6 * 7
                int r6 = r6 + 99
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L1a
                r6 = r7
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r9
                r9 = r8
                goto L36
            L1a:
                r3 = 0
                r5 = r7
                r7 = r6
                r6 = r5
            L1e:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L2d
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2d:
                r4 = r0[r8]
                r5 = r9
                r9 = r8
                r8 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r5
            L36:
                int r7 = r7 - r8
                int r8 = r9 + 1
                int r7 = r7 + 2
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L1e
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setHorizontalScrollBarEnabled.setUiOptions.a(byte, byte, short, java.lang.Object[]):void");
        }

        private setUiOptions(byte b) {
        }

        setUiOptions() {
            setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda1 sethorizontalscrollbarenabled_menuhosthelper__externalsyntheticlambda1 = setHorizontalScrollBarEnabled.setY;
            try {
                byte b = (byte) (-setX[15]);
                Object[] objArr = new Object[1];
                a(b, (byte) (b - 1), (byte) (-setX[15]), objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                byte b2 = (byte) (-setX[15]);
                Object[] objArr2 = new Object[1];
                a((byte) (setX[15] + 1), b2, (byte) (b2 - 1), objArr2);
                sethorizontalscrollbarenabled_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0(this, (Thread) cls.getMethod((String) objArr2[0], null).invoke(null, null));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    private void setIconTintList(setUiOptions setuioptions) {
        setuioptions.setY = null;
        while (true) {
            setUiOptions setuioptions2 = this.setIconTintList;
            if (setuioptions2 == setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0) {
                return;
            }
            setUiOptions setuioptions3 = null;
            while (setuioptions2 != null) {
                setUiOptions setuioptions4 = setuioptions2.MenuHostHelper$$ExternalSyntheticLambda1;
                if (setuioptions2.setY != null) {
                    setuioptions3 = setuioptions2;
                } else if (setuioptions3 != null) {
                    setuioptions3.MenuHostHelper$$ExternalSyntheticLambda1 = setuioptions4;
                    if (setuioptions3.setY == null) {
                        break;
                    }
                } else if (setY.MenuHostHelper$$ExternalSyntheticLambda0(this, setuioptions2, setuioptions4)) {
                }
                setuioptions2 = setuioptions4;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setX {
        static final setX setY = new setX();
        final Runnable MenuHostHelper$$ExternalSyntheticLambda1 = null;
        final Executor setIconTintList = null;
        setX setX;

        private setX() {
        }
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList {
        static final setIconTintList setIconTintList;
        static final setIconTintList setY;
        final Throwable MenuHostHelper$$ExternalSyntheticLambda1;
        public final boolean setX;

        static {
            if (setHorizontalScrollBarEnabled.MenuHostHelper$$ExternalSyntheticLambda1) {
                setY = null;
                setIconTintList = null;
                return;
            }
            setY = new setIconTintList(false, null);
            setIconTintList = new setIconTintList(true, null);
        }

        setIconTintList(boolean z, Throwable th) {
            this.setX = z;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setUnboundedRipple<V> implements Runnable {
        final setHorizontalScrollBarEnabled<V> MenuHostHelper$$ExternalSyntheticLambda1;
        final M<? extends V> setX;

        @Override // java.lang.Runnable
        public final void run() {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 != this) {
                return;
            }
            if (setHorizontalScrollBarEnabled.setY.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, this, setHorizontalScrollBarEnabled.setX((M<?>) this.setX))) {
                setHorizontalScrollBarEnabled.setIconTintList((setHorizontalScrollBarEnabled<?>) this.MenuHostHelper$$ExternalSyntheticLambda1);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if ((obj != null) & (!(obj instanceof setUnboundedRipple))) {
            return (V) MenuHostHelper$$ExternalSyntheticLambda1(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            setUiOptions setuioptions = this.setIconTintList;
            if (setuioptions != setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0) {
                setUiOptions setuioptions2 = new setUiOptions();
                do {
                    setY.setX(setuioptions2, setuioptions);
                    if (setY.MenuHostHelper$$ExternalSyntheticLambda0(this, setuioptions, setuioptions2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                setIconTintList(setuioptions2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                            if ((obj2 != null) & (!(obj2 instanceof setUnboundedRipple))) {
                                return (V) MenuHostHelper$$ExternalSyntheticLambda1(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        setIconTintList(setuioptions2);
                    } else {
                        setuioptions = this.setIconTintList;
                    }
                } while (setuioptions != setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0);
                return (V) MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0);
            }
            return (V) MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        while (nanos > 0) {
            Object obj3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if ((obj3 != null) & (!(obj3 instanceof setUnboundedRipple))) {
                return (V) MenuHostHelper$$ExternalSyntheticLambda1(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String obj4 = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder("Waited ");
        sb.append(j);
        sb.append(" ");
        sb.append(timeUnit.toString().toLowerCase(Locale.ROOT));
        String obj5 = sb.toString();
        if (nanos + 1000 < 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj5);
            sb2.append(" (plus ");
            String obj6 = sb2.toString();
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            int i = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
            boolean z = i == 0 || nanos2 > 1000;
            if (i > 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(obj6);
                sb3.append(convert);
                sb3.append(" ");
                sb3.append(lowerCase);
                String obj7 = sb3.toString();
                if (z) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(obj7);
                    sb4.append(",");
                    obj7 = sb4.toString();
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append(obj7);
                sb5.append(" ");
                obj6 = sb5.toString();
            }
            if (z) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(obj6);
                sb6.append(nanos2);
                sb6.append(" nanoseconds ");
                obj6 = sb6.toString();
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append(obj6);
            sb7.append("delay)");
            obj5 = sb7.toString();
        }
        if (isDone()) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append(obj5);
            sb8.append(" but future completed as timeout expired");
            throw new TimeoutException(sb8.toString());
        }
        StringBuilder sb9 = new StringBuilder();
        sb9.append(obj5);
        sb9.append(" for ");
        sb9.append(obj4);
        throw new TimeoutException(sb9.toString());
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if ((obj2 != null) & (!(obj2 instanceof setUnboundedRipple))) {
            return (V) MenuHostHelper$$ExternalSyntheticLambda1(obj2);
        }
        setUiOptions setuioptions = this.setIconTintList;
        if (setuioptions != setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0) {
            setUiOptions setuioptions2 = new setUiOptions();
            do {
                setY.setX(setuioptions2, setuioptions);
                if (setY.MenuHostHelper$$ExternalSyntheticLambda0(this, setuioptions, setuioptions2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            setIconTintList(setuioptions2);
                            throw new InterruptedException();
                        }
                        obj = this.MenuHostHelper$$ExternalSyntheticLambda0;
                    } while (!((obj != null) & (!(obj instanceof setUnboundedRipple))));
                    return (V) MenuHostHelper$$ExternalSyntheticLambda1(obj);
                }
                setuioptions = this.setIconTintList;
            } while (setuioptions != setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0);
            return (V) MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        return (V) MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static V MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        if (obj instanceof setIconTintList) {
            Throwable th = ((setIconTintList) obj).MenuHostHelper$$ExternalSyntheticLambda1;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda0) {
            throw new ExecutionException(((setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda0) obj).MenuHostHelper$$ExternalSyntheticLambda0);
        } else {
            if (obj == setUnboundedRipple) {
                return null;
            }
            return obj;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.MenuHostHelper$$ExternalSyntheticLambda0;
        return (!(obj instanceof setUnboundedRipple)) & (obj != null);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0 instanceof setIconTintList;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        setIconTintList seticontintlist;
        Object obj = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if ((obj == null) || (obj instanceof setUnboundedRipple)) {
            if (MenuHostHelper$$ExternalSyntheticLambda1) {
                seticontintlist = new setIconTintList(z, new CancellationException("Future.cancel() was called."));
            } else if (z) {
                seticontintlist = setIconTintList.setIconTintList;
            } else {
                seticontintlist = setIconTintList.setY;
            }
            boolean z2 = false;
            setHorizontalScrollBarEnabled<V> sethorizontalscrollbarenabled = this;
            while (true) {
                if (setY.setY(sethorizontalscrollbarenabled, obj, seticontintlist)) {
                    setIconTintList((setHorizontalScrollBarEnabled<?>) sethorizontalscrollbarenabled);
                    if (!(obj instanceof setUnboundedRipple)) {
                        break;
                    }
                    M<? extends V> m = ((setUnboundedRipple) obj).setX;
                    if (m instanceof setHorizontalScrollBarEnabled) {
                        sethorizontalscrollbarenabled = (setHorizontalScrollBarEnabled) m;
                        obj = sethorizontalscrollbarenabled.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (!(obj == null) && !(obj instanceof setUnboundedRipple)) {
                            break;
                        }
                        z2 = true;
                    } else {
                        m.cancel(z);
                        break;
                    }
                } else {
                    obj = sethorizontalscrollbarenabled.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (!(obj instanceof setUnboundedRipple)) {
                        return z2;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(V v) {
        if (v == null) {
            v = (V) setUnboundedRipple;
        }
        if (setY.setY(this, null, v)) {
            setIconTintList((setHorizontalScrollBarEnabled<?>) this);
            return true;
        }
        return false;
    }

    public final boolean setIconTintList(Throwable th) {
        if (setY.setY(this, null, new setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda0(th))) {
            setIconTintList((setHorizontalScrollBarEnabled<?>) this);
            return true;
        }
        return false;
    }

    static Object setX(M<?> m) {
        if (m instanceof setHorizontalScrollBarEnabled) {
            Object obj = ((setHorizontalScrollBarEnabled) m).MenuHostHelper$$ExternalSyntheticLambda0;
            if (obj instanceof setIconTintList) {
                setIconTintList seticontintlist = (setIconTintList) obj;
                return seticontintlist.setX ? seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 != null ? new setIconTintList(false, seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1) : setIconTintList.setY : obj;
            }
            return obj;
        }
        boolean isCancelled = m.isCancelled();
        if ((!MenuHostHelper$$ExternalSyntheticLambda1) & isCancelled) {
            return setIconTintList.setY;
        }
        try {
            Object y = setY(m);
            return y == null ? setUnboundedRipple : y;
        } catch (CancellationException e) {
            if (!isCancelled) {
                StringBuilder sb = new StringBuilder("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb.append(m);
                return new setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda0(new IllegalArgumentException(sb.toString(), e));
            }
            return new setIconTintList(false, e);
        } catch (ExecutionException e2) {
            return new setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda0(e2.getCause());
        } catch (Throwable th) {
            return new setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda0(th);
        }
    }

    private static <V> V setY(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    try {
                        byte b = setNavigationOnClickListener[15];
                        Object[] objArr = new Object[1];
                        a((byte) (setNavigationOnClickListener[15] - 1), b, (byte) (b - 1), objArr);
                        Class<?> cls = Class.forName((String) objArr[0]);
                        byte b2 = setNavigationOnClickListener[15];
                        Object[] objArr2 = new Object[1];
                        a(b2, (byte) (b2 - 1), setNavigationOnClickListener[15], objArr2);
                        ((Thread) cls.getMethod((String) objArr2[0], null).invoke(null, null)).interrupt();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    }
                }
                throw th;
            }
        }
        if (z) {
            try {
                byte b3 = setNavigationOnClickListener[15];
                Object[] objArr3 = new Object[1];
                a((byte) (setNavigationOnClickListener[15] - 1), b3, (byte) (b3 - 1), objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                byte b4 = setNavigationOnClickListener[15];
                Object[] objArr4 = new Object[1];
                a(b4, (byte) (b4 - 1), setNavigationOnClickListener[15], objArr4);
                ((Thread) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).interrupt();
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        }
        return v;
    }

    public String toString() {
        String obj;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            MenuHostHelper$$ExternalSyntheticLambda0(sb);
        } else {
            try {
                Object obj2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (obj2 instanceof setUnboundedRipple) {
                    StringBuilder sb2 = new StringBuilder("setFuture=[");
                    M<? extends V> m = ((setUnboundedRipple) obj2).setX;
                    sb2.append(m == this ? "this future" : String.valueOf(m));
                    sb2.append("]");
                    obj = sb2.toString();
                } else if (this instanceof ScheduledFuture) {
                    StringBuilder sb3 = new StringBuilder("remaining delay=[");
                    sb3.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
                    sb3.append(" ms]");
                    obj = sb3.toString();
                } else {
                    obj = null;
                }
            } catch (RuntimeException e) {
                StringBuilder sb4 = new StringBuilder("Exception thrown from implementation: ");
                sb4.append(e.getClass());
                obj = sb4.toString();
            }
            if (obj != null && !obj.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(obj);
                sb.append("]");
            } else if (isDone()) {
                MenuHostHelper$$ExternalSyntheticLambda0(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(StringBuilder sb) {
        try {
            Object y = setY(this);
            sb.append("SUCCESS, result=[");
            sb.append(y == this ? "this future" : String.valueOf(y));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    /* loaded from: classes.dex */
    static final class setY extends setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda1 {
        final AtomicReferenceFieldUpdater<setUiOptions, setUiOptions> MenuHostHelper$$ExternalSyntheticLambda0;
        final AtomicReferenceFieldUpdater<setHorizontalScrollBarEnabled, setX> MenuHostHelper$$ExternalSyntheticLambda1;
        final AtomicReferenceFieldUpdater<setUiOptions, Thread> setIconTintList;
        final AtomicReferenceFieldUpdater<setHorizontalScrollBarEnabled, Object> setX;
        final AtomicReferenceFieldUpdater<setHorizontalScrollBarEnabled, setUiOptions> setY;

        setY(AtomicReferenceFieldUpdater<setUiOptions, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<setUiOptions, setUiOptions> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<setHorizontalScrollBarEnabled, setUiOptions> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<setHorizontalScrollBarEnabled, setX> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<setHorizontalScrollBarEnabled, Object> atomicReferenceFieldUpdater5) {
            super((byte) 0);
            this.setIconTintList = atomicReferenceFieldUpdater;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = atomicReferenceFieldUpdater2;
            this.setY = atomicReferenceFieldUpdater3;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = atomicReferenceFieldUpdater4;
            this.setX = atomicReferenceFieldUpdater5;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda1
        public final void MenuHostHelper$$ExternalSyntheticLambda0(setUiOptions setuioptions, Thread thread) {
            this.setIconTintList.lazySet(setuioptions, thread);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda1
        public final void setX(setUiOptions setuioptions, setUiOptions setuioptions2) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.lazySet(setuioptions, setuioptions2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda1
        public final boolean MenuHostHelper$$ExternalSyntheticLambda0(setHorizontalScrollBarEnabled<?> sethorizontalscrollbarenabled, setUiOptions setuioptions, setUiOptions setuioptions2) {
            AtomicReferenceFieldUpdater<setHorizontalScrollBarEnabled, setUiOptions> atomicReferenceFieldUpdater = this.setY;
            while (!atomicReferenceFieldUpdater.compareAndSet(sethorizontalscrollbarenabled, setuioptions, setuioptions2)) {
                if (atomicReferenceFieldUpdater.get(sethorizontalscrollbarenabled) != setuioptions) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda1
        public final boolean MenuHostHelper$$ExternalSyntheticLambda1(setHorizontalScrollBarEnabled<?> sethorizontalscrollbarenabled, setX setx, setX setx2) {
            AtomicReferenceFieldUpdater<setHorizontalScrollBarEnabled, setX> atomicReferenceFieldUpdater = this.MenuHostHelper$$ExternalSyntheticLambda1;
            while (!atomicReferenceFieldUpdater.compareAndSet(sethorizontalscrollbarenabled, setx, setx2)) {
                if (atomicReferenceFieldUpdater.get(sethorizontalscrollbarenabled) != setx) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda1
        public final boolean setY(setHorizontalScrollBarEnabled<?> sethorizontalscrollbarenabled, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<setHorizontalScrollBarEnabled, Object> atomicReferenceFieldUpdater = this.setX;
            while (!atomicReferenceFieldUpdater.compareAndSet(sethorizontalscrollbarenabled, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(sethorizontalscrollbarenabled) != obj) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    static final class setLayoutAnimation extends setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda1 {
        setLayoutAnimation() {
            super((byte) 0);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda1
        public final void MenuHostHelper$$ExternalSyntheticLambda0(setUiOptions setuioptions, Thread thread) {
            setuioptions.setY = thread;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda1
        public final void setX(setUiOptions setuioptions, setUiOptions setuioptions2) {
            setuioptions.MenuHostHelper$$ExternalSyntheticLambda1 = setuioptions2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda1
        public final boolean MenuHostHelper$$ExternalSyntheticLambda0(setHorizontalScrollBarEnabled<?> sethorizontalscrollbarenabled, setUiOptions setuioptions, setUiOptions setuioptions2) {
            synchronized (sethorizontalscrollbarenabled) {
                if (sethorizontalscrollbarenabled.setIconTintList == setuioptions) {
                    sethorizontalscrollbarenabled.setIconTintList = setuioptions2;
                    return true;
                }
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda1
        public final boolean MenuHostHelper$$ExternalSyntheticLambda1(setHorizontalScrollBarEnabled<?> sethorizontalscrollbarenabled, setX setx, setX setx2) {
            synchronized (sethorizontalscrollbarenabled) {
                if (sethorizontalscrollbarenabled.setX == setx) {
                    sethorizontalscrollbarenabled.setX = setx2;
                    return true;
                }
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda1
        public final boolean setY(setHorizontalScrollBarEnabled<?> sethorizontalscrollbarenabled, Object obj, Object obj2) {
            synchronized (sethorizontalscrollbarenabled) {
                if (sethorizontalscrollbarenabled.MenuHostHelper$$ExternalSyntheticLambda0 == obj) {
                    sethorizontalscrollbarenabled.MenuHostHelper$$ExternalSyntheticLambda0 = obj2;
                    return true;
                }
                return false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [o.setHorizontalScrollBarEnabled$MenuHostHelper$$ExternalSyntheticLambda1] */
    /* JADX WARN: Type inference failed for: r8v0, types: [o.setHorizontalScrollBarEnabled<?>] */
    /* JADX WARN: Type inference failed for: r8v1, types: [o.setHorizontalScrollBarEnabled] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v8, types: [o.setHorizontalScrollBarEnabled, o.setHorizontalScrollBarEnabled<V>] */
    static void setIconTintList(setHorizontalScrollBarEnabled<?> sethorizontalscrollbarenabled) {
        setX setx;
        setX setx2;
        setX setx3 = null;
        while (true) {
            setUiOptions setuioptions = ((setHorizontalScrollBarEnabled) sethorizontalscrollbarenabled).setIconTintList;
            if (setY.MenuHostHelper$$ExternalSyntheticLambda0((setHorizontalScrollBarEnabled) sethorizontalscrollbarenabled, setuioptions, setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0)) {
                while (setuioptions != null) {
                    Thread thread = setuioptions.setY;
                    if (thread != null) {
                        setuioptions.setY = null;
                        LockSupport.unpark(thread);
                    }
                    setuioptions = setuioptions.MenuHostHelper$$ExternalSyntheticLambda1;
                }
                ((setHorizontalScrollBarEnabled) sethorizontalscrollbarenabled).setX();
                do {
                    setx = ((setHorizontalScrollBarEnabled) sethorizontalscrollbarenabled).setX;
                } while (!setY.MenuHostHelper$$ExternalSyntheticLambda1((setHorizontalScrollBarEnabled) sethorizontalscrollbarenabled, setx, setX.setY));
                while (true) {
                    setx2 = setx3;
                    setx3 = setx;
                    if (setx3 == null) {
                        break;
                    }
                    setx = setx3.setX;
                    setx3.setX = setx2;
                }
                while (setx2 != null) {
                    setx3 = setx2.setX;
                    Runnable runnable = setx2.MenuHostHelper$$ExternalSyntheticLambda1;
                    if (runnable instanceof setUnboundedRipple) {
                        setUnboundedRipple setunboundedripple = (setUnboundedRipple) runnable;
                        sethorizontalscrollbarenabled = setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda1;
                        if (sethorizontalscrollbarenabled.MenuHostHelper$$ExternalSyntheticLambda0 == setunboundedripple) {
                            if (setY.setY(sethorizontalscrollbarenabled, setunboundedripple, setX((M<?>) setunboundedripple.setX))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = setx2.setIconTintList;
                        try {
                            executor.execute(runnable);
                        } catch (RuntimeException e) {
                            Logger logger = setUiOptions;
                            Level level = Level.SEVERE;
                            StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
                            sb.append(runnable);
                            sb.append(" with executor ");
                            sb.append(executor);
                            logger.log(level, sb.toString(), (Throwable) e);
                        }
                    }
                    setx2 = setx3;
                }
                return;
            }
        }
    }
}