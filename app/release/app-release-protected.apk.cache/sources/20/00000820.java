package o;

import java.io.Closeable;

/* renamed from: o.pe  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371pe {
    public static final void setX(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                pN.setY((Object) th, "");
                pN.setY((Object) th2, "");
                if (th != th2) {
                    C0369pc.setX.setX(th, th2);
                }
            }
        }
    }
}