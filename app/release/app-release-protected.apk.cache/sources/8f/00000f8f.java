package o;

import android.view.View;

/* loaded from: classes.dex */
class setShrinkMotionSpecResource extends findFragmentByTag {
    private static boolean MenuHostHelper$$ExternalSyntheticLambda1 = true;

    @Override // o.findFragmentByTag
    public void MenuHostHelper$$ExternalSyntheticLambda1(View view) {
    }

    @Override // o.findFragmentByTag
    public void setIconTintList(View view) {
    }

    @Override // o.findFragmentByTag
    public void setX(View view, float f) {
        if (MenuHostHelper$$ExternalSyntheticLambda1) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                MenuHostHelper$$ExternalSyntheticLambda1 = false;
            }
        }
        view.setAlpha(f);
    }

    @Override // o.findFragmentByTag
    public float setY(View view) {
        float transitionAlpha;
        if (MenuHostHelper$$ExternalSyntheticLambda1) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                MenuHostHelper$$ExternalSyntheticLambda1 = false;
            }
        }
        return view.getAlpha();
    }
}