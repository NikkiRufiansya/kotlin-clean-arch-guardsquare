package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class setLabelVisibilityMode extends setDataDirectorySuffix<Integer> implements setSelectedGroup, RandomAccess, setAutofillId {
    private int[] MenuHostHelper$$ExternalSyntheticLambda1;
    private int setIconTintList;

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        setIconTintList();
        if (i < 0 || i > (i2 = this.setIconTintList)) {
            throw new IndexOutOfBoundsException(setIconTintList(i));
        }
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.MenuHostHelper$$ExternalSyntheticLambda1, i, iArr2, i + 1, this.setIconTintList - i);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = iArr2;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1[i] = intValue;
        this.setIconTintList++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        MenuHostHelper$$ExternalSyntheticLambda0(((Integer) obj).intValue());
        return true;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        setIconTintList();
        if (i >= 0 && i < this.setIconTintList) {
            int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
            int i2 = iArr[i];
            iArr[i] = intValue;
            return Integer.valueOf(i2);
        }
        throw new IndexOutOfBoundsException(setIconTintList(i));
    }

    static {
        new setLabelVisibilityMode(new int[0], 0).setX();
    }

    setLabelVisibilityMode() {
        this(new int[10], 0);
    }

    private setLabelVisibilityMode(int[] iArr, int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = iArr;
        this.setIconTintList = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        setIconTintList();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
        System.arraycopy(iArr, i2, iArr, i, this.setIconTintList - i2);
        this.setIconTintList -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setLabelVisibilityMode)) {
            return super.equals(obj);
        }
        setLabelVisibilityMode setlabelvisibilitymode = (setLabelVisibilityMode) obj;
        if (this.setIconTintList != setlabelvisibilitymode.setIconTintList) {
            return false;
        }
        int[] iArr = setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda1;
        for (int i = 0; i < this.setIconTintList; i++) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.setIconTintList; i2++) {
            i = (i * 31) + this.MenuHostHelper$$ExternalSyntheticLambda1[i2];
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.setIconTintList;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        setIconTintList();
        int i2 = this.setIconTintList;
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = iArr2;
        }
        int[] iArr3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int i3 = this.setIconTintList;
        this.setIconTintList = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        setIconTintList();
        setViewCacheExtension.setIconTintList(collection);
        if (!(collection instanceof setLabelVisibilityMode)) {
            return super.addAll(collection);
        }
        setLabelVisibilityMode setlabelvisibilitymode = (setLabelVisibilityMode) collection;
        int i = setlabelvisibilitymode.setIconTintList;
        if (i == 0) {
            return false;
        }
        int i2 = this.setIconTintList;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (i3 > iArr.length) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(setlabelvisibilitymode.MenuHostHelper$$ExternalSyntheticLambda1, 0, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setIconTintList, setlabelvisibilitymode.setIconTintList);
        this.setIconTintList = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        setIconTintList();
        for (int i = 0; i < this.setIconTintList; i++) {
            if (obj.equals(Integer.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda1[i]))) {
                int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
                System.arraycopy(iArr, i + 1, iArr, i, (this.setIconTintList - i) - 1);
                this.setIconTintList--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    private String setIconTintList(int i) {
        StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.setIconTintList);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        if (i >= 0 && i < this.setIconTintList) {
            return Integer.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda1[i]);
        }
        throw new IndexOutOfBoundsException(setIconTintList(i));
    }

    public final int setY(int i) {
        if (i >= 0 && i < this.setIconTintList) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1[i];
        }
        throw new IndexOutOfBoundsException(setIconTintList(i));
    }

    @Override // o.setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1
    public final /* synthetic */ setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1 setX(int i) {
        if (i < this.setIconTintList) {
            throw new IllegalArgumentException();
        }
        return new setLabelVisibilityMode(Arrays.copyOf(this.MenuHostHelper$$ExternalSyntheticLambda1, i), this.setIconTintList);
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        setIconTintList();
        if (i >= 0 && i < (i2 = this.setIconTintList)) {
            int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
            int i3 = iArr[i];
            if (i < i2 - 1) {
                System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
            }
            this.setIconTintList--;
            ((AbstractList) this).modCount++;
            return Integer.valueOf(i3);
        }
        throw new IndexOutOfBoundsException(setIconTintList(i));
    }
}