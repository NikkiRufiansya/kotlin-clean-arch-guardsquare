package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import o.setAnimationFromJson;

/* loaded from: classes.dex */
public class setTabRippleColor extends ViewGroup {
    private int MenuHostHelper$$ExternalSyntheticLambda0;
    private int MenuHostHelper$$ExternalSyntheticLambda1;
    private int ViewPager$SavedState$1;
    private float setCenterIfNoTextEnabled;
    private int setChipCornerRadius;
    private int setIconSize;
    private Drawable setIconTintList;
    private int setLayoutAnimation;
    private int[] setNavigationOnClickListener;
    private int setOnLongClickListener;
    private boolean setTextAlignment;
    private int setUiOptions;
    private int[] setUnboundedRipple;
    private int setX;
    private boolean setY;

    int MenuHostHelper$$ExternalSyntheticLambda0(View view) {
        return 0;
    }

    int MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        return 0;
    }

    int MenuHostHelper$$ExternalSyntheticLambda1(View view, int i) {
        return 0;
    }

    int setY(View view) {
        return 0;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public setTabRippleColor(Context context) {
        this(context, null);
    }

    public setTabRippleColor(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public setTabRippleColor(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setY = true;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        this.setX = 0;
        this.setOnLongClickListener = 8388659;
        setExpandedHintEnabled MenuHostHelper$$ExternalSyntheticLambda0 = setExpandedHintEnabled.MenuHostHelper$$ExternalSyntheticLambda0(context, attributeSet, setAnimationFromJson.setY.setClipBounds, i, 0);
        setBaselineAlignBottom.setY(this, context, setAnimationFromJson.setY.setClipBounds, attributeSet, MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(), i, 0);
        int MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setExpandedActionViewsExclusive, -1);
        if (MenuHostHelper$$ExternalSyntheticLambda02 >= 0) {
            setOrientation(MenuHostHelper$$ExternalSyntheticLambda02);
        }
        int MenuHostHelper$$ExternalSyntheticLambda03 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setPasswordVisibilityToggleContentDescription, -1);
        if (MenuHostHelper$$ExternalSyntheticLambda03 >= 0) {
            setGravity(MenuHostHelper$$ExternalSyntheticLambda03);
        }
        boolean iconTintList = MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(setAnimationFromJson.setY.setOnGroupClickListener, true);
        if (!iconTintList) {
            setBaselineAligned(iconTintList);
        }
        this.setCenterIfNoTextEnabled = MenuHostHelper$$ExternalSyntheticLambda0.setOnLongClickListener(setAnimationFromJson.setY.setInsetBottom);
        int i2 = setAnimationFromJson.setY.setFocusableInTouchMode;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(3, -1);
        this.setTextAlignment = MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(setAnimationFromJson.setY.setTabContainer, false);
        setDividerDrawable(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.getStableInsets));
        this.setIconSize = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setAnimationFromJson.setY.setSelectedTabIndicator, 0);
        this.setUiOptions = MenuHostHelper$$ExternalSyntheticLambda0.setY(setAnimationFromJson.setY.setAllowedHandwritingDelegatorPackage, 0);
        MenuHostHelper$$ExternalSyntheticLambda0.setX();
    }

    public void setShowDividers(int i) {
        if (i != this.setIconSize) {
            requestLayout();
        }
        this.setIconSize = i;
    }

    public Drawable setUiOptions() {
        return this.setIconTintList;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.setIconTintList) {
            return;
        }
        this.setIconTintList = drawable;
        if (drawable != null) {
            this.setLayoutAnimation = drawable.getIntrinsicWidth();
            this.MenuHostHelper$$ExternalSyntheticLambda0 = drawable.getIntrinsicHeight();
        } else {
            this.setLayoutAnimation = 0;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.setUiOptions = i;
    }

    public int setLayoutAnimation() {
        return this.setLayoutAnimation;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.setIconTintList == null) {
            return;
        }
        if (this.ViewPager$SavedState$1 == 1) {
            MenuHostHelper$$ExternalSyntheticLambda1(canvas);
        } else {
            setX(canvas);
        }
    }

    void MenuHostHelper$$ExternalSyntheticLambda1(Canvas canvas) {
        int bottom;
        int onLongClickListener = setOnLongClickListener();
        for (int i = 0; i < onLongClickListener; i++) {
            View iconTintList = setIconTintList(i);
            if (iconTintList != null && iconTintList.getVisibility() != 8 && MenuHostHelper$$ExternalSyntheticLambda0(i)) {
                MenuHostHelper$$ExternalSyntheticLambda0(canvas, (iconTintList.getTop() - ((ViewGroup.MarginLayoutParams) ((setY) iconTintList.getLayoutParams())).topMargin) - this.MenuHostHelper$$ExternalSyntheticLambda0);
            }
        }
        if (MenuHostHelper$$ExternalSyntheticLambda0(onLongClickListener)) {
            View iconTintList2 = setIconTintList(onLongClickListener - 1);
            if (iconTintList2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.MenuHostHelper$$ExternalSyntheticLambda0;
            } else {
                bottom = iconTintList2.getBottom() + ((ViewGroup.MarginLayoutParams) ((setY) iconTintList2.getLayoutParams())).bottomMargin;
            }
            MenuHostHelper$$ExternalSyntheticLambda0(canvas, bottom);
        }
    }

    void setX(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int onLongClickListener = setOnLongClickListener();
        boolean MenuHostHelper$$ExternalSyntheticLambda0 = setTabMode.MenuHostHelper$$ExternalSyntheticLambda0(this);
        for (int i2 = 0; i2 < onLongClickListener; i2++) {
            View iconTintList = setIconTintList(i2);
            if (iconTintList != null && iconTintList.getVisibility() != 8 && MenuHostHelper$$ExternalSyntheticLambda0(i2)) {
                setY sety = (setY) iconTintList.getLayoutParams();
                if (MenuHostHelper$$ExternalSyntheticLambda0) {
                    left2 = iconTintList.getRight() + ((ViewGroup.MarginLayoutParams) sety).rightMargin;
                } else {
                    left2 = (iconTintList.getLeft() - ((ViewGroup.MarginLayoutParams) sety).leftMargin) - this.setLayoutAnimation;
                }
                MenuHostHelper$$ExternalSyntheticLambda1(canvas, left2);
            }
        }
        if (MenuHostHelper$$ExternalSyntheticLambda0(onLongClickListener)) {
            View iconTintList2 = setIconTintList(onLongClickListener - 1);
            if (iconTintList2 != null) {
                setY sety2 = (setY) iconTintList2.getLayoutParams();
                if (MenuHostHelper$$ExternalSyntheticLambda0) {
                    left = iconTintList2.getLeft() - ((ViewGroup.MarginLayoutParams) sety2).leftMargin;
                    i = this.setLayoutAnimation;
                    right = left - i;
                } else {
                    right = iconTintList2.getRight() + ((ViewGroup.MarginLayoutParams) sety2).rightMargin;
                }
            } else if (MenuHostHelper$$ExternalSyntheticLambda0) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.setLayoutAnimation;
                right = left - i;
            }
            MenuHostHelper$$ExternalSyntheticLambda1(canvas, right);
        }
    }

    void MenuHostHelper$$ExternalSyntheticLambda0(Canvas canvas, int i) {
        Drawable drawable = this.setIconTintList;
        int paddingLeft = getPaddingLeft();
        int i2 = this.setUiOptions;
        int width = getWidth();
        int paddingRight = getPaddingRight();
        drawable.setBounds(paddingLeft + i2, i, (width - paddingRight) - this.setUiOptions, this.MenuHostHelper$$ExternalSyntheticLambda0 + i);
        this.setIconTintList.draw(canvas);
    }

    void MenuHostHelper$$ExternalSyntheticLambda1(Canvas canvas, int i) {
        this.setIconTintList.setBounds(i, getPaddingTop() + this.setUiOptions, this.setLayoutAnimation + i, (getHeight() - getPaddingBottom()) - this.setUiOptions);
        this.setIconTintList.draw(canvas);
    }

    public void setBaselineAligned(boolean z) {
        this.setY = z;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.setTextAlignment = z;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.setX;
        if (this.ViewPager$SavedState$1 == 1 && (i = this.setOnLongClickListener & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.setChipCornerRadius) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.setChipCornerRadius;
            }
        }
        return i3 + ((ViewGroup.MarginLayoutParams) ((setY) childAt.getLayoutParams())).topMargin + baseline;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder sb = new StringBuilder("base aligned child index out of range (0, ");
            sb.append(getChildCount());
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
    }

    View setIconTintList(int i) {
        return getChildAt(i);
    }

    int setOnLongClickListener() {
        return getChildCount();
    }

    public void setWeightSum(float f) {
        this.setCenterIfNoTextEnabled = Math.max(0.0f, f);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.ViewPager$SavedState$1 == 1) {
            setIconTintList(i, i2);
        } else {
            MenuHostHelper$$ExternalSyntheticLambda1(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        if (i == 0) {
            return (this.setIconSize & 1) != 0;
        } else if (i == getChildCount()) {
            return (this.setIconSize & 4) != 0;
        } else {
            if ((this.setIconSize & 2) != 0) {
                do {
                    i--;
                    if (i >= 0) {
                    }
                } while (getChildAt(i).getVisibility() == 8);
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0315  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void setIconTintList(int r32, int r33) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTabRippleColor.setIconTintList(int, int):void");
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View iconTintList = setIconTintList(i3);
            if (iconTintList.getVisibility() != 8) {
                setY sety = (setY) iconTintList.getLayoutParams();
                if (((ViewGroup.LayoutParams) sety).width == -1) {
                    int i4 = ((ViewGroup.LayoutParams) sety).height;
                    ((ViewGroup.LayoutParams) sety).height = iconTintList.getMeasuredHeight();
                    measureChildWithMargins(iconTintList, makeMeasureSpec, 0, i2, 0);
                    ((ViewGroup.LayoutParams) sety).height = i4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void MenuHostHelper$$ExternalSyntheticLambda1(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTabRippleColor.MenuHostHelper$$ExternalSyntheticLambda1(int, int):void");
    }

    private void setX(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View iconTintList = setIconTintList(i3);
            if (iconTintList.getVisibility() != 8) {
                setY sety = (setY) iconTintList.getLayoutParams();
                if (((ViewGroup.LayoutParams) sety).height == -1) {
                    int i4 = ((ViewGroup.LayoutParams) sety).width;
                    ((ViewGroup.LayoutParams) sety).width = iconTintList.getMeasuredWidth();
                    measureChildWithMargins(iconTintList, i2, 0, makeMeasureSpec, 0);
                    ((ViewGroup.LayoutParams) sety).width = i4;
                }
            }
        }
    }

    void setX(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.ViewPager$SavedState$1 == 1) {
            MenuHostHelper$$ExternalSyntheticLambda1(i, i2, i3, i4);
        } else {
            MenuHostHelper$$ExternalSyntheticLambda0(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void MenuHostHelper$$ExternalSyntheticLambda1(int r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            int r7 = r18.getPaddingLeft()
            int r8 = r21 - r19
            int r9 = r18.getPaddingRight()
            int r10 = r18.getPaddingRight()
            int r11 = r18.setOnLongClickListener()
            int r12 = r6.setOnLongClickListener
            r0 = r12 & 112(0x70, float:1.57E-43)
            r1 = 16
            if (r0 == r1) goto L31
            r1 = 80
            if (r0 == r1) goto L25
            int r0 = r18.getPaddingTop()
            goto L3d
        L25:
            int r0 = r18.getPaddingTop()
            int r0 = r0 + r22
            int r0 = r0 - r20
            int r1 = r6.setChipCornerRadius
            int r0 = r0 - r1
            goto L3d
        L31:
            int r0 = r18.getPaddingTop()
            int r1 = r22 - r20
            int r2 = r6.setChipCornerRadius
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L3d:
            r1 = 0
            r13 = 0
        L3f:
            if (r13 >= r11) goto Lc8
            android.view.View r14 = r6.setIconTintList(r13)
            r15 = 1
            if (r14 != 0) goto L4f
            int r1 = r6.MenuHostHelper$$ExternalSyntheticLambda1(r13)
            int r0 = r0 + r1
            goto Lc4
        L4f:
            int r1 = r14.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc4
            int r4 = r14.getMeasuredWidth()
            int r16 = r14.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r14.getLayoutParams()
            r5 = r1
            o.setTabRippleColor$setY r5 = (o.setTabRippleColor.setY) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L6e
            r1 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r1 & r12
        L6e:
            int r2 = o.setBaselineAlignBottom.ViewPager$SavedState$1(r18)
            int r1 = o.setWeightSum.MenuHostHelper$$ExternalSyntheticLambda1(r1, r2)
            r1 = r1 & 7
            if (r1 == r15) goto L87
            r2 = 5
            if (r1 == r2) goto L81
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L94
        L81:
            int r1 = r8 - r9
            int r1 = r1 - r4
            int r2 = r5.rightMargin
            goto L93
        L87:
            int r1 = r8 - r7
            int r1 = r1 - r10
            int r1 = r1 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
        L93:
            int r1 = r1 - r2
        L94:
            r2 = r1
            boolean r1 = r6.MenuHostHelper$$ExternalSyntheticLambda0(r13)
            if (r1 == 0) goto L9e
            int r1 = r6.MenuHostHelper$$ExternalSyntheticLambda0
            int r0 = r0 + r1
        L9e:
            int r1 = r5.topMargin
            int r17 = r0 + r1
            int r0 = r6.setY(r14)
            int r3 = r17 + r0
            r0 = r18
            r1 = r14
            r15 = r5
            r5 = r16
            r0.MenuHostHelper$$ExternalSyntheticLambda0(r1, r2, r3, r4, r5)
            int r0 = r15.bottomMargin
            int r1 = r6.MenuHostHelper$$ExternalSyntheticLambda0(r14)
            int r2 = r6.MenuHostHelper$$ExternalSyntheticLambda1(r14, r13)
            int r13 = r13 + r2
            int r16 = r16 + r0
            int r16 = r16 + r1
            int r17 = r17 + r16
            r0 = r17
        Lc4:
            r1 = 1
            int r13 = r13 + r1
            goto L3f
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTabRippleColor.MenuHostHelper$$ExternalSyntheticLambda1(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void MenuHostHelper$$ExternalSyntheticLambda0(int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTabRippleColor.MenuHostHelper$$ExternalSyntheticLambda0(int, int, int, int):void");
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public void setOrientation(int i) {
        if (this.ViewPager$SavedState$1 != i) {
            this.ViewPager$SavedState$1 = i;
            requestLayout();
        }
    }

    public void setGravity(int i) {
        if (this.setOnLongClickListener != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.setOnLongClickListener = i;
            requestLayout();
        }
    }

    public int setNavigationOnClickListener() {
        return this.setOnLongClickListener;
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.setOnLongClickListener;
        if ((8388615 & i3) != i2) {
            this.setOnLongClickListener = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.setOnLongClickListener;
        if ((i3 & 112) != i2) {
            this.setOnLongClickListener = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: setY */
    public setY generateLayoutParams(AttributeSet attributeSet) {
        return new setY(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: setY */
    public setY generateDefaultLayoutParams() {
        int i = this.ViewPager$SavedState$1;
        if (i == 0) {
            return new setY(-2, -2);
        }
        if (i == 1) {
            return new setY(-1, -2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: setY */
    public setY generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new setY(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof setY;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* loaded from: classes.dex */
    public static class setY extends LinearLayout.LayoutParams {
        public setY(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public setY(int i, int i2) {
            super(i, i2);
        }

        public setY(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}