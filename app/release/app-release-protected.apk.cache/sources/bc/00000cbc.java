package o;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setInflatedId extends setSupportBackgroundTintMode {
    @Override // o.setSupportBackgroundTintMode
    final void MenuHostHelper$$ExternalSyntheticLambda0(setMinuteHourDelegate setminutehourdelegate, View view, View view2, float f, Drawable drawable) {
        float x;
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        if (i >= 0) {
            view = view2;
        }
        RectF y = setY(setminutehourdelegate, view);
        if (i < 0) {
            x = setCardElevation.setX(1.0f, 0.0f, 0.0f, 0.5f, f);
        } else {
            x = setCardElevation.setX(0.0f, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) y.left, drawable.getBounds().top, (int) y.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (x * 255.0f));
    }
}