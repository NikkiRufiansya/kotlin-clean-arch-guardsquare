package o;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class nI<T> implements nP<T>, Serializable {
    private final T setX;

    public nI(T t) {
        this.setX = t;
    }

    @Override // o.nP
    public final T setY() {
        return this.setX;
    }

    public final String toString() {
        return String.valueOf(setY());
    }
}