package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C0348oi;
import o.C0358os;
import o.C0371pe;
import o.C0614xy;
import o.C0615xz;
import o.nX;
import o.pN;
import o.qR;
import o.wR;
import o.wR$MenuHostHelper$$ExternalSyntheticLambda1;
import o.xB;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {
    private static final List<String> setIconTintList;
    private static final PublicSuffixDatabase setX;
    private byte[] setNavigationOnClickListener;
    private byte[] setUiOptions;
    private static byte[] setLayoutAnimation = {112, 117, 112, -122, 16, -5, -2, -15, 7, 4, -34, 18, 8, -15, -6, 1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1};
    public static final int setY = 222;
    public static final PublicSuffixDatabase$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1 = new PublicSuffixDatabase$MenuHostHelper$$ExternalSyntheticLambda0((byte) 0);
    private static final byte[] MenuHostHelper$$ExternalSyntheticLambda0 = {42};
    private final AtomicBoolean setUnboundedRipple = new AtomicBoolean(false);
    private final CountDownLatch setOnLongClickListener = new CountDownLatch(1);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = 16 - r7
            int r8 = r8 * 7
            int r8 = 106 - r8
            byte[] r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.setLayoutAnimation
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L18
            r8 = r7
            r4 = r8
            r3 = 0
            r7 = r6
            goto L30
        L18:
            r3 = 0
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L30:
            int r6 = r6 + r4
            int r6 = r6 + 2
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(int, byte, byte, java.lang.Object[]):void");
    }

    public static List<String> setIconTintList(String str) {
        List<String> x = qR.setX(str, new char[]{'.'});
        return pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) ((String) C0348oi.setX((List<? extends Object>) x)), (Object) "") ? C0348oi.MenuHostHelper$$ExternalSyntheticLambda1((List) x) : x;
    }

    public final List<String> setY(List<String> list) {
        String str;
        String str2;
        C0358os c0358os;
        C0358os c0358os2;
        Thread thread;
        InputStream resourceAsStream;
        wR unused;
        String str3 = null;
        if (this.setUnboundedRipple.get() || !this.setUnboundedRipple.compareAndSet(false, true)) {
            try {
                try {
                    this.setOnLongClickListener.await();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (InterruptedException unused2) {
                byte b = (byte) (setLayoutAnimation[15] - 1);
                Object[] objArr = new Object[1];
                a(setLayoutAnimation[22], b, b, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                byte b2 = setLayoutAnimation[15];
                Object[] objArr2 = new Object[1];
                a((byte) (-setLayoutAnimation[15]), b2, b2, objArr2);
                ((Thread) cls.getMethod((String) objArr2[0], null).invoke(null, null)).interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
                        break;
                    } catch (InterruptedIOException unused3) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        wR$MenuHostHelper$$ExternalSyntheticLambda1 wr_menuhosthelper__externalsyntheticlambda1 = wR.setX;
                        unused = wR.MenuHostHelper$$ExternalSyntheticLambda1;
                        wR.setX("Failed to read public suffix list", 5, e);
                        if (z) {
                            try {
                                byte b3 = (byte) (setLayoutAnimation[15] - 1);
                                Object[] objArr3 = new Object[1];
                                a(setLayoutAnimation[22], b3, b3, objArr3);
                                Class<?> cls2 = Class.forName((String) objArr3[0]);
                                byte b4 = setLayoutAnimation[15];
                                Object[] objArr4 = new Object[1];
                                a((byte) (-setLayoutAnimation[15]), b4, b4, objArr4);
                                thread = (Thread) cls2.getMethod((String) objArr4[0], null).invoke(null, null);
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    if (z) {
                        try {
                            byte b5 = (byte) (setLayoutAnimation[15] - 1);
                            Object[] objArr5 = new Object[1];
                            a(setLayoutAnimation[22], b5, b5, objArr5);
                            Class<?> cls3 = Class.forName((String) objArr5[0]);
                            byte b6 = setLayoutAnimation[15];
                            Object[] objArr6 = new Object[1];
                            a((byte) (-setLayoutAnimation[15]), b6, b6, objArr6);
                            ((Thread) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).interrupt();
                        } catch (Throwable th4) {
                            Throwable cause3 = th4.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th4;
                        }
                    }
                    throw th3;
                }
            }
            if (resourceAsStream != null) {
                C0614xy c0614xy = new C0614xy(C0615xz.setY(resourceAsStream));
                pN.setY(c0614xy, "");
                xB xBVar = new xB(c0614xy);
                try {
                    xB xBVar2 = xBVar;
                    byte[] iconTintList = xBVar2.setIconTintList(xBVar2.setIconSize());
                    byte[] iconTintList2 = xBVar2.setIconTintList(xBVar2.setIconSize());
                    nX nXVar = nX.setX;
                    C0371pe.setX(xBVar, null);
                    synchronized (this) {
                        pN.setX(iconTintList);
                        this.setNavigationOnClickListener = iconTintList;
                        pN.setX(iconTintList2);
                        this.setUiOptions = iconTintList2;
                        nX nXVar2 = nX.setX;
                    }
                    this.setOnLongClickListener.countDown();
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        C0371pe.setX(xBVar, th5);
                        throw th6;
                    }
                }
            }
            if (z) {
                try {
                    byte b7 = (byte) (setLayoutAnimation[15] - 1);
                    Object[] objArr7 = new Object[1];
                    a(setLayoutAnimation[22], b7, b7, objArr7);
                    Class<?> cls4 = Class.forName((String) objArr7[0]);
                    byte b8 = setLayoutAnimation[15];
                    Object[] objArr8 = new Object[1];
                    a((byte) (-setLayoutAnimation[15]), b8, b8, objArr8);
                    thread = (Thread) cls4.getMethod((String) objArr8[0], null).invoke(null, null);
                    thread.interrupt();
                } catch (Throwable th7) {
                    Throwable cause4 = th7.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th7;
                }
            }
        }
        if (this.setNavigationOnClickListener != null) {
            int size = list.size();
            byte[][] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                String str4 = list.get(i);
                Charset charset = StandardCharsets.UTF_8;
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) charset, "");
                if (str4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = str4.getBytes(charset);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) bytes, "");
                bArr[i] = bytes;
            }
            byte[][] bArr2 = bArr;
            int length = bArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    str = null;
                    break;
                }
                byte[] bArr3 = this.setNavigationOnClickListener;
                if (bArr3 == null) {
                    pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                }
                str = PublicSuffixDatabase$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(bArr3, bArr2, i2);
                if (str != null) {
                    break;
                }
                i2++;
            }
            byte[][] bArr4 = bArr2;
            if (bArr4.length > 1) {
                byte[][] bArr5 = (byte[][]) bArr4.clone();
                int length2 = bArr5.length;
                for (int i3 = 0; i3 < length2 - 1; i3++) {
                    bArr5[i3] = MenuHostHelper$$ExternalSyntheticLambda0;
                    byte[] bArr6 = this.setNavigationOnClickListener;
                    if (bArr6 == null) {
                        pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                    }
                    str2 = PublicSuffixDatabase$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(bArr6, bArr5, i3);
                    if (str2 != null) {
                        break;
                    }
                }
            }
            str2 = null;
            if (str2 != null) {
                int length3 = bArr4.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length3 - 1) {
                        break;
                    }
                    byte[] bArr7 = this.setUiOptions;
                    if (bArr7 == null) {
                        pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                    }
                    String MenuHostHelper$$ExternalSyntheticLambda12 = PublicSuffixDatabase$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(bArr7, bArr2, i4);
                    if (MenuHostHelper$$ExternalSyntheticLambda12 != null) {
                        str3 = MenuHostHelper$$ExternalSyntheticLambda12;
                        break;
                    }
                    i4++;
                }
            }
            if (str3 != null) {
                StringBuilder sb = new StringBuilder("!");
                sb.append(str3);
                return qR.setX(sb.toString(), new char[]{'.'});
            } else if (str == null && str2 == null) {
                return setIconTintList;
            } else {
                if (str == null || (c0358os = qR.setX(str, new char[]{'.'})) == null) {
                    c0358os = C0358os.setIconTintList;
                }
                if (str2 == null || (c0358os2 = qR.setX(str2, new char[]{'.'})) == null) {
                    c0358os2 = C0358os.setIconTintList;
                }
                return c0358os.size() <= c0358os2.size() ? c0358os2 : c0358os;
            }
        }
        throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
    }

    static {
        List<String> singletonList = Collections.singletonList("*");
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) singletonList, "");
        setIconTintList = singletonList;
        setX = new PublicSuffixDatabase();
    }
}