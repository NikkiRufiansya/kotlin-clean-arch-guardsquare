package o;

/* loaded from: classes.dex */
public final class registerForContextMenu<T> implements nF<T> {
    private static final Object MenuHostHelper$$ExternalSyntheticLambda0 = new Object();
    private volatile nF<T> MenuHostHelper$$ExternalSyntheticLambda1;
    private volatile Object setX = MenuHostHelper$$ExternalSyntheticLambda0;

    public registerForContextMenu(nF<T> nFVar) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = nFVar;
    }

    @Override // o.nF
    public final T setIconTintList() {
        T t = (T) this.setX;
        Object obj = MenuHostHelper$$ExternalSyntheticLambda0;
        if (t == obj) {
            synchronized (this) {
                t = this.setX;
                if (t == obj) {
                    t = this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList();
                    Object obj2 = this.setX;
                    if (((obj2 == MenuHostHelper$$ExternalSyntheticLambda0 || (obj2 instanceof setOnCheckedStateChangeListener)) ? false : true) && obj2 != t) {
                        StringBuilder sb = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
                        sb.append(obj2);
                        sb.append(" & ");
                        sb.append(t);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.setX = t;
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
                }
            }
        }
        return t;
    }
}