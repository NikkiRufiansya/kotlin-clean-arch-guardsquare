package o;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class nT<A, B> implements Serializable {
    public final A MenuHostHelper$$ExternalSyntheticLambda0;
    public final B setX;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nT) {
            nT nTVar = (nT) obj;
            return pN.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0, nTVar.MenuHostHelper$$ExternalSyntheticLambda0) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setX, nTVar.setX);
        }
        return false;
    }

    public final int hashCode() {
        A a = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int hashCode = a == null ? 0 : a.hashCode();
        B b = this.setX;
        return (hashCode * 31) + (b != null ? b.hashCode() : 0);
    }

    public nT(A a, B b) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = a;
        this.setX = b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", ");
        sb.append(this.setX);
        sb.append(')');
        return sb.toString();
    }
}