package o;

/* renamed from: o.xm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0600xm implements xK {
    @Override // o.xK, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // o.xK, java.io.Flushable
    public final void flush() {
    }

    @Override // o.xK
    public final void a_(C0602xo c0602xo, long j) {
        pN.setY(c0602xo, "");
        c0602xo.setOnLongClickListener(j);
    }

    @Override // o.xK
    public final xI setX() {
        return xI.MenuHostHelper$$ExternalSyntheticLambda1;
    }
}