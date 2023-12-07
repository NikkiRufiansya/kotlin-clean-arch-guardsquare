package o;

import java.util.LinkedHashMap;
import o.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
import o.setActiveIndicatorDrawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setDivider implements Comparable<setDivider> {
    static String[] MenuHostHelper$$ExternalSyntheticLambda1 = {"position", "x", "y", "width", "height", "pathRotate"};
    LinkedHashMap<String, setActiveIndicatorDrawable> MenuHostHelper$$ExternalSyntheticLambda0;
    double[] ViewPager$SavedState$1;
    private float setAnimationFromJson;
    float setCenterIfNoTextEnabled;
    float setChipCornerRadius;
    float setIconSize;
    int setIconTintList;
    joinThreadPool setLayoutAnimation;
    private int setMaxEms;
    setIconStartPadding setNavigationOnClickListener;
    int setOnLongClickListener;
    private float setOnNavigationItemSelectedListener;
    double[] setTextAlignment;
    float setTextScaleX;
    int setUiOptions;
    float setUnboundedRipple;
    float setX;
    int setY;
    float setZ;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(setDivider setdivider) {
        return Float.compare(this.setChipCornerRadius, setdivider.setChipCornerRadius);
    }

    public setDivider() {
        this.setY = 0;
        this.setUnboundedRipple = Float.NaN;
        this.setOnNavigationItemSelectedListener = Float.NaN;
        this.setOnLongClickListener = -1;
        this.setIconTintList = -1;
        this.setAnimationFromJson = Float.NaN;
        this.setNavigationOnClickListener = null;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new LinkedHashMap<>();
        this.setUiOptions = 0;
        this.ViewPager$SavedState$1 = new double[18];
        this.setTextAlignment = new double[18];
    }

    public setDivider(int i, int i2, onContextItemSelected oncontextitemselected, setDivider setdivider, setDivider setdivider2) {
        float f;
        float f2;
        float f3;
        float f4;
        float min;
        float f5;
        this.setY = 0;
        this.setUnboundedRipple = Float.NaN;
        this.setOnNavigationItemSelectedListener = Float.NaN;
        this.setOnLongClickListener = -1;
        this.setIconTintList = -1;
        this.setAnimationFromJson = Float.NaN;
        this.setNavigationOnClickListener = null;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new LinkedHashMap<>();
        this.setUiOptions = 0;
        this.ViewPager$SavedState$1 = new double[18];
        this.setTextAlignment = new double[18];
        if (setdivider.setIconTintList == -1) {
            int i3 = oncontextitemselected.setTextAlignment;
            if (i3 == 1) {
                float f6 = oncontextitemselected.setIconTintList / 100.0f;
                this.setCenterIfNoTextEnabled = f6;
                this.setY = oncontextitemselected.setNavigationOnClickListener;
                float f7 = Float.isNaN(oncontextitemselected.setChipCornerRadius) ? f6 : oncontextitemselected.setChipCornerRadius;
                float f8 = Float.isNaN(oncontextitemselected.setUnboundedRipple) ? f6 : oncontextitemselected.setUnboundedRipple;
                float f9 = setdivider2.setIconSize;
                float f10 = setdivider.setIconSize;
                float f11 = setdivider2.setX;
                float f12 = setdivider.setX;
                this.setChipCornerRadius = this.setCenterIfNoTextEnabled;
                f6 = Float.isNaN(oncontextitemselected.setIconSize) ? f6 : oncontextitemselected.setIconSize;
                float f13 = setdivider.setTextScaleX;
                float f14 = setdivider.setIconSize;
                float f15 = setdivider.setZ;
                float f16 = setdivider.setX;
                float f17 = (setdivider2.setTextScaleX + (setdivider2.setIconSize / 2.0f)) - ((f14 / 2.0f) + f13);
                float f18 = (setdivider2.setZ + (setdivider2.setX / 2.0f)) - ((f16 / 2.0f) + f15);
                float f19 = f17 * f6;
                float f20 = ((f9 - f10) * f7) / 2.0f;
                this.setTextScaleX = (int) ((f13 + f19) - f20);
                float f21 = f6 * f18;
                float f22 = ((f11 - f12) * f8) / 2.0f;
                this.setZ = (int) ((f15 + f21) - f22);
                this.setIconSize = (int) (f14 + f);
                this.setX = (int) (f16 + f2);
                float f23 = Float.isNaN(oncontextitemselected.setCenterIfNoTextEnabled) ? 0.0f : oncontextitemselected.setCenterIfNoTextEnabled;
                this.setUiOptions = 1;
                float f24 = (int) ((setdivider.setTextScaleX + f19) - f20);
                this.setTextScaleX = f24;
                this.setTextScaleX = f24 + ((-f18) * f23);
                this.setZ = ((int) ((setdivider.setZ + f21) - f22)) + (f17 * f23);
                this.setIconTintList = this.setIconTintList;
                this.setLayoutAnimation = joinThreadPool.setIconTintList(oncontextitemselected.ViewPager$SavedState$1);
                this.setOnLongClickListener = oncontextitemselected.setLayoutAnimation;
                return;
            } else if (i3 != 2) {
                float f25 = oncontextitemselected.setIconTintList / 100.0f;
                this.setCenterIfNoTextEnabled = f25;
                this.setY = oncontextitemselected.setNavigationOnClickListener;
                float f26 = Float.isNaN(oncontextitemselected.setChipCornerRadius) ? f25 : oncontextitemselected.setChipCornerRadius;
                float f27 = Float.isNaN(oncontextitemselected.setUnboundedRipple) ? f25 : oncontextitemselected.setUnboundedRipple;
                float f28 = setdivider2.setIconSize;
                float f29 = setdivider.setIconSize;
                float f30 = setdivider2.setX;
                float f31 = setdivider.setX;
                this.setChipCornerRadius = this.setCenterIfNoTextEnabled;
                float f32 = setdivider.setTextScaleX;
                float f33 = setdivider.setZ;
                float f34 = (setdivider2.setTextScaleX + (f28 / 2.0f)) - ((f29 / 2.0f) + f32);
                float f35 = (setdivider2.setZ + (f30 / 2.0f)) - (f33 + (f31 / 2.0f));
                float f36 = ((f28 - f29) * f26) / 2.0f;
                this.setTextScaleX = (int) ((f32 + (f34 * f25)) - f36);
                float f37 = ((f30 - f31) * f27) / 2.0f;
                this.setZ = (int) ((f33 + (f35 * f25)) - f37);
                this.setIconSize = (int) (f29 + f3);
                this.setX = (int) (f31 + f4);
                float f38 = Float.isNaN(oncontextitemselected.setIconSize) ? f25 : oncontextitemselected.setIconSize;
                float f39 = Float.isNaN(oncontextitemselected.setUiOptions) ? 0.0f : oncontextitemselected.setUiOptions;
                f25 = Float.isNaN(oncontextitemselected.setCenterIfNoTextEnabled) ? f25 : oncontextitemselected.setCenterIfNoTextEnabled;
                float f40 = !Float.isNaN(oncontextitemselected.setOnLongClickListener) ? oncontextitemselected.setOnLongClickListener : 0.0f;
                this.setUiOptions = 0;
                this.setTextScaleX = (int) (((setdivider.setTextScaleX + (f38 * f34)) + (f40 * f35)) - f36);
                this.setZ = (int) (((setdivider.setZ + (f34 * f39)) + (f35 * f25)) - f37);
                this.setLayoutAnimation = joinThreadPool.setIconTintList(oncontextitemselected.ViewPager$SavedState$1);
                this.setOnLongClickListener = oncontextitemselected.setLayoutAnimation;
                return;
            } else {
                float f41 = oncontextitemselected.setIconTintList / 100.0f;
                this.setCenterIfNoTextEnabled = f41;
                this.setY = oncontextitemselected.setNavigationOnClickListener;
                float f42 = Float.isNaN(oncontextitemselected.setChipCornerRadius) ? f41 : oncontextitemselected.setChipCornerRadius;
                float f43 = Float.isNaN(oncontextitemselected.setUnboundedRipple) ? f41 : oncontextitemselected.setUnboundedRipple;
                float f44 = setdivider2.setIconSize;
                float f45 = setdivider.setIconSize;
                float f46 = setdivider2.setX;
                float f47 = setdivider.setX;
                this.setChipCornerRadius = this.setCenterIfNoTextEnabled;
                float f48 = setdivider.setTextScaleX;
                float f49 = setdivider.setZ;
                float f50 = setdivider2.setTextScaleX;
                float f51 = f44 / 2.0f;
                float f52 = setdivider2.setZ;
                float f53 = f46 / 2.0f;
                float f54 = (f44 - f45) * f42;
                this.setTextScaleX = (int) ((f48 + (((f50 + f51) - ((f45 / 2.0f) + f48)) * f41)) - (f54 / 2.0f));
                float f55 = (f46 - f47) * f43;
                this.setZ = (int) ((f49 + (((f52 + f53) - ((f47 / 2.0f) + f49)) * f41)) - (f55 / 2.0f));
                this.setIconSize = (int) (f45 + f54);
                this.setX = (int) (f47 + f55);
                this.setUiOptions = 2;
                if (!Float.isNaN(oncontextitemselected.setIconSize)) {
                    this.setTextScaleX = (int) (oncontextitemselected.setIconSize * ((int) (i - this.setIconSize)));
                }
                if (!Float.isNaN(oncontextitemselected.setCenterIfNoTextEnabled)) {
                    this.setZ = (int) (oncontextitemselected.setCenterIfNoTextEnabled * ((int) (i2 - this.setX)));
                }
                this.setIconTintList = this.setIconTintList;
                this.setLayoutAnimation = joinThreadPool.setIconTintList(oncontextitemselected.ViewPager$SavedState$1);
                this.setOnLongClickListener = oncontextitemselected.setLayoutAnimation;
                return;
            }
        }
        float f56 = oncontextitemselected.setIconTintList / 100.0f;
        this.setCenterIfNoTextEnabled = f56;
        this.setY = oncontextitemselected.setNavigationOnClickListener;
        this.setUiOptions = oncontextitemselected.setTextAlignment;
        float f57 = Float.isNaN(oncontextitemselected.setChipCornerRadius) ? f56 : oncontextitemselected.setChipCornerRadius;
        float f58 = Float.isNaN(oncontextitemselected.setUnboundedRipple) ? f56 : oncontextitemselected.setUnboundedRipple;
        float f59 = setdivider2.setIconSize;
        float f60 = setdivider.setIconSize;
        float f61 = setdivider2.setX;
        float f62 = setdivider.setX;
        this.setChipCornerRadius = this.setCenterIfNoTextEnabled;
        this.setIconSize = (int) (f60 + ((f59 - f60) * f57));
        this.setX = (int) (f62 + ((f61 - f62) * f58));
        int i4 = oncontextitemselected.setTextAlignment;
        if (i4 == 1) {
            float f63 = Float.isNaN(oncontextitemselected.setIconSize) ? f56 : oncontextitemselected.setIconSize;
            float f64 = setdivider2.setTextScaleX;
            float f65 = setdivider.setTextScaleX;
            this.setTextScaleX = (f63 * (f64 - f65)) + f65;
            f56 = Float.isNaN(oncontextitemselected.setCenterIfNoTextEnabled) ? f56 : oncontextitemselected.setCenterIfNoTextEnabled;
            float f66 = setdivider2.setZ;
            float f67 = setdivider.setZ;
            this.setZ = (f56 * (f66 - f67)) + f67;
        } else if (i4 == 2) {
            if (Float.isNaN(oncontextitemselected.setIconSize)) {
                float f68 = setdivider2.setTextScaleX;
                float f69 = setdivider.setTextScaleX;
                min = ((f68 - f69) * f56) + f69;
            } else {
                min = Math.min(f58, f57) * oncontextitemselected.setIconSize;
            }
            this.setTextScaleX = min;
            if (Float.isNaN(oncontextitemselected.setCenterIfNoTextEnabled)) {
                float f70 = setdivider2.setZ;
                float f71 = setdivider.setZ;
                f5 = (f56 * (f70 - f71)) + f71;
            } else {
                f5 = oncontextitemselected.setCenterIfNoTextEnabled;
            }
            this.setZ = f5;
        } else {
            float f72 = Float.isNaN(oncontextitemselected.setIconSize) ? f56 : oncontextitemselected.setIconSize;
            float f73 = setdivider2.setTextScaleX;
            float f74 = setdivider.setTextScaleX;
            this.setTextScaleX = (f72 * (f73 - f74)) + f74;
            f56 = Float.isNaN(oncontextitemselected.setCenterIfNoTextEnabled) ? f56 : oncontextitemselected.setCenterIfNoTextEnabled;
            float f75 = setdivider2.setZ;
            float f76 = setdivider.setZ;
            this.setZ = (f56 * (f75 - f76)) + f76;
        }
        this.setIconTintList = setdivider.setIconTintList;
        this.setLayoutAnimation = joinThreadPool.setIconTintList(oncontextitemselected.ViewPager$SavedState$1);
        this.setOnLongClickListener = oncontextitemselected.setLayoutAnimation;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(setIconStartPadding seticonstartpadding, setDivider setdivider) {
        double d = ((this.setTextScaleX + (this.setIconSize / 2.0f)) - setdivider.setTextScaleX) - (setdivider.setIconSize / 2.0f);
        double d2 = ((this.setZ + (this.setX / 2.0f)) - setdivider.setZ) - (setdivider.setX / 2.0f);
        this.setNavigationOnClickListener = seticonstartpadding;
        this.setTextScaleX = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.setAnimationFromJson)) {
            this.setZ = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.setZ = (float) Math.toRadians(this.setAnimationFromJson);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean MenuHostHelper$$ExternalSyntheticLambda0(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.setTextScaleX;
        float f2 = this.setZ;
        float f3 = this.setIconSize;
        float f4 = this.setX;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        setIconStartPadding seticonstartpadding = this.setNavigationOnClickListener;
        if (seticonstartpadding != null) {
            float[] fArr2 = new float[2];
            seticonstartpadding.setIconTintList(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = f6;
            double d3 = f;
            double d4 = f2;
            f = (float) ((d2 + (Math.sin(d4) * d3)) - (f3 / 2.0f));
            f2 = (float) ((f7 - (d3 * Math.cos(d4))) - (f4 / 2.0f));
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void MenuHostHelper$$ExternalSyntheticLambda1(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((f4 * 0.0f) / 2.0f);
        float f9 = f5 - ((f6 * 0.0f) / 2.0f);
        fArr[0] = ((1.0f - f) * f8) + ((f4 + f8) * f) + 0.0f;
        fArr[1] = ((1.0f - f2) * f9) + ((f6 + f9) * f2) + 0.0f;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX setx) {
        this.setLayoutAnimation = joinThreadPool.setIconTintList(setx.setUiOptions.setTextAlignment);
        this.setOnLongClickListener = setx.setUiOptions.setUiOptions;
        this.setIconTintList = setx.setUiOptions.setY;
        this.setUnboundedRipple = setx.setUiOptions.setOnLongClickListener;
        this.setY = setx.setUiOptions.setX;
        this.setMaxEms = setx.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0;
        this.setOnNavigationItemSelectedListener = setx.setLayoutAnimation.setIconTintList;
        this.setAnimationFromJson = setx.setY.setOnLongClickListener;
        for (String str : setx.MenuHostHelper$$ExternalSyntheticLambda0.keySet()) {
            setActiveIndicatorDrawable setactiveindicatordrawable = setx.MenuHostHelper$$ExternalSyntheticLambda0.get(str);
            if (setactiveindicatordrawable != null) {
                int i = setActiveIndicatorDrawable.AnonymousClass4.MenuHostHelper$$ExternalSyntheticLambda1[setactiveindicatordrawable.setNavigationOnClickListener.ordinal()];
                boolean z = true;
                if ((i == 1 || i == 2 || i == 3) ? false : false) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0.put(str, setactiveindicatordrawable);
                }
            }
        }
    }
}