package o;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class qA<T> implements qC<T> {
    private final AtomicReference<qC<T>> setX;

    public qA(qC<? extends T> qCVar) {
        pN.setY(qCVar, "");
        this.setX = new AtomicReference<>(qCVar);
    }

    @Override // o.qC
    public final Iterator<T> MenuHostHelper$$ExternalSyntheticLambda0() {
        qC<T> andSet = this.setX.getAndSet(null);
        if (andSet == null) {
            throw new IllegalStateException("This sequence can be consumed only once.");
        }
        return andSet.MenuHostHelper$$ExternalSyntheticLambda0();
    }
}