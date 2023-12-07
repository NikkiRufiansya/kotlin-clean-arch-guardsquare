package o;

import o.pN;
import o.registerIn;
import o.registerIn$MenuHostHelper$$ExternalSyntheticLambda1;
import o.setLayoutResource;
import o.setTop;
import o.setTouchDelegate;

/* loaded from: classes.dex */
public final class setLayoutResource {
    public final registerIn MenuHostHelper$$ExternalSyntheticLambda0;
    public final setCheckable MenuHostHelper$$ExternalSyntheticLambda1;
    public final setTop setX;
    public final registerIn$MenuHostHelper$$ExternalSyntheticLambda1 setY;

    public setLayoutResource(registerIn registerin, registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1, setTop settop, final sB sBVar) {
        pN.setY(registerin, "");
        pN.setY(registerin_menuhosthelper__externalsyntheticlambda1, "");
        pN.setY(settop, "");
        pN.setY(sBVar, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = registerin;
        this.setY = registerin_menuhosthelper__externalsyntheticlambda1;
        this.setX = settop;
        setCheckable setcheckable = new setCheckable() { // from class: androidx.lifecycle.LifecycleController$observer$1
            @Override // o.setCheckable
            public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
                pN.setY(settouchdelegate, "");
                pN.setY(setx, "");
                if (settouchdelegate.MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda0() == registerIn$MenuHostHelper$$ExternalSyntheticLambda1.DESTROYED) {
                    setLayoutResource setlayoutresource = setLayoutResource.this;
                    sBVar.MenuHostHelper$$ExternalSyntheticLambda1(null);
                    setlayoutresource.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setlayoutresource.MenuHostHelper$$ExternalSyntheticLambda1);
                    setTop settop2 = setlayoutresource.setX;
                    settop2.setY = true;
                    settop2.setIconTintList();
                } else if (settouchdelegate.MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda0().compareTo(setLayoutResource.this.setY) < 0) {
                    setLayoutResource.this.setX.setX = true;
                } else {
                    setTop settop3 = setLayoutResource.this.setX;
                    if (settop3.setX) {
                        if (!(!settop3.setY)) {
                            throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
                        }
                        settop3.setX = false;
                        settop3.setIconTintList();
                    }
                }
            }
        };
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setcheckable;
        if (registerin.MenuHostHelper$$ExternalSyntheticLambda0() != registerIn$MenuHostHelper$$ExternalSyntheticLambda1.DESTROYED) {
            registerin.setY(setcheckable);
            return;
        }
        sBVar.MenuHostHelper$$ExternalSyntheticLambda1(null);
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
        setTop settop2 = this.setX;
        settop2.setY = true;
        settop2.setIconTintList();
    }
}