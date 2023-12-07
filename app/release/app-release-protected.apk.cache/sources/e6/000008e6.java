package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.C0518uo;
import o.oM;
import o.pY;

/* loaded from: classes.dex */
public class sK implements rC, sO {
    static final /* synthetic */ AtomicReferenceFieldUpdater setIconTintList = AtomicReferenceFieldUpdater.newUpdater(sK.class, Object.class, "_state");
    public volatile /* synthetic */ Object _parentHandle;
    volatile /* synthetic */ Object _state;

    protected String MenuHostHelper$$ExternalSyntheticLambda0() {
        return "Job was cancelled";
    }

    protected boolean MenuHostHelper$$ExternalSyntheticLambda1(Throwable th) {
        return false;
    }

    protected void ViewPager$SavedState$1() {
    }

    public boolean n_() {
        return true;
    }

    public boolean o_() {
        return false;
    }

    protected boolean r_() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setIconTintList(Object obj) {
    }

    protected void setY(Object obj) {
    }

    public sK(boolean z) {
        this._state = z ? sG.setX : sG.setY;
        this._parentHandle = null;
    }

    @Override // o.oM$MenuHostHelper$$ExternalSyntheticLambda1
    public final oM$MenuHostHelper$$ExternalSyntheticLambda0<?> getKey() {
        return sB.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setIconTintList(sB sBVar) {
        Object obj;
        rX.setIconTintList();
        if (sBVar != null) {
            sBVar.setOnLongClickListener();
            rB iconTintList = sBVar.setIconTintList(this);
            this._parentHandle = iconTintList;
            while (true) {
                obj = this._state;
                if (!(obj instanceof AbstractC0524uu)) {
                    break;
                }
                ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
            if (!(obj instanceof InterfaceC0470sw)) {
                iconTintList.MenuHostHelper$$ExternalSyntheticLambda0();
                this._parentHandle = sM.setIconTintList;
                return;
            }
            return;
        }
        this._parentHandle = sM.setIconTintList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object setY(sK$MenuHostHelper$$ExternalSyntheticLambda1 sk_menuhosthelper__externalsyntheticlambda1, Object obj) {
        ArrayList arrayList;
        C0528uy c0528uy;
        Object obj2;
        boolean z;
        boolean z2;
        boolean z3;
        rX.setIconTintList();
        rX.setIconTintList();
        rX.setIconTintList();
        Throwable th = null;
        rD rDVar = obj instanceof rD ? (rD) obj : null;
        Throwable th2 = rDVar != null ? rDVar.MenuHostHelper$$ExternalSyntheticLambda1 : null;
        synchronized (sk_menuhosthelper__externalsyntheticlambda1) {
            Throwable th3 = (Throwable) sk_menuhosthelper__externalsyntheticlambda1._rootCause;
            Object obj3 = sk_menuhosthelper__externalsyntheticlambda1._exceptionsHolder;
            if (obj3 != null) {
                if (!(obj3 instanceof Throwable)) {
                    if (!(obj3 instanceof ArrayList)) {
                        StringBuilder sb = new StringBuilder("State is ");
                        sb.append(obj3);
                        throw new IllegalStateException(sb.toString().toString());
                    }
                    arrayList = (ArrayList) obj3;
                } else {
                    ArrayList arrayList2 = new ArrayList(4);
                    arrayList2.add(obj3);
                    arrayList = arrayList2;
                }
            } else {
                arrayList = new ArrayList(4);
            }
            Throwable th4 = (Throwable) sk_menuhosthelper__externalsyntheticlambda1._rootCause;
            if (th4 != null) {
                arrayList.add(0, th4);
            }
            if (th2 != null && !pN.MenuHostHelper$$ExternalSyntheticLambda0(th2, th4)) {
                arrayList.add(th2);
            }
            c0528uy = sG.setLayoutAnimation;
            sk_menuhosthelper__externalsyntheticlambda1._exceptionsHolder = c0528uy;
            ArrayList<Throwable> arrayList3 = arrayList;
            if (!arrayList3.isEmpty()) {
                ArrayList arrayList4 = arrayList3;
                Iterator it = arrayList4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (!(((Throwable) obj2) instanceof CancellationException)) {
                        break;
                    }
                }
                Throwable th5 = (Throwable) obj2;
                if (th5 != null) {
                    th = th5;
                } else {
                    Throwable th6 = (Throwable) arrayList3.get(0);
                    if (th6 instanceof sQ) {
                        Iterator it2 = arrayList4.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            Throwable th7 = (Throwable) next;
                            if (th7 == th6 || !(th7 instanceof sQ)) {
                                z = false;
                                continue;
                            } else {
                                z = true;
                                continue;
                            }
                            if (z) {
                                th = next;
                                break;
                            }
                        }
                        th = th;
                        if (th != null) {
                        }
                    }
                    th = th6;
                }
            } else if (((Throwable) sk_menuhosthelper__externalsyntheticlambda1._rootCause) != null) {
                th = new sE(MenuHostHelper$$ExternalSyntheticLambda0(), null, this);
            }
            if (th != null && arrayList3.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayList3.size()));
                z2 = rX.setX;
                Throwable iconTintList = !z2 ? th : uB.setIconTintList(th);
                for (Throwable th8 : arrayList3) {
                    z3 = rX.setX;
                    if (z3) {
                        th8 = uB.setIconTintList(th8);
                    }
                    if (th8 != th && th8 != iconTintList && !(th8 instanceof CancellationException) && newSetFromMap.add(th8)) {
                        pN.setY((Object) th, "");
                        pN.setY((Object) th8, "");
                        if (th != th8) {
                            C0369pc.setX.setX(th, th8);
                        }
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new rD(th);
        }
        if (th != null) {
            if (setY(th) || MenuHostHelper$$ExternalSyntheticLambda1(th)) {
                if (obj != null) {
                    rD.setY.compareAndSet((rD) obj, 0, 1);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
            }
        }
        setY(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = setIconTintList;
        Object x = sG.setX(obj);
        while (!atomicReferenceFieldUpdater.compareAndSet(this, sk_menuhosthelper__externalsyntheticlambda1, x) && atomicReferenceFieldUpdater.get(this) == sk_menuhosthelper__externalsyntheticlambda1) {
        }
        rX.setIconTintList();
        MenuHostHelper$$ExternalSyntheticLambda0(sk_menuhosthelper__externalsyntheticlambda1, obj);
        return obj;
    }

    private final boolean setX(InterfaceC0470sw interfaceC0470sw, Object obj) {
        boolean z;
        rX.setIconTintList();
        rX.setIconTintList();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = setIconTintList;
        Object x = sG.setX(obj);
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0470sw, x)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC0470sw) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            setY(obj);
            MenuHostHelper$$ExternalSyntheticLambda0(interfaceC0470sw, obj);
            return true;
        }
        return false;
    }

    private final boolean setY(Throwable th) {
        if (r_()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        rB rBVar = (rB) this._parentHandle;
        return (rBVar == null || rBVar == sM.setIconTintList) ? z : rBVar.setY(th) || z;
    }

    private final int setLayoutAnimation(Object obj) {
        C0458sk c0458sk;
        boolean z = false;
        if (!(obj instanceof C0458sk)) {
            if (obj instanceof C0468su) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = setIconTintList;
                sJ sJVar = ((C0468su) obj).MenuHostHelper$$ExternalSyntheticLambda1;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, sJVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    ViewPager$SavedState$1();
                    return 1;
                }
                return -1;
            }
            return 0;
        } else if (((C0458sk) obj).setY) {
            return 0;
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = setIconTintList;
            c0458sk = sG.setX;
            while (true) {
                if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c0458sk)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                ViewPager$SavedState$1();
                return 1;
            }
            return -1;
        }
    }

    private CancellationException MenuHostHelper$$ExternalSyntheticLambda1(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = MenuHostHelper$$ExternalSyntheticLambda0();
            }
            return new sE(str, th, this);
        }
        return cancellationException;
    }

    @Override // o.sB
    public final InterfaceC0456si setIconTintList(InterfaceC0377pk<? super Throwable, nX> interfaceC0377pk) {
        return setY(false, true, interfaceC0377pk);
    }

    private final boolean setIconTintList(final Object obj, sJ sJVar, sC sCVar) {
        int MenuHostHelper$$ExternalSyntheticLambda0;
        sJ sJVar2 = sJVar;
        sC sCVar2 = sCVar;
        C0518uo.setX setx = new C0518uo.setX(sCVar2) { // from class: o.sK$MenuHostHelper$$ExternalSyntheticLambda0
            @Override // o.tY
            public final /* synthetic */ Object setX(C0518uo c0518uo) {
                Object obj2;
                sK sKVar = this;
                while (true) {
                    obj2 = sKVar._state;
                    if (!(obj2 instanceof AbstractC0524uu)) {
                        break;
                    }
                    ((AbstractC0524uu) obj2).MenuHostHelper$$ExternalSyntheticLambda1(sKVar);
                }
                if (obj2 == obj) {
                    return null;
                }
                return C0516um.setY();
            }
        };
        do {
            C0518uo iconTintList = sJVar2.setIconTintList((AbstractC0524uu) null);
            if (iconTintList == null) {
                iconTintList = C0518uo.MenuHostHelper$$ExternalSyntheticLambda1((C0518uo) sJVar2._prev);
            }
            MenuHostHelper$$ExternalSyntheticLambda0 = iconTintList.MenuHostHelper$$ExternalSyntheticLambda0(sCVar2, sJVar2, setx);
            if (MenuHostHelper$$ExternalSyntheticLambda0 == 1) {
                return true;
            }
        } while (MenuHostHelper$$ExternalSyntheticLambda0 != 2);
        return false;
    }

    @Override // o.rC
    public final void setX(sO sOVar) {
        setX((Object) sOVar);
    }

    public boolean setIconTintList(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return setX((Object) th) && n_();
    }

    public final boolean setX(Object obj) {
        Object obj2;
        C0528uy c0528uy;
        C0528uy c0528uy2;
        C0528uy c0528uy3;
        obj2 = sG.MenuHostHelper$$ExternalSyntheticLambda1;
        if (o_() && (obj2 = MenuHostHelper$$ExternalSyntheticLambda1(obj)) == sG.setIconTintList) {
            return true;
        }
        c0528uy = sG.MenuHostHelper$$ExternalSyntheticLambda1;
        if (obj2 == c0528uy) {
            obj2 = setNavigationOnClickListener(obj);
        }
        c0528uy2 = sG.MenuHostHelper$$ExternalSyntheticLambda1;
        if (obj2 == c0528uy2 || obj2 == sG.setIconTintList) {
            return true;
        }
        c0528uy3 = sG.setNavigationOnClickListener;
        if (obj2 == c0528uy3) {
            return false;
        }
        setIconTintList(obj2);
        return true;
    }

    private final Throwable setUnboundedRipple(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new sE(MenuHostHelper$$ExternalSyntheticLambda0(), null, this) : th;
        } else if (obj != null) {
            return ((sO) obj).setCenterIfNoTextEnabled();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    private final sJ setY(InterfaceC0470sw interfaceC0470sw) {
        Object obj;
        sJ p_ = interfaceC0470sw.p_();
        if (p_ == null) {
            if (interfaceC0470sw instanceof C0458sk) {
                return new sJ();
            }
            if (interfaceC0470sw instanceof sC) {
                sC sCVar = (sC) interfaceC0470sw;
                sCVar.setIconTintList(new sJ());
                while (true) {
                    obj = sCVar._next;
                    if (!(obj instanceof AbstractC0524uu)) {
                        break;
                    }
                    ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(sCVar);
                }
                C0518uo iconTintList = C0516um.setIconTintList(obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = setIconTintList;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, sCVar, iconTintList) && atomicReferenceFieldUpdater.get(this) == sCVar) {
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("State should have list: ");
            sb.append(interfaceC0470sw);
            throw new IllegalStateException(sb.toString().toString());
        }
        return p_;
    }

    private final Object setX(Object obj, Object obj2) {
        C0528uy c0528uy;
        C0528uy c0528uy2;
        if (!(obj instanceof InterfaceC0470sw)) {
            c0528uy2 = sG.MenuHostHelper$$ExternalSyntheticLambda1;
            return c0528uy2;
        } else if (((obj instanceof C0458sk) || (obj instanceof sC)) && !(obj instanceof rA) && !(obj2 instanceof rD)) {
            if (setX((InterfaceC0470sw) obj, obj2)) {
                return obj2;
            }
            c0528uy = sG.MenuHostHelper$$ExternalSyntheticLambda0;
            return c0528uy;
        } else {
            return setY((InterfaceC0470sw) obj, obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object setY(InterfaceC0470sw interfaceC0470sw, Object obj) {
        boolean z;
        C0528uy c0528uy;
        C0528uy c0528uy2;
        C0528uy c0528uy3;
        sJ y = setY(interfaceC0470sw);
        if (y == null) {
            c0528uy3 = sG.MenuHostHelper$$ExternalSyntheticLambda0;
            return c0528uy3;
        }
        rA rAVar = null;
        sK$MenuHostHelper$$ExternalSyntheticLambda1 sk_menuhosthelper__externalsyntheticlambda1 = interfaceC0470sw instanceof sK$MenuHostHelper$$ExternalSyntheticLambda1 ? (sK$MenuHostHelper$$ExternalSyntheticLambda1) interfaceC0470sw : null;
        if (sk_menuhosthelper__externalsyntheticlambda1 == null) {
            sk_menuhosthelper__externalsyntheticlambda1 = new sK$MenuHostHelper$$ExternalSyntheticLambda1(y, null);
        }
        pY.setX setx = new pY.setX();
        synchronized (sk_menuhosthelper__externalsyntheticlambda1) {
            if (sk_menuhosthelper__externalsyntheticlambda1._isCompleting != 0) {
                c0528uy2 = sG.MenuHostHelper$$ExternalSyntheticLambda1;
                return c0528uy2;
            }
            sk_menuhosthelper__externalsyntheticlambda1._isCompleting = 1;
            if (sk_menuhosthelper__externalsyntheticlambda1 != interfaceC0470sw) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = setIconTintList;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0470sw, sk_menuhosthelper__externalsyntheticlambda1)) {
                        if (atomicReferenceFieldUpdater.get(this) != interfaceC0470sw) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    c0528uy = sG.MenuHostHelper$$ExternalSyntheticLambda0;
                    return c0528uy;
                }
            }
            rX.setIconTintList();
            boolean z2 = ((Throwable) sk_menuhosthelper__externalsyntheticlambda1._rootCause) != null;
            rD rDVar = obj instanceof rD ? (rD) obj : null;
            if (rDVar != null) {
                sk_menuhosthelper__externalsyntheticlambda1.setIconTintList(rDVar.MenuHostHelper$$ExternalSyntheticLambda1);
            }
            setx.setX = true ^ z2 ? (Throwable) sk_menuhosthelper__externalsyntheticlambda1._rootCause : 0;
            nX nXVar = nX.setX;
            Throwable th = (Throwable) setx.setX;
            if (th != null) {
                MenuHostHelper$$ExternalSyntheticLambda1(y, th);
            }
            rA rAVar2 = interfaceC0470sw instanceof rA ? (rA) interfaceC0470sw : null;
            if (rAVar2 == null) {
                sJ p_ = interfaceC0470sw.p_();
                if (p_ != null) {
                    rAVar = MenuHostHelper$$ExternalSyntheticLambda1((C0518uo) p_);
                }
            } else {
                rAVar = rAVar2;
            }
            if (rAVar != null && MenuHostHelper$$ExternalSyntheticLambda1(sk_menuhosthelper__externalsyntheticlambda1, rAVar, obj)) {
                return sG.setIconTintList;
            }
            return setY(sk_menuhosthelper__externalsyntheticlambda1, obj);
        }
    }

    private final boolean MenuHostHelper$$ExternalSyntheticLambda1(sK$MenuHostHelper$$ExternalSyntheticLambda1 sk_menuhosthelper__externalsyntheticlambda1, rA rAVar, Object obj) {
        while (rAVar.MenuHostHelper$$ExternalSyntheticLambda0.setY(false, false, new setIconTintList(this, sk_menuhosthelper__externalsyntheticlambda1, rAVar, obj)) == sM.setIconTintList) {
            rAVar = MenuHostHelper$$ExternalSyntheticLambda1((C0518uo) rAVar);
            if (rAVar == null) {
                return false;
            }
        }
        return true;
    }

    private static rA MenuHostHelper$$ExternalSyntheticLambda1(C0518uo c0518uo) {
        while (c0518uo.s_()) {
            C0518uo iconTintList = c0518uo.setIconTintList((AbstractC0524uu) null);
            c0518uo = iconTintList == null ? C0518uo.MenuHostHelper$$ExternalSyntheticLambda1((C0518uo) c0518uo._prev) : iconTintList;
        }
        while (true) {
            Object obj = c0518uo._next;
            if (!(obj instanceof AbstractC0524uu)) {
                c0518uo = C0516um.setIconTintList(obj);
                if (c0518uo.s_()) {
                    continue;
                } else if (c0518uo instanceof rA) {
                    return (rA) c0518uo;
                } else {
                    if (c0518uo instanceof sJ) {
                        return null;
                    }
                }
            } else {
                ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(c0518uo);
            }
        }
    }

    @Override // o.sB
    public final rB setIconTintList(rC rCVar) {
        return (rB) setY(true, true, new rA(rCVar));
    }

    public void setX(Throwable th) {
        throw th;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(setUiOptions());
        sb2.append('{');
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AbstractC0524uu)) {
                sb2.append(ViewPager$SavedState$1(obj));
                sb2.append('}');
                sb.append(sb2.toString());
                sb.append('@');
                sb.append(rZ.setY(this));
                return sb.toString();
            }
            ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(this);
        }
    }

    public String setUiOptions() {
        String simpleName;
        simpleName = getClass().getSimpleName();
        return simpleName;
    }

    private static String ViewPager$SavedState$1(Object obj) {
        if (obj instanceof sK$MenuHostHelper$$ExternalSyntheticLambda1) {
            sK$MenuHostHelper$$ExternalSyntheticLambda1 sk_menuhosthelper__externalsyntheticlambda1 = (sK$MenuHostHelper$$ExternalSyntheticLambda1) obj;
            if (((Throwable) sk_menuhosthelper__externalsyntheticlambda1._rootCause) != null) {
                return "Cancelling";
            }
            if (sk_menuhosthelper__externalsyntheticlambda1._isCompleting != 0) {
                return "Completing";
            }
        } else if (!(obj instanceof InterfaceC0470sw)) {
            return obj instanceof rD ? "Cancelled" : "Completed";
        } else if (!((InterfaceC0470sw) obj).setX()) {
            return "New";
        }
        return "Active";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setIconTintList extends sC {
        private final Object MenuHostHelper$$ExternalSyntheticLambda0;
        private final rA MenuHostHelper$$ExternalSyntheticLambda1;
        private final sK$MenuHostHelper$$ExternalSyntheticLambda1 setUnboundedRipple;
        private final sK setX;

        @Override // o.InterfaceC0377pk
        public final /* synthetic */ nX setX(Throwable th) {
            sK.MenuHostHelper$$ExternalSyntheticLambda1(this.setX, this.setUnboundedRipple, this.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda0);
            return nX.setX;
        }

        public setIconTintList(sK sKVar, sK$MenuHostHelper$$ExternalSyntheticLambda1 sk_menuhosthelper__externalsyntheticlambda1, rA rAVar, Object obj) {
            this.setX = sKVar;
            this.setUnboundedRipple = sk_menuhosthelper__externalsyntheticlambda1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = rAVar;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = obj;
        }

        @Override // o.rM
        /* renamed from: setX  reason: avoid collision after fix types in other method */
        public final void setX2(Throwable th) {
            sK.MenuHostHelper$$ExternalSyntheticLambda1(this.setX, this.setUnboundedRipple, this.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
    }

    /* loaded from: classes.dex */
    static final class setX<T> extends C0444rx<T> {
        private final sK setX;

        @Override // o.C0444rx
        protected final String setUiOptions() {
            return "AwaitContinuation";
        }

        public setX(oK<? super T> oKVar, sK sKVar) {
            super(oKVar, 1);
            this.setX = sKVar;
        }

        @Override // o.C0444rx
        public final Throwable MenuHostHelper$$ExternalSyntheticLambda1(sB sBVar) {
            Object obj;
            Throwable th;
            sK sKVar = this.setX;
            while (true) {
                obj = sKVar._state;
                if (!(obj instanceof AbstractC0524uu)) {
                    break;
                }
                ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(sKVar);
            }
            return (!(obj instanceof sK$MenuHostHelper$$ExternalSyntheticLambda1) || (th = (Throwable) ((sK$MenuHostHelper$$ExternalSyntheticLambda1) obj)._rootCause) == null) ? obj instanceof rD ? ((rD) obj).MenuHostHelper$$ExternalSyntheticLambda1 : sBVar.setLayoutAnimation() : th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r4 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void MenuHostHelper$$ExternalSyntheticLambda1(o.sJ r7, java.lang.Throwable r8) {
        /*
            r6 = this;
            o.ul r7 = (o.C0515ul) r7
        L2:
            java.lang.Object r0 = r7._next
            boolean r1 = r0 instanceof o.AbstractC0524uu
            if (r1 != 0) goto L6f
            o.uo r0 = (o.C0518uo) r0
            r1 = 0
        Lb:
            boolean r2 = o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r0, r7)
            if (r2 != 0) goto L64
            boolean r2 = r0 instanceof o.sF
            if (r2 == 0) goto L51
            r2 = r0
            o.sC r2 = (o.sC) r2
            r2.setX(r8)     // Catch: java.lang.Throwable -> L1c
            goto L51
        L1c:
            r3 = move-exception
            r4 = r1
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L33
            java.lang.String r5 = ""
            o.pN.setY(r4, r5)
            o.pN.setY(r3, r5)
            if (r4 == r3) goto L31
            o.oY r5 = o.C0369pc.setX
            r5.setX(r4, r3)
        L31:
            if (r4 != 0) goto L51
        L33:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Exception in completion handler "
            r1.<init>(r4)
            r1.append(r2)
            java.lang.String r2 = " for "
            r1.append(r2)
            r1.append(r6)
            o.rI r2 = new o.rI
            java.lang.String r1 = r1.toString()
            r2.<init>(r1, r3)
            o.nX r1 = o.nX.setX
            goto L52
        L51:
            r2 = r1
        L52:
            java.lang.Object r1 = r0._next
            boolean r3 = r1 instanceof o.AbstractC0524uu
            if (r3 != 0) goto L5e
            o.uo r0 = o.C0516um.setIconTintList(r1)
            r1 = r2
            goto Lb
        L5e:
            o.uu r1 = (o.AbstractC0524uu) r1
            r1.MenuHostHelper$$ExternalSyntheticLambda1(r0)
            goto L52
        L64:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L6b
            r6.setX(r1)
        L6b:
            r6.setY(r8)
            return
        L6f:
            o.uu r0 = (o.AbstractC0524uu) r0
            r0.MenuHostHelper$$ExternalSyntheticLambda1(r7)
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sK.MenuHostHelper$$ExternalSyntheticLambda1(o.sJ, java.lang.Throwable):void");
    }

    @Override // o.sB
    public final void MenuHostHelper$$ExternalSyntheticLambda1(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new sE(MenuHostHelper$$ExternalSyntheticLambda0(), null, this);
        }
        setX((Object) cancellationException);
    }

    public static final /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(sK sKVar, sK$MenuHostHelper$$ExternalSyntheticLambda1 sk_menuhosthelper__externalsyntheticlambda1, rA rAVar, Object obj) {
        rX.setIconTintList();
        rA MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1((C0518uo) rAVar);
        if (MenuHostHelper$$ExternalSyntheticLambda1 == null || !sKVar.MenuHostHelper$$ExternalSyntheticLambda1(sk_menuhosthelper__externalsyntheticlambda1, MenuHostHelper$$ExternalSyntheticLambda1, obj)) {
            sKVar.setIconTintList(sKVar.setY(sk_menuhosthelper__externalsyntheticlambda1, obj));
        }
    }

    private final Object MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        C0528uy c0528uy;
        C0528uy c0528uy2;
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof AbstractC0524uu)) {
                if (!(obj2 instanceof InterfaceC0470sw) || ((obj2 instanceof sK$MenuHostHelper$$ExternalSyntheticLambda1) && ((sK$MenuHostHelper$$ExternalSyntheticLambda1) obj2)._isCompleting != 0)) {
                    break;
                }
                Object x = setX(obj2, new rD(setUnboundedRipple(obj)));
                c0528uy2 = sG.MenuHostHelper$$ExternalSyntheticLambda0;
                if (x != c0528uy2) {
                    return x;
                }
            } else {
                ((AbstractC0524uu) obj2).MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
        }
        c0528uy = sG.MenuHostHelper$$ExternalSyntheticLambda1;
        return c0528uy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
        if (r6 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void MenuHostHelper$$ExternalSyntheticLambda0(o.InterfaceC0470sw r9, java.lang.Object r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8._parentHandle
            o.rB r0 = (o.rB) r0
            if (r0 == 0) goto Lf
            r0.MenuHostHelper$$ExternalSyntheticLambda0()
            o.sM r0 = o.sM.setIconTintList
            o.rB r0 = (o.rB) r0
            r8._parentHandle = r0
        Lf:
            boolean r0 = r10 instanceof o.rD
            r1 = 0
            if (r0 == 0) goto L17
            o.rD r10 = (o.rD) r10
            goto L18
        L17:
            r10 = r1
        L18:
            if (r10 == 0) goto L1d
            java.lang.Throwable r10 = r10.MenuHostHelper$$ExternalSyntheticLambda1
            goto L1e
        L1d:
            r10 = r1
        L1e:
            boolean r0 = r9 instanceof o.sC
            java.lang.String r2 = " for "
            java.lang.String r3 = "Exception in completion handler "
            if (r0 == 0) goto L4b
            r0 = r9
            o.sC r0 = (o.sC) r0     // Catch: java.lang.Throwable -> L2d
            r0.setX(r10)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r10 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r9)
            r0.append(r2)
            r0.append(r8)
            o.rI r9 = new o.rI
            java.lang.String r0 = r0.toString()
            r9.<init>(r0, r10)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r8.setX(r9)
            return
        L4b:
            o.sJ r9 = r9.p_()
            if (r9 == 0) goto Lbe
            o.ul r9 = (o.C0515ul) r9
        L53:
            java.lang.Object r0 = r9._next
            boolean r4 = r0 instanceof o.AbstractC0524uu
            if (r4 != 0) goto Lb8
            o.uo r0 = (o.C0518uo) r0
        L5b:
            boolean r4 = o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r0, r9)
            if (r4 != 0) goto Lb0
            boolean r4 = r0 instanceof o.sC
            if (r4 == 0) goto L9d
            r4 = r0
            o.sC r4 = (o.sC) r4
            r4.setX(r10)     // Catch: java.lang.Throwable -> L6c
            goto L9d
        L6c:
            r5 = move-exception
            r6 = r1
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 == 0) goto L83
            java.lang.String r7 = ""
            o.pN.setY(r6, r7)
            o.pN.setY(r5, r7)
            if (r6 == r5) goto L81
            o.oY r7 = o.C0369pc.setX
            r7.setX(r6, r5)
        L81:
            if (r6 != 0) goto L9d
        L83:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r4)
            r1.append(r2)
            r1.append(r8)
            o.rI r4 = new o.rI
            java.lang.String r1 = r1.toString()
            r4.<init>(r1, r5)
            o.nX r1 = o.nX.setX
            goto L9e
        L9d:
            r4 = r1
        L9e:
            java.lang.Object r1 = r0._next
            boolean r5 = r1 instanceof o.AbstractC0524uu
            if (r5 != 0) goto Laa
            o.uo r0 = o.C0516um.setIconTintList(r1)
            r1 = r4
            goto L5b
        Laa:
            o.uu r1 = (o.AbstractC0524uu) r1
            r1.MenuHostHelper$$ExternalSyntheticLambda1(r0)
            goto L9e
        Lb0:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto Lbe
            r8.setX(r1)
            goto Lbe
        Lb8:
            o.uu r0 = (o.AbstractC0524uu) r0
            r0.MenuHostHelper$$ExternalSyntheticLambda1(r9)
            goto L53
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sK.MenuHostHelper$$ExternalSyntheticLambda0(o.sw, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0002 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object setNavigationOnClickListener(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sK.setNavigationOnClickListener(java.lang.Object):java.lang.Object");
    }

    public final Object setIconTintList(oK<Object> oKVar) {
        boolean z;
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AbstractC0524uu)) {
                if (!(obj instanceof InterfaceC0470sw)) {
                    if (obj instanceof rD) {
                        Throwable th = ((rD) obj).MenuHostHelper$$ExternalSyntheticLambda1;
                        z = rX.setX;
                        if (!z) {
                            throw th;
                        }
                        if (oKVar instanceof oW) {
                            throw uB.setIconTintList(th, (oW) oKVar);
                        }
                        throw th;
                    }
                    return sG.MenuHostHelper$$ExternalSyntheticLambda0(obj);
                } else if (setLayoutAnimation(obj) >= 0) {
                    setX setx = new setX(oP.setY(oKVar), this);
                    setx.setUnboundedRipple();
                    setx.setIconTintList((InterfaceC0377pk<? super Throwable, nX>) new C0459sl(setY(false, true, new sL(setx))));
                    Object MenuHostHelper$$ExternalSyntheticLambda0 = setx.MenuHostHelper$$ExternalSyntheticLambda0();
                    if (MenuHostHelper$$ExternalSyntheticLambda0 == oJ.COROUTINE_SUSPENDED) {
                        pN.setY(oKVar, "");
                    }
                    return MenuHostHelper$$ExternalSyntheticLambda0;
                }
            } else {
                ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
        }
    }

    @Override // o.oM
    public <R> R fold(R r, InterfaceC0389pw<? super R, ? super oM$MenuHostHelper$$ExternalSyntheticLambda1, ? extends R> interfaceC0389pw) {
        pN.setY(interfaceC0389pw, "");
        return interfaceC0389pw.MenuHostHelper$$ExternalSyntheticLambda0(r, this);
    }

    @Override // o.oM$MenuHostHelper$$ExternalSyntheticLambda1, o.oM
    public <E extends oM$MenuHostHelper$$ExternalSyntheticLambda1> E get(oM$MenuHostHelper$$ExternalSyntheticLambda0<E> om_menuhosthelper__externalsyntheticlambda0) {
        sK sKVar = this;
        pN.setY(om_menuhosthelper__externalsyntheticlambda0, "");
        if (pN.MenuHostHelper$$ExternalSyntheticLambda0(sKVar.getKey(), om_menuhosthelper__externalsyntheticlambda0)) {
            pN.setX(sKVar);
            return sKVar;
        }
        return null;
    }

    @Override // o.sB
    public final CancellationException setLayoutAnimation() {
        Object obj;
        String simpleName;
        String simpleName2;
        while (true) {
            obj = this._state;
            if (!(obj instanceof AbstractC0524uu)) {
                break;
            }
            ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(this);
        }
        if (!(obj instanceof sK$MenuHostHelper$$ExternalSyntheticLambda1)) {
            if (obj instanceof InterfaceC0470sw) {
                StringBuilder sb = new StringBuilder("Job is still new or active: ");
                sb.append(this);
                throw new IllegalStateException(sb.toString().toString());
            } else if (!(obj instanceof rD)) {
                StringBuilder sb2 = new StringBuilder();
                simpleName = getClass().getSimpleName();
                sb2.append(simpleName);
                sb2.append(" has completed normally");
                return new sE(sb2.toString(), null, this);
            } else {
                return MenuHostHelper$$ExternalSyntheticLambda1(((rD) obj).MenuHostHelper$$ExternalSyntheticLambda1, (String) null);
            }
        }
        Throwable th = (Throwable) ((sK$MenuHostHelper$$ExternalSyntheticLambda1) obj)._rootCause;
        if (th != null) {
            StringBuilder sb3 = new StringBuilder();
            simpleName2 = getClass().getSimpleName();
            sb3.append(simpleName2);
            sb3.append(" is cancelling");
            CancellationException MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(th, sb3.toString());
            if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                return MenuHostHelper$$ExternalSyntheticLambda1;
            }
        }
        StringBuilder sb4 = new StringBuilder("Job is still new or active: ");
        sb4.append(this);
        throw new IllegalStateException(sb4.toString().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Throwable] */
    @Override // o.sO
    public final CancellationException setCenterIfNoTextEnabled() {
        Object obj;
        CancellationException cancellationException;
        while (true) {
            obj = this._state;
            if (!(obj instanceof AbstractC0524uu)) {
                break;
            }
            ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(this);
        }
        if (!(obj instanceof sK$MenuHostHelper$$ExternalSyntheticLambda1)) {
            if (obj instanceof rD) {
                cancellationException = ((rD) obj).MenuHostHelper$$ExternalSyntheticLambda1;
            } else if (obj instanceof InterfaceC0470sw) {
                StringBuilder sb = new StringBuilder("Cannot be cancelling child in this state: ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            } else {
                cancellationException = null;
            }
        } else {
            cancellationException = (Throwable) ((sK$MenuHostHelper$$ExternalSyntheticLambda1) obj)._rootCause;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            StringBuilder sb2 = new StringBuilder("Parent job is ");
            sb2.append(ViewPager$SavedState$1(obj));
            return new sE(sb2.toString(), cancellationException, this);
        }
        return cancellationException2;
    }

    @Override // o.sB
    public final InterfaceC0456si setY(boolean z, boolean z2, InterfaceC0377pk<? super Throwable, nX> interfaceC0377pk) {
        C0473sz c0473sz;
        boolean z3;
        Object obj;
        Throwable th;
        if (z) {
            C0471sx c0471sx = interfaceC0377pk instanceof sF ? (sF) interfaceC0377pk : null;
            if (c0471sx == null) {
                c0471sx = new C0471sx(interfaceC0377pk);
            }
            c0473sz = c0471sx;
        } else {
            c0473sz = interfaceC0377pk instanceof sC ? (sC) interfaceC0377pk : null;
            if (c0473sz != null) {
                rX.setIconTintList();
            } else {
                c0473sz = new C0473sz(interfaceC0377pk);
            }
        }
        c0473sz.setY = this;
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof AbstractC0524uu)) {
                if (obj2 instanceof C0458sk) {
                    C0458sk c0458sk = (C0458sk) obj2;
                    if (c0458sk.setY) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = setIconTintList;
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0473sz)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    z3 = false;
                                    break;
                                }
                            } else {
                                z3 = true;
                                break;
                            }
                        }
                        if (z3) {
                            return c0473sz;
                        }
                    } else {
                        sJ sJVar = new sJ();
                        InterfaceC0470sw c0468su = c0458sk.setY ? sJVar : new C0468su(sJVar);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = setIconTintList;
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, c0458sk, c0468su) && atomicReferenceFieldUpdater2.get(this) == c0458sk) {
                        }
                    }
                } else if (obj2 instanceof InterfaceC0470sw) {
                    sJ p_ = ((InterfaceC0470sw) obj2).p_();
                    if (p_ != null) {
                        InterfaceC0456si interfaceC0456si = sM.setIconTintList;
                        if (z && (obj2 instanceof sK$MenuHostHelper$$ExternalSyntheticLambda1)) {
                            synchronized (obj2) {
                                th = (Throwable) ((sK$MenuHostHelper$$ExternalSyntheticLambda1) obj2)._rootCause;
                                if (th == null || ((interfaceC0377pk instanceof rA) && ((sK$MenuHostHelper$$ExternalSyntheticLambda1) obj2)._isCompleting == 0)) {
                                    if (setIconTintList(obj2, p_, c0473sz)) {
                                        if (th == null) {
                                            return c0473sz;
                                        }
                                        interfaceC0456si = c0473sz;
                                    }
                                }
                                nX nXVar = nX.setX;
                            }
                        } else {
                            th = null;
                        }
                        if (th != null) {
                            if (z2) {
                                interfaceC0377pk.setX(th);
                            }
                            return interfaceC0456si;
                        } else if (setIconTintList(obj2, p_, c0473sz)) {
                            return c0473sz;
                        }
                    } else if (obj2 != null) {
                        sC sCVar = (sC) obj2;
                        sCVar.setIconTintList(new sJ());
                        while (true) {
                            obj = sCVar._next;
                            if (!(obj instanceof AbstractC0524uu)) {
                                break;
                            }
                            ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(sCVar);
                        }
                        C0518uo iconTintList = C0516um.setIconTintList(obj);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = setIconTintList;
                        while (!atomicReferenceFieldUpdater3.compareAndSet(this, sCVar, iconTintList) && atomicReferenceFieldUpdater3.get(this) == sCVar) {
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                } else {
                    if (z2) {
                        rD rDVar = obj2 instanceof rD ? (rD) obj2 : null;
                        interfaceC0377pk.setX(rDVar != null ? rDVar.MenuHostHelper$$ExternalSyntheticLambda1 : null);
                    }
                    return sM.setIconTintList;
                }
            } else {
                ((AbstractC0524uu) obj2).MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
        }
    }

    @Override // o.sB
    public boolean setNavigationOnClickListener() {
        Object obj;
        while (true) {
            obj = this._state;
            if (!(obj instanceof AbstractC0524uu)) {
                break;
            }
            ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(this);
        }
        return (obj instanceof InterfaceC0470sw) && ((InterfaceC0470sw) obj).setX();
    }

    @Override // o.sB
    public final boolean setUnboundedRipple() {
        Object obj;
        while (true) {
            obj = this._state;
            if (!(obj instanceof AbstractC0524uu)) {
                break;
            }
            ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(this);
        }
        if (!(obj instanceof rD)) {
            if (!(obj instanceof sK$MenuHostHelper$$ExternalSyntheticLambda1)) {
                return false;
            }
            if (!(((Throwable) ((sK$MenuHostHelper$$ExternalSyntheticLambda1) obj)._rootCause) != null)) {
                return false;
            }
        }
        return true;
    }

    public final boolean setUiOptions(Object obj) {
        C0528uy c0528uy;
        C0528uy c0528uy2;
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof AbstractC0524uu)) {
                Object x = setX(obj2, obj);
                c0528uy = sG.MenuHostHelper$$ExternalSyntheticLambda1;
                if (x == c0528uy) {
                    return false;
                }
                if (x == sG.setIconTintList) {
                    return true;
                }
                c0528uy2 = sG.MenuHostHelper$$ExternalSyntheticLambda0;
                if (x != c0528uy2) {
                    setIconTintList(x);
                    return true;
                }
            } else {
                ((AbstractC0524uu) obj2).MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
        }
    }

    public final Object setOnLongClickListener(Object obj) {
        C0528uy c0528uy;
        C0528uy c0528uy2;
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof AbstractC0524uu)) {
                Object x = setX(obj2, obj);
                c0528uy = sG.MenuHostHelper$$ExternalSyntheticLambda1;
                if (x != c0528uy) {
                    c0528uy2 = sG.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (x != c0528uy2) {
                        return x;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Job ");
                    sb.append(this);
                    sb.append(" is already complete or completing, but is being completed with ");
                    sb.append(obj);
                    String obj3 = sb.toString();
                    rD rDVar = obj instanceof rD ? (rD) obj : null;
                    throw new IllegalStateException(obj3, rDVar != null ? rDVar.MenuHostHelper$$ExternalSyntheticLambda1 : null);
                }
            } else {
                ((AbstractC0524uu) obj2).MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
        }
    }

    @Override // o.oM
    public oM minusKey(oM$MenuHostHelper$$ExternalSyntheticLambda0<?> om_menuhosthelper__externalsyntheticlambda0) {
        sK sKVar = this;
        pN.setY(om_menuhosthelper__externalsyntheticlambda0, "");
        boolean MenuHostHelper$$ExternalSyntheticLambda0 = pN.MenuHostHelper$$ExternalSyntheticLambda0(sKVar.getKey(), om_menuhosthelper__externalsyntheticlambda0);
        Object obj = sKVar;
        if (MenuHostHelper$$ExternalSyntheticLambda0) {
            obj = oL.setX;
        }
        return (oM) obj;
    }

    @Override // o.oM
    public oM plus(oM oMVar) {
        pN.setY(oMVar, "");
        sK sKVar = this;
        pN.setY(oMVar, "");
        return oMVar != oL.setX ? (oM) oMVar.fold(sKVar, oM.setX.setIconTintList.setX) : sKVar;
    }

    @Override // o.sB
    public final boolean setOnLongClickListener() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AbstractC0524uu)) {
                int layoutAnimation = setLayoutAnimation(obj);
                if (layoutAnimation == 0) {
                    return false;
                }
                if (layoutAnimation == 1) {
                    return true;
                }
            } else {
                ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
        }
    }
}