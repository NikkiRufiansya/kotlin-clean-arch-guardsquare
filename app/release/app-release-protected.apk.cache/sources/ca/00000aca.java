package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class setCounterEnabled<K, V> implements Iterable<Map.Entry<K, V>> {
    public setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> MenuHostHelper$$ExternalSyntheticLambda0;
    public setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setY;
    public WeakHashMap<setUnboundedRipple<K, V>, Boolean> setX = new WeakHashMap<>();
    public int setIconTintList = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface setUnboundedRipple<K, V> {
        void a_(setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda0);
    }

    protected setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setIconTintList(K k) {
        setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        while (setcounterenabled_menuhosthelper__externalsyntheticlambda0 != null && !setcounterenabled_menuhosthelper__externalsyntheticlambda0.setIconTintList.equals(k)) {
            setcounterenabled_menuhosthelper__externalsyntheticlambda0 = setcounterenabled_menuhosthelper__externalsyntheticlambda0.setX;
        }
        return setcounterenabled_menuhosthelper__externalsyntheticlambda0;
    }

    public V setX(K k, V v) {
        setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> iconTintList = setIconTintList(k);
        if (iconTintList != null) {
            return iconTintList.MenuHostHelper$$ExternalSyntheticLambda1;
        }
        MenuHostHelper$$ExternalSyntheticLambda1(k, v);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> MenuHostHelper$$ExternalSyntheticLambda1(K k, V v) {
        setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda0 = new setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<>(k, v);
        this.setIconTintList++;
        setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda02 = this.setY;
        if (setcounterenabled_menuhosthelper__externalsyntheticlambda02 == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setcounterenabled_menuhosthelper__externalsyntheticlambda0;
            this.setY = setcounterenabled_menuhosthelper__externalsyntheticlambda0;
            return setcounterenabled_menuhosthelper__externalsyntheticlambda0;
        }
        setcounterenabled_menuhosthelper__externalsyntheticlambda02.setX = setcounterenabled_menuhosthelper__externalsyntheticlambda0;
        setcounterenabled_menuhosthelper__externalsyntheticlambda0.setY = this.setY;
        this.setY = setcounterenabled_menuhosthelper__externalsyntheticlambda0;
        return setcounterenabled_menuhosthelper__externalsyntheticlambda0;
    }

    public V MenuHostHelper$$ExternalSyntheticLambda0(K k) {
        setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> iconTintList = setIconTintList(k);
        if (iconTintList == null) {
            return null;
        }
        this.setIconTintList--;
        if (!this.setX.isEmpty()) {
            for (setUnboundedRipple<K, V> setunboundedripple : this.setX.keySet()) {
                setunboundedripple.a_(iconTintList);
            }
        }
        if (iconTintList.setY != null) {
            iconTintList.setY.setX = iconTintList.setX;
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = iconTintList.setX;
        }
        if (iconTintList.setX != null) {
            iconTintList.setX.setY = iconTintList.setY;
        } else {
            this.setY = iconTintList.setY;
        }
        iconTintList.setX = null;
        iconTintList.setY = null;
        return iconTintList.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        setIconTintList seticontintlist = new setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0, this.setY);
        this.setX.put(seticontintlist, Boolean.FALSE);
        return seticontintlist;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof setCounterEnabled) {
            setCounterEnabled setcounterenabled = (setCounterEnabled) obj;
            if (this.setIconTintList != setcounterenabled.setIconTintList) {
                return false;
            }
            Iterator<Map.Entry<K, V>> it = iterator();
            Iterator<Map.Entry<K, V>> it2 = setcounterenabled.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Map.Entry<K, V> next = it.next();
                Map.Entry<K, V> next2 = it2.next();
                if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                    return false;
                }
            }
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        return false;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* loaded from: classes.dex */
    static abstract class setX<K, V> implements Iterator<Map.Entry<K, V>>, setUnboundedRipple<K, V> {
        private setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> MenuHostHelper$$ExternalSyntheticLambda1;
        private setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setIconTintList;

        abstract setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> MenuHostHelper$$ExternalSyntheticLambda1(setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda0);

        abstract setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setIconTintList(setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda0);

        /* JADX INFO: Access modifiers changed from: package-private */
        public setX(setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda0, setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda02) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = setcounterenabled_menuhosthelper__externalsyntheticlambda02;
            this.setIconTintList = setcounterenabled_menuhosthelper__externalsyntheticlambda0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.setIconTintList != null;
        }

        @Override // o.setCounterEnabled.setUnboundedRipple
        public final void a_(setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda0) {
            setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda02 = null;
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == setcounterenabled_menuhosthelper__externalsyntheticlambda0 && setcounterenabled_menuhosthelper__externalsyntheticlambda0 == this.setIconTintList) {
                this.setIconTintList = null;
                this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
            }
            setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda03 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setcounterenabled_menuhosthelper__externalsyntheticlambda03 == setcounterenabled_menuhosthelper__externalsyntheticlambda0) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(setcounterenabled_menuhosthelper__externalsyntheticlambda03);
            }
            setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda04 = this.setIconTintList;
            if (setcounterenabled_menuhosthelper__externalsyntheticlambda04 == setcounterenabled_menuhosthelper__externalsyntheticlambda0) {
                setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda05 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                if (setcounterenabled_menuhosthelper__externalsyntheticlambda04 != setcounterenabled_menuhosthelper__externalsyntheticlambda05 && setcounterenabled_menuhosthelper__externalsyntheticlambda05 != null) {
                    setcounterenabled_menuhosthelper__externalsyntheticlambda02 = setIconTintList(setcounterenabled_menuhosthelper__externalsyntheticlambda04);
                }
                this.setIconTintList = setcounterenabled_menuhosthelper__externalsyntheticlambda02;
            }
        }

        @Override // java.util.Iterator
        public /* synthetic */ Object next() {
            setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda0 = this.setIconTintList;
            setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda02 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            this.setIconTintList = (setcounterenabled_menuhosthelper__externalsyntheticlambda0 == setcounterenabled_menuhosthelper__externalsyntheticlambda02 || setcounterenabled_menuhosthelper__externalsyntheticlambda02 == null) ? null : setIconTintList(setcounterenabled_menuhosthelper__externalsyntheticlambda0);
            return setcounterenabled_menuhosthelper__externalsyntheticlambda0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList<K, V> extends setX<K, V> {
        setIconTintList(setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda0, setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda02) {
            super(setcounterenabled_menuhosthelper__externalsyntheticlambda0, setcounterenabled_menuhosthelper__externalsyntheticlambda02);
        }

        @Override // o.setCounterEnabled.setX
        final setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setIconTintList(setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda0) {
            return setcounterenabled_menuhosthelper__externalsyntheticlambda0.setX;
        }

        @Override // o.setCounterEnabled.setX
        final setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> MenuHostHelper$$ExternalSyntheticLambda1(setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda0) {
            return setcounterenabled_menuhosthelper__externalsyntheticlambda0.setY;
        }
    }

    /* loaded from: classes.dex */
    public class setY implements Iterator<Map.Entry<K, V>>, setUnboundedRipple<K, V> {
        private boolean MenuHostHelper$$ExternalSyntheticLambda1 = true;
        private setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setIconTintList;

        public setY() {
        }

        @Override // o.setCounterEnabled.setUnboundedRipple
        public final void a_(setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda0) {
            setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda02 = this.setIconTintList;
            if (setcounterenabled_menuhosthelper__externalsyntheticlambda0 == setcounterenabled_menuhosthelper__externalsyntheticlambda02) {
                setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda03 = setcounterenabled_menuhosthelper__externalsyntheticlambda02.setY;
                this.setIconTintList = setcounterenabled_menuhosthelper__externalsyntheticlambda03;
                this.MenuHostHelper$$ExternalSyntheticLambda1 = setcounterenabled_menuhosthelper__externalsyntheticlambda03 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                return setCounterEnabled.this.MenuHostHelper$$ExternalSyntheticLambda0 != null;
            }
            setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda0 = this.setIconTintList;
            return (setcounterenabled_menuhosthelper__externalsyntheticlambda0 == null || setcounterenabled_menuhosthelper__externalsyntheticlambda0.setX == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final /* bridge */ /* synthetic */ Object next() {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
                this.setIconTintList = setCounterEnabled.this.MenuHostHelper$$ExternalSyntheticLambda0;
            } else {
                setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda0 = this.setIconTintList;
                this.setIconTintList = setcounterenabled_menuhosthelper__externalsyntheticlambda0 != null ? setcounterenabled_menuhosthelper__externalsyntheticlambda0.setX : null;
            }
            return this.setIconTintList;
        }
    }
}