package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class setHeaderDividersEnabled {
    private final WeakReference<View> setY;
    Runnable setIconTintList = null;
    Runnable MenuHostHelper$$ExternalSyntheticLambda1 = null;
    int MenuHostHelper$$ExternalSyntheticLambda0 = -1;

    public setHeaderDividersEnabled(View view) {
        this.setY = new WeakReference<>(view);
    }

    public final setHeaderDividersEnabled MenuHostHelper$$ExternalSyntheticLambda1(long j) {
        View view = this.setY.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public final setHeaderDividersEnabled setX(float f) {
        View view = this.setY.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public final setHeaderDividersEnabled MenuHostHelper$$ExternalSyntheticLambda0(float f) {
        View view = this.setY.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public final long MenuHostHelper$$ExternalSyntheticLambda1() {
        View view = this.setY.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public final setHeaderDividersEnabled MenuHostHelper$$ExternalSyntheticLambda1(Interpolator interpolator) {
        View view = this.setY.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public final setHeaderDividersEnabled setX(long j) {
        View view = this.setY.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        View view = this.setY.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void setIconTintList() {
        View view = this.setY.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final setHeaderDividersEnabled MenuHostHelper$$ExternalSyntheticLambda0(setSelectAllOnFocus setselectallonfocus) {
        View view = this.setY.get();
        if (view != null) {
            MenuHostHelper$$ExternalSyntheticLambda1(view, setselectallonfocus);
        }
        return this;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(final View view, final setSelectAllOnFocus setselectallonfocus) {
        if (setselectallonfocus != null) {
            view.animate().setListener(new AnimatorListenerAdapter() { // from class: o.setHeaderDividersEnabled.5
                {
                    setHeaderDividersEnabled.this = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    setselectallonfocus.MenuHostHelper$$ExternalSyntheticLambda1(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    setselectallonfocus.MenuHostHelper$$ExternalSyntheticLambda0(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    setselectallonfocus.setX(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    public final setHeaderDividersEnabled setIconTintList(final setPerformanceTrackingEnabled setperformancetrackingenabled) {
        final View view = this.setY.get();
        if (view != null) {
            view.animate().setUpdateListener(setperformancetrackingenabled != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: o.setCurrentTab
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    setHeaderDividersEnabled.setIconTintList(setPerformanceTrackingEnabled.this, view, valueAnimator);
                }
            } : null);
        }
        return this;
    }

    public static /* synthetic */ void setIconTintList(setPerformanceTrackingEnabled setperformancetrackingenabled, View view, ValueAnimator valueAnimator) {
        setperformancetrackingenabled.setX();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX {
    }
}