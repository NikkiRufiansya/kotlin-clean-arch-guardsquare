package o;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class nS<T> implements nP<T>, Serializable {
    private final Object MenuHostHelper$$ExternalSyntheticLambda1;
    private volatile Object setIconTintList;
    private InterfaceC0376pj<? extends T> setX;

    public /* synthetic */ nS(InterfaceC0376pj interfaceC0376pj) {
        this(interfaceC0376pj, null);
    }

    private nS(InterfaceC0376pj<? extends T> interfaceC0376pj, Object obj) {
        pN.setY(interfaceC0376pj, "");
        this.setX = interfaceC0376pj;
        this.setIconTintList = nV.MenuHostHelper$$ExternalSyntheticLambda1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = this;
    }

    @Override // o.nP
    public final T setY() {
        T t;
        T t2 = (T) this.setIconTintList;
        if (t2 != nV.MenuHostHelper$$ExternalSyntheticLambda1) {
            return t2;
        }
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            t = (T) this.setIconTintList;
            if (t == nV.MenuHostHelper$$ExternalSyntheticLambda1) {
                InterfaceC0376pj<? extends T> interfaceC0376pj = this.setX;
                pN.setX(interfaceC0376pj);
                t = interfaceC0376pj.setIconTintList();
                this.setIconTintList = t;
                this.setX = null;
            }
        }
        return t;
    }

    private final Object writeReplace() {
        return new nI(setY());
    }

    public final String toString() {
        return this.setIconTintList != nV.MenuHostHelper$$ExternalSyntheticLambda1 ? String.valueOf(setY()) : "Lazy value not initialized yet.";
    }
}