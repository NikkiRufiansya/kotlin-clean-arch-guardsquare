package o;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* renamed from: o.xd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0591xd extends ProxySelector {
    public static final C0591xd MenuHostHelper$$ExternalSyntheticLambda1 = new C0591xd();

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    private C0591xd() {
    }

    @Override // java.net.ProxySelector
    public final List<Proxy> select(URI uri) {
        if (uri == null) {
            throw new IllegalArgumentException("uri must not be null".toString());
        }
        List<Proxy> singletonList = Collections.singletonList(Proxy.NO_PROXY);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) singletonList, "");
        return singletonList;
    }
}