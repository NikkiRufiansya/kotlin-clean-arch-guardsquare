package o;

import java.util.List;

/* loaded from: classes.dex */
public final class kT {
    public final List<kP> data;
    private final kQ meta;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kT) {
            kT kTVar = (kT) obj;
            return pN.MenuHostHelper$$ExternalSyntheticLambda0(this.data, kTVar.data) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.meta, kTVar.meta);
        }
        return false;
    }

    public final int hashCode() {
        List<kP> list = this.data;
        int hashCode = list == null ? 0 : list.hashCode();
        kQ kQVar = this.meta;
        return (hashCode * 31) + (kQVar != null ? kQVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsByCategory(data=");
        sb.append(this.data);
        sb.append(", meta=");
        sb.append(this.meta);
        sb.append(')');
        return sb.toString();
    }
}