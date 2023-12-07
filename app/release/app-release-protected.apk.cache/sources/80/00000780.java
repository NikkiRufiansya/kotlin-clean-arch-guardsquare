package o;

import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* renamed from: o.nn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326nn extends C0332nt {
    public static final byte[] $$g = {116, 58, -28, -63};
    public static final int $$h = 223;
    public static final byte[] $$d = {114, -124, 55, 72, -13, 16, -42, 27, 13, 0, -25, 22, 6, 7, -39, 30, 11, 2, -64, 63, -40};
    public static final int $$e = 62;
    public static final byte[] $$a = {97, -108, 86, -98, -1, 28, -15, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35};
    public static final int $$b = 160;
    private static byte[] MenuHostHelper$$ExternalSyntheticLambda1 = {112, 117, 112, -122, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
    public static final int setX = 64;
    private static int MenuHostHelper$$ExternalSyntheticLambda0 = 851212202;

    private static void a(byte b, int i, int i2, Object[] objArr) {
        int i3 = 7 - (b * 3);
        int i4 = 40 - (i * 36);
        byte[] bArr = $$a;
        int i5 = (i2 * 38) + 77;
        byte[] bArr2 = new byte[i4];
        int i6 = -1;
        int i7 = i4 - 1;
        if (bArr == null) {
            i5 = (i7 + i3) - 13;
            i3++;
            i7 = i7;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i6 = -1;
        }
        while (true) {
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i5;
            if (i8 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5 = (i5 + bArr[i3]) - 13;
            i3++;
            i7 = i7;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i6 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.C0326nn.MenuHostHelper$$ExternalSyntheticLambda1
            int r6 = r6 * 4
            int r6 = r6 + 16
            int r8 = r8 + 105
            int r7 = r7 * 15
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L1b
            r8 = r7
            r3 = r1
            r4 = 0
            r7 = r6
            r1 = r0
            r0 = r9
            r9 = r8
            goto L36
        L1b:
            r3 = 0
        L1c:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L36:
            int r8 = r8 + 1
            int r9 = r9 + r6
            int r6 = r9 + 2
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0326nn.c(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = o.C0326nn.$$d
            int r8 = r8 * 4
            int r8 = 115 - r8
            int r7 = r7 * 14
            int r7 = r7 + 4
            int r9 = r9 * 11
            int r9 = 15 - r9
            byte[] r1 = new byte[r9]
            int r9 = r9 + (-1)
            r2 = 0
            if (r0 != 0) goto L1c
            r8 = r7
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L37
        L1c:
            r3 = 0
        L1d:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r9) goto L2c
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2c:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L37:
            int r7 = r7 + r9
            int r7 = r7 + (-1)
            int r8 = r8 + 1
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0326nn.d(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = o.C0326nn.$$g
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r9 = r9 * 2
            int r9 = r9 + 102
            int r8 = r8 * 2
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = 0
            r9 = r8
            goto L2e
        L17:
            r3 = 0
        L18:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r7]
            r6 = r9
            r9 = r8
            r8 = r6
        L2e:
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0326nn.e(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0326nn(C0337ny c0337ny) {
        super(c0337ny);
        pN.setX(c0337ny, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0402  */
    @Override // o.C0332nt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void setY(android.graphics.Canvas r39) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0326nn.setY(android.graphics.Canvas):void");
    }

    private static void b(int i, char[] cArr, int i2, boolean z, int i3, Object[] objArr) {
        ju juVar = new ju();
        char[] cArr2 = new char[i];
        juVar.setX = 0;
        while (juVar.setX < i) {
            juVar.MenuHostHelper$$ExternalSyntheticLambda0 = cArr[juVar.setX];
            cArr2[juVar.setX] = (char) (i2 + juVar.MenuHostHelper$$ExternalSyntheticLambda0);
            int i4 = juVar.setX;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i4]), Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda0)};
                Object obj = jC.setTextScaleX.get(-1875803360);
                if (obj == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    Object[] objArr3 = new Object[1];
                    e(b, b2, (byte) (b2 + 1), objArr3);
                    obj = ((Class) jC.setY(((Process.getThreadPriority(0) + 20) >> 6) + 341, (char) View.MeasureSpec.getMode(0), View.MeasureSpec.getSize(0) + 4)).getMethod((String) objArr3[0], Integer.TYPE, Integer.TYPE);
                    jC.setTextScaleX.put(-1875803360, obj);
                }
                cArr2[i4] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr4 = {juVar, juVar};
                    Object obj2 = jC.setTextScaleX.get(-257319855);
                    if (obj2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        Object[] objArr5 = new Object[1];
                        e(b3, b4, b4, objArr5);
                        obj2 = ((Class) jC.setY((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 206, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 65233), 4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod((String) objArr5[0], Object.class, Object.class);
                        jC.setTextScaleX.put(-257319855, obj2);
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
        if (i3 > 0) {
            juVar.setIconTintList = i3;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - juVar.setIconTintList, juVar.setIconTintList);
            System.arraycopy(cArr3, juVar.setIconTintList, cArr2, 0, i - juVar.setIconTintList);
        }
        if (z) {
            char[] cArr4 = new char[i];
            juVar.setX = 0;
            while (juVar.setX < i) {
                cArr4[juVar.setX] = cArr2[(i - juVar.setX) - 1];
                try {
                    Object[] objArr6 = {juVar, juVar};
                    Object obj3 = jC.setTextScaleX.get(-257319855);
                    if (obj3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        Object[] objArr7 = new Object[1];
                        e(b5, b6, b6, objArr7);
                        obj3 = ((Class) jC.setY(206 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (65233 - View.getDefaultSize(0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 5)).getMethod((String) objArr7[0], Object.class, Object.class);
                        jC.setTextScaleX.put(-257319855, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr6);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}