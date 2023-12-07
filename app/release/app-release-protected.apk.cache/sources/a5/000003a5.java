package o;

import java.io.IOException;

/* loaded from: classes.dex */
public final class dE {
    public static vJ MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0541vk interfaceC0541vk) {
        dA x = dA.setX(C0126eg.setIconTintList());
        eA eAVar = new eA();
        long j = eAVar.MenuHostHelper$$ExternalSyntheticLambda0;
        try {
            vJ MenuHostHelper$$ExternalSyntheticLambda0 = interfaceC0541vk.MenuHostHelper$$ExternalSyntheticLambda0();
            MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0, x, j, new eA().setX - eAVar.setX);
            return MenuHostHelper$$ExternalSyntheticLambda0;
        } catch (IOException e) {
            vE iconTintList = interfaceC0541vk.setIconTintList();
            if (iconTintList != null) {
                C0555vx c0555vx = iconTintList.setLayoutAnimation;
                if (c0555vx != null) {
                    x.setY(c0555vx.setUiOptions().toString());
                }
                if (iconTintList.setX != null) {
                    x.MenuHostHelper$$ExternalSyntheticLambda0(iconTintList.setX);
                }
            }
            x.setIconTintList(j);
            x.setY(new eA().setX - eAVar.setX);
            dN.setX(x);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void MenuHostHelper$$ExternalSyntheticLambda1(vJ vJVar, dA dAVar, long j, long j2) {
        vE vEVar = vJVar.setCenterIfNoTextEnabled;
        if (vEVar == null) {
            return;
        }
        dAVar.setY(vEVar.setLayoutAnimation.setUiOptions().toString());
        dAVar.MenuHostHelper$$ExternalSyntheticLambda0(vEVar.setX);
        if (vEVar.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            long MenuHostHelper$$ExternalSyntheticLambda0 = vEVar.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0();
            if (MenuHostHelper$$ExternalSyntheticLambda0 != -1) {
                dAVar.setY.setX(MenuHostHelper$$ExternalSyntheticLambda0);
            }
        }
        vH vHVar = vJVar.setIconTintList;
        if (vHVar != null) {
            long iconTintList = vHVar.setIconTintList();
            if (iconTintList != -1) {
                dAVar.setY.MenuHostHelper$$ExternalSyntheticLambda0(iconTintList);
            }
            vA MenuHostHelper$$ExternalSyntheticLambda02 = vHVar.MenuHostHelper$$ExternalSyntheticLambda0();
            if (MenuHostHelper$$ExternalSyntheticLambda02 != null) {
                dAVar.setX(MenuHostHelper$$ExternalSyntheticLambda02.toString());
            }
        }
        dAVar.setY.setY(vJVar.MenuHostHelper$$ExternalSyntheticLambda0);
        dAVar.setIconTintList(j);
        dAVar.setY(j2);
        dAVar.MenuHostHelper$$ExternalSyntheticLambda1();
    }
}