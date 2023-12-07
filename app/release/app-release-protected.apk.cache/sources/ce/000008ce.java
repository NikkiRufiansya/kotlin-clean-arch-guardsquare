package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.rx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0444rx<T> extends AbstractC0451sd<T> implements InterfaceC0441ru<T>, oW {
    volatile /* synthetic */ int _decision;
    volatile /* synthetic */ Object _state;
    private final oK<T> setUiOptions;
    private final oM setX;
    public InterfaceC0456si setY;
    private static final /* synthetic */ AtomicIntegerFieldUpdater setIconTintList = AtomicIntegerFieldUpdater.newUpdater(C0444rx.class, "_decision");
    private static final /* synthetic */ AtomicReferenceFieldUpdater MenuHostHelper$$ExternalSyntheticLambda1 = AtomicReferenceFieldUpdater.newUpdater(C0444rx.class, Object.class, "_state");

    @Override // o.oW
    public final StackTraceElement MenuHostHelper$$ExternalSyntheticLambda1() {
        return null;
    }

    protected String setUiOptions() {
        return "CancellableContinuation";
    }

    @Override // o.AbstractC0451sd
    public final oK<T> setIconTintList() {
        return this.setUiOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0444rx(oK<? super T> oKVar, int i) {
        super(i);
        this.setUiOptions = oKVar;
        rX.setIconTintList();
        this.setX = oKVar.setX();
        this._decision = 0;
        this._state = C0434rn.setY;
    }

    @Override // o.oK
    public final oM setX() {
        return this.setX;
    }

    public final void setUnboundedRipple() {
        InterfaceC0456si layoutAnimation = setLayoutAnimation();
        if (layoutAnimation != null && (!(this._state instanceof sP))) {
            layoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0();
            this.setY = sM.setIconTintList;
        }
    }

    private final boolean setCenterIfNoTextEnabled() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == 2) {
            if (((C0511uh) this.setUiOptions)._reusableCancellableContinuation != null) {
                return true;
            }
        }
        return false;
    }

    @Override // o.oW
    public final oW setY() {
        oK<T> oKVar = this.setUiOptions;
        if (oKVar instanceof oW) {
            return (oW) oKVar;
        }
        return null;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(AbstractC0436rp abstractC0436rp, Throwable th) {
        try {
            abstractC0436rp.MenuHostHelper$$ExternalSyntheticLambda1(th);
        } catch (Throwable th2) {
            oM oMVar = this.setX;
            StringBuilder sb = new StringBuilder("Exception in invokeOnCancellation handler for ");
            sb.append(this);
            rP.setIconTintList(oMVar, new rI(sb.toString(), th2));
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0377pk<? super Throwable, nX> interfaceC0377pk, Throwable th) {
        try {
            interfaceC0377pk.setX(th);
        } catch (Throwable th2) {
            oM oMVar = this.setX;
            StringBuilder sb = new StringBuilder("Exception in resume onCancellation handler for ");
            sb.append(this);
            rP.setIconTintList(oMVar, new rI(sb.toString(), th2));
        }
    }

    public Throwable MenuHostHelper$$ExternalSyntheticLambda1(sB sBVar) {
        return sBVar.setLayoutAnimation();
    }

    public final Object MenuHostHelper$$ExternalSyntheticLambda0() {
        sB sBVar;
        boolean z;
        boolean z2;
        boolean centerIfNoTextEnabled = setCenterIfNoTextEnabled();
        if (ViewPager$SavedState$1()) {
            if (this.setY == null) {
                setLayoutAnimation();
            }
            if (centerIfNoTextEnabled) {
                setTextAlignment();
            }
            return oJ.COROUTINE_SUSPENDED;
        }
        if (centerIfNoTextEnabled) {
            setTextAlignment();
        }
        Object obj = this._state;
        if (obj instanceof rD) {
            Throwable th = ((rD) obj).MenuHostHelper$$ExternalSyntheticLambda1;
            z2 = rX.setX;
            if (z2) {
                C0444rx<T> c0444rx = this;
                if (c0444rx instanceof oW) {
                    throw uB.setIconTintList(th, c0444rx);
                }
                throw th;
            }
            throw th;
        }
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        boolean z3 = true;
        if (i != 1 && i != 2) {
            z3 = false;
        }
        if (!z3 || (sBVar = (sB) this.setX.get(sB.MenuHostHelper$$ExternalSyntheticLambda1)) == null || sBVar.setNavigationOnClickListener()) {
            return obj instanceof rE ? ((rE) obj).MenuHostHelper$$ExternalSyntheticLambda1 : obj;
        }
        CancellationException layoutAnimation = sBVar.setLayoutAnimation();
        setY(obj, layoutAnimation);
        z = rX.setX;
        if (z) {
            C0444rx<T> c0444rx2 = this;
            if (c0444rx2 instanceof oW) {
                throw uB.setIconTintList(layoutAnimation, c0444rx2);
            }
            throw layoutAnimation;
        }
        throw layoutAnimation;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x002a, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setTextAlignment() {
        /*
            r8 = this;
            o.oK<T> r0 = r8.setUiOptions
            boolean r1 = r0 instanceof o.C0511uh
            r2 = 0
            if (r1 == 0) goto La
            o.uh r0 = (o.C0511uh) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto L7d
            r1 = r8
            o.ru r1 = (o.InterfaceC0441ru) r1
        L10:
            java.lang.Object r3 = r0._reusableCancellableContinuation
            o.uy r4 = o.C0510ug.MenuHostHelper$$ExternalSyntheticLambda1
            r5 = 0
            r6 = 1
            if (r3 != r4) goto L2d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = o.C0511uh.setIconTintList
            o.uy r7 = o.C0510ug.MenuHostHelper$$ExternalSyntheticLambda1
        L1c:
            boolean r3 = r4.compareAndSet(r0, r7, r1)
            if (r3 == 0) goto L24
            r5 = 1
            goto L2a
        L24:
            java.lang.Object r3 = r4.get(r0)
            if (r3 == r7) goto L1c
        L2a:
            if (r5 == 0) goto L10
            goto L46
        L2d:
            boolean r1 = r3 instanceof java.lang.Throwable
            if (r1 == 0) goto L65
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = o.C0511uh.setIconTintList
        L33:
            boolean r4 = r1.compareAndSet(r0, r3, r2)
            if (r4 == 0) goto L3b
            r5 = 1
            goto L41
        L3b:
            java.lang.Object r4 = r1.get(r0)
            if (r4 == r3) goto L33
        L41:
            if (r5 == 0) goto L59
            r2 = r3
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L46:
            if (r2 == 0) goto L7d
            o.si r0 = r8.setY
            if (r0 == 0) goto L55
            r0.MenuHostHelper$$ExternalSyntheticLambda0()
            o.sM r0 = o.sM.setIconTintList
            o.si r0 = (o.InterfaceC0456si) r0
            r8.setY = r0
        L55:
            r8.setX(r2)
            goto L7d
        L59:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L65:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Inconsistent state "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0444rx.setTextAlignment():void");
    }

    @Override // o.oK
    public final void MenuHostHelper$$ExternalSyntheticLambda0(Object obj) {
        boolean z;
        C0444rx<T> c0444rx = this;
        Throwable iconTintList = nR.setIconTintList(obj);
        if (iconTintList != null) {
            z = rX.setX;
            if (z) {
                C0444rx<T> c0444rx2 = c0444rx;
                if (c0444rx2 instanceof oW) {
                    iconTintList = uB.setIconTintList(iconTintList, c0444rx2);
                }
            }
            obj = new rD(iconTintList);
        }
        MenuHostHelper$$ExternalSyntheticLambda1(obj, this.MenuHostHelper$$ExternalSyntheticLambda0, null);
    }

    @Override // o.InterfaceC0441ru
    public final void setX(T t, InterfaceC0377pk<? super Throwable, nX> interfaceC0377pk) {
        MenuHostHelper$$ExternalSyntheticLambda1(t, this.MenuHostHelper$$ExternalSyntheticLambda0, interfaceC0377pk);
    }

    private static void setX(InterfaceC0377pk<? super Throwable, nX> interfaceC0377pk, Object obj) {
        StringBuilder sb = new StringBuilder("It's prohibited to register multiple handlers, tried to register ");
        sb.append(interfaceC0377pk);
        sb.append(", already has ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    private static Object setX(sP sPVar, Object obj, int i, InterfaceC0377pk<? super Throwable, nX> interfaceC0377pk, Object obj2) {
        if (obj instanceof rD) {
            rX.setIconTintList();
            rX.setIconTintList();
            return obj;
        }
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z || obj2 != null) {
            if (interfaceC0377pk != null || (((sPVar instanceof AbstractC0436rp) && !(sPVar instanceof AbstractC0432rl)) || obj2 != null)) {
                return new rE(obj, sPVar instanceof AbstractC0436rp ? (AbstractC0436rp) sPVar : null, interfaceC0377pk, obj2, null, 16);
            }
            return obj;
        }
        return obj;
    }

    @Override // o.InterfaceC0441ru
    public final void setIconTintList(Object obj) {
        rX.setIconTintList();
        setX(this.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC0451sd
    public final <T> T setY(Object obj) {
        return obj instanceof rE ? (T) ((rE) obj).MenuHostHelper$$ExternalSyntheticLambda1 : obj;
    }

    @Override // o.AbstractC0451sd
    public final Throwable MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        boolean z;
        Throwable MenuHostHelper$$ExternalSyntheticLambda12 = super.MenuHostHelper$$ExternalSyntheticLambda1(obj);
        if (MenuHostHelper$$ExternalSyntheticLambda12 != null) {
            oK<T> oKVar = this.setUiOptions;
            z = rX.setX;
            return (z && (oKVar instanceof oW)) ? uB.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda12, (oW) oKVar) : MenuHostHelper$$ExternalSyntheticLambda12;
        }
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(setUiOptions());
        sb.append('(');
        sb.append(rZ.MenuHostHelper$$ExternalSyntheticLambda0((oK<?>) this.setUiOptions));
        sb.append("){");
        Object obj = this._state;
        if (obj instanceof sP) {
            str = "Active";
        } else {
            str = obj instanceof C0440rt ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(rZ.setY(this));
        return sb.toString();
    }

    @Override // o.AbstractC0451sd
    public final void setY(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof sP) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof rD) {
                return;
            }
            boolean z = false;
            if (obj2 instanceof rE) {
                rE rEVar = (rE) obj2;
                if (!(!(rEVar.MenuHostHelper$$ExternalSyntheticLambda0 != null))) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                rE y = rE.setY(rEVar, null, null, null, null, th, 15);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MenuHostHelper$$ExternalSyntheticLambda1;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, y)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    AbstractC0436rp abstractC0436rp = rEVar.setIconTintList;
                    if (abstractC0436rp != null) {
                        MenuHostHelper$$ExternalSyntheticLambda0(abstractC0436rp, th);
                    }
                    InterfaceC0377pk<Throwable, nX> interfaceC0377pk = rEVar.setY;
                    if (interfaceC0377pk != null) {
                        MenuHostHelper$$ExternalSyntheticLambda0(interfaceC0377pk, th);
                        return;
                    }
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = MenuHostHelper$$ExternalSyntheticLambda1;
                rE rEVar2 = new rE(obj2, null, null, null, th, 14);
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, rEVar2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0023, code lost:
        continue;
     */
    @Override // o.InterfaceC0441ru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean setX(java.lang.Throwable r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._state
            boolean r1 = r0 instanceof o.sP
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            r1 = r7
            o.oK r1 = (o.oK) r1
            boolean r3 = r0 instanceof o.AbstractC0436rp
            o.rt r4 = new o.rt
            r4.<init>(r1, r8, r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = o.C0444rx.MenuHostHelper$$ExternalSyntheticLambda1
        L14:
            boolean r5 = r1.compareAndSet(r7, r0, r4)
            r6 = 1
            if (r5 == 0) goto L1d
            r2 = 1
            goto L23
        L1d:
            java.lang.Object r5 = r1.get(r7)
            if (r5 == r0) goto L14
        L23:
            if (r2 == 0) goto L0
            if (r3 == 0) goto L2a
            o.rp r0 = (o.AbstractC0436rp) r0
            goto L2b
        L2a:
            r0 = 0
        L2b:
            if (r0 == 0) goto L30
            r7.MenuHostHelper$$ExternalSyntheticLambda0(r0, r8)
        L30:
            r7.setOnLongClickListener()
            int r8 = r7.MenuHostHelper$$ExternalSyntheticLambda0
            r7.setX(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0444rx.setX(java.lang.Throwable):boolean");
    }

    private final void setY(InterfaceC0377pk<? super Throwable, nX> interfaceC0377pk, Throwable th) {
        try {
            interfaceC0377pk.setX(th);
        } catch (Throwable th2) {
            oM oMVar = this.setX;
            StringBuilder sb = new StringBuilder("Exception in invokeOnCancellation handler for ");
            sb.append(this);
            rP.setIconTintList(oMVar, new rI(sb.toString(), th2));
        }
    }

    private final boolean ViewPager$SavedState$1() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!setIconTintList.compareAndSet(this, 0, 1));
        return true;
    }

    private final void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, int i, InterfaceC0377pk<? super Throwable, nX> interfaceC0377pk) {
        boolean z;
        do {
            Object obj2 = this._state;
            z = true;
            if (obj2 instanceof sP) {
                Object x = setX((sP) obj2, obj, i, interfaceC0377pk, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MenuHostHelper$$ExternalSyntheticLambda1;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, x)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            z = false;
                            continue;
                            break;
                        }
                    }
                }
            } else {
                if (obj2 instanceof C0440rt) {
                    C0440rt c0440rt = (C0440rt) obj2;
                    if (C0440rt.setIconTintList.compareAndSet(c0440rt, 0, 1)) {
                        if (interfaceC0377pk != null) {
                            MenuHostHelper$$ExternalSyntheticLambda0(interfaceC0377pk, c0440rt.MenuHostHelper$$ExternalSyntheticLambda1);
                            return;
                        }
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder("Already resumed, but proposed with update ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
        } while (!z);
        setOnLongClickListener();
        setX(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
        if ((((o.C0511uh) r4.setUiOptions)._reusableCancellableContinuation != null) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setOnLongClickListener() {
        /*
            r4 = this;
            int r0 = r4.MenuHostHelper$$ExternalSyntheticLambda0
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 != r3) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L1a
            o.oK<T> r0 = r4.setUiOptions
            o.uh r0 = (o.C0511uh) r0
            java.lang.Object r0 = r0._reusableCancellableContinuation
            if (r0 == 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L1a
            goto L1b
        L1a:
            r1 = 0
        L1b:
            if (r1 != 0) goto L2a
            o.si r0 = r4.setY
            if (r0 == 0) goto L2a
            r0.MenuHostHelper$$ExternalSyntheticLambda0()
            o.sM r0 = o.sM.setIconTintList
            o.si r0 = (o.InterfaceC0456si) r0
            r4.setY = r0
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0444rx.setOnLongClickListener():void");
    }

    /* JADX WARN: Finally extract failed */
    private final void setX(int i) {
        boolean z;
        AbstractC0451sd<?> x;
        boolean z2;
        while (true) {
            int i2 = this._decision;
            if (i2 == 0) {
                if (setIconTintList.compareAndSet(this, 0, 2)) {
                    z = true;
                    break;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("Already resumed".toString());
            } else {
                z = false;
            }
        }
        if (z) {
            return;
        }
        C0444rx<T> c0444rx = this;
        rX.setIconTintList();
        oK<T> iconTintList = c0444rx.setIconTintList();
        boolean z3 = i == 4;
        if (!z3 && (iconTintList instanceof C0511uh)) {
            boolean z4 = i == 1 || i == 2;
            int i3 = c0444rx.MenuHostHelper$$ExternalSyntheticLambda0;
            if (z4 == (i3 == 1 || i3 == 2)) {
                rQ rQVar = ((C0511uh) iconTintList).setUnboundedRipple;
                oM x2 = iconTintList.setX();
                if (rQVar.MenuHostHelper$$ExternalSyntheticLambda0(x2)) {
                    rQVar.setY(x2, c0444rx);
                    return;
                }
                sT sTVar = sT.MenuHostHelper$$ExternalSyntheticLambda1;
                AbstractC0463sp y = sT.setY();
                if (y.setLayoutAnimation >= AbstractC0463sp.setIconTintList(true)) {
                    tU<AbstractC0451sd<?>> tUVar = y.setX;
                    if (tUVar == null) {
                        tUVar = new tU<>();
                        y.setX = tUVar;
                    }
                    tUVar.MenuHostHelper$$ExternalSyntheticLambda1(c0444rx);
                    return;
                }
                y.setLayoutAnimation += AbstractC0463sp.setIconTintList(true);
                try {
                    C0452se.setIconTintList(c0444rx, c0444rx.setIconTintList(), true);
                    do {
                        tU<AbstractC0451sd<?>> tUVar2 = y.setX;
                        if (tUVar2 != null && (x = tUVar2.setX()) != null) {
                            x.run();
                            z2 = true;
                            continue;
                        }
                        z2 = false;
                    } while (z2);
                } catch (Throwable th) {
                    try {
                        c0444rx.setIconTintList(th, null);
                    } finally {
                        y.setY(true);
                    }
                }
                return;
            }
        }
        C0452se.setIconTintList(c0444rx, iconTintList, z3);
    }

    private final InterfaceC0456si setLayoutAnimation() {
        sB sBVar = (sB) this.setX.get(sB.MenuHostHelper$$ExternalSyntheticLambda1);
        if (sBVar == null) {
            return null;
        }
        InterfaceC0456si y = sBVar.setY(true, true, new C0446rz(this));
        this.setY = y;
        return y;
    }

    @Override // o.InterfaceC0441ru
    public final void setIconTintList(InterfaceC0377pk<? super Throwable, nX> interfaceC0377pk) {
        C0472sy c0472sy = interfaceC0377pk instanceof AbstractC0436rp ? (AbstractC0436rp) interfaceC0377pk : new C0472sy(interfaceC0377pk);
        while (true) {
            Object obj = this._state;
            boolean z = true;
            if (obj instanceof C0434rn) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MenuHostHelper$$ExternalSyntheticLambda1;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0472sy)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else if (obj instanceof AbstractC0436rp) {
                setX(interfaceC0377pk, obj);
            } else {
                boolean z2 = obj instanceof rD;
                if (z2) {
                    rD rDVar = (rD) obj;
                    if (!rD.setY.compareAndSet(rDVar, 0, 1)) {
                        setX(interfaceC0377pk, obj);
                    }
                    if (obj instanceof C0440rt) {
                        if (!z2) {
                            rDVar = null;
                        }
                        setY(interfaceC0377pk, rDVar != null ? rDVar.MenuHostHelper$$ExternalSyntheticLambda1 : null);
                        return;
                    }
                    return;
                } else if (obj instanceof rE) {
                    rE rEVar = (rE) obj;
                    if (rEVar.setIconTintList != null) {
                        setX(interfaceC0377pk, obj);
                    }
                    if (c0472sy instanceof AbstractC0432rl) {
                        return;
                    }
                    if (rEVar.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                        setY(interfaceC0377pk, rEVar.MenuHostHelper$$ExternalSyntheticLambda0);
                        return;
                    }
                    rE y = rE.setY(rEVar, null, c0472sy, null, null, null, 29);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = MenuHostHelper$$ExternalSyntheticLambda1;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, y)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z) {
                        return;
                    }
                } else if (c0472sy instanceof AbstractC0432rl) {
                    return;
                } else {
                    rE rEVar2 = new rE(obj, c0472sy, null, null, null, 28);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = MenuHostHelper$$ExternalSyntheticLambda1;
                    while (true) {
                        if (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, rEVar2)) {
                            if (atomicReferenceFieldUpdater3.get(this) != obj) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(java.lang.Throwable r7) {
        /*
            r6 = this;
            boolean r0 = r6.setCenterIfNoTextEnabled()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto La
        L8:
            r1 = 0
            goto L48
        La:
            o.oK<T> r0 = r6.setUiOptions
            o.uh r0 = (o.C0511uh) r0
        Le:
            java.lang.Object r3 = r0._reusableCancellableContinuation
            o.uy r4 = o.C0510ug.MenuHostHelper$$ExternalSyntheticLambda1
            boolean r4 = o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r3, r4)
            if (r4 == 0) goto L2e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = o.C0511uh.setIconTintList
            o.uy r5 = o.C0510ug.MenuHostHelper$$ExternalSyntheticLambda1
        L1c:
            boolean r3 = r4.compareAndSet(r0, r5, r7)
            if (r3 == 0) goto L24
            r3 = 1
            goto L2b
        L24:
            java.lang.Object r3 = r4.get(r0)
            if (r3 == r5) goto L1c
            r3 = 0
        L2b:
            if (r3 == 0) goto Le
            goto L48
        L2e:
            boolean r4 = r3 instanceof java.lang.Throwable
            if (r4 == 0) goto L33
            goto L48
        L33:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = o.C0511uh.setIconTintList
        L35:
            r5 = 0
            boolean r5 = r4.compareAndSet(r0, r3, r5)
            if (r5 == 0) goto L3e
            r3 = 1
            goto L45
        L3e:
            java.lang.Object r5 = r4.get(r0)
            if (r5 == r3) goto L35
            r3 = 0
        L45:
            if (r3 == 0) goto Le
            goto L8
        L48:
            if (r1 == 0) goto L4b
            return
        L4b:
            r6.setX(r7)
            r6.setOnLongClickListener()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0444rx.MenuHostHelper$$ExternalSyntheticLambda1(java.lang.Throwable):void");
    }

    @Override // o.AbstractC0451sd
    public final Object setNavigationOnClickListener() {
        return this._state;
    }

    @Override // o.InterfaceC0441ru
    public final Object MenuHostHelper$$ExternalSyntheticLambda0(T t, Object obj, InterfaceC0377pk<? super Throwable, nX> interfaceC0377pk) {
        boolean z;
        do {
            Object obj2 = this._state;
            if (!(obj2 instanceof sP)) {
                return null;
            }
            Object x = setX((sP) obj2, t, this.MenuHostHelper$$ExternalSyntheticLambda0, interfaceC0377pk, null);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MenuHostHelper$$ExternalSyntheticLambda1;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, x)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
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
        } while (!z);
        setOnLongClickListener();
        return C0442rv.setIconTintList;
    }
}