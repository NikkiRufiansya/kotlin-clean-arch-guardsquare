package o;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o.unwrap;

/* loaded from: classes.dex */
public final class setFallbackResource<T extends unwrap<T>> {
    public setIconTintList MenuHostHelper$$ExternalSyntheticLambda0;
    public boolean MenuHostHelper$$ExternalSyntheticLambda1;
    public boolean setIconTintList;
    public final Map<Integer, T> setY = new HashMap();
    public final Set<Integer> setX = new HashSet();

    /* loaded from: classes.dex */
    public interface setIconTintList {
        void setY();
    }

    public final int setY() {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda1 || this.setX.isEmpty()) {
            return -1;
        }
        return this.setX.iterator().next().intValue();
    }

    public final boolean setIconTintList(unwrap<T> unwrapVar) {
        int id = unwrapVar.getId();
        if (this.setX.contains(Integer.valueOf(id))) {
            return false;
        }
        T t = this.setY.get(Integer.valueOf(setY()));
        if (t != null) {
            setY(t, false);
        }
        boolean add = this.setX.add(Integer.valueOf(id));
        if (!unwrapVar.isChecked()) {
            unwrapVar.setChecked(true);
        }
        return add;
    }

    public final boolean setY(unwrap<T> unwrapVar, boolean z) {
        int id = unwrapVar.getId();
        if (this.setX.contains(Integer.valueOf(id))) {
            if (z && this.setX.size() == 1 && this.setX.contains(Integer.valueOf(id))) {
                unwrapVar.setChecked(true);
                return false;
            }
            boolean remove = this.setX.remove(Integer.valueOf(id));
            if (unwrapVar.isChecked()) {
                unwrapVar.setChecked(false);
            }
            return remove;
        }
        return false;
    }
}