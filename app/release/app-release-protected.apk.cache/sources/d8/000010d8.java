package o;

import o.setAllowStacking;

/* loaded from: classes.dex */
public final class setVerticalGravity<F, S> {
    public final S MenuHostHelper$$ExternalSyntheticLambda1;
    public final F setX;

    public setVerticalGravity(F f, S s) {
        this.setX = f;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = s;
    }

    public final boolean equals(Object obj) {
        boolean x;
        boolean x2;
        if (obj instanceof setVerticalGravity) {
            setVerticalGravity setverticalgravity = (setVerticalGravity) obj;
            x = setAllowStacking.setX.setX(setverticalgravity.setX, this.setX);
            if (x) {
                x2 = setAllowStacking.setX.setX(setverticalgravity.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda1);
                return x2;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        F f = this.setX;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.MenuHostHelper$$ExternalSyntheticLambda1;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.setX);
        sb.append(" ");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append("}");
        return sb.toString();
    }
}