package o;

import java.util.Arrays;
import o.C0610xu;

/* renamed from: o.xi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596xi {
    private static final byte[] setX;

    static {
        C0610xu.setX setx = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
        pN.setY("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", "");
        pN.setY("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", "");
        byte[] bytes = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".getBytes(qQ.setIconTintList);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) bytes, "");
        C0610xu c0610xu = new C0610xu(bytes);
        c0610xu.setX = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        setX = c0610xu.setIconTintList;
        C0610xu.setX setx2 = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
        pN.setY("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", "");
        pN.setY("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", "");
        byte[] bytes2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".getBytes(qQ.setIconTintList);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) bytes2, "");
        C0610xu c0610xu2 = new C0610xu(bytes2);
        c0610xu2.setX = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_";
        byte[] bArr = c0610xu2.setIconTintList;
    }

    public static final byte[] setIconTintList(String str) {
        int i;
        char charAt;
        pN.setY(str, "");
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i2 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt2 = str.charAt(i6);
            if ('A' <= charAt2 && 'Z' >= charAt2) {
                i = charAt2 - 'A';
            } else if ('a' <= charAt2 && 'z' >= charAt2) {
                i = charAt2 - 'G';
            } else if ('0' <= charAt2 && '9' >= charAt2) {
                i = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i = 63;
            } else {
                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                    return null;
                }
            }
            i4 = (i4 << 6) | i;
            i3++;
            if (i3 % 4 == 0) {
                int i7 = i5 + 1;
                bArr[i5] = (byte) (i4 >> 16);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (i4 >> 8);
                bArr[i8] = (byte) i4;
                i5 = i8 + 1;
            }
        }
        int i9 = i3 % 4;
        if (i9 != 1) {
            if (i9 == 2) {
                bArr[i5] = (byte) ((i4 << 12) >> 16);
                i5++;
            } else if (i9 == 3) {
                int i10 = i4 << 6;
                int i11 = i5 + 1;
                bArr[i5] = (byte) (i10 >> 16);
                i5 = i11 + 1;
                bArr[i11] = (byte) (i10 >> 8);
            }
            if (i5 == i2) {
                return bArr;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i5);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) copyOf, "");
            return copyOf;
        }
        return null;
    }

    public static /* synthetic */ String setIconTintList(byte[] bArr) {
        byte[] bArr2 = setX;
        pN.setY(bArr, "");
        pN.setY(bArr2, "");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) << 2];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            byte b3 = bArr[i4];
            int i5 = i2 + 1;
            bArr3[i2] = bArr2[(b & 255) >> 2];
            int i6 = i5 + 1;
            bArr3[i5] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i7 + 1;
            bArr3[i7] = bArr2[b3 & 63];
            i = i4 + 1;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i8 = i2 + 1;
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            int i9 = i8 + 1;
            bArr3[i8] = bArr2[(b4 & 3) << 4];
            bArr3[i9] = 61;
            bArr3[i9 + 1] = 61;
        } else if (length2 == 2) {
            byte b5 = bArr[i];
            byte b6 = bArr[i + 1];
            int i10 = i2 + 1;
            bArr3[i2] = bArr2[(b5 & 255) >> 2];
            int i11 = i10 + 1;
            bArr3[i10] = bArr2[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i11] = bArr2[(b6 & 15) << 2];
            bArr3[i11 + 1] = 61;
        }
        pN.setY(bArr3, "");
        return new String(bArr3, qQ.setIconTintList);
    }
}