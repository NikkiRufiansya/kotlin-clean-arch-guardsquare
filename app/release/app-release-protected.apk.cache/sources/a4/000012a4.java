package o;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class wW implements wY {
    public static final wW$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1 = new wW$MenuHostHelper$$ExternalSyntheticLambda0((byte) 0);

    @Override // o.wY
    public final void MenuHostHelper$$ExternalSyntheticLambda0(SSLSocket sSLSocket, String str, List<? extends vB> list) {
        pN.setY(sSLSocket, "");
        pN.setY(list, "");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) sSLParameters, "");
            wR$MenuHostHelper$$ExternalSyntheticLambda1 wr_menuhosthelper__externalsyntheticlambda1 = wR.setX;
            Object[] array = wR$MenuHostHelper$$ExternalSyntheticLambda1.setX(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // o.wY
    public final String setIconTintList(SSLSocket sSLSocket) {
        pN.setY(sSLSocket, "");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // o.wY
    public final boolean setY() {
        wR$MenuHostHelper$$ExternalSyntheticLambda1 wr_menuhosthelper__externalsyntheticlambda1 = wR.setX;
        return pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) "Dalvik", (Object) System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29;
    }

    @Override // o.wY
    public final boolean setY(SSLSocket sSLSocket) {
        pN.setY(sSLSocket, "");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }
}