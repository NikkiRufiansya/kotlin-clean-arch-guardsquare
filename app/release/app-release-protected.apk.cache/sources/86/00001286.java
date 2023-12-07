package o;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import o.C0589xb;
import o.wV;

/* loaded from: classes.dex */
public final class wI extends wR {
    public static final wI$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList = new wI$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
    private static final boolean setY;
    private final List<wY> MenuHostHelper$$ExternalSyntheticLambda0;

    public wI() {
        wY[] wYVarArr = new wY[4];
        wW$MenuHostHelper$$ExternalSyntheticLambda0 ww_menuhosthelper__externalsyntheticlambda0 = wW.MenuHostHelper$$ExternalSyntheticLambda1;
        wYVarArr[0] = pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) "Dalvik", (Object) System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29 ? new wW() : null;
        wV.setIconTintList seticontintlist = wV.setIconTintList;
        wYVarArr[1] = new wX(wV.setX());
        wZ$MenuHostHelper$$ExternalSyntheticLambda1 wz_menuhosthelper__externalsyntheticlambda1 = wZ.setIconTintList;
        wYVarArr[2] = new wX(wZ.MenuHostHelper$$ExternalSyntheticLambda1());
        C0589xb.setIconTintList seticontintlist2 = C0589xb.MenuHostHelper$$ExternalSyntheticLambda0;
        wYVarArr[3] = new wX(C0589xb.setX());
        pN.setY(wYVarArr, "");
        pN.setY(wYVarArr, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) C0342oc.setIconTintList(wYVarArr, new ArrayList())) {
            if (((wY) obj).setY()) {
                arrayList.add(obj);
            }
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = arrayList;
    }

    @Override // o.wR
    public final void MenuHostHelper$$ExternalSyntheticLambda0(SSLSocket sSLSocket, String str, List<? extends vB> list) {
        Object obj;
        pN.setY(sSLSocket, "");
        pN.setY(list, "");
        Iterator<T> it = this.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((wY) obj).setY(sSLSocket)) {
                break;
            }
        }
        wY wYVar = (wY) obj;
        if (wYVar != null) {
            wYVar.MenuHostHelper$$ExternalSyntheticLambda0(sSLSocket, str, list);
        }
    }

    @Override // o.wR
    public final String setX(SSLSocket sSLSocket) {
        Object obj;
        pN.setY(sSLSocket, "");
        Iterator<T> it = this.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((wY) obj).setY(sSLSocket)) {
                break;
            }
        }
        wY wYVar = (wY) obj;
        if (wYVar != null) {
            return wYVar.setIconTintList(sSLSocket);
        }
        return null;
    }

    @Override // o.wR
    public final AbstractC0592xe setIconTintList(X509TrustManager x509TrustManager) {
        pN.setY(x509TrustManager, "");
        wU$MenuHostHelper$$ExternalSyntheticLambda1 wu_menuhosthelper__externalsyntheticlambda1 = wU.MenuHostHelper$$ExternalSyntheticLambda0;
        wU MenuHostHelper$$ExternalSyntheticLambda1 = wU$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(x509TrustManager);
        return MenuHostHelper$$ExternalSyntheticLambda1 != null ? MenuHostHelper$$ExternalSyntheticLambda1 : super.setIconTintList(x509TrustManager);
    }

    static {
        boolean z = false;
        if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) "Dalvik", (Object) System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        setY = z;
    }

    @Override // o.wR
    public final boolean setIconTintList(String str) {
        pN.setY(str, "");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}