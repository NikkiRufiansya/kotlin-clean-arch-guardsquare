package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import o.get;

/* loaded from: classes.dex */
public final class setCertificate {
    public static Animator setIconTintList(get getVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(getVar, (Property<get, V>) get.setX.MenuHostHelper$$ExternalSyntheticLambda1, (TypeEvaluator) get.setY.setX, (Object[]) new get$MenuHostHelper$$ExternalSyntheticLambda1[]{new get$MenuHostHelper$$ExternalSyntheticLambda1(f, f2, f3)});
        get$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0 = getVar.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) getVar, (int) f, (int) f2, MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }
}