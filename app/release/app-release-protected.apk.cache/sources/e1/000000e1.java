package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import o.FirebaseCommonKtxRegistrar;
import o.FragmentManager$LaunchedFragmentInfo$1;
import o.R;
import o.consumeSystemWindowInsets;
import o.getStrokeAlpha;
import o.pingBinder;
import o.setBaselineAlignBottom;
import o.setBoxCornerRadiiResources;
import o.setBoxCornerRadiiResources$MenuHostHelper$$ExternalSyntheticLambda0;
import o.setContextClickable;
import o.setDividerHeight;
import o.setEnsureMinTouchTargetSize;
import o.setIconTint;
import o.setMax;
import o.setOnCloseIconClickListener;
import o.setScreenReaderFocusable;
import o.setScrollBarDefaultDelayBeforeFade;
import o.setSearchResultHighlightColor;
import o.setSelectionFromTop;
import o.setTitleMargin;
import o.setTransitionVisibility;
import o.setWebViewClient;

/* loaded from: classes.dex */
public final class FloatingActionButton extends setMax implements getStrokeAlpha, FragmentManager$LaunchedFragmentInfo$1, CoordinatorLayout.setX {
    private static final int setLayoutAnimation = 2132083463;
    public setBoxCornerRadiiResources MenuHostHelper$$ExternalSyntheticLambda0;
    public final consumeSystemWindowInsets MenuHostHelper$$ExternalSyntheticLambda1;
    private int ViewPager$SavedState$1;
    private final Rect setAnimationFromJson;
    private int setCenterIfNoTextEnabled;
    private ColorStateList setChipCornerRadius;
    private PorterDuff.Mode setIconSize;
    boolean setIconTintList;
    private ColorStateList setNavigationOnClickListener;
    private ColorStateList setOnNavigationItemSelectedListener;
    private final setSearchResultHighlightColor setTextAlignment;
    private int setTextScaleX;
    private PorterDuff.Mode setUiOptions;
    public int setUnboundedRipple;
    int setX;
    final Rect setY;

    /* loaded from: classes.dex */
    public static abstract class setY {
        public void MenuHostHelper$$ExternalSyntheticLambda0() {
        }

        public void MenuHostHelper$$ExternalSyntheticLambda0(FloatingActionButton floatingActionButton) {
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f0401b2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FloatingActionButton(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public final void setRippleColor(ColorStateList colorStateList) {
        if (this.setOnNavigationItemSelectedListener != colorStateList) {
            this.setOnNavigationItemSelectedListener = colorStateList;
            setY().setY(this.setOnNavigationItemSelectedListener);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setX
    public final CoordinatorLayout.setIconTintList<FloatingActionButton> setX() {
        return new Behavior();
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.setNavigationOnClickListener;
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.setNavigationOnClickListener != colorStateList) {
            this.setNavigationOnClickListener = colorStateList;
            setBoxCornerRadiiResources y = setY();
            setWebViewClient setwebviewclient = y.setIconified;
            if (setwebviewclient != null) {
                setwebviewclient.setTintList(colorStateList);
            }
            setContextClickable setcontextclickable = y.setUnboundedRipple;
            if (setcontextclickable != null) {
                setcontextclickable.setIconTintList(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.setUiOptions;
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.setUiOptions != mode) {
            this.setUiOptions = mode;
            setWebViewClient setwebviewclient = setY().setIconified;
            if (setwebviewclient != null) {
                setwebviewclient.setTintMode(mode);
            }
        }
    }

    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public final void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.setChipCornerRadius != colorStateList) {
            this.setChipCornerRadius = colorStateList;
            MenuHostHelper$$ExternalSyntheticLambda0();
        }
    }

    public final void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.setIconSize != mode) {
            this.setIconSize = mode;
            MenuHostHelper$$ExternalSyntheticLambda0();
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.setChipCornerRadius;
        if (colorStateList == null) {
            setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda0(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.setIconSize;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(setSelectionFromTop.setX(colorForState, mode));
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.setTextAlignment.MenuHostHelper$$ExternalSyntheticLambda1(i);
        MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            setBoxCornerRadiiResources y = setY();
            float f = y.setZ;
            y.setZ = f;
            Matrix matrix = y.ExtendableSavedState$1;
            y.setIconTintList(f, matrix);
            y.FragmentStateAdapter$2.setImageMatrix(matrix);
            if (this.setChipCornerRadius != null) {
                MenuHostHelper$$ExternalSyntheticLambda0();
            }
        }
    }

    @Override // o.FragmentManager$LaunchedFragmentInfo$1
    public final void setShapeAppearanceModel(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        setY().MenuHostHelper$$ExternalSyntheticLambda1(setscrollbardefaultdelaybeforefade);
    }

    public final void setEnsureMinTouchTargetSize(boolean z) {
        if (z != setY().ViewPager$SavedState$1) {
            setY().ViewPager$SavedState$1 = z;
            requestLayout();
        }
    }

    @Override // o.setMax, android.widget.ImageView, android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
    }

    public final void setMaxImageSize(int i) {
        this.setTextScaleX = i;
        setBoxCornerRadiiResources y = setY();
        if (y.setMaxEms != i) {
            y.setMaxEms = i;
            float f = y.setZ;
            y.setZ = f;
            Matrix matrix = y.ExtendableSavedState$1;
            y.setIconTintList(f, matrix);
            y.FragmentStateAdapter$2.setImageMatrix(matrix);
        }
    }

    @Override // o.setThumbTintBlendMode
    public final boolean setIconTintList() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.setX;
    }

    public final void setExpandedComponentIdHint(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1 = i;
    }

    public final void setUseCompatPadding(boolean z) {
        if (this.setIconTintList != z) {
            this.setIconTintList = z;
            setY().setUiOptions();
        }
    }

    public final void setSize(int i) {
        this.ViewPager$SavedState$1 = 0;
        if (i != this.setUnboundedRipple) {
            this.setUnboundedRipple = i;
            requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements setBoxCornerRadiiResources.setIconTintList {
        private /* synthetic */ setY setIconTintList;

        public AnonymousClass1(setY sety) {
            this.setIconTintList = sety;
        }

        @Override // o.setBoxCornerRadiiResources.setIconTintList
        public final void setY() {
            this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0();
        }

        @Override // o.setBoxCornerRadiiResources.setIconTintList
        public final void MenuHostHelper$$ExternalSyntheticLambda1() {
            this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(FloatingActionButton.this);
        }
    }

    public final void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.ViewPager$SavedState$1) {
            this.ViewPager$SavedState$1 = i;
            requestLayout();
        }
    }

    public final int setIconTintList(int i) {
        int i2 = this.ViewPager$SavedState$1;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i == 1) {
                return resources.getDimensionPixelSize(R.dimen.res_0x7f070071);
            }
            return resources.getDimensionPixelSize(R.dimen.res_0x7f070072);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return setIconTintList(1);
        } else {
            return setIconTintList(0);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final setBoxCornerRadiiResources y = setY();
        setWebViewClient setwebviewclient = y.setIconified;
        if (setwebviewclient != null) {
            FloatingActionButton floatingActionButton = y.FragmentStateAdapter$2;
            if (setwebviewclient.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0 != null && setwebviewclient.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList) {
                setwebviewclient.ViewPager$SavedState$1(setTitleMargin.setX(floatingActionButton));
            }
        }
        if (y.setNavigationOnClickListener()) {
            ViewTreeObserver viewTreeObserver = y.FragmentStateAdapter$2.getViewTreeObserver();
            if (y.setTextScaleX == null) {
                y.setTextScaleX = new ViewTreeObserver.OnPreDrawListener() { // from class: o.setBoxCornerRadiiResources.10
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        setBoxCornerRadiiResources setboxcornerradiiresources = setBoxCornerRadiiResources.this;
                        float rotation = setboxcornerradiiresources.FragmentStateAdapter$2.getRotation();
                        if (setboxcornerradiiresources.setCheckedIconEnabled != rotation) {
                            setboxcornerradiiresources.setCheckedIconEnabled = rotation;
                            setboxcornerradiiresources.setCenterIfNoTextEnabled();
                            return true;
                        }
                        return true;
                    }
                };
            }
            viewTreeObserver.addOnPreDrawListener(y.setTextScaleX);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBoxCornerRadiiResources y = setY();
        ViewTreeObserver viewTreeObserver = y.FragmentStateAdapter$2.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = y.setTextScaleX;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            y.setTextScaleX = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        setY().setY(getDrawableState());
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        setY().setIconTintList();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        setTransitionVisibility settransitionvisibility = new setTransitionVisibility(onSaveInstanceState);
        setDividerHeight<String, Bundle> setdividerheight = settransitionvisibility.MenuHostHelper$$ExternalSyntheticLambda0;
        consumeSystemWindowInsets consumesystemwindowinsets = this.MenuHostHelper$$ExternalSyntheticLambda1;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", consumesystemwindowinsets.setX);
        bundle.putInt("expandedComponentIdHint", consumesystemwindowinsets.MenuHostHelper$$ExternalSyntheticLambda1);
        setdividerheight.put("expandableWidgetHelper", bundle);
        return settransitionvisibility;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof setTransitionVisibility)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        setTransitionVisibility settransitionvisibility = (setTransitionVisibility) parcelable;
        super.onRestoreInstanceState(settransitionvisibility.setUiOptions);
        consumeSystemWindowInsets consumesystemwindowinsets = this.MenuHostHelper$$ExternalSyntheticLambda1;
        Bundle bundle = settransitionvisibility.MenuHostHelper$$ExternalSyntheticLambda0.get("expandableWidgetHelper");
        consumesystemwindowinsets.setX = bundle.getBoolean("expanded", false);
        consumesystemwindowinsets.MenuHostHelper$$ExternalSyntheticLambda1 = bundle.getInt("expandedComponentIdHint", 0);
        if (consumesystemwindowinsets.setX) {
            ViewParent parent = consumesystemwindowinsets.MenuHostHelper$$ExternalSyntheticLambda0.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).MenuHostHelper$$ExternalSyntheticLambda1(consumesystemwindowinsets.MenuHostHelper$$ExternalSyntheticLambda0);
            }
        }
    }

    public final void setX(Rect rect) {
        rect.left += this.setY.left;
        rect.top += this.setY.top;
        rect.right -= this.setY.right;
        rect.bottom -= this.setY.bottom;
    }

    private static int setX(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return size;
                }
                throw new IllegalArgumentException();
            }
            return i;
        }
        return Math.min(i, size);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            Rect rect = this.setAnimationFromJson;
            if (setBaselineAlignBottom.setConstraintSet(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                setX(rect);
                z = true;
            } else {
                z = false;
            }
            if (z && !this.setAnimationFromJson.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final /* bridge */ /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) {
            super.MenuHostHelper$$ExternalSyntheticLambda1(coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public final /* bridge */ /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.MenuHostHelper$$ExternalSyntheticLambda1(coordinatorLayout, floatingActionButton, i);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public final /* bridge */ /* synthetic */ boolean setX(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.MenuHostHelper$$ExternalSyntheticLambda1(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public final /* bridge */ /* synthetic */ boolean setY(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.setX(coordinatorLayout, floatingActionButton, rect);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.setIconTintList<T> {
        private Rect MenuHostHelper$$ExternalSyntheticLambda0;
        private boolean MenuHostHelper$$ExternalSyntheticLambda1;
        private setY setX;

        public BaseBehavior() {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setIconTint.setIconTintList.setAnimationFromJson);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public void MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) {
            if (coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setY == 0) {
                coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setY = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        /* renamed from: setX */
        public boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                setX(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 ? ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) layoutParams).setUnboundedRipple instanceof BottomSheetBehavior : false) {
                    MenuHostHelper$$ExternalSyntheticLambda0(view, floatingActionButton);
                }
            }
            return false;
        }

        private boolean setIconTintList(View view, FloatingActionButton floatingActionButton) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1 && ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) floatingActionButton.getLayoutParams()).setNavigationOnClickListener == view.getId() && floatingActionButton.setOnLongClickListener == 0;
        }

        private boolean setX(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (setIconTintList((View) appBarLayout, floatingActionButton)) {
                if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = new Rect();
                }
                Rect rect = this.MenuHostHelper$$ExternalSyntheticLambda0;
                rect.set(0, 0, appBarLayout.getWidth(), appBarLayout.getHeight());
                pingBinder.MenuHostHelper$$ExternalSyntheticLambda0(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.MenuHostHelper$$ExternalSyntheticLambda1()) {
                    setY sety = this.setX;
                    floatingActionButton.setY().setY(sety != null ? new AnonymousClass1(sety) : null, false);
                    return true;
                }
                setY sety2 = this.setX;
                floatingActionButton.setY().setIconTintList((setBoxCornerRadiiResources.setIconTintList) (sety2 != null ? new AnonymousClass1(sety2) : null), false);
                return true;
            }
            return false;
        }

        private boolean MenuHostHelper$$ExternalSyntheticLambda0(View view, FloatingActionButton floatingActionButton) {
            if (setIconTintList(view, floatingActionButton)) {
                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) floatingActionButton.getLayoutParams())).topMargin) {
                    setY sety = this.setX;
                    floatingActionButton.setY().setY(sety != null ? new AnonymousClass1(sety) : null, false);
                    return true;
                }
                setY sety2 = this.setX;
                floatingActionButton.setY().setIconTintList((setBoxCornerRadiiResources.setIconTintList) (sety2 != null ? new AnonymousClass1(sety2) : null), false);
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            int i2;
            List<View> MenuHostHelper$$ExternalSyntheticLambda0 = coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda0(floatingActionButton);
            int size = MenuHostHelper$$ExternalSyntheticLambda0.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                View view = MenuHostHelper$$ExternalSyntheticLambda0.get(i4);
                if (view instanceof AppBarLayout) {
                    if (setX(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 ? ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) layoutParams).setUnboundedRipple instanceof BottomSheetBehavior : false) && MenuHostHelper$$ExternalSyntheticLambda0(view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda1(floatingActionButton, i);
            Rect rect = floatingActionButton.setY;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).rightMargin) {
                i2 = rect.right;
            } else {
                i2 = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).bottomMargin) {
                i3 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).topMargin) {
                i3 = -rect.top;
            }
            if (i3 != 0) {
                setBaselineAlignBottom.setX(floatingActionButton, i3);
            }
            if (i2 != 0) {
                setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda1(floatingActionButton, i2);
                return true;
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        /* renamed from: setY */
        public boolean setX(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.setY;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        setWebViewClient setwebviewclient = setY().setIconified;
        if (setwebviewclient != null) {
            setwebviewclient.setIconSize(f);
        }
    }

    public final void setCompatElevation(float f) {
        setBoxCornerRadiiResources y = setY();
        if (y.setCenterIfNoTextEnabled != f) {
            y.setCenterIfNoTextEnabled = f;
            y.MenuHostHelper$$ExternalSyntheticLambda0(f, y.setOnNavigationItemSelectedListener, y.setTextAppearanceResource);
        }
    }

    public final void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public final void setCompatHoveredFocusedTranslationZ(float f) {
        setBoxCornerRadiiResources y = setY();
        if (y.setOnNavigationItemSelectedListener != f) {
            y.setOnNavigationItemSelectedListener = f;
            y.MenuHostHelper$$ExternalSyntheticLambda0(y.setCenterIfNoTextEnabled, f, y.setTextAppearanceResource);
        }
    }

    public final void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public final void setCompatPressedTranslationZ(float f) {
        setBoxCornerRadiiResources y = setY();
        if (y.setTextAppearanceResource != f) {
            y.setTextAppearanceResource = f;
            y.MenuHostHelper$$ExternalSyntheticLambda0(y.setCenterIfNoTextEnabled, y.setOnNavigationItemSelectedListener, f);
        }
    }

    public final void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public final void setShowMotionSpec(FirebaseCommonKtxRegistrar firebaseCommonKtxRegistrar) {
        setY().SearchView$SavedState$1 = firebaseCommonKtxRegistrar;
    }

    public final void setShowMotionSpecResource(int i) {
        setShowMotionSpec(FirebaseCommonKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1(getContext(), i));
    }

    public final void setHideMotionSpec(FirebaseCommonKtxRegistrar firebaseCommonKtxRegistrar) {
        setY().setTextAlignment = firebaseCommonKtxRegistrar;
    }

    public final void setHideMotionSpecResource(int i) {
        setHideMotionSpec(FirebaseCommonKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1(getContext(), i));
    }

    /* loaded from: classes.dex */
    public class setIconTintList<T extends FloatingActionButton> implements setBoxCornerRadiiResources$MenuHostHelper$$ExternalSyntheticLambda0 {
        private final setScreenReaderFocusable<T> setY;

        public setIconTintList(setScreenReaderFocusable<T> setscreenreaderfocusable) {
            this.setY = setscreenreaderfocusable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.setBoxCornerRadiiResources$MenuHostHelper$$ExternalSyntheticLambda0
        public final void setX() {
            this.setY.MenuHostHelper$$ExternalSyntheticLambda1(FloatingActionButton.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.setBoxCornerRadiiResources$MenuHostHelper$$ExternalSyntheticLambda0
        public final void setY() {
            this.setY.setY(FloatingActionButton.this);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof setIconTintList) && ((setIconTintList) obj).setY.equals(this.setY);
        }

        public final int hashCode() {
            return this.setY.hashCode();
        }
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        setY().setOnLongClickListener();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        setY().setOnLongClickListener();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        setY().setOnLongClickListener();
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        super.setScaleX(f);
        setY().setUnboundedRipple();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        super.setScaleY(f);
        setY().setUnboundedRipple();
    }

    public final void setShadowPaddingEnabled(boolean z) {
        setBoxCornerRadiiResources y = setY();
        y.setMinAndMaxProgress = z;
        y.setChipCornerRadius();
    }

    setBoxCornerRadiiResources setY() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new setOnCloseIconClickListener(this, new FloatingActionButton$MenuHostHelper$$ExternalSyntheticLambda1(this));
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iconTintList = setIconTintList(this.setUnboundedRipple);
        this.setX = (iconTintList - this.setTextScaleX) / 2;
        setY().setChipCornerRadius();
        int min = Math.min(setX(iconTintList, i), setX(iconTintList, i2));
        setMeasuredDimension(this.setY.left + min + this.setY.right, min + this.setY.top + this.setY.bottom);
    }
}