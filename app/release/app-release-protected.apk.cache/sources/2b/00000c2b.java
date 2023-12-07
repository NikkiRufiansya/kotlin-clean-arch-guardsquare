package o;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.List;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;

/* loaded from: classes.dex */
public abstract class setHideMotionSpecResource extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setTextAlignment {
    private final WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCenterIfNoTextEnabled MenuHostHelper$$ExternalSyntheticLambda0 = new WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCenterIfNoTextEnabled() { // from class: o.setHideMotionSpecResource.3
        private boolean setY = false;

        @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCenterIfNoTextEnabled
        public final void setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, int i) {
            super.setIconTintList(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, i);
            if (i == 0 && this.setY) {
                this.setY = false;
                setHideMotionSpecResource.this.MenuHostHelper$$ExternalSyntheticLambda0();
            }
        }

        @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCenterIfNoTextEnabled
        public final void setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.setY = true;
        }
    };
    private Scroller MenuHostHelper$$ExternalSyntheticLambda1;
    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 setX;

    public abstract int MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions, int i, int i2);

    public abstract View MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions);

    public abstract int[] setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions, View view);

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setTextAlignment
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2) {
        setActiveIndicatorResizeable y;
        int MenuHostHelper$$ExternalSyntheticLambda1;
        boolean z;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions = this.setX.setGuidelinePercent;
        if (setuioptions == null || this.setX.setNavigationOnClickListener == null) {
            return false;
        }
        int i3 = this.setX.setIconified;
        if (Math.abs(i2) > i3 || Math.abs(i) > i3) {
            if (!(setuioptions instanceof WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setZ.setX) || (y = setY(setuioptions)) == null || (MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(setuioptions, i, i2)) == -1) {
                z = false;
            } else {
                y.setLayoutAnimation = MenuHostHelper$$ExternalSyntheticLambda1;
                setuioptions.MenuHostHelper$$ExternalSyntheticLambda0(y);
                z = true;
            }
            return z;
        }
        return false;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) {
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = this.setX;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 == windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) {
            return;
        }
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 != null) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCenterIfNoTextEnabled setcenterifnotextenabled = this.MenuHostHelper$$ExternalSyntheticLambda0;
            List<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCenterIfNoTextEnabled> list = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setSuffixText;
            if (list != null) {
                list.remove(setcenterifnotextenabled);
            }
            this.setX.setOnFlingListener(null);
        }
        this.setX = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setChipIconTintResource != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03 = this.setX;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCenterIfNoTextEnabled setcenterifnotextenabled2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.setSuffixText == null) {
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.setSuffixText = new ArrayList();
            }
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.setSuffixText.add(setcenterifnotextenabled2);
            this.setX.setOnFlingListener(this);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new Scroller(this.setX.getContext(), new DecelerateInterpolator());
            MenuHostHelper$$ExternalSyntheticLambda0();
        }
    }

    final void MenuHostHelper$$ExternalSyntheticLambda0() {
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions;
        View MenuHostHelper$$ExternalSyntheticLambda1;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setX;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 == null || (setuioptions = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setGuidelinePercent) == null || (MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(setuioptions)) == null) {
            return;
        }
        int[] iconTintList = setIconTintList(setuioptions, MenuHostHelper$$ExternalSyntheticLambda1);
        int i = iconTintList[0];
        if (i == 0 && iconTintList[1] == 0) {
            return;
        }
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0(i, iconTintList[1], null, Integer.MIN_VALUE, false);
    }

    @Deprecated
    protected setActiveIndicatorResizeable setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions) {
        if (setuioptions instanceof WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setZ.setX) {
            return new setActiveIndicatorResizeable(this.setX.getContext()) { // from class: o.setHideMotionSpecResource.1
                @Override // o.setActiveIndicatorResizeable, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setZ
                protected final void setIconTintList(View view, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1) {
                    if (setHideMotionSpecResource.this.setX == null) {
                        return;
                    }
                    setHideMotionSpecResource sethidemotionspecresource = setHideMotionSpecResource.this;
                    int[] iconTintList = sethidemotionspecresource.setIconTintList(sethidemotionspecresource.setX.setGuidelinePercent, view);
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
            };
        }
        return null;
    }
}