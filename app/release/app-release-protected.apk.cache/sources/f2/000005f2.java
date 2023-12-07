package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import o.C0243ip;

/* loaded from: classes.dex */
public final class iR<E> extends hS<E> implements RandomAccess {
    private static final iR<Object> setY;
    private int MenuHostHelper$$ExternalSyntheticLambda0;
    private E[] setIconTintList;

    static {
        iR<Object> iRVar = new iR<>(new Object[0], 0);
        setY = iRVar;
        iRVar.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    public static <E> iR<E> setIconTintList() {
        return (iR<E>) setY;
    }

    iR() {
        this(new Object[10], 0);
    }

    private iR(E[] eArr, int i) {
        this.setIconTintList = eArr;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
    }

    @Override // o.hS, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        setX();
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        E[] eArr = this.setIconTintList;
        if (i == eArr.length) {
            this.setIconTintList = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.setIconTintList;
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // o.hS, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        setX();
        if (i < 0 || i > (i2 = this.MenuHostHelper$$ExternalSyntheticLambda0)) {
            throw new IndexOutOfBoundsException(setY(i));
        }
        E[] eArr = this.setIconTintList;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.setIconTintList, i, eArr2, i + 1, this.MenuHostHelper$$ExternalSyntheticLambda0 - i);
            this.setIconTintList = eArr2;
        }
        this.setIconTintList[i] = e;
        this.MenuHostHelper$$ExternalSyntheticLambda0++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.hS, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        setX();
        if (i >= 0 && i < (i2 = this.MenuHostHelper$$ExternalSyntheticLambda0)) {
            E[] eArr = this.setIconTintList;
            E e = eArr[i];
            if (i < i2 - 1) {
                System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0--;
            ((AbstractList) this).modCount++;
            return e;
        }
        throw new IndexOutOfBoundsException(setY(i));
    }

    @Override // o.hS, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        setX();
        if (i >= 0 && i < this.MenuHostHelper$$ExternalSyntheticLambda0) {
            E[] eArr = this.setIconTintList;
            E e2 = eArr[i];
            eArr[i] = e;
            ((AbstractList) this).modCount++;
            return e2;
        }
        throw new IndexOutOfBoundsException(setY(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    private String setY(int i) {
        StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        if (i >= 0 && i < this.MenuHostHelper$$ExternalSyntheticLambda0) {
            return this.setIconTintList[i];
        }
        throw new IndexOutOfBoundsException(setY(i));
    }

    @Override // o.C0243ip.setY
    public final /* synthetic */ C0243ip.setY setX(int i) {
        if (i < this.MenuHostHelper$$ExternalSyntheticLambda0) {
            throw new IllegalArgumentException();
        }
        return new iR(Arrays.copyOf(this.setIconTintList, i), this.MenuHostHelper$$ExternalSyntheticLambda0);
    }
}