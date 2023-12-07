package o;

/* loaded from: classes.dex */
class Counter$1$MenuHostHelper$$ExternalSyntheticLambda1 {
    public final int MenuHostHelper$$ExternalSyntheticLambda0;
    public final String MenuHostHelper$$ExternalSyntheticLambda1;
    public final int setIconTintList;
    public final int setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Counter$1$MenuHostHelper$$ExternalSyntheticLambda1(String str, int i, int i2) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        this.setY = i;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i2;
        this.setIconTintList = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Counter$1$MenuHostHelper$$ExternalSyntheticLambda1(String str, int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        this.setY = i;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 3;
        this.setIconTintList = 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        int i2;
        int i3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i3 == 7 || i == 7 || i3 == i || (i2 = this.setIconTintList) == i) {
            return true;
        }
        if ((i3 == 4 || i2 == 4) && i == 3) {
            return true;
        }
        if ((i3 == 9 || i2 == 9) && i == 8) {
            return true;
        }
        return (i3 == 12 || i2 == 12) && i == 11;
    }
}