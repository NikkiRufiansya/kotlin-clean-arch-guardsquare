package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import o.wK;
import o.wX;

/* loaded from: classes.dex */
public class wV implements wY {
    public static final setIconTintList setIconTintList = new setIconTintList((byte) 0);
    private static final wX.setIconTintList setX;
    private final Method MenuHostHelper$$ExternalSyntheticLambda0;
    private final Method MenuHostHelper$$ExternalSyntheticLambda1;
    private final Method setLayoutAnimation;
    private final Class<? super SSLSocket> setUnboundedRipple;
    private final Method setY;

    public wV(Class<? super SSLSocket> cls) {
        pN.setY(cls, "");
        this.setUnboundedRipple = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) declaredMethod, "");
        this.setLayoutAnimation = declaredMethod;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = cls.getMethod("setHostname", String.class);
        this.setY = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    public static final /* synthetic */ wX.setIconTintList setX() {
        return setX;
    }

    @Override // o.wY
    public final boolean setY() {
        boolean z;
        wK.setIconTintList seticontintlist = wK.setIconTintList;
        z = wK.MenuHostHelper$$ExternalSyntheticLambda0;
        return z;
    }

    @Override // o.wY
    public final boolean setY(SSLSocket sSLSocket) {
        pN.setY(sSLSocket, "");
        return this.setUnboundedRipple.isInstance(sSLSocket);
    }

    @Override // o.wY
    public final void MenuHostHelper$$ExternalSyntheticLambda0(SSLSocket sSLSocket, String str, List<? extends vB> list) {
        pN.setY(sSLSocket, "");
        pN.setY(list, "");
        pN.setY(sSLSocket, "");
        if (this.setUnboundedRipple.isInstance(sSLSocket)) {
            try {
                this.setLayoutAnimation.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0.invoke(sSLSocket, str);
                }
                Method method = this.MenuHostHelper$$ExternalSyntheticLambda1;
                Object[] objArr = new Object[1];
                wR$MenuHostHelper$$ExternalSyntheticLambda1 wr_menuhosthelper__externalsyntheticlambda1 = wR.setX;
                pN.setY(list, "");
                C0602xo c0602xo = new C0602xo();
                wR$MenuHostHelper$$ExternalSyntheticLambda1 wr_menuhosthelper__externalsyntheticlambda12 = wr_menuhosthelper__externalsyntheticlambda1;
                for (String str2 : wR$MenuHostHelper$$ExternalSyntheticLambda1.setX(list)) {
                    c0602xo.MenuHostHelper$$ExternalSyntheticLambda0(str2.length());
                    pN.setY(str2, "");
                    c0602xo.MenuHostHelper$$ExternalSyntheticLambda0(str2, 0, str2.length());
                }
                objArr[0] = c0602xo.setIconTintList(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0);
                method.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // o.wY
    public final String setIconTintList(SSLSocket sSLSocket) {
        pN.setY(sSLSocket, "");
        pN.setY(sSLSocket, "");
        if (this.setUnboundedRipple.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.setY.invoke(sSLSocket, new Object[0]);
                if (bArr != null) {
                    Charset charset = StandardCharsets.UTF_8;
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) charset, "");
                    return new String(bArr, charset);
                }
                return null;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (NullPointerException e2) {
                if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) e2.getMessage(), (Object) "ssl == null")) {
                    return null;
                }
                throw e2;
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
        return null;
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList {
        private setIconTintList() {
        }

        public /* synthetic */ setIconTintList(byte b) {
            this();
        }

        /* renamed from: o.wV$setIconTintList$setIconTintList */
        /* loaded from: classes.dex */
        public static final class C0010setIconTintList implements wX.setIconTintList {
            private /* synthetic */ String MenuHostHelper$$ExternalSyntheticLambda1;

            C0010setIconTintList(String str) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
            }

            @Override // o.wX.setIconTintList
            public final boolean setX(SSLSocket sSLSocket) {
                pN.setY(sSLSocket, "");
                String name = sSLSocket.getClass().getName();
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) name, "");
                StringBuilder sb = new StringBuilder();
                sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
                sb.append('.');
                return qR.setX(name, sb.toString(), false);
            }

            @Override // o.wX.setIconTintList
            public final wY setY(SSLSocket sSLSocket) {
                pN.setY(sSLSocket, "");
                setIconTintList seticontintlist = wV.setIconTintList;
                Class<?> cls = sSLSocket.getClass();
                Class<?> cls2 = cls;
                while (cls2 != null && (!pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) cls2.getSimpleName(), (Object) "OpenSSLSocketImpl"))) {
                    cls2 = cls2.getSuperclass();
                    if (cls2 == null) {
                        StringBuilder sb = new StringBuilder("No OpenSSLSocketImpl superclass of socket of type ");
                        sb.append(cls);
                        throw new AssertionError(sb.toString());
                    }
                }
                pN.setX(cls2);
                return new wV(cls2);
            }
        }
    }

    static {
        pN.setY("com.google.android.gms.org.conscrypt", "");
        setX = new setIconTintList.C0010setIconTintList("com.google.android.gms.org.conscrypt");
    }
}