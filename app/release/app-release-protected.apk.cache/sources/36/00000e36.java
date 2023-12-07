package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import o.setAnimationFromJson;

/* loaded from: classes.dex */
public class setOnScrollChangeListener extends FrameLayout {
    Drawable MenuHostHelper$$ExternalSyntheticLambda0;
    Drawable MenuHostHelper$$ExternalSyntheticLambda1;
    boolean setIconTintList;
    private boolean setLayoutAnimation;
    private int setNavigationOnClickListener;
    View setOnLongClickListener;
    private View setUiOptions;
    private View setUnboundedRipple;
    boolean setX;
    Drawable setY;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public setOnScrollChangeListener(Context context) {
        this(context, null);
    }

    public setOnScrollChangeListener(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(this, new setDelayedApplicationOfInitialState(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setAnimationFromJson.setY.setIconTintList);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getDrawable(setAnimationFromJson.setY.MenuHostHelper$$ExternalSyntheticLambda1);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getDrawable(setAnimationFromJson.setY.setLayoutAnimation);
        this.setNavigationOnClickListener = obtainStyledAttributes.getDimensionPixelSize(setAnimationFromJson.setY.ViewPager$SavedState$1, -1);
        boolean z = true;
        if (getId() == R.id.res_0x7f0a01c3) {
            this.setIconTintList = true;
            this.setY = obtainStyledAttributes.getDrawable(setAnimationFromJson.setY.setY);
        }
        obtainStyledAttributes.recycle();
        if (!this.setIconTintList ? this.MenuHostHelper$$ExternalSyntheticLambda1 != null || this.MenuHostHelper$$ExternalSyntheticLambda0 != null : this.setY != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.setUnboundedRipple = findViewById(R.id.res_0x7f0a0033);
        this.setUiOptions = findViewById(R.id.res_0x7f0a003b);
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.setUnboundedRipple;
            if (view != null) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.setBounds(view.getLeft(), this.setUnboundedRipple.getTop(), this.setUnboundedRipple.getRight(), this.setUnboundedRipple.getBottom());
            }
        }
        boolean z = true;
        if (!this.setIconTintList ? this.MenuHostHelper$$ExternalSyntheticLambda1 != null || this.MenuHostHelper$$ExternalSyntheticLambda0 != null : this.setY != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        setOnScrollChangeListener$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.setX && (drawable2 = this.MenuHostHelper$$ExternalSyntheticLambda0) != null) {
                drawable2.setBounds(this.setOnLongClickListener.getLeft(), this.setOnLongClickListener.getTop(), this.setOnLongClickListener.getRight(), this.setOnLongClickListener.getBottom());
            }
        }
        boolean z = true;
        if (!this.setIconTintList ? this.MenuHostHelper$$ExternalSyntheticLambda1 != null || this.MenuHostHelper$$ExternalSyntheticLambda0 != null : this.setY != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        setOnScrollChangeListener$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.setY;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.setY);
        }
        this.setY = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.setIconTintList && (drawable2 = this.setY) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.setIconTintList ? !(this.MenuHostHelper$$ExternalSyntheticLambda1 != null || this.MenuHostHelper$$ExternalSyntheticLambda0 != null) : this.setY == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        setOnScrollChangeListener$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(this);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.setY;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.MenuHostHelper$$ExternalSyntheticLambda1 && !this.setIconTintList) || (drawable == this.MenuHostHelper$$ExternalSyntheticLambda0 && this.setX) || ((drawable == this.setY && this.setIconTintList) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (drawable != null && drawable.isStateful()) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setState(getDrawableState());
        }
        Drawable drawable2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (drawable2 != null && drawable2.isStateful()) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setState(getDrawableState());
        }
        Drawable drawable3 = this.setY;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.setY.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.setY;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void setTransitioning(boolean z) {
        this.setLayoutAnimation = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.setLayoutAnimation || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public void setTabContainer(getPathName getpathname) {
        View view = this.setOnLongClickListener;
        if (view != null) {
            removeView(view);
        }
        this.setOnLongClickListener = getpathname;
        if (getpathname != null) {
            addView(getpathname);
            ViewGroup.LayoutParams layoutParams = getpathname.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            getpathname.setAllowCollapse(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.view.View r0 = r6.setUnboundedRipple
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != r1) goto L1c
            int r0 = r6.setNavigationOnClickListener
            if (r0 < 0) goto L1c
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            int r8 = java.lang.Math.min(r0, r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
        L1c:
            super.onMeasure(r7, r8)
            android.view.View r7 = r6.setUnboundedRipple
            if (r7 != 0) goto L24
            return
        L24:
            int r7 = android.view.View.MeasureSpec.getMode(r8)
            android.view.View r0 = r6.setOnLongClickListener
            if (r0 == 0) goto Lb0
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto Lb0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r7 == r0) goto Lb0
            android.view.View r0 = r6.setUnboundedRipple
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L4c
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L4c
            int r0 = r0.getMeasuredHeight()
            if (r0 == 0) goto L4c
            r0 = 0
            goto L4d
        L4c:
            r0 = 1
        L4d:
            if (r0 != 0) goto L63
            android.view.View r0 = r6.setUnboundedRipple
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getMeasuredHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
        L60:
            int r4 = r0 + r2
            goto L88
        L63:
            android.view.View r0 = r6.setUiOptions
            if (r0 == 0) goto L74
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L74
            int r0 = r0.getMeasuredHeight()
            if (r0 == 0) goto L74
            r3 = 0
        L74:
            if (r3 != 0) goto L88
            android.view.View r0 = r6.setUiOptions
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getMeasuredHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
            goto L60
        L88:
            if (r7 != r1) goto L8f
            int r7 = android.view.View.MeasureSpec.getSize(r8)
            goto L92
        L8f:
            r7 = 2147483647(0x7fffffff, float:NaN)
        L92:
            int r8 = r6.getMeasuredWidth()
            android.view.View r0 = r6.setOnLongClickListener
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getMeasuredHeight()
            int r2 = r1.topMargin
            int r0 = r0 + r2
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r4 = r4 + r0
            int r7 = java.lang.Math.min(r4, r7)
            r6.setMeasuredDimension(r8, r7)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnScrollChangeListener.onMeasure(int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.setOnLongClickListener;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, i3, measuredHeight - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }
        if (this.setIconTintList) {
            Drawable drawable2 = this.setY;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                if (this.setUnboundedRipple.getVisibility() == 0) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1.setBounds(this.setUnboundedRipple.getLeft(), this.setUnboundedRipple.getTop(), this.setUnboundedRipple.getRight(), this.setUnboundedRipple.getBottom());
                } else {
                    View view2 = this.setUiOptions;
                    if (view2 != null && view2.getVisibility() == 0) {
                        this.MenuHostHelper$$ExternalSyntheticLambda1.setBounds(this.setUiOptions.getLeft(), this.setUiOptions.getTop(), this.setUiOptions.getRight(), this.setUiOptions.getBottom());
                    } else {
                        this.MenuHostHelper$$ExternalSyntheticLambda1.setBounds(0, 0, 0, 0);
                    }
                }
                z3 = true;
            }
            this.setX = z4;
            if (!z4 || (drawable = this.MenuHostHelper$$ExternalSyntheticLambda0) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }
}