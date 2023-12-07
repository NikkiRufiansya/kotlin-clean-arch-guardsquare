package o;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import o.C0243ip;

/* loaded from: classes.dex */
abstract class hS<E> extends AbstractList<E> implements C0243ip.setY<E> {
    private boolean MenuHostHelper$$ExternalSyntheticLambda1 = true;

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (!(obj instanceof RandomAccess)) {
                return super.equals(obj);
            }
            List list = (List) obj;
            int size = size();
            if (size != list.size()) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (!get(i).equals(list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // o.C0243ip.setY
    public boolean setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.C0243ip.setY
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setX() {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda1) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            super.add(i, e);
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            return super.add(e);
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            return super.addAll(i, collection);
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            return super.addAll(collection);
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            super.clear();
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            return (E) super.remove(i);
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            int indexOf = indexOf(obj);
            if (indexOf == -1) {
                return false;
            }
            remove(indexOf);
            return true;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            return super.removeAll(collection);
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            return super.retainAll(collection);
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            return (E) super.set(i, e);
        }
        throw new UnsupportedOperationException();
    }
}