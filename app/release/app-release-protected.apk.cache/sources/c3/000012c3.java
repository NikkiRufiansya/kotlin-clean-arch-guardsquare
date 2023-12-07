package o;

import java.io.IOException;
import java.net.ProtocolException;
import o.C0560wa;
import o.vJ;

/* renamed from: o.wk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0571wk implements InterfaceC0554vw {
    private final boolean setY;

    public C0571wk(boolean z) {
        this.setY = z;
    }

    @Override // o.InterfaceC0554vw
    public final vJ setX(vw$MenuHostHelper$$ExternalSyntheticLambda1 vw_menuhosthelper__externalsyntheticlambda1) {
        vJ.setIconTintList seticontintlist;
        boolean z;
        vJ MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setY(vw_menuhosthelper__externalsyntheticlambda1, "");
        C0576wp c0576wp = (C0576wp) vw_menuhosthelper__externalsyntheticlambda1;
        C0560wa c0560wa = c0576wp.MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setX(c0560wa);
        vE vEVar = c0576wp.MenuHostHelper$$ExternalSyntheticLambda0;
        vF vFVar = vEVar.MenuHostHelper$$ExternalSyntheticLambda0;
        long currentTimeMillis = System.currentTimeMillis();
        pN.setY(vEVar, "");
        try {
            AbstractC0549vs abstractC0549vs = c0560wa.setIconTintList;
            AbstractC0549vs.setUiOptions(c0560wa.MenuHostHelper$$ExternalSyntheticLambda1);
            c0560wa.setY.setY(vEVar);
            AbstractC0549vs abstractC0549vs2 = c0560wa.setIconTintList;
            AbstractC0549vs.setY(c0560wa.MenuHostHelper$$ExternalSyntheticLambda1, vEVar);
            if (C0572wl.setY(vEVar.setX) && vFVar != null) {
                if ("100-continue".equalsIgnoreCase(vEVar.setIconTintList("Expect"))) {
                    try {
                        c0560wa.setY.MenuHostHelper$$ExternalSyntheticLambda0();
                        seticontintlist = c0560wa.MenuHostHelper$$ExternalSyntheticLambda1(true);
                        AbstractC0549vs abstractC0549vs3 = c0560wa.setIconTintList;
                        AbstractC0549vs.setNavigationOnClickListener(c0560wa.MenuHostHelper$$ExternalSyntheticLambda1);
                        z = false;
                    } catch (IOException e) {
                        AbstractC0549vs abstractC0549vs4 = c0560wa.setIconTintList;
                        AbstractC0549vs.setIconTintList(c0560wa.MenuHostHelper$$ExternalSyntheticLambda1, e);
                        c0560wa.setX(e);
                        throw e;
                    }
                } else {
                    seticontintlist = null;
                    z = true;
                }
                if (seticontintlist == null) {
                    pN.setY(vEVar, "");
                    c0560wa.setNavigationOnClickListener = false;
                    vF vFVar2 = vEVar.MenuHostHelper$$ExternalSyntheticLambda0;
                    pN.setX(vFVar2);
                    long MenuHostHelper$$ExternalSyntheticLambda0 = vFVar2.MenuHostHelper$$ExternalSyntheticLambda0();
                    AbstractC0549vs abstractC0549vs5 = c0560wa.setIconTintList;
                    AbstractC0549vs.setLayoutAnimation(c0560wa.MenuHostHelper$$ExternalSyntheticLambda1);
                    C0560wa.setX setx = new C0560wa.setX(c0560wa, c0560wa.setY.setIconTintList(vEVar, MenuHostHelper$$ExternalSyntheticLambda0), MenuHostHelper$$ExternalSyntheticLambda0);
                    pN.setY(setx, "");
                    xD xDVar = new xD(setx);
                    vFVar.setX(xDVar);
                    xDVar.close();
                } else {
                    c0560wa.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(c0560wa, true, false, null);
                    if (!(c0560wa.setX.setY != null)) {
                        C0563wd iconTintList = c0560wa.setY.setIconTintList();
                        synchronized (iconTintList) {
                            iconTintList.setLayoutAnimation = true;
                        }
                    }
                    z = false;
                }
            } else {
                c0560wa.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(c0560wa, true, false, null);
                seticontintlist = null;
                z = true;
            }
            try {
                c0560wa.setY.setY();
                if (seticontintlist == null) {
                    seticontintlist = c0560wa.MenuHostHelper$$ExternalSyntheticLambda1(false);
                    pN.setX(seticontintlist);
                    if (z) {
                        AbstractC0549vs abstractC0549vs6 = c0560wa.setIconTintList;
                        AbstractC0549vs.setNavigationOnClickListener(c0560wa.MenuHostHelper$$ExternalSyntheticLambda1);
                    }
                }
                pN.setY(vEVar, "");
                seticontintlist.setTextAlignment = vEVar;
                seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 = c0560wa.setX.MenuHostHelper$$ExternalSyntheticLambda1;
                seticontintlist.setIconSize = currentTimeMillis;
                seticontintlist.setCenterIfNoTextEnabled = System.currentTimeMillis();
                vJ MenuHostHelper$$ExternalSyntheticLambda12 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1();
                int i = MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda0;
                if (i == 100) {
                    vJ.setIconTintList MenuHostHelper$$ExternalSyntheticLambda13 = c0560wa.MenuHostHelper$$ExternalSyntheticLambda1(false);
                    pN.setX(MenuHostHelper$$ExternalSyntheticLambda13);
                    pN.setY(vEVar, "");
                    MenuHostHelper$$ExternalSyntheticLambda13.setTextAlignment = vEVar;
                    MenuHostHelper$$ExternalSyntheticLambda13.MenuHostHelper$$ExternalSyntheticLambda1 = c0560wa.setX.MenuHostHelper$$ExternalSyntheticLambda1;
                    MenuHostHelper$$ExternalSyntheticLambda13.setIconSize = currentTimeMillis;
                    MenuHostHelper$$ExternalSyntheticLambda13.setCenterIfNoTextEnabled = System.currentTimeMillis();
                    MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda13.MenuHostHelper$$ExternalSyntheticLambda1();
                    i = MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda0;
                }
                pN.setY(MenuHostHelper$$ExternalSyntheticLambda12, "");
                AbstractC0549vs abstractC0549vs7 = c0560wa.setIconTintList;
                AbstractC0549vs.MenuHostHelper$$ExternalSyntheticLambda1(c0560wa.MenuHostHelper$$ExternalSyntheticLambda1, MenuHostHelper$$ExternalSyntheticLambda12);
                if (this.setY && i == 101) {
                    vJ.setIconTintList seticontintlist2 = new vJ.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda12);
                    seticontintlist2.setY = vL.setY;
                    MenuHostHelper$$ExternalSyntheticLambda1 = seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda1();
                } else {
                    vJ.setIconTintList seticontintlist3 = new vJ.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda12);
                    seticontintlist3.setY = c0560wa.setY(MenuHostHelper$$ExternalSyntheticLambda12);
                    MenuHostHelper$$ExternalSyntheticLambda1 = seticontintlist3.MenuHostHelper$$ExternalSyntheticLambda1();
                }
                if ("close".equalsIgnoreCase(MenuHostHelper$$ExternalSyntheticLambda1.setCenterIfNoTextEnabled.setIconTintList("Connection")) || "close".equalsIgnoreCase(vJ.setY(MenuHostHelper$$ExternalSyntheticLambda1, "Connection"))) {
                    C0563wd iconTintList2 = c0560wa.setY.setIconTintList();
                    synchronized (iconTintList2) {
                        iconTintList2.setLayoutAnimation = true;
                    }
                }
                if (i == 204 || i == 205) {
                    vH vHVar = MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList;
                    if ((vHVar != null ? vHVar.setIconTintList() : -1L) > 0) {
                        StringBuilder sb = new StringBuilder("HTTP ");
                        sb.append(i);
                        sb.append(" had non-zero Content-Length: ");
                        vH vHVar2 = MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList;
                        sb.append(vHVar2 != null ? Long.valueOf(vHVar2.setIconTintList()) : null);
                        throw new ProtocolException(sb.toString());
                    }
                }
                return MenuHostHelper$$ExternalSyntheticLambda1;
            } catch (IOException e2) {
                AbstractC0549vs abstractC0549vs8 = c0560wa.setIconTintList;
                AbstractC0549vs.setIconTintList(c0560wa.MenuHostHelper$$ExternalSyntheticLambda1, e2);
                c0560wa.setX(e2);
                throw e2;
            }
        } catch (IOException e3) {
            AbstractC0549vs abstractC0549vs9 = c0560wa.setIconTintList;
            AbstractC0549vs.setIconTintList(c0560wa.MenuHostHelper$$ExternalSyntheticLambda1, e3);
            c0560wa.setX(e3);
            throw e3;
        }
    }
}