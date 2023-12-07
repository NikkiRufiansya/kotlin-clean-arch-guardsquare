package o;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: o.xc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590xc implements InterfaceC0595xh {
    private final Map<X500Principal, Set<X509Certificate>> setX;

    public C0590xc(X509Certificate... x509CertificateArr) {
        pN.setY(x509CertificateArr, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) subjectX500Principal, "");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = (Set) new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.setX = linkedHashMap;
    }

    @Override // o.InterfaceC0595xh
    public final X509Certificate MenuHostHelper$$ExternalSyntheticLambda0(X509Certificate x509Certificate) {
        boolean z;
        pN.setY(x509Certificate, "");
        Set<X509Certificate> set = this.setX.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                try {
                    x509Certificate.verify(((X509Certificate) next).getPublicKey());
                    z = true;
                    continue;
                } catch (Exception unused) {
                    z = false;
                    continue;
                }
                if (z) {
                    obj = next;
                    break;
                }
            }
            return (X509Certificate) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C0590xc) && pN.MenuHostHelper$$ExternalSyntheticLambda0(((C0590xc) obj).setX, this.setX));
    }

    public final int hashCode() {
        return this.setX.hashCode();
    }
}