package o;

import java.util.List;
import javax.net.ssl.SSLSocket;
import o.wX;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* renamed from: o.xb */
/* loaded from: classes.dex */
public final class C0589xb implements wY {
    public static final setIconTintList MenuHostHelper$$ExternalSyntheticLambda0 = new setIconTintList((byte) 0);
    private static final wX.setIconTintList setY = new setX();

    public static final /* synthetic */ wX.setIconTintList setX() {
        return setY;
    }

    @Override // o.wY
    public final boolean setY(SSLSocket sSLSocket) {
        pN.setY(sSLSocket, "");
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // o.wY
    public final boolean setY() {
        boolean z;
        wL$MenuHostHelper$$ExternalSyntheticLambda1 wl_menuhosthelper__externalsyntheticlambda1 = wL.MenuHostHelper$$ExternalSyntheticLambda1;
        z = wL.setY;
        return z;
    }

    @Override // o.wY
    public final String setIconTintList(SSLSocket sSLSocket) {
        pN.setY(sSLSocket, "");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // o.wY
    public final void MenuHostHelper$$ExternalSyntheticLambda0(SSLSocket sSLSocket, String str, List<? extends vB> list) {
        pN.setY(sSLSocket, "");
        pN.setY(list, "");
        pN.setY(sSLSocket, "");
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) parameters, "");
            wR$MenuHostHelper$$ExternalSyntheticLambda1 wr_menuhosthelper__externalsyntheticlambda1 = wR.setX;
            Object[] array = wR$MenuHostHelper$$ExternalSyntheticLambda1.setX(list).toArray(new String[0]);
            if (array != null) {
                parameters.setApplicationProtocols((String[]) array);
                bCSSLSocket.setParameters(parameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: o.xb$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList {
        private setIconTintList() {
        }

        public /* synthetic */ setIconTintList(byte b) {
            this();
        }
    }

    /* renamed from: o.xb$setX */
    /* loaded from: classes.dex */
    public static final class setX implements wX.setIconTintList {
        setX() {
        }

        @Override // o.wX.setIconTintList
        public final boolean setX(SSLSocket sSLSocket) {
            boolean z;
            pN.setY(sSLSocket, "");
            wL$MenuHostHelper$$ExternalSyntheticLambda1 wl_menuhosthelper__externalsyntheticlambda1 = wL.MenuHostHelper$$ExternalSyntheticLambda1;
            z = wL.setY;
            return z && (sSLSocket instanceof BCSSLSocket);
        }

        @Override // o.wX.setIconTintList
        public final wY setY(SSLSocket sSLSocket) {
            pN.setY(sSLSocket, "");
            return new C0589xb();
        }
    }
}