package o;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class setExpandedComponentIdHint extends AbstractList<String> implements ExecutorsRegistrar, RandomAccess {
    final ExecutorsRegistrar MenuHostHelper$$ExternalSyntheticLambda0;

    @Override // o.ExecutorsRegistrar
    public final ExecutorsRegistrar MenuHostHelper$$ExternalSyntheticLambda0() {
        return this;
    }

    public setExpandedComponentIdHint(ExecutorsRegistrar executorsRegistrar) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = executorsRegistrar;
    }

    @Override // o.ExecutorsRegistrar
    public final Object setIconTintList(int i) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.size();
    }

    @Override // o.ExecutorsRegistrar
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setSpeed setspeed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new ListIterator<String>(i) { // from class: o.setExpandedComponentIdHint.3
            private ListIterator<String> MenuHostHelper$$ExternalSyntheticLambda0;
            final /* synthetic */ int setY;

            {
                this.setY = i;
                this.MenuHostHelper$$ExternalSyntheticLambda0 = setExpandedComponentIdHint.this.MenuHostHelper$$ExternalSyntheticLambda0.listIterator(i);
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
                return this.MenuHostHelper$$ExternalSyntheticLambda0.hasNext();
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.MenuHostHelper$$ExternalSyntheticLambda0.hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.MenuHostHelper$$ExternalSyntheticLambda0.nextIndex();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.MenuHostHelper$$ExternalSyntheticLambda0.previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final /* bridge */ /* synthetic */ Object next() {
                return this.MenuHostHelper$$ExternalSyntheticLambda0.next();
            }

            @Override // java.util.ListIterator
            public final /* bridge */ /* synthetic */ String previous() {
                return this.MenuHostHelper$$ExternalSyntheticLambda0.previous();
            }
        };
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new Iterator<String>() { // from class: o.setExpandedComponentIdHint.2
            private Iterator<String> setIconTintList;

            {
                this.setIconTintList = setExpandedComponentIdHint.this.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.setIconTintList.hasNext();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Iterator
            public final /* bridge */ /* synthetic */ String next() {
                return this.setIconTintList.next();
            }
        };
    }

    @Override // o.ExecutorsRegistrar
    public final List<?> MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return (String) this.MenuHostHelper$$ExternalSyntheticLambda0.get(i);
    }
}