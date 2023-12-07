package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import o.setAnimationFromJson;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager$SavedState$1 extends LinearLayout {
    private boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean setIconTintList;
    private int setY;

    public StaggeredGridLayoutManager$SavedState$1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setY = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setAnimationFromJson.setY.setSelectionFromTop);
        setBaselineAlignBottom.setY(this, context, setAnimationFromJson.setY.setSelectionFromTop, attributeSet, obtainStyledAttributes, 0, 0);
        this.setIconTintList = obtainStyledAttributes.getBoolean(setAnimationFromJson.setY.setRippleColorResource, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setIconTintList(this.setIconTintList);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.setIconTintList != z) {
            this.setIconTintList = z;
            if (!z && this.MenuHostHelper$$ExternalSyntheticLambda1) {
                setIconTintList(false);
            }
            requestLayout();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int i5 = 0;
        if (this.setIconTintList) {
            if (size > this.setY && this.MenuHostHelper$$ExternalSyntheticLambda1) {
                setIconTintList(false);
            }
            this.setY = size;
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.setIconTintList && !this.MenuHostHelper$$ExternalSyntheticLambda1) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setIconTintList(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            i4 = -1;
            if (i6 >= childCount) {
                i6 = -1;
                break;
            } else if (getChildAt(i6).getVisibility() == 0) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            View childAt = getChildAt(i6);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (!this.MenuHostHelper$$ExternalSyntheticLambda1) {
                i5 = paddingTop + getPaddingBottom();
            } else {
                int i7 = i6 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i7 >= childCount2) {
                        break;
                    } else if (getChildAt(i7).getVisibility() == 0) {
                        i4 = i7;
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i4 >= 0) {
                    paddingTop += getChildAt(i4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i5 = paddingTop;
            }
        }
        if (setBaselineAlignBottom.setIconSize(this) != i5) {
            setMinimumHeight(i5);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    private void setIconTintList(boolean z) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != z) {
            if (!z || this.setIconTintList) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? 8388613 : 80);
                View findViewById = findViewById(R.id.res_0x7f0a01bf);
                if (findViewById != null) {
                    findViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }
}