package o;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;

/* loaded from: classes.dex */
public final class vK implements InterfaceC0533vc {
    private final InterfaceC0551vu MenuHostHelper$$ExternalSyntheticLambda1;

    public vK() {
        this((byte) 0);
    }

    public /* synthetic */ vK(byte b) {
        this(InterfaceC0551vu.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    private vK(InterfaceC0551vu interfaceC0551vu) {
        pN.setY(interfaceC0551vu, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = interfaceC0551vu;
    }

    private static InetAddress setY(Proxy proxy, C0555vx c0555vx, InterfaceC0551vu interfaceC0551vu) {
        Proxy.Type type = proxy.type();
        if (type != null && vM.MenuHostHelper$$ExternalSyntheticLambda1[type.ordinal()] == 1) {
            return (InetAddress) C0348oi.setIconTintList((List<? extends Object>) interfaceC0551vu.setX(c0555vx.setY));
        }
        SocketAddress address = proxy.address();
        if (address != null) {
            InetAddress address2 = ((InetSocketAddress) address).getAddress();
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) address2, "");
            return address2;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    @Override // o.InterfaceC0533vc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.vE MenuHostHelper$$ExternalSyntheticLambda1(o.vG r21, o.vJ r22) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.vK.MenuHostHelper$$ExternalSyntheticLambda1(o.vG, o.vJ):o.vE");
    }
}