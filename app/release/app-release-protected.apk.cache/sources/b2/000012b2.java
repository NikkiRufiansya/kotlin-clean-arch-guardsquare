package o;

import java.net.Proxy;

/* renamed from: o.wc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0562wc {
    public static final /* synthetic */ int[] setY;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        setY = iArr;
        iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        iArr[Proxy.Type.HTTP.ordinal()] = 2;
    }
}