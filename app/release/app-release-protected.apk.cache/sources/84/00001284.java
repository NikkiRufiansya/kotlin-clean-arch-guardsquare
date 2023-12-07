package o;

/* loaded from: classes.dex */
public final class wH {
    public int MenuHostHelper$$ExternalSyntheticLambda0;
    public final int[] setY = new int[10];

    static {
        new setY((byte) 0);
    }

    public final wH setIconTintList(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.setY;
            if (i < iArr.length) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = (1 << i) | this.MenuHostHelper$$ExternalSyntheticLambda0;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* loaded from: classes.dex */
    public static final class setY {
        private setY() {
        }

        public /* synthetic */ setY(byte b) {
            this();
        }
    }

    public final void setY(wH wHVar) {
        pN.setY(wHVar, "");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & wHVar.MenuHostHelper$$ExternalSyntheticLambda0) != 0) {
                setIconTintList(i, wHVar.setY[i]);
            }
        }
    }
}