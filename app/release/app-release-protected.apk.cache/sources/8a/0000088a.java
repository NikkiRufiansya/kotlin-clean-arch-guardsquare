package o;

/* loaded from: classes.dex */
public final class rG<T> extends sK implements InterfaceC0445ry<T> {
    @Override // o.sK
    public final boolean o_() {
        return true;
    }

    public rG(sB sBVar) {
        super(true);
        setIconTintList((sB) null);
    }

    @Override // o.InterfaceC0448sa
    public final Object setY(oK<? super T> oKVar) {
        Object iconTintList = setIconTintList((oK<Object>) oKVar);
        oJ oJVar = oJ.COROUTINE_SUSPENDED;
        return iconTintList;
    }

    @Override // o.InterfaceC0445ry
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(T t) {
        return setUiOptions(t);
    }

    @Override // o.InterfaceC0445ry
    public final boolean setY(Throwable th) {
        return setUiOptions(new rD(th));
    }
}