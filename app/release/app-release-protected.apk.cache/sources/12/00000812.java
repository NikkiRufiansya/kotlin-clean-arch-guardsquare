package o;

import o.InterfaceC0417qx;

/* loaded from: classes.dex */
public abstract class pV extends pS implements InterfaceC0417qx {
    public pV() {
    }

    public pV(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, 1);
    }

    @Override // o.pF
    protected final InterfaceC0411qr MenuHostHelper$$ExternalSyntheticLambda0() {
        return C0394qa.setX(this);
    }

    @Override // o.InterfaceC0376pj
    public final Object setIconTintList() {
        return setChipCornerRadius();
    }

    @Override // o.InterfaceC0417qx
    public final InterfaceC0417qx.setX setOnLongClickListener() {
        return ((InterfaceC0417qx) setNavigationOnClickListener()).setOnLongClickListener();
    }
}