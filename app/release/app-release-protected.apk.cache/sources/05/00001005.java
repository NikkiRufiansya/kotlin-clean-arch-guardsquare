package o;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import o.setMinuteHourDelegate;

/* loaded from: classes.dex */
public class setSupportBackgroundTintMode {
    public static RectF setY(setMinuteHourDelegate setminutehourdelegate, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!setminutehourdelegate.setOnLongClickListener && (view instanceof setMinuteHourDelegate.setOnLongClickListener)) {
            setMinuteHourDelegate.setOnLongClickListener setonlongclicklistener = (setMinuteHourDelegate.setOnLongClickListener) view;
            View[] viewArr = {setonlongclicklistener.setNavigationOnClickListener, setonlongclicklistener.MenuHostHelper$$ExternalSyntheticLambda1, setonlongclicklistener.setIconTintList};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view2 = viewArr[i3];
                if (view2 != null && view2.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view2.getLeft()) : view2.getLeft();
                    i = z ? Math.max(i, view2.getRight()) : view2.getRight();
                    z = true;
                }
            }
            int i4 = i - i2;
            View[] viewArr2 = {setonlongclicklistener.setNavigationOnClickListener, setonlongclicklistener.MenuHostHelper$$ExternalSyntheticLambda1, setonlongclicklistener.setIconTintList};
            int i5 = 0;
            int i6 = 0;
            boolean z2 = false;
            for (int i7 = 0; i7 < 3; i7++) {
                View view3 = viewArr2[i7];
                if (view3 != null && view3.getVisibility() == 0) {
                    i6 = z2 ? Math.min(i6, view3.getTop()) : view3.getTop();
                    i5 = z2 ? Math.max(i5, view3.getBottom()) : view3.getBottom();
                    z2 = true;
                }
            }
            int i8 = i5 - i6;
            int applyDimension = (int) TypedValue.applyDimension(1, 24.0f, setonlongclicklistener.getContext().getResources().getDisplayMetrics());
            if (i4 < applyDimension) {
                i4 = applyDimension;
            }
            int left = (setonlongclicklistener.getLeft() + setonlongclicklistener.getRight()) / 2;
            int top = (setonlongclicklistener.getTop() + setonlongclicklistener.getBottom()) / 2;
            int i9 = i4 / 2;
            return new RectF(left - i9, top - (i8 / 2), i9 + left, top + (left / 2));
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(setMinuteHourDelegate setminutehourdelegate, View view, Drawable drawable) {
        RectF y = setY(setminutehourdelegate, view);
        drawable.setBounds((int) y.left, drawable.getBounds().top, (int) y.right, drawable.getBounds().bottom);
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(setMinuteHourDelegate setminutehourdelegate, View view, View view2, float f, Drawable drawable) {
        RectF y = setY(setminutehourdelegate, view);
        RectF y2 = setY(setminutehourdelegate, view2);
        int i = (int) y.left;
        int round = i + Math.round((((int) y2.left) - i) * f);
        int i2 = drawable.getBounds().top;
        int i3 = (int) y.right;
        drawable.setBounds(round, i2, i3 + Math.round(f * (((int) y2.right) - i3)), drawable.getBounds().bottom);
    }
}