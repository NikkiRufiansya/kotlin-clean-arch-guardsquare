package okhttp3.internal.publicsuffix;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import o.pN;
import o.vL;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase$MenuHostHelper$$ExternalSyntheticLambda0 {
    private PublicSuffixDatabase$MenuHostHelper$$ExternalSyntheticLambda0() {
    }

    public /* synthetic */ PublicSuffixDatabase$MenuHostHelper$$ExternalSyntheticLambda0(byte b) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String MenuHostHelper$$ExternalSyntheticLambda1(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int MenuHostHelper$$ExternalSyntheticLambda1;
        int MenuHostHelper$$ExternalSyntheticLambda12;
        int length = bArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = (i3 + length) / 2;
            while (i4 >= 0 && bArr[i4] != 10) {
                i4--;
            }
            int i5 = i4 + 1;
            int i6 = 1;
            while (true) {
                i2 = i5 + i6;
                if (bArr[i2] == 10) {
                    break;
                }
                i6++;
            }
            int i7 = i2 - i5;
            int i8 = i;
            boolean z2 = false;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                if (z2) {
                    MenuHostHelper$$ExternalSyntheticLambda1 = 46;
                    z = false;
                } else {
                    z = z2;
                    MenuHostHelper$$ExternalSyntheticLambda1 = vL.MenuHostHelper$$ExternalSyntheticLambda1(bArr2[i8][i9]);
                }
                MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1 - vL.MenuHostHelper$$ExternalSyntheticLambda1(bArr[i5 + i10]);
                if (MenuHostHelper$$ExternalSyntheticLambda12 != 0) {
                    break;
                }
                i10++;
                i9++;
                if (i10 == i7) {
                    break;
                } else if (bArr2[i8].length != i9) {
                    z2 = z;
                } else if (i8 == bArr2.length - 1) {
                    break;
                } else {
                    i8++;
                    z2 = true;
                    i9 = -1;
                }
            }
            if (MenuHostHelper$$ExternalSyntheticLambda12 >= 0) {
                if (MenuHostHelper$$ExternalSyntheticLambda12 <= 0) {
                    int i11 = i7 - i10;
                    int length2 = bArr2[i8].length - i9;
                    int length3 = bArr2.length;
                    for (int i12 = i8 + 1; i12 < length3; i12++) {
                        length2 += bArr2[i12].length;
                    }
                    if (length2 >= i11) {
                        if (length2 <= i11) {
                            Charset charset = StandardCharsets.UTF_8;
                            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) charset, "");
                            return new String(bArr, i5, i7, charset);
                        }
                    }
                }
                i3 = i2 + 1;
            }
            length = i5 - 1;
        }
        return null;
    }
}