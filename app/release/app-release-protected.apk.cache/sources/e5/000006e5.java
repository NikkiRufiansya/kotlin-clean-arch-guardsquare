package o;

/* loaded from: classes.dex */
public final class mA$MenuHostHelper$$ExternalSyntheticLambda1 extends mA {
    public final String setIconTintList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mA$MenuHostHelper$$ExternalSyntheticLambda1) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.setIconTintList, (Object) ((mA$MenuHostHelper$$ExternalSyntheticLambda1) obj).setIconTintList);
    }

    public final int hashCode() {
        return this.setIconTintList.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(message=");
        sb.append(this.setIconTintList);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mA$MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        super((byte) 0);
        pN.setY(str, "");
        this.setIconTintList = str;
    }
}