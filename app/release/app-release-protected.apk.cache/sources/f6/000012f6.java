package o;

/* loaded from: classes.dex */
public final class xL {
    private static final char[] MenuHostHelper$$ExternalSyntheticLambda0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final char[] setX() {
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0121, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x01af, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0062, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00aa, code lost:
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ int MenuHostHelper$$ExternalSyntheticLambda1(byte[] r18) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.xL.MenuHostHelper$$ExternalSyntheticLambda1(byte[]):int");
    }

    public static final /* synthetic */ int setX(char c) {
        if ('0' > c || '9' < c) {
            char c2 = 'A';
            if ('a' <= c && 'f' >= c) {
                c2 = 'a';
            } else if ('A' > c || 'F' < c) {
                StringBuilder sb = new StringBuilder("Unexpected hex digit: ");
                sb.append(c);
                throw new IllegalArgumentException(sb.toString());
            }
            return (c - c2) + 10;
        }
        return c - '0';
    }

    public static final void setIconTintList(C0610xu c0610xu, C0602xo c0602xo, int i, int i2) {
        pN.setY(c0610xu, "");
        pN.setY(c0602xo, "");
        c0602xo.setY(c0610xu.setIconTintList, 0, i2);
    }
}