package o;

/* loaded from: classes.dex */
public final class rH {
    public final InterfaceC0377pk<Throwable, nX> MenuHostHelper$$ExternalSyntheticLambda0;
    private Object setIconTintList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rH) {
            rH rHVar = (rH) obj;
            return pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, rHVar.setIconTintList) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0, rHVar.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.setIconTintList;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompletedWithCancellation(result=");
        sb.append(this.setIconTintList);
        sb.append(", onCancellation=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rH(Object obj, InterfaceC0377pk<? super Throwable, nX> interfaceC0377pk) {
        this.setIconTintList = obj;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = interfaceC0377pk;
    }
}