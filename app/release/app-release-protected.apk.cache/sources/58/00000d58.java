package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import o.setAnimationFromJson;

/* loaded from: classes.dex */
public class setMaxEms$MenuHostHelper$$ExternalSyntheticLambda0 extends ViewGroup.MarginLayoutParams {
    public int MenuHostHelper$$ExternalSyntheticLambda1;

    public setMaxEms$MenuHostHelper$$ExternalSyntheticLambda0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setAnimationFromJson.setY.setX);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getInt(setAnimationFromJson.setY.MenuHostHelper$$ExternalSyntheticLambda0, 0);
        obtainStyledAttributes.recycle();
    }

    public setMaxEms$MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
        super(-2, -2);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 8388627;
    }

    public setMaxEms$MenuHostHelper$$ExternalSyntheticLambda0(setMaxEms$MenuHostHelper$$ExternalSyntheticLambda0 setmaxems_menuhosthelper__externalsyntheticlambda0) {
        super((ViewGroup.MarginLayoutParams) setmaxems_menuhosthelper__externalsyntheticlambda0);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setmaxems_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public setMaxEms$MenuHostHelper$$ExternalSyntheticLambda0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
    }
}