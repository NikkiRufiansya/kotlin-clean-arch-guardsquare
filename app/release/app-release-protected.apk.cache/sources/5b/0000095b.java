package o;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import o.setMIndicatorOptions;

/* loaded from: classes.dex */
public class setAttachListener extends View {
    private boolean MenuHostHelper$$ExternalSyntheticLambda0;

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public setAttachListener(Context context) {
        super(context);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        super.setVisibility(8);
    }

    public setAttachListener(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        super.setVisibility(8);
    }

    public setAttachListener(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        setMIndicatorOptions.setIconTintList seticontintlist = (setMIndicatorOptions.setIconTintList) getLayoutParams();
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 && seticontintlist.setChipIconTintResource == i) {
            return;
        }
        seticontintlist.setChipIconTintResource = i;
        setLayoutParams(seticontintlist);
    }

    public void setGuidelineEnd(int i) {
        setMIndicatorOptions.setIconTintList seticontintlist = (setMIndicatorOptions.setIconTintList) getLayoutParams();
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 && seticontintlist.setHasDecor == i) {
            return;
        }
        seticontintlist.setHasDecor = i;
        setLayoutParams(seticontintlist);
    }

    public void setGuidelinePercent(float f) {
        setMIndicatorOptions.setIconTintList seticontintlist = (setMIndicatorOptions.setIconTintList) getLayoutParams();
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 && seticontintlist.ExtendableSavedState$1 == f) {
            return;
        }
        seticontintlist.ExtendableSavedState$1 = f;
        setLayoutParams(seticontintlist);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = z;
    }
}