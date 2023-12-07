package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import o.setDecorPadding;
import o.setVelocityScale;

/* loaded from: classes.dex */
public class setVelocityScale extends FrameLayout implements queryLocalInterface, setFocusedSearchResultHighlightColor {
    private View MenuHostHelper$$ExternalSyntheticLambda1;
    private float SearchView$SavedState$1;
    private long ViewPager$SavedState$1;
    private setX setAnimationFromJson;
    private int setCenterIfNoTextEnabled;
    private final Rect setCheckedIconEnabled;
    private int setChipCornerRadius;
    private VelocityTracker setChipIconTintResource;
    private final int[] setGuidelinePercent;
    private int setHasDecor;
    private boolean setIconSize;
    private boolean setLayoutAnimation;
    private final int[] setLayoutDirection;
    private final handleException setMaxEms;
    private OverScroller setMinAndMaxProgress;
    private EdgeEffect setNavigationOnClickListener;
    private EdgeEffect setOnLongClickListener;
    private int setOnNavigationItemSelectedListener;
    private int setTextAlignment;
    private boolean setTextAppearanceResource;
    private int setTextScaleX;
    private boolean setUiOptions;
    private boolean setUnboundedRipple;
    private final Month$1 setX;
    private int setY;
    private setY setZ;
    private static final setVelocityScale$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList = new setCounterOverflowTextColor() { // from class: o.setVelocityScale$MenuHostHelper$$ExternalSyntheticLambda1
        @Override // o.setCounterOverflowTextColor
        public final boolean MenuHostHelper$$ExternalSyntheticLambda1(View view, int i, Bundle bundle) {
            if (super.MenuHostHelper$$ExternalSyntheticLambda1(view, i, bundle)) {
                return true;
            }
            setVelocityScale setvelocityscale = (setVelocityScale) view;
            if (setvelocityscale.isEnabled()) {
                int height = setvelocityscale.getHeight();
                Rect rect = new Rect();
                if (setvelocityscale.getMatrix().isIdentity() && setvelocityscale.getGlobalVisibleRect(rect)) {
                    height = rect.height();
                }
                if (i != 4096) {
                    if (i == 8192 || i == 16908344) {
                        int paddingBottom = setvelocityscale.getPaddingBottom();
                        int max = Math.max(setvelocityscale.getScrollY() - ((height - paddingBottom) - setvelocityscale.getPaddingTop()), 0);
                        if (max != setvelocityscale.getScrollY()) {
                            setvelocityscale.setX(0 - setvelocityscale.getScrollX(), max - setvelocityscale.getScrollY(), 250, true);
                            return true;
                        }
                        return false;
                    } else if (i != 16908346) {
                        return false;
                    }
                }
                int paddingBottom2 = setvelocityscale.getPaddingBottom();
                int paddingTop = setvelocityscale.getPaddingTop();
                int min = Math.min(setvelocityscale.getScrollY() + ((height - paddingBottom2) - paddingTop), setvelocityscale.setIconTintList());
                if (min != setvelocityscale.getScrollY()) {
                    setvelocityscale.setX(0 - setvelocityscale.getScrollX(), min - setvelocityscale.getScrollY(), 250, true);
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // o.setCounterOverflowTextColor
        public final void setY(View view, setDecorPadding setdecorpadding) {
            int iconTintList;
            super.setY(view, setdecorpadding);
            setVelocityScale setvelocityscale = (setVelocityScale) view;
            setdecorpadding.setIconTintList(ScrollView.class.getName());
            if (!setvelocityscale.isEnabled() || (iconTintList = setvelocityscale.setIconTintList()) <= 0) {
                return;
            }
            setdecorpadding.setIconSize(true);
            if (setvelocityscale.getScrollY() > 0) {
                setdecorpadding.setIconTintList(setDecorPadding.setIconTintList.setHasDecor);
                setdecorpadding.setIconTintList(setDecorPadding.setIconTintList.FragmentStateAdapter$5);
            }
            if (setvelocityscale.getScrollY() < iconTintList) {
                setdecorpadding.setIconTintList(setDecorPadding.setIconTintList.SearchView$SavedState$1);
                setdecorpadding.setIconTintList(setDecorPadding.setIconTintList.ExtendableSavedState$1);
            }
        }

        @Override // o.setCounterOverflowTextColor
        public final void setIconTintList(View view, AccessibilityEvent accessibilityEvent) {
            super.setIconTintList(view, accessibilityEvent);
            setVelocityScale setvelocityscale = (setVelocityScale) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(setvelocityscale.setIconTintList() > 0);
            accessibilityEvent.setScrollX(setvelocityscale.getScrollX());
            accessibilityEvent.setScrollY(setvelocityscale.getScrollY());
            readObject.setY(accessibilityEvent, setvelocityscale.getScrollX());
            readObject.setIconTintList(accessibilityEvent, setvelocityscale.setIconTintList());
        }
    };
    private static final int[] MenuHostHelper$$ExternalSyntheticLambda0 = {16843130};

    /* loaded from: classes.dex */
    public interface setY {
        void setIconTintList(setVelocityScale setvelocityscale);
    }

    @Override // o.setDropDownVerticalOffset
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public setVelocityScale(Context context) {
        this(context, null);
    }

    public setVelocityScale(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f040322);
    }

    public setVelocityScale(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setCheckedIconEnabled = new Rect();
        this.setIconSize = true;
        this.setLayoutAnimation = false;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        this.setUiOptions = false;
        this.setTextAppearanceResource = true;
        this.setY = -1;
        this.setLayoutDirection = new int[2];
        this.setGuidelinePercent = new int[2];
        this.setNavigationOnClickListener = setHyphenationFrequency.setY(context, attributeSet);
        this.setOnLongClickListener = setHyphenationFrequency.setY(context, attributeSet);
        this.setMinAndMaxProgress = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.setHasDecor = viewConfiguration.getScaledTouchSlop();
        this.setOnNavigationItemSelectedListener = viewConfiguration.getScaledMinimumFlingVelocity();
        this.setChipCornerRadius = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, MenuHostHelper$$ExternalSyntheticLambda0, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.setMaxEms = new handleException();
        this.setX = new Month$1(this);
        setNestedScrollingEnabled(true);
        setBaselineAlignBottom.setX(this, setIconTintList);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        Month$1 month$1 = this.setX;
        if (month$1.setIconTintList) {
            setBaselineAlignBottom.setAdapter(month$1.setY);
        }
        month$1.setIconTintList = z;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.setX.setIconTintList;
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.setX.setIconTintList(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.setX.MenuHostHelper$$ExternalSyntheticLambda0(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent viewParent;
        Month$1 month$1 = this.setX;
        if (!month$1.setIconTintList || (viewParent = month$1.MenuHostHelper$$ExternalSyntheticLambda1) == null) {
            return false;
        }
        return setChipIconResource.setY(viewParent, month$1.setY, f, f2);
    }

    @Override // o.queryLocalInterface
    public final void setY(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        setY(i4, i5, iArr);
    }

    private void setY(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.setX.setIconTintList(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // o.setDropDownVerticalOffset
    public final void MenuHostHelper$$ExternalSyntheticLambda0(View view, View view2, int i, int i2) {
        handleException handleexception = this.setMaxEms;
        if (i2 == 1) {
            handleexception.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        } else {
            handleexception.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        }
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0(2, i2);
    }

    @Override // o.setDropDownVerticalOffset
    public final void setY(View view, int i) {
        handleException handleexception = this.setMaxEms;
        if (i == 1) {
            handleexception.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        } else {
            handleexception.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        }
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0(i);
    }

    @Override // o.setDropDownVerticalOffset
    public final void MenuHostHelper$$ExternalSyntheticLambda0(View view, int i, int i2, int i3, int i4, int i5) {
        setY(i4, i5, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        setY(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        setX((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        handleException handleexception = this.setMaxEms;
        return handleexception.MenuHostHelper$$ExternalSyntheticLambda1 | handleexception.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((FrameLayout.LayoutParams) childAt.getLayoutParams())).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    public void setOnScrollChangeListener(setY sety) {
        this.setZ = sety;
    }

    private boolean setX() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return (childAt.getHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
        }
        return false;
    }

    public void setFillViewport(boolean z) {
        if (z != this.setUnboundedRipple) {
            this.setUnboundedRipple = z;
            requestLayout();
        }
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.setTextAppearanceResource = z;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        setY sety = this.setZ;
        if (sety != null) {
            sety.setIconTintList(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.setUnboundedRipple && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (measuredHeight < measuredHeight2) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                childAt.measure(getChildMeasureSpec(i, paddingLeft + paddingRight + i3 + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.LayoutParams) layoutParams).width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || setX(keyEvent);
    }

    public final boolean setX(KeyEvent keyEvent) {
        this.setCheckedIconEnabled.setEmpty();
        if (!setX()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                if (!keyEvent.isAltPressed()) {
                    return setY(33);
                }
                return MenuHostHelper$$ExternalSyntheticLambda0(33);
            } else if (keyCode == 20) {
                if (!keyEvent.isAltPressed()) {
                    return setY(130);
                }
                return MenuHostHelper$$ExternalSyntheticLambda0(130);
            } else if (keyCode != 62) {
                return false;
            } else {
                setIconTintList(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
        } else {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0100  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setVelocityScale.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda0(MotionEvent motionEvent) {
        boolean z;
        if (setHyphenationFrequency.setY(this.setNavigationOnClickListener) != 0.0f) {
            setHyphenationFrequency.MenuHostHelper$$ExternalSyntheticLambda0(this.setNavigationOnClickListener, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (setHyphenationFrequency.setY(this.setOnLongClickListener) != 0.0f) {
            setHyphenationFrequency.MenuHostHelper$$ExternalSyntheticLambda0(this.setOnLongClickListener, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    private void setY(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.setY) {
            int i = actionIndex == 0 ? 1 : 0;
            this.setCenterIfNoTextEnabled = (int) motionEvent.getY(i);
            this.setY = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.setChipIconTintResource;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        boolean z;
        int i = 0;
        if (motionEvent.getAction() == 8 && !this.setUiOptions) {
            if (setPageTransformer.MenuHostHelper$$ExternalSyntheticLambda1(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
            } else {
                axisValue = setPageTransformer.MenuHostHelper$$ExternalSyntheticLambda1(motionEvent, 4194304) ? motionEvent.getAxisValue(26) : 0.0f;
            }
            if (axisValue != 0.0f) {
                if (this.SearchView$SavedState$1 == 0.0f) {
                    TypedValue typedValue = new TypedValue();
                    Context context = getContext();
                    if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                    }
                    this.SearchView$SavedState$1 = typedValue.getDimension(context.getResources().getDisplayMetrics());
                }
                int iconTintList = setIconTintList();
                int scrollY = getScrollY();
                int i2 = scrollY - ((int) (axisValue * this.SearchView$SavedState$1));
                if (i2 < 0) {
                    int overScrollMode = getOverScrollMode();
                    if ((overScrollMode == 0 || (overScrollMode == 1 && setIconTintList() > 0)) && !setPageTransformer.MenuHostHelper$$ExternalSyntheticLambda1(motionEvent, 8194)) {
                        setHyphenationFrequency.MenuHostHelper$$ExternalSyntheticLambda0(this.setNavigationOnClickListener, (-i2) / getHeight(), 0.5f);
                        this.setNavigationOnClickListener.onRelease();
                        invalidate();
                        z = 1;
                    } else {
                        i2 = 0;
                        i = i2;
                        z = 0;
                    }
                } else {
                    if (i2 > iconTintList) {
                        int overScrollMode2 = getOverScrollMode();
                        if ((overScrollMode2 == 0 || (overScrollMode2 == 1 && setIconTintList() > 0)) && !setPageTransformer.MenuHostHelper$$ExternalSyntheticLambda1(motionEvent, 8194)) {
                            setHyphenationFrequency.MenuHostHelper$$ExternalSyntheticLambda0(this.setOnLongClickListener, (i2 - iconTintList) / getHeight(), 0.5f);
                            this.setOnLongClickListener.onRelease();
                            invalidate();
                            i = 1;
                        }
                        z = i;
                        i = iconTintList;
                    }
                    i = i2;
                    z = 0;
                }
                if (i != scrollY) {
                    super.scrollTo(getScrollX(), i);
                    return true;
                }
                return z;
            }
        }
        return false;
    }

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r12 < 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean MenuHostHelper$$ExternalSyntheticLambda0(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            r9.getOverScrollMode()
            r9.computeHorizontalScrollRange()
            r9.computeHorizontalScrollExtent()
            r9.computeVerticalScrollRange()
            r9.computeVerticalScrollExtent()
            int r12 = r12 + r10
            r10 = 1
            r0 = 0
            if (r11 <= 0) goto L15
            goto L19
        L15:
            if (r11 < 0) goto L19
            r8 = 0
            goto L1b
        L19:
            r11 = 0
            r8 = 1
        L1b:
            if (r12 <= r13) goto L1e
            goto L21
        L1e:
            r13 = 0
            if (r12 >= 0) goto L23
        L21:
            r12 = r13
            r13 = 1
        L23:
            if (r13 == 0) goto L3b
            o.Month$1 r1 = r9.setX
            boolean r1 = r1.setY(r10)
            if (r1 != 0) goto L3b
            android.widget.OverScroller r1 = r9.setMinAndMaxProgress
            r4 = 0
            r5 = 0
            r6 = 0
            int r7 = r9.setIconTintList()
            r2 = r11
            r3 = r12
            r1.springBack(r2, r3, r4, r5, r6, r7)
        L3b:
            r9.onOverScrolled(r11, r12, r8, r13)
            if (r8 != 0) goto L44
            if (r13 == 0) goto L43
            goto L44
        L43:
            r10 = 0
        L44:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setVelocityScale.MenuHostHelper$$ExternalSyntheticLambda0(int, int, int, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int setIconTintList() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight();
            int i = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            return Math.max(0, ((height + i) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    private boolean setIconTintList(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.setCheckedIconEnabled.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((FrameLayout.LayoutParams) childAt.getLayoutParams())).bottomMargin + getPaddingBottom();
                if (this.setCheckedIconEnabled.top + height > bottom) {
                    this.setCheckedIconEnabled.top = bottom - height;
                }
            }
        } else {
            this.setCheckedIconEnabled.top = getScrollY() - height;
            if (this.setCheckedIconEnabled.top < 0) {
                this.setCheckedIconEnabled.top = 0;
            }
        }
        Rect rect = this.setCheckedIconEnabled;
        rect.bottom = rect.top + height;
        return MenuHostHelper$$ExternalSyntheticLambda0(i, this.setCheckedIconEnabled.top, this.setCheckedIconEnabled.bottom);
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        this.setCheckedIconEnabled.top = 0;
        this.setCheckedIconEnabled.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.setCheckedIconEnabled.bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((FrameLayout.LayoutParams) childAt.getLayoutParams())).bottomMargin + getPaddingBottom();
            Rect rect = this.setCheckedIconEnabled;
            rect.top = rect.bottom - height;
        }
        return MenuHostHelper$$ExternalSyntheticLambda0(i, this.setCheckedIconEnabled.top, this.setCheckedIconEnabled.bottom);
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else {
                        if (!z5) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            int i6 = z2 ? i2 - scrollY : i3 - i4;
            if (i6 != 0) {
                if (!this.setTextAppearanceResource) {
                    scrollBy(0, i6);
                } else {
                    setX(0, i6, 250, false);
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    private boolean setY(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int height = (int) (getHeight() * 0.5f);
        if (findNextFocus != null && setX(findNextFocus, height, getHeight())) {
            findNextFocus.getDrawingRect(this.setCheckedIconEnabled);
            offsetDescendantRectToMyCoords(findNextFocus, this.setCheckedIconEnabled);
            int x = setX(this.setCheckedIconEnabled);
            if (x != 0) {
                if (!this.setTextAppearanceResource) {
                    scrollBy(0, x);
                } else {
                    setX(0, x, 250, false);
                }
            }
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((FrameLayout.LayoutParams) childAt.getLayoutParams())).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i != 130) {
                height = -height;
            }
            if (height != 0) {
                if (!this.setTextAppearanceResource) {
                    scrollBy(0, height);
                } else {
                    setX(0, height, 250, false);
                }
            }
        }
        if (findFocus != null && findFocus.isFocused() && (!setX(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    private boolean setX(View view, int i, int i2) {
        view.getDrawingRect(this.setCheckedIconEnabled);
        offsetDescendantRectToMyCoords(view, this.setCheckedIconEnabled);
        return this.setCheckedIconEnabled.bottom + i >= getScrollY() && this.setCheckedIconEnabled.top - i <= getScrollY() + i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setX(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.ViewPager$SavedState$1 > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight();
            int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int height2 = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            this.setMinAndMaxProgress.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((height + i4) + i5) - ((height2 - paddingTop) - paddingBottom)))) - scrollY, 250);
            setX(z);
        } else {
            if (!this.setMinAndMaxProgress.isFinished()) {
                this.setMinAndMaxProgress.abortAnimation();
                this.setX.MenuHostHelper$$ExternalSyntheticLambda0(1);
            }
            scrollBy(i, i2);
        }
        this.ViewPager$SavedState$1 = AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((FrameLayout.LayoutParams) childAt.getLayoutParams())).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i5 = marginLayoutParams.leftMargin;
        view.measure(getChildMeasureSpec(i, paddingLeft + paddingRight + i5 + marginLayoutParams.rightMargin + i2, ((ViewGroup.LayoutParams) marginLayoutParams).width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.setMinAndMaxProgress.isFinished()) {
            return;
        }
        this.setMinAndMaxProgress.computeScrollOffset();
        int currY = this.setMinAndMaxProgress.getCurrY();
        int i = currY - this.setTextAlignment;
        this.setTextAlignment = currY;
        int[] iArr = this.setGuidelinePercent;
        boolean z = false;
        iArr[1] = 0;
        this.setX.setY(0, i, iArr, null, 1);
        int i2 = i - this.setGuidelinePercent[1];
        int iconTintList = setIconTintList();
        if (i2 != 0) {
            int scrollY = getScrollY();
            MenuHostHelper$$ExternalSyntheticLambda0(i2, getScrollX(), scrollY, iconTintList);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.setGuidelinePercent;
            iArr2[1] = 0;
            this.setX.setIconTintList(0, scrollY2, 0, i3, this.setLayoutDirection, 1, iArr2);
            i2 = i3 - this.setGuidelinePercent[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && iconTintList > 0)) {
                z = true;
            }
            if (z) {
                if (i2 < 0) {
                    if (this.setNavigationOnClickListener.isFinished()) {
                        this.setNavigationOnClickListener.onAbsorb((int) this.setMinAndMaxProgress.getCurrVelocity());
                    }
                } else if (this.setOnLongClickListener.isFinished()) {
                    this.setOnLongClickListener.onAbsorb((int) this.setMinAndMaxProgress.getCurrVelocity());
                }
            }
            this.setMinAndMaxProgress.abortAnimation();
            this.setX.MenuHostHelper$$ExternalSyntheticLambda0(1);
        }
        if (!this.setMinAndMaxProgress.isFinished()) {
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this);
        } else {
            this.setX.MenuHostHelper$$ExternalSyntheticLambda0(1);
        }
    }

    private void setX(View view) {
        view.getDrawingRect(this.setCheckedIconEnabled);
        offsetDescendantRectToMyCoords(view, this.setCheckedIconEnabled);
        int x = setX(this.setCheckedIconEnabled);
        if (x != 0) {
            scrollBy(0, x);
        }
    }

    private int setX(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        if (rect.bottom > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2, (childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i3);
        } else if (rect.top >= scrollY || rect.bottom >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i4 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.setIconSize) {
            setX(view2);
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || (true ^ setX(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int x = setX(rect);
        boolean z2 = x != 0;
        if (z2) {
            if (z) {
                scrollBy(0, x);
            } else {
                setX(0, x, 250, false);
            }
        }
        return z2;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.setIconSize = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.setIconSize = false;
        View view = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (view != null && setY(view, this)) {
            setX(this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        if (!this.setLayoutAnimation) {
            if (this.setAnimationFromJson != null) {
                scrollTo(getScrollX(), this.setAnimationFromJson.setIconTintList);
                this.setAnimationFromJson = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            int i7 = ((i4 - i2) - paddingTop) - paddingBottom;
            if (i7 < i5 && scrollY >= 0) {
                i6 = i7 + scrollY > i5 ? i5 - i7 : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.setLayoutAnimation = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.setLayoutAnimation = false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !setX(findFocus, 0, i4)) {
            return;
        }
        findFocus.getDrawingRect(this.setCheckedIconEnabled);
        offsetDescendantRectToMyCoords(findFocus, this.setCheckedIconEnabled);
        int x = setX(this.setCheckedIconEnabled);
        if (x != 0) {
            if (!this.setTextAppearanceResource) {
                scrollBy(0, x);
            } else {
                setX(0, x, 250, false);
            }
        }
    }

    private static boolean setY(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && setY((View) parent, view2);
    }

    private void setX(int i) {
        if (getChildCount() > 0) {
            this.setMinAndMaxProgress.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            setX(true);
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        this.setUiOptions = false;
        VelocityTracker velocityTracker = this.setChipIconTintResource;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.setChipIconTintResource = null;
        }
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0(0);
        this.setNavigationOnClickListener.onRelease();
        this.setOnLongClickListener.onRelease();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = getWidth();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = childAt.getWidth();
            int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            int height = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height2 = childAt.getHeight();
            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int i7 = (width - paddingLeft) - paddingRight;
            int i8 = width2 + i3 + i4;
            if (i7 >= i8 || i < 0) {
                i = 0;
            } else if (i7 + i > i8) {
                i = i8 - i7;
            }
            int i9 = (height - paddingTop) - paddingBottom;
            int i10 = height2 + i5 + i6;
            if (i9 >= i10 || i2 < 0) {
                i2 = 0;
            } else if (i9 + i2 > i10) {
                i2 = i10 - i9;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.setNavigationOnClickListener.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (setIconTintList.setY(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (setIconTintList.setY(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            this.setNavigationOnClickListener.setSize(width, height);
            if (this.setNavigationOnClickListener.draw(canvas)) {
                setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.setOnLongClickListener.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(setIconTintList(), scrollY) + height2;
        if (setIconTintList.setY(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i2 = 0 + getPaddingLeft();
        }
        if (setIconTintList.setY(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i2 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.setOnLongClickListener.setSize(width2, height2);
        if (this.setOnLongClickListener.draw(canvas)) {
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof setX)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        setX setx = (setX) parcelable;
        super.onRestoreInstanceState(setx.getSuperState());
        this.setAnimationFromJson = setx;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        setX setx = new setX(super.onSaveInstanceState());
        setx.setIconTintList = getScrollY();
        return setx;
    }

    /* loaded from: classes.dex */
    public static class setX extends View.BaseSavedState {
        public int setIconTintList;
        private static byte[] setY = {116, 44, -28, -115, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
        public static final int MenuHostHelper$$ExternalSyntheticLambda1 = 40;
        public static final Parcelable.Creator<setX> CREATOR = new Parcelable.Creator<setX>() { // from class: androidx.core.widget.NestedScrollView$SavedState$1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ setVelocityScale.setX createFromParcel(Parcel parcel) {
                return new setVelocityScale.setX(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ setVelocityScale.setX[] newArray(int i) {
                return new setVelocityScale.setX[i];
            }
        };

        private static void a(byte b, int i, byte b2, Object[] objArr) {
            byte[] bArr = setY;
            int i2 = 19 - (i * 15);
            int i3 = 16 - (b2 * 4);
            int i4 = b + 105;
            byte[] bArr2 = new byte[i3];
            int i5 = -1;
            int i6 = i3 - 1;
            if (bArr == null) {
                i2++;
                i4 = i4 + i2 + 2;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i4;
                if (i5 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                byte b3 = bArr[i2];
                i2++;
                i4 = i4 + b3 + 2;
            }
        }

        setX(Parcelable parcelable) {
            super(parcelable);
        }

        public setX(Parcel parcel) {
            super(parcel);
            this.setIconTintList = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.setIconTintList);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            try {
                Object[] objArr = {this};
                byte b = (byte) (-setY[5]);
                byte b2 = (byte) (b - 1);
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b3 = (byte) (-setY[5]);
                Object[] objArr3 = new Object[1];
                a((byte) (setY[5] + 1), b3, (byte) (b3 - 1), objArr3);
                sb.append(Integer.toHexString(((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue()));
                sb.append(" scrollPosition=");
                sb.append(this.setIconTintList);
                sb.append("}");
                return sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    static class setIconTintList {
        static boolean setY(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    private void setX(boolean z) {
        if (z) {
            this.setX.MenuHostHelper$$ExternalSyntheticLambda0(2, 1);
        } else {
            this.setX.MenuHostHelper$$ExternalSyntheticLambda0(1);
        }
        this.setTextAlignment = getScrollY();
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.setX.setY(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.setX.setY(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.setX.setY(i, i2, iArr, null, 0);
    }

    @Override // o.setDropDownVerticalOffset
    public final void MenuHostHelper$$ExternalSyntheticLambda0(View view, int i, int i2, int[] iArr, int i3) {
        this.setX.setY(i, i2, iArr, null, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0(2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setVelocityScale.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.setChipIconTintResource) != null) {
            velocityTracker.recycle();
            this.setChipIconTintResource = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.setX.MenuHostHelper$$ExternalSyntheticLambda0(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0(0);
    }
}