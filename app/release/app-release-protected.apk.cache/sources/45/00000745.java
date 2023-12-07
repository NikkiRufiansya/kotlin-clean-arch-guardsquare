package o;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: o.mz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311mz {
    private static InterfaceC0276lp MenuHostHelper$$ExternalSyntheticLambda0;
    private static char[] MenuHostHelper$$ExternalSyntheticLambda1;
    public static final C0311mz setY;
    public static final byte[] $$g = {16, -72, -107, 15};
    public static final int $$h = 167;
    public static final byte[] $$d = {104, -68, 0, 44, 1, -28, 30, -39, -25, -12, 13, -34, -18, -19, 27, -42, -23, -14, 52, -64, 19, 16, -54, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 36};
    public static final int $$e = 65;
    public static final byte[] $$a = {56, 110, 47, 101, 1, -28, 14, 1, -28, 30, -39, -25, -12, 13, -34, -18, -19, 27, -42, -23, -14, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 35};
    public static final int $$b = 224;
    private static byte[] setIconTintList = {59, -54, -26, -72, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
    public static final int setX = 139;

    static {
        setY();
        setY = new C0311mz();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 38
            int r7 = 115 - r7
            byte[] r0 = o.C0311mz.$$a
            int r9 = r9 + 4
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r7 = r8
            r3 = r1
            r5 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L32
        L16:
            r3 = 0
        L17:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L32:
            int r8 = -r8
            int r9 = r9 + r8
            int r8 = r9 + (-13)
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0311mz.a(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 15
            int r7 = r7 + 4
            byte[] r0 = o.C0311mz.setIconTintList
            int r8 = r8 * 4
            int r8 = r8 + 16
            int r6 = r6 + 105
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L1a
            r6 = r7
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L36
        L1a:
            r3 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L1e:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L36:
            int r7 = r7 - r8
            int r7 = r7 + 2
            int r6 = r6 + 1
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0311mz.c(short, short, short, java.lang.Object[]):void");
    }

    private static void d(short s, byte b, byte b2, Object[] objArr) {
        int i = 45 - (s * 30);
        byte[] bArr = $$d;
        int i2 = 17 - (b * 14);
        int i3 = 115 - (b2 * 4);
        byte[] bArr2 = new byte[i];
        int i4 = -1;
        int i5 = i - 1;
        if (bArr == null) {
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i4 = -1;
            i3 = (i3 + (-i5)) - 13;
            i5 = i5;
            i2 = i2;
        }
        while (true) {
            int i6 = i2 + 1;
            int i7 = i4 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b3 = bArr[i6];
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i4 = i7;
            i3 = (i3 + (-b3)) - 13;
            i5 = i5;
            i2 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = 1 - r6
            int r7 = r7 + 108
            byte[] r0 = o.C0311mz.$$g
            int r8 = r8 + 4
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L18
            r7 = r6
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L34
        L18:
            r3 = 0
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r0[r8]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L34:
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0311mz.e(int, short, byte, java.lang.Object[]):void");
    }

    static void setY() {
        MenuHostHelper$$ExternalSyntheticLambda1 = new char[]{41040, 41155, 41170, 41183, 41176, 41189, 41173, 41131, 41147, 41178, 41149, 41138, 41173, 41183, 41179, 41168, 41170, 41172, 41173, 41172, 41170, 41182, 41071, 41172, 41164, 41164, 41171, 41179, 41190, 41183, 41169, 41183, 41170, 41182, 41180, 41177, 41191, 41015, 41056, 41070, 41068, 41079, 41067, 41057, 41038, 41024, 41071, 41079, 41032, 41008, 41045, 41068, 41065, 41064, 41064, 41065, 41073, 41057, 41049, 41066, 41068, 41060, 41061, 41050, 41149, 41151, 41149, 41137, 41129, 41141, 41137, 41149, 41147, 41123, 41121, 41146, 41138, 41136, 41145, 41144, 41151};
    }

    private C0311mz() {
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0276lp interfaceC0276lp) {
        pN.setY(interfaceC0276lp, "");
        MenuHostHelper$$ExternalSyntheticLambda0 = interfaceC0276lp;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x047a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x047b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.InterfaceC0276lp setX() {
        /*
            Method dump skipped, instructions count: 1213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0311mz.setX():o.lp");
    }

    public static ArrayList<String> MenuHostHelper$$ExternalSyntheticLambda1(Context context) {
        pN.setY(context, "");
        StringBuilder sb = new StringBuilder("📰   ");
        sb.append(context.getString(R.string.res_0x7f14003b));
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder("⚖️   ");
        sb2.append(context.getString(R.string.res_0x7f1400a7));
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder("🏈   ");
        sb3.append(context.getString(R.string.res_0x7f1400b4));
        String obj3 = sb3.toString();
        StringBuilder sb4 = new StringBuilder("\u200e\u200d💼   ");
        sb4.append(context.getString(R.string.res_0x7f140026));
        String obj4 = sb4.toString();
        StringBuilder sb5 = new StringBuilder("✈");
        sb5.append(context.getString(R.string.res_0x7f1400b7));
        String obj5 = sb5.toString();
        StringBuilder sb6 = new StringBuilder("🤖   ");
        sb6.append(context.getString(R.string.res_0x7f1400b6));
        String obj6 = sb6.toString();
        StringBuilder sb7 = new StringBuilder("👨\u200d⚕️   ");
        sb7.append(context.getString(R.string.res_0x7f140042));
        String obj7 = sb7.toString();
        StringBuilder sb8 = new StringBuilder("🍔   ");
        sb8.append(context.getString(R.string.res_0x7f140039));
        String obj8 = sb8.toString();
        StringBuilder sb9 = new StringBuilder("🔬   ");
        sb9.append(context.getString(R.string.res_0x7f1400ad));
        String obj9 = sb9.toString();
        StringBuilder sb10 = new StringBuilder("🎡   ");
        sb10.append(context.getString(R.string.res_0x7f140031));
        return C0348oi.MenuHostHelper$$ExternalSyntheticLambda1(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, sb10.toString());
    }

    private static void b(int[] iArr, byte[] bArr, boolean z, Object[] objArr) {
        int i;
        char[] cArr;
        jx jxVar = new jx();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = MenuHostHelper$$ExternalSyntheticLambda1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i2] = Integer.valueOf(cArr2[i7]);
                    Object obj = jC.setTextScaleX.get(-2065108825);
                    if (obj != null) {
                        cArr = cArr2;
                    } else {
                        byte b = (byte) i2;
                        byte b2 = b;
                        cArr = cArr2;
                        Object[] objArr3 = new Object[1];
                        e(b, b2, (byte) (b2 - 1), objArr3);
                        obj = ((Class) jC.setY(40 - TextUtils.indexOf("", "", i2), (char) (35091 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6)).getMethod((String) objArr3[0], Integer.TYPE);
                        jC.setTextScaleX.put(-2065108825, obj);
                    }
                    cArr3[i7] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    i7++;
                    cArr2 = cArr;
                    i2 = 0;
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
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            char[] cArr5 = new char[i4];
            jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
            char c = 0;
            while (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 < i4) {
                if (bArr[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] == 1) {
                    int i8 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0]), Integer.valueOf(c)};
                        Object obj2 = jC.setTextScaleX.get(1237805447);
                        if (obj2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 + 1);
                            Object[] objArr5 = new Object[1];
                            e(b3, b4, (byte) (-b4), objArr5);
                            obj2 = ((Class) jC.setY(View.resolveSizeAndState(0, 0, 0) + 273, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 4 - TextUtils.getOffsetAfter("", 0))).getMethod((String) objArr5[0], Integer.TYPE, Integer.TYPE);
                            jC.setTextScaleX.put(1237805447, obj2);
                        }
                        cArr5[i8] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i9 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0;
                    try {
                        Object[] objArr6 = {Integer.valueOf(cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0]), Integer.valueOf(c)};
                        Object obj3 = jC.setTextScaleX.get(997913035);
                        if (obj3 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 + 2);
                            Object[] objArr7 = new Object[1];
                            e(b5, b6, (byte) (b6 - 3), objArr7);
                            obj3 = ((Class) jC.setY(268 - TextUtils.lastIndexOf("", '0', 0, 0), (char) TextUtils.getOffsetAfter("", 0), View.MeasureSpec.getMode(0) + 4)).getMethod((String) objArr7[0], Integer.TYPE, Integer.TYPE);
                            jC.setTextScaleX.put(997913035, obj3);
                        }
                        cArr5[i9] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                c = cArr5[jxVar.MenuHostHelper$$ExternalSyntheticLambda0];
                try {
                    Object[] objArr8 = {jxVar, jxVar};
                    Object obj4 = jC.setTextScaleX.get(1233791110);
                    if (obj4 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 3);
                        Object[] objArr9 = new Object[1];
                        e(b7, b8, (byte) (b8 - 4), objArr9);
                        obj4 = ((Class) jC.setY((Process.myTid() >> 22) + 236, (char) TextUtils.getOffsetAfter("", 0), 4 - TextUtils.getOffsetAfter("", 0))).getMethod((String) objArr9[0], Object.class, Object.class);
                        jC.setTextScaleX.put(1233791110, obj4);
                    }
                    ((Method) obj4).invoke(null, objArr8);
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            i = 0;
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i10 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i10, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i10);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i4];
            while (true) {
                jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = i;
                if (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 >= i4) {
                    break;
                }
                cArr7[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr4[(i4 - jxVar.MenuHostHelper$$ExternalSyntheticLambda0) - 1];
                i = jxVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
            }
            cArr4 = cArr7;
        }
        if (i5 > 0) {
            int i11 = 0;
            while (true) {
                jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = i11;
                if (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 >= i4) {
                    break;
                }
                cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] = (char) (cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] - iArr[2]);
                i11 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }
}