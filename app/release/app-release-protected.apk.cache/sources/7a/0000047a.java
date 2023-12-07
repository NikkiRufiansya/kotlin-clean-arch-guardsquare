package o;

import java.util.Set;

/* renamed from: o.fm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0159fm extends AbstractC0157fk {
    private final Set<String> setY;

    public C0159fm(Set<String> set) {
        this.setY = set;
    }

    @Override // o.AbstractC0157fk
    public final Set<String> MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setY;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigUpdate{updatedKeys=");
        sb.append(this.setY);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0157fk) {
            return this.setY.equals(((AbstractC0157fk) obj).MenuHostHelper$$ExternalSyntheticLambda0());
        }
        return false;
    }

    public final int hashCode() {
        return this.setY.hashCode() ^ 1000003;
    }
}