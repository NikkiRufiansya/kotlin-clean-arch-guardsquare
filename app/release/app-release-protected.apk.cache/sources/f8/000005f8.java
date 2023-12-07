package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
class iW$MenuHostHelper$$ExternalSyntheticLambda0 {
    private static final Iterator<Object> setY = new Iterator<Object>() { // from class: o.iW$MenuHostHelper$$ExternalSyntheticLambda0.3
        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    };
    private static final Iterable<Object> setIconTintList = new Iterable<Object>() { // from class: o.iW$MenuHostHelper$$ExternalSyntheticLambda0.5
        @Override // java.lang.Iterable
        public final Iterator<Object> iterator() {
            return iW$MenuHostHelper$$ExternalSyntheticLambda0.setY;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> Iterable<T> MenuHostHelper$$ExternalSyntheticLambda0() {
        return (Iterable<T>) setIconTintList;
    }
}