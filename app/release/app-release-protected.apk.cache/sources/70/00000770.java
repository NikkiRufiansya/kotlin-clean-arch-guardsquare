package o;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.Checkable;

/* renamed from: o.nh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0320nh extends View implements Checkable {
    private static final int MenuHostHelper$$ExternalSyntheticLambda0 = (int) TypedValue.applyDimension(1, 58.0f, Resources.getSystem().getDisplayMetrics());
    private static final int setIconTintList = (int) TypedValue.applyDimension(1, 36.0f, Resources.getSystem().getDisplayMetrics());
    private int ExtendableSavedState$1;
    private float FirebaseRemoteConfigKtxRegistrar;
    private boolean FloatingActionButton$BaseBehavior;
    private float Fragment$5;
    private boolean FragmentStateAdapter$2;
    private boolean FragmentStateAdapter$5;
    private final int MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean RecyclerView$SavedState$1;
    private boolean SearchView$SavedState$1;
    private nh$MenuHostHelper$$ExternalSyntheticLambda1 ViewPager$SavedState$1;
    private nh$MenuHostHelper$$ExternalSyntheticLambda1 createDispatcher;
    private float getCallingPid;
    private int onActivityResumed;
    private setY setAdapter;
    private float setAnimationFromJson;
    private int setCenterIfNoTextEnabled;
    private int setCheckedIconEnabled;
    private Animator.AnimatorListener setChipCornerRadius;
    private int setChipIconEnabled;
    private float setChipIconTintResource;
    private float setChipSpacingVertical;
    private boolean setConstraintSet;
    private float setContentScrimResource;
    private int setError;
    private ValueAnimator setFilterRedundantCalls;
    private float setFilterTouchesWhenObscured;
    private float setFloatValues;
    private float setGuidelinePercent;
    private float setHasDecor;
    private int setHint;
    private final ArgbEvaluator setIconSize;
    private int setIconified;
    private int setImageTintMode;
    private final int setLayoutAnimation;
    private float setLayoutDirection;
    private int setMaxEms;
    private float setMinAndMaxProgress;
    private int setNavigationOnClickListener;
    private Runnable setObjectValues;
    private final int setOnLongClickListener;
    private Paint setOnNavigationItemSelectedListener;
    private int setSelectedChildViewEnabled;
    private long setShrinkMotionSpec;
    private RectF setSuffixText;
    private ValueAnimator.AnimatorUpdateListener setTextAlignment;
    private float setTextAppearanceResource;
    private float setTextScaleX;
    private boolean setTitleMarginEnd;
    private float setTooltipText;
    private nh$MenuHostHelper$$ExternalSyntheticLambda1 setUiOptions;
    private final int setUnboundedRipple;
    private Paint setViewTranslationCallback;
    private final int setX;
    private final int setY;
    private float setZ;

    /* renamed from: o.nh$setY */
    /* loaded from: classes.dex */
    public interface setY {
        void MenuHostHelper$$ExternalSyntheticLambda0(C0320nh c0320nh, boolean z);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
    }

    public C0320nh(Context context) {
        super(context);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        this.setY = 1;
        this.setX = 2;
        this.setUnboundedRipple = 3;
        this.setLayoutAnimation = 4;
        this.setOnLongClickListener = 5;
        this.setSuffixText = new RectF();
        this.setNavigationOnClickListener = 0;
        this.setIconSize = new ArgbEvaluator();
        this.FragmentStateAdapter$2 = false;
        this.FloatingActionButton$BaseBehavior = false;
        this.setConstraintSet = false;
        this.setObjectValues = new Runnable() { // from class: o.nh.2
            @Override // java.lang.Runnable
            public final void run() {
                if (C0320nh.setIconTintList(C0320nh.this)) {
                    return;
                }
                C0320nh.setNavigationOnClickListener(C0320nh.this);
            }
        };
        this.setTextAlignment = new ValueAnimator.AnimatorUpdateListener() { // from class: o.nh.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i = C0320nh.this.setNavigationOnClickListener;
                if (i == 1 || i == 3 || i == 4) {
                    C0320nh.this.createDispatcher.setX = ((Integer) C0320nh.this.setIconSize.evaluate(floatValue, Integer.valueOf(C0320nh.this.ViewPager$SavedState$1.setX), Integer.valueOf(C0320nh.this.setUiOptions.setX))).intValue();
                    C0320nh.this.createDispatcher.setY = C0320nh.this.ViewPager$SavedState$1.setY + ((C0320nh.this.setUiOptions.setY - C0320nh.this.ViewPager$SavedState$1.setY) * floatValue);
                    if (C0320nh.this.setNavigationOnClickListener != 1) {
                        C0320nh.this.createDispatcher.MenuHostHelper$$ExternalSyntheticLambda0 = C0320nh.this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 + ((C0320nh.this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0 - C0320nh.this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0) * floatValue);
                    }
                    C0320nh.this.createDispatcher.MenuHostHelper$$ExternalSyntheticLambda1 = ((Integer) C0320nh.this.setIconSize.evaluate(floatValue, Integer.valueOf(C0320nh.this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1), Integer.valueOf(C0320nh.this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1))).intValue();
                } else if (i == 5) {
                    C0320nh.this.createDispatcher.MenuHostHelper$$ExternalSyntheticLambda0 = C0320nh.this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 + ((C0320nh.this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0 - C0320nh.this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0) * floatValue);
                    float f = (C0320nh.this.createDispatcher.MenuHostHelper$$ExternalSyntheticLambda0 - C0320nh.this.setAnimationFromJson) / (C0320nh.this.setZ - C0320nh.this.setAnimationFromJson);
                    C0320nh.this.createDispatcher.MenuHostHelper$$ExternalSyntheticLambda1 = ((Integer) C0320nh.this.setIconSize.evaluate(f, Integer.valueOf(C0320nh.this.setHint), Integer.valueOf(C0320nh.this.ExtendableSavedState$1))).intValue();
                    C0320nh.this.createDispatcher.setY = C0320nh.this.setTooltipText * f;
                    C0320nh.this.createDispatcher.setX = ((Integer) C0320nh.this.setIconSize.evaluate(f, 0, Integer.valueOf(C0320nh.this.setCheckedIconEnabled))).intValue();
                }
                C0320nh.this.postInvalidate();
            }
        };
        this.setChipCornerRadius = new Animator.AnimatorListener() { // from class: o.nh.1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i = C0320nh.this.setNavigationOnClickListener;
                if (i == 1) {
                    C0320nh.this.setNavigationOnClickListener = 2;
                    C0320nh.this.createDispatcher.setX = 0;
                    C0320nh.this.createDispatcher.setY = C0320nh.this.setTooltipText;
                    C0320nh.this.postInvalidate();
                } else if (i == 3) {
                    C0320nh.this.setNavigationOnClickListener = 0;
                    C0320nh.this.postInvalidate();
                } else if (i == 4) {
                    C0320nh.this.setNavigationOnClickListener = 0;
                    C0320nh.this.postInvalidate();
                    C0320nh.setOnLongClickListener(C0320nh.this);
                } else if (i == 5) {
                    C0320nh c0320nh = C0320nh.this;
                    c0320nh.FragmentStateAdapter$5 = true ^ c0320nh.FragmentStateAdapter$5;
                    C0320nh.this.setNavigationOnClickListener = 0;
                    C0320nh.this.postInvalidate();
                    C0320nh.setOnLongClickListener(C0320nh.this);
                }
            }
        };
        setIconTintList(context, null);
    }

    public C0320nh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        this.setY = 1;
        this.setX = 2;
        this.setUnboundedRipple = 3;
        this.setLayoutAnimation = 4;
        this.setOnLongClickListener = 5;
        this.setSuffixText = new RectF();
        this.setNavigationOnClickListener = 0;
        this.setIconSize = new ArgbEvaluator();
        this.FragmentStateAdapter$2 = false;
        this.FloatingActionButton$BaseBehavior = false;
        this.setConstraintSet = false;
        this.setObjectValues = new Runnable() { // from class: o.nh.2
            @Override // java.lang.Runnable
            public final void run() {
                if (C0320nh.setIconTintList(C0320nh.this)) {
                    return;
                }
                C0320nh.setNavigationOnClickListener(C0320nh.this);
            }
        };
        this.setTextAlignment = new ValueAnimator.AnimatorUpdateListener() { // from class: o.nh.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i = C0320nh.this.setNavigationOnClickListener;
                if (i == 1 || i == 3 || i == 4) {
                    C0320nh.this.createDispatcher.setX = ((Integer) C0320nh.this.setIconSize.evaluate(floatValue, Integer.valueOf(C0320nh.this.ViewPager$SavedState$1.setX), Integer.valueOf(C0320nh.this.setUiOptions.setX))).intValue();
                    C0320nh.this.createDispatcher.setY = C0320nh.this.ViewPager$SavedState$1.setY + ((C0320nh.this.setUiOptions.setY - C0320nh.this.ViewPager$SavedState$1.setY) * floatValue);
                    if (C0320nh.this.setNavigationOnClickListener != 1) {
                        C0320nh.this.createDispatcher.MenuHostHelper$$ExternalSyntheticLambda0 = C0320nh.this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 + ((C0320nh.this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0 - C0320nh.this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0) * floatValue);
                    }
                    C0320nh.this.createDispatcher.MenuHostHelper$$ExternalSyntheticLambda1 = ((Integer) C0320nh.this.setIconSize.evaluate(floatValue, Integer.valueOf(C0320nh.this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1), Integer.valueOf(C0320nh.this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1))).intValue();
                } else if (i == 5) {
                    C0320nh.this.createDispatcher.MenuHostHelper$$ExternalSyntheticLambda0 = C0320nh.this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 + ((C0320nh.this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0 - C0320nh.this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0) * floatValue);
                    float f = (C0320nh.this.createDispatcher.MenuHostHelper$$ExternalSyntheticLambda0 - C0320nh.this.setAnimationFromJson) / (C0320nh.this.setZ - C0320nh.this.setAnimationFromJson);
                    C0320nh.this.createDispatcher.MenuHostHelper$$ExternalSyntheticLambda1 = ((Integer) C0320nh.this.setIconSize.evaluate(f, Integer.valueOf(C0320nh.this.setHint), Integer.valueOf(C0320nh.this.ExtendableSavedState$1))).intValue();
                    C0320nh.this.createDispatcher.setY = C0320nh.this.setTooltipText * f;
                    C0320nh.this.createDispatcher.setX = ((Integer) C0320nh.this.setIconSize.evaluate(f, 0, Integer.valueOf(C0320nh.this.setCheckedIconEnabled))).intValue();
                }
                C0320nh.this.postInvalidate();
            }
        };
        this.setChipCornerRadius = new Animator.AnimatorListener() { // from class: o.nh.1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i = C0320nh.this.setNavigationOnClickListener;
                if (i == 1) {
                    C0320nh.this.setNavigationOnClickListener = 2;
                    C0320nh.this.createDispatcher.setX = 0;
                    C0320nh.this.createDispatcher.setY = C0320nh.this.setTooltipText;
                    C0320nh.this.postInvalidate();
                } else if (i == 3) {
                    C0320nh.this.setNavigationOnClickListener = 0;
                    C0320nh.this.postInvalidate();
                } else if (i == 4) {
                    C0320nh.this.setNavigationOnClickListener = 0;
                    C0320nh.this.postInvalidate();
                    C0320nh.setOnLongClickListener(C0320nh.this);
                } else if (i == 5) {
                    C0320nh c0320nh = C0320nh.this;
                    c0320nh.FragmentStateAdapter$5 = true ^ c0320nh.FragmentStateAdapter$5;
                    C0320nh.this.setNavigationOnClickListener = 0;
                    C0320nh.this.postInvalidate();
                    C0320nh.setOnLongClickListener(C0320nh.this);
                }
            }
        };
        setIconTintList(context, attributeSet);
    }

    public C0320nh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        this.setY = 1;
        this.setX = 2;
        this.setUnboundedRipple = 3;
        this.setLayoutAnimation = 4;
        this.setOnLongClickListener = 5;
        this.setSuffixText = new RectF();
        this.setNavigationOnClickListener = 0;
        this.setIconSize = new ArgbEvaluator();
        this.FragmentStateAdapter$2 = false;
        this.FloatingActionButton$BaseBehavior = false;
        this.setConstraintSet = false;
        this.setObjectValues = new Runnable() { // from class: o.nh.2
            @Override // java.lang.Runnable
            public final void run() {
                if (C0320nh.setIconTintList(C0320nh.this)) {
                    return;
                }
                C0320nh.setNavigationOnClickListener(C0320nh.this);
            }
        };
        this.setTextAlignment = new ValueAnimator.AnimatorUpdateListener() { // from class: o.nh.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i2 = C0320nh.this.setNavigationOnClickListener;
                if (i2 == 1 || i2 == 3 || i2 == 4) {
                    C0320nh.this.createDispatcher.setX = ((Integer) C0320nh.this.setIconSize.evaluate(floatValue, Integer.valueOf(C0320nh.this.ViewPager$SavedState$1.setX), Integer.valueOf(C0320nh.this.setUiOptions.setX))).intValue();
                    C0320nh.this.createDispatcher.setY = C0320nh.this.ViewPager$SavedState$1.setY + ((C0320nh.this.setUiOptions.setY - C0320nh.this.ViewPager$SavedState$1.setY) * floatValue);
                    if (C0320nh.this.setNavigationOnClickListener != 1) {
                        C0320nh.this.createDispatcher.MenuHostHelper$$ExternalSyntheticLambda0 = C0320nh.this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 + ((C0320nh.this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0 - C0320nh.this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0) * floatValue);
                    }
                    C0320nh.this.createDispatcher.MenuHostHelper$$ExternalSyntheticLambda1 = ((Integer) C0320nh.this.setIconSize.evaluate(floatValue, Integer.valueOf(C0320nh.this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1), Integer.valueOf(C0320nh.this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1))).intValue();
                } else if (i2 == 5) {
                    C0320nh.this.createDispatcher.MenuHostHelper$$ExternalSyntheticLambda0 = C0320nh.this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 + ((C0320nh.this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0 - C0320nh.this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0) * floatValue);
                    float f = (C0320nh.this.createDispatcher.MenuHostHelper$$ExternalSyntheticLambda0 - C0320nh.this.setAnimationFromJson) / (C0320nh.this.setZ - C0320nh.this.setAnimationFromJson);
                    C0320nh.this.createDispatcher.MenuHostHelper$$ExternalSyntheticLambda1 = ((Integer) C0320nh.this.setIconSize.evaluate(f, Integer.valueOf(C0320nh.this.setHint), Integer.valueOf(C0320nh.this.ExtendableSavedState$1))).intValue();
                    C0320nh.this.createDispatcher.setY = C0320nh.this.setTooltipText * f;
                    C0320nh.this.createDispatcher.setX = ((Integer) C0320nh.this.setIconSize.evaluate(f, 0, Integer.valueOf(C0320nh.this.setCheckedIconEnabled))).intValue();
                }
                C0320nh.this.postInvalidate();
            }
        };
        this.setChipCornerRadius = new Animator.AnimatorListener() { // from class: o.nh.1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i2 = C0320nh.this.setNavigationOnClickListener;
                if (i2 == 1) {
                    C0320nh.this.setNavigationOnClickListener = 2;
                    C0320nh.this.createDispatcher.setX = 0;
                    C0320nh.this.createDispatcher.setY = C0320nh.this.setTooltipText;
                    C0320nh.this.postInvalidate();
                } else if (i2 == 3) {
                    C0320nh.this.setNavigationOnClickListener = 0;
                    C0320nh.this.postInvalidate();
                } else if (i2 == 4) {
                    C0320nh.this.setNavigationOnClickListener = 0;
                    C0320nh.this.postInvalidate();
                    C0320nh.setOnLongClickListener(C0320nh.this);
                } else if (i2 == 5) {
                    C0320nh c0320nh = C0320nh.this;
                    c0320nh.FragmentStateAdapter$5 = true ^ c0320nh.FragmentStateAdapter$5;
                    C0320nh.this.setNavigationOnClickListener = 0;
                    C0320nh.this.postInvalidate();
                    C0320nh.setOnLongClickListener(C0320nh.this);
                }
            }
        };
        setIconTintList(context, attributeSet);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(0, 0, 0, 0);
    }

    private void setIconTintList(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = attributeSet != null ? context.obtainStyledAttributes(attributeSet, nl$MenuHostHelper$$ExternalSyntheticLambda1.setY) : null;
        int i = nl$MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1;
        this.RecyclerView$SavedState$1 = obtainStyledAttributes == null ? true : obtainStyledAttributes.getBoolean(10, true);
        int i2 = nl$MenuHostHelper$$ExternalSyntheticLambda1.setAnimationFromJson;
        this.setError = obtainStyledAttributes != null ? obtainStyledAttributes.getColor(15, -5592406) : -5592406;
        int i3 = nl$MenuHostHelper$$ExternalSyntheticLambda1.setZ;
        int applyDimension = (int) TypedValue.applyDimension(1, 1.5f, Resources.getSystem().getDisplayMetrics());
        if (obtainStyledAttributes != null) {
            applyDimension = obtainStyledAttributes.getDimensionPixelOffset(17, applyDimension);
        }
        this.onActivityResumed = applyDimension;
        this.FirebaseRemoteConfigKtxRegistrar = TypedValue.applyDimension(1, 10.0f, Resources.getSystem().getDisplayMetrics());
        int i4 = nl$MenuHostHelper$$ExternalSyntheticLambda1.setMaxEms;
        float applyDimension2 = TypedValue.applyDimension(1, 4.0f, Resources.getSystem().getDisplayMetrics());
        if (obtainStyledAttributes != null) {
            applyDimension2 = obtainStyledAttributes.getDimension(16, applyDimension2);
        }
        this.getCallingPid = applyDimension2;
        this.setHasDecor = TypedValue.applyDimension(1, 4.0f, Resources.getSystem().getDisplayMetrics());
        this.setChipIconTintResource = TypedValue.applyDimension(1, 4.0f, Resources.getSystem().getDisplayMetrics());
        int i5 = nl$MenuHostHelper$$ExternalSyntheticLambda1.setIconSize;
        int applyDimension3 = (int) TypedValue.applyDimension(1, 2.5f, Resources.getSystem().getDisplayMetrics());
        if (obtainStyledAttributes != null) {
            applyDimension3 = obtainStyledAttributes.getDimensionPixelOffset(12, applyDimension3);
        }
        this.setImageTintMode = applyDimension3;
        int i6 = nl$MenuHostHelper$$ExternalSyntheticLambda1.setTextAlignment;
        int applyDimension4 = (int) TypedValue.applyDimension(1, 1.5f, Resources.getSystem().getDisplayMetrics());
        if (obtainStyledAttributes != null) {
            applyDimension4 = obtainStyledAttributes.getDimensionPixelOffset(11, applyDimension4);
        }
        this.setSelectedChildViewEnabled = applyDimension4;
        int i7 = nl$MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius;
        this.setChipIconEnabled = obtainStyledAttributes != null ? obtainStyledAttributes.getColor(9, 855638016) : 855638016;
        int i8 = nl$MenuHostHelper$$ExternalSyntheticLambda1.setTextScaleX;
        this.setHint = obtainStyledAttributes != null ? obtainStyledAttributes.getColor(14, -2236963) : -2236963;
        int i9 = nl$MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener;
        this.ExtendableSavedState$1 = obtainStyledAttributes != null ? obtainStyledAttributes.getColor(4, -11414681) : -11414681;
        int i10 = nl$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
        int applyDimension5 = (int) TypedValue.applyDimension(1, 1.0f, Resources.getSystem().getDisplayMetrics());
        if (obtainStyledAttributes != null) {
            applyDimension5 = obtainStyledAttributes.getDimensionPixelOffset(1, applyDimension5);
        }
        this.setMaxEms = applyDimension5;
        int i11 = nl$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener;
        this.setCheckedIconEnabled = obtainStyledAttributes == null ? -1 : obtainStyledAttributes.getColor(5, -1);
        int i12 = nl$MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple;
        int applyDimension6 = (int) TypedValue.applyDimension(1, 1.0f, Resources.getSystem().getDisplayMetrics());
        if (obtainStyledAttributes != null) {
            applyDimension6 = obtainStyledAttributes.getDimensionPixelOffset(6, applyDimension6);
        }
        this.setIconified = applyDimension6;
        this.setTextAppearanceResource = TypedValue.applyDimension(1, 6.0f, Resources.getSystem().getDisplayMetrics());
        int i13 = nl$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1;
        int color = obtainStyledAttributes == null ? -1 : obtainStyledAttributes.getColor(2, -1);
        int i14 = nl$MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation;
        int i15 = obtainStyledAttributes != null ? obtainStyledAttributes.getInt(7, 300) : 300;
        int i16 = nl$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList;
        this.FragmentStateAdapter$5 = obtainStyledAttributes == null ? false : obtainStyledAttributes.getBoolean(3, false);
        int i17 = nl$MenuHostHelper$$ExternalSyntheticLambda1.setCenterIfNoTextEnabled;
        this.setTitleMarginEnd = obtainStyledAttributes == null ? true : obtainStyledAttributes.getBoolean(13, true);
        int i18 = nl$MenuHostHelper$$ExternalSyntheticLambda1.setX;
        this.setCenterIfNoTextEnabled = obtainStyledAttributes != null ? obtainStyledAttributes.getColor(0, -1) : -1;
        int i19 = nl$MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions;
        this.SearchView$SavedState$1 = obtainStyledAttributes == null ? true : obtainStyledAttributes.getBoolean(8, true);
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
        this.setViewTranslationCallback = new Paint(1);
        Paint paint = new Paint(1);
        this.setOnNavigationItemSelectedListener = paint;
        paint.setColor(color);
        if (this.RecyclerView$SavedState$1) {
            this.setOnNavigationItemSelectedListener.setShadowLayer(this.setImageTintMode, 0.0f, this.setSelectedChildViewEnabled, this.setChipIconEnabled);
        }
        this.createDispatcher = new nh$MenuHostHelper$$ExternalSyntheticLambda1();
        this.ViewPager$SavedState$1 = new nh$MenuHostHelper$$ExternalSyntheticLambda1();
        this.setUiOptions = new nh$MenuHostHelper$$ExternalSyntheticLambda1();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.setFilterRedundantCalls = ofFloat;
        ofFloat.setDuration(i15);
        this.setFilterRedundantCalls.setRepeatCount(0);
        this.setFilterRedundantCalls.addUpdateListener(this.setTextAlignment);
        this.setFilterRedundantCalls.addListener(this.setChipCornerRadius);
        super.setClickable(true);
        setPadding(0, 0, 0, 0);
        setLayerType(1, null);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 0 || mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(MenuHostHelper$$ExternalSyntheticLambda0, 1073741824);
        }
        if (mode2 == 0 || mode2 == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(setIconTintList, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float max = Math.max(this.setImageTintMode + this.setSelectedChildViewEnabled, this.setMaxEms);
        float f = i2 - max;
        float f2 = f - max;
        this.setContentScrimResource = f2;
        float f3 = i - max;
        this.Fragment$5 = f3 - max;
        float f4 = f2 * 0.5f;
        this.setTooltipText = f4;
        this.setLayoutDirection = f4 - this.setMaxEms;
        this.setFilterTouchesWhenObscured = max;
        this.setChipSpacingVertical = max;
        this.setFloatValues = f3;
        this.setTextScaleX = f;
        this.setMinAndMaxProgress = (max + f3) * 0.5f;
        this.setGuidelinePercent = (f + max) * 0.5f;
        this.setAnimationFromJson = max + f4;
        this.setZ = f3 - f4;
        if (isChecked()) {
            setIconTintList(this.createDispatcher);
        } else {
            nh$MenuHostHelper$$ExternalSyntheticLambda1 nh_menuhosthelper__externalsyntheticlambda1 = this.createDispatcher;
            nh_menuhosthelper__externalsyntheticlambda1.setY = 0.0f;
            nh_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1 = this.setHint;
            nh_menuhosthelper__externalsyntheticlambda1.setX = 0;
            nh_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0 = this.setAnimationFromJson;
        }
        this.FloatingActionButton$BaseBehavior = true;
        postInvalidate();
    }

    private void setIconTintList(nh$MenuHostHelper$$ExternalSyntheticLambda1 nh_menuhosthelper__externalsyntheticlambda1) {
        nh_menuhosthelper__externalsyntheticlambda1.setY = this.setTooltipText;
        nh_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1 = this.ExtendableSavedState$1;
        nh_menuhosthelper__externalsyntheticlambda1.setX = this.setCheckedIconEnabled;
        nh_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0 = this.setZ;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.setViewTranslationCallback.setStrokeWidth(this.setMaxEms);
        this.setViewTranslationCallback.setStyle(Paint.Style.FILL);
        this.setViewTranslationCallback.setColor(this.setCenterIfNoTextEnabled);
        float f = this.setFilterTouchesWhenObscured;
        float f2 = this.setChipSpacingVertical;
        float f3 = this.setFloatValues;
        float f4 = this.setTextScaleX;
        float f5 = this.setTooltipText;
        canvas.drawRoundRect(f, f2, f3, f4, f5, f5, this.setViewTranslationCallback);
        this.setViewTranslationCallback.setStyle(Paint.Style.STROKE);
        this.setViewTranslationCallback.setColor(this.setHint);
        float f6 = this.setFilterTouchesWhenObscured;
        float f7 = this.setChipSpacingVertical;
        float f8 = this.setFloatValues;
        float f9 = this.setTextScaleX;
        float f10 = this.setTooltipText;
        canvas.drawRoundRect(f6, f7, f8, f9, f10, f10, this.setViewTranslationCallback);
        if (this.setTitleMarginEnd) {
            int i = this.setError;
            float f11 = this.setFloatValues - this.FirebaseRemoteConfigKtxRegistrar;
            float f12 = this.setGuidelinePercent;
            float f13 = this.getCallingPid;
            Paint paint = this.setViewTranslationCallback;
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(i);
            paint.setStrokeWidth(this.onActivityResumed);
            canvas.drawCircle(f11, f12, f13, paint);
        }
        float f14 = this.createDispatcher.setY * 0.5f;
        this.setViewTranslationCallback.setStyle(Paint.Style.STROKE);
        this.setViewTranslationCallback.setColor(this.createDispatcher.MenuHostHelper$$ExternalSyntheticLambda1);
        this.setViewTranslationCallback.setStrokeWidth(this.setMaxEms + (f14 * 2.0f));
        float f15 = this.setTooltipText;
        canvas.drawRoundRect(this.setFilterTouchesWhenObscured + f14, this.setChipSpacingVertical + f14, this.setFloatValues - f14, this.setTextScaleX - f14, f15, f15, this.setViewTranslationCallback);
        this.setViewTranslationCallback.setStyle(Paint.Style.FILL);
        this.setViewTranslationCallback.setStrokeWidth(1.0f);
        float f16 = this.setFilterTouchesWhenObscured;
        float f17 = this.setChipSpacingVertical;
        float f18 = this.setTooltipText * 2.0f;
        canvas.drawArc(f16, f17, f16 + f18, f17 + f18, 90.0f, 180.0f, true, this.setViewTranslationCallback);
        canvas.drawRect(this.setFilterTouchesWhenObscured + this.setTooltipText, this.setChipSpacingVertical, this.createDispatcher.MenuHostHelper$$ExternalSyntheticLambda0, this.setChipSpacingVertical + (this.setTooltipText * 2.0f), this.setViewTranslationCallback);
        if (this.setTitleMarginEnd) {
            int i2 = this.createDispatcher.setX;
            float f19 = this.setFilterTouchesWhenObscured;
            float f20 = this.setTooltipText;
            float f21 = this.setHasDecor;
            float f22 = this.setGuidelinePercent;
            float f23 = this.setTextAppearanceResource;
            float f24 = f19 + f20;
            Paint paint2 = this.setViewTranslationCallback;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(i2);
            paint2.setStrokeWidth(this.setIconified);
            canvas.drawLine(f24 - f21, f22 - f23, f24 - this.setChipIconTintResource, f22 + f23, paint2);
        }
        float f25 = this.createDispatcher.MenuHostHelper$$ExternalSyntheticLambda0;
        float f26 = this.setGuidelinePercent;
        canvas.drawCircle(f25, f26, this.setLayoutDirection, this.setOnNavigationItemSelectedListener);
        this.setViewTranslationCallback.setStyle(Paint.Style.STROKE);
        this.setViewTranslationCallback.setStrokeWidth(1.0f);
        this.setViewTranslationCallback.setColor(-2236963);
        canvas.drawCircle(f25, f26, this.setLayoutDirection, this.setViewTranslationCallback);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (z == isChecked()) {
            postInvalidate();
        } else {
            setX(this.SearchView$SavedState$1, false);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.FragmentStateAdapter$5;
    }

    private void setX(boolean z, boolean z2) {
        if (isEnabled()) {
            if (this.setConstraintSet) {
                throw new RuntimeException("should NOT switch the state in method: [onCheckedChanged]!");
            }
            if (!this.FloatingActionButton$BaseBehavior) {
                this.FragmentStateAdapter$5 = !this.FragmentStateAdapter$5;
                if (z2) {
                    setY sety = this.setAdapter;
                    if (sety != null) {
                        this.setConstraintSet = true;
                        sety.MenuHostHelper$$ExternalSyntheticLambda0(this, isChecked());
                    }
                    this.setConstraintSet = false;
                    return;
                }
                return;
            }
            if (this.setFilterRedundantCalls.isRunning()) {
                this.setFilterRedundantCalls.cancel();
            }
            if (!this.SearchView$SavedState$1 || !z) {
                this.FragmentStateAdapter$5 = !this.FragmentStateAdapter$5;
                if (isChecked()) {
                    setIconTintList(this.createDispatcher);
                } else {
                    nh$MenuHostHelper$$ExternalSyntheticLambda1 nh_menuhosthelper__externalsyntheticlambda1 = this.createDispatcher;
                    nh_menuhosthelper__externalsyntheticlambda1.setY = 0.0f;
                    nh_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1 = this.setHint;
                    nh_menuhosthelper__externalsyntheticlambda1.setX = 0;
                    nh_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0 = this.setAnimationFromJson;
                }
                postInvalidate();
                if (z2) {
                    setY sety2 = this.setAdapter;
                    if (sety2 != null) {
                        this.setConstraintSet = true;
                        sety2.MenuHostHelper$$ExternalSyntheticLambda0(this, isChecked());
                    }
                    this.setConstraintSet = false;
                    return;
                }
                return;
            }
            this.setNavigationOnClickListener = 5;
            this.ViewPager$SavedState$1.setY(this.createDispatcher);
            if (isChecked()) {
                nh$MenuHostHelper$$ExternalSyntheticLambda1 nh_menuhosthelper__externalsyntheticlambda12 = this.setUiOptions;
                nh_menuhosthelper__externalsyntheticlambda12.setY = 0.0f;
                nh_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda1 = this.setHint;
                nh_menuhosthelper__externalsyntheticlambda12.setX = 0;
                nh_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda0 = this.setAnimationFromJson;
            } else {
                setIconTintList(this.setUiOptions);
            }
            this.setFilterRedundantCalls.start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
        if ((r11.setNavigationOnClickListener == 2) != false) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0320nh.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setShadowEffect(boolean z) {
        if (this.RecyclerView$SavedState$1 == z) {
            return;
        }
        this.RecyclerView$SavedState$1 = z;
        if (z) {
            this.setOnNavigationItemSelectedListener.setShadowLayer(this.setImageTintMode, 0.0f, this.setSelectedChildViewEnabled, this.setChipIconEnabled);
        } else {
            this.setOnNavigationItemSelectedListener.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
    }

    public void setEnableEffect(boolean z) {
        this.SearchView$SavedState$1 = z;
    }

    public void setOnCheckedChangeListener(setY sety) {
        this.setAdapter = sety;
    }

    static /* synthetic */ boolean setIconTintList(C0320nh c0320nh) {
        return c0320nh.setNavigationOnClickListener != 0;
    }

    static /* synthetic */ void setOnLongClickListener(C0320nh c0320nh) {
        setY sety = c0320nh.setAdapter;
        if (sety != null) {
            c0320nh.setConstraintSet = true;
            sety.MenuHostHelper$$ExternalSyntheticLambda0(c0320nh, c0320nh.isChecked());
        }
        c0320nh.setConstraintSet = false;
    }

    static /* synthetic */ void setNavigationOnClickListener(C0320nh c0320nh) {
        if ((c0320nh.setNavigationOnClickListener != 0) || !c0320nh.FragmentStateAdapter$2) {
            return;
        }
        if (c0320nh.setFilterRedundantCalls.isRunning()) {
            c0320nh.setFilterRedundantCalls.cancel();
        }
        c0320nh.setNavigationOnClickListener = 1;
        c0320nh.ViewPager$SavedState$1.setY(c0320nh.createDispatcher);
        c0320nh.setUiOptions.setY(c0320nh.createDispatcher);
        if (c0320nh.isChecked()) {
            c0320nh.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1 = c0320nh.ExtendableSavedState$1;
            c0320nh.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0 = c0320nh.setZ;
            c0320nh.setUiOptions.setX = c0320nh.ExtendableSavedState$1;
        } else {
            c0320nh.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1 = c0320nh.setHint;
            c0320nh.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0 = c0320nh.setAnimationFromJson;
            c0320nh.setUiOptions.setY = c0320nh.setTooltipText;
        }
        c0320nh.setFilterRedundantCalls.start();
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        boolean z = true;
        if (!(this.setNavigationOnClickListener == 2)) {
            int i = this.setNavigationOnClickListener;
            if (i != 1 && i != 3) {
                z = false;
            }
            if (!z) {
                return;
            }
        }
        if (this.setFilterRedundantCalls.isRunning()) {
            this.setFilterRedundantCalls.cancel();
        }
        this.setNavigationOnClickListener = 3;
        this.ViewPager$SavedState$1.setY(this.createDispatcher);
        if (isChecked()) {
            setIconTintList(this.setUiOptions);
        } else {
            nh$MenuHostHelper$$ExternalSyntheticLambda1 nh_menuhosthelper__externalsyntheticlambda1 = this.setUiOptions;
            nh_menuhosthelper__externalsyntheticlambda1.setY = 0.0f;
            nh_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1 = this.setHint;
            nh_menuhosthelper__externalsyntheticlambda1.setX = 0;
            nh_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0 = this.setAnimationFromJson;
        }
        this.setFilterRedundantCalls.start();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setX(true, true);
    }
}