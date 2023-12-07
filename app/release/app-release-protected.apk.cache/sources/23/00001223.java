package o;

import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import o.C0610xu;

/* loaded from: classes.dex */
public final class vh$MenuHostHelper$$ExternalSyntheticLambda0 {
    private vh$MenuHostHelper$$ExternalSyntheticLambda0() {
    }

    public /* synthetic */ vh$MenuHostHelper$$ExternalSyntheticLambda0(byte b) {
        this();
    }

    public static C0610xu MenuHostHelper$$ExternalSyntheticLambda1(X509Certificate x509Certificate) {
        pN.setY(x509Certificate, "");
        C0610xu.setX setx = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
        PublicKey publicKey = x509Certificate.getPublicKey();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) publicKey, "");
        byte[] encoded = publicKey.getEncoded();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) encoded, "");
        int length = encoded.length;
        pN.setY(encoded, "");
        C0601xn.setIconTintList(encoded.length, 0L, length);
        return new C0610xu(C0342oc.MenuHostHelper$$ExternalSyntheticLambda0(encoded, 0, length)).MenuHostHelper$$ExternalSyntheticLambda1("SHA-256");
    }

    public final String setIconTintList(Certificate certificate) {
        pN.setY(certificate, "");
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }
        StringBuilder sb = new StringBuilder("sha256/");
        sb.append(MenuHostHelper$$ExternalSyntheticLambda1((X509Certificate) certificate).MenuHostHelper$$ExternalSyntheticLambda1());
        return sb.toString();
    }
}