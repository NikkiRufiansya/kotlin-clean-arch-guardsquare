package o;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.setViewCacheExtension;

/* loaded from: classes.dex */
public final class setTextOn<K, V> extends LinkedHashMap<K, V> {
    private static final setTextOn MenuHostHelper$$ExternalSyntheticLambda0;
    public boolean MenuHostHelper$$ExternalSyntheticLambda1;

    public setTextOn() {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
    }

    public setTextOn(Map<K, V> map) {
        super(map);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
    }

    static {
        setTextOn settexton = new setTextOn();
        MenuHostHelper$$ExternalSyntheticLambda0 = settexton;
        settexton.MenuHostHelper$$ExternalSyntheticLambda1 = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L5d
            java.util.Map r7 = (java.util.Map) r7
            if (r6 == r7) goto L59
            int r0 = r6.size()
            int r3 = r7.size()
            if (r0 == r3) goto L16
        L14:
            r7 = 0
            goto L5a
        L16:
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L35
            goto L14
        L35:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L52
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L52
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L56
        L52:
            boolean r3 = r4.equals(r3)
        L56:
            if (r3 != 0) goto L1e
            goto L14
        L59:
            r7 = 1
        L5a:
            if (r7 == 0) goto L5d
            goto L5e
        L5d:
            r1 = 0
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTextOn.equals(java.lang.Object):boolean");
    }

    private static int MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        if (obj instanceof byte[]) {
            return setViewCacheExtension.setY((byte[]) obj);
        }
        if (obj instanceof setViewCacheExtension.setX) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            super.clear();
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += MenuHostHelper$$ExternalSyntheticLambda1(entry.getValue()) ^ MenuHostHelper$$ExternalSyntheticLambda1(entry.getKey());
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            setViewCacheExtension.setIconTintList(k);
            setViewCacheExtension.setIconTintList(v);
            return (V) super.put(k, v);
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda1) {
            throw new UnsupportedOperationException();
        }
        for (K k : map.keySet()) {
            setViewCacheExtension.setIconTintList(k);
            setViewCacheExtension.setIconTintList(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            return (V) super.remove(obj);
        }
        throw new UnsupportedOperationException();
    }
}