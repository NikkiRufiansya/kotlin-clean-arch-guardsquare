package o;

import java.util.concurrent.atomic.AtomicLong;
import o.pY;

/* loaded from: classes.dex */
public final class rO {
    public static final oM MenuHostHelper$$ExternalSyntheticLambda1(rU rUVar, oM oMVar) {
        oM oMVar2;
        AtomicLong atomicLong;
        oM y = setY(rUVar.setIconTintList(), oMVar, true);
        if (rX.setX()) {
            atomicLong = rX.setIconTintList;
            oMVar2 = y.plus(new rR(atomicLong.incrementAndGet()));
        } else {
            oMVar2 = y;
        }
        return (y == C0457sj.setX() || y.get(oN.MenuHostHelper$$ExternalSyntheticLambda0) != null) ? oMVar2 : oMVar2.plus(C0457sj.setX());
    }

    /* loaded from: classes.dex */
    public static final class setY extends pO implements InterfaceC0389pw<oM, oM$MenuHostHelper$$ExternalSyntheticLambda1, oM> {
        private /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda0;
        private /* synthetic */ pY.setX<oM> setIconTintList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setY(pY.setX<oM> setx, boolean z) {
            super(2);
            this.setIconTintList = setx;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = z;
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [T, o.oM] */
        @Override // o.InterfaceC0389pw
        public final /* synthetic */ oM MenuHostHelper$$ExternalSyntheticLambda0(oM oMVar, oM$MenuHostHelper$$ExternalSyntheticLambda1 om_menuhosthelper__externalsyntheticlambda1) {
            oM oMVar2 = oMVar;
            oM$MenuHostHelper$$ExternalSyntheticLambda1 om_menuhosthelper__externalsyntheticlambda12 = om_menuhosthelper__externalsyntheticlambda1;
            if (om_menuhosthelper__externalsyntheticlambda12 instanceof rL) {
                if (this.setIconTintList.setX.get(om_menuhosthelper__externalsyntheticlambda12.getKey()) == null) {
                    rL rLVar = (rL) om_menuhosthelper__externalsyntheticlambda12;
                    if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                        rLVar = rLVar.MenuHostHelper$$ExternalSyntheticLambda0();
                    }
                    return oMVar2.plus(rLVar);
                }
                pY.setX<oM> setx = this.setIconTintList;
                setx.setX = setx.setX.minusKey(om_menuhosthelper__externalsyntheticlambda12.getKey());
                return oMVar2.plus(((rL) om_menuhosthelper__externalsyntheticlambda12).setX());
            }
            return oMVar2.plus(om_menuhosthelper__externalsyntheticlambda12);
        }
    }

    public static final sY<?> MenuHostHelper$$ExternalSyntheticLambda1(oK<?> oKVar, oM oMVar, Object obj) {
        sY<?> sYVar = null;
        if (oKVar instanceof oW) {
            if (oMVar.get(sV.MenuHostHelper$$ExternalSyntheticLambda1) != null) {
                oW oWVar = (oW) oKVar;
                while (true) {
                    if (!(oWVar instanceof C0450sc) && (oWVar = oWVar.setY()) != null) {
                        if (oWVar instanceof sY) {
                            sYVar = (sY) oWVar;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (sYVar != null) {
                    sYVar.setX.set(new nT<>(oMVar, obj));
                }
                return sYVar;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, java.lang.Object] */
    public static final oM setY(oM oMVar, oM oMVar2, boolean z) {
        boolean booleanValue = ((Boolean) oMVar.fold(Boolean.FALSE, rO$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0)).booleanValue();
        boolean booleanValue2 = ((Boolean) oMVar2.fold(Boolean.FALSE, rO$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return oMVar.plus(oMVar2);
        }
        pY.setX setx = new pY.setX();
        setx.setX = oMVar2;
        oM oMVar3 = (oM) oMVar.fold(oL.setX, new setY(setx, z));
        if (booleanValue2) {
            setx.setX = ((oM) setx.setX).fold(oL.setX, rO$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        return oMVar3.plus((oM) setx.setX);
    }
}