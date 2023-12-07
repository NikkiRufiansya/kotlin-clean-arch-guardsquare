package o;

/* loaded from: classes.dex */
public final class uL {
    public static final <T, R> Object setIconTintList(uA<? super T> uAVar, R r, InterfaceC0389pw<? super R, ? super oK<? super T>, ? extends Object> interfaceC0389pw) {
        Object rDVar;
        boolean z;
        try {
            rDVar = ((InterfaceC0389pw) pZ.setIconTintList(interfaceC0389pw, 2)).MenuHostHelper$$ExternalSyntheticLambda0(r, uAVar);
        } catch (Throwable th) {
            rDVar = new rD(th);
        }
        if (rDVar != oJ.COROUTINE_SUSPENDED) {
            Object onLongClickListener = uAVar.setOnLongClickListener(rDVar);
            if (onLongClickListener != sG.setIconTintList) {
                if (onLongClickListener instanceof rD) {
                    rD rDVar2 = (rD) onLongClickListener;
                    Throwable th2 = rDVar2.MenuHostHelper$$ExternalSyntheticLambda1;
                    Throwable th3 = rDVar2.MenuHostHelper$$ExternalSyntheticLambda1;
                    oK<? super T> oKVar = uAVar.setY;
                    z = rX.setX;
                    if (z && (oKVar instanceof oW)) {
                        throw uB.setIconTintList(th3, (oW) oKVar);
                    }
                    throw th3;
                }
                return sG.MenuHostHelper$$ExternalSyntheticLambda0(onLongClickListener);
            }
            return oJ.COROUTINE_SUSPENDED;
        }
        return oJ.COROUTINE_SUSPENDED;
    }
}