package o;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class setOnSearchClickListener extends zzC {
    public abstract boolean setY(View view, float f, long j, setUnboundedRippleResource setunboundedrippleresource);

    public final float setIconTintList(float f, long j, View view, setUnboundedRippleResource setunboundedrippleresource) {
        this.setX.setX(f, this.setY);
        boolean z = true;
        float f2 = this.setY[1];
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i == 0) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
            return this.setY[2];
        }
        if (Float.isNaN(this.MenuHostHelper$$ExternalSyntheticLambda0)) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setunboundedrippleresource.MenuHostHelper$$ExternalSyntheticLambda1(view, this.setOnLongClickListener);
            if (Float.isNaN(this.MenuHostHelper$$ExternalSyntheticLambda0)) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = 0.0f;
            }
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = (float) ((this.MenuHostHelper$$ExternalSyntheticLambda0 + (((j - this.setIconTintList) * 1.0E-9d) * f2)) % 1.0d);
        String str = this.setOnLongClickListener;
        float f3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (!setunboundedrippleresource.MenuHostHelper$$ExternalSyntheticLambda0.containsKey(view)) {
            HashMap<String, float[]> hashMap = new HashMap<>();
            hashMap.put(str, new float[]{f3});
            setunboundedrippleresource.MenuHostHelper$$ExternalSyntheticLambda0.put(view, hashMap);
        } else {
            HashMap<String, float[]> hashMap2 = setunboundedrippleresource.MenuHostHelper$$ExternalSyntheticLambda0.get(view);
            if (hashMap2 == null) {
                hashMap2 = new HashMap<>();
            }
            if (!hashMap2.containsKey(str)) {
                hashMap2.put(str, new float[]{f3});
                setunboundedrippleresource.MenuHostHelper$$ExternalSyntheticLambda0.put(view, hashMap2);
            } else {
                float[] fArr = hashMap2.get(str);
                if (fArr == null) {
                    fArr = new float[0];
                }
                if (fArr.length <= 0) {
                    fArr = Arrays.copyOf(fArr, 1);
                }
                fArr[0] = f3;
                hashMap2.put(str, fArr);
            }
        }
        this.setIconTintList = j;
        float f4 = this.setY[0];
        float x = setX(this.MenuHostHelper$$ExternalSyntheticLambda0);
        float f5 = this.setY[2];
        if (f4 == 0.0f && i == 0) {
            z = false;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
        return (x * f4) + f5;
    }

    /* loaded from: classes.dex */
    public static class setIconTintList extends setOnSearchClickListener {
        @Override // o.setOnSearchClickListener
        public final boolean setY(View view, float f, long j, setUnboundedRippleResource setunboundedrippleresource) {
            view.setElevation(setIconTintList(f, j, view, setunboundedrippleresource));
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
    }

    /* loaded from: classes.dex */
    public static class setLayoutAnimation extends setOnSearchClickListener {
        @Override // o.setOnSearchClickListener
        public final boolean setY(View view, float f, long j, setUnboundedRippleResource setunboundedrippleresource) {
            view.setRotation(setIconTintList(f, j, view, setunboundedrippleresource));
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
    }

    /* loaded from: classes.dex */
    public static class setUiOptions extends setOnSearchClickListener {
        @Override // o.setOnSearchClickListener
        public final boolean setY(View view, float f, long j, setUnboundedRippleResource setunboundedrippleresource) {
            view.setRotationX(setIconTintList(f, j, view, setunboundedrippleresource));
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
    }

    /* loaded from: classes.dex */
    public static class setOnLongClickListener extends setOnSearchClickListener {
        @Override // o.setOnSearchClickListener
        public final boolean setY(View view, float f, long j, setUnboundedRippleResource setunboundedrippleresource) {
            view.setRotationY(setIconTintList(f, j, view, setunboundedrippleresource));
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
    }

    /* loaded from: classes.dex */
    public static class setX extends setOnSearchClickListener {
        @Override // o.setOnSearchClickListener
        public final boolean setY(View view, float f, long j, setUnboundedRippleResource setunboundedrippleresource) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        public final boolean MenuHostHelper$$ExternalSyntheticLambda0(View view, setUnboundedRippleResource setunboundedrippleresource, float f, long j, double d, double d2) {
            view.setRotation(setIconTintList(f, j, view, setunboundedrippleresource) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
    }

    /* loaded from: classes.dex */
    public static class setUnboundedRipple extends setOnSearchClickListener {
        @Override // o.setOnSearchClickListener
        public final boolean setY(View view, float f, long j, setUnboundedRippleResource setunboundedrippleresource) {
            view.setScaleX(setIconTintList(f, j, view, setunboundedrippleresource));
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
    }

    /* loaded from: classes.dex */
    public static class setNavigationOnClickListener extends setOnSearchClickListener {
        @Override // o.setOnSearchClickListener
        public final boolean setY(View view, float f, long j, setUnboundedRippleResource setunboundedrippleresource) {
            view.setScaleY(setIconTintList(f, j, view, setunboundedrippleresource));
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
    }

    /* loaded from: classes.dex */
    public static class setIconSize extends setOnSearchClickListener {
        @Override // o.setOnSearchClickListener
        public final boolean setY(View view, float f, long j, setUnboundedRippleResource setunboundedrippleresource) {
            view.setTranslationX(setIconTintList(f, j, view, setunboundedrippleresource));
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
    }

    /* loaded from: classes.dex */
    public static class setCenterIfNoTextEnabled extends setOnSearchClickListener {
        @Override // o.setOnSearchClickListener
        public final boolean setY(View view, float f, long j, setUnboundedRippleResource setunboundedrippleresource) {
            view.setTranslationY(setIconTintList(f, j, view, setunboundedrippleresource));
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
    }

    /* loaded from: classes.dex */
    public static class setTextAlignment extends setOnSearchClickListener {
        @Override // o.setOnSearchClickListener
        public final boolean setY(View view, float f, long j, setUnboundedRippleResource setunboundedrippleresource) {
            view.setTranslationZ(setIconTintList(f, j, view, setunboundedrippleresource));
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
    }

    /* loaded from: classes.dex */
    public static class setY extends setOnSearchClickListener {
        private boolean setUnboundedRipple = false;

        @Override // o.setOnSearchClickListener
        public final boolean setY(View view, float f, long j, setUnboundedRippleResource setunboundedrippleresource) {
            Method method;
            if (view instanceof setSubtitle) {
                ((setSubtitle) view).setProgress(setIconTintList(f, j, view, setunboundedrippleresource));
            } else if (this.setUnboundedRipple) {
                return false;
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.setUnboundedRipple = true;
                    method = null;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, Float.valueOf(setIconTintList(f, j, view, setunboundedrippleresource)));
                    } catch (IllegalAccessException e) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e2);
                    }
                }
            }
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
    }
}