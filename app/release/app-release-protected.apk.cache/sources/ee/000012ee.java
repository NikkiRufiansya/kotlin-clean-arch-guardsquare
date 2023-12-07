package o;

import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class xF implements xK {
    private final xI MenuHostHelper$$ExternalSyntheticLambda0;
    private final OutputStream setIconTintList;

    public xF(OutputStream outputStream, xI xIVar) {
        pN.setY(outputStream, "");
        pN.setY(xIVar, "");
        this.setIconTintList = outputStream;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = xIVar;
    }

    @Override // o.xK, java.io.Flushable
    public final void flush() {
        this.setIconTintList.flush();
    }

    @Override // o.xK, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.setIconTintList.close();
    }

    @Override // o.xK
    public final xI setX() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("sink(");
        sb.append(this.setIconTintList);
        sb.append(')');
        return sb.toString();
    }

    @Override // o.xK
    public final void a_(C0602xo c0602xo, long j) {
        pN.setY(c0602xo, "");
        C0601xn.setIconTintList(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0, 0L, j);
        while (j > 0) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setOnLongClickListener();
            xE xEVar = c0602xo.MenuHostHelper$$ExternalSyntheticLambda1;
            pN.setX(xEVar);
            int min = (int) Math.min(j, xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1);
            this.setIconTintList.write(xEVar.MenuHostHelper$$ExternalSyntheticLambda0, xEVar.MenuHostHelper$$ExternalSyntheticLambda1, min);
            xEVar.MenuHostHelper$$ExternalSyntheticLambda1 += min;
            long j2 = min;
            j -= j2;
            c0602xo.MenuHostHelper$$ExternalSyntheticLambda0 -= j2;
            if (xEVar.MenuHostHelper$$ExternalSyntheticLambda1 == xEVar.setIconTintList) {
                c0602xo.MenuHostHelper$$ExternalSyntheticLambda1 = xEVar.MenuHostHelper$$ExternalSyntheticLambda0();
                xC.setIconTintList(xEVar);
            }
        }
    }
}