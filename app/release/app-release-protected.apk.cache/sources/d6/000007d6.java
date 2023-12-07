package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class onActivityPreCreated extends AbstractC0201h {
    private static final boolean setIconSize = true;
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    AutoCompleteTextView MenuHostHelper$$ExternalSyntheticLambda1;
    private AccessibilityManager ViewPager$SavedState$1;
    private final View.OnFocusChangeListener setCenterIfNoTextEnabled;
    long setIconTintList;
    private final setCloseIconEnabledResource$MenuHostHelper$$ExternalSyntheticLambda1 setMaxEms;
    ValueAnimator setOnLongClickListener;
    private final View.OnClickListener setTextAlignment;
    boolean setUnboundedRipple;
    boolean setX;
    ValueAnimator setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final boolean ViewPager$SavedState$1() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final boolean setCenterIfNoTextEnabled() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final boolean setChipCornerRadius() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final int setX() {
        return R.string.res_0x7f140034;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public onActivityPreCreated(C0174g c0174g) {
        super(c0174g);
        this.setTextAlignment = new View.OnClickListener() { // from class: o.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onActivityPreCreated.this.MenuHostHelper$$ExternalSyntheticLambda0();
            }
        };
        this.setCenterIfNoTextEnabled = new View.OnFocusChangeListener() { // from class: o.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                onActivityPreCreated onactivityprecreated = onActivityPreCreated.this;
                onactivityprecreated.setX = z;
                onactivityprecreated.setUiOptions.setX(false);
                if (z) {
                    return;
                }
                if (onactivityprecreated.setUnboundedRipple) {
                    onactivityprecreated.setUnboundedRipple = false;
                    onactivityprecreated.setY.cancel();
                    onactivityprecreated.setOnLongClickListener.start();
                }
                onactivityprecreated.MenuHostHelper$$ExternalSyntheticLambda0 = false;
            }
        };
        this.setMaxEms = new setCloseIconEnabledResource$MenuHostHelper$$ExternalSyntheticLambda1() { // from class: o.c
            @Override // o.setCloseIconEnabledResource$MenuHostHelper$$ExternalSyntheticLambda1
            public final void setY(boolean z) {
                onActivityPreCreated onactivityprecreated = onActivityPreCreated.this;
                AutoCompleteTextView autoCompleteTextView = onactivityprecreated.MenuHostHelper$$ExternalSyntheticLambda1;
                if (autoCompleteTextView != null) {
                    if (autoCompleteTextView.getInputType() != 0) {
                        return;
                    }
                    setBaselineAlignBottom.setUnboundedRipple(onactivityprecreated.setLayoutAnimation, z ? 2 : 1);
                }
            }
        };
        this.setIconTintList = Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final void setUnboundedRipple() {
        this.setY = MenuHostHelper$$ExternalSyntheticLambda1(67, 0.0f, 1.0f);
        ValueAnimator MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(50, 1.0f, 0.0f);
        this.setOnLongClickListener = MenuHostHelper$$ExternalSyntheticLambda1;
        MenuHostHelper$$ExternalSyntheticLambda1.addListener(new AnimatorListenerAdapter() { // from class: o.onActivityPreCreated.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                onActivityPreCreated.this.setUiOptions.setX(false);
                onActivityPreCreated.this.setY.start();
            }
        });
        this.ViewPager$SavedState$1 = (AccessibilityManager) this.setNavigationOnClickListener.getSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final void setUiOptions() {
        AutoCompleteTextView autoCompleteTextView = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (setIconSize) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.setOnDismissListener(null);
            }
        }
    }

    @Override // o.AbstractC0201h
    public final setCloseIconEnabledResource$MenuHostHelper$$ExternalSyntheticLambda1 setLayoutAnimation() {
        return this.setMaxEms;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
        return setIconSize ? R.drawable.res_0x7f0800bd : R.drawable.res_0x7f0800be;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final boolean setTextAlignment() {
        return this.setUnboundedRipple;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final boolean setIconSize() {
        return this.setX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final View.OnClickListener setNavigationOnClickListener() {
        return this.setTextAlignment;
    }

    @Override // o.AbstractC0201h
    public final void setIconTintList() {
        if (this.ViewPager$SavedState$1.isTouchExplorationEnabled()) {
            if ((this.MenuHostHelper$$ExternalSyntheticLambda1.getInputType() != 0) && !this.setLayoutAnimation.hasFocus()) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.dismissDropDown();
            }
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.post(new Runnable() { // from class: o.d
            @Override // java.lang.Runnable
            public final void run() {
                onActivityPreCreated onactivityprecreated = onActivityPreCreated.this;
                boolean isPopupShowing = onactivityprecreated.MenuHostHelper$$ExternalSyntheticLambda1.isPopupShowing();
                if (onactivityprecreated.setUnboundedRipple != isPopupShowing) {
                    onactivityprecreated.setUnboundedRipple = isPopupShowing;
                    onactivityprecreated.setY.cancel();
                    onactivityprecreated.setOnLongClickListener.start();
                }
                onactivityprecreated.MenuHostHelper$$ExternalSyntheticLambda0 = isPopupShowing;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final View.OnFocusChangeListener setY() {
        return this.setCenterIfNoTextEnabled;
    }

    @Override // o.AbstractC0201h
    public final void setX(setDecorPadding setdecorpadding) {
        if (!(this.MenuHostHelper$$ExternalSyntheticLambda1.getInputType() != 0)) {
            setdecorpadding.setIconTintList(Spinner.class.getName());
        }
        if (setdecorpadding.setTextAppearanceResource()) {
            setdecorpadding.setY((CharSequence) null);
        }
    }

    @Override // o.AbstractC0201h
    public final void setY(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 1 && this.ViewPager$SavedState$1.isEnabled()) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1.getInputType() != 0) {
                return;
            }
            MenuHostHelper$$ExternalSyntheticLambda0();
            this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
            this.setIconTintList = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.setIconTintList;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        }
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
            if (setIconSize) {
                boolean z = this.setUnboundedRipple;
                boolean z2 = !z;
                if (z != z2) {
                    this.setUnboundedRipple = z2;
                    this.setY.cancel();
                    this.setOnLongClickListener.start();
                }
            } else {
                this.setUnboundedRipple = !this.setUnboundedRipple;
                setOnNavigationItemSelectedListener();
            }
            if (this.setUnboundedRipple) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.requestFocus();
                this.MenuHostHelper$$ExternalSyntheticLambda1.showDropDown();
                return;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1.dismissDropDown();
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
    }

    private ValueAnimator MenuHostHelper$$ExternalSyntheticLambda1(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(setCardElevation.setY);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.setOnSuggestionListener
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                onActivityPreCreated onactivityprecreated = onActivityPreCreated.this;
                onactivityprecreated.setLayoutAnimation.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    @Override // o.AbstractC0201h
    public final void setIconTintList(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: o.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                onActivityPreCreated onactivityprecreated = onActivityPreCreated.this;
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - onactivityprecreated.setIconTintList;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        onactivityprecreated.MenuHostHelper$$ExternalSyntheticLambda0 = false;
                    }
                    onactivityprecreated.MenuHostHelper$$ExternalSyntheticLambda0();
                    onactivityprecreated.MenuHostHelper$$ExternalSyntheticLambda0 = true;
                    onactivityprecreated.setIconTintList = System.currentTimeMillis();
                }
                return false;
            }
        });
        if (setIconSize) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: o.e
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    onActivityPreCreated onactivityprecreated = onActivityPreCreated.this;
                    onactivityprecreated.MenuHostHelper$$ExternalSyntheticLambda0 = true;
                    onactivityprecreated.setIconTintList = System.currentTimeMillis();
                    if (onactivityprecreated.setUnboundedRipple) {
                        onactivityprecreated.setUnboundedRipple = false;
                        onactivityprecreated.setY.cancel();
                        onactivityprecreated.setOnLongClickListener.start();
                    }
                }
            });
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.setThreshold(0);
        this.setChipCornerRadius.setErrorIconDrawable((Drawable) null);
        if (!(editText.getInputType() != 0) && this.ViewPager$SavedState$1.isTouchExplorationEnabled()) {
            setBaselineAlignBottom.setUnboundedRipple(this.setLayoutAnimation, 2);
        }
        this.setChipCornerRadius.setEndIconVisible(true);
    }
}