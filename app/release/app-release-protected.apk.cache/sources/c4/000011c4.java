package o;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.ur  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0521ur<E> {
    private volatile /* synthetic */ Object _next = null;
    public volatile /* synthetic */ long _state = 0;
    private final int setNavigationOnClickListener;
    private final boolean setOnLongClickListener;
    private final int setUiOptions;
    private /* synthetic */ AtomicReferenceArray setX;
    private static ur$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda0 = new ur$MenuHostHelper$$ExternalSyntheticLambda0((byte) 0);
    public static final C0528uy MenuHostHelper$$ExternalSyntheticLambda1 = new C0528uy("REMOVE_FROZEN");
    private static final /* synthetic */ AtomicReferenceFieldUpdater setY = AtomicReferenceFieldUpdater.newUpdater(C0521ur.class, Object.class, "_next");
    private static final /* synthetic */ AtomicLongFieldUpdater setIconTintList = AtomicLongFieldUpdater.newUpdater(C0521ur.class, "_state");

    public C0521ur(int i, boolean z) {
        this.setNavigationOnClickListener = i;
        this.setOnLongClickListener = z;
        int i2 = i - 1;
        this.setUiOptions = i2;
        this.setX = new AtomicReferenceArray(i);
        if (!(i2 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i & i2) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    private final C0521ur<E> setIconTintList(int i, E e) {
        Object obj = this.setX.get(this.setUiOptions & i);
        if ((obj instanceof ur$MenuHostHelper$$ExternalSyntheticLambda1) && ((ur$MenuHostHelper$$ExternalSyntheticLambda1) obj).setX == i) {
            this.setX.set(i & this.setUiOptions, e);
            return this;
        }
        return null;
    }

    public final boolean setY() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!setIconTintList.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int setY(E r13) {
        /*
            r12 = this;
        L0:
            long r2 = r12._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            r4 = 1
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 == 0) goto L15
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r2
            int r13 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r13 == 0) goto L14
            r4 = 2
        L14:
            return r4
        L15:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            int r1 = (int) r0
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r8 = r8 & r2
            r0 = 30
            long r8 = r8 >> r0
            int r9 = (int) r8
            int r8 = r12.setUiOptions
            int r5 = r9 + 2
            r5 = r5 & r8
            r10 = r1 & r8
            if (r5 != r10) goto L2e
            return r4
        L2e:
            boolean r5 = r12.setOnLongClickListener
            r10 = 1073741823(0x3fffffff, float:1.9999999)
            if (r5 != 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r12.setX
            r11 = r9 & r8
            java.lang.Object r5 = r5.get(r11)
            if (r5 == 0) goto L4d
            int r0 = r12.setNavigationOnClickListener
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L4c
            int r9 = r9 - r1
            r1 = r9 & r10
            int r0 = r0 >> 1
            if (r1 <= r0) goto L0
        L4c:
            return r4
        L4d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = o.C0521ur.setIconTintList
            int r4 = r9 + 1
            r4 = r4 & r10
            r10 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r10 = r10 & r2
            long r4 = (long) r4
            long r4 = r4 << r0
            long r4 = r4 | r10
            r0 = r1
            r1 = r12
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.setX
            r1 = r9 & r8
            r0.set(r1, r13)
            r0 = r12
        L6b:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L82
            long r1 = r0.MenuHostHelper$$ExternalSyntheticLambda1()
            o.ur r0 = r0.MenuHostHelper$$ExternalSyntheticLambda0(r1)
            o.ur r0 = r0.setIconTintList(r9, r13)
            if (r0 != 0) goto L6b
        L82:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0521ur.setY(java.lang.Object):int");
    }

    public final Object setX() {
        while (true) {
            long j = this._state;
            if ((1152921504606846976L & j) != 0) {
                return MenuHostHelper$$ExternalSyntheticLambda1;
            }
            int i = (int) (1073741823 & j);
            int i2 = this.setUiOptions;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.setX.get(i4);
            if (obj == null) {
                if (this.setOnLongClickListener) {
                    return null;
                }
            } else if (obj instanceof ur$MenuHostHelper$$ExternalSyntheticLambda1) {
                return null;
            } else {
                int i5 = (i + 1) & 1073741823;
                if (setIconTintList.compareAndSet(this, j, ((-1073741824) & j) | i5)) {
                    this.setX.set(this.setUiOptions & i, null);
                    return obj;
                } else if (this.setOnLongClickListener) {
                    C0521ur<E> c0521ur = this;
                    do {
                        c0521ur = c0521ur.setIconTintList(i, i5);
                    } while (c0521ur != null);
                    return obj;
                }
            }
        }
    }

    private final C0521ur<E> setIconTintList(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state;
            i3 = (int) (1073741823 & j);
            rX.setIconTintList();
            if ((1152921504606846976L & j) != 0) {
                return MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1());
            }
        } while (!setIconTintList.compareAndSet(this, j, ((-1073741824) & j) | i2));
        this.setX.set(i3 & this.setUiOptions, null);
        return null;
    }

    public final long MenuHostHelper$$ExternalSyntheticLambda1() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!setIconTintList.compareAndSet(this, j, j2));
        return j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0521ur<E> MenuHostHelper$$ExternalSyntheticLambda0(long j) {
        while (true) {
            C0521ur<E> c0521ur = (C0521ur) this._next;
            if (c0521ur != null) {
                return c0521ur;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = setY;
            C0521ur c0521ur2 = new C0521ur(this.setNavigationOnClickListener << 1, this.setOnLongClickListener);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.setUiOptions;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.setX.get(i4);
                if (obj == null) {
                    obj = new ur$MenuHostHelper$$ExternalSyntheticLambda1(i);
                }
                c0521ur2.setX.set(c0521ur2.setUiOptions & i, obj);
                i++;
            }
            c0521ur2._state = (-1152921504606846977L) & j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0521ur2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }
}