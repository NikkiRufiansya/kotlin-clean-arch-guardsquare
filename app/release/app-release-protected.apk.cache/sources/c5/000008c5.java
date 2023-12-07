package o;

/* renamed from: o.ro  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0435ro {
    public static /* synthetic */ sB MenuHostHelper$$ExternalSyntheticLambda1(rU rUVar, oM oMVar, rW rWVar, InterfaceC0389pw interfaceC0389pw, int i) {
        if ((i & 1) != 0) {
            oMVar = oL.setX;
        }
        if ((i & 2) != 0) {
            rWVar = rW.DEFAULT;
        }
        return C0437rq.MenuHostHelper$$ExternalSyntheticLambda0(rUVar, oMVar, rWVar, interfaceC0389pw);
    }

    public static final <T> Object setY(oM oMVar, InterfaceC0389pw<? super rU, ? super oK<? super T>, ? extends Object> interfaceC0389pw, oK<? super T> oKVar) {
        oM y;
        Object obj;
        Object MenuHostHelper$$ExternalSyntheticLambda0;
        oM x = oKVar.setX();
        boolean z = false;
        if (!((Boolean) oMVar.fold(Boolean.FALSE, rO$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0)).booleanValue()) {
            y = x.plus(oMVar);
        } else {
            y = rO.setY(x, oMVar, false);
        }
        sB sBVar = (sB) y.get(sB.MenuHostHelper$$ExternalSyntheticLambda1);
        if (sBVar == null || sBVar.setNavigationOnClickListener()) {
            if (y == x) {
                uA uAVar = new uA(y, oKVar);
                MenuHostHelper$$ExternalSyntheticLambda0 = uL.setIconTintList(uAVar, uAVar, interfaceC0389pw);
            } else if (pN.MenuHostHelper$$ExternalSyntheticLambda0(y.get(oN.MenuHostHelper$$ExternalSyntheticLambda0), x.get(oN.MenuHostHelper$$ExternalSyntheticLambda0))) {
                sY sYVar = new sY(y, oKVar);
                Object MenuHostHelper$$ExternalSyntheticLambda02 = uD.MenuHostHelper$$ExternalSyntheticLambda0(y, null);
                try {
                    Object iconTintList = uL.setIconTintList(sYVar, sYVar, interfaceC0389pw);
                    uD.setX(y, MenuHostHelper$$ExternalSyntheticLambda02);
                    MenuHostHelper$$ExternalSyntheticLambda0 = iconTintList;
                } catch (Throwable th) {
                    uD.setX(y, MenuHostHelper$$ExternalSyntheticLambda02);
                    throw th;
                }
            } else {
                C0450sc c0450sc = new C0450sc(y, oKVar);
                uH.setX(interfaceC0389pw, c0450sc, c0450sc, null);
                while (true) {
                    int i = c0450sc._decision;
                    if (i == 0) {
                        if (C0450sc.setX.compareAndSet(c0450sc, 0, 1)) {
                            z = true;
                            break;
                        }
                    } else if (i != 2) {
                        throw new IllegalStateException("Already suspended".toString());
                    }
                }
                if (!z) {
                    while (true) {
                        obj = c0450sc._state;
                        if (!(obj instanceof AbstractC0524uu)) {
                            break;
                        }
                        ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(c0450sc);
                    }
                    MenuHostHelper$$ExternalSyntheticLambda0 = sG.MenuHostHelper$$ExternalSyntheticLambda0(obj);
                    if (MenuHostHelper$$ExternalSyntheticLambda0 instanceof rD) {
                        throw ((rD) MenuHostHelper$$ExternalSyntheticLambda0).MenuHostHelper$$ExternalSyntheticLambda1;
                    }
                } else {
                    MenuHostHelper$$ExternalSyntheticLambda0 = oJ.COROUTINE_SUSPENDED;
                }
            }
            if (MenuHostHelper$$ExternalSyntheticLambda0 == oJ.COROUTINE_SUSPENDED) {
                pN.setY(oKVar, "");
            }
            return MenuHostHelper$$ExternalSyntheticLambda0;
        }
        throw sBVar.setLayoutAnimation();
    }
}