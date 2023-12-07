package o;

import o.nR;

/* loaded from: classes.dex */
public final class rJ {
    public static final <T> Object MenuHostHelper$$ExternalSyntheticLambda0(Object obj, InterfaceC0377pk<? super Throwable, nX> interfaceC0377pk) {
        Throwable iconTintList = nR.setIconTintList(obj);
        if (iconTintList == null) {
            return interfaceC0377pk != null ? new rH(obj, interfaceC0377pk) : obj;
        }
        return new rD(iconTintList);
    }

    public static final <T> Object MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<? super T> oKVar) {
        boolean z;
        if (obj instanceof rD) {
            nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            Throwable th = ((rD) obj).MenuHostHelper$$ExternalSyntheticLambda1;
            z = rX.setX;
            if (z && (oKVar instanceof oW)) {
                th = uB.setIconTintList(th, (oW) oKVar);
            }
            pN.setY((Object) th, "");
            return nR.setX(new nR.setX(th));
        }
        nR.setIconTintList seticontintlist2 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
        return nR.setX(obj);
    }
}