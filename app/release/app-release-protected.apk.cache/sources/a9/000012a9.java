package o;

import java.util.List;
import javax.net.ssl.SSLSocket;
import o.wN;
import o.wX;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class wZ implements wY {
    public static final wZ$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList = new wZ$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
    private static final wX.setIconTintList MenuHostHelper$$ExternalSyntheticLambda0 = new setX();

    public static final /* synthetic */ wX.setIconTintList MenuHostHelper$$ExternalSyntheticLambda1() {
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.wY
    public final boolean setY(SSLSocket sSLSocket) {
        pN.setY(sSLSocket, "");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // o.wY
    public final boolean setY() {
        boolean z;
        wN.setY sety = wN.setIconTintList;
        z = wN.MenuHostHelper$$ExternalSyntheticLambda0;
        return z;
    }

    @Override // o.wY
    public final String setIconTintList(SSLSocket sSLSocket) {
        pN.setY(sSLSocket, "");
        pN.setY(sSLSocket, "");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // o.wY
    public final void MenuHostHelper$$ExternalSyntheticLambda0(SSLSocket sSLSocket, String str, List<? extends vB> list) {
        pN.setY(sSLSocket, "");
        pN.setY(list, "");
        pN.setY(sSLSocket, "");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            wR$MenuHostHelper$$ExternalSyntheticLambda1 wr_menuhosthelper__externalsyntheticlambda1 = wR.setX;
            Object[] array = wR$MenuHostHelper$$ExternalSyntheticLambda1.setX(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* loaded from: classes.dex */
    public static final class setX implements wX.setIconTintList {
        setX() {
        }

        @Override // o.wX.setIconTintList
        public final boolean setX(SSLSocket sSLSocket) {
            boolean z;
            pN.setY(sSLSocket, "");
            wN.setY sety = wN.setIconTintList;
            z = wN.MenuHostHelper$$ExternalSyntheticLambda0;
            return z && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // o.wX.setIconTintList
        public final wY setY(SSLSocket sSLSocket) {
            pN.setY(sSLSocket, "");
            return new wZ();
        }
    }
}