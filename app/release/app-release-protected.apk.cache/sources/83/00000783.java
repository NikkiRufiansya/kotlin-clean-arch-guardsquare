package o;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class notifyAll<K, V> extends setCounterEnabled<K, V> {
    public HashMap<K, setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V>> MenuHostHelper$$ExternalSyntheticLambda1 = new HashMap<>();

    @Override // o.setCounterEnabled
    protected final setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setIconTintList(K k) {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.get(k);
    }

    @Override // o.setCounterEnabled
    public final V MenuHostHelper$$ExternalSyntheticLambda0(K k) {
        V v = (V) super.MenuHostHelper$$ExternalSyntheticLambda0(k);
        this.MenuHostHelper$$ExternalSyntheticLambda1.remove(k);
        return v;
    }

    @Override // o.setCounterEnabled
    public final V setX(K k, V v) {
        setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> setcounterenabled_menuhosthelper__externalsyntheticlambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1.get(k);
        if (setcounterenabled_menuhosthelper__externalsyntheticlambda0 != null) {
            return setcounterenabled_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.put(k, MenuHostHelper$$ExternalSyntheticLambda1(k, v));
        return null;
    }
}