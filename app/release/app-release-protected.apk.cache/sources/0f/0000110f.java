package o;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setupWithViewPager extends setSupportBackgroundTintMode {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setSupportBackgroundTintMode
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setMinuteHourDelegate setminutehourdelegate, View view, View view2, float f, Drawable drawable) {
        float cos;
        float sin;
        RectF y = setY(setminutehourdelegate, view);
        RectF y2 = setY(setminutehourdelegate, view2);
        if (y.left < y2.left) {
            double d = (f * 3.141592653589793d) / 2.0d;
            sin = (float) (1.0d - Math.cos(d));
            cos = (float) Math.sin(d);
        } else {
            double d2 = (f * 3.141592653589793d) / 2.0d;
            cos = (float) (1.0d - Math.cos(d2));
            sin = (float) Math.sin(d2);
        }
        int i = (int) y.left;
        int round = i + Math.round(sin * (((int) y2.left) - i));
        int i2 = drawable.getBounds().top;
        int i3 = (int) y.right;
        drawable.setBounds(round, i2, i3 + Math.round(cos * (((int) y2.right) - i3)), drawable.getBounds().bottom);
    }
}