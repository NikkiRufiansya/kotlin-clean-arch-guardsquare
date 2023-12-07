package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AbtRegistrar implements setFrame {
    @Override // o.setFrame
    public void MenuHostHelper$$ExternalSyntheticLambda0() {
    }

    @Override // o.setFrame
    public void setY(setErrorShown seterrorshown, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        seterrorshown.MenuHostHelper$$ExternalSyntheticLambda0(new setNextFocusDownId(colorStateList, f));
        View MenuHostHelper$$ExternalSyntheticLambda1 = seterrorshown.MenuHostHelper$$ExternalSyntheticLambda1();
        MenuHostHelper$$ExternalSyntheticLambda1.setClipToOutline(true);
        MenuHostHelper$$ExternalSyntheticLambda1.setElevation(f2);
        setX(seterrorshown, f3);
    }

    @Override // o.setFrame
    public void MenuHostHelper$$ExternalSyntheticLambda0(setErrorShown seterrorshown, float f) {
        setNextFocusDownId layoutAnimation = setLayoutAnimation(seterrorshown);
        if (f != layoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1) {
            layoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1 = f;
            layoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0((Rect) null);
            layoutAnimation.invalidateSelf();
        }
    }

    @Override // o.setFrame
    public void setX(setErrorShown seterrorshown, float f) {
        setNextFocusDownId layoutAnimation = setLayoutAnimation(seterrorshown);
        boolean y = seterrorshown.setY();
        boolean x = seterrorshown.setX();
        if (f != layoutAnimation.setIconTintList || layoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0 != y || layoutAnimation.setX != x) {
            layoutAnimation.setIconTintList = f;
            layoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0 = y;
            layoutAnimation.setX = x;
            layoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0((Rect) null);
            layoutAnimation.invalidateSelf();
        }
        setUnboundedRipple(seterrorshown);
    }

    @Override // o.setFrame
    public float setIconTintList(setErrorShown seterrorshown) {
        return setLayoutAnimation(seterrorshown).setIconTintList;
    }

    @Override // o.setFrame
    public float MenuHostHelper$$ExternalSyntheticLambda1(setErrorShown seterrorshown) {
        return setNavigationOnClickListener(seterrorshown) * 2.0f;
    }

    @Override // o.setFrame
    public float setY(setErrorShown seterrorshown) {
        return setNavigationOnClickListener(seterrorshown) * 2.0f;
    }

    @Override // o.setFrame
    public float setNavigationOnClickListener(setErrorShown seterrorshown) {
        return setLayoutAnimation(seterrorshown).MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.setFrame
    public void setIconTintList(setErrorShown seterrorshown, float f) {
        seterrorshown.MenuHostHelper$$ExternalSyntheticLambda1().setElevation(f);
    }

    @Override // o.setFrame
    public float MenuHostHelper$$ExternalSyntheticLambda0(setErrorShown seterrorshown) {
        return seterrorshown.MenuHostHelper$$ExternalSyntheticLambda1().getElevation();
    }

    @Override // o.setFrame
    public void setUnboundedRipple(setErrorShown seterrorshown) {
        if (!seterrorshown.setY()) {
            seterrorshown.setIconTintList(0, 0, 0, 0);
            return;
        }
        float iconTintList = setIconTintList(seterrorshown);
        float navigationOnClickListener = setNavigationOnClickListener(seterrorshown);
        int ceil = (int) Math.ceil(setMinWidthResource.MenuHostHelper$$ExternalSyntheticLambda0(iconTintList, navigationOnClickListener, seterrorshown.setX()));
        int ceil2 = (int) Math.ceil(setMinWidthResource.setIconTintList(iconTintList, navigationOnClickListener, seterrorshown.setX()));
        seterrorshown.setIconTintList(ceil, ceil2, ceil, ceil2);
    }

    @Override // o.setFrame
    public void setOnLongClickListener(setErrorShown seterrorshown) {
        setX(seterrorshown, setIconTintList(seterrorshown));
    }

    @Override // o.setFrame
    public void setUiOptions(setErrorShown seterrorshown) {
        setX(seterrorshown, setIconTintList(seterrorshown));
    }

    @Override // o.setFrame
    public void setIconTintList(setErrorShown seterrorshown, ColorStateList colorStateList) {
        setNextFocusDownId layoutAnimation = setLayoutAnimation(seterrorshown);
        layoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0(colorStateList);
        layoutAnimation.invalidateSelf();
    }

    @Override // o.setFrame
    public ColorStateList setX(setErrorShown seterrorshown) {
        return setLayoutAnimation(seterrorshown).setY;
    }

    private setNextFocusDownId setLayoutAnimation(setErrorShown seterrorshown) {
        return (setNextFocusDownId) seterrorshown.MenuHostHelper$$ExternalSyntheticLambda0();
    }
}