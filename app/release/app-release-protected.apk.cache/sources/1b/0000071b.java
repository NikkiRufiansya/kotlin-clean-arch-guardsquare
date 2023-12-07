package o;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.PointF;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class mZ extends ContentProvider {
    static Context setIconTintList;
    public static final byte[] $$g = {20, -68, -64, 70};
    public static final int $$h = 163;
    public static final byte[] $$d = {64, 34, -50, 73, -59, 70, -23, -8, 21, -21, -8, 21, -37, 32, 18, 5, -20, 27, 11, 12, -34, 35, 16, 7, -59, 63, 4, 21, -26, 36, -11, 19, 11, -1, -5, 25, -9, -7, -46, 23, -59, 71, 7, -8, 21, -22, -59, 68, -35, 30, 15, 13, -39, 45, 10, 7, -38, 35, 13, 10, -5, 19, -72, 6, 39, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -43};
    public static final int $$e = 119;
    public static final byte[] $$a = {36, -18, 4, 125, 1, -28, 14, 1, -28, 30, -39, -25, -12, 13, -34, -18, -19, 27, -42, -23, -14, 1, -28, 15, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 35, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 36};
    public static final int $$b = 239;
    private static byte[] setUnboundedRipple = {44, -51, -23, -10, -17, 6, -18, -1, 2, 1, 50, -57, -16, -3, -10, 11, -13, -10, 66, -25, -48, -3, -10, 11, -23, 0, 1, -5, -13, -10, 7, -15, -9, 45, -29, -22, 7, 33, -48, 7, -5, 5, -25, 17, 47, -66, 7, -17, 3, 53, -41, -42, 2, -5, 11, -12};
    public static final int setY = 21;
    private static char MenuHostHelper$$ExternalSyntheticLambda1 = 63332;
    private static long MenuHostHelper$$ExternalSyntheticLambda0 = -6862065015268909492L;
    private static int setX = -1287463348;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = 62 - r8
            int r7 = 40 - r7
            int r6 = r6 * 38
            int r6 = r6 + 77
            byte[] r0 = o.mZ.$$a
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L18
            r6 = r7
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L34
        L18:
            r3 = 0
        L19:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L34:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-13)
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
        throw new UnsupportedOperationException("Method not decompiled: o.mZ.b(byte, byte, byte, java.lang.Object[]):void");
    }

    private static void c(int i, int i2, int i3, Object[] objArr) {
        byte[] bArr = setUnboundedRipple;
        int i4 = i2 + 97;
        int i5 = (i3 * 7) + 16;
        int i6 = 41 - i;
        byte[] bArr2 = new byte[i5];
        int i7 = i5 - 1;
        int i8 = 0;
        if (bArr == null) {
            i6++;
            i4 = (i4 - i6) - 4;
        }
        while (true) {
            bArr2[i8] = (byte) i4;
            if (i8 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8++;
            byte b = bArr[i6];
            i6++;
            i4 = (i4 - b) - 4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.mZ.$$d
            int r6 = 40 - r6
            int r7 = r7 * 2
            int r7 = r7 + 77
            int r8 = r8 + 4
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = 0
            r7 = r6
            goto L2c
        L15:
            r3 = 0
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            int r8 = r8 + 1
            r4 = r0[r8]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            int r6 = r6 + (-6)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.mZ.d(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 98
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r6 = r6 + 4
            byte[] r0 = o.mZ.$$g
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r8
            r3 = 0
            r8 = r7
            goto L2c
        L15:
            r3 = 0
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r7 = r7 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.mZ.e(short, byte, int, java.lang.Object[]):void");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0a62 A[Catch: Exception -> 0x0d0d, TRY_LEAVE, TryCatch #2 {Exception -> 0x0d0d, blocks: (B:142:0x0a28, B:144:0x0a62), top: B:210:0x0a28 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0b21  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0c7e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0b27 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0787 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x041a A[Catch: Exception -> 0x0d31, TRY_LEAVE, TryCatch #11 {Exception -> 0x0d31, blocks: (B:56:0x03e2, B:58:0x041a), top: B:228:0x03e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04dd A[Catch: all -> 0x0d1f, TryCatch #21 {all -> 0x0d1f, blocks: (B:64:0x04c3, B:68:0x052b, B:67:0x04dd), top: B:248:0x04c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x06b4 A[Catch: Exception -> 0x0d13, TRY_LEAVE, TryCatch #9 {Exception -> 0x0d13, blocks: (B:82:0x0673, B:84:0x06b4), top: B:224:0x0673 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0781  */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onCreate() {
        /*
            Method dump skipped, instructions count: 3720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.mZ.onCreate():boolean");
    }

    private static void a(char c, char[] cArr, char[] cArr2, char[] cArr3, int i, Object[] objArr) {
        jz jzVar = new jz();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i2 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        jzVar.setX = 0;
        while (jzVar.setX < length3) {
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i2] = jzVar;
                Object obj = jC.setTextScaleX.get(-608911091);
                if (obj == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    Object[] objArr3 = new Object[1];
                    e(b, b2, (byte) (b2 + 2), objArr3);
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i2] = Object.class;
                    obj = ((Class) jC.setY((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 247, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.MeasureSpec.makeMeasureSpec(i2, i2) + 4)).getMethod((String) objArr3[i2], clsArr);
                    jC.setTextScaleX.put(-608911091, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr4 = new Object[1];
                    objArr4[i2] = jzVar;
                    Object obj2 = jC.setTextScaleX.get(-12754601);
                    if (obj2 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        Object[] objArr5 = new Object[1];
                        e(b3, b4, (byte) (b4 + 1), objArr5);
                        Class<?>[] clsArr2 = new Class[1];
                        clsArr2[i2] = Object.class;
                        obj2 = ((Class) jC.setY(TextUtils.indexOf((CharSequence) "", '0') + 314, (char) View.resolveSizeAndState(i2, i2, i2), TextUtils.lastIndexOf("", '0') + 5)).getMethod((String) objArr5[i2], clsArr2);
                        jC.setTextScaleX.put(-12754601, obj2);
                    }
                    int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
                    int i3 = cArr4[jzVar.setX % 4] * 32718;
                    try {
                        Object[] objArr6 = new Object[3];
                        objArr6[2] = Integer.valueOf(cArr5[intValue]);
                        objArr6[1] = Integer.valueOf(i3);
                        objArr6[i2] = jzVar;
                        Object obj3 = jC.setTextScaleX.get(1073727806);
                        if (obj3 == null) {
                            byte b5 = (byte) (-1);
                            byte b6 = (byte) (b5 + 1);
                            Object[] objArr7 = new Object[1];
                            e(b5, b6, b6, objArr7);
                            obj3 = ((Class) jC.setY((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 325, (char) (61129 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 5 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))).getMethod((String) objArr7[0], Object.class, Integer.TYPE, Integer.TYPE);
                            jC.setTextScaleX.put(1073727806, obj3);
                        }
                        ((Method) obj3).invoke(null, objArr6);
                        try {
                            Object[] objArr8 = {Integer.valueOf(cArr4[intValue2] * 32718), Integer.valueOf(cArr5[intValue])};
                            Object obj4 = jC.setTextScaleX.get(1861722205);
                            if (obj4 == null) {
                                obj4 = ((Class) jC.setY(369 - View.getDefaultSize(0, 0), (char) View.combineMeasuredStates(0, 0), 4 - TextUtils.getCapsMode("", 0, 0))).getMethod("a", Integer.TYPE, Integer.TYPE);
                                jC.setTextScaleX.put(1861722205, obj4);
                            }
                            cArr5[intValue2] = ((Character) ((Method) obj4).invoke(null, objArr8)).charValue();
                            cArr4[intValue2] = jzVar.setIconTintList;
                            cArr6[jzVar.setX] = (char) ((((cArr4[intValue2] ^ cArr[jzVar.setX]) ^ (MenuHostHelper$$ExternalSyntheticLambda0 ^ (-6862065015268909492L))) ^ ((int) (setX ^ (-6862065015268909492L)))) ^ ((char) (MenuHostHelper$$ExternalSyntheticLambda1 ^ (-6862065015268909492L))));
                            jzVar.setX++;
                            i2 = 0;
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }
}