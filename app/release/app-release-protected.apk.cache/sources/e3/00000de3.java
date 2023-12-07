package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public final class setOnClickListener {
    private final Context MenuHostHelper$$ExternalSyntheticLambda0;
    private final String MenuHostHelper$$ExternalSyntheticLambda1;
    private final setCloseIconTint setX;
    public static final byte[] $$g = {83, 16, 71, 115};
    public static final int $$h = 184;
    public static final byte[] $$d = {94, 25, -44, 73, -11, 18, -24, -62, 75, -1, -75, 44, 27, 12, 10, -42, 42, 7, 4, -41, 32, 10, 7, -8, 16, -75, 3, 36, 54, -1, -12, 16, -1, -10, 14, -22, 41, -8, 9, -9, 0, 18, -8, -3, -20, 24, 15, -8, 5, 0, -46};
    public static final int $$e = 66;
    public static final byte[] $$a = {41, -91, 83, 107, -1, 28, -14, -1, 28, -15, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -36};
    public static final int $$b = 180;
    private static byte[] setLayoutAnimation = {3, -83, -69, 19, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
    public static final int setIconTintList = 55;
    private static char setNavigationOnClickListener = 63084;
    private static char[] setY = {63085, 50080, 50071, 50076, 63083, 50066, 50051, 50072, 63082, 50096, 50078, 50070, 63087, 50074, 50055, 63080, 50141, 50079, 50077, 50058, 63084, 50049, 50064, 50048, 50081};

    /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002b -> B:23:0x0033). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = o.setOnClickListener.$$a
            int r9 = r9 * 36
            int r9 = 40 - r9
            int r7 = r7 * 3
            int r7 = 9 - r7
            int r8 = r8 * 38
            int r8 = 115 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L33
        L19:
            r3 = 0
        L1a:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r9) goto L2b
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2b:
            r3 = r0[r7]
            r6 = r10
            r10 = r9
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L33:
            int r8 = r8 + r9
            int r8 = r8 + (-13)
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnClickListener.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:23:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 105
            int r9 = r9 * 2
            int r9 = 16 - r9
            int r8 = r8 * 15
            int r8 = 19 - r8
            byte[] r0 = o.setOnClickListener.setLayoutAnimation
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L18
            r7 = r8
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L30
        L18:
            r3 = 0
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
            r6 = r10
            r10 = r9
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L30:
            int r8 = r8 + 1
            int r7 = r7 + r9
            int r7 = r7 + 2
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnClickListener.c(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002d -> B:23:0x0035). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 4
            byte[] r0 = o.setOnClickListener.$$d
            int r7 = r7 * 41
            int r7 = 45 - r7
            int r8 = r8 * 4
            int r8 = 115 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L1a
            r8 = r7
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L35
        L1a:
            r3 = 0
            r6 = r8
            r8 = r7
            r7 = r6
        L1e:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L2d
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2d:
            r3 = r0[r9]
            r6 = r10
            r10 = r9
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L35:
            int r7 = r7 + r9
            int r9 = r10 + 1
            int r7 = r7 + (-3)
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnClickListener.d(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:23:0x002e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.setOnClickListener.$$g
            int r8 = r8 + 103
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r8 = r7
            r4 = r8
            r3 = 0
            r7 = r6
            goto L2e
        L16:
            r3 = 0
        L17:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L2e:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnClickListener.e(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public setOnClickListener(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = applicationContext;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        if (str2 == null) {
            this.setX = null;
        } else {
            this.setX = new setCloseIconTint(applicationContext);
        }
    }

    private setPersistentDrawingCache<setBoxStrokeErrorColor> setX() {
        try {
            return MenuHostHelper$$ExternalSyntheticLambda1();
        } catch (IOException e) {
            return new setPersistentDrawingCache<>(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x007e A[Catch: all -> 0x01a2, Exception -> 0x01a4, Merged into TryCatch #0 {all -> 0x01a2, Exception -> 0x01a4, blocks: (B:64:0x005a, B:66:0x0063, B:69:0x006d, B:72:0x0075, B:74:0x007e, B:76:0x0089, B:82:0x00e4, B:84:0x00e9, B:86:0x00ed, B:88:0x012b, B:89:0x0151, B:93:0x015e, B:77:0x0097, B:78:0x00b2, B:80:0x00bd, B:81:0x00c6, B:96:0x016c, B:102:0x01a5), top: B:107:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b2 A[Catch: all -> 0x01a2, Exception -> 0x01a4, Merged into TryCatch #0 {all -> 0x01a2, Exception -> 0x01a4, blocks: (B:64:0x005a, B:66:0x0063, B:69:0x006d, B:72:0x0075, B:74:0x007e, B:76:0x0089, B:82:0x00e4, B:84:0x00e9, B:86:0x00ed, B:88:0x012b, B:89:0x0151, B:93:0x015e, B:77:0x0097, B:78:0x00b2, B:80:0x00bd, B:81:0x00c6, B:96:0x016c, B:102:0x01a5), top: B:107:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012b A[Catch: all -> 0x01a2, Exception -> 0x01a4, Merged into TryCatch #0 {all -> 0x01a2, Exception -> 0x01a4, blocks: (B:64:0x005a, B:66:0x0063, B:69:0x006d, B:72:0x0075, B:74:0x007e, B:76:0x0089, B:82:0x00e4, B:84:0x00e9, B:86:0x00ed, B:88:0x012b, B:89:0x0151, B:93:0x015e, B:77:0x0097, B:78:0x00b2, B:80:0x00bd, B:81:0x00c6, B:96:0x016c, B:102:0x01a5), top: B:107:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private o.setPersistentDrawingCache<o.setBoxStrokeErrorColor> MenuHostHelper$$ExternalSyntheticLambda1() {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1():o.setPersistentDrawingCache");
    }

    private static String MenuHostHelper$$ExternalSyntheticLambda0(HttpURLConnection httpURLConnection) {
        httpURLConnection.getResponseCode();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                        sb.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (Exception e) {
                throw e;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x040e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.setPersistentDrawingCache<o.setBoxStrokeErrorColor> setY() {
        /*
            Method dump skipped, instructions count: 1159
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnClickListener.setY():o.setPersistentDrawingCache");
    }

    private static void b(char[] cArr, int i, byte b, Object[] objArr) {
        int i2;
        Object obj;
        jr jrVar = new jr();
        char[] cArr2 = setY;
        long j = 0;
        Object obj2 = null;
        int i3 = 8;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object obj3 = jC.setTextScaleX.get(1058594953);
                    if (obj3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr3 = new Object[1];
                        e(b2, b3, (byte) (b3 + 2), objArr3);
                        obj3 = ((Class) jC.setY((ViewConfiguration.getTouchSlop() >> i3) + 166, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 21 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)))).getMethod((String) objArr3[0], Integer.TYPE);
                        jC.setTextScaleX.put(1058594953, obj3);
                    }
                    cArr3[i4] = ((Character) ((Method) obj3).invoke(null, objArr2)).charValue();
                    i4++;
                    j = 0;
                    i3 = 8;
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
            Object[] objArr4 = {Integer.valueOf(setNavigationOnClickListener)};
            Object obj4 = jC.setTextScaleX.get(1058594953);
            if (obj4 == null) {
                byte b4 = (byte) 0;
                byte b5 = b4;
                Object[] objArr5 = new Object[1];
                e(b4, b5, (byte) (b5 + 2), objArr5);
                obj4 = ((Class) jC.setY((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 165, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 19)).getMethod((String) objArr5[0], Integer.TYPE);
                jC.setTextScaleX.put(1058594953, obj4);
            }
            char charValue = ((Character) ((Method) obj4).invoke(null, objArr4)).charValue();
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
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr6 = {jrVar, jrVar, Integer.valueOf(charValue), jrVar, jrVar, Integer.valueOf(charValue), jrVar, jrVar, Integer.valueOf(charValue), jrVar, jrVar, Integer.valueOf(charValue), jrVar};
                            Object obj5 = jC.setTextScaleX.get(23685139);
                            if (obj5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                Object[] objArr7 = new Object[1];
                                e(b6, b7, b7, objArr7);
                                obj5 = ((Class) jC.setY((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 252, (char) (13777 - Drawable.resolveOpacity(0, 0)), 10 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).getMethod((String) objArr7[0], Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class);
                                jC.setTextScaleX.put(23685139, obj5);
                            }
                            if (((Integer) ((Method) obj5).invoke(null, objArr6)).intValue() == jrVar.setLayoutAnimation) {
                                try {
                                    Object[] objArr8 = {jrVar, jrVar, Integer.valueOf(charValue), Integer.valueOf(charValue), jrVar, jrVar, Integer.valueOf(charValue), Integer.valueOf(charValue), jrVar, Integer.valueOf(charValue), jrVar};
                                    Object obj6 = jC.setTextScaleX.get(-1549003164);
                                    if (obj6 == null) {
                                        byte b8 = (byte) 0;
                                        byte b9 = b8;
                                        Object[] objArr9 = new Object[1];
                                        e(b8, b9, (byte) (b9 + 3), objArr9);
                                        obj6 = ((Class) jC.setY(236 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 4)).getMethod((String) objArr9[0], Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class);
                                        jC.setTextScaleX.put(-1549003164, obj6);
                                    }
                                    obj = null;
                                    int intValue = ((Integer) ((Method) obj6).invoke(null, objArr8)).intValue();
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
                            } else {
                                obj = null;
                                if (jrVar.setIconTintList == jrVar.setY) {
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
                    obj2 = obj;
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