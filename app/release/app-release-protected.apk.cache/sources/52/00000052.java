package androidx.fragment.app;

import android.os.Bundle;
import java.util.Map;
import o.ParcelImpl;
import o.registerIn;
import o.setCheckable;
import o.setFirstBaselineToTopHeight;
import o.setTouchDelegate;

/* loaded from: classes.dex */
public class FragmentManager$6 implements setCheckable {
    final /* synthetic */ registerIn MenuHostHelper$$ExternalSyntheticLambda1;
    final /* synthetic */ String setIconTintList;
    final /* synthetic */ ParcelImpl setX;
    final /* synthetic */ setFirstBaselineToTopHeight setY;

    @Override // o.setCheckable
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
        Map map;
        Map map2;
        if (setx == registerIn.setX.ON_START) {
            map2 = this.setX.setMinAndMaxProgress;
            if (((Bundle) map2.get(this.setIconTintList)) != null) {
                this.setX.setMinAndMaxProgress.remove(this.setIconTintList);
            }
        }
        if (setx == registerIn.setX.ON_DESTROY) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(this);
            map = this.setX.setAdapter;
            map.remove(this.setIconTintList);
        }
    }
}