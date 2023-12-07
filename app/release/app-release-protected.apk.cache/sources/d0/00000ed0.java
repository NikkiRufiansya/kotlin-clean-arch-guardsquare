package o;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setPromptId<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    Map<K, V> MenuHostHelper$$ExternalSyntheticLambda0;
    Map<K, V> MenuHostHelper$$ExternalSyntheticLambda1;
    List<setPromptId<K, V>.setY> setIconTintList;
    private final int setOnLongClickListener;
    private volatile setPromptId<K, V>.setUnboundedRipple setUiOptions;
    volatile setPromptId<K, V>.setIconTintList setX;
    boolean setY;

    /* synthetic */ setPromptId(int i, byte b) {
        this(i);
    }

    private setPromptId(int i) {
        this.setOnLongClickListener = i;
        this.setIconTintList = Collections.emptyList();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = Collections.emptyMap();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = Collections.emptyMap();
    }

    public void setIconTintList() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.setY) {
            return;
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = unmodifiableMap;
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = unmodifiableMap2;
        this.setY = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.setIconTintList.size() + this.MenuHostHelper$$ExternalSyntheticLambda0.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return setIconTintList(comparable) >= 0 || this.MenuHostHelper$$ExternalSyntheticLambda0.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iconTintList = setIconTintList(comparable);
        if (iconTintList >= 0) {
            return this.setIconTintList.get(iconTintList).getValue();
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda0.get(comparable);
    }

    private int setIconTintList(K k) {
        int size = this.setIconTintList.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.setIconTintList.get(size).setIconTintList);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.setIconTintList.get(i2).setIconTintList);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.setUiOptions == null) {
            this.setUiOptions = new setUnboundedRipple(this, (byte) 0);
        }
        return this.setUiOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setY implements Map.Entry<K, V>, Comparable<setPromptId<K, V>.setY> {
        final K setIconTintList;
        private V setX;

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return this.setIconTintList.compareTo(((setY) obj).setIconTintList);
        }

        setY(setPromptId setpromptid, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        setY(K k, V v) {
            this.setIconTintList = k;
            this.setX = v;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.setX;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (!setPromptId.this.setY) {
                V v2 = this.setX;
                this.setX = v;
                return v2;
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean equals;
            boolean equals2;
            if (obj == this) {
                return true;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.setIconTintList;
                Object key = entry.getKey();
                if (k == null) {
                    equals = key == null;
                } else {
                    equals = k.equals(key);
                }
                if (equals) {
                    V v = this.setX;
                    Object value = entry.getValue();
                    if (v == null) {
                        equals2 = value == null;
                    } else {
                        equals2 = v.equals(value);
                    }
                    if (equals2) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.setIconTintList;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.setX;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.setIconTintList);
            sb.append("=");
            sb.append(this.setX);
            return sb.toString();
        }

        @Override // java.util.Map.Entry
        public final /* bridge */ /* synthetic */ Object getKey() {
            return this.setIconTintList;
        }
    }

    /* loaded from: classes.dex */
    class setUnboundedRipple extends AbstractSet<Map.Entry<K, V>> {
        private setUnboundedRipple() {
        }

        /* synthetic */ setUnboundedRipple(setPromptId setpromptid, byte b) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public /* synthetic */ boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            setPromptId.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new setPromptId$MenuHostHelper$$ExternalSyntheticLambda1(setPromptId.this, (byte) 0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return setPromptId.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            V v = setPromptId.this.get(entry.getKey());
            Object value = entry.getValue();
            return v == value || (v != null && v.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                setPromptId.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            setPromptId.this.clear();
        }
    }

    /* loaded from: classes.dex */
    class setIconTintList extends setUnboundedRipple {
        private setIconTintList() {
            super(setPromptId.this, (byte) 0);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ setIconTintList(setPromptId setpromptid, byte b) {
            this();
        }

        @Override // o.setPromptId.setUnboundedRipple, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new setPromptId$MenuHostHelper$$ExternalSyntheticLambda0(setPromptId.this, (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX {
        private static final Iterator<Object> MenuHostHelper$$ExternalSyntheticLambda1 = new Iterator<Object>() { // from class: o.setPromptId.setX.2
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
        private static final Iterable<Object> MenuHostHelper$$ExternalSyntheticLambda0 = new Iterable<Object>() { // from class: o.setPromptId.setX.4
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return setX.MenuHostHelper$$ExternalSyntheticLambda1;
            }
        };

        /* JADX INFO: Access modifiers changed from: package-private */
        public static <T> Iterable<T> setY() {
            return (Iterable<T>) MenuHostHelper$$ExternalSyntheticLambda0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setPromptId)) {
            return super.equals(obj);
        }
        setPromptId setpromptid = (setPromptId) obj;
        int size = size();
        if (size != setpromptid.size()) {
            return false;
        }
        int size2 = this.setIconTintList.size();
        if (size2 != setpromptid.setIconTintList.size()) {
            return entrySet().equals(setpromptid.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!this.setIconTintList.get(i).equals(setpromptid.setIconTintList.get(i))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.MenuHostHelper$$ExternalSyntheticLambda0.equals(setpromptid.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        return true;
    }

    private void setX() {
        if (!this.setY) {
            if (!this.setIconTintList.isEmpty() || (this.setIconTintList instanceof ArrayList)) {
                return;
            }
            this.setIconTintList = new ArrayList(this.setOnLongClickListener);
            return;
        }
        throw new UnsupportedOperationException();
    }

    private SortedMap<K, V> setY() {
        if (!this.setY) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0.isEmpty() && !(this.MenuHostHelper$$ExternalSyntheticLambda0 instanceof TreeMap)) {
                TreeMap treeMap = new TreeMap();
                this.MenuHostHelper$$ExternalSyntheticLambda0 = treeMap;
                this.MenuHostHelper$$ExternalSyntheticLambda1 = treeMap.descendingMap();
            }
            return (SortedMap) this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final V setX(int i) {
        if (!this.setY) {
            V value = this.setIconTintList.remove(i).getValue();
            if (!this.MenuHostHelper$$ExternalSyntheticLambda0.isEmpty()) {
                Iterator<Map.Entry<K, V>> it = setY().entrySet().iterator();
                this.setIconTintList.add(new setY(this, it.next()));
                it.remove();
            }
            return value;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (!this.setY) {
            if (!this.setIconTintList.isEmpty()) {
                this.setIconTintList.clear();
            }
            if (this.MenuHostHelper$$ExternalSyntheticLambda0.isEmpty()) {
                return;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.clear();
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int size = this.setIconTintList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.setIconTintList.get(i2).hashCode();
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda0.size() > 0 ? i + this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode() : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: setY */
    public final V put(K k, V v) {
        if (!this.setY) {
            int iconTintList = setIconTintList(k);
            if (iconTintList >= 0) {
                return this.setIconTintList.get(iconTintList).setValue(v);
            }
            setX();
            int i = -(iconTintList + 1);
            if (i >= this.setOnLongClickListener) {
                return setY().put(k, v);
            }
            int size = this.setIconTintList.size();
            int i2 = this.setOnLongClickListener;
            if (size == i2) {
                setPromptId<K, V>.setY remove = this.setIconTintList.remove(i2 - 1);
                setY().put(remove.setIconTintList, remove.getValue());
            }
            this.setIconTintList.add(i, new setY(k, v));
            return null;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (!this.setY) {
            Comparable comparable = (Comparable) obj;
            int iconTintList = setIconTintList(comparable);
            if (iconTintList >= 0) {
                return (V) setX(iconTintList);
            }
            if (this.MenuHostHelper$$ExternalSyntheticLambda0.isEmpty()) {
                return null;
            }
            return this.MenuHostHelper$$ExternalSyntheticLambda0.remove(comparable);
        }
        throw new UnsupportedOperationException();
    }
}