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
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;

/* loaded from: classes.dex */
public final class wQ extends wR {
    private static final boolean MenuHostHelper$$ExternalSyntheticLambda0;
    public static final setX setIconTintList;
    private final Provider MenuHostHelper$$ExternalSyntheticLambda1;

    private wQ() {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new OpenJSSE();
    }

    public /* synthetic */ wQ(byte b) {
        this();
    }

    @Override // o.wR
    public final SSLContext setIconTintList() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.MenuHostHelper$$ExternalSyntheticLambda1);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) sSLContext, "");
        return sSLContext;
    }

    @Override // o.wR
    public final X509TrustManager x_() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.MenuHostHelper$$ExternalSyntheticLambda1);
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
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                SSLParameters sSLParameters2 = sSLParameters;
                Object[] array = wR$MenuHostHelper$$ExternalSyntheticLambda1.setX(list).toArray(new String[0]);
                if (array != null) {
                    sSLParameters2.setApplicationProtocols((String[]) array);
                    sSLSocket2.setSSLParameters(sSLParameters);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            return;
        }
        super.MenuHostHelper$$ExternalSyntheticLambda0(sSLSocket, str, list);
    }

    @Override // o.wR
    public final String setX(SSLSocket sSLSocket) {
        pN.setY(sSLSocket, "");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
                return null;
            }
            return applicationProtocol;
        }
        return super.setX(sSLSocket);
    }

    /* loaded from: classes.dex */
    public static final class setX {
        private setX() {
        }

        public /* synthetic */ setX(byte b) {
            this();
        }
    }

    static {
        boolean z = false;
        setX setx = new setX((byte) 0);
        setIconTintList = setx;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, setx.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        MenuHostHelper$$ExternalSyntheticLambda0 = z;
    }
}