package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import o.setCornerRadiusResource;

/* loaded from: classes.dex */
public abstract class isLayoutSuppressed extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1<setExtendMotionSpecResource> implements setMin {
    public final setPrefixTextAppearance<setDropDownBackgroundResource> MenuHostHelper$$ExternalSyntheticLambda0;
    public setX MenuHostHelper$$ExternalSyntheticLambda1;
    public final ParcelImpl setIconTintList;
    public final registerIn setOnLongClickListener;

    /* loaded from: classes.dex */
    public class setX {
        public final /* synthetic */ isLayoutSuppressed MenuHostHelper$$ExternalSyntheticLambda1;
        public setContentHeight setY;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(final setDropDownBackgroundResource setdropdownbackgroundresource, final FrameLayout frameLayout) {
        this.setIconTintList.setZ.setX.add(new setCornerRadiusResource.setY(new ParcelImpl$MenuHostHelper$$ExternalSyntheticLambda0() { // from class: o.isLayoutSuppressed.3
            @Override // o.ParcelImpl$MenuHostHelper$$ExternalSyntheticLambda0
            public final void setIconTintList(ParcelImpl parcelImpl, setDropDownBackgroundResource setdropdownbackgroundresource2, View view) {
                if (setdropdownbackgroundresource2 == setdropdownbackgroundresource) {
                    parcelImpl.setY(this);
                    isLayoutSuppressed.setY(view, frameLayout);
                }
            }
        }, false));
    }

    public static void setY(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }
}