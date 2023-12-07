package o;

import java.util.List;
import o.C0610xu;

/* renamed from: o.wm */
/* loaded from: classes.dex */
public final class C0573wm {
    private static final C0610xu MenuHostHelper$$ExternalSyntheticLambda0;
    private static final C0610xu MenuHostHelper$$ExternalSyntheticLambda1;

    static {
        C0610xu.setX setx = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
        pN.setY("\"\\", "");
        pN.setY("\"\\", "");
        byte[] bytes = "\"\\".getBytes(qQ.setIconTintList);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) bytes, "");
        C0610xu c0610xu = new C0610xu(bytes);
        c0610xu.setX = "\"\\";
        MenuHostHelper$$ExternalSyntheticLambda1 = c0610xu;
        C0610xu.setX setx2 = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
        pN.setY("\t ,=", "");
        pN.setY("\t ,=", "");
        byte[] bytes2 = "\t ,=".getBytes(qQ.setIconTintList);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) bytes2, "");
        C0610xu c0610xu2 = new C0610xu(bytes2);
        c0610xu2.setX = "\t ,=";
        MenuHostHelper$$ExternalSyntheticLambda0 = c0610xu2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:262:0x0226, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0152, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0152, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List<o.C0546vp> MenuHostHelper$$ExternalSyntheticLambda1(o.C0557vz r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0573wm.MenuHostHelper$$ExternalSyntheticLambda1(o.vz, java.lang.String):java.util.List");
    }

    private static final String MenuHostHelper$$ExternalSyntheticLambda1(C0602xo c0602xo) {
        C0610xu c0610xu = MenuHostHelper$$ExternalSyntheticLambda0;
        pN.setY(c0610xu, "");
        long y = c0602xo.setY(c0610xu, 0L);
        if (y == -1) {
            y = c0602xo.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        if (y != 0) {
            return c0602xo.setY(y, qQ.setIconTintList);
        }
        return null;
    }

    public static final void MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0548vr interfaceC0548vr, C0555vx c0555vx, C0557vz c0557vz) {
        pN.setY(interfaceC0548vr, "");
        pN.setY(c0555vx, "");
        pN.setY(c0557vz, "");
        if (interfaceC0548vr == InterfaceC0548vr.MenuHostHelper$$ExternalSyntheticLambda0) {
            return;
        }
        List<C0550vt> iconTintList = C0550vt.setY.setIconTintList(c0555vx, c0557vz);
        if (iconTintList.isEmpty()) {
            return;
        }
        interfaceC0548vr.MenuHostHelper$$ExternalSyntheticLambda1(c0555vx, iconTintList);
    }

    public static final boolean setIconTintList(vJ vJVar) {
        pN.setY(vJVar, "");
        if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) vJVar.setCenterIfNoTextEnabled.setX, (Object) "HEAD")) {
            return false;
        }
        int i = vJVar.MenuHostHelper$$ExternalSyntheticLambda0;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && vL.MenuHostHelper$$ExternalSyntheticLambda0(vJVar) == -1 && !"chunked".equalsIgnoreCase(vJ.setY(vJVar, "Transfer-Encoding"))) ? false : true;
    }

    private static final boolean MenuHostHelper$$ExternalSyntheticLambda0(C0602xo c0602xo) {
        boolean z = false;
        while (true) {
            if (!(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0 == 0)) {
                byte MenuHostHelper$$ExternalSyntheticLambda12 = c0602xo.MenuHostHelper$$ExternalSyntheticLambda1(0L);
                if (MenuHostHelper$$ExternalSyntheticLambda12 != 9 && MenuHostHelper$$ExternalSyntheticLambda12 != 32) {
                    if (MenuHostHelper$$ExternalSyntheticLambda12 != 44) {
                        break;
                    }
                    c0602xo.setUnboundedRipple();
                    z = true;
                } else {
                    c0602xo.setUnboundedRipple();
                }
            } else {
                break;
            }
        }
        return z;
    }
}