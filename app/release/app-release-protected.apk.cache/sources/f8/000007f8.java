package o;

import java.util.Iterator;

/* renamed from: o.oy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0364oy implements Iterator<Integer>, InterfaceC0395qb {
    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract int setY();

    @Override // java.util.Iterator
    public /* synthetic */ Integer next() {
        return Integer.valueOf(setY());
    }
}