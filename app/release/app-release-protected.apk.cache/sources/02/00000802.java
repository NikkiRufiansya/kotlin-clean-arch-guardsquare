package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class pG<T> implements Iterator<T>, InterfaceC0395qb {
    private final T[] MenuHostHelper$$ExternalSyntheticLambda1;
    private int setX;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public pG(T[] tArr) {
        pN.setY(tArr, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = tArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.setX < this.MenuHostHelper$$ExternalSyntheticLambda1.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
            int i = this.setX;
            this.setX = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.setX--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}