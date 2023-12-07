package o;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class wU extends AbstractC0592xe {
    private final X509TrustManager setIconTintList;
    private final X509TrustManagerExtensions setX;
    private static byte[] setUnboundedRipple = {77, -56, -115, -110, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
    public static final int setY = 71;
    public static final wU$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0 = new wU$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0035). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 106 - r8
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r7 = 16 - r7
            byte[] r0 = o.wU.setUnboundedRipple
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L19
            r8 = r7
            r3 = r1
            r4 = 0
            r7 = r6
            r1 = r0
            r0 = r9
            r9 = r8
            goto L35
        L19:
            r3 = 0
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L35:
            int r8 = r8 + r6
            int r8 = r8 + 2
            r6 = r7
            r7 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wU.a(int, byte, int, java.lang.Object[]):void");
    }

    public wU(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        pN.setY(x509TrustManager, "");
        pN.setY(x509TrustManagerExtensions, "");
        this.setIconTintList = x509TrustManager;
        this.setX = x509TrustManagerExtensions;
    }

    @Override // o.AbstractC0592xe
    public final List<Certificate> MenuHostHelper$$ExternalSyntheticLambda0(List<? extends Certificate> list, String str) {
        pN.setY(list, "");
        pN.setY(str, "");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array != null) {
            try {
                List<X509Certificate> checkServerTrusted = this.setX.checkServerTrusted((X509Certificate[]) array, "RSA", str);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) checkServerTrusted, "");
                return checkServerTrusted;
            } catch (CertificateException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wU) && ((wU) obj).setIconTintList == this.setIconTintList;
    }

    public final int hashCode() {
        try {
            Object[] objArr = {this.setIconTintList};
            byte b = (byte) (setUnboundedRipple[5] + 1);
            Object[] objArr2 = new Object[1];
            a(14, b, b, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b2 = setUnboundedRipple[5];
            Object[] objArr3 = new Object[1];
            a(b2, (byte) (b2 + 1), (byte) (-setUnboundedRipple[5]), objArr3);
            return ((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}