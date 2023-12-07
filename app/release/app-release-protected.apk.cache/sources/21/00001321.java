package o;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: o.xf */
/* loaded from: classes.dex */
public final class C0593xf extends wV {
    public static final setY MenuHostHelper$$ExternalSyntheticLambda0 = new setY((byte) 0);
    private final Class<? super SSLSocketFactory> MenuHostHelper$$ExternalSyntheticLambda1;
    private final Class<?> setX;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0593xf(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        pN.setY(cls, "");
        pN.setY(cls2, "");
        pN.setY(cls3, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = cls2;
        this.setX = cls3;
    }

    /* renamed from: o.xf$setY */
    /* loaded from: classes.dex */
    public static final class setY {
        private setY() {
        }

        public /* synthetic */ setY(byte b) {
            this();
        }

        public static wY MenuHostHelper$$ExternalSyntheticLambda1(String str) {
            wR unused;
            pN.setY(str, "");
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".OpenSSLSocketImpl");
                Class<?> cls = Class.forName(sb.toString());
                if (cls == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(".OpenSSLSocketFactoryImpl");
                Class<?> cls2 = Class.forName(sb2.toString());
                if (cls2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(".SSLParametersImpl");
                Class<?> cls3 = Class.forName(sb3.toString());
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) cls3, "");
                return new C0593xf(cls, cls2, cls3);
            } catch (Exception e) {
                wR$MenuHostHelper$$ExternalSyntheticLambda1 wr_menuhosthelper__externalsyntheticlambda1 = wR.setX;
                unused = wR.MenuHostHelper$$ExternalSyntheticLambda1;
                wR.setX("unable to load android socket classes", 5, e);
                return null;
            }
        }
    }
}