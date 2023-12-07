package o;

import java.util.Iterator;
import java.util.Map;
import o.setIconEndPadding;

/* loaded from: classes.dex */
class setIconEndPadding$MenuHostHelper$$ExternalSyntheticLambda1<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> MenuHostHelper$$ExternalSyntheticLambda1;

    public setIconEndPadding$MenuHostHelper$$ExternalSyntheticLambda1(Iterator<Map.Entry<K, Object>> it) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.MenuHostHelper$$ExternalSyntheticLambda1.remove();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.MenuHostHelper$$ExternalSyntheticLambda1.next();
        return next.getValue() instanceof setIconEndPadding ? new setIconEndPadding.setIconTintList(next, (byte) 0) : next;
    }
}