package o;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class vG {
    public final C0532vb MenuHostHelper$$ExternalSyntheticLambda0;
    public final Proxy setX;
    public final InetSocketAddress setY;

    public vG(C0532vb c0532vb, Proxy proxy, InetSocketAddress inetSocketAddress) {
        pN.setY(c0532vb, "");
        pN.setY(proxy, "");
        pN.setY(inetSocketAddress, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = c0532vb;
        this.setX = proxy;
        this.setY = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vG) {
            vG vGVar = (vG) obj;
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0(vGVar.MenuHostHelper$$ExternalSyntheticLambda0, this.MenuHostHelper$$ExternalSyntheticLambda0) && pN.MenuHostHelper$$ExternalSyntheticLambda0(vGVar.setX, this.setX) && pN.MenuHostHelper$$ExternalSyntheticLambda0(vGVar.setY, this.setY)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode() + 527) * 31) + this.setX.hashCode()) * 31) + this.setY.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Route{");
        sb.append(this.setY);
        sb.append('}');
        return sb.toString();
    }
}