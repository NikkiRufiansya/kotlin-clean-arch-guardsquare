package o;

import java.util.List;

/* loaded from: classes.dex */
public final class getFillAlpha extends getScaleY {
    private final List<setOnItemReselectedListener> setIconTintList;

    public getFillAlpha(List<setOnItemReselectedListener> list) {
        this.setIconTintList = list;
    }

    @Override // o.getScaleY
    public final List<setOnItemReselectedListener> MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setIconTintList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatchedLogRequest{logRequests=");
        sb.append(this.setIconTintList);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof getScaleY) {
            return this.setIconTintList.equals(((getScaleY) obj).MenuHostHelper$$ExternalSyntheticLambda0());
        }
        return false;
    }

    public final int hashCode() {
        return this.setIconTintList.hashCode() ^ 1000003;
    }
}