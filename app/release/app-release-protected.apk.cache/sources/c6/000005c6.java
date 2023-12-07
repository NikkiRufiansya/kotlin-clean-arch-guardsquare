package o;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o.C0218hq;

/* renamed from: o.hq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218hq<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> setY = new Comparator<Comparable>() { // from class: o.hq.5
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    private Comparator<? super K> MenuHostHelper$$ExternalSyntheticLambda0;
    int MenuHostHelper$$ExternalSyntheticLambda1;
    final setY<K, V> setIconTintList;
    private setY<K, V> setLayoutAnimation;
    /* JADX WARN: Incorrect inner types in field signature: Lo/hq<TK;TV;>.ExternalSyntheticLambda0; */
    private hq$MenuHostHelper$$ExternalSyntheticLambda0 setNavigationOnClickListener;
    private C0218hq<K, V>.setIconTintList setUiOptions;
    int setX;

    public C0218hq() {
        this(setY);
    }

    private C0218hq(Comparator<? super K> comparator) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        this.setX = 0;
        this.setIconTintList = new setY<>();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = comparator == null ? setY : comparator;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        setY<K, V> MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(obj);
        if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            return MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return MenuHostHelper$$ExternalSyntheticLambda1(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        setY<K, V> iconTintList = setIconTintList(k, true);
        V v2 = iconTintList.setUnboundedRipple;
        iconTintList.setUnboundedRipple = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.setLayoutAnimation = null;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        this.setX++;
        setY<K, V> sety = this.setIconTintList;
        sety.setLayoutAnimation = sety;
        sety.setX = sety;
    }

    private setY<K, V> setIconTintList(K k, boolean z) {
        int i;
        setY<K, V> sety;
        Comparator<? super K> comparator = this.MenuHostHelper$$ExternalSyntheticLambda0;
        setY<K, V> sety2 = this.setLayoutAnimation;
        if (sety2 != null) {
            Comparable comparable = comparator == setY ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(sety2.MenuHostHelper$$ExternalSyntheticLambda1);
                } else {
                    i = comparator.compare(k, (K) sety2.MenuHostHelper$$ExternalSyntheticLambda1);
                }
                if (i != 0) {
                    setY<K, V> sety3 = i < 0 ? sety2.MenuHostHelper$$ExternalSyntheticLambda0 : sety2.setNavigationOnClickListener;
                    if (sety3 == null) {
                        break;
                    }
                    sety2 = sety3;
                } else {
                    return sety2;
                }
            }
        } else {
            i = 0;
        }
        if (z) {
            setY<K, V> sety4 = this.setIconTintList;
            if (sety2 == null) {
                if (comparator == setY && !(k instanceof Comparable)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(k.getClass().getName());
                    sb.append(" is not Comparable");
                    throw new ClassCastException(sb.toString());
                }
                sety = new setY<>(sety2, k, sety4, sety4.setLayoutAnimation);
                this.setLayoutAnimation = sety;
            } else {
                sety = new setY<>(sety2, k, sety4, sety4.setLayoutAnimation);
                if (i < 0) {
                    sety2.MenuHostHelper$$ExternalSyntheticLambda0 = sety;
                } else {
                    sety2.setNavigationOnClickListener = sety;
                }
                MenuHostHelper$$ExternalSyntheticLambda1(sety2, true);
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1++;
            this.setX++;
            return sety;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final setY<K, V> MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        if (obj != 0) {
            try {
                return setIconTintList(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final o.C0218hq.setY<K, V> setY(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            o.hq$setY r0 = r4.MenuHostHelper$$ExternalSyntheticLambda1(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L22
            V r3 = r0.setUnboundedRipple
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L1e
            if (r3 == 0) goto L1c
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L1e
        L1c:
            r5 = 0
            goto L1f
        L1e:
            r5 = 1
        L1f:
            if (r5 == 0) goto L22
            goto L23
        L22:
            r1 = 0
        L23:
            if (r1 == 0) goto L26
            goto L27
        L26:
            r0 = 0
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0218hq.setY(java.util.Map$Entry):o.hq$setY");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setY<K, V> sety, boolean z) {
        setY<K, V> sety2;
        setY<K, V> sety3;
        int i;
        if (z) {
            sety.setLayoutAnimation.setX = sety.setX;
            sety.setX.setLayoutAnimation = sety.setLayoutAnimation;
        }
        setY<K, V> sety4 = sety.MenuHostHelper$$ExternalSyntheticLambda0;
        setY<K, V> sety5 = sety.setNavigationOnClickListener;
        setY<K, V> sety6 = sety.setIconTintList;
        int i2 = 0;
        if (sety4 != null && sety5 != null) {
            if (sety4.setY > sety5.setY) {
                setY<K, V> sety7 = sety4.setNavigationOnClickListener;
                while (true) {
                    setY<K, V> sety8 = sety7;
                    sety3 = sety4;
                    sety4 = sety8;
                    if (sety4 == null) {
                        break;
                    }
                    sety7 = sety4.setNavigationOnClickListener;
                }
            } else {
                setY<K, V> sety9 = sety5.MenuHostHelper$$ExternalSyntheticLambda0;
                while (true) {
                    sety2 = sety5;
                    sety5 = sety9;
                    if (sety5 == null) {
                        break;
                    }
                    sety9 = sety5.MenuHostHelper$$ExternalSyntheticLambda0;
                }
                sety3 = sety2;
            }
            MenuHostHelper$$ExternalSyntheticLambda0((setY) sety3, false);
            setY<K, V> sety10 = sety.MenuHostHelper$$ExternalSyntheticLambda0;
            if (sety10 != null) {
                i = sety10.setY;
                sety3.MenuHostHelper$$ExternalSyntheticLambda0 = sety10;
                sety10.setIconTintList = sety3;
                sety.MenuHostHelper$$ExternalSyntheticLambda0 = null;
            } else {
                i = 0;
            }
            setY<K, V> sety11 = sety.setNavigationOnClickListener;
            if (sety11 != null) {
                i2 = sety11.setY;
                sety3.setNavigationOnClickListener = sety11;
                sety11.setIconTintList = sety3;
                sety.setNavigationOnClickListener = null;
            }
            sety3.setY = Math.max(i, i2) + 1;
            MenuHostHelper$$ExternalSyntheticLambda0(sety, sety3);
            return;
        }
        if (sety4 != null) {
            MenuHostHelper$$ExternalSyntheticLambda0(sety, sety4);
            sety.MenuHostHelper$$ExternalSyntheticLambda0 = null;
        } else if (sety5 != null) {
            MenuHostHelper$$ExternalSyntheticLambda0(sety, sety5);
            sety.setNavigationOnClickListener = null;
        } else {
            MenuHostHelper$$ExternalSyntheticLambda0(sety, (setY) null);
        }
        MenuHostHelper$$ExternalSyntheticLambda1(sety6, false);
        this.MenuHostHelper$$ExternalSyntheticLambda1--;
        this.setX++;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(setY<K, V> sety, setY<K, V> sety2) {
        setY<K, V> sety3 = sety.setIconTintList;
        sety.setIconTintList = null;
        if (sety2 != null) {
            sety2.setIconTintList = sety3;
        }
        if (sety3 != null) {
            if (sety3.MenuHostHelper$$ExternalSyntheticLambda0 == sety) {
                sety3.MenuHostHelper$$ExternalSyntheticLambda0 = sety2;
                return;
            } else {
                sety3.setNavigationOnClickListener = sety2;
                return;
            }
        }
        this.setLayoutAnimation = sety2;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(setY<K, V> sety, boolean z) {
        while (sety != null) {
            setY<K, V> sety2 = sety.MenuHostHelper$$ExternalSyntheticLambda0;
            setY<K, V> sety3 = sety.setNavigationOnClickListener;
            int i = sety2 != null ? sety2.setY : 0;
            int i2 = sety3 != null ? sety3.setY : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                setY<K, V> sety4 = sety3.MenuHostHelper$$ExternalSyntheticLambda0;
                setY<K, V> sety5 = sety3.setNavigationOnClickListener;
                int i4 = (sety4 != null ? sety4.setY : 0) - (sety5 != null ? sety5.setY : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    setY((setY) sety3);
                }
                setX(sety);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                setY<K, V> sety6 = sety2.MenuHostHelper$$ExternalSyntheticLambda0;
                setY<K, V> sety7 = sety2.setNavigationOnClickListener;
                int i5 = (sety6 != null ? sety6.setY : 0) - (sety7 != null ? sety7.setY : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    setX(sety2);
                }
                setY((setY) sety);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                sety.setY = i + 1;
                if (z) {
                    return;
                }
            } else {
                sety.setY = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            sety = sety.setIconTintList;
        }
    }

    private void setX(setY<K, V> sety) {
        setY<K, V> sety2 = sety.MenuHostHelper$$ExternalSyntheticLambda0;
        setY<K, V> sety3 = sety.setNavigationOnClickListener;
        setY<K, V> sety4 = sety3.MenuHostHelper$$ExternalSyntheticLambda0;
        setY<K, V> sety5 = sety3.setNavigationOnClickListener;
        sety.setNavigationOnClickListener = sety4;
        if (sety4 != null) {
            sety4.setIconTintList = sety;
        }
        MenuHostHelper$$ExternalSyntheticLambda0(sety, sety3);
        sety3.MenuHostHelper$$ExternalSyntheticLambda0 = sety;
        sety.setIconTintList = sety3;
        sety.setY = Math.max(sety2 != null ? sety2.setY : 0, sety4 != null ? sety4.setY : 0) + 1;
        sety3.setY = Math.max(sety.setY, sety5 != null ? sety5.setY : 0) + 1;
    }

    private void setY(setY<K, V> sety) {
        setY<K, V> sety2 = sety.MenuHostHelper$$ExternalSyntheticLambda0;
        setY<K, V> sety3 = sety.setNavigationOnClickListener;
        setY<K, V> sety4 = sety2.MenuHostHelper$$ExternalSyntheticLambda0;
        setY<K, V> sety5 = sety2.setNavigationOnClickListener;
        sety.MenuHostHelper$$ExternalSyntheticLambda0 = sety5;
        if (sety5 != null) {
            sety5.setIconTintList = sety;
        }
        MenuHostHelper$$ExternalSyntheticLambda0(sety, sety2);
        sety2.setNavigationOnClickListener = sety;
        sety.setIconTintList = sety2;
        sety.setY = Math.max(sety3 != null ? sety3.setY : 0, sety5 != null ? sety5.setY : 0) + 1;
        sety2.setY = Math.max(sety.setY, sety4 != null ? sety4.setY : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C0218hq<K, V>.setIconTintList seticontintlist = this.setUiOptions;
        if (seticontintlist == null) {
            C0218hq<K, V>.setIconTintList seticontintlist2 = new setIconTintList();
            this.setUiOptions = seticontintlist2;
            return seticontintlist2;
        }
        return seticontintlist;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set<K>, o.hq$MenuHostHelper$$ExternalSyntheticLambda0] */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        hq$MenuHostHelper$$ExternalSyntheticLambda0 hq_menuhosthelper__externalsyntheticlambda0 = this.setNavigationOnClickListener;
        if (hq_menuhosthelper__externalsyntheticlambda0 == null) {
            AbstractSet<K> abstractSet = new AbstractSet<K>() { // from class: o.hq$MenuHostHelper$$ExternalSyntheticLambda0
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
                    return C0218hq.this.MenuHostHelper$$ExternalSyntheticLambda1;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator<K> iterator() {
                    return new C0218hq.setX() { // from class: o.hq$MenuHostHelper$$ExternalSyntheticLambda0.3
                        {
                            C0218hq c0218hq = C0218hq.this;
                        }

                        @Override // java.util.Iterator
                        public final K next() {
                            return MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda1;
                        }
                    };
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
                    return C0218hq.this.containsKey(obj);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean remove(Object obj) {
                    C0218hq c0218hq = C0218hq.this;
                    C0218hq.setY MenuHostHelper$$ExternalSyntheticLambda1 = c0218hq.MenuHostHelper$$ExternalSyntheticLambda1(obj);
                    if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                        c0218hq.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1, true);
                    }
                    return MenuHostHelper$$ExternalSyntheticLambda1 != null;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final void clear() {
                    C0218hq.this.clear();
                }
            };
            this.setNavigationOnClickListener = abstractSet;
            return abstractSet;
        }
        return hq_menuhosthelper__externalsyntheticlambda0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.hq$setY */
    /* loaded from: classes.dex */
    public static final class setY<K, V> implements Map.Entry<K, V> {
        setY<K, V> MenuHostHelper$$ExternalSyntheticLambda0;
        final K MenuHostHelper$$ExternalSyntheticLambda1;
        setY<K, V> setIconTintList;
        setY<K, V> setLayoutAnimation;
        setY<K, V> setNavigationOnClickListener;
        V setUnboundedRipple;
        setY<K, V> setX;
        int setY;

        setY() {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
            this.setLayoutAnimation = this;
            this.setX = this;
        }

        setY(setY<K, V> sety, K k, setY<K, V> sety2, setY<K, V> sety3) {
            this.setIconTintList = sety;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = k;
            this.setY = 1;
            this.setX = sety2;
            this.setLayoutAnimation = sety3;
            sety3.setX = this;
            sety2.setLayoutAnimation = this;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.setUnboundedRipple;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.setUnboundedRipple;
            this.setUnboundedRipple = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.MenuHostHelper$$ExternalSyntheticLambda1;
                if (k == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k.equals(entry.getKey())) {
                    return false;
                }
                V v = this.setUnboundedRipple;
                if (v == null) {
                    if (entry.getValue() != null) {
                        return false;
                    }
                } else if (!v.equals(entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.MenuHostHelper$$ExternalSyntheticLambda1;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.setUnboundedRipple;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
            sb.append("=");
            sb.append(this.setUnboundedRipple);
            return sb.toString();
        }
    }

    /* renamed from: o.hq$setX */
    /* loaded from: classes.dex */
    abstract class setX<T> implements Iterator<T> {
        private setY<K, V> MenuHostHelper$$ExternalSyntheticLambda0 = null;
        private int setIconTintList;
        private setY<K, V> setX;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setX() {
            this.setX = C0218hq.this.setIconTintList.setX;
            this.setIconTintList = C0218hq.this.setX;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.setX != C0218hq.this.setIconTintList;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final setY<K, V> MenuHostHelper$$ExternalSyntheticLambda0() {
            setY<K, V> sety = this.setX;
            if (sety == C0218hq.this.setIconTintList) {
                throw new NoSuchElementException();
            }
            if (C0218hq.this.setX != this.setIconTintList) {
                throw new ConcurrentModificationException();
            }
            this.setX = sety.setX;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = sety;
            return sety;
        }

        @Override // java.util.Iterator
        public final void remove() {
            setY<K, V> sety = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (sety == null) {
                throw new IllegalStateException();
            }
            C0218hq.this.MenuHostHelper$$ExternalSyntheticLambda0((setY) sety, true);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
            this.setIconTintList = C0218hq.this.setX;
        }
    }

    /* renamed from: o.hq$setIconTintList */
    /* loaded from: classes.dex */
    class setIconTintList extends AbstractSet<Map.Entry<K, V>> {
        setIconTintList() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C0218hq.this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new setX() { // from class: o.hq.setIconTintList.4
                {
                    C0218hq c0218hq = C0218hq.this;
                }

                @Override // java.util.Iterator
                public final /* synthetic */ Object next() {
                    return MenuHostHelper$$ExternalSyntheticLambda0();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C0218hq.this.setY((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            setY<K, V> y;
            if ((obj instanceof Map.Entry) && (y = C0218hq.this.setY((Map.Entry) obj)) != null) {
                C0218hq.this.MenuHostHelper$$ExternalSyntheticLambda0((setY) y, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C0218hq.this.clear();
        }
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        setY<K, V> MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(obj);
        if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            MenuHostHelper$$ExternalSyntheticLambda0((setY) MenuHostHelper$$ExternalSyntheticLambda1, true);
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            return MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple;
        }
        return null;
    }
}