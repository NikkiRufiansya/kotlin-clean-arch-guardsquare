package o;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class wd$MenuHostHelper$$ExternalSyntheticLambda1 extends pO implements InterfaceC0376pj<List<? extends X509Certificate>> {
    private /* synthetic */ C0563wd MenuHostHelper$$ExternalSyntheticLambda0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd$MenuHostHelper$$ExternalSyntheticLambda1(C0563wd c0563wd) {
        super(0);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = c0563wd;
    }

    @Override // o.InterfaceC0376pj
    public final /* synthetic */ List<? extends X509Certificate> setIconTintList() {
        C0556vy c0556vy;
        c0556vy = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setX(c0556vy);
        List<Certificate> list = (List) c0556vy.setY.setY();
        pN.setY(list, "");
        ArrayList arrayList = new ArrayList(list instanceof Collection ? list.size() : 10);
        for (Certificate certificate : list) {
            if (certificate == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}