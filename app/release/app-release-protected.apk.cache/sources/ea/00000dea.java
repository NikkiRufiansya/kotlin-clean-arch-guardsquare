package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class setOnConstraintsChanged<K, V> {
    /* JADX WARN: Incorrect inner types in field signature: Lo/setOnConstraintsChanged<TK;TV;>.ExternalSyntheticLambda1; */
    setOnConstraintsChanged$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1;
    setOnConstraintsChanged<K, V>.setY setX;
    /* JADX WARN: Incorrect inner types in field signature: Lo/setOnConstraintsChanged<TK;TV;>.ExternalSyntheticLambda0; */
    setOnConstraintsChanged$MenuHostHelper$$ExternalSyntheticLambda0 setY;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Map<K, V> MenuHostHelper$$ExternalSyntheticLambda0();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int MenuHostHelper$$ExternalSyntheticLambda1(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void MenuHostHelper$$ExternalSyntheticLambda1();

    protected abstract void MenuHostHelper$$ExternalSyntheticLambda1(K k, V v);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int setX();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int setX(Object obj);

    protected abstract V setX(int i, V v);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object setY(int i, int i2);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void setY(int i);

    /* loaded from: classes.dex */
    final class setIconTintList<T> implements Iterator<T> {
        final int MenuHostHelper$$ExternalSyntheticLambda0;
        private int MenuHostHelper$$ExternalSyntheticLambda1;
        private int setX;
        private boolean setY = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setIconTintList(int i) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
            this.setX = setOnConstraintsChanged.this.setX();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.MenuHostHelper$$ExternalSyntheticLambda1 < this.setX;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) setOnConstraintsChanged.this.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda0);
            this.MenuHostHelper$$ExternalSyntheticLambda1++;
            this.setY = true;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.setY) {
                throw new IllegalStateException();
            }
            int i = this.MenuHostHelper$$ExternalSyntheticLambda1 - 1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
            this.setX--;
            this.setY = false;
            setOnConstraintsChanged.this.setY(i);
        }
    }

    /* loaded from: classes.dex */
    final class setX implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        private boolean MenuHostHelper$$ExternalSyntheticLambda0 = false;
        private int MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        private int setX;

        setX() {
            this.setX = setOnConstraintsChanged.this.setX() - 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.MenuHostHelper$$ExternalSyntheticLambda1 < this.setX;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
                throw new IllegalStateException();
            }
            setOnConstraintsChanged.this.setY(this.MenuHostHelper$$ExternalSyntheticLambda1);
            this.MenuHostHelper$$ExternalSyntheticLambda1--;
            this.setX--;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (K) setOnConstraintsChanged.this.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, 0);
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (V) setOnConstraintsChanged.this.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, 1);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (V) setOnConstraintsChanged.this.setX(this.MenuHostHelper$$ExternalSyntheticLambda1, v);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return setStatusBarBackground.setX(entry.getKey(), setOnConstraintsChanged.this.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, 0)) && setStatusBarBackground.setX(entry.getValue(), setOnConstraintsChanged.this.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, 1));
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object y = setOnConstraintsChanged.this.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, 0);
            Object y2 = setOnConstraintsChanged.this.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, 1);
            return (y == null ? 0 : y.hashCode()) ^ (y2 != null ? y2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1++;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
            return this;
        }
    }

    /* loaded from: classes.dex */
    final class setY implements Set<Map.Entry<K, V>> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public setY() {
        }

        @Override // java.util.Set, java.util.Collection
        public final /* synthetic */ boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int x = setOnConstraintsChanged.this.setX();
            for (Map.Entry<K, V> entry : collection) {
                setOnConstraintsChanged.this.MenuHostHelper$$ExternalSyntheticLambda1((setOnConstraintsChanged) entry.getKey(), (K) entry.getValue());
            }
            return x != setOnConstraintsChanged.this.setX();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            setOnConstraintsChanged.this.MenuHostHelper$$ExternalSyntheticLambda1();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int x = setOnConstraintsChanged.this.setX(entry.getKey());
                if (x < 0) {
                    return false;
                }
                return setStatusBarBackground.setX(setOnConstraintsChanged.this.setY(x, 1), entry.getValue());
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return setOnConstraintsChanged.this.setX() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new setX();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return setOnConstraintsChanged.this.setX();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return setOnConstraintsChanged.setY(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int i = 0;
            for (int x = setOnConstraintsChanged.this.setX() - 1; x >= 0; x--) {
                Object y = setOnConstraintsChanged.this.setY(x, 0);
                Object y2 = setOnConstraintsChanged.this.setY(x, 1);
                i += (y == null ? 0 : y.hashCode()) ^ (y2 == null ? 0 : y2.hashCode());
            }
            return i;
        }
    }

    public static <K, V> boolean MenuHostHelper$$ExternalSyntheticLambda1(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public final Object[] setX(int i) {
        int x = setX();
        Object[] objArr = new Object[x];
        for (int i2 = 0; i2 < x; i2++) {
            objArr[i2] = setY(i2, i);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T[] setIconTintList(T[] tArr, int i) {
        int x = setX();
        if (tArr.length < x) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), x));
        }
        for (int i2 = 0; i2 < x; i2++) {
            tArr[i2] = setY(i2, i);
        }
        if (tArr.length > x) {
            tArr[x] = null;
        }
        return tArr;
    }

    public static <T> boolean setY(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}