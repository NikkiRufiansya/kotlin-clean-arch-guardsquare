package o;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class qO<T, R> implements qC<R> {
    final InterfaceC0377pk<T, R> setIconTintList;
    final qC<T> setY;

    /* JADX WARN: Multi-variable type inference failed */
    public qO(qC<? extends T> qCVar, InterfaceC0377pk<? super T, ? extends R> interfaceC0377pk) {
        pN.setY(qCVar, "");
        pN.setY(interfaceC0377pk, "");
        this.setY = qCVar;
        this.setIconTintList = interfaceC0377pk;
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList implements Iterator<R>, InterfaceC0395qb {
        private final Iterator<T> MenuHostHelper$$ExternalSyntheticLambda0;
        private /* synthetic */ qO<T, R> MenuHostHelper$$ExternalSyntheticLambda1;

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        setIconTintList(qO<T, R> qOVar) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = qOVar;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = qOVar.setY.MenuHostHelper$$ExternalSyntheticLambda0();
        }

        @Override // java.util.Iterator
        public final R next() {
            return this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList.setX(this.MenuHostHelper$$ExternalSyntheticLambda0.next());
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0.hasNext();
        }
    }

    @Override // o.qC
    public final Iterator<R> MenuHostHelper$$ExternalSyntheticLambda0() {
        return new setIconTintList(this);
    }
}