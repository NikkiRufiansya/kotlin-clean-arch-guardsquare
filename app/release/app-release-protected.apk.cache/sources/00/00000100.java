package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import o.FragmentManager$6;
import o.setImeActionLabel;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    private final FragmentManager$6 MenuHostHelper$$ExternalSyntheticLambda0;
    private final FragmentManager$6 setX;

    public FabTransformationScrimBehavior() {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new FragmentManager$6(75L);
        this.setX = new FragmentManager$6(0L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new FragmentManager$6(75L);
        this.setX = new FragmentManager$6(0L);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final boolean setIconTintList(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.MenuHostHelper$$ExternalSyntheticLambda0(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected final AnimatorSet setY(View view, final View view2, final boolean z, boolean z2) {
        ObjectAnimator ofFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        FragmentManager$6 fragmentManager$6 = z ? this.MenuHostHelper$$ExternalSyntheticLambda0 : this.setX;
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, 0.0f);
        }
        fragmentManager$6.MenuHostHelper$$ExternalSyntheticLambda1(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        setImeActionLabel.setX(animatorSet, arrayList);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationScrimBehavior.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                if (z) {
                    view2.setVisibility(0);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (z) {
                    return;
                }
                view2.setVisibility(4);
            }
        });
        return animatorSet;
    }
}