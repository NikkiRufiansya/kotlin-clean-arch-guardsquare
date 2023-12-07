package o;

/* renamed from: o.gd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178gd {
    public final String MenuHostHelper$$ExternalSyntheticLambda0;
    final String setIconTintList;
    final String setX;
    public final String setY;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0178gd) {
            C0178gd c0178gd = (C0178gd) obj;
            return pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.setIconTintList, (Object) c0178gd.setIconTintList) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.setY, (Object) c0178gd.setY) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.MenuHostHelper$$ExternalSyntheticLambda0, (Object) c0178gd.MenuHostHelper$$ExternalSyntheticLambda0) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.setX, (Object) c0178gd.setX);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.setIconTintList.hashCode() * 31) + this.setY.hashCode()) * 31) + this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode()) * 31) + this.setX.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidApplicationInfo(packageName=");
        sb.append(this.setIconTintList);
        sb.append(", versionName=");
        sb.append(this.setY);
        sb.append(", appBuildVersion=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", deviceManufacturer=");
        sb.append(this.setX);
        sb.append(')');
        return sb.toString();
    }

    public C0178gd(String str, String str2, String str3, String str4) {
        pN.setY(str, "");
        pN.setY(str2, "");
        pN.setY(str3, "");
        pN.setY(str4, "");
        this.setIconTintList = str;
        this.setY = str2;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = str3;
        this.setX = str4;
    }
}