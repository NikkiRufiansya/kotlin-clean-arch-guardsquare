package o;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
import o.setOnHoverListener;

/* loaded from: classes.dex */
public class hintOnError extends setHideMotionSpecResource {
    private setOnHoverListener MenuHostHelper$$ExternalSyntheticLambda0;
    private setOnHoverListener setIconTintList;

    @Override // o.setHideMotionSpecResource
    public final int[] setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions, View view) {
        int[] iArr = new int[2];
        if (setuioptions.MenuHostHelper$$ExternalSyntheticLambda1()) {
            setOnHoverListener iconTintList = setIconTintList(setuioptions);
            iArr[0] = (iconTintList.setY(view) + (iconTintList.MenuHostHelper$$ExternalSyntheticLambda1(view) / 2)) - (iconTintList.setLayoutAnimation() + (iconTintList.setUnboundedRipple() / 2));
        } else {
            iArr[0] = 0;
        }
        if (setuioptions.setIconTintList()) {
            setOnHoverListener MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(setuioptions);
            iArr[1] = (MenuHostHelper$$ExternalSyntheticLambda0.setY(view) + (MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(view) / 2)) - (MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation() + (MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple() / 2));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // o.setHideMotionSpecResource
    public View MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions) {
        if (setuioptions.setIconTintList()) {
            return setIconTintList(setuioptions, MenuHostHelper$$ExternalSyntheticLambda0(setuioptions));
        }
        if (setuioptions.MenuHostHelper$$ExternalSyntheticLambda1()) {
            return setIconTintList(setuioptions, setIconTintList(setuioptions));
        }
        return null;
    }

    @Override // o.setHideMotionSpecResource
    public final int MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions, int i, int i2) {
        setOnHoverListener iconTintList;
        PointF y;
        int iconSize = setuioptions.setIconSize();
        if (iconSize == 0) {
            return -1;
        }
        if (setuioptions.setIconTintList()) {
            iconTintList = MenuHostHelper$$ExternalSyntheticLambda0(setuioptions);
        } else {
            iconTintList = setuioptions.MenuHostHelper$$ExternalSyntheticLambda1() ? setIconTintList(setuioptions) : null;
        }
        if (iconTintList == null) {
            return -1;
        }
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = setuioptions.setLayoutAnimation;
        boolean z = false;
        int MenuHostHelper$$ExternalSyntheticLambda0 = setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        View view = null;
        View view2 = null;
        for (int i5 = 0; i5 < MenuHostHelper$$ExternalSyntheticLambda0; i5++) {
            setBoxBackgroundColorStateList setboxbackgroundcolorstatelist2 = setuioptions.setLayoutAnimation;
            View MenuHostHelper$$ExternalSyntheticLambda1 = setboxbackgroundcolorstatelist2 != null ? setboxbackgroundcolorstatelist2.setY.MenuHostHelper$$ExternalSyntheticLambda1(setboxbackgroundcolorstatelist2.setIconTintList(i5)) : null;
            if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                int y2 = (iconTintList.setY(MenuHostHelper$$ExternalSyntheticLambda1) + (iconTintList.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1) / 2)) - (iconTintList.setLayoutAnimation() + (iconTintList.setUnboundedRipple() / 2));
                if (y2 <= 0 && y2 > i3) {
                    view = MenuHostHelper$$ExternalSyntheticLambda1;
                    i3 = y2;
                }
                if (y2 >= 0 && y2 < i4) {
                    view2 = MenuHostHelper$$ExternalSyntheticLambda1;
                    i4 = y2;
                }
            }
        }
        boolean z2 = !setuioptions.MenuHostHelper$$ExternalSyntheticLambda1() ? i2 <= 0 : i <= 0;
        if (!z2 || view2 == null) {
            if (z2 || view == null) {
                if (!z2) {
                    view = view2;
                }
                if (view == null) {
                    return -1;
                }
                int onLongClickListener = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setOnLongClickListener(view);
                int iconSize2 = setuioptions.setIconSize();
                if ((setuioptions instanceof WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setZ.setX) && (y = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setZ.setX) setuioptions).setY(iconSize2 - 1)) != null && (y.x < 0.0f || y.y < 0.0f)) {
                    z = true;
                }
                int i6 = onLongClickListener + (z == z2 ? -1 : 1);
                if (i6 < 0 || i6 >= iconSize) {
                    return -1;
                }
                return i6;
            }
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setOnLongClickListener(view);
        }
        return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setOnLongClickListener(view2);
    }

    @Override // o.setHideMotionSpecResource
    protected final setActiveIndicatorResizeable setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions) {
        if (setuioptions instanceof WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setZ.setX) {
            return new setActiveIndicatorResizeable(this.setX.getContext()) { // from class: o.hintOnError.3
                @Override // o.setActiveIndicatorResizeable, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setZ
                protected final void setIconTintList(View view, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1) {
                    hintOnError hintonerror = hintOnError.this;
                    int[] iconTintList = hintonerror.setIconTintList(hintonerror.setX.setGuidelinePercent, view);
                    int i = iconTintList[0];
                    int i2 = iconTintList[1];
                    int MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(Math.max(Math.abs(i), Math.abs(i2)));
                    if (MenuHostHelper$$ExternalSyntheticLambda1 > 0) {
                        DecelerateInterpolator decelerateInterpolator = this.MenuHostHelper$$ExternalSyntheticLambda1;
                        windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 = i;
                        windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList = i2;
                        windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1;
                        windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1.setY = decelerateInterpolator;
                        windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1.setX = true;
                    }
                }

                @Override // o.setActiveIndicatorResizeable
                protected final float setIconTintList(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.setActiveIndicatorResizeable
                public final int setY(int i) {
                    return Math.min(100, super.setY(i));
                }
            };
        }
        return null;
    }

    private setOnHoverListener MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions) {
        setOnHoverListener setonhoverlistener = this.setIconTintList;
        if (setonhoverlistener == null || setonhoverlistener.setX != setuioptions) {
            this.setIconTintList = new setOnHoverListener.AnonymousClass3(setuioptions);
        }
        return this.setIconTintList;
    }

    private setOnHoverListener setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions) {
        setOnHoverListener setonhoverlistener = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setonhoverlistener == null || setonhoverlistener.setX != setuioptions) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new setOnHoverListener.AnonymousClass4(setuioptions);
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    private static View setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions, setOnHoverListener setonhoverlistener) {
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = setuioptions.setLayoutAnimation;
        int MenuHostHelper$$ExternalSyntheticLambda0 = setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0;
        if (MenuHostHelper$$ExternalSyntheticLambda0 == 0) {
            return null;
        }
        int layoutAnimation = setonhoverlistener.setLayoutAnimation();
        int unboundedRipple = setonhoverlistener.setUnboundedRipple() / 2;
        int i = Integer.MAX_VALUE;
        View view = null;
        for (int i2 = 0; i2 < MenuHostHelper$$ExternalSyntheticLambda0; i2++) {
            setBoxBackgroundColorStateList setboxbackgroundcolorstatelist2 = setuioptions.setLayoutAnimation;
            View MenuHostHelper$$ExternalSyntheticLambda1 = setboxbackgroundcolorstatelist2 != null ? setboxbackgroundcolorstatelist2.setY.MenuHostHelper$$ExternalSyntheticLambda1(setboxbackgroundcolorstatelist2.setIconTintList(i2)) : null;
            int abs = Math.abs((setonhoverlistener.setY(MenuHostHelper$$ExternalSyntheticLambda1) + (setonhoverlistener.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1) / 2)) - (layoutAnimation + unboundedRipple));
            if (abs < i) {
                view = MenuHostHelper$$ExternalSyntheticLambda1;
                i = abs;
            }
        }
        return view;
    }
}