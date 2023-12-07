package o;

/* renamed from: o.gt  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194gt {
    final C0181gg setIconTintList;
    final EnumC0189go setX;
    final C0198gx setY;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0194gt) {
            C0194gt c0194gt = (C0194gt) obj;
            return this.setX == c0194gt.setX && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setY, c0194gt.setY) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, c0194gt.setIconTintList);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.setX.hashCode() * 31) + this.setY.hashCode()) * 31) + this.setIconTintList.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionEvent(eventType=");
        sb.append(this.setX);
        sb.append(", sessionData=");
        sb.append(this.setY);
        sb.append(", applicationInfo=");
        sb.append(this.setIconTintList);
        sb.append(')');
        return sb.toString();
    }

    public C0194gt(EnumC0189go enumC0189go, C0198gx c0198gx, C0181gg c0181gg) {
        pN.setY(enumC0189go, "");
        pN.setY(c0198gx, "");
        pN.setY(c0181gg, "");
        this.setX = enumC0189go;
        this.setY = c0198gx;
        this.setIconTintList = c0181gg;
    }
}