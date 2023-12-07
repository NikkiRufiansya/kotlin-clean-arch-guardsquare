package o;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import o.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
import o.setActiveIndicatorDrawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setImageIcon implements Comparable<setImageIcon> {
    private float setGuidelinePercent;
    private joinThreadPool setMinAndMaxProgress;
    int setOnNavigationItemSelectedListener;
    float MenuHostHelper$$ExternalSyntheticLambda0 = 1.0f;
    int setLayoutAnimation = 0;
    private boolean setZ = false;
    float setX = 0.0f;
    float setUiOptions = 0.0f;
    float setOnLongClickListener = 0.0f;
    public float setNavigationOnClickListener = 0.0f;
    float ViewPager$SavedState$1 = 1.0f;
    float setCenterIfNoTextEnabled = 1.0f;
    float MenuHostHelper$$ExternalSyntheticLambda1 = Float.NaN;
    float setIconTintList = Float.NaN;
    float setIconSize = 0.0f;
    float setChipCornerRadius = 0.0f;
    float setTextAlignment = 0.0f;
    private int setMaxEms = 0;
    float setY = Float.NaN;
    float setUnboundedRipple = Float.NaN;
    private int setTextScaleX = -1;
    private LinkedHashMap<String, setActiveIndicatorDrawable> setAnimationFromJson = new LinkedHashMap<>();
    private int setLayoutDirection = 0;
    private double[] setCheckedIconEnabled = new double[18];
    private double[] setTextAppearanceResource = new double[18];

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(setImageIcon setimageicon) {
        return Float.compare(this.setGuidelinePercent, setimageicon.setGuidelinePercent);
    }

    static {
        new String[]{"position", "x", "y", "width", "height", "pathRotate"};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setX(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(View view) {
        this.setOnNavigationItemSelectedListener = view.getVisibility();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.setZ = false;
        this.setX = view.getElevation();
        this.setUiOptions = view.getRotation();
        this.setOnLongClickListener = view.getRotationX();
        this.setNavigationOnClickListener = view.getRotationY();
        this.ViewPager$SavedState$1 = view.getScaleX();
        this.setCenterIfNoTextEnabled = view.getScaleY();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = view.getPivotX();
        this.setIconTintList = view.getPivotY();
        this.setIconSize = view.getTranslationX();
        this.setChipCornerRadius = view.getTranslationY();
        this.setTextAlignment = view.getTranslationZ();
    }

    public final void setX(HashMap<String, FirebasePerfKtxRegistrar> hashMap, int i) {
        for (String str : hashMap.keySet()) {
            FirebasePerfKtxRegistrar firebasePerfKtxRegistrar = hashMap.get(str);
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = '\r';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(i, Float.isNaN(this.setOnLongClickListener) ? 0.0f : this.setOnLongClickListener);
                    break;
                case 1:
                    firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(i, Float.isNaN(this.setNavigationOnClickListener) ? 0.0f : this.setNavigationOnClickListener);
                    break;
                case 2:
                    firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(i, Float.isNaN(this.setIconSize) ? 0.0f : this.setIconSize);
                    break;
                case 3:
                    firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(i, Float.isNaN(this.setChipCornerRadius) ? 0.0f : this.setChipCornerRadius);
                    break;
                case 4:
                    firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(i, Float.isNaN(this.setTextAlignment) ? 0.0f : this.setTextAlignment);
                    break;
                case 5:
                    firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(i, Float.isNaN(this.setUnboundedRipple) ? 0.0f : this.setUnboundedRipple);
                    break;
                case 6:
                    firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(i, Float.isNaN(this.ViewPager$SavedState$1) ? 1.0f : this.ViewPager$SavedState$1);
                    break;
                case 7:
                    firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(i, Float.isNaN(this.setCenterIfNoTextEnabled) ? 1.0f : this.setCenterIfNoTextEnabled);
                    break;
                case '\b':
                    firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(i, Float.isNaN(this.MenuHostHelper$$ExternalSyntheticLambda1) ? 0.0f : this.MenuHostHelper$$ExternalSyntheticLambda1);
                    break;
                case '\t':
                    firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(i, Float.isNaN(this.setIconTintList) ? 0.0f : this.setIconTintList);
                    break;
                case '\n':
                    firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(i, Float.isNaN(this.setUiOptions) ? 0.0f : this.setUiOptions);
                    break;
                case 11:
                    firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(i, Float.isNaN(this.setX) ? 0.0f : this.setX);
                    break;
                case '\f':
                    firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(i, Float.isNaN(this.setY) ? 0.0f : this.setY);
                    break;
                case '\r':
                    firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(i, Float.isNaN(this.MenuHostHelper$$ExternalSyntheticLambda0) ? 1.0f : this.MenuHostHelper$$ExternalSyntheticLambda0);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.setAnimationFromJson.containsKey(str2)) {
                            setActiveIndicatorDrawable setactiveindicatordrawable = this.setAnimationFromJson.get(str2);
                            if (!(firebasePerfKtxRegistrar instanceof FirebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str);
                                sb.append(" ViewSpline not a CustomSet frame = ");
                                sb.append(i);
                                sb.append(", value");
                                sb.append(setactiveindicatordrawable.setY());
                                sb.append(firebasePerfKtxRegistrar);
                                Log.e("MotionPaths", sb.toString());
                                break;
                            } else {
                                ((FirebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1) firebasePerfKtxRegistrar).MenuHostHelper$$ExternalSyntheticLambda1.append(i, setactiveindicatordrawable);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("UNKNOWN spline ");
                        sb2.append(str);
                        Log.e("MotionPaths", sb2.toString());
                        break;
                    }
            }
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(Rect rect, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, int i, int i2) {
        int i3 = rect.left;
        int i4 = rect.top;
        rect.width();
        rect.height();
        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX MenuHostHelper$$ExternalSyntheticLambda1 = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(i2);
        this.setLayoutAnimation = MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1;
        this.setOnNavigationItemSelectedListener = MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = (MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0 == 0 || this.setLayoutAnimation != 0) ? MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation.setY : 0.0f;
        this.setZ = MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener.setY;
        this.setX = MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener.setIconTintList;
        this.setUiOptions = MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1;
        this.setOnLongClickListener = MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0;
        this.setNavigationOnClickListener = MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener.setOnLongClickListener;
        this.ViewPager$SavedState$1 = MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener.setLayoutAnimation;
        this.setCenterIfNoTextEnabled = MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener.setUiOptions;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener.setUnboundedRipple;
        this.setIconTintList = MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener.setTextAlignment;
        this.setIconSize = MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener.ViewPager$SavedState$1;
        this.setChipCornerRadius = MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener.setIconSize;
        this.setTextAlignment = MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener.setCenterIfNoTextEnabled;
        this.setMinAndMaxProgress = joinThreadPool.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions.setTextAlignment);
        this.setY = MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions.setOnLongClickListener;
        this.setMaxEms = MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions.setX;
        this.setTextScaleX = MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions.setY;
        this.setUnboundedRipple = MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation.setIconTintList;
        Iterator<String> it = MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0.keySet().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            setActiveIndicatorDrawable setactiveindicatordrawable = MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0.get(next);
            int i5 = setActiveIndicatorDrawable.AnonymousClass4.MenuHostHelper$$ExternalSyntheticLambda1[setactiveindicatordrawable.setNavigationOnClickListener.ordinal()];
            if ((i5 == 1 || i5 == 2 || i5 == 3) ? false : false) {
                this.setAnimationFromJson.put(next, setactiveindicatordrawable);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.setUiOptions + 90.0f;
            this.setUiOptions = f;
            if (f > 180.0f) {
                this.setUiOptions = f - 360.0f;
                return;
            }
            return;
        }
        this.setUiOptions -= 90.0f;
    }
}