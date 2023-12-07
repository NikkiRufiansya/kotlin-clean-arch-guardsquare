package o;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class xA implements xJ {
    private final InputStream MenuHostHelper$$ExternalSyntheticLambda1;
    private final xI setIconTintList;

    public xA(InputStream inputStream, xI xIVar) {
        pN.setY(inputStream, "");
        pN.setY(xIVar, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = inputStream;
        this.setIconTintList = xIVar;
    }

    @Override // o.xJ
    public final long setY(C0602xo c0602xo, long j) {
        pN.setY(c0602xo, "");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return 0L;
        }
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        try {
            this.setIconTintList.setOnLongClickListener();
            xE x = c0602xo.setX(1);
            int read = this.MenuHostHelper$$ExternalSyntheticLambda1.read(x.MenuHostHelper$$ExternalSyntheticLambda0, x.setIconTintList, (int) Math.min(j, 8192 - x.setIconTintList));
            if (read == -1) {
                if (x.MenuHostHelper$$ExternalSyntheticLambda1 == x.setIconTintList) {
                    c0602xo.MenuHostHelper$$ExternalSyntheticLambda1 = x.MenuHostHelper$$ExternalSyntheticLambda0();
                    xC.setIconTintList(x);
                    return -1L;
                }
                return -1L;
            }
            x.setIconTintList += read;
            long j2 = read;
            c0602xo.MenuHostHelper$$ExternalSyntheticLambda0 += j2;
            return j2;
        } catch (AssertionError e) {
            if (C0615xz.MenuHostHelper$$ExternalSyntheticLambda1(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // o.xJ, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.MenuHostHelper$$ExternalSyntheticLambda1.close();
    }

    @Override // o.xJ
    public final xI setX() {
        return this.setIconTintList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source(");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(')');
        return sb.toString();
    }
}