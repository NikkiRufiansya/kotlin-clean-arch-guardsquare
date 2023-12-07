package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton$MenuHostHelper$$ExternalSyntheticLambda1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o.R;
import o.setBaselineAlignBottom;
import o.setBoxCornerRadiiResources;
import o.setCardElevation;
import o.setChipMinHeight;
import o.setEnsureMinTouchTargetSize;
import o.setOnCloseIconClickListener;
import o.setOnSeekBarChangeListener;
import o.setOrientation;
import o.setScreenReaderFocusable;
import o.setTextInputAccessibilityDelegate;
import o.setTitleMargin;
import o.setTranscriptMode;
import o.setWebViewClient;

/* loaded from: classes.dex */
public final class BottomAppBar extends setTranscriptMode implements CoordinatorLayout.setX {
    private static final int FragmentStateAdapter$2 = 2132083630;
    private static final int FragmentStateAdapter$5 = 2130969330;
    private static final int setObjectValues = 2130969346;
    final boolean ExtendableSavedState$1;
    int FloatingActionButton$BaseBehavior;
    Animator SearchView$SavedState$1;
    private int setAdapter;
    int setAnimationFromJson;
    boolean setCheckedIconEnabled;
    ArrayList<Object> setChipCornerRadius;
    private Integer setChipIconEnabled;
    final boolean setChipIconTintResource;
    final boolean setConstraintSet;
    int setContentScrimResource;
    private int setFilterTouchesWhenObscured;
    setScreenReaderFocusable<FloatingActionButton> setGuidelinePercent;
    final boolean setHasDecor;
    int setIconSize;
    Animator setIconified;
    boolean setLayoutDirection;
    AnimatorListenerAdapter setMaxEms;
    int setMinAndMaxProgress;
    final int setOnNavigationItemSelectedListener;
    private int setSuffixText;
    int setTextAlignment;
    final setWebViewClient setTextAppearanceResource;
    boolean setTextScaleX;
    private Behavior setViewTranslationCallback;
    int setZ;

    @Override // o.setTranscriptMode
    public final void setSubtitle(CharSequence charSequence) {
    }

    @Override // o.setTranscriptMode
    public final void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(Context context) {
        this(context, null);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f040065);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BottomAppBar(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void setNavigationIconTint(int i) {
        this.setChipIconEnabled = Integer.valueOf(i);
        Drawable uiOptions = setUiOptions();
        if (uiOptions != null) {
            setNavigationIcon(uiOptions);
        }
    }

    public final void setFabAlignmentMode(int i) {
        setFabAlignmentModeAndReplaceMenu(i, 0);
    }

    public final void setFabAlignmentModeAndReplaceMenu(final int i, int i2) {
        this.FloatingActionButton$BaseBehavior = i2;
        this.setCheckedIconEnabled = true;
        setIconTintList(i, this.setTextScaleX);
        if (this.setZ != i && setBaselineAlignBottom.setConstraintSet(this)) {
            Animator animator = this.SearchView$SavedState$1;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.setAdapter == 1) {
                View iconSize = setIconSize();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(iconSize instanceof FloatingActionButton ? (FloatingActionButton) iconSize : null, "translationX", MenuHostHelper$$ExternalSyntheticLambda1(i));
                Context context = getContext();
                int i3 = FragmentStateAdapter$5;
                TypedValue typedValue = new TypedValue();
                TypedValue typedValue2 = context.getTheme().resolveAttribute(i3, typedValue, true) ? typedValue : null;
                int i4 = 300;
                if (typedValue2 != null && typedValue2.type == 16) {
                    i4 = typedValue2.data;
                }
                ofFloat.setDuration(i4);
                arrayList.add(ofFloat);
            } else {
                View iconSize2 = setIconSize();
                FloatingActionButton floatingActionButton = iconSize2 instanceof FloatingActionButton ? (FloatingActionButton) iconSize2 : null;
                if (floatingActionButton != null) {
                    if (floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                        floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0 = new setOnCloseIconClickListener(floatingActionButton, new FloatingActionButton$MenuHostHelper$$ExternalSyntheticLambda1(floatingActionButton));
                    }
                    if (!floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1()) {
                        this.setTextAlignment++;
                        FloatingActionButton.setY sety = new FloatingActionButton.setY() { // from class: com.google.android.material.bottomappbar.BottomAppBar.2
                            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.setY
                            public final void MenuHostHelper$$ExternalSyntheticLambda0(FloatingActionButton floatingActionButton2) {
                                floatingActionButton2.setTranslationX(BottomAppBar.this.MenuHostHelper$$ExternalSyntheticLambda1(i));
                                FloatingActionButton.setY sety2 = new FloatingActionButton.setY() { // from class: com.google.android.material.bottomappbar.BottomAppBar.2.2
                                    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.setY
                                    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
                                        BottomAppBar bottomAppBar = BottomAppBar.this;
                                        int i5 = bottomAppBar.setTextAlignment - 1;
                                        bottomAppBar.setTextAlignment = i5;
                                        if (i5 == 0) {
                                            ArrayList<Object> arrayList2 = bottomAppBar.setChipCornerRadius;
                                        }
                                    }
                                };
                                if (floatingActionButton2.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                                    floatingActionButton2.MenuHostHelper$$ExternalSyntheticLambda0 = new setOnCloseIconClickListener(floatingActionButton2, new FloatingActionButton$MenuHostHelper$$ExternalSyntheticLambda1(floatingActionButton2));
                                }
                                floatingActionButton2.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList((setBoxCornerRadiiResources.setIconTintList) new FloatingActionButton.AnonymousClass1(sety2), true);
                            }
                        };
                        if (floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                            floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0 = new setOnCloseIconClickListener(floatingActionButton, new FloatingActionButton$MenuHostHelper$$ExternalSyntheticLambda1(floatingActionButton));
                        }
                        floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0.setY(new FloatingActionButton.AnonymousClass1(sety), true);
                    }
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setInterpolator(setChipMinHeight.MenuHostHelper$$ExternalSyntheticLambda0(getContext(), setObjectValues, setCardElevation.setY));
            this.SearchView$SavedState$1 = animatorSet;
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator2) {
                    BottomAppBar bottomAppBar = BottomAppBar.this;
                    int i5 = bottomAppBar.setTextAlignment;
                    bottomAppBar.setTextAlignment = i5 + 1;
                    if (i5 == 0) {
                        ArrayList<Object> arrayList2 = bottomAppBar.setChipCornerRadius;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator2) {
                    BottomAppBar bottomAppBar = BottomAppBar.this;
                    int i5 = bottomAppBar.setTextAlignment - 1;
                    bottomAppBar.setTextAlignment = i5;
                    if (i5 == 0) {
                        ArrayList<Object> arrayList2 = bottomAppBar.setChipCornerRadius;
                    }
                    BottomAppBar.this.SearchView$SavedState$1 = null;
                }
            });
            this.SearchView$SavedState$1.start();
        }
        this.setZ = i;
    }

    public final void setFabAnchorMode(int i) {
        this.setAnimationFromJson = i;
        setOnNavigationItemSelectedListener();
        View iconSize = setIconSize();
        if (iconSize != null) {
            MenuHostHelper$$ExternalSyntheticLambda1(this, iconSize);
            iconSize.requestLayout();
            this.setTextAppearanceResource.invalidateSelf();
        }
    }

    static void MenuHostHelper$$ExternalSyntheticLambda1(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams();
        coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList = 17;
        if (bottomAppBar.setAnimationFromJson == 1) {
            coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList |= 48;
        }
        if (bottomAppBar.setAnimationFromJson == 0) {
            coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList |= 80;
        }
    }

    public final void setFabAnimationMode(int i) {
        this.setAdapter = i;
    }

    public final void setMenuAlignmentMode(int i) {
        if (this.setSuffixText != i) {
            this.setSuffixText = i;
            setOnSeekBarChangeListener z = setZ();
            if (z != null) {
                new AnonymousClass8(z, this.setZ, setMaxEms()).run();
            }
        }
    }

    public final void setBackgroundTint(ColorStateList colorStateList) {
        setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(this.setTextAppearanceResource, colorStateList);
    }

    public final void setFabAlignmentModeEndMargin(int i) {
        if (this.setFilterTouchesWhenObscured != i) {
            this.setFilterTouchesWhenObscured = i;
            setOnNavigationItemSelectedListener();
        }
    }

    public final void setHideOnScroll(boolean z) {
        this.setLayoutDirection = z;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        this.setTextAppearanceResource.setIconSize(f);
        int unboundedRipple = this.setTextAppearanceResource.setUnboundedRipple();
        setWebViewClient setwebviewclient = this.setTextAppearanceResource;
        int cos = (int) (setwebviewclient.setChipIconTintResource.setCenterIfNoTextEnabled * Math.cos(Math.toRadians(setwebviewclient.setChipIconTintResource.setChipCornerRadius)));
        if (this.setViewTranslationCallback == null) {
            this.setViewTranslationCallback = new Behavior();
        }
        Behavior behavior = this.setViewTranslationCallback;
        int i = unboundedRipple - cos;
        behavior.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        if (behavior.MenuHostHelper$$ExternalSyntheticLambda0 == 1) {
            setTranslationY(behavior.setX + i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final android.view.View setIconSize() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.setIconTintList(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.setIconSize():android.view.View");
    }

    final void setIconTintList(final int i, final boolean z) {
        if (!setBaselineAlignBottom.setConstraintSet(this)) {
            this.setCheckedIconEnabled = false;
            int i2 = this.FloatingActionButton$BaseBehavior;
            if (i2 != 0) {
                this.FloatingActionButton$BaseBehavior = 0;
                setIconTintList().clear();
                MenuHostHelper$$ExternalSyntheticLambda0(i2);
                return;
            }
            return;
        }
        Animator animator = this.setIconified;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!setMaxEms()) {
            i = 0;
            z = false;
        }
        final setOnSeekBarChangeListener z2 = setZ();
        if (z2 != null) {
            Context context = getContext();
            int i3 = FragmentStateAdapter$5;
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(i3, typedValue, true)) {
                typedValue = null;
            }
            int i4 = 300;
            if (typedValue != null && typedValue.type == 16) {
                i4 = typedValue.data;
            }
            float f = i4;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z2, "alpha", 1.0f);
            ofFloat.setDuration(0.8f * f);
            if (Math.abs(z2.getTranslationX() - MenuHostHelper$$ExternalSyntheticLambda0(z2, i, z)) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(z2, "alpha", 0.0f);
                ofFloat2.setDuration(f * 0.2f);
                ofFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.7
                    private boolean setY;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator2) {
                        this.setY = true;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator2) {
                        if (this.setY) {
                            return;
                        }
                        boolean z3 = BottomAppBar.this.FloatingActionButton$BaseBehavior != 0;
                        BottomAppBar bottomAppBar = BottomAppBar.this;
                        int i5 = bottomAppBar.FloatingActionButton$BaseBehavior;
                        if (i5 != 0) {
                            bottomAppBar.FloatingActionButton$BaseBehavior = 0;
                            bottomAppBar.setIconTintList().clear();
                            bottomAppBar.MenuHostHelper$$ExternalSyntheticLambda0(i5);
                        }
                        BottomAppBar bottomAppBar2 = BottomAppBar.this;
                        setOnSeekBarChangeListener setonseekbarchangelistener = z2;
                        AnonymousClass8 anonymousClass8 = new AnonymousClass8(setonseekbarchangelistener, i, z);
                        if (z3) {
                            setonseekbarchangelistener.post(anonymousClass8);
                        } else {
                            anonymousClass8.run();
                        }
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(ofFloat2, ofFloat);
                arrayList.add(animatorSet);
            } else if (z2.getAlpha() < 1.0f) {
                arrayList.add(ofFloat);
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        this.setIconified = animatorSet2;
        animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator2) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                int i5 = bottomAppBar.setTextAlignment;
                bottomAppBar.setTextAlignment = i5 + 1;
                if (i5 == 0) {
                    ArrayList<Object> arrayList2 = bottomAppBar.setChipCornerRadius;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator2) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                int i5 = bottomAppBar.setTextAlignment - 1;
                bottomAppBar.setTextAlignment = i5;
                if (i5 == 0) {
                    ArrayList<Object> arrayList2 = bottomAppBar.setChipCornerRadius;
                }
                BottomAppBar.this.setCheckedIconEnabled = false;
                BottomAppBar.this.setIconified = null;
            }
        });
        this.setIconified.start();
    }

    private setOnSeekBarChangeListener setZ() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof setOnSeekBarChangeListener) {
                return (setOnSeekBarChangeListener) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$8  reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass8 implements Runnable {
        private /* synthetic */ setOnSeekBarChangeListener MenuHostHelper$$ExternalSyntheticLambda1;
        private /* synthetic */ boolean setIconTintList;
        private /* synthetic */ int setY;

        AnonymousClass8(setOnSeekBarChangeListener setonseekbarchangelistener, int i, boolean z) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = setonseekbarchangelistener;
            this.setY = i;
            this.setIconTintList = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            setOnSeekBarChangeListener setonseekbarchangelistener = this.MenuHostHelper$$ExternalSyntheticLambda1;
            setonseekbarchangelistener.setTranslationX(BottomAppBar.this.MenuHostHelper$$ExternalSyntheticLambda0(setonseekbarchangelistener, this.setY, this.setIconTintList));
        }
    }

    protected final int MenuHostHelper$$ExternalSyntheticLambda0(setOnSeekBarChangeListener setonseekbarchangelistener, int i, boolean z) {
        int x;
        int i2 = 0;
        if (this.setSuffixText == 1 || (i == 1 && z)) {
            x = setBaselineAlignBottom.setX.setX(this);
            boolean z2 = x == 1;
            int measuredWidth = z2 ? getMeasuredWidth() : 0;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if ((childAt.getLayoutParams() instanceof setTranscriptMode.setIconTintList) && (((setTranscriptMode.setIconTintList) childAt.getLayoutParams()).MenuHostHelper$$ExternalSyntheticLambda1 & 8388615) == 8388611) {
                    if (z2) {
                        measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    } else {
                        measuredWidth = Math.max(measuredWidth, childAt.getRight());
                    }
                }
            }
            int right = z2 ? setonseekbarchangelistener.getRight() : setonseekbarchangelistener.getLeft();
            int i4 = z2 ? this.setContentScrimResource : -this.setMinAndMaxProgress;
            if (setUiOptions() == null) {
                i2 = getResources().getDimensionPixelOffset(R.dimen.res_0x7f0700c0);
                if (!z2) {
                    i2 = -i2;
                }
            }
            return measuredWidth - ((right + i4) + i2);
        }
        return 0;
    }

    @Override // o.setTranscriptMode, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Animator animator = this.setIconified;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.SearchView$SavedState$1;
            if (animator2 != null) {
                animator2.cancel();
            }
            setOnNavigationItemSelectedListener();
        }
        ViewPager$SavedState$1();
    }

    final void ViewPager$SavedState$1() {
        setOnSeekBarChangeListener z = setZ();
        if (z == null || this.setIconified != null) {
            return;
        }
        z.setAlpha(1.0f);
        if (!setMaxEms()) {
            new AnonymousClass8(z, 0, false).run();
        } else {
            new AnonymousClass8(z, this.setZ, this.setTextScaleX).run();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setWebViewClient setwebviewclient = this.setTextAppearanceResource;
        if (setwebviewclient.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0 != null && setwebviewclient.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList) {
            setwebviewclient.ViewPager$SavedState$1(setTitleMargin.setX(this));
        }
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        final Rect setIconTintList;
        WeakReference<BottomAppBar> setNavigationOnClickListener;
        private final View.OnLayoutChangeListener setOnLongClickListener;
        int setUiOptions;

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final /* bridge */ /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.setLayoutDirection && super.MenuHostHelper$$ExternalSyntheticLambda0(coordinatorLayout, bottomAppBar, view2, view3, i, i2);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, View view, int i) {
            final BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.setNavigationOnClickListener = new WeakReference<>(bottomAppBar);
            View iconSize = bottomAppBar.setIconSize();
            if (iconSize != null && !setBaselineAlignBottom.setConstraintSet(iconSize)) {
                BottomAppBar.MenuHostHelper$$ExternalSyntheticLambda1(bottomAppBar, iconSize);
                this.setUiOptions = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) iconSize.getLayoutParams())).bottomMargin;
                if (iconSize instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) iconSize;
                    if (bottomAppBar.setAnimationFromJson == 0 && bottomAppBar.setConstraintSet) {
                        setBaselineAlignBottom.setUnboundedRipple.setIconTintList(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                        floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0 = new setOnCloseIconClickListener(floatingActionButton, new FloatingActionButton$MenuHostHelper$$ExternalSyntheticLambda1(floatingActionButton));
                    }
                    if (floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0.SearchView$SavedState$1 == null) {
                        floatingActionButton.setShowMotionSpecResource(R.animator.res_0x7f02001c);
                    }
                    if (floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                        floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0 = new setOnCloseIconClickListener(floatingActionButton, new FloatingActionButton$MenuHostHelper$$ExternalSyntheticLambda1(floatingActionButton));
                    }
                    if (floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0.setTextAlignment == null) {
                        floatingActionButton.setHideMotionSpecResource(R.animator.res_0x7f02001b);
                    }
                    AnimatorListenerAdapter animatorListenerAdapter = bottomAppBar.setMaxEms;
                    if (floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                        floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0 = new setOnCloseIconClickListener(floatingActionButton, new FloatingActionButton$MenuHostHelper$$ExternalSyntheticLambda1(floatingActionButton));
                    }
                    setBoxCornerRadiiResources setboxcornerradiiresources = floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (setboxcornerradiiresources.setIconSize == null) {
                        setboxcornerradiiresources.setIconSize = new ArrayList<>();
                    }
                    setboxcornerradiiresources.setIconSize.add(animatorListenerAdapter);
                    AnimatorListenerAdapter animatorListenerAdapter2 = new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.6
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            BottomAppBar.this.setMaxEms.onAnimationStart(animator);
                            View iconSize2 = BottomAppBar.this.setIconSize();
                            FloatingActionButton floatingActionButton2 = iconSize2 instanceof FloatingActionButton ? (FloatingActionButton) iconSize2 : null;
                            if (floatingActionButton2 != null) {
                                BottomAppBar bottomAppBar2 = BottomAppBar.this;
                                floatingActionButton2.setTranslationX(bottomAppBar2.MenuHostHelper$$ExternalSyntheticLambda1(bottomAppBar2.setZ));
                            }
                        }
                    };
                    if (floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                        floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0 = new setOnCloseIconClickListener(floatingActionButton, new FloatingActionButton$MenuHostHelper$$ExternalSyntheticLambda1(floatingActionButton));
                    }
                    setBoxCornerRadiiResources setboxcornerradiiresources2 = floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (setboxcornerradiiresources2.setChipIconTintResource == null) {
                        setboxcornerradiiresources2.setChipIconTintResource = new ArrayList<>();
                    }
                    setboxcornerradiiresources2.setChipIconTintResource.add(animatorListenerAdapter2);
                    setScreenReaderFocusable<FloatingActionButton> setscreenreaderfocusable = bottomAppBar.setGuidelinePercent;
                    if (floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                        floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0 = new setOnCloseIconClickListener(floatingActionButton, new FloatingActionButton$MenuHostHelper$$ExternalSyntheticLambda1(floatingActionButton));
                    }
                    setBoxCornerRadiiResources setboxcornerradiiresources3 = floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0;
                    FloatingActionButton.setIconTintList seticontintlist = new FloatingActionButton.setIconTintList(setscreenreaderfocusable);
                    if (setboxcornerradiiresources3.FragmentStateAdapter$5 == null) {
                        setboxcornerradiiresources3.FragmentStateAdapter$5 = new ArrayList<>();
                    }
                    setboxcornerradiiresources3.FragmentStateAdapter$5.add(seticontintlist);
                }
                iconSize.addOnLayoutChangeListener(this.setOnLongClickListener);
                bottomAppBar.setOnNavigationItemSelectedListener();
            }
            coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda1(bottomAppBar, i);
            return super.MenuHostHelper$$ExternalSyntheticLambda1(coordinatorLayout, (CoordinatorLayout) bottomAppBar, i);
        }

        public Behavior() {
            this.setOnLongClickListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.3
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    boolean z;
                    int x;
                    BottomAppBar bottomAppBar = Behavior.this.setNavigationOnClickListener.get();
                    if (bottomAppBar == null || (!((z = view instanceof FloatingActionButton)) && !(view instanceof ExtendedFloatingActionButton))) {
                        view.removeOnLayoutChangeListener(this);
                        return;
                    }
                    int height = view.getHeight();
                    if (z) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        Rect rect = Behavior.this.setIconTintList;
                        rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                        floatingActionButton.setX(rect);
                        height = Behavior.this.setIconTintList.height();
                        float f = height;
                        if (f != ((setTextInputAccessibilityDelegate) bottomAppBar.setTextAppearanceResource.setChipIconTintResource.setTextAlignment.setNavigationOnClickListener).MenuHostHelper$$ExternalSyntheticLambda0) {
                            ((setTextInputAccessibilityDelegate) bottomAppBar.setTextAppearanceResource.setChipIconTintResource.setTextAlignment.setNavigationOnClickListener).MenuHostHelper$$ExternalSyntheticLambda0 = f;
                            bottomAppBar.setTextAppearanceResource.invalidateSelf();
                        }
                        if (floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                            floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0 = new setOnCloseIconClickListener(floatingActionButton, new FloatingActionButton$MenuHostHelper$$ExternalSyntheticLambda1(floatingActionButton));
                        }
                        float y = floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0.setHasDecor.setCenterIfNoTextEnabled.setY(new RectF(Behavior.this.setIconTintList));
                        if (y != ((setTextInputAccessibilityDelegate) bottomAppBar.setTextAppearanceResource.setChipIconTintResource.setTextAlignment.setNavigationOnClickListener).setY) {
                            ((setTextInputAccessibilityDelegate) bottomAppBar.setTextAppearanceResource.setChipIconTintResource.setTextAlignment.setNavigationOnClickListener).setY = y;
                            bottomAppBar.setTextAppearanceResource.invalidateSelf();
                        }
                    }
                    CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams();
                    if (Behavior.this.setUiOptions == 0) {
                        int measuredHeight = (view.getMeasuredHeight() - height) / 2;
                        if (bottomAppBar.setAnimationFromJson == 1) {
                            ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).bottomMargin = bottomAppBar.setIconSize + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.res_0x7f07019f) - measuredHeight);
                        } else if (bottomAppBar.setAnimationFromJson == 0) {
                            ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).bottomMargin = ((bottomAppBar.getMeasuredHeight() + bottomAppBar.setIconSize) - view.getMeasuredHeight()) / 2;
                        }
                        ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).leftMargin = bottomAppBar.setMinAndMaxProgress;
                        ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).rightMargin = bottomAppBar.setContentScrimResource;
                        x = setBaselineAlignBottom.setX.setX(view);
                        if (x == 1) {
                            ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).leftMargin += bottomAppBar.setOnNavigationItemSelectedListener;
                        } else {
                            ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).rightMargin += bottomAppBar.setOnNavigationItemSelectedListener;
                        }
                    }
                }
            };
            this.setIconTintList = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.setOnLongClickListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.3
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    boolean z;
                    int x;
                    BottomAppBar bottomAppBar = Behavior.this.setNavigationOnClickListener.get();
                    if (bottomAppBar == null || (!((z = view instanceof FloatingActionButton)) && !(view instanceof ExtendedFloatingActionButton))) {
                        view.removeOnLayoutChangeListener(this);
                        return;
                    }
                    int height = view.getHeight();
                    if (z) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        Rect rect = Behavior.this.setIconTintList;
                        rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                        floatingActionButton.setX(rect);
                        height = Behavior.this.setIconTintList.height();
                        float f = height;
                        if (f != ((setTextInputAccessibilityDelegate) bottomAppBar.setTextAppearanceResource.setChipIconTintResource.setTextAlignment.setNavigationOnClickListener).MenuHostHelper$$ExternalSyntheticLambda0) {
                            ((setTextInputAccessibilityDelegate) bottomAppBar.setTextAppearanceResource.setChipIconTintResource.setTextAlignment.setNavigationOnClickListener).MenuHostHelper$$ExternalSyntheticLambda0 = f;
                            bottomAppBar.setTextAppearanceResource.invalidateSelf();
                        }
                        if (floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                            floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0 = new setOnCloseIconClickListener(floatingActionButton, new FloatingActionButton$MenuHostHelper$$ExternalSyntheticLambda1(floatingActionButton));
                        }
                        float y = floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0.setHasDecor.setCenterIfNoTextEnabled.setY(new RectF(Behavior.this.setIconTintList));
                        if (y != ((setTextInputAccessibilityDelegate) bottomAppBar.setTextAppearanceResource.setChipIconTintResource.setTextAlignment.setNavigationOnClickListener).setY) {
                            ((setTextInputAccessibilityDelegate) bottomAppBar.setTextAppearanceResource.setChipIconTintResource.setTextAlignment.setNavigationOnClickListener).setY = y;
                            bottomAppBar.setTextAppearanceResource.invalidateSelf();
                        }
                    }
                    CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams();
                    if (Behavior.this.setUiOptions == 0) {
                        int measuredHeight = (view.getMeasuredHeight() - height) / 2;
                        if (bottomAppBar.setAnimationFromJson == 1) {
                            ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).bottomMargin = bottomAppBar.setIconSize + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.res_0x7f07019f) - measuredHeight);
                        } else if (bottomAppBar.setAnimationFromJson == 0) {
                            ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).bottomMargin = ((bottomAppBar.getMeasuredHeight() + bottomAppBar.setIconSize) - view.getMeasuredHeight()) / 2;
                        }
                        ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).leftMargin = bottomAppBar.setMinAndMaxProgress;
                        ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).rightMargin = bottomAppBar.setContentScrimResource;
                        x = setBaselineAlignBottom.setX.setX(view);
                        if (x == 1) {
                            ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).leftMargin += bottomAppBar.setOnNavigationItemSelectedListener;
                        } else {
                            ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).rightMargin += bottomAppBar.setOnNavigationItemSelectedListener;
                        }
                    }
                }
            };
            this.setIconTintList = new Rect();
        }
    }

    @Override // o.setTranscriptMode, android.view.View
    public final Parcelable onSaveInstanceState() {
        setY sety = new setY(super.onSaveInstanceState());
        sety.setX = this.setZ;
        sety.MenuHostHelper$$ExternalSyntheticLambda0 = this.setTextScaleX;
        return sety;
    }

    @Override // o.setTranscriptMode, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof setY)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        setY sety = (setY) parcelable;
        super.onRestoreInstanceState(sety.setUiOptions);
        this.setZ = sety.setX;
        this.setTextScaleX = sety.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* loaded from: classes.dex */
    static class setY extends setOrientation {
        public static final Parcelable.Creator<setY> CREATOR = new Parcelable.ClassLoaderCreator<setY>() { // from class: com.google.android.material.bottomappbar.BottomAppBar$SavedState$1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new BottomAppBar.setY(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* synthetic */ BottomAppBar.setY createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new BottomAppBar.setY(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new BottomAppBar.setY[i];
            }
        };
        boolean MenuHostHelper$$ExternalSyntheticLambda0;
        int setX;

        public setY(Parcelable parcelable) {
            super(parcelable);
        }

        public setY(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.setX = parcel.readInt();
            this.MenuHostHelper$$ExternalSyntheticLambda0 = parcel.readInt() != 0;
        }

        @Override // o.setOrientation, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.setX);
            parcel.writeInt(this.MenuHostHelper$$ExternalSyntheticLambda0 ? 1 : 0);
        }
    }

    final float MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        int x;
        int i2;
        x = setBaselineAlignBottom.setX.setX(this);
        boolean z = x == 1;
        if (i == 1) {
            View iconSize = setIconSize();
            int i3 = z ? this.setMinAndMaxProgress : this.setContentScrimResource;
            if (this.setFilterTouchesWhenObscured != -1 && iconSize != null) {
                i2 = (iconSize.getMeasuredWidth() / 2) + this.setFilterTouchesWhenObscured;
            } else {
                i2 = this.setOnNavigationItemSelectedListener;
            }
            return ((getMeasuredWidth() / 2) - (i3 + i2)) * (z ? -1 : 1);
        }
        return 0.0f;
    }

    private boolean setMaxEms() {
        View iconSize = setIconSize();
        FloatingActionButton floatingActionButton = iconSize instanceof FloatingActionButton ? (FloatingActionButton) iconSize : null;
        if (floatingActionButton != null) {
            if (floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0 = new setOnCloseIconClickListener(floatingActionButton, new FloatingActionButton$MenuHostHelper$$ExternalSyntheticLambda1(floatingActionButton));
            }
            if (floatingActionButton.MenuHostHelper$$ExternalSyntheticLambda0.setX()) {
                return true;
            }
        }
        return false;
    }

    void setOnNavigationItemSelectedListener() {
        ((setTextInputAccessibilityDelegate) this.setTextAppearanceResource.setChipIconTintResource.setTextAlignment.setNavigationOnClickListener).setIconTintList = MenuHostHelper$$ExternalSyntheticLambda1(this.setZ);
        setWebViewClient setwebviewclient = this.setTextAppearanceResource;
        float f = (this.setTextScaleX && setMaxEms() && this.setAnimationFromJson == 1) ? 1.0f : 0.0f;
        if (setwebviewclient.setChipIconTintResource.setUiOptions != f) {
            setwebviewclient.setChipIconTintResource.setUiOptions = f;
            setwebviewclient.FloatingActionButton$BaseBehavior = true;
            setwebviewclient.invalidateSelf();
        }
        View iconSize = setIconSize();
        if (iconSize != null) {
            iconSize.setTranslationY(this.setAnimationFromJson == 1 ? -((setTextInputAccessibilityDelegate) this.setTextAppearanceResource.setChipIconTintResource.setTextAlignment.setNavigationOnClickListener).setX : 0.0f);
            iconSize.setTranslationX(MenuHostHelper$$ExternalSyntheticLambda1(this.setZ));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setX
    public final /* synthetic */ CoordinatorLayout.setIconTintList setX() {
        if (this.setViewTranslationCallback == null) {
            this.setViewTranslationCallback = new Behavior();
        }
        return this.setViewTranslationCallback;
    }

    public final void setCradleVerticalOffset(float f) {
        if (f != ((setTextInputAccessibilityDelegate) this.setTextAppearanceResource.setChipIconTintResource.setTextAlignment.setNavigationOnClickListener).setX) {
            setTextInputAccessibilityDelegate settextinputaccessibilitydelegate = (setTextInputAccessibilityDelegate) this.setTextAppearanceResource.setChipIconTintResource.setTextAlignment.setNavigationOnClickListener;
            if (f < 0.0f) {
                throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
            }
            settextinputaccessibilitydelegate.setX = f;
            this.setTextAppearanceResource.invalidateSelf();
            setOnNavigationItemSelectedListener();
        }
    }

    public final void setFabCradleMargin(float f) {
        if (f != ((setTextInputAccessibilityDelegate) this.setTextAppearanceResource.setChipIconTintResource.setTextAlignment.setNavigationOnClickListener).MenuHostHelper$$ExternalSyntheticLambda1) {
            ((setTextInputAccessibilityDelegate) this.setTextAppearanceResource.setChipIconTintResource.setTextAlignment.setNavigationOnClickListener).MenuHostHelper$$ExternalSyntheticLambda1 = f;
            this.setTextAppearanceResource.invalidateSelf();
        }
    }

    public final void setFabCradleRoundedCornerRadius(float f) {
        if (f != ((setTextInputAccessibilityDelegate) this.setTextAppearanceResource.setChipIconTintResource.setTextAlignment.setNavigationOnClickListener).setOnLongClickListener) {
            ((setTextInputAccessibilityDelegate) this.setTextAppearanceResource.setChipIconTintResource.setTextAlignment.setNavigationOnClickListener).setOnLongClickListener = f;
            this.setTextAppearanceResource.invalidateSelf();
        }
    }

    @Override // o.setTranscriptMode
    public final void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.setChipIconEnabled != null) {
            drawable = setEnsureMinTouchTargetSize.setNavigationOnClickListener(drawable.mutate());
            setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(drawable, this.setChipIconEnabled.intValue());
        }
        super.setNavigationIcon(drawable);
    }
}