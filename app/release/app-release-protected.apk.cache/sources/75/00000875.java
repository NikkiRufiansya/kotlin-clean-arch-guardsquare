package o;

import java.util.Iterator;

/* renamed from: o.qp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0409qp implements Iterable<Long>, InterfaceC0395qb {
    public final long MenuHostHelper$$ExternalSyntheticLambda1;
    public final long setIconTintList;
    private final long setY;

    static {
        new setIconTintList((byte) 0);
    }

    public C0409qp(long j, long j2) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = j;
        this.setIconTintList = j < j2 ? j2 - C0367pa.setY(j2, j, 1L) : j2;
        this.setY = 1L;
    }

    public boolean setIconTintList() {
        int i = (this.setY > 0L ? 1 : (this.setY == 0L ? 0 : -1));
        int i2 = (this.MenuHostHelper$$ExternalSyntheticLambda1 > this.setIconTintList ? 1 : (this.MenuHostHelper$$ExternalSyntheticLambda1 == this.setIconTintList ? 0 : -1));
        return i <= 0 ? i2 < 0 : i2 > 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0409qp) {
            if (!setIconTintList() || !((C0409qp) obj).setIconTintList()) {
                C0409qp c0409qp = (C0409qp) obj;
                if (this.MenuHostHelper$$ExternalSyntheticLambda1 != c0409qp.MenuHostHelper$$ExternalSyntheticLambda1 || this.setIconTintList != c0409qp.setIconTintList || this.setY != c0409qp.setY) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (setIconTintList()) {
            return -1;
        }
        long j = this.MenuHostHelper$$ExternalSyntheticLambda1;
        long j2 = this.setIconTintList;
        long j3 = this.setY;
        return (int) (((((j ^ (j >>> 32)) * 31) + (j2 ^ (j2 >>> 32))) * 31) + ((j3 >>> 32) ^ j3));
    }

    public String toString() {
        long j;
        int i = (this.setY > 0L ? 1 : (this.setY == 0L ? 0 : -1));
        StringBuilder sb = new StringBuilder();
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        if (i > 0) {
            sb.append("..");
            sb.append(this.setIconTintList);
            sb.append(" step ");
            j = this.setY;
        } else {
            sb.append(" downTo ");
            sb.append(this.setIconTintList);
            sb.append(" step ");
            j = -this.setY;
        }
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: o.qp$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList {
        public /* synthetic */ setIconTintList(byte b) {
            this();
        }

        private setIconTintList() {
        }
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Long> iterator() {
        return new C0406qm(this.MenuHostHelper$$ExternalSyntheticLambda1, this.setIconTintList, this.setY);
    }
}