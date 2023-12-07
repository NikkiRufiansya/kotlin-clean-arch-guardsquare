package o;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class FirebasePerfKtxRegistrar extends setChipStrokeColor {
    public abstract void setY(View view, float f);

    /* loaded from: classes.dex */
    public static class setY extends FirebasePerfKtxRegistrar {
        @Override // o.FirebasePerfKtxRegistrar
        public final void setY(View view, float f) {
            view.setElevation(MenuHostHelper$$ExternalSyntheticLambda1(f));
        }
    }

    /* loaded from: classes.dex */
    public static class setIconTintList extends FirebasePerfKtxRegistrar {
        @Override // o.FirebasePerfKtxRegistrar
        public final void setY(View view, float f) {
            view.setAlpha(MenuHostHelper$$ExternalSyntheticLambda1(f));
        }
    }

    /* loaded from: classes.dex */
    public static class setOnLongClickListener extends FirebasePerfKtxRegistrar {
        @Override // o.FirebasePerfKtxRegistrar
        public final void setY(View view, float f) {
            view.setRotation(MenuHostHelper$$ExternalSyntheticLambda1(f));
        }
    }

    /* loaded from: classes.dex */
    public static class setUiOptions extends FirebasePerfKtxRegistrar {
        @Override // o.FirebasePerfKtxRegistrar
        public final void setY(View view, float f) {
            view.setRotationX(MenuHostHelper$$ExternalSyntheticLambda1(f));
        }
    }

    /* loaded from: classes.dex */
    public static class setLayoutAnimation extends FirebasePerfKtxRegistrar {
        @Override // o.FirebasePerfKtxRegistrar
        public final void setY(View view, float f) {
            view.setRotationY(MenuHostHelper$$ExternalSyntheticLambda1(f));
        }
    }

    /* loaded from: classes.dex */
    public static class setX extends FirebasePerfKtxRegistrar {
        @Override // o.FirebasePerfKtxRegistrar
        public final void setY(View view, float f) {
            view.setPivotX(MenuHostHelper$$ExternalSyntheticLambda1(f));
        }
    }

    /* loaded from: classes.dex */
    public static class setUnboundedRipple extends FirebasePerfKtxRegistrar {
        @Override // o.FirebasePerfKtxRegistrar
        public final void setY(View view, float f) {
            view.setPivotY(MenuHostHelper$$ExternalSyntheticLambda1(f));
        }
    }

    /* loaded from: classes.dex */
    public static class setIconSize extends FirebasePerfKtxRegistrar {
        @Override // o.FirebasePerfKtxRegistrar
        public final void setY(View view, float f) {
            view.setScaleX(MenuHostHelper$$ExternalSyntheticLambda1(f));
        }
    }

    /* loaded from: classes.dex */
    public static class setChipCornerRadius extends FirebasePerfKtxRegistrar {
        @Override // o.FirebasePerfKtxRegistrar
        public final void setY(View view, float f) {
            view.setScaleY(MenuHostHelper$$ExternalSyntheticLambda1(f));
        }
    }

    /* loaded from: classes.dex */
    public static class setCenterIfNoTextEnabled extends FirebasePerfKtxRegistrar {
        @Override // o.FirebasePerfKtxRegistrar
        public final void setY(View view, float f) {
            view.setTranslationY(MenuHostHelper$$ExternalSyntheticLambda1(f));
        }
    }

    /* loaded from: classes.dex */
    public static class setTextAlignment extends FirebasePerfKtxRegistrar {
        @Override // o.FirebasePerfKtxRegistrar
        public final void setY(View view, float f) {
            view.setTranslationZ(MenuHostHelper$$ExternalSyntheticLambda1(f));
        }
    }

    /* loaded from: classes.dex */
    public static class setNavigationOnClickListener extends FirebasePerfKtxRegistrar {
        private boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;

        @Override // o.FirebasePerfKtxRegistrar
        public final void setY(View view, float f) {
            Method method;
            if (view instanceof setSubtitle) {
                ((setSubtitle) view).setProgress(MenuHostHelper$$ExternalSyntheticLambda1(f));
            } else if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(MenuHostHelper$$ExternalSyntheticLambda1(f)));
                    } catch (IllegalAccessException e) {
                        Log.e("ViewSpline", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("ViewSpline", "unable to setProgress", e2);
                    }
                }
            }
        }
    }
}