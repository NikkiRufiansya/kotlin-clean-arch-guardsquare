package o;

/* renamed from: o.ql  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0405ql extends C0402qi {
    public static final setY setLayoutAnimation = new setY((byte) 0);
    private static final C0405ql setNavigationOnClickListener = new C0405ql(1, 0);

    public C0405ql(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // o.C0402qi
    public final boolean setY() {
        return setIconTintList() > this.setIconTintList;
    }

    @Override // o.C0402qi
    public final boolean equals(Object obj) {
        if (obj instanceof C0405ql) {
            if (setIconTintList() > this.setIconTintList) {
                C0405ql c0405ql = (C0405ql) obj;
                if (c0405ql.setIconTintList() > c0405ql.setIconTintList) {
                    return true;
                }
            }
            C0405ql c0405ql2 = (C0405ql) obj;
            if (setIconTintList() == c0405ql2.setIconTintList() && this.setIconTintList == c0405ql2.setIconTintList) {
                return true;
            }
        }
        return false;
    }

    @Override // o.C0402qi
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(setIconTintList());
        sb.append("..");
        sb.append(this.setIconTintList);
        return sb.toString();
    }

    /* renamed from: o.ql$setY */
    /* loaded from: classes.dex */
    public static final class setY {
        public /* synthetic */ setY(byte b) {
            this();
        }

        private setY() {
        }
    }

    @Override // o.C0402qi
    public final int hashCode() {
        if (setIconTintList() > this.setIconTintList) {
            return -1;
        }
        return (setIconTintList() * 31) + this.setIconTintList;
    }
}