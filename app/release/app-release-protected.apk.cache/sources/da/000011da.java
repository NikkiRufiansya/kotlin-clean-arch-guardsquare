package o;

import java.util.ArrayList;
import java.util.List;
import o.C0557vz;
import o.C0610xu;
import o.vC;

/* loaded from: classes.dex */
public final class vC$MenuHostHelper$$ExternalSyntheticLambda1 {
    public vA MenuHostHelper$$ExternalSyntheticLambda1;
    public final C0610xu setIconTintList;
    public final List<vC.setY> setY;

    public vC$MenuHostHelper$$ExternalSyntheticLambda1() {
        this((byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private /* synthetic */ vC$MenuHostHelper$$ExternalSyntheticLambda1(byte r2) {
        /*
            r1 = this;
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = ""
            o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.vC$MenuHostHelper$$ExternalSyntheticLambda1.<init>(byte):void");
    }

    private vC$MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        pN.setY(str, "");
        C0610xu.setX setx = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
        pN.setY(str, "");
        pN.setY(str, "");
        byte[] bytes = str.getBytes(qQ.setIconTintList);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) bytes, "");
        C0610xu c0610xu = new C0610xu(bytes);
        c0610xu.setX = str;
        this.setIconTintList = c0610xu;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = vC.MenuHostHelper$$ExternalSyntheticLambda1;
        this.setY = new ArrayList();
    }

    public final vC$MenuHostHelper$$ExternalSyntheticLambda1 setX(C0557vz c0557vz, vF vFVar) {
        String str;
        pN.setY(vFVar, "");
        vC.setY.C0007setY c0007setY = vC.setY.MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setY(vFVar, "");
        String str2 = null;
        if (c0557vz != null) {
            pN.setY("Content-Type", "");
            C0557vz.setX setx = C0557vz.setX;
            str = C0557vz.setX.setY(c0557vz.setIconTintList, "Content-Type");
        } else {
            str = null;
        }
        if (str == null) {
            if (c0557vz != null) {
                pN.setY("Content-Length", "");
                C0557vz.setX setx2 = C0557vz.setX;
                str2 = C0557vz.setX.setY(c0557vz.setIconTintList, "Content-Length");
            }
            if (!(str2 == null)) {
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }
            vC.setY sety = new vC.setY(c0557vz, vFVar, (byte) 0);
            pN.setY(sety, "");
            this.setY.add(sety);
            return this;
        }
        throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
    }
}