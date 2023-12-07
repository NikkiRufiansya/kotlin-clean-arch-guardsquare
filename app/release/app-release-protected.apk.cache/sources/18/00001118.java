package o;

/* renamed from: o.sn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0461sn {
    private static byte[] MenuHostHelper$$ExternalSyntheticLambda0 = {75, -23, 102, -23, 16, -5, -2, -15, 7, 4, -34, 18, 8, -15, -6, 1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1};
    public static final int setIconTintList = 115;

    private static void a(int i, short s, int i2, Object[] objArr) {
        int i3 = 15 - (s * 12);
        int i4 = (i * 3) + 13;
        int i5 = 106 - (i2 * 7);
        byte[] bArr = MenuHostHelper$$ExternalSyntheticLambda0;
        byte[] bArr2 = new byte[i4];
        int i6 = -1;
        int i7 = i4 - 1;
        if (bArr == null) {
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i6 = -1;
            i5 = i5 + i7 + 2;
            i7 = i7;
            i3 = i3;
        }
        while (true) {
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i5;
            if (i8 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i9 = i3 + 1;
            byte b = bArr[i9];
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i6 = i8;
            i5 = i5 + b + 2;
            i7 = i7;
            i3 = i9;
        }
    }

    public static final AbstractC0463sp MenuHostHelper$$ExternalSyntheticLambda1() {
        try {
            byte b = MenuHostHelper$$ExternalSyntheticLambda0[15];
            byte b2 = (byte) (b - 1);
            Object[] objArr = new Object[1];
            a(b, b2, b2, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = MenuHostHelper$$ExternalSyntheticLambda0[15];
            Object[] objArr2 = new Object[1];
            a((byte) (MenuHostHelper$$ExternalSyntheticLambda0[15] - 1), b3, b3, objArr2);
            return new C0431rk((Thread) cls.getMethod((String) objArr2[0], null).invoke(null, null));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}