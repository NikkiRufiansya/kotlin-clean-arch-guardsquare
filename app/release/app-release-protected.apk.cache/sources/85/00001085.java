package o;

import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.WindowInsetsCompat;
import o.setBaselineAlignBottom;

/* loaded from: classes.dex */
public final class setTitleMargin {
    public static PorterDuff.Mode setY(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i == 9) {
                    return PorterDuff.Mode.SRC_ATOP;
                }
                switch (i) {
                    case 14:
                        return PorterDuff.Mode.MULTIPLY;
                    case 15:
                        return PorterDuff.Mode.SCREEN;
                    case 16:
                        return PorterDuff.Mode.ADD;
                    default:
                        return mode;
                }
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void setX(View view, final setTitleMargin$MenuHostHelper$$ExternalSyntheticLambda0 settitlemargin_menuhosthelper__externalsyntheticlambda0) {
        final setTitleMargin$MenuHostHelper$$ExternalSyntheticLambda1 settitlemargin_menuhosthelper__externalsyntheticlambda1 = new setTitleMargin$MenuHostHelper$$ExternalSyntheticLambda1(setBaselineAlignBottom.setAnimationFromJson(view), view.getPaddingTop(), setBaselineAlignBottom.setOnNavigationItemSelectedListener(view), view.getPaddingBottom());
        setBaselineAlignBottom.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1(view, new setCircularRevealScrimColor() { // from class: o.setTitleMargin.3
            @Override // o.setCircularRevealScrimColor
            public final WindowInsetsCompat setIconTintList(View view2, WindowInsetsCompat windowInsetsCompat) {
                return setTitleMargin$MenuHostHelper$$ExternalSyntheticLambda0.this.setY(view2, windowInsetsCompat, new setTitleMargin$MenuHostHelper$$ExternalSyntheticLambda1(settitlemargin_menuhosthelper__externalsyntheticlambda1));
            }
        });
        if (!setBaselineAlignBottom.setChipIconTintResource(view)) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: o.setTitleMargin.1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    setBaselineAlignBottom.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(view2);
                }
            });
        } else {
            setBaselineAlignBottom.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(view);
        }
    }

    public static float setX(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += setBaselineAlignBottom.setUiOptions((View) parent);
        }
        return f;
    }
}