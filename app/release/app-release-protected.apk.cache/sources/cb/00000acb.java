package o;

import java.util.Map;

/* loaded from: classes.dex */
public class setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> implements Map.Entry<K, V> {
    final V MenuHostHelper$$ExternalSyntheticLambda1;
    final K setIconTintList;
    setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setX;
    public setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0(K k, V v) {
        this.setIconTintList = k;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = v;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.setIconTintList;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.setIconTintList);
        sb.append("=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        return sb.toString();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0) {
            setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0 setcounterenabled_menuhosthelper__externalsyntheticlambda0 = (setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0) obj;
            return this.setIconTintList.equals(setcounterenabled_menuhosthelper__externalsyntheticlambda0.setIconTintList) && this.MenuHostHelper$$ExternalSyntheticLambda1.equals(setcounterenabled_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.setIconTintList.hashCode() ^ this.MenuHostHelper$$ExternalSyntheticLambda1.hashCode();
    }
}