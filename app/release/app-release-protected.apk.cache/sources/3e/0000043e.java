package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import java.util.Arrays;
import o.setEnsureMinTouchTargetSize;

/* renamed from: o.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0146f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setY(setMinAndMaxFrame setminandmaxframe, View.OnLongClickListener onLongClickListener) {
        boolean iconTintList;
        iconTintList = setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(setminandmaxframe);
        boolean z = false;
        boolean z2 = onLongClickListener != null;
        z = (iconTintList || z2) ? true : true;
        setminandmaxframe.setFocusable(z);
        setminandmaxframe.setClickable(iconTintList);
        setminandmaxframe.setPressable(iconTintList);
        setminandmaxframe.setLongClickable(z2);
        setBaselineAlignBottom.setUnboundedRipple(setminandmaxframe, z ? 1 : 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setX(C0447s c0447s, setMinAndMaxFrame setminandmaxframe, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = setminandmaxframe.getDrawable();
        if (drawable != null) {
            drawable = setEnsureMinTouchTargetSize.setNavigationOnClickListener(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(drawable, colorStateList);
            } else {
                setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(drawable, ColorStateList.valueOf(colorStateList.getColorForState(setY(c0447s, setminandmaxframe), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                setEnsureMinTouchTargetSize.setX(drawable, mode);
            }
        }
        if (setminandmaxframe.getDrawable() != drawable) {
            setminandmaxframe.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void MenuHostHelper$$ExternalSyntheticLambda1(C0447s c0447s, setMinAndMaxFrame setminandmaxframe, ColorStateList colorStateList) {
        Drawable drawable = setminandmaxframe.getDrawable();
        if (setminandmaxframe.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(setY(c0447s, setminandmaxframe), colorStateList.getDefaultColor());
        Drawable mutate = setEnsureMinTouchTargetSize.setNavigationOnClickListener(drawable).mutate();
        setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(mutate, ColorStateList.valueOf(colorForState));
        setminandmaxframe.setImageDrawable(mutate);
    }

    private static int[] setY(C0447s c0447s, setMinAndMaxFrame setminandmaxframe) {
        int[] drawableState = c0447s.getDrawableState();
        int[] drawableState2 = setminandmaxframe.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setIconTintList(setMinAndMaxFrame setminandmaxframe) {
        if (Build.VERSION.SDK_INT <= 22) {
            setminandmaxframe.setBackground(setChipText.setX(setminandmaxframe.getContext(), (int) TypedValue.applyDimension(1, 4.0f, setminandmaxframe.getContext().getResources().getDisplayMetrics())));
        }
    }
}