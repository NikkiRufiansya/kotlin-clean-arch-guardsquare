package o;

/* renamed from: o.dq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109dq implements InterfaceC0336nx<InterfaceC0073cg<setIconPadding>> {
    private final C0096dc MenuHostHelper$$ExternalSyntheticLambda0;

    public C0109dq(C0096dc c0096dc) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = c0096dc;
    }

    @Override // o.nF
    public final /* synthetic */ Object setIconTintList() {
        InterfaceC0073cg<setIconPadding> layoutAnimation = this.MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation();
        if (layoutAnimation != null) {
            return layoutAnimation;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}