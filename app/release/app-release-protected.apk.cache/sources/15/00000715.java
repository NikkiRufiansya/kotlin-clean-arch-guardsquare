package o;

import android.net.NetworkInfo;
import android.os.Handler;
import java.io.IOException;
import o.AbstractC0315nc;
import o.C0540vj;
import o.vE;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class mW extends AbstractC0315nc {
    private final mL MenuHostHelper$$ExternalSyntheticLambda0;
    private final C0318nf setIconTintList;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0315nc
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0315nc
    public final int setIconTintList() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public mW(mL mLVar, C0318nf c0318nf) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = mLVar;
        this.setIconTintList = c0318nf;
    }

    @Override // o.AbstractC0315nc
    public final boolean setY(mY mYVar) {
        String scheme = mYVar.setZ.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0315nc
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    /* loaded from: classes.dex */
    static class setY extends IOException {
        public setY(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    static final class setX extends IOException {
        final int MenuHostHelper$$ExternalSyntheticLambda1;
        final int setY;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        setX(int r3, int r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "HTTP "
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.MenuHostHelper$$ExternalSyntheticLambda1 = r3
                r2.setY = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.mW.setX.<init>(int, int):void");
        }
    }

    @Override // o.AbstractC0315nc
    public final AbstractC0315nc.setX MenuHostHelper$$ExternalSyntheticLambda0(mY mYVar, int i) {
        C0540vj c0540vj;
        boolean z = true;
        if (i == 0) {
            c0540vj = null;
        } else if (mV.MenuHostHelper$$ExternalSyntheticLambda0(i)) {
            c0540vj = C0540vj.MenuHostHelper$$ExternalSyntheticLambda1;
        } else {
            C0540vj.setX setx = new C0540vj.setX();
            if (!mV.setY(i)) {
                setx.setX = true;
            }
            if (!mV.MenuHostHelper$$ExternalSyntheticLambda1(i)) {
                setx.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            }
            c0540vj = setx.setY();
        }
        vE.setIconTintList MenuHostHelper$$ExternalSyntheticLambda1 = new vE.setIconTintList().MenuHostHelper$$ExternalSyntheticLambda1(mYVar.setZ.toString());
        if (c0540vj != null) {
            pN.setY(c0540vj, "");
            String obj = c0540vj.toString();
            if (!(obj.length() == 0)) {
                pN.setY("Cache-Control", "");
                pN.setY(obj, "");
                MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0.setX("Cache-Control", obj);
            } else {
                pN.setY("Cache-Control", "");
                MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0.setX("Cache-Control");
            }
        }
        vJ y = this.MenuHostHelper$$ExternalSyntheticLambda0.setY(MenuHostHelper$$ExternalSyntheticLambda1.setX());
        vH vHVar = y.setIconTintList;
        int i2 = y.MenuHostHelper$$ExternalSyntheticLambda0;
        if (!((200 > i2 || 299 < i2) ? false : false)) {
            vHVar.close();
            throw new setX(y.MenuHostHelper$$ExternalSyntheticLambda0, mYVar.setNavigationOnClickListener);
        }
        mU$MenuHostHelper$$ExternalSyntheticLambda1 mu_menuhosthelper__externalsyntheticlambda1 = y.setX == null ? mU$MenuHostHelper$$ExternalSyntheticLambda1.NETWORK : mU$MenuHostHelper$$ExternalSyntheticLambda1.DISK;
        if (mu_menuhosthelper__externalsyntheticlambda1 == mU$MenuHostHelper$$ExternalSyntheticLambda1.DISK && vHVar.setIconTintList() == 0) {
            vHVar.close();
            throw new setY("Received response with 0 content-length header.");
        }
        if (mu_menuhosthelper__externalsyntheticlambda1 == mU$MenuHostHelper$$ExternalSyntheticLambda1.NETWORK && vHVar.setIconTintList() > 0) {
            C0318nf c0318nf = this.setIconTintList;
            long iconTintList = vHVar.setIconTintList();
            Handler handler = c0318nf.setOnLongClickListener;
            handler.sendMessage(handler.obtainMessage(4, Long.valueOf(iconTintList)));
        }
        return new AbstractC0315nc.setX(vHVar.MenuHostHelper$$ExternalSyntheticLambda1(), mu_menuhosthelper__externalsyntheticlambda1);
    }
}