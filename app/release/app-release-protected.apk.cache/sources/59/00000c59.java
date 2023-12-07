package o;

import java.util.Map;

/* loaded from: classes.dex */
public final class setIconEndPadding extends setAddStatesFromChildren {
    final setDrawingCacheQuality setIconTintList;

    /* loaded from: classes.dex */
    static class setIconTintList<K> implements Map.Entry<K, Object> {
        Map.Entry<K, setIconEndPadding> setY;

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ setIconTintList(Map.Entry entry, byte b) {
            this(entry);
        }

        private setIconTintList(Map.Entry<K, setIconEndPadding> entry) {
            this.setY = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.setY.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            setIconEndPadding value = this.setY.getValue();
            if (value == null) {
                return null;
            }
            return value.MenuHostHelper$$ExternalSyntheticLambda0(value.setIconTintList);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof setDrawingCacheQuality)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            setIconEndPadding value = this.setY.getValue();
            setDrawingCacheQuality setdrawingcachequality = value.MenuHostHelper$$ExternalSyntheticLambda1;
            value.MenuHostHelper$$ExternalSyntheticLambda0 = null;
            value.setX = null;
            value.MenuHostHelper$$ExternalSyntheticLambda1 = (setDrawingCacheQuality) obj;
            return setdrawingcachequality;
        }
    }

    @Override // o.setAddStatesFromChildren
    public final boolean equals(Object obj) {
        return MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList).equals(obj);
    }

    @Override // o.setAddStatesFromChildren
    public final int hashCode() {
        return MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList).hashCode();
    }

    public final String toString() {
        return MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList).toString();
    }
}