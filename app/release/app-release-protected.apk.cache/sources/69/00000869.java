package o;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Iterator;

/* renamed from: o.qi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0402qi implements Iterable<Integer>, InterfaceC0395qb {
    private static char setLayoutAnimation;
    private static char setOnLongClickListener;
    private static char setUiOptions;
    private static char setUnboundedRipple;
    public static final setX setY;
    public final int MenuHostHelper$$ExternalSyntheticLambda1;
    public final int setIconTintList;
    public final int setX;
    public static final byte[] $$g = {56, -119, 46, 55};
    public static final int $$h = 173;
    public static final byte[] $$d = {39, -116, 116, Byte.MAX_VALUE, -11, 18, -24, -62, 75, -1, -75, 44, 27, 12, 10, -42, 42, 7, 4, -41, 32, 10, 7, -8, 16, -75, 3, 36, 54, -1, -12, 16, -1, -10, 14, -22, 41, -8, 9, -9, 0, 18, -8, -3, -20, 24, 15, -8, 5, 0, -46};
    public static final int $$e = 190;
    public static final byte[] $$a = {59, -103, 22, 57, -1, 28, -14, -1, 28, -15, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -36};
    public static final int $$b = 84;
    private static byte[] setNavigationOnClickListener = {31, -80, -88, -103, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
    public static final int MenuHostHelper$$ExternalSyntheticLambda0 = 153;

    static {
        setX();
        setY = new setX((byte) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0038). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = 10 - r8
            int r7 = r7 * 38
            int r7 = 115 - r7
            int r6 = r6 * 36
            int r6 = r6 + 4
            byte[] r0 = o.C0402qi.$$a
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L1b
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L38
        L1b:
            r3 = 0
        L1c:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2c:
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
        L38:
            int r8 = r8 + 1
            int r9 = r9 + r7
            int r7 = r9 + (-13)
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0402qi.a(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0035). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.C0402qi.setNavigationOnClickListener
            int r8 = r8 * 2
            int r8 = r8 + 16
            int r7 = 106 - r7
            int r6 = r6 * 15
            int r6 = 19 - r6
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L1b
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L35
        L1b:
            r3 = 0
        L1c:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L35:
            int r6 = -r6
            int r7 = r7 + 1
            int r8 = r8 + r6
            int r6 = r8 + 2
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0402qi.c(byte, short, byte, java.lang.Object[]):void");
    }

    private static void d(int i, short s, short s2, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = i + 4;
        int i3 = (s * 41) + 4;
        int i4 = 115 - (s2 * 4);
        byte[] bArr2 = new byte[i3];
        int i5 = -1;
        int i6 = i3 - 1;
        if (bArr == null) {
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i5 = -1;
            i4 = (i4 + i2) - 3;
            i2 = i2;
            i6 = i6;
        }
        while (true) {
            int i7 = i5 + 1;
            int i8 = i2 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i8];
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i5 = i7;
            i4 = (i4 + b) - 3;
            i2 = i8;
            i6 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.C0402qi.$$g
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r7 = r7 * 2
            int r7 = 117 - r7
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L1b
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L34
        L1b:
            r3 = 0
        L1c:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L34:
            int r7 = r7 + r8
            int r6 = r6 + 1
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0402qi.e(int, short, int, java.lang.Object[]):void");
    }

    static void setX() {
        setOnLongClickListener = (char) 3972;
        setUnboundedRipple = (char) 44241;
        setLayoutAnimation = (char) 8598;
        setUiOptions = (char) 52624;
    }

    public C0402qi(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        if (i3 > 0) {
            if (i < i2) {
                i2 -= C0367pa.MenuHostHelper$$ExternalSyntheticLambda1(i2, i, i3);
            }
        } else if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else {
            if (i > i2) {
                i2 += C0367pa.MenuHostHelper$$ExternalSyntheticLambda1(i, i2, -i3);
            }
        }
        this.setIconTintList = i2;
        this.setX = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x03c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int setIconTintList() {
        /*
            Method dump skipped, instructions count: 1153
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0402qi.setIconTintList():int");
    }

    public boolean setY() {
        return this.setX <= 0 ? this.MenuHostHelper$$ExternalSyntheticLambda1 < this.setIconTintList : this.MenuHostHelper$$ExternalSyntheticLambda1 > this.setIconTintList;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0402qi) {
            if (!setY() || !((C0402qi) obj).setY()) {
                C0402qi c0402qi = (C0402qi) obj;
                if (this.MenuHostHelper$$ExternalSyntheticLambda1 != c0402qi.MenuHostHelper$$ExternalSyntheticLambda1 || this.setIconTintList != c0402qi.setIconTintList || this.setX != c0402qi.setX) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (setY()) {
            return -1;
        }
        return (((this.MenuHostHelper$$ExternalSyntheticLambda1 * 31) + this.setIconTintList) * 31) + this.setX;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.setX > 0) {
            sb = new StringBuilder();
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
            sb.append("..");
            sb.append(this.setIconTintList);
            sb.append(" step ");
            i = this.setX;
        } else {
            sb = new StringBuilder();
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
            sb.append(" downTo ");
            sb.append(this.setIconTintList);
            sb.append(" step ");
            i = -this.setX;
        }
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: o.qi$setX */
    /* loaded from: classes.dex */
    public static final class setX {
        public /* synthetic */ setX(byte b) {
            this();
        }

        private setX() {
        }
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Integer> iterator() {
        return new C0408qo(this.MenuHostHelper$$ExternalSyntheticLambda1, this.setIconTintList, this.setX);
    }

    private static void b(int i, char[] cArr, Object[] objArr) {
        jw jwVar = new jw();
        char[] cArr2 = new char[cArr.length];
        jwVar.setX = 0;
        char c = 2;
        char[] cArr3 = new char[2];
        while (jwVar.setX < cArr.length) {
            cArr3[0] = cArr[jwVar.setX];
            cArr3[1] = cArr[jwVar.setX + 1];
            int i2 = 58224;
            int i3 = 0;
            while (i3 < 16) {
                char c2 = cArr3[1];
                int i4 = (cArr3[0] + i2) ^ ((cArr3[0] << 4) + ((char) (setUiOptions ^ 7915367849376928708L)));
                int i5 = cArr3[0] >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(setLayoutAnimation);
                    objArr2[c] = Integer.valueOf(i5);
                    objArr2[1] = Integer.valueOf(i4);
                    objArr2[0] = Integer.valueOf(c2);
                    Object obj = jC.setTextScaleX.get(-496584909);
                    if (obj == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        Object[] objArr3 = new Object[1];
                        e(b, b2, b2, objArr3);
                        obj = ((Class) jC.setY((Process.myPid() >> 22) + 277, (char) (42263 - (ViewConfiguration.getEdgeSlop() >> 16)), 4 - TextUtils.getOffsetAfter("", 0))).getMethod((String) objArr3[0], Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                        jC.setTextScaleX.put(-496584909, obj);
                    }
                    cArr3[1] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cArr3[1] + i2) ^ ((cArr3[1] << 4) + ((char) (setUnboundedRipple ^ 7915367849376928708L)))), Integer.valueOf(cArr3[1] >>> 5), Integer.valueOf(setOnLongClickListener)};
                        Object obj2 = jC.setTextScaleX.get(-496584909);
                        if (obj2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            Object[] objArr5 = new Object[1];
                            e(b3, b4, b4, objArr5);
                            obj2 = ((Class) jC.setY(277 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (42263 - (ViewConfiguration.getWindowTouchSlop() >> 8)), TextUtils.indexOf("", "") + 4)).getMethod((String) objArr5[0], Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                            jC.setTextScaleX.put(-496584909, obj2);
                        }
                        cArr3[0] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                        i2 -= 40503;
                        i3++;
                        c = 2;
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
            cArr2[jwVar.setX] = cArr3[0];
            cArr2[jwVar.setX + 1] = cArr3[1];
            try {
                Object[] objArr6 = {jwVar, jwVar};
                Object obj3 = jC.setTextScaleX.get(655848378);
                if (obj3 == null) {
                    obj3 = ((Class) jC.setY(TextUtils.getCapsMode("", 0, 0) + 365, (char) (TextUtils.getCapsMode("", 0, 0) + 55121), (ViewConfiguration.getScrollBarSize() >> 8) + 4)).getMethod("A", Object.class, Object.class);
                    jC.setTextScaleX.put(655848378, obj3);
                }
                ((Method) obj3).invoke(null, objArr6);
                c = 2;
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}