package o;

import android.graphics.PointF;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import o.C0589xb;
import o.C0593xf;
import o.wV;
import o.wX;

/* loaded from: classes.dex */
public final class wK extends wR {
    private static final boolean MenuHostHelper$$ExternalSyntheticLambda0;
    private final C0588xa MenuHostHelper$$ExternalSyntheticLambda1;
    private final List<wY> setOnLongClickListener;
    public static final byte[] $$m = {113, 46, 115, -60};
    public static final int $$n = 17;
    public static final byte[] $$g = {8, -125, -40, -38, -13, 16, -42, 27, 13, 0, -25, 22, 6, 7, -39, 30, 11, 2, -64, 63, -40};
    public static final int $$h = 31;
    public static final byte[] $$a = {116, 39, -17, 64, -1, 28, -15, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35};
    public static final int $$b = 251;
    private static byte[] setNavigationOnClickListener = {31, -80, -88, -103, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
    public static final int setY = 21;
    private static long setLayoutAnimation = 3968388354282771841L;
    public static final setIconTintList setIconTintList = new setIconTintList((byte) 0);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002b -> B:23:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 38
            int r6 = r6 + 77
            byte[] r0 = o.wK.$$a
            int r7 = r7 * 36
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r8 = 6 - r8
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L1b
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L37
        L1b:
            r3 = 0
        L1c:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L37:
            int r8 = r8 + r6
            int r6 = r8 + (-13)
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wK.a(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:23:0x002c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 15
            int r8 = r8 + 4
            int r9 = r9 + 105
            byte[] r0 = o.wK.setNavigationOnClickListener
            int r7 = r7 * 3
            int r7 = r7 + 16
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r9 = r8
            r3 = r9
            r5 = 0
            r8 = r7
            goto L2c
        L16:
            r3 = 0
        L17:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L2c:
            int r7 = r7 - r3
            int r7 = r7 + 2
            int r9 = r9 + 1
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r6
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wK.c(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002c -> B:23:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            byte[] r0 = o.wK.$$g
            int r8 = r8 * 11
            int r8 = r8 + 4
            int r7 = r7 * 4
            int r7 = r7 + 111
            byte[] r1 = new byte[r8]
            r2 = -1
            int r8 = r8 + r2
            if (r0 != 0) goto L19
            r7 = r6
            r3 = r1
            r4 = -1
            r1 = r0
            r0 = r9
            r9 = r8
            goto L37
        L19:
            r3 = -1
        L1a:
            int r3 = r3 + 1
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L2c
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L2c:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L37:
            int r8 = r8 + r6
            int r6 = r8 + (-1)
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wK.d(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:23:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.wK.$$m
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r6 = r6 * 5
            int r6 = 121 - r6
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L1b
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L34
        L1b:
            r3 = 0
        L1c:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L34:
            int r7 = r7 + 1
            int r8 = -r8
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wK.e(short, int, byte, java.lang.Object[]):void");
    }

    public wK() {
        wX.setIconTintList seticontintlist;
        wX.setIconTintList seticontintlist2;
        wX.setIconTintList seticontintlist3;
        C0593xf.setY sety = C0593xf.MenuHostHelper$$ExternalSyntheticLambda0;
        wV.setIconTintList seticontintlist4 = wV.setIconTintList;
        seticontintlist = wV.setX;
        wZ$MenuHostHelper$$ExternalSyntheticLambda1 wz_menuhosthelper__externalsyntheticlambda1 = wZ.setIconTintList;
        seticontintlist2 = wZ.MenuHostHelper$$ExternalSyntheticLambda0;
        C0589xb.setIconTintList seticontintlist5 = C0589xb.MenuHostHelper$$ExternalSyntheticLambda0;
        seticontintlist3 = C0589xb.setY;
        wY[] wYVarArr = {C0593xf.setY.MenuHostHelper$$ExternalSyntheticLambda1("com.android.org.conscrypt"), new wX(seticontintlist), new wX(seticontintlist2), new wX(seticontintlist3)};
        pN.setY(wYVarArr, "");
        pN.setY(wYVarArr, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) C0342oc.setIconTintList(wYVarArr, new ArrayList())) {
            if (((wY) obj).setY()) {
                arrayList.add(obj);
            }
        }
        this.setOnLongClickListener = arrayList;
        xa$MenuHostHelper$$ExternalSyntheticLambda1 xa_menuhosthelper__externalsyntheticlambda1 = C0588xa.setY;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = xa$MenuHostHelper$$ExternalSyntheticLambda1.setX();
    }

    @Override // o.wR
    public final void MenuHostHelper$$ExternalSyntheticLambda0(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        pN.setY(socket, "");
        pN.setY(inetSocketAddress, "");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            }
            throw e;
        }
    }

    @Override // o.wR
    public final void MenuHostHelper$$ExternalSyntheticLambda0(SSLSocket sSLSocket, String str, List<vB> list) {
        Object obj;
        pN.setY(sSLSocket, "");
        pN.setY(list, "");
        Iterator<T> it = this.setOnLongClickListener.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((wY) obj).setY(sSLSocket)) {
                break;
            }
        }
        wY wYVar = (wY) obj;
        if (wYVar != null) {
            wYVar.MenuHostHelper$$ExternalSyntheticLambda0(sSLSocket, str, list);
        }
    }

    @Override // o.wR
    public final String setX(SSLSocket sSLSocket) {
        Object obj;
        pN.setY(sSLSocket, "");
        Iterator<T> it = this.setOnLongClickListener.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((wY) obj).setY(sSLSocket)) {
                break;
            }
        }
        wY wYVar = (wY) obj;
        if (wYVar != null) {
            return wYVar.setIconTintList(sSLSocket);
        }
        return null;
    }

    @Override // o.wR
    public final Object MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        pN.setY(str, "");
        return this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(str);
    }

    @Override // o.wR
    public final void setY(String str, Object obj) {
        pN.setY(str, "");
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(obj)) {
            return;
        }
        wR.setX(str, 5, 4);
    }

    @Override // o.wR
    public final boolean setIconTintList(String str) {
        pN.setY(str, "");
        if (Build.VERSION.SDK_INT < 24) {
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) networkSecurityPolicy, "");
                return networkSecurityPolicy.isCleartextTrafficPermitted();
            }
            return true;
        }
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0477  */
    @Override // o.wR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.AbstractC0592xe setIconTintList(javax.net.ssl.X509TrustManager r27) {
        /*
            Method dump skipped, instructions count: 1348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wK.setIconTintList(javax.net.ssl.X509TrustManager):o.xe");
    }

    @Override // o.wR
    public final InterfaceC0595xh MenuHostHelper$$ExternalSyntheticLambda1(X509TrustManager x509TrustManager) {
        pN.setY(x509TrustManager, "");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) declaredMethod, "");
            declaredMethod.setAccessible(true);
            return new InterfaceC0595xh(x509TrustManager, declaredMethod) { // from class: o.wK$MenuHostHelper$$ExternalSyntheticLambda0
                private final Method MenuHostHelper$$ExternalSyntheticLambda0;
                private final X509TrustManager setY;

                public final boolean equals(Object obj) {
                    if (this != obj) {
                        if (obj instanceof wK$MenuHostHelper$$ExternalSyntheticLambda0) {
                            wK$MenuHostHelper$$ExternalSyntheticLambda0 wk_menuhosthelper__externalsyntheticlambda0 = (wK$MenuHostHelper$$ExternalSyntheticLambda0) obj;
                            return pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setY, wk_menuhosthelper__externalsyntheticlambda0.setY) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0, wk_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0);
                        }
                        return false;
                    }
                    return true;
                }

                public final int hashCode() {
                    X509TrustManager x509TrustManager2 = this.setY;
                    int hashCode = x509TrustManager2 != null ? x509TrustManager2.hashCode() : 0;
                    Method method = this.MenuHostHelper$$ExternalSyntheticLambda0;
                    return (hashCode * 31) + (method != null ? method.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("CustomTrustRootIndex(trustManager=");
                    sb.append(this.setY);
                    sb.append(", findByIssuerAndSignatureMethod=");
                    sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
                    sb.append(")");
                    return sb.toString();
                }

                {
                    pN.setY(x509TrustManager, "");
                    pN.setY(declaredMethod, "");
                    this.setY = x509TrustManager;
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = declaredMethod;
                }

                @Override // o.InterfaceC0595xh
                public final X509Certificate MenuHostHelper$$ExternalSyntheticLambda0(X509Certificate x509Certificate) {
                    pN.setY(x509Certificate, "");
                    try {
                        Object invoke = this.MenuHostHelper$$ExternalSyntheticLambda0.invoke(this.setY, x509Certificate);
                        if (invoke == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
                        }
                        return ((TrustAnchor) invoke).getTrustedCert();
                    } catch (IllegalAccessException e) {
                        throw new AssertionError("unable to get issues and signature", e);
                    } catch (InvocationTargetException unused) {
                        return null;
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return super.MenuHostHelper$$ExternalSyntheticLambda1(x509TrustManager);
        }
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList {
        private setIconTintList() {
        }

        public /* synthetic */ setIconTintList(byte b) {
            this();
        }
    }

    static {
        boolean z = false;
        if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) "Dalvik", (Object) System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        MenuHostHelper$$ExternalSyntheticLambda0 = z;
    }

    private static void b(int i, char[] cArr, Object[] objArr) {
        jD jDVar = new jD();
        char[] MenuHostHelper$$ExternalSyntheticLambda02 = jD.MenuHostHelper$$ExternalSyntheticLambda0(setLayoutAnimation ^ 2449010268519698653L, cArr, i);
        jDVar.setIconTintList = 4;
        while (jDVar.setIconTintList < MenuHostHelper$$ExternalSyntheticLambda02.length) {
            jDVar.setX = jDVar.setIconTintList - 4;
            int i2 = jDVar.setIconTintList;
            try {
                Object[] objArr2 = {Long.valueOf(MenuHostHelper$$ExternalSyntheticLambda02[jDVar.setIconTintList] ^ MenuHostHelper$$ExternalSyntheticLambda02[jDVar.setIconTintList % 4]), Long.valueOf(jDVar.setX), Long.valueOf(setLayoutAnimation)};
                Object obj = jC.setTextScaleX.get(-244088302);
                if (obj == null) {
                    byte b = (byte) ($$n & 7);
                    byte b2 = (byte) (b - 1);
                    Object[] objArr3 = new Object[1];
                    e(b, b2, b2, objArr3);
                    obj = ((Class) jC.setY((ViewConfiguration.getTapTimeout() >> 16) + 277, (char) (View.resolveSize(0, 0) + 42263), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4)).getMethod((String) objArr3[0], Long.TYPE, Long.TYPE, Long.TYPE);
                    jC.setTextScaleX.put(-244088302, obj);
                }
                MenuHostHelper$$ExternalSyntheticLambda02[i2] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr4 = {jDVar, jDVar};
                    Object obj2 = jC.setTextScaleX.get(467845792);
                    if (obj2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        Object[] objArr5 = new Object[1];
                        e(b3, b4, b4, objArr5);
                        obj2 = ((Class) jC.setY(305 - KeyEvent.normalizeMetaState(0), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 36290), 4 - KeyEvent.keyCodeFromString(""))).getMethod((String) objArr5[0], Object.class, Object.class);
                        jC.setTextScaleX.put(467845792, obj2);
                    }
                    ((Method) obj2).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(MenuHostHelper$$ExternalSyntheticLambda02, 4, MenuHostHelper$$ExternalSyntheticLambda02.length - 4);
    }
}