package o;

import java.util.Random;

/* renamed from: o.qh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0401qh extends AbstractC0403qj {
    public abstract Random MenuHostHelper$$ExternalSyntheticLambda0();

    @Override // o.AbstractC0403qj
    public final int setX(int i) {
        return ((-i) >> 31) & (MenuHostHelper$$ExternalSyntheticLambda0().nextInt() >>> (32 - i));
    }

    @Override // o.AbstractC0403qj
    public final int setX() {
        return MenuHostHelper$$ExternalSyntheticLambda0().nextInt();
    }
}