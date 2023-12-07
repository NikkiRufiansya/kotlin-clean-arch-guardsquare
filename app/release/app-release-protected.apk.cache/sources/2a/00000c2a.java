package o;

/* loaded from: classes.dex */
public final class setHideMotionSpec extends rQ {
    public final setTop MenuHostHelper$$ExternalSyntheticLambda1 = new setTop();

    @Override // o.rQ
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(oM oMVar) {
        pN.setY(oMVar, "");
        if (C0457sj.setIconTintList().MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda0(oMVar)) {
            return true;
        }
        setTop settop = this.MenuHostHelper$$ExternalSyntheticLambda1;
        return !(settop.setY || !settop.setX);
    }

    @Override // o.rQ
    public final void setY(oM oMVar, final Runnable runnable) {
        pN.setY(oMVar, "");
        pN.setY(runnable, "");
        final setTop settop = this.MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setY(oMVar, "");
        pN.setY(runnable, "");
        sI MenuHostHelper$$ExternalSyntheticLambda0 = C0457sj.setIconTintList().MenuHostHelper$$ExternalSyntheticLambda0();
        if (!MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(oMVar)) {
            if (!(settop.setY || !settop.setX)) {
                settop.MenuHostHelper$$ExternalSyntheticLambda1(runnable);
                return;
            }
        }
        MenuHostHelper$$ExternalSyntheticLambda0.setY(oMVar, new Runnable() { // from class: o.setTop$MenuHostHelper$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                setTop.this.MenuHostHelper$$ExternalSyntheticLambda1(runnable);
            }
        });
    }
}