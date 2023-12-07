package o;

import java.io.Closeable;

@nH
/* loaded from: classes.dex */
public abstract class setStackedBackground implements Closeable {
    abstract setCloseIconSize setX();

    public abstract setLengthCounter setY();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        setX().close();
    }
}