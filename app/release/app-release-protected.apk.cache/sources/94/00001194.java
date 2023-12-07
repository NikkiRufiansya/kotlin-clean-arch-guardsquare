package o;

/* loaded from: classes.dex */
public final class uO extends uM {
    public static final uO setX = new uO();

    @Override // o.rQ
    public final String toString() {
        return "Dispatchers.Default";
    }

    private uO() {
        super(uS.setIconTintList, uS.MenuHostHelper$$ExternalSyntheticLambda0, uS.MenuHostHelper$$ExternalSyntheticLambda1, "DefaultDispatcher");
    }

    @Override // o.uM, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }
}