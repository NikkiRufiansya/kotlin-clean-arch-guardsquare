package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import o.C0110dr;

/* renamed from: o.dr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0110dr implements Parcelable {
    public static final Parcelable.Creator<C0110dr> CREATOR;
    private static int MenuHostHelper$$ExternalSyntheticLambda1;
    final AtomicLong MenuHostHelper$$ExternalSyntheticLambda0;
    final String setX;
    public static final byte[] $$g = {83, -75, 7, 97};
    public static final int $$h = vZ.setIconSize;
    public static final byte[] $$d = {0, Byte.MIN_VALUE, -111, -10, 6, -11, 18, -24, -62, 75, -1, -75, 44, 27, 12, 10, -42, 42, 7, 4, -41, 32, 10, 7, -8, 16, -75, 3, 36, 54, -1, -12, 16, -1, -10, 14, -22, 41, -8, 9, -9, 0, 18, -8, -3, -20, 24, 15, -8, 5, 0, -46};
    public static final int $$e = 148;
    public static final byte[] $$a = {16, -72, -107, 15, -1, 28, -14, -1, 28, -15, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -36};
    public static final int $$b = 37;
    private static byte[] setY = {122, 55, -29, -99, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
    public static final int setIconTintList = 109;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0030 -> B:11:0x0038). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = o.C0110dr.$$a
            int r7 = r7 * 36
            int r7 = 40 - r7
            int r8 = r8 * 3
            int r8 = 9 - r8
            int r9 = r9 * 38
            int r9 = 115 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L1a
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r8
            r8 = r7
            goto L38
        L1a:
            r3 = 0
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L1f:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r8) goto L30
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L30:
            r3 = r0[r9]
            r6 = r10
            r10 = r9
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L38:
            int r7 = r7 + r9
            int r7 = r7 + (-13)
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0110dr.a(byte, short, short, java.lang.Object[]):void");
    }

    private static void c(int i, byte b, byte b2, Object[] objArr) {
        byte[] bArr = setY;
        int i2 = 19 - (b * 15);
        int i3 = 106 - i;
        int i4 = (b2 * 4) + 16;
        byte[] bArr2 = new byte[i4];
        int i5 = -1;
        int i6 = i4 - 1;
        if (bArr == null) {
            int i7 = i6 + i2 + 2;
            i6 = i6;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i5 = -1;
            i2++;
            i3 = i7;
        }
        while (true) {
            int i8 = i5 + 1;
            bArr2[i8] = (byte) i3;
            if (i8 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i9 = i6;
            int i10 = i3;
            int i11 = i2;
            int i12 = i10 + bArr[i2] + 2;
            i6 = i9;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i5 = i8;
            i2 = i11 + 1;
            i3 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0035). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 5
            int r8 = r8 * 4
            int r8 = 115 - r8
            int r7 = r7 * 41
            int r7 = 45 - r7
            byte[] r0 = o.C0110dr.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r5 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            goto L35
        L19:
            r3 = 0
        L1a:
            int r9 = r9 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L2b
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2b:
            r3 = r0[r9]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r6
        L35:
            int r9 = r9 + r7
            int r7 = r9 + (-3)
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0110dr.d(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.C0110dr.$$g
            int r8 = r8 + 4
            int r6 = r6 * 2
            int r6 = r6 + 1
            int r7 = r7 * 2
            int r7 = r7 + 102
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L18
            r7 = r6
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L36
        L18:
            r3 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L1c:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L2d
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2d:
            r4 = r0[r8]
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L36:
            int r8 = -r8
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0110dr.e(short, short, byte, java.lang.Object[]):void");
    }

    static void setY() {
        MenuHostHelper$$ExternalSyntheticLambda1 = 851212287;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x03a0  */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int describeContents() {
        /*
            Method dump skipped, instructions count: 1119
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0110dr.describeContents():int");
    }

    public /* synthetic */ C0110dr(Parcel parcel, byte b) {
        this(parcel);
    }

    public C0110dr(String str) {
        this.setX = str;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new AtomicLong(0L);
    }

    private C0110dr(Parcel parcel) {
        this.setX = parcel.readString();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new AtomicLong(parcel.readLong());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.setX);
        parcel.writeLong(this.MenuHostHelper$$ExternalSyntheticLambda0.get());
    }

    static {
        setY();
        CREATOR = new Parcelable.Creator<C0110dr>() { // from class: com.google.firebase.perf.metrics.Counter$1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ C0110dr createFromParcel(Parcel parcel) {
                return new C0110dr(parcel, (byte) 0);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ C0110dr[] newArray(int i) {
                return new C0110dr[i];
            }
        };
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
                Object[] objArr2 = {Integer.valueOf(cArr2[i4]), Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda1)};
                Object obj = jC.setTextScaleX.get(-1875803360);
                if (obj == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    Object[] objArr3 = new Object[1];
                    e(b, b2, (byte) (-b2), objArr3);
                    obj = ((Class) jC.setY((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 340, (char) (TextUtils.lastIndexOf("", '0') + 1), View.resolveSize(0, 0) + 4)).getMethod((String) objArr3[0], Integer.TYPE, Integer.TYPE);
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
                        e(b3, b4, (byte) (b4 - 1), objArr5);
                        obj2 = ((Class) jC.setY(207 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (65234 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 5)).getMethod((String) objArr5[0], Object.class, Object.class);
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
                        e(b5, b6, (byte) (b6 - 1), objArr7);
                        obj3 = ((Class) jC.setY((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 206, (char) (65233 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), Color.rgb(0, 0, 0) + 16777220)).getMethod((String) objArr7[0], Object.class, Object.class);
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