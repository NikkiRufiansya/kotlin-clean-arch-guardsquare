package o;

/* renamed from: o.ci  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0075ci extends AbstractC0089cw {
    private final long MenuHostHelper$$ExternalSyntheticLambda0;
    private final long setIconTintList;
    private final String setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C0075ci(String str, long j, long j2, byte b) {
        this(str, j, j2);
    }

    private C0075ci(String str, long j, long j2) {
        this.setX = str;
        this.setIconTintList = j;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = j2;
    }

    @Override // o.AbstractC0089cw
    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setX;
    }

    @Override // o.AbstractC0089cw
    public final long setIconTintList() {
        return this.setIconTintList;
    }

    @Override // o.AbstractC0089cw
    public final long setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.setX);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.setIconTintList);
        sb.append(", tokenCreationTimestamp=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0089cw) {
            AbstractC0089cw abstractC0089cw = (AbstractC0089cw) obj;
            return this.setX.equals(abstractC0089cw.MenuHostHelper$$ExternalSyntheticLambda0()) && this.setIconTintList == abstractC0089cw.setIconTintList() && this.MenuHostHelper$$ExternalSyntheticLambda0 == abstractC0089cw.setY();
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.setX.hashCode();
        long j = this.setIconTintList;
        long j2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }
}