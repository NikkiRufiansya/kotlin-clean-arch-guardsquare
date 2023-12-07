package o;

/* loaded from: classes.dex */
final class bL implements InterfaceC0062bw {
    private final bO MenuHostHelper$$ExternalSyntheticLambda1;
    C0056bq setIconTintList;
    boolean MenuHostHelper$$ExternalSyntheticLambda0 = false;
    boolean setX = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bL(bO bOVar) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = bOVar;
    }

    @Override // o.InterfaceC0062bw
    public final InterfaceC0062bw MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            throw new C0060bu("Cannot encode a second value in the ValueEncoderContext");
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        this.MenuHostHelper$$ExternalSyntheticLambda1.setX(this.setIconTintList, str, this.setX);
        return this;
    }

    @Override // o.InterfaceC0062bw
    public final InterfaceC0062bw setX(boolean z) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            throw new C0060bu("Cannot encode a second value in the ValueEncoderContext");
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        this.MenuHostHelper$$ExternalSyntheticLambda1.setY(this.setIconTintList, z ? 1 : 0, this.setX);
        return this;
    }
}