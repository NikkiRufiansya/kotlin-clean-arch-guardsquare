package o;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
class setStartIconOnClickListener extends setMaxProgress {
    private static boolean setY = true;

    @Override // o.findFragmentByTag
    public void MenuHostHelper$$ExternalSyntheticLambda1(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.MenuHostHelper$$ExternalSyntheticLambda1(view, i);
        } else if (setY) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                setY = false;
            }
        }
    }
}