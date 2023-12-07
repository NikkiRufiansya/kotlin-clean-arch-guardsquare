package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* renamed from: o.gx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198gx {
    C0184gj MenuHostHelper$$ExternalSyntheticLambda0;
    final String MenuHostHelper$$ExternalSyntheticLambda1;
    final String setIconTintList;
    final int setOnLongClickListener;
    long setX;
    String setY;
    public static final byte[] $$g = {22, 66, -65, -82};
    public static final int $$h = 120;
    public static final byte[] $$d = {29, 64, 35, 67, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, -52, 64, -19, -16, 54, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -36};
    public static final int $$e = 12;
    public static final byte[] $$a = {38, -105, 32, 30, 1, -28, 14, 1, -28, 30, -39, -25, -12, 13, -34, -18, -19, 27, -42, -23, -14, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 35};
    public static final int $$b = 219;
    private static byte[] setCenterIfNoTextEnabled = {75, -23, 102, -23, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
    public static final int setNavigationOnClickListener = 99;
    private static char[] setLayoutAnimation = {34159, 34170, 34156, 34174, 34169, 34151, 34106, 34173, 34141, 34167, 34172, 34147, 34171, 34125, 34148, 34157, 34149, 34168, 34142, 34127, 34162, 34140, 34144, 34163};
    private static boolean setUiOptions = true;
    private static boolean ViewPager$SavedState$1 = true;
    private static int setUnboundedRipple = -1400797944;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            byte[] r0 = o.C0198gx.$$a
            int r7 = r7 * 38
            int r7 = r7 + 77
            int r8 = 40 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r1
            r5 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            goto L30
        L16:
            r3 = 0
        L17:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r6
        L30:
            int r7 = -r7
            int r10 = r10 + 1
            int r8 = r8 + r7
            int r7 = r8 + (-13)
            r8 = r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0198gx.a(byte, short, short, java.lang.Object[]):void");
    }

    private static void c(short s, byte b, byte b2, Object[] objArr) {
        int i = (b * 3) + 16;
        int i2 = b2 + 105;
        int i3 = (s * 15) + 4;
        byte[] bArr = setCenterIfNoTextEnabled;
        byte[] bArr2 = new byte[i];
        int i4 = -1;
        int i5 = i - 1;
        if (bArr == null) {
            i3++;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i4 = -1;
            i2 = (i2 - i5) + 2;
            i5 = i5;
        }
        while (true) {
            int i6 = i4 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b3 = bArr[i3];
            int i7 = i2;
            i3++;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i4 = i6;
            i2 = (i7 - b3) + 2;
            i5 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0033). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 30
            int r8 = 45 - r8
            int r9 = r9 * 4
            int r9 = 115 - r9
            byte[] r0 = o.C0198gx.$$d
            int r7 = r7 * 14
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L1a
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            goto L33
        L1a:
            r3 = 0
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r7]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L33:
            int r10 = r10 + r8
            int r8 = r10 + (-13)
            int r7 = r7 + 1
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0198gx.d(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0035). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = 1 - r7
            int r8 = r8 * 2
            int r8 = r8 + 66
            byte[] r0 = o.C0198gx.$$g
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L1a
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L35
        L1a:
            r3 = 0
        L1b:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            int r6 = r6 + 1
            r3 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L35:
            int r7 = r7 + r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0198gx.e(byte, byte, short, java.lang.Object[]):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0198gx) {
            C0198gx c0198gx = (C0198gx) obj;
            return pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.setIconTintList, (Object) c0198gx.setIconTintList) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.MenuHostHelper$$ExternalSyntheticLambda1, (Object) c0198gx.MenuHostHelper$$ExternalSyntheticLambda1) && this.setOnLongClickListener == c0198gx.setOnLongClickListener && this.setX == c0198gx.setX && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0, c0198gx.MenuHostHelper$$ExternalSyntheticLambda0) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.setY, (Object) c0198gx.setY);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.setIconTintList);
        sb.append(", firstSessionId=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(", sessionIndex=");
        sb.append(this.setOnLongClickListener);
        sb.append(", eventTimestampUs=");
        sb.append(this.setX);
        sb.append(", dataCollectionStatus=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", firebaseInstallationId=");
        sb.append(this.setY);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ C0198gx(String str, String str2, int i, long j, C0184gj c0184gj) {
        this(str, str2, i, j, c0184gj, "");
    }

    private C0198gx(String str, String str2, int i, long j, C0184gj c0184gj, String str3) {
        pN.setY(str, "");
        pN.setY(str2, "");
        pN.setY(c0184gj, "");
        pN.setY(str3, "");
        this.setIconTintList = str;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str2;
        this.setOnLongClickListener = i;
        this.setX = j;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = c0184gj;
        this.setY = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x044a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String setX() {
        /*
            Method dump skipped, instructions count: 1287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0198gx.setX():java.lang.String");
    }

    public final int hashCode() {
        long j = this.setX;
        return (((((((((this.setIconTintList.hashCode() * 31) + this.MenuHostHelper$$ExternalSyntheticLambda1.hashCode()) * 31) + this.setOnLongClickListener) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode()) * 31) + this.setY.hashCode();
    }

    private static void b(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) {
        jt jtVar = new jt();
        char[] cArr2 = setLayoutAnimation;
        int i2 = -1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object obj = jC.setTextScaleX.get(-2024796271);
                    if (obj == null) {
                        byte b = (byte) i2;
                        byte b2 = (byte) (b + 1);
                        Object[] objArr3 = new Object[1];
                        e(b, b2, (byte) (b2 + 1), objArr3);
                        obj = ((Class) jC.setY(232 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) Color.argb(0, 0, 0, 0), 4 - Color.argb(0, 0, 0, 0))).getMethod((String) objArr3[0], Integer.TYPE);
                        jC.setTextScaleX.put(-2024796271, obj);
                    }
                    cArr3[i3] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    i3++;
                    i2 = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(setUnboundedRipple)};
            Object obj2 = jC.setTextScaleX.get(-192560398);
            if (obj2 == null) {
                obj2 = ((Class) jC.setY(View.combineMeasuredStates(0, 0) + 357, (char) (31791 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 4)).getMethod("C", Integer.TYPE);
                jC.setTextScaleX.put(-192560398, obj2);
            }
            int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
            char c = '0';
            if (ViewPager$SavedState$1) {
                jtVar.setIconTintList = bArr.length;
                char[] cArr4 = new char[jtVar.setIconTintList];
                jtVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                while (jtVar.MenuHostHelper$$ExternalSyntheticLambda1 < jtVar.setIconTintList) {
                    cArr4[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[bArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] + i] - intValue);
                    try {
                        Object[] objArr5 = {jtVar, jtVar};
                        Object obj3 = jC.setTextScaleX.get(258277102);
                        if (obj3 == null) {
                            byte b3 = (byte) (-1);
                            byte b4 = (byte) (b3 + 1);
                            Object[] objArr6 = new Object[1];
                            e(b3, b4, b4, objArr6);
                            obj3 = ((Class) jC.setY(210 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((-1) - TextUtils.indexOf("", c)), 5 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).getMethod((String) objArr6[0], Object.class, Object.class);
                            jC.setTextScaleX.put(258277102, obj3);
                        }
                        ((Method) obj3).invoke(null, objArr5);
                        c = '0';
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new String(cArr4);
            } else if (setUiOptions) {
                jtVar.setIconTintList = cArr.length;
                char[] cArr5 = new char[jtVar.setIconTintList];
                jtVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                while (jtVar.MenuHostHelper$$ExternalSyntheticLambda1 < jtVar.setIconTintList) {
                    cArr5[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[cArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] - i] - intValue);
                    try {
                        Object[] objArr7 = {jtVar, jtVar};
                        Object obj4 = jC.setTextScaleX.get(258277102);
                        if (obj4 == null) {
                            byte b5 = (byte) (-1);
                            byte b6 = (byte) (b5 + 1);
                            Object[] objArr8 = new Object[1];
                            e(b5, b6, b6, objArr8);
                            obj4 = ((Class) jC.setY(TextUtils.getOffsetBefore("", 0) + 210, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 4)).getMethod((String) objArr8[0], Object.class, Object.class);
                            jC.setTextScaleX.put(258277102, obj4);
                        }
                        ((Method) obj4).invoke(null, objArr7);
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                objArr[0] = new String(cArr5);
            } else {
                jtVar.setIconTintList = iArr.length;
                char[] cArr6 = new char[jtVar.setIconTintList];
                jtVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                while (jtVar.MenuHostHelper$$ExternalSyntheticLambda1 < jtVar.setIconTintList) {
                    cArr6[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[iArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] - i] - intValue);
                    jtVar.MenuHostHelper$$ExternalSyntheticLambda1++;
                }
                objArr[0] = new String(cArr6);
            }
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }
}