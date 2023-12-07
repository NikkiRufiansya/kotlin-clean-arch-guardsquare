package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import o.SingleGeneratedAdapterObserver;
import o.setTextMetricsParams;
import o.setTextStartPaddingResource;

/* loaded from: classes.dex */
public class copyRootViewBounds {
    private static final setStepSize<String, Typeface> MenuHostHelper$$ExternalSyntheticLambda0;
    private static final setKeyProgressIncrement setY;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            setY = new setItemActiveIndicatorMarginHorizontal();
        } else if (Build.VERSION.SDK_INT >= 28) {
            setY = new setOptimizationLevel();
        } else if (Build.VERSION.SDK_INT >= 26) {
            setY = new getStrokeColor();
        } else if (Build.VERSION.SDK_INT >= 24 && setMinLines.MenuHostHelper$$ExternalSyntheticLambda1()) {
            setY = new setMinLines();
        } else {
            setY = new setWindowInsetsAnimationCallback();
        }
        MenuHostHelper$$ExternalSyntheticLambda0 = new setStepSize<>(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String setY(Resources resources, int i, String str, int i2, int i3) {
        StringBuilder sb = new StringBuilder(resources.getResourcePackageName(i));
        sb.append('-');
        sb.append(str);
        sb.append('-');
        sb.append(i2);
        sb.append('-');
        sb.append(i);
        sb.append('-');
        sb.append(i3);
        return sb.toString();
    }

    private static Typeface MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }

    public static Typeface MenuHostHelper$$ExternalSyntheticLambda0(Context context, setTextMetricsParams$MenuHostHelper$$ExternalSyntheticLambda1 settextmetricsparams_menuhosthelper__externalsyntheticlambda1, Resources resources, int i, String str, int i2, int i3, setTextStartPaddingResource.setY sety, Handler handler, boolean z) {
        Typeface iconTintList;
        if (settextmetricsparams_menuhosthelper__externalsyntheticlambda1 instanceof setTextMetricsParams.setX) {
            setTextMetricsParams.setX setx = (setTextMetricsParams.setX) settextmetricsparams_menuhosthelper__externalsyntheticlambda1;
            Typeface MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0(setx.setX());
            if (MenuHostHelper$$ExternalSyntheticLambda02 != null) {
                if (sety != null) {
                    sety.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda02, handler);
                }
                return MenuHostHelper$$ExternalSyntheticLambda02;
            }
            iconTintList = SingleGeneratedAdapterObserver.setY(context, setx.MenuHostHelper$$ExternalSyntheticLambda0(), i3, !z ? sety != null : setx.setIconTintList() != 0, z ? setx.setY() : -1, setTextStartPaddingResource.setY.setX(handler), new setIconTintList(sety));
        } else {
            iconTintList = setY.setIconTintList(context, (setTextMetricsParams$MenuHostHelper$$ExternalSyntheticLambda0) settextmetricsparams_menuhosthelper__externalsyntheticlambda1, resources, i3);
            if (sety != null) {
                if (iconTintList != null) {
                    sety.MenuHostHelper$$ExternalSyntheticLambda1(iconTintList, handler);
                } else {
                    sety.setIconTintList(-3, handler);
                }
            }
        }
        if (iconTintList != null) {
            MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setY(resources, i, str, i2, i3), iconTintList);
        }
        return iconTintList;
    }

    public static Typeface setY(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface MenuHostHelper$$ExternalSyntheticLambda1 = setY.MenuHostHelper$$ExternalSyntheticLambda1(context, resources, i, str, i3);
        if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setY(resources, i, str, i2, i3), MenuHostHelper$$ExternalSyntheticLambda1);
        }
        return MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public static Typeface MenuHostHelper$$ExternalSyntheticLambda0(Context context, CancellationSignal cancellationSignal, SingleGeneratedAdapterObserver.setX[] setxArr, int i) {
        return setY.setX(context, cancellationSignal, setxArr, i);
    }

    public static Typeface setX(Context context, Typeface typeface, int i) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        return Typeface.create(typeface, i);
    }

    /* loaded from: classes.dex */
    public static class setIconTintList extends SingleGeneratedAdapterObserver.setY {
        private setTextStartPaddingResource.setY setIconTintList;

        public setIconTintList(setTextStartPaddingResource.setY sety) {
            this.setIconTintList = sety;
        }

        @Override // o.SingleGeneratedAdapterObserver.setY
        public void setX(Typeface typeface) {
            setTextStartPaddingResource.setY sety = this.setIconTintList;
            if (sety != null) {
                sety.MenuHostHelper$$ExternalSyntheticLambda0(typeface);
            }
        }

        @Override // o.SingleGeneratedAdapterObserver.setY
        public void setX(int i) {
            setTextStartPaddingResource.setY sety = this.setIconTintList;
            if (sety != null) {
                sety.setY(i);
            }
        }
    }
}