package o;

import java.util.Arrays;

/* renamed from: o.oj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0349oj extends C0341ob {
    public static /* synthetic */ Object[] MenuHostHelper$$ExternalSyntheticLambda0(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        pN.setY(objArr, "");
        pN.setY(objArr2, "");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
        return objArr2;
    }

    public static final byte[] MenuHostHelper$$ExternalSyntheticLambda0(byte[] bArr, int i, int i2) {
        pN.setY(bArr, "");
        int length = bArr.length;
        if (i2 <= length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i2);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) copyOfRange, "");
            return copyOfRange;
        }
        StringBuilder sb = new StringBuilder("toIndex (");
        sb.append(i2);
        sb.append(") is greater than size (");
        sb.append(length);
        sb.append(").");
        throw new IndexOutOfBoundsException(sb.toString());
    }
}