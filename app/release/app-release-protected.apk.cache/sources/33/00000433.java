package o;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.ev  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnPreDrawListenerC0141ev implements ViewTreeObserver.OnPreDrawListener {
    private final Handler MenuHostHelper$$ExternalSyntheticLambda1 = new Handler(Looper.getMainLooper());
    private final Runnable setIconTintList;
    private final Runnable setX;
    private final AtomicReference<View> setY;

    public ViewTreeObserver$OnPreDrawListenerC0141ev(View view, Runnable runnable, Runnable runnable2) {
        this.setY = new AtomicReference<>(view);
        this.setIconTintList = runnable;
        this.setX = runnable2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View andSet = this.setY.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        this.MenuHostHelper$$ExternalSyntheticLambda1.post(this.setIconTintList);
        this.MenuHostHelper$$ExternalSyntheticLambda1.postAtFrontOfQueue(this.setX);
        return true;
    }
}