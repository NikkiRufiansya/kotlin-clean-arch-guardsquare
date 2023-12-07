package o;

import java.util.Map;

/* loaded from: classes.dex */
class iu$MenuHostHelper$$ExternalSyntheticLambda1<K> implements Map.Entry<K, Object> {
    Map.Entry<K, C0248iu> setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ iu$MenuHostHelper$$ExternalSyntheticLambda1(Map.Entry entry, byte b) {
        this(entry);
    }

    private iu$MenuHostHelper$$ExternalSyntheticLambda1(Map.Entry<K, C0248iu> entry) {
        this.setY = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.setY.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C0248iu value = this.setY.getValue();
        if (value == null) {
            return null;
        }
        return value.setX(value.setY);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof iJ)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        C0248iu value = this.setY.getValue();
        iJ iJVar = value.setIconTintList;
        value.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        value.MenuHostHelper$$ExternalSyntheticLambda0 = null;
        value.setIconTintList = (iJ) obj;
        return iJVar;
    }
}