package o;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class setSplitBackground {
    public static final int[] MenuHostHelper$$ExternalSyntheticLambda1 = {16843848};

    setSplitBackground() {
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(View view, float f) {
        view.getResources();
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{16842910, R.attr.res_0x7f0403ca, -2130969547}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(150L));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(150L));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}