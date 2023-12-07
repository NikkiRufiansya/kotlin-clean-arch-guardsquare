package o;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
final class vy$MenuHostHelper$$ExternalSyntheticLambda1 extends pO implements InterfaceC0376pj<List<? extends Certificate>> {
    private /* synthetic */ InterfaceC0376pj setIconTintList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy$MenuHostHelper$$ExternalSyntheticLambda1(InterfaceC0376pj interfaceC0376pj) {
        super(0);
        this.setIconTintList = interfaceC0376pj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.InterfaceC0376pj
    /* renamed from: MenuHostHelper$$ExternalSyntheticLambda0 */
    public List<Certificate> setIconTintList() {
        try {
            return (List) this.setIconTintList.setIconTintList();
        } catch (SSLPeerUnverifiedException unused) {
            return C0358os.setIconTintList;
        }
    }
}