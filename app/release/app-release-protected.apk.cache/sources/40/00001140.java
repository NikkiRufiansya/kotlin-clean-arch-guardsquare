package o;

/* loaded from: classes.dex */
public final class tQ implements oM {
    private final /* synthetic */ oM MenuHostHelper$$ExternalSyntheticLambda0;
    public final Throwable setX;

    @Override // o.oM
    public final <R> R fold(R r, InterfaceC0389pw<? super R, ? super oM$MenuHostHelper$$ExternalSyntheticLambda1, ? extends R> interfaceC0389pw) {
        return (R) this.MenuHostHelper$$ExternalSyntheticLambda0.fold(r, interfaceC0389pw);
    }

    @Override // o.oM
    public final <E extends oM$MenuHostHelper$$ExternalSyntheticLambda1> E get(oM$MenuHostHelper$$ExternalSyntheticLambda0<E> om_menuhosthelper__externalsyntheticlambda0) {
        return (E) this.MenuHostHelper$$ExternalSyntheticLambda0.get(om_menuhosthelper__externalsyntheticlambda0);
    }

    @Override // o.oM
    public final oM minusKey(oM$MenuHostHelper$$ExternalSyntheticLambda0<?> om_menuhosthelper__externalsyntheticlambda0) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.minusKey(om_menuhosthelper__externalsyntheticlambda0);
    }

    @Override // o.oM
    public final oM plus(oM oMVar) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.plus(oMVar);
    }

    public tQ(Throwable th, oM oMVar) {
        this.setX = th;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = oMVar;
    }
}