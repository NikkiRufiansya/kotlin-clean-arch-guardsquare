package o;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public abstract class setRight extends setCardBackgroundColor {
    private boolean setX;
    private boolean setY;

    public setRight(Context context) {
        super(context);
    }

    public setRight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public setRight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // o.setCardBackgroundColor, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        setX();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        setX();
    }
}