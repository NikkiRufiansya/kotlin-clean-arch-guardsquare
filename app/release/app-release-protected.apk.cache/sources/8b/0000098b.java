package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class setBottom<V, O> implements FirebaseSessionsRegistrar<V, O> {
    public final List<setChildIndicatorBoundsRelative<V>> MenuHostHelper$$ExternalSyntheticLambda1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setBottom(V v) {
        this(Collections.singletonList(new setChildIndicatorBoundsRelative(v)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setBottom(List<setChildIndicatorBoundsRelative<V>> list) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = list;
    }

    @Override // o.FirebaseSessionsRegistrar
    public List<setChildIndicatorBoundsRelative<V>> setIconTintList() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.FirebaseSessionsRegistrar
    public boolean setY() {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda1.isEmpty()) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1.size() != 1) {
                return false;
            }
            if (!(this.MenuHostHelper$$ExternalSyntheticLambda1.get(0).setUnboundedRipple == null)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.MenuHostHelper$$ExternalSyntheticLambda1.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.MenuHostHelper$$ExternalSyntheticLambda1.toArray()));
        }
        return sb.toString();
    }
}