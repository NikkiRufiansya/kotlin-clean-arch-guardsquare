package o;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: o.wf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0565wf {
    final Set<vG> setIconTintList = new LinkedHashSet();

    public final boolean setX(vG vGVar) {
        boolean contains;
        synchronized (this) {
            pN.setY(vGVar, "");
            contains = this.setIconTintList.contains(vGVar);
        }
        return contains;
    }
}