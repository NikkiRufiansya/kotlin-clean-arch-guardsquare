package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.setOnConstraintsChanged;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes.dex */
final class setOnConstraintsChanged$MenuHostHelper$$ExternalSyntheticLambda1<K> implements Set<K> {
    final /* synthetic */ setOnConstraintsChanged setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setOnConstraintsChanged$MenuHostHelper$$ExternalSyntheticLambda1(setOnConstraintsChanged setonconstraintschanged) {
        this.setX = setonconstraintschanged;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends K> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.setX.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.setX.setX(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Map MenuHostHelper$$ExternalSyntheticLambda0 = this.setX.MenuHostHelper$$ExternalSyntheticLambda0();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!MenuHostHelper$$ExternalSyntheticLambda0.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.setX.setX() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<K> iterator() {
        return new setOnConstraintsChanged.setIconTintList(0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int x = this.setX.setX(obj);
        if (x >= 0) {
            this.setX.setY(x);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Map MenuHostHelper$$ExternalSyntheticLambda0 = this.setX.MenuHostHelper$$ExternalSyntheticLambda0();
        int size = MenuHostHelper$$ExternalSyntheticLambda0.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            MenuHostHelper$$ExternalSyntheticLambda0.remove(it.next());
        }
        return size != MenuHostHelper$$ExternalSyntheticLambda0.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return setOnConstraintsChanged.MenuHostHelper$$ExternalSyntheticLambda1(this.setX.MenuHostHelper$$ExternalSyntheticLambda0(), collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.setX.setX();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.setX.setX(0);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.setX.setIconTintList(tArr, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return setOnConstraintsChanged.setY(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i = 0;
        for (int x = this.setX.setX() - 1; x >= 0; x--) {
            Object y = this.setX.setY(x, 0);
            i += y == null ? 0 : y.hashCode();
        }
        return i;
    }
}