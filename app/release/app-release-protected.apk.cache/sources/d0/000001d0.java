package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 {
    public final ArrayList<setX> setY = new ArrayList<>();
    public setX MenuHostHelper$$ExternalSyntheticLambda0 = null;
    public ValueAnimator setX = null;
    public final Animator.AnimatorListener MenuHostHelper$$ExternalSyntheticLambda1 = new AnimatorListenerAdapter() { // from class: o.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.3
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.this.setX == animator) {
                FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.this.setX = null;
            }
        }
    };

    /* loaded from: classes.dex */
    public static class setX {
        public final ValueAnimator MenuHostHelper$$ExternalSyntheticLambda1;
        public final int[] setX;

        public setX(int[] iArr, ValueAnimator valueAnimator) {
            this.setX = iArr;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = valueAnimator;
        }
    }
}