package o;

/* renamed from: o.dk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104dk implements InterfaceC0336nx<com.google.firebase.FirebaseApp> {
    private final C0096dc setIconTintList;

    public C0104dk(C0096dc c0096dc) {
        this.setIconTintList = c0096dc;
    }

    @Override // o.nF
    public final /* synthetic */ Object setIconTintList() {
        com.google.firebase.FirebaseApp iconTintList = this.setIconTintList.setIconTintList();
        if (iconTintList != null) {
            return iconTintList;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}