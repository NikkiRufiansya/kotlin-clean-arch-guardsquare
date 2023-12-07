package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import o.setExpandedTitleMargin;

/* loaded from: classes.dex */
public class setErrorTextAppearance extends setLayoutMode {
    private String setOnNavigationItemSelectedListener = null;
    private int setUiOptions = 0;
    private int setTextAppearanceResource = -1;
    private String setLayoutAnimation = null;
    private float setMinAndMaxProgress = Float.NaN;
    private float setLayoutDirection = 0.0f;
    private float setCheckedIconEnabled = 0.0f;
    private float setNavigationOnClickListener = Float.NaN;
    private int setGuidelinePercent = -1;
    private float setOnLongClickListener = Float.NaN;
    private float setUnboundedRipple = Float.NaN;
    private float ViewPager$SavedState$1 = Float.NaN;
    private float setZ = Float.NaN;
    private float setCenterIfNoTextEnabled = Float.NaN;
    private float setTextAlignment = Float.NaN;
    private float setChipCornerRadius = Float.NaN;
    private float setIconSize = Float.NaN;
    private float setAnimationFromJson = Float.NaN;
    private float setTextScaleX = Float.NaN;
    private float setMaxEms = Float.NaN;

    public setErrorTextAppearance() {
        this.setX = 4;
        this.setY = new HashMap<>();
    }

    @Override // o.setLayoutMode
    public final void setIconTintList(Context context, AttributeSet attributeSet) {
        setY.MenuHostHelper$$ExternalSyntheticLambda0(this, context.obtainStyledAttributes(attributeSet, setExpandedTitleMargin.setY.FirebaseInstallationsKtxRegistrar));
    }

    @Override // o.setLayoutMode
    public final void MenuHostHelper$$ExternalSyntheticLambda1(HashSet<String> hashSet) {
        if (!Float.isNaN(this.setOnLongClickListener)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.setUnboundedRipple)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.ViewPager$SavedState$1)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.setCenterIfNoTextEnabled)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.setTextAlignment)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.setChipCornerRadius)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.setIconSize)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.setZ)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.setAnimationFromJson)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.setTextScaleX)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.setMaxEms)) {
            hashSet.add("translationZ");
        }
        if (this.setY.size() > 0) {
            for (String str : this.setY.keySet()) {
                StringBuilder sb = new StringBuilder("CUSTOM,");
                sb.append(str);
                hashSet.add(sb.toString());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
        if (r1.equals("scaleY") != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(java.util.HashMap<java.lang.String, o.setErrorAccessibilityLabel> r15) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setErrorTextAppearance.MenuHostHelper$$ExternalSyntheticLambda1(java.util.HashMap):void");
    }

    @Override // o.setLayoutMode
    public final void MenuHostHelper$$ExternalSyntheticLambda0(HashMap<String, FirebasePerfKtxRegistrar> hashMap) {
        StringBuilder sb = new StringBuilder("add ");
        sb.append(hashMap.size());
        sb.append(" values");
        String obj = sb.toString();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(2, stackTrace.length - 1);
        String str = " ";
        for (int i = 1; i <= min; i++) {
            StackTraceElement stackTraceElement = stackTrace[i];
            StringBuilder sb2 = new StringBuilder(".(");
            sb2.append(stackTrace[i].getFileName());
            sb2.append(":");
            sb2.append(stackTrace[i].getLineNumber());
            sb2.append(") ");
            sb2.append(stackTrace[i].getMethodName());
            String obj2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(" ");
            str = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj);
            sb4.append(str);
            sb4.append(obj2);
            sb4.append(str);
            Log.v("KeyCycle", sb4.toString());
        }
        for (String str2 : hashMap.keySet()) {
            FirebasePerfKtxRegistrar firebasePerfKtxRegistrar = hashMap.get(str2);
            if (firebasePerfKtxRegistrar != null) {
                str2.hashCode();
                char c = 65535;
                switch (str2.hashCode()) {
                    case -1249320806:
                        if (str2.equals("rotationX")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (str2.equals("rotationY")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (str2.equals("translationX")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str2.equals("translationY")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (str2.equals("translationZ")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str2.equals("progress")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (str2.equals("scaleX")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str2.equals("scaleY")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -40300674:
                        if (str2.equals("rotation")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str2.equals("elevation")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 37232917:
                        if (str2.equals("transitionPathRotate")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 92909918:
                        if (str2.equals("alpha")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 156108012:
                        if (str2.equals("waveOffset")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 1530034690:
                        if (str2.equals("wavePhase")) {
                            c = '\r';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, this.setCenterIfNoTextEnabled);
                        continue;
                    case 1:
                        firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, this.setTextAlignment);
                        continue;
                    case 2:
                        firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, this.setAnimationFromJson);
                        continue;
                    case 3:
                        firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, this.setTextScaleX);
                        continue;
                    case 4:
                        firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, this.setMaxEms);
                        continue;
                    case 5:
                        firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, this.setNavigationOnClickListener);
                        continue;
                    case 6:
                        firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, this.setChipCornerRadius);
                        continue;
                    case 7:
                        firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, this.setIconSize);
                        continue;
                    case '\b':
                        firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, this.ViewPager$SavedState$1);
                        continue;
                    case '\t':
                        firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, this.setUnboundedRipple);
                        continue;
                    case '\n':
                        firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, this.setZ);
                        continue;
                    case 11:
                        firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, this.setOnLongClickListener);
                        continue;
                    case '\f':
                        firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, this.setLayoutDirection);
                        continue;
                    case '\r':
                        firebasePerfKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, this.setCheckedIconEnabled);
                        continue;
                    default:
                        if (!str2.startsWith("CUSTOM")) {
                            StringBuilder sb5 = new StringBuilder("  UNKNOWN  ");
                            sb5.append(str2);
                            Log.v("WARNING KeyCycle", sb5.toString());
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    static class setY {
        private static SparseIntArray setY;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            setY = sparseIntArray;
            sparseIntArray.append(setExpandedTitleMargin.setY.setButtonDrawable, 1);
            setY.append(setExpandedTitleMargin.setY.setKeyProgressIncrement, 2);
            setY.append(setExpandedTitleMargin.setY.setVerticalFadingEdgeEnabled, 3);
            setY.append(setExpandedTitleMargin.setY.setItemActiveIndicatorMarginHorizontal, 4);
            setY.append(setExpandedTitleMargin.setY.setAllowCollapse, 5);
            setY.append(setExpandedTitleMargin.setY.setLeft, 6);
            setY.append(setExpandedTitleMargin.setY.MaterialButton$SavedState$1, 7);
            setY.append(setExpandedTitleMargin.setY.setSize, 8);
            setY.append(setExpandedTitleMargin.setY.setHelperTextColor, 9);
            setY.append(setExpandedTitleMargin.setY.setOverriddenInsets, 10);
            setY.append(setExpandedTitleMargin.setY.setIconifiedByDefault, 11);
            setY.append(setExpandedTitleMargin.setY.setExtended, 12);
            setY.append(setExpandedTitleMargin.setY.setOptimizationLevel, 13);
            setY.append(setExpandedTitleMargin.setY.setTabIconTint, 14);
            setY.append(setExpandedTitleMargin.setY.getStrokeColor, 15);
            setY.append(setExpandedTitleMargin.setY.setMinLines, 16);
            setY.append(setExpandedTitleMargin.setY.setWindowInsetsAnimationCallback, 17);
            setY.append(setExpandedTitleMargin.setY.copyRootViewBounds, 18);
            setY.append(setExpandedTitleMargin.setY.setExpandedFormat, 19);
            setY.append(setExpandedTitleMargin.setY.setEnsureMinTouchTargetSize, 20);
            setY.append(setExpandedTitleMargin.setY.setExpanded, 21);
        }

        static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(setErrorTextAppearance seterrortextappearance, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (setY.get(index)) {
                    case 1:
                        if (setSubtitle.setIconTintList) {
                            seterrortextappearance.MenuHostHelper$$ExternalSyntheticLambda1 = typedArray.getResourceId(index, seterrortextappearance.MenuHostHelper$$ExternalSyntheticLambda1);
                            if (seterrortextappearance.MenuHostHelper$$ExternalSyntheticLambda1 == -1) {
                                seterrortextappearance.MenuHostHelper$$ExternalSyntheticLambda0 = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            seterrortextappearance.MenuHostHelper$$ExternalSyntheticLambda0 = typedArray.getString(index);
                            break;
                        } else {
                            seterrortextappearance.MenuHostHelper$$ExternalSyntheticLambda1 = typedArray.getResourceId(index, seterrortextappearance.MenuHostHelper$$ExternalSyntheticLambda1);
                            break;
                        }
                    case 2:
                        seterrortextappearance.setIconTintList = typedArray.getInt(index, seterrortextappearance.setIconTintList);
                        break;
                    case 3:
                        seterrortextappearance.setOnNavigationItemSelectedListener = typedArray.getString(index);
                        break;
                    case 4:
                        seterrortextappearance.setUiOptions = typedArray.getInteger(index, seterrortextappearance.setUiOptions);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            seterrortextappearance.setLayoutAnimation = typedArray.getString(index);
                            seterrortextappearance.setTextAppearanceResource = 7;
                            break;
                        } else {
                            seterrortextappearance.setTextAppearanceResource = typedArray.getInt(index, seterrortextappearance.setTextAppearanceResource);
                            break;
                        }
                    case 6:
                        seterrortextappearance.setMinAndMaxProgress = typedArray.getFloat(index, seterrortextappearance.setMinAndMaxProgress);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            seterrortextappearance.setLayoutDirection = typedArray.getDimension(index, seterrortextappearance.setLayoutDirection);
                            break;
                        } else {
                            seterrortextappearance.setLayoutDirection = typedArray.getFloat(index, seterrortextappearance.setLayoutDirection);
                            break;
                        }
                    case 8:
                        seterrortextappearance.setGuidelinePercent = typedArray.getInt(index, seterrortextappearance.setGuidelinePercent);
                        break;
                    case 9:
                        seterrortextappearance.setOnLongClickListener = typedArray.getFloat(index, seterrortextappearance.setOnLongClickListener);
                        break;
                    case 10:
                        seterrortextappearance.setUnboundedRipple = typedArray.getDimension(index, seterrortextappearance.setUnboundedRipple);
                        break;
                    case 11:
                        seterrortextappearance.ViewPager$SavedState$1 = typedArray.getFloat(index, seterrortextappearance.ViewPager$SavedState$1);
                        break;
                    case 12:
                        seterrortextappearance.setCenterIfNoTextEnabled = typedArray.getFloat(index, seterrortextappearance.setCenterIfNoTextEnabled);
                        break;
                    case 13:
                        seterrortextappearance.setTextAlignment = typedArray.getFloat(index, seterrortextappearance.setTextAlignment);
                        break;
                    case 14:
                        seterrortextappearance.setZ = typedArray.getFloat(index, seterrortextappearance.setZ);
                        break;
                    case 15:
                        seterrortextappearance.setChipCornerRadius = typedArray.getFloat(index, seterrortextappearance.setChipCornerRadius);
                        break;
                    case 16:
                        seterrortextappearance.setIconSize = typedArray.getFloat(index, seterrortextappearance.setIconSize);
                        break;
                    case 17:
                        seterrortextappearance.setAnimationFromJson = typedArray.getDimension(index, seterrortextappearance.setAnimationFromJson);
                        break;
                    case 18:
                        seterrortextappearance.setTextScaleX = typedArray.getDimension(index, seterrortextappearance.setTextScaleX);
                        break;
                    case 19:
                        seterrortextappearance.setMaxEms = typedArray.getDimension(index, seterrortextappearance.setMaxEms);
                        break;
                    case 20:
                        seterrortextappearance.setNavigationOnClickListener = typedArray.getFloat(index, seterrortextappearance.setNavigationOnClickListener);
                        break;
                    case 21:
                        seterrortextappearance.setCheckedIconEnabled = typedArray.getFloat(index, seterrortextappearance.setCheckedIconEnabled) / 360.0f;
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(setY.get(index));
                        Log.e("KeyCycle", sb.toString());
                        break;
                }
            }
        }
    }

    @Override // o.setLayoutMode
    public final setLayoutMode setX(setLayoutMode setlayoutmode) {
        super.setX(setlayoutmode);
        setErrorTextAppearance seterrortextappearance = (setErrorTextAppearance) setlayoutmode;
        this.setOnNavigationItemSelectedListener = seterrortextappearance.setOnNavigationItemSelectedListener;
        this.setUiOptions = seterrortextappearance.setUiOptions;
        this.setTextAppearanceResource = seterrortextappearance.setTextAppearanceResource;
        this.setLayoutAnimation = seterrortextappearance.setLayoutAnimation;
        this.setMinAndMaxProgress = seterrortextappearance.setMinAndMaxProgress;
        this.setLayoutDirection = seterrortextappearance.setLayoutDirection;
        this.setCheckedIconEnabled = seterrortextappearance.setCheckedIconEnabled;
        this.setNavigationOnClickListener = seterrortextappearance.setNavigationOnClickListener;
        this.setGuidelinePercent = seterrortextappearance.setGuidelinePercent;
        this.setOnLongClickListener = seterrortextappearance.setOnLongClickListener;
        this.setUnboundedRipple = seterrortextappearance.setUnboundedRipple;
        this.ViewPager$SavedState$1 = seterrortextappearance.ViewPager$SavedState$1;
        this.setZ = seterrortextappearance.setZ;
        this.setCenterIfNoTextEnabled = seterrortextappearance.setCenterIfNoTextEnabled;
        this.setTextAlignment = seterrortextappearance.setTextAlignment;
        this.setChipCornerRadius = seterrortextappearance.setChipCornerRadius;
        this.setIconSize = seterrortextappearance.setIconSize;
        this.setAnimationFromJson = seterrortextappearance.setAnimationFromJson;
        this.setTextScaleX = seterrortextappearance.setTextScaleX;
        this.setMaxEms = seterrortextappearance.setMaxEms;
        return this;
    }

    @Override // o.setLayoutMode
    public final setLayoutMode setIconTintList() {
        return new setErrorTextAppearance().setX((setLayoutMode) this);
    }

    @Override // o.setLayoutMode
    public /* synthetic */ Object clone() {
        return new setErrorTextAppearance().setX((setLayoutMode) this);
    }
}