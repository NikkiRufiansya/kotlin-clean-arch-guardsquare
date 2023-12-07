package o;

/* renamed from: o.tk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0485tk<E> extends AbstractC0475ta<E> {
    @Override // o.AbstractC0475ta
    protected final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return true;
    }

    @Override // o.AbstractC0475ta
    protected final boolean setIconTintList() {
        return true;
    }

    public C0485tk(InterfaceC0377pk<? super E, nX> interfaceC0377pk) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC0476tb
    public final Object setY(E e) {
        InterfaceC0489to<?> MenuHostHelper$$ExternalSyntheticLambda1;
        do {
            Object y = super.setY(e);
            if (y == C0479te.MenuHostHelper$$ExternalSyntheticLambda1) {
                return C0479te.MenuHostHelper$$ExternalSyntheticLambda1;
            }
            if (y == C0479te.setIconTintList) {
                MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(e);
                if (MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                    return C0479te.MenuHostHelper$$ExternalSyntheticLambda1;
                }
            } else if (y instanceof C0482th) {
                return y;
            } else {
                StringBuilder sb = new StringBuilder("Invalid offerInternal result ");
                sb.append(y);
                throw new IllegalStateException(sb.toString().toString());
            }
        } while (!(MenuHostHelper$$ExternalSyntheticLambda1 instanceof C0482th));
        return MenuHostHelper$$ExternalSyntheticLambda1;
    }
}