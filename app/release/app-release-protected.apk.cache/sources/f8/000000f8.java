package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    AnimatorSet MenuHostHelper$$ExternalSyntheticLambda1;

    protected abstract AnimatorSet setY(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior
    public boolean setX(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.MenuHostHelper$$ExternalSyntheticLambda1;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet y = setY(view, view2, z, z3);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = y;
        y.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.ExpandableTransformationBehavior.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ExpandableTransformationBehavior.this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
            }
        });
        this.MenuHostHelper$$ExternalSyntheticLambda1.start();
        if (!z2) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.end();
        }
        return true;
    }
}