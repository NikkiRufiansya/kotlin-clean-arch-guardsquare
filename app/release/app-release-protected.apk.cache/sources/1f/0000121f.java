package o;

import java.util.concurrent.CancellationException;
import o.nR;

/* renamed from: o.vf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0536vf {
    public static final <T> Object setX(setAutoSizeTextTypeUniformWithConfiguration<T> setautosizetexttypeuniformwithconfiguration, oK<? super T> oKVar) {
        if (setautosizetexttypeuniformwithconfiguration.setX()) {
            Exception y = setautosizetexttypeuniformwithconfiguration.setY();
            if (y == null) {
                if (setautosizetexttypeuniformwithconfiguration.setIconTintList()) {
                    StringBuilder sb = new StringBuilder("Task ");
                    sb.append(setautosizetexttypeuniformwithconfiguration);
                    sb.append(" was cancelled normally.");
                    throw new CancellationException(sb.toString());
                }
                return setautosizetexttypeuniformwithconfiguration.MenuHostHelper$$ExternalSyntheticLambda1();
            }
            throw y;
        }
        C0444rx c0444rx = new C0444rx(oP.setY(oKVar), 1);
        c0444rx.setUnboundedRipple();
        final C0444rx c0444rx2 = c0444rx;
        setautosizetexttypeuniformwithconfiguration.setX(ExecutorC0535ve.MenuHostHelper$$ExternalSyntheticLambda1, new setSelectedTabIndicatorColor() { // from class: o.vf$MenuHostHelper$$ExternalSyntheticLambda1
            @Override // o.setSelectedTabIndicatorColor
            public final void MenuHostHelper$$ExternalSyntheticLambda0(setAutoSizeTextTypeUniformWithConfiguration<T> setautosizetexttypeuniformwithconfiguration2) {
                Exception y2 = setautosizetexttypeuniformwithconfiguration2.setY();
                if (y2 == null) {
                    if (!setautosizetexttypeuniformwithconfiguration2.setIconTintList()) {
                        nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                        c0444rx2.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(setautosizetexttypeuniformwithconfiguration2.MenuHostHelper$$ExternalSyntheticLambda1()));
                        return;
                    }
                    c0444rx2.setX(null);
                    return;
                }
                nR.setIconTintList seticontintlist2 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                Exception exc = y2;
                pN.setY((Object) exc, "");
                c0444rx2.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(new nR.setX(exc)));
            }
        });
        Object MenuHostHelper$$ExternalSyntheticLambda0 = c0444rx.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 == oJ.COROUTINE_SUSPENDED) {
            pN.setY(oKVar, "");
        }
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }
}