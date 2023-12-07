package o;

import java.util.Iterator;
import java.util.Map;
import o.iW;

/* loaded from: classes.dex */
class iW$MenuHostHelper$$ExternalSyntheticLambda1 extends iW.setOnLongClickListener {
    private /* synthetic */ iW setX;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private iW$MenuHostHelper$$ExternalSyntheticLambda1(iW iWVar) {
        super(iWVar, (byte) 0);
        this.setX = iWVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ iW$MenuHostHelper$$ExternalSyntheticLambda1(iW iWVar, byte b) {
        this(iWVar);
    }

    @Override // o.iW.setOnLongClickListener, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new iW.setIconTintList(this.setX, (byte) 0);
    }
}