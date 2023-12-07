package o;

import java.io.IOException;

/* loaded from: classes.dex */
public final class vT extends AbstractC0609xt {
    private final InterfaceC0377pk<IOException, nX> MenuHostHelper$$ExternalSyntheticLambda0;
    private boolean setY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vT(xK xKVar, InterfaceC0377pk<? super IOException, nX> interfaceC0377pk) {
        super(xKVar);
        pN.setY(xKVar, "");
        pN.setY(interfaceC0377pk, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = interfaceC0377pk;
    }

    @Override // o.AbstractC0609xt, o.xK
    public final void a_(C0602xo c0602xo, long j) {
        pN.setY(c0602xo, "");
        if (this.setY) {
            c0602xo.setOnLongClickListener(j);
            return;
        }
        try {
            super.a_(c0602xo, j);
        } catch (IOException e) {
            this.setY = true;
            this.MenuHostHelper$$ExternalSyntheticLambda0.setX(e);
        }
    }

    @Override // o.AbstractC0609xt, o.xK, java.io.Flushable
    public final void flush() {
        if (this.setY) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.setY = true;
            this.MenuHostHelper$$ExternalSyntheticLambda0.setX(e);
        }
    }

    @Override // o.AbstractC0609xt, o.xK, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.setY) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.setY = true;
            this.MenuHostHelper$$ExternalSyntheticLambda0.setX(e);
        }
    }
}