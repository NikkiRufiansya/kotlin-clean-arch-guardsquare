package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import o.setWeightSum;

/* loaded from: classes.dex */
public abstract class setIconTintMode extends setImageTintList<View> {
    private Rect MenuHostHelper$$ExternalSyntheticLambda0;
    public final Rect setIconTintList;
    public int setX;
    private int setY;

    protected float setIconTintList(View view) {
        return 1.0f;
    }

    protected abstract View setY(List<View> list);

    public setIconTintMode() {
        this.setIconTintList = new Rect();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new Rect();
        this.setY = 0;
    }

    public setIconTintMode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setIconTintList = new Rect();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new Rect();
        this.setY = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public boolean setX(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View y;
        WindowInsetsCompat windowInsetsCompat;
        int i5 = view.getLayoutParams().height;
        if ((i5 == -1 || i5 == -2) && (y = setY(coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda0(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                if (setBaselineAlignBottom.setTextAlignment(y) && (windowInsetsCompat = coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda0) != null) {
                    size += windowInsetsCompat.setUiOptions() + windowInsetsCompat.setUnboundedRipple();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int measuredHeight = y.getMeasuredHeight();
            view.setTranslationY(0.0f);
            coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda0(view, i, i2, View.MeasureSpec.makeMeasureSpec((size + setX(y)) - measuredHeight, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setImageTintList
    public final void setX(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, View view, int i) {
        View y = setY(coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda0(view));
        if (y != null) {
            CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams();
            Rect rect = this.setIconTintList;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).leftMargin, y.getBottom() + ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).rightMargin, ((coordinatorLayout.getHeight() + y.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).bottomMargin);
            WindowInsetsCompat windowInsetsCompat = coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda0;
            if (windowInsetsCompat != null && setBaselineAlignBottom.setTextAlignment(coordinatorLayout) && !setBaselineAlignBottom.setTextAlignment(view)) {
                rect.left += windowInsetsCompat.setNavigationOnClickListener();
                rect.right -= windowInsetsCompat.setOnLongClickListener();
            }
            Rect rect2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            int i2 = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setX;
            setWeightSum.setIconTintList.setX(i2 == 0 ? 8388659 : i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(y);
            view.layout(rect2.left, rect2.top - MenuHostHelper$$ExternalSyntheticLambda0, rect2.right, rect2.bottom - MenuHostHelper$$ExternalSyntheticLambda0);
            this.setY = rect2.top - y.getBottom();
            return;
        }
        super.setX(coordinatorLayout, (androidx.coordinatorlayout.widget.CoordinatorLayout) view, i);
        this.setY = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int MenuHostHelper$$ExternalSyntheticLambda0(View view) {
        if (this.setX != 0) {
            float iconTintList = setIconTintList(view);
            int i = this.setX;
            int i2 = (int) (iconTintList * i);
            if (i2 < 0) {
                return 0;
            }
            return i2 > i ? i : i2;
        }
        return 0;
    }

    public int setX(View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int setX() {
        return this.setY;
    }
}