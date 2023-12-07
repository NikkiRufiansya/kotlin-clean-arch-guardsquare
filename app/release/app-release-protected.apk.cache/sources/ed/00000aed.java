package o;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
abstract class setDataDirectorySuffix<E> extends AbstractList<E> implements setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1<E> {
    private boolean setY = true;

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

    @Override // o.setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1
    public boolean setY() {
        return this.setY;
    }

    @Override // o.setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1
    public final void setX() {
        this.setY = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setIconTintList() {
        if (!this.setY) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        if (this.setY) {
            super.add(i, e);
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        if (this.setY) {
            return super.add(e);
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        if (this.setY) {
            return super.addAll(i, collection);
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        if (this.setY) {
            return super.addAll(collection);
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (this.setY) {
            super.clear();
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        if (this.setY) {
            return (E) super.remove(i);
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        if (this.setY) {
            return super.remove(obj);
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        if (this.setY) {
            return super.removeAll(collection);
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        if (this.setY) {
            return super.retainAll(collection);
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        if (this.setY) {
            return (E) super.set(i, e);
        }
        throw new UnsupportedOperationException();
    }
}