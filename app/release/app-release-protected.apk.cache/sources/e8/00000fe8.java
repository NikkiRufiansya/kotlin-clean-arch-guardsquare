package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
import o.setExpandedTitleMargin;
import o.setForegroundTintBlendMode;
import o.setMIndicatorOptions;
import o.setOnRatingBarChangeListener;
import o.setTextLocale;
import o.setVisibility;

/* loaded from: classes.dex */
public final class setSubtitle extends setMIndicatorOptions implements queryLocalInterface {
    public static boolean setIconTintList = false;
    private ArrayList<FirebaseApp> ActionMenuPresenter$SavedState$1;
    private int FabTransformationBehavior;
    private setUnboundedRippleResource FirebaseRemoteConfigKtxRegistrar;
    private long FloatingActionButton$BaseBehavior;
    private ArrayList<FirebaseApp> Fragment$5;
    private setSubtitle$MenuHostHelper$$ExternalSyntheticLambda0 FragmentStateAdapter$2;
    private float FragmentStateAdapter$5;
    int MenuHostHelper$$ExternalSyntheticLambda0;
    int MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean RecyclerView$SavedState$1;
    private float RemoteActionCompatParcelizer;
    private View TextInputLayout$SavedState$1;
    protected boolean ViewPager$SavedState$1;
    private int createDispatcher;
    private float getCallingPid;
    private setNavigationOnClickListener m;
    private setLinksClickable minusKey;
    private int onActivityResumed;
    private int setAdapter;
    float setAnimationFromJson;
    private int setBackgroundTintMode;
    private long setCalendarViewShown;
    private float setCallingWorkSourceUid;
    Runnable setCenterIfNoTextEnabled;
    private boolean setCheckedIconEnabledResource;
    float setChipCornerRadius;
    private Interpolator setChipIconEnabled;
    private int[] setChipIconEnabledResource;
    private boolean setChipIconTintResource;
    private float setChipSpacingHorizontal;
    private boolean setChipSpacingVertical;
    private float setChipTextResource;
    private boolean setCloseIconEndPadding;
    private RectF setConstraintSet;
    private ArrayList<FirebaseApp> setContentScrimResource;
    private float setDelayedApplicationOfInitialState;
    private Rect setEdgeEffectFactory;
    private int setEmptyView;
    private int setError;
    private long setErrorIconTintList;
    private float setExpandedTitleTextColor;
    private int setFilterRedundantCalls;
    private boolean setFilterTouchesWhenObscured;
    private boolean setFloatValues;
    CopyOnWriteArrayList<setLayoutAnimation> setGuidelinePercent;
    private int setHint;
    HashMap<View, setSecondaryProgress> setIconSize;
    private float setIconified;
    private boolean setImageTintMode;
    boolean setLayoutAnimation;
    private int setLineBreakStyle;
    setOnRatingBarChangeListener setMaxEms;
    int setMinAndMaxProgress;
    private setUnboundedRipple setMinEms;
    private Interpolator setNavigationIconTint;
    int setNavigationOnClickListener;
    private setIconTintList setObjectValues;
    int setOnLongClickListener;
    int setOnNavigationItemSelectedListener;
    private boolean setOnScrollChangeListener;
    private boolean setOnSeekBarChangeListener;
    private setY setRevealInfo;
    private ArrayList<Integer> setRowOrderPreserved;
    private Matrix setSelectedChildViewEnabled;
    private long setShrinkMotionSpec;
    private int setSubmitButtonEnabled;
    private boolean setSuffixText;
    float setTextAlignment;
    setLayoutAnimation setTextAppearanceResource;
    int setTextScaleX;
    private float setTitleMarginEnd;
    private int setTooltipText;
    int setUiOptions;
    HashMap<View, setIconStartPadding> setUnboundedRipple;
    private boolean setViewTranslationCallback;
    int setX;
    int setY;
    int setZ;

    /* loaded from: classes.dex */
    public interface setLayoutAnimation {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum setNavigationOnClickListener {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    private static boolean setIconTintList(float f, float f2, float f3) {
        if (f > 0.0f) {
            float f4 = f / f3;
            return f2 + ((f * f4) - (((f3 * f4) * f4) / 2.0f)) > 1.0f;
        }
        float f5 = (-f) / f3;
        return f2 + ((f * f5) + (((f3 * f5) * f5) / 2.0f)) < 0.0f;
    }

    @Override // o.setDropDownVerticalOffset
    public final void MenuHostHelper$$ExternalSyntheticLambda0(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public setSubtitle(Context context) {
        super(context);
        this.setNavigationIconTint = null;
        this.setChipCornerRadius = 0.0f;
        this.setY = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        this.setFilterRedundantCalls = 0;
        this.setError = 0;
        this.setLayoutAnimation = true;
        this.setUnboundedRipple = new HashMap<>();
        this.FloatingActionButton$BaseBehavior = 0L;
        this.setDelayedApplicationOfInitialState = 1.0f;
        this.setChipTextResource = 0.0f;
        this.setAnimationFromJson = 0.0f;
        this.setExpandedTitleTextColor = 0.0f;
        this.setFloatValues = false;
        this.RecyclerView$SavedState$1 = false;
        this.setX = 0;
        this.setOnScrollChangeListener = false;
        this.minusKey = new setLinksClickable();
        this.FragmentStateAdapter$2 = new setSubtitle$MenuHostHelper$$ExternalSyntheticLambda0(this);
        this.setChipIconTintResource = true;
        this.setOnSeekBarChangeListener = false;
        this.setChipSpacingVertical = false;
        this.ActionMenuPresenter$SavedState$1 = null;
        this.Fragment$5 = null;
        this.setContentScrimResource = null;
        this.setGuidelinePercent = null;
        this.setAdapter = 0;
        this.setShrinkMotionSpec = -1L;
        this.setTitleMarginEnd = 0.0f;
        this.onActivityResumed = 0;
        this.getCallingPid = 0.0f;
        this.setImageTintMode = false;
        this.ViewPager$SavedState$1 = false;
        this.FirebaseRemoteConfigKtxRegistrar = new setUnboundedRippleResource();
        this.setViewTranslationCallback = false;
        this.setCenterIfNoTextEnabled = null;
        this.setChipIconEnabledResource = null;
        this.setBackgroundTintMode = 0;
        this.setFilterTouchesWhenObscured = false;
        this.setZ = 0;
        this.setIconSize = new HashMap<>();
        this.setEdgeEffectFactory = new Rect();
        this.setSuffixText = false;
        this.m = setNavigationOnClickListener.UNDEFINED;
        this.setRevealInfo = new setY();
        this.setCloseIconEndPadding = false;
        this.setConstraintSet = new RectF();
        this.TextInputLayout$SavedState$1 = null;
        this.setSelectedChildViewEnabled = null;
        this.setRowOrderPreserved = new ArrayList<>();
        setY((AttributeSet) null);
    }

    public setSubtitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setNavigationIconTint = null;
        this.setChipCornerRadius = 0.0f;
        this.setY = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        this.setFilterRedundantCalls = 0;
        this.setError = 0;
        this.setLayoutAnimation = true;
        this.setUnboundedRipple = new HashMap<>();
        this.FloatingActionButton$BaseBehavior = 0L;
        this.setDelayedApplicationOfInitialState = 1.0f;
        this.setChipTextResource = 0.0f;
        this.setAnimationFromJson = 0.0f;
        this.setExpandedTitleTextColor = 0.0f;
        this.setFloatValues = false;
        this.RecyclerView$SavedState$1 = false;
        this.setX = 0;
        this.setOnScrollChangeListener = false;
        this.minusKey = new setLinksClickable();
        this.FragmentStateAdapter$2 = new setSubtitle$MenuHostHelper$$ExternalSyntheticLambda0(this);
        this.setChipIconTintResource = true;
        this.setOnSeekBarChangeListener = false;
        this.setChipSpacingVertical = false;
        this.ActionMenuPresenter$SavedState$1 = null;
        this.Fragment$5 = null;
        this.setContentScrimResource = null;
        this.setGuidelinePercent = null;
        this.setAdapter = 0;
        this.setShrinkMotionSpec = -1L;
        this.setTitleMarginEnd = 0.0f;
        this.onActivityResumed = 0;
        this.getCallingPid = 0.0f;
        this.setImageTintMode = false;
        this.ViewPager$SavedState$1 = false;
        this.FirebaseRemoteConfigKtxRegistrar = new setUnboundedRippleResource();
        this.setViewTranslationCallback = false;
        this.setCenterIfNoTextEnabled = null;
        this.setChipIconEnabledResource = null;
        this.setBackgroundTintMode = 0;
        this.setFilterTouchesWhenObscured = false;
        this.setZ = 0;
        this.setIconSize = new HashMap<>();
        this.setEdgeEffectFactory = new Rect();
        this.setSuffixText = false;
        this.m = setNavigationOnClickListener.UNDEFINED;
        this.setRevealInfo = new setY();
        this.setCloseIconEndPadding = false;
        this.setConstraintSet = new RectF();
        this.TextInputLayout$SavedState$1 = null;
        this.setSelectedChildViewEnabled = null;
        this.setRowOrderPreserved = new ArrayList<>();
        setY(attributeSet);
    }

    public setSubtitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setNavigationIconTint = null;
        this.setChipCornerRadius = 0.0f;
        this.setY = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        this.setFilterRedundantCalls = 0;
        this.setError = 0;
        this.setLayoutAnimation = true;
        this.setUnboundedRipple = new HashMap<>();
        this.FloatingActionButton$BaseBehavior = 0L;
        this.setDelayedApplicationOfInitialState = 1.0f;
        this.setChipTextResource = 0.0f;
        this.setAnimationFromJson = 0.0f;
        this.setExpandedTitleTextColor = 0.0f;
        this.setFloatValues = false;
        this.RecyclerView$SavedState$1 = false;
        this.setX = 0;
        this.setOnScrollChangeListener = false;
        this.minusKey = new setLinksClickable();
        this.FragmentStateAdapter$2 = new setSubtitle$MenuHostHelper$$ExternalSyntheticLambda0(this);
        this.setChipIconTintResource = true;
        this.setOnSeekBarChangeListener = false;
        this.setChipSpacingVertical = false;
        this.ActionMenuPresenter$SavedState$1 = null;
        this.Fragment$5 = null;
        this.setContentScrimResource = null;
        this.setGuidelinePercent = null;
        this.setAdapter = 0;
        this.setShrinkMotionSpec = -1L;
        this.setTitleMarginEnd = 0.0f;
        this.onActivityResumed = 0;
        this.getCallingPid = 0.0f;
        this.setImageTintMode = false;
        this.ViewPager$SavedState$1 = false;
        this.FirebaseRemoteConfigKtxRegistrar = new setUnboundedRippleResource();
        this.setViewTranslationCallback = false;
        this.setCenterIfNoTextEnabled = null;
        this.setChipIconEnabledResource = null;
        this.setBackgroundTintMode = 0;
        this.setFilterTouchesWhenObscured = false;
        this.setZ = 0;
        this.setIconSize = new HashMap<>();
        this.setEdgeEffectFactory = new Rect();
        this.setSuffixText = false;
        this.m = setNavigationOnClickListener.UNDEFINED;
        this.setRevealInfo = new setY();
        this.setCloseIconEndPadding = false;
        this.setConstraintSet = new RectF();
        this.TextInputLayout$SavedState$1 = null;
        this.setSelectedChildViewEnabled = null;
        this.setRowOrderPreserved = new ArrayList<>();
        setY(attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(setNavigationOnClickListener setnavigationonclicklistener) {
        if (setnavigationonclicklistener == setNavigationOnClickListener.FINISHED && this.MenuHostHelper$$ExternalSyntheticLambda0 == -1) {
            return;
        }
        setNavigationOnClickListener setnavigationonclicklistener2 = this.m;
        this.m = setnavigationonclicklistener;
        if (setnavigationonclicklistener2 == setNavigationOnClickListener.MOVING && setnavigationonclicklistener == setNavigationOnClickListener.MOVING) {
            setUiOptions();
        }
        int i = AnonymousClass1.setIconTintList[setnavigationonclicklistener2.ordinal()];
        if (i == 1 || i == 2) {
            if (setnavigationonclicklistener == setNavigationOnClickListener.MOVING) {
                setUiOptions();
            }
            if (setnavigationonclicklistener == setNavigationOnClickListener.FINISHED) {
                setLayoutAnimation();
            }
        } else if (i == 3 && setnavigationonclicklistener == setNavigationOnClickListener.FINISHED) {
            setLayoutAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.setSubtitle$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] setIconTintList;

        static {
            int[] iArr = new int[setNavigationOnClickListener.values().length];
            setIconTintList = iArr;
            try {
                iArr[setNavigationOnClickListener.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                setIconTintList[setNavigationOnClickListener.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                setIconTintList[setNavigationOnClickListener.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                setIconTintList[setNavigationOnClickListener.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX implements setSubtitle$MenuHostHelper$$ExternalSyntheticLambda1 {
        private static setX setY = new setX();
        private VelocityTracker setIconTintList;

        private setX() {
        }

        public static setX setIconTintList() {
            setY.setIconTintList = VelocityTracker.obtain();
            return setY;
        }

        @Override // o.setSubtitle$MenuHostHelper$$ExternalSyntheticLambda1
        public final void MenuHostHelper$$ExternalSyntheticLambda0() {
            VelocityTracker velocityTracker = this.setIconTintList;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.setIconTintList = null;
            }
        }

        @Override // o.setSubtitle$MenuHostHelper$$ExternalSyntheticLambda1
        public final void setIconTintList(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.setIconTintList;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // o.setSubtitle$MenuHostHelper$$ExternalSyntheticLambda1
        public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
            VelocityTracker velocityTracker = this.setIconTintList;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }

        @Override // o.setSubtitle$MenuHostHelper$$ExternalSyntheticLambda1
        public final float setY() {
            VelocityTracker velocityTracker = this.setIconTintList;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // o.setSubtitle$MenuHostHelper$$ExternalSyntheticLambda1
        public final float MenuHostHelper$$ExternalSyntheticLambda1() {
            VelocityTracker velocityTracker = this.setIconTintList;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }
    }

    public final void setTransition(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.setMinEms == null) {
                this.setMinEms = new setUnboundedRipple();
            }
            this.setMinEms.setLayoutAnimation = i;
            this.setMinEms.MenuHostHelper$$ExternalSyntheticLambda1 = i2;
            return;
        }
        setOnRatingBarChangeListener setonratingbarchangelistener = this.setMaxEms;
        if (setonratingbarchangelistener != null) {
            this.setY = i;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i2;
            setonratingbarchangelistener.setX(i, i2);
            setY sety = this.setRevealInfo;
            setButtonTintBlendMode setbuttontintblendmode = this.ExtendableSavedState$1;
            sety.setY(this.setMaxEms.setX(i), this.setMaxEms.setX(i2));
            this.setRevealInfo.setIconTintList();
            invalidate();
            this.setAnimationFromJson = 0.0f;
            setIconTintList(0.0f);
        }
    }

    public final void setTransition(int i) {
        setOnRatingBarChangeListener.setIconTintList seticontintlist;
        float f;
        setOnRatingBarChangeListener setonratingbarchangelistener = this.setMaxEms;
        if (setonratingbarchangelistener != null) {
            Iterator<setOnRatingBarChangeListener.setIconTintList> it = setonratingbarchangelistener.setNavigationOnClickListener.iterator();
            while (true) {
                if (!it.hasNext()) {
                    seticontintlist = null;
                    break;
                }
                seticontintlist = it.next();
                if (seticontintlist.setOnLongClickListener == i) {
                    break;
                }
            }
            this.setY = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = seticontintlist.setY;
            if (!isAttachedToWindow()) {
                if (this.setMinEms == null) {
                    this.setMinEms = new setUnboundedRipple();
                }
                this.setMinEms.setLayoutAnimation = this.setY;
                this.setMinEms.MenuHostHelper$$ExternalSyntheticLambda1 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                return;
            }
            int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (i2 == this.setY) {
                f = 0.0f;
            } else {
                f = i2 == this.MenuHostHelper$$ExternalSyntheticLambda1 ? 1.0f : Float.NaN;
            }
            setOnRatingBarChangeListener setonratingbarchangelistener2 = this.setMaxEms;
            setonratingbarchangelistener2.MenuHostHelper$$ExternalSyntheticLambda0 = seticontintlist;
            if (seticontintlist != null && seticontintlist.setTextScaleX != null) {
                setonratingbarchangelistener2.MenuHostHelper$$ExternalSyntheticLambda0.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda1(setonratingbarchangelistener2.setX);
            }
            setY sety = this.setRevealInfo;
            setButtonTintBlendMode setbuttontintblendmode = this.ExtendableSavedState$1;
            sety.setY(this.setMaxEms.setX(this.setY), this.setMaxEms.setX(this.MenuHostHelper$$ExternalSyntheticLambda1));
            this.setRevealInfo.setIconTintList();
            invalidate();
            if (this.setAnimationFromJson != f) {
                if (f == 0.0f) {
                    MenuHostHelper$$ExternalSyntheticLambda0(true);
                    this.setMaxEms.setX(this.setY).setIconTintList(this);
                } else if (f == 1.0f) {
                    MenuHostHelper$$ExternalSyntheticLambda0(false);
                    this.setMaxEms.setX(this.MenuHostHelper$$ExternalSyntheticLambda1).setIconTintList(this);
                }
            }
            this.setAnimationFromJson = !Float.isNaN(f) ? f : 0.0f;
            if (Float.isNaN(f)) {
                StringBuilder sb = new StringBuilder();
                sb.append(setExtendMotionSpec.setY());
                sb.append(" transitionToStart ");
                Log.v("MotionLayout", sb.toString());
                setIconTintList(0.0f);
                return;
            }
            setProgress(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setOnRatingBarChangeListener.setIconTintList seticontintlist) {
        setOnRatingBarChangeListener setonratingbarchangelistener = this.setMaxEms;
        setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0 = seticontintlist;
        if (seticontintlist != null && seticontintlist.setTextScaleX != null) {
            setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda1(setonratingbarchangelistener.setX);
        }
        setX(setNavigationOnClickListener.SETUP);
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        setOnRatingBarChangeListener.setIconTintList seticontintlist2 = this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i == (seticontintlist2 == null ? -1 : seticontintlist2.setY)) {
            this.setAnimationFromJson = 1.0f;
            this.setChipTextResource = 1.0f;
            this.setExpandedTitleTextColor = 1.0f;
        } else {
            this.setAnimationFromJson = 0.0f;
            this.setChipTextResource = 0.0f;
            this.setExpandedTitleTextColor = 0.0f;
        }
        this.setCalendarViewShown = (seticontintlist.setMaxEms & 1) != 0 ? -1L : System.nanoTime();
        setOnRatingBarChangeListener.setIconTintList seticontintlist3 = this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0;
        int i2 = seticontintlist3 == null ? -1 : seticontintlist3.MenuHostHelper$$ExternalSyntheticLambda0;
        setOnRatingBarChangeListener.setIconTintList seticontintlist4 = this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0;
        int i3 = seticontintlist4 != null ? seticontintlist4.setY : -1;
        if (i2 == this.setY && i3 == this.MenuHostHelper$$ExternalSyntheticLambda1) {
            return;
        }
        this.setY = i2;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i3;
        this.setMaxEms.setX(i2, i3);
        setY sety = this.setRevealInfo;
        setButtonTintBlendMode setbuttontintblendmode = this.ExtendableSavedState$1;
        sety.setY(this.setMaxEms.setX(this.setY), this.setMaxEms.setX(this.MenuHostHelper$$ExternalSyntheticLambda1));
        setY sety2 = this.setRevealInfo;
        int i4 = this.setY;
        int i5 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        sety2.MenuHostHelper$$ExternalSyntheticLambda0 = i4;
        sety2.setY = i5;
        this.setRevealInfo.setIconTintList();
        this.setRevealInfo.setIconTintList();
        invalidate();
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // o.setMIndicatorOptions
    public final void setState(int i, int i2, int i3) {
        setX(setNavigationOnClickListener.SETUP);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        this.setY = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        if (this.setCheckedIconEnabled != null) {
            this.setCheckedIconEnabled.setY(i, i2, i3);
            return;
        }
        setOnRatingBarChangeListener setonratingbarchangelistener = this.setMaxEms;
        if (setonratingbarchangelistener != null) {
            setonratingbarchangelistener.setX(i).setIconTintList(this);
        }
    }

    public final void setInterpolatedProgress(float f) {
        if (this.setMaxEms != null) {
            setX(setNavigationOnClickListener.MOVING);
            Interpolator MenuHostHelper$$ExternalSyntheticLambda0 = this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0();
            if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                setProgress(MenuHostHelper$$ExternalSyntheticLambda0.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public final void setProgress(float f, float f2) {
        if (!isAttachedToWindow()) {
            if (this.setMinEms == null) {
                this.setMinEms = new setUnboundedRipple();
            }
            this.setMinEms.setUnboundedRipple = f;
            this.setMinEms.setOnLongClickListener = f2;
            return;
        }
        setProgress(f);
        setX(setNavigationOnClickListener.MOVING);
        this.setChipCornerRadius = f2;
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i != 0) {
            setIconTintList(i <= 0 ? 0.0f : 1.0f);
        } else if (f == 0.0f || f == 1.0f) {
        } else {
            setIconTintList(f <= 0.5f ? 0.0f : 1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setUnboundedRipple {
        float setUnboundedRipple = Float.NaN;
        float setOnLongClickListener = Float.NaN;
        int setLayoutAnimation = -1;
        int MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        final String setY = "motion.progress";
        final String setIconTintList = "motion.velocity";
        final String MenuHostHelper$$ExternalSyntheticLambda0 = "motion.StartState";
        final String setX = "motion.EndState";

        setUnboundedRipple() {
        }

        final void setIconTintList() {
            int i = this.setLayoutAnimation;
            if (i != -1 || this.MenuHostHelper$$ExternalSyntheticLambda1 != -1) {
                if (i == -1) {
                    setSubtitle.this.setY(this.MenuHostHelper$$ExternalSyntheticLambda1);
                } else {
                    int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                    if (i2 == -1) {
                        setSubtitle.this.setState(i, -1, -1);
                    } else {
                        setSubtitle.this.setTransition(i, i2);
                    }
                }
                setSubtitle.this.setX(setNavigationOnClickListener.SETUP);
            }
            if (Float.isNaN(this.setOnLongClickListener)) {
                if (Float.isNaN(this.setUnboundedRipple)) {
                    return;
                }
                setSubtitle.this.setProgress(this.setUnboundedRipple);
                return;
            }
            setSubtitle.this.setProgress(this.setUnboundedRipple, this.setOnLongClickListener);
            this.setUnboundedRipple = Float.NaN;
            this.setOnLongClickListener = Float.NaN;
            this.setLayoutAnimation = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        }
    }

    public final void setTransitionState(Bundle bundle) {
        if (this.setMinEms == null) {
            this.setMinEms = new setUnboundedRipple();
        }
        setUnboundedRipple setunboundedripple = this.setMinEms;
        setunboundedripple.setUnboundedRipple = bundle.getFloat("motion.progress");
        setunboundedripple.setOnLongClickListener = bundle.getFloat("motion.velocity");
        setunboundedripple.setLayoutAnimation = bundle.getInt("motion.StartState");
        setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda1 = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.setMinEms.setIconTintList();
        }
    }

    public final void setProgress(float f) {
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i < 0 || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.setMinEms == null) {
                this.setMinEms = new setUnboundedRipple();
            }
            this.setMinEms.setUnboundedRipple = f;
            return;
        }
        if (i <= 0) {
            if (this.setAnimationFromJson == 1.0f && this.MenuHostHelper$$ExternalSyntheticLambda0 == this.MenuHostHelper$$ExternalSyntheticLambda1) {
                setX(setNavigationOnClickListener.MOVING);
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = this.setY;
            if (this.setAnimationFromJson == 0.0f) {
                setX(setNavigationOnClickListener.FINISHED);
            }
        } else if (f >= 1.0f) {
            if (this.setAnimationFromJson == 0.0f && this.MenuHostHelper$$ExternalSyntheticLambda0 == this.setY) {
                setX(setNavigationOnClickListener.MOVING);
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (this.setAnimationFromJson == 1.0f) {
                setX(setNavigationOnClickListener.FINISHED);
            }
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
            setX(setNavigationOnClickListener.MOVING);
        }
        if (this.setMaxEms == null) {
            return;
        }
        this.setCheckedIconEnabledResource = true;
        this.setExpandedTitleTextColor = f;
        this.setChipTextResource = f;
        this.setCalendarViewShown = -1L;
        this.FloatingActionButton$BaseBehavior = -1L;
        this.setChipIconEnabled = null;
        this.setFloatValues = true;
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
        if (r12 != 7) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setY(int r12, float r13, float r14) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSubtitle.setY(int, float, float):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIconTintList(float f) {
        int i;
        setOnRatingBarChangeListener setonratingbarchangelistener = this.setMaxEms;
        if (setonratingbarchangelistener == null) {
            return;
        }
        float f2 = this.setAnimationFromJson;
        float f3 = this.setChipTextResource;
        if (f2 != f3 && this.setCheckedIconEnabledResource) {
            this.setAnimationFromJson = f3;
        }
        float f4 = this.setAnimationFromJson;
        if (f4 == f) {
            return;
        }
        this.setOnScrollChangeListener = false;
        this.setExpandedTitleTextColor = f;
        setOnRatingBarChangeListener.setIconTintList seticontintlist = setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0;
        if (seticontintlist == null) {
            i = setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda1;
        } else {
            i = seticontintlist.setNavigationOnClickListener;
        }
        this.setDelayedApplicationOfInitialState = i / 1000.0f;
        setProgress(this.setExpandedTitleTextColor);
        this.setChipIconEnabled = null;
        this.setNavigationIconTint = this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0();
        this.setCheckedIconEnabledResource = false;
        this.FloatingActionButton$BaseBehavior = System.nanoTime();
        this.setFloatValues = true;
        this.setChipTextResource = f4;
        this.setAnimationFromJson = f4;
        invalidate();
    }

    public final void setY(int i) {
        int i2;
        if (!isAttachedToWindow()) {
            if (this.setMinEms == null) {
                this.setMinEms = new setUnboundedRipple();
            }
            this.setMinEms.MenuHostHelper$$ExternalSyntheticLambda1 = i;
            return;
        }
        setOnRatingBarChangeListener setonratingbarchangelistener = this.setMaxEms;
        if (setonratingbarchangelistener != null && setonratingbarchangelistener.setOnLongClickListener != null) {
            setForegroundTintBlendMode setforegroundtintblendmode = this.setMaxEms.setOnLongClickListener;
            int i3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            setForegroundTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda0 setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda0 = setforegroundtintblendmode.MenuHostHelper$$ExternalSyntheticLambda0.get(i);
            if (setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda0 == null) {
                i3 = i;
            } else if (setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda0.setIconTintList != i3) {
                Iterator<setForegroundTintBlendMode.setIconTintList> it = setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (i3 == it.next().setIconTintList) {
                            break;
                        }
                    } else {
                        i3 = setforegroundtintblendmode_menuhosthelper__externalsyntheticlambda0.setIconTintList;
                        break;
                    }
                }
            }
            if (i3 != -1) {
                i = i3;
            }
        }
        int i4 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i4 != i) {
            if (this.setY == i) {
                setIconTintList(0.0f);
            } else if (this.MenuHostHelper$$ExternalSyntheticLambda1 == i) {
                setIconTintList(1.0f);
            } else {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
                if (i4 != -1) {
                    setTransition(i4, i);
                    setIconTintList(1.0f);
                    this.setAnimationFromJson = 0.0f;
                    setIconTintList(1.0f);
                    this.setCenterIfNoTextEnabled = null;
                    return;
                }
                this.setOnScrollChangeListener = false;
                this.setExpandedTitleTextColor = 1.0f;
                this.setChipTextResource = 0.0f;
                this.setAnimationFromJson = 0.0f;
                this.setCalendarViewShown = System.nanoTime();
                this.FloatingActionButton$BaseBehavior = System.nanoTime();
                this.setCheckedIconEnabledResource = false;
                this.setChipIconEnabled = null;
                setOnRatingBarChangeListener setonratingbarchangelistener2 = this.setMaxEms;
                setOnRatingBarChangeListener.setIconTintList seticontintlist = setonratingbarchangelistener2.MenuHostHelper$$ExternalSyntheticLambda0;
                if (seticontintlist == null) {
                    i2 = setonratingbarchangelistener2.MenuHostHelper$$ExternalSyntheticLambda1;
                } else {
                    i2 = seticontintlist.setNavigationOnClickListener;
                }
                this.setDelayedApplicationOfInitialState = i2 / 1000.0f;
                this.setY = -1;
                this.setMaxEms.setX(-1, this.MenuHostHelper$$ExternalSyntheticLambda1);
                SparseArray sparseArray = new SparseArray();
                int childCount = getChildCount();
                this.setUnboundedRipple.clear();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    this.setUnboundedRipple.put(childAt, new setIconStartPadding(childAt));
                    sparseArray.put(childAt.getId(), this.setUnboundedRipple.get(childAt));
                }
                this.setFloatValues = true;
                setY sety = this.setRevealInfo;
                setButtonTintBlendMode setbuttontintblendmode = this.ExtendableSavedState$1;
                sety.setY((WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) null, this.setMaxEms.setX(i));
                this.setRevealInfo.setIconTintList();
                invalidate();
                this.setRevealInfo.MenuHostHelper$$ExternalSyntheticLambda1();
                int childCount2 = getChildCount();
                for (int i6 = 0; i6 < childCount2; i6++) {
                    View childAt2 = getChildAt(i6);
                    setIconStartPadding seticonstartpadding = this.setUnboundedRipple.get(childAt2);
                    if (seticonstartpadding != null) {
                        seticonstartpadding.setLayoutDirection.setCenterIfNoTextEnabled = 0.0f;
                        seticonstartpadding.setLayoutDirection.setChipCornerRadius = 0.0f;
                        setDivider setdivider = seticonstartpadding.setLayoutDirection;
                        float x = childAt2.getX();
                        float y = childAt2.getY();
                        setdivider.setTextScaleX = x;
                        setdivider.setZ = y;
                        setdivider.setIconSize = childAt2.getWidth();
                        setdivider.setX = childAt2.getHeight();
                        setImageIcon setimageicon = seticonstartpadding.setMinAndMaxProgress;
                        childAt2.getX();
                        childAt2.getY();
                        childAt2.getWidth();
                        childAt2.getHeight();
                        setimageicon.MenuHostHelper$$ExternalSyntheticLambda1(childAt2);
                    }
                }
                int width = getWidth();
                int height = getHeight();
                for (int i7 = 0; i7 < childCount; i7++) {
                    setIconStartPadding seticonstartpadding2 = this.setUnboundedRipple.get(getChildAt(i7));
                    if (seticonstartpadding2 != null) {
                        this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0(seticonstartpadding2);
                        seticonstartpadding2.setY(width, height, System.nanoTime());
                    }
                }
                setOnRatingBarChangeListener.setIconTintList seticontintlist2 = this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0;
                float f = seticontintlist2 != null ? seticontintlist2.setAnimationFromJson : 0.0f;
                if (f != 0.0f) {
                    float f2 = Float.MAX_VALUE;
                    float f3 = -3.4028235E38f;
                    for (int i8 = 0; i8 < childCount; i8++) {
                        setIconStartPadding seticonstartpadding3 = this.setUnboundedRipple.get(getChildAt(i8));
                        float f4 = seticonstartpadding3.setUiOptions.setZ + seticonstartpadding3.setUiOptions.setTextScaleX;
                        f2 = Math.min(f2, f4);
                        f3 = Math.max(f3, f4);
                    }
                    for (int i9 = 0; i9 < childCount; i9++) {
                        setIconStartPadding seticonstartpadding4 = this.setUnboundedRipple.get(getChildAt(i9));
                        float f5 = seticonstartpadding4.setUiOptions.setTextScaleX;
                        float f6 = seticonstartpadding4.setUiOptions.setZ;
                        seticonstartpadding4.setCheckedIconEnabled = 1.0f / (1.0f - f);
                        seticonstartpadding4.setOnNavigationItemSelectedListener = f - ((((f5 + f6) - f2) * f) / (f3 - f2));
                    }
                }
                this.setChipTextResource = 0.0f;
                this.setAnimationFromJson = 0.0f;
                this.setFloatValues = true;
                invalidate();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setY {
        int MenuHostHelper$$ExternalSyntheticLambda0;
        int setY;
        private setButtonTintBlendMode setLayoutAnimation = new setButtonTintBlendMode();
        private setButtonTintBlendMode setX = new setButtonTintBlendMode();
        private WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 setUnboundedRipple = null;
        private WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 MenuHostHelper$$ExternalSyntheticLambda1 = null;

        setY() {
        }

        final void setY(WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12) {
            this.setUnboundedRipple = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12;
            this.setLayoutAnimation = new setButtonTintBlendMode();
            this.setX = new setButtonTintBlendMode();
            setButtonTintBlendMode setbuttontintblendmode = this.setLayoutAnimation;
            setShowingForActionMode$MenuHostHelper$$ExternalSyntheticLambda1 setshowingforactionmode_menuhosthelper__externalsyntheticlambda1 = setSubtitle.this.ExtendableSavedState$1.RemoteActionCompatParcelizer;
            setbuttontintblendmode.RemoteActionCompatParcelizer = setshowingforactionmode_menuhosthelper__externalsyntheticlambda1;
            setbuttontintblendmode.ActionMenuPresenter$SavedState$1.setY = setshowingforactionmode_menuhosthelper__externalsyntheticlambda1;
            setButtonTintBlendMode setbuttontintblendmode2 = this.setX;
            setShowingForActionMode$MenuHostHelper$$ExternalSyntheticLambda1 setshowingforactionmode_menuhosthelper__externalsyntheticlambda12 = setSubtitle.this.ExtendableSavedState$1.RemoteActionCompatParcelizer;
            setbuttontintblendmode2.RemoteActionCompatParcelizer = setshowingforactionmode_menuhosthelper__externalsyntheticlambda12;
            setbuttontintblendmode2.ActionMenuPresenter$SavedState$1.setY = setshowingforactionmode_menuhosthelper__externalsyntheticlambda12;
            ((setQueryHint) this.setLayoutAnimation).setRowOrderPreserved.clear();
            ((setQueryHint) this.setX).setRowOrderPreserved.clear();
            MenuHostHelper$$ExternalSyntheticLambda0(setSubtitle.this.ExtendableSavedState$1, this.setLayoutAnimation);
            MenuHostHelper$$ExternalSyntheticLambda0(setSubtitle.this.ExtendableSavedState$1, this.setX);
            if (setSubtitle.this.setAnimationFromJson > 0.5d) {
                if (withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 != null) {
                    setX(this.setLayoutAnimation, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
                }
                setX(this.setX, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12);
            } else {
                setX(this.setX, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12);
                if (withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 != null) {
                    setX(this.setLayoutAnimation, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
                }
            }
            this.setLayoutAnimation.TextInputLayout$SavedState$1 = setSubtitle.this.setIconTintList();
            setButtonTintBlendMode setbuttontintblendmode3 = this.setLayoutAnimation;
            setbuttontintblendmode3.setX.MenuHostHelper$$ExternalSyntheticLambda0(setbuttontintblendmode3);
            this.setX.TextInputLayout$SavedState$1 = setSubtitle.this.setIconTintList();
            setButtonTintBlendMode setbuttontintblendmode4 = this.setX;
            setbuttontintblendmode4.setX.MenuHostHelper$$ExternalSyntheticLambda0(setbuttontintblendmode4);
            ViewGroup.LayoutParams layoutParams = setSubtitle.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    setButtonTintBlendMode setbuttontintblendmode5 = this.setLayoutAnimation;
                    setbuttontintblendmode5.setHasDecor[0] = setVisibility.setX.WRAP_CONTENT;
                    setButtonTintBlendMode setbuttontintblendmode6 = this.setX;
                    setbuttontintblendmode6.setHasDecor[0] = setVisibility.setX.WRAP_CONTENT;
                }
                if (layoutParams.height == -2) {
                    setButtonTintBlendMode setbuttontintblendmode7 = this.setLayoutAnimation;
                    setbuttontintblendmode7.setHasDecor[1] = setVisibility.setX.WRAP_CONTENT;
                    setButtonTintBlendMode setbuttontintblendmode8 = this.setX;
                    setbuttontintblendmode8.setHasDecor[1] = setVisibility.setX.WRAP_CONTENT;
                }
            }
        }

        private void setX(setButtonTintBlendMode setbuttontintblendmode, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX setx;
            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX setx2;
            SparseArray<setVisibility> sparseArray = new SparseArray<>();
            setTextLocale.setIconTintList seticontintlist = new setTextLocale.setIconTintList();
            sparseArray.clear();
            sparseArray.put(0, setbuttontintblendmode);
            sparseArray.put(setSubtitle.this.getId(), setbuttontintblendmode);
            if (withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 != null && withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setIconTintList != 0) {
                setSubtitle setsubtitle = setSubtitle.this;
                setsubtitle.setY(this.setX, setsubtitle.ExtendableSavedState$1.setChipIconEnabledResource, View.MeasureSpec.makeMeasureSpec(setSubtitle.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(setSubtitle.this.getWidth(), 1073741824));
            }
            Iterator<setVisibility> it = ((setQueryHint) setbuttontintblendmode).setRowOrderPreserved.iterator();
            while (it.hasNext()) {
                setVisibility next = it.next();
                next.setChipCornerRadius = true;
                sparseArray.put(((View) next.setAnimationFromJson).getId(), next);
            }
            Iterator<setVisibility> it2 = ((setQueryHint) setbuttontintblendmode).setRowOrderPreserved.iterator();
            while (it2.hasNext()) {
                setVisibility next2 = it2.next();
                View view = (View) next2.setAnimationFromJson;
                int id = view.getId();
                if (withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY.containsKey(Integer.valueOf(id)) && (setx2 = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY.get(Integer.valueOf(id))) != null) {
                    setx2.setX(seticontintlist);
                }
                next2.setNavigationOnClickListener(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(view.getId()).setY.setShrinkMotionSpec);
                next2.setY(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(view.getId()).setY.setFloatValues);
                if (view instanceof setCardBackgroundColor) {
                    setCardBackgroundColor setcardbackgroundcolor = (setCardBackgroundColor) view;
                    int id2 = setcardbackgroundcolor.getId();
                    if (withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY.containsKey(Integer.valueOf(id2)) && (setx = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY.get(Integer.valueOf(id2))) != null && (next2 instanceof setForceApplySystemWindowInsetTop)) {
                        setcardbackgroundcolor.MenuHostHelper$$ExternalSyntheticLambda0(setx, (setForceApplySystemWindowInsetTop) next2, seticontintlist, sparseArray);
                    }
                    if (view instanceof AndroidExceptionPreHandler) {
                        ((AndroidExceptionPreHandler) view).MenuHostHelper$$ExternalSyntheticLambda0();
                    }
                }
                seticontintlist.resolveLayoutDirection(setSubtitle.this.getLayoutDirection());
                setSubtitle.this.MenuHostHelper$$ExternalSyntheticLambda1(false, view, next2, (setMIndicatorOptions.setIconTintList) seticontintlist, sparseArray);
                if (withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(view.getId()).setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                    next2.setFilterRedundantCalls = view.getVisibility();
                } else {
                    next2.setFilterRedundantCalls = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(view.getId()).setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0;
                }
            }
            Iterator<setVisibility> it3 = ((setQueryHint) setbuttontintblendmode).setRowOrderPreserved.iterator();
            while (it3.hasNext()) {
                setVisibility next3 = it3.next();
                if (next3 instanceof setCompoundDrawablesWithIntrinsicBounds) {
                    setSoundEffectsEnabled setsoundeffectsenabled = (setSoundEffectsEnabled) next3;
                    ((setCardBackgroundColor) next3.setAnimationFromJson).MenuHostHelper$$ExternalSyntheticLambda1(setsoundeffectsenabled, sparseArray);
                    ((setCompoundDrawablesWithIntrinsicBounds) setsoundeffectsenabled).setIconTintList();
                }
            }
        }

        public final void setIconTintList() {
            MenuHostHelper$$ExternalSyntheticLambda0(setSubtitle.this.setFilterRedundantCalls, setSubtitle.this.setError);
            setSubtitle.setIconTintList(setSubtitle.this);
        }

        private void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            setSubtitle.this.setMinAndMaxProgress = mode;
            setSubtitle.this.setOnLongClickListener = mode2;
            int i3 = setSubtitle.this.ExtendableSavedState$1.setChipIconEnabledResource;
            setY(i, i2);
            if (((setSubtitle.this.getParent() instanceof setSubtitle) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                setY(i, i2);
                setSubtitle setsubtitle = setSubtitle.this;
                setButtonTintBlendMode setbuttontintblendmode = this.setLayoutAnimation;
                setsubtitle.setOnNavigationItemSelectedListener = setbuttontintblendmode.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode.setHint;
                setSubtitle setsubtitle2 = setSubtitle.this;
                setButtonTintBlendMode setbuttontintblendmode2 = this.setLayoutAnimation;
                setsubtitle2.setTextScaleX = setbuttontintblendmode2.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode2.setTextScaleX;
                setSubtitle setsubtitle3 = setSubtitle.this;
                setButtonTintBlendMode setbuttontintblendmode3 = this.setX;
                setsubtitle3.setNavigationOnClickListener = setbuttontintblendmode3.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode3.setHint;
                setSubtitle setsubtitle4 = setSubtitle.this;
                setButtonTintBlendMode setbuttontintblendmode4 = this.setX;
                setsubtitle4.setUiOptions = setbuttontintblendmode4.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode4.setTextScaleX;
                setSubtitle setsubtitle5 = setSubtitle.this;
                setsubtitle5.ViewPager$SavedState$1 = (setsubtitle5.setOnNavigationItemSelectedListener == setSubtitle.this.setNavigationOnClickListener && setSubtitle.this.setTextScaleX == setSubtitle.this.setUiOptions) ? false : true;
            }
            int i4 = setSubtitle.this.setOnNavigationItemSelectedListener;
            int i5 = setSubtitle.this.setTextScaleX;
            if (setSubtitle.this.setMinAndMaxProgress == Integer.MIN_VALUE || setSubtitle.this.setMinAndMaxProgress == 0) {
                i4 = (int) (setSubtitle.this.setOnNavigationItemSelectedListener + (setSubtitle.this.setTextAlignment * (setSubtitle.this.setNavigationOnClickListener - setSubtitle.this.setOnNavigationItemSelectedListener)));
            }
            int i6 = i4;
            if (setSubtitle.this.setOnLongClickListener == Integer.MIN_VALUE || setSubtitle.this.setOnLongClickListener == 0) {
                i5 = (int) (setSubtitle.this.setTextScaleX + (setSubtitle.this.setTextAlignment * (setSubtitle.this.setUiOptions - setSubtitle.this.setTextScaleX)));
            }
            setSubtitle.this.MenuHostHelper$$ExternalSyntheticLambda0(i, i2, i6, i5, this.setLayoutAnimation.setCallingWorkSourceUid || this.setX.setCallingWorkSourceUid, this.setLayoutAnimation.setLineBreakStyle || this.setX.setLineBreakStyle);
        }

        private void setY(int i, int i2) {
            int i3 = setSubtitle.this.ExtendableSavedState$1.setChipIconEnabledResource;
            if (setSubtitle.this.MenuHostHelper$$ExternalSyntheticLambda0 == setSubtitle.this.setY) {
                setSubtitle setsubtitle = setSubtitle.this;
                setButtonTintBlendMode setbuttontintblendmode = this.setX;
                WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                int i4 = (withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 == null || withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setIconTintList == 0) ? i : i2;
                WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                setsubtitle.setY(setbuttontintblendmode, i3, i4, (withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12 == null || withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12.setIconTintList == 0) ? i2 : i);
                WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$13 = this.setUnboundedRipple;
                if (withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$13 != null) {
                    setSubtitle setsubtitle2 = setSubtitle.this;
                    setButtonTintBlendMode setbuttontintblendmode2 = this.setLayoutAnimation;
                    int i5 = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$13.setIconTintList == 0 ? i : i2;
                    if (this.setUnboundedRipple.setIconTintList == 0) {
                        i = i2;
                    }
                    setsubtitle2.setY(setbuttontintblendmode2, i3, i5, i);
                    return;
                }
                return;
            }
            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$14 = this.setUnboundedRipple;
            if (withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$14 != null) {
                setSubtitle.this.setY(this.setLayoutAnimation, i3, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$14.setIconTintList == 0 ? i : i2, this.setUnboundedRipple.setIconTintList == 0 ? i2 : i);
            }
            setSubtitle setsubtitle3 = setSubtitle.this;
            setButtonTintBlendMode setbuttontintblendmode3 = this.setX;
            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$15 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            int i6 = (withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$15 == null || withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$15.setIconTintList == 0) ? i : i2;
            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$16 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$16 == null || withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$16.setIconTintList == 0) {
                i = i2;
            }
            setsubtitle3.setY(setbuttontintblendmode3, i3, i6, i);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x013f A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void MenuHostHelper$$ExternalSyntheticLambda1() {
            /*
                Method dump skipped, instructions count: 373
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setSubtitle.setY.MenuHostHelper$$ExternalSyntheticLambda1():void");
        }

        private static void MenuHostHelper$$ExternalSyntheticLambda0(setButtonTintBlendMode setbuttontintblendmode, setButtonTintBlendMode setbuttontintblendmode2) {
            setVisibility setvisibility;
            ArrayList<setVisibility> arrayList = ((setQueryHint) setbuttontintblendmode).setRowOrderPreserved;
            HashMap<setVisibility, setVisibility> hashMap = new HashMap<>();
            hashMap.put(setbuttontintblendmode, setbuttontintblendmode2);
            ((setQueryHint) setbuttontintblendmode2).setRowOrderPreserved.clear();
            setbuttontintblendmode2.MenuHostHelper$$ExternalSyntheticLambda0(setbuttontintblendmode, hashMap);
            Iterator<setVisibility> it = arrayList.iterator();
            while (it.hasNext()) {
                setVisibility next = it.next();
                if (next instanceof zzB) {
                    setvisibility = new zzB();
                } else if (next instanceof SwipeDismissBehavior) {
                    setvisibility = new SwipeDismissBehavior();
                } else if (next instanceof setFabAlignmentModeAndReplaceMenu) {
                    setvisibility = new setFabAlignmentModeAndReplaceMenu();
                } else if (next instanceof write) {
                    setvisibility = new write();
                } else if (next instanceof setSoundEffectsEnabled) {
                    setvisibility = new setForceApplySystemWindowInsetTop();
                } else {
                    setvisibility = new setVisibility();
                }
                setbuttontintblendmode2.MenuHostHelper$$ExternalSyntheticLambda1(setvisibility);
                hashMap.put(next, setvisibility);
            }
            Iterator<setVisibility> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                setVisibility next2 = it2.next();
                hashMap.get(next2).MenuHostHelper$$ExternalSyntheticLambda0(next2, hashMap);
            }
        }

        private static setVisibility MenuHostHelper$$ExternalSyntheticLambda1(setButtonTintBlendMode setbuttontintblendmode, View view) {
            if (setbuttontintblendmode.setAnimationFromJson == view) {
                return setbuttontintblendmode;
            }
            ArrayList<setVisibility> arrayList = ((setQueryHint) setbuttontintblendmode).setRowOrderPreserved;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                setVisibility setvisibility = arrayList.get(i);
                if (setvisibility.setAnimationFromJson == view) {
                    return setvisibility;
                }
            }
            return null;
        }
    }

    @Override // o.setMIndicatorOptions, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        setOnRatingBarChangeListener setonratingbarchangelistener;
        if (!this.ViewPager$SavedState$1 && this.MenuHostHelper$$ExternalSyntheticLambda0 == -1 && (setonratingbarchangelistener = this.setMaxEms) != null && setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            int i = this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize;
            if (i == 0) {
                return;
            }
            if (i == 2) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    this.setUnboundedRipple.get(getChildAt(i2)).setLayoutAnimation = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        StringBuilder sb = new StringBuilder();
        sb.append(setExtendMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1(context, this.setY));
        sb.append("->");
        sb.append(setExtendMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1(context, this.MenuHostHelper$$ExternalSyntheticLambda1));
        sb.append(" (pos:");
        sb.append(this.setAnimationFromJson);
        sb.append(" Dpos/Dt:");
        sb.append(this.setChipCornerRadius);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
        if (((r6 == r9.MenuHostHelper$$ExternalSyntheticLambda0 && r8 == r9.setY) ? false : true) != false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016b  */
    @Override // o.setMIndicatorOptions, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSubtitle.onMeasure(int, int):void");
    }

    @Override // o.setDropDownVerticalOffset
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(View view, View view2, int i, int i2) {
        setOnRatingBarChangeListener setonratingbarchangelistener = this.setMaxEms;
        return (setonratingbarchangelistener == null || setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0 == null || this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0.setTextScaleX == null || (this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0.setTextScaleX.setUnboundedRipple & 2) != 0) ? false : true;
    }

    @Override // o.setDropDownVerticalOffset
    public final void setY(View view, int i) {
        setOnRatingBarChangeListener setonratingbarchangelistener = this.setMaxEms;
        if (setonratingbarchangelistener != null) {
            float f = this.RemoteActionCompatParcelizer;
            if (f != 0.0f) {
                float f2 = this.setChipSpacingHorizontal / f;
                float f3 = this.setCallingWorkSourceUid / f;
                setOnRatingBarChangeListener.setIconTintList seticontintlist = setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0;
                if (seticontintlist == null || seticontintlist.setTextScaleX == null) {
                    return;
                }
                setLayerType setlayertype = setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0.setTextScaleX;
                setlayertype.setIconTintList = false;
                float f4 = setlayertype.setIconSize.setAnimationFromJson;
                setlayertype.setIconSize.setX(setlayertype.setCheckedIconEnabled, f4, setlayertype.setTextAppearanceResource, setlayertype.ExtendableSavedState$1, setlayertype.MenuHostHelper$$ExternalSyntheticLambda1);
                float f5 = setlayertype.setHasDecor;
                float[] fArr = setlayertype.MenuHostHelper$$ExternalSyntheticLambda1;
                float f6 = f5 != 0.0f ? (f2 * f5) / fArr[0] : (f3 * setlayertype.SearchView$SavedState$1) / fArr[1];
                if (!Float.isNaN(f6)) {
                    f4 += f6 / 3.0f;
                }
                if (f4 != 0.0f) {
                    boolean z = f4 != 1.0f;
                    int i2 = setlayertype.setTextAlignment;
                    if ((i2 != 3) && z) {
                        setlayertype.setIconSize.setY(i2, ((double) f4) >= 0.5d ? 1.0f : 0.0f, f6);
                    }
                }
            }
        }
    }

    @Override // o.queryLocalInterface
    public final void setY(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.setOnSeekBarChangeListener || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.setOnSeekBarChangeListener = false;
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // o.setDropDownVerticalOffset
    public final void MenuHostHelper$$ExternalSyntheticLambda0(final View view, int i, int i2, int[] iArr, int i3) {
        setOnRatingBarChangeListener.setIconTintList seticontintlist;
        ?? r1;
        float f;
        float f2;
        setLayerType setlayertype;
        int i4;
        setOnRatingBarChangeListener setonratingbarchangelistener = this.setMaxEms;
        if (setonratingbarchangelistener == null || (seticontintlist = setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0) == null || !(!seticontintlist.setUiOptions)) {
            return;
        }
        int i5 = -1;
        if (!(!seticontintlist.setUiOptions) || (setlayertype = seticontintlist.setTextScaleX) == null || (i4 = setlayertype.setIconified) == -1 || view.getId() == i4) {
            setOnRatingBarChangeListener.setIconTintList seticontintlist2 = setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0;
            if ((seticontintlist2 == null || seticontintlist2.setTextScaleX == null) ? false : setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0.setTextScaleX.ViewPager$SavedState$1) {
                setLayerType setlayertype2 = seticontintlist.setTextScaleX;
                if (setlayertype2 != null && (setlayertype2.setUnboundedRipple & 4) != 0) {
                    i5 = i2;
                }
                float f3 = this.setChipTextResource;
                if ((f3 == 1.0f || f3 == 0.0f) && view.canScrollVertically(i5)) {
                    return;
                }
            }
            if (seticontintlist.setTextScaleX != null && (seticontintlist.setTextScaleX.setUnboundedRipple & 1) != 0) {
                float f4 = i;
                float f5 = i2;
                setOnRatingBarChangeListener.setIconTintList seticontintlist3 = setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0;
                if (seticontintlist3 == null || seticontintlist3.setTextScaleX == null) {
                    f2 = 0.0f;
                } else {
                    setLayerType setlayertype3 = setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0.setTextScaleX;
                    setlayertype3.setIconSize.setX(setlayertype3.setCheckedIconEnabled, setlayertype3.setIconSize.setAnimationFromJson, setlayertype3.setTextAppearanceResource, setlayertype3.ExtendableSavedState$1, setlayertype3.MenuHostHelper$$ExternalSyntheticLambda1);
                    float f6 = setlayertype3.setHasDecor;
                    if (f6 != 0.0f) {
                        float[] fArr = setlayertype3.MenuHostHelper$$ExternalSyntheticLambda1;
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f2 = (f4 * f6) / fArr[0];
                    } else {
                        float[] fArr2 = setlayertype3.MenuHostHelper$$ExternalSyntheticLambda1;
                        if (fArr2[1] == 0.0f) {
                            fArr2[1] = 1.0E-7f;
                        }
                        f2 = (f5 * setlayertype3.SearchView$SavedState$1) / fArr2[1];
                    }
                }
                float f7 = this.setAnimationFromJson;
                if ((f7 <= 0.0f && f2 < 0.0f) || (f7 >= 1.0f && f2 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new Runnable() { // from class: o.setSubtitle.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            view.setNestedScrollingEnabled(true);
                        }
                    });
                    return;
                }
            }
            float f8 = this.setChipTextResource;
            long nanoTime = System.nanoTime();
            float f9 = i;
            this.setChipSpacingHorizontal = f9;
            float f10 = i2;
            this.setCallingWorkSourceUid = f10;
            this.RemoteActionCompatParcelizer = (float) ((nanoTime - this.setErrorIconTintList) * 1.0E-9d);
            this.setErrorIconTintList = nanoTime;
            setOnRatingBarChangeListener.setIconTintList seticontintlist4 = setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0;
            if (seticontintlist4 != null && seticontintlist4.setTextScaleX != null) {
                setLayerType setlayertype4 = setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0.setTextScaleX;
                float f11 = setlayertype4.setIconSize.setAnimationFromJson;
                if (!setlayertype4.setIconTintList) {
                    setlayertype4.setIconTintList = true;
                    setlayertype4.setIconSize.setProgress(f11);
                }
                setlayertype4.setIconSize.setX(setlayertype4.setCheckedIconEnabled, f11, setlayertype4.setTextAppearanceResource, setlayertype4.ExtendableSavedState$1, setlayertype4.MenuHostHelper$$ExternalSyntheticLambda1);
                float f12 = setlayertype4.setHasDecor;
                float[] fArr3 = setlayertype4.MenuHostHelper$$ExternalSyntheticLambda1;
                if (Math.abs((f12 * fArr3[0]) + (setlayertype4.SearchView$SavedState$1 * fArr3[1])) < 0.01d) {
                    float[] fArr4 = setlayertype4.MenuHostHelper$$ExternalSyntheticLambda1;
                    fArr4[0] = 0.01f;
                    fArr4[1] = 0.01f;
                }
                float f13 = setlayertype4.setHasDecor;
                if (f13 != 0.0f) {
                    f = (f9 * f13) / setlayertype4.MenuHostHelper$$ExternalSyntheticLambda1[0];
                } else {
                    f = (f10 * setlayertype4.SearchView$SavedState$1) / setlayertype4.MenuHostHelper$$ExternalSyntheticLambda1[1];
                }
                float max = Math.max(Math.min(f11 + f, 1.0f), 0.0f);
                if (max != setlayertype4.setIconSize.setAnimationFromJson) {
                    setlayertype4.setIconSize.setProgress(max);
                }
            }
            if (f8 != this.setChipTextResource) {
                iArr[0] = i;
                r1 = 1;
                iArr[1] = i2;
            } else {
                r1 = 1;
            }
            setY(false);
            if (iArr[0] == 0 && iArr[r1] == 0) {
                return;
            }
            this.setOnSeekBarChangeListener = r1;
        }
    }

    /* loaded from: classes.dex */
    class setIconTintList {
        float[] ViewPager$SavedState$1;
        Paint setAnimationFromJson;
        float[] setCenterIfNoTextEnabled;
        Paint setChipCornerRadius;
        int[] setIconSize;
        Paint setLayoutAnimation;
        Paint setNavigationOnClickListener;
        float[] setOnLongClickListener;
        private DashPathEffect setOnNavigationItemSelectedListener;
        Path setTextAlignment;
        Paint setUiOptions;
        int setUnboundedRipple;
        final int setIconTintList = -21965;
        final int MenuHostHelper$$ExternalSyntheticLambda1 = -2067046;
        final int MenuHostHelper$$ExternalSyntheticLambda0 = -13391360;
        final int setX = 1996488704;
        final int setY = 10;
        private Rect setZ = new Rect();
        private boolean setLayoutDirection = false;
        int setTextScaleX = 1;

        public setIconTintList() {
            Paint paint = new Paint();
            this.setLayoutAnimation = paint;
            paint.setAntiAlias(true);
            this.setLayoutAnimation.setColor(-21965);
            this.setLayoutAnimation.setStrokeWidth(2.0f);
            this.setLayoutAnimation.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.setChipCornerRadius = paint2;
            paint2.setAntiAlias(true);
            this.setChipCornerRadius.setColor(-2067046);
            this.setChipCornerRadius.setStrokeWidth(2.0f);
            this.setChipCornerRadius.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.setUiOptions = paint3;
            paint3.setAntiAlias(true);
            this.setUiOptions.setColor(-13391360);
            this.setUiOptions.setStrokeWidth(2.0f);
            this.setUiOptions.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.setAnimationFromJson = paint4;
            paint4.setAntiAlias(true);
            this.setAnimationFromJson.setColor(-13391360);
            this.setAnimationFromJson.setTextSize(setSubtitle.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.ViewPager$SavedState$1 = new float[8];
            Paint paint5 = new Paint();
            this.setNavigationOnClickListener = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.setOnNavigationItemSelectedListener = dashPathEffect;
            this.setUiOptions.setPathEffect(dashPathEffect);
            this.setOnLongClickListener = new float[100];
            this.setIconSize = new int[50];
        }

        public final void setY(Canvas canvas, int i, int i2, setIconStartPadding seticonstartpadding) {
            if (i == 4) {
                setY(canvas);
            }
            if (i == 2) {
                MenuHostHelper$$ExternalSyntheticLambda0(canvas);
            }
            if (i == 3) {
                setX(canvas);
            }
            canvas.drawLines(this.setCenterIfNoTextEnabled, this.setLayoutAnimation);
            MenuHostHelper$$ExternalSyntheticLambda1(canvas, i, i2, seticonstartpadding);
        }

        private void MenuHostHelper$$ExternalSyntheticLambda1(Canvas canvas, int i, int i2, setIconStartPadding seticonstartpadding) {
            int i3;
            int i4;
            float f;
            float f2;
            if (seticonstartpadding.setTextAppearanceResource != null) {
                i3 = seticonstartpadding.setTextAppearanceResource.getWidth();
                i4 = seticonstartpadding.setTextAppearanceResource.getHeight();
            } else {
                i3 = 0;
                i4 = 0;
            }
            int i5 = 1;
            int i6 = 1;
            while (i6 < i2 - 1) {
                if (i != 4 || this.setIconSize[i6 - 1] != 0) {
                    float[] fArr = this.setOnLongClickListener;
                    int i7 = i6 << 1;
                    float f3 = fArr[i7];
                    float f4 = fArr[i7 + i5];
                    this.setTextAlignment.reset();
                    this.setTextAlignment.moveTo(f3, f4 + 10.0f);
                    this.setTextAlignment.lineTo(f3 + 10.0f, f4);
                    this.setTextAlignment.lineTo(f3, f4 - 10.0f);
                    this.setTextAlignment.lineTo(f3 - 10.0f, f4);
                    this.setTextAlignment.close();
                    int i8 = i6 - 1;
                    seticonstartpadding.ViewPager$SavedState$1.get(i8);
                    if (i == 4) {
                        int i9 = this.setIconSize[i8];
                        if (i9 == i5) {
                            MenuHostHelper$$ExternalSyntheticLambda0(canvas, f3, f4);
                        } else if (i9 == 0) {
                            MenuHostHelper$$ExternalSyntheticLambda1(canvas, f3, f4);
                        } else if (i9 == 2) {
                            f = f4;
                            f2 = f3;
                            setX(canvas, f3, f4, i3, i4);
                            canvas.drawPath(this.setTextAlignment, this.setNavigationOnClickListener);
                        }
                        f = f4;
                        f2 = f3;
                        canvas.drawPath(this.setTextAlignment, this.setNavigationOnClickListener);
                    } else {
                        f = f4;
                        f2 = f3;
                    }
                    if (i == 2) {
                        MenuHostHelper$$ExternalSyntheticLambda0(canvas, f2, f);
                    }
                    if (i == 3) {
                        MenuHostHelper$$ExternalSyntheticLambda1(canvas, f2, f);
                    }
                    if (i == 6) {
                        setX(canvas, f2, f, i3, i4);
                    }
                    canvas.drawPath(this.setTextAlignment, this.setNavigationOnClickListener);
                }
                i6++;
                i5 = 1;
            }
            float[] fArr2 = this.setCenterIfNoTextEnabled;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.setChipCornerRadius);
                float[] fArr3 = this.setCenterIfNoTextEnabled;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.setChipCornerRadius);
            }
        }

        private void MenuHostHelper$$ExternalSyntheticLambda0(Canvas canvas) {
            float[] fArr = this.setCenterIfNoTextEnabled;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.setUiOptions);
        }

        private void setY(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.setUnboundedRipple; i++) {
                int i2 = this.setIconSize[i];
                if (i2 == 1) {
                    z = true;
                }
                if (i2 == 0) {
                    z2 = true;
                }
            }
            if (z) {
                MenuHostHelper$$ExternalSyntheticLambda0(canvas);
            }
            if (z2) {
                setX(canvas);
            }
        }

        private void MenuHostHelper$$ExternalSyntheticLambda0(Canvas canvas, float f, float f2) {
            float[] fArr = this.setCenterIfNoTextEnabled;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (hypot * hypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) Math.hypot(f10 - f, f11 - f2);
            StringBuilder sb = new StringBuilder("");
            sb.append(((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            String obj = sb.toString();
            this.setAnimationFromJson.getTextBounds(obj, 0, obj.length(), this.setZ);
            canvas.drawTextOnPath(obj, path, (hypot2 / 2.0f) - (this.setZ.width() / 2), -20.0f, this.setAnimationFromJson);
            canvas.drawLine(f, f2, f10, f11, this.setUiOptions);
        }

        private void setX(Canvas canvas) {
            float[] fArr = this.setCenterIfNoTextEnabled;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.setUiOptions);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.setUiOptions);
        }

        private void MenuHostHelper$$ExternalSyntheticLambda1(Canvas canvas, float f, float f2) {
            float[] fArr = this.setCenterIfNoTextEnabled;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            StringBuilder sb = new StringBuilder("");
            sb.append(((int) (((min2 * 100.0f) / Math.abs(f5 - f3)) + 0.5d)) / 100.0f);
            String obj = sb.toString();
            this.setAnimationFromJson.getTextBounds(obj, 0, obj.length(), this.setZ);
            canvas.drawText(obj, ((min2 / 2.0f) - (this.setZ.width() / 2)) + min, f2 - 20.0f, this.setAnimationFromJson);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.setUiOptions);
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(((int) (((max2 * 100.0f) / Math.abs(f6 - f4)) + 0.5d)) / 100.0f);
            String obj2 = sb2.toString();
            this.setAnimationFromJson.getTextBounds(obj2, 0, obj2.length(), this.setZ);
            canvas.drawText(obj2, f + 5.0f, max - ((max2 / 2.0f) - (this.setZ.height() / 2)), this.setAnimationFromJson);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.setUiOptions);
        }

        private void setX(Canvas canvas, float f, float f2, int i, int i2) {
            StringBuilder sb = new StringBuilder("");
            sb.append(((int) ((((f - (i / 2)) * 100.0f) / (setSubtitle.this.getWidth() - i)) + 0.5d)) / 100.0f);
            String obj = sb.toString();
            this.setAnimationFromJson.getTextBounds(obj, 0, obj.length(), this.setZ);
            canvas.drawText(obj, ((f / 2.0f) - (this.setZ.width() / 2)) + 0.0f, f2 - 20.0f, this.setAnimationFromJson);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.setUiOptions);
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(((int) ((((f2 - (i2 / 2)) * 100.0f) / (setSubtitle.this.getHeight() - i2)) + 0.5d)) / 100.0f);
            String obj2 = sb2.toString();
            this.setAnimationFromJson.getTextBounds(obj2, 0, obj2.length(), this.setZ);
            canvas.drawText(obj2, f + 5.0f, 0.0f - ((f2 / 2.0f) - (this.setZ.height() / 2)), this.setAnimationFromJson);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.setUiOptions);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    @Override // o.setMIndicatorOptions, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchDraw(android.graphics.Canvas r27) {
        /*
            Method dump skipped, instructions count: 1384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSubtitle.dispatchDraw(android.graphics.Canvas):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            setIconStartPadding seticonstartpadding = this.setUnboundedRipple.get(getChildAt(i));
            if (seticonstartpadding != null && "button".equals(setExtendMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1(seticonstartpadding.setTextAppearanceResource)) && seticonstartpadding.setTextAlignment != null) {
                int i2 = 0;
                while (true) {
                    setTypeface[] settypefaceArr = seticonstartpadding.setTextAlignment;
                    if (i2 < settypefaceArr.length) {
                        settypefaceArr[i2].setX(z ? -100.0f : 100.0f, seticonstartpadding.setTextAppearanceResource);
                        i2++;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setY(boolean r23) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSubtitle.setY(boolean):void");
    }

    @Override // o.setMIndicatorOptions, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.setViewTranslationCallback = true;
        try {
            if (this.setMaxEms == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.setHint != i5 || this.setTooltipText != i6) {
                this.setRevealInfo.setIconTintList();
                invalidate();
                setY(true);
            }
            this.setHint = i5;
            this.setTooltipText = i6;
            this.createDispatcher = i5;
            this.FabTransformationBehavior = i6;
        } finally {
            this.setViewTranslationCallback = false;
        }
    }

    @Override // o.setMIndicatorOptions
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        this.setCheckedIconEnabled = null;
    }

    private void setY(AttributeSet attributeSet) {
        setOnRatingBarChangeListener setonratingbarchangelistener;
        setIconTintList = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, setExpandedTitleMargin.setY.setHasFixedSize);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == setExpandedTitleMargin.setY.Timer$1) {
                    this.setMaxEms = new setOnRatingBarChangeListener(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == setExpandedTitleMargin.setY.setNumColumns) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == setExpandedTitleMargin.setY.setRepeatMode) {
                    this.setExpandedTitleTextColor = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.setFloatValues = true;
                } else if (index == setExpandedTitleMargin.setY.FragmentState$1) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == setExpandedTitleMargin.setY.setCropToPadding) {
                    if (this.setX == 0) {
                        this.setX = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == setExpandedTitleMargin.setY.setCacheComposition) {
                    this.setX = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.setMaxEms == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.setMaxEms = null;
            }
        }
        if (this.setX != 0) {
            setNavigationOnClickListener();
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 != -1 || (setonratingbarchangelistener = this.setMaxEms) == null) {
            return;
        }
        setOnRatingBarChangeListener.setIconTintList seticontintlist = setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = seticontintlist == null ? -1 : seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0;
        setOnRatingBarChangeListener.setIconTintList seticontintlist2 = this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0;
        this.setY = seticontintlist2 == null ? -1 : seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda0;
        setOnRatingBarChangeListener.setIconTintList seticontintlist3 = this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = seticontintlist3 != null ? seticontintlist3.setY : -1;
    }

    public final void setScene(setOnRatingBarChangeListener setonratingbarchangelistener) {
        this.setMaxEms = setonratingbarchangelistener;
        setonratingbarchangelistener.setIconTintList(setIconTintList());
        this.setRevealInfo.setIconTintList();
        invalidate();
    }

    private void setNavigationOnClickListener() {
        setOnRatingBarChangeListener setonratingbarchangelistener = this.setMaxEms;
        if (setonratingbarchangelistener == null) {
            Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        setOnRatingBarChangeListener.setIconTintList seticontintlist = setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0;
        int i = seticontintlist == null ? -1 : seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0;
        setOnRatingBarChangeListener setonratingbarchangelistener2 = this.setMaxEms;
        setOnRatingBarChangeListener.setIconTintList seticontintlist2 = setonratingbarchangelistener2.MenuHostHelper$$ExternalSyntheticLambda0;
        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 x = setonratingbarchangelistener2.setX(seticontintlist2 == null ? -1 : seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda0);
        String MenuHostHelper$$ExternalSyntheticLambda1 = setExtendMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1(getContext(), i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            if (id == -1) {
                StringBuilder sb = new StringBuilder("CHECK: ");
                sb.append(MenuHostHelper$$ExternalSyntheticLambda1);
                sb.append(" ALL VIEWS SHOULD HAVE ID's ");
                sb.append(childAt.getClass().getName());
                sb.append(" does not!");
                Log.w("MotionLayout", sb.toString());
            }
            if ((x.setY.containsKey(Integer.valueOf(id)) ? x.setY.get(Integer.valueOf(id)) : null) == null) {
                StringBuilder sb2 = new StringBuilder("CHECK: ");
                sb2.append(MenuHostHelper$$ExternalSyntheticLambda1);
                sb2.append(" NO CONSTRAINTS for ");
                sb2.append(setExtendMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1(childAt));
                Log.w("MotionLayout", sb2.toString());
            }
        }
        Integer[] numArr = (Integer[]) x.setY.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = numArr[i3].intValue();
        }
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            String MenuHostHelper$$ExternalSyntheticLambda12 = setExtendMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1(getContext(), i5);
            if (findViewById(iArr[i4]) == null) {
                StringBuilder sb3 = new StringBuilder("CHECK: ");
                sb3.append(MenuHostHelper$$ExternalSyntheticLambda1);
                sb3.append(" NO View matches id ");
                sb3.append(MenuHostHelper$$ExternalSyntheticLambda12);
                Log.w("MotionLayout", sb3.toString());
            }
            if (x.MenuHostHelper$$ExternalSyntheticLambda1(i5).setY.setFloatValues == -1) {
                StringBuilder sb4 = new StringBuilder("CHECK: ");
                sb4.append(MenuHostHelper$$ExternalSyntheticLambda1);
                sb4.append("(");
                sb4.append(MenuHostHelper$$ExternalSyntheticLambda12);
                sb4.append(") no LAYOUT_HEIGHT");
                Log.w("MotionLayout", sb4.toString());
            }
            if (x.MenuHostHelper$$ExternalSyntheticLambda1(i5).setY.setShrinkMotionSpec == -1) {
                StringBuilder sb5 = new StringBuilder("CHECK: ");
                sb5.append(MenuHostHelper$$ExternalSyntheticLambda1);
                sb5.append("(");
                sb5.append(MenuHostHelper$$ExternalSyntheticLambda12);
                sb5.append(") no LAYOUT_HEIGHT");
                Log.w("MotionLayout", sb5.toString());
            }
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<setOnRatingBarChangeListener.setIconTintList> it = this.setMaxEms.setNavigationOnClickListener.iterator();
        while (it.hasNext()) {
            setOnRatingBarChangeListener.setIconTintList next = it.next();
            if (next == this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0) {
                Log.v("MotionLayout", "CHECK: CURRENT");
            }
            if (next.MenuHostHelper$$ExternalSyntheticLambda0 == next.setY) {
                Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
            }
            int i6 = next.MenuHostHelper$$ExternalSyntheticLambda0;
            int i7 = next.setY;
            String MenuHostHelper$$ExternalSyntheticLambda13 = setExtendMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1(getContext(), i6);
            String MenuHostHelper$$ExternalSyntheticLambda14 = setExtendMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1(getContext(), i7);
            if (sparseIntArray.get(i6) == i7) {
                StringBuilder sb6 = new StringBuilder("CHECK: two transitions with the same start and end ");
                sb6.append(MenuHostHelper$$ExternalSyntheticLambda13);
                sb6.append("->");
                sb6.append(MenuHostHelper$$ExternalSyntheticLambda14);
                Log.e("MotionLayout", sb6.toString());
            }
            if (sparseIntArray2.get(i7) == i6) {
                StringBuilder sb7 = new StringBuilder("CHECK: you can't have reverse transitions");
                sb7.append(MenuHostHelper$$ExternalSyntheticLambda13);
                sb7.append("->");
                sb7.append(MenuHostHelper$$ExternalSyntheticLambda14);
                Log.e("MotionLayout", sb7.toString());
            }
            sparseIntArray.put(i6, i7);
            sparseIntArray2.put(i7, i6);
            if (this.setMaxEms.setX(i6) == null) {
                StringBuilder sb8 = new StringBuilder(" no such constraintSetStart ");
                sb8.append(MenuHostHelper$$ExternalSyntheticLambda13);
                Log.e("MotionLayout", sb8.toString());
            }
            if (this.setMaxEms.setX(i7) == null) {
                StringBuilder sb9 = new StringBuilder(" no such constraintSetEnd ");
                sb9.append(MenuHostHelper$$ExternalSyntheticLambda13);
                Log.e("MotionLayout", sb9.toString());
            }
        }
    }

    public final void setDebugMode(int i) {
        this.setX = i;
        invalidate();
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1(float f, float f2, View view, MotionEvent motionEvent) {
        boolean z;
        boolean onTouchEvent;
        View childAt;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (MenuHostHelper$$ExternalSyntheticLambda1((childAt.getLeft() + f) - view.getScrollX(), (childAt.getTop() + f2) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            this.setConstraintSet.set(f, f2, (view.getRight() + f) - view.getLeft(), (view.getBottom() + f2) - view.getTop());
            if (motionEvent.getAction() != 0 || this.setConstraintSet.contains(motionEvent.getX(), motionEvent.getY())) {
                float f3 = -f;
                float f4 = -f2;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f3, f4);
                    onTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f3, -f4);
                } else {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(f3, f4);
                    if (this.setSelectedChildViewEnabled == null) {
                        this.setSelectedChildViewEnabled = new Matrix();
                    }
                    matrix.invert(this.setSelectedChildViewEnabled);
                    obtain.transform(this.setSelectedChildViewEnabled);
                    onTouchEvent = view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (onTouchEvent) {
                    return true;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        setLayerType setlayertype;
        int i;
        RectF MenuHostHelper$$ExternalSyntheticLambda0;
        setOnItemSelectedListener setonitemselectedlistener;
        setOnRatingBarChangeListener setonratingbarchangelistener = this.setMaxEms;
        if (setonratingbarchangelistener != null && this.setLayoutAnimation) {
            if (setonratingbarchangelistener.setUnboundedRipple != null) {
                setKeepScreenOn setkeepscreenon = this.setMaxEms.setUnboundedRipple;
                int i2 = setkeepscreenon.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
                if (i2 != -1) {
                    if (setkeepscreenon.setY == null) {
                        setkeepscreenon.setY = new HashSet<>();
                        Iterator<setOnItemSelectedListener> it = setkeepscreenon.setIconTintList.iterator();
                        while (it.hasNext()) {
                            setOnItemSelectedListener next = it.next();
                            int childCount = setkeepscreenon.MenuHostHelper$$ExternalSyntheticLambda0.getChildCount();
                            for (int i3 = 0; i3 < childCount; i3++) {
                                View childAt = setkeepscreenon.MenuHostHelper$$ExternalSyntheticLambda0.getChildAt(i3);
                                if (next.MenuHostHelper$$ExternalSyntheticLambda1(childAt)) {
                                    childAt.getId();
                                    setkeepscreenon.setY.add(childAt);
                                }
                            }
                        }
                    }
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    Rect rect = new Rect();
                    int action = motionEvent.getAction();
                    ArrayList<setOnItemSelectedListener$MenuHostHelper$$ExternalSyntheticLambda0> arrayList = setkeepscreenon.setX;
                    int i4 = 2;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        Iterator<setOnItemSelectedListener$MenuHostHelper$$ExternalSyntheticLambda0> it2 = setkeepscreenon.setX.iterator();
                        while (it2.hasNext()) {
                            setOnItemSelectedListener$MenuHostHelper$$ExternalSyntheticLambda0 next2 = it2.next();
                            if (action != 1) {
                                if (action == 2) {
                                    next2.setIconTintList.setTextAppearanceResource.getHitRect(next2.MenuHostHelper$$ExternalSyntheticLambda1);
                                    if (!next2.MenuHostHelper$$ExternalSyntheticLambda1.contains((int) x, (int) y) && !next2.MenuHostHelper$$ExternalSyntheticLambda0) {
                                        next2.setY();
                                    }
                                }
                            } else if (!next2.MenuHostHelper$$ExternalSyntheticLambda0) {
                                next2.setY();
                            }
                        }
                    }
                    if (action == 0 || action == 1) {
                        setOnRatingBarChangeListener setonratingbarchangelistener2 = setkeepscreenon.MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms;
                        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 x2 = setonratingbarchangelistener2 == null ? null : setonratingbarchangelistener2.setX(i2);
                        Iterator<setOnItemSelectedListener> it3 = setkeepscreenon.setIconTintList.iterator();
                        while (it3.hasNext()) {
                            setOnItemSelectedListener next3 = it3.next();
                            int i5 = next3.setX;
                            if (i5 != 1 ? !(i5 != i4 ? !(i5 == 3 && action == 0) : action != 1) : action == 0) {
                                Iterator<View> it4 = setkeepscreenon.setY.iterator();
                                while (it4.hasNext()) {
                                    View next4 = it4.next();
                                    if (next3.MenuHostHelper$$ExternalSyntheticLambda1(next4)) {
                                        next4.getHitRect(rect);
                                        if (rect.contains((int) x, (int) y)) {
                                            setonitemselectedlistener = next3;
                                            next3.MenuHostHelper$$ExternalSyntheticLambda0(setkeepscreenon, setkeepscreenon.MenuHostHelper$$ExternalSyntheticLambda0, i2, x2, next4);
                                        } else {
                                            setonitemselectedlistener = next3;
                                        }
                                        next3 = setonitemselectedlistener;
                                        i4 = 2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            setOnRatingBarChangeListener.setIconTintList seticontintlist = this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0;
            if (seticontintlist != null && (true ^ seticontintlist.setUiOptions) && (setlayertype = seticontintlist.setTextScaleX) != null && ((motionEvent.getAction() != 0 || (MenuHostHelper$$ExternalSyntheticLambda0 = setlayertype.MenuHostHelper$$ExternalSyntheticLambda0(this, new RectF())) == null || MenuHostHelper$$ExternalSyntheticLambda0.contains(motionEvent.getX(), motionEvent.getY())) && (i = setlayertype.setIconified) != -1)) {
                View view = this.TextInputLayout$SavedState$1;
                if (view == null || view.getId() != i) {
                    this.TextInputLayout$SavedState$1 = findViewById(i);
                }
                View view2 = this.TextInputLayout$SavedState$1;
                if (view2 != null) {
                    this.setConstraintSet.set(view2.getLeft(), this.TextInputLayout$SavedState$1.getTop(), this.TextInputLayout$SavedState$1.getRight(), this.TextInputLayout$SavedState$1.getBottom());
                    if (this.setConstraintSet.contains(motionEvent.getX(), motionEvent.getY()) && !MenuHostHelper$$ExternalSyntheticLambda1(this.TextInputLayout$SavedState$1.getLeft(), this.TextInputLayout$SavedState$1.getTop(), this.TextInputLayout$SavedState$1, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        setOnRatingBarChangeListener setonratingbarchangelistener = this.setMaxEms;
        if (setonratingbarchangelistener != null && this.setLayoutAnimation && setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda1()) {
            setOnRatingBarChangeListener.setIconTintList seticontintlist = this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0;
            if (seticontintlist != null && !(!seticontintlist.setUiOptions)) {
                return super.onTouchEvent(motionEvent);
            }
            this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0(motionEvent, this.MenuHostHelper$$ExternalSyntheticLambda0, this);
            if ((this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms & 4) != 0) {
                return this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0.setTextScaleX.setIconTintList;
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        int i;
        boolean z;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.setEmptyView = display.getRotation();
        }
        setOnRatingBarChangeListener setonratingbarchangelistener = this.setMaxEms;
        if (setonratingbarchangelistener != null && (i = this.MenuHostHelper$$ExternalSyntheticLambda0) != -1) {
            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 x = setonratingbarchangelistener.setX(i);
            setOnRatingBarChangeListener setonratingbarchangelistener2 = this.setMaxEms;
            int i2 = 0;
            while (true) {
                if (i2 >= setonratingbarchangelistener2.setY.size()) {
                    break;
                }
                int keyAt = setonratingbarchangelistener2.setY.keyAt(i2);
                int i3 = setonratingbarchangelistener2.setIconTintList.get(keyAt);
                int size = setonratingbarchangelistener2.setIconTintList.size();
                while (true) {
                    z = true;
                    if (i3 <= 0) {
                        z = false;
                        break;
                    } else if (i3 == keyAt || size < 0) {
                        break;
                    } else {
                        i3 = setonratingbarchangelistener2.setIconTintList.get(i3);
                        size--;
                    }
                }
                if (z) {
                    Log.e("MotionScene", "Cannot be derived from yourself");
                    break;
                } else {
                    setonratingbarchangelistener2.setY(keyAt, this);
                    i2++;
                }
            }
            if (x != null) {
                x.setIconTintList(this);
            }
            this.setY = this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        setY();
        setUnboundedRipple setunboundedripple = this.setMinEms;
        if (setunboundedripple != null) {
            if (this.setSuffixText) {
                post(new Runnable() { // from class: o.setSubtitle.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        setSubtitle.this.setMinEms.setIconTintList();
                    }
                });
                return;
            } else {
                setunboundedripple.setIconTintList();
                return;
            }
        }
        setOnRatingBarChangeListener setonratingbarchangelistener3 = this.setMaxEms;
        if (setonratingbarchangelistener3 == null || setonratingbarchangelistener3.MenuHostHelper$$ExternalSyntheticLambda0 == null || this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList != 4) {
            return;
        }
        setIconTintList(1.0f);
        this.setCenterIfNoTextEnabled = null;
        setX(setNavigationOnClickListener.SETUP);
        setX(setNavigationOnClickListener.MOVING);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        setOnRatingBarChangeListener setonratingbarchangelistener = this.setMaxEms;
        if (setonratingbarchangelistener != null) {
            setonratingbarchangelistener.setIconTintList(setIconTintList());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY() {
        setOnRatingBarChangeListener setonratingbarchangelistener;
        setOnRatingBarChangeListener.setIconTintList seticontintlist;
        setOnRatingBarChangeListener setonratingbarchangelistener2 = this.setMaxEms;
        if (setonratingbarchangelistener2 == null) {
            return;
        }
        if (setonratingbarchangelistener2.setX(this, this.MenuHostHelper$$ExternalSyntheticLambda0)) {
            requestLayout();
            return;
        }
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i != -1) {
            this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0(this, i);
        }
        if (!this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda1() || (seticontintlist = (setonratingbarchangelistener = this.setMaxEms).MenuHostHelper$$ExternalSyntheticLambda0) == null || seticontintlist.setTextScaleX == null) {
            return;
        }
        setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(int i, float f, float f2, float f3, float[] fArr) {
        String resourceName;
        double[] dArr;
        HashMap<View, setIconStartPadding> hashMap = this.setUnboundedRipple;
        View view = this.setLayoutDirection.get(i);
        setIconStartPadding seticonstartpadding = hashMap.get(view);
        if (seticonstartpadding == null) {
            if (view == null) {
                StringBuilder sb = new StringBuilder("");
                sb.append(i);
                resourceName = sb.toString();
            } else {
                resourceName = view.getContext().getResources().getResourceName(i);
            }
            StringBuilder sb2 = new StringBuilder("WARNING could not find view id ");
            sb2.append(resourceName);
            Log.w("MotionLayout", sb2.toString());
            return;
        }
        float MenuHostHelper$$ExternalSyntheticLambda1 = seticonstartpadding.MenuHostHelper$$ExternalSyntheticLambda1(f, seticonstartpadding.setGuidelinePercent);
        setCompatElevation[] setcompatelevationArr = seticonstartpadding.setZ;
        int i2 = 0;
        if (setcompatelevationArr != null) {
            double d = MenuHostHelper$$ExternalSyntheticLambda1;
            setcompatelevationArr[0].MenuHostHelper$$ExternalSyntheticLambda1(d, seticonstartpadding.setCenterIfNoTextEnabled);
            seticonstartpadding.setZ[0].setX(d, seticonstartpadding.setUnboundedRipple);
            float f4 = seticonstartpadding.setGuidelinePercent[0];
            while (true) {
                dArr = seticonstartpadding.setCenterIfNoTextEnabled;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = dArr[i2] * f4;
                i2++;
            }
            setCompatElevation setcompatelevation = seticonstartpadding.MenuHostHelper$$ExternalSyntheticLambda0;
            if (setcompatelevation != null) {
                double[] dArr2 = seticonstartpadding.setUnboundedRipple;
                if (dArr2.length > 0) {
                    setcompatelevation.setX(d, dArr2);
                    seticonstartpadding.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(d, seticonstartpadding.setCenterIfNoTextEnabled);
                    setDivider setdivider = seticonstartpadding.setLayoutDirection;
                    setDivider.MenuHostHelper$$ExternalSyntheticLambda1(f2, f3, fArr, seticonstartpadding.setIconSize, seticonstartpadding.setCenterIfNoTextEnabled, seticonstartpadding.setUnboundedRipple);
                }
            } else {
                setDivider setdivider2 = seticonstartpadding.setLayoutDirection;
                setDivider.MenuHostHelper$$ExternalSyntheticLambda1(f2, f3, fArr, seticonstartpadding.setIconSize, dArr, seticonstartpadding.setUnboundedRipple);
            }
        } else {
            float f5 = seticonstartpadding.setUiOptions.setTextScaleX - seticonstartpadding.setLayoutDirection.setTextScaleX;
            float f6 = seticonstartpadding.setUiOptions.setZ - seticonstartpadding.setLayoutDirection.setZ;
            float f7 = seticonstartpadding.setUiOptions.setIconSize;
            float f8 = seticonstartpadding.setLayoutDirection.setIconSize;
            float f9 = seticonstartpadding.setUiOptions.setX;
            float f10 = seticonstartpadding.setLayoutDirection.setX;
            fArr[0] = ((1.0f - f2) * f5) + (((f7 - f8) + f5) * f2);
            fArr[1] = ((1.0f - f3) * f6) + (((f9 - f10) + f6) * f3);
        }
        float y = view.getY();
        this.setIconified = f;
        this.FragmentStateAdapter$5 = y;
    }

    public final void setTransitionListener(setLayoutAnimation setlayoutanimation) {
        this.setTextAppearanceResource = setlayoutanimation;
    }

    private void setUiOptions() {
        CopyOnWriteArrayList<setLayoutAnimation> copyOnWriteArrayList;
        if ((this.setTextAppearanceResource == null && ((copyOnWriteArrayList = this.setGuidelinePercent) == null || copyOnWriteArrayList.isEmpty())) || this.getCallingPid == this.setChipTextResource) {
            return;
        }
        if (this.onActivityResumed != -1) {
            setLayoutAnimation setlayoutanimation = this.setTextAppearanceResource;
            CopyOnWriteArrayList<setLayoutAnimation> copyOnWriteArrayList2 = this.setGuidelinePercent;
            if (copyOnWriteArrayList2 != null) {
                Iterator<setLayoutAnimation> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            this.setImageTintMode = true;
        }
        this.onActivityResumed = -1;
        this.getCallingPid = this.setChipTextResource;
        setLayoutAnimation setlayoutanimation2 = this.setTextAppearanceResource;
        CopyOnWriteArrayList<setLayoutAnimation> copyOnWriteArrayList3 = this.setGuidelinePercent;
        if (copyOnWriteArrayList3 != null) {
            Iterator<setLayoutAnimation> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        this.setImageTintMode = true;
    }

    private void setLayoutAnimation() {
        int i;
        CopyOnWriteArrayList<setLayoutAnimation> copyOnWriteArrayList;
        if ((this.setTextAppearanceResource != null || ((copyOnWriteArrayList = this.setGuidelinePercent) != null && !copyOnWriteArrayList.isEmpty())) && this.onActivityResumed == -1) {
            this.onActivityResumed = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (this.setRowOrderPreserved.isEmpty()) {
                i = -1;
            } else {
                ArrayList<Integer> arrayList = this.setRowOrderPreserved;
                i = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (i != i2 && i2 != -1) {
                this.setRowOrderPreserved.add(Integer.valueOf(i2));
            }
        }
        setOnLongClickListener();
        Runnable runnable = this.setCenterIfNoTextEnabled;
        if (runnable != null) {
            runnable.run();
        }
    }

    private void setOnLongClickListener() {
        CopyOnWriteArrayList<setLayoutAnimation> copyOnWriteArrayList;
        if (this.setTextAppearanceResource == null && ((copyOnWriteArrayList = this.setGuidelinePercent) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.setImageTintMode = false;
        Iterator<Integer> it = this.setRowOrderPreserved.iterator();
        while (it.hasNext()) {
            it.next();
            CopyOnWriteArrayList<setLayoutAnimation> copyOnWriteArrayList2 = this.setGuidelinePercent;
            if (copyOnWriteArrayList2 != null) {
                Iterator<setLayoutAnimation> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        }
        this.setRowOrderPreserved.clear();
    }

    @Override // o.setMIndicatorOptions, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof FirebaseApp) {
            FirebaseApp firebaseApp = (FirebaseApp) view;
            if (this.setGuidelinePercent == null) {
                this.setGuidelinePercent = new CopyOnWriteArrayList<>();
            }
            this.setGuidelinePercent.add(firebaseApp);
            if (firebaseApp.setX) {
                if (this.ActionMenuPresenter$SavedState$1 == null) {
                    this.ActionMenuPresenter$SavedState$1 = new ArrayList<>();
                }
                this.ActionMenuPresenter$SavedState$1.add(firebaseApp);
            }
            if (firebaseApp.setY) {
                if (this.Fragment$5 == null) {
                    this.Fragment$5 = new ArrayList<>();
                }
                this.Fragment$5.add(firebaseApp);
            }
        }
    }

    @Override // o.setMIndicatorOptions, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<FirebaseApp> arrayList = this.ActionMenuPresenter$SavedState$1;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<FirebaseApp> arrayList2 = this.Fragment$5;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void setOnShow(float f) {
        ArrayList<FirebaseApp> arrayList = this.ActionMenuPresenter$SavedState$1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.ActionMenuPresenter$SavedState$1.get(i).setProgress(f);
            }
        }
    }

    public final void setOnHide(float f) {
        ArrayList<FirebaseApp> arrayList = this.Fragment$5;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.Fragment$5.get(i).setProgress(f);
            }
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
        setOnRatingBarChangeListener setonratingbarchangelistener = this.setMaxEms;
        if (setonratingbarchangelistener != null) {
            setonratingbarchangelistener.setY.put(i, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
        }
        setY sety = this.setRevealInfo;
        setButtonTintBlendMode setbuttontintblendmode = this.ExtendableSavedState$1;
        sety.setY(this.setMaxEms.setX(this.setY), this.setMaxEms.setX(this.MenuHostHelper$$ExternalSyntheticLambda1));
        this.setRevealInfo.setIconTintList();
        invalidate();
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == i) {
            withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setIconTintList(this);
        }
    }

    public final void setTransitionDuration(int i) {
        setOnRatingBarChangeListener setonratingbarchangelistener = this.setMaxEms;
        if (setonratingbarchangelistener == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        setOnRatingBarChangeListener.setIconTintList seticontintlist = setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda0;
        if (seticontintlist == null) {
            setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        } else {
            seticontintlist.setNavigationOnClickListener = Math.max(i, 8);
        }
    }

    public final void setInteractionEnabled(boolean z) {
        this.setLayoutAnimation = z;
    }

    public final void setDelayedApplicationOfInitialState(boolean z) {
        this.setSuffixText = z;
    }

    static /* synthetic */ void setIconTintList(setSubtitle setsubtitle) {
        int childCount = setsubtitle.getChildCount();
        setsubtitle.setRevealInfo.MenuHostHelper$$ExternalSyntheticLambda1();
        boolean z = true;
        setsubtitle.setFloatValues = true;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = setsubtitle.getChildAt(i2);
            sparseArray.put(childAt.getId(), setsubtitle.setUnboundedRipple.get(childAt));
        }
        int width = setsubtitle.getWidth();
        int height = setsubtitle.getHeight();
        setOnRatingBarChangeListener.setIconTintList seticontintlist = setsubtitle.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0;
        int i3 = seticontintlist != null ? seticontintlist.ViewPager$SavedState$1 : -1;
        if (i3 != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                setIconStartPadding seticonstartpadding = setsubtitle.setUnboundedRipple.get(setsubtitle.getChildAt(i4));
                if (seticonstartpadding != null) {
                    seticonstartpadding.setAnimationFromJson = i3;
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[setsubtitle.setUnboundedRipple.size()];
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            setIconStartPadding seticonstartpadding2 = setsubtitle.setUnboundedRipple.get(setsubtitle.getChildAt(i6));
            if (seticonstartpadding2.setLayoutDirection.setIconTintList != -1) {
                sparseBooleanArray.put(seticonstartpadding2.setLayoutDirection.setIconTintList, true);
                iArr[i5] = seticonstartpadding2.setLayoutDirection.setIconTintList;
                i5++;
            }
        }
        ArrayList<FirebaseApp> arrayList = setsubtitle.setContentScrimResource;
        for (int i7 = 0; i7 < i5; i7++) {
            setIconStartPadding seticonstartpadding3 = setsubtitle.setUnboundedRipple.get(setsubtitle.findViewById(iArr[i7]));
            if (seticonstartpadding3 != null) {
                setsubtitle.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0(seticonstartpadding3);
                float f = setsubtitle.setDelayedApplicationOfInitialState;
                seticonstartpadding3.setY(width, height, System.nanoTime());
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt2 = setsubtitle.getChildAt(i8);
            setIconStartPadding seticonstartpadding4 = setsubtitle.setUnboundedRipple.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && seticonstartpadding4 != null) {
                setsubtitle.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0(seticonstartpadding4);
                float f2 = setsubtitle.setDelayedApplicationOfInitialState;
                seticonstartpadding4.setY(width, height, System.nanoTime());
            }
        }
        setOnRatingBarChangeListener.setIconTintList seticontintlist2 = setsubtitle.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0;
        float f3 = seticontintlist2 != null ? seticontintlist2.setAnimationFromJson : 0.0f;
        if (f3 != 0.0f) {
            boolean z2 = ((double) f3) < 0.0d;
            float abs = Math.abs(f3);
            float f4 = -3.4028235E38f;
            float f5 = Float.MAX_VALUE;
            int i9 = 0;
            float f6 = Float.MAX_VALUE;
            float f7 = -3.4028235E38f;
            while (true) {
                if (i9 >= childCount) {
                    z = false;
                    break;
                }
                setIconStartPadding seticonstartpadding5 = setsubtitle.setUnboundedRipple.get(setsubtitle.getChildAt(i9));
                if (!Float.isNaN(seticonstartpadding5.setMaxEms)) {
                    break;
                }
                float f8 = seticonstartpadding5.setUiOptions.setTextScaleX;
                float f9 = seticonstartpadding5.setUiOptions.setZ;
                float f10 = z2 ? f9 - f8 : f9 + f8;
                f6 = Math.min(f6, f10);
                f7 = Math.max(f7, f10);
                i9++;
            }
            if (!z) {
                while (i < childCount) {
                    setIconStartPadding seticonstartpadding6 = setsubtitle.setUnboundedRipple.get(setsubtitle.getChildAt(i));
                    float f11 = seticonstartpadding6.setUiOptions.setTextScaleX;
                    float f12 = seticonstartpadding6.setUiOptions.setZ;
                    float f13 = z2 ? f12 - f11 : f12 + f11;
                    seticonstartpadding6.setCheckedIconEnabled = 1.0f / (1.0f - abs);
                    seticonstartpadding6.setOnNavigationItemSelectedListener = abs - (((f13 - f6) * abs) / (f7 - f6));
                    i++;
                }
                return;
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                setIconStartPadding seticonstartpadding7 = setsubtitle.setUnboundedRipple.get(setsubtitle.getChildAt(i10));
                if (!Float.isNaN(seticonstartpadding7.setMaxEms)) {
                    f5 = Math.min(f5, seticonstartpadding7.setMaxEms);
                    f4 = Math.max(f4, seticonstartpadding7.setMaxEms);
                }
            }
            while (i < childCount) {
                setIconStartPadding seticonstartpadding8 = setsubtitle.setUnboundedRipple.get(setsubtitle.getChildAt(i));
                if (!Float.isNaN(seticonstartpadding8.setMaxEms)) {
                    seticonstartpadding8.setCheckedIconEnabled = 1.0f / (1.0f - abs);
                    if (z2) {
                        seticonstartpadding8.setOnNavigationItemSelectedListener = abs - (((f4 - seticonstartpadding8.setMaxEms) / (f4 - f5)) * abs);
                    } else {
                        seticonstartpadding8.setOnNavigationItemSelectedListener = abs - (((seticonstartpadding8.setMaxEms - f5) * abs) / (f4 - f5));
                    }
                }
                i++;
            }
        }
    }

    static /* synthetic */ Rect setY(setSubtitle setsubtitle, setVisibility setvisibility) {
        setsubtitle.setEdgeEffectFactory.top = setvisibility.setTextAlignment();
        setsubtitle.setEdgeEffectFactory.left = setvisibility.setCenterIfNoTextEnabled();
        setsubtitle.setEdgeEffectFactory.right = (setvisibility.setFilterRedundantCalls == 8 ? 0 : setvisibility.setHint) + setsubtitle.setEdgeEffectFactory.left;
        setsubtitle.setEdgeEffectFactory.bottom = (setvisibility.setFilterRedundantCalls != 8 ? setvisibility.setTextScaleX : 0) + setsubtitle.setEdgeEffectFactory.top;
        return setsubtitle.setEdgeEffectFactory;
    }

    @Override // o.setDropDownVerticalOffset
    public final void MenuHostHelper$$ExternalSyntheticLambda0(View view, View view2, int i, int i2) {
        this.setErrorIconTintList = System.nanoTime();
        this.RemoteActionCompatParcelizer = 0.0f;
        this.setChipSpacingHorizontal = 0.0f;
        this.setCallingWorkSourceUid = 0.0f;
    }
}