package o;

/* loaded from: classes.dex */
public interface oM {
    <R> R fold(R r, InterfaceC0389pw<? super R, ? super oM$MenuHostHelper$$ExternalSyntheticLambda1, ? extends R> interfaceC0389pw);

    <E extends oM$MenuHostHelper$$ExternalSyntheticLambda1> E get(oM$MenuHostHelper$$ExternalSyntheticLambda0<E> om_menuhosthelper__externalsyntheticlambda0);

    oM minusKey(oM$MenuHostHelper$$ExternalSyntheticLambda0<?> om_menuhosthelper__externalsyntheticlambda0);

    oM plus(oM oMVar);

    /* loaded from: classes.dex */
    public static final class setX {

        /* loaded from: classes.dex */
        public static final class setIconTintList extends pO implements InterfaceC0389pw<oM, oM$MenuHostHelper$$ExternalSyntheticLambda1, oM> {
            public static final setIconTintList setX = new setIconTintList();

            setIconTintList() {
                super(2);
            }

            @Override // o.InterfaceC0389pw
            public final /* synthetic */ oM MenuHostHelper$$ExternalSyntheticLambda0(oM oMVar, oM$MenuHostHelper$$ExternalSyntheticLambda1 om_menuhosthelper__externalsyntheticlambda1) {
                oE oEVar;
                oM oMVar2 = oMVar;
                oM$MenuHostHelper$$ExternalSyntheticLambda1 om_menuhosthelper__externalsyntheticlambda12 = om_menuhosthelper__externalsyntheticlambda1;
                pN.setY(oMVar2, "");
                pN.setY(om_menuhosthelper__externalsyntheticlambda12, "");
                oM minusKey = oMVar2.minusKey(om_menuhosthelper__externalsyntheticlambda12.getKey());
                if (minusKey == oL.setX) {
                    return om_menuhosthelper__externalsyntheticlambda12;
                }
                oN oNVar = (oN) minusKey.get(oN.MenuHostHelper$$ExternalSyntheticLambda0);
                if (oNVar == null) {
                    oEVar = new oE(minusKey, om_menuhosthelper__externalsyntheticlambda12);
                } else {
                    oM minusKey2 = minusKey.minusKey(oN.MenuHostHelper$$ExternalSyntheticLambda0);
                    oEVar = minusKey2 == oL.setX ? new oE(om_menuhosthelper__externalsyntheticlambda12, oNVar) : new oE(new oE(minusKey2, om_menuhosthelper__externalsyntheticlambda12), oNVar);
                }
                return oEVar;
            }
        }
    }
}