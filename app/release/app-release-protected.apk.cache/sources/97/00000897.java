package o;

/* loaded from: classes.dex */
public abstract class rQ extends oI implements oN {
    public static final setY setIconTintList = new setY((byte) 0);

    public boolean MenuHostHelper$$ExternalSyntheticLambda0(oM oMVar) {
        return true;
    }

    public abstract void setY(oM oMVar, Runnable runnable);

    @Override // o.oI, o.oM$MenuHostHelper$$ExternalSyntheticLambda1, o.oM
    public <E extends oM$MenuHostHelper$$ExternalSyntheticLambda1> E get(oM$MenuHostHelper$$ExternalSyntheticLambda0<E> om_menuhosthelper__externalsyntheticlambda0) {
        pN.setY(om_menuhosthelper__externalsyntheticlambda0, "");
        if (om_menuhosthelper__externalsyntheticlambda0 instanceof oH) {
            oH oHVar = (oH) om_menuhosthelper__externalsyntheticlambda0;
            oM$MenuHostHelper$$ExternalSyntheticLambda0<?> key = getKey();
            pN.setY(key, "");
            if (key == oHVar || oHVar.MenuHostHelper$$ExternalSyntheticLambda0 == key) {
                rQ rQVar = this;
                pN.setY(rQVar, "");
                E e = (E) oHVar.setY.setX(rQVar);
                if (e instanceof oM$MenuHostHelper$$ExternalSyntheticLambda1) {
                    return e;
                }
                return null;
            }
            return null;
        } else if (oN.MenuHostHelper$$ExternalSyntheticLambda0 == om_menuhosthelper__externalsyntheticlambda0) {
            pN.setX(this);
            return this;
        } else {
            return null;
        }
    }

    @Override // o.oI, o.oM
    public oM minusKey(oM$MenuHostHelper$$ExternalSyntheticLambda0<?> om_menuhosthelper__externalsyntheticlambda0) {
        oM oMVar;
        pN.setY(om_menuhosthelper__externalsyntheticlambda0, "");
        if (om_menuhosthelper__externalsyntheticlambda0 instanceof oH) {
            oH oHVar = (oH) om_menuhosthelper__externalsyntheticlambda0;
            oM$MenuHostHelper$$ExternalSyntheticLambda0<?> key = getKey();
            pN.setY(key, "");
            if (key == oHVar || oHVar.MenuHostHelper$$ExternalSyntheticLambda0 == key) {
                rQ rQVar = this;
                pN.setY(rQVar, "");
                if (((oM$MenuHostHelper$$ExternalSyntheticLambda1) oHVar.setY.setX(rQVar)) != null) {
                    oMVar = oL.setX;
                    return oMVar;
                }
            }
            oMVar = this;
            return oMVar;
        }
        return oN.MenuHostHelper$$ExternalSyntheticLambda0 == om_menuhosthelper__externalsyntheticlambda0 ? oL.setX : this;
    }

    public rQ() {
        super(oN.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    /* loaded from: classes.dex */
    public static final class setY extends oH<oN, rQ> {
        public /* synthetic */ setY(byte b) {
            this();
        }

        /* renamed from: o.rQ$setY$3  reason: invalid class name */
        /* loaded from: classes.dex */
        static final class AnonymousClass3 extends pO implements InterfaceC0377pk<oM$MenuHostHelper$$ExternalSyntheticLambda1, rQ> {
            public static final AnonymousClass3 setX = new AnonymousClass3();

            AnonymousClass3() {
                super(1);
            }

            @Override // o.InterfaceC0377pk
            public final /* bridge */ /* synthetic */ rQ setX(oM$MenuHostHelper$$ExternalSyntheticLambda1 om_menuhosthelper__externalsyntheticlambda1) {
                oM$MenuHostHelper$$ExternalSyntheticLambda1 om_menuhosthelper__externalsyntheticlambda12 = om_menuhosthelper__externalsyntheticlambda1;
                if (om_menuhosthelper__externalsyntheticlambda12 instanceof rQ) {
                    return (rQ) om_menuhosthelper__externalsyntheticlambda12;
                }
                return null;
            }
        }

        private setY() {
            super(oN.MenuHostHelper$$ExternalSyntheticLambda0, AnonymousClass3.setX);
        }
    }

    public rQ setIconTintList(int i) {
        C0512ui.setX(i);
        return new RunnableC0514uk(this, i);
    }

    @Override // o.oN
    public final <T> oK<T> MenuHostHelper$$ExternalSyntheticLambda1(oK<? super T> oKVar) {
        return new C0511uh(this, oKVar);
    }

    @Override // o.oN
    public final void MenuHostHelper$$ExternalSyntheticLambda0(oK<?> oKVar) {
        InterfaceC0456si interfaceC0456si;
        C0511uh c0511uh = (C0511uh) oKVar;
        do {
        } while (c0511uh._reusableCancellableContinuation == C0510ug.MenuHostHelper$$ExternalSyntheticLambda1);
        Object obj = c0511uh._reusableCancellableContinuation;
        C0444rx c0444rx = obj instanceof C0444rx ? (C0444rx) obj : null;
        if (c0444rx == null || (interfaceC0456si = c0444rx.setY) == null) {
            return;
        }
        interfaceC0456si.MenuHostHelper$$ExternalSyntheticLambda0();
        c0444rx.setY = sM.setIconTintList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(rZ.MenuHostHelper$$ExternalSyntheticLambda0(this));
        sb.append('@');
        sb.append(rZ.setY(this));
        return sb.toString();
    }
}