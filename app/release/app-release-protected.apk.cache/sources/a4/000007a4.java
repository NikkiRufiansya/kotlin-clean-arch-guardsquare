package o;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class oL implements oM, Serializable {
    public static final oL setX = new oL();

    @Override // o.oM
    public final <R> R fold(R r, InterfaceC0389pw<? super R, ? super oM$MenuHostHelper$$ExternalSyntheticLambda1, ? extends R> interfaceC0389pw) {
        pN.setY(interfaceC0389pw, "");
        return r;
    }

    @Override // o.oM
    public final <E extends oM$MenuHostHelper$$ExternalSyntheticLambda1> E get(oM$MenuHostHelper$$ExternalSyntheticLambda0<E> om_menuhosthelper__externalsyntheticlambda0) {
        pN.setY(om_menuhosthelper__externalsyntheticlambda0, "");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // o.oM
    public final oM plus(oM oMVar) {
        pN.setY(oMVar, "");
        return oMVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    private oL() {
    }

    private final Object readResolve() {
        return setX;
    }

    @Override // o.oM
    public final oM minusKey(oM$MenuHostHelper$$ExternalSyntheticLambda0<?> om_menuhosthelper__externalsyntheticlambda0) {
        pN.setY(om_menuhosthelper__externalsyntheticlambda0, "");
        return this;
    }
}