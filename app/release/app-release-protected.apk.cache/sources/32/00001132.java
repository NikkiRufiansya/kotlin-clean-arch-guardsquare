package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
final class tE extends tP<tG<?>> {
    static final /* synthetic */ AtomicReferenceFieldUpdater setX = AtomicReferenceFieldUpdater.newUpdater(tE.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    @Override // o.tP
    public final /* synthetic */ boolean setIconTintList(tG<?> tGVar) {
        C0528uy c0528uy;
        if (this._state != null) {
            return false;
        }
        c0528uy = tI.MenuHostHelper$$ExternalSyntheticLambda0;
        this._state = c0528uy;
        return true;
    }

    @Override // o.tP
    public final /* bridge */ /* synthetic */ oK[] setX(tG<?> tGVar) {
        this._state = null;
        return tL.MenuHostHelper$$ExternalSyntheticLambda0;
    }
}