package o;

/* loaded from: classes.dex */
public final class jy {
    public int MenuHostHelper$$ExternalSyntheticLambda0;
    public int MenuHostHelper$$ExternalSyntheticLambda1;
    public int setY;

    public static void setY(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int setIconTintList(int i) {
        jl jlVar = jl.MenuHostHelper$$ExternalSyntheticLambda0;
        return ((jlVar.setY[0][(i >>> 24) & 255] + jlVar.setY[1][(i >>> 16) & 255]) ^ jlVar.setY[2][(i >>> 8) & 255]) + jlVar.setY[3][i & 255];
    }
}