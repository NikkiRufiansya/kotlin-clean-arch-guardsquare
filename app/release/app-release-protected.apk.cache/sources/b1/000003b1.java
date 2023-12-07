package o;

import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class dQ {
    private static final dQ setLayoutAnimation = new dQ();
    public final Set<WeakReference<dM>> MenuHostHelper$$ExternalSyntheticLambda0;
    public Future MenuHostHelper$$ExternalSyntheticLambda1;
    public dO setIconTintList;
    public final dV setX;
    public final cS setY;

    public static dQ setIconTintList() {
        return setLayoutAnimation;
    }

    private dQ() {
        this(dV.setIconTintList(), dO.setIconTintList(""), cS.MenuHostHelper$$ExternalSyntheticLambda1());
    }

    private dQ(dV dVVar, dO dOVar, cS cSVar) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new HashSet();
        this.setX = dVVar;
        this.setIconTintList = dOVar;
        this.setY = cSVar;
    }
}