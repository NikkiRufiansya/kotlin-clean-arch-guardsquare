package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.setCardElevation;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.setIconTintList<V> {
    public int MenuHostHelper$$ExternalSyntheticLambda0;
    public int MenuHostHelper$$ExternalSyntheticLambda1;
    private final LinkedHashSet<setX> setIconTintList;
    public int setX;
    ViewPropertyAnimator setY;

    /* loaded from: classes.dex */
    public interface setX {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public boolean MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior() {
        this.setIconTintList = new LinkedHashSet<>();
        this.setX = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 2;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setIconTintList = new LinkedHashSet<>();
        this.setX = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 2;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.setX = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.MenuHostHelper$$ExternalSyntheticLambda1(coordinatorLayout, (CoordinatorLayout) v, i);
    }

    private void setIconTintList(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        Iterator<setX> it = this.setIconTintList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void setIconTintList(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.setY = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.setY = null;
            }
        });
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final void setX(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.setY;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            setIconTintList(1);
            setIconTintList(v, this.setX + this.MenuHostHelper$$ExternalSyntheticLambda1, 175L, setCardElevation.setX);
        } else if (i2 < 0) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == 2) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator2 = this.setY;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                v.clearAnimation();
            }
            setIconTintList(2);
            setIconTintList(v, 0, 225L, setCardElevation.MenuHostHelper$$ExternalSyntheticLambda1);
        }
    }
}