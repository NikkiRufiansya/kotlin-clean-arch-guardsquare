package o;

import java.util.List;

/* loaded from: classes.dex */
public final class kM {
    public final int MenuHostHelper$$ExternalSyntheticLambda0;
    public final List<String> setX;

    public kM() {
        this((List) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kM) {
            kM kMVar = (kM) obj;
            return this.MenuHostHelper$$ExternalSyntheticLambda0 == kMVar.MenuHostHelper$$ExternalSyntheticLambda0 && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setX, kMVar.setX);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        List<String> list = this.setX;
        return (i * 31) + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrimaryNewsUUID(id=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", list=");
        sb.append(this.setX);
        sb.append(')');
        return sb.toString();
    }

    public kM(int i, List<String> list) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        this.setX = list;
    }

    public /* synthetic */ kM(List list, int i) {
        this(0, (i & 2) != 0 ? null : list);
    }
}