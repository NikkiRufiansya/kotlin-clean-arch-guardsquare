package o;

/* loaded from: classes.dex */
public abstract class pU extends pS implements qE {
    public pU() {
    }

    public pU(Class cls, String str, String str2, int i) {
        super(setIconTintList, cls, str, str2, 0);
    }

    @Override // o.pF
    protected final InterfaceC0411qr MenuHostHelper$$ExternalSyntheticLambda0() {
        return C0394qa.setIconTintList(this);
    }

    @Override // o.InterfaceC0389pw
    public final Object MenuHostHelper$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        return setIconTintList(obj, obj2);
    }

    @Override // o.qE
    public final qE$MenuHostHelper$$ExternalSyntheticLambda0 setIconTintList() {
        return ((qE) setNavigationOnClickListener()).setIconTintList();
    }
}