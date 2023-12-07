package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setTextAppearanceActive extends AbstractC0201h {
    private final View.OnFocusChangeListener MenuHostHelper$$ExternalSyntheticLambda0;
    private ValueAnimator MenuHostHelper$$ExternalSyntheticLambda1;
    EditText setIconTintList;
    private final View.OnClickListener setX;
    private AnimatorSet setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
        return R.drawable.res_0x7f0800c0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final int setX() {
        return R.string.res_0x7f14002c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setTextAppearanceActive(C0174g c0174g) {
        super(c0174g);
        this.setX = new View.OnClickListener() { // from class: o.setTransitionListener
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setTextAppearanceActive settextappearanceactive = setTextAppearanceActive.this;
                EditText editText = settextappearanceactive.setIconTintList;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    settextappearanceactive.setUiOptions.setX(false);
                }
            }
        };
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new View.OnFocusChangeListener() { // from class: o.setTextLocales
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                setTextAppearanceActive settextappearanceactive = setTextAppearanceActive.this;
                settextappearanceactive.MenuHostHelper$$ExternalSyntheticLambda0(settextappearanceactive.MenuHostHelper$$ExternalSyntheticLambda0());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final void setUiOptions() {
        EditText editText = this.setIconTintList;
        if (editText != null) {
            editText.post(new Runnable() { // from class: o.setShapeAppearanceModel
                @Override // java.lang.Runnable
                public final void run() {
                    setTextAppearanceActive.this.MenuHostHelper$$ExternalSyntheticLambda0(true);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        if (this.setUiOptions.setOnNavigationItemSelectedListener == null) {
            return;
        }
        MenuHostHelper$$ExternalSyntheticLambda0(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final View.OnClickListener setNavigationOnClickListener() {
        return this.setX;
    }

    @Override // o.AbstractC0201h
    public final void setIconTintList(EditText editText) {
        this.setIconTintList = editText;
        this.setChipCornerRadius.setEndIconVisible(MenuHostHelper$$ExternalSyntheticLambda0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final void setIconTintList() {
        if (this.setUiOptions.setOnNavigationItemSelectedListener != null) {
            return;
        }
        MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final View.OnFocusChangeListener setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final View.OnFocusChangeListener setOnLongClickListener() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        C0174g c0174g = this.setUiOptions;
        boolean z2 = (c0174g.setY.getVisibility() == 0 && c0174g.setOnLongClickListener.getVisibility() == 0) == z;
        if (z && !this.setY.isRunning()) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.cancel();
            this.setY.start();
            if (z2) {
                this.setY.end();
            }
        } else if (z) {
        } else {
            this.setY.cancel();
            this.MenuHostHelper$$ExternalSyntheticLambda1.start();
            if (z2) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.end();
            }
        }
    }

    private ValueAnimator setIconTintList(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(setCardElevation.setY);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.setInternalOnCheckedChangeListener
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                setTextAppearanceActive settextappearanceactive = setTextAppearanceActive.this;
                settextappearanceactive.setLayoutAnimation.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        EditText editText = this.setIconTintList;
        return editText != null && (editText.hasFocus() || this.setLayoutAnimation.hasFocus()) && this.setIconTintList.getText().length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final void setUnboundedRipple() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(setCardElevation.MenuHostHelper$$ExternalSyntheticLambda1);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.setStatusBarScrimResource
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                setTextAppearanceActive settextappearanceactive = setTextAppearanceActive.this;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                settextappearanceactive.setLayoutAnimation.setScaleX(floatValue);
                settextappearanceactive.setLayoutAnimation.setScaleY(floatValue);
            }
        });
        ValueAnimator iconTintList = setIconTintList(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.setY = animatorSet;
        animatorSet.playTogether(ofFloat, iconTintList);
        this.setY.addListener(new AnimatorListenerAdapter() { // from class: o.setTextAppearanceActive.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                setTextAppearanceActive.this.setUiOptions.setY(true);
            }
        });
        ValueAnimator iconTintList2 = setIconTintList(1.0f, 0.0f);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = iconTintList2;
        iconTintList2.addListener(new AnimatorListenerAdapter() { // from class: o.setTextAppearanceActive.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                setTextAppearanceActive.this.setUiOptions.setY(false);
            }
        });
    }
}