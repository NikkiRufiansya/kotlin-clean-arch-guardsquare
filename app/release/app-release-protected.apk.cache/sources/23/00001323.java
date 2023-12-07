package o;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: o.xg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0594xg extends AbstractC0592xe {
    private final InterfaceC0595xh setX;

    static {
        new setX((byte) 0);
    }

    public C0594xg(InterfaceC0595xh interfaceC0595xh) {
        pN.setY(interfaceC0595xh, "");
        this.setX = interfaceC0595xh;
    }

    @Override // o.AbstractC0592xe
    public final List<Certificate> MenuHostHelper$$ExternalSyntheticLambda0(List<? extends Certificate> list, String str) {
        pN.setY(list, "");
        pN.setY(str, "");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        pN.MenuHostHelper$$ExternalSyntheticLambda0(removeFirst, "");
        arrayList.add(removeFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate MenuHostHelper$$ExternalSyntheticLambda0 = this.setX.MenuHostHelper$$ExternalSyntheticLambda0(x509Certificate);
            if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                if (arrayList.size() > 1 || (!pN.MenuHostHelper$$ExternalSyntheticLambda0(x509Certificate, MenuHostHelper$$ExternalSyntheticLambda0))) {
                    arrayList.add(MenuHostHelper$$ExternalSyntheticLambda0);
                }
                if (MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0, MenuHostHelper$$ExternalSyntheticLambda0)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) it, "");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (MenuHostHelper$$ExternalSyntheticLambda1(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z) {
                    return arrayList;
                }
                StringBuilder sb = new StringBuilder("Failed to find a trusted cert that signed ");
                sb.append(x509Certificate);
                throw new SSLPeerUnverifiedException(sb.toString());
            }
        }
        StringBuilder sb2 = new StringBuilder("Certificate chain too long: ");
        sb2.append(arrayList);
        throw new SSLPeerUnverifiedException(sb2.toString());
    }

    private static boolean MenuHostHelper$$ExternalSyntheticLambda1(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!pN.MenuHostHelper$$ExternalSyntheticLambda0(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.setX.hashCode();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C0594xg) && pN.MenuHostHelper$$ExternalSyntheticLambda0(((C0594xg) obj).setX, this.setX));
    }

    /* renamed from: o.xg$setX */
    /* loaded from: classes.dex */
    public static final class setX {
        private setX() {
        }

        public /* synthetic */ setX(byte b) {
            this();
        }
    }
}