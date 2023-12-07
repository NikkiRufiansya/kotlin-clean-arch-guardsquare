package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.setExpandedTitleMargin;

/* loaded from: classes.dex */
public class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda0 {
    public boolean setX = false;
    public int MenuHostHelper$$ExternalSyntheticLambda0 = 0;
    public int MenuHostHelper$$ExternalSyntheticLambda1 = 0;
    public float setY = 1.0f;
    public float setIconTintList = Float.NaN;

    public final void MenuHostHelper$$ExternalSyntheticLambda0(WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda0 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda0) {
        this.setX = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda0.setX;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
        this.setY = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda0.setY;
        this.setIconTintList = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Context context, AttributeSet attributeSet) {
        int[] iArr;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setExpandedTitleMargin.setY.setCheckedIconSizeResource);
        this.setX = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == setExpandedTitleMargin.setY.ObjectWrapper) {
                this.setY = obtainStyledAttributes.getFloat(index, this.setY);
            } else if (index == setExpandedTitleMargin.setY.setIconEndPadding) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getInt(index, this.MenuHostHelper$$ExternalSyntheticLambda0);
                iArr = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setUiOptions;
                this.MenuHostHelper$$ExternalSyntheticLambda0 = iArr[this.MenuHostHelper$$ExternalSyntheticLambda0];
            } else if (index == setExpandedTitleMargin.setY.setScene) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getInt(index, this.MenuHostHelper$$ExternalSyntheticLambda1);
            } else if (index == setExpandedTitleMargin.setY.setAddStatesFromChildren) {
                this.setIconTintList = obtainStyledAttributes.getFloat(index, this.setIconTintList);
            }
        }
        obtainStyledAttributes.recycle();
    }
}