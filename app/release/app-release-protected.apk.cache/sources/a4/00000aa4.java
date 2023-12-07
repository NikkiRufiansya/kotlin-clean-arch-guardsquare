package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
import o.setBaselineAlignBottom;
import o.setContentHeight;

/* loaded from: classes.dex */
public final class setContentHeight extends ViewGroup {
    int MenuHostHelper$$ExternalSyntheticLambda0;
    boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private hintOnError ViewPager$SavedState$1;
    private int setAnimationFromJson;
    private Parcelable setCenterIfNoTextEnabled;
    private setOnCapturedPointerListener setChipCornerRadius;
    private setValidator setIconSize;
    setProgressDrawable setIconTintList;
    public WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 setLayoutAnimation;
    private boolean setMaxEms;
    int setNavigationOnClickListener;
    setBackgroundResource setOnLongClickListener;
    private WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener setOnNavigationItemSelectedListener;
    private WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda0 setTextAlignment;
    private final Rect setTextScaleX;
    androidx.recyclerview.widget.LinearLayoutManager setUiOptions;
    boolean setUnboundedRipple;
    public setValidator setX;
    setIconTintList setY;
    private final Rect setZ;

    /* loaded from: classes.dex */
    public interface setUiOptions {
        void setIconTintList(View view, float f);
    }

    /* loaded from: classes.dex */
    public static abstract class setY {
        public void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        }

        public void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        }

        public void setY(int i, float f, int i2) {
        }
    }

    public setContentHeight(Context context) {
        super(context);
        this.setZ = new Rect();
        this.setTextScaleX = new Rect();
        this.setX = new setValidator();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
        this.setTextAlignment = new setContentHeight$MenuHostHelper$$ExternalSyntheticLambda0() { // from class: o.setContentHeight.3
            @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda0
            public final void setY() {
                setContentHeight.this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                setContentHeight.this.setOnLongClickListener.setIconTintList = true;
            }
        };
        this.setAnimationFromJson = -1;
        this.setOnNavigationItemSelectedListener = null;
        this.setMaxEms = false;
        this.setUnboundedRipple = true;
        this.setNavigationOnClickListener = -1;
        setIconTintList(context, null);
    }

    public setContentHeight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setZ = new Rect();
        this.setTextScaleX = new Rect();
        this.setX = new setValidator();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
        this.setTextAlignment = new setContentHeight$MenuHostHelper$$ExternalSyntheticLambda0() { // from class: o.setContentHeight.3
            @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda0
            public final void setY() {
                setContentHeight.this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                setContentHeight.this.setOnLongClickListener.setIconTintList = true;
            }
        };
        this.setAnimationFromJson = -1;
        this.setOnNavigationItemSelectedListener = null;
        this.setMaxEms = false;
        this.setUnboundedRipple = true;
        this.setNavigationOnClickListener = -1;
        setIconTintList(context, attributeSet);
    }

    public setContentHeight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setZ = new Rect();
        this.setTextScaleX = new Rect();
        this.setX = new setValidator();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
        this.setTextAlignment = new setContentHeight$MenuHostHelper$$ExternalSyntheticLambda0() { // from class: o.setContentHeight.3
            @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda0
            public final void setY() {
                setContentHeight.this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                setContentHeight.this.setOnLongClickListener.setIconTintList = true;
            }
        };
        this.setAnimationFromJson = -1;
        this.setOnNavigationItemSelectedListener = null;
        this.setMaxEms = false;
        this.setUnboundedRipple = true;
        this.setNavigationOnClickListener = -1;
        setIconTintList(context, attributeSet);
    }

    private void setIconTintList(Context context, AttributeSet attributeSet) {
        int iconTintList;
        this.setY = new setContentHeight$MenuHostHelper$$ExternalSyntheticLambda1(this);
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation(context);
        this.setLayoutAnimation = setlayoutanimation;
        iconTintList = setBaselineAlignBottom.setX.setIconTintList();
        setlayoutanimation.setId(iconTintList);
        this.setLayoutAnimation.setDescendantFocusability(131072);
        setX setx = new setX(context);
        this.setUiOptions = setx;
        this.setLayoutAnimation.setLayoutManager(setx);
        this.setLayoutAnimation.setScrollingTouchSlop(1);
        MenuHostHelper$$ExternalSyntheticLambda0(context, attributeSet);
        this.setLayoutAnimation.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setLayoutAnimation;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setChipCornerRadius setchipcornerradius = new WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setChipCornerRadius() { // from class: o.setContentHeight.4
            @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setChipCornerRadius
            public final void setY(View view) {
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation setlayoutanimation2 = (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) view.getLayoutParams();
                if (((ViewGroup.LayoutParams) setlayoutanimation2).width != -1 || ((ViewGroup.LayoutParams) setlayoutanimation2).height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        };
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.SearchView$SavedState$1 == null) {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.SearchView$SavedState$1 = new ArrayList();
        }
        windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.SearchView$SavedState$1.add(setchipcornerradius);
        setBackgroundResource setbackgroundresource = new setBackgroundResource(this);
        this.setOnLongClickListener = setbackgroundresource;
        this.setIconTintList = new setProgressDrawable(this, setbackgroundresource, this.setLayoutAnimation);
        setUnboundedRipple setunboundedripple = new setUnboundedRipple();
        this.ViewPager$SavedState$1 = setunboundedripple;
        setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda1(this.setLayoutAnimation);
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = this.setLayoutAnimation;
        setBackgroundResource setbackgroundresource2 = this.setOnLongClickListener;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setSuffixText == null) {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setSuffixText = new ArrayList();
        }
        windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setSuffixText.add(setbackgroundresource2);
        setValidator setvalidator = new setValidator();
        this.setIconSize = setvalidator;
        this.setOnLongClickListener.setX = setvalidator;
        setY sety = new setY() { // from class: o.setContentHeight.1
            @Override // o.setContentHeight.setY
            public final void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
                if (setContentHeight.this.MenuHostHelper$$ExternalSyntheticLambda0 != i) {
                    setContentHeight.this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
                    setContentHeight.this.setY.setIconTintList();
                }
            }

            @Override // o.setContentHeight.setY
            public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
                if (i == 0) {
                    setContentHeight.this.MenuHostHelper$$ExternalSyntheticLambda1();
                }
            }
        };
        setY sety2 = new setY() { // from class: o.setContentHeight.5
            @Override // o.setContentHeight.setY
            public final void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
                setContentHeight.this.clearFocus();
                if (setContentHeight.this.hasFocus()) {
                    setContentHeight.this.setLayoutAnimation.requestFocus(2);
                }
            }
        };
        this.setIconSize.setIconTintList.add(sety);
        this.setIconSize.setIconTintList.add(sety2);
        this.setY.MenuHostHelper$$ExternalSyntheticLambda0(this.setLayoutAnimation);
        setValidator setvalidator2 = this.setIconSize;
        setvalidator2.setIconTintList.add(this.setX);
        setOnCapturedPointerListener setoncapturedpointerlistener = new setOnCapturedPointerListener(this.setUiOptions);
        this.setChipCornerRadius = setoncapturedpointerlistener;
        this.setIconSize.setIconTintList.add(setoncapturedpointerlistener);
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03 = this.setLayoutAnimation;
        attachViewToParent(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03, 0, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.getLayoutParams());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        if (this.setY.MenuHostHelper$$ExternalSyntheticLambda0()) {
            return this.setY.MenuHostHelper$$ExternalSyntheticLambda1();
        }
        return super.getAccessibilityClassName();
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setHttpAuthUsernamePassword$MenuHostHelper$$ExternalSyntheticLambda0.setY);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, setHttpAuthUsernamePassword$MenuHostHelper$$ExternalSyntheticLambda0.setY, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            int i = setHttpAuthUsernamePassword$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1;
            setOrientation(obtainStyledAttributes.getInt(0, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener(super.onSaveInstanceState());
        setnavigationonclicklistener.setY = this.setLayoutAnimation.getId();
        int i = this.setAnimationFromJson;
        if (i == -1) {
            i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        setnavigationonclicklistener.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        Parcelable parcelable = this.setCenterIfNoTextEnabled;
        if (parcelable != null) {
            setnavigationonclicklistener.setIconTintList = parcelable;
        } else {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 = this.setLayoutAnimation.setNavigationOnClickListener;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 instanceof setMin) {
                setnavigationonclicklistener.setIconTintList = ((setMin) windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1).d_();
            }
        }
        return setnavigationonclicklistener;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof setNavigationOnClickListener)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        setNavigationOnClickListener setnavigationonclicklistener = (setNavigationOnClickListener) parcelable;
        super.onRestoreInstanceState(setnavigationonclicklistener.getSuperState());
        this.setAnimationFromJson = setnavigationonclicklistener.MenuHostHelper$$ExternalSyntheticLambda1;
        this.setCenterIfNoTextEnabled = setnavigationonclicklistener.setIconTintList;
    }

    private void setY() {
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1;
        if (this.setAnimationFromJson == -1 || (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 = this.setLayoutAnimation.setNavigationOnClickListener) == null) {
            return;
        }
        if (this.setCenterIfNoTextEnabled != null) {
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 instanceof setMin) {
                setMin setmin = (setMin) windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1;
            }
            this.setCenterIfNoTextEnabled = null;
        }
        int max = Math.max(0, Math.min(this.setAnimationFromJson, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1.setY() - 1));
        this.MenuHostHelper$$ExternalSyntheticLambda0 = max;
        this.setAnimationFromJson = -1;
        this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0(max);
        this.setY.setY();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof setNavigationOnClickListener) {
            int i = ((setNavigationOnClickListener) parcelable).setY;
            sparseArray.put(this.setLayoutAnimation.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        setY();
    }

    /* loaded from: classes.dex */
    public static class setNavigationOnClickListener extends View.BaseSavedState {
        public static final Parcelable.Creator<setNavigationOnClickListener> CREATOR = new Parcelable.ClassLoaderCreator<setNavigationOnClickListener>() { // from class: androidx.viewpager2.widget.ViewPager2$SavedState$1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return Build.VERSION.SDK_INT >= 24 ? new setContentHeight.setNavigationOnClickListener(parcel, null) : new setContentHeight.setNavigationOnClickListener(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ setContentHeight.setNavigationOnClickListener createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new setContentHeight.setNavigationOnClickListener(parcel, classLoader) : new setContentHeight.setNavigationOnClickListener(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new setContentHeight.setNavigationOnClickListener[i];
            }
        };
        int MenuHostHelper$$ExternalSyntheticLambda1;
        Parcelable setIconTintList;
        int setY;

        public setNavigationOnClickListener(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.setY = parcel.readInt();
            this.MenuHostHelper$$ExternalSyntheticLambda1 = parcel.readInt();
            this.setIconTintList = parcel.readParcelable(classLoader);
        }

        public setNavigationOnClickListener(Parcel parcel) {
            super(parcel);
            this.setY = parcel.readInt();
            this.MenuHostHelper$$ExternalSyntheticLambda1 = parcel.readInt();
            this.setIconTintList = parcel.readParcelable(null);
        }

        setNavigationOnClickListener(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.setY);
            parcel.writeInt(this.MenuHostHelper$$ExternalSyntheticLambda1);
            parcel.writeParcelable(this.setIconTintList, i);
        }
    }

    public final void setAdapter(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1) {
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1<?> windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda12 = this.setLayoutAnimation.setNavigationOnClickListener;
        this.setY.setY(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda12);
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda12 != null) {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda12.setX.unregisterObserver(this.setTextAlignment);
        }
        this.setLayoutAnimation.setAdapter(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        setY();
        this.setY.setX(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1);
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1.setX.registerObserver(this.setTextAlignment);
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" does not support direct child views");
        throw new IllegalStateException(sb.toString());
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        measureChild(this.setLayoutAnimation, i, i2);
        int measuredWidth = this.setLayoutAnimation.getMeasuredWidth();
        int measuredHeight = this.setLayoutAnimation.getMeasuredHeight();
        int measuredState = this.setLayoutAnimation.getMeasuredState();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(measuredWidth + paddingLeft + paddingRight, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(measuredHeight + paddingTop + paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.setLayoutAnimation.getMeasuredWidth();
        int measuredHeight = this.setLayoutAnimation.getMeasuredHeight();
        this.setZ.left = getPaddingLeft();
        this.setZ.right = (i3 - i) - getPaddingRight();
        this.setZ.top = getPaddingTop();
        this.setZ.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.setZ, this.setTextScaleX);
        this.setLayoutAnimation.layout(this.setTextScaleX.left, this.setTextScaleX.top, this.setTextScaleX.right, this.setTextScaleX.bottom);
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    final void MenuHostHelper$$ExternalSyntheticLambda1() {
        hintOnError hintonerror = this.ViewPager$SavedState$1;
        if (hintonerror == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View MenuHostHelper$$ExternalSyntheticLambda1 = hintonerror.MenuHostHelper$$ExternalSyntheticLambda1(this.setUiOptions);
        if (MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            return;
        }
        int onLongClickListener = androidx.recyclerview.widget.LinearLayoutManager.setOnLongClickListener(MenuHostHelper$$ExternalSyntheticLambda1);
        if (onLongClickListener != this.MenuHostHelper$$ExternalSyntheticLambda0 && this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
            this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda1(onLongClickListener);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
    }

    final int MenuHostHelper$$ExternalSyntheticLambda0() {
        int height;
        int paddingBottom;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setLayoutAnimation;
        if (this.setUiOptions.setNavigationOnClickListener == 0) {
            height = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getWidth() - windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingLeft();
            paddingBottom = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingRight();
        } else {
            height = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getHeight() - windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingTop();
            paddingBottom = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public final void setOrientation(int i) {
        this.setUiOptions.setIconTintList(i);
        this.setY.setOnLongClickListener();
    }

    public final void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public final void setUserInputEnabled(boolean z) {
        this.setUnboundedRipple = z;
        this.setY.setUnboundedRipple();
    }

    public final void setOffscreenPageLimit(int i) {
        if (i <= 0 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.setNavigationOnClickListener = i;
        this.setLayoutAnimation.requestLayout();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.setLayoutAnimation.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.setLayoutAnimation.canScrollVertically(i);
    }

    public final void setPageTransformer(setUiOptions setuioptions) {
        if (setuioptions != null) {
            if (!this.setMaxEms) {
                this.setOnNavigationItemSelectedListener = this.setLayoutAnimation.setTextScaleX;
                this.setMaxEms = true;
            }
            this.setLayoutAnimation.setItemAnimator(null);
        } else if (this.setMaxEms) {
            this.setLayoutAnimation.setItemAnimator(this.setOnNavigationItemSelectedListener);
            this.setOnNavigationItemSelectedListener = null;
            this.setMaxEms = false;
        }
        if (setuioptions == this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0) {
            return;
        }
        this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0 = setuioptions;
        if (this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            setBackgroundResource setbackgroundresource = this.setOnLongClickListener;
            setbackgroundresource.setY();
            double d = setbackgroundresource.setY.setY + setbackgroundresource.setY.MenuHostHelper$$ExternalSyntheticLambda0;
            int i = (int) d;
            float f = (float) (d - i);
            this.setChipCornerRadius.setY(i, f, Math.round(MenuHostHelper$$ExternalSyntheticLambda0() * f));
        }
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.setY.setX();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.setY.setIconTintList(accessibilityNodeInfo);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.setY.setIconTintList(i)) {
            return this.setY.setX(i);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setLayoutAnimation extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 {
        setLayoutAnimation(Context context) {
            super(context);
        }

        @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            setIconTintList seticontintlist = setContentHeight.this.setY;
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(setContentHeight.this.MenuHostHelper$$ExternalSyntheticLambda0);
            accessibilityEvent.setToIndex(setContentHeight.this.MenuHostHelper$$ExternalSyntheticLambda0);
            setContentHeight.this.setY.MenuHostHelper$$ExternalSyntheticLambda1(accessibilityEvent);
        }

        @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return setContentHeight.this.setUnboundedRipple && super.onTouchEvent(motionEvent);
        }

        @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return setContentHeight.this.setUnboundedRipple && super.onInterceptTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setX extends androidx.recyclerview.widget.LinearLayoutManager {
        @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
        public final boolean MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        setX(Context context) {
        }

        @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
        public final boolean MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, int i, Bundle bundle) {
            setIconTintList seticontintlist = setContentHeight.this.setY;
            return super.MenuHostHelper$$ExternalSyntheticLambda0(setmaxems, setminandmaxprogress, i, bundle);
        }

        @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
        public final void MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, setDecorPadding setdecorpadding) {
            super.MenuHostHelper$$ExternalSyntheticLambda0(setmaxems, setminandmaxprogress, setdecorpadding);
            setIconTintList seticontintlist = setContentHeight.this.setY;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, int[] iArr) {
            int i = setContentHeight.this.setNavigationOnClickListener;
            if (i == -1) {
                super.MenuHostHelper$$ExternalSyntheticLambda1(setminandmaxprogress, iArr);
                return;
            }
            int MenuHostHelper$$ExternalSyntheticLambda0 = setContentHeight.this.MenuHostHelper$$ExternalSyntheticLambda0() * i;
            iArr[0] = MenuHostHelper$$ExternalSyntheticLambda0;
            iArr[1] = MenuHostHelper$$ExternalSyntheticLambda0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setUnboundedRipple extends hintOnError {
        setUnboundedRipple() {
        }

        @Override // o.hintOnError, o.setHideMotionSpecResource
        public final View MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions) {
            boolean z = setContentHeight.this.setIconTintList.setY.MenuHostHelper$$ExternalSyntheticLambda0;
            return super.MenuHostHelper$$ExternalSyntheticLambda1(setuioptions);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setOnLongClickListener implements Runnable {
        private final int MenuHostHelper$$ExternalSyntheticLambda0;
        private final WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 setIconTintList;

        setOnLongClickListener(int i, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
            this.setIconTintList = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.setIconTintList.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class setIconTintList {
        void MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) {
        }

        boolean MenuHostHelper$$ExternalSyntheticLambda0() {
            return false;
        }

        void MenuHostHelper$$ExternalSyntheticLambda1(AccessibilityEvent accessibilityEvent) {
        }

        void setIconTintList() {
        }

        void setIconTintList(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        boolean setIconTintList(int i) {
            return false;
        }

        void setOnLongClickListener() {
        }

        void setUnboundedRipple() {
        }

        void setX() {
        }

        void setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1<?> windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1) {
        }

        void setY() {
        }

        void setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1<?> windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1) {
        }

        private setIconTintList() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ setIconTintList(setContentHeight setcontentheight, byte b) {
            this();
        }

        String MenuHostHelper$$ExternalSyntheticLambda1() {
            throw new IllegalStateException("Not implemented.");
        }

        boolean setX(int i) {
            throw new IllegalStateException("Not implemented.");
        }
    }

    public final void setCurrentItem(int i, boolean z) {
        boolean z2 = this.setIconTintList.setY.MenuHostHelper$$ExternalSyntheticLambda0;
        MenuHostHelper$$ExternalSyntheticLambda1(i, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, boolean z) {
        setBackgroundResource setbackgroundresource;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 = this.setLayoutAnimation.setNavigationOnClickListener;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            if (this.setAnimationFromJson != -1) {
                this.setAnimationFromJson = Math.max(i, 0);
            }
        } else if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1.setY() <= 0) {
        } else {
            int min = Math.min(Math.max(i, 0), windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1.setY() - 1);
            if (min == this.MenuHostHelper$$ExternalSyntheticLambda0) {
                if (this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                    return;
                }
            }
            int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (min == i2 && z) {
                return;
            }
            double d = i2;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = min;
            this.setY.setIconTintList();
            if (!(this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1 == 0)) {
                this.setOnLongClickListener.setY();
                d = setbackgroundresource.setY.MenuHostHelper$$ExternalSyntheticLambda0 + setbackgroundresource.setY.setY;
            }
            this.setOnLongClickListener.setX(min, z);
            if (!z) {
                this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0(min);
                return;
            }
            double d2 = min;
            if (Math.abs(d2 - d) > 3.0d) {
                this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0(d2 > d ? min - 3 : min + 3);
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setLayoutAnimation;
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.post(new setOnLongClickListener(min, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0));
                return;
            }
            this.setLayoutAnimation.setIconTintList(min);
        }
    }
}