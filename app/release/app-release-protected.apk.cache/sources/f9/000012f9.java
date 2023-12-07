package o;

/* loaded from: classes.dex */
public final class xO {
    private static int setIconTintList(int[] iArr, int i, int i2, int i3) {
        pN.setY(iArr, "");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 <= i) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    public static final int setIconTintList(xH xHVar, int i) {
        pN.setY(xHVar, "");
        int iconTintList = setIconTintList(xHVar.setNavigationOnClickListener, i + 1, 0, xHVar.setLayoutAnimation.length);
        return iconTintList < 0 ? ~iconTintList : iconTintList;
    }
}