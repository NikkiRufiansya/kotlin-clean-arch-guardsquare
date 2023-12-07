package o;

/* loaded from: classes.dex */
final class Q extends V {
    private final long MenuHostHelper$$ExternalSyntheticLambda0;
    private final long setIconTintList;
    private final long setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q(long j, long j2, long j3) {
        this.setY = j;
        this.setIconTintList = j2;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = j3;
    }

    @Override // o.V
    public final long setIconTintList() {
        return this.setY;
    }

    @Override // o.V
    public final long MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setIconTintList;
    }

    @Override // o.V
    public final long MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.setY);
        sb.append(", elapsedRealtime=");
        sb.append(this.setIconTintList);
        sb.append(", uptimeMillis=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof V) {
            V v = (V) obj;
            return this.setY == v.setIconTintList() && this.setIconTintList == v.MenuHostHelper$$ExternalSyntheticLambda0() && this.MenuHostHelper$$ExternalSyntheticLambda0 == v.MenuHostHelper$$ExternalSyntheticLambda1();
        }
        return false;
    }

    public final int hashCode() {
        long j = this.setY;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.setIconTintList;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        return ((i2 ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }
}