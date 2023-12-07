package o;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import o.setBaselineAlignBottom;

/* loaded from: classes.dex */
public final class setTextEndPadding extends setStatusBarForegroundResource {
    private final int ViewPager$SavedState$1;
    private int[] setCenterIfNoTextEnabled;
    private final int setChipCornerRadius;
    boolean setIconTintList;
    private final int setOnLongClickListener;
    private final int setUiOptions;

    public setTextEndPadding(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.ViewPager$SavedState$1 = resources.getDimensionPixelSize(R.dimen.res_0x7f070065);
        this.setChipCornerRadius = resources.getDimensionPixelSize(R.dimen.res_0x7f070066);
        this.setOnLongClickListener = resources.getDimensionPixelSize(R.dimen.res_0x7f07005f);
        this.setUiOptions = resources.getDimensionPixelSize(R.dimen.res_0x7f070060);
        this.setCenterIfNoTextEnabled = new int[5];
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int x;
        int childCount = getChildCount();
        int i5 = i4 - i2;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                x = setBaselineAlignBottom.setX.setX(this);
                if (x == 1) {
                    int i8 = (i3 - i) - i6;
                    childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i5);
                } else {
                    childAt.layout(i6, 0, childAt.getMeasuredWidth() + i6, i5);
                }
                i6 += childAt.getMeasuredWidth();
            }
        }
    }

    public final void setItemHorizontalTranslationEnabled(boolean z) {
        this.setIconTintList = z;
    }

    @Override // o.setStatusBarForegroundResource
    public final setCounterTextColor MenuHostHelper$$ExternalSyntheticLambda1(Context context) {
        return new setProperty(context);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setNavigationIconTint setnavigationicontint = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int size = View.MeasureSpec.getSize(i);
        int size2 = setnavigationicontint.setUnboundedRipple().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int i3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if ((i3 != -1 ? i3 == 0 : size2 > 3) && this.setIconTintList) {
            View childAt = getChildAt(this.setNavigationOnClickListener);
            int i4 = this.setUiOptions;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.setOnLongClickListener, Integer.MIN_VALUE), makeMeasureSpec);
                i4 = Math.max(i4, childAt.getMeasuredWidth());
            }
            int i5 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.setChipCornerRadius * i5), Math.min(i4, this.setOnLongClickListener));
            int i6 = size - min;
            int min2 = Math.min(i6 / (i5 == 0 ? 1 : i5), this.ViewPager$SavedState$1);
            int i7 = i6 - (i5 * min2);
            int i8 = 0;
            while (i8 < childCount) {
                if (getChildAt(i8).getVisibility() != 8) {
                    this.setCenterIfNoTextEnabled[i8] = i8 == this.setNavigationOnClickListener ? min : min2;
                    if (i7 > 0) {
                        int[] iArr = this.setCenterIfNoTextEnabled;
                        iArr[i8] = iArr[i8] + 1;
                        i7--;
                    }
                } else {
                    this.setCenterIfNoTextEnabled[i8] = 0;
                }
                i8++;
            }
        } else {
            int min3 = Math.min(size / (size2 != 0 ? size2 : 1), this.setOnLongClickListener);
            int i9 = size - (size2 * min3);
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getVisibility() != 8) {
                    int[] iArr2 = this.setCenterIfNoTextEnabled;
                    iArr2[i10] = min3;
                    if (i9 > 0) {
                        iArr2[i10] = min3 + 1;
                        i9--;
                    }
                } else {
                    this.setCenterIfNoTextEnabled[i10] = 0;
                }
            }
        }
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.setCenterIfNoTextEnabled[i12], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i11 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i11, View.MeasureSpec.makeMeasureSpec(i11, 1073741824), 0), View.resolveSizeAndState(size3, i2, 0));
    }
}