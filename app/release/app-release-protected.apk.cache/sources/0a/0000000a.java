package androidx.activity.result;

import o.ViewPager$SavedState$1;
import o.registerIn;
import o.setCenterIfNoTextEnabled;
import o.setCheckable;
import o.setChipCornerRadius;
import o.setTouchDelegate;
import o.setZ;

/* loaded from: classes.dex */
public class ActivityResultRegistry$1 implements setCheckable {
    final /* synthetic */ String MenuHostHelper$$ExternalSyntheticLambda0;
    final /* synthetic */ setZ MenuHostHelper$$ExternalSyntheticLambda1;
    final /* synthetic */ setCenterIfNoTextEnabled setIconTintList;
    final /* synthetic */ setChipCornerRadius setY;

    @Override // o.setCheckable
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
        if (registerIn.setX.ON_START.equals(setx)) {
            this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.put(this.MenuHostHelper$$ExternalSyntheticLambda0, new setCenterIfNoTextEnabled.setX<>(this.setY, this.MenuHostHelper$$ExternalSyntheticLambda1));
            if (this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0.containsKey(this.MenuHostHelper$$ExternalSyntheticLambda0)) {
                Object obj = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0.get(this.MenuHostHelper$$ExternalSyntheticLambda0);
                this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0.remove(this.MenuHostHelper$$ExternalSyntheticLambda0);
                this.setY.MenuHostHelper$$ExternalSyntheticLambda0(obj);
            }
            ViewPager$SavedState$1 viewPager$SavedState$1 = (ViewPager$SavedState$1) this.setIconTintList.setNavigationOnClickListener.getParcelable(this.MenuHostHelper$$ExternalSyntheticLambda0);
            if (viewPager$SavedState$1 != null) {
                this.setIconTintList.setNavigationOnClickListener.remove(this.MenuHostHelper$$ExternalSyntheticLambda0);
                this.setY.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(viewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1, viewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0));
            }
        } else if (registerIn.setX.ON_STOP.equals(setx)) {
            this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.remove(this.MenuHostHelper$$ExternalSyntheticLambda0);
        } else if (registerIn.setX.ON_DESTROY.equals(setx)) {
            this.setIconTintList.setY(this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
    }
}