package o;

import android.view.View;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;

/* loaded from: classes.dex */
public final class setTextKeepState {
    public static int MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, setOnHoverListener setonhoverlistener, View view, View view2, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions, boolean z, boolean z2) {
        int max;
        if (setuioptions.ViewPager$SavedState$1() != 0) {
            if ((setminandmaxprogress.setIconTintList ? setminandmaxprogress.setNavigationOnClickListener - setminandmaxprogress.setY : setminandmaxprogress.setLayoutAnimation) != 0 && view != null && view2 != null) {
                int min = Math.min(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setOnLongClickListener(view), WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setOnLongClickListener(view2));
                int max2 = Math.max(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setOnLongClickListener(view), WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setOnLongClickListener(view2));
                if (z2) {
                    max = Math.max(0, ((setminandmaxprogress.setIconTintList ? setminandmaxprogress.setNavigationOnClickListener - setminandmaxprogress.setY : setminandmaxprogress.setLayoutAnimation) - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (z) {
                    return Math.round((max * (Math.abs(setonhoverlistener.MenuHostHelper$$ExternalSyntheticLambda0(view2) - setonhoverlistener.setY(view)) / (Math.abs(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setOnLongClickListener(view) - WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setOnLongClickListener(view2)) + 1))) + (setonhoverlistener.setLayoutAnimation() - setonhoverlistener.setY(view)));
                }
                return max;
            }
        }
        return 0;
    }

    public static int setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, setOnHoverListener setonhoverlistener, View view, View view2, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions, boolean z) {
        if (setuioptions.ViewPager$SavedState$1() != 0) {
            if ((setminandmaxprogress.setIconTintList ? setminandmaxprogress.setNavigationOnClickListener - setminandmaxprogress.setY : setminandmaxprogress.setLayoutAnimation) == 0 || view == null || view2 == null) {
                return 0;
            }
            if (!z) {
                return Math.abs(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setOnLongClickListener(view) - WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setOnLongClickListener(view2)) + 1;
            }
            return Math.min(setonhoverlistener.setUnboundedRipple(), setonhoverlistener.MenuHostHelper$$ExternalSyntheticLambda0(view2) - setonhoverlistener.setY(view));
        }
        return 0;
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, setOnHoverListener setonhoverlistener, View view, View view2, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions, boolean z) {
        if (setuioptions.ViewPager$SavedState$1() != 0) {
            if ((setminandmaxprogress.setIconTintList ? setminandmaxprogress.setNavigationOnClickListener - setminandmaxprogress.setY : setminandmaxprogress.setLayoutAnimation) == 0 || view == null || view2 == null) {
                return 0;
            }
            if (z) {
                return (int) (((setonhoverlistener.MenuHostHelper$$ExternalSyntheticLambda0(view2) - setonhoverlistener.setY(view)) / (Math.abs(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setOnLongClickListener(view) - WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setOnLongClickListener(view2)) + 1)) * (setminandmaxprogress.setIconTintList ? setminandmaxprogress.setNavigationOnClickListener - setminandmaxprogress.setY : setminandmaxprogress.setLayoutAnimation));
            }
            return setminandmaxprogress.setIconTintList ? setminandmaxprogress.setNavigationOnClickListener - setminandmaxprogress.setY : setminandmaxprogress.setLayoutAnimation;
        }
        return 0;
    }
}