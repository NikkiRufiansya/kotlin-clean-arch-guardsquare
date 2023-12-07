package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Build;

/* loaded from: classes.dex */
final class setInteractionEnabled {
    private static final boolean MenuHostHelper$$ExternalSyntheticLambda0 = true;
    private static final boolean setIconTintList;
    private static final boolean setY = true;

    static {
        setIconTintList = Build.VERSION.SDK_INT < 28 ? setIconTintList : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.view.View setY(android.view.ViewGroup r17, android.view.View r18, android.view.View r19) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setInteractionEnabled.setY(android.view.ViewGroup, android.view.View, android.view.View):android.view.View");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Animator setIconTintList(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}