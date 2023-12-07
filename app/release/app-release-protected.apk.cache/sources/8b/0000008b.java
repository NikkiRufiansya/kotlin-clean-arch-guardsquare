package androidx.viewpager2.adapter;

import o.ParcelImpl;
import o.isLayoutSuppressed;
import o.registerIn;
import o.setCheckable;
import o.setContentHeight;
import o.setTouchDelegate;

/* loaded from: classes.dex */
public class FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 implements setCheckable {
    final /* synthetic */ isLayoutSuppressed.setX setIconTintList;

    @Override // o.setCheckable
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
        isLayoutSuppressed.setX setx2 = this.setIconTintList;
        ParcelImpl parcelImpl = setx2.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList;
        if (parcelImpl.setCheckedIconEnabled || parcelImpl.SearchView$SavedState$1) {
            return;
        }
        setContentHeight setcontentheight = setx2.setY;
        throw null;
    }
}