package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import o.nR;

/* renamed from: o.tc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0477tc {
    private static volatile Choreographer choreographer;

    public static final Handler setX(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    static {
        Object x;
        try {
            nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            x = nR.setX(new sW(setX(Looper.getMainLooper())));
        } catch (Throwable th) {
            nR.setIconTintList seticontintlist2 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            pN.setY((Object) th, "");
            x = nR.setX(new nR.setX(th));
        }
        if (nR.MenuHostHelper$$ExternalSyntheticLambda1(x)) {
            x = null;
        }
        AbstractC0478td abstractC0478td = (AbstractC0478td) x;
    }
}