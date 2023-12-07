package o;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class setChipSpacingVerticalResource {
    private static onAppEnteredBackground<WeakReference<Interpolator>> MenuHostHelper$$ExternalSyntheticLambda0;
    private static final Interpolator setY = new LinearInterpolator();
    private static setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 setX = setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0("t", "s", "e", "o", "i", "h", "to", "ti");

    setChipSpacingVerticalResource() {
    }

    private static WeakReference<Interpolator> setX(int i) {
        WeakReference<Interpolator> x;
        synchronized (setChipSpacingVerticalResource.class) {
            if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                MenuHostHelper$$ExternalSyntheticLambda0 = new onAppEnteredBackground<>();
            }
            x = MenuHostHelper$$ExternalSyntheticLambda0.setX(i);
        }
        return x;
    }

    private static void setIconTintList(int i, WeakReference<Interpolator> weakReference) {
        synchronized (setChipSpacingVerticalResource.class) {
            MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(i, weakReference);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> setChildIndicatorBoundsRelative<T> MenuHostHelper$$ExternalSyntheticLambda1(setMeasureAllChildren setmeasureallchildren, setBoxStrokeErrorColor setboxstrokeerrorcolor, float f, setScaleY<T> setscaley, boolean z) {
        if (z) {
            return setY(setboxstrokeerrorcolor, setmeasureallchildren, f, setscaley);
        }
        return new setChildIndicatorBoundsRelative<>(setscaley.setX(setmeasureallchildren, f));
    }

    private static <T> setChildIndicatorBoundsRelative<T> setY(setBoxStrokeErrorColor setboxstrokeerrorcolor, setMeasureAllChildren setmeasureallchildren, float f, setScaleY<T> setscaley) {
        Interpolator interpolator;
        Interpolator interpolator2;
        T t;
        Interpolator linearInterpolator;
        setmeasureallchildren.setX();
        boolean z = false;
        PointF pointF = null;
        PointF pointF2 = null;
        T t2 = null;
        T t3 = null;
        PointF pointF3 = null;
        float f2 = 0.0f;
        PointF pointF4 = null;
        while (setmeasureallchildren.setUnboundedRipple()) {
            switch (setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda1(setX)) {
                case 0:
                    f2 = (float) setmeasureallchildren.setNavigationOnClickListener();
                    break;
                case 1:
                    t3 = setscaley.setX(setmeasureallchildren, f);
                    break;
                case 2:
                    t2 = setscaley.setX(setmeasureallchildren, f);
                    break;
                case 3:
                    pointF = AppDatabase_Impl.MenuHostHelper$$ExternalSyntheticLambda1(setmeasureallchildren, f);
                    break;
                case 4:
                    pointF2 = AppDatabase_Impl.MenuHostHelper$$ExternalSyntheticLambda1(setmeasureallchildren, f);
                    break;
                case 5:
                    if (setmeasureallchildren.setLayoutAnimation() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF3 = AppDatabase_Impl.MenuHostHelper$$ExternalSyntheticLambda1(setmeasureallchildren, f);
                    break;
                case 7:
                    pointF4 = AppDatabase_Impl.MenuHostHelper$$ExternalSyntheticLambda1(setmeasureallchildren, f);
                    break;
                default:
                    setmeasureallchildren.setChipCornerRadius();
                    break;
            }
        }
        setmeasureallchildren.setIconTintList();
        if (z) {
            interpolator2 = setY;
            t = t3;
        } else {
            if (pointF != null && pointF2 != null) {
                float f3 = -f;
                pointF.x = setAnimateOnTouchUp.setIconTintList(pointF.x, f3, f);
                pointF.y = setAnimateOnTouchUp.setIconTintList(pointF.y, -100.0f, 100.0f);
                pointF2.x = setAnimateOnTouchUp.setIconTintList(pointF2.x, f3, f);
                pointF2.y = setAnimateOnTouchUp.setIconTintList(pointF2.y, -100.0f, 100.0f);
                int MenuHostHelper$$ExternalSyntheticLambda02 = setOnPageChangeListener.MenuHostHelper$$ExternalSyntheticLambda0(pointF.x, pointF.y, pointF2.x, pointF2.y);
                WeakReference<Interpolator> x = setX(MenuHostHelper$$ExternalSyntheticLambda02);
                interpolator = x != null ? x.get() : null;
                if (x == null || interpolator == null) {
                    pointF.x /= f;
                    pointF.y /= f;
                    pointF2.x /= f;
                    pointF2.y /= f;
                    try {
                        linearInterpolator = setLayoutAnimationListener.MenuHostHelper$$ExternalSyntheticLambda1(pointF.x, pointF.y, pointF2.x, pointF2.y);
                    } catch (IllegalArgumentException e) {
                        if (e.getMessage().equals("The Path cannot loop back on itself.")) {
                            linearInterpolator = setLayoutAnimationListener.MenuHostHelper$$ExternalSyntheticLambda1(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                        } else {
                            linearInterpolator = new LinearInterpolator();
                        }
                    }
                    interpolator = linearInterpolator;
                    try {
                        setIconTintList(MenuHostHelper$$ExternalSyntheticLambda02, new WeakReference(interpolator));
                    } catch (ArrayIndexOutOfBoundsException unused) {
                    }
                }
            } else {
                interpolator = setY;
            }
            interpolator2 = interpolator;
            t = t2;
        }
        setChildIndicatorBoundsRelative<T> setchildindicatorboundsrelative = new setChildIndicatorBoundsRelative<>(setboxstrokeerrorcolor, t3, t, interpolator2, f2, null);
        setchildindicatorboundsrelative.setNavigationOnClickListener = pointF3;
        setchildindicatorboundsrelative.setLayoutAnimation = pointF4;
        return setchildindicatorboundsrelative;
    }
}