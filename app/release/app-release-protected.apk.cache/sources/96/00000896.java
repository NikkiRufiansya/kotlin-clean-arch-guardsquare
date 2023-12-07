package o;

/* loaded from: classes.dex */
public final class rP {
    public static final void setIconTintList(oM oMVar, Throwable th) {
        try {
            kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler = (kotlinx.coroutines.CoroutineExceptionHandler) oMVar.get(kotlinx.coroutines.CoroutineExceptionHandler.Key);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(oMVar, th);
            } else {
                rN.MenuHostHelper$$ExternalSyntheticLambda0(oMVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                pN.setY((Object) runtimeException, "");
                pN.setY((Object) th, "");
                if (runtimeException != th) {
                    C0369pc.setX.setX(runtimeException, th);
                }
                th = runtimeException;
            }
            rN.MenuHostHelper$$ExternalSyntheticLambda0(oMVar, th);
        }
    }
}