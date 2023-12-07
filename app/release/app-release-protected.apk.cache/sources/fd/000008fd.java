package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: o.sc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0450sc<T> extends uA<T> {
    static final /* synthetic */ AtomicIntegerFieldUpdater setX = AtomicIntegerFieldUpdater.newUpdater(C0450sc.class, "_decision");
    volatile /* synthetic */ int _decision;

    public C0450sc(oM oMVar, oK<? super T> oKVar) {
        super(oMVar, oKVar);
        this._decision = 0;
    }

    @Override // o.uA, o.AbstractC0430rj
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        if (setIconSize()) {
            return;
        }
        C0510ug.setIconTintList(oP.setY(((uA) this).setY), rJ.MenuHostHelper$$ExternalSyntheticLambda0(obj, ((uA) this).setY), null);
    }

    private final boolean setIconSize() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!setX.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // o.uA, o.sK
    public final void setIconTintList(Object obj) {
        if (setIconSize()) {
            return;
        }
        C0510ug.setIconTintList(oP.setY(((uA) this).setY), rJ.MenuHostHelper$$ExternalSyntheticLambda0(obj, ((uA) this).setY), null);
    }
}