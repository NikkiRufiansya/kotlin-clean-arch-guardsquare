package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setScrollingCacheEnabled<T> extends setPasswordVisibilityToggleDrawable<T> {
    private final int MenuHostHelper$$ExternalSyntheticLambda0;
    final T setY;

    public setScrollingCacheEnabled(T t, int i) {
        super((byte) 0);
        this.setY = t;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
    }

    public final void setX() {
        T t = this.setY;
        if (!((t != null ? t.hashCode() : 0) == this.MenuHostHelper$$ExternalSyntheticLambda0)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }
}