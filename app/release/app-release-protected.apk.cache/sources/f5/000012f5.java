package o;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface xK extends Closeable, Flushable {
    void a_(C0602xo c0602xo, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    xI setX();
}