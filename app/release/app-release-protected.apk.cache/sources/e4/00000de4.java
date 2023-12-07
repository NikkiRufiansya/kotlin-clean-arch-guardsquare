package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class setOnCloseIconClickListener extends setBoxCornerRadiiResources {
    private StateListAnimator setConstraintSet;

    @Override // o.setBoxCornerRadiiResources
    final void setCenterIfNoTextEnabled() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setBoxCornerRadiiResources
    public final void setIconTintList() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setBoxCornerRadiiResources
    public final boolean setNavigationOnClickListener() {
        return false;
    }

    public setOnCloseIconClickListener(FloatingActionButton floatingActionButton, getFillColor getfillcolor) {
        super(floatingActionButton, getfillcolor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setBoxCornerRadiiResources
    public final void setY(ColorStateList colorStateList) {
        if (this.setLayoutDirection instanceof RippleDrawable) {
            ((RippleDrawable) this.setLayoutDirection).setColor(setChipText.setY(colorStateList));
        } else {
            super.setY(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setBoxCornerRadiiResources
    public final void MenuHostHelper$$ExternalSyntheticLambda0(float f, float f2, float f3) {
        boolean z = true;
        if (Build.VERSION.SDK_INT == 21) {
            this.FragmentStateAdapter$2.refreshDrawableState();
        } else if (this.FragmentStateAdapter$2.getStateListAnimator() == this.setConstraintSet) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(setUiOptions, setY(f, f3));
            stateListAnimator.addState(setOnLongClickListener, setY(f, f2));
            stateListAnimator.addState(MenuHostHelper$$ExternalSyntheticLambda0, setY(f, f2));
            stateListAnimator.addState(setIconTintList, setY(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.FragmentStateAdapter$2, "elevation", f).setDuration(0L));
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.FragmentStateAdapter$2, View.TRANSLATION_Z, this.FragmentStateAdapter$2.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.FragmentStateAdapter$2, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(setY);
            stateListAnimator.addState(setX, animatorSet);
            stateListAnimator.addState(MenuHostHelper$$ExternalSyntheticLambda1, setY(0.0f, 0.0f));
            this.setConstraintSet = stateListAnimator;
            this.FragmentStateAdapter$2.setStateListAnimator(this.setConstraintSet);
        }
        if (!this.setGuidelinePercent.MenuHostHelper$$ExternalSyntheticLambda1() && ViewPager$SavedState$1()) {
            z = false;
        }
        if (z) {
            setChipCornerRadius();
        }
    }

    private Animator setY(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.FragmentStateAdapter$2, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.FragmentStateAdapter$2, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(setY);
        return animatorSet;
    }

    @Override // o.setBoxCornerRadiiResources
    public final float setY() {
        return this.FragmentStateAdapter$2.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setBoxCornerRadiiResources
    public final void setUiOptions() {
        setChipCornerRadius();
    }

    @Override // o.setBoxCornerRadiiResources
    final boolean setLayoutAnimation() {
        return this.setGuidelinePercent.MenuHostHelper$$ExternalSyntheticLambda1() || !ViewPager$SavedState$1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setBoxCornerRadiiResources
    public final void setY(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.FragmentStateAdapter$2.isEnabled()) {
                this.FragmentStateAdapter$2.setElevation(this.setCenterIfNoTextEnabled);
                if (this.FragmentStateAdapter$2.isPressed()) {
                    this.FragmentStateAdapter$2.setTranslationZ(this.setTextAppearanceResource);
                    return;
                } else if (this.FragmentStateAdapter$2.isFocused() || this.FragmentStateAdapter$2.isHovered()) {
                    this.FragmentStateAdapter$2.setTranslationZ(this.setOnNavigationItemSelectedListener);
                    return;
                } else {
                    this.FragmentStateAdapter$2.setTranslationZ(0.0f);
                    return;
                }
            }
            this.FragmentStateAdapter$2.setElevation(0.0f);
            this.FragmentStateAdapter$2.setTranslationZ(0.0f);
        }
    }

    @Override // o.setBoxCornerRadiiResources
    final setWebViewClient MenuHostHelper$$ExternalSyntheticLambda0() {
        return new setOnCloseIconClickListener$MenuHostHelper$$ExternalSyntheticLambda0(this.setHasDecor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setBoxCornerRadiiResources
    public final void MenuHostHelper$$ExternalSyntheticLambda0(Rect rect) {
        if (this.setGuidelinePercent.MenuHostHelper$$ExternalSyntheticLambda1()) {
            super.MenuHostHelper$$ExternalSyntheticLambda0(rect);
        } else if (!ViewPager$SavedState$1()) {
            int i = this.setAnimationFromJson;
            FloatingActionButton floatingActionButton = this.FragmentStateAdapter$2;
            int iconTintList = (i - floatingActionButton.setIconTintList(floatingActionButton.setUnboundedRipple)) / 2;
            rect.set(iconTintList, iconTintList, iconTintList, iconTintList);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setBoxCornerRadiiResources
    public final void setX(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        this.setIconified = new setOnCloseIconClickListener$MenuHostHelper$$ExternalSyntheticLambda0(this.setHasDecor);
        this.setIconified.setTintList(colorStateList);
        if (mode != null) {
            this.setIconified.setTintMode(mode);
        }
        this.setIconified.setX(this.FragmentStateAdapter$2.getContext());
        if (i <= 0) {
            this.setUnboundedRipple = null;
            drawable = this.setIconified;
        } else {
            Context context = this.FragmentStateAdapter$2.getContext();
            setContextClickable setcontextclickable = new setContextClickable(this.setHasDecor);
            int y = setLineHeight.setY(context, R.color.res_0x7f060055);
            int y2 = setLineHeight.setY(context, R.color.res_0x7f060054);
            int y3 = setLineHeight.setY(context, R.color.res_0x7f060052);
            int y4 = setLineHeight.setY(context, R.color.res_0x7f060053);
            setcontextclickable.setNavigationOnClickListener = y;
            setcontextclickable.setUiOptions = y2;
            setcontextclickable.MenuHostHelper$$ExternalSyntheticLambda1 = y3;
            setcontextclickable.setY = y4;
            float f = i;
            if (setcontextclickable.setX != f) {
                setcontextclickable.setX = f;
                setcontextclickable.MenuHostHelper$$ExternalSyntheticLambda0.setStrokeWidth(f * 1.3333f);
                setcontextclickable.setIconTintList = true;
                setcontextclickable.invalidateSelf();
            }
            setcontextclickable.setIconTintList(colorStateList);
            this.setUnboundedRipple = setcontextclickable;
            drawable = new LayerDrawable(new Drawable[]{this.setUnboundedRipple, this.setIconified});
        }
        this.setLayoutDirection = new RippleDrawable(setChipText.setY(colorStateList2), drawable, null);
        this.setLayoutAnimation = this.setLayoutDirection;
    }
}