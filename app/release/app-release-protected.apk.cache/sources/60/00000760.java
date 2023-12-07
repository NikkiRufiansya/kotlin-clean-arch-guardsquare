package o;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class nW<E> implements Collection<E>, InterfaceC0395qb {
    @Override // java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract int setY();

    @Override // java.util.Collection
    public final int size() {
        return setY();
    }

    @Override // java.util.Collection
    public boolean contains(E e) {
        nW<E> nWVar = this;
        if (nWVar.isEmpty()) {
            return false;
        }
        for (E e2 : nWVar) {
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0(e2, e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        pN.setY(collection, "");
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    public String toString() {
        return C0348oi.MenuHostHelper$$ExternalSyntheticLambda0(this, ", ", "[", "]", new setIconTintList(this));
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return pH.setIconTintList(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        pN.setY(tArr, "");
        T[] tArr2 = (T[]) pH.MenuHostHelper$$ExternalSyntheticLambda1(this, tArr);
        pN.setX(tArr2);
        return tArr2;
    }

    /* loaded from: classes.dex */
    static final class setIconTintList extends pO implements InterfaceC0377pk<E, CharSequence> {
        private /* synthetic */ nW<E> MenuHostHelper$$ExternalSyntheticLambda0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        setIconTintList(nW<? extends E> nWVar) {
            super(1);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = nWVar;
        }

        @Override // o.InterfaceC0377pk
        public final /* synthetic */ CharSequence setX(Object obj) {
            return obj == this.MenuHostHelper$$ExternalSyntheticLambda0 ? "(this Collection)" : String.valueOf(obj);
        }
    }
}