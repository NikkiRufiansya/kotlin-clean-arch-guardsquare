package o;

/* renamed from: o.qn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0407qn extends C0409qp {
    public C0407qn(long j, long j2) {
        super(j, j2);
    }

    @Override // o.C0409qp
    public final boolean equals(Object obj) {
        if (obj instanceof C0407qn) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 > this.setIconTintList) {
                C0407qn c0407qn = (C0407qn) obj;
                if (c0407qn.MenuHostHelper$$ExternalSyntheticLambda1 > c0407qn.setIconTintList) {
                    return true;
                }
            }
            C0407qn c0407qn2 = (C0407qn) obj;
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == c0407qn2.MenuHostHelper$$ExternalSyntheticLambda1 && this.setIconTintList == c0407qn2.setIconTintList) {
                return true;
            }
        }
        return false;
    }

    @Override // o.C0409qp
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append("..");
        sb.append(this.setIconTintList);
        return sb.toString();
    }

    /* renamed from: o.qn$setX */
    /* loaded from: classes.dex */
    public static final class setX {
        public /* synthetic */ setX(byte b) {
            this();
        }

        private setX() {
        }
    }

    static {
        new setX((byte) 0);
        new C0407qn(1L, 0L);
    }

    @Override // o.C0409qp
    public final int hashCode() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 > this.setIconTintList) {
            return -1;
        }
        return (int) (((this.MenuHostHelper$$ExternalSyntheticLambda1 ^ (this.MenuHostHelper$$ExternalSyntheticLambda1 >>> 32)) * 31) + (this.setIconTintList ^ (this.setIconTintList >>> 32)));
    }

    @Override // o.C0409qp
    public final boolean setIconTintList() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1 > this.setIconTintList;
    }
}