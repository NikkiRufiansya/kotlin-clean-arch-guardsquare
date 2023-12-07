package o;

import java.lang.annotation.Annotation;

/* loaded from: classes.dex */
public final class aL<T> {
    private final Class<T> MenuHostHelper$$ExternalSyntheticLambda1;
    private final Class<? extends Annotation> setY;

    /* loaded from: classes.dex */
    public @interface setX {
    }

    public aL(Class<? extends Annotation> cls, Class<T> cls2) {
        this.setY = cls;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = cls2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aL aLVar = (aL) obj;
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.equals(aLVar.MenuHostHelper$$ExternalSyntheticLambda1)) {
            return this.setY.equals(aLVar.setY);
        }
        return false;
    }

    public final int hashCode() {
        return (this.MenuHostHelper$$ExternalSyntheticLambda1.hashCode() * 31) + this.setY.hashCode();
    }

    public final String toString() {
        if (this.setY == setX.class) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1.getName();
        }
        StringBuilder sb = new StringBuilder("@");
        sb.append(this.setY.getName());
        sb.append(" ");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1.getName());
        return sb.toString();
    }
}