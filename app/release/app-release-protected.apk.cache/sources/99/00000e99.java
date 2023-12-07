package o;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class setPopupBackgroundResource extends ReplacementSpan {
    private final setFailureListener setY;
    private final Paint.FontMetricsInt MenuHostHelper$$ExternalSyntheticLambda1 = new Paint.FontMetricsInt();
    private short setIconTintList = -1;
    private short MenuHostHelper$$ExternalSyntheticLambda0 = -1;
    private float setX = 1.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setPopupBackgroundResource(setFailureListener setfailurelistener) {
        if (setfailurelistener != null) {
            this.setY = setfailurelistener;
            return;
        }
        throw new NullPointerException("metadata cannot be null");
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.MenuHostHelper$$ExternalSyntheticLambda1);
        this.setX = Math.abs(this.MenuHostHelper$$ExternalSyntheticLambda1.descent - this.MenuHostHelper$$ExternalSyntheticLambda1.ascent) / this.setY.MenuHostHelper$$ExternalSyntheticLambda1().setY();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = (short) (this.setY.MenuHostHelper$$ExternalSyntheticLambda1().setY() * this.setX);
        this.setIconTintList = (short) (this.setY.MenuHostHelper$$ExternalSyntheticLambda1().setUnboundedRipple() * this.setX);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = this.MenuHostHelper$$ExternalSyntheticLambda1.ascent;
            fontMetricsInt.descent = this.MenuHostHelper$$ExternalSyntheticLambda1.descent;
            fontMetricsInt.top = this.MenuHostHelper$$ExternalSyntheticLambda1.top;
            fontMetricsInt.bottom = this.MenuHostHelper$$ExternalSyntheticLambda1.bottom;
        }
        return this.setIconTintList;
    }

    public final setFailureListener MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setY;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int setIconTintList() {
        return this.setIconTintList;
    }
}