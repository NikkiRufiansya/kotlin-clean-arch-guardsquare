package androidx.viewpager2.adapter;

import android.os.Handler;
import o.registerIn;
import o.setCheckable;
import o.setTouchDelegate;

/* loaded from: classes.dex */
public class FragmentStateAdapter$5 implements setCheckable {
    final /* synthetic */ Runnable setIconTintList;
    final /* synthetic */ Handler setY;

    @Override // o.setCheckable
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
        if (setx == registerIn.setX.ON_DESTROY) {
            this.setY.removeCallbacks(this.setIconTintList);
            settouchdelegate.MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda1(this);
        }
    }
}