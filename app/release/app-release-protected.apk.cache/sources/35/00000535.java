package o;

/* renamed from: o.gq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191gq {
    public final String MenuHostHelper$$ExternalSyntheticLambda0;
    final int MenuHostHelper$$ExternalSyntheticLambda1;
    final long setIconTintList;
    final String setX;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0191gq) {
            C0191gq c0191gq = (C0191gq) obj;
            return pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.MenuHostHelper$$ExternalSyntheticLambda0, (Object) c0191gq.MenuHostHelper$$ExternalSyntheticLambda0) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.setX, (Object) c0191gq.setX) && this.MenuHostHelper$$ExternalSyntheticLambda1 == c0191gq.MenuHostHelper$$ExternalSyntheticLambda1 && this.setIconTintList == c0191gq.setIconTintList;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.setIconTintList;
        return (((((this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode() * 31) + this.setX.hashCode()) * 31) + this.MenuHostHelper$$ExternalSyntheticLambda1) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", firstSessionId=");
        sb.append(this.setX);
        sb.append(", sessionIndex=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(", sessionStartTimestampUs=");
        sb.append(this.setIconTintList);
        sb.append(')');
        return sb.toString();
    }

    public C0191gq(String str, String str2, int i, long j) {
        pN.setY(str, "");
        pN.setY(str2, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
        this.setX = str2;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        this.setIconTintList = j;
    }
}