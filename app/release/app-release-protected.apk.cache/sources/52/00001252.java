package o;

/* loaded from: classes.dex */
public final class vx$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda1 {
    private vx$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda1() {
    }

    public /* synthetic */ vx$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda1(byte b) {
        this();
    }

    public static int setX(String str, int i, int i2) {
        if (i2 - i < 2) {
            return -1;
        }
        char charAt = str.charAt(i);
        if ((pN.MenuHostHelper$$ExternalSyntheticLambda0((int) charAt, 97) < 0 || pN.MenuHostHelper$$ExternalSyntheticLambda0((int) charAt, 122) > 0) && (pN.MenuHostHelper$$ExternalSyntheticLambda0((int) charAt, 65) < 0 || pN.MenuHostHelper$$ExternalSyntheticLambda0((int) charAt, 90) > 0)) {
            return -1;
        }
        while (true) {
            i++;
            if (i >= i2) {
                return -1;
            }
            char charAt2 = str.charAt(i);
            if ('a' > charAt2 || 'z' < charAt2) {
                if ('A' > charAt2 || 'Z' < charAt2) {
                    if ('0' > charAt2 || '9' < charAt2) {
                        if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                            if (charAt2 == ':') {
                                return i;
                            }
                            return -1;
                        }
                    }
                }
            }
        }
    }

    public static int setIconTintList(String str, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\\' && charAt != '/') {
                break;
            }
            i3++;
            i++;
        }
        return i3;
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt == ':') {
                return i;
            }
            if (charAt == '[') {
                do {
                    i++;
                    if (i < i2) {
                    }
                } while (str.charAt(i) != ']');
            }
            i++;
        }
        return i2;
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda0(String str, int i, int i2) {
        String MenuHostHelper$$ExternalSyntheticLambda0;
        try {
            MenuHostHelper$$ExternalSyntheticLambda0 = C0555vx.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(str, (r23 & 1) != 0 ? 0 : i, (r23 & 2) != 0 ? str.length() : i2, "", (r23 & 8) != 0 ? false : false, (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : false, (r23 & 64) != 0 ? false : false, (r23 & 128) != 0 ? null : null);
            int parseInt = Integer.parseInt(MenuHostHelper$$ExternalSyntheticLambda0);
            if (parseInt > 0 && 65535 >= parseInt) {
                return parseInt;
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}