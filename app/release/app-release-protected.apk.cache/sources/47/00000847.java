package o;

import java.util.Iterator;

/* loaded from: classes.dex */
public class qJ extends qH {
    public static final <T> qC<T> MenuHostHelper$$ExternalSyntheticLambda1(final Iterator<? extends T> it) {
        pN.setY(it, "");
        qC<T> qCVar = new qC<T>() { // from class: o.qJ$MenuHostHelper$$ExternalSyntheticLambda1
            @Override // o.qC
            public final Iterator<T> MenuHostHelper$$ExternalSyntheticLambda0() {
                return it;
            }
        };
        pN.setY(qCVar, "");
        return new qA(qCVar);
    }
}