package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import o.C0243ip;

/* renamed from: o.iy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0253iy extends hS<Long> implements InterfaceC0240im, RandomAccess, iM {
    private long[] MenuHostHelper$$ExternalSyntheticLambda0;
    private int setY;

    @Override // o.hS, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        setX();
        if (i < 0 || i > (i2 = this.setY)) {
            throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda0(i));
        }
        long[] jArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.MenuHostHelper$$ExternalSyntheticLambda0, i, jArr2, i + 1, this.setY - i);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = jArr2;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0[i] = longValue;
        this.setY++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.hS, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        setX();
        int i = this.setY;
        long[] jArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = jArr2;
        }
        long[] jArr3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int i2 = this.setY;
        this.setY = i2 + 1;
        jArr3[i2] = longValue;
        return true;
    }

    @Override // o.hS, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        setX();
        if (i >= 0 && i < this.setY) {
            long[] jArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            long j = jArr[i];
            jArr[i] = longValue;
            return Long.valueOf(j);
        }
        throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda0(i));
    }

    static {
        new C0253iy(new long[0], 0).MenuHostHelper$$ExternalSyntheticLambda0();
    }

    C0253iy() {
        this(new long[10], 0);
    }

    private C0253iy(long[] jArr, int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = jArr;
        this.setY = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        setX();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        System.arraycopy(jArr, i2, jArr, i, this.setY - i2);
        this.setY -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // o.hS, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0253iy)) {
            return super.equals(obj);
        }
        C0253iy c0253iy = (C0253iy) obj;
        if (this.setY != c0253iy.setY) {
            return false;
        }
        long[] jArr = c0253iy.MenuHostHelper$$ExternalSyntheticLambda0;
        for (int i = 0; i < this.setY; i++) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // o.hS, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.setY; i2++) {
            i = (i * 31) + C0243ip.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.MenuHostHelper$$ExternalSyntheticLambda0[i] == longValue) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.setY;
    }

    @Override // o.hS, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        setX();
        C0243ip.setIconTintList(collection);
        if (!(collection instanceof C0253iy)) {
            return super.addAll(collection);
        }
        C0253iy c0253iy = (C0253iy) collection;
        int i = c0253iy.setY;
        if (i == 0) {
            return false;
        }
        int i2 = this.setY;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i3 > jArr.length) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c0253iy.MenuHostHelper$$ExternalSyntheticLambda0, 0, this.MenuHostHelper$$ExternalSyntheticLambda0, this.setY, c0253iy.setY);
        this.setY = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    private String MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.setY);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        if (i >= 0 && i < this.setY) {
            return Long.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda0[i]);
        }
        throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda0(i));
    }

    public final long MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        if (i >= 0 && i < this.setY) {
            return this.MenuHostHelper$$ExternalSyntheticLambda0[i];
        }
        throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda0(i));
    }

    @Override // o.C0243ip.setY
    public final /* synthetic */ C0243ip.setY setX(int i) {
        if (i < this.setY) {
            throw new IllegalArgumentException();
        }
        return new C0253iy(Arrays.copyOf(this.MenuHostHelper$$ExternalSyntheticLambda0, i), this.setY);
    }

    @Override // o.hS, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        setX();
        if (i >= 0 && i < (i2 = this.setY)) {
            long[] jArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            long j = jArr[i];
            if (i < i2 - 1) {
                System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
            }
            this.setY--;
            ((AbstractList) this).modCount++;
            return Long.valueOf(j);
        }
        throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda0(i));
    }
}