package o;

/* renamed from: o.gj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184gj {
    final EnumC0185gk MenuHostHelper$$ExternalSyntheticLambda0;
    final double setX;
    final EnumC0185gk setY;

    public C0184gj() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0184gj) {
            C0184gj c0184gj = (C0184gj) obj;
            return this.MenuHostHelper$$ExternalSyntheticLambda0 == c0184gj.MenuHostHelper$$ExternalSyntheticLambda0 && this.setY == c0184gj.setY && pN.MenuHostHelper$$ExternalSyntheticLambda0(Double.valueOf(this.setX), Double.valueOf(c0184gj.setX));
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataCollectionStatus(performance=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", crashlytics=");
        sb.append(this.setY);
        sb.append(", sessionSamplingRate=");
        sb.append(this.setX);
        sb.append(')');
        return sb.toString();
    }

    public C0184gj(EnumC0185gk enumC0185gk, EnumC0185gk enumC0185gk2, double d) {
        pN.setY(enumC0185gk, "");
        pN.setY(enumC0185gk2, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = enumC0185gk;
        this.setY = enumC0185gk2;
        this.setX = d;
    }

    private /* synthetic */ C0184gj(byte b) {
        this(EnumC0185gk.COLLECTION_SDK_NOT_INSTALLED, EnumC0185gk.COLLECTION_SDK_NOT_INSTALLED, 1.0d);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.setX);
        return (((this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode() * 31) + this.setY.hashCode()) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }
}