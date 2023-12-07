package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import o.setExpandedTitleMargin;

/* loaded from: classes.dex */
public class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda1 {
    private static SparseIntArray setChipCornerRadius;
    public boolean setIconTintList = false;
    public int setY = -1;
    public int MenuHostHelper$$ExternalSyntheticLambda0 = 0;
    public String setTextAlignment = null;
    public int setUiOptions = -1;
    public int setX = 0;
    public float MenuHostHelper$$ExternalSyntheticLambda1 = Float.NaN;
    private int setCenterIfNoTextEnabled = -1;
    public float setOnLongClickListener = Float.NaN;
    public float setIconSize = Float.NaN;
    public int ViewPager$SavedState$1 = -1;
    public String setNavigationOnClickListener = null;
    public int setLayoutAnimation = -3;
    public int setUnboundedRipple = -1;

    public final void setY(WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda1) {
        this.setIconTintList = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList;
        this.setY = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda1.setY;
        this.setTextAlignment = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda1.setTextAlignment;
        this.setUiOptions = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions;
        this.setX = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda1.setX;
        this.setOnLongClickListener = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1;
        this.setCenterIfNoTextEnabled = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda1.setCenterIfNoTextEnabled;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        setChipCornerRadius = sparseIntArray;
        sparseIntArray.append(setExpandedTitleMargin.setY.setDataDirectorySuffix, 1);
        setChipCornerRadius.append(setExpandedTitleMargin.setY.setSpeed, 2);
        setChipCornerRadius.append(setExpandedTitleMargin.setY.setIconStartPaddingResource, 3);
        setChipCornerRadius.append(setExpandedTitleMargin.setY.MaterialComponentsViewInflater, 4);
        setChipCornerRadius.append(setExpandedTitleMargin.setY.setMenu, 5);
        setChipCornerRadius.append(setExpandedTitleMargin.setY.setLeftStripDrawable, 6);
        setChipCornerRadius.append(setExpandedTitleMargin.setY.setHandwritingDelegatorCallback, 7);
        setChipCornerRadius.append(setExpandedTitleMargin.setY.setCloseIcon, 8);
        setChipCornerRadius.append(setExpandedTitleMargin.setY.setScaleType, 9);
        setChipCornerRadius.append(setExpandedTitleMargin.setY.setClipToOutline, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setExpandedTitleMargin.setY.setCollapsedTitleTextColor);
        this.setIconTintList = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (setChipCornerRadius.get(index)) {
                case 1:
                    this.setOnLongClickListener = obtainStyledAttributes.getFloat(index, this.setOnLongClickListener);
                    break;
                case 2:
                    this.setUiOptions = obtainStyledAttributes.getInt(index, this.setUiOptions);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.setTextAlignment = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.setTextAlignment = joinThreadPool.setY[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.setX = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.setY = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, index, this.setY);
                    break;
                case 6:
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getInteger(index, this.MenuHostHelper$$ExternalSyntheticLambda0);
                    break;
                case 7:
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getFloat(index, this.MenuHostHelper$$ExternalSyntheticLambda1);
                    break;
                case 8:
                    this.ViewPager$SavedState$1 = obtainStyledAttributes.getInteger(index, this.ViewPager$SavedState$1);
                    break;
                case 9:
                    this.setIconSize = obtainStyledAttributes.getFloat(index, this.setIconSize);
                    break;
                case 10:
                    TypedValue peekValue = obtainStyledAttributes.peekValue(index);
                    if (peekValue.type == 1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.setUnboundedRipple = resourceId;
                        if (resourceId != -1) {
                            this.setLayoutAnimation = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (peekValue.type == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.setNavigationOnClickListener = string;
                        if (string.indexOf("/") > 0) {
                            this.setUnboundedRipple = obtainStyledAttributes.getResourceId(index, -1);
                            this.setLayoutAnimation = -2;
                            break;
                        } else {
                            this.setLayoutAnimation = -1;
                            break;
                        }
                    } else {
                        this.setLayoutAnimation = obtainStyledAttributes.getInteger(index, this.setUnboundedRipple);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}