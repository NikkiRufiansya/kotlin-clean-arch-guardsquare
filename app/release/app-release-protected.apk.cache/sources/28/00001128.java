package o;

/* renamed from: o.sy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0472sy extends AbstractC0436rp {
    private final InterfaceC0377pk<Throwable, nX> setY;

    @Override // o.InterfaceC0377pk
    public final /* bridge */ /* synthetic */ nX setX(Throwable th) {
        this.setY.setX(th);
        return nX.setX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0472sy(InterfaceC0377pk<? super Throwable, nX> interfaceC0377pk) {
        this.setY = interfaceC0377pk;
    }

    @Override // o.AbstractC0439rs
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Throwable th) {
        this.setY.setX(th);
    }

    public final String toString() {
        String simpleName;
        StringBuilder sb = new StringBuilder("InvokeOnCancel[");
        simpleName = this.setY.getClass().getSimpleName();
        sb.append(simpleName);
        sb.append('@');
        sb.append(rZ.setY(this));
        sb.append(']');
        return sb.toString();
    }
}