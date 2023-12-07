package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* loaded from: classes.dex */
public class setPasswordVisibilityToggleContentDescription extends RatingBar {
    private final setIndeterminateTintList MenuHostHelper$$ExternalSyntheticLambda0;

    public setPasswordVisibilityToggleContentDescription(Context context) {
        this(context, null);
    }

    public setPasswordVisibilityToggleContentDescription(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f04035f);
    }

    public setPasswordVisibilityToggleContentDescription(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setCompatPressedTranslationZ.setIconTintList(this, getContext());
        setIndeterminateTintList setindeterminatetintlist = new setIndeterminateTintList(this);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setindeterminatetintlist;
        setindeterminatetintlist.MenuHostHelper$$ExternalSyntheticLambda0(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void onMeasure(int i, int i2) {
        synchronized (this) {
            super.onMeasure(i, i2);
            Bitmap iconTintList = this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList();
            if (iconTintList != null) {
                setMeasuredDimension(View.resolveSizeAndState(iconTintList.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
            }
        }
    }
}