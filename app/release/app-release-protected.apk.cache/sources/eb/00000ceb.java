package o;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class setItemPaddingTop implements View.OnTouchListener {
    private final int MenuHostHelper$$ExternalSyntheticLambda0;
    private final int MenuHostHelper$$ExternalSyntheticLambda1;
    private final Dialog setIconTintList;
    private final int setX;

    public setItemPaddingTop(Dialog dialog, Rect rect) {
        this.setIconTintList = dialog;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = rect.left;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = rect.top;
        this.setX = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int top;
        View findViewById = view.findViewById(16908290);
        int left = this.MenuHostHelper$$ExternalSyntheticLambda1 + findViewById.getLeft();
        int width = findViewById.getWidth();
        if (new RectF(left, this.MenuHostHelper$$ExternalSyntheticLambda0 + findViewById.getTop(), width + left, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            float f = (-this.setX) - 1;
            obtain.setLocation(f, f);
        }
        view.performClick();
        return this.setIconTintList.onTouchEvent(obtain);
    }
}