package com.rmldemo.guardsquare.ui.activity;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import o.jC;
import o.jp;
import o.kY;
import o.setMinAndMaxProgress;

/* loaded from: classes.dex */
public final class WelcomeActivity extends setMinAndMaxProgress {
    private kY setUnboundedRipple;
    public static final byte[] $$g = {112, 31, -51, -82};
    public static final int $$h = 108;
    public static final byte[] $$d = {104, -68, 0, 44, 58, -66, -24, 79, -48, -31, -16, -14, 38, -46, -11, -8, 37, -36, -14, -11, 4, -20, 71, -7, -40, -58, -3, 8, -20, -3, 6, -18, 18, -45, 4, -13, 5, -4, -22, 4, -1, 16, -28, -19, 4, -9, -4, 41, 58, -71, 22, 7, -22, 36, -33, -19, -6, 19, -28, -12, -13, 33, -36, -17, -8, 7, -22, 20, 7, -22, 21, 58, -69, 34, -31, -16, -14, 38, -46, -11, -8, 37, -36, -14, -11, 4, -20, 71, -7, -40, -58, -3, 8, -20, -3, 6, -18, 18, -45, 4, -13, 5, -4, -22, 4, -1, 16, -28, -19, 4, -9, -4, 42, 58, -79, -3, 71, -48, -31, -16, -14, 38, -46, -11, -8, 37, -36, -14, -11, 4, -20, 71, -7, -40, -58, -3, 8, -20, -3, 6, -18, 18, -45, 4, -13, 5, -4, -22, 4, -1, 16, -28, -19, 4, -9, -4, 42, 58, -58, 25, 22, -48, -31, -16, -14, 38, -46, -11, -8, 37, -36, -14, -11, 4, -20, 71, -7, -40, -58, -3, 8, -20, -3, 6, -18, 18, -45, 4, -13, 5, -4, -22, 4, -1, 16, -28, -19, 4, -9, -4, 42};
    public static final int $$e = 133;
    public static final byte[] $$a = {44, -51, -23, -10, 1, -28, 14, 1, -28, 30, -39, -25, -12, 13, -34, -18, -19, 27, -42, -23, -14, 1, -28, 15, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 35, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 36};
    public static final int $$b = 111;
    private static byte[] setTextAlignment = {61, 16, -46, 32, 17, -6, 18, 1, -2, -1, -50, 57, 16, 3, 10, -11, 13, 10, -66, 25, 48, 3, 10, -11, 23, 0, -1, 5, 13, 10, -7, 15, 9, -45, 29, 22, -7, -33, 48, -7, 5, -5, 25, -17, -47, 66, -7, 17, -3, -53, 41, 42, -2, 5, -11, 12, 2, 19, -47, 51, 4, 0, 1, -2, 2, 23, -7, 10, 3, -33, 41, -4, 13};
    public static final int setOnLongClickListener = 207;
    private static char[] ViewPager$SavedState$1 = {53839, 18629, 59200, 7635, 47189, 55006, 19796, 60323, 1641, 48368, 56114, 29130, 60523, 2716, 41244, 57216, 31251, 37048, 3864, 42398, 49193, 32428, 21641, 52741, 24967, 39699, 16011, 20496, 52118, 27933, 32929, 14880, 23986, 63279, 27321, 35904, 10191, 16941, 55463, 30498, 36273, 10295, 18108, 56630, 31681, 38405, 11409, 19214, 57813, 31793, 39662, 12670, 20462, 60010, 240, 40802, 13802, 20604, 61133, 1360, 41946, 15957, 21717, 21647, 52764, 24980, 39697, 16029, 20507, 52102, 27918, 32948, 14897, 23986, 63282, 27315, 35916, 10206, 22862, 64723, 5719};
    private static long setCenterIfNoTextEnabled = -7346631015659483543L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.rmldemo.guardsquare.ui.activity.WelcomeActivity.setTextAlignment
            int r8 = r8 + 16
            int r6 = 106 - r6
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L32
        L16:
            r3 = 0
        L17:
            int r7 = r7 + 1
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
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L32:
            int r7 = r7 + r6
            int r6 = r7 + (-4)
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmldemo.guardsquare.ui.activity.WelcomeActivity.b(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0033). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 38
            int r8 = 115 - r8
            byte[] r0 = com.rmldemo.guardsquare.ui.activity.WelcomeActivity.$$a
            int r7 = 40 - r7
            int r9 = 62 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            goto L33
        L17:
            r3 = 0
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r6
        L33:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-13)
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmldemo.guardsquare.ui.activity.WelcomeActivity.d(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.rmldemo.guardsquare.ui.activity.WelcomeActivity.$$d
            int r6 = r6 + 4
            int r8 = r8 + 4
            int r7 = r7 * 2
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
            r4 = r0[r7]
            int r3 = r3 + 1
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
            int r7 = r9 + (-7)
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmldemo.guardsquare.ui.activity.WelcomeActivity.e(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0039). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.rmldemo.guardsquare.ui.activity.WelcomeActivity.$$g
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r8 = 120 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L19
            r8 = r7
            r3 = r1
            r4 = 0
            r7 = r6
            r1 = r0
            r0 = r9
            r9 = r8
            goto L39
        L19:
            r3 = 0
            r5 = r8
            r8 = r7
            r7 = r5
        L1d:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L2e
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2e:
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
        L39:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmldemo.guardsquare.ui.activity.WelcomeActivity.f(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03c9 A[Catch: Exception -> 0x06b9, TRY_LEAVE, TryCatch #7 {Exception -> 0x06b9, blocks: (B:55:0x038a, B:57:0x03c9), top: B:112:0x038a }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x04d0 A[Catch: all -> 0x06a7, TryCatch #5 {all -> 0x06a7, blocks: (B:63:0x04b2, B:67:0x0523, B:66:0x04d0), top: B:108:0x04b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x06a0 A[ORIG_RETURN, RETURN] */
    @Override // o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r23) {
        /*
            Method dump skipped, instructions count: 1733
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmldemo.guardsquare.ui.activity.WelcomeActivity.attachBaseContext(android.content.Context):void");
    }

    @Override // o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override // o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.content.ContextWrapper
    public final Context getBaseContext() {
        return super.getBaseContext();
    }

    @Override // o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return super.getResources();
    }

    @Override // o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0bd4 A[Catch: Exception -> 0x0f03, TRY_LEAVE, TryCatch #24 {Exception -> 0x0f03, blocks: (B:163:0x0b8f, B:165:0x0bd4), top: B:291:0x0b8f }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0c3c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0ca5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0e15  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0ebd  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0eec  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x07c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x08d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0cab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04be A[Catch: Exception -> 0x0f29, TRY_LEAVE, TryCatch #2 {Exception -> 0x0f29, blocks: (B:62:0x047d, B:64:0x04be), top: B:247:0x047d }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0581 A[Catch: all -> 0x0f15, TryCatch #21 {all -> 0x0f15, blocks: (B:70:0x0563, B:74:0x05d2, B:73:0x0581), top: B:285:0x0563 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x075e A[Catch: Exception -> 0x0f09, TRY_LEAVE, TryCatch #17 {Exception -> 0x0f09, blocks: (B:88:0x071a, B:90:0x075e), top: B:277:0x071a }] */
    @Override // o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 3913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmldemo.guardsquare.ui.activity.WelcomeActivity.onCreate(android.os.Bundle):void");
    }

    private static void c(int i, char c, int i2, Object[] objArr) {
        int i3;
        jp jpVar = new jp();
        long[] jArr = new long[i2];
        jpVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        while (true) {
            i3 = 4;
            if (jpVar.MenuHostHelper$$ExternalSyntheticLambda1 >= i2) {
                break;
            }
            int i4 = jpVar.MenuHostHelper$$ExternalSyntheticLambda1;
            try {
                Object[] objArr2 = {Integer.valueOf(ViewPager$SavedState$1[i + jpVar.MenuHostHelper$$ExternalSyntheticLambda1])};
                Object obj = jC.setTextScaleX.get(-534561078);
                if (obj == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    Object[] objArr3 = new Object[1];
                    f(b, b2, (byte) (b2 + 1), objArr3);
                    obj = ((Class) jC.setY(313 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 3 - ((byte) KeyEvent.getModifierMetaStateMask()))).getMethod((String) objArr3[0], Integer.TYPE);
                    jC.setTextScaleX.put(-534561078, obj);
                }
                try {
                    Object[] objArr4 = {Long.valueOf(((Long) ((Method) obj).invoke(null, objArr2)).longValue()), Long.valueOf(jpVar.MenuHostHelper$$ExternalSyntheticLambda1), Long.valueOf(setCenterIfNoTextEnabled), Integer.valueOf(c)};
                    Object obj2 = jC.setTextScaleX.get(-1233430495);
                    if (obj2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        Object[] objArr5 = new Object[1];
                        f(b3, b4, b4, objArr5);
                        obj2 = ((Class) jC.setY((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 186, (char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3)).getMethod((String) objArr5[0], Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE);
                        jC.setTextScaleX.put(-1233430495, obj2);
                    }
                    jArr[i4] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                    try {
                        Object[] objArr6 = {jpVar, jpVar};
                        Object obj3 = jC.setTextScaleX.get(-2123108845);
                        if (obj3 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            Object[] objArr7 = new Object[1];
                            f(b5, b6, (byte) (b6 + 2), objArr7);
                            obj3 = ((Class) jC.setY(269 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 4 - Color.green(0))).getMethod((String) objArr7[0], Object.class, Object.class);
                            jC.setTextScaleX.put(-2123108845, obj3);
                        }
                        ((Method) obj3).invoke(null, objArr6);
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
        }
        char[] cArr = new char[i2];
        jpVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        while (jpVar.MenuHostHelper$$ExternalSyntheticLambda1 < i2) {
            cArr[jpVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) jArr[jpVar.MenuHostHelper$$ExternalSyntheticLambda1];
            try {
                Object[] objArr8 = {jpVar, jpVar};
                Object obj4 = jC.setTextScaleX.get(-2123108845);
                if (obj4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    Object[] objArr9 = new Object[1];
                    f(b7, b8, (byte) (b8 + 2), objArr9);
                    obj4 = ((Class) jC.setY(269 - TextUtils.getTrimmedLength(""), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.indexOf("", "", 0) + i3)).getMethod((String) objArr9[0], Object.class, Object.class);
                    jC.setTextScaleX.put(-2123108845, obj4);
                }
                ((Method) obj4).invoke(null, objArr8);
                i3 = 4;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr);
    }
}