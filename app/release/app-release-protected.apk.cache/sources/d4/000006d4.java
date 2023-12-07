package o;

/* renamed from: o.lw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283lw implements InterfaceC0336nx<vD> {
    private final nF<C0598xk> setIconTintList;
    private final C0280lt setY;

    public C0283lw(C0280lt c0280lt, nF<C0598xk> nFVar) {
        this.setY = c0280lt;
        this.setIconTintList = nFVar;
    }

    @Override // o.nF
    public final /* synthetic */ Object setIconTintList() {
        vD MenuHostHelper$$ExternalSyntheticLambda0 = this.setY.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList.setIconTintList());
        if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            return MenuHostHelper$$ExternalSyntheticLambda0;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}