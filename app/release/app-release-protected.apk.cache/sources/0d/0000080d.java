package o;

/* loaded from: classes.dex */
public final class pQ implements pL {
    private final String MenuHostHelper$$ExternalSyntheticLambda1;
    private final Class<?> setX;

    public pQ(Class<?> cls, String str) {
        pN.setY(cls, "");
        pN.setY(str, "");
        this.setX = cls;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
    }

    @Override // o.pL
    public final Class<?> setY() {
        return this.setX;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pQ) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setX, ((pQ) obj).setX);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.setX.toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    public final int hashCode() {
        return this.setX.hashCode();
    }
}