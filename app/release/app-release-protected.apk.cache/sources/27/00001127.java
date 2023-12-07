package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: o.sx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0471sx extends sF {
    private static final /* synthetic */ AtomicIntegerFieldUpdater MenuHostHelper$$ExternalSyntheticLambda1 = AtomicIntegerFieldUpdater.newUpdater(C0471sx.class, "_invoked");
    private final InterfaceC0377pk<Throwable, nX> MenuHostHelper$$ExternalSyntheticLambda0;
    private volatile /* synthetic */ int _invoked = 0;

    @Override // o.InterfaceC0377pk
    public final /* synthetic */ nX setX(Throwable th) {
        Throwable th2 = th;
        if (MenuHostHelper$$ExternalSyntheticLambda1.compareAndSet(this, 0, 1)) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setX(th2);
        }
        return nX.setX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0471sx(InterfaceC0377pk<? super Throwable, nX> interfaceC0377pk) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = interfaceC0377pk;
    }

    @Override // o.rM
    /* renamed from: setX  reason: avoid collision after fix types in other method */
    public final void setX2(Throwable th) {
        if (MenuHostHelper$$ExternalSyntheticLambda1.compareAndSet(this, 0, 1)) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setX(th);
        }
    }
}