package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class uZ$MenuHostHelper$$ExternalSyntheticLambda1 extends C0518uo implements InterfaceC0456si {
    static final /* synthetic */ AtomicIntegerFieldUpdater setX = AtomicIntegerFieldUpdater.newUpdater(uZ$MenuHostHelper$$ExternalSyntheticLambda1.class, "isTaken");
    public final Object MenuHostHelper$$ExternalSyntheticLambda1;
    private volatile /* synthetic */ int isTaken = 0;
    private /* synthetic */ uZ setY;

    public abstract boolean setUnboundedRipple();

    public abstract void setX();

    public uZ$MenuHostHelper$$ExternalSyntheticLambda1(uZ uZVar, Object obj) {
        this.setY = uZVar;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = obj;
    }

    @Override // o.InterfaceC0456si
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        q_();
    }
}