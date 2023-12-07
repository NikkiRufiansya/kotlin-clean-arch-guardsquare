package o;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class iW<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    List<iW<K, V>.setX> MenuHostHelper$$ExternalSyntheticLambda1;
    Map<K, V> setIconTintList;
    private volatile iW<K, V>.setOnLongClickListener setNavigationOnClickListener;
    private final int setOnLongClickListener;
    /* JADX WARN: Incorrect inner types in field signature: Lo/iW<TK;TV;>.ExternalSyntheticLambda1; */
    volatile iW$MenuHostHelper$$ExternalSyntheticLambda1 setX;
    Map<K, V> setY;

    /* synthetic */ iW(int i, byte b) {
        this(i);
    }

    private iW(int i) {
        this.setOnLongClickListener = i;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = Collections.emptyList();
        this.setIconTintList = Collections.emptyMap();
        this.setY = Collections.emptyMap();
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            return;
        }
        if (this.setIconTintList.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.setIconTintList);
        }
        this.setIconTintList = unmodifiableMap;
        if (this.setY.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.setY);
        }
        this.setY = unmodifiableMap2;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.size() + this.setIconTintList.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return MenuHostHelper$$ExternalSyntheticLambda0(comparable) >= 0 || this.setIconTintList.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(comparable);
        if (MenuHostHelper$$ExternalSyntheticLambda0 >= 0) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1.get(MenuHostHelper$$ExternalSyntheticLambda0).getValue();
        }
        return this.setIconTintList.get(comparable);
    }

    private int MenuHostHelper$$ExternalSyntheticLambda0(K k) {
        int size = this.MenuHostHelper$$ExternalSyntheticLambda1.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.MenuHostHelper$$ExternalSyntheticLambda1.get(size).setY);
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
            int compareTo2 = k.compareTo(this.MenuHostHelper$$ExternalSyntheticLambda1.get(i2).setY);
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
        if (this.setNavigationOnClickListener == null) {
            this.setNavigationOnClickListener = new setOnLongClickListener(this, (byte) 0);
        }
        return this.setNavigationOnClickListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setX implements Map.Entry<K, V>, Comparable<iW<K, V>.setX> {
        private V MenuHostHelper$$ExternalSyntheticLambda0;
        final K setY;

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return this.setY.compareTo(((setX) obj).setY);
        }

        setX(iW iWVar, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        setX(K k, V v) {
            this.setY = k;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = v;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (!iW.this.MenuHostHelper$$ExternalSyntheticLambda0) {
                V v2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                this.MenuHostHelper$$ExternalSyntheticLambda0 = v;
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
                K k = this.setY;
                Object key = entry.getKey();
                if (k == null) {
                    equals = key == null;
                } else {
                    equals = k.equals(key);
                }
                if (equals) {
                    V v = this.MenuHostHelper$$ExternalSyntheticLambda0;
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
            K k = this.setY;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.MenuHostHelper$$ExternalSyntheticLambda0;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.setY);
            sb.append("=");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
            return sb.toString();
        }

        @Override // java.util.Map.Entry
        public final /* bridge */ /* synthetic */ Object getKey() {
            return this.setY;
        }
    }

    /* loaded from: classes.dex */
    class setOnLongClickListener extends AbstractSet<Map.Entry<K, V>> {
        private setOnLongClickListener() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ setOnLongClickListener(iW iWVar, byte b) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public /* synthetic */ boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            iW.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new setY(iW.this, (byte) 0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return iW.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            V v = iW.this.get(entry.getKey());
            Object value = entry.getValue();
            return v == value || (v != null && v.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                iW.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            iW.this.clear();
        }
    }

    /* loaded from: classes.dex */
    class setY implements Iterator<Map.Entry<K, V>> {
        private int MenuHostHelper$$ExternalSyntheticLambda0;
        private Iterator<Map.Entry<K, V>> MenuHostHelper$$ExternalSyntheticLambda1;
        private boolean setY;

        private setY() {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
        }

        /* synthetic */ setY(iW iWVar, byte b) {
            this();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 + 1 >= iW.this.MenuHostHelper$$ExternalSyntheticLambda1.size()) {
                return !iW.this.setIconTintList.isEmpty() && MenuHostHelper$$ExternalSyntheticLambda1().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.setY) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.setY = false;
            if (!iW.this.MenuHostHelper$$ExternalSyntheticLambda0) {
                if (this.MenuHostHelper$$ExternalSyntheticLambda0 < iW.this.MenuHostHelper$$ExternalSyntheticLambda1.size()) {
                    iW iWVar = iW.this;
                    int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = i - 1;
                    iWVar.setX(i);
                    return;
                }
                MenuHostHelper$$ExternalSyntheticLambda1().remove();
                return;
            }
            throw new UnsupportedOperationException();
        }

        private Iterator<Map.Entry<K, V>> MenuHostHelper$$ExternalSyntheticLambda1() {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = iW.this.setIconTintList.entrySet().iterator();
            }
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            this.setY = true;
            int i = this.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
            if (i < iW.this.MenuHostHelper$$ExternalSyntheticLambda1.size()) {
                return iW.this.MenuHostHelper$$ExternalSyntheticLambda1.get(this.MenuHostHelper$$ExternalSyntheticLambda0);
            }
            return MenuHostHelper$$ExternalSyntheticLambda1().next();
        }
    }

    /* loaded from: classes.dex */
    class setIconTintList implements Iterator<Map.Entry<K, V>> {
        private Iterator<Map.Entry<K, V>> MenuHostHelper$$ExternalSyntheticLambda1;
        private int setIconTintList;

        private setIconTintList() {
            this.setIconTintList = iW.this.MenuHostHelper$$ExternalSyntheticLambda1.size();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ setIconTintList(iW iWVar, byte b) {
            this();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.setIconTintList;
            return (i > 0 && i <= iW.this.MenuHostHelper$$ExternalSyntheticLambda1.size()) || setY().hasNext();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        private Iterator<Map.Entry<K, V>> setY() {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = iW.this.setY.entrySet().iterator();
            }
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            if (setY().hasNext()) {
                return setY().next();
            }
            List<iW<K, V>.setX> list = iW.this.MenuHostHelper$$ExternalSyntheticLambda1;
            int i = this.setIconTintList - 1;
            this.setIconTintList = i;
            return list.get(i);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iW)) {
            return super.equals(obj);
        }
        iW iWVar = (iW) obj;
        int size = size();
        if (size != iWVar.size()) {
            return false;
        }
        int size2 = this.MenuHostHelper$$ExternalSyntheticLambda1.size();
        if (size2 != iWVar.MenuHostHelper$$ExternalSyntheticLambda1.size()) {
            return entrySet().equals(iWVar.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!this.MenuHostHelper$$ExternalSyntheticLambda1.get(i).equals(iWVar.MenuHostHelper$$ExternalSyntheticLambda1.get(i))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.setIconTintList.equals(iWVar.setIconTintList);
        }
        return true;
    }

    private void setIconTintList() {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
            if (!this.MenuHostHelper$$ExternalSyntheticLambda1.isEmpty() || (this.MenuHostHelper$$ExternalSyntheticLambda1 instanceof ArrayList)) {
                return;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayList(this.setOnLongClickListener);
            return;
        }
        throw new UnsupportedOperationException();
    }

    private SortedMap<K, V> setX() {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
            if (this.setIconTintList.isEmpty() && !(this.setIconTintList instanceof TreeMap)) {
                TreeMap treeMap = new TreeMap();
                this.setIconTintList = treeMap;
                this.setY = treeMap.descendingMap();
            }
            return (SortedMap) this.setIconTintList;
        }
        throw new UnsupportedOperationException();
    }

    final V setX(int i) {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
            V value = this.MenuHostHelper$$ExternalSyntheticLambda1.remove(i).getValue();
            if (!this.setIconTintList.isEmpty()) {
                Iterator<Map.Entry<K, V>> it = setX().entrySet().iterator();
                this.MenuHostHelper$$ExternalSyntheticLambda1.add(new setX(this, it.next()));
                it.remove();
            }
            return value;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
            if (!this.MenuHostHelper$$ExternalSyntheticLambda1.isEmpty()) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.clear();
            }
            if (this.setIconTintList.isEmpty()) {
                return;
            }
            this.setIconTintList.clear();
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int size = this.MenuHostHelper$$ExternalSyntheticLambda1.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.MenuHostHelper$$ExternalSyntheticLambda1.get(i2).hashCode();
        }
        return this.setIconTintList.size() > 0 ? i + this.setIconTintList.hashCode() : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: setY */
    public final V put(K k, V v) {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
            int MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(k);
            if (MenuHostHelper$$ExternalSyntheticLambda0 >= 0) {
                return this.MenuHostHelper$$ExternalSyntheticLambda1.get(MenuHostHelper$$ExternalSyntheticLambda0).setValue(v);
            }
            setIconTintList();
            int i = -(MenuHostHelper$$ExternalSyntheticLambda0 + 1);
            if (i >= this.setOnLongClickListener) {
                return setX().put(k, v);
            }
            int size = this.MenuHostHelper$$ExternalSyntheticLambda1.size();
            int i2 = this.setOnLongClickListener;
            if (size == i2) {
                iW<K, V>.setX remove = this.MenuHostHelper$$ExternalSyntheticLambda1.remove(i2 - 1);
                setX().put(remove.setY, remove.getValue());
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1.add(i, new setX(k, v));
            return null;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
            Comparable comparable = (Comparable) obj;
            int MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(comparable);
            if (MenuHostHelper$$ExternalSyntheticLambda0 >= 0) {
                return (V) setX(MenuHostHelper$$ExternalSyntheticLambda0);
            }
            if (this.setIconTintList.isEmpty()) {
                return null;
            }
            return this.setIconTintList.remove(comparable);
        }
        throw new UnsupportedOperationException();
    }
}