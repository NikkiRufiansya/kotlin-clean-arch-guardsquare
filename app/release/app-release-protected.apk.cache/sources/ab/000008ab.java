package o;

import java.util.Iterator;

/* renamed from: o.rd */
/* loaded from: classes.dex */
public class C0424rd extends qZ {
    public static final String MenuHostHelper$$ExternalSyntheticLambda0(String str, String str2, String str3, boolean z) {
        pN.setY(str, "");
        pN.setY(str2, "");
        pN.setY(str3, "");
        String str4 = str;
        int x = qR.setX((CharSequence) str4, str2, 0, false);
        if (x < 0) {
            return str;
        }
        int length = str2.length();
        int i = length <= 0 ? 1 : length;
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str4, i2, x);
            sb.append(str3);
            i2 = x + length;
            if (x >= str.length()) {
                break;
            }
            x = qR.setX((CharSequence) str4, str2, x + i, false);
        } while (x > 0);
        sb.append((CharSequence) str4, i2, str.length());
        String obj = sb.toString();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) obj, "");
        return obj;
    }

    public static final boolean setX(String str, String str2, boolean z) {
        pN.setY(str, "");
        pN.setY(str2, "");
        if (!z) {
            return str.startsWith(str2);
        }
        return qR.MenuHostHelper$$ExternalSyntheticLambda1(str, 0, str2, 0, str2.length(), z);
    }

    public static final boolean setX(String str, String str2, int i, boolean z) {
        pN.setY(str, "");
        pN.setY(str2, "");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return qR.MenuHostHelper$$ExternalSyntheticLambda1(str, i, str2, 0, str2.length(), z);
    }

    public static final boolean MenuHostHelper$$ExternalSyntheticLambda1(CharSequence charSequence) {
        boolean z;
        boolean z2;
        pN.setY(charSequence, "");
        if (charSequence.length() != 0) {
            pN.setY(charSequence, "");
            Iterator<Integer> it = new C0405ql(0, charSequence.length() - 1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                char charAt = charSequence.charAt(((AbstractC0364oy) it).setY());
                if (Character.isWhitespace(charAt) || Character.isSpaceChar(charAt)) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (!z2) {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static final boolean MenuHostHelper$$ExternalSyntheticLambda1(String str, int i, String str2, int i2, int i3, boolean z) {
        pN.setY(str, "");
        pN.setY(str2, "");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }
}