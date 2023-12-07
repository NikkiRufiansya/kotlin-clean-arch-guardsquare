package o;

import java.util.TimeZone;

/* loaded from: classes.dex */
public final class hM {
    private static final TimeZone setX = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Removed duplicated region for block: B:116:0x01fb A[Catch: IllegalArgumentException -> 0x0203, NumberFormatException -> 0x0205, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x0207, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x0207, blocks: (B:3:0x0004, B:5:0x0017, B:10:0x0022, B:11:0x0024, B:13:0x0030, B:18:0x003b, B:19:0x003d, B:21:0x0049, B:26:0x0056, B:28:0x005c, B:32:0x0071, B:34:0x0081, B:39:0x008c, B:40:0x008e, B:42:0x009a, B:47:0x00a5, B:48:0x00a7, B:50:0x00ad, B:54:0x00b7, B:59:0x00c7, B:61:0x00cd, B:66:0x00da, B:67:0x00de, B:69:0x00e4, B:73:0x00f0, B:76:0x00fb, B:79:0x010a, B:85:0x0117, B:87:0x011d, B:89:0x0124, B:114:0x01ca, B:94:0x0130, B:95:0x0148, B:96:0x0149, B:100:0x0165, B:102:0x0172, B:105:0x017b, B:107:0x0197, B:110:0x01a6, B:111:0x01c5, B:113:0x01c8, B:99:0x0154, B:116:0x01fb, B:117:0x0202, B:80:0x010d, B:75:0x00f7), top: B:133:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011d A[Catch: IllegalArgumentException -> 0x0203, NumberFormatException -> 0x0205, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x0207, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x0207, blocks: (B:3:0x0004, B:5:0x0017, B:10:0x0022, B:11:0x0024, B:13:0x0030, B:18:0x003b, B:19:0x003d, B:21:0x0049, B:26:0x0056, B:28:0x005c, B:32:0x0071, B:34:0x0081, B:39:0x008c, B:40:0x008e, B:42:0x009a, B:47:0x00a5, B:48:0x00a7, B:50:0x00ad, B:54:0x00b7, B:59:0x00c7, B:61:0x00cd, B:66:0x00da, B:67:0x00de, B:69:0x00e4, B:73:0x00f0, B:76:0x00fb, B:79:0x010a, B:85:0x0117, B:87:0x011d, B:89:0x0124, B:114:0x01ca, B:94:0x0130, B:95:0x0148, B:96:0x0149, B:100:0x0165, B:102:0x0172, B:105:0x017b, B:107:0x0197, B:110:0x01a6, B:111:0x01c5, B:113:0x01c8, B:99:0x0154, B:116:0x01fb, B:117:0x0202, B:80:0x010d, B:75:0x00f7), top: B:133:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date MenuHostHelper$$ExternalSyntheticLambda1(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.hM.MenuHostHelper$$ExternalSyntheticLambda1(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int MenuHostHelper$$ExternalSyntheticLambda1(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                StringBuilder sb = new StringBuilder("Invalid number: ");
                sb.append(str.substring(i, i2));
                throw new NumberFormatException(sb.toString());
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                StringBuilder sb2 = new StringBuilder("Invalid number: ");
                sb2.append(str.substring(i, i2));
                throw new NumberFormatException(sb2.toString());
            }
            i3 = (i3 * 10) - digit2;
            i4++;
        }
        return -i3;
    }
}