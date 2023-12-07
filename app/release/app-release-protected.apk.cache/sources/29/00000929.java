package o;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;

/* loaded from: classes.dex */
public class setActiveIndicatorResizeable extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setZ {
    private float setChipCornerRadius;
    private PointF setTextAlignment;
    private final DisplayMetrics setX;
    protected final LinearInterpolator MenuHostHelper$$ExternalSyntheticLambda0 = new LinearInterpolator();
    protected final DecelerateInterpolator MenuHostHelper$$ExternalSyntheticLambda1 = new DecelerateInterpolator();
    private boolean setCenterIfNoTextEnabled = false;
    private int ViewPager$SavedState$1 = 0;
    private int setIconSize = 0;

    public setActiveIndicatorResizeable(Context context) {
        this.setX = context.getResources().getDisplayMetrics();
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setZ
    protected final void MenuHostHelper$$ExternalSyntheticLambda0() {
        this.setIconSize = 0;
        this.ViewPager$SavedState$1 = 0;
        this.setTextAlignment = null;
    }

    protected float setIconTintList(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        return (int) Math.ceil(setY(i) / 0.3356d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int setY(int i) {
        float abs = Math.abs(i);
        if (!this.setCenterIfNoTextEnabled) {
            this.setChipCornerRadius = setIconTintList(this.setX);
            this.setCenterIfNoTextEnabled = true;
        }
        return (int) Math.ceil(abs * this.setChipCornerRadius);
    }

    private static int MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setZ
    protected final void setIconTintList(int i, int i2, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1) {
        if (this.setUnboundedRipple.setGuidelinePercent.ViewPager$SavedState$1() == 0) {
            setY();
            return;
        }
        int i3 = this.ViewPager$SavedState$1;
        int i4 = i3 - i;
        if (i3 * i4 <= 0) {
            i4 = 0;
        }
        this.ViewPager$SavedState$1 = i4;
        int i5 = this.setIconSize;
        int i6 = i5 - i2;
        int i7 = i5 * i6 > 0 ? i6 : 0;
        this.setIconSize = i7;
        if (this.ViewPager$SavedState$1 == 0 && i7 == 0) {
            PointF MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(this.setLayoutAnimation);
            if (MenuHostHelper$$ExternalSyntheticLambda0 != null && (MenuHostHelper$$ExternalSyntheticLambda0.x != 0.0f || MenuHostHelper$$ExternalSyntheticLambda0.y != 0.0f)) {
                float sqrt = (float) Math.sqrt((MenuHostHelper$$ExternalSyntheticLambda0.x * MenuHostHelper$$ExternalSyntheticLambda0.x) + (MenuHostHelper$$ExternalSyntheticLambda0.y * MenuHostHelper$$ExternalSyntheticLambda0.y));
                MenuHostHelper$$ExternalSyntheticLambda0.x /= sqrt;
                MenuHostHelper$$ExternalSyntheticLambda0.y /= sqrt;
                this.setTextAlignment = MenuHostHelper$$ExternalSyntheticLambda0;
                this.ViewPager$SavedState$1 = (int) (MenuHostHelper$$ExternalSyntheticLambda0.x * 10000.0f);
                this.setIconSize = (int) (MenuHostHelper$$ExternalSyntheticLambda0.y * 10000.0f);
                int y = setY(10000);
                LinearInterpolator linearInterpolator = this.MenuHostHelper$$ExternalSyntheticLambda0;
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 = (int) (this.ViewPager$SavedState$1 * 1.2f);
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList = (int) (this.setIconSize * 1.2f);
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1 = (int) (y * 1.2f);
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1.setY = linearInterpolator;
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1.setX = true;
                return;
            }
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener = this.setLayoutAnimation;
            setY();
        }
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setZ
    protected void setIconTintList(View view, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1) {
        int i;
        int i2;
        PointF pointF = this.setTextAlignment;
        int i3 = -1;
        int i4 = (pointF == null || pointF.x == 0.0f) ? 0 : this.setTextAlignment.x > 0.0f ? 1 : -1;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions = this.setIconTintList;
        if (setuioptions == null || !setuioptions.MenuHostHelper$$ExternalSyntheticLambda1()) {
            i = 0;
        } else {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation setlayoutanimation = (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) view.getLayoutParams();
            int left = view.getLeft() - WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setUnboundedRipple(view);
            int i5 = ((ViewGroup.MarginLayoutParams) setlayoutanimation).leftMargin;
            int right = view.getRight() + WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setNavigationOnClickListener(view);
            int i6 = ((ViewGroup.MarginLayoutParams) setlayoutanimation).rightMargin;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = setuioptions.setMaxEms;
            int paddingLeft = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingLeft() : 0;
            int i7 = setuioptions.setGuidelinePercent;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = setuioptions.setMaxEms;
            i = MenuHostHelper$$ExternalSyntheticLambda0(left - i5, right + i6, paddingLeft, i7 - (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.getPaddingRight() : 0), i4);
        }
        PointF pointF2 = this.setTextAlignment;
        if (pointF2 == null || pointF2.y == 0.0f) {
            i3 = 0;
        } else if (this.setTextAlignment.y > 0.0f) {
            i3 = 1;
        }
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions2 = this.setIconTintList;
        if (setuioptions2 != null && setuioptions2.setIconTintList()) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation setlayoutanimation2 = (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) view.getLayoutParams();
            int top = view.getTop() - WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setLayoutAnimation(view);
            int i8 = ((ViewGroup.MarginLayoutParams) setlayoutanimation2).topMargin;
            int bottom = view.getBottom();
            i2 = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) view.getLayoutParams()).setIconTintList.bottom;
            int i9 = bottom + i2;
            int i10 = ((ViewGroup.MarginLayoutParams) setlayoutanimation2).bottomMargin;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03 = setuioptions2.setMaxEms;
            int paddingTop = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.getPaddingTop() : 0;
            int i11 = setuioptions2.ViewPager$SavedState$1;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04 = setuioptions2.setMaxEms;
            r4 = MenuHostHelper$$ExternalSyntheticLambda0(top - i8, i9 + i10, paddingTop, i11 - (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04.getPaddingBottom() : 0), i3);
        }
        int ceil = (int) Math.ceil(setY((int) Math.sqrt((i * i) + (r4 * r4))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.MenuHostHelper$$ExternalSyntheticLambda1;
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 = -i;
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList = -r4;
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1 = ceil;
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1.setY = decelerateInterpolator;
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1.setX = true;
        }
    }
}