package o;

/* renamed from: o.di  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102di implements InterfaceC0336nx<cW> {
    private final C0096dc setY;

    public C0102di(C0096dc c0096dc) {
        this.setY = c0096dc;
    }

    @Override // o.nF
    public final /* synthetic */ Object setIconTintList() {
        cW y = this.setY.setY();
        if (y != null) {
            return y;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}