package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.FirebasePerfKtxRegistrar;
import o.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
import o.setActiveIndicatorDrawable;
import o.setErrorAccessibilityLabel;
import o.setMIndicatorOptions;
import o.setOnSearchClickListener;

/* loaded from: classes.dex */
public final class setIconStartPadding {
    private String ExtendableSavedState$1;
    private HashMap<String, setOnSearchClickListener> FragmentStateAdapter$2;
    setCompatElevation MenuHostHelper$$ExternalSyntheticLambda0;
    HashMap<String, FirebasePerfKtxRegistrar> MenuHostHelper$$ExternalSyntheticLambda1;
    double[] setCenterIfNoTextEnabled;
    private int[] setChipIconTintResource;
    private String[] setHasDecor;
    int[] setIconSize;
    float setIconTintList;
    int setNavigationOnClickListener;
    setTypeface[] setTextAlignment;
    View setTextAppearanceResource;
    double[] setUnboundedRipple;
    float setX;
    HashMap<String, setErrorAccessibilityLabel> setY;
    setCompatElevation[] setZ;
    private Rect setConstraintSet = new Rect();
    boolean setLayoutAnimation = false;
    private int SearchView$SavedState$1 = -1;
    setDivider setLayoutDirection = new setDivider();
    setDivider setUiOptions = new setDivider();
    setImageIcon setMinAndMaxProgress = new setImageIcon();
    setImageIcon setOnLongClickListener = new setImageIcon();
    float setMaxEms = Float.NaN;
    float setOnNavigationItemSelectedListener = 0.0f;
    float setCheckedIconEnabled = 1.0f;
    private int setIconified = 4;
    private float[] setAdapter = new float[4];
    ArrayList<setDivider> ViewPager$SavedState$1 = new ArrayList<>();
    float[] setGuidelinePercent = new float[1];
    ArrayList<setLayoutMode> setChipCornerRadius = new ArrayList<>();
    int setAnimationFromJson = -1;
    private int setFilterTouchesWhenObscured = -1;
    private View setViewTranslationCallback = null;
    private int FloatingActionButton$BaseBehavior = -1;
    private float setContentScrimResource = Float.NaN;
    private Interpolator FragmentStateAdapter$5 = null;
    boolean setTextScaleX = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setIconStartPadding(View view) {
        this.setTextAppearanceResource = view;
        this.setNavigationOnClickListener = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof setMIndicatorOptions.setIconTintList) {
            this.ExtendableSavedState$1 = ((setMIndicatorOptions.setIconTintList) layoutParams).ViewPager$SavedState$1;
        }
    }

    public final void setIconTintList(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.setZ[0].setX(d, dArr);
        this.setZ[0].MenuHostHelper$$ExternalSyntheticLambda1(d, dArr2);
        float f = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        setDivider setdivider = this.setLayoutDirection;
        int[] iArr = this.setIconSize;
        float f2 = setdivider.setTextScaleX;
        float f3 = setdivider.setZ;
        float f4 = setdivider.setIconSize;
        float f5 = setdivider.setX;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f9 = (float) dArr[i];
            float f10 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f2 = f9;
                f = f10;
            } else if (i2 == 2) {
                f3 = f9;
                f6 = f10;
            } else if (i2 == 3) {
                f4 = f9;
                f7 = f10;
            } else if (i2 == 4) {
                f5 = f9;
                f8 = f10;
            }
        }
        float f11 = 2.0f;
        float f12 = (f7 / 2.0f) + f;
        float f13 = (f8 / 2.0f) + f6;
        setIconStartPadding seticonstartpadding = setdivider.setNavigationOnClickListener;
        if (seticonstartpadding != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            seticonstartpadding.setIconTintList(d, fArr3, fArr4);
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr4[0];
            float f17 = fArr4[1];
            double d2 = f2;
            double d3 = f3;
            float sin = (float) ((f14 + (Math.sin(d3) * d2)) - (f4 / 2.0f));
            float cos = (float) ((f15 - (d2 * Math.cos(d3))) - (f5 / 2.0f));
            double d4 = f16;
            double d5 = f;
            double sin2 = Math.sin(d3);
            double d6 = f6;
            f2 = sin;
            f3 = cos;
            f13 = (float) ((f17 - (d5 * Math.cos(d3))) + (Math.sin(d3) * d6));
            f12 = (float) (d4 + (sin2 * d5) + (Math.cos(d3) * d6));
            f11 = 2.0f;
        }
        fArr[0] = f2 + (f4 / f11) + 0.0f;
        fArr[1] = f3 + (f5 / f11) + 0.0f;
        fArr2[0] = f12;
        fArr2[1] = f13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void setY(int i, int i2, long j) {
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        Object obj;
        String str4;
        String str5;
        String str6;
        HashSet<String> hashSet;
        Object obj2;
        HashSet<String> hashSet2;
        String str7;
        String str8;
        Object obj3;
        Object obj4;
        Object obj5;
        String str9;
        String str10;
        Object obj6;
        String str11;
        Object obj7;
        String str12;
        Object obj8;
        String str13;
        String str14;
        String str15;
        char c;
        setErrorAccessibilityLabel setunboundedripple;
        Iterator<String> it;
        setErrorAccessibilityLabel.setIconTintList seticontintlist;
        String str16;
        String str17;
        String str18;
        String str19;
        double d;
        float f;
        String str20;
        String str21;
        double[] dArr;
        double[][] dArr2;
        double[][] dArr3;
        int i3;
        String str22;
        setActiveIndicatorDrawable setactiveindicatordrawable;
        HashMap<String, setOnSearchClickListener> hashMap;
        String str23;
        String str24;
        char c2;
        Object obj9;
        Object obj10;
        Object obj11;
        String str25;
        String str26;
        Iterator<String> it2;
        HashMap<String, Integer> hashMap2;
        Object obj12;
        Object obj13;
        char c3;
        setOnSearchClickListener setuioptions;
        setActiveIndicatorDrawable setactiveindicatordrawable2;
        Iterator<String> it3;
        int i4;
        Integer num;
        Iterator<String> it4;
        Object obj14;
        String str27;
        String str28;
        String str29;
        HashSet<String> hashSet3;
        Object obj15;
        HashSet<String> hashSet4;
        Object obj16;
        char c4;
        FirebasePerfKtxRegistrar setuioptions2;
        FirebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1;
        setActiveIndicatorDrawable setactiveindicatordrawable3;
        String str30;
        String str31;
        String str32;
        new HashSet();
        HashSet<String> hashSet5 = new HashSet<>();
        HashSet<String> hashSet6 = new HashSet<>();
        HashSet<String> hashSet7 = new HashSet<>();
        HashMap<String, Integer> hashMap3 = new HashMap<>();
        int i5 = this.setAnimationFromJson;
        if (i5 != -1) {
            this.setLayoutDirection.setOnLongClickListener = i5;
        }
        setImageIcon setimageicon = this.setMinAndMaxProgress;
        setImageIcon setimageicon2 = this.setOnLongClickListener;
        String str33 = "alpha";
        if (setImageIcon.setX(setimageicon.MenuHostHelper$$ExternalSyntheticLambda0, setimageicon2.MenuHostHelper$$ExternalSyntheticLambda0)) {
            hashSet6.add("alpha");
        }
        String str34 = "elevation";
        if (setImageIcon.setX(setimageicon.setX, setimageicon2.setX)) {
            hashSet6.add("elevation");
        }
        int i6 = setimageicon.setOnNavigationItemSelectedListener;
        int i7 = setimageicon2.setOnNavigationItemSelectedListener;
        if (i6 != i7 && setimageicon.setLayoutAnimation == 0 && (i6 == 0 || i7 == 0)) {
            hashSet6.add("alpha");
        }
        String str35 = "rotation";
        if (setImageIcon.setX(setimageicon.setUiOptions, setimageicon2.setUiOptions)) {
            hashSet6.add("rotation");
        }
        if (!Float.isNaN(setimageicon.setY) || !Float.isNaN(setimageicon2.setY)) {
            hashSet6.add("transitionPathRotate");
        }
        String str36 = "progress";
        if (!Float.isNaN(setimageicon.setUnboundedRipple) || !Float.isNaN(setimageicon2.setUnboundedRipple)) {
            hashSet6.add("progress");
        }
        if (setImageIcon.setX(setimageicon.setOnLongClickListener, setimageicon2.setOnLongClickListener)) {
            hashSet6.add("rotationX");
        }
        if (setImageIcon.setX(setimageicon.setNavigationOnClickListener, setimageicon2.setNavigationOnClickListener)) {
            hashSet6.add("rotationY");
        }
        if (setImageIcon.setX(setimageicon.MenuHostHelper$$ExternalSyntheticLambda1, setimageicon2.MenuHostHelper$$ExternalSyntheticLambda1)) {
            hashSet6.add("transformPivotX");
        }
        if (setImageIcon.setX(setimageicon.setIconTintList, setimageicon2.setIconTintList)) {
            hashSet6.add("transformPivotY");
        }
        String str37 = "scaleX";
        if (setImageIcon.setX(setimageicon.ViewPager$SavedState$1, setimageicon2.ViewPager$SavedState$1)) {
            hashSet6.add("scaleX");
        }
        Object obj17 = "rotationX";
        String str38 = "scaleY";
        if (setImageIcon.setX(setimageicon.setCenterIfNoTextEnabled, setimageicon2.setCenterIfNoTextEnabled)) {
            hashSet6.add("scaleY");
        }
        Object obj18 = "rotationY";
        if (setImageIcon.setX(setimageicon.setIconSize, setimageicon2.setIconSize)) {
            hashSet6.add("translationX");
        }
        Object obj19 = "translationX";
        String str39 = "translationY";
        if (setImageIcon.setX(setimageicon.setChipCornerRadius, setimageicon2.setChipCornerRadius)) {
            hashSet6.add("translationY");
        }
        String str40 = "translationZ";
        if (setImageIcon.setX(setimageicon.setTextAlignment, setimageicon2.setTextAlignment)) {
            hashSet6.add("translationZ");
        }
        ArrayList<setLayoutMode> arrayList2 = this.setChipCornerRadius;
        if (arrayList2 != null) {
            Iterator<setLayoutMode> it5 = arrayList2.iterator();
            ArrayList arrayList3 = null;
            while (it5.hasNext()) {
                setLayoutMode next = it5.next();
                Iterator<setLayoutMode> it6 = it5;
                if (next instanceof onContextItemSelected) {
                    onContextItemSelected oncontextitemselected = (onContextItemSelected) next;
                    str32 = str39;
                    str30 = str40;
                    setDivider setdivider = new setDivider(i, i2, oncontextitemselected, this.setLayoutDirection, this.setUiOptions);
                    int binarySearch = Collections.binarySearch(this.ViewPager$SavedState$1, setdivider);
                    if (binarySearch == 0) {
                        str31 = str36;
                        StringBuilder sb = new StringBuilder(" KeyPath position \"");
                        sb.append(setdivider.setChipCornerRadius);
                        sb.append("\" outside of range");
                        Log.e("MotionController", sb.toString());
                    } else {
                        str31 = str36;
                    }
                    this.ViewPager$SavedState$1.add((-binarySearch) - 1, setdivider);
                    if (oncontextitemselected.setMaxEms != -1) {
                        this.SearchView$SavedState$1 = oncontextitemselected.setMaxEms;
                    }
                } else {
                    str30 = str40;
                    str31 = str36;
                    str32 = str39;
                    if (next instanceof setErrorTextAppearance) {
                        next.MenuHostHelper$$ExternalSyntheticLambda1(hashSet7);
                    } else if (next instanceof BottomSheetBehavior$SavedState$1) {
                        next.MenuHostHelper$$ExternalSyntheticLambda1(hashSet5);
                    } else if (next instanceof setTypeface) {
                        ArrayList arrayList4 = arrayList3 == null ? new ArrayList() : arrayList3;
                        arrayList4.add((setTypeface) next);
                        arrayList3 = arrayList4;
                    } else {
                        next.setY(hashMap3);
                        next.MenuHostHelper$$ExternalSyntheticLambda1(hashSet6);
                    }
                }
                it5 = it6;
                str36 = str31;
                str39 = str32;
                str40 = str30;
            }
            str = str40;
            str2 = str36;
            str3 = str39;
            arrayList = arrayList3;
        } else {
            str = "translationZ";
            str2 = "progress";
            str3 = "translationY";
            arrayList = null;
        }
        if (arrayList != null) {
            this.setTextAlignment = (setTypeface[]) arrayList.toArray(new setTypeface[0]);
        }
        if (hashSet6.isEmpty()) {
            obj = obj19;
            str4 = str2;
            str5 = str3;
            str6 = str;
            hashSet = hashSet7;
            obj2 = obj18;
            hashSet2 = hashSet6;
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new HashMap<>();
            Iterator<String> it7 = hashSet6.iterator();
            while (it7.hasNext()) {
                String next2 = it7.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str41 = next2.split(",")[1];
                    Iterator<setLayoutMode> it8 = this.setChipCornerRadius.iterator();
                    while (it8.hasNext()) {
                        Iterator<String> it9 = it7;
                        setLayoutMode next3 = it8.next();
                        Iterator<setLayoutMode> it10 = it8;
                        if (next3.setY != null && (setactiveindicatordrawable3 = next3.setY.get(str41)) != null) {
                            sparseArray.append(next3.setIconTintList, setactiveindicatordrawable3);
                        }
                        it8 = it10;
                        it7 = it9;
                    }
                    it4 = it7;
                    FirebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda12 = new FirebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1(next2, sparseArray);
                    obj14 = obj19;
                    str28 = str3;
                    str29 = str;
                    hashSet3 = hashSet7;
                    obj15 = obj18;
                    hashSet4 = hashSet6;
                    firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 = firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda12;
                    str27 = str2;
                } else {
                    it4 = it7;
                    next2.hashCode();
                    switch (next2.hashCode()) {
                        case -1249320806:
                            obj14 = obj19;
                            str27 = str2;
                            str28 = str3;
                            str29 = str;
                            hashSet3 = hashSet7;
                            obj15 = obj18;
                            hashSet4 = hashSet6;
                            obj16 = obj17;
                            if (next2.equals(obj16)) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1249320805:
                            obj14 = obj19;
                            str27 = str2;
                            str28 = str3;
                            str29 = str;
                            hashSet3 = hashSet7;
                            obj15 = obj18;
                            if (next2.equals(obj15)) {
                                hashSet4 = hashSet6;
                                obj16 = obj17;
                                c4 = 1;
                                break;
                            }
                            hashSet4 = hashSet6;
                            obj16 = obj17;
                            c4 = 65535;
                            break;
                        case -1225497657:
                            obj14 = obj19;
                            str27 = str2;
                            str28 = str3;
                            str29 = str;
                            if (next2.equals(obj14)) {
                                hashSet3 = hashSet7;
                                obj15 = obj18;
                                hashSet4 = hashSet6;
                                obj16 = obj17;
                                c4 = 2;
                                break;
                            }
                            hashSet3 = hashSet7;
                            obj15 = obj18;
                            hashSet4 = hashSet6;
                            obj16 = obj17;
                            c4 = 65535;
                            break;
                        case -1225497656:
                            str27 = str2;
                            str28 = str3;
                            str29 = str;
                            if (next2.equals(str28)) {
                                obj14 = obj19;
                                hashSet3 = hashSet7;
                                obj15 = obj18;
                                hashSet4 = hashSet6;
                                obj16 = obj17;
                                c4 = 3;
                                break;
                            } else {
                                obj14 = obj19;
                                hashSet3 = hashSet7;
                                obj15 = obj18;
                                hashSet4 = hashSet6;
                                obj16 = obj17;
                                c4 = 65535;
                                break;
                            }
                        case -1225497655:
                            str27 = str2;
                            str29 = str;
                            obj14 = obj19;
                            if (next2.equals(str29)) {
                                str28 = str3;
                                hashSet3 = hashSet7;
                                obj15 = obj18;
                                hashSet4 = hashSet6;
                                obj16 = obj17;
                                c4 = 4;
                                break;
                            } else {
                                str28 = str3;
                                hashSet3 = hashSet7;
                                obj15 = obj18;
                                hashSet4 = hashSet6;
                                obj16 = obj17;
                                c4 = 65535;
                                break;
                            }
                        case -1001078227:
                            str27 = str2;
                            obj14 = obj19;
                            str28 = str3;
                            if (next2.equals(str27)) {
                                str29 = str;
                                hashSet3 = hashSet7;
                                obj15 = obj18;
                                hashSet4 = hashSet6;
                                obj16 = obj17;
                                c4 = 5;
                                break;
                            }
                            str29 = str;
                            hashSet3 = hashSet7;
                            obj15 = obj18;
                            hashSet4 = hashSet6;
                            obj16 = obj17;
                            c4 = 65535;
                            break;
                        case -908189618:
                            if (next2.equals("scaleX")) {
                                obj14 = obj19;
                                str27 = str2;
                                str28 = str3;
                                str29 = str;
                                hashSet3 = hashSet7;
                                obj15 = obj18;
                                hashSet4 = hashSet6;
                                obj16 = obj17;
                                c4 = 6;
                                break;
                            }
                            obj14 = obj19;
                            str27 = str2;
                            str28 = str3;
                            str29 = str;
                            hashSet3 = hashSet7;
                            obj15 = obj18;
                            hashSet4 = hashSet6;
                            obj16 = obj17;
                            c4 = 65535;
                            break;
                        case -908189617:
                            if (next2.equals("scaleY")) {
                                obj14 = obj19;
                                str27 = str2;
                                str28 = str3;
                                str29 = str;
                                hashSet3 = hashSet7;
                                obj15 = obj18;
                                hashSet4 = hashSet6;
                                obj16 = obj17;
                                c4 = 7;
                                break;
                            }
                            obj14 = obj19;
                            str27 = str2;
                            str28 = str3;
                            str29 = str;
                            hashSet3 = hashSet7;
                            obj15 = obj18;
                            hashSet4 = hashSet6;
                            obj16 = obj17;
                            c4 = 65535;
                            break;
                        case -797520672:
                            if (next2.equals("waveVariesBy")) {
                                obj14 = obj19;
                                str27 = str2;
                                str28 = str3;
                                str29 = str;
                                hashSet3 = hashSet7;
                                obj15 = obj18;
                                hashSet4 = hashSet6;
                                obj16 = obj17;
                                c4 = '\b';
                                break;
                            }
                            obj14 = obj19;
                            str27 = str2;
                            str28 = str3;
                            str29 = str;
                            hashSet3 = hashSet7;
                            obj15 = obj18;
                            hashSet4 = hashSet6;
                            obj16 = obj17;
                            c4 = 65535;
                            break;
                        case -760884510:
                            if (next2.equals("transformPivotX")) {
                                obj14 = obj19;
                                str27 = str2;
                                str28 = str3;
                                str29 = str;
                                hashSet3 = hashSet7;
                                obj15 = obj18;
                                hashSet4 = hashSet6;
                                obj16 = obj17;
                                c4 = '\t';
                                break;
                            }
                            obj14 = obj19;
                            str27 = str2;
                            str28 = str3;
                            str29 = str;
                            hashSet3 = hashSet7;
                            obj15 = obj18;
                            hashSet4 = hashSet6;
                            obj16 = obj17;
                            c4 = 65535;
                            break;
                        case -760884509:
                            if (next2.equals("transformPivotY")) {
                                obj14 = obj19;
                                str27 = str2;
                                str28 = str3;
                                str29 = str;
                                hashSet3 = hashSet7;
                                obj15 = obj18;
                                hashSet4 = hashSet6;
                                obj16 = obj17;
                                c4 = '\n';
                                break;
                            }
                            obj14 = obj19;
                            str27 = str2;
                            str28 = str3;
                            str29 = str;
                            hashSet3 = hashSet7;
                            obj15 = obj18;
                            hashSet4 = hashSet6;
                            obj16 = obj17;
                            c4 = 65535;
                            break;
                        case -40300674:
                            if (next2.equals("rotation")) {
                                obj14 = obj19;
                                str27 = str2;
                                str28 = str3;
                                str29 = str;
                                hashSet3 = hashSet7;
                                obj15 = obj18;
                                hashSet4 = hashSet6;
                                obj16 = obj17;
                                c4 = 11;
                                break;
                            }
                            obj14 = obj19;
                            str27 = str2;
                            str28 = str3;
                            str29 = str;
                            hashSet3 = hashSet7;
                            obj15 = obj18;
                            hashSet4 = hashSet6;
                            obj16 = obj17;
                            c4 = 65535;
                            break;
                        case -4379043:
                            if (next2.equals("elevation")) {
                                obj14 = obj19;
                                str27 = str2;
                                str28 = str3;
                                str29 = str;
                                hashSet3 = hashSet7;
                                obj15 = obj18;
                                hashSet4 = hashSet6;
                                obj16 = obj17;
                                c4 = '\f';
                                break;
                            }
                            obj14 = obj19;
                            str27 = str2;
                            str28 = str3;
                            str29 = str;
                            hashSet3 = hashSet7;
                            obj15 = obj18;
                            hashSet4 = hashSet6;
                            obj16 = obj17;
                            c4 = 65535;
                            break;
                        case 37232917:
                            if (next2.equals("transitionPathRotate")) {
                                obj14 = obj19;
                                str27 = str2;
                                str28 = str3;
                                str29 = str;
                                hashSet3 = hashSet7;
                                obj15 = obj18;
                                hashSet4 = hashSet6;
                                obj16 = obj17;
                                c4 = '\r';
                                break;
                            }
                            obj14 = obj19;
                            str27 = str2;
                            str28 = str3;
                            str29 = str;
                            hashSet3 = hashSet7;
                            obj15 = obj18;
                            hashSet4 = hashSet6;
                            obj16 = obj17;
                            c4 = 65535;
                            break;
                        case 92909918:
                            if (next2.equals("alpha")) {
                                obj14 = obj19;
                                str27 = str2;
                                str28 = str3;
                                str29 = str;
                                hashSet3 = hashSet7;
                                obj15 = obj18;
                                hashSet4 = hashSet6;
                                obj16 = obj17;
                                c4 = 14;
                                break;
                            }
                            obj14 = obj19;
                            str27 = str2;
                            str28 = str3;
                            str29 = str;
                            hashSet3 = hashSet7;
                            obj15 = obj18;
                            hashSet4 = hashSet6;
                            obj16 = obj17;
                            c4 = 65535;
                            break;
                        case 156108012:
                            if (next2.equals("waveOffset")) {
                                obj14 = obj19;
                                str27 = str2;
                                str28 = str3;
                                str29 = str;
                                hashSet3 = hashSet7;
                                obj15 = obj18;
                                hashSet4 = hashSet6;
                                obj16 = obj17;
                                c4 = 15;
                                break;
                            }
                            obj14 = obj19;
                            str27 = str2;
                            str28 = str3;
                            str29 = str;
                            hashSet3 = hashSet7;
                            obj15 = obj18;
                            hashSet4 = hashSet6;
                            obj16 = obj17;
                            c4 = 65535;
                            break;
                        default:
                            obj14 = obj19;
                            str27 = str2;
                            str28 = str3;
                            str29 = str;
                            hashSet3 = hashSet7;
                            obj15 = obj18;
                            hashSet4 = hashSet6;
                            obj16 = obj17;
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case 0:
                            setuioptions2 = new FirebasePerfKtxRegistrar.setUiOptions();
                            FirebasePerfKtxRegistrar firebasePerfKtxRegistrar = setuioptions2;
                            obj17 = obj16;
                            firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 = firebasePerfKtxRegistrar;
                            break;
                        case 1:
                            setuioptions2 = new FirebasePerfKtxRegistrar.setLayoutAnimation();
                            FirebasePerfKtxRegistrar firebasePerfKtxRegistrar2 = setuioptions2;
                            obj17 = obj16;
                            firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 = firebasePerfKtxRegistrar2;
                            break;
                        case 2:
                            setuioptions2 = new FirebasePerfKtxRegistrar() { // from class: o.FirebasePerfKtxRegistrar$ViewPager$SavedState$1
                                @Override // o.FirebasePerfKtxRegistrar
                                public final void setY(View view, float f2) {
                                    view.setTranslationX(MenuHostHelper$$ExternalSyntheticLambda1(f2));
                                }
                            };
                            FirebasePerfKtxRegistrar firebasePerfKtxRegistrar22 = setuioptions2;
                            obj17 = obj16;
                            firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 = firebasePerfKtxRegistrar22;
                            break;
                        case 3:
                            setuioptions2 = new FirebasePerfKtxRegistrar.setCenterIfNoTextEnabled();
                            FirebasePerfKtxRegistrar firebasePerfKtxRegistrar222 = setuioptions2;
                            obj17 = obj16;
                            firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 = firebasePerfKtxRegistrar222;
                            break;
                        case 4:
                            setuioptions2 = new FirebasePerfKtxRegistrar.setTextAlignment();
                            FirebasePerfKtxRegistrar firebasePerfKtxRegistrar2222 = setuioptions2;
                            obj17 = obj16;
                            firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 = firebasePerfKtxRegistrar2222;
                            break;
                        case 5:
                            setuioptions2 = new FirebasePerfKtxRegistrar.setNavigationOnClickListener();
                            FirebasePerfKtxRegistrar firebasePerfKtxRegistrar22222 = setuioptions2;
                            obj17 = obj16;
                            firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 = firebasePerfKtxRegistrar22222;
                            break;
                        case 6:
                            setuioptions2 = new FirebasePerfKtxRegistrar.setIconSize();
                            FirebasePerfKtxRegistrar firebasePerfKtxRegistrar222222 = setuioptions2;
                            obj17 = obj16;
                            firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 = firebasePerfKtxRegistrar222222;
                            break;
                        case 7:
                            setuioptions2 = new FirebasePerfKtxRegistrar.setChipCornerRadius();
                            FirebasePerfKtxRegistrar firebasePerfKtxRegistrar2222222 = setuioptions2;
                            obj17 = obj16;
                            firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 = firebasePerfKtxRegistrar2222222;
                            break;
                        case '\b':
                            setuioptions2 = new FirebasePerfKtxRegistrar.setIconTintList();
                            FirebasePerfKtxRegistrar firebasePerfKtxRegistrar22222222 = setuioptions2;
                            obj17 = obj16;
                            firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 = firebasePerfKtxRegistrar22222222;
                            break;
                        case '\t':
                            setuioptions2 = new FirebasePerfKtxRegistrar.setX();
                            FirebasePerfKtxRegistrar firebasePerfKtxRegistrar222222222 = setuioptions2;
                            obj17 = obj16;
                            firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 = firebasePerfKtxRegistrar222222222;
                            break;
                        case '\n':
                            setuioptions2 = new FirebasePerfKtxRegistrar.setUnboundedRipple();
                            FirebasePerfKtxRegistrar firebasePerfKtxRegistrar2222222222 = setuioptions2;
                            obj17 = obj16;
                            firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 = firebasePerfKtxRegistrar2222222222;
                            break;
                        case 11:
                            setuioptions2 = new FirebasePerfKtxRegistrar.setOnLongClickListener();
                            FirebasePerfKtxRegistrar firebasePerfKtxRegistrar22222222222 = setuioptions2;
                            obj17 = obj16;
                            firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 = firebasePerfKtxRegistrar22222222222;
                            break;
                        case '\f':
                            setuioptions2 = new FirebasePerfKtxRegistrar.setY();
                            FirebasePerfKtxRegistrar firebasePerfKtxRegistrar222222222222 = setuioptions2;
                            obj17 = obj16;
                            firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 = firebasePerfKtxRegistrar222222222222;
                            break;
                        case '\r':
                            setuioptions2 = new FirebasePerfKtxRegistrar() { // from class: o.FirebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda0
                                @Override // o.FirebasePerfKtxRegistrar
                                public final void setY(View view, float f2) {
                                }
                            };
                            FirebasePerfKtxRegistrar firebasePerfKtxRegistrar2222222222222 = setuioptions2;
                            obj17 = obj16;
                            firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 = firebasePerfKtxRegistrar2222222222222;
                            break;
                        case 14:
                            setuioptions2 = new FirebasePerfKtxRegistrar.setIconTintList();
                            FirebasePerfKtxRegistrar firebasePerfKtxRegistrar22222222222222 = setuioptions2;
                            obj17 = obj16;
                            firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 = firebasePerfKtxRegistrar22222222222222;
                            break;
                        case 15:
                            setuioptions2 = new FirebasePerfKtxRegistrar.setIconTintList();
                            FirebasePerfKtxRegistrar firebasePerfKtxRegistrar222222222222222 = setuioptions2;
                            obj17 = obj16;
                            firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 = firebasePerfKtxRegistrar222222222222222;
                            break;
                        default:
                            obj17 = obj16;
                            firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 = null;
                            break;
                    }
                }
                if (firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                    firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1.setX = next2;
                    Object obj20 = obj15;
                    this.MenuHostHelper$$ExternalSyntheticLambda1.put(next2, firebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1);
                    str = str29;
                    str3 = str28;
                    hashSet6 = hashSet4;
                    hashSet7 = hashSet3;
                    obj18 = obj20;
                    str2 = str27;
                    obj19 = obj14;
                    it7 = it4;
                } else {
                    str2 = str27;
                    str = str29;
                    str3 = str28;
                    hashSet6 = hashSet4;
                    it7 = it4;
                    obj18 = obj15;
                    hashSet7 = hashSet3;
                    obj19 = obj14;
                }
            }
            obj = obj19;
            str4 = str2;
            str5 = str3;
            str6 = str;
            hashSet = hashSet7;
            obj2 = obj18;
            hashSet2 = hashSet6;
            ArrayList<setLayoutMode> arrayList5 = this.setChipCornerRadius;
            if (arrayList5 != null) {
                Iterator<setLayoutMode> it11 = arrayList5.iterator();
                while (it11.hasNext()) {
                    setLayoutMode next4 = it11.next();
                    if (next4 instanceof wait) {
                        next4.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1);
                    }
                }
            }
            this.setMinAndMaxProgress.setX(this.MenuHostHelper$$ExternalSyntheticLambda1, 0);
            this.setOnLongClickListener.setX(this.MenuHostHelper$$ExternalSyntheticLambda1, 100);
            Iterator<String> it12 = this.MenuHostHelper$$ExternalSyntheticLambda1.keySet().iterator();
            while (it12.hasNext()) {
                String next5 = it12.next();
                if (!hashMap3.containsKey(next5) || (num = hashMap3.get(next5)) == null) {
                    it3 = it12;
                    i4 = 0;
                } else {
                    i4 = num.intValue();
                    it3 = it12;
                }
                FirebasePerfKtxRegistrar firebasePerfKtxRegistrar3 = this.MenuHostHelper$$ExternalSyntheticLambda1.get(next5);
                if (firebasePerfKtxRegistrar3 != null) {
                    firebasePerfKtxRegistrar3.MenuHostHelper$$ExternalSyntheticLambda0(i4);
                }
                it12 = it3;
            }
        }
        if (hashSet5.isEmpty()) {
            str7 = str6;
            str8 = str5;
            obj3 = obj;
            obj4 = obj2;
            obj5 = obj17;
        } else {
            if (this.FragmentStateAdapter$2 == null) {
                this.FragmentStateAdapter$2 = new HashMap<>();
            }
            Iterator<String> it13 = hashSet5.iterator();
            while (it13.hasNext()) {
                String next6 = it13.next();
                if (this.FragmentStateAdapter$2.containsKey(next6)) {
                    str25 = str6;
                    str26 = str5;
                } else {
                    if (next6.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str42 = next6.split(",")[1];
                        it2 = it13;
                        Iterator<setLayoutMode> it14 = this.setChipCornerRadius.iterator();
                        while (it14.hasNext()) {
                            Iterator<setLayoutMode> it15 = it14;
                            setLayoutMode next7 = it14.next();
                            HashMap<String, Integer> hashMap4 = hashMap3;
                            if (next7.setY != null && (setactiveindicatordrawable2 = next7.setY.get(str42)) != null) {
                                sparseArray2.append(next7.setIconTintList, setactiveindicatordrawable2);
                            }
                            hashMap3 = hashMap4;
                            it14 = it15;
                        }
                        hashMap2 = hashMap3;
                        setuioptions = new setOnSearchClickListener(next6, sparseArray2) { // from class: o.setOnSearchClickListener$MenuHostHelper$$ExternalSyntheticLambda0
                            private float[] ViewPager$SavedState$1;
                            private SparseArray<float[]> setChipCornerRadius = new SparseArray<>();
                            private SparseArray<setActiveIndicatorDrawable> setLayoutAnimation;
                            private float[] setNavigationOnClickListener;
                            private String setUnboundedRipple;

                            {
                                this.setUnboundedRipple = next6.split(",")[1];
                                this.setLayoutAnimation = sparseArray2;
                            }

                            @Override // o.zzC
                            public final void setX(int i8) {
                                int size = this.setLayoutAnimation.size();
                                int i9 = setActiveIndicatorDrawable.AnonymousClass4.MenuHostHelper$$ExternalSyntheticLambda1[this.setLayoutAnimation.valueAt(0).setNavigationOnClickListener.ordinal()];
                                int i10 = 4;
                                if (i9 != 4 && i9 != 5) {
                                    i10 = 1;
                                }
                                double[] dArr4 = new double[size];
                                int i11 = i10 + 2;
                                this.ViewPager$SavedState$1 = new float[i11];
                                this.setNavigationOnClickListener = new float[i10];
                                double[][] dArr5 = (double[][]) Array.newInstance(Double.TYPE, size, i11);
                                for (int i12 = 0; i12 < size; i12++) {
                                    int keyAt = this.setLayoutAnimation.keyAt(i12);
                                    float[] valueAt = this.setChipCornerRadius.valueAt(i12);
                                    dArr4[i12] = keyAt * 0.01d;
                                    this.setLayoutAnimation.valueAt(i12).MenuHostHelper$$ExternalSyntheticLambda1(this.ViewPager$SavedState$1);
                                    int i13 = 0;
                                    while (true) {
                                        float[] fArr = this.ViewPager$SavedState$1;
                                        if (i13 < fArr.length) {
                                            dArr5[i12][i13] = fArr[i13];
                                            i13++;
                                        }
                                    }
                                    double[] dArr6 = dArr5[i12];
                                    dArr6[i10] = valueAt[0];
                                    dArr6[i10 + 1] = valueAt[1];
                                }
                                this.setX = setCompatElevation.MenuHostHelper$$ExternalSyntheticLambda1(i8, dArr4, dArr5);
                            }

                            @Override // o.zzC
                            public final void setIconTintList(int i8, float f2, float f3, int i9, float f4) {
                                throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
                            }

                            public final void setY(int i8, setActiveIndicatorDrawable setactiveindicatordrawable4, float f2, int i9, float f3) {
                                this.setLayoutAnimation.append(i8, setactiveindicatordrawable4);
                                this.setChipCornerRadius.append(i8, new float[]{f2, f3});
                                this.setUiOptions = Math.max(this.setUiOptions, i9);
                            }

                            @Override // o.setOnSearchClickListener
                            public final boolean setY(View view, float f2, long j2, setUnboundedRippleResource setunboundedrippleresource) {
                                this.setX.setX(f2, this.ViewPager$SavedState$1);
                                float[] fArr = this.ViewPager$SavedState$1;
                                float f3 = fArr[fArr.length - 2];
                                float f4 = fArr[fArr.length - 1];
                                long j3 = this.setIconTintList;
                                if (Float.isNaN(this.MenuHostHelper$$ExternalSyntheticLambda0)) {
                                    this.MenuHostHelper$$ExternalSyntheticLambda0 = setunboundedrippleresource.MenuHostHelper$$ExternalSyntheticLambda1(view, this.setUnboundedRipple);
                                    if (Float.isNaN(this.MenuHostHelper$$ExternalSyntheticLambda0)) {
                                        this.MenuHostHelper$$ExternalSyntheticLambda0 = 0.0f;
                                    }
                                }
                                this.MenuHostHelper$$ExternalSyntheticLambda0 = (float) ((this.MenuHostHelper$$ExternalSyntheticLambda0 + (((j2 - j3) * 1.0E-9d) * f3)) % 1.0d);
                                this.setIconTintList = j2;
                                float x = setX(this.MenuHostHelper$$ExternalSyntheticLambda0);
                                this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
                                for (int i8 = 0; i8 < this.setNavigationOnClickListener.length; i8++) {
                                    this.MenuHostHelper$$ExternalSyntheticLambda1 |= ((double) this.ViewPager$SavedState$1[i8]) != 0.0d;
                                    this.setNavigationOnClickListener[i8] = (this.ViewPager$SavedState$1[i8] * x) + f4;
                                }
                                setStretchMode.MenuHostHelper$$ExternalSyntheticLambda0(this.setLayoutAnimation.valueAt(0), view, this.setNavigationOnClickListener);
                                if (f3 != 0.0f) {
                                    this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                                }
                                return this.MenuHostHelper$$ExternalSyntheticLambda1;
                            }
                        };
                        str25 = str6;
                        str26 = str5;
                        obj12 = obj17;
                        obj13 = obj2;
                    } else {
                        it2 = it13;
                        hashMap2 = hashMap3;
                        next6.hashCode();
                        switch (next6.hashCode()) {
                            case -1249320806:
                                obj12 = obj17;
                                obj13 = obj2;
                                if (next6.equals(obj12)) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1249320805:
                                obj13 = obj2;
                                if (next6.equals(obj13)) {
                                    obj12 = obj17;
                                    c3 = 1;
                                    break;
                                } else {
                                    obj12 = obj17;
                                    c3 = 65535;
                                    break;
                                }
                            case -1225497657:
                                if (next6.equals(obj)) {
                                    obj12 = obj17;
                                    obj13 = obj2;
                                    c3 = 2;
                                    break;
                                }
                                obj12 = obj17;
                                obj13 = obj2;
                                c3 = 65535;
                                break;
                            case -1225497656:
                                if (next6.equals(str5)) {
                                    obj12 = obj17;
                                    obj13 = obj2;
                                    c3 = 3;
                                    break;
                                }
                                obj12 = obj17;
                                obj13 = obj2;
                                c3 = 65535;
                                break;
                            case -1225497655:
                                if (next6.equals(str6)) {
                                    obj12 = obj17;
                                    obj13 = obj2;
                                    c3 = 4;
                                    break;
                                }
                                obj12 = obj17;
                                obj13 = obj2;
                                c3 = 65535;
                                break;
                            case -1001078227:
                                if (next6.equals(str4)) {
                                    obj12 = obj17;
                                    obj13 = obj2;
                                    c3 = 5;
                                    break;
                                }
                                obj12 = obj17;
                                obj13 = obj2;
                                c3 = 65535;
                                break;
                            case -908189618:
                                if (next6.equals("scaleX")) {
                                    obj12 = obj17;
                                    obj13 = obj2;
                                    c3 = 6;
                                    break;
                                }
                                obj12 = obj17;
                                obj13 = obj2;
                                c3 = 65535;
                                break;
                            case -908189617:
                                if (next6.equals("scaleY")) {
                                    obj12 = obj17;
                                    obj13 = obj2;
                                    c3 = 7;
                                    break;
                                }
                                obj12 = obj17;
                                obj13 = obj2;
                                c3 = 65535;
                                break;
                            case -40300674:
                                if (next6.equals("rotation")) {
                                    obj12 = obj17;
                                    obj13 = obj2;
                                    c3 = '\b';
                                    break;
                                }
                                obj12 = obj17;
                                obj13 = obj2;
                                c3 = 65535;
                                break;
                            case -4379043:
                                if (next6.equals("elevation")) {
                                    obj12 = obj17;
                                    obj13 = obj2;
                                    c3 = '\t';
                                    break;
                                }
                                obj12 = obj17;
                                obj13 = obj2;
                                c3 = 65535;
                                break;
                            case 37232917:
                                if (next6.equals("transitionPathRotate")) {
                                    obj12 = obj17;
                                    obj13 = obj2;
                                    c3 = '\n';
                                    break;
                                }
                                obj12 = obj17;
                                obj13 = obj2;
                                c3 = 65535;
                                break;
                            case 92909918:
                                if (next6.equals("alpha")) {
                                    obj12 = obj17;
                                    obj13 = obj2;
                                    c3 = 11;
                                    break;
                                }
                                obj12 = obj17;
                                obj13 = obj2;
                                c3 = 65535;
                                break;
                            default:
                                obj12 = obj17;
                                obj13 = obj2;
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                setuioptions = new setOnSearchClickListener.setUiOptions();
                                str25 = str6;
                                str26 = str5;
                                setuioptions.setY(j);
                                break;
                            case 1:
                                setuioptions = new setOnSearchClickListener.setOnLongClickListener();
                                str25 = str6;
                                str26 = str5;
                                setuioptions.setY(j);
                                break;
                            case 2:
                                setuioptions = new setOnSearchClickListener.setIconSize();
                                str25 = str6;
                                str26 = str5;
                                setuioptions.setY(j);
                                break;
                            case 3:
                                setuioptions = new setOnSearchClickListener.setCenterIfNoTextEnabled();
                                str25 = str6;
                                str26 = str5;
                                setuioptions.setY(j);
                                break;
                            case 4:
                                setuioptions = new setOnSearchClickListener.setTextAlignment();
                                str25 = str6;
                                str26 = str5;
                                setuioptions.setY(j);
                                break;
                            case 5:
                                setuioptions = new setOnSearchClickListener.setY();
                                str25 = str6;
                                str26 = str5;
                                setuioptions.setY(j);
                                break;
                            case 6:
                                setuioptions = new setOnSearchClickListener.setUnboundedRipple();
                                str25 = str6;
                                str26 = str5;
                                setuioptions.setY(j);
                                break;
                            case 7:
                                setuioptions = new setOnSearchClickListener.setNavigationOnClickListener();
                                str25 = str6;
                                str26 = str5;
                                setuioptions.setY(j);
                                break;
                            case '\b':
                                setuioptions = new setOnSearchClickListener.setLayoutAnimation();
                                str25 = str6;
                                str26 = str5;
                                setuioptions.setY(j);
                                break;
                            case '\t':
                                setuioptions = new setOnSearchClickListener.setIconTintList();
                                str25 = str6;
                                str26 = str5;
                                setuioptions.setY(j);
                                break;
                            case '\n':
                                setuioptions = new setOnSearchClickListener.setX();
                                str25 = str6;
                                str26 = str5;
                                setuioptions.setY(j);
                                break;
                            case 11:
                                setuioptions = new setOnSearchClickListener() { // from class: o.setOnSearchClickListener$MenuHostHelper$$ExternalSyntheticLambda1
                                    @Override // o.setOnSearchClickListener
                                    public final boolean setY(View view, float f2, long j2, setUnboundedRippleResource setunboundedrippleresource) {
                                        view.setAlpha(setIconTintList(f2, j2, view, setunboundedrippleresource));
                                        return this.MenuHostHelper$$ExternalSyntheticLambda1;
                                    }
                                };
                                str25 = str6;
                                str26 = str5;
                                setuioptions.setY(j);
                                break;
                            default:
                                str25 = str6;
                                str26 = str5;
                                setuioptions = null;
                                break;
                        }
                    }
                    if (setuioptions != null) {
                        setuioptions.setX(next6);
                        this.FragmentStateAdapter$2.put(next6, setuioptions);
                    }
                    obj2 = obj13;
                    obj17 = obj12;
                    it13 = it2;
                    hashMap3 = hashMap2;
                }
                str5 = str26;
                str6 = str25;
            }
            HashMap<String, Integer> hashMap5 = hashMap3;
            String str43 = str6;
            String str44 = str5;
            Object obj21 = obj17;
            Object obj22 = obj2;
            ArrayList<setLayoutMode> arrayList6 = this.setChipCornerRadius;
            if (arrayList6 != null) {
                Iterator<setLayoutMode> it16 = arrayList6.iterator();
                while (it16.hasNext()) {
                    setLayoutMode next8 = it16.next();
                    if (next8 instanceof BottomSheetBehavior$SavedState$1) {
                        BottomSheetBehavior$SavedState$1 bottomSheetBehavior$SavedState$1 = (BottomSheetBehavior$SavedState$1) next8;
                        HashMap<String, setOnSearchClickListener> hashMap6 = this.FragmentStateAdapter$2;
                        Iterator<String> it17 = hashMap6.keySet().iterator();
                        while (it17.hasNext()) {
                            String next9 = it17.next();
                            setOnSearchClickListener setonsearchclicklistener = hashMap6.get(next9);
                            if (setonsearchclicklistener != null) {
                                Iterator<setLayoutMode> it18 = it16;
                                if (next9.startsWith("CUSTOM")) {
                                    setActiveIndicatorDrawable setactiveindicatordrawable4 = bottomSheetBehavior$SavedState$1.setY.get(next9.substring(7));
                                    if (setactiveindicatordrawable4 != null) {
                                        hashMap = hashMap6;
                                        ((setOnSearchClickListener$MenuHostHelper$$ExternalSyntheticLambda0) setonsearchclicklistener).setY(bottomSheetBehavior$SavedState$1.setIconTintList, setactiveindicatordrawable4, bottomSheetBehavior$SavedState$1.setOnNavigationItemSelectedListener, bottomSheetBehavior$SavedState$1.setMaxEms, bottomSheetBehavior$SavedState$1.setAnimationFromJson);
                                        it16 = it18;
                                        it17 = it17;
                                    } else {
                                        it16 = it18;
                                    }
                                } else {
                                    hashMap = hashMap6;
                                    Iterator<String> it19 = it17;
                                    next9.hashCode();
                                    switch (next9.hashCode()) {
                                        case -1249320806:
                                            str23 = str44;
                                            str24 = str43;
                                            if (next9.equals(obj21)) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1249320805:
                                            str23 = str44;
                                            str24 = str43;
                                            if (next9.equals(obj22)) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1225497657:
                                            str23 = str44;
                                            str24 = str43;
                                            if (next9.equals(obj)) {
                                                c2 = 2;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1225497656:
                                            str23 = str44;
                                            str24 = str43;
                                            if (next9.equals(str23)) {
                                                c2 = 3;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1225497655:
                                            str24 = str43;
                                            if (next9.equals(str24)) {
                                                str23 = str44;
                                                c2 = 4;
                                                break;
                                            } else {
                                                str23 = str44;
                                                c2 = 65535;
                                                break;
                                            }
                                        case -1001078227:
                                            if (next9.equals(str4)) {
                                                str23 = str44;
                                                str24 = str43;
                                                c2 = 5;
                                                break;
                                            }
                                            str23 = str44;
                                            str24 = str43;
                                            c2 = 65535;
                                            break;
                                        case -908189618:
                                            if (next9.equals("scaleX")) {
                                                str23 = str44;
                                                str24 = str43;
                                                c2 = 6;
                                                break;
                                            }
                                            str23 = str44;
                                            str24 = str43;
                                            c2 = 65535;
                                            break;
                                        case -908189617:
                                            if (next9.equals("scaleY")) {
                                                str23 = str44;
                                                str24 = str43;
                                                c2 = 7;
                                                break;
                                            }
                                            str23 = str44;
                                            str24 = str43;
                                            c2 = 65535;
                                            break;
                                        case -40300674:
                                            if (next9.equals("rotation")) {
                                                str23 = str44;
                                                str24 = str43;
                                                c2 = '\b';
                                                break;
                                            }
                                            str23 = str44;
                                            str24 = str43;
                                            c2 = 65535;
                                            break;
                                        case -4379043:
                                            if (next9.equals("elevation")) {
                                                str23 = str44;
                                                str24 = str43;
                                                c2 = '\t';
                                                break;
                                            }
                                            str23 = str44;
                                            str24 = str43;
                                            c2 = 65535;
                                            break;
                                        case 37232917:
                                            if (next9.equals("transitionPathRotate")) {
                                                str23 = str44;
                                                str24 = str43;
                                                c2 = '\n';
                                                break;
                                            }
                                            str23 = str44;
                                            str24 = str43;
                                            c2 = 65535;
                                            break;
                                        case 92909918:
                                            if (next9.equals("alpha")) {
                                                str23 = str44;
                                                str24 = str43;
                                                c2 = 11;
                                                break;
                                            }
                                            str23 = str44;
                                            str24 = str43;
                                            c2 = 65535;
                                            break;
                                        default:
                                            str23 = str44;
                                            str24 = str43;
                                            c2 = 65535;
                                            break;
                                    }
                                    switch (c2) {
                                        case 0:
                                            obj9 = obj22;
                                            obj10 = obj21;
                                            obj11 = obj;
                                            if (!Float.isNaN(bottomSheetBehavior$SavedState$1.setLayoutAnimation)) {
                                                setonsearchclicklistener.setIconTintList(bottomSheetBehavior$SavedState$1.setIconTintList, bottomSheetBehavior$SavedState$1.setLayoutAnimation, bottomSheetBehavior$SavedState$1.setOnNavigationItemSelectedListener, bottomSheetBehavior$SavedState$1.setMaxEms, bottomSheetBehavior$SavedState$1.setAnimationFromJson);
                                            }
                                            it17 = it19;
                                            str43 = str24;
                                            obj21 = obj10;
                                            obj22 = obj9;
                                            obj = obj11;
                                            it16 = it18;
                                            str44 = str23;
                                            break;
                                        case 1:
                                            obj9 = obj22;
                                            obj10 = obj21;
                                            obj11 = obj;
                                            if (!Float.isNaN(bottomSheetBehavior$SavedState$1.setChipCornerRadius)) {
                                                setonsearchclicklistener.setIconTintList(bottomSheetBehavior$SavedState$1.setIconTintList, bottomSheetBehavior$SavedState$1.setChipCornerRadius, bottomSheetBehavior$SavedState$1.setOnNavigationItemSelectedListener, bottomSheetBehavior$SavedState$1.setMaxEms, bottomSheetBehavior$SavedState$1.setAnimationFromJson);
                                            }
                                            it17 = it19;
                                            str43 = str24;
                                            obj21 = obj10;
                                            obj22 = obj9;
                                            obj = obj11;
                                            it16 = it18;
                                            str44 = str23;
                                            break;
                                        case 2:
                                            obj9 = obj22;
                                            obj10 = obj21;
                                            obj11 = obj;
                                            if (!Float.isNaN(bottomSheetBehavior$SavedState$1.setTextAlignment)) {
                                                setonsearchclicklistener.setIconTintList(bottomSheetBehavior$SavedState$1.setIconTintList, bottomSheetBehavior$SavedState$1.setTextAlignment, bottomSheetBehavior$SavedState$1.setOnNavigationItemSelectedListener, bottomSheetBehavior$SavedState$1.setMaxEms, bottomSheetBehavior$SavedState$1.setAnimationFromJson);
                                            }
                                            it17 = it19;
                                            str43 = str24;
                                            obj21 = obj10;
                                            obj22 = obj9;
                                            obj = obj11;
                                            it16 = it18;
                                            str44 = str23;
                                            break;
                                        case 3:
                                            obj9 = obj22;
                                            obj10 = obj21;
                                            obj11 = obj;
                                            if (!Float.isNaN(bottomSheetBehavior$SavedState$1.setZ)) {
                                                setonsearchclicklistener.setIconTintList(bottomSheetBehavior$SavedState$1.setIconTintList, bottomSheetBehavior$SavedState$1.setZ, bottomSheetBehavior$SavedState$1.setOnNavigationItemSelectedListener, bottomSheetBehavior$SavedState$1.setMaxEms, bottomSheetBehavior$SavedState$1.setAnimationFromJson);
                                            }
                                            it17 = it19;
                                            str43 = str24;
                                            obj21 = obj10;
                                            obj22 = obj9;
                                            obj = obj11;
                                            it16 = it18;
                                            str44 = str23;
                                            break;
                                        case 4:
                                            obj9 = obj22;
                                            obj10 = obj21;
                                            obj11 = obj;
                                            if (!Float.isNaN(bottomSheetBehavior$SavedState$1.setTextScaleX)) {
                                                setonsearchclicklistener.setIconTintList(bottomSheetBehavior$SavedState$1.setIconTintList, bottomSheetBehavior$SavedState$1.setTextScaleX, bottomSheetBehavior$SavedState$1.setOnNavigationItemSelectedListener, bottomSheetBehavior$SavedState$1.setMaxEms, bottomSheetBehavior$SavedState$1.setAnimationFromJson);
                                            }
                                            it17 = it19;
                                            str43 = str24;
                                            obj21 = obj10;
                                            obj22 = obj9;
                                            obj = obj11;
                                            it16 = it18;
                                            str44 = str23;
                                            break;
                                        case 5:
                                            obj9 = obj22;
                                            obj10 = obj21;
                                            obj11 = obj;
                                            if (!Float.isNaN(bottomSheetBehavior$SavedState$1.setOnLongClickListener)) {
                                                setonsearchclicklistener.setIconTintList(bottomSheetBehavior$SavedState$1.setIconTintList, bottomSheetBehavior$SavedState$1.setOnLongClickListener, bottomSheetBehavior$SavedState$1.setOnNavigationItemSelectedListener, bottomSheetBehavior$SavedState$1.setMaxEms, bottomSheetBehavior$SavedState$1.setAnimationFromJson);
                                            }
                                            it17 = it19;
                                            str43 = str24;
                                            obj21 = obj10;
                                            obj22 = obj9;
                                            obj = obj11;
                                            it16 = it18;
                                            str44 = str23;
                                            break;
                                        case 6:
                                            obj9 = obj22;
                                            obj10 = obj21;
                                            obj11 = obj;
                                            if (!Float.isNaN(bottomSheetBehavior$SavedState$1.ViewPager$SavedState$1)) {
                                                setonsearchclicklistener.setIconTintList(bottomSheetBehavior$SavedState$1.setIconTintList, bottomSheetBehavior$SavedState$1.ViewPager$SavedState$1, bottomSheetBehavior$SavedState$1.setOnNavigationItemSelectedListener, bottomSheetBehavior$SavedState$1.setMaxEms, bottomSheetBehavior$SavedState$1.setAnimationFromJson);
                                            }
                                            it17 = it19;
                                            str43 = str24;
                                            obj21 = obj10;
                                            obj22 = obj9;
                                            obj = obj11;
                                            it16 = it18;
                                            str44 = str23;
                                            break;
                                        case 7:
                                            obj9 = obj22;
                                            obj10 = obj21;
                                            obj11 = obj;
                                            if (!Float.isNaN(bottomSheetBehavior$SavedState$1.setIconSize)) {
                                                setonsearchclicklistener.setIconTintList(bottomSheetBehavior$SavedState$1.setIconTintList, bottomSheetBehavior$SavedState$1.setIconSize, bottomSheetBehavior$SavedState$1.setOnNavigationItemSelectedListener, bottomSheetBehavior$SavedState$1.setMaxEms, bottomSheetBehavior$SavedState$1.setAnimationFromJson);
                                            }
                                            it17 = it19;
                                            str43 = str24;
                                            obj21 = obj10;
                                            obj22 = obj9;
                                            obj = obj11;
                                            it16 = it18;
                                            str44 = str23;
                                            break;
                                        case '\b':
                                            obj9 = obj22;
                                            obj10 = obj21;
                                            obj11 = obj;
                                            if (!Float.isNaN(bottomSheetBehavior$SavedState$1.setNavigationOnClickListener)) {
                                                setonsearchclicklistener.setIconTintList(bottomSheetBehavior$SavedState$1.setIconTintList, bottomSheetBehavior$SavedState$1.setNavigationOnClickListener, bottomSheetBehavior$SavedState$1.setOnNavigationItemSelectedListener, bottomSheetBehavior$SavedState$1.setMaxEms, bottomSheetBehavior$SavedState$1.setAnimationFromJson);
                                            }
                                            it17 = it19;
                                            str43 = str24;
                                            obj21 = obj10;
                                            obj22 = obj9;
                                            obj = obj11;
                                            it16 = it18;
                                            str44 = str23;
                                            break;
                                        case '\t':
                                            obj9 = obj22;
                                            obj10 = obj21;
                                            obj11 = obj;
                                            if (!Float.isNaN(bottomSheetBehavior$SavedState$1.setUnboundedRipple)) {
                                                setonsearchclicklistener.setIconTintList(bottomSheetBehavior$SavedState$1.setIconTintList, bottomSheetBehavior$SavedState$1.setUnboundedRipple, bottomSheetBehavior$SavedState$1.setOnNavigationItemSelectedListener, bottomSheetBehavior$SavedState$1.setMaxEms, bottomSheetBehavior$SavedState$1.setAnimationFromJson);
                                            }
                                            it17 = it19;
                                            str43 = str24;
                                            obj21 = obj10;
                                            obj22 = obj9;
                                            obj = obj11;
                                            it16 = it18;
                                            str44 = str23;
                                            break;
                                        case '\n':
                                            obj9 = obj22;
                                            obj10 = obj21;
                                            obj11 = obj;
                                            if (!Float.isNaN(bottomSheetBehavior$SavedState$1.setCenterIfNoTextEnabled)) {
                                                setonsearchclicklistener.setIconTintList(bottomSheetBehavior$SavedState$1.setIconTintList, bottomSheetBehavior$SavedState$1.setCenterIfNoTextEnabled, bottomSheetBehavior$SavedState$1.setOnNavigationItemSelectedListener, bottomSheetBehavior$SavedState$1.setMaxEms, bottomSheetBehavior$SavedState$1.setAnimationFromJson);
                                            }
                                            it17 = it19;
                                            str43 = str24;
                                            obj21 = obj10;
                                            obj22 = obj9;
                                            obj = obj11;
                                            it16 = it18;
                                            str44 = str23;
                                            break;
                                        case 11:
                                            if (Float.isNaN(bottomSheetBehavior$SavedState$1.setUiOptions)) {
                                                it17 = it19;
                                                str43 = str24;
                                                str44 = str23;
                                                hashMap6 = hashMap;
                                                it16 = it18;
                                                break;
                                            } else {
                                                obj10 = obj21;
                                                obj9 = obj22;
                                                obj11 = obj;
                                                setonsearchclicklistener.setIconTintList(bottomSheetBehavior$SavedState$1.setIconTintList, bottomSheetBehavior$SavedState$1.setUiOptions, bottomSheetBehavior$SavedState$1.setOnNavigationItemSelectedListener, bottomSheetBehavior$SavedState$1.setMaxEms, bottomSheetBehavior$SavedState$1.setAnimationFromJson);
                                                it17 = it19;
                                                str43 = str24;
                                                obj21 = obj10;
                                                obj22 = obj9;
                                                obj = obj11;
                                                it16 = it18;
                                                str44 = str23;
                                                break;
                                            }
                                        default:
                                            Object obj23 = obj22;
                                            StringBuilder sb2 = new StringBuilder("UNKNOWN addValues \"");
                                            sb2.append(next9);
                                            sb2.append("\"");
                                            Log.e("KeyTimeCycles", sb2.toString());
                                            it17 = it19;
                                            str43 = str24;
                                            obj21 = obj21;
                                            obj22 = obj23;
                                            it16 = it18;
                                            str44 = str23;
                                            break;
                                    }
                                }
                            } else {
                                hashMap = hashMap6;
                            }
                            hashMap6 = hashMap;
                        }
                    }
                }
            }
            obj4 = obj22;
            obj5 = obj21;
            str8 = str44;
            str7 = str43;
            obj3 = obj;
            for (String str45 : this.FragmentStateAdapter$2.keySet()) {
                HashMap<String, Integer> hashMap7 = hashMap5;
                this.FragmentStateAdapter$2.get(str45).setX(hashMap7.containsKey(str45) ? hashMap7.get(str45).intValue() : 0);
                hashMap5 = hashMap7;
            }
        }
        int size = this.ViewPager$SavedState$1.size() + 2;
        setDivider[] setdividerArr = new setDivider[size];
        setdividerArr[0] = this.setLayoutDirection;
        setdividerArr[size - 1] = this.setUiOptions;
        if (this.ViewPager$SavedState$1.size() > 0 && this.SearchView$SavedState$1 == -1) {
            this.SearchView$SavedState$1 = 0;
        }
        Iterator<setDivider> it20 = this.ViewPager$SavedState$1.iterator();
        int i8 = 1;
        while (it20.hasNext()) {
            setdividerArr[i8] = it20.next();
            i8++;
        }
        HashSet hashSet8 = new HashSet();
        Iterator<String> it21 = this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0.keySet().iterator();
        while (it21.hasNext()) {
            String next10 = it21.next();
            if (this.setLayoutDirection.MenuHostHelper$$ExternalSyntheticLambda0.containsKey(next10)) {
                Iterator<String> it22 = it21;
                StringBuilder sb3 = new StringBuilder("CUSTOM,");
                sb3.append(next10);
                String obj24 = sb3.toString();
                HashSet<String> hashSet9 = hashSet2;
                if (!hashSet9.contains(obj24)) {
                    hashSet8.add(next10);
                }
                it21 = it22;
                hashSet2 = hashSet9;
            }
        }
        String[] strArr = (String[]) hashSet8.toArray(new String[0]);
        this.setHasDecor = strArr;
        this.setChipIconTintResource = new int[strArr.length];
        int i9 = 0;
        while (true) {
            String[] strArr2 = this.setHasDecor;
            if (i9 < strArr2.length) {
                String str46 = strArr2[i9];
                this.setChipIconTintResource[i9] = 0;
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        str22 = str8;
                    } else if (!setdividerArr[i10].MenuHostHelper$$ExternalSyntheticLambda0.containsKey(str46) || (setactiveindicatordrawable = setdividerArr[i10].MenuHostHelper$$ExternalSyntheticLambda0.get(str46)) == null) {
                        i10++;
                        str8 = str8;
                    } else {
                        int[] iArr = this.setChipIconTintResource;
                        int i11 = iArr[i9];
                        int i12 = setActiveIndicatorDrawable.AnonymousClass4.MenuHostHelper$$ExternalSyntheticLambda1[setactiveindicatordrawable.setNavigationOnClickListener.ordinal()];
                        str22 = str8;
                        iArr[i9] = i11 + ((i12 == 4 || i12 == 5) ? 4 : 1);
                    }
                }
                i9++;
                str8 = str22;
            } else {
                String str47 = str8;
                boolean z = setdividerArr[0].setOnLongClickListener != -1;
                int length = this.setHasDecor.length + 18;
                boolean[] zArr = new boolean[length];
                int i13 = 1;
                while (i13 < size) {
                    setDivider setdivider2 = setdividerArr[i13];
                    String str48 = str7;
                    setDivider setdivider3 = setdividerArr[i13 - 1];
                    String str49 = str4;
                    String str50 = str37;
                    boolean MenuHostHelper$$ExternalSyntheticLambda0 = setDivider.MenuHostHelper$$ExternalSyntheticLambda0(setdivider2.setTextScaleX, setdivider3.setTextScaleX);
                    boolean MenuHostHelper$$ExternalSyntheticLambda02 = setDivider.MenuHostHelper$$ExternalSyntheticLambda0(setdivider2.setZ, setdivider3.setZ);
                    zArr[0] = zArr[0] | setDivider.MenuHostHelper$$ExternalSyntheticLambda0(setdivider2.setChipCornerRadius, setdivider3.setChipCornerRadius);
                    boolean z2 = MenuHostHelper$$ExternalSyntheticLambda0 | MenuHostHelper$$ExternalSyntheticLambda02 | z;
                    zArr[1] = zArr[1] | z2;
                    zArr[2] = z2 | zArr[2];
                    zArr[3] = zArr[3] | setDivider.MenuHostHelper$$ExternalSyntheticLambda0(setdivider2.setIconSize, setdivider3.setIconSize);
                    zArr[4] = setDivider.MenuHostHelper$$ExternalSyntheticLambda0(setdivider2.setX, setdivider3.setX) | zArr[4];
                    i13++;
                    str4 = str49;
                    str37 = str50;
                    str7 = str48;
                    str38 = str38;
                    str35 = str35;
                }
                String str51 = str7;
                String str52 = str4;
                String str53 = str37;
                String str54 = str35;
                String str55 = str38;
                int i14 = 0;
                for (int i15 = 1; i15 < length; i15++) {
                    if (zArr[i15]) {
                        i14++;
                    }
                }
                this.setIconSize = new int[i14];
                int max = Math.max(2, i14);
                this.setUnboundedRipple = new double[max];
                this.setCenterIfNoTextEnabled = new double[max];
                int i16 = 0;
                for (int i17 = 1; i17 < length; i17++) {
                    if (zArr[i17]) {
                        this.setIconSize[i16] = i17;
                        i16++;
                    }
                }
                double[][] dArr4 = (double[][]) Array.newInstance(Double.TYPE, size, this.setIconSize.length);
                double[] dArr5 = new double[size];
                for (int i18 = 0; i18 < size; i18++) {
                    setDivider setdivider4 = setdividerArr[i18];
                    double[] dArr6 = dArr4[i18];
                    int[] iArr2 = this.setIconSize;
                    float[] fArr = {setdivider4.setChipCornerRadius, setdivider4.setTextScaleX, setdivider4.setZ, setdivider4.setIconSize, setdivider4.setX, setdivider4.setUnboundedRipple};
                    int i19 = 0;
                    for (int i20 : iArr2) {
                        if (i20 < 6) {
                            dArr6[i19] = fArr[i20];
                            i19++;
                        }
                    }
                    dArr5[i18] = setdividerArr[i18].setCenterIfNoTextEnabled;
                }
                int i21 = 0;
                while (true) {
                    int[] iArr3 = this.setIconSize;
                    if (i21 < iArr3.length) {
                        if (iArr3[i21] < setDivider.MenuHostHelper$$ExternalSyntheticLambda1.length) {
                            String str56 = setDivider.MenuHostHelper$$ExternalSyntheticLambda1[this.setIconSize[i21]];
                            for (int i22 = 0; i22 < size; i22++) {
                                double d2 = dArr4[i22][i21];
                            }
                        }
                        i21++;
                    } else {
                        this.setZ = new setCompatElevation[this.setHasDecor.length + 1];
                        int i23 = 0;
                        while (true) {
                            String[] strArr3 = this.setHasDecor;
                            if (i23 < strArr3.length) {
                                String str57 = strArr3[i23];
                                int i24 = 0;
                                int i25 = 0;
                                double[] dArr7 = null;
                                double[][] dArr8 = null;
                                while (i24 < size) {
                                    if (setdividerArr[i24].MenuHostHelper$$ExternalSyntheticLambda0.containsKey(str57)) {
                                        if (dArr8 == null) {
                                            dArr7 = new double[size];
                                            setActiveIndicatorDrawable setactiveindicatordrawable5 = setdividerArr[i24].MenuHostHelper$$ExternalSyntheticLambda0.get(str57);
                                            if (setactiveindicatordrawable5 == null) {
                                                i3 = 0;
                                            } else {
                                                int i26 = setActiveIndicatorDrawable.AnonymousClass4.MenuHostHelper$$ExternalSyntheticLambda1[setactiveindicatordrawable5.setNavigationOnClickListener.ordinal()];
                                                i3 = (i26 == 4 || i26 == 5) ? 4 : 1;
                                            }
                                            dArr8 = (double[][]) Array.newInstance(Double.TYPE, size, i3);
                                        }
                                        dArr7[i25] = setdividerArr[i24].setCenterIfNoTextEnabled;
                                        setDivider setdivider5 = setdividerArr[i24];
                                        double[] dArr9 = dArr8[i25];
                                        setActiveIndicatorDrawable setactiveindicatordrawable6 = setdivider5.MenuHostHelper$$ExternalSyntheticLambda0.get(str57);
                                        if (setactiveindicatordrawable6 != null) {
                                            str20 = str57;
                                            int i27 = setActiveIndicatorDrawable.AnonymousClass4.MenuHostHelper$$ExternalSyntheticLambda1[setactiveindicatordrawable6.setNavigationOnClickListener.ordinal()];
                                            dArr = dArr7;
                                            if (((i27 == 4 || i27 == 5) ? (char) 4 : (char) 1) == 1) {
                                                dArr3 = dArr8;
                                                dArr9[0] = setactiveindicatordrawable6.setY();
                                                str21 = str34;
                                            } else {
                                                dArr3 = dArr8;
                                                int i28 = setActiveIndicatorDrawable.AnonymousClass4.MenuHostHelper$$ExternalSyntheticLambda1[setactiveindicatordrawable6.setNavigationOnClickListener.ordinal()];
                                                str21 = str34;
                                                int i29 = (i28 == 4 || i28 == 5) ? 4 : 1;
                                                float[] fArr2 = new float[i29];
                                                setactiveindicatordrawable6.MenuHostHelper$$ExternalSyntheticLambda1(fArr2);
                                                int i30 = 0;
                                                int i31 = 0;
                                                while (i30 < i29) {
                                                    dArr9[i31] = fArr2[i30];
                                                    i30++;
                                                    i31++;
                                                    dArr3 = dArr3;
                                                    fArr2 = fArr2;
                                                }
                                            }
                                            dArr2 = dArr3;
                                        } else {
                                            str20 = str57;
                                            str21 = str34;
                                            dArr = dArr7;
                                            dArr2 = dArr8;
                                        }
                                        i25++;
                                        dArr7 = dArr;
                                        dArr8 = dArr2;
                                    } else {
                                        str20 = str57;
                                        str21 = str34;
                                    }
                                    i24++;
                                    str57 = str20;
                                    str34 = str21;
                                }
                                i23++;
                                this.setZ[i23] = setCompatElevation.MenuHostHelper$$ExternalSyntheticLambda1(this.SearchView$SavedState$1, Arrays.copyOf(dArr7, i25), (double[][]) Arrays.copyOf(dArr8, i25));
                                str34 = str34;
                            } else {
                                String str58 = str34;
                                this.setZ[0] = setCompatElevation.MenuHostHelper$$ExternalSyntheticLambda1(this.SearchView$SavedState$1, dArr5, dArr4);
                                if (setdividerArr[0].setOnLongClickListener != -1) {
                                    int[] iArr4 = new int[size];
                                    double[] dArr10 = new double[size];
                                    double[][] dArr11 = (double[][]) Array.newInstance(Double.TYPE, size, 2);
                                    for (int i32 = 0; i32 < size; i32++) {
                                        iArr4[i32] = setdividerArr[i32].setOnLongClickListener;
                                        dArr10[i32] = setdividerArr[i32].setCenterIfNoTextEnabled;
                                        dArr11[i32][0] = setdividerArr[i32].setTextScaleX;
                                        dArr11[i32][1] = setdividerArr[i32].setZ;
                                    }
                                    this.MenuHostHelper$$ExternalSyntheticLambda0 = new setType(iArr4, dArr10, dArr11);
                                }
                                this.setY = new HashMap<>();
                                if (this.setChipCornerRadius != null) {
                                    Iterator<String> it23 = hashSet.iterator();
                                    float f2 = Float.NaN;
                                    while (it23.hasNext()) {
                                        String next11 = it23.next();
                                        if (next11.startsWith("CUSTOM")) {
                                            it = it23;
                                            seticontintlist = new setErrorAccessibilityLabel.setIconTintList();
                                            str9 = str47;
                                            str10 = str52;
                                            obj6 = obj5;
                                            str11 = str58;
                                            obj7 = obj4;
                                            str12 = str53;
                                            obj8 = obj3;
                                            str13 = str51;
                                            str14 = str55;
                                            str15 = str54;
                                        } else {
                                            next11.hashCode();
                                            switch (next11.hashCode()) {
                                                case -1249320806:
                                                    str9 = str47;
                                                    str10 = str52;
                                                    obj6 = obj5;
                                                    str11 = str58;
                                                    obj7 = obj4;
                                                    str12 = str53;
                                                    obj8 = obj3;
                                                    str13 = str51;
                                                    str14 = str55;
                                                    str15 = str54;
                                                    if (next11.equals(obj6)) {
                                                        c = 0;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                case -1249320805:
                                                    str9 = str47;
                                                    str10 = str52;
                                                    str11 = str58;
                                                    obj7 = obj4;
                                                    str12 = str53;
                                                    obj8 = obj3;
                                                    str13 = str51;
                                                    str14 = str55;
                                                    str15 = str54;
                                                    obj6 = obj5;
                                                    if (next11.equals(obj7)) {
                                                        c = 1;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                case -1225497657:
                                                    str9 = str47;
                                                    str10 = str52;
                                                    str11 = str58;
                                                    str12 = str53;
                                                    obj8 = obj3;
                                                    str13 = str51;
                                                    str14 = str55;
                                                    str15 = str54;
                                                    obj6 = obj5;
                                                    obj7 = obj4;
                                                    if (next11.equals(obj8)) {
                                                        c = 2;
                                                        break;
                                                    }
                                                    c = 65535;
                                                    break;
                                                case -1225497656:
                                                    str9 = str47;
                                                    str10 = str52;
                                                    str11 = str58;
                                                    str12 = str53;
                                                    str13 = str51;
                                                    str14 = str55;
                                                    str15 = str54;
                                                    obj6 = obj5;
                                                    obj7 = obj4;
                                                    if (next11.equals(str9)) {
                                                        obj8 = obj3;
                                                        c = 3;
                                                        break;
                                                    }
                                                    obj8 = obj3;
                                                    c = 65535;
                                                    break;
                                                case -1225497655:
                                                    str10 = str52;
                                                    str11 = str58;
                                                    str12 = str53;
                                                    str13 = str51;
                                                    str14 = str55;
                                                    str15 = str54;
                                                    if (next11.equals(str13)) {
                                                        str9 = str47;
                                                        obj6 = obj5;
                                                        obj7 = obj4;
                                                        obj8 = obj3;
                                                        c = 4;
                                                        break;
                                                    } else {
                                                        str9 = str47;
                                                        obj6 = obj5;
                                                        obj7 = obj4;
                                                        obj8 = obj3;
                                                        c = 65535;
                                                        break;
                                                    }
                                                case -1001078227:
                                                    str10 = str52;
                                                    str11 = str58;
                                                    str12 = str53;
                                                    str14 = str55;
                                                    str15 = str54;
                                                    str9 = str47;
                                                    obj6 = obj5;
                                                    obj7 = obj4;
                                                    obj8 = obj3;
                                                    if (next11.equals(str10)) {
                                                        str13 = str51;
                                                        c = 5;
                                                        break;
                                                    }
                                                    str13 = str51;
                                                    c = 65535;
                                                    break;
                                                case -908189618:
                                                    str11 = str58;
                                                    str12 = str53;
                                                    str14 = str55;
                                                    str15 = str54;
                                                    str9 = str47;
                                                    if (next11.equals(str12)) {
                                                        str10 = str52;
                                                        obj6 = obj5;
                                                        obj7 = obj4;
                                                        obj8 = obj3;
                                                        str13 = str51;
                                                        c = 6;
                                                        break;
                                                    } else {
                                                        str10 = str52;
                                                        obj6 = obj5;
                                                        obj7 = obj4;
                                                        obj8 = obj3;
                                                        str13 = str51;
                                                        c = 65535;
                                                        break;
                                                    }
                                                case -908189617:
                                                    str11 = str58;
                                                    str14 = str55;
                                                    str15 = str54;
                                                    str9 = str47;
                                                    str10 = str52;
                                                    obj6 = obj5;
                                                    obj7 = obj4;
                                                    if (next11.equals(str14)) {
                                                        str12 = str53;
                                                        obj8 = obj3;
                                                        str13 = str51;
                                                        c = 7;
                                                        break;
                                                    } else {
                                                        str12 = str53;
                                                        obj8 = obj3;
                                                        str13 = str51;
                                                        c = 65535;
                                                        break;
                                                    }
                                                case -797520672:
                                                    str11 = str58;
                                                    str15 = str54;
                                                    if (next11.equals("waveVariesBy")) {
                                                        str9 = str47;
                                                        str10 = str52;
                                                        obj6 = obj5;
                                                        obj7 = obj4;
                                                        str12 = str53;
                                                        obj8 = obj3;
                                                        str13 = str51;
                                                        str14 = str55;
                                                        c = '\b';
                                                        break;
                                                    }
                                                    str9 = str47;
                                                    str10 = str52;
                                                    obj6 = obj5;
                                                    obj7 = obj4;
                                                    str12 = str53;
                                                    obj8 = obj3;
                                                    str13 = str51;
                                                    str14 = str55;
                                                    c = 65535;
                                                    break;
                                                case -40300674:
                                                    str11 = str58;
                                                    str15 = str54;
                                                    if (next11.equals(str15)) {
                                                        str9 = str47;
                                                        str10 = str52;
                                                        obj6 = obj5;
                                                        obj7 = obj4;
                                                        str12 = str53;
                                                        obj8 = obj3;
                                                        str13 = str51;
                                                        str14 = str55;
                                                        c = '\t';
                                                        break;
                                                    }
                                                    str9 = str47;
                                                    str10 = str52;
                                                    obj6 = obj5;
                                                    obj7 = obj4;
                                                    str12 = str53;
                                                    obj8 = obj3;
                                                    str13 = str51;
                                                    str14 = str55;
                                                    c = 65535;
                                                    break;
                                                case -4379043:
                                                    str11 = str58;
                                                    if (next11.equals(str11)) {
                                                        str9 = str47;
                                                        str10 = str52;
                                                        obj6 = obj5;
                                                        obj7 = obj4;
                                                        str12 = str53;
                                                        obj8 = obj3;
                                                        str13 = str51;
                                                        str14 = str55;
                                                        str15 = str54;
                                                        c = '\n';
                                                        break;
                                                    } else {
                                                        str9 = str47;
                                                        str10 = str52;
                                                        obj6 = obj5;
                                                        obj7 = obj4;
                                                        str12 = str53;
                                                        obj8 = obj3;
                                                        str13 = str51;
                                                        str14 = str55;
                                                        str15 = str54;
                                                        c = 65535;
                                                        break;
                                                    }
                                                case 37232917:
                                                    if (next11.equals("transitionPathRotate")) {
                                                        str9 = str47;
                                                        str10 = str52;
                                                        obj6 = obj5;
                                                        str11 = str58;
                                                        obj7 = obj4;
                                                        str12 = str53;
                                                        obj8 = obj3;
                                                        str13 = str51;
                                                        str14 = str55;
                                                        str15 = str54;
                                                        c = 11;
                                                        break;
                                                    }
                                                    str9 = str47;
                                                    str10 = str52;
                                                    obj6 = obj5;
                                                    str11 = str58;
                                                    obj7 = obj4;
                                                    str12 = str53;
                                                    obj8 = obj3;
                                                    str13 = str51;
                                                    str14 = str55;
                                                    str15 = str54;
                                                    c = 65535;
                                                    break;
                                                case 92909918:
                                                    if (next11.equals(str33)) {
                                                        str9 = str47;
                                                        str10 = str52;
                                                        obj6 = obj5;
                                                        str11 = str58;
                                                        obj7 = obj4;
                                                        str12 = str53;
                                                        obj8 = obj3;
                                                        str13 = str51;
                                                        str14 = str55;
                                                        str15 = str54;
                                                        c = '\f';
                                                        break;
                                                    }
                                                    str9 = str47;
                                                    str10 = str52;
                                                    obj6 = obj5;
                                                    str11 = str58;
                                                    obj7 = obj4;
                                                    str12 = str53;
                                                    obj8 = obj3;
                                                    str13 = str51;
                                                    str14 = str55;
                                                    str15 = str54;
                                                    c = 65535;
                                                    break;
                                                case 156108012:
                                                    if (next11.equals("waveOffset")) {
                                                        str9 = str47;
                                                        str10 = str52;
                                                        obj6 = obj5;
                                                        str11 = str58;
                                                        obj7 = obj4;
                                                        str12 = str53;
                                                        obj8 = obj3;
                                                        str13 = str51;
                                                        str14 = str55;
                                                        str15 = str54;
                                                        c = '\r';
                                                        break;
                                                    }
                                                    str9 = str47;
                                                    str10 = str52;
                                                    obj6 = obj5;
                                                    str11 = str58;
                                                    obj7 = obj4;
                                                    str12 = str53;
                                                    obj8 = obj3;
                                                    str13 = str51;
                                                    str14 = str55;
                                                    str15 = str54;
                                                    c = 65535;
                                                    break;
                                                default:
                                                    str9 = str47;
                                                    str10 = str52;
                                                    obj6 = obj5;
                                                    str11 = str58;
                                                    obj7 = obj4;
                                                    str12 = str53;
                                                    obj8 = obj3;
                                                    str13 = str51;
                                                    str14 = str55;
                                                    str15 = str54;
                                                    c = 65535;
                                                    break;
                                            }
                                            switch (c) {
                                                case 0:
                                                    setunboundedripple = new setErrorAccessibilityLabel.setUnboundedRipple();
                                                    it = it23;
                                                    seticontintlist = setunboundedripple;
                                                    break;
                                                case 1:
                                                    setunboundedripple = new setErrorAccessibilityLabel.setUiOptions();
                                                    it = it23;
                                                    seticontintlist = setunboundedripple;
                                                    break;
                                                case 2:
                                                    setunboundedripple = new setErrorAccessibilityLabel.setChipCornerRadius();
                                                    it = it23;
                                                    seticontintlist = setunboundedripple;
                                                    break;
                                                case 3:
                                                    setunboundedripple = new setErrorAccessibilityLabel.setIconSize();
                                                    it = it23;
                                                    seticontintlist = setunboundedripple;
                                                    break;
                                                case 4:
                                                    setunboundedripple = new setErrorAccessibilityLabel.setTextAlignment();
                                                    it = it23;
                                                    seticontintlist = setunboundedripple;
                                                    break;
                                                case 5:
                                                    setunboundedripple = new setErrorAccessibilityLabel.setX();
                                                    it = it23;
                                                    seticontintlist = setunboundedripple;
                                                    break;
                                                case 6:
                                                    setunboundedripple = new setErrorAccessibilityLabel.setNavigationOnClickListener();
                                                    it = it23;
                                                    seticontintlist = setunboundedripple;
                                                    break;
                                                case 7:
                                                    setunboundedripple = new setErrorAccessibilityLabel.setOnLongClickListener();
                                                    it = it23;
                                                    seticontintlist = setunboundedripple;
                                                    break;
                                                case '\b':
                                                    setunboundedripple = new setErrorAccessibilityLabel() { // from class: o.setErrorAccessibilityLabel$MenuHostHelper$$ExternalSyntheticLambda1
                                                        @Override // o.setErrorAccessibilityLabel
                                                        public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, float f3) {
                                                            view.setAlpha(setX(f3));
                                                        }
                                                    };
                                                    it = it23;
                                                    seticontintlist = setunboundedripple;
                                                    break;
                                                case '\t':
                                                    setunboundedripple = new setErrorAccessibilityLabel.setLayoutAnimation();
                                                    it = it23;
                                                    seticontintlist = setunboundedripple;
                                                    break;
                                                case '\n':
                                                    setunboundedripple = new setErrorAccessibilityLabel.setY();
                                                    it = it23;
                                                    seticontintlist = setunboundedripple;
                                                    break;
                                                case 11:
                                                    setunboundedripple = new setErrorAccessibilityLabel() { // from class: o.setErrorAccessibilityLabel$MenuHostHelper$$ExternalSyntheticLambda0
                                                        @Override // o.setErrorAccessibilityLabel
                                                        public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, float f3) {
                                                        }
                                                    };
                                                    it = it23;
                                                    seticontintlist = setunboundedripple;
                                                    break;
                                                case '\f':
                                                    setunboundedripple = new setErrorAccessibilityLabel() { // from class: o.setErrorAccessibilityLabel$MenuHostHelper$$ExternalSyntheticLambda1
                                                        @Override // o.setErrorAccessibilityLabel
                                                        public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, float f3) {
                                                            view.setAlpha(setX(f3));
                                                        }
                                                    };
                                                    it = it23;
                                                    seticontintlist = setunboundedripple;
                                                    break;
                                                case '\r':
                                                    setunboundedripple = new setErrorAccessibilityLabel() { // from class: o.setErrorAccessibilityLabel$MenuHostHelper$$ExternalSyntheticLambda1
                                                        @Override // o.setErrorAccessibilityLabel
                                                        public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, float f3) {
                                                            view.setAlpha(setX(f3));
                                                        }
                                                    };
                                                    it = it23;
                                                    seticontintlist = setunboundedripple;
                                                    break;
                                                default:
                                                    it = it23;
                                                    seticontintlist = null;
                                                    break;
                                            }
                                        }
                                        if (seticontintlist != null) {
                                            String str59 = str11;
                                            Object obj25 = obj7;
                                            if ((seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 == 1) && Float.isNaN(f2)) {
                                                float[] fArr3 = new float[2];
                                                float f3 = 0.0f;
                                                obj5 = obj6;
                                                double d3 = 0.0d;
                                                double d4 = 0.0d;
                                                int i33 = 0;
                                                while (i33 < 100) {
                                                    float f4 = i33 * 0.01010101f;
                                                    String str60 = str15;
                                                    String str61 = str14;
                                                    double d5 = f4;
                                                    joinThreadPool jointhreadpool = this.setLayoutDirection.setLayoutAnimation;
                                                    Iterator<setDivider> it24 = this.ViewPager$SavedState$1.iterator();
                                                    float f5 = Float.NaN;
                                                    float f6 = 0.0f;
                                                    while (it24.hasNext()) {
                                                        Iterator<setDivider> it25 = it24;
                                                        setDivider next12 = it24.next();
                                                        String str62 = str33;
                                                        if (next12.setLayoutAnimation != null) {
                                                            if (next12.setCenterIfNoTextEnabled < f4) {
                                                                jointhreadpool = next12.setLayoutAnimation;
                                                                f6 = next12.setCenterIfNoTextEnabled;
                                                            } else if (Float.isNaN(f5)) {
                                                                f5 = next12.setCenterIfNoTextEnabled;
                                                            }
                                                        }
                                                        it24 = it25;
                                                        str33 = str62;
                                                    }
                                                    String str63 = str33;
                                                    if (jointhreadpool != null) {
                                                        if (Float.isNaN(f5)) {
                                                            f5 = 1.0f;
                                                        }
                                                        d = (((float) jointhreadpool.setIconTintList((f4 - f6) / f)) * (f5 - f6)) + f6;
                                                    } else {
                                                        d = d5;
                                                    }
                                                    this.setZ[0].setX(d, this.setUnboundedRipple);
                                                    String str64 = str12;
                                                    this.setLayoutDirection.setIconTintList(d, this.setIconSize, this.setUnboundedRipple, fArr3, 0);
                                                    if (i33 > 0) {
                                                        f3 = (float) (f3 + Math.hypot(d4 - fArr3[1], d3 - fArr3[0]));
                                                    }
                                                    double d6 = fArr3[0];
                                                    i33++;
                                                    str14 = str61;
                                                    d4 = fArr3[1];
                                                    str15 = str60;
                                                    d3 = d6;
                                                    str33 = str63;
                                                    str12 = str64;
                                                }
                                                str16 = str15;
                                                str17 = str14;
                                                str18 = str33;
                                                str19 = str12;
                                                f2 = f3;
                                            } else {
                                                obj5 = obj6;
                                                str16 = str15;
                                                str17 = str14;
                                                str18 = str33;
                                                str19 = str12;
                                            }
                                            seticontintlist.setY = next11;
                                            this.setY.put(next11, seticontintlist);
                                            it23 = it;
                                            str55 = str17;
                                            str51 = str13;
                                            obj3 = obj8;
                                            str58 = str59;
                                            obj4 = obj25;
                                            str54 = str16;
                                            str33 = str18;
                                            str53 = str19;
                                            str52 = str10;
                                            str47 = str9;
                                        } else {
                                            it23 = it;
                                            str58 = str11;
                                            obj4 = obj7;
                                            obj5 = obj6;
                                            str54 = str15;
                                            str55 = str14;
                                            str53 = str12;
                                            str52 = str10;
                                            str51 = str13;
                                            str47 = str9;
                                            obj3 = obj8;
                                        }
                                    }
                                    Iterator<setLayoutMode> it26 = this.setChipCornerRadius.iterator();
                                    while (it26.hasNext()) {
                                        setLayoutMode next13 = it26.next();
                                        if (next13 instanceof setErrorTextAppearance) {
                                            ((setErrorTextAppearance) next13).MenuHostHelper$$ExternalSyntheticLambda1(this.setY);
                                        }
                                    }
                                    for (setErrorAccessibilityLabel seterroraccessibilitylabel : this.setY.values()) {
                                        seterroraccessibilitylabel.setIconTintList(f2);
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        sb.append(this.setLayoutDirection.setTextScaleX);
        sb.append(" y: ");
        sb.append(this.setLayoutDirection.setZ);
        sb.append(" end: x: ");
        sb.append(this.setUiOptions.setTextScaleX);
        sb.append(" y: ");
        sb.append(this.setUiOptions.setZ);
        return sb.toString();
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(setDivider setdivider) {
        setdivider.setTextScaleX = (int) this.setTextAppearanceResource.getX();
        setdivider.setZ = (int) this.setTextAppearanceResource.getY();
        setdivider.setIconSize = this.setTextAppearanceResource.getWidth();
        setdivider.setX = this.setTextAppearanceResource.getHeight();
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(setSecondaryProgress setsecondaryprogress, View view, int i, int i2, int i3) {
        this.setLayoutDirection.setCenterIfNoTextEnabled = 0.0f;
        this.setLayoutDirection.setChipCornerRadius = 0.0f;
        Rect rect = new Rect();
        setDivider setdivider = this.setLayoutDirection;
        setdivider.setTextScaleX = rect.left;
        setdivider.setZ = rect.top;
        setdivider.setIconSize = rect.width();
        setdivider.setX = rect.height();
        setImageIcon setimageicon = this.setMinAndMaxProgress;
        float f = setsecondaryprogress.setIconTintList;
        int i4 = rect.left;
        int i5 = rect.top;
        rect.width();
        rect.height();
        setimageicon.MenuHostHelper$$ExternalSyntheticLambda1(view);
        setimageicon.MenuHostHelper$$ExternalSyntheticLambda1 = Float.NaN;
        setimageicon.setIconTintList = Float.NaN;
    }

    private static void setX(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left;
            int i5 = rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - (((i4 + i5) + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i == 2) {
            int i6 = rect.left;
            int i7 = rect.right;
            rect2.left = i2 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = ((i6 + i7) - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i == 3) {
            int i8 = rect.left + rect.right;
            int i9 = rect.top;
            int i10 = rect.bottom;
            rect2.left = ((rect.height() / 2) + rect.top) - (i8 / 2);
            rect2.top = i3 - ((i8 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i == 4) {
            int i11 = rect.left;
            int i12 = rect.right;
            rect2.left = i2 - (((rect.bottom + rect.top) + rect.width()) / 2);
            rect2.top = ((i11 + i12) - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(Rect rect, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, int i, int i2) {
        Interpolator loadInterpolator;
        int i3 = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setIconTintList;
        if (i3 != 0) {
            setX(rect, this.setConstraintSet, i3, i, i2);
        }
        this.setLayoutDirection.setCenterIfNoTextEnabled = 0.0f;
        this.setLayoutDirection.setChipCornerRadius = 0.0f;
        MenuHostHelper$$ExternalSyntheticLambda1(this.setLayoutDirection);
        setDivider setdivider = this.setLayoutDirection;
        setdivider.setTextScaleX = rect.left;
        setdivider.setZ = rect.top;
        setdivider.setIconSize = rect.width();
        setdivider.setX = rect.height();
        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX MenuHostHelper$$ExternalSyntheticLambda1 = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
        this.setLayoutDirection.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1);
        this.setMaxEms = MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1;
        this.setMinAndMaxProgress.MenuHostHelper$$ExternalSyntheticLambda1(rect, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, i3, this.setNavigationOnClickListener);
        this.setFilterTouchesWhenObscured = MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener.setNavigationOnClickListener;
        this.FloatingActionButton$BaseBehavior = MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions.ViewPager$SavedState$1;
        this.setContentScrimResource = MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions.setIconSize;
        Context context = this.setTextAppearanceResource.getContext();
        int i4 = MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions.setLayoutAnimation;
        String str = MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions.setNavigationOnClickListener;
        int i5 = MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions.setUnboundedRipple;
        if (i4 == -2) {
            loadInterpolator = AnimationUtils.loadInterpolator(context, i5);
        } else if (i4 == -1) {
            final joinThreadPool iconTintList = joinThreadPool.setIconTintList(str);
            loadInterpolator = new Interpolator() { // from class: o.setIconStartPadding.2
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f) {
                    return (float) joinThreadPool.this.setIconTintList(f);
                }
            };
        } else if (i4 == 0) {
            loadInterpolator = new AccelerateDecelerateInterpolator();
        } else if (i4 == 1) {
            loadInterpolator = new AccelerateInterpolator();
        } else if (i4 == 2) {
            loadInterpolator = new DecelerateInterpolator();
        } else if (i4 == 4) {
            loadInterpolator = new BounceInterpolator();
        } else {
            loadInterpolator = i4 != 5 ? null : new OvershootInterpolator();
        }
        this.FragmentStateAdapter$5 = loadInterpolator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Rect rect, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, int i, int i2) {
        int i3 = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setIconTintList;
        if (i3 != 0) {
            setX(rect, this.setConstraintSet, i3, i, i2);
            rect = this.setConstraintSet;
        }
        this.setUiOptions.setCenterIfNoTextEnabled = 1.0f;
        this.setUiOptions.setChipCornerRadius = 1.0f;
        MenuHostHelper$$ExternalSyntheticLambda1(this.setUiOptions);
        setDivider setdivider = this.setUiOptions;
        setdivider.setTextScaleX = rect.left;
        setdivider.setZ = rect.top;
        setdivider.setIconSize = rect.width();
        setdivider.setX = rect.height();
        this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener));
        this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1(rect, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, i3, this.setNavigationOnClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float MenuHostHelper$$ExternalSyntheticLambda1(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.setCheckedIconEnabled;
            if (f3 != 1.0d) {
                float f4 = this.setOnNavigationItemSelectedListener;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        joinThreadPool jointhreadpool = this.setLayoutDirection.setLayoutAnimation;
        Iterator<setDivider> it = this.ViewPager$SavedState$1.iterator();
        float f5 = Float.NaN;
        while (it.hasNext()) {
            setDivider next = it.next();
            if (next.setLayoutAnimation != null) {
                if (next.setCenterIfNoTextEnabled < f) {
                    jointhreadpool = next.setLayoutAnimation;
                    f2 = next.setCenterIfNoTextEnabled;
                } else if (Float.isNaN(f5)) {
                    f5 = next.setCenterIfNoTextEnabled;
                }
            }
        }
        if (jointhreadpool != null) {
            float f6 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f6;
            f = (((float) jointhreadpool.setIconTintList(d)) * f6) + f2;
            if (fArr != null) {
                fArr[0] = (float) jointhreadpool.MenuHostHelper$$ExternalSyntheticLambda0(d);
            }
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setY(View view, float f, long j, setUnboundedRippleResource setunboundedrippleresource) {
        boolean z;
        View view2;
        float f2;
        char c;
        setOnSearchClickListener.setX setx;
        double d;
        float f3;
        float f4;
        double d2;
        View view3;
        float f5;
        boolean z2;
        float f6;
        float f7;
        setIconStartPadding seticonstartpadding = this;
        setOnSearchClickListener.setX setx2 = null;
        float MenuHostHelper$$ExternalSyntheticLambda1 = seticonstartpadding.MenuHostHelper$$ExternalSyntheticLambda1(f, null);
        int i = seticonstartpadding.FloatingActionButton$BaseBehavior;
        if (i != -1) {
            float f8 = 1.0f / i;
            float floor = (float) Math.floor(MenuHostHelper$$ExternalSyntheticLambda1 / f8);
            float f9 = (MenuHostHelper$$ExternalSyntheticLambda1 % f8) / f8;
            if (!Float.isNaN(seticonstartpadding.setContentScrimResource)) {
                f9 = (f9 + seticonstartpadding.setContentScrimResource) % 1.0f;
            }
            Interpolator interpolator = seticonstartpadding.FragmentStateAdapter$5;
            if (interpolator != null) {
                f7 = interpolator.getInterpolation(f9);
            } else {
                f7 = ((double) f9) > 0.5d ? 1.0f : 0.0f;
            }
            MenuHostHelper$$ExternalSyntheticLambda1 = (f7 * f8) + (floor * f8);
        }
        float f10 = MenuHostHelper$$ExternalSyntheticLambda1;
        HashMap<String, FirebasePerfKtxRegistrar> hashMap = seticonstartpadding.MenuHostHelper$$ExternalSyntheticLambda1;
        if (hashMap != null) {
            for (FirebasePerfKtxRegistrar firebasePerfKtxRegistrar : hashMap.values()) {
                firebasePerfKtxRegistrar.setY(view, f10);
            }
        }
        HashMap<String, setOnSearchClickListener> hashMap2 = seticonstartpadding.FragmentStateAdapter$2;
        if (hashMap2 != null) {
            setOnSearchClickListener.setX setx3 = null;
            boolean z3 = false;
            for (setOnSearchClickListener setonsearchclicklistener : hashMap2.values()) {
                if (setonsearchclicklistener instanceof setOnSearchClickListener.setX) {
                    setx3 = (setOnSearchClickListener.setX) setonsearchclicklistener;
                } else {
                    z3 |= setonsearchclicklistener.setY(view, f10, j, setunboundedrippleresource);
                }
            }
            setx2 = setx3;
            z = z3;
        } else {
            z = false;
        }
        setCompatElevation[] setcompatelevationArr = seticonstartpadding.setZ;
        if (setcompatelevationArr != null) {
            double d3 = f10;
            setcompatelevationArr[0].setX(d3, seticonstartpadding.setUnboundedRipple);
            seticonstartpadding.setZ[0].MenuHostHelper$$ExternalSyntheticLambda1(d3, seticonstartpadding.setCenterIfNoTextEnabled);
            setCompatElevation setcompatelevation = seticonstartpadding.MenuHostHelper$$ExternalSyntheticLambda0;
            if (setcompatelevation != null) {
                double[] dArr = seticonstartpadding.setUnboundedRipple;
                if (dArr.length > 0) {
                    setcompatelevation.setX(d3, dArr);
                    seticonstartpadding.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(d3, seticonstartpadding.setCenterIfNoTextEnabled);
                }
            }
            if (seticonstartpadding.setTextScaleX) {
                setx = setx2;
                d = d3;
                f3 = f10;
            } else {
                setDivider setdivider = seticonstartpadding.setLayoutDirection;
                int[] iArr = seticonstartpadding.setIconSize;
                double[] dArr2 = seticonstartpadding.setUnboundedRipple;
                double[] dArr3 = seticonstartpadding.setCenterIfNoTextEnabled;
                boolean z4 = seticonstartpadding.setLayoutAnimation;
                float f11 = setdivider.setTextScaleX;
                float f12 = setdivider.setZ;
                float f13 = setdivider.setIconSize;
                float f14 = setdivider.setX;
                if (iArr.length != 0) {
                    f5 = f11;
                    if (setdivider.ViewPager$SavedState$1.length <= iArr[iArr.length - 1]) {
                        int i2 = iArr[iArr.length - 1] + 1;
                        setdivider.ViewPager$SavedState$1 = new double[i2];
                        setdivider.setTextAlignment = new double[i2];
                    }
                } else {
                    f5 = f11;
                }
                float f15 = f13;
                Arrays.fill(setdivider.ViewPager$SavedState$1, Double.NaN);
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    double[] dArr4 = setdivider.ViewPager$SavedState$1;
                    int i4 = iArr[i3];
                    dArr4[i4] = dArr2[i3];
                    setdivider.setTextAlignment[i4] = dArr3[i3];
                }
                setx = setx2;
                float f16 = f12;
                float f17 = f5;
                float f18 = Float.NaN;
                int i5 = 0;
                float f19 = 0.0f;
                float f20 = 0.0f;
                float f21 = 0.0f;
                float f22 = 0.0f;
                while (true) {
                    double[] dArr5 = setdivider.ViewPager$SavedState$1;
                    f3 = f10;
                    if (i5 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i5])) {
                        f6 = f14;
                    } else {
                        float f23 = (float) (Double.isNaN(setdivider.ViewPager$SavedState$1[i5]) ? 0.0d : setdivider.ViewPager$SavedState$1[i5] + 0.0d);
                        f6 = f14;
                        float f24 = (float) setdivider.setTextAlignment[i5];
                        if (i5 == 1) {
                            f17 = f23;
                            f19 = f24;
                        } else if (i5 == 2) {
                            f16 = f23;
                            f20 = f24;
                        } else if (i5 == 3) {
                            f15 = f23;
                            f21 = f24;
                        } else if (i5 == 4) {
                            f14 = f23;
                            f22 = f24;
                            i5++;
                            f10 = f3;
                        } else if (i5 == 5) {
                            f18 = f23;
                        }
                    }
                    f14 = f6;
                    i5++;
                    f10 = f3;
                }
                float f25 = f14;
                setIconStartPadding seticonstartpadding2 = setdivider.setNavigationOnClickListener;
                if (seticonstartpadding2 != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    seticonstartpadding2.setIconTintList(d3, fArr, fArr2);
                    float f26 = fArr[0];
                    float f27 = fArr[1];
                    float f28 = fArr2[0];
                    float f29 = fArr2[1];
                    d = d3;
                    double d4 = f26;
                    float f30 = f18;
                    double d5 = f17;
                    double d6 = f16;
                    z2 = z4;
                    float sin = (float) ((d4 + (Math.sin(d6) * d5)) - (f15 / 2.0f));
                    float cos = (float) ((f27 - (Math.cos(d6) * d5)) - (f25 / 2.0f));
                    double d7 = f28;
                    double d8 = f19;
                    double d9 = f20;
                    float sin2 = (float) (d7 + (Math.sin(d6) * d8) + (Math.cos(d6) * d5 * d9));
                    float cos2 = (float) ((f29 - (d8 * Math.cos(d6))) + (d5 * Math.sin(d6) * d9));
                    if (dArr3.length >= 2) {
                        dArr3[0] = sin2;
                        dArr3[1] = cos2;
                    }
                    if (!Float.isNaN(f30)) {
                        view.setRotation((float) (f30 + Math.toDegrees(Math.atan2(cos2, sin2))));
                    }
                    f17 = sin;
                    f16 = cos;
                } else {
                    d = d3;
                    z2 = z4;
                    if (!Float.isNaN(f18)) {
                        view.setRotation((float) (f18 + Math.toDegrees(Math.atan2(f20 + (f22 / 2.0f), f19 + (f21 / 2.0f))) + 0.0d));
                    }
                }
                if (view instanceof setTabIconTintResource) {
                    setTabIconTintResource settabicontintresource = (setTabIconTintResource) view;
                } else {
                    float f31 = f17 + 0.5f;
                    int i6 = (int) f31;
                    float f32 = f16 + 0.5f;
                    int i7 = (int) f32;
                    int i8 = (int) (f31 + f15);
                    int i9 = (int) (f32 + f25);
                    int i10 = i8 - i6;
                    int i11 = i9 - i7;
                    if (((i10 == view.getMeasuredWidth() && i11 == view.getMeasuredHeight()) ? false : true) || z2) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    }
                    view.layout(i6, i7, i8, i9);
                }
                seticonstartpadding = this;
                seticonstartpadding.setLayoutAnimation = false;
            }
            if (seticonstartpadding.setFilterTouchesWhenObscured != -1) {
                if (seticonstartpadding.setViewTranslationCallback == null) {
                    seticonstartpadding.setViewTranslationCallback = ((View) view.getParent()).findViewById(seticonstartpadding.setFilterTouchesWhenObscured);
                }
                if (seticonstartpadding.setViewTranslationCallback != null) {
                    float top = (view3.getTop() + seticonstartpadding.setViewTranslationCallback.getBottom()) / 2.0f;
                    float left = (seticonstartpadding.setViewTranslationCallback.getLeft() + seticonstartpadding.setViewTranslationCallback.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap<String, FirebasePerfKtxRegistrar> hashMap3 = seticonstartpadding.MenuHostHelper$$ExternalSyntheticLambda1;
            if (hashMap3 != null) {
                for (FirebasePerfKtxRegistrar firebasePerfKtxRegistrar2 : hashMap3.values()) {
                    if (firebasePerfKtxRegistrar2 instanceof FirebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda0) {
                        double[] dArr6 = seticonstartpadding.setCenterIfNoTextEnabled;
                        if (dArr6.length > 1) {
                            view.setRotation(((FirebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda0) firebasePerfKtxRegistrar2).MenuHostHelper$$ExternalSyntheticLambda1(f3) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            float f33 = f3;
            if (setx != null) {
                double[] dArr7 = seticonstartpadding.setCenterIfNoTextEnabled;
                f4 = f33;
                d2 = d;
                c = 1;
                z |= setx.MenuHostHelper$$ExternalSyntheticLambda0(view, setunboundedrippleresource, f33, j, dArr7[0], dArr7[1]);
            } else {
                f4 = f33;
                d2 = d;
                c = 1;
            }
            int i12 = 1;
            while (true) {
                setCompatElevation[] setcompatelevationArr2 = seticonstartpadding.setZ;
                if (i12 >= setcompatelevationArr2.length) {
                    break;
                }
                setcompatelevationArr2[i12].setX(d2, seticonstartpadding.setAdapter);
                setStretchMode.MenuHostHelper$$ExternalSyntheticLambda0(seticonstartpadding.setLayoutDirection.MenuHostHelper$$ExternalSyntheticLambda0.get(seticonstartpadding.setHasDecor[i12 - 1]), view, seticonstartpadding.setAdapter);
                i12++;
            }
            view2 = view;
            if (seticonstartpadding.setMinAndMaxProgress.setLayoutAnimation == 0) {
                if (f4 <= 0.0f) {
                    view2.setVisibility(seticonstartpadding.setMinAndMaxProgress.setOnNavigationItemSelectedListener);
                } else if (f4 >= 1.0f) {
                    view2.setVisibility(seticonstartpadding.setOnLongClickListener.setOnNavigationItemSelectedListener);
                } else if (seticonstartpadding.setOnLongClickListener.setOnNavigationItemSelectedListener != seticonstartpadding.setMinAndMaxProgress.setOnNavigationItemSelectedListener) {
                    view2.setVisibility(0);
                }
            }
            if (seticonstartpadding.setTextAlignment != null) {
                int i13 = 0;
                while (true) {
                    setTypeface[] settypefaceArr = seticonstartpadding.setTextAlignment;
                    if (i13 >= settypefaceArr.length) {
                        break;
                    }
                    settypefaceArr[i13].setX(f4, view2);
                    i13++;
                }
            }
            f2 = f4;
        } else {
            view2 = view;
            f2 = f10;
            c = 1;
            float f34 = seticonstartpadding.setLayoutDirection.setTextScaleX + ((seticonstartpadding.setUiOptions.setTextScaleX - seticonstartpadding.setLayoutDirection.setTextScaleX) * f2) + 0.5f;
            int i14 = (int) f34;
            float f35 = seticonstartpadding.setLayoutDirection.setZ + ((seticonstartpadding.setUiOptions.setZ - seticonstartpadding.setLayoutDirection.setZ) * f2) + 0.5f;
            int i15 = (int) f35;
            int i16 = (int) (f34 + seticonstartpadding.setLayoutDirection.setIconSize + ((seticonstartpadding.setUiOptions.setIconSize - seticonstartpadding.setLayoutDirection.setIconSize) * f2));
            int i17 = (int) (f35 + seticonstartpadding.setLayoutDirection.setX + ((seticonstartpadding.setUiOptions.setX - seticonstartpadding.setLayoutDirection.setX) * f2));
            if (seticonstartpadding.setUiOptions.setIconSize != seticonstartpadding.setLayoutDirection.setIconSize || seticonstartpadding.setUiOptions.setX != seticonstartpadding.setLayoutDirection.setX || seticonstartpadding.setLayoutAnimation) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i16 - i14, 1073741824), View.MeasureSpec.makeMeasureSpec(i17 - i15, 1073741824));
                seticonstartpadding.setLayoutAnimation = false;
            }
            view2.layout(i14, i15, i16, i17);
        }
        HashMap<String, setErrorAccessibilityLabel> hashMap4 = seticonstartpadding.setY;
        if (hashMap4 != null) {
            for (setErrorAccessibilityLabel seterroraccessibilitylabel : hashMap4.values()) {
                if (!(seterroraccessibilitylabel instanceof setErrorAccessibilityLabel$MenuHostHelper$$ExternalSyntheticLambda0)) {
                    seterroraccessibilitylabel.MenuHostHelper$$ExternalSyntheticLambda1(view2, f2);
                } else {
                    double[] dArr8 = seticonstartpadding.setCenterIfNoTextEnabled;
                    view2.setRotation(((setErrorAccessibilityLabel$MenuHostHelper$$ExternalSyntheticLambda0) seterroraccessibilitylabel).setX(f2) + ((float) Math.toDegrees(Math.atan2(dArr8[c], dArr8[0]))));
                }
            }
        }
        return z;
    }
}