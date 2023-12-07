package o;

/* renamed from: o.sl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0459sl extends AbstractC0436rp {
    private final InterfaceC0456si setY;

    public C0459sl(InterfaceC0456si interfaceC0456si) {
        this.setY = interfaceC0456si;
    }

    @Override // o.InterfaceC0377pk
    public final /* synthetic */ nX setX(Throwable th) {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda0();
        return nX.setX;
    }

    @Override // o.AbstractC0439rs
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Throwable th) {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisposeOnCancel[");
        sb.append(this.setY);
        sb.append(']');
        return sb.toString();
    }
}