package o;

/* loaded from: classes.dex */
public final class sZ extends rQ {
    public static final sZ MenuHostHelper$$ExternalSyntheticLambda1 = new sZ();

    @Override // o.rQ
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(oM oMVar) {
        return false;
    }

    @Override // o.rQ
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    private sZ() {
    }

    @Override // o.rQ
    public final rQ setIconTintList(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // o.rQ
    public final void setY(oM oMVar, Runnable runnable) {
        sX sXVar = (sX) oMVar.get(sX.setX);
        if (sXVar != null) {
            sXVar.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
}