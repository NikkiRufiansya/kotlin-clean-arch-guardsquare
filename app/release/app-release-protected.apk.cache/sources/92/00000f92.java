package o;

import android.animation.Animator;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class setSimpleItemSelectedRippleColor {
    public static final setSimpleItemSelectedRippleColor$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList = new setSimpleItemSelectedRippleColor$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
    private static final setSimpleItemSelectedRippleColor setY = new setSimpleItemSelectedRippleColor();
    setCompoundDrawables MenuHostHelper$$ExternalSyntheticLambda0;
    setCompatElevationResource<setProgressBackgroundTintBlendMode> MenuHostHelper$$ExternalSyntheticLambda1 = new setCompatElevationResource<>();

    public static final /* synthetic */ setSimpleItemSelectedRippleColor MenuHostHelper$$ExternalSyntheticLambda1() {
        return setY;
    }

    public static /* synthetic */ void setY(setSimpleItemSelectedRippleColor setsimpleitemselectedripplecolor, setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode, View view) {
        pN.setY(setprogressbackgroundtintblendmode, "");
        pN.setY(view, "");
        setsimpleitemselectedripplecolor.MenuHostHelper$$ExternalSyntheticLambda1(setprogressbackgroundtintblendmode, setsimpleitemselectedripplecolor.MenuHostHelper$$ExternalSyntheticLambda0(view), 600L, true);
    }

    public static /* synthetic */ void setIconTintList(setSimpleItemSelectedRippleColor setsimpleitemselectedripplecolor, setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode, View view) {
        pN.setY(setprogressbackgroundtintblendmode, "");
        pN.setY(view, "");
        setsimpleitemselectedripplecolor.MenuHostHelper$$ExternalSyntheticLambda1(setprogressbackgroundtintblendmode, setsimpleitemselectedripplecolor.MenuHostHelper$$ExternalSyntheticLambda0(view), 600L, false);
    }

    private final setTextSelectHandleLeft MenuHostHelper$$ExternalSyntheticLambda0(View view) {
        return new setTextSelectHandleLeft(setX(view) + (view.getWidth() / 2), setIconTintList(view) + (view.getHeight() / 2));
    }

    private final int setX(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (((View) parent).getId() == R.id.res_0x7f0a010e) {
                return view.getLeft();
            }
            int left = view.getLeft();
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                return setX((View) parent2) + left;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    private final int setIconTintList(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (((View) parent).getId() == R.id.res_0x7f0a010e) {
                return view.getTop();
            }
            int top = view.getTop();
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                return setIconTintList((View) parent2) + top;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode, setTextSelectHandleLeft settextselecthandleleft, long j, boolean z) {
        pN.setY(setprogressbackgroundtintblendmode, "");
        pN.setY(settextselecthandleleft, "");
        setProgressBackgroundTintBlendMode MenuHostHelper$$ExternalSyntheticLambda1 = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
        if (MenuHostHelper$$ExternalSyntheticLambda1 == null || MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0() != setprogressbackgroundtintblendmode.MenuHostHelper$$ExternalSyntheticLambda0()) {
            setCompoundDrawables setcompounddrawables = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (setcompounddrawables == null) {
                pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            }
            Animator animator = setcompounddrawables.setUnboundedRipple;
            boolean z2 = true;
            if ((animator == null || !animator.isRunning()) ? false : false) {
                return;
            }
            setCompoundDrawables setcompounddrawables2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (setcompounddrawables2 == null) {
                pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            }
            setcompounddrawables2.setIconTintList(setprogressbackgroundtintblendmode, settextselecthandleleft, 600L, z);
            this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList((setCompatElevationResource<setProgressBackgroundTintBlendMode>) setprogressbackgroundtintblendmode);
        }
    }
}