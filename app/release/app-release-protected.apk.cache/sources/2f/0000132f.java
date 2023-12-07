package o;

/* renamed from: o.xn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0601xn {
    public static final void setIconTintList(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(j);
            sb.append(" offset=");
            sb.append(j2);
            sb.append(" byteCount=");
            sb.append(j3);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
    }

    public static final boolean setIconTintList(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        pN.setY(bArr, "");
        pN.setY(bArr2, "");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final String MenuHostHelper$$ExternalSyntheticLambda0(byte b) {
        return new String(new char[]{xL.setX()[(b >> 4) & 15], xL.setX()[b & 15]});
    }

    public static final String setIconTintList(int i) {
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {xL.setX()[(i >> 28) & 15], xL.setX()[(i >> 24) & 15], xL.setX()[(i >> 20) & 15], xL.setX()[(i >> 16) & 15], xL.setX()[(i >> 12) & 15], xL.setX()[(i >> 8) & 15], xL.setX()[(i >> 4) & 15], xL.setX()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return new String(cArr, i2, 8 - i2);
    }
}