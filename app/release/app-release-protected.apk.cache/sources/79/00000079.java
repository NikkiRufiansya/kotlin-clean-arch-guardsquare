package androidx.recyclerview.widget;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
class StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0 {
    List<StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0> MenuHostHelper$$ExternalSyntheticLambda1;
    int[] setIconTintList;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        int[] iArr = this.setIconTintList;
        if (iArr != null && i < iArr.length) {
            int MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(i);
            if (MenuHostHelper$$ExternalSyntheticLambda1 == -1) {
                int[] iArr2 = this.setIconTintList;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.setIconTintList.length;
            }
            int i2 = MenuHostHelper$$ExternalSyntheticLambda1 + 1;
            Arrays.fill(this.setIconTintList, i, i2, -1);
            return i2;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(int i) {
        int[] iArr = this.setIconTintList;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.setIconTintList = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length <<= 1;
            }
            int[] iArr3 = new int[length];
            this.setIconTintList = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.setIconTintList;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2) {
        int[] iArr = this.setIconTintList;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        setX(i3);
        int[] iArr2 = this.setIconTintList;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = this.setIconTintList;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        setX(i, i2);
    }

    private void setX(int i, int i2) {
        List<StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0> list = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0 staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1.get(size);
            if (staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 >= i) {
                if (staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 < i + i2) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1.remove(size);
                } else {
                    staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 -= i2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
        int[] iArr = this.setIconTintList;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        setX(i3);
        int[] iArr2 = this.setIconTintList;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill(this.setIconTintList, i, i3, -1);
        setIconTintList(i, i2);
    }

    private void setIconTintList(int i, int i2) {
        List<StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0> list = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0 staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1.get(size);
            if (staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 >= i) {
                staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 += i2;
            }
        }
    }

    private int MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0 staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0;
        List<StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0> list = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (list == null) {
            return -1;
        }
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1.get(size);
                if (staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 == i) {
                    break;
                }
            }
        }
        staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0 = null;
        if (staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.remove(staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0);
        }
        int size2 = this.MenuHostHelper$$ExternalSyntheticLambda1.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                i2 = -1;
                break;
            } else if (this.MenuHostHelper$$ExternalSyntheticLambda1.get(i2).MenuHostHelper$$ExternalSyntheticLambda0 >= i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.remove(i2);
            return this.MenuHostHelper$$ExternalSyntheticLambda1.get(i2).MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return -1;
    }
}