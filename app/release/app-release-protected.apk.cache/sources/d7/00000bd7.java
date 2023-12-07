package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class setFindListener extends setPopupBackgroundResource {
    private static Paint setX;

    public setFindListener(setFailureListener setfailurelistener) {
        super(setfailurelistener);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (setScrollContainer.setIconTintList().setY()) {
            float f2 = i3;
            float iconTintList = f + setIconTintList();
            float f3 = i5;
            if (setX == null) {
                TextPaint textPaint = new TextPaint();
                setX = textPaint;
                textPaint.setColor(setScrollContainer.setIconTintList().MenuHostHelper$$ExternalSyntheticLambda0());
                setX.setStyle(Paint.Style.FILL);
            }
            canvas.drawRect(f, f2, iconTintList, f3, setX);
        }
        setFailureListener MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        Typeface typeface = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setX, MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 << 1, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }
}