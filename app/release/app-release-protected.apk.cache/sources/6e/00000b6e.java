package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda0 extends ViewGroup.LayoutParams {
    int MenuHostHelper$$ExternalSyntheticLambda0;
    boolean MenuHostHelper$$ExternalSyntheticLambda1;
    public int setIconTintList;
    float setUnboundedRipple;
    public boolean setX;
    int setY;

    public setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda0() {
        super(-1, -1);
        this.setUnboundedRipple = 0.0f;
    }

    public setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setUnboundedRipple = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setErrorAccessibilityLabelResource.MenuHostHelper$$ExternalSyntheticLambda0);
        this.setIconTintList = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}