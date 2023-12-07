package o;

import java.util.concurrent.TimeUnit;

/* renamed from: o.vl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542vl {
    public final C0564we MenuHostHelper$$ExternalSyntheticLambda1;

    private C0542vl(C0564we c0564we) {
        pN.setY(c0564we, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = c0564we;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private C0542vl(TimeUnit timeUnit) {
        this(new C0564we(vV.MenuHostHelper$$ExternalSyntheticLambda1, 5, 5L, timeUnit));
        pN.setY(timeUnit, "");
    }

    public C0542vl() {
        this(TimeUnit.MINUTES);
    }
}