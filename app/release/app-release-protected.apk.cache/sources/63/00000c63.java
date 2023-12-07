package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class setIconStartPaddingResource extends setDataDirectorySuffix<Boolean> implements setProgressTintList, RandomAccess, setAutofillId {
    private boolean[] setIconTintList;
    private int setX;

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        setIconTintList();
        if (i < 0 || i > (i2 = this.setX)) {
            throw new IndexOutOfBoundsException(setIconTintList(i));
        }
        boolean[] zArr = this.setIconTintList;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.setIconTintList, i, zArr2, i + 1, this.setX - i);
            this.setIconTintList = zArr2;
        }
        this.setIconTintList[i] = booleanValue;
        this.setX++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        setY(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        setIconTintList();
        if (i >= 0 && i < this.setX) {
            boolean[] zArr = this.setIconTintList;
            boolean z = zArr[i];
            zArr[i] = booleanValue;
            return Boolean.valueOf(z);
        }
        throw new IndexOutOfBoundsException(setIconTintList(i));
    }

    static {
        new setIconStartPaddingResource(new boolean[0], 0).setX();
    }

    setIconStartPaddingResource() {
        this(new boolean[10], 0);
    }

    private setIconStartPaddingResource(boolean[] zArr, int i) {
        this.setIconTintList = zArr;
        this.setX = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        setIconTintList();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.setIconTintList;
        System.arraycopy(zArr, i2, zArr, i, this.setX - i2);
        this.setX -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setIconStartPaddingResource)) {
            return super.equals(obj);
        }
        setIconStartPaddingResource seticonstartpaddingresource = (setIconStartPaddingResource) obj;
        if (this.setX != seticonstartpaddingresource.setX) {
            return false;
        }
        boolean[] zArr = seticonstartpaddingresource.setIconTintList;
        for (int i = 0; i < this.setX; i++) {
            if (this.setIconTintList[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.setX; i2++) {
            i = (i * 31) + setViewCacheExtension.setIconTintList(this.setIconTintList[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.setX;
    }

    public final void setY(boolean z) {
        setIconTintList();
        int i = this.setX;
        boolean[] zArr = this.setIconTintList;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.setIconTintList = zArr2;
        }
        boolean[] zArr3 = this.setIconTintList;
        int i2 = this.setX;
        this.setX = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        setIconTintList();
        setViewCacheExtension.setIconTintList(collection);
        if (!(collection instanceof setIconStartPaddingResource)) {
            return super.addAll(collection);
        }
        setIconStartPaddingResource seticonstartpaddingresource = (setIconStartPaddingResource) collection;
        int i = seticonstartpaddingresource.setX;
        if (i == 0) {
            return false;
        }
        int i2 = this.setX;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.setIconTintList;
        if (i3 > zArr.length) {
            this.setIconTintList = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(seticonstartpaddingresource.setIconTintList, 0, this.setIconTintList, this.setX, seticonstartpaddingresource.setX);
        this.setX = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        setIconTintList();
        for (int i = 0; i < this.setX; i++) {
            if (obj.equals(Boolean.valueOf(this.setIconTintList[i]))) {
                boolean[] zArr = this.setIconTintList;
                System.arraycopy(zArr, i + 1, zArr, i, (this.setX - i) - 1);
                this.setX--;
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
        sb.append(this.setX);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        if (i >= 0 && i < this.setX) {
            return Boolean.valueOf(this.setIconTintList[i]);
        }
        throw new IndexOutOfBoundsException(setIconTintList(i));
    }

    @Override // o.setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1
    public final /* synthetic */ setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1 setX(int i) {
        if (i < this.setX) {
            throw new IllegalArgumentException();
        }
        return new setIconStartPaddingResource(Arrays.copyOf(this.setIconTintList, i), this.setX);
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        setIconTintList();
        if (i >= 0 && i < (i2 = this.setX)) {
            boolean[] zArr = this.setIconTintList;
            boolean z = zArr[i];
            if (i < i2 - 1) {
                System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
            }
            this.setX--;
            ((AbstractList) this).modCount++;
            return Boolean.valueOf(z);
        }
        throw new IndexOutOfBoundsException(setIconTintList(i));
    }
}