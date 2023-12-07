package o;

import java.util.Random;

/* renamed from: o.qg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0400qg extends AbstractC0401qh {
    private final qg$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1 = new ThreadLocal<Random>() { // from class: o.qg$MenuHostHelper$$ExternalSyntheticLambda0
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Random initialValue() {
            return new Random();
        }
    };

    @Override // o.AbstractC0401qh
    public final Random MenuHostHelper$$ExternalSyntheticLambda0() {
        Random random = get();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) random, "");
        return random;
    }
}