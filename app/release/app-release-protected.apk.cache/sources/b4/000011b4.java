package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.uh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0511uh<T> extends AbstractC0451sd<T> implements oW, oK<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater setIconTintList;
    private static char[] setNavigationOnClickListener;
    public Object MenuHostHelper$$ExternalSyntheticLambda1;
    public volatile /* synthetic */ Object _reusableCancellableContinuation;
    public final rQ setUnboundedRipple;
    public final Object setX;
    public final oK<T> setY;
    public static final byte[] $$g = {94, 25, -44, 73};
    public static final int $$h = 69;
    public static final byte[] $$d = {15, -40, -114, -21, 11, -18, 24, 62, -75, 1, 75, -44, -27, -12, -10, 42, -42, -7, -4, 41, -32, -10, -7, 8, -16, 75, -3, -36, -54, 1, 12, -16, 1, 10, -14, 22, -41, 8, -9, 9, 0, -18, 8, 3, 20, -24, -15, 8, -5, 0, 46};
    public static final int $$e = 202;
    public static final byte[] $$a = {114, -124, 55, 72, -1, 28, -14, -1, 28, -15, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -36};
    public static final int $$b = 187;
    private static byte[] ViewPager$SavedState$1 = {113, -101, 105, 26, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
    public static final int setUiOptions = 56;

    static {
        MenuHostHelper$$ExternalSyntheticLambda0();
        setIconTintList = AtomicReferenceFieldUpdater.newUpdater(C0511uh.class, Object.class, "_reusableCancellableContinuation");
    }

    static void MenuHostHelper$$ExternalSyntheticLambda0() {
        setNavigationOnClickListener = new char[]{41009, 41071, 41070, 41068, 41066, 41077, 41065, 41071, 41036, 41047, 41076, 41045, 41029, 41071, 41087, 41074, 41065, 41068, 41053, 41054, 41064, 41068, 41015, 41071, 41078, 41067, 41059, 41052, 41052, 41060, 41057, 41079, 41065, 41068, 41070, 41058, 41071};
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 38
            int r8 = 115 - r8
            int r6 = r6 * 36
            int r6 = 40 - r6
            byte[] r0 = o.C0511uh.$$a
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r8
            r4 = 0
            r8 = r7
            r7 = r6
            goto L30
        L18:
            r3 = 0
        L19:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L30:
            int r6 = r6 + r3
            int r6 = r6 + (-13)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0511uh.a(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.C0511uh.ViewPager$SavedState$1
            int r7 = r7 * 4
            int r7 = 16 - r7
            int r8 = r8 + 105
            int r6 = r6 * 15
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r5 = 0
            r3 = r8
            r8 = r6
            goto L27
        L15:
            r3 = 0
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r6]
        L27:
            int r6 = r6 + 1
            int r8 = r8 + r3
            int r8 = r8 + 2
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0511uh.c(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 41
            int r9 = 45 - r9
            int r8 = r8 + 4
            byte[] r0 = o.C0511uh.$$d
            int r7 = r7 * 4
            int r7 = r7 + 111
            byte[] r1 = new byte[r9]
            int r9 = r9 + (-1)
            r2 = 0
            if (r0 != 0) goto L1a
            r7 = r8
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L37
        L1a:
            r3 = 0
        L1b:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r9) goto L2c
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2c:
            r3 = r0[r8]
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
            int r9 = -r9
            int r8 = r8 + r9
            int r8 = r8 + (-3)
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0511uh.d(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0033). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.C0511uh.$$g
            int r6 = r6 + 4
            int r7 = 111 - r7
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L33
        L17:
            r3 = 0
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L33:
            int r7 = r7 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0511uh.e(short, int, int, java.lang.Object[]):void");
    }

    @Override // o.oW
    public final StackTraceElement MenuHostHelper$$ExternalSyntheticLambda1() {
        return null;
    }

    @Override // o.oK
    public final oM setX() {
        return this.setY.setX();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0511uh(rQ rQVar, oK<? super T> oKVar) {
        super(-1);
        C0528uy c0528uy;
        this.setUnboundedRipple = rQVar;
        this.setY = oKVar;
        c0528uy = C0510ug.MenuHostHelper$$ExternalSyntheticLambda0;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = c0528uy;
        this.setX = uD.MenuHostHelper$$ExternalSyntheticLambda1(this.setY.setX());
        this._reusableCancellableContinuation = null;
    }

    @Override // o.oW
    public final oW setY() {
        oK<T> oKVar = this.setY;
        if (oKVar instanceof oW) {
            return (oW) oKVar;
        }
        return null;
    }

    @Override // o.AbstractC0451sd
    public final Object setNavigationOnClickListener() {
        C0528uy c0528uy;
        Object obj = this.MenuHostHelper$$ExternalSyntheticLambda1;
        rX.setIconTintList();
        c0528uy = C0510ug.MenuHostHelper$$ExternalSyntheticLambda0;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = c0528uy;
        return obj;
    }

    @Override // o.AbstractC0451sd
    public final oK<T> setIconTintList() {
        return this;
    }

    @Override // o.oK
    public final void MenuHostHelper$$ExternalSyntheticLambda0(Object obj) {
        AbstractC0451sd<?> x;
        boolean z;
        oM x2 = this.setY.setX();
        Object MenuHostHelper$$ExternalSyntheticLambda0 = rJ.MenuHostHelper$$ExternalSyntheticLambda0(obj, (InterfaceC0377pk<? super Throwable, nX>) null);
        if (this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0(x2)) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda0;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
            this.setUnboundedRipple.setY(x2, this);
            return;
        }
        rX.setIconTintList();
        sT sTVar = sT.MenuHostHelper$$ExternalSyntheticLambda1;
        AbstractC0463sp y = sT.setY();
        if (y.setLayoutAnimation >= 4294967296L) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda0;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
            C0511uh<T> c0511uh = this;
            tU<AbstractC0451sd<?>> tUVar = y.setX;
            if (tUVar == null) {
                tUVar = new tU<>();
                y.setX = tUVar;
            }
            tUVar.MenuHostHelper$$ExternalSyntheticLambda1(c0511uh);
            return;
        }
        C0511uh<T> c0511uh2 = this;
        y.setLayoutAnimation += 4294967296L;
        try {
            oM x3 = this.setY.setX();
            Object MenuHostHelper$$ExternalSyntheticLambda02 = uD.MenuHostHelper$$ExternalSyntheticLambda0(x3, this.setX);
            this.setY.MenuHostHelper$$ExternalSyntheticLambda0(obj);
            nX nXVar = nX.setX;
            uD.setX(x3, MenuHostHelper$$ExternalSyntheticLambda02);
            do {
                tU<AbstractC0451sd<?>> tUVar2 = y.setX;
                if (tUVar2 != null && (x = tUVar2.setX()) != null) {
                    x.run();
                    z = true;
                    continue;
                }
                z = false;
            } while (z);
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // o.AbstractC0451sd
    public final void setY(Object obj, Throwable th) {
        if (obj instanceof rH) {
            ((rH) obj).MenuHostHelper$$ExternalSyntheticLambda0.setX(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0332  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0511uh.toString():java.lang.String");
    }

    private static void b(int[] iArr, byte[] bArr, boolean z, Object[] objArr) {
        int i;
        String str;
        String str2 = "";
        jx jxVar = new jx();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = setNavigationOnClickListener;
        int i7 = -1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i2] = Integer.valueOf(cArr[i8]);
                    Object obj = jC.setTextScaleX.get(-2065108825);
                    if (obj != null) {
                        str = str2;
                    } else {
                        byte b = (byte) i7;
                        byte b2 = (byte) (b + 4);
                        str = str2;
                        Object[] objArr3 = new Object[1];
                        e(b, b2, (byte) (b2 - 3), objArr3);
                        obj = ((Class) jC.setY(39 - ImageFormat.getBitsPerPixel(i2), (char) (35090 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 6 - TextUtils.indexOf(str2, str2))).getMethod((String) objArr3[0], Integer.TYPE);
                        jC.setTextScaleX.put(-2065108825, obj);
                    }
                    cArr2[i8] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    i8++;
                    str2 = str;
                    i2 = 0;
                    i7 = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
            char c = 0;
            while (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 < i4) {
                if (bArr[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] == 1) {
                    int i9 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[jxVar.MenuHostHelper$$ExternalSyntheticLambda0]), Integer.valueOf(c)};
                        Object obj2 = jC.setTextScaleX.get(1237805447);
                        if (obj2 == null) {
                            byte b3 = (byte) (-1);
                            byte b4 = (byte) (b3 + 3);
                            Object[] objArr5 = new Object[1];
                            e(b3, b4, (byte) (b4 - 2), objArr5);
                            obj2 = ((Class) jC.setY((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 272, (char) (Process.myTid() >> 22), Color.argb(0, 0, 0, 0) + 4)).getMethod((String) objArr5[0], Integer.TYPE, Integer.TYPE);
                            jC.setTextScaleX.put(1237805447, obj2);
                        }
                        cArr4[i9] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i10 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0;
                    try {
                        Object[] objArr6 = {Integer.valueOf(cArr3[jxVar.MenuHostHelper$$ExternalSyntheticLambda0]), Integer.valueOf(c)};
                        Object obj3 = jC.setTextScaleX.get(997913035);
                        if (obj3 == null) {
                            byte b5 = (byte) (-1);
                            byte b6 = (byte) (-b5);
                            Object[] objArr7 = new Object[1];
                            e(b5, b6, (byte) (b6 - 1), objArr7);
                            obj3 = ((Class) jC.setY((Process.myPid() >> 22) + 269, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4)).getMethod((String) objArr7[0], Integer.TYPE, Integer.TYPE);
                            jC.setTextScaleX.put(997913035, obj3);
                        }
                        cArr4[i10] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                c = cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0];
                try {
                    Object[] objArr8 = {jxVar, jxVar};
                    Object obj4 = jC.setTextScaleX.get(1233791110);
                    if (obj4 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (b7 + 1);
                        Object[] objArr9 = new Object[1];
                        e(b7, b8, b8, objArr9);
                        obj4 = ((Class) jC.setY(237 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod((String) objArr9[0], Object.class, Object.class);
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
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i11 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i11, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i11);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i4];
            while (true) {
                jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = i;
                if (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 >= i4) {
                    break;
                }
                cArr6[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr3[(i4 - jxVar.MenuHostHelper$$ExternalSyntheticLambda0) - 1];
                i = jxVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i12 = 0;
            while (true) {
                jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = i12;
                if (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 >= i4) {
                    break;
                }
                cArr3[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] = (char) (cArr3[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] - iArr[2]);
                i12 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }
}