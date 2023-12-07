package o;

import o.C0610xu;

/* renamed from: o.wz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0586wz {
    private static final String[] MenuHostHelper$$ExternalSyntheticLambda0;
    private static final String[] MenuHostHelper$$ExternalSyntheticLambda1;
    private static final String[] setIconTintList;
    public static final C0586wz setX = new C0586wz();
    public static final C0610xu setY;

    static {
        C0610xu.setX setx = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
        pN.setY("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n", "");
        pN.setY("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n", "");
        byte[] bytes = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n".getBytes(qQ.setIconTintList);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) bytes, "");
        C0610xu c0610xu = new C0610xu(bytes);
        c0610xu.setX = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n";
        setY = c0610xu;
        MenuHostHelper$$ExternalSyntheticLambda0 = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        MenuHostHelper$$ExternalSyntheticLambda1 = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) binaryString, "");
            String MenuHostHelper$$ExternalSyntheticLambda12 = vL.MenuHostHelper$$ExternalSyntheticLambda1("%8s", binaryString);
            pN.setY(MenuHostHelper$$ExternalSyntheticLambda12, "");
            String replace = MenuHostHelper$$ExternalSyntheticLambda12.replace(' ', '0');
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) replace, "");
            strArr[i] = replace;
        }
        setIconTintList = strArr;
        String[] strArr2 = MenuHostHelper$$ExternalSyntheticLambda1;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = pN.MenuHostHelper$$ExternalSyntheticLambda0(strArr2[i2], (Object) "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = MenuHostHelper$$ExternalSyntheticLambda1;
            int i6 = i5 | i4;
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append("|");
            sb.append(strArr3[i4]);
            strArr3[i6] = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i5]);
            sb2.append("|");
            sb2.append(strArr3[i4]);
            sb2.append("|PADDED");
            strArr3[i6 | 8] = sb2.toString();
        }
        int length = MenuHostHelper$$ExternalSyntheticLambda1.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = MenuHostHelper$$ExternalSyntheticLambda1;
            if (strArr4[i7] == null) {
                strArr4[i7] = setIconTintList[i7];
            }
        }
    }

    private C0586wz() {
    }

    public static String setY(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String str2;
        String x = setX(i3);
        if (i4 == 0) {
            str = "";
        } else {
            if (i3 != 2 && i3 != 3) {
                if (i3 == 4 || i3 == 6) {
                    str = i4 == 1 ? "ACK" : setIconTintList[i4];
                } else if (i3 != 7 && i3 != 8) {
                    String[] strArr = MenuHostHelper$$ExternalSyntheticLambda1;
                    if (i4 < strArr.length) {
                        str2 = strArr[i4];
                        pN.setX((Object) str2);
                    } else {
                        str2 = setIconTintList[i4];
                    }
                    if (i3 == 5 && (i4 & 4) != 0) {
                        str = qR.MenuHostHelper$$ExternalSyntheticLambda0(str2, "HEADERS", "PUSH_PROMISE", false);
                    } else {
                        str = (i3 != 0 || (i4 & 32) == 0) ? str2 : qR.MenuHostHelper$$ExternalSyntheticLambda0(str2, "PRIORITY", "COMPRESSED", false);
                    }
                }
            }
            str = setIconTintList[i4];
        }
        return vL.MenuHostHelper$$ExternalSyntheticLambda1("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), x, str);
    }

    public static String setX(int i) {
        String[] strArr = MenuHostHelper$$ExternalSyntheticLambda0;
        return i < strArr.length ? strArr[i] : vL.MenuHostHelper$$ExternalSyntheticLambda1("0x%02x", Integer.valueOf(i));
    }
}