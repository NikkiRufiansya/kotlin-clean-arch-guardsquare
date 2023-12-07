package o;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class LinearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0 {
    final SparseArray<LinearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0> MenuHostHelper$$ExternalSyntheticLambda1;
    setFailureListener setIconTintList;

    private LinearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0() {
        this(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new SparseArray<>(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setFailureListener setfailurelistener, int i, int i2) {
        LinearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0 linearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0 = this;
        while (true) {
            int y = setfailurelistener.MenuHostHelper$$ExternalSyntheticLambda1().setY(i);
            SparseArray<LinearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0> sparseArray = linearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1;
            LinearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0 linearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda02 = sparseArray == null ? null : sparseArray.get(y);
            if (linearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda02 == null) {
                linearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda02 = new LinearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0();
                linearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.put(setfailurelistener.MenuHostHelper$$ExternalSyntheticLambda1().setY(i), linearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda02);
            }
            linearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0 = linearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda02;
            if (i2 <= i) {
                linearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList = setfailurelistener;
                return;
            }
            i++;
        }
    }
}