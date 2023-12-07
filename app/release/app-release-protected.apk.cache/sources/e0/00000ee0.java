package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import o.setIconTint;

/* loaded from: classes.dex */
public final class setQueryRefinementEnabled extends View {
    public final int MenuHostHelper$$ExternalSyntheticLambda0;
    public final Drawable setIconTintList;
    public final CharSequence setX;

    public setQueryRefinementEnabled(Context context) {
        this(context, null);
    }

    public setQueryRefinementEnabled(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setExpandedHintEnabled x = setExpandedHintEnabled.setX(context, attributeSet, setIconTint.setIconTintList.setObjectValues);
        this.setX = x.setUnboundedRipple(2);
        this.setIconTintList = x.MenuHostHelper$$ExternalSyntheticLambda0(0);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = x.setNavigationOnClickListener(1, 0);
        x.setX();
    }
}