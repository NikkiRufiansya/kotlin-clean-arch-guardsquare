package o;

/* loaded from: classes.dex */
public final class lE implements InterfaceC0336nx<C0624yh> {
    private final nF<C0627yk> MenuHostHelper$$ExternalSyntheticLambda0;
    private final nF<String> MenuHostHelper$$ExternalSyntheticLambda1;
    private final C0280lt setIconTintList;
    private final nF<vD> setX;

    public lE(C0280lt c0280lt, nF<String> nFVar, nF<C0627yk> nFVar2, nF<vD> nFVar3) {
        this.setIconTintList = c0280lt;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = nFVar;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = nFVar2;
        this.setX = nFVar3;
    }

    @Override // o.nF
    public final /* synthetic */ Object setIconTintList() {
        C0624yh x = this.setIconTintList.setX(this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(), this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(), this.setX.setIconTintList());
        if (x != null) {
            return x;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}