package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.setBoxStrokeWidthResource;

/* loaded from: classes.dex */
public class setVisibility {
    public zza FabTransformationBehavior;
    protected int Fragment$5;
    private int GridLayoutManager;
    public zza MenuHostHelper$$ExternalSyntheticLambda1;
    public setVisibility RecyclerView$SavedState$1;
    private int RemoteActionCompatParcelizer;
    public int createDispatcher;
    private int m;
    private int minusKey;
    public Object setAnimationFromJson;
    private int setCalendarViewShown;
    private int setCallingWorkSourceUid;
    public zzD setCenterIfNoTextEnabled;
    private boolean setCheckableResource;
    private setVisibility setCheckedIconEnabledResource;
    public boolean setChipCornerRadius;
    protected int setChipIconEnabled;
    private int setChipIconEnabledResource;
    public zzD[] setChipIconTintResource;
    private int setChipSpacingHorizontal;
    private int setChipTextResource;
    protected setVisibility[] setConstraintSet;
    private boolean setDelayedApplicationOfInitialState;
    private boolean setEdgeEffectFactory;
    private boolean setEmptyView;
    public int setError;
    private boolean setErrorIconTintList;
    private boolean setExpandedTitleTextColor;
    public int setFilterRedundantCalls;
    protected setVisibility[] setFloatValues;
    public float setGuidelinePercent;
    public setX[] setHasDecor;
    public int setHint;
    public int setLayoutAnimation;
    boolean[] setLayoutDirection;
    public int setMaxEms;
    public int setMinAndMaxProgress;
    protected ArrayList<zzD> setOnLongClickListener;
    public String setOnNavigationItemSelectedListener;
    private boolean setOnScrollChangeListener;
    protected int setRevealInfo;
    private String setRippleColorResource;
    private boolean setRowOrderPreserved;
    private boolean setScrollX;
    private boolean setScrollY;
    private boolean setSecondaryProgressTintMode;
    protected int setSelectedChildViewEnabled;
    private setVisibility setSingleLine;
    public int setTextAlignment;
    public int setTextScaleX;
    public float setTitleMarginEnd;
    public float[] setTooltipText;
    public boolean setUnboundedRipple;
    public float setZ;
    public boolean setCloseIconEndPadding = false;
    private setSupportButtonTintList[] setIndeterminateTintList = new setSupportButtonTintList[2];
    public setExtractedText setNavigationOnClickListener = null;
    public setIndeterminateTintBlendMode setNavigationIconTint = null;
    private boolean[] setLineBreakStyle = {true, true};
    private boolean wrap = false;
    public boolean setImageTintMode = true;
    private boolean setY = false;
    private boolean setIconTintList = true;
    private int setSystemUiVisibility = -1;
    private int setMinEms = -1;
    private setHintEnabled setX = new setHintEnabled(this);
    private boolean setAccessibilityTraversalAfter = false;
    private boolean setSearchResultHighlightColor = false;
    public boolean setUiOptions = false;
    public boolean setSubmitButtonEnabled = false;
    public int setTextAppearanceResource = -1;
    public int onActivityResumed = -1;
    public int getCallingPid = 0;
    public int setContentScrimResource = 0;
    public int FragmentStateAdapter$2 = 0;
    public int[] FirebaseRemoteConfigKtxRegistrar = new int[2];
    public int setObjectValues = 0;
    public int FragmentStateAdapter$5 = 0;
    public float setFilterTouchesWhenObscured = 1.0f;
    public int setAdapter = 0;
    public int FloatingActionButton$BaseBehavior = 0;
    public float setViewTranslationCallback = 1.0f;
    private int setSelectionFromTop = -1;
    private float setOnSeekBarChangeListener = 1.0f;
    public int[] setSuffixText = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    private float TextInputLayout$SavedState$1 = 0.0f;
    public boolean MenuHostHelper$$ExternalSyntheticLambda0 = false;
    public boolean setCheckedIconEnabled = false;
    public int SearchView$SavedState$1 = 0;
    public int ExtendableSavedState$1 = 0;
    public zzD setIconified = new zzD(this, zzD$MenuHostHelper$$ExternalSyntheticLambda0.LEFT);
    public zzD setChipSpacingVertical = new zzD(this, zzD$MenuHostHelper$$ExternalSyntheticLambda0.TOP);
    public zzD setShrinkMotionSpec = new zzD(this, zzD$MenuHostHelper$$ExternalSyntheticLambda0.RIGHT);
    public zzD setIconSize = new zzD(this, zzD$MenuHostHelper$$ExternalSyntheticLambda0.BOTTOM);
    public zzD ViewPager$SavedState$1 = new zzD(this, zzD$MenuHostHelper$$ExternalSyntheticLambda0.BASELINE);
    private zzD ActionMenuPresenter$SavedState$1 = new zzD(this, zzD$MenuHostHelper$$ExternalSyntheticLambda0.CENTER_X);
    private zzD setBackgroundTintMode = new zzD(this, zzD$MenuHostHelper$$ExternalSyntheticLambda0.CENTER_Y);

    /* loaded from: classes.dex */
    public enum setX {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public final void setZ() {
        zzD zzd = this.setIconified;
        zzd.setY = 0;
        zzd.setX = true;
        this.Fragment$5 = 0;
    }

    public final void setGuidelinePercent() {
        zzD zzd = this.setChipSpacingVertical;
        zzd.setY = 0;
        zzd.setX = true;
        this.setRevealInfo = 0;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2) {
        if (this.setAccessibilityTraversalAfter) {
            return;
        }
        zzD zzd = this.setIconified;
        zzd.setY = i;
        zzd.setX = true;
        zzD zzd2 = this.setShrinkMotionSpec;
        zzd2.setY = i2;
        zzd2.setX = true;
        this.Fragment$5 = i;
        this.setHint = i2 - i;
        this.setAccessibilityTraversalAfter = true;
    }

    public final void setX(int i, int i2) {
        if (this.setSearchResultHighlightColor) {
            return;
        }
        zzD zzd = this.setChipSpacingVertical;
        zzd.setY = i;
        zzd.setX = true;
        zzD zzd2 = this.setIconSize;
        zzd2.setY = i2;
        zzd2.setX = true;
        this.setRevealInfo = i;
        this.setTextScaleX = i2 - i;
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            zzD zzd3 = this.ViewPager$SavedState$1;
            zzd3.setY = i + this.setTextAlignment;
            zzd3.setX = true;
        }
        this.setSearchResultHighlightColor = true;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            int i2 = i - this.setTextAlignment;
            int i3 = this.setTextScaleX;
            this.setRevealInfo = i2;
            zzD zzd = this.setChipSpacingVertical;
            zzd.setY = i2;
            zzd.setX = true;
            zzD zzd2 = this.setIconSize;
            zzd2.setY = i3 + i2;
            zzd2.setX = true;
            zzD zzd3 = this.ViewPager$SavedState$1;
            zzd3.setY = i;
            zzd3.setX = true;
            this.setSearchResultHighlightColor = true;
        }
    }

    public boolean setX() {
        return this.setAccessibilityTraversalAfter || (this.setIconified.setX && this.setShrinkMotionSpec.setX);
    }

    public boolean setY() {
        return this.setSearchResultHighlightColor || (this.setChipSpacingVertical.setX && this.setIconSize.setX);
    }

    public final void setAnimationFromJson() {
        this.setAccessibilityTraversalAfter = false;
        this.setSearchResultHighlightColor = false;
        this.setUiOptions = false;
        this.setSubmitButtonEnabled = false;
        int size = this.setOnLongClickListener.size();
        for (int i = 0; i < size; i++) {
            zzD zzd = this.setOnLongClickListener.get(i);
            zzd.setX = false;
            zzd.setY = 0;
        }
    }

    public final boolean setX(int i) {
        if (i == 0) {
            return (this.setIconified.setLayoutAnimation != null ? 1 : 0) + (this.setShrinkMotionSpec.setLayoutAnimation != null ? 1 : 0) < 2;
        }
        return ((this.setChipSpacingVertical.setLayoutAnimation != null ? 1 : 0) + (this.setIconSize.setLayoutAnimation != null ? 1 : 0)) + (this.ViewPager$SavedState$1.setLayoutAnimation != null ? 1 : 0) < 2;
    }

    public final boolean setIconTintList(int i, int i2) {
        if (i == 0) {
            if (this.setIconified.setLayoutAnimation != null && this.setIconified.setLayoutAnimation.setX && this.setShrinkMotionSpec.setLayoutAnimation != null && this.setShrinkMotionSpec.setLayoutAnimation.setX) {
                zzD zzd = this.setShrinkMotionSpec.setLayoutAnimation;
                int i3 = !zzd.setX ? 0 : zzd.setY;
                int MenuHostHelper$$ExternalSyntheticLambda0 = this.setShrinkMotionSpec.MenuHostHelper$$ExternalSyntheticLambda0();
                zzD zzd2 = this.setIconified.setLayoutAnimation;
                return (i3 - MenuHostHelper$$ExternalSyntheticLambda0) - ((!zzd2.setX ? 0 : zzd2.setY) + this.setIconified.MenuHostHelper$$ExternalSyntheticLambda0()) >= i2;
            }
        } else if (this.setChipSpacingVertical.setLayoutAnimation != null && this.setChipSpacingVertical.setLayoutAnimation.setX && this.setIconSize.setLayoutAnimation != null && this.setIconSize.setLayoutAnimation.setX) {
            zzD zzd3 = this.setIconSize.setLayoutAnimation;
            int i4 = !zzd3.setX ? 0 : zzd3.setY;
            int MenuHostHelper$$ExternalSyntheticLambda02 = this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0();
            zzD zzd4 = this.setChipSpacingVertical.setLayoutAnimation;
            return (i4 - MenuHostHelper$$ExternalSyntheticLambda02) - ((!zzd4.setX ? 0 : zzd4.setY) + this.setChipSpacingVertical.MenuHostHelper$$ExternalSyntheticLambda0()) >= i2;
        }
        return false;
    }

    public void setMaxEms() {
        this.setIconified.MenuHostHelper$$ExternalSyntheticLambda1();
        this.setChipSpacingVertical.MenuHostHelper$$ExternalSyntheticLambda1();
        this.setShrinkMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1();
        this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda1();
        this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1();
        this.ActionMenuPresenter$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1();
        this.setBackgroundTintMode.MenuHostHelper$$ExternalSyntheticLambda1();
        this.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda1();
        this.RecyclerView$SavedState$1 = null;
        this.TextInputLayout$SavedState$1 = 0.0f;
        this.setHint = 0;
        this.setTextScaleX = 0;
        this.setZ = 0.0f;
        this.setMaxEms = -1;
        this.Fragment$5 = 0;
        this.setRevealInfo = 0;
        this.setChipTextResource = 0;
        this.setCalendarViewShown = 0;
        this.setTextAlignment = 0;
        this.setChipIconEnabled = 0;
        this.setSelectedChildViewEnabled = 0;
        this.setGuidelinePercent = 0.5f;
        this.setTitleMarginEnd = 0.5f;
        this.setHasDecor[0] = setX.FIXED;
        this.setHasDecor[1] = setX.FIXED;
        this.setAnimationFromJson = null;
        this.RemoteActionCompatParcelizer = 0;
        this.setFilterRedundantCalls = 0;
        this.setRippleColorResource = null;
        this.setRowOrderPreserved = false;
        this.setScrollY = false;
        this.setMinAndMaxProgress = 0;
        this.setError = 0;
        this.setEdgeEffectFactory = false;
        this.setSecondaryProgressTintMode = false;
        float[] fArr = this.setTooltipText;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.setTextAppearanceResource = -1;
        this.onActivityResumed = -1;
        int[] iArr = this.setSuffixText;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.setContentScrimResource = 0;
        this.FragmentStateAdapter$2 = 0;
        this.setFilterTouchesWhenObscured = 1.0f;
        this.setViewTranslationCallback = 1.0f;
        this.FragmentStateAdapter$5 = Integer.MAX_VALUE;
        this.FloatingActionButton$BaseBehavior = Integer.MAX_VALUE;
        this.setObjectValues = 0;
        this.setAdapter = 0;
        this.wrap = false;
        this.setSelectionFromTop = -1;
        this.setOnSeekBarChangeListener = 1.0f;
        this.setErrorIconTintList = false;
        boolean[] zArr = this.setLineBreakStyle;
        zArr[0] = true;
        zArr[1] = true;
        this.setCheckedIconEnabled = false;
        boolean[] zArr2 = this.setLayoutDirection;
        zArr2[0] = false;
        zArr2[1] = false;
        this.setImageTintMode = true;
        int[] iArr2 = this.FirebaseRemoteConfigKtxRegistrar;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.setSystemUiVisibility = -1;
        this.setMinEms = -1;
    }

    public final boolean ViewPager$SavedState$1() {
        return (this.setSystemUiVisibility == -1 && this.setMinEms == -1) ? false : true;
    }

    public setVisibility() {
        zzD zzd = new zzD(this, zzD$MenuHostHelper$$ExternalSyntheticLambda0.CENTER);
        this.setCenterIfNoTextEnabled = zzd;
        this.setChipIconTintResource = new zzD[]{this.setIconified, this.setShrinkMotionSpec, this.setChipSpacingVertical, this.setIconSize, this.ViewPager$SavedState$1, zzd};
        this.setOnLongClickListener = new ArrayList<>();
        this.setLayoutDirection = new boolean[2];
        this.setHasDecor = new setX[]{setX.FIXED, setX.FIXED};
        this.RecyclerView$SavedState$1 = null;
        this.setHint = 0;
        this.setTextScaleX = 0;
        this.setZ = 0.0f;
        this.setMaxEms = -1;
        this.Fragment$5 = 0;
        this.setRevealInfo = 0;
        this.m = 0;
        this.GridLayoutManager = 0;
        this.setChipTextResource = 0;
        this.setCalendarViewShown = 0;
        this.setTextAlignment = 0;
        this.setGuidelinePercent = 0.5f;
        this.setTitleMarginEnd = 0.5f;
        this.RemoteActionCompatParcelizer = 0;
        this.setFilterRedundantCalls = 0;
        this.setChipCornerRadius = false;
        this.setOnNavigationItemSelectedListener = null;
        this.setRippleColorResource = null;
        this.setErrorIconTintList = false;
        this.setMinAndMaxProgress = 0;
        this.setError = 0;
        this.setTooltipText = new float[]{-1.0f, -1.0f};
        this.setConstraintSet = new setVisibility[]{null, null};
        this.setFloatValues = new setVisibility[]{null, null};
        this.setCheckedIconEnabledResource = null;
        this.setSingleLine = null;
        this.setLayoutAnimation = -1;
        this.createDispatcher = -1;
        this.setOnLongClickListener.add(this.setIconified);
        this.setOnLongClickListener.add(this.setChipSpacingVertical);
        this.setOnLongClickListener.add(this.setShrinkMotionSpec);
        this.setOnLongClickListener.add(this.setIconSize);
        this.setOnLongClickListener.add(this.ActionMenuPresenter$SavedState$1);
        this.setOnLongClickListener.add(this.setBackgroundTintMode);
        this.setOnLongClickListener.add(this.setCenterIfNoTextEnabled);
        this.setOnLongClickListener.add(this.ViewPager$SavedState$1);
    }

    public final void setLayoutAnimation() {
        if (this.setNavigationOnClickListener == null) {
            this.setNavigationOnClickListener = new setExtractedText(this);
        }
        if (this.setNavigationIconTint == null) {
            this.setNavigationIconTint = new setIndeterminateTintBlendMode(this);
        }
    }

    public void setIconTintList(setCurrentTabByTag setcurrenttabbytag) {
        zzD zzd = this.setIconified;
        setBoxStrokeWidthResource setboxstrokewidthresource = zzd.setUiOptions;
        if (setboxstrokewidthresource == null) {
            zzd.setUiOptions = new setBoxStrokeWidthResource(setBoxStrokeWidthResource.setIconTintList.UNRESTRICTED);
        } else {
            setboxstrokewidthresource.setX();
        }
        zzD zzd2 = this.setChipSpacingVertical;
        setBoxStrokeWidthResource setboxstrokewidthresource2 = zzd2.setUiOptions;
        if (setboxstrokewidthresource2 == null) {
            zzd2.setUiOptions = new setBoxStrokeWidthResource(setBoxStrokeWidthResource.setIconTintList.UNRESTRICTED);
        } else {
            setboxstrokewidthresource2.setX();
        }
        zzD zzd3 = this.setShrinkMotionSpec;
        setBoxStrokeWidthResource setboxstrokewidthresource3 = zzd3.setUiOptions;
        if (setboxstrokewidthresource3 == null) {
            zzd3.setUiOptions = new setBoxStrokeWidthResource(setBoxStrokeWidthResource.setIconTintList.UNRESTRICTED);
        } else {
            setboxstrokewidthresource3.setX();
        }
        zzD zzd4 = this.setIconSize;
        setBoxStrokeWidthResource setboxstrokewidthresource4 = zzd4.setUiOptions;
        if (setboxstrokewidthresource4 == null) {
            zzd4.setUiOptions = new setBoxStrokeWidthResource(setBoxStrokeWidthResource.setIconTintList.UNRESTRICTED);
        } else {
            setboxstrokewidthresource4.setX();
        }
        zzD zzd5 = this.ViewPager$SavedState$1;
        setBoxStrokeWidthResource setboxstrokewidthresource5 = zzd5.setUiOptions;
        if (setboxstrokewidthresource5 == null) {
            zzd5.setUiOptions = new setBoxStrokeWidthResource(setBoxStrokeWidthResource.setIconTintList.UNRESTRICTED);
        } else {
            setboxstrokewidthresource5.setX();
        }
        zzD zzd6 = this.setCenterIfNoTextEnabled;
        setBoxStrokeWidthResource setboxstrokewidthresource6 = zzd6.setUiOptions;
        if (setboxstrokewidthresource6 == null) {
            zzd6.setUiOptions = new setBoxStrokeWidthResource(setBoxStrokeWidthResource.setIconTintList.UNRESTRICTED);
        } else {
            setboxstrokewidthresource6.setX();
        }
        zzD zzd7 = this.ActionMenuPresenter$SavedState$1;
        setBoxStrokeWidthResource setboxstrokewidthresource7 = zzd7.setUiOptions;
        if (setboxstrokewidthresource7 == null) {
            zzd7.setUiOptions = new setBoxStrokeWidthResource(setBoxStrokeWidthResource.setIconTintList.UNRESTRICTED);
        } else {
            setboxstrokewidthresource7.setX();
        }
        zzD zzd8 = this.setBackgroundTintMode;
        setBoxStrokeWidthResource setboxstrokewidthresource8 = zzd8.setUiOptions;
        if (setboxstrokewidthresource8 == null) {
            zzd8.setUiOptions = new setBoxStrokeWidthResource(setBoxStrokeWidthResource.setIconTintList.UNRESTRICTED);
        } else {
            setboxstrokewidthresource8.setX();
        }
    }

    public final void setX(setVisibility setvisibility, float f, int i) {
        MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.CENTER).MenuHostHelper$$ExternalSyntheticLambda0(setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.CENTER), i, 0, true);
        this.TextInputLayout$SavedState$1 = f;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(setWebContentsDebuggingEnabled setwebcontentsdebuggingenabled) {
        setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconified);
        setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setChipSpacingVertical);
        setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setShrinkMotionSpec);
        setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconSize);
        if (this.setTextAlignment > 0) {
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.ViewPager$SavedState$1);
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.setRippleColorResource != null) {
            StringBuilder sb2 = new StringBuilder("type: ");
            sb2.append(this.setRippleColorResource);
            sb2.append(" ");
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.setOnNavigationItemSelectedListener != null) {
            StringBuilder sb3 = new StringBuilder("id: ");
            sb3.append(this.setOnNavigationItemSelectedListener);
            sb3.append(" ");
            str2 = sb3.toString();
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.Fragment$5);
        sb.append(", ");
        sb.append(this.setRevealInfo);
        sb.append(") - (");
        sb.append(this.setHint);
        sb.append(" x ");
        sb.append(this.setTextScaleX);
        sb.append(")");
        return sb.toString();
    }

    public final int setCenterIfNoTextEnabled() {
        setVisibility setvisibility = this.RecyclerView$SavedState$1;
        if (setvisibility != null && (setvisibility instanceof setButtonTintBlendMode)) {
            return ((setButtonTintBlendMode) setvisibility).setBackgroundTintMode + this.Fragment$5;
        }
        return this.Fragment$5;
    }

    public final int setTextAlignment() {
        setVisibility setvisibility = this.RecyclerView$SavedState$1;
        if (setvisibility != null && (setvisibility instanceof setButtonTintBlendMode)) {
            return ((setButtonTintBlendMode) setvisibility).setEdgeEffectFactory + this.setRevealInfo;
        }
        return this.setRevealInfo;
    }

    public final int setUiOptions() {
        return this.setChipIconEnabled;
    }

    public final int c_() {
        return this.setSelectedChildViewEnabled;
    }

    public final int setIconSize() {
        return setCenterIfNoTextEnabled() + this.setHint;
    }

    public final int setOnLongClickListener() {
        return setTextAlignment() + this.setTextScaleX;
    }

    public final void setUiOptions(int i) {
        this.Fragment$5 = i;
    }

    public final void setLayoutAnimation(int i) {
        this.setRevealInfo = i;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
        this.Fragment$5 = i;
        this.setRevealInfo = i2;
    }

    public final void setNavigationOnClickListener(int i) {
        this.setHint = i;
        int i2 = this.setChipIconEnabled;
        if (i < i2) {
            this.setHint = i2;
        }
    }

    public final void setY(int i) {
        this.setTextScaleX = i;
        int i2 = this.setSelectedChildViewEnabled;
        if (i < i2) {
            this.setTextScaleX = i2;
        }
    }

    public final void setIconTintList(int i, int i2, int i3, float f) {
        this.setContentScrimResource = i;
        this.setObjectValues = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.FragmentStateAdapter$5 = i3;
        this.setFilterTouchesWhenObscured = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.setContentScrimResource = 2;
    }

    public final void setY(int i, int i2, int i3, float f) {
        this.FragmentStateAdapter$2 = i;
        this.setAdapter = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.FloatingActionButton$BaseBehavior = i3;
        this.setViewTranslationCallback = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.FragmentStateAdapter$2 = 2;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0082 -> B:38:0x0083). Please submit an issue!!! */
    public final void setIconTintList(String str) {
        float f;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.setZ = 0.0f;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i2 = -1;
        int i3 = 0;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            if (substring.equalsIgnoreCase("W")) {
                i2 = 0;
            } else if (substring.equalsIgnoreCase("H")) {
                i2 = 1;
            }
            i3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 >= 0 && indexOf2 < length - 1) {
            String substring2 = str.substring(i3, indexOf2);
            String substring3 = str.substring(indexOf2 + 1);
            if (substring2.length() > 0 && substring3.length() > 0) {
                float parseFloat = Float.parseFloat(substring2);
                float parseFloat2 = Float.parseFloat(substring3);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    if (i2 == 1) {
                        f = Math.abs(parseFloat2 / parseFloat);
                    } else {
                        f = Math.abs(parseFloat / parseFloat2);
                    }
                }
            }
            f = 0.0f;
        } else {
            String substring4 = str.substring(i3);
            if (substring4.length() > 0) {
                f = Float.parseFloat(substring4);
            }
            f = 0.0f;
        }
        i = (f > i ? 1 : (f == i ? 0 : -1));
        if (i > 0) {
            this.setZ = f;
            this.setMaxEms = i2;
        }
    }

    public final int b_() {
        return this.setMaxEms;
    }

    public final void setOnLongClickListener(int i) {
        if (i < 0) {
            this.setChipIconEnabled = 0;
        } else {
            this.setChipIconEnabled = i;
        }
    }

    public final void setUnboundedRipple(int i) {
        if (i < 0) {
            this.setSelectedChildViewEnabled = 0;
        } else {
            this.setSelectedChildViewEnabled = i;
        }
    }

    public final void setY(int i, int i2) {
        this.Fragment$5 = i;
        int i3 = i2 - i;
        this.setHint = i3;
        int i4 = this.setChipIconEnabled;
        if (i3 < i4) {
            this.setHint = i4;
        }
    }

    public final void setNavigationOnClickListener(int i, int i2) {
        this.setRevealInfo = i;
        int i3 = i2 - i;
        this.setTextScaleX = i3;
        int i4 = this.setSelectedChildViewEnabled;
        if (i3 < i4) {
            this.setTextScaleX = i4;
        }
    }

    public boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setFilterRedundantCalls != 8;
    }

    public final void setX(zzD$MenuHostHelper$$ExternalSyntheticLambda0 zzd_menuhosthelper__externalsyntheticlambda0, setVisibility setvisibility, zzD$MenuHostHelper$$ExternalSyntheticLambda0 zzd_menuhosthelper__externalsyntheticlambda02) {
        MenuHostHelper$$ExternalSyntheticLambda0(zzd_menuhosthelper__externalsyntheticlambda0, setvisibility, zzd_menuhosthelper__externalsyntheticlambda02, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        if ((r5.setLayoutAnimation != null) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        if ((r7.setLayoutAnimation != null) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
        if ((r8.setLayoutAnimation != null) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
        if ((r3.setLayoutAnimation != null) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void MenuHostHelper$$ExternalSyntheticLambda0(o.zzD$MenuHostHelper$$ExternalSyntheticLambda0 r5, o.setVisibility r6, o.zzD$MenuHostHelper$$ExternalSyntheticLambda0 r7, int r8) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setVisibility.MenuHostHelper$$ExternalSyntheticLambda0(o.zzD$MenuHostHelper$$ExternalSyntheticLambda0, o.setVisibility, o.zzD$MenuHostHelper$$ExternalSyntheticLambda0, int):void");
    }

    public zzD MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0 zzd_menuhosthelper__externalsyntheticlambda0) {
        switch (AnonymousClass4.setX[zzd_menuhosthelper__externalsyntheticlambda0.ordinal()]) {
            case 1:
                return this.setIconified;
            case 2:
                return this.setChipSpacingVertical;
            case 3:
                return this.setShrinkMotionSpec;
            case 4:
                return this.setIconSize;
            case 5:
                return this.ViewPager$SavedState$1;
            case 6:
                return this.setCenterIfNoTextEnabled;
            case 7:
                return this.ActionMenuPresenter$SavedState$1;
            case 8:
                return this.setBackgroundTintMode;
            case 9:
                return null;
            default:
                throw new AssertionError(zzd_menuhosthelper__externalsyntheticlambda0.name());
        }
    }

    public final boolean setChipCornerRadius() {
        if (this.setIconified.setLayoutAnimation == null || this.setIconified.setLayoutAnimation.setLayoutAnimation != this.setIconified) {
            return this.setShrinkMotionSpec.setLayoutAnimation != null && this.setShrinkMotionSpec.setLayoutAnimation.setLayoutAnimation == this.setShrinkMotionSpec;
        }
        return true;
    }

    public final setVisibility setIconTintList(int i) {
        if (i == 0) {
            if (this.setIconified.setLayoutAnimation != null) {
                zzD zzd = this.setIconified.setLayoutAnimation.setLayoutAnimation;
                zzD zzd2 = this.setIconified;
                if (zzd == zzd2) {
                    return zzd2.setLayoutAnimation.setIconTintList;
                }
                return null;
            }
            return null;
        } else if (i != 1 || this.setChipSpacingVertical.setLayoutAnimation == null) {
            return null;
        } else {
            zzD zzd3 = this.setChipSpacingVertical.setLayoutAnimation.setLayoutAnimation;
            zzD zzd4 = this.setChipSpacingVertical;
            if (zzd3 == zzd4) {
                return zzd4.setLayoutAnimation.setIconTintList;
            }
            return null;
        }
    }

    public final setVisibility MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        if (i == 0) {
            if (this.setShrinkMotionSpec.setLayoutAnimation != null) {
                zzD zzd = this.setShrinkMotionSpec.setLayoutAnimation.setLayoutAnimation;
                zzD zzd2 = this.setShrinkMotionSpec;
                if (zzd == zzd2) {
                    return zzd2.setLayoutAnimation.setIconTintList;
                }
                return null;
            }
            return null;
        } else if (i != 1 || this.setIconSize.setLayoutAnimation == null) {
            return null;
        } else {
            zzD zzd3 = this.setIconSize.setLayoutAnimation.setLayoutAnimation;
            zzD zzd4 = this.setIconSize;
            if (zzd3 == zzd4) {
                return zzd4.setLayoutAnimation.setIconTintList;
            }
            return null;
        }
    }

    public final boolean setTextScaleX() {
        if (this.setChipSpacingVertical.setLayoutAnimation == null || this.setChipSpacingVertical.setLayoutAnimation.setLayoutAnimation != this.setChipSpacingVertical) {
            return this.setIconSize.setLayoutAnimation != null && this.setIconSize.setLayoutAnimation.setLayoutAnimation == this.setIconSize;
        }
        return true;
    }

    private boolean setTextAlignment(int i) {
        int i2 = i << 1;
        if (this.setChipIconTintResource[i2].setLayoutAnimation != null) {
            zzD zzd = this.setChipIconTintResource[i2].setLayoutAnimation.setLayoutAnimation;
            zzD[] zzdArr = this.setChipIconTintResource;
            if (zzd != zzdArr[i2]) {
                int i3 = i2 + 1;
                if (zzdArr[i3].setLayoutAnimation != null && this.setChipIconTintResource[i3].setLayoutAnimation.setLayoutAnimation == this.setChipIconTintResource[i3]) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x017c, code lost:
        if (r2 > (!r3.setX ? 0 : r3.setY)) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01a9, code lost:
        if (r2 > (!r3.setX ? 0 : r3.setY)) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x03b4, code lost:
        if ((r50.setIconSize.setLayoutAnimation != null) == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x03d3, code lost:
        if ((r50.setShrinkMotionSpec.setLayoutAnimation != null) == false) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0406, code lost:
        if ((r50.setShrinkMotionSpec.setLayoutAnimation != null) == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e2, code lost:
        if (r3 > (!r8.setX ? 0 : r8.setY)) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x010f, code lost:
        if (r2 > (!r3.setX ? 0 : r3.setY)) goto L424;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x008c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setX(o.setWebContentsDebuggingEnabled r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 2148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setVisibility.setX(o.setWebContentsDebuggingEnabled, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x03f1, code lost:
        if ((r5 instanceof o.zzB) != false) goto L196;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x048d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:370:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setIconTintList(o.setWebContentsDebuggingEnabled r37, boolean r38, boolean r39, boolean r40, boolean r41, o.setBoxStrokeWidthResource r42, o.setBoxStrokeWidthResource r43, o.setVisibility.setX r44, boolean r45, o.zzD r46, o.zzD r47, int r48, int r49, int r50, int r51, float r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, int r58, int r59, int r60, int r61, float r62, boolean r63) {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setVisibility.setIconTintList(o.setWebContentsDebuggingEnabled, boolean, boolean, boolean, boolean, o.setBoxStrokeWidthResource, o.setBoxStrokeWidthResource, o.setVisibility$setX, boolean, o.zzD, o.zzD, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.setVisibility$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] setIconTintList;
        static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[setX.values().length];
            setIconTintList = iArr;
            try {
                iArr[setX.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                setIconTintList[setX.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                setIconTintList[setX.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                setIconTintList[setX.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[zzD$MenuHostHelper$$ExternalSyntheticLambda0.values().length];
            setX = iArr2;
            try {
                iArr2[zzD$MenuHostHelper$$ExternalSyntheticLambda0.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                setX[zzD$MenuHostHelper$$ExternalSyntheticLambda0.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                setX[zzD$MenuHostHelper$$ExternalSyntheticLambda0.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                setX[zzD$MenuHostHelper$$ExternalSyntheticLambda0.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                setX[zzD$MenuHostHelper$$ExternalSyntheticLambda0.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                setX[zzD$MenuHostHelper$$ExternalSyntheticLambda0.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                setX[zzD$MenuHostHelper$$ExternalSyntheticLambda0.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                setX[zzD$MenuHostHelper$$ExternalSyntheticLambda0.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                setX[zzD$MenuHostHelper$$ExternalSyntheticLambda0.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        int i;
        int i2;
        setIndeterminateTintBlendMode setindeterminatetintblendmode;
        setExtractedText setextractedtext;
        setBoxStrokeWidthResource setboxstrokewidthresource = this.setIconified.setUiOptions;
        int i3 = setboxstrokewidthresource != null ? (int) (setboxstrokewidthresource.setIconTintList + 0.5f) : 0;
        setBoxStrokeWidthResource setboxstrokewidthresource2 = this.setChipSpacingVertical.setUiOptions;
        int i4 = setboxstrokewidthresource2 != null ? (int) (setboxstrokewidthresource2.setIconTintList + 0.5f) : 0;
        setBoxStrokeWidthResource setboxstrokewidthresource3 = this.setShrinkMotionSpec.setUiOptions;
        int i5 = setboxstrokewidthresource3 != null ? (int) (setboxstrokewidthresource3.setIconTintList + 0.5f) : 0;
        setBoxStrokeWidthResource setboxstrokewidthresource4 = this.setIconSize.setUiOptions;
        int i6 = setboxstrokewidthresource4 != null ? (int) (setboxstrokewidthresource4.setIconTintList + 0.5f) : 0;
        if (z && (setextractedtext = this.setNavigationOnClickListener) != null && setextractedtext.setCenterIfNoTextEnabled.setOnLongClickListener && this.setNavigationOnClickListener.setIconTintList.setOnLongClickListener) {
            i3 = this.setNavigationOnClickListener.setCenterIfNoTextEnabled.setChipCornerRadius;
            i5 = this.setNavigationOnClickListener.setIconTintList.setChipCornerRadius;
        }
        if (z && (setindeterminatetintblendmode = this.setNavigationIconTint) != null && setindeterminatetintblendmode.setCenterIfNoTextEnabled.setOnLongClickListener && this.setNavigationIconTint.setIconTintList.setOnLongClickListener) {
            i4 = this.setNavigationIconTint.setCenterIfNoTextEnabled.setChipCornerRadius;
            i6 = this.setNavigationIconTint.setIconTintList.setChipCornerRadius;
        }
        if (i5 - i3 < 0 || i6 - i4 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i3 = 0;
            i6 = 0;
            i4 = 0;
            i5 = 0;
        }
        int i7 = i5 - i3;
        int i8 = i6 - i4;
        this.Fragment$5 = i3;
        this.setRevealInfo = i4;
        if (this.setFilterRedundantCalls == 8) {
            this.setHint = 0;
            this.setTextScaleX = 0;
            return;
        }
        if (this.setHasDecor[0] == setX.FIXED && i7 < (i2 = this.setHint)) {
            i7 = i2;
        }
        if (this.setHasDecor[1] == setX.FIXED && i8 < (i = this.setTextScaleX)) {
            i8 = i;
        }
        this.setHint = i7;
        this.setTextScaleX = i8;
        int i9 = this.setSelectedChildViewEnabled;
        if (i8 < i9) {
            this.setTextScaleX = i9;
        }
        int i10 = this.setChipIconEnabled;
        if (i7 < i10) {
            this.setHint = i10;
        }
        if (this.FragmentStateAdapter$5 > 0 && this.setHasDecor[0] == setX.MATCH_CONSTRAINT) {
            this.setHint = Math.min(this.setHint, this.FragmentStateAdapter$5);
        }
        if (this.FloatingActionButton$BaseBehavior > 0 && this.setHasDecor[1] == setX.MATCH_CONSTRAINT) {
            this.setTextScaleX = Math.min(this.setTextScaleX, this.FloatingActionButton$BaseBehavior);
        }
        int i11 = this.setHint;
        if (i7 != i11) {
            this.setSystemUiVisibility = i11;
        }
        int i12 = this.setTextScaleX;
        if (i8 != i12) {
            this.setMinEms = i12;
        }
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(setVisibility setvisibility, HashMap<setVisibility, setVisibility> hashMap) {
        this.setTextAppearanceResource = setvisibility.setTextAppearanceResource;
        this.onActivityResumed = setvisibility.onActivityResumed;
        this.setContentScrimResource = setvisibility.setContentScrimResource;
        this.FragmentStateAdapter$2 = setvisibility.FragmentStateAdapter$2;
        int[] iArr = this.FirebaseRemoteConfigKtxRegistrar;
        int[] iArr2 = setvisibility.FirebaseRemoteConfigKtxRegistrar;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.setObjectValues = setvisibility.setObjectValues;
        this.FragmentStateAdapter$5 = setvisibility.FragmentStateAdapter$5;
        this.setAdapter = setvisibility.setAdapter;
        this.FloatingActionButton$BaseBehavior = setvisibility.FloatingActionButton$BaseBehavior;
        this.setViewTranslationCallback = setvisibility.setViewTranslationCallback;
        this.setOnScrollChangeListener = setvisibility.setOnScrollChangeListener;
        this.setExpandedTitleTextColor = setvisibility.setExpandedTitleTextColor;
        this.setSelectionFromTop = setvisibility.setSelectionFromTop;
        this.setOnSeekBarChangeListener = setvisibility.setOnSeekBarChangeListener;
        int[] iArr3 = setvisibility.setSuffixText;
        this.setSuffixText = Arrays.copyOf(iArr3, iArr3.length);
        this.TextInputLayout$SavedState$1 = setvisibility.TextInputLayout$SavedState$1;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setvisibility.MenuHostHelper$$ExternalSyntheticLambda0;
        this.setUnboundedRipple = setvisibility.setUnboundedRipple;
        this.setIconified.MenuHostHelper$$ExternalSyntheticLambda1();
        this.setChipSpacingVertical.MenuHostHelper$$ExternalSyntheticLambda1();
        this.setShrinkMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1();
        this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda1();
        this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1();
        this.ActionMenuPresenter$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1();
        this.setBackgroundTintMode.MenuHostHelper$$ExternalSyntheticLambda1();
        this.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda1();
        this.setHasDecor = (setX[]) Arrays.copyOf(this.setHasDecor, 2);
        this.RecyclerView$SavedState$1 = this.RecyclerView$SavedState$1 == null ? null : hashMap.get(setvisibility.RecyclerView$SavedState$1);
        this.setHint = setvisibility.setHint;
        this.setTextScaleX = setvisibility.setTextScaleX;
        this.setZ = setvisibility.setZ;
        this.setMaxEms = setvisibility.setMaxEms;
        this.Fragment$5 = setvisibility.Fragment$5;
        this.setRevealInfo = setvisibility.setRevealInfo;
        this.m = setvisibility.m;
        this.GridLayoutManager = setvisibility.GridLayoutManager;
        this.setChipTextResource = setvisibility.setChipTextResource;
        this.setCalendarViewShown = setvisibility.setCalendarViewShown;
        this.setTextAlignment = setvisibility.setTextAlignment;
        this.setChipIconEnabled = setvisibility.setChipIconEnabled;
        this.setSelectedChildViewEnabled = setvisibility.setSelectedChildViewEnabled;
        this.setGuidelinePercent = setvisibility.setGuidelinePercent;
        this.setTitleMarginEnd = setvisibility.setTitleMarginEnd;
        this.setAnimationFromJson = setvisibility.setAnimationFromJson;
        this.RemoteActionCompatParcelizer = setvisibility.RemoteActionCompatParcelizer;
        this.setFilterRedundantCalls = setvisibility.setFilterRedundantCalls;
        this.setChipCornerRadius = setvisibility.setChipCornerRadius;
        this.setOnNavigationItemSelectedListener = setvisibility.setOnNavigationItemSelectedListener;
        this.setRippleColorResource = setvisibility.setRippleColorResource;
        this.setCallingWorkSourceUid = setvisibility.setCallingWorkSourceUid;
        this.setChipSpacingHorizontal = setvisibility.setChipSpacingHorizontal;
        this.minusKey = setvisibility.minusKey;
        this.setChipIconEnabledResource = setvisibility.setChipIconEnabledResource;
        this.setDelayedApplicationOfInitialState = setvisibility.setDelayedApplicationOfInitialState;
        this.setScrollX = setvisibility.setScrollX;
        this.setCheckableResource = setvisibility.setCheckableResource;
        this.setEmptyView = setvisibility.setEmptyView;
        this.setRowOrderPreserved = setvisibility.setRowOrderPreserved;
        this.setScrollY = setvisibility.setScrollY;
        this.setMinAndMaxProgress = setvisibility.setMinAndMaxProgress;
        this.setError = setvisibility.setError;
        this.setEdgeEffectFactory = setvisibility.setEdgeEffectFactory;
        this.setSecondaryProgressTintMode = setvisibility.setSecondaryProgressTintMode;
        float[] fArr = this.setTooltipText;
        float[] fArr2 = setvisibility.setTooltipText;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        setVisibility[] setvisibilityArr = this.setConstraintSet;
        setVisibility[] setvisibilityArr2 = setvisibility.setConstraintSet;
        setvisibilityArr[0] = setvisibilityArr2[0];
        setvisibilityArr[1] = setvisibilityArr2[1];
        setVisibility[] setvisibilityArr3 = this.setFloatValues;
        setVisibility[] setvisibilityArr4 = setvisibility.setFloatValues;
        setvisibilityArr3[0] = setvisibilityArr4[0];
        setvisibilityArr3[1] = setvisibilityArr4[1];
        setVisibility setvisibility2 = setvisibility.setCheckedIconEnabledResource;
        this.setCheckedIconEnabledResource = setvisibility2 == null ? null : hashMap.get(setvisibility2);
        setVisibility setvisibility3 = setvisibility.setSingleLine;
        this.setSingleLine = setvisibility3 != null ? hashMap.get(setvisibility3) : null;
    }

    public void setX(boolean z, boolean z2) {
        int i;
        int i2;
        boolean z3 = z & this.setNavigationOnClickListener.setNavigationOnClickListener;
        boolean z4 = z2 & this.setNavigationIconTint.setNavigationOnClickListener;
        int i3 = this.setNavigationOnClickListener.setCenterIfNoTextEnabled.setChipCornerRadius;
        int i4 = this.setNavigationIconTint.setCenterIfNoTextEnabled.setChipCornerRadius;
        int i5 = this.setNavigationOnClickListener.setIconTintList.setChipCornerRadius;
        int i6 = this.setNavigationIconTint.setIconTintList.setChipCornerRadius;
        if (i5 - i3 < 0 || i6 - i4 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        int i7 = i5 - i3;
        int i8 = i6 - i4;
        if (z3) {
            this.Fragment$5 = i3;
        }
        if (z4) {
            this.setRevealInfo = i4;
        }
        if (this.setFilterRedundantCalls == 8) {
            this.setHint = 0;
            this.setTextScaleX = 0;
            return;
        }
        if (z3) {
            if (this.setHasDecor[0] == setX.FIXED && i7 < (i2 = this.setHint)) {
                i7 = i2;
            }
            this.setHint = i7;
            int i9 = this.setChipIconEnabled;
            if (i7 < i9) {
                this.setHint = i9;
            }
        }
        if (z4) {
            if (this.setHasDecor[1] == setX.FIXED && i8 < (i = this.setTextScaleX)) {
                i8 = i;
            }
            this.setTextScaleX = i8;
            int i10 = this.setSelectedChildViewEnabled;
            if (i8 < i10) {
                this.setTextScaleX = i10;
            }
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(setButtonTintBlendMode setbuttontintblendmode, setWebContentsDebuggingEnabled setwebcontentsdebuggingenabled, HashSet<setVisibility> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            setFilterText.setX(setbuttontintblendmode, setwebcontentsdebuggingenabled, this);
            hashSet.remove(this);
            setX(setwebcontentsdebuggingenabled, (setbuttontintblendmode.setChipIconEnabledResource & 64) == 64);
        }
        if (i == 0) {
            HashSet<zzD> hashSet2 = this.setIconified.MenuHostHelper$$ExternalSyntheticLambda0;
            if (hashSet2 != null) {
                Iterator<zzD> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(setbuttontintblendmode, setwebcontentsdebuggingenabled, hashSet, i, true);
                }
            }
            HashSet<zzD> hashSet3 = this.setShrinkMotionSpec.MenuHostHelper$$ExternalSyntheticLambda0;
            if (hashSet3 != null) {
                Iterator<zzD> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(setbuttontintblendmode, setwebcontentsdebuggingenabled, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<zzD> hashSet4 = this.setChipSpacingVertical.MenuHostHelper$$ExternalSyntheticLambda0;
        if (hashSet4 != null) {
            Iterator<zzD> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(setbuttontintblendmode, setwebcontentsdebuggingenabled, hashSet, i, true);
            }
        }
        HashSet<zzD> hashSet5 = this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0;
        if (hashSet5 != null) {
            Iterator<zzD> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(setbuttontintblendmode, setwebcontentsdebuggingenabled, hashSet, i, true);
            }
        }
        HashSet<zzD> hashSet6 = this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0;
        if (hashSet6 != null) {
            Iterator<zzD> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(setbuttontintblendmode, setwebcontentsdebuggingenabled, hashSet, i, true);
            }
        }
    }

    public final void setOnNavigationItemSelectedListener() {
        setVisibility setvisibility = this.RecyclerView$SavedState$1;
        if (setvisibility != null && (setvisibility instanceof setButtonTintBlendMode)) {
            setButtonTintBlendMode setbuttontintblendmode = (setButtonTintBlendMode) setvisibility;
        }
        int size = this.setOnLongClickListener.size();
        for (int i = 0; i < size; i++) {
            this.setOnLongClickListener.get(i).MenuHostHelper$$ExternalSyntheticLambda1();
        }
        this.setTitleMarginEnd = 0.5f;
        this.setGuidelinePercent = 0.5f;
    }
}