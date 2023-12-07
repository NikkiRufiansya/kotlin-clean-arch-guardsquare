package o;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setFocusable$MenuHostHelper$$ExternalSyntheticLambda0 {
    LinearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda0;
    final LinearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1;
    LinearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0 setIconTintList;
    private final boolean setNavigationOnClickListener;
    int setUiOptions = 1;
    private final int[] setUnboundedRipple;
    int setX;
    int setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setFocusable$MenuHostHelper$$ExternalSyntheticLambda0(LinearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0 linearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0, boolean z, int[] iArr) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = linearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = linearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0;
        this.setNavigationOnClickListener = z;
        this.setUnboundedRipple = iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda0()) {
            return true;
        }
        if (this.setY == 65039) {
            return true;
        }
        if (this.setNavigationOnClickListener) {
            if (this.setUnboundedRipple == null) {
                return true;
            }
            if (Arrays.binarySearch(this.setUnboundedRipple, this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1().setY(0)) < 0) {
                return true;
            }
        }
        return false;
    }
}