package o;

/* renamed from: o.xs  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0608xs implements xJ {
    private final xJ setX;

    public AbstractC0608xs(xJ xJVar) {
        pN.setY(xJVar, "");
        this.setX = xJVar;
    }

    public final xJ setIconTintList() {
        return this.setX;
    }

    @Override // o.xJ
    public long setY(C0602xo c0602xo, long j) {
        pN.setY(c0602xo, "");
        return this.setX.setY(c0602xo, j);
    }

    @Override // o.xJ
    public final xI setX() {
        return this.setX.setX();
    }

    @Override // o.xJ, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.setX.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        sb.append(this.setX);
        sb.append(')');
        return sb.toString();
    }
}