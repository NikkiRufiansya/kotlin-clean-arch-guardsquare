package o;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import o.setAnimationFromJson;
import o.setBaselineAlignBottom;
import o.setCheckedIconEnabledResource;
import o.setChipIconEnabled;
import o.setMaxEms;

/* loaded from: classes.dex */
public final class setAdapter extends setMaxEms implements setCheckedIconEnabledResource.setY {
    private static final Interpolator setOnNavigationItemSelectedListener = new AccelerateInterpolator();
    private static final Interpolator setZ = new DecelerateInterpolator();
    private getPathName ExtendableSavedState$1;
    private Context FloatingActionButton$BaseBehavior;
    setAdapter$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0;
    Context MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean SearchView$SavedState$1;
    boolean ViewPager$SavedState$1;
    private boolean setCheckedIconEnabled;
    private setTransformationMethod setGuidelinePercent;
    setCheckedIconEnabledResource setIconSize;
    View setIconTintList;
    private boolean setIconified;
    setRowOrderPreserved setLayoutAnimation;
    private Activity setMaxEms;
    private boolean setMinAndMaxProgress;
    boolean setNavigationOnClickListener;
    setChipIconEnabled.setY setOnLongClickListener;
    boolean setTextAlignment;
    private boolean setTextAppearanceResource;
    getCallingPid setUiOptions;
    setChipIconEnabled setUnboundedRipple;
    setOnScrollChangeListener setY;
    private ArrayList<Object> FragmentStateAdapter$2 = new ArrayList<>();
    private int setHasDecor = -1;
    private ArrayList<setMaxEms.setX> setLayoutDirection = new ArrayList<>();
    private int setAnimationFromJson = 0;
    boolean setX = true;
    private boolean setChipIconTintResource = true;
    final setSelectAllOnFocus setChipCornerRadius = new setCloseIconStartPaddingResource() { // from class: o.setAdapter.3
        @Override // o.setCloseIconStartPaddingResource, o.setSelectAllOnFocus
        public final void MenuHostHelper$$ExternalSyntheticLambda0(View view) {
            if (setAdapter.this.setX && setAdapter.this.setIconTintList != null) {
                setAdapter.this.setIconTintList.setTranslationY(0.0f);
                setAdapter.this.setY.setTranslationY(0.0f);
            }
            setAdapter.this.setY.setVisibility(8);
            setAdapter.this.setY.setTransitioning(false);
            setAdapter.this.setUiOptions = null;
            setAdapter setadapter = setAdapter.this;
            setChipIconEnabled.setY sety = setadapter.setOnLongClickListener;
            if (sety != null) {
                sety.MenuHostHelper$$ExternalSyntheticLambda0(setadapter.setUnboundedRipple);
                setadapter.setUnboundedRipple = null;
                setadapter.setOnLongClickListener = null;
            }
            if (setAdapter.this.setIconSize != null) {
                setBaselineAlignBottom.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(setAdapter.this.setIconSize);
            }
        }
    };
    final setSelectAllOnFocus setCenterIfNoTextEnabled = new setCloseIconStartPaddingResource() { // from class: o.setAdapter.1
        @Override // o.setCloseIconStartPaddingResource, o.setSelectAllOnFocus
        public final void MenuHostHelper$$ExternalSyntheticLambda0(View view) {
            setAdapter.this.setUiOptions = null;
            setAdapter.this.setY.requestLayout();
        }
    };
    final setPerformanceTrackingEnabled setTextScaleX = new setPerformanceTrackingEnabled() { // from class: o.setAdapter.5
        @Override // o.setPerformanceTrackingEnabled
        public final void setX() {
            ((View) setAdapter.this.setY.getParent()).invalidate();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setIconTintList(boolean z, boolean z2, boolean z3) {
        return (z || z2) ? false : true;
    }

    public setAdapter(Activity activity, boolean z) {
        this.setMaxEms = activity;
        View decorView = activity.getWindow().getDecorView();
        MenuHostHelper$$ExternalSyntheticLambda1(decorView);
        if (z) {
            return;
        }
        this.setIconTintList = decorView.findViewById(16908290);
    }

    public setAdapter(Dialog dialog) {
        MenuHostHelper$$ExternalSyntheticLambda1(dialog.getWindow().getDecorView());
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(View view) {
        setCheckedIconEnabledResource setcheckediconenabledresource = (setCheckedIconEnabledResource) view.findViewById(R.id.res_0x7f0a009d);
        this.setIconSize = setcheckediconenabledresource;
        if (setcheckediconenabledresource != null) {
            setcheckediconenabledresource.setActionBarVisibilityCallback(this);
        }
        this.setGuidelinePercent = MenuHostHelper$$ExternalSyntheticLambda0(view.findViewById(R.id.res_0x7f0a0033));
        this.setLayoutAnimation = (setRowOrderPreserved) view.findViewById(R.id.res_0x7f0a003b);
        setOnScrollChangeListener setonscrollchangelistener = (setOnScrollChangeListener) view.findViewById(R.id.res_0x7f0a0035);
        this.setY = setonscrollchangelistener;
        setTransformationMethod settransformationmethod = this.setGuidelinePercent;
        if (settransformationmethod == null || this.setLayoutAnimation == null || setonscrollchangelistener == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used with a compatible window decor layout");
            throw new IllegalStateException(sb.toString());
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = settransformationmethod.MenuHostHelper$$ExternalSyntheticLambda0();
        if ((this.setGuidelinePercent.setX() & 4) != 0) {
            this.setCheckedIconEnabled = true;
        }
        setImageTintMode MenuHostHelper$$ExternalSyntheticLambda0 = setImageTintMode.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1);
        MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList();
        setLayoutAnimation(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1());
        TypedArray obtainStyledAttributes = this.MenuHostHelper$$ExternalSyntheticLambda1.obtainStyledAttributes(null, setAnimationFromJson.setY.setIconTintList, R.attr.res_0x7f040007, 0);
        if (obtainStyledAttributes.getBoolean(setAnimationFromJson.setY.setChipCornerRadius, false)) {
            setOnLongClickListener();
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(setAnimationFromJson.setY.setCenterIfNoTextEnabled, 0);
        if (dimensionPixelSize != 0) {
            setX(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private static setTransformationMethod MenuHostHelper$$ExternalSyntheticLambda0(View view) {
        if (view instanceof setTransformationMethod) {
            return (setTransformationMethod) view;
        }
        if (view instanceof setTranscriptMode) {
            return ((setTranscriptMode) view).setNavigationOnClickListener();
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    @Override // o.setMaxEms
    public final void setX(float f) {
        setBaselineAlignBottom.setUnboundedRipple.setIconTintList(this.setY, f);
    }

    @Override // o.setMaxEms
    public final void setY(Configuration configuration) {
        setLayoutAnimation(setImageTintMode.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1).MenuHostHelper$$ExternalSyntheticLambda1());
    }

    private void setLayoutAnimation(boolean z) {
        this.setMinAndMaxProgress = z;
        if (!z) {
            this.setGuidelinePercent.setX((getPathName) null);
            this.setY.setTabContainer(this.ExtendableSavedState$1);
        } else {
            this.setY.setTabContainer(null);
            this.setGuidelinePercent.setX(this.ExtendableSavedState$1);
        }
        boolean z2 = true;
        boolean z3 = ViewPager$SavedState$1() == 2;
        this.setGuidelinePercent.MenuHostHelper$$ExternalSyntheticLambda1(!this.setMinAndMaxProgress && z3);
        this.setIconSize.setHasNonEmbeddedTabs((this.setMinAndMaxProgress || !z3) ? false : false);
    }

    @Override // o.setCheckedIconEnabledResource.setY
    public final void setX(int i) {
        this.setAnimationFromJson = i;
    }

    @Override // o.setMaxEms
    public final void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        getCallingPid getcallingpid;
        this.setIconified = z;
        if (z || (getcallingpid = this.setUiOptions) == null) {
            return;
        }
        getcallingpid.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // o.setMaxEms
    public final void setX(boolean z) {
        if (z == this.setTextAppearanceResource) {
            return;
        }
        this.setTextAppearanceResource = z;
        int size = this.setLayoutDirection.size();
        for (int i = 0; i < size; i++) {
            this.setLayoutDirection.get(i);
        }
    }

    private void setUnboundedRipple(boolean z) {
        setY(z ? 4 : 0);
    }

    @Override // o.setMaxEms
    public final void setIconTintList(CharSequence charSequence) {
        this.setGuidelinePercent.MenuHostHelper$$ExternalSyntheticLambda1(charSequence);
    }

    private void setY(int i) {
        int x = this.setGuidelinePercent.setX();
        this.setCheckedIconEnabled = true;
        this.setGuidelinePercent.setIconTintList((i & 4) | (x & (-5)));
    }

    private int ViewPager$SavedState$1() {
        return this.setGuidelinePercent.setNavigationOnClickListener();
    }

    @Override // o.setMaxEms
    public final int setY() {
        return this.setGuidelinePercent.setX();
    }

    @Override // o.setMaxEms
    public final setChipIconEnabled setX(setChipIconEnabled.setY sety) {
        setAdapter$MenuHostHelper$$ExternalSyntheticLambda1 setadapter_menuhosthelper__externalsyntheticlambda1 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setadapter_menuhosthelper__externalsyntheticlambda1 != null) {
            setadapter_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1();
        }
        this.setIconSize.setHideOnContentScrollEnabled(false);
        this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1();
        setAdapter$MenuHostHelper$$ExternalSyntheticLambda1 setadapter_menuhosthelper__externalsyntheticlambda12 = new setAdapter$MenuHostHelper$$ExternalSyntheticLambda1(this, this.setLayoutAnimation.getContext(), sety);
        if (setadapter_menuhosthelper__externalsyntheticlambda12.setIconTintList()) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setadapter_menuhosthelper__externalsyntheticlambda12;
            setadapter_menuhosthelper__externalsyntheticlambda12.setUiOptions();
            this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1(setadapter_menuhosthelper__externalsyntheticlambda12);
            setIconTintList(true);
            return setadapter_menuhosthelper__externalsyntheticlambda12;
        }
        return null;
    }

    @Override // o.setCheckedIconEnabledResource.setY
    public final void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        this.setX = z;
    }

    @Override // o.setCheckedIconEnabledResource.setY
    public final void setCenterIfNoTextEnabled() {
        if (this.setTextAlignment) {
            this.setTextAlignment = false;
            setOnLongClickListener(true);
        }
    }

    @Override // o.setMaxEms
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.setNavigationOnClickListener) {
            return;
        }
        this.setNavigationOnClickListener = true;
        setOnLongClickListener(false);
    }

    @Override // o.setCheckedIconEnabledResource.setY
    public final void setUiOptions() {
        if (this.setTextAlignment) {
            return;
        }
        this.setTextAlignment = true;
        setOnLongClickListener(true);
    }

    @Override // o.setMaxEms
    public final void setOnLongClickListener() {
        if (!this.setIconSize.setX) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.ViewPager$SavedState$1 = true;
        this.setIconSize.setHideOnContentScrollEnabled(true);
    }

    private void setOnLongClickListener(boolean z) {
        View view;
        int[] iArr;
        View view2;
        View view3;
        int[] iArr2;
        if (this.SearchView$SavedState$1 || !(this.setNavigationOnClickListener || this.setTextAlignment)) {
            if (this.setChipIconTintResource) {
                return;
            }
            this.setChipIconTintResource = true;
            getCallingPid getcallingpid = this.setUiOptions;
            if (getcallingpid != null) {
                getcallingpid.MenuHostHelper$$ExternalSyntheticLambda0();
            }
            this.setY.setVisibility(0);
            if (this.setAnimationFromJson == 0 && (this.setIconified || z)) {
                this.setY.setTranslationY(0.0f);
                float f = -this.setY.getHeight();
                if (z) {
                    this.setY.getLocationInWindow(new int[]{0, 0});
                    f -= iArr2[1];
                }
                this.setY.setTranslationY(f);
                getCallingPid getcallingpid2 = new getCallingPid();
                setHeaderDividersEnabled MenuHostHelper$$ExternalSyntheticLambda0 = setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda1(this.setY).MenuHostHelper$$ExternalSyntheticLambda0(0.0f);
                MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(this.setTextScaleX);
                getcallingpid2.setX(MenuHostHelper$$ExternalSyntheticLambda0);
                if (this.setX && (view3 = this.setIconTintList) != null) {
                    view3.setTranslationY(f);
                    getcallingpid2.setX(setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList).MenuHostHelper$$ExternalSyntheticLambda0(0.0f));
                }
                getcallingpid2.setIconTintList(setZ);
                getcallingpid2.setIconTintList(250L);
                getcallingpid2.setY(this.setCenterIfNoTextEnabled);
                this.setUiOptions = getcallingpid2;
                getcallingpid2.setX();
            } else {
                this.setY.setAlpha(1.0f);
                this.setY.setTranslationY(0.0f);
                if (this.setX && (view2 = this.setIconTintList) != null) {
                    view2.setTranslationY(0.0f);
                }
                this.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0(null);
            }
            setCheckedIconEnabledResource setcheckediconenabledresource = this.setIconSize;
            if (setcheckediconenabledresource != null) {
                setBaselineAlignBottom.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(setcheckediconenabledresource);
            }
        } else if (this.setChipIconTintResource) {
            this.setChipIconTintResource = false;
            getCallingPid getcallingpid3 = this.setUiOptions;
            if (getcallingpid3 != null) {
                getcallingpid3.MenuHostHelper$$ExternalSyntheticLambda0();
            }
            if (this.setAnimationFromJson == 0 && (this.setIconified || z)) {
                this.setY.setAlpha(1.0f);
                this.setY.setTransitioning(true);
                getCallingPid getcallingpid4 = new getCallingPid();
                float f2 = -this.setY.getHeight();
                if (z) {
                    this.setY.getLocationInWindow(new int[]{0, 0});
                    f2 -= iArr[1];
                }
                setHeaderDividersEnabled MenuHostHelper$$ExternalSyntheticLambda02 = setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda1(this.setY).MenuHostHelper$$ExternalSyntheticLambda0(f2);
                MenuHostHelper$$ExternalSyntheticLambda02.setIconTintList(this.setTextScaleX);
                getcallingpid4.setX(MenuHostHelper$$ExternalSyntheticLambda02);
                if (this.setX && (view = this.setIconTintList) != null) {
                    getcallingpid4.setX(setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda1(view).MenuHostHelper$$ExternalSyntheticLambda0(f2));
                }
                getcallingpid4.setIconTintList(setOnNavigationItemSelectedListener);
                getcallingpid4.setIconTintList(250L);
                getcallingpid4.setY(this.setChipCornerRadius);
                this.setUiOptions = getcallingpid4;
                getcallingpid4.setX();
                return;
            }
            this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0(null);
        }
    }

    @Override // o.setMaxEms
    public final Context setIconTintList() {
        if (this.FloatingActionButton$BaseBehavior == null) {
            TypedValue typedValue = new TypedValue();
            this.MenuHostHelper$$ExternalSyntheticLambda1.getTheme().resolveAttribute(R.attr.res_0x7f04000c, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.FloatingActionButton$BaseBehavior = new ContextThemeWrapper(this.MenuHostHelper$$ExternalSyntheticLambda1, i);
            } else {
                this.FloatingActionButton$BaseBehavior = this.MenuHostHelper$$ExternalSyntheticLambda1;
            }
        }
        return this.FloatingActionButton$BaseBehavior;
    }

    @Override // o.setCheckedIconEnabledResource.setY
    public final void setIconSize() {
        getCallingPid getcallingpid = this.setUiOptions;
        if (getcallingpid != null) {
            getcallingpid.MenuHostHelper$$ExternalSyntheticLambda0();
            this.setUiOptions = null;
        }
    }

    @Override // o.setMaxEms
    public final boolean setX() {
        setTransformationMethod settransformationmethod = this.setGuidelinePercent;
        if (settransformationmethod == null || !settransformationmethod.setUiOptions()) {
            return false;
        }
        this.setGuidelinePercent.MenuHostHelper$$ExternalSyntheticLambda1();
        return true;
    }

    @Override // o.setMaxEms
    public final void setY(boolean z) {
        if (this.setCheckedIconEnabled) {
            return;
        }
        setUnboundedRipple(z);
    }

    @Override // o.setMaxEms
    public final boolean setY(int i, KeyEvent keyEvent) {
        setNavigationIconTint setnavigationicontint;
        setAdapter$MenuHostHelper$$ExternalSyntheticLambda1 setadapter_menuhosthelper__externalsyntheticlambda1 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setadapter_menuhosthelper__externalsyntheticlambda1 == null || (setnavigationicontint = setadapter_menuhosthelper__externalsyntheticlambda1.setY) == null) {
            return false;
        }
        setnavigationicontint.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return setnavigationicontint.performShortcut(i, keyEvent, 0);
    }

    public final void setIconTintList(boolean z) {
        setHeaderDividersEnabled iconTintList;
        setHeaderDividersEnabled x;
        if (z) {
            if (!this.SearchView$SavedState$1) {
                this.SearchView$SavedState$1 = true;
                setCheckedIconEnabledResource setcheckediconenabledresource = this.setIconSize;
                if (setcheckediconenabledresource != null) {
                    setcheckediconenabledresource.setShowingForActionMode(true);
                }
                setOnLongClickListener(false);
            }
        } else if (this.SearchView$SavedState$1) {
            this.SearchView$SavedState$1 = false;
            setCheckedIconEnabledResource setcheckediconenabledresource2 = this.setIconSize;
            if (setcheckediconenabledresource2 != null) {
                setcheckediconenabledresource2.setShowingForActionMode(false);
            }
            setOnLongClickListener(false);
        }
        if (!setBaselineAlignBottom.setConstraintSet(this.setY)) {
            if (z) {
                this.setGuidelinePercent.MenuHostHelper$$ExternalSyntheticLambda1(4);
                this.setLayoutAnimation.setVisibility(0);
                return;
            }
            this.setGuidelinePercent.MenuHostHelper$$ExternalSyntheticLambda1(0);
            this.setLayoutAnimation.setVisibility(8);
            return;
        }
        if (z) {
            x = this.setGuidelinePercent.setIconTintList(4, 100L);
            iconTintList = this.setLayoutAnimation.setX(0, 200L);
        } else {
            iconTintList = this.setGuidelinePercent.setIconTintList(0, 200L);
            x = this.setLayoutAnimation.setX(8, 100L);
        }
        getCallingPid getcallingpid = new getCallingPid();
        getcallingpid.setY(x, iconTintList);
        getcallingpid.setX();
    }
}