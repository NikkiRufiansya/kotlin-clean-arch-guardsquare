package o;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.IBinder;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* renamed from: o.ar  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ServiceC0030ar extends Service {
    public static final byte[] $$g = {64, 34, -50, 73};
    public static final int $$h = 164;
    public static final byte[] $$d = {8, 17, -121, -18, 65, -64, 29, 65, -57, 35, 32, -41, -24, -9, -7, 45, -39, -4, -1, 44, -29, -7, -4, 11, -13, 78, 0, -33, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 48, 14, -15, 27, 14, -15, 43, -26, -12, 1, 26, -21, -5, -6, 40, -29, -10, -1, 14, -15, 28, 65, -62, 41, 65, -69, 14, -15, 32, -17, -19, 4, 48, -33, -7, 7, -2, 6, -19, 15, 65, -17, -24, -9, -7, 45, -39, -4, -1, 44, -29, -7, -4, 11, -13, 78, 0, -33, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 49, 65, -72, 53, 29, -79, 14, -15, 43, -26, -12, 1, 26, -21, -5, -6, 40, -29, -10, -1, 65, -72, 4, 78, -41, -24, -9, -7, 45, -39, -4, -1, 44, -29, -7, -4, 11, -13, 78, 0, -33, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 49, 65, -51, 32, 29, -41, -24, -9, -7, 45, -39, -4, -1, 44, -29, -7, -4, 11, -13, 78, 0, -33, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 49};
    public static final int $$e = 206;
    public static final byte[] $$a = {107, 3, 14, 112, -1, 28, -14, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, -1, 28, -15, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -36};
    public static final int $$b = 150;
    private static byte[] MenuHostHelper$$ExternalSyntheticLambda1 = {116, -27, -60, 115, 17, -6, 18, 1, -2, -1, -50, 57, 16, 3, 10, -11, 13, 10, -66, 25, 48, 3, 10, -11, 23, 0, -1, 5, 13, 10, -7, 15, 9, -45, 29, 22, -7, -33, 48, -7, 5, -5, 25, -17, -47, 66, -7, 17, -3, -53, 41, 42, -2, 5, -11, 12};
    public static final int setY = C0547vq.setY;
    private static char MenuHostHelper$$ExternalSyntheticLambda0 = 63084;
    private static char[] setIconTintList = {50064, 50067, 50077, 50070, 50053, 50075, 50048, 50080, 50076, 50096, 50049, 50141, 50074, 50071, 50087, 50066, 50098, 50058, 50078, 50051, 50079, 50054, 50055, 50081, 50072};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 38
            int r8 = r8 + 77
            int r6 = 40 - r6
            int r7 = 62 - r7
            byte[] r0 = o.ServiceC0030ar.$$a
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L36
        L19:
            r3 = 0
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            int r7 = r7 + 1
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
            int r9 = r9 + r6
            int r6 = r9 + (-13)
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ServiceC0030ar.a(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 7
            int r9 = 23 - r9
            int r8 = 41 - r8
            byte[] r0 = o.ServiceC0030ar.MenuHostHelper$$ExternalSyntheticLambda1
            int r7 = r7 + 97
            byte[] r1 = new byte[r9]
            int r9 = r9 + (-1)
            r2 = 0
            if (r0 != 0) goto L18
            r7 = r8
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L37
        L18:
            r3 = 0
        L19:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r9) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L37:
            int r8 = r8 + 1
            int r7 = r7 + r9
            int r7 = r7 + (-4)
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ServiceC0030ar.c(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = 193 - r9
            byte[] r0 = o.ServiceC0030ar.$$d
            int r8 = r8 * 2
            int r8 = r8 + 77
            int r7 = r7 + 4
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L18
            r8 = r7
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L36
        L18:
            r3 = 0
        L19:
            int r9 = r9 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r9]
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L36:
            int r9 = -r9
            int r7 = r7 + r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ServiceC0030ar.d(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 2
            int r8 = 1 - r8
            byte[] r0 = o.ServiceC0030ar.$$g
            int r7 = r7 + 103
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L18
            r7 = r8
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L36
        L18:
            r3 = 0
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r9 = r9 + 1
            if (r3 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r9]
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L36:
            int r9 = -r9
            int r8 = r8 + r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ServiceC0030ar.e(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04ca A[Catch: Exception -> 0x08a9, TRY_LEAVE, TryCatch #8 {Exception -> 0x08a9, blocks: (B:55:0x048e, B:57:0x04ca), top: B:113:0x048e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0648 A[Catch: all -> 0x0897, TryCatch #6 {all -> 0x0897, blocks: (B:62:0x062a, B:66:0x069c, B:65:0x0648), top: B:109:0x062a }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0890 A[ORIG_RETURN, RETURN] */
    @Override // android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r31) {
        /*
            Method dump skipped, instructions count: 2229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ServiceC0030ar.attachBaseContext(android.content.Context):void");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override // android.content.ContextWrapper
    public Context getBaseContext() {
        return super.getBaseContext();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return super.getResources();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0aad A[Catch: Exception -> 0x0d95, TRY_LEAVE, TryCatch #6 {Exception -> 0x0d95, blocks: (B:146:0x0a6b, B:148:0x0aad), top: B:224:0x0a6b }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0b10  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0b9f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0d0c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x07c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0ba5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x043d A[Catch: Exception -> 0x0db9, TRY_LEAVE, TryCatch #16 {Exception -> 0x0db9, blocks: (B:58:0x0401, B:60:0x043d), top: B:244:0x0401 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0505 A[Catch: all -> 0x0da7, TryCatch #3 {all -> 0x0da7, blocks: (B:66:0x04eb, B:70:0x0559, B:69:0x0505), top: B:218:0x04eb }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x06e1 A[Catch: Exception -> 0x0d9b, TRY_LEAVE, TryCatch #13 {Exception -> 0x0d9b, blocks: (B:84:0x069f, B:86:0x06e1), top: B:238:0x069f }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x07bf  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate() {
        /*
            Method dump skipped, instructions count: 3728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ServiceC0030ar.onCreate():void");
    }

    private static void b(char[] cArr, int i, byte b, Object[] objArr) {
        int i2;
        jr jrVar = new jr();
        char[] cArr2 = setIconTintList;
        int i3 = 2;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object obj = jC.setTextScaleX.get(1058594953);
                    if (obj == null) {
                        byte b2 = (byte) i3;
                        byte b3 = (byte) (b2 - 2);
                        Object[] objArr3 = new Object[1];
                        e(b2, b3, (byte) (b3 - 1), objArr3);
                        obj = ((Class) jC.setY(Color.green(0) + 166, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), Process.getGidForName("") + 21)).getMethod((String) objArr3[0], Integer.TYPE);
                        jC.setTextScaleX.put(1058594953, obj);
                    }
                    cArr3[i4] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    i4++;
                    i3 = 2;
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
            Object[] objArr4 = {Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda0)};
            Object obj2 = jC.setTextScaleX.get(1058594953);
            char c = '\b';
            if (obj2 == null) {
                byte b4 = (byte) 2;
                byte b5 = (byte) (b4 - 2);
                Object[] objArr5 = new Object[1];
                e(b4, b5, (byte) (b5 - 1), objArr5);
                obj2 = ((Class) jC.setY(166 - (ViewConfiguration.getScrollBarSize() >> 8), (char) TextUtils.getCapsMode("", 0, 0), ImageFormat.getBitsPerPixel(0) + 21)).getMethod((String) objArr5[0], Integer.TYPE);
                jC.setTextScaleX.put(1058594953, obj2);
            }
            char charValue = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                jrVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
                while (jrVar.MenuHostHelper$$ExternalSyntheticLambda0 < i2) {
                    jrVar.MenuHostHelper$$ExternalSyntheticLambda1 = cArr[jrVar.MenuHostHelper$$ExternalSyntheticLambda0];
                    jrVar.setX = cArr[jrVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1];
                    if (jrVar.MenuHostHelper$$ExternalSyntheticLambda1 == jrVar.setX) {
                        cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0] = (char) (jrVar.MenuHostHelper$$ExternalSyntheticLambda1 - b);
                        cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1] = (char) (jrVar.setX - b);
                    } else {
                        try {
                            Object[] objArr6 = new Object[13];
                            objArr6[12] = jrVar;
                            objArr6[11] = Integer.valueOf(charValue);
                            objArr6[10] = jrVar;
                            objArr6[9] = jrVar;
                            objArr6[c] = Integer.valueOf(charValue);
                            objArr6[7] = jrVar;
                            objArr6[6] = jrVar;
                            objArr6[5] = Integer.valueOf(charValue);
                            objArr6[4] = jrVar;
                            objArr6[3] = jrVar;
                            objArr6[2] = Integer.valueOf(charValue);
                            objArr6[1] = jrVar;
                            objArr6[0] = jrVar;
                            Object obj3 = jC.setTextScaleX.get(23685139);
                            if (obj3 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                Object[] objArr7 = new Object[1];
                                e(b6, b7, (byte) (b7 - 1), objArr7);
                                obj3 = ((Class) jC.setY(252 - View.MeasureSpec.getMode(0), (char) (TextUtils.lastIndexOf("", '0', 0) + 13778), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 9)).getMethod((String) objArr7[0], Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class);
                                jC.setTextScaleX.put(23685139, obj3);
                            }
                            if (((Integer) ((Method) obj3).invoke(null, objArr6)).intValue() == jrVar.setLayoutAnimation) {
                                try {
                                    Object[] objArr8 = {jrVar, jrVar, Integer.valueOf(charValue), Integer.valueOf(charValue), jrVar, jrVar, Integer.valueOf(charValue), Integer.valueOf(charValue), jrVar, Integer.valueOf(charValue), jrVar};
                                    Object obj4 = jC.setTextScaleX.get(-1549003164);
                                    if (obj4 == null) {
                                        byte b8 = (byte) 3;
                                        byte b9 = (byte) (b8 - 3);
                                        Object[] objArr9 = new Object[1];
                                        e(b8, b9, (byte) (b9 - 1), objArr9);
                                        obj4 = ((Class) jC.setY(236 - View.resolveSizeAndState(0, 0, 0), (char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3)).getMethod((String) objArr9[0], Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class);
                                        jC.setTextScaleX.put(-1549003164, obj4);
                                    }
                                    int intValue = ((Integer) ((Method) obj4).invoke(null, objArr8)).intValue();
                                    int i5 = (jrVar.setY * charValue) + jrVar.setLayoutAnimation;
                                    cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr2[intValue];
                                    cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1] = cArr2[i5];
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else if (jrVar.setIconTintList == jrVar.setY) {
                                jrVar.setOnLongClickListener = ((jrVar.setOnLongClickListener + charValue) - 1) % charValue;
                                jrVar.setLayoutAnimation = ((jrVar.setLayoutAnimation + charValue) - 1) % charValue;
                                int i6 = (jrVar.setIconTintList * charValue) + jrVar.setOnLongClickListener;
                                int i7 = (jrVar.setY * charValue) + jrVar.setLayoutAnimation;
                                cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr2[i6];
                                cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1] = cArr2[i7];
                            } else {
                                int i8 = (jrVar.setIconTintList * charValue) + jrVar.setLayoutAnimation;
                                int i9 = (jrVar.setY * charValue) + jrVar.setOnLongClickListener;
                                cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr2[i8];
                                cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1] = cArr2[i9];
                            }
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    jrVar.MenuHostHelper$$ExternalSyntheticLambda0 += 2;
                    c = '\b';
                }
            }
            for (int i10 = 0; i10 < i; i10++) {
                cArr4[i10] = (char) (cArr4[i10] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }
}