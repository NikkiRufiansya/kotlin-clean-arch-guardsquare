package o;

/* loaded from: classes.dex */
public final class nO implements Comparable<nO> {
    public static final nO MenuHostHelper$$ExternalSyntheticLambda1;
    private final int setX;
    private final int MenuHostHelper$$ExternalSyntheticLambda0 = 1;
    private final int setIconTintList = 7;
    private final int setY = 10;

    public nO() {
        boolean z = false;
        C0405ql c0405ql = new C0405ql(0, 255);
        if (c0405ql.setIconTintList() <= 1 && c0405ql.setIconTintList > 0) {
            C0405ql c0405ql2 = new C0405ql(0, 255);
            if (c0405ql2.setIconTintList() <= 7 && 7 <= c0405ql2.setIconTintList) {
                C0405ql c0405ql3 = new C0405ql(0, 255);
                if (c0405ql3.setIconTintList() <= 10 && 10 <= c0405ql3.setIconTintList) {
                    z = true;
                }
            }
        }
        if (z) {
            this.setX = 67338;
            return;
        }
        StringBuilder sb = new StringBuilder("Version components are out of range: ");
        sb.append(1);
        sb.append('.');
        sb.append(7);
        sb.append('.');
        sb.append(10);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(nO nOVar) {
        nO nOVar2 = nOVar;
        pN.setY(nOVar2, "");
        return this.setX - nOVar2.setX;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append('.');
        sb.append(this.setIconTintList);
        sb.append('.');
        sb.append(this.setY);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        nO nOVar = obj instanceof nO ? (nO) obj : null;
        return nOVar != null && this.setX == nOVar.setX;
    }

    public final int hashCode() {
        return this.setX;
    }

    static {
        new nO$MenuHostHelper$$ExternalSyntheticLambda0((byte) 0);
        MenuHostHelper$$ExternalSyntheticLambda1 = new nO();
    }
}