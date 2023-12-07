package o;

import java.util.Set;
import o.C0557vz;

/* renamed from: o.xk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0598xk implements InterfaceC0554vw {
    public volatile setY MenuHostHelper$$ExternalSyntheticLambda1;
    private final xk$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList;
    private volatile Set<String> setX;

    /* renamed from: o.xk$setY */
    /* loaded from: classes.dex */
    public enum setY {
        NONE,
        /* JADX INFO: Fake field, exist only in values array */
        BASIC,
        HEADERS,
        BODY
    }

    public C0598xk() {
        this((byte) 0);
    }

    private C0598xk(xk$MenuHostHelper$$ExternalSyntheticLambda1 xk_menuhosthelper__externalsyntheticlambda1) {
        pN.setY(xk_menuhosthelper__externalsyntheticlambda1, "");
        this.setIconTintList = xk_menuhosthelper__externalsyntheticlambda1;
        this.setX = C0363ox.setY;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setY.NONE;
    }

    public /* synthetic */ C0598xk(byte b) {
        this(xk$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0268  */
    @Override // o.InterfaceC0554vw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.vJ setX(o.vw$MenuHostHelper$$ExternalSyntheticLambda1 r22) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0598xk.setX(o.vw$MenuHostHelper$$ExternalSyntheticLambda1):o.vJ");
    }

    private final void setY(C0557vz c0557vz, int i) {
        int i2 = i << 1;
        String str = this.setX.contains(c0557vz.setIconTintList[i2]) ? "██" : c0557vz.setIconTintList[i2 + 1];
        xk$MenuHostHelper$$ExternalSyntheticLambda1 xk_menuhosthelper__externalsyntheticlambda1 = this.setIconTintList;
        StringBuilder sb = new StringBuilder();
        sb.append(c0557vz.setIconTintList[i2]);
        sb.append(": ");
        sb.append(str);
        xk_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1(sb.toString());
    }

    private static boolean setIconTintList(C0557vz c0557vz) {
        pN.setY("Content-Encoding", "");
        C0557vz.setX setx = C0557vz.setX;
        String y = C0557vz.setX.setY(c0557vz.setIconTintList, "Content-Encoding");
        if (y != null) {
            if (y == null ? false : y.equalsIgnoreCase("identity")) {
                return false;
            }
            return !(y == null ? false : y.equalsIgnoreCase("gzip"));
        }
        return false;
    }
}