package o;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class setRawInputType implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private ViewTreeObserver MenuHostHelper$$ExternalSyntheticLambda0;
    private final View MenuHostHelper$$ExternalSyntheticLambda1;
    private final Runnable setIconTintList;

    private setRawInputType(View view, Runnable runnable) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = view;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = view.getViewTreeObserver();
        this.setIconTintList = runnable;
    }

    public static setRawInputType MenuHostHelper$$ExternalSyntheticLambda0(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        setRawInputType setrawinputtype = new setRawInputType(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(setrawinputtype);
        view.addOnAttachStateChangeListener(setrawinputtype);
        return setrawinputtype;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        MenuHostHelper$$ExternalSyntheticLambda1();
        this.setIconTintList.run();
        return true;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.isAlive()) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.removeOnPreDrawListener(this);
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda1.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        MenuHostHelper$$ExternalSyntheticLambda1();
    }
}