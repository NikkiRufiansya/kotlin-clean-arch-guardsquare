package o;

import java.lang.reflect.Method;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class wO$MenuHostHelper$$ExternalSyntheticLambda0 {
    private wO$MenuHostHelper$$ExternalSyntheticLambda0() {
    }

    public /* synthetic */ wO$MenuHostHelper$$ExternalSyntheticLambda0(byte b) {
        this();
    }

    public static wR setX() {
        String property = System.getProperty("java.specification.version", "unknown");
        try {
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) property, "");
            if (Integer.parseInt(property) >= 9) {
                return null;
            }
        } catch (NumberFormatException unused) {
        }
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
            Method method = cls.getMethod("put", SSLSocket.class, cls2);
            Method method2 = cls.getMethod("get", SSLSocket.class);
            Method method3 = cls.getMethod("remove", SSLSocket.class);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) method, "");
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) method2, "");
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) method3, "");
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) cls3, "");
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) cls4, "");
            return new wO(method, method2, method3, cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            return null;
        }
    }
}