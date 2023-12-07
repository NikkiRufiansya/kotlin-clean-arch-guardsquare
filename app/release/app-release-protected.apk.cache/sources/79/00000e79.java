package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class setPersistentDrawingCache<V> {
    final Throwable MenuHostHelper$$ExternalSyntheticLambda0;
    public final V MenuHostHelper$$ExternalSyntheticLambda1;

    public setPersistentDrawingCache(V v) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = v;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
    }

    public setPersistentDrawingCache(Throwable th) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = th;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setPersistentDrawingCache) {
            setPersistentDrawingCache setpersistentdrawingcache = (setPersistentDrawingCache) obj;
            V v = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (v == null || !v.equals(setpersistentdrawingcache.MenuHostHelper$$ExternalSyntheticLambda1)) {
                Throwable th = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (th == null || setpersistentdrawingcache.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                    return false;
                }
                return th.toString().equals(this.MenuHostHelper$$ExternalSyntheticLambda0.toString());
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda0});
    }
}