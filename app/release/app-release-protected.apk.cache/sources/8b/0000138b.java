package o;

import java.nio.charset.Charset;
import o.vH;

/* loaded from: classes.dex */
final class yp<T> implements xU<vH, T> {
    private final AbstractC0210hi<T> MenuHostHelper$$ExternalSyntheticLambda0;
    private final gS setIconTintList;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yp(gS gSVar, AbstractC0210hi<T> abstractC0210hi) {
        this.setIconTintList = gSVar;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = abstractC0210hi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.xU
    /* renamed from: MenuHostHelper$$ExternalSyntheticLambda1 */
    public T setY(vH vHVar) {
        Charset charset;
        gS gSVar = this.setIconTintList;
        vH.setY sety = vHVar.setIconTintList;
        if (sety == null) {
            InterfaceC0607xr MenuHostHelper$$ExternalSyntheticLambda1 = vHVar.MenuHostHelper$$ExternalSyntheticLambda1();
            vA MenuHostHelper$$ExternalSyntheticLambda0 = vHVar.MenuHostHelper$$ExternalSyntheticLambda0();
            if (MenuHostHelper$$ExternalSyntheticLambda0 == null || (charset = MenuHostHelper$$ExternalSyntheticLambda0.setX(qQ.setIconTintList)) == null) {
                charset = qQ.setIconTintList;
            }
            sety = new vH.setY(MenuHostHelper$$ExternalSyntheticLambda1, charset);
            vHVar.setIconTintList = sety;
        }
        hP hPVar = new hP(sety);
        boolean z = gSVar.MenuHostHelper$$ExternalSyntheticLambda0;
        hPVar.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        try {
            T x = this.MenuHostHelper$$ExternalSyntheticLambda0.setX(hPVar);
            if (hPVar.setCenterIfNoTextEnabled() == hO.END_DOCUMENT) {
                return x;
            }
            throw new gY("JSON document was not fully consumed.");
        } finally {
            vHVar.close();
        }
    }
}