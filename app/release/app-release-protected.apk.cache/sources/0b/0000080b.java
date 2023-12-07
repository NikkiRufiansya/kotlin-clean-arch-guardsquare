package o;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class pO<R> implements pJ<R>, Serializable {
    private final int MenuHostHelper$$ExternalSyntheticLambda1;

    public pO(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
    }

    @Override // o.pJ
    public final int setOnLongClickListener() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public String toString() {
        String x = C0394qa.setX(this);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) x, "");
        return x;
    }
}