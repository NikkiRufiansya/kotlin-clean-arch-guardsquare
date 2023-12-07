package o;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: o.xj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597xj implements HostnameVerifier {
    public static final C0597xj MenuHostHelper$$ExternalSyntheticLambda0 = new C0597xj();

    private C0597xj() {
    }

    public final boolean setY(String str, X509Certificate x509Certificate) {
        pN.setY(str, "");
        pN.setY(x509Certificate, "");
        return vL.setY(str) ? MenuHostHelper$$ExternalSyntheticLambda0(str, x509Certificate) : setX(str, x509Certificate);
    }

    private static boolean MenuHostHelper$$ExternalSyntheticLambda0(String str, X509Certificate x509Certificate) {
        String iconTintList = vO.setIconTintList(str);
        List<String> iconTintList2 = setIconTintList(x509Certificate, 7);
        if ((iconTintList2 instanceof Collection) && iconTintList2.isEmpty()) {
            return false;
        }
        for (String str2 : iconTintList2) {
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) iconTintList, (Object) vO.setIconTintList(str2))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0121 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean setX(java.lang.String r10, java.security.cert.X509Certificate r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0597xj.setX(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public static List<String> setIconTintList(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && !(!pN.MenuHostHelper$$ExternalSyntheticLambda0(list.get(0), Integer.valueOf(i))) && (obj = list.get(1)) != null) {
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
            return C0358os.setIconTintList;
        } catch (CertificateParsingException unused) {
            return C0358os.setIconTintList;
        }
    }

    private static String setIconTintList(String str) {
        if (str.length() == ((int) xM.MenuHostHelper$$ExternalSyntheticLambda0(str, 0, str.length()))) {
            Locale locale = Locale.US;
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) locale, "");
            if (str != null) {
                String lowerCase = str.toLowerCase(locale);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) lowerCase, "");
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        return str;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        pN.setY(str, "");
        pN.setY(sSLSession, "");
        if (str.length() == ((int) xM.MenuHostHelper$$ExternalSyntheticLambda0(str, 0, str.length()))) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                if (certificate != null) {
                    return setY(str, (X509Certificate) certificate);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            } catch (SSLException unused) {
                return false;
            }
        }
        return false;
    }
}