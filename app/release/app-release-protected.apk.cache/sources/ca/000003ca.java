package o;

/* renamed from: o.dn  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107dn implements InterfaceC0336nx<dQ> {
    private final C0096dc setX;

    public C0107dn(C0096dc c0096dc) {
        this.setX = c0096dc;
    }

    @Override // o.nF
    public final /* synthetic */ Object setIconTintList() {
        dQ uiOptions = this.setX.setUiOptions();
        if (uiOptions != null) {
            return uiOptions;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}