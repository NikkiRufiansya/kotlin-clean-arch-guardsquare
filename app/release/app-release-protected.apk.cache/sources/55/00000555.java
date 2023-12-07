package o;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class hH<T> extends AbstractC0210hi<T> {
    private final InterfaceC0204hc<T> MenuHostHelper$$ExternalSyntheticLambda0;
    private gS MenuHostHelper$$ExternalSyntheticLambda1;
    private AbstractC0210hi<T> setIconTintList;
    private final hQ<T> setLayoutAnimation;
    private final gU<T> setX;
    private final hH<T>.setX setY = new setX(this, (byte) 0);
    private final InterfaceC0209hh setNavigationOnClickListener = null;

    public hH(InterfaceC0204hc<T> interfaceC0204hc, gU<T> gUVar, gS gSVar, hQ<T> hQVar) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = interfaceC0204hc;
        this.setX = gUVar;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = gSVar;
        this.setLayoutAnimation = hQVar;
    }

    @Override // o.AbstractC0210hi
    public final T setX(hP hPVar) {
        if (this.setX == null) {
            return setIconTintList().setX(hPVar);
        }
        if (C0221ht.setX(hPVar) instanceof gW) {
            return null;
        }
        gU<T> gUVar = this.setX;
        Type type = this.setLayoutAnimation.setY;
        return gUVar.setX();
    }

    @Override // o.AbstractC0210hi
    public final void setY(hR hRVar, T t) {
        InterfaceC0204hc<T> interfaceC0204hc = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (interfaceC0204hc == null) {
            setIconTintList().setY(hRVar, t);
        } else if (t == null) {
            hRVar.setY();
        } else {
            Type type = this.setLayoutAnimation.setY;
            hI.setTextScaleX.setY(hRVar, interfaceC0204hc.setY());
        }
    }

    private AbstractC0210hi<T> setIconTintList() {
        AbstractC0210hi<T> abstractC0210hi = this.setIconTintList;
        if (abstractC0210hi == null) {
            AbstractC0210hi<T> y = this.MenuHostHelper$$ExternalSyntheticLambda1.setY((InterfaceC0209hh) null, this.setLayoutAnimation);
            this.setIconTintList = y;
            return y;
        }
        return abstractC0210hi;
    }

    /* loaded from: classes.dex */
    final class setX {
        private setX() {
        }

        /* synthetic */ setX(hH hHVar, byte b) {
            this();
        }
    }
}