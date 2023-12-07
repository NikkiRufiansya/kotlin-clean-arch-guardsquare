package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class setCollapsible<E> extends setDataDirectorySuffix<E> implements RandomAccess {
    private static final setCollapsible<Object> setY;
    private E[] MenuHostHelper$$ExternalSyntheticLambda0;
    private int setIconTintList;

    static {
        setCollapsible<Object> setcollapsible = new setCollapsible<>(new Object[0], 0);
        setY = setcollapsible;
        setcollapsible.setX();
    }

    public static <E> setCollapsible<E> MenuHostHelper$$ExternalSyntheticLambda1() {
        return (setCollapsible<E>) setY;
    }

    setCollapsible() {
        this(new Object[10], 0);
    }

    private setCollapsible(E[] eArr, int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = eArr;
        this.setIconTintList = i;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        setIconTintList();
        int i = this.setIconTintList;
        E[] eArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i == eArr.length) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int i2 = this.setIconTintList;
        this.setIconTintList = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        setIconTintList();
        if (i < 0 || i > (i2 = this.setIconTintList)) {
            throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda0(i));
        }
        E[] eArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.MenuHostHelper$$ExternalSyntheticLambda0, i, eArr2, i + 1, this.setIconTintList - i);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = eArr2;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0[i] = e;
        this.setIconTintList++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        setIconTintList();
        if (i >= 0 && i < (i2 = this.setIconTintList)) {
            E[] eArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            E e = eArr[i];
            if (i < i2 - 1) {
                System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
            }
            this.setIconTintList--;
            ((AbstractList) this).modCount++;
            return e;
        }
        throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda0(i));
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        setIconTintList();
        if (i >= 0 && i < this.setIconTintList) {
            E[] eArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            E e2 = eArr[i];
            eArr[i] = e;
            ((AbstractList) this).modCount++;
            return e2;
        }
        throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda0(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.setIconTintList;
    }

    private String MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.setIconTintList);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        if (i >= 0 && i < this.setIconTintList) {
            return this.MenuHostHelper$$ExternalSyntheticLambda0[i];
        }
        throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda0(i));
    }

    @Override // o.setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1
    public final /* synthetic */ setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1 setX(int i) {
        if (i < this.setIconTintList) {
            throw new IllegalArgumentException();
        }
        return new setCollapsible(Arrays.copyOf(this.MenuHostHelper$$ExternalSyntheticLambda0, i), this.setIconTintList);
    }
}