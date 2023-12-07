package o;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* loaded from: classes.dex */
public final class wL extends wR {
    public static final wL$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1;
    private static final boolean setY;
    private final Provider MenuHostHelper$$ExternalSyntheticLambda0;

    private wL() {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new BouncyCastleJsseProvider();
    }

    public /* synthetic */ wL(byte b) {
        this();
    }

    @Override // o.wR
    public final SSLContext setIconTintList() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.MenuHostHelper$$ExternalSyntheticLambda0);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) sSLContext, "");
        return sSLContext;
    }

    @Override // o.wR
    public final X509TrustManager x_() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) trustManagerFactory, "");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        pN.setX(trustManagers);
        boolean z = true;
        if (!((trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) ? false : false)) {
            StringBuilder sb = new StringBuilder("Unexpected default trust managers: ");
            String arrays = Arrays.toString(trustManagers);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) arrays, "");
            sb.append(arrays);
            throw new IllegalStateException(sb.toString().toString());
        }
        TrustManager trustManager = trustManagers[0];
        if (trustManager != null) {
            return (X509TrustManager) trustManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
    }

    @Override // o.wR
    public final void MenuHostHelper$$ExternalSyntheticLambda0(SSLSocket sSLSocket, String str, List<vB> list) {
        pN.setY(sSLSocket, "");
        pN.setY(list, "");
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            List<String> x = wR$MenuHostHelper$$ExternalSyntheticLambda1.setX(list);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) parameters, "");
            Object[] array = x.toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        super.MenuHostHelper$$ExternalSyntheticLambda0(sSLSocket, str, list);
    }

    @Override // o.wR
    public final String setX(SSLSocket sSLSocket) {
        pN.setY(sSLSocket, "");
        if (sSLSocket instanceof BCSSLSocket) {
            String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
                return null;
            }
            return applicationProtocol;
        }
        return super.setX(sSLSocket);
    }

    static {
        boolean z = false;
        wL$MenuHostHelper$$ExternalSyntheticLambda1 wl_menuhosthelper__externalsyntheticlambda1 = new wL$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
        MenuHostHelper$$ExternalSyntheticLambda1 = wl_menuhosthelper__externalsyntheticlambda1;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, wl_menuhosthelper__externalsyntheticlambda1.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        setY = z;
    }
}