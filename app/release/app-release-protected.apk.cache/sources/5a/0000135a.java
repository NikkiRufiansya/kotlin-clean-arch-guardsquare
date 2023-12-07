package o;

import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class yb$MenuHostHelper$$ExternalSyntheticLambda1 extends vH {
    private final InterfaceC0607xr MenuHostHelper$$ExternalSyntheticLambda1;
    private final vH setX;
    @Nullable
    IOException setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yb$MenuHostHelper$$ExternalSyntheticLambda1(vH vHVar) {
        this.setX = vHVar;
        AbstractC0608xs abstractC0608xs = new AbstractC0608xs(vHVar.MenuHostHelper$$ExternalSyntheticLambda1()) { // from class: o.yb$MenuHostHelper$$ExternalSyntheticLambda1.2
            @Override // o.AbstractC0608xs, o.xJ
            public final long setY(C0602xo c0602xo, long j) {
                try {
                    return super.setY(c0602xo, j);
                } catch (IOException e) {
                    yb$MenuHostHelper$$ExternalSyntheticLambda1.this.setY = e;
                    throw e;
                }
            }
        };
        pN.setY(abstractC0608xs, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new xB(abstractC0608xs);
    }

    @Override // o.vH
    public final vA MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setX.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // o.vH
    public final long setIconTintList() {
        return this.setX.setIconTintList();
    }

    @Override // o.vH
    public final InterfaceC0607xr MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.vH, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.setX.close();
    }
}