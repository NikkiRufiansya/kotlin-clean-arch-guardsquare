package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import o.setAnimationFromJson;

/* loaded from: classes.dex */
public class setCheckedIconEnabled$MenuHostHelper$$ExternalSyntheticLambda0 extends ListView {
    private final int MenuHostHelper$$ExternalSyntheticLambda0;
    private final int setIconTintList;

    public setCheckedIconEnabled$MenuHostHelper$$ExternalSyntheticLambda0(Context context) {
        this(context, null);
    }

    public setCheckedIconEnabled$MenuHostHelper$$ExternalSyntheticLambda0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setAnimationFromJson.setY.BackStackState$1);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getDimensionPixelOffset(setAnimationFromJson.setY.setCounterEnabled, -1);
        this.setIconTintList = obtainStyledAttributes.getDimensionPixelOffset(setAnimationFromJson.setY.setIndeterminateDrawableTiled, -1);
    }

    public void setHasDecor(boolean z, boolean z2) {
        if (z2 && z) {
            return;
        }
        setPadding(getPaddingLeft(), z ? getPaddingTop() : this.setIconTintList, getPaddingRight(), z2 ? getPaddingBottom() : this.MenuHostHelper$$ExternalSyntheticLambda0);
    }
}