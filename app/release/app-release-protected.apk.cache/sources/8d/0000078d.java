package o;

import android.graphics.Canvas;
import o.AbstractC0328np;

/* renamed from: o.nv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334nv implements InterfaceC0331ns {
    public InterfaceC0331ns setX;

    public C0334nv(C0337ny c0337ny) {
        pN.setX(c0337ny, "");
        C0333nu c0333nu = C0333nu.MenuHostHelper$$ExternalSyntheticLambda1;
        this.setX = C0333nu.MenuHostHelper$$ExternalSyntheticLambda0(c0337ny);
    }

    @Override // o.InterfaceC0331ns
    public final AbstractC0328np.setY MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
        InterfaceC0331ns interfaceC0331ns = this.setX;
        if (interfaceC0331ns == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        }
        return interfaceC0331ns.MenuHostHelper$$ExternalSyntheticLambda0(i, i2);
    }

    @Override // o.InterfaceC0331ns
    public final void setX(Canvas canvas) {
        pN.setX(canvas, "");
        InterfaceC0331ns interfaceC0331ns = this.setX;
        if (interfaceC0331ns == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        }
        interfaceC0331ns.setX(canvas);
    }
}