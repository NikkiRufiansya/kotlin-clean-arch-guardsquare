package o;

import o.oM;

/* loaded from: classes.dex */
public abstract class oI implements oM$MenuHostHelper$$ExternalSyntheticLambda1 {
    private final oM$MenuHostHelper$$ExternalSyntheticLambda0<?> key;

    public oI(oM$MenuHostHelper$$ExternalSyntheticLambda0<?> om_menuhosthelper__externalsyntheticlambda0) {
        pN.setY(om_menuhosthelper__externalsyntheticlambda0, "");
        this.key = om_menuhosthelper__externalsyntheticlambda0;
    }

    @Override // o.oM
    public <R> R fold(R r, InterfaceC0389pw<? super R, ? super oM$MenuHostHelper$$ExternalSyntheticLambda1, ? extends R> interfaceC0389pw) {
        pN.setY(interfaceC0389pw, "");
        return interfaceC0389pw.MenuHostHelper$$ExternalSyntheticLambda0(r, this);
    }

    @Override // o.oM$MenuHostHelper$$ExternalSyntheticLambda1, o.oM
    public <E extends oM$MenuHostHelper$$ExternalSyntheticLambda1> E get(oM$MenuHostHelper$$ExternalSyntheticLambda0<E> om_menuhosthelper__externalsyntheticlambda0) {
        pN.setY(om_menuhosthelper__externalsyntheticlambda0, "");
        if (pN.MenuHostHelper$$ExternalSyntheticLambda0(getKey(), om_menuhosthelper__externalsyntheticlambda0)) {
            pN.setX(this);
            return this;
        }
        return null;
    }

    @Override // o.oM
    public oM minusKey(oM$MenuHostHelper$$ExternalSyntheticLambda0<?> om_menuhosthelper__externalsyntheticlambda0) {
        pN.setY(om_menuhosthelper__externalsyntheticlambda0, "");
        return pN.MenuHostHelper$$ExternalSyntheticLambda0(getKey(), om_menuhosthelper__externalsyntheticlambda0) ? oL.setX : this;
    }

    @Override // o.oM
    public oM plus(oM oMVar) {
        pN.setY(oMVar, "");
        oI oIVar = this;
        pN.setY(oMVar, "");
        return oMVar != oL.setX ? (oM) oMVar.fold(oIVar, oM.setX.setIconTintList.setX) : oIVar;
    }

    @Override // o.oM$MenuHostHelper$$ExternalSyntheticLambda1
    public oM$MenuHostHelper$$ExternalSyntheticLambda0<?> getKey() {
        return this.key;
    }
}