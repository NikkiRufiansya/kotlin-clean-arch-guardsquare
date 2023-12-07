package o;

import android.animation.Animator;
import android.view.animation.Animation;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setSelectedItemId$MenuHostHelper$$ExternalSyntheticLambda0 {
    public final Animator MenuHostHelper$$ExternalSyntheticLambda1;
    public final Animation setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setSelectedItemId$MenuHostHelper$$ExternalSyntheticLambda0(Animation animation) {
        this.setX = animation;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        if (animation == null) {
            throw new IllegalStateException("Animation cannot be null");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setSelectedItemId$MenuHostHelper$$ExternalSyntheticLambda0(Animator animator) {
        this.setX = null;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = animator;
        if (animator == null) {
            throw new IllegalStateException("Animator cannot be null");
        }
    }
}