package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.so  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0462so extends AbstractC0464sq implements InterfaceC0453sf {
    private static int ViewPager$SavedState$1;
    private static boolean setChipCornerRadius;
    private static final /* synthetic */ AtomicReferenceFieldUpdater setOnLongClickListener;
    private static boolean setTextAlignment;
    private static char[] setUnboundedRipple;
    private static final /* synthetic */ AtomicReferenceFieldUpdater setY;
    public static final byte[] $$g = {95, 98, 60, -42};
    public static final int $$h = 0;
    public static final byte[] $$d = {10, Byte.MIN_VALUE, 49, 76, 11, -18, 24, 62, -75, 1, 75, -44, -27, -12, -10, 42, -42, -7, -4, 41, -32, -10, -7, 8, -16, 75, -3, -36, -54, 1, 12, -16, 1, 10, -14, 22, -41, 8, -9, 9, 0, -18, 8, 3, 20, -24, -15, 8, -5, 0, 46};
    public static final int $$e = 24;
    public static final byte[] $$a = {30, 119, -63, 113, 1, -28, 14, 1, -28, 15, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 36};
    public static final int $$b = 145;
    private static byte[] setCenterIfNoTextEnabled = {25, 60, 112, -12, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
    public static final int setUiOptions = 121;
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    static {
        setUnboundedRipple();
        setOnLongClickListener = AtomicReferenceFieldUpdater.newUpdater(AbstractC0462so.class, Object.class, "_queue");
        setY = AtomicReferenceFieldUpdater.newUpdater(AbstractC0462so.class, Object.class, "_delayed");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0035). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 38
            int r9 = 115 - r9
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r0 = o.AbstractC0462so.$$a
            int r8 = r8 * 36
            int r8 = r8 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L1b
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            goto L35
        L1b:
            r3 = 0
        L1c:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L2b
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2b:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r6
        L35:
            int r7 = -r7
            int r8 = r8 + 1
            int r10 = r10 + r7
            int r7 = r10 + (-13)
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r6
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC0462so.a(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.AbstractC0462so.setCenterIfNoTextEnabled
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r8 = 16 - r8
            int r6 = 106 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L32
        L16:
            r3 = 0
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            int r7 = r7 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L32:
            int r6 = r6 + r7
            int r6 = r6 + 2
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC0462so.c(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0038). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 4
            int r7 = 115 - r7
            int r8 = r8 * 41
            int r8 = 45 - r8
            byte[] r0 = o.AbstractC0462so.$$d
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L1a
            r7 = r8
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L38
        L1a:
            r3 = 0
        L1b:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r9 = r9 + 1
            if (r3 != r8) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            int r3 = r3 + 1
            r4 = r0[r9]
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
        L38:
            int r9 = -r9
            int r8 = r8 + r9
            int r8 = r8 + (-3)
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC0462so.d(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 2
            int r9 = 68 - r9
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r0 = o.AbstractC0462so.$$g
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L18
            r9 = r8
            r3 = r9
            r4 = 0
            r8 = r7
            goto L2e
        L18:
            r3 = 0
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L2e:
            int r3 = -r3
            int r7 = r7 + r3
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r6
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC0462so.e(byte, byte, short, java.lang.Object[]):void");
    }

    static void setUnboundedRipple() {
        setUnboundedRipple = new char[]{34099, 34126, 34096, 34114, 34125, 34123, 34062, 34113, 34081, 34139, 34112, 34103, 34127, 34065, 34120, 34097, 34121, 34124, 34082};
        setChipCornerRadius = true;
        setTextAlignment = true;
        ViewPager$SavedState$1 = -1400797732;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0415 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0416  */
    @Override // o.AbstractC0463sp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final long setX() {
        /*
            Method dump skipped, instructions count: 1157
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC0462so.setX():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
        if (MenuHostHelper$$ExternalSyntheticLambda0() <= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
        r0 = java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
        r2 = (o.AbstractC0462so.setY) r6._delayed;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
        if (r2 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
        r2 = r2.setX();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
        if (r2 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
        setIconTintList(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    @Override // o.AbstractC0463sp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setIconTintList() {
        /*
            r6 = this;
            o.sT r0 = o.sT.MenuHostHelper$$ExternalSyntheticLambda1
            o.sT.MenuHostHelper$$ExternalSyntheticLambda0()
            r0 = 1
            r6._isCompleted = r0
            o.rX.setIconTintList()
        Lb:
            java.lang.Object r1 = r6._queue
            r2 = 0
            if (r1 != 0) goto L28
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = o.AbstractC0462so.setOnLongClickListener
            o.uy r4 = o.C0460sm.setIconTintList()
        L16:
            r1 = 0
            boolean r1 = r3.compareAndSet(r6, r1, r4)
            if (r1 == 0) goto L1f
            r2 = 1
            goto L25
        L1f:
            java.lang.Object r1 = r3.get(r6)
            if (r1 == 0) goto L16
        L25:
            if (r2 == 0) goto Lb
            goto L62
        L28:
            boolean r3 = r1 instanceof o.C0521ur
            if (r3 == 0) goto L32
            o.ur r1 = (o.C0521ur) r1
            r1.setY()
            goto L62
        L32:
            o.uy r3 = o.C0460sm.setIconTintList()
            if (r1 == r3) goto L62
            o.ur r3 = new o.ur
            r4 = 8
            r3.<init>(r4, r0)
            if (r1 == 0) goto L5a
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.setY(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = o.AbstractC0462so.setOnLongClickListener
        L49:
            boolean r5 = r4.compareAndSet(r6, r1, r3)
            if (r5 == 0) goto L51
            r2 = 1
            goto L57
        L51:
            java.lang.Object r5 = r4.get(r6)
            if (r5 == r1) goto L49
        L57:
            if (r2 == 0) goto Lb
            goto L62
        L5a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }"
            r0.<init>(r1)
            throw r0
        L62:
            long r0 = r6.MenuHostHelper$$ExternalSyntheticLambda0()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L62
            long r0 = java.lang.System.nanoTime()
        L70:
            java.lang.Object r2 = r6._delayed
            o.so$setY r2 = (o.AbstractC0462so.setY) r2
            if (r2 == 0) goto L82
            o.uC r2 = r2.setX()
            o.so$MenuHostHelper$$ExternalSyntheticLambda1 r2 = (o.so$MenuHostHelper$$ExternalSyntheticLambda1) r2
            if (r2 == 0) goto L82
            r6.setIconTintList(r0, r2)
            goto L70
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC0462so.setIconTintList():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [T extends o.uC & java.lang.Comparable<? super T>[]] */
    /* JADX WARN: Type inference failed for: r9v14 */
    @Override // o.AbstractC0463sp
    public final long MenuHostHelper$$ExternalSyntheticLambda0() {
        boolean z;
        so$MenuHostHelper$$ExternalSyntheticLambda1 x;
        if (setUiOptions()) {
            return 0L;
        }
        setY sety = (setY) this._delayed;
        Runnable runnable = null;
        if (sety != null) {
            if (!(sety._size == 0)) {
                long nanoTime = System.nanoTime();
                do {
                    setY sety2 = sety;
                    synchronized (sety2) {
                        ?? r9 = sety2.setX;
                        so$MenuHostHelper$$ExternalSyntheticLambda1 so_menuhosthelper__externalsyntheticlambda1 = r9 != 0 ? r9[0] : null;
                        if (so_menuhosthelper__externalsyntheticlambda1 == null) {
                            x = null;
                        } else {
                            so$MenuHostHelper$$ExternalSyntheticLambda1 so_menuhosthelper__externalsyntheticlambda12 = so_menuhosthelper__externalsyntheticlambda1;
                            x = ((nanoTime - so_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda0) > 0L ? 1 : ((nanoTime - so_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda0) == 0L ? 0 : -1)) >= 0 ? MenuHostHelper$$ExternalSyntheticLambda1(so_menuhosthelper__externalsyntheticlambda12) : false ? sety2.setX(0) : null;
                        }
                    }
                } while (x != null);
            }
        }
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                break;
            } else if (obj instanceof C0521ur) {
                if (obj != null) {
                    C0521ur c0521ur = (C0521ur) obj;
                    Object x2 = c0521ur.setX();
                    if (x2 != C0521ur.MenuHostHelper$$ExternalSyntheticLambda1) {
                        runnable = (Runnable) x2;
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = setOnLongClickListener;
                    C0521ur MenuHostHelper$$ExternalSyntheticLambda0 = c0521ur.MenuHostHelper$$ExternalSyntheticLambda0(c0521ur.MenuHostHelper$$ExternalSyntheticLambda1());
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, MenuHostHelper$$ExternalSyntheticLambda0) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                }
            } else if (obj == C0460sm.setIconTintList()) {
                break;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = setOnLongClickListener;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    if (obj != null) {
                        runnable = (Runnable) obj;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    }
                }
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        return setX();
    }

    @Override // o.rQ
    public final void setY(oM oMVar, Runnable runnable) {
        setIconTintList(runnable);
    }

    public void setIconTintList(Runnable runnable) {
        if (MenuHostHelper$$ExternalSyntheticLambda1(runnable)) {
            setLayoutAnimation();
        } else {
            RunnableC0449sb.setY.setIconTintList(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setNavigationOnClickListener() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: o.so$setY */
    /* loaded from: classes.dex */
    public static final class setY extends uG<so$MenuHostHelper$$ExternalSyntheticLambda1> {
        public long MenuHostHelper$$ExternalSyntheticLambda1;

        public setY(long j) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = j;
        }
    }

    private final boolean MenuHostHelper$$ExternalSyntheticLambda1(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            boolean z = false;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = setOnLongClickListener;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            } else if (obj instanceof C0521ur) {
                if (obj != null) {
                    C0521ur c0521ur = (C0521ur) obj;
                    int y = c0521ur.setY(runnable);
                    if (y == 0) {
                        return true;
                    }
                    if (y == 1) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = setOnLongClickListener;
                        C0521ur MenuHostHelper$$ExternalSyntheticLambda0 = c0521ur.MenuHostHelper$$ExternalSyntheticLambda0(c0521ur.MenuHostHelper$$ExternalSyntheticLambda1());
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, MenuHostHelper$$ExternalSyntheticLambda0) && atomicReferenceFieldUpdater2.get(this) == obj) {
                        }
                    } else if (y == 2) {
                        return false;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                }
            } else if (obj == C0460sm.setIconTintList()) {
                return false;
            } else {
                C0521ur c0521ur2 = new C0521ur(8, true);
                if (obj != null) {
                    c0521ur2.setY((Runnable) obj);
                    c0521ur2.setY(runnable);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = setOnLongClickListener;
                    while (true) {
                        if (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, c0521ur2)) {
                            if (atomicReferenceFieldUpdater3.get(this) != obj) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        return true;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC0463sp
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        tU<AbstractC0451sd<?>> tUVar = this.setX;
        if (tUVar == null || tUVar.MenuHostHelper$$ExternalSyntheticLambda0 == tUVar.MenuHostHelper$$ExternalSyntheticLambda1) {
            setY sety = (setY) this._delayed;
            if (sety != null) {
                if (!(sety._size == 0)) {
                    return false;
                }
            }
            Object obj = this._queue;
            if (obj == null) {
                return true;
            }
            if (!(obj instanceof C0521ur)) {
                if (obj == C0460sm.setIconTintList()) {
                    return true;
                }
            } else {
                long j = ((C0521ur) obj)._state;
                if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(long j, so$MenuHostHelper$$ExternalSyntheticLambda1 so_menuhosthelper__externalsyntheticlambda1) {
        int iconTintList;
        if (this._isCompleted != 0) {
            iconTintList = 1;
        } else {
            setY sety = (setY) this._delayed;
            if (sety == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = setY;
                setY sety2 = new setY(j);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, sety2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = this._delayed;
                pN.setX(obj);
                sety = (setY) obj;
            }
            iconTintList = so_menuhosthelper__externalsyntheticlambda1.setIconTintList(j, sety, this);
        }
        if (iconTintList == 0) {
            setY sety3 = (setY) this._delayed;
            if ((sety3 != null ? sety3.setIconTintList() : null) == so_menuhosthelper__externalsyntheticlambda1) {
                setLayoutAnimation();
            }
        } else if (iconTintList == 1) {
            setIconTintList(j, so_menuhosthelper__externalsyntheticlambda1);
        } else if (iconTintList != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    private static void b(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) {
        jt jtVar = new jt();
        char[] cArr2 = setUnboundedRipple;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i2])};
                    Object obj = jC.setTextScaleX.get(-2024796271);
                    if (obj == null) {
                        byte b = (byte) $$h;
                        byte b2 = b;
                        Object[] objArr3 = new Object[1];
                        e(b, b2, b2, objArr3);
                        obj = ((Class) jC.setY(Gravity.getAbsoluteGravity(0, 0) + 232, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 4 - Color.red(0))).getMethod((String) objArr3[0], Integer.TYPE);
                        jC.setTextScaleX.put(-2024796271, obj);
                    }
                    cArr3[i2] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(ViewPager$SavedState$1)};
            Object obj2 = jC.setTextScaleX.get(-192560398);
            if (obj2 == null) {
                obj2 = ((Class) jC.setY((ViewConfiguration.getTapTimeout() >> 16) + 357, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31790), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4)).getMethod("C", Integer.TYPE);
                jC.setTextScaleX.put(-192560398, obj2);
            }
            int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
            if (setTextAlignment) {
                jtVar.setIconTintList = bArr.length;
                char[] cArr4 = new char[jtVar.setIconTintList];
                jtVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                while (jtVar.MenuHostHelper$$ExternalSyntheticLambda1 < jtVar.setIconTintList) {
                    cArr4[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[bArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] + i] - intValue);
                    try {
                        Object[] objArr5 = {jtVar, jtVar};
                        Object obj3 = jC.setTextScaleX.get(258277102);
                        if (obj3 == null) {
                            byte b3 = (byte) $$h;
                            byte b4 = b3;
                            Object[] objArr6 = new Object[1];
                            e(b3, b4, (byte) (b4 + 1), objArr6);
                            obj3 = ((Class) jC.setY(210 - (ViewConfiguration.getTapTimeout() >> 16), (char) (Color.rgb(0, 0, 0) + 16777216), 3 - Process.getGidForName(""))).getMethod((String) objArr6[0], Object.class, Object.class);
                            jC.setTextScaleX.put(258277102, obj3);
                        }
                        ((Method) obj3).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new String(cArr4);
            } else if (setChipCornerRadius) {
                jtVar.setIconTintList = cArr.length;
                char[] cArr5 = new char[jtVar.setIconTintList];
                jtVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                while (jtVar.MenuHostHelper$$ExternalSyntheticLambda1 < jtVar.setIconTintList) {
                    cArr5[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[cArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] - i] - intValue);
                    try {
                        Object[] objArr7 = {jtVar, jtVar};
                        Object obj4 = jC.setTextScaleX.get(258277102);
                        if (obj4 == null) {
                            byte b5 = (byte) $$h;
                            byte b6 = b5;
                            Object[] objArr8 = new Object[1];
                            e(b5, b6, (byte) (b6 + 1), objArr8);
                            obj4 = ((Class) jC.setY(210 - (Process.myTid() >> 22), (char) View.resolveSize(0, 0), 4 - View.MeasureSpec.getSize(0))).getMethod((String) objArr8[0], Object.class, Object.class);
                            jC.setTextScaleX.put(258277102, obj4);
                        }
                        ((Method) obj4).invoke(null, objArr7);
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                objArr[0] = new String(cArr5);
            } else {
                jtVar.setIconTintList = iArr.length;
                char[] cArr6 = new char[jtVar.setIconTintList];
                jtVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                while (jtVar.MenuHostHelper$$ExternalSyntheticLambda1 < jtVar.setIconTintList) {
                    cArr6[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[iArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] - i] - intValue);
                    jtVar.MenuHostHelper$$ExternalSyntheticLambda1++;
                }
                objArr[0] = new String(cArr6);
            }
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }
}