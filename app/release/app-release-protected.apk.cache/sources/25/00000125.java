package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import o.V;
import o.jC;
import o.jy;

/* loaded from: classes.dex */
public class FirebaseInitProvider extends ContentProvider {
    private static AtomicBoolean MenuHostHelper$$ExternalSyntheticLambda0;
    private static V MenuHostHelper$$ExternalSyntheticLambda1;
    private static int[] setIconTintList;
    public static final byte[] $$g = {105, 21, -43, 101};
    public static final int $$h = 61;
    public static final byte[] $$d = {20, -68, -64, 70, -61, 68, -25, -10, 19, -23, -10, 19, -39, 30, 16, 3, -22, 25, 9, 10, -36, 33, 14, 5, -61, 61, 2, 19, -28, 34, -13, 17, 9, -3, -7, 23, -11, -9, -48, 21, -61, 66, -37, 28, 13, 11, -41, 43, 8, 5, -40, 33, 11, 8, -7, 17, -74, 4, 37, 55, 0, -11, 17, 0, -9, 15, -21, 42, -7, 10, -8, 1, 19, -7, -2, -19, 25, 16, -7, 6, 1, -45, -61, 73, -10, 19, -28, 21, 23, 0, -44, 37, 11, -3, 6, -2, 23, -11, -61, 21};
    public static final int $$e = 97;
    public static final byte[] $$a = {90, -83, 93, -67, 1, -28, 14, 1, -28, 30, -39, -25, -12, 13, -34, -18, -19, 27, -42, -23, -14, 1, -28, 15, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 35, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 36};
    public static final int $$b = 167;
    private static byte[] setX = {18, 119, 36, -59, 17, -6, 18, 1, -2, -1, -50, 57, 16, 3, 10, -11, 13, 10, -66, 25, 48, 3, 10, -11, 23, 0, -1, 5, 13, 10, -7, 15, 9, -45, 29, 22, -7, -33, 48, -7, 5, -5, 25, -17, -47, 66, -7, 17, -3, -53, 41, 42, -2, 5, -11, 12};
    public static final int setY = 74;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.firebase.provider.FirebaseInitProvider.$$a
            int r6 = r6 + 4
            int r8 = 62 - r8
            int r7 = r7 * 38
            int r7 = 115 - r7
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L36
        L17:
            r3 = 0
        L18:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L36:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-13)
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.provider.FirebaseInitProvider.b(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 97
            byte[] r0 = com.google.firebase.provider.FirebaseInitProvider.setX
            int r8 = r8 * 7
            int r8 = 23 - r8
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            goto L2f
        L16:
            r3 = 0
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L2f:
            int r7 = r7 + r8
            int r7 = r7 + (-4)
            int r8 = r10 + 1
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.provider.FirebaseInitProvider.c(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 + 4
            int r6 = r6 * 2
            int r6 = r6 + 77
            byte[] r0 = com.google.firebase.provider.FirebaseInitProvider.$$d
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L31
        L18:
            r3 = 0
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L31:
            int r6 = r6 + r7
            int r7 = r8 + 1
            int r6 = r6 + (-4)
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.provider.FirebaseInitProvider.d(byte, int, short, java.lang.Object[]):void");
    }

    private static void e(int i, int i2, byte b, Object[] objArr) {
        byte[] bArr = $$g;
        int i3 = 1 - (i * 3);
        int i4 = (i2 * 2) + 70;
        int i5 = 3 - (b * 4);
        byte[] bArr2 = new byte[i3];
        int i6 = -1;
        int i7 = i3 - 1;
        if (bArr == null) {
            int i8 = i7 + i5;
            i5 = i5;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i6 = -1;
            i4 = i8;
            i7 = i7;
        }
        while (true) {
            int i9 = i6 + 1;
            bArr2[i9] = (byte) i4;
            if (i9 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i10 = i5 + 1;
            byte b2 = bArr[i10];
            i5 = i10;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i6 = i9;
            i4 = b2 + i4;
            i7 = i7;
        }
    }

    static void setIconTintList() {
        setIconTintList = new int[]{1289670574, -1065131738, -635503440, 1208367559, 2004689570, -1427916503, 1095890713, -541275177, -890077164, -992293457, -1337401279, -361514053, -2125310112, -1518827835, 581860928, 1807759542, 1891221117, 2058996392};
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    static {
        setIconTintList();
        MenuHostHelper$$ExternalSyntheticLambda1 = V.setX();
        MenuHostHelper$$ExternalSyntheticLambda0 = new AtomicBoolean(false);
    }

    public static V MenuHostHelper$$ExternalSyntheticLambda1() {
        return MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public static boolean setX() {
        return MenuHostHelper$$ExternalSyntheticLambda0.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0a00 A[Catch: Exception -> 0x0cbd, TRY_LEAVE, TryCatch #14 {Exception -> 0x0cbd, blocks: (B:141:0x09bc, B:143:0x0a00), top: B:240:0x09bc }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0c05  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0ca1 A[Catch: all -> 0x0cb6, TryCatch #16 {all -> 0x0cb6, blocks: (B:183:0x0c92, B:185:0x0ca1, B:186:0x0ca9), top: B:244:0x0c92 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0ca9 A[Catch: all -> 0x0cb6, TRY_LEAVE, TryCatch #16 {all -> 0x0cb6, blocks: (B:183:0x0c92, B:185:0x0ca1, B:186:0x0ca9), top: B:244:0x0c92 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0aa3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x071d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03d0 A[Catch: Exception -> 0x0ce1, TRY_LEAVE, TryCatch #23 {Exception -> 0x0ce1, blocks: (B:55:0x038d, B:57:0x03d0), top: B:257:0x038d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0491 A[Catch: all -> 0x0ccf, TryCatch #9 {all -> 0x0ccf, blocks: (B:63:0x0477, B:67:0x04e1, B:66:0x0491), top: B:230:0x0477 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0677 A[Catch: Exception -> 0x0cc3, TRY_LEAVE, TryCatch #22 {Exception -> 0x0cc3, blocks: (B:81:0x0633, B:83:0x0677), top: B:255:0x0633 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0877  */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onCreate() {
        /*
            Method dump skipped, instructions count: 3526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.provider.FirebaseInitProvider.onCreate():boolean");
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            if (!"com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
                super.attachInfo(context, providerInfo);
                return;
            }
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        throw new NullPointerException("FirebaseInitProvider ProviderInfo cannot be null.");
    }

    private static void a(int i, int[] iArr, Object[] objArr) {
        int[] iArr2;
        String str;
        jy jyVar = new jy();
        int i2 = 4;
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = setIconTintList;
        String str2 = "";
        long j = 0;
        int i3 = 1;
        int i4 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = new Object[i3];
                    objArr2[i4] = Integer.valueOf(iArr3[i5]);
                    Object obj = jC.setTextScaleX.get(-878021517);
                    if (obj == null) {
                        byte b = (byte) i4;
                        Object[] objArr3 = new Object[1];
                        e(b, (byte) (b | 26), b, objArr3);
                        obj = ((Class) jC.setY(TextUtils.getTrimmedLength("") + 240, (char) ((SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 59781), View.resolveSizeAndState(i4, i4, i4) + i2)).getMethod((String) objArr3[0], Integer.TYPE);
                        jC.setTextScaleX.put(-878021517, obj);
                    }
                    iArr4[i5] = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                    i5++;
                    i2 = 4;
                    j = 0;
                    i3 = 1;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = setIconTintList;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i6 = 0;
            while (i6 < length3) {
                try {
                    Object[] objArr4 = {Integer.valueOf(iArr6[i6])};
                    Object obj2 = jC.setTextScaleX.get(-878021517);
                    if (obj2 != null) {
                        iArr2 = iArr6;
                        str = str2;
                    } else {
                        byte b2 = (byte) 0;
                        iArr2 = iArr6;
                        str = str2;
                        Object[] objArr5 = new Object[1];
                        e(b2, (byte) (b2 | 26), b2, objArr5);
                        obj2 = ((Class) jC.setY(TextUtils.indexOf((CharSequence) str2, '0') + 241, (char) (59782 - ExpandableListView.getPackedPositionType(0L)), View.resolveSizeAndState(0, 0, 0) + 4)).getMethod((String) objArr5[0], Integer.TYPE);
                        jC.setTextScaleX.put(-878021517, obj2);
                    }
                    iArr7[i6] = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
                    i6++;
                    iArr6 = iArr2;
                    str2 = str;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr6 = iArr7;
        }
        char c = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        jyVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        while (jyVar.MenuHostHelper$$ExternalSyntheticLambda0 < iArr.length) {
            cArr[c] = (char) (iArr[jyVar.MenuHostHelper$$ExternalSyntheticLambda0] >> 16);
            cArr[1] = (char) iArr[jyVar.MenuHostHelper$$ExternalSyntheticLambda0];
            cArr[2] = (char) (iArr[jyVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1] >> 16);
            cArr[3] = (char) iArr[jyVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1];
            jyVar.MenuHostHelper$$ExternalSyntheticLambda1 = (cArr[0] << 16) + cArr[1];
            jyVar.setY = (cArr[2] << 16) + cArr[3];
            jy.setY(iArr5);
            int i7 = 0;
            for (int i8 = 16; i7 < i8; i8 = 16) {
                jyVar.MenuHostHelper$$ExternalSyntheticLambda1 ^= iArr5[i7];
                try {
                    Object[] objArr6 = {jyVar, Integer.valueOf(jy.setIconTintList(jyVar.MenuHostHelper$$ExternalSyntheticLambda1)), jyVar, jyVar};
                    Object obj3 = jC.setTextScaleX.get(-1199281727);
                    if (obj3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        Object[] objArr7 = new Object[1];
                        e(b3, b4, (byte) (b4 - 1), objArr7);
                        obj3 = ((Class) jC.setY((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 324, (char) ((ViewConfiguration.getTapTimeout() >> i8) + 61129), 4 - View.MeasureSpec.getMode(0))).getMethod((String) objArr7[0], Object.class, Integer.TYPE, Object.class, Object.class);
                        jC.setTextScaleX.put(-1199281727, obj3);
                    }
                    int intValue = ((Integer) ((Method) obj3).invoke(null, objArr6)).intValue();
                    jyVar.MenuHostHelper$$ExternalSyntheticLambda1 = jyVar.setY;
                    jyVar.setY = intValue;
                    i7++;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i9 = jyVar.MenuHostHelper$$ExternalSyntheticLambda1;
            jyVar.MenuHostHelper$$ExternalSyntheticLambda1 = jyVar.setY;
            jyVar.setY = i9;
            jyVar.setY ^= iArr5[16];
            jyVar.MenuHostHelper$$ExternalSyntheticLambda1 ^= iArr5[17];
            int i10 = jyVar.MenuHostHelper$$ExternalSyntheticLambda1;
            int i11 = jyVar.setY;
            cArr[0] = (char) (jyVar.MenuHostHelper$$ExternalSyntheticLambda1 >>> 16);
            cArr[1] = (char) jyVar.MenuHostHelper$$ExternalSyntheticLambda1;
            cArr[2] = (char) (jyVar.setY >>> 16);
            cArr[3] = (char) jyVar.setY;
            jy.setY(iArr5);
            cArr2[jyVar.MenuHostHelper$$ExternalSyntheticLambda0 * 2] = cArr[0];
            cArr2[(jyVar.MenuHostHelper$$ExternalSyntheticLambda0 * 2) + 1] = cArr[1];
            cArr2[(jyVar.MenuHostHelper$$ExternalSyntheticLambda0 * 2) + 2] = cArr[2];
            cArr2[(jyVar.MenuHostHelper$$ExternalSyntheticLambda0 * 2) + 3] = cArr[3];
            try {
                Object[] objArr8 = {jyVar, jyVar};
                Object obj4 = jC.setTextScaleX.get(1491664993);
                if (obj4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    Object[] objArr9 = new Object[1];
                    e(b5, b6, b6, objArr9);
                    obj4 = ((Class) jC.setY(262 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (17133 - View.resolveSize(0, 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4)).getMethod((String) objArr9[0], Object.class, Object.class);
                    jC.setTextScaleX.put(1491664993, obj4);
                }
                ((Method) obj4).invoke(null, objArr8);
                c = 0;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}