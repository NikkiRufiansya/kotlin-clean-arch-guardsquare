package o;

/* renamed from: o.xt  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0609xt implements xK {
    private final xK setX;

    public AbstractC0609xt(xK xKVar) {
        pN.setY(xKVar, "");
        this.setX = xKVar;
    }

    @Override // o.xK
    public void a_(C0602xo c0602xo, long j) {
        pN.setY(c0602xo, "");
        this.setX.a_(c0602xo, j);
    }

    @Override // o.xK, java.io.Flushable
    public void flush() {
        this.setX.flush();
    }

    @Override // o.xK
    public final xI setX() {
        return this.setX.setX();
    }

    @Override // o.xK, java.io.Closeable, java.lang.AutoCloseable
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