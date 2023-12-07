package o;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.ff  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0152ff {
    private static volatile C0152ff setX;
    private final Set<AbstractC0153fg> MenuHostHelper$$ExternalSyntheticLambda0 = new HashSet();

    C0152ff() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<AbstractC0153fg> MenuHostHelper$$ExternalSyntheticLambda0() {
        Set<AbstractC0153fg> unmodifiableSet;
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            unmodifiableSet = Collections.unmodifiableSet(this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        return unmodifiableSet;
    }

    public static C0152ff setY() {
        C0152ff c0152ff;
        C0152ff c0152ff2 = setX;
        if (c0152ff2 == null) {
            synchronized (C0152ff.class) {
                c0152ff = setX;
                if (c0152ff == null) {
                    c0152ff = new C0152ff();
                    setX = c0152ff;
                }
            }
            return c0152ff;
        }
        return c0152ff2;
    }
}