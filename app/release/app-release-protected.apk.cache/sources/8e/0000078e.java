package o;

/* renamed from: o.nw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335nw<T> implements nF<T> {
    private static final Object setY = new Object();
    private volatile nF<T> MenuHostHelper$$ExternalSyntheticLambda0;
    private volatile Object setIconTintList = setY;

    private C0335nw(nF<T> nFVar) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = nFVar;
    }

    @Override // o.nF
    public final T setIconTintList() {
        T t = (T) this.setIconTintList;
        Object obj = setY;
        if (t == obj) {
            synchronized (this) {
                t = this.setIconTintList;
                if (t == obj) {
                    t = this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList();
                    Object obj2 = this.setIconTintList;
                    if (((obj2 == setY || (obj2 instanceof nD)) ? false : true) && obj2 != t) {
                        StringBuilder sb = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
                        sb.append(obj2);
                        sb.append(" & ");
                        sb.append(t);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.setIconTintList = t;
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
                }
            }
        }
        return t;
    }

    public static <P extends nF<T>, T> nF<T> setX(P p) {
        return p instanceof C0335nw ? p : new C0335nw(p);
    }
}