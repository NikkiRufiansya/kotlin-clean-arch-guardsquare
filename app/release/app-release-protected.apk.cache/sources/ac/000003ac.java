package o;

import java.io.IOException;

/* loaded from: classes.dex */
public final class dL implements InterfaceC0537vg {
    private final long MenuHostHelper$$ExternalSyntheticLambda0;
    private final InterfaceC0537vg MenuHostHelper$$ExternalSyntheticLambda1;
    private final dA setX;
    private final eA setY;

    public dL(InterfaceC0537vg interfaceC0537vg, C0126eg c0126eg, eA eAVar, long j) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = interfaceC0537vg;
        this.setX = dA.setX(c0126eg);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = j;
        this.setY = eAVar;
    }

    @Override // o.InterfaceC0537vg
    public final void MenuHostHelper$$ExternalSyntheticLambda1(InterfaceC0541vk interfaceC0541vk, IOException iOException) {
        vE iconTintList = interfaceC0541vk.setIconTintList();
        if (iconTintList != null) {
            C0555vx c0555vx = iconTintList.setLayoutAnimation;
            if (c0555vx != null) {
                this.setX.setY(c0555vx.setUiOptions().toString());
            }
            if (iconTintList.setX != null) {
                this.setX.MenuHostHelper$$ExternalSyntheticLambda0(iconTintList.setX);
            }
        }
        this.setX.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0);
        this.setX.setY(new eA().setX - this.setY.setX);
        dN.setX(this.setX);
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(interfaceC0541vk, iOException);
    }

    @Override // o.InterfaceC0537vg
    public final void MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0541vk interfaceC0541vk, vJ vJVar) {
        eA eAVar = this.setY;
        dE.MenuHostHelper$$ExternalSyntheticLambda1(vJVar, this.setX, this.MenuHostHelper$$ExternalSyntheticLambda0, new eA().setX - eAVar.setX);
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(interfaceC0541vk, vJVar);
    }
}