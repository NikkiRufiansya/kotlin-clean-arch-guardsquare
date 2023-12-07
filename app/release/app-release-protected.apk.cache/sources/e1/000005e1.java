package o;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class iB implements iE {
    @Override // o.iE
    public final C0251iw$MenuHostHelper$$ExternalSyntheticLambda0<?, ?> setY(Object obj) {
        return ((C0250iw) obj).setX;
    }

    @Override // o.iE
    public final Map<?, ?> setX(Object obj) {
        return (iA) obj;
    }

    @Override // o.iE
    public final Object MenuHostHelper$$ExternalSyntheticLambda0(Object obj) {
        ((iA) obj).MenuHostHelper$$ExternalSyntheticLambda0 = false;
        return obj;
    }

    @Override // o.iE
    public final int MenuHostHelper$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        iA iAVar = (iA) obj;
        C0250iw c0250iw = (C0250iw) obj2;
        int i2 = 0;
        if (iAVar.isEmpty()) {
            return 0;
        }
        Iterator it = iAVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int centerIfNoTextEnabled = hX.setCenterIfNoTextEnabled(i);
            C0251iw$MenuHostHelper$$ExternalSyntheticLambda0<K, V> c0251iw$MenuHostHelper$$ExternalSyntheticLambda0 = c0250iw.setX;
            i2 += centerIfNoTextEnabled + hX.setUiOptions(C0237ij.setX(c0251iw$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1, 1, key) + C0237ij.setX(c0251iw$MenuHostHelper$$ExternalSyntheticLambda0.setX, 2, value));
        }
        return i2;
    }

    @Override // o.iE
    public final Object MenuHostHelper$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        iA iAVar = (iA) obj;
        iA iAVar2 = (iA) obj2;
        if (!iAVar2.isEmpty()) {
            if (!iAVar.MenuHostHelper$$ExternalSyntheticLambda0) {
                iAVar = iAVar.isEmpty() ? new iA() : new iA(iAVar);
            }
            if (iAVar.MenuHostHelper$$ExternalSyntheticLambda0) {
                if (!iAVar2.isEmpty()) {
                    iAVar.putAll(iAVar2);
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        return iAVar;
    }
}