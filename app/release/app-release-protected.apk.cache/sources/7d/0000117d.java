package o;

/* renamed from: o.tz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0500tz<T> extends AbstractC0493ts<T> {
    private final InterfaceC0389pw<InterfaceC0498tx<? super T>, oK<? super nX>, Object> setIconTintList;

    /* JADX WARN: Multi-variable type inference failed */
    public C0500tz(InterfaceC0389pw<? super InterfaceC0498tx<? super T>, ? super oK<? super nX>, ? extends Object> interfaceC0389pw) {
        this.setIconTintList = interfaceC0389pw;
    }

    @Override // o.AbstractC0493ts
    public final Object MenuHostHelper$$ExternalSyntheticLambda1(InterfaceC0498tx<? super T> interfaceC0498tx, oK<? super nX> oKVar) {
        Object MenuHostHelper$$ExternalSyntheticLambda0 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(interfaceC0498tx, oKVar);
        return MenuHostHelper$$ExternalSyntheticLambda0 == oJ.COROUTINE_SUSPENDED ? MenuHostHelper$$ExternalSyntheticLambda0 : nX.setX;
    }
}