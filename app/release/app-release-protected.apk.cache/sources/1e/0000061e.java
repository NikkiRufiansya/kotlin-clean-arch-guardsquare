package o;

/* loaded from: classes.dex */
public final class inset<T> {
    public T MenuHostHelper$$ExternalSyntheticLambda0;
    public T setY;

    public final boolean equals(Object obj) {
        if (obj instanceof setVerticalGravity) {
            setVerticalGravity setverticalgravity = (setVerticalGravity) obj;
            F f = setverticalgravity.setX;
            Object obj2 = this.setY;
            if (f == obj2 || (f != 0 && f.equals(obj2))) {
                S s = setverticalgravity.MenuHostHelper$$ExternalSyntheticLambda1;
                Object obj3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                return s == obj3 || (s != 0 && s.equals(obj3));
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        T t = this.setY;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        return hashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(String.valueOf(this.setY));
        sb.append(" ");
        sb.append(String.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda0));
        sb.append("}");
        return sb.toString();
    }
}