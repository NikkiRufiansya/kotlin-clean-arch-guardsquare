package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;
import o.ParcelImpl;
import o.isLayoutSuppressed;
import o.registerIn;
import o.registerIn$MenuHostHelper$$ExternalSyntheticLambda1;
import o.setBackgroundTintList;
import o.setBaselineAlignBottom;
import o.setCheckable;
import o.setDropDownBackgroundResource;
import o.setExtendMotionSpecResource;
import o.setTouchDelegate;

/* loaded from: classes.dex */
public class FragmentStateAdapter$2 implements setCheckable {
    final /* synthetic */ isLayoutSuppressed MenuHostHelper$$ExternalSyntheticLambda0;
    final /* synthetic */ setExtendMotionSpecResource setY;

    private FragmentStateAdapter$2(isLayoutSuppressed islayoutsuppressed, setExtendMotionSpecResource setextendmotionspecresource) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = islayoutsuppressed;
        this.setY = setextendmotionspecresource;
    }

    @Override // o.setCheckable
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
        ParcelImpl parcelImpl = this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList;
        if (parcelImpl.setCheckedIconEnabled || parcelImpl.SearchView$SavedState$1) {
            return;
        }
        settouchdelegate.MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda1(this);
        if (setBaselineAlignBottom.setChipIconTintResource((FrameLayout) this.setY.setIconTintList)) {
            isLayoutSuppressed islayoutsuppressed = this.MenuHostHelper$$ExternalSyntheticLambda0;
            setExtendMotionSpecResource setextendmotionspecresource = this.setY;
            setDropDownBackgroundResource MenuHostHelper$$ExternalSyntheticLambda0 = islayoutsuppressed.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setextendmotionspecresource.MenuHostHelper$$ExternalSyntheticLambda0, null);
            if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            FrameLayout frameLayout = (FrameLayout) setextendmotionspecresource.setIconTintList;
            View view = MenuHostHelper$$ExternalSyntheticLambda0.getView();
            if (!MenuHostHelper$$ExternalSyntheticLambda0.setChipSpacingVertical() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            if (MenuHostHelper$$ExternalSyntheticLambda0.setChipSpacingVertical() && view == null) {
                islayoutsuppressed.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0, frameLayout);
            } else if (MenuHostHelper$$ExternalSyntheticLambda0.setChipSpacingVertical() && view.getParent() != null) {
                if (view.getParent() != frameLayout) {
                    isLayoutSuppressed.setY(view, frameLayout);
                }
            } else if (MenuHostHelper$$ExternalSyntheticLambda0.setChipSpacingVertical()) {
                isLayoutSuppressed.setY(view, frameLayout);
            } else {
                ParcelImpl parcelImpl2 = islayoutsuppressed.setIconTintList;
                if (!(parcelImpl2.setCheckedIconEnabled || parcelImpl2.SearchView$SavedState$1)) {
                    islayoutsuppressed.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0, frameLayout);
                    setBackgroundTintList setbackgroundtintlist = new setBackgroundTintList(islayoutsuppressed.setIconTintList);
                    StringBuilder sb = new StringBuilder("f");
                    sb.append(setextendmotionspecresource.MenuHostHelper$$ExternalSyntheticLambda0);
                    setbackgroundtintlist.setIconTintList(0, MenuHostHelper$$ExternalSyntheticLambda0, sb.toString(), 1);
                    setbackgroundtintlist.setX(MenuHostHelper$$ExternalSyntheticLambda0, registerIn$MenuHostHelper$$ExternalSyntheticLambda1.STARTED).MenuHostHelper$$ExternalSyntheticLambda1();
                    isLayoutSuppressed.setX setx2 = islayoutsuppressed.MenuHostHelper$$ExternalSyntheticLambda1;
                    throw null;
                } else if (islayoutsuppressed.setIconTintList.setUiOptions) {
                } else {
                    islayoutsuppressed.setOnLongClickListener.setY(new FragmentStateAdapter$2(islayoutsuppressed, setextendmotionspecresource));
                }
            }
        }
    }
}