package o;

import android.net.http.X509TrustManagerExtensions;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class wU$MenuHostHelper$$ExternalSyntheticLambda1 {
    private wU$MenuHostHelper$$ExternalSyntheticLambda1() {
    }

    public /* synthetic */ wU$MenuHostHelper$$ExternalSyntheticLambda1(byte b) {
        this();
    }

    public static wU MenuHostHelper$$ExternalSyntheticLambda1(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        pN.setY(x509TrustManager, "");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            return new wU(x509TrustManager, x509TrustManagerExtensions);
        }
        return null;
    }
}