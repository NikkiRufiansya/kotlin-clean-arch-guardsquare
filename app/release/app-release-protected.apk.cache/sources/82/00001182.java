package o;

/* loaded from: classes.dex */
public final class uD {
    public static final C0528uy MenuHostHelper$$ExternalSyntheticLambda1 = new C0528uy("NO_THREAD_ELEMENTS");
    private static final InterfaceC0389pw<Object, oM$MenuHostHelper$$ExternalSyntheticLambda1, Object> setY = uD$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
    private static final InterfaceC0389pw<sS<?>, oM$MenuHostHelper$$ExternalSyntheticLambda1, sS<?>> MenuHostHelper$$ExternalSyntheticLambda0 = uD$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList;
    private static final InterfaceC0389pw<uE, oM$MenuHostHelper$$ExternalSyntheticLambda1, uE> setIconTintList = setIconTintList.setIconTintList;

    /* loaded from: classes.dex */
    static final class setIconTintList extends pO implements InterfaceC0389pw<uE, oM$MenuHostHelper$$ExternalSyntheticLambda1, uE> {
        public static final setIconTintList setIconTintList = new setIconTintList();

        setIconTintList() {
            super(2);
        }

        @Override // o.InterfaceC0389pw
        public final /* synthetic */ uE MenuHostHelper$$ExternalSyntheticLambda0(uE uEVar, oM$MenuHostHelper$$ExternalSyntheticLambda1 om_menuhosthelper__externalsyntheticlambda1) {
            uE uEVar2 = uEVar;
            oM$MenuHostHelper$$ExternalSyntheticLambda1 om_menuhosthelper__externalsyntheticlambda12 = om_menuhosthelper__externalsyntheticlambda1;
            if (om_menuhosthelper__externalsyntheticlambda12 instanceof sS) {
                sS<Object> sSVar = (sS) om_menuhosthelper__externalsyntheticlambda12;
                Object iconTintList = sSVar.setIconTintList(uEVar2.MenuHostHelper$$ExternalSyntheticLambda0);
                Object[] objArr = uEVar2.MenuHostHelper$$ExternalSyntheticLambda1;
                int i = uEVar2.setIconTintList;
                objArr[i] = iconTintList;
                sS<Object>[] sSVarArr = uEVar2.setY;
                uEVar2.setIconTintList = i + 1;
                sSVarArr[i] = sSVar;
            }
            return uEVar2;
        }
    }

    public static final Object MenuHostHelper$$ExternalSyntheticLambda1(oM oMVar) {
        Object fold = oMVar.fold(0, setY);
        pN.setX(fold);
        return fold;
    }

    public static final Object MenuHostHelper$$ExternalSyntheticLambda0(oM oMVar, Object obj) {
        if (obj == null) {
            obj = oMVar.fold(0, setY);
            pN.setX(obj);
        }
        if (obj == 0) {
            return MenuHostHelper$$ExternalSyntheticLambda1;
        }
        if (obj instanceof Integer) {
            return oMVar.fold(new uE(oMVar, ((Number) obj).intValue()), setIconTintList);
        }
        return ((sS) obj).setIconTintList(oMVar);
    }

    public static final void setX(oM oMVar, Object obj) {
        if (obj == MenuHostHelper$$ExternalSyntheticLambda1) {
            return;
        }
        if (obj instanceof uE) {
            uE uEVar = (uE) obj;
            int length = uEVar.setY.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i = length - 1;
                sS<Object> sSVar = uEVar.setY[length];
                pN.setX(sSVar);
                sSVar.setX(uEVar.MenuHostHelper$$ExternalSyntheticLambda1[length]);
                if (i < 0) {
                    return;
                }
                length = i;
            }
        } else {
            Object fold = oMVar.fold(null, MenuHostHelper$$ExternalSyntheticLambda0);
            if (fold == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
            ((sS) fold).setX(obj);
        }
    }
}