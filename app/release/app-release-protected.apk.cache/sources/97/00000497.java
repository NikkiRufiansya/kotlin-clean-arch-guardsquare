package o;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class gD implements gE {
    static {
        new gD$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
    }

    @Override // o.gE
    public final long MenuHostHelper$$ExternalSyntheticLambda1() {
        ri$MenuHostHelper$$ExternalSyntheticLambda1 ri_menuhosthelper__externalsyntheticlambda1 = C0429ri.setIconTintList;
        return C0426rf.MenuHostHelper$$ExternalSyntheticLambda1(SystemClock.elapsedRealtime(), EnumC0425re.MILLISECONDS);
    }

    @Override // o.gE
    public final long setX() {
        return System.currentTimeMillis() * 1000;
    }
}