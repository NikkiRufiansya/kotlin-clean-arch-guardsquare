package o;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: o.ot  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0359ot implements ListIterator, InterfaceC0395qb {
    public static final C0359ot setX = new C0359ot();

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private C0359ot() {
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ Object previous() {
        throw new NoSuchElementException();
    }
}