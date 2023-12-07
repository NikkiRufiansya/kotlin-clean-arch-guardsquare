package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
import o.setBaselineAlignBottom;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setRadius extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUnboundedRipple implements WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setIconSize {
    private static final int[] setMaxEms = {16842919};
    private static final int[] setOnNavigationItemSelectedListener = new int[0];
    private final int FragmentStateAdapter$5;
    int MenuHostHelper$$ExternalSyntheticLambda0;
    private final int SearchView$SavedState$1;
    int ViewPager$SavedState$1;
    private final Runnable setAnimationFromJson;
    private final Drawable setCheckedIconEnabled;
    final Drawable setChipCornerRadius;
    private final WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCenterIfNoTextEnabled setChipIconTintResource;
    private final int setGuidelinePercent;
    private float setHasDecor;
    int setIconSize;
    int setIconTintList;
    private final int setIconified;
    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 setLayoutAnimation;
    private final StateListDrawable setLayoutDirection;
    private final int setMinAndMaxProgress;
    final int setNavigationOnClickListener;
    final StateListDrawable setTextAlignment;
    final ValueAnimator setUiOptions;
    int setY;
    private float setZ;
    int setOnLongClickListener = 0;
    int setUnboundedRipple = 0;
    boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;
    boolean setX = false;
    int setCenterIfNoTextEnabled = 0;
    private int setTextScaleX = 0;
    private final int[] ExtendableSavedState$1 = new int[2];
    private final int[] setTextAppearanceResource = new int[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    public setRadius(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.setUiOptions = ofFloat;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        this.setAnimationFromJson = new Runnable() { // from class: o.setRadius.1
            @Override // java.lang.Runnable
            public final void run() {
                setRadius setradius = setRadius.this;
                int i4 = setradius.MenuHostHelper$$ExternalSyntheticLambda0;
                if (i4 == 1) {
                    setradius.setUiOptions.cancel();
                } else if (i4 != 2) {
                    return;
                }
                setradius.MenuHostHelper$$ExternalSyntheticLambda0 = 3;
                ValueAnimator valueAnimator = setradius.setUiOptions;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                setradius.setUiOptions.setDuration(500L);
                setradius.setUiOptions.start();
            }
        };
        this.setChipIconTintResource = new WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCenterIfNoTextEnabled() { // from class: o.setRadius.4
            @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCenterIfNoTextEnabled
            public final void setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02, int i4, int i5) {
                setRadius setradius = setRadius.this;
                int computeHorizontalScrollOffset = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.computeVerticalScrollOffset();
                int computeVerticalScrollRange = setradius.setLayoutAnimation.computeVerticalScrollRange();
                int i6 = setradius.setUnboundedRipple;
                setradius.MenuHostHelper$$ExternalSyntheticLambda1 = computeVerticalScrollRange - i6 > 0 && i6 >= setradius.setNavigationOnClickListener;
                int computeHorizontalScrollRange = setradius.setLayoutAnimation.computeHorizontalScrollRange();
                int i7 = setradius.setOnLongClickListener;
                boolean z = computeHorizontalScrollRange - i7 > 0 && i7 >= setradius.setNavigationOnClickListener;
                setradius.setX = z;
                boolean z2 = setradius.MenuHostHelper$$ExternalSyntheticLambda1;
                if (!z2 && !z) {
                    if (setradius.setCenterIfNoTextEnabled != 0) {
                        setradius.setX(0);
                        return;
                    }
                    return;
                }
                if (z2) {
                    float f = i6;
                    setradius.setIconSize = (int) ((f * (computeVerticalScrollOffset + (f / 2.0f))) / computeVerticalScrollRange);
                    setradius.ViewPager$SavedState$1 = Math.min(i6, (i6 * i6) / computeVerticalScrollRange);
                }
                if (setradius.setX) {
                    float f2 = computeHorizontalScrollOffset;
                    float f3 = i7;
                    setradius.setY = (int) ((f3 * (f2 + (f3 / 2.0f))) / computeHorizontalScrollRange);
                    setradius.setIconTintList = Math.min(i7, (i7 * i7) / computeHorizontalScrollRange);
                }
                int i8 = setradius.setCenterIfNoTextEnabled;
                if (i8 == 0 || i8 == 1) {
                    setradius.setX(1);
                }
            }
        };
        this.setTextAlignment = stateListDrawable;
        this.setChipCornerRadius = drawable;
        this.setLayoutDirection = stateListDrawable2;
        this.setCheckedIconEnabled = drawable2;
        this.SearchView$SavedState$1 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.FragmentStateAdapter$5 = Math.max(i, drawable.getIntrinsicWidth());
        this.setGuidelinePercent = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.setMinAndMaxProgress = Math.max(i, drawable2.getIntrinsicWidth());
        this.setNavigationOnClickListener = i2;
        this.setIconified = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: o.setRadius$MenuHostHelper$$ExternalSyntheticLambda0
            private boolean setY = false;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (this.setY) {
                    this.setY = false;
                } else if (((Float) setRadius.this.setUiOptions.getAnimatedValue()).floatValue() == 0.0f) {
                    setRadius.this.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
                    setRadius.this.setX(0);
                } else {
                    setRadius.this.MenuHostHelper$$ExternalSyntheticLambda0 = 2;
                    setRadius.this.setLayoutAnimation.invalidate();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                this.setY = true;
            }
        });
        ofFloat.addUpdateListener(new setIconTintList());
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = this.setLayoutAnimation;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 != windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) {
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 != null) {
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setGuidelinePercent;
                if (setuioptions != null) {
                    setuioptions.MenuHostHelper$$ExternalSyntheticLambda1("Cannot remove item decoration during a scroll  or layout");
                }
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setOnNavigationItemSelectedListener.remove(this);
                if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setOnNavigationItemSelectedListener.isEmpty()) {
                    windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setWillNotDraw(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.getOverScrollMode() == 2);
                }
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setUnboundedRipple();
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.requestLayout();
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03 = this.setLayoutAnimation;
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.setHasDecor.remove(this);
                if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.setChipCornerRadius == this) {
                    windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.setChipCornerRadius = null;
                }
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04 = this.setLayoutAnimation;
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCenterIfNoTextEnabled setcenterifnotextenabled = this.setChipIconTintResource;
                List<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCenterIfNoTextEnabled> list = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04.setSuffixText;
                if (list != null) {
                    list.remove(setcenterifnotextenabled);
                }
                this.setLayoutAnimation.removeCallbacks(this.setAnimationFromJson);
            }
            this.setLayoutAnimation = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setIconTintList(this);
            this.setLayoutAnimation.setHasDecor.add(this);
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline05 = this.setLayoutAnimation;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCenterIfNoTextEnabled setcenterifnotextenabled2 = this.setChipIconTintResource;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline05.setSuffixText == null) {
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline05.setSuffixText = new ArrayList();
            }
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline05.setSuffixText.add(setcenterifnotextenabled2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(int i) {
        if (i == 2 && this.setCenterIfNoTextEnabled != 2) {
            this.setTextAlignment.setState(setMaxEms);
            this.setLayoutAnimation.removeCallbacks(this.setAnimationFromJson);
        }
        if (i != 0) {
            setX();
        } else {
            this.setLayoutAnimation.invalidate();
        }
        if (this.setCenterIfNoTextEnabled == 2 && i != 2) {
            this.setTextAlignment.setState(setOnNavigationItemSelectedListener);
            this.setLayoutAnimation.removeCallbacks(this.setAnimationFromJson);
            this.setLayoutAnimation.postDelayed(this.setAnimationFromJson, 1200L);
        } else if (i == 1) {
            this.setLayoutAnimation.removeCallbacks(this.setAnimationFromJson);
            this.setLayoutAnimation.postDelayed(this.setAnimationFromJson, 1500L);
        }
        this.setCenterIfNoTextEnabled = i;
    }

    private void setX() {
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            this.setUiOptions.cancel();
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 1;
        ValueAnimator valueAnimator = this.setUiOptions;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.setUiOptions.setDuration(500L);
        this.setUiOptions.setStartDelay(0L);
        this.setUiOptions.start();
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUnboundedRipple
    public final void setY(Canvas canvas) {
        int x;
        if (this.setOnLongClickListener != this.setLayoutAnimation.getWidth() || this.setUnboundedRipple != this.setLayoutAnimation.getHeight()) {
            this.setOnLongClickListener = this.setLayoutAnimation.getWidth();
            this.setUnboundedRipple = this.setLayoutAnimation.getHeight();
            setX(0);
        } else if (this.MenuHostHelper$$ExternalSyntheticLambda0 != 0) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                int i = this.setOnLongClickListener;
                int i2 = this.SearchView$SavedState$1;
                int i3 = i - i2;
                int i4 = this.setIconSize;
                int i5 = this.ViewPager$SavedState$1;
                int i6 = i4 - (i5 / 2);
                this.setTextAlignment.setBounds(0, 0, i2, i5);
                this.setChipCornerRadius.setBounds(0, 0, this.FragmentStateAdapter$5, this.setUnboundedRipple);
                x = setBaselineAlignBottom.setX.setX(this.setLayoutAnimation);
                if (x == 1) {
                    this.setChipCornerRadius.draw(canvas);
                    canvas.translate(this.SearchView$SavedState$1, i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.setTextAlignment.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-this.SearchView$SavedState$1, -i6);
                } else {
                    canvas.translate(i3, 0.0f);
                    this.setChipCornerRadius.draw(canvas);
                    canvas.translate(0.0f, i6);
                    this.setTextAlignment.draw(canvas);
                    canvas.translate(-i3, -i6);
                }
            }
            if (this.setX) {
                int i7 = this.setUnboundedRipple;
                int i8 = this.setGuidelinePercent;
                int i9 = i7 - i8;
                int i10 = this.setY;
                int i11 = this.setIconTintList;
                int i12 = i10 - (i11 / 2);
                this.setLayoutDirection.setBounds(0, 0, i11, i8);
                this.setCheckedIconEnabled.setBounds(0, 0, this.setOnLongClickListener, this.setMinAndMaxProgress);
                canvas.translate(0.0f, i9);
                this.setCheckedIconEnabled.draw(canvas);
                canvas.translate(i12, 0.0f);
                this.setLayoutDirection.draw(canvas);
                canvas.translate(-i12, -i9);
            }
        }
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setIconSize
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(MotionEvent motionEvent) {
        int i = this.setCenterIfNoTextEnabled;
        if (i == 1) {
            boolean x = setX(motionEvent.getX(), motionEvent.getY());
            boolean MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!x && !MenuHostHelper$$ExternalSyntheticLambda1) {
                return false;
            }
            if (MenuHostHelper$$ExternalSyntheticLambda1) {
                this.setTextScaleX = 1;
                this.setZ = (int) motionEvent.getX();
            } else if (x) {
                this.setTextScaleX = 2;
                this.setHasDecor = (int) motionEvent.getY();
            }
            setX(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setIconSize
    public final void setIconTintList(MotionEvent motionEvent) {
        if (this.setCenterIfNoTextEnabled == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean x = setX(motionEvent.getX(), motionEvent.getY());
            boolean MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(motionEvent.getX(), motionEvent.getY());
            if (x || MenuHostHelper$$ExternalSyntheticLambda1) {
                if (MenuHostHelper$$ExternalSyntheticLambda1) {
                    this.setTextScaleX = 1;
                    this.setZ = (int) motionEvent.getX();
                } else if (x) {
                    this.setTextScaleX = 2;
                    this.setHasDecor = (int) motionEvent.getY();
                }
                setX(2);
            }
        } else if (motionEvent.getAction() == 1 && this.setCenterIfNoTextEnabled == 2) {
            this.setHasDecor = 0.0f;
            this.setZ = 0.0f;
            setX(1);
            this.setTextScaleX = 0;
        } else if (motionEvent.getAction() == 2 && this.setCenterIfNoTextEnabled == 2) {
            setX();
            if (this.setTextScaleX == 1) {
                float x2 = motionEvent.getX();
                int[] iArr = this.setTextAppearanceResource;
                int i = this.setIconified;
                iArr[0] = i;
                iArr[1] = this.setOnLongClickListener - i;
                float max = Math.max(iArr[0], Math.min(iArr[1], x2));
                if (Math.abs(this.setY - max) >= 2.0f) {
                    int iconTintList = setIconTintList(this.setZ, max, iArr, this.setLayoutAnimation.computeHorizontalScrollRange(), this.setLayoutAnimation.computeHorizontalScrollOffset(), this.setOnLongClickListener);
                    if (iconTintList != 0) {
                        this.setLayoutAnimation.scrollBy(iconTintList, 0);
                    }
                    this.setZ = max;
                }
            }
            if (this.setTextScaleX == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.ExtendableSavedState$1;
                int i2 = this.setIconified;
                iArr2[0] = i2;
                iArr2[1] = this.setUnboundedRipple - i2;
                float max2 = Math.max(iArr2[0], Math.min(iArr2[1], y));
                if (Math.abs(this.setIconSize - max2) >= 2.0f) {
                    int iconTintList2 = setIconTintList(this.setHasDecor, max2, iArr2, this.setLayoutAnimation.computeVerticalScrollRange(), this.setLayoutAnimation.computeVerticalScrollOffset(), this.setUnboundedRipple);
                    if (iconTintList2 != 0) {
                        this.setLayoutAnimation.scrollBy(0, iconTintList2);
                    }
                    this.setHasDecor = max2;
                }
            }
        }
    }

    private static int setIconTintList(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1(float f, float f2) {
        if (f2 >= this.setUnboundedRipple - this.setGuidelinePercent) {
            int i = this.setY;
            int i2 = this.setIconTintList / 2;
            if (f >= i - i2 && f <= i + i2) {
                return true;
            }
        }
        return false;
    }

    /* loaded from: classes.dex */
    class setIconTintList implements ValueAnimator.AnimatorUpdateListener {
        setIconTintList() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            setRadius.this.setTextAlignment.setAlpha(floatValue);
            setRadius.this.setChipCornerRadius.setAlpha(floatValue);
            setRadius.this.setLayoutAnimation.invalidate();
        }
    }

    private boolean setX(float f, float f2) {
        int x;
        x = setBaselineAlignBottom.setX.setX(this.setLayoutAnimation);
        if (x == 1) {
            if (f > this.SearchView$SavedState$1 / 2) {
                return false;
            }
        } else if (f < this.setOnLongClickListener - this.SearchView$SavedState$1) {
            return false;
        }
        int i = this.setIconSize;
        int i2 = this.ViewPager$SavedState$1 / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i + i2));
    }
}