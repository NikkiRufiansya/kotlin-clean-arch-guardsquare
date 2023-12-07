package o;

/* renamed from: o.hs  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220hs {
    private static final int MenuHostHelper$$ExternalSyntheticLambda1;

    private static int setX(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private static int MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int setX() {
        return MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public static boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return MenuHostHelper$$ExternalSyntheticLambda1 >= 9;
    }

    static {
        String property = System.getProperty("java.version");
        int x = setX(property);
        if (x == -1) {
            x = MenuHostHelper$$ExternalSyntheticLambda0(property);
        }
        if (x == -1) {
            x = 6;
        }
        MenuHostHelper$$ExternalSyntheticLambda1 = x;
    }
}