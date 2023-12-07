package o;

import java.util.Iterator;

/* renamed from: o.ou  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0360ou implements Iterator<Long>, InterfaceC0395qb {
    public abstract long MenuHostHelper$$ExternalSyntheticLambda1();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public /* synthetic */ Long next() {
        return Long.valueOf(MenuHostHelper$$ExternalSyntheticLambda1());
    }
}