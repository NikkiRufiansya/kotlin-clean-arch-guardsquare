package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: o.oa  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0340oa<E> extends nW<E> implements List<E> {
    public static final oa$MenuHostHelper$$ExternalSyntheticLambda0 setX = new oa$MenuHostHelper$$ExternalSyntheticLambda0((byte) 0);

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public abstract E get(int i);

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new setX();
    }

    @Override // java.util.List
    public int indexOf(E e) {
        int i = 0;
        for (E e2 : this) {
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0(e2, e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(E e) {
        AbstractC0340oa<E> abstractC0340oa = this;
        ListIterator<E> listIterator = abstractC0340oa.listIterator(abstractC0340oa.size());
        while (listIterator.hasPrevious()) {
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new setIconTintList(0);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new setIconTintList(i);
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return new oa$MenuHostHelper$$ExternalSyntheticLambda1(this, i, i2);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            AbstractC0340oa<E> abstractC0340oa = this;
            Collection collection = (Collection) obj;
            pN.setY(abstractC0340oa, "");
            pN.setY(collection, "");
            if (abstractC0340oa.size() != collection.size()) {
                return false;
            }
            Iterator<E> it = collection.iterator();
            for (E e : abstractC0340oa) {
                if (!pN.MenuHostHelper$$ExternalSyntheticLambda0(e, it.next())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        AbstractC0340oa<E> abstractC0340oa = this;
        pN.setY(abstractC0340oa, "");
        Iterator<E> it = abstractC0340oa.iterator();
        int i = 1;
        while (it.hasNext()) {
            E next = it.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.oa$setX */
    /* loaded from: classes.dex */
    public class setX implements Iterator<E>, InterfaceC0395qb {
        private int setIconTintList;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public setX() {
        }

        protected final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
            this.setIconTintList = i;
        }

        protected final int MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.setIconTintList;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.setIconTintList < AbstractC0340oa.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC0340oa<E> abstractC0340oa = AbstractC0340oa.this;
            int i = this.setIconTintList;
            this.setIconTintList = i + 1;
            return abstractC0340oa.get(i);
        }
    }

    /* renamed from: o.oa$setIconTintList */
    /* loaded from: classes.dex */
    class setIconTintList extends setX implements ListIterator {
        @Override // java.util.ListIterator
        public final void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public setIconTintList(int i) {
            super();
            oa$MenuHostHelper$$ExternalSyntheticLambda0 oa_menuhosthelper__externalsyntheticlambda0 = AbstractC0340oa.setX;
            int size = AbstractC0340oa.this.size();
            if (i >= 0 && i <= size) {
                MenuHostHelper$$ExternalSyntheticLambda0(i);
                return;
            }
            StringBuilder sb = new StringBuilder("index: ");
            sb.append(i);
            sb.append(", size: ");
            sb.append(size);
            throw new IndexOutOfBoundsException(sb.toString());
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return MenuHostHelper$$ExternalSyntheticLambda1() > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return MenuHostHelper$$ExternalSyntheticLambda1();
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC0340oa<E> abstractC0340oa = AbstractC0340oa.this;
            MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1() - 1);
            return abstractC0340oa.get(MenuHostHelper$$ExternalSyntheticLambda1());
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return MenuHostHelper$$ExternalSyntheticLambda1() - 1;
        }
    }
}