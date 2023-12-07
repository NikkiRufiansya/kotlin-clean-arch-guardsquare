package o;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;
import o.setExpandedTitleMargin;

/* loaded from: classes.dex */
public class BottomSheetBehavior$SavedState$1 extends setLayoutMode {
    private String setGuidelinePercent;
    private int setCheckedIconEnabled = -1;
    float setUiOptions = Float.NaN;
    float setUnboundedRipple = Float.NaN;
    float setNavigationOnClickListener = Float.NaN;
    float setLayoutAnimation = Float.NaN;
    float setChipCornerRadius = Float.NaN;
    float setCenterIfNoTextEnabled = Float.NaN;
    float ViewPager$SavedState$1 = Float.NaN;
    float setIconSize = Float.NaN;
    float setTextAlignment = Float.NaN;
    float setZ = Float.NaN;
    float setTextScaleX = Float.NaN;
    float setOnLongClickListener = Float.NaN;
    int setMaxEms = 0;
    private String setMinAndMaxProgress = null;
    float setOnNavigationItemSelectedListener = Float.NaN;
    float setAnimationFromJson = 0.0f;

    public BottomSheetBehavior$SavedState$1() {
        this.setX = 3;
        this.setY = new HashMap<>();
    }

    @Override // o.setLayoutMode
    public final void setIconTintList(Context context, AttributeSet attributeSet) {
        BottomSheetBehavior$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0.setY(this, context.obtainStyledAttributes(attributeSet, setExpandedTitleMargin.setY.BaseTransientBottomBar$Behavior));
    }

    @Override // o.setLayoutMode
    public final void MenuHostHelper$$ExternalSyntheticLambda1(HashSet<String> hashSet) {
        if (!Float.isNaN(this.setUiOptions)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.setUnboundedRipple)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.setNavigationOnClickListener)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.setLayoutAnimation)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.setChipCornerRadius)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.setTextAlignment)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.setZ)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.setTextScaleX)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.setCenterIfNoTextEnabled)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.ViewPager$SavedState$1)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.setIconSize)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.setOnLongClickListener)) {
            hashSet.add("progress");
        }
        if (this.setY.size() > 0) {
            for (String str : this.setY.keySet()) {
                StringBuilder sb = new StringBuilder("CUSTOM,");
                sb.append(str);
                hashSet.add(sb.toString());
            }
        }
    }

    @Override // o.setLayoutMode
    public final void setY(HashMap<String, Integer> hashMap) {
        if (this.setCheckedIconEnabled == -1) {
            return;
        }
        if (!Float.isNaN(this.setUiOptions)) {
            hashMap.put("alpha", Integer.valueOf(this.setCheckedIconEnabled));
        }
        if (!Float.isNaN(this.setUnboundedRipple)) {
            hashMap.put("elevation", Integer.valueOf(this.setCheckedIconEnabled));
        }
        if (!Float.isNaN(this.setNavigationOnClickListener)) {
            hashMap.put("rotation", Integer.valueOf(this.setCheckedIconEnabled));
        }
        if (!Float.isNaN(this.setLayoutAnimation)) {
            hashMap.put("rotationX", Integer.valueOf(this.setCheckedIconEnabled));
        }
        if (!Float.isNaN(this.setChipCornerRadius)) {
            hashMap.put("rotationY", Integer.valueOf(this.setCheckedIconEnabled));
        }
        if (!Float.isNaN(this.setTextAlignment)) {
            hashMap.put("translationX", Integer.valueOf(this.setCheckedIconEnabled));
        }
        if (!Float.isNaN(this.setZ)) {
            hashMap.put("translationY", Integer.valueOf(this.setCheckedIconEnabled));
        }
        if (!Float.isNaN(this.setTextScaleX)) {
            hashMap.put("translationZ", Integer.valueOf(this.setCheckedIconEnabled));
        }
        if (!Float.isNaN(this.setCenterIfNoTextEnabled)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.setCheckedIconEnabled));
        }
        if (!Float.isNaN(this.ViewPager$SavedState$1)) {
            hashMap.put("scaleX", Integer.valueOf(this.setCheckedIconEnabled));
        }
        if (!Float.isNaN(this.ViewPager$SavedState$1)) {
            hashMap.put("scaleY", Integer.valueOf(this.setCheckedIconEnabled));
        }
        if (!Float.isNaN(this.setOnLongClickListener)) {
            hashMap.put("progress", Integer.valueOf(this.setCheckedIconEnabled));
        }
        if (this.setY.size() > 0) {
            for (String str : this.setY.keySet()) {
                StringBuilder sb = new StringBuilder("CUSTOM,");
                sb.append(str);
                hashMap.put(sb.toString(), Integer.valueOf(this.setCheckedIconEnabled));
            }
        }
    }

    @Override // o.setLayoutMode
    public final void MenuHostHelper$$ExternalSyntheticLambda0(HashMap<String, FirebasePerfKtxRegistrar> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // o.setLayoutMode
    public final setLayoutMode setX(setLayoutMode setlayoutmode) {
        super.setX(setlayoutmode);
        BottomSheetBehavior$SavedState$1 bottomSheetBehavior$SavedState$1 = (BottomSheetBehavior$SavedState$1) setlayoutmode;
        this.setGuidelinePercent = bottomSheetBehavior$SavedState$1.setGuidelinePercent;
        this.setCheckedIconEnabled = bottomSheetBehavior$SavedState$1.setCheckedIconEnabled;
        this.setMaxEms = bottomSheetBehavior$SavedState$1.setMaxEms;
        this.setOnNavigationItemSelectedListener = bottomSheetBehavior$SavedState$1.setOnNavigationItemSelectedListener;
        this.setAnimationFromJson = bottomSheetBehavior$SavedState$1.setAnimationFromJson;
        this.setOnLongClickListener = bottomSheetBehavior$SavedState$1.setOnLongClickListener;
        this.setUiOptions = bottomSheetBehavior$SavedState$1.setUiOptions;
        this.setUnboundedRipple = bottomSheetBehavior$SavedState$1.setUnboundedRipple;
        this.setNavigationOnClickListener = bottomSheetBehavior$SavedState$1.setNavigationOnClickListener;
        this.setCenterIfNoTextEnabled = bottomSheetBehavior$SavedState$1.setCenterIfNoTextEnabled;
        this.setLayoutAnimation = bottomSheetBehavior$SavedState$1.setLayoutAnimation;
        this.setChipCornerRadius = bottomSheetBehavior$SavedState$1.setChipCornerRadius;
        this.ViewPager$SavedState$1 = bottomSheetBehavior$SavedState$1.ViewPager$SavedState$1;
        this.setIconSize = bottomSheetBehavior$SavedState$1.setIconSize;
        this.setTextAlignment = bottomSheetBehavior$SavedState$1.setTextAlignment;
        this.setZ = bottomSheetBehavior$SavedState$1.setZ;
        this.setTextScaleX = bottomSheetBehavior$SavedState$1.setTextScaleX;
        return this;
    }

    @Override // o.setLayoutMode
    public final setLayoutMode setIconTintList() {
        return new BottomSheetBehavior$SavedState$1().setX((setLayoutMode) this);
    }

    @Override // o.setLayoutMode
    public /* synthetic */ Object clone() {
        return new BottomSheetBehavior$SavedState$1().setX((setLayoutMode) this);
    }
}