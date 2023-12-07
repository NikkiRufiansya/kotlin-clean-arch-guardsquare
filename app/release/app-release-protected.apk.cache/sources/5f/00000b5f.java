package o;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class setErrorAccessibilityLabel extends setChipStrokeWidthResource {
    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(View view, float f);

    /* loaded from: classes.dex */
    public static class setY extends setErrorAccessibilityLabel {
        @Override // o.setErrorAccessibilityLabel
        public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, float f) {
            view.setElevation(setX(f));
        }
    }

    /* loaded from: classes.dex */
    public static class setLayoutAnimation extends setErrorAccessibilityLabel {
        @Override // o.setErrorAccessibilityLabel
        public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, float f) {
            view.setRotation(setX(f));
        }
    }

    /* loaded from: classes.dex */
    public static class setUnboundedRipple extends setErrorAccessibilityLabel {
        @Override // o.setErrorAccessibilityLabel
        public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, float f) {
            view.setRotationX(setX(f));
        }
    }

    /* loaded from: classes.dex */
    public static class setUiOptions extends setErrorAccessibilityLabel {
        @Override // o.setErrorAccessibilityLabel
        public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, float f) {
            view.setRotationY(setX(f));
        }
    }

    /* loaded from: classes.dex */
    public static class setNavigationOnClickListener extends setErrorAccessibilityLabel {
        @Override // o.setErrorAccessibilityLabel
        public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, float f) {
            view.setScaleX(setX(f));
        }
    }

    /* loaded from: classes.dex */
    public static class setOnLongClickListener extends setErrorAccessibilityLabel {
        @Override // o.setErrorAccessibilityLabel
        public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, float f) {
            view.setScaleY(setX(f));
        }
    }

    /* loaded from: classes.dex */
    public static class setChipCornerRadius extends setErrorAccessibilityLabel {
        @Override // o.setErrorAccessibilityLabel
        public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, float f) {
            view.setTranslationX(setX(f));
        }
    }

    /* loaded from: classes.dex */
    public static class setIconSize extends setErrorAccessibilityLabel {
        @Override // o.setErrorAccessibilityLabel
        public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, float f) {
            view.setTranslationY(setX(f));
        }
    }

    /* loaded from: classes.dex */
    public static class setTextAlignment extends setErrorAccessibilityLabel {
        @Override // o.setErrorAccessibilityLabel
        public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, float f) {
            view.setTranslationZ(setX(f));
        }
    }

    /* loaded from: classes.dex */
    public static class setIconTintList extends setErrorAccessibilityLabel {
        private setActiveIndicatorDrawable setNavigationOnClickListener;
        private float[] setOnLongClickListener = new float[1];

        @Override // o.setChipStrokeWidthResource
        public final void setY(Object obj) {
            this.setNavigationOnClickListener = (setActiveIndicatorDrawable) obj;
        }

        @Override // o.setErrorAccessibilityLabel
        public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, float f) {
            this.setOnLongClickListener[0] = setX(f);
            setStretchMode.MenuHostHelper$$ExternalSyntheticLambda0(this.setNavigationOnClickListener, view, this.setOnLongClickListener);
        }
    }

    /* loaded from: classes.dex */
    public static class setX extends setErrorAccessibilityLabel {
        private boolean setUnboundedRipple = false;

        @Override // o.setErrorAccessibilityLabel
        public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, float f) {
            Method method;
            if (view instanceof setSubtitle) {
                ((setSubtitle) view).setProgress(setX(f));
            } else if (this.setUnboundedRipple) {
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.setUnboundedRipple = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(setX(f)));
                    } catch (IllegalAccessException e) {
                        Log.e("ViewOscillator", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("ViewOscillator", "unable to setProgress", e2);
                    }
                }
            }
        }
    }
}