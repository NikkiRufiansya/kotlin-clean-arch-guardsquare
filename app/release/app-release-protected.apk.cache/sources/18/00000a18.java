package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class setChipEndPaddingResource extends setDataDirectorySuffix<Long> implements ObjectWrapper, RandomAccess, setAutofillId {
    private long[] setIconTintList;
    private int setX;

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        setIconTintList();
        if (i < 0 || i > (i2 = this.setX)) {
            throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda0(i));
        }
        long[] jArr = this.setIconTintList;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.setIconTintList, i, jArr2, i + 1, this.setX - i);
            this.setIconTintList = jArr2;
        }
        this.setIconTintList[i] = longValue;
        this.setX++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        setIconTintList(((Long) obj).longValue());
        return true;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        setIconTintList();
        if (i >= 0 && i < this.setX) {
            long[] jArr = this.setIconTintList;
            long j = jArr[i];
            jArr[i] = longValue;
            return Long.valueOf(j);
        }
        throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda0(i));
    }

    static {
        new setChipEndPaddingResource(new long[0], 0).setX();
    }

    setChipEndPaddingResource() {
        this(new long[10], 0);
    }

    private setChipEndPaddingResource(long[] jArr, int i) {
        this.setIconTintList = jArr;
        this.setX = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        setIconTintList();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.setIconTintList;
        System.arraycopy(jArr, i2, jArr, i, this.setX - i2);
        this.setX -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setChipEndPaddingResource)) {
            return super.equals(obj);
        }
        setChipEndPaddingResource setchipendpaddingresource = (setChipEndPaddingResource) obj;
        if (this.setX != setchipendpaddingresource.setX) {
            return false;
        }
        long[] jArr = setchipendpaddingresource.setIconTintList;
        for (int i = 0; i < this.setX; i++) {
            if (this.setIconTintList[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.setX; i2++) {
            i = (i * 31) + setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.setX;
    }

    public final void setIconTintList(long j) {
        setIconTintList();
        int i = this.setX;
        long[] jArr = this.setIconTintList;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.setIconTintList = jArr2;
        }
        long[] jArr3 = this.setIconTintList;
        int i2 = this.setX;
        this.setX = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        setIconTintList();
        setViewCacheExtension.setIconTintList(collection);
        if (!(collection instanceof setChipEndPaddingResource)) {
            return super.addAll(collection);
        }
        setChipEndPaddingResource setchipendpaddingresource = (setChipEndPaddingResource) collection;
        int i = setchipendpaddingresource.setX;
        if (i == 0) {
            return false;
        }
        int i2 = this.setX;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.setIconTintList;
        if (i3 > jArr.length) {
            this.setIconTintList = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(setchipendpaddingresource.setIconTintList, 0, this.setIconTintList, this.setX, setchipendpaddingresource.setX);
        this.setX = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        setIconTintList();
        for (int i = 0; i < this.setX; i++) {
            if (obj.equals(Long.valueOf(this.setIconTintList[i]))) {
                long[] jArr = this.setIconTintList;
                System.arraycopy(jArr, i + 1, jArr, i, (this.setX - i) - 1);
                this.setX--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    private String MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.setX);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        if (i >= 0 && i < this.setX) {
            return Long.valueOf(this.setIconTintList[i]);
        }
        throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda0(i));
    }

    public final long MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        if (i >= 0 && i < this.setX) {
            return this.setIconTintList[i];
        }
        throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda0(i));
    }

    @Override // o.setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1
    public final /* synthetic */ setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1 setX(int i) {
        if (i < this.setX) {
            throw new IllegalArgumentException();
        }
        return new setChipEndPaddingResource(Arrays.copyOf(this.setIconTintList, i), this.setX);
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        setIconTintList();
        if (i >= 0 && i < (i2 = this.setX)) {
            long[] jArr = this.setIconTintList;
            long j = jArr[i];
            if (i < i2 - 1) {
                System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
            }
            this.setX--;
            ((AbstractList) this).modCount++;
            return Long.valueOf(j);
        }
        throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda0(i));
    }
}