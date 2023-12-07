package o;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* loaded from: classes.dex */
public final class wN extends wR {
    private static final boolean MenuHostHelper$$ExternalSyntheticLambda0;
    public static final setY setIconTintList;
    private final Provider MenuHostHelper$$ExternalSyntheticLambda1;

    private wN() {
        Provider newProvider = Conscrypt.newProvider();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) newProvider, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = newProvider;
    }

    public /* synthetic */ wN(byte b) {
        this();
    }

    @Override // o.wR
    public final SSLContext setIconTintList() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.MenuHostHelper$$ExternalSyntheticLambda1);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) sSLContext, "");
        return sSLContext;
    }

    @Override // o.wR
    public final X509TrustManager x_() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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
        if (trustManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
        Conscrypt.setHostnameVerifier(x509TrustManager, setX.setX);
        return x509TrustManager;
    }

    /* loaded from: classes.dex */
    public static final class setX implements ConscryptHostnameVerifier {
        public static final setX setX = new setX();

        private setX() {
        }
    }

    @Override // o.wR
    public final void MenuHostHelper$$ExternalSyntheticLambda0(SSLSocket sSLSocket, String str, List<vB> list) {
        pN.setY(sSLSocket, "");
        pN.setY(list, "");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = wR$MenuHostHelper$$ExternalSyntheticLambda1.setX(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        super.MenuHostHelper$$ExternalSyntheticLambda0(sSLSocket, str, list);
    }

    @Override // o.wR
    public final String setX(SSLSocket sSLSocket) {
        pN.setY(sSLSocket, "");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.setX(sSLSocket);
    }

    /* loaded from: classes.dex */
    public static final class setY {
        private setY() {
        }

        public /* synthetic */ setY(byte b) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r0.patch() >= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r0.major() <= 2) goto L9;
     */
    static {
        /*
            o.wN$setY r0 = new o.wN$setY
            r1 = 0
            r0.<init>(r1)
            o.wN.setIconTintList = r0
            r2 = 1
            java.lang.String r3 = "org.conscrypt.Conscrypt$Version"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L48
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L48
            java.lang.Class.forName(r3, r1, r0)     // Catch: java.lang.Throwable -> L48
            boolean r0 = org.conscrypt.Conscrypt.isAvailable()     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L48
            org.conscrypt.Conscrypt$Version r0 = org.conscrypt.Conscrypt.version()     // Catch: java.lang.Throwable -> L48
            int r3 = r0.major()     // Catch: java.lang.Throwable -> L48
            r4 = 2
            if (r3 == r4) goto L31
            int r0 = r0.major()     // Catch: java.lang.Throwable -> L48
            if (r0 > r4) goto L2f
        L2d:
            r0 = 0
            goto L45
        L2f:
            r0 = 1
            goto L45
        L31:
            int r3 = r0.minor()     // Catch: java.lang.Throwable -> L48
            if (r3 == r2) goto L3e
            int r0 = r0.minor()     // Catch: java.lang.Throwable -> L48
            if (r0 <= r2) goto L2d
            goto L2f
        L3e:
            int r0 = r0.patch()     // Catch: java.lang.Throwable -> L48
            if (r0 < 0) goto L2d
            goto L2f
        L45:
            if (r0 == 0) goto L48
            r1 = 1
        L48:
            o.wN.MenuHostHelper$$ExternalSyntheticLambda0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wN.<clinit>():void");
    }

    @Override // o.wR
    public final SSLSocketFactory MenuHostHelper$$ExternalSyntheticLambda0(X509TrustManager x509TrustManager) {
        pN.setY(x509TrustManager, "");
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.MenuHostHelper$$ExternalSyntheticLambda1);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) sSLContext, "");
        sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) socketFactory, "");
        return socketFactory;
    }
}