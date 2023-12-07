package o;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class wX implements wY {
    private final setIconTintList setIconTintList;
    private wY setY;

    /* loaded from: classes.dex */
    public interface setIconTintList {
        boolean setX(SSLSocket sSLSocket);

        wY setY(SSLSocket sSLSocket);
    }

    @Override // o.wY
    public final boolean setY() {
        return true;
    }

    public wX(setIconTintList seticontintlist) {
        pN.setY(seticontintlist, "");
        this.setIconTintList = seticontintlist;
    }

    @Override // o.wY
    public final boolean setY(SSLSocket sSLSocket) {
        pN.setY(sSLSocket, "");
        return this.setIconTintList.setX(sSLSocket);
    }

    @Override // o.wY
    public final void MenuHostHelper$$ExternalSyntheticLambda0(SSLSocket sSLSocket, String str, List<? extends vB> list) {
        pN.setY(sSLSocket, "");
        pN.setY(list, "");
        wY MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(sSLSocket);
        if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(sSLSocket, str, list);
        }
    }

    @Override // o.wY
    public final String setIconTintList(SSLSocket sSLSocket) {
        pN.setY(sSLSocket, "");
        wY MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(sSLSocket);
        if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            return MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(sSLSocket);
        }
        return null;
    }

    private final wY MenuHostHelper$$ExternalSyntheticLambda1(SSLSocket sSLSocket) {
        wY wYVar;
        synchronized (this) {
            if (this.setY == null && this.setIconTintList.setX(sSLSocket)) {
                this.setY = this.setIconTintList.setY(sSLSocket);
            }
            wYVar = this.setY;
        }
        return wYVar;
    }
}