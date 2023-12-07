package o;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class kJ extends Application {
    private static int[] MenuHostHelper$$ExternalSyntheticLambda0;
    public static final byte[] $$g = {25, 108, 7, 61};
    public static final int $$h = 44;
    public static final byte[] $$d = {44, 104, -53, -66, 12, -17, 25, 12, -17, 41, -28, -14, -1, 24, -23, -7, -8, 38, -31, -12, -3, 12, -17, 26, 63, -64, 39, -26, -11, -9, 43, -41, -6, -3, 42, -31, -9, -6, 9, -15, 76, -2, -35, -53, 2, 13, -15, 2, 11, -13, 23, -40, 9, -8, 10, 1, -17, 9, 4, 21, -23, -14, 9, -4, 1, 47, 63, -67, 40, 63, -66, -14, 63, -75, 20, 63, -74, 2, 76, -43, -26, -11, -9, 43, -41, -6, -3, 42, -31, -9, -6, 9, -15, 76, -2, -35, -53, 2, 13, -15, 2, 11, -13, 23, -40, 9, -8, 10, 1, -17, 9, 4, 21, -23, -14, 9, -4, 1, 47};
    public static final int $$e = 56;
    public static final byte[] $$a = {122, 55, -29, -99, 1, -28, 14, 1, -28, 30, -39, -25, -12, 13, -34, -18, -19, 27, -42, -23, -14, 1, -28, 15, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 35, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 36};
    public static final int $$b = 190;
    private static byte[] setX = {105, 42, 72, -81, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 23, 46, 1, 8, -13, 21, -2, -2, 8, -1, -13, 4, -31, 39, 11, 20, -1, 2, -11, 11, 8, -30, 22, 12, -11, -2, 5, -3, 3, 11, 8, -9, 13, 7, -47, 27, 20, -9, -35, 46, -9, 3, 0, 17, -31, 35, -17, 4, 10, -21, 32, -15, 4, 4, -7, 23, -19, -49, 64, -9, 15, -5, -55, 39, 40, -4, 3, -13, 10, -7, 23, -19, -49, 64, -9, 15, -5, -55, 40, 22, 12, -11, -2, 5, -7, 23, -19, -49, 64, -9, 15, -5, -55, 39, 35, -17, 4, 10, -21, 32, -15, 4, 4, -30, 41, -5, 10, -6, 11, 8, 0, 17, -47, 43, -9, 20, 2, -35, 21, 14, -6, 0, 17, -49, 49, 2, -2, -1, -4, 0, 21, -9, 8, 1, -35, 39, -6, 11, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 21, 49, 2, -2, -1, -4, 0, 21, -9, 8, 1, -35, 39, -6, 11};
    public static final int MenuHostHelper$$ExternalSyntheticLambda1 = 40;

    static {
        setIconTintList();
        new setIconTintList((byte) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 156 - r7
            int r6 = 115 - r6
            byte[] r0 = o.kJ.setX
            int r8 = r8 + 9
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L30
        L15:
            r3 = 0
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r7 = r7 + 1
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L30:
            int r6 = r6 + r8
            int r6 = r6 + (-2)
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.kJ.a(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 38
            int r8 = r8 + 77
            byte[] r0 = o.kJ.$$a
            int r6 = 40 - r6
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
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
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
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
            int r7 = -r7
            int r8 = r8 + 1
            int r9 = r9 + r7
            int r7 = r9 + (-13)
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.kJ.c(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 74 - r7
            byte[] r0 = o.kJ.$$d
            int r6 = r6 + 4
            int r8 = r8 * 2
            int r8 = r8 + 77
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r8
            r3 = 0
            r8 = r7
            r7 = r6
            goto L2e
        L16:
            r3 = 0
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L2e:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-2)
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.kJ.d(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(int r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r9 = r9 * 2
            int r9 = r9 + 70
            byte[] r0 = o.kJ.$$g
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r8
            r8 = r7
            goto L36
        L18:
            r3 = 0
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L1d:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r8) goto L2e
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2e:
            r3 = r0[r9]
            r6 = r10
            r10 = r9
            r9 = r3
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
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.kJ.e(int, byte, byte, java.lang.Object[]):void");
    }

    static void setIconTintList() {
        MenuHostHelper$$ExternalSyntheticLambda0 = new int[]{1112937494, -1556148070, -1074401354, 1381590538, 2137714269, -435520686, -1691560111, -1308807952, -1098185735, 1053097212, 322180209, -1773208066, -1107258428, -119669868, -1438339625, -818657488, -800433969, 40882558};
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0349, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x02a1, code lost:
        r24 = r5;
        r25 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x02a5, code lost:
        r2 = (short) (o.kJ.setX[11] - 1);
        r5 = new java.lang.Object[1];
        a((byte) (-o.kJ.setX[50]), r2, (byte) (r2 & 91), r5);
        r0 = java.lang.Class.forName((java.lang.String) r5[0]);
        r2 = o.kJ.setX[42];
        r6 = new java.lang.Object[1];
        a(r2, (short) (r2 | 16), o.kJ.setX[47], r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x02fc, code lost:
        if (java.lang.Class.forName((java.lang.String) r0.getMethod((java.lang.String) r6[0], null).invoke(r15, null)).getClassLoader().toString().contains(r9) == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x02fe, code lost:
        if (r13 == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0300, code lost:
        r2 = o.kJ.$$a[45];
        r6 = new java.lang.Object[1];
        c(r2, (byte) (r2 | 59), o.kJ.$$a[45], r6);
        ((java.lang.Class) o.jC.setY(333 - android.view.KeyEvent.keyCodeFromString(""), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 4 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).getField((java.lang.String) r6[0]).setInt(null, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x033e, code lost:
        r13 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0997 A[Catch: all -> 0x0beb, TryCatch #5 {all -> 0x0beb, blocks: (B:103:0x0978, B:107:0x09ed, B:106:0x0997), top: B:167:0x0978 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0be4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0825 A[Catch: Exception -> 0x0bfd, TRY_LEAVE, TryCatch #9 {Exception -> 0x0bfd, blocks: (B:96:0x07e0, B:98:0x0825), top: B:175:0x07e0 }] */
    @Override // android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r27) {
        /*
            Method dump skipped, instructions count: 3117
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.kJ.attachBaseContext(android.content.Context):void");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override // android.content.ContextWrapper
    public final Context getBaseContext() {
        return super.getBaseContext();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return super.getResources();
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList {
        public /* synthetic */ setIconTintList(byte b) {
            this();
        }

        private setIconTintList() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x030e, code lost:
        r27 = r7;
        r28 = r8;
        r26 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0314, code lost:
        r2 = (short) (o.kJ.setX[11] - 1);
        r8 = new java.lang.Object[1];
        a((byte) (-o.kJ.setX[50]), r2, (byte) (r2 & 91), r8);
        r1 = java.lang.Class.forName((java.lang.String) r8[0]);
        r2 = o.kJ.setX[42];
        r9 = new java.lang.Object[1];
        a(r2, (short) (r2 | 16), o.kJ.setX[47], r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x036d, code lost:
        if (java.lang.Class.forName((java.lang.String) r1.getMethod((java.lang.String) r9[0], null).invoke(r15, null)).getClassLoader().toString().contains(r3) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x036f, code lost:
        if (r13 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0371, code lost:
        r2 = o.kJ.$$a[45];
        r9 = new java.lang.Object[1];
        c(r2, (byte) (r2 | 59), o.kJ.$$a[45], r9);
        ((java.lang.Class) o.jC.setY(333 - android.graphics.Color.red(0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), 5 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)))).getField((java.lang.String) r9[0]).setInt(null, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x03b1, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x03bd, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x07d3 A[Catch: Exception -> 0x1268, TRY_LEAVE, TryCatch #14 {Exception -> 0x1268, blocks: (B:105:0x0790, B:107:0x07d3), top: B:326:0x0790 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x08ad A[Catch: all -> 0x1254, TryCatch #26 {all -> 0x1254, blocks: (B:113:0x088d, B:117:0x0906, B:116:0x08ad), top: B:350:0x088d }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0ab0 A[Catch: Exception -> 0x1248, TRY_LEAVE, TryCatch #28 {Exception -> 0x1248, blocks: (B:131:0x0a62, B:133:0x0ab0), top: B:354:0x0a62 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0b1e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0bb7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0bbd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0d44  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0eee A[Catch: Exception -> 0x1242, TRY_LEAVE, TryCatch #33 {Exception -> 0x1242, blocks: (B:201:0x0ea3, B:203:0x0eee), top: B:364:0x0ea3 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0ffc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x1002  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x117a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x122a  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0f5f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x06eb  */
    @Override // android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate() {
        /*
            Method dump skipped, instructions count: 4998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.kJ.onCreate():void");
    }

    private static void b(int i, int[] iArr, Object[] objArr) {
        char[] cArr;
        int[] iArr2;
        char[] cArr2;
        int i2;
        jy jyVar = new jy();
        char[] cArr3 = new char[4];
        char[] cArr4 = new char[iArr.length * 2];
        int[] iArr3 = MenuHostHelper$$ExternalSyntheticLambda0;
        long j = 0;
        int i3 = 59782;
        float f = 0.0f;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[i4];
                    objArr2[i5] = Integer.valueOf(iArr3[i6]);
                    Object obj = jC.setTextScaleX.get(-878021517);
                    if (obj == null) {
                        byte b = (byte) i5;
                        byte b2 = (byte) (b - 1);
                        Object[] objArr3 = new Object[1];
                        e(b, b2, (byte) (b2 & 26), objArr3);
                        obj = ((Class) jC.setY((TypedValue.complexToFloat(i5) > f ? 1 : (TypedValue.complexToFloat(i5) == f ? 0 : -1)) + 240, (char) (View.getDefaultSize(i5, i5) + i3), 4 - (ExpandableListView.getPackedPositionForGroup(i5) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(i5) == j ? 0 : -1)))).getMethod((String) objArr3[0], Integer.TYPE);
                        jC.setTextScaleX.put(-878021517, obj);
                    }
                    iArr4[i6] = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                    i6++;
                    j = 0;
                    i3 = 59782;
                    f = 0.0f;
                    i4 = 1;
                    i5 = 0;
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
        int[] iArr6 = MenuHostHelper$$ExternalSyntheticLambda0;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                try {
                    Object[] objArr4 = {Integer.valueOf(iArr6[i7])};
                    Object obj2 = jC.setTextScaleX.get(-878021517);
                    if (obj2 != null) {
                        cArr2 = cArr4;
                        iArr2 = iArr6;
                        i2 = length3;
                    } else {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        iArr2 = iArr6;
                        cArr2 = cArr4;
                        i2 = length3;
                        Object[] objArr5 = new Object[1];
                        e(b3, b4, (byte) (b4 & 26), objArr5);
                        obj2 = ((Class) jC.setY(240 - View.resolveSizeAndState(0, 0, 0), (char) (59782 - TextUtils.getTrimmedLength("")), View.resolveSize(0, 0) + 4)).getMethod((String) objArr5[0], Integer.TYPE);
                        jC.setTextScaleX.put(-878021517, obj2);
                    }
                    iArr7[i7] = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
                    i7++;
                    iArr6 = iArr2;
                    length3 = i2;
                    cArr4 = cArr2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr = cArr4;
            iArr6 = iArr7;
        } else {
            cArr = cArr4;
        }
        char c = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        jyVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        while (jyVar.MenuHostHelper$$ExternalSyntheticLambda0 < iArr.length) {
            cArr3[c] = (char) (iArr[jyVar.MenuHostHelper$$ExternalSyntheticLambda0] >> 16);
            cArr3[1] = (char) iArr[jyVar.MenuHostHelper$$ExternalSyntheticLambda0];
            cArr3[2] = (char) (iArr[jyVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1] >> 16);
            cArr3[3] = (char) iArr[jyVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1];
            jyVar.MenuHostHelper$$ExternalSyntheticLambda1 = (cArr3[0] << 16) + cArr3[1];
            jyVar.setY = (cArr3[2] << 16) + cArr3[3];
            jy.setY(iArr5);
            int i8 = 0;
            for (int i9 = 16; i8 < i9; i9 = 16) {
                jyVar.MenuHostHelper$$ExternalSyntheticLambda1 ^= iArr5[i8];
                try {
                    Object[] objArr6 = {jyVar, Integer.valueOf(jy.setIconTintList(jyVar.MenuHostHelper$$ExternalSyntheticLambda1)), jyVar, jyVar};
                    Object obj3 = jC.setTextScaleX.get(-1199281727);
                    if (obj3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 - 1);
                        Object[] objArr7 = new Object[1];
                        e(b5, b6, (byte) (-b6), objArr7);
                        obj3 = ((Class) jC.setY((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 324, (char) (61129 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 4)).getMethod((String) objArr7[0], Object.class, Integer.TYPE, Object.class, Object.class);
                        jC.setTextScaleX.put(-1199281727, obj3);
                    }
                    int intValue = ((Integer) ((Method) obj3).invoke(null, objArr6)).intValue();
                    jyVar.MenuHostHelper$$ExternalSyntheticLambda1 = jyVar.setY;
                    jyVar.setY = intValue;
                    i8++;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i10 = jyVar.MenuHostHelper$$ExternalSyntheticLambda1;
            jyVar.MenuHostHelper$$ExternalSyntheticLambda1 = jyVar.setY;
            jyVar.setY = i10;
            jyVar.setY ^= iArr5[16];
            jyVar.MenuHostHelper$$ExternalSyntheticLambda1 ^= iArr5[17];
            int i11 = jyVar.MenuHostHelper$$ExternalSyntheticLambda1;
            int i12 = jyVar.setY;
            cArr3[0] = (char) (jyVar.MenuHostHelper$$ExternalSyntheticLambda1 >>> 16);
            cArr3[1] = (char) jyVar.MenuHostHelper$$ExternalSyntheticLambda1;
            cArr3[2] = (char) (jyVar.setY >>> 16);
            cArr3[3] = (char) jyVar.setY;
            jy.setY(iArr5);
            cArr[jyVar.MenuHostHelper$$ExternalSyntheticLambda0 * 2] = cArr3[0];
            cArr[(jyVar.MenuHostHelper$$ExternalSyntheticLambda0 * 2) + 1] = cArr3[1];
            cArr[(jyVar.MenuHostHelper$$ExternalSyntheticLambda0 * 2) + 2] = cArr3[2];
            cArr[(jyVar.MenuHostHelper$$ExternalSyntheticLambda0 * 2) + 3] = cArr3[3];
            try {
                Object[] objArr8 = {jyVar, jyVar};
                Object obj4 = jC.setTextScaleX.get(1491664993);
                if (obj4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 - 1);
                    Object[] objArr9 = new Object[1];
                    e(b7, b8, (byte) (b8 + 1), objArr9);
                    obj4 = ((Class) jC.setY((Process.myPid() >> 22) + 261, (char) (17133 - (Process.myTid() >> 22)), View.resolveSizeAndState(0, 0, 0) + 4)).getMethod((String) objArr9[0], Object.class, Object.class);
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
        objArr[0] = new String(cArr, 0, i);
    }
}