package o;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
public class setExpandedActionViewsExclusive extends SeekBar {
    private final setOnGroupClickListener setX;

    public setExpandedActionViewsExclusive(Context context) {
        this(context, null);
    }

    public setExpandedActionViewsExclusive(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f04038b);
    }

    public setExpandedActionViewsExclusive(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setCompatPressedTranslationZ.setIconTintList(this, getContext());
        setOnGroupClickListener setongroupclicklistener = new setOnGroupClickListener(this);
        this.setX = setongroupclicklistener;
        setongroupclicklistener.MenuHostHelper$$ExternalSyntheticLambda0(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void onDraw(Canvas canvas) {
        synchronized (this) {
            super.onDraw(canvas);
            this.setX.setX(canvas);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.setX.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.setX.setY();
    }
}