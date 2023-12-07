package o;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import o.hD;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class hL<T> extends AbstractC0210hi<T> {
    private final gS MenuHostHelper$$ExternalSyntheticLambda0;
    private final Type MenuHostHelper$$ExternalSyntheticLambda1;
    private final AbstractC0210hi<T> setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public hL(gS gSVar, AbstractC0210hi<T> abstractC0210hi, Type type) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = gSVar;
        this.setX = abstractC0210hi;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = type;
    }

    @Override // o.AbstractC0210hi
    public final T setX(hP hPVar) {
        return this.setX.setX(hPVar);
    }

    @Override // o.AbstractC0210hi
    public final void setY(hR hRVar, T t) {
        AbstractC0210hi<T> abstractC0210hi = this.setX;
        Type type = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.MenuHostHelper$$ExternalSyntheticLambda1) {
            abstractC0210hi = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(new hQ<>(type));
            if (abstractC0210hi instanceof hD.setY) {
                AbstractC0210hi<T> abstractC0210hi2 = this.setX;
                if (!(abstractC0210hi2 instanceof hD.setY)) {
                    abstractC0210hi = abstractC0210hi2;
                }
            }
        }
        abstractC0210hi.setY(hRVar, t);
    }
}