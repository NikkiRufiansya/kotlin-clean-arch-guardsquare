package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FirebaseInstallationsRegistrar extends setImageDrawable {
    private final long setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseInstallationsRegistrar(long j) {
        this.setY = j;
    }

    @Override // o.setImageDrawable
    public final long setY() {
        return this.setY;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogResponse{nextRequestWaitMillis=");
        sb.append(this.setY);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof setImageDrawable) && this.setY == ((setImageDrawable) obj).setY();
    }

    public final int hashCode() {
        long j = this.setY;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }
}