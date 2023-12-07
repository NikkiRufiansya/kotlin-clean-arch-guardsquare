package o;

/* loaded from: classes.dex */
public final class aF<T> implements InterfaceC0073cg<T> {
    private static final Object setY = new Object();
    private volatile Object MenuHostHelper$$ExternalSyntheticLambda0 = setY;
    private volatile InterfaceC0073cg<T> setIconTintList;

    public aF(InterfaceC0073cg<T> interfaceC0073cg) {
        this.setIconTintList = interfaceC0073cg;
    }

    @Override // o.InterfaceC0073cg
    public final T MenuHostHelper$$ExternalSyntheticLambda0() {
        T t = (T) this.MenuHostHelper$$ExternalSyntheticLambda0;
        Object obj = setY;
        if (t == obj) {
            synchronized (this) {
                t = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (t == obj) {
                    t = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0();
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = t;
                    this.setIconTintList = null;
                }
            }
        }
        return t;
    }
}