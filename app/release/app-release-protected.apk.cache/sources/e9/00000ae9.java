package o;

/* loaded from: classes.dex */
public final class setCustomInsertionActionModeCallback {
    private static byte[] setIconTintList = {20, -68, -64, 70, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
    public static final int setX = 85;

    private static void a(int i, int i2, int i3, Object[] objArr) {
        int i4 = 16 - (i * 4);
        int i5 = i3 + 105;
        byte[] bArr = setIconTintList;
        int i6 = (i2 * 15) + 4;
        byte[] bArr2 = new byte[i4];
        int i7 = -1;
        int i8 = i4 - 1;
        if (bArr == null) {
            i5 = i8 + i6 + 2;
            i8 = i8;
            i6++;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i8) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5 = i5 + bArr[i6] + 2;
            i8 = i8;
            i6++;
        }
    }

    public static void setY(Object obj, StringBuilder sb) {
        int lastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if ((simpleName == null || simpleName.length() <= 0) && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        try {
            Object[] objArr = {obj};
            byte b = (byte) (-setIconTintList[5]);
            Object[] objArr2 = new Object[1];
            a((byte) (setIconTintList[5] + 1), b, b, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b2 = (byte) (setIconTintList[5] + 1);
            byte b3 = b2;
            Object[] objArr3 = new Object[1];
            a(b2, b3, b3, objArr3);
            sb.append(Integer.toHexString(((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue()));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}