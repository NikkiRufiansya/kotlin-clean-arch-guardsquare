package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.od  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343od<T> implements Collection<T>, InterfaceC0395qb {
    private final boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private final T[] setY;

    @Override // java.util.Collection
    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        pN.setY(tArr, "");
        return (T[]) pH.MenuHostHelper$$ExternalSyntheticLambda1(this, tArr);
    }

    public C0343od(T[] tArr, boolean z) {
        pN.setY(tArr, "");
        this.setY = tArr;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.setY.length == 0;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i;
        T[] tArr = this.setY;
        pN.setY(tArr, "");
        pN.setY(tArr, "");
        if (obj == null) {
            int length = tArr.length;
            i = 0;
            while (i < length) {
                if (tArr[i] == null) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            int length2 = tArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (pN.MenuHostHelper$$ExternalSyntheticLambda0(obj, tArr[i2])) {
                    i = i2;
                    break;
                }
            }
            i = -1;
        }
        return i >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        pN.setY(collection, "");
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        T[] tArr = this.setY;
        pN.setY(tArr, "");
        return new pG(tArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        T[] tArr = this.setY;
        boolean z = this.MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setY(tArr, "");
        if (z && pN.MenuHostHelper$$ExternalSyntheticLambda0(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) copyOf, "");
        return copyOf;
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.setY.length;
    }
}