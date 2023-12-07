package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.uo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0518uo {
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;
    static final /* synthetic */ AtomicReferenceFieldUpdater setIconTintList = AtomicReferenceFieldUpdater.newUpdater(C0518uo.class, Object.class, "_next");
    private static /* synthetic */ AtomicReferenceFieldUpdater MenuHostHelper$$ExternalSyntheticLambda0 = AtomicReferenceFieldUpdater.newUpdater(C0518uo.class, Object.class, "_prev");
    private static final /* synthetic */ AtomicReferenceFieldUpdater MenuHostHelper$$ExternalSyntheticLambda1 = AtomicReferenceFieldUpdater.newUpdater(C0518uo.class, Object.class, "_removedRef");

    private final C0526uw setUnboundedRipple() {
        C0526uw c0526uw = (C0526uw) this._removedRef;
        if (c0526uw == null) {
            C0526uw c0526uw2 = new C0526uw(this);
            MenuHostHelper$$ExternalSyntheticLambda1.lazySet(this, c0526uw2);
            return c0526uw2;
        }
        return c0526uw;
    }

    /* renamed from: o.uo$setX */
    /* loaded from: classes.dex */
    public static abstract class setX extends tY<C0518uo> {
        public C0518uo setIconTintList;
        private C0518uo setY;

        @Override // o.tY
        public final /* synthetic */ void setX(C0518uo c0518uo, Object obj) {
            C0518uo c0518uo2 = c0518uo;
            boolean z = true;
            boolean z2 = obj == null;
            C0518uo c0518uo3 = z2 ? this.setY : this.setIconTintList;
            if (c0518uo3 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0518uo.setIconTintList;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(c0518uo2, this, c0518uo3)) {
                        if (atomicReferenceFieldUpdater.get(c0518uo2) != this) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z && z2) {
                    C0518uo c0518uo4 = this.setY;
                    C0518uo c0518uo5 = this.setIconTintList;
                    pN.setX(c0518uo5);
                    c0518uo4.setY(c0518uo5);
                }
            }
        }

        public setX(C0518uo c0518uo) {
            this.setY = c0518uo;
        }
    }

    public static C0518uo MenuHostHelper$$ExternalSyntheticLambda1(C0518uo c0518uo) {
        while (c0518uo.s_()) {
            c0518uo = (C0518uo) c0518uo._prev;
        }
        return c0518uo;
    }

    public final boolean setIconTintList(C0518uo c0518uo) {
        MenuHostHelper$$ExternalSyntheticLambda0.lazySet(c0518uo, this);
        setIconTintList.lazySet(c0518uo, this);
        while (true) {
            Object obj = this._next;
            if (obj instanceof AbstractC0524uu) {
                ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(this);
            } else {
                boolean z = false;
                if (obj != this) {
                    return false;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = setIconTintList;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, this, c0518uo)) {
                        if (atomicReferenceFieldUpdater.get(this) != this) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    c0518uo.setY(this);
                    return true;
                }
            }
        }
    }

    public final boolean setIconTintList(C0518uo c0518uo, C0518uo c0518uo2) {
        boolean z;
        MenuHostHelper$$ExternalSyntheticLambda0.lazySet(c0518uo, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = setIconTintList;
        atomicReferenceFieldUpdater.lazySet(c0518uo, c0518uo2);
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, c0518uo2, c0518uo)) {
                if (atomicReferenceFieldUpdater.get(this) != c0518uo2) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            c0518uo.setY(c0518uo2);
            return true;
        }
        return false;
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda0(C0518uo c0518uo, C0518uo c0518uo2, setX setx) {
        boolean z;
        MenuHostHelper$$ExternalSyntheticLambda0.lazySet(c0518uo, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = setIconTintList;
        atomicReferenceFieldUpdater.lazySet(c0518uo, c0518uo2);
        setx.setIconTintList = c0518uo2;
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, c0518uo2, setx)) {
                if (atomicReferenceFieldUpdater.get(this) != c0518uo2) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            return setx.MenuHostHelper$$ExternalSyntheticLambda1(this) == null ? 1 : 2;
        }
        return 0;
    }

    public boolean q_() {
        return setY() == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
        r6 = o.C0518uo.setIconTintList;
        r3 = ((o.C0526uw) r3).setIconTintList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
        if (r6.compareAndSet(r2, r0, r3) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
        if (r6.get(r2) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
        if (r4 == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.C0518uo setIconTintList(o.AbstractC0524uu r9) {
        /*
            r8 = this;
        L0:
            java.lang.Object r9 = r8._prev
            o.uo r9 = (o.C0518uo) r9
            r0 = r9
        L5:
            r1 = 0
            r2 = r1
        L7:
            java.lang.Object r3 = r0._next
            r4 = 0
            r5 = 1
            if (r3 != r8) goto L23
            if (r9 != r0) goto L10
            return r0
        L10:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = o.C0518uo.MenuHostHelper$$ExternalSyntheticLambda0
        L12:
            boolean r1 = r6.compareAndSet(r8, r9, r0)
            if (r1 == 0) goto L1a
            r4 = 1
            goto L20
        L1a:
            java.lang.Object r1 = r6.get(r8)
            if (r1 == r9) goto L12
        L20:
            if (r4 == 0) goto L0
            return r0
        L23:
            boolean r6 = r8.s_()
            if (r6 == 0) goto L2a
            return r1
        L2a:
            if (r3 != 0) goto L2d
            return r0
        L2d:
            boolean r6 = r3 instanceof o.AbstractC0524uu
            if (r6 == 0) goto L37
            o.uu r3 = (o.AbstractC0524uu) r3
            r3.MenuHostHelper$$ExternalSyntheticLambda1(r0)
            goto L0
        L37:
            boolean r6 = r3 instanceof o.C0526uw
            if (r6 == 0) goto L5a
            if (r2 == 0) goto L55
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = o.C0518uo.setIconTintList
            o.uw r3 = (o.C0526uw) r3
            o.uo r3 = r3.setIconTintList
        L43:
            boolean r1 = r6.compareAndSet(r2, r0, r3)
            if (r1 == 0) goto L4b
            r4 = 1
            goto L51
        L4b:
            java.lang.Object r1 = r6.get(r2)
            if (r1 == r0) goto L43
        L51:
            if (r4 == 0) goto L0
            r0 = r2
            goto L5
        L55:
            java.lang.Object r0 = r0._prev
            o.uo r0 = (o.C0518uo) r0
            goto L7
        L5a:
            r2 = r3
            o.uo r2 = (o.C0518uo) r2
            r7 = r2
            r2 = r0
            r0 = r7
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0518uo.setIconTintList(o.uu):o.uo");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(new pT(this) { // from class: o.uo$MenuHostHelper$$ExternalSyntheticLambda0
            @Override // o.pT, o.InterfaceC0417qx
            public final Object setChipCornerRadius() {
                String simpleName;
                simpleName = this.setX.getClass().getSimpleName();
                return simpleName;
            }
        });
        sb.append('@');
        sb.append(rZ.setY(this));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setY(C0518uo c0518uo) {
        Object obj;
        boolean z;
        do {
            C0518uo c0518uo2 = (C0518uo) c0518uo._prev;
            while (true) {
                obj = this._next;
                if (!(obj instanceof AbstractC0524uu)) {
                    break;
                }
                ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
            if (obj == c0518uo) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MenuHostHelper$$ExternalSyntheticLambda0;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(c0518uo, c0518uo2, this)) {
                        if (atomicReferenceFieldUpdater.get(c0518uo) != c0518uo2) {
                            z = false;
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z);
        if (s_()) {
            c0518uo.setIconTintList((AbstractC0524uu) null);
        }
    }

    public boolean s_() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof AbstractC0524uu)) {
                return obj instanceof C0526uw;
            }
            ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(this);
        }
    }

    public final C0518uo setY() {
        boolean z;
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof AbstractC0524uu)) {
                if (obj instanceof C0526uw) {
                    return ((C0526uw) obj).setIconTintList;
                }
                if (obj == this) {
                    return (C0518uo) obj;
                }
                C0518uo c0518uo = (C0518uo) obj;
                C0526uw unboundedRipple = c0518uo.setUnboundedRipple();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = setIconTintList;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, unboundedRipple)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    c0518uo.setIconTintList((AbstractC0524uu) null);
                    return null;
                }
            } else {
                ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
        }
    }
}