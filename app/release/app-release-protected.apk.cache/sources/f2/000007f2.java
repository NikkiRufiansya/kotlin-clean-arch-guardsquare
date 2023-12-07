package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: o.os  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0358os implements List, Serializable, RandomAccess, InterfaceC0395qb {
    public static final C0358os setIconTintList = new C0358os();

    @Override // java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.List
    public final /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return pH.setIconTintList(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        pN.setY(tArr, "");
        return (T[]) pH.MenuHostHelper$$ExternalSyntheticLambda1(this, tArr);
    }

    public final String toString() {
        return "[]";
    }

    private C0358os() {
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Void) {
            pN.setY((Void) obj, "");
            return false;
        }
        return false;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Void) {
            pN.setY((Void) obj, "");
            return -1;
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            pN.setY((Void) obj, "");
            return -1;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        pN.setY(collection, "");
        return collection.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return C0359ot.setX;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return C0359ot.setX;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        if (i != 0) {
            StringBuilder sb = new StringBuilder("Index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return C0359ot.setX;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        StringBuilder sb = new StringBuilder("fromIndex: ");
        sb.append(i);
        sb.append(", toIndex: ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    private final Object readResolve() {
        return setIconTintList;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        StringBuilder sb = new StringBuilder("Empty list doesn't contain element at index ");
        sb.append(i);
        sb.append('.');
        throw new IndexOutOfBoundsException(sb.toString());
    }
}