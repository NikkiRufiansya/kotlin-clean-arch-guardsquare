package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import o.setAnimationFromJson;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setChipTextResource {
    private setStripEnabled MenuHostHelper$$ExternalSyntheticLambda1;
    private final View setNavigationOnClickListener;
    private setStripEnabled setX;
    private setStripEnabled setY;
    private int setIconTintList = -1;
    private final setSelectionFromTop MenuHostHelper$$ExternalSyntheticLambda0 = setSelectionFromTop.setIconTintList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public setChipTextResource(View view) {
        this.setNavigationOnClickListener = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setY(AttributeSet attributeSet, int i) {
        setExpandedHintEnabled MenuHostHelper$$ExternalSyntheticLambda0 = setExpandedHintEnabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setNavigationOnClickListener.getContext(), attributeSet, setAnimationFromJson.setY.setOnGroupExpandListener, i, 0);
        View view = this.setNavigationOnClickListener;
        setBaselineAlignBottom.setY(view, view.getContext(), setAnimationFromJson.setY.setOnGroupExpandListener, attributeSet, MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(), i, 0);
        try {
            if (MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(setAnimationFromJson.setY.setErrorAccessibilityLabel)) {
                this.setIconTintList = MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener(setAnimationFromJson.setY.setErrorAccessibilityLabel, -1);
                ColorStateList iconTintList = this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(this.setNavigationOnClickListener.getContext(), this.setIconTintList);
                if (iconTintList != null) {
                    MenuHostHelper$$ExternalSyntheticLambda1(iconTintList);
                }
            }
            if (MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(setAnimationFromJson.setY.FirebasePerfKtxRegistrar)) {
                View view2 = this.setNavigationOnClickListener;
                int i2 = setAnimationFromJson.setY.FirebasePerfKtxRegistrar;
                setBaselineAlignBottom.setY(view2, MenuHostHelper$$ExternalSyntheticLambda0.setY(1));
            }
            if (MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(setAnimationFromJson.setY.setExtendMotionSpec)) {
                View view3 = this.setNavigationOnClickListener;
                int i3 = setAnimationFromJson.setY.setExtendMotionSpec;
                setBaselineAlignBottom.setX(view3, setCheckMarkDrawable.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(2, -1), null));
            }
        } finally {
            MenuHostHelper$$ExternalSyntheticLambda0.setX();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIconTintList(int i) {
        this.setIconTintList = i;
        setSelectionFromTop setselectionfromtop = this.MenuHostHelper$$ExternalSyntheticLambda0;
        MenuHostHelper$$ExternalSyntheticLambda1(setselectionfromtop != null ? setselectionfromtop.setIconTintList(this.setNavigationOnClickListener.getContext(), i) : null);
        setX();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setY(Drawable drawable) {
        this.setIconTintList = -1;
        MenuHostHelper$$ExternalSyntheticLambda1((ColorStateList) null);
        setX();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda0(ColorStateList colorStateList) {
        if (this.setY == null) {
            this.setY = new setStripEnabled();
        }
        this.setY.setIconTintList = colorStateList;
        this.setY.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        setX();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList MenuHostHelper$$ExternalSyntheticLambda1() {
        setStripEnabled setstripenabled = this.setY;
        if (setstripenabled != null) {
            return setstripenabled.setIconTintList;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setY(PorterDuff.Mode mode) {
        if (this.setY == null) {
            this.setY = new setStripEnabled();
        }
        this.setY.setX = mode;
        this.setY.setY = true;
        setX();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode MenuHostHelper$$ExternalSyntheticLambda0() {
        setStripEnabled setstripenabled = this.setY;
        if (setstripenabled != null) {
            return setstripenabled.setX;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setX() {
        Drawable background = this.setNavigationOnClickListener.getBackground();
        if (background != null) {
            if (setY() && MenuHostHelper$$ExternalSyntheticLambda1(background)) {
                return;
            }
            setStripEnabled setstripenabled = this.setY;
            if (setstripenabled != null) {
                setSelectionFromTop.setY(background, setstripenabled, this.setNavigationOnClickListener.getDrawableState());
                return;
            }
            setStripEnabled setstripenabled2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setstripenabled2 != null) {
                setSelectionFromTop.setY(background, setstripenabled2, this.setNavigationOnClickListener.getDrawableState());
            }
        }
    }

    void MenuHostHelper$$ExternalSyntheticLambda1(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = new setStripEnabled();
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList = colorStateList;
            this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        }
        setX();
    }

    private boolean setY() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.MenuHostHelper$$ExternalSyntheticLambda1 != null : i == 21;
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1(Drawable drawable) {
        if (this.setX == null) {
            this.setX = new setStripEnabled();
        }
        setStripEnabled setstripenabled = this.setX;
        setstripenabled.setIconTintList = null;
        setstripenabled.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        setstripenabled.setX = null;
        setstripenabled.setY = false;
        ColorStateList layoutAnimation = setBaselineAlignBottom.setLayoutAnimation(this.setNavigationOnClickListener);
        if (layoutAnimation != null) {
            setstripenabled.MenuHostHelper$$ExternalSyntheticLambda0 = true;
            setstripenabled.setIconTintList = layoutAnimation;
        }
        PorterDuff.Mode navigationOnClickListener = setBaselineAlignBottom.setNavigationOnClickListener(this.setNavigationOnClickListener);
        if (navigationOnClickListener != null) {
            setstripenabled.setY = true;
            setstripenabled.setX = navigationOnClickListener;
        }
        if (setstripenabled.MenuHostHelper$$ExternalSyntheticLambda0 || setstripenabled.setY) {
            setSelectionFromTop.setY(drawable, setstripenabled, this.setNavigationOnClickListener.getDrawableState());
            return true;
        }
        return false;
    }
}