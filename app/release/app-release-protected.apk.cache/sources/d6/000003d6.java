package o;

import android.util.SparseIntArray;

/* renamed from: o.dx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116dx {

    /* renamed from: o.dx$setIconTintList */
    /* loaded from: classes.dex */
    public static class setIconTintList {
        public int MenuHostHelper$$ExternalSyntheticLambda0;
        public int MenuHostHelper$$ExternalSyntheticLambda1;
        public int setIconTintList;

        public setIconTintList(int i, int i2, int i3) {
            this.setIconTintList = i;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i2;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i3;
        }
    }

    public static setIconTintList MenuHostHelper$$ExternalSyntheticLambda1(SparseIntArray[] sparseIntArrayArr) {
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        int i3 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i = 0;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
            int i4 = 0;
            while (i3 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i3);
                int valueAt = sparseIntArray.valueAt(i3);
                i4 += valueAt;
                if (keyAt > 700) {
                    i += valueAt;
                }
                if (keyAt > 16) {
                    i2 += valueAt;
                }
                i3++;
            }
            i3 = i4;
        }
        return new setIconTintList(i3, i2, i);
    }
}