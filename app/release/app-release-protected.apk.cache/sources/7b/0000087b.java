package o;

import o.C0402qi;

/* renamed from: o.qu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0414qu extends C0413qt {
    public static final long MenuHostHelper$$ExternalSyntheticLambda1(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    public static final C0402qi setIconTintList(C0402qi c0402qi, int i) {
        pN.setY(c0402qi, "");
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        pN.setY(valueOf, "");
        if (z) {
            C0402qi.setX setx = C0402qi.setY;
            int iconTintList = c0402qi.setIconTintList();
            int i2 = c0402qi.setIconTintList;
            if (c0402qi.setX <= 0) {
                i = -i;
            }
            return new C0402qi(iconTintList, i2, i);
        }
        StringBuilder sb = new StringBuilder("Step must be positive, was: ");
        sb.append(valueOf);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
}