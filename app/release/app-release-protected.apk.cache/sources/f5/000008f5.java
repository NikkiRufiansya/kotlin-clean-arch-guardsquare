package o;

import o.oM;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class sV implements oM$MenuHostHelper$$ExternalSyntheticLambda1, oM$MenuHostHelper$$ExternalSyntheticLambda0<sV> {
    public static final sV MenuHostHelper$$ExternalSyntheticLambda1 = new sV();

    private sV() {
    }

    @Override // o.oM
    public final <R> R fold(R r, InterfaceC0389pw<? super R, ? super oM$MenuHostHelper$$ExternalSyntheticLambda1, ? extends R> interfaceC0389pw) {
        pN.setY(interfaceC0389pw, "");
        return interfaceC0389pw.MenuHostHelper$$ExternalSyntheticLambda0(r, this);
    }

    @Override // o.oM$MenuHostHelper$$ExternalSyntheticLambda1, o.oM
    public final <E extends oM$MenuHostHelper$$ExternalSyntheticLambda1> E get(oM$MenuHostHelper$$ExternalSyntheticLambda0<E> om_menuhosthelper__externalsyntheticlambda0) {
        pN.setY(om_menuhosthelper__externalsyntheticlambda0, "");
        if (pN.MenuHostHelper$$ExternalSyntheticLambda0(getKey(), om_menuhosthelper__externalsyntheticlambda0)) {
            pN.setX(this);
            return this;
        }
        return null;
    }

    @Override // o.oM
    public final oM minusKey(oM$MenuHostHelper$$ExternalSyntheticLambda0<?> om_menuhosthelper__externalsyntheticlambda0) {
        pN.setY(om_menuhosthelper__externalsyntheticlambda0, "");
        return pN.MenuHostHelper$$ExternalSyntheticLambda0(getKey(), om_menuhosthelper__externalsyntheticlambda0) ? oL.setX : this;
    }

    @Override // o.oM
    public final oM plus(oM oMVar) {
        pN.setY(oMVar, "");
        sV sVVar = this;
        pN.setY(oMVar, "");
        return oMVar != oL.setX ? (oM) oMVar.fold(sVVar, oM.setX.setIconTintList.setX) : sVVar;
    }

    @Override // o.oM$MenuHostHelper$$ExternalSyntheticLambda1
    public final oM$MenuHostHelper$$ExternalSyntheticLambda0<?> getKey() {
        return this;
    }
}