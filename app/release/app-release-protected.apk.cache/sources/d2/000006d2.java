package o;

/* renamed from: o.lu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281lu implements InterfaceC0336nx<kO> {
    private final nF<com.rmldemo.guardsquare.data.local.AppDatabase> setIconTintList;
    private final C0275lo setX;

    public C0281lu(C0275lo c0275lo, nF<com.rmldemo.guardsquare.data.local.AppDatabase> nFVar) {
        this.setX = c0275lo;
        this.setIconTintList = nFVar;
    }

    @Override // o.nF
    public final /* synthetic */ Object setIconTintList() {
        kO x = this.setX.setX(this.setIconTintList.setIconTintList());
        if (x != null) {
            return x;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}