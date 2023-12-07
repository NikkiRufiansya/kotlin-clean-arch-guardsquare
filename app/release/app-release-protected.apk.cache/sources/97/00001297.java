package o;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class wP extends wR {
    public static final setX MenuHostHelper$$ExternalSyntheticLambda1 = new setX((byte) 0);
    private static final boolean setIconTintList;

    @Override // o.wR
    public final void MenuHostHelper$$ExternalSyntheticLambda0(SSLSocket sSLSocket, String str, List<vB> list) {
        pN.setY(sSLSocket, "");
        pN.setY(list, "");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        List<String> x = wR$MenuHostHelper$$ExternalSyntheticLambda1.setX(list);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) sSLParameters, "");
        Object[] array = x.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    /* loaded from: classes.dex */
    public static final class setX {
        private setX() {
        }

        public /* synthetic */ setX(byte b) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
        if (r3.intValue() >= 9) goto L39;
     */
    static {
        /*
            o.wP$setX r0 = new o.wP$setX
            r1 = 0
            r0.<init>(r1)
            o.wP.MenuHostHelper$$ExternalSyntheticLambda1 = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L7e
            java.lang.String r4 = ""
            o.pN.setY(r0, r4)
            o.pN.setY(r0, r4)
            r4 = 10
            o.qK.MenuHostHelper$$ExternalSyntheticLambda1(r4)
            int r5 = r0.length()
            if (r5 != 0) goto L26
            goto L7e
        L26:
            char r6 = r0.charAt(r1)
            r7 = 48
            int r7 = o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r6, r7)
            r8 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r7 >= 0) goto L47
            if (r5 != r2) goto L38
            goto L7e
        L38:
            r7 = 45
            if (r6 != r7) goto L41
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 1
        L3f:
            r7 = 1
            goto L49
        L41:
            r7 = 43
            if (r6 != r7) goto L7e
            r6 = 0
            goto L3f
        L47:
            r6 = 0
            r7 = 0
        L49:
            r9 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r10 = 0
            r11 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
        L50:
            if (r7 >= r5) goto L71
            char r12 = r0.charAt(r7)
            int r12 = java.lang.Character.digit(r12, r4)
            if (r12 >= 0) goto L5d
            goto L7e
        L5d:
            if (r10 >= r11) goto L66
            if (r11 != r9) goto L7e
            int r11 = r8 / 10
            if (r10 >= r11) goto L66
            goto L7e
        L66:
            int r10 = r10 * 10
            int r13 = r8 + r12
            if (r10 >= r13) goto L6d
            goto L7e
        L6d:
            int r10 = r10 - r12
            int r7 = r7 + 1
            goto L50
        L71:
            if (r6 == 0) goto L78
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            goto L7d
        L78:
            int r0 = -r10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L7d:
            r3 = r0
        L7e:
            if (r3 == 0) goto L89
            int r0 = r3.intValue()
            r3 = 9
            if (r0 >= r3) goto L92
            goto L93
        L89:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L93
            r0.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L93
        L92:
            r1 = 1
        L93:
            o.wP.setIconTintList = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wP.<clinit>():void");
    }

    @Override // o.wR
    public final String setX(SSLSocket sSLSocket) {
        pN.setY(sSLSocket, "");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.hashCode() == 0) {
                if (applicationProtocol.equals("")) {
                    return null;
                }
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}