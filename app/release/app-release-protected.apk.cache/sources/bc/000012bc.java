package o;

import java.util.Collection;
import java.util.List;
import o.vE;
import o.vJ;

/* renamed from: o.wh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0567wh implements InterfaceC0554vw {
    private final InterfaceC0548vr setY;

    public C0567wh(InterfaceC0548vr interfaceC0548vr) {
        pN.setY(interfaceC0548vr, "");
        this.setY = interfaceC0548vr;
    }

    @Override // o.InterfaceC0554vw
    public final vJ setX(vw$MenuHostHelper$$ExternalSyntheticLambda1 vw_menuhosthelper__externalsyntheticlambda1) {
        boolean z;
        vH vHVar;
        String x;
        pN.setY(vw_menuhosthelper__externalsyntheticlambda1, "");
        vE MenuHostHelper$$ExternalSyntheticLambda1 = vw_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1();
        vE.setIconTintList seticontintlist = new vE.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda1);
        vF vFVar = MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
        if (vFVar != null) {
            vA MenuHostHelper$$ExternalSyntheticLambda12 = vFVar.MenuHostHelper$$ExternalSyntheticLambda1();
            if (MenuHostHelper$$ExternalSyntheticLambda12 != null) {
                String obj = MenuHostHelper$$ExternalSyntheticLambda12.toString();
                pN.setY("Content-Type", "");
                pN.setY(obj, "");
                seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0.setX("Content-Type", obj);
            }
            long MenuHostHelper$$ExternalSyntheticLambda0 = vFVar.MenuHostHelper$$ExternalSyntheticLambda0();
            if (MenuHostHelper$$ExternalSyntheticLambda0 != -1) {
                String valueOf = String.valueOf(MenuHostHelper$$ExternalSyntheticLambda0);
                pN.setY("Content-Length", "");
                pN.setY(valueOf, "");
                seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0.setX("Content-Length", valueOf);
                pN.setY("Transfer-Encoding", "");
                seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0.setX("Transfer-Encoding");
            } else {
                pN.setY("Transfer-Encoding", "");
                pN.setY("chunked", "");
                seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0.setX("Transfer-Encoding", "chunked");
                pN.setY("Content-Length", "");
                seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0.setX("Content-Length");
            }
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList("Host") == null) {
            x = vL.setX(MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation, false);
            pN.setY("Host", "");
            pN.setY(x, "");
            seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0.setX("Host", x);
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList("Connection") == null) {
            pN.setY("Connection", "");
            pN.setY("Keep-Alive", "");
            seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0.setX("Connection", "Keep-Alive");
        }
        int i = 0;
        if (MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList("Accept-Encoding") == null && MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList("Range") == null) {
            pN.setY("Accept-Encoding", "");
            pN.setY("gzip", "");
            seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0.setX("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        List<C0550vt> x2 = this.setY.setX(MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation);
        if (true ^ x2.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Object obj2 : x2) {
                if (i >= 0) {
                    C0550vt c0550vt = (C0550vt) obj2;
                    if (i > 0) {
                        sb.append("; ");
                    }
                    sb.append(c0550vt.MenuHostHelper$$ExternalSyntheticLambda0);
                    sb.append('=');
                    sb.append(c0550vt.setX);
                    i++;
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            String obj3 = sb.toString();
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) obj3, "");
            pN.setY("Cookie", "");
            pN.setY(obj3, "");
            seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0.setX("Cookie", obj3);
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList("User-Agent") == null) {
            pN.setY("User-Agent", "");
            pN.setY("okhttp/4.9.3", "");
            seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0.setX("User-Agent", "okhttp/4.9.3");
        }
        vJ MenuHostHelper$$ExternalSyntheticLambda02 = vw_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0(seticontintlist.setX());
        C0573wm.MenuHostHelper$$ExternalSyntheticLambda0(this.setY, MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation, MenuHostHelper$$ExternalSyntheticLambda02.setNavigationOnClickListener);
        vJ.setIconTintList seticontintlist2 = new vJ.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda02);
        pN.setY(MenuHostHelper$$ExternalSyntheticLambda1, "");
        seticontintlist2.setTextAlignment = MenuHostHelper$$ExternalSyntheticLambda1;
        if (z && "gzip".equalsIgnoreCase(vJ.setY(MenuHostHelper$$ExternalSyntheticLambda02, "Content-Encoding")) && C0573wm.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda02) && (vHVar = MenuHostHelper$$ExternalSyntheticLambda02.setIconTintList) != null) {
            C0614xy c0614xy = new C0614xy(vHVar.MenuHostHelper$$ExternalSyntheticLambda1());
            C0557vz c0557vz = MenuHostHelper$$ExternalSyntheticLambda02.setNavigationOnClickListener;
            C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 c0558vz$MenuHostHelper$$ExternalSyntheticLambda0 = new C0558vz$MenuHostHelper$$ExternalSyntheticLambda0();
            C0348oi.setIconTintList((Collection) c0558vz$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1, (Object[]) c0557vz.setIconTintList);
            seticontintlist2.setX(c0558vz$MenuHostHelper$$ExternalSyntheticLambda0.setX("Content-Encoding").setX("Content-Length").setX());
            String y = vJ.setY(MenuHostHelper$$ExternalSyntheticLambda02, "Content-Type");
            C0614xy c0614xy2 = c0614xy;
            pN.setY(c0614xy2, "");
            seticontintlist2.setY = new C0575wo(y, -1L, new xB(c0614xy2));
        }
        return seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda1();
    }
}