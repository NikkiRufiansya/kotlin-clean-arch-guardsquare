package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class sC extends rM implements InterfaceC0456si, InterfaceC0470sw {
    public sK setY;

    @Override // o.InterfaceC0470sw
    public final sJ p_() {
        return null;
    }

    @Override // o.InterfaceC0470sw
    public final boolean setX() {
        return true;
    }

    @Override // o.C0518uo
    public String toString() {
        String simpleName;
        StringBuilder sb = new StringBuilder();
        simpleName = getClass().getSimpleName();
        sb.append(simpleName);
        sb.append('@');
        sb.append(rZ.setY(this));
        sb.append("[job@");
        sK sKVar = this.setY;
        if (sKVar == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            sKVar = null;
        }
        sb.append(rZ.setY(sKVar));
        sb.append(']');
        return sb.toString();
    }

    @Override // o.InterfaceC0456si
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        boolean z;
        sK sKVar = this.setY;
        if (sKVar == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            sKVar = null;
        }
        while (true) {
            Object obj = sKVar._state;
            if (!(obj instanceof AbstractC0524uu)) {
                if (!(obj instanceof sC)) {
                    if (!(obj instanceof InterfaceC0470sw) || ((InterfaceC0470sw) obj).p_() == null) {
                        return;
                    }
                    q_();
                    return;
                } else if (obj != this) {
                    return;
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sK.setIconTintList;
                    C0458sk x = sG.setX();
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(sKVar, obj, x)) {
                            if (atomicReferenceFieldUpdater.get(sKVar) != obj) {
                                z = false;
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        return;
                    }
                }
            } else {
                ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(sKVar);
            }
        }
    }
}