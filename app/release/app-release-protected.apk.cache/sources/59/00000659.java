package o;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class jh extends AbstractList<String> implements InterfaceC0249iv, RandomAccess {
    final InterfaceC0249iv MenuHostHelper$$ExternalSyntheticLambda1;

    @Override // o.InterfaceC0249iv
    public final InterfaceC0249iv setIconTintList() {
        return this;
    }

    public jh(InterfaceC0249iv interfaceC0249iv) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = interfaceC0249iv;
    }

    @Override // o.InterfaceC0249iv
    public final Object setIconTintList(int i) {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.size();
    }

    @Override // o.InterfaceC0249iv
    public final void MenuHostHelper$$ExternalSyntheticLambda0(hY hYVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new ListIterator<String>(i) { // from class: o.jh.3
            private ListIterator<String> setX;
            private /* synthetic */ int setY;

            {
                this.setY = i;
                this.setX = jh.this.MenuHostHelper$$ExternalSyntheticLambda1.listIterator(i);
            }

            @Override // java.util.ListIterator
            public final /* synthetic */ void add(String str) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator
            public final /* synthetic */ void set(String str) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.setX.hasNext();
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.setX.hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.setX.nextIndex();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.setX.previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final /* bridge */ /* synthetic */ Object next() {
                return this.setX.next();
            }

            @Override // java.util.ListIterator
            public final /* bridge */ /* synthetic */ String previous() {
                return this.setX.previous();
            }
        };
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new Iterator<String>() { // from class: o.jh.4
            private Iterator<String> setX;

            {
                this.setX = jh.this.MenuHostHelper$$ExternalSyntheticLambda1.iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.setX.hasNext();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Iterator
            public final /* bridge */ /* synthetic */ String next() {
                return this.setX.next();
            }
        };
    }

    @Override // o.InterfaceC0249iv
    public final List<?> MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return (String) this.MenuHostHelper$$ExternalSyntheticLambda1.get(i);
    }
}