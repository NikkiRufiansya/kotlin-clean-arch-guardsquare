package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.setOnConstraintsChanged;

/* loaded from: classes.dex */
public final class setFabAnchorMode<K, V> extends setDividerHeight<K, V> implements Map<K, V> {
    private setOnConstraintsChanged<K, V> MenuHostHelper$$ExternalSyntheticLambda1;

    public setFabAnchorMode() {
    }

    public setFabAnchorMode(int i) {
        super(i);
    }

    public setFabAnchorMode(setDividerHeight setdividerheight) {
        super(setdividerheight);
    }

    /* renamed from: o.setFabAnchorMode$3  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass3 extends setOnConstraintsChanged<K, V> {
        AnonymousClass3() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.setOnConstraintsChanged
        public final int setX() {
            return setFabAnchorMode.this.MenuHostHelper$$ExternalSyntheticLambda0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.setOnConstraintsChanged
        public final Object setY(int i, int i2) {
            return setFabAnchorMode.this.setX[(i << 1) + i2];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.setOnConstraintsChanged
        public final int setX(Object obj) {
            setFabAnchorMode setfabanchormode = setFabAnchorMode.this;
            return obj == null ? setfabanchormode.MenuHostHelper$$ExternalSyntheticLambda1() : setfabanchormode.setY(obj, obj.hashCode());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.setOnConstraintsChanged
        public final int MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
            return setFabAnchorMode.this.setIconTintList(obj);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.setOnConstraintsChanged
        public final Map<K, V> MenuHostHelper$$ExternalSyntheticLambda0() {
            return setFabAnchorMode.this;
        }

        @Override // o.setOnConstraintsChanged
        protected final void MenuHostHelper$$ExternalSyntheticLambda1(K k, V v) {
            setFabAnchorMode.this.put(k, v);
        }

        @Override // o.setOnConstraintsChanged
        protected final V setX(int i, V v) {
            int i2 = (i << 1) + 1;
            Object[] objArr = setFabAnchorMode.this.setX;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.setOnConstraintsChanged
        public final void setY(int i) {
            setFabAnchorMode.this.setIconTintList(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.setOnConstraintsChanged
        public final void MenuHostHelper$$ExternalSyntheticLambda1() {
            setFabAnchorMode.this.clear();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        setY(this.MenuHostHelper$$ExternalSyntheticLambda0 + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new AnonymousClass3();
        }
        setOnConstraintsChanged<K, V> setonconstraintschanged = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setonconstraintschanged.setX == null) {
            setonconstraintschanged.setX = new setOnConstraintsChanged.setY();
        }
        return setonconstraintschanged.setX;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new AnonymousClass3();
        }
        setOnConstraintsChanged<K, V> setonconstraintschanged = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setonconstraintschanged.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            setonconstraintschanged.MenuHostHelper$$ExternalSyntheticLambda1 = new setOnConstraintsChanged$MenuHostHelper$$ExternalSyntheticLambda1(setonconstraintschanged);
        }
        return setonconstraintschanged.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [o.setOnConstraintsChanged$MenuHostHelper$$ExternalSyntheticLambda0] */
    @Override // java.util.Map
    public final Collection<V> values() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new AnonymousClass3();
        }
        final setOnConstraintsChanged<K, V> setonconstraintschanged = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setonconstraintschanged.setY == null) {
            setonconstraintschanged.setY = new Collection<V>() { // from class: o.setOnConstraintsChanged$MenuHostHelper$$ExternalSyntheticLambda0
                @Override // java.util.Collection
                public final boolean add(V v) {
                    throw new UnsupportedOperationException();
                }

                @Override // java.util.Collection
                public final boolean addAll(Collection<? extends V> collection) {
                    throw new UnsupportedOperationException();
                }

                @Override // java.util.Collection
                public final void clear() {
                    setOnConstraintsChanged.this.MenuHostHelper$$ExternalSyntheticLambda1();
                }

                @Override // java.util.Collection
                public final boolean contains(Object obj) {
                    return setOnConstraintsChanged.this.MenuHostHelper$$ExternalSyntheticLambda1(obj) >= 0;
                }

                @Override // java.util.Collection
                public final boolean containsAll(Collection<?> collection) {
                    Iterator<?> it = collection.iterator();
                    while (it.hasNext()) {
                        if (!contains(it.next())) {
                            return false;
                        }
                    }
                    return true;
                }

                @Override // java.util.Collection
                public final boolean isEmpty() {
                    return setOnConstraintsChanged.this.setX() == 0;
                }

                @Override // java.util.Collection, java.lang.Iterable
                public final Iterator<V> iterator() {
                    return new setOnConstraintsChanged.setIconTintList(1);
                }

                @Override // java.util.Collection
                public final boolean remove(Object obj) {
                    int MenuHostHelper$$ExternalSyntheticLambda1 = setOnConstraintsChanged.this.MenuHostHelper$$ExternalSyntheticLambda1(obj);
                    if (MenuHostHelper$$ExternalSyntheticLambda1 >= 0) {
                        setOnConstraintsChanged.this.setY(MenuHostHelper$$ExternalSyntheticLambda1);
                        return true;
                    }
                    return false;
                }

                @Override // java.util.Collection
                public final boolean removeAll(Collection<?> collection) {
                    int x = setOnConstraintsChanged.this.setX();
                    int i = 0;
                    boolean z = false;
                    while (i < x) {
                        if (collection.contains(setOnConstraintsChanged.this.setY(i, 1))) {
                            setOnConstraintsChanged.this.setY(i);
                            i--;
                            x--;
                            z = true;
                        }
                        i++;
                    }
                    return z;
                }

                @Override // java.util.Collection
                public final boolean retainAll(Collection<?> collection) {
                    int x = setOnConstraintsChanged.this.setX();
                    int i = 0;
                    boolean z = false;
                    while (i < x) {
                        if (!collection.contains(setOnConstraintsChanged.this.setY(i, 1))) {
                            setOnConstraintsChanged.this.setY(i);
                            i--;
                            x--;
                            z = true;
                        }
                        i++;
                    }
                    return z;
                }

                @Override // java.util.Collection
                public final int size() {
                    return setOnConstraintsChanged.this.setX();
                }

                @Override // java.util.Collection
                public final Object[] toArray() {
                    return setOnConstraintsChanged.this.setX(1);
                }

                @Override // java.util.Collection
                public final <T> T[] toArray(T[] tArr) {
                    return (T[]) setOnConstraintsChanged.this.setIconTintList(tArr, 1);
                }
            };
        }
        return setonconstraintschanged.setY;
    }
}