package o;

/* loaded from: classes.dex */
public final class kQ {
    private final Integer found;
    private final Integer limit;
    private final Integer page;
    private final Integer returned;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kQ) {
            kQ kQVar = (kQ) obj;
            return pN.MenuHostHelper$$ExternalSyntheticLambda0(this.found, kQVar.found) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.limit, kQVar.limit) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.page, kQVar.page) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.returned, kQVar.returned);
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.found;
        int hashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.limit;
        int hashCode2 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.page;
        int hashCode3 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.returned;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Meta(found=");
        sb.append(this.found);
        sb.append(", limit=");
        sb.append(this.limit);
        sb.append(", page=");
        sb.append(this.page);
        sb.append(", returned=");
        sb.append(this.returned);
        sb.append(')');
        return sb.toString();
    }
}