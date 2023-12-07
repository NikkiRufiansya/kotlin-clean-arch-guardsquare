package o;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o.setCropToPadding;

/* loaded from: classes.dex */
public final class setRepeatMode extends setCropToPadding {
    final AtomicBoolean setIconTintList;
    private final Map<setCropToPadding.setY<?>, Object> setY;

    public setRepeatMode() {
        this(null, false, 3);
    }

    public /* synthetic */ setRepeatMode(LinkedHashMap linkedHashMap, boolean z, int i) {
        this((i & 1) != 0 ? new LinkedHashMap() : linkedHashMap, (i & 2) != 0 ? true : z);
    }

    public setRepeatMode(Map<setCropToPadding.setY<?>, Object> map, boolean z) {
        pN.setY(map, "");
        this.setY = map;
        this.setIconTintList = new AtomicBoolean(z);
    }

    @Override // o.setCropToPadding
    public final <T> T setIconTintList(setCropToPadding.setY<T> sety) {
        pN.setY(sety, "");
        return (T) this.setY.get(sety);
    }

    @Override // o.setCropToPadding
    public final Map<setCropToPadding.setY<?>, Object> setY() {
        Map<setCropToPadding.setY<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.setY);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) unmodifiableMap, "");
        return unmodifiableMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof setRepeatMode) {
            return pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setY, ((setRepeatMode) obj).setY);
        }
        return false;
    }

    public final int hashCode() {
        return this.setY.hashCode();
    }

    public final String toString() {
        return C0348oi.MenuHostHelper$$ExternalSyntheticLambda0(this.setY.entrySet(), ",\n", "{\n", "\n}", setY.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    /* loaded from: classes.dex */
    static final class setY extends pO implements InterfaceC0377pk<Map.Entry<setCropToPadding.setY<?>, Object>, CharSequence> {
        public static final setY MenuHostHelper$$ExternalSyntheticLambda0 = new setY();

        setY() {
            super(1);
        }

        @Override // o.InterfaceC0377pk
        public final /* synthetic */ CharSequence setX(Map.Entry<setCropToPadding.setY<?>, Object> entry) {
            Map.Entry<setCropToPadding.setY<?>, Object> entry2 = entry;
            pN.setY(entry2, "");
            StringBuilder sb = new StringBuilder("  ");
            sb.append(entry2.getKey().setX);
            sb.append(" = ");
            sb.append(entry2.getValue());
            return sb.toString();
        }
    }

    public final <T> T MenuHostHelper$$ExternalSyntheticLambda1(setCropToPadding.setY<T> sety) {
        pN.setY(sety, "");
        if (!this.setIconTintList.get()) {
            return (T) this.setY.remove(sety);
        }
        throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(setCropToPadding.setY<?> sety, Object obj) {
        pN.setY(sety, "");
        if (!(!this.setIconTintList.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
        if (obj == null) {
            MenuHostHelper$$ExternalSyntheticLambda1(sety);
        } else if (!(obj instanceof Set)) {
            this.setY.put(sety, obj);
        } else {
            Map<setCropToPadding.setY<?>, Object> map = this.setY;
            Set unmodifiableSet = Collections.unmodifiableSet(C0348oi.setUnboundedRipple((Iterable) obj));
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) unmodifiableSet, "");
            map.put(sety, unmodifiableSet);
        }
    }
}