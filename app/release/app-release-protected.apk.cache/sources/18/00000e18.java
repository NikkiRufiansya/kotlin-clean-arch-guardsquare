package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import o.setBaselineAlignBottom;
import o.setIconTint;
import o.setImeHintLocales;

/* loaded from: classes.dex */
public class setOnInflateListener extends ViewGroup {
    private int MenuHostHelper$$ExternalSyntheticLambda0;
    private int MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean setIconTintList;
    private int setY;

    public setOnInflateListener(Context context) {
        this(context, null);
    }

    public setOnInflateListener(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public setOnInflateListener(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setIconTintList = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, setIconTint.setIconTintList.setZ, 0, 0);
        this.setY = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setIconTintList(int i) {
        this.setY = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setX(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
    }

    public boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setIconTintList;
    }

    public void setSingleLine(boolean z) {
        this.setIconTintList = z;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i7 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int i8 = paddingTop;
        int i9 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin;
                    i5 = marginLayoutParams.rightMargin;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                int i11 = paddingLeft;
                if (paddingLeft + i4 + childAt.getMeasuredWidth() <= i7 - paddingRight || MenuHostHelper$$ExternalSyntheticLambda1()) {
                    i6 = i11;
                } else {
                    i6 = getPaddingLeft();
                    i8 = this.setY + paddingTop;
                }
                int measuredWidth = i6 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth > i9) {
                    i9 = measuredWidth;
                }
                paddingLeft = i6 + i4 + i5 + childAt.getMeasuredWidth() + this.MenuHostHelper$$ExternalSyntheticLambda1;
                if (i10 == getChildCount() - 1) {
                    i9 += i5;
                }
                paddingTop = measuredHeight + i8;
            }
        }
        int paddingRight2 = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i12 = i9 + paddingRight2;
        if (mode != Integer.MIN_VALUE) {
            i3 = 1073741824;
            if (mode != 1073741824) {
                size = i12;
            }
        } else {
            i3 = 1073741824;
            size = Math.min(i12, size);
        }
        int i13 = paddingTop + paddingBottom;
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(i13, size2);
        } else if (mode2 != i3) {
            size2 = i13;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int x;
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 1;
        x = setBaselineAlignBottom.setX.setX(this);
        boolean z2 = x == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingLeft;
        int i8 = paddingRight;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.res_0x7f0a018c, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = setImeHintLocales.setIconTintList(marginLayoutParams);
                    i5 = setImeHintLocales.setY.setX(marginLayoutParams);
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth();
                if (!this.setIconTintList && i8 + i6 + measuredWidth > i7) {
                    paddingTop = this.setY + i9;
                    this.MenuHostHelper$$ExternalSyntheticLambda0++;
                    i8 = paddingRight;
                }
                childAt.setTag(R.id.res_0x7f0a018c, Integer.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda0 - 1));
                int i11 = i8 + i6;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                if (z2) {
                    childAt.layout(i7 - measuredWidth2, paddingTop, (i7 - i8) - i6, measuredHeight);
                } else {
                    childAt.layout(i11, paddingTop, measuredWidth2, measuredHeight);
                }
                i8 += i6 + i5 + childAt.getMeasuredWidth() + this.MenuHostHelper$$ExternalSyntheticLambda1;
                i9 = measuredHeight;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }
}