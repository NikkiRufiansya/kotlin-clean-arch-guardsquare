package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public class rD {
    static final /* synthetic */ AtomicIntegerFieldUpdater setY = AtomicIntegerFieldUpdater.newUpdater(rD.class, "_handled");
    public final Throwable MenuHostHelper$$ExternalSyntheticLambda1;
    volatile /* synthetic */ int _handled;

    public /* synthetic */ rD(Throwable th) {
        this(th, false);
    }

    public rD(Throwable th, boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = th;
        this._handled = z ? 1 : 0;
    }

    public String toString() {
        String simpleName;
        StringBuilder sb = new StringBuilder();
        simpleName = getClass().getSimpleName();
        sb.append(simpleName);
        sb.append('[');
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(']');
        return sb.toString();
    }
}