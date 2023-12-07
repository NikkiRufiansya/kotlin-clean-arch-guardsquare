package o;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.er  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnDrawListenerC0137er implements ViewTreeObserver.OnDrawListener {
    private final AtomicReference<View> MenuHostHelper$$ExternalSyntheticLambda1;
    private final Handler setIconTintList = new Handler(Looper.getMainLooper());
    private final Runnable setY;

    public ViewTreeObserver$OnDrawListenerC0137er(View view, Runnable runnable) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new AtomicReference<>(view);
        this.setY = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View andSet = this.MenuHostHelper$$ExternalSyntheticLambda1.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.et
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                andSet.getViewTreeObserver().removeOnDrawListener(ViewTreeObserver$OnDrawListenerC0137er.this);
            }
        });
        this.setIconTintList.postAtFrontOfQueue(this.setY);
    }
}