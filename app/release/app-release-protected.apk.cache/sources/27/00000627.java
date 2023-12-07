package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import o.C0243ip;

/* renamed from: o.iq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244iq extends hS<Integer> implements C0243ip.setX, RandomAccess, iM {
    private static final C0244iq setY;
    private int[] MenuHostHelper$$ExternalSyntheticLambda0;
    private int MenuHostHelper$$ExternalSyntheticLambda1;

    @Override // o.hS, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        setX();
        if (i < 0 || i > (i2 = this.MenuHostHelper$$ExternalSyntheticLambda1)) {
            throw new IndexOutOfBoundsException(setY(i));
        }
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.MenuHostHelper$$ExternalSyntheticLambda0, i, iArr2, i + 1, this.MenuHostHelper$$ExternalSyntheticLambda1 - i);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = iArr2;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0[i] = intValue;
        this.MenuHostHelper$$ExternalSyntheticLambda1++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.hS, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        setIconTintList(((Integer) obj).intValue());
        return true;
    }

    @Override // o.hS, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        setX();
        if (i >= 0 && i < this.MenuHostHelper$$ExternalSyntheticLambda1) {
            int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            int i2 = iArr[i];
            iArr[i] = intValue;
            return Integer.valueOf(i2);
        }
        throw new IndexOutOfBoundsException(setY(i));
    }

    static {
        C0244iq c0244iq = new C0244iq(new int[0], 0);
        setY = c0244iq;
        c0244iq.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    C0244iq() {
        this(new int[10], 0);
    }

    private C0244iq(int[] iArr, int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = iArr;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        setX();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        System.arraycopy(iArr, i2, iArr, i, this.MenuHostHelper$$ExternalSyntheticLambda1 - i2);
        this.MenuHostHelper$$ExternalSyntheticLambda1 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // o.hS, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0244iq)) {
            return super.equals(obj);
        }
        C0244iq c0244iq = (C0244iq) obj;
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != c0244iq.MenuHostHelper$$ExternalSyntheticLambda1) {
            return false;
        }
        int[] iArr = c0244iq.MenuHostHelper$$ExternalSyntheticLambda0;
        for (int i = 0; i < this.MenuHostHelper$$ExternalSyntheticLambda1; i++) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // o.hS, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.MenuHostHelper$$ExternalSyntheticLambda1; i2++) {
            i = (i * 31) + this.MenuHostHelper$$ExternalSyntheticLambda0[i2];
        }
        return i;
    }

    @Override // o.C0243ip.setY
    /* renamed from: MenuHostHelper$$ExternalSyntheticLambda1 */
    public final C0243ip.setX setX(int i) {
        if (i < this.MenuHostHelper$$ExternalSyntheticLambda1) {
            throw new IllegalArgumentException();
        }
        return new C0244iq(Arrays.copyOf(this.MenuHostHelper$$ExternalSyntheticLambda0, i), this.MenuHostHelper$$ExternalSyntheticLambda1);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.MenuHostHelper$$ExternalSyntheticLambda0[i] == intValue) {
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
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.C0243ip.setX
    public final void setIconTintList(int i) {
        setX();
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = iArr2;
        }
        int[] iArr3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int i3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // o.hS, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        setX();
        C0243ip.setIconTintList(collection);
        if (!(collection instanceof C0244iq)) {
            return super.addAll(collection);
        }
        C0244iq c0244iq = (C0244iq) collection;
        int i = c0244iq.MenuHostHelper$$ExternalSyntheticLambda1;
        if (i == 0) {
            return false;
        }
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i3 > iArr.length) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c0244iq.MenuHostHelper$$ExternalSyntheticLambda0, 0, this.MenuHostHelper$$ExternalSyntheticLambda0, this.MenuHostHelper$$ExternalSyntheticLambda1, c0244iq.MenuHostHelper$$ExternalSyntheticLambda1);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    private String setY(int i) {
        StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        if (i >= 0 && i < this.MenuHostHelper$$ExternalSyntheticLambda1) {
            return Integer.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda0[i]);
        }
        throw new IndexOutOfBoundsException(setY(i));
    }

    @Override // o.C0243ip.setX
    public final int MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        if (i >= 0 && i < this.MenuHostHelper$$ExternalSyntheticLambda1) {
            return this.MenuHostHelper$$ExternalSyntheticLambda0[i];
        }
        throw new IndexOutOfBoundsException(setY(i));
    }

    @Override // o.hS, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        setX();
        if (i >= 0 && i < (i2 = this.MenuHostHelper$$ExternalSyntheticLambda1)) {
            int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            int i3 = iArr[i];
            if (i < i2 - 1) {
                System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1--;
            ((AbstractList) this).modCount++;
            return Integer.valueOf(i3);
        }
        throw new IndexOutOfBoundsException(setY(i));
    }
}