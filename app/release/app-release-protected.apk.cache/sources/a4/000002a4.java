package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.setExpandedTitleMargin;
import o.setMIndicatorOptions;
import o.setTextLocale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 {
    public String setX;
    private static final int[] setUiOptions = {0, 4, 8};
    private static SparseIntArray setNavigationOnClickListener = new SparseIntArray();
    private static SparseIntArray setOnLongClickListener = new SparseIntArray();
    public String MenuHostHelper$$ExternalSyntheticLambda0 = "";
    public int setIconTintList = 0;
    private HashMap<String, setActiveIndicatorDrawable> setLayoutAnimation = new HashMap<>();
    public boolean MenuHostHelper$$ExternalSyntheticLambda1 = true;
    public HashMap<Integer, setX> setY = new HashMap<>();

    static {
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setTabIconTintResource, 25);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setSecondaryProgress, 26);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.FirebasePerfKtxRegistrar, 29);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setOnSearchClickListener, 30);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setImageIcon, 36);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.onContextItemSelected, 35);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.zzb, 4);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setQueryHint, 3);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setFilterText, 1);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setForceApplySystemWindowInsetTop, 91);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setSoundEffectsEnabled, 92);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setDivider, 6);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setLayerType, 7);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setItemTextAppearanceActive, 17);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setActionBarHideOffset, 18);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setRootAlpha, 19);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setVisibility, 99);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.joinThreadPool, 27);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setLayoutMode, 32);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.wait, 33);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setLastBaselineToBottomHeight, 10);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setThumb, 9);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setKeepScreenOn, 13);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.AndroidExceptionPreHandler, 16);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setOnRatingBarChangeListener, 14);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setMultiChoiceModeListener, 11);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setCardBackgroundColor, 15);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setOnItemSelectedListener, 12);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setTypeface, 40);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setOnGroupExpandListener, 39);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setLinksClickable, 41);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setIconStartPadding, 42);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setStretchMode, 20);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setScrollbarFadingEnabled, 37);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setIndicatorBoundsRelative, 5);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setSupportButtonTintList, 87);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.FabTransformationScrimBehavior, 87);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setExtendMotionSpec, 87);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setCompoundDrawablesWithIntrinsicBounds, 87);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.write, 87);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setCompatHoveredFocusedTranslationZ, 24);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setWebContentsDebuggingEnabled, 28);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setCompatElevation, 31);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setHapticFeedbackEnabled, 8);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setUnboundedRippleResource, 34);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setCurrentTabByTag, 2);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setBoxStrokeWidthResource, 23);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setRootWindowInsets, 21);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.BottomSheetBehavior$SavedState$1, 95);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setIndeterminateTintBlendMode, 96);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setRating, 22);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.onAppEnteredBackground, 43);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.getLoadPriority, 44);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setFlexWrap, 45);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setOnCheckedChangeListener, 46);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setType, 60);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.clone, 47);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.SearchView, 48);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setChipStrokeWidthResource, 49);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.ActivityResult$1, 50);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setItemRippleColor, 51);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.NavigationBarView$SavedState$1, 52);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setChipStrokeColor, 53);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.FirebaseApp, 54);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setExtractedText, 55);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setStatusBarScrimColor, 56);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setFreezesText, 57);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setAllowClickWhenDisabled, 58);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.loadReflectionField, 59);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setShowingForActionMode, 61);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.zza, 62);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.getPropertyName, 63);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setHintEnabled, 64);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.onActivityPaused, 65);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setButtonTintBlendMode, 66);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setRight, 67);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setMIndicatorOptions, 79);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setDividerHeight, 38);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.AbsSavedState$2, 68);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setSubtitle, 69);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setErrorAccessibilityLabel, 70);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setActiveIndicatorDrawable, 97);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable, 71);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setColorFilter, 72);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.zzC, 73);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.SwipeDismissBehavior, 74);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.zzB, 75);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setAttachListener, 76);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setErrorTextAppearance, 77);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setExpandedTitleMargin, 78);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setFabAlignmentModeAndReplaceMenu, 80);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.zzD, 81);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setCloseIconSizeResource, 82);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setForegroundTintBlendMode, 83);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, 84);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setTextLocale, 85);
        setNavigationOnClickListener.append(setExpandedTitleMargin.setY.setEndIconMode, 86);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setCompatPressedTranslationZ, 6);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setCompatPressedTranslationZ, 7);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setSelectionFromTop, 27);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setShadowPaddingEnabled, 13);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setTabMode, 16);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setTranscriptMode, 14);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setSelectedTabIndicatorGravity, 11);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.AppBarLayout$ScrollingViewBehavior, 15);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.transact, 12);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setPresenter, 40);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.onActivityPostResumed, 39);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setTextDirection, 41);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setScrollCaptureCallback, 42);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setSupportImageTintMode, 20);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setTitle, 37);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setStrokeColorResource, 5);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setTabRippleColor, 87);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.getPathName, 87);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setAccessibilityTraversalBefore, 87);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.getView, 87);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setAllowedHandwritingDelegatorPackage, 87);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setCalendarViewShown, 24);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.m, 28);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setRippleColorResource, 31);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setChipTextResource, 8);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setCheckableResource, 34);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setOnSeekBarChangeListener, 2);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setScrollX, 23);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.GridLayoutManager, 21);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setAlpha, 95);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setTransformationMethod, 96);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setOutlineAmbientShadowColor, 22);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setOnScrollChangeListener, 43);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setRowOrderPreserved, 44);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setScrollY, 45);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setAccessibilityTraversalAfter, 46);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.wrap, 60);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setSingleLine, 47);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setSecondaryProgressTintMode, 48);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setSystemUiVisibility, 49);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setIndeterminateTintList, 50);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setForceShowIcon, 51);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setSearchResultHighlightColor, 52);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setUserInputEnabled, 53);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setStripEnabled, 54);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setCheckedIconTint, 55);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setExpandedHintEnabled, 56);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setCheckMarkDrawable, 57);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setHelperTextEnabled, 58);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.ExpandableBehavior, 59);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setEndIconTintList, 62);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.StaggeredGridLayoutManager$SavedState$1, 63);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setClipBounds, 64);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setIndeterminateDrawableTiled, 65);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setTabContainer, 66);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setCounterEnabled, 67);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.getSystemGestureInsets, 79);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setExpandedTitleTextColor, 38);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.NestedScrollView$SavedState$1, 98);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setCheckedColor, 68);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setGuidelineBegin, 69);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setHoverListener, 70);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setOnGroupClickListener, 71);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setFocusableInTouchMode, 72);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setPasswordVisibilityToggleContentDescription, 73);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.getStableInsets, 74);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setExpandedActionViewsExclusive, 75);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setFillAlpha, 76);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.onActivityPreStopped, 77);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setScrimVisibleHeightTrigger, 78);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setSelectedTabIndicator, 80);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setInsetBottom, 81);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setMenuCallbacks, 82);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.BackStackState$1, 83);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setStartIconVisible, 84);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.notifyAll, 85);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setChipMinHeightResource, 86);
        setOnLongClickListener.append(setExpandedTitleMargin.setY.setImageAssetDelegate, 97);
    }

    public final void setX(WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
        for (Integer num : withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY.keySet()) {
            int intValue = num.intValue();
            setX setx = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY.get(num);
            if (!this.setY.containsKey(Integer.valueOf(intValue))) {
                this.setY.put(Integer.valueOf(intValue), new setX());
            }
            setX setx2 = this.setY.get(Integer.valueOf(intValue));
            if (setx2 != null) {
                if (!setx2.setY.setViewTranslationCallback) {
                    setx2.setY.setIconTintList(setx.setY);
                }
                if (!setx2.setLayoutAnimation.setX) {
                    setx2.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0(setx.setLayoutAnimation);
                }
                if (!setx2.setOnLongClickListener.setX) {
                    setx2.setOnLongClickListener.setX(setx.setOnLongClickListener);
                }
                if (!setx2.setUiOptions.setIconTintList) {
                    setx2.setUiOptions.setY(setx.setUiOptions);
                }
                for (String str : setx.MenuHostHelper$$ExternalSyntheticLambda0.keySet()) {
                    if (!setx2.MenuHostHelper$$ExternalSyntheticLambda0.containsKey(str)) {
                        setx2.MenuHostHelper$$ExternalSyntheticLambda0.put(str, setx.MenuHostHelper$$ExternalSyntheticLambda0.get(str));
                    }
                }
            }
        }
    }

    public final void setX(setMIndicatorOptions setmindicatoroptions) {
        int childCount = setmindicatoroptions.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = setmindicatoroptions.getChildAt(i);
            setMIndicatorOptions.setIconTintList seticontintlist = (setMIndicatorOptions.setIconTintList) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.setY.containsKey(Integer.valueOf(id))) {
                this.setY.put(Integer.valueOf(id), new setX());
            }
            setX setx = this.setY.get(Integer.valueOf(id));
            if (setx != null) {
                if (!setx.setY.setViewTranslationCallback) {
                    setx.MenuHostHelper$$ExternalSyntheticLambda0(id, seticontintlist);
                    if (childAt instanceof setCardBackgroundColor) {
                        setx.setY.setTitleMarginEnd = ((setCardBackgroundColor) childAt).MenuHostHelper$$ExternalSyntheticLambda1();
                        if (childAt instanceof AndroidExceptionPreHandler) {
                            AndroidExceptionPreHandler androidExceptionPreHandler = (AndroidExceptionPreHandler) childAt;
                            setx.setY.setSelectedChildViewEnabled = androidExceptionPreHandler.setX.setIconTintList;
                            setx.setY.setImageTintMode = androidExceptionPreHandler.setY;
                            setx.setY.setChipIconEnabled = androidExceptionPreHandler.setX.setX;
                        }
                    }
                    setx.setY.setViewTranslationCallback = true;
                }
                if (!setx.setLayoutAnimation.setX) {
                    setx.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0 = childAt.getVisibility();
                    setx.setLayoutAnimation.setY = childAt.getAlpha();
                    setx.setLayoutAnimation.setX = true;
                }
                if (!setx.setOnLongClickListener.setX) {
                    setx.setOnLongClickListener.setX = true;
                    setx.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1 = childAt.getRotation();
                    setx.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0 = childAt.getRotationX();
                    setx.setOnLongClickListener.setOnLongClickListener = childAt.getRotationY();
                    setx.setOnLongClickListener.setLayoutAnimation = childAt.getScaleX();
                    setx.setOnLongClickListener.setUiOptions = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        setx.setOnLongClickListener.setUnboundedRipple = pivotX;
                        setx.setOnLongClickListener.setTextAlignment = pivotY;
                    }
                    setx.setOnLongClickListener.ViewPager$SavedState$1 = childAt.getTranslationX();
                    setx.setOnLongClickListener.setIconSize = childAt.getTranslationY();
                    setx.setOnLongClickListener.setCenterIfNoTextEnabled = childAt.getTranslationZ();
                    if (setx.setOnLongClickListener.setY) {
                        setx.setOnLongClickListener.setIconTintList = childAt.getElevation();
                    }
                }
            }
        }
    }

    public final void setY(WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
        for (setX setx : withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY.values()) {
            if (setx.setX != null) {
                if (setx.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                    for (Integer num : this.setY.keySet()) {
                        int intValue = num.intValue();
                        setX setx2 = this.setY.containsKey(Integer.valueOf(intValue)) ? this.setY.get(Integer.valueOf(intValue)) : null;
                        if (setx2.setY.RecyclerView$SavedState$1 != null && setx.MenuHostHelper$$ExternalSyntheticLambda1.matches(setx2.setY.RecyclerView$SavedState$1)) {
                            setx.setX.setIconTintList(setx2);
                            setx2.MenuHostHelper$$ExternalSyntheticLambda0.putAll((HashMap) setx.MenuHostHelper$$ExternalSyntheticLambda0.clone());
                        }
                    }
                } else {
                    int i = setx.setIconTintList;
                    setx.setX.setIconTintList(this.setY.containsKey(Integer.valueOf(i)) ? this.setY.get(Integer.valueOf(i)) : null);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void MenuHostHelper$$ExternalSyntheticLambda0(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L3
            return
        L3:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L6b
            r1 = 5
            r2 = -2
            r3 = 0
            if (r0 == r1) goto L24
            int r5 = r5.getInt(r6, r3)
            r6 = -4
            if (r5 == r6) goto L22
            r6 = -3
            if (r5 == r6) goto L20
            if (r5 == r2) goto L28
            r6 = -1
            if (r5 == r6) goto L28
        L20:
            r2 = 0
            goto L29
        L22:
            r3 = 1
            goto L29
        L24:
            int r5 = r5.getDimensionPixelSize(r6, r3)
        L28:
            r2 = r5
        L29:
            boolean r5 = r4 instanceof o.setMIndicatorOptions.setIconTintList
            if (r5 == 0) goto L3b
            o.setMIndicatorOptions$setIconTintList r4 = (o.setMIndicatorOptions.setIconTintList) r4
            if (r7 != 0) goto L36
            r4.width = r2
            r4.setTextAlignment = r3
            return
        L36:
            r4.height = r2
            r4.setOnLongClickListener = r3
            return
        L3b:
            boolean r5 = r4 instanceof o.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setIconTintList
            if (r5 == 0) goto L4d
            o.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setIconTintList r4 = (o.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setIconTintList) r4
            if (r7 != 0) goto L48
            r4.setShrinkMotionSpec = r2
            r4.setTextAlignment = r3
            return
        L48:
            r4.setFloatValues = r2
            r4.ViewPager$SavedState$1 = r3
            return
        L4d:
            boolean r5 = r4 instanceof o.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1
            if (r5 == 0) goto L6a
            o.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1 r4 = (o.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1) r4
            if (r7 != 0) goto L60
            r5 = 23
            r4.MenuHostHelper$$ExternalSyntheticLambda1(r5, r2)
            r5 = 80
            r4.MenuHostHelper$$ExternalSyntheticLambda1(r5, r3)
            return
        L60:
            r5 = 21
            r4.MenuHostHelper$$ExternalSyntheticLambda1(r5, r2)
            r5 = 81
            r4.MenuHostHelper$$ExternalSyntheticLambda1(r5, r3)
        L6a:
            return
        L6b:
            java.lang.String r5 = r5.getString(r6)
            setX(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda0(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(setMIndicatorOptions.setIconTintList seticontintlist, String str) {
        int i = -1;
        float f = Float.NaN;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i = 1;
                }
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i2, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i == 1) {
                                f = Math.abs(parseFloat2 / parseFloat);
                                i = 1;
                            } else {
                                f = Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = str.substring(i2);
                    if (substring4.length() > 0) {
                        f = Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        seticontintlist.setChipCornerRadius = str;
        seticontintlist.setIconSize = f;
        seticontintlist.setCenterIfNoTextEnabled = i;
    }

    private static void setX(Object obj, String str, int i) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        if (substring2.length() > 0) {
            String trim = substring.trim();
            String trim2 = substring2.trim();
            if ("ratio".equalsIgnoreCase(trim)) {
                if (obj instanceof setMIndicatorOptions.setIconTintList) {
                    setMIndicatorOptions.setIconTintList seticontintlist = (setMIndicatorOptions.setIconTintList) obj;
                    if (i == 0) {
                        ((ViewGroup.LayoutParams) seticontintlist).width = 0;
                    } else {
                        ((ViewGroup.LayoutParams) seticontintlist).height = 0;
                    }
                    MenuHostHelper$$ExternalSyntheticLambda0(seticontintlist, trim2);
                    return;
                } else if (obj instanceof setIconTintList) {
                    ((setIconTintList) obj).setChipCornerRadius = trim2;
                    return;
                } else if (obj instanceof WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1) {
                    ((WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1) obj).setY(5, trim2);
                    return;
                } else {
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(trim)) {
                    float parseFloat = Float.parseFloat(trim2);
                    if (obj instanceof setMIndicatorOptions.setIconTintList) {
                        setMIndicatorOptions.setIconTintList seticontintlist2 = (setMIndicatorOptions.setIconTintList) obj;
                        if (i == 0) {
                            ((ViewGroup.LayoutParams) seticontintlist2).width = 0;
                            seticontintlist2.FragmentStateAdapter$5 = parseFloat;
                            return;
                        }
                        ((ViewGroup.LayoutParams) seticontintlist2).height = 0;
                        seticontintlist2.RemoteActionCompatParcelizer = parseFloat;
                    } else if (obj instanceof setIconTintList) {
                        setIconTintList seticontintlist3 = (setIconTintList) obj;
                        if (i == 0) {
                            seticontintlist3.setShrinkMotionSpec = 0;
                            seticontintlist3.setSuffixText = parseFloat;
                            return;
                        }
                        seticontintlist3.setFloatValues = 0;
                        seticontintlist3.ActionMenuPresenter$SavedState$1 = parseFloat;
                    } else if (obj instanceof WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1) {
                        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1 = (WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1) obj;
                        if (i == 0) {
                            withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(23, 0);
                            withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(39, parseFloat);
                            return;
                        }
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(21, 0);
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(40, parseFloat);
                    }
                } else if ("parent".equalsIgnoreCase(trim)) {
                    float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                    if (obj instanceof setMIndicatorOptions.setIconTintList) {
                        setMIndicatorOptions.setIconTintList seticontintlist4 = (setMIndicatorOptions.setIconTintList) obj;
                        if (i == 0) {
                            ((ViewGroup.LayoutParams) seticontintlist4).width = 0;
                            seticontintlist4.setTitleMarginEnd = max;
                            seticontintlist4.setFloatValues = 2;
                            return;
                        }
                        ((ViewGroup.LayoutParams) seticontintlist4).height = 0;
                        seticontintlist4.setChipSpacingVertical = max;
                        seticontintlist4.setImageTintMode = 2;
                    } else if (obj instanceof setIconTintList) {
                        setIconTintList seticontintlist5 = (setIconTintList) obj;
                        if (i == 0) {
                            seticontintlist5.setShrinkMotionSpec = 0;
                            seticontintlist5.RemoteActionCompatParcelizer = max;
                            seticontintlist5.setSubmitButtonEnabled = 2;
                            return;
                        }
                        seticontintlist5.setFloatValues = 0;
                        seticontintlist5.FragmentStateAdapter$2 = max;
                        seticontintlist5.setChipIconTintResource = 2;
                    } else if (obj instanceof WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1) {
                        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda12 = (WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1) obj;
                        if (i == 0) {
                            withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda1(23, 0);
                            withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda1(54, 2);
                            return;
                        }
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda1(21, 0);
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda1(55, 2);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class setIconTintList {
        private static SparseIntArray setBackgroundTintMode;
        public String FirebaseRemoteConfigKtxRegistrar;
        public String RecyclerView$SavedState$1;
        public int setFloatValues;
        public int setShrinkMotionSpec;
        public int[] setTitleMarginEnd;
        public boolean setChipSpacingVertical = false;
        public boolean setViewTranslationCallback = false;
        private boolean setChipSpacingHorizontal = false;
        public int setHasDecor = -1;
        public int setIconified = -1;
        public float SearchView$SavedState$1 = -1.0f;
        public boolean ExtendableSavedState$1 = true;
        public int setFilterTouchesWhenObscured = -1;
        public int setObjectValues = -1;
        public int getCallingPid = -1;
        public int setTooltipText = -1;
        public int setLineBreakStyle = -1;
        public int Fragment$5 = -1;
        public int setUnboundedRipple = -1;
        public int setUiOptions = -1;
        public int setY = -1;
        public int MenuHostHelper$$ExternalSyntheticLambda0 = -1;
        public int setIconTintList = -1;
        public int setCloseIconEndPadding = -1;
        public int FabTransformationBehavior = -1;
        public int setZ = -1;
        public int setAnimationFromJson = -1;
        public float FragmentStateAdapter$5 = 0.5f;
        public float setNavigationIconTint = 0.5f;
        public String setChipCornerRadius = null;
        public int setNavigationOnClickListener = -1;
        public int setLayoutAnimation = 0;
        public float setOnLongClickListener = 0.0f;
        public int setCenterIfNoTextEnabled = -1;
        public int setIconSize = -1;
        public int setFilterRedundantCalls = -1;
        public int setAdapter = 0;
        public int onActivityResumed = 0;
        public int setRevealInfo = 0;
        public int MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        public int setTextScaleX = 0;
        public int createDispatcher = 0;
        public int setX = 0;
        public int setGuidelinePercent = Integer.MIN_VALUE;
        public int setTextAppearanceResource = Integer.MIN_VALUE;
        public int setMinAndMaxProgress = Integer.MIN_VALUE;
        public int setMaxEms = Integer.MIN_VALUE;
        public int setLayoutDirection = Integer.MIN_VALUE;
        public int setCheckedIconEnabled = Integer.MIN_VALUE;
        public int setOnNavigationItemSelectedListener = Integer.MIN_VALUE;
        public float ActionMenuPresenter$SavedState$1 = -1.0f;
        public float setSuffixText = -1.0f;
        public int setConstraintSet = 0;
        public int setEmptyView = 0;
        public int setSubmitButtonEnabled = 0;
        public int setChipIconTintResource = 0;
        public int TextInputLayout$SavedState$1 = 0;
        public int FloatingActionButton$BaseBehavior = 0;
        public int setChipIconEnabledResource = 0;
        public int setContentScrimResource = 0;
        public float RemoteActionCompatParcelizer = 1.0f;
        public float FragmentStateAdapter$2 = 1.0f;
        public int setImageTintMode = -1;
        public int setChipIconEnabled = 0;
        public int setError = -1;
        public boolean setTextAlignment = false;
        public boolean ViewPager$SavedState$1 = false;
        public boolean setSelectedChildViewEnabled = true;
        public int setHint = 0;

        public final void setIconTintList(setIconTintList seticontintlist) {
            this.setChipSpacingVertical = seticontintlist.setChipSpacingVertical;
            this.setShrinkMotionSpec = seticontintlist.setShrinkMotionSpec;
            this.setViewTranslationCallback = seticontintlist.setViewTranslationCallback;
            this.setFloatValues = seticontintlist.setFloatValues;
            this.setHasDecor = seticontintlist.setHasDecor;
            this.setIconified = seticontintlist.setIconified;
            this.SearchView$SavedState$1 = seticontintlist.SearchView$SavedState$1;
            this.ExtendableSavedState$1 = seticontintlist.ExtendableSavedState$1;
            this.setFilterTouchesWhenObscured = seticontintlist.setFilterTouchesWhenObscured;
            this.setObjectValues = seticontintlist.setObjectValues;
            this.getCallingPid = seticontintlist.getCallingPid;
            this.setTooltipText = seticontintlist.setTooltipText;
            this.setLineBreakStyle = seticontintlist.setLineBreakStyle;
            this.Fragment$5 = seticontintlist.Fragment$5;
            this.setUnboundedRipple = seticontintlist.setUnboundedRipple;
            this.setUiOptions = seticontintlist.setUiOptions;
            this.setY = seticontintlist.setY;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0;
            this.setIconTintList = seticontintlist.setIconTintList;
            this.setCloseIconEndPadding = seticontintlist.setCloseIconEndPadding;
            this.FabTransformationBehavior = seticontintlist.FabTransformationBehavior;
            this.setZ = seticontintlist.setZ;
            this.setAnimationFromJson = seticontintlist.setAnimationFromJson;
            this.FragmentStateAdapter$5 = seticontintlist.FragmentStateAdapter$5;
            this.setNavigationIconTint = seticontintlist.setNavigationIconTint;
            this.setChipCornerRadius = seticontintlist.setChipCornerRadius;
            this.setNavigationOnClickListener = seticontintlist.setNavigationOnClickListener;
            this.setLayoutAnimation = seticontintlist.setLayoutAnimation;
            this.setOnLongClickListener = seticontintlist.setOnLongClickListener;
            this.setCenterIfNoTextEnabled = seticontintlist.setCenterIfNoTextEnabled;
            this.setIconSize = seticontintlist.setIconSize;
            this.setFilterRedundantCalls = seticontintlist.setFilterRedundantCalls;
            this.setAdapter = seticontintlist.setAdapter;
            this.onActivityResumed = seticontintlist.onActivityResumed;
            this.setRevealInfo = seticontintlist.setRevealInfo;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1;
            this.setTextScaleX = seticontintlist.setTextScaleX;
            this.createDispatcher = seticontintlist.createDispatcher;
            this.setX = seticontintlist.setX;
            this.setGuidelinePercent = seticontintlist.setGuidelinePercent;
            this.setTextAppearanceResource = seticontintlist.setTextAppearanceResource;
            this.setMinAndMaxProgress = seticontintlist.setMinAndMaxProgress;
            this.setMaxEms = seticontintlist.setMaxEms;
            this.setLayoutDirection = seticontintlist.setLayoutDirection;
            this.setCheckedIconEnabled = seticontintlist.setCheckedIconEnabled;
            this.setOnNavigationItemSelectedListener = seticontintlist.setOnNavigationItemSelectedListener;
            this.ActionMenuPresenter$SavedState$1 = seticontintlist.ActionMenuPresenter$SavedState$1;
            this.setSuffixText = seticontintlist.setSuffixText;
            this.setConstraintSet = seticontintlist.setConstraintSet;
            this.setEmptyView = seticontintlist.setEmptyView;
            this.setSubmitButtonEnabled = seticontintlist.setSubmitButtonEnabled;
            this.setChipIconTintResource = seticontintlist.setChipIconTintResource;
            this.TextInputLayout$SavedState$1 = seticontintlist.TextInputLayout$SavedState$1;
            this.FloatingActionButton$BaseBehavior = seticontintlist.FloatingActionButton$BaseBehavior;
            this.setChipIconEnabledResource = seticontintlist.setChipIconEnabledResource;
            this.setContentScrimResource = seticontintlist.setContentScrimResource;
            this.RemoteActionCompatParcelizer = seticontintlist.RemoteActionCompatParcelizer;
            this.FragmentStateAdapter$2 = seticontintlist.FragmentStateAdapter$2;
            this.setImageTintMode = seticontintlist.setImageTintMode;
            this.setChipIconEnabled = seticontintlist.setChipIconEnabled;
            this.setError = seticontintlist.setError;
            this.RecyclerView$SavedState$1 = seticontintlist.RecyclerView$SavedState$1;
            int[] iArr = seticontintlist.setTitleMarginEnd;
            if (iArr != null && seticontintlist.FirebaseRemoteConfigKtxRegistrar == null) {
                this.setTitleMarginEnd = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.setTitleMarginEnd = null;
            }
            this.FirebaseRemoteConfigKtxRegistrar = seticontintlist.FirebaseRemoteConfigKtxRegistrar;
            this.setTextAlignment = seticontintlist.setTextAlignment;
            this.ViewPager$SavedState$1 = seticontintlist.ViewPager$SavedState$1;
            this.setSelectedChildViewEnabled = seticontintlist.setSelectedChildViewEnabled;
            this.setHint = seticontintlist.setHint;
        }

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            setBackgroundTintMode = sparseIntArray;
            sparseIntArray.append(setExpandedTitleMargin.setY.setForegroundTintList, 24);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setRecyclerListener, 25);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setInterpolator, 28);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, 29);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setSupportCompoundDrawablesTintList, 35);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.FirebaseCommonLegacyRegistrar, 34);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setOverflowReserved, 4);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setTextIsSelectable, 3);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.readObject, 1);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setGravity, 6);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setImageAlpha, 7);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.getCallingUserHandle, 17);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setProgress, 18);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setItemHorizontalTranslationEnabled, 19);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setPerformanceTrackingEnabled, 90);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setChipIconResource, 26);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.ParcelableSparseArray$1, 31);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setAutoLinkMask, 32);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setPasswordVisibilityToggleEnabled, 10);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.ProcessLifecycleInitializer, 9);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setMeasureWithLargestChildEnabled, 13);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setOnTabSelectedListener, 16);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setElegantTextHeight, 14);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setSecondaryProgressTintBlendMode, 11);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setPasswordVisibilityToggleDrawable, 15);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setIndeterminate, 12);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setDescendantFocusability, 38);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setHorizontalScrollbarTrackDrawable, 37);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setRightEdgeEffectColor, 39);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setRowCount, 40);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setVelocityScale, 20);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setScrollingCacheEnabled, 36);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setHyphenationFrequency, 5);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setOnKeyListener, 91);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setOrientation, 91);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setPreferKeepClearRects, 91);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setCompoundDrawablesRelativeWithIntrinsicBounds, 91);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setShowDividers, 91);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setBaselineAlignBottom, 23);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setItemsCanFocus, 27);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setCurrentTab, 30);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setVerticalScrollbarThumbDrawable, 8);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setCloseIconStartPaddingResource, 33);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setTabIndicatorAnimationMode, 2);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setHeaderDividersEnabled, 22);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setQuery, 21);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setTextAppearanceInactive, 41);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setCheckedIconGravity, 42);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setDecorPadding, 41);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setCloseIconEnabledResource, 42);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setTickMarkTintMode, 76);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setVerticalScrollbarTrackDrawable, 61);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setSupportButtonTintMode, 62);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setLayoutAnimationListener, 63);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setDropDownWidth, 69);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setSupportCheckMarkTintList, 70);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setRotation, 71);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setCircleRadius, 72);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setCloseIconResource, 73);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.FirebasePerfRegistrar, 74);
            setBackgroundTintMode.append(setExpandedTitleMargin.setY.setSelectAllOnFocus, 75);
        }

        final void MenuHostHelper$$ExternalSyntheticLambda0(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setExpandedTitleMargin.setY.handleException);
            this.setViewTranslationCallback = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = setBackgroundTintMode.get(index);
                switch (i2) {
                    case 1:
                        this.setY = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, index, this.setY);
                        break;
                    case 2:
                        this.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getDimensionPixelSize(index, this.MenuHostHelper$$ExternalSyntheticLambda1);
                        break;
                    case 3:
                        this.setUiOptions = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, index, this.setUiOptions);
                        break;
                    case 4:
                        this.setUnboundedRipple = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, index, this.setUnboundedRipple);
                        break;
                    case 5:
                        this.setChipCornerRadius = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.setCenterIfNoTextEnabled = obtainStyledAttributes.getDimensionPixelOffset(index, this.setCenterIfNoTextEnabled);
                        break;
                    case 7:
                        this.setIconSize = obtainStyledAttributes.getDimensionPixelOffset(index, this.setIconSize);
                        break;
                    case 8:
                        this.setTextScaleX = obtainStyledAttributes.getDimensionPixelSize(index, this.setTextScaleX);
                        break;
                    case 9:
                        this.setAnimationFromJson = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, index, this.setAnimationFromJson);
                        break;
                    case 10:
                        this.setZ = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, index, this.setZ);
                        break;
                    case 11:
                        this.setMaxEms = obtainStyledAttributes.getDimensionPixelSize(index, this.setMaxEms);
                        break;
                    case 12:
                        this.setLayoutDirection = obtainStyledAttributes.getDimensionPixelSize(index, this.setLayoutDirection);
                        break;
                    case 13:
                        this.setGuidelinePercent = obtainStyledAttributes.getDimensionPixelSize(index, this.setGuidelinePercent);
                        break;
                    case 14:
                        this.setMinAndMaxProgress = obtainStyledAttributes.getDimensionPixelSize(index, this.setMinAndMaxProgress);
                        break;
                    case 15:
                        this.setCheckedIconEnabled = obtainStyledAttributes.getDimensionPixelSize(index, this.setCheckedIconEnabled);
                        break;
                    case 16:
                        this.setTextAppearanceResource = obtainStyledAttributes.getDimensionPixelSize(index, this.setTextAppearanceResource);
                        break;
                    case 17:
                        this.setHasDecor = obtainStyledAttributes.getDimensionPixelOffset(index, this.setHasDecor);
                        break;
                    case 18:
                        this.setIconified = obtainStyledAttributes.getDimensionPixelOffset(index, this.setIconified);
                        break;
                    case 19:
                        this.SearchView$SavedState$1 = obtainStyledAttributes.getFloat(index, this.SearchView$SavedState$1);
                        break;
                    case 20:
                        this.FragmentStateAdapter$5 = obtainStyledAttributes.getFloat(index, this.FragmentStateAdapter$5);
                        break;
                    case 21:
                        this.setFloatValues = obtainStyledAttributes.getLayoutDimension(index, this.setFloatValues);
                        break;
                    case 22:
                        this.setShrinkMotionSpec = obtainStyledAttributes.getLayoutDimension(index, this.setShrinkMotionSpec);
                        break;
                    case 23:
                        this.setAdapter = obtainStyledAttributes.getDimensionPixelSize(index, this.setAdapter);
                        break;
                    case 24:
                        this.setFilterTouchesWhenObscured = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, index, this.setFilterTouchesWhenObscured);
                        break;
                    case 25:
                        this.setObjectValues = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, index, this.setObjectValues);
                        break;
                    case 26:
                        this.setFilterRedundantCalls = obtainStyledAttributes.getInt(index, this.setFilterRedundantCalls);
                        break;
                    case 27:
                        this.onActivityResumed = obtainStyledAttributes.getDimensionPixelSize(index, this.onActivityResumed);
                        break;
                    case 28:
                        this.getCallingPid = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, index, this.getCallingPid);
                        break;
                    case 29:
                        this.setTooltipText = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, index, this.setTooltipText);
                        break;
                    case 30:
                        this.createDispatcher = obtainStyledAttributes.getDimensionPixelSize(index, this.createDispatcher);
                        break;
                    case 31:
                        this.setCloseIconEndPadding = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, index, this.setCloseIconEndPadding);
                        break;
                    case 32:
                        this.FabTransformationBehavior = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, index, this.FabTransformationBehavior);
                        break;
                    case 33:
                        this.setRevealInfo = obtainStyledAttributes.getDimensionPixelSize(index, this.setRevealInfo);
                        break;
                    case 34:
                        this.Fragment$5 = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, index, this.Fragment$5);
                        break;
                    case 35:
                        this.setLineBreakStyle = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, index, this.setLineBreakStyle);
                        break;
                    case setExpandedTitleMargin.setY.setChipCornerRadius /* 36 */:
                        this.setNavigationIconTint = obtainStyledAttributes.getFloat(index, this.setNavigationIconTint);
                        break;
                    case 37:
                        this.setSuffixText = obtainStyledAttributes.getFloat(index, this.setSuffixText);
                        break;
                    case setExpandedTitleMargin.setY.setSupportCheckMarkTintList /* 38 */:
                        this.ActionMenuPresenter$SavedState$1 = obtainStyledAttributes.getFloat(index, this.ActionMenuPresenter$SavedState$1);
                        break;
                    case setExpandedTitleMargin.setY.setVelocityScale /* 39 */:
                        this.setConstraintSet = obtainStyledAttributes.getInt(index, this.setConstraintSet);
                        break;
                    case setExpandedTitleMargin.setY.setRightEdgeEffectColor /* 40 */:
                        this.setEmptyView = obtainStyledAttributes.getInt(index, this.setEmptyView);
                        break;
                    case setExpandedTitleMargin.setY.setHorizontalScrollbarTrackDrawable /* 41 */:
                        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda0(this, obtainStyledAttributes, index, 0);
                        break;
                    case setExpandedTitleMargin.setY.setOnKeyListener /* 42 */:
                        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda0(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.setNavigationOnClickListener = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, index, this.setNavigationOnClickListener);
                                continue;
                            case 62:
                                this.setLayoutAnimation = obtainStyledAttributes.getDimensionPixelSize(index, this.setLayoutAnimation);
                                continue;
                            case 63:
                                this.setOnLongClickListener = obtainStyledAttributes.getFloat(index, this.setOnLongClickListener);
                                continue;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.RemoteActionCompatParcelizer = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                        continue;
                                    case 70:
                                        this.FragmentStateAdapter$2 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.setImageTintMode = obtainStyledAttributes.getInt(index, this.setImageTintMode);
                                        continue;
                                    case 73:
                                        this.setChipIconEnabled = obtainStyledAttributes.getDimensionPixelSize(index, this.setChipIconEnabled);
                                        continue;
                                    case 74:
                                        this.FirebaseRemoteConfigKtxRegistrar = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.setSelectedChildViewEnabled = obtainStyledAttributes.getBoolean(index, this.setSelectedChildViewEnabled);
                                        continue;
                                    case 76:
                                        this.setHint = obtainStyledAttributes.getInt(index, this.setHint);
                                        continue;
                                    case 77:
                                        this.MenuHostHelper$$ExternalSyntheticLambda0 = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, index, this.MenuHostHelper$$ExternalSyntheticLambda0);
                                        continue;
                                    case 78:
                                        this.setIconTintList = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, index, this.setIconTintList);
                                        continue;
                                    case 79:
                                        this.setOnNavigationItemSelectedListener = obtainStyledAttributes.getDimensionPixelSize(index, this.setOnNavigationItemSelectedListener);
                                        continue;
                                    case 80:
                                        this.setX = obtainStyledAttributes.getDimensionPixelSize(index, this.setX);
                                        continue;
                                    case 81:
                                        this.setSubmitButtonEnabled = obtainStyledAttributes.getInt(index, this.setSubmitButtonEnabled);
                                        continue;
                                    case 82:
                                        this.setChipIconTintResource = obtainStyledAttributes.getInt(index, this.setChipIconTintResource);
                                        continue;
                                    case 83:
                                        this.FloatingActionButton$BaseBehavior = obtainStyledAttributes.getDimensionPixelSize(index, this.FloatingActionButton$BaseBehavior);
                                        continue;
                                    case 84:
                                        this.TextInputLayout$SavedState$1 = obtainStyledAttributes.getDimensionPixelSize(index, this.TextInputLayout$SavedState$1);
                                        continue;
                                    case 85:
                                        this.setContentScrimResource = obtainStyledAttributes.getDimensionPixelSize(index, this.setContentScrimResource);
                                        continue;
                                    case 86:
                                        this.setChipIconEnabledResource = obtainStyledAttributes.getDimensionPixelSize(index, this.setChipIconEnabledResource);
                                        continue;
                                    case 87:
                                        this.setTextAlignment = obtainStyledAttributes.getBoolean(index, this.setTextAlignment);
                                        continue;
                                    case 88:
                                        this.ViewPager$SavedState$1 = obtainStyledAttributes.getBoolean(index, this.ViewPager$SavedState$1);
                                        continue;
                                    case 89:
                                        this.RecyclerView$SavedState$1 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.ExtendableSavedState$1 = obtainStyledAttributes.getBoolean(index, this.ExtendableSavedState$1);
                                        continue;
                                    case 91:
                                        StringBuilder sb = new StringBuilder("unused attribute 0x");
                                        sb.append(Integer.toHexString(index));
                                        sb.append("   ");
                                        sb.append(setBackgroundTintMode.get(index));
                                        Log.w("ConstraintSet", sb.toString());
                                        continue;
                                    default:
                                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                                        sb2.append(Integer.toHexString(index));
                                        sb2.append("   ");
                                        sb2.append(setBackgroundTintMode.get(index));
                                        Log.w("ConstraintSet", sb2.toString());
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class setY {
        private static SparseIntArray setChipCornerRadius;
        public boolean setX = false;
        public float MenuHostHelper$$ExternalSyntheticLambda1 = 0.0f;
        public float MenuHostHelper$$ExternalSyntheticLambda0 = 0.0f;
        public float setOnLongClickListener = 0.0f;
        public float setLayoutAnimation = 1.0f;
        public float setUiOptions = 1.0f;
        public float setUnboundedRipple = Float.NaN;
        public float setTextAlignment = Float.NaN;
        public int setNavigationOnClickListener = -1;
        public float ViewPager$SavedState$1 = 0.0f;
        public float setIconSize = 0.0f;
        public float setCenterIfNoTextEnabled = 0.0f;
        public boolean setY = false;
        public float setIconTintList = 0.0f;

        public final void setX(setY sety) {
            this.setX = sety.setX;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = sety.MenuHostHelper$$ExternalSyntheticLambda1;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = sety.MenuHostHelper$$ExternalSyntheticLambda0;
            this.setOnLongClickListener = sety.setOnLongClickListener;
            this.setLayoutAnimation = sety.setLayoutAnimation;
            this.setUiOptions = sety.setUiOptions;
            this.setUnboundedRipple = sety.setUnboundedRipple;
            this.setTextAlignment = sety.setTextAlignment;
            this.setNavigationOnClickListener = sety.setNavigationOnClickListener;
            this.ViewPager$SavedState$1 = sety.ViewPager$SavedState$1;
            this.setIconSize = sety.setIconSize;
            this.setCenterIfNoTextEnabled = sety.setCenterIfNoTextEnabled;
            this.setY = sety.setY;
            this.setIconTintList = sety.setIconTintList;
        }

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            setChipCornerRadius = sparseIntArray;
            sparseIntArray.append(setExpandedTitleMargin.setY.setFillColor, 1);
            setChipCornerRadius.append(setExpandedTitleMargin.setY.setSafeMode, 2);
            setChipCornerRadius.append(setExpandedTitleMargin.setY.setChipDrawable, 3);
            setChipCornerRadius.append(setExpandedTitleMargin.setY.setDefaultFocusHighlightEnabled, 4);
            setChipCornerRadius.append(setExpandedTitleMargin.setY.setStartIconOnLongClickListener, 5);
            setChipCornerRadius.append(setExpandedTitleMargin.setY.setHasTransientState, 6);
            setChipCornerRadius.append(setExpandedTitleMargin.setY.setText, 7);
            setChipCornerRadius.append(setExpandedTitleMargin.setY.setDrawingCacheQuality, 8);
            setChipCornerRadius.append(setExpandedTitleMargin.setY.setCounterOverflowTextAppearance, 9);
            setChipCornerRadius.append(setExpandedTitleMargin.setY.setTextOff, 10);
            setChipCornerRadius.append(setExpandedTitleMargin.setY.setActiveIndicatorMarginHorizontal, 11);
            setChipCornerRadius.append(setExpandedTitleMargin.setY.setCustomSize, 12);
        }

        final void setIconTintList(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setExpandedTitleMargin.setY.setChipEndPaddingResource);
            this.setX = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (setChipCornerRadius.get(index)) {
                    case 1:
                        this.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getFloat(index, this.MenuHostHelper$$ExternalSyntheticLambda1);
                        break;
                    case 2:
                        this.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getFloat(index, this.MenuHostHelper$$ExternalSyntheticLambda0);
                        break;
                    case 3:
                        this.setOnLongClickListener = obtainStyledAttributes.getFloat(index, this.setOnLongClickListener);
                        break;
                    case 4:
                        this.setLayoutAnimation = obtainStyledAttributes.getFloat(index, this.setLayoutAnimation);
                        break;
                    case 5:
                        this.setUiOptions = obtainStyledAttributes.getFloat(index, this.setUiOptions);
                        break;
                    case 6:
                        this.setUnboundedRipple = obtainStyledAttributes.getDimension(index, this.setUnboundedRipple);
                        break;
                    case 7:
                        this.setTextAlignment = obtainStyledAttributes.getDimension(index, this.setTextAlignment);
                        break;
                    case 8:
                        this.ViewPager$SavedState$1 = obtainStyledAttributes.getDimension(index, this.ViewPager$SavedState$1);
                        break;
                    case 9:
                        this.setIconSize = obtainStyledAttributes.getDimension(index, this.setIconSize);
                        break;
                    case 10:
                        this.setCenterIfNoTextEnabled = obtainStyledAttributes.getDimension(index, this.setCenterIfNoTextEnabled);
                        break;
                    case 11:
                        this.setY = true;
                        this.setIconTintList = obtainStyledAttributes.getDimension(index, this.setIconTintList);
                        break;
                    case 12:
                        this.setNavigationOnClickListener = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, index, this.setNavigationOnClickListener);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class setX {
        String MenuHostHelper$$ExternalSyntheticLambda1;
        int setIconTintList;
        public WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1 setX;
        public final WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda0 setLayoutAnimation = new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda0();
        public final WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda1 setUiOptions = new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda1();
        public final setIconTintList setY = new setIconTintList();
        public final setY setOnLongClickListener = new setY();
        public HashMap<String, setActiveIndicatorDrawable> MenuHostHelper$$ExternalSyntheticLambda0 = new HashMap<>();

        /* renamed from: MenuHostHelper$$ExternalSyntheticLambda1 */
        public final setX clone() {
            setX setx = new setX();
            setx.setY.setIconTintList(this.setY);
            setx.setUiOptions.setY(this.setUiOptions);
            setx.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0(this.setLayoutAnimation);
            setx.setOnLongClickListener.setX(this.setOnLongClickListener);
            setx.setIconTintList = this.setIconTintList;
            setx.setX = this.setX;
            return setx;
        }

        public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, setTextLocale.setIconTintList seticontintlist) {
            MenuHostHelper$$ExternalSyntheticLambda0(i, (setMIndicatorOptions.setIconTintList) seticontintlist);
            this.setLayoutAnimation.setY = seticontintlist.setCallingWorkSourceUid;
            this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1 = seticontintlist.setCheckedIconEnabledResource;
            this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0 = seticontintlist.setOnScrollChangeListener;
            this.setOnLongClickListener.setOnLongClickListener = seticontintlist.setExpandedTitleTextColor;
            this.setOnLongClickListener.setLayoutAnimation = seticontintlist.setDelayedApplicationOfInitialState;
            this.setOnLongClickListener.setUiOptions = seticontintlist.setRowOrderPreserved;
            this.setOnLongClickListener.setUnboundedRipple = seticontintlist.setOnSeekBarChangeListener;
            this.setOnLongClickListener.setTextAlignment = seticontintlist.setChipTextResource;
            this.setOnLongClickListener.ViewPager$SavedState$1 = seticontintlist.setCalendarViewShown;
            this.setOnLongClickListener.setIconSize = seticontintlist.GridLayoutManager;
            this.setOnLongClickListener.setCenterIfNoTextEnabled = seticontintlist.m;
            this.setOnLongClickListener.setIconTintList = seticontintlist.minusKey;
            this.setOnLongClickListener.setY = seticontintlist.setEdgeEffectFactory;
        }

        final void MenuHostHelper$$ExternalSyntheticLambda0(int i, setMIndicatorOptions.setIconTintList seticontintlist) {
            this.setIconTintList = i;
            this.setY.setFilterTouchesWhenObscured = seticontintlist.setSuffixText;
            this.setY.setObjectValues = seticontintlist.setViewTranslationCallback;
            this.setY.getCallingPid = seticontintlist.setEmptyView;
            this.setY.setTooltipText = seticontintlist.setSubmitButtonEnabled;
            this.setY.setLineBreakStyle = seticontintlist.setChipIconEnabledResource;
            this.setY.Fragment$5 = seticontintlist.ActionMenuPresenter$SavedState$1;
            this.setY.setUnboundedRipple = seticontintlist.setLayoutAnimation;
            this.setY.setUiOptions = seticontintlist.setX;
            this.setY.setY = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0;
            this.setY.MenuHostHelper$$ExternalSyntheticLambda0 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1;
            this.setY.setIconTintList = seticontintlist.setY;
            this.setY.setCloseIconEndPadding = seticontintlist.setLineBreakStyle;
            this.setY.FabTransformationBehavior = seticontintlist.setNavigationIconTint;
            this.setY.setZ = seticontintlist.setMaxEms;
            this.setY.setAnimationFromJson = seticontintlist.setOnNavigationItemSelectedListener;
            this.setY.FragmentStateAdapter$5 = seticontintlist.setContentScrimResource;
            this.setY.setNavigationIconTint = seticontintlist.setChipSpacingHorizontal;
            this.setY.setChipCornerRadius = seticontintlist.setChipCornerRadius;
            this.setY.setNavigationOnClickListener = seticontintlist.setUnboundedRipple;
            this.setY.setLayoutAnimation = seticontintlist.setUiOptions;
            this.setY.setOnLongClickListener = seticontintlist.setNavigationOnClickListener;
            this.setY.setCenterIfNoTextEnabled = seticontintlist.setZ;
            this.setY.setIconSize = seticontintlist.setTextScaleX;
            this.setY.setFilterRedundantCalls = seticontintlist.setShrinkMotionSpec;
            this.setY.SearchView$SavedState$1 = seticontintlist.ExtendableSavedState$1;
            this.setY.setHasDecor = seticontintlist.setChipIconTintResource;
            this.setY.setIconified = seticontintlist.setHasDecor;
            this.setY.setShrinkMotionSpec = ((ViewGroup.LayoutParams) seticontintlist).width;
            this.setY.setFloatValues = ((ViewGroup.LayoutParams) seticontintlist).height;
            this.setY.setAdapter = ((ViewGroup.MarginLayoutParams) seticontintlist).leftMargin;
            this.setY.onActivityResumed = ((ViewGroup.MarginLayoutParams) seticontintlist).rightMargin;
            this.setY.setRevealInfo = ((ViewGroup.MarginLayoutParams) seticontintlist).topMargin;
            this.setY.MenuHostHelper$$ExternalSyntheticLambda1 = ((ViewGroup.MarginLayoutParams) seticontintlist).bottomMargin;
            this.setY.setX = seticontintlist.setIconTintList;
            this.setY.ActionMenuPresenter$SavedState$1 = seticontintlist.RemoteActionCompatParcelizer;
            this.setY.setSuffixText = seticontintlist.FragmentStateAdapter$5;
            this.setY.setEmptyView = seticontintlist.TextInputLayout$SavedState$1;
            this.setY.setConstraintSet = seticontintlist.setConstraintSet;
            this.setY.setTextAlignment = seticontintlist.setTextAlignment;
            this.setY.ViewPager$SavedState$1 = seticontintlist.setOnLongClickListener;
            this.setY.setSubmitButtonEnabled = seticontintlist.setFloatValues;
            this.setY.setChipIconTintResource = seticontintlist.setImageTintMode;
            this.setY.TextInputLayout$SavedState$1 = seticontintlist.setSelectedChildViewEnabled;
            this.setY.FloatingActionButton$BaseBehavior = seticontintlist.setChipIconEnabled;
            this.setY.setChipIconEnabledResource = seticontintlist.setError;
            this.setY.setContentScrimResource = seticontintlist.RecyclerView$SavedState$1;
            this.setY.RemoteActionCompatParcelizer = seticontintlist.setTitleMarginEnd;
            this.setY.FragmentStateAdapter$2 = seticontintlist.setChipSpacingVertical;
            this.setY.RecyclerView$SavedState$1 = seticontintlist.ViewPager$SavedState$1;
            this.setY.setTextAppearanceResource = seticontintlist.SearchView$SavedState$1;
            this.setY.setMaxEms = seticontintlist.setTextAppearanceResource;
            this.setY.setGuidelinePercent = seticontintlist.setCheckedIconEnabled;
            this.setY.setMinAndMaxProgress = seticontintlist.setLayoutDirection;
            this.setY.setCheckedIconEnabled = seticontintlist.setMinAndMaxProgress;
            this.setY.setLayoutDirection = seticontintlist.setGuidelinePercent;
            this.setY.setOnNavigationItemSelectedListener = seticontintlist.setAnimationFromJson;
            this.setY.setHint = seticontintlist.setMinEms;
            this.setY.setTextScaleX = seticontintlist.getMarginEnd();
            this.setY.createDispatcher = seticontintlist.getMarginStart();
        }

        public final void setX(setMIndicatorOptions.setIconTintList seticontintlist) {
            seticontintlist.setSuffixText = this.setY.setFilterTouchesWhenObscured;
            seticontintlist.setViewTranslationCallback = this.setY.setObjectValues;
            seticontintlist.setEmptyView = this.setY.getCallingPid;
            seticontintlist.setSubmitButtonEnabled = this.setY.setTooltipText;
            seticontintlist.setChipIconEnabledResource = this.setY.setLineBreakStyle;
            seticontintlist.ActionMenuPresenter$SavedState$1 = this.setY.Fragment$5;
            seticontintlist.setLayoutAnimation = this.setY.setUnboundedRipple;
            seticontintlist.setX = this.setY.setUiOptions;
            seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0 = this.setY.setY;
            seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 = this.setY.MenuHostHelper$$ExternalSyntheticLambda0;
            seticontintlist.setY = this.setY.setIconTintList;
            seticontintlist.setLineBreakStyle = this.setY.setCloseIconEndPadding;
            seticontintlist.setNavigationIconTint = this.setY.FabTransformationBehavior;
            seticontintlist.setMaxEms = this.setY.setZ;
            seticontintlist.setOnNavigationItemSelectedListener = this.setY.setAnimationFromJson;
            ((ViewGroup.MarginLayoutParams) seticontintlist).leftMargin = this.setY.setAdapter;
            ((ViewGroup.MarginLayoutParams) seticontintlist).rightMargin = this.setY.onActivityResumed;
            ((ViewGroup.MarginLayoutParams) seticontintlist).topMargin = this.setY.setRevealInfo;
            ((ViewGroup.MarginLayoutParams) seticontintlist).bottomMargin = this.setY.MenuHostHelper$$ExternalSyntheticLambda1;
            seticontintlist.setMinAndMaxProgress = this.setY.setCheckedIconEnabled;
            seticontintlist.setGuidelinePercent = this.setY.setLayoutDirection;
            seticontintlist.SearchView$SavedState$1 = this.setY.setTextAppearanceResource;
            seticontintlist.setTextAppearanceResource = this.setY.setMaxEms;
            seticontintlist.setContentScrimResource = this.setY.FragmentStateAdapter$5;
            seticontintlist.setChipSpacingHorizontal = this.setY.setNavigationIconTint;
            seticontintlist.setUnboundedRipple = this.setY.setNavigationOnClickListener;
            seticontintlist.setUiOptions = this.setY.setLayoutAnimation;
            seticontintlist.setNavigationOnClickListener = this.setY.setOnLongClickListener;
            seticontintlist.setChipCornerRadius = this.setY.setChipCornerRadius;
            seticontintlist.setZ = this.setY.setCenterIfNoTextEnabled;
            seticontintlist.setTextScaleX = this.setY.setIconSize;
            seticontintlist.RemoteActionCompatParcelizer = this.setY.ActionMenuPresenter$SavedState$1;
            seticontintlist.FragmentStateAdapter$5 = this.setY.setSuffixText;
            seticontintlist.TextInputLayout$SavedState$1 = this.setY.setEmptyView;
            seticontintlist.setConstraintSet = this.setY.setConstraintSet;
            seticontintlist.setTextAlignment = this.setY.setTextAlignment;
            seticontintlist.setOnLongClickListener = this.setY.ViewPager$SavedState$1;
            seticontintlist.setFloatValues = this.setY.setSubmitButtonEnabled;
            seticontintlist.setImageTintMode = this.setY.setChipIconTintResource;
            seticontintlist.setSelectedChildViewEnabled = this.setY.TextInputLayout$SavedState$1;
            seticontintlist.setChipIconEnabled = this.setY.FloatingActionButton$BaseBehavior;
            seticontintlist.setError = this.setY.setChipIconEnabledResource;
            seticontintlist.RecyclerView$SavedState$1 = this.setY.setContentScrimResource;
            seticontintlist.setTitleMarginEnd = this.setY.RemoteActionCompatParcelizer;
            seticontintlist.setChipSpacingVertical = this.setY.FragmentStateAdapter$2;
            seticontintlist.setShrinkMotionSpec = this.setY.setFilterRedundantCalls;
            seticontintlist.ExtendableSavedState$1 = this.setY.SearchView$SavedState$1;
            seticontintlist.setChipIconTintResource = this.setY.setHasDecor;
            seticontintlist.setHasDecor = this.setY.setIconified;
            ((ViewGroup.LayoutParams) seticontintlist).width = this.setY.setShrinkMotionSpec;
            ((ViewGroup.LayoutParams) seticontintlist).height = this.setY.setFloatValues;
            if (this.setY.RecyclerView$SavedState$1 != null) {
                seticontintlist.ViewPager$SavedState$1 = this.setY.RecyclerView$SavedState$1;
            }
            seticontintlist.setMinEms = this.setY.setHint;
            seticontintlist.setMarginStart(this.setY.createDispatcher);
            seticontintlist.setMarginEnd(this.setY.setTextScaleX);
            seticontintlist.setX();
        }
    }

    public final void setY(setMIndicatorOptions setmindicatoroptions) {
        int childCount = setmindicatoroptions.getChildCount();
        this.setY.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = setmindicatoroptions.getChildAt(i);
            setMIndicatorOptions.setIconTintList seticontintlist = (setMIndicatorOptions.setIconTintList) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.setY.containsKey(Integer.valueOf(id))) {
                this.setY.put(Integer.valueOf(id), new setX());
            }
            setX setx = this.setY.get(Integer.valueOf(id));
            if (setx != null) {
                setx.MenuHostHelper$$ExternalSyntheticLambda0 = setActiveIndicatorDrawable.setX(this.setLayoutAnimation, childAt);
                setx.MenuHostHelper$$ExternalSyntheticLambda0(id, seticontintlist);
                setx.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0 = childAt.getVisibility();
                setx.setLayoutAnimation.setY = childAt.getAlpha();
                setx.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1 = childAt.getRotation();
                setx.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0 = childAt.getRotationX();
                setx.setOnLongClickListener.setOnLongClickListener = childAt.getRotationY();
                setx.setOnLongClickListener.setLayoutAnimation = childAt.getScaleX();
                setx.setOnLongClickListener.setUiOptions = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    setx.setOnLongClickListener.setUnboundedRipple = pivotX;
                    setx.setOnLongClickListener.setTextAlignment = pivotY;
                }
                setx.setOnLongClickListener.ViewPager$SavedState$1 = childAt.getTranslationX();
                setx.setOnLongClickListener.setIconSize = childAt.getTranslationY();
                setx.setOnLongClickListener.setCenterIfNoTextEnabled = childAt.getTranslationZ();
                if (setx.setOnLongClickListener.setY) {
                    setx.setOnLongClickListener.setIconTintList = childAt.getElevation();
                }
                if (childAt instanceof AndroidExceptionPreHandler) {
                    AndroidExceptionPreHandler androidExceptionPreHandler = (AndroidExceptionPreHandler) childAt;
                    setx.setY.setSelectedChildViewEnabled = androidExceptionPreHandler.setX.setIconTintList;
                    setx.setY.setTitleMarginEnd = androidExceptionPreHandler.MenuHostHelper$$ExternalSyntheticLambda1();
                    setx.setY.setImageTintMode = androidExceptionPreHandler.setY;
                    setx.setY.setChipIconEnabled = androidExceptionPreHandler.setX.setX;
                }
            }
        }
    }

    public final void setIconTintList(setMIndicatorOptions setmindicatoroptions) {
        MenuHostHelper$$ExternalSyntheticLambda1(setmindicatoroptions);
        setmindicatoroptions.setConstraintSet(null);
        setmindicatoroptions.requestLayout();
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(setMIndicatorOptions setmindicatoroptions) {
        setX setx;
        int childCount = setmindicatoroptions.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = setmindicatoroptions.getChildAt(i);
            int id = childAt.getId();
            if (!this.setY.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                sb.append(setExtendMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1(childAt));
                Log.w("ConstraintSet", sb.toString());
            } else if (this.MenuHostHelper$$ExternalSyntheticLambda1 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (this.setY.containsKey(Integer.valueOf(id)) && (setx = this.setY.get(Integer.valueOf(id))) != null) {
                    setActiveIndicatorDrawable.setX(childAt, setx.MenuHostHelper$$ExternalSyntheticLambda0);
                }
            }
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(setMIndicatorOptions setmindicatoroptions) {
        int childCount = setmindicatoroptions.getChildCount();
        HashSet hashSet = new HashSet(this.setY.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = setmindicatoroptions.getChildAt(i);
            int id = childAt.getId();
            if (!this.setY.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                sb.append(setExtendMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1(childAt));
                Log.w("ConstraintSet", sb.toString());
            } else if (this.MenuHostHelper$$ExternalSyntheticLambda1 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1) {
                    if (this.setY.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        setX setx = this.setY.get(Integer.valueOf(id));
                        if (setx != null) {
                            if (childAt instanceof AndroidExceptionPreHandler) {
                                setx.setY.setError = 1;
                                AndroidExceptionPreHandler androidExceptionPreHandler = (AndroidExceptionPreHandler) childAt;
                                androidExceptionPreHandler.setId(id);
                                androidExceptionPreHandler.setType(setx.setY.setImageTintMode);
                                androidExceptionPreHandler.setMargin(setx.setY.setChipIconEnabled);
                                androidExceptionPreHandler.setAllowsGoneWidget(setx.setY.setSelectedChildViewEnabled);
                                if (setx.setY.setTitleMarginEnd != null) {
                                    androidExceptionPreHandler.setReferencedIds(setx.setY.setTitleMarginEnd);
                                } else if (setx.setY.FirebaseRemoteConfigKtxRegistrar != null) {
                                    setx.setY.setTitleMarginEnd = setX(androidExceptionPreHandler, setx.setY.FirebaseRemoteConfigKtxRegistrar);
                                    androidExceptionPreHandler.setReferencedIds(setx.setY.setTitleMarginEnd);
                                }
                            }
                            setMIndicatorOptions.setIconTintList seticontintlist = (setMIndicatorOptions.setIconTintList) childAt.getLayoutParams();
                            seticontintlist.setX();
                            setx.setX(seticontintlist);
                            setActiveIndicatorDrawable.setX(childAt, setx.MenuHostHelper$$ExternalSyntheticLambda0);
                            childAt.setLayoutParams(seticontintlist);
                            if (setx.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                                childAt.setVisibility(setx.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0);
                            }
                            childAt.setAlpha(setx.setLayoutAnimation.setY);
                            childAt.setRotation(setx.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1);
                            childAt.setRotationX(setx.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0);
                            childAt.setRotationY(setx.setOnLongClickListener.setOnLongClickListener);
                            childAt.setScaleX(setx.setOnLongClickListener.setLayoutAnimation);
                            childAt.setScaleY(setx.setOnLongClickListener.setUiOptions);
                            if (setx.setOnLongClickListener.setNavigationOnClickListener != -1) {
                                View findViewById = ((View) childAt.getParent()).findViewById(setx.setOnLongClickListener.setNavigationOnClickListener);
                                if (findViewById != null) {
                                    float top = (findViewById.getTop() + findViewById.getBottom()) / 2.0f;
                                    float left = (findViewById.getLeft() + findViewById.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(setx.setOnLongClickListener.setUnboundedRipple)) {
                                    childAt.setPivotX(setx.setOnLongClickListener.setUnboundedRipple);
                                }
                                if (!Float.isNaN(setx.setOnLongClickListener.setTextAlignment)) {
                                    childAt.setPivotY(setx.setOnLongClickListener.setTextAlignment);
                                }
                            }
                            childAt.setTranslationX(setx.setOnLongClickListener.ViewPager$SavedState$1);
                            childAt.setTranslationY(setx.setOnLongClickListener.setIconSize);
                            childAt.setTranslationZ(setx.setOnLongClickListener.setCenterIfNoTextEnabled);
                            if (setx.setOnLongClickListener.setY) {
                                childAt.setElevation(setx.setOnLongClickListener.setIconTintList);
                            }
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("WARNING NO CONSTRAINTS for view ");
                        sb2.append(id);
                        Log.v("ConstraintSet", sb2.toString());
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            setX setx2 = this.setY.get(num);
            if (setx2 != null) {
                if (setx2.setY.setError == 1) {
                    AndroidExceptionPreHandler androidExceptionPreHandler2 = new AndroidExceptionPreHandler(setmindicatoroptions.getContext());
                    androidExceptionPreHandler2.setId(num.intValue());
                    if (setx2.setY.setTitleMarginEnd != null) {
                        androidExceptionPreHandler2.setReferencedIds(setx2.setY.setTitleMarginEnd);
                    } else if (setx2.setY.FirebaseRemoteConfigKtxRegistrar != null) {
                        setx2.setY.setTitleMarginEnd = setX(androidExceptionPreHandler2, setx2.setY.FirebaseRemoteConfigKtxRegistrar);
                        androidExceptionPreHandler2.setReferencedIds(setx2.setY.setTitleMarginEnd);
                    }
                    androidExceptionPreHandler2.setType(setx2.setY.setImageTintMode);
                    androidExceptionPreHandler2.setMargin(setx2.setY.setChipIconEnabled);
                    setMIndicatorOptions.setIconTintList x = setMIndicatorOptions.setX();
                    androidExceptionPreHandler2.MenuHostHelper$$ExternalSyntheticLambda0();
                    setx2.setX(x);
                    setmindicatoroptions.addView(androidExceptionPreHandler2, x);
                }
                if (setx2.setY.setChipSpacingVertical) {
                    View setattachlistener = new setAttachListener(setmindicatoroptions.getContext());
                    setattachlistener.setId(num.intValue());
                    setMIndicatorOptions.setIconTintList x2 = setMIndicatorOptions.setX();
                    setx2.setX(x2);
                    setmindicatoroptions.addView(setattachlistener, x2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = setmindicatoroptions.getChildAt(i2);
            if (childAt2 instanceof setCardBackgroundColor) {
                setCardBackgroundColor setcardbackgroundcolor = (setCardBackgroundColor) childAt2;
            }
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2, int i3, float f) {
        setX MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(i);
        MenuHostHelper$$ExternalSyntheticLambda1.setY.setNavigationOnClickListener = R.id.res_0x7f0a007f;
        MenuHostHelper$$ExternalSyntheticLambda1.setY.setLayoutAnimation = i3;
        MenuHostHelper$$ExternalSyntheticLambda1.setY.setOnLongClickListener = f;
    }

    public final setX MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        if (!this.setY.containsKey(Integer.valueOf(i))) {
            this.setY.put(Integer.valueOf(i), new setX());
        }
        return this.setY.get(Integer.valueOf(i));
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    setX iconTintList = setIconTintList(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        iconTintList.setY.setChipSpacingVertical = true;
                    }
                    this.setY.put(Integer.valueOf(iconTintList.setIconTintList), iconTintList);
                } else {
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x01c7, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setX(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    private static setX setIconTintList(Context context, AttributeSet attributeSet, boolean z) {
        setX setx = new setX();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? setExpandedTitleMargin.setY.setDelayedApplicationOfInitialState : setExpandedTitleMargin.setY.setIconTintList);
        if (z) {
            MenuHostHelper$$ExternalSyntheticLambda1(setx, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index != setExpandedTitleMargin.setY.setDividerHeight && setExpandedTitleMargin.setY.setCompatElevation != index && setExpandedTitleMargin.setY.setHapticFeedbackEnabled != index) {
                    setx.setUiOptions.setIconTintList = true;
                    setx.setY.setViewTranslationCallback = true;
                    setx.setLayoutAnimation.setX = true;
                    setx.setOnLongClickListener.setX = true;
                }
                switch (setNavigationOnClickListener.get(index)) {
                    case 1:
                        setIconTintList seticontintlist = setx.setY;
                        int resourceId = obtainStyledAttributes.getResourceId(index, setx.setY.setY);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        seticontintlist.setY = resourceId;
                        break;
                    case 2:
                        setx.setY.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getDimensionPixelSize(index, setx.setY.MenuHostHelper$$ExternalSyntheticLambda1);
                        break;
                    case 3:
                        setIconTintList seticontintlist2 = setx.setY;
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, setx.setY.setUiOptions);
                        if (resourceId2 == -1) {
                            resourceId2 = obtainStyledAttributes.getInt(index, -1);
                        }
                        seticontintlist2.setUiOptions = resourceId2;
                        break;
                    case 4:
                        setIconTintList seticontintlist3 = setx.setY;
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, setx.setY.setUnboundedRipple);
                        if (resourceId3 == -1) {
                            resourceId3 = obtainStyledAttributes.getInt(index, -1);
                        }
                        seticontintlist3.setUnboundedRipple = resourceId3;
                        break;
                    case 5:
                        setx.setY.setChipCornerRadius = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        setx.setY.setCenterIfNoTextEnabled = obtainStyledAttributes.getDimensionPixelOffset(index, setx.setY.setCenterIfNoTextEnabled);
                        break;
                    case 7:
                        setx.setY.setIconSize = obtainStyledAttributes.getDimensionPixelOffset(index, setx.setY.setIconSize);
                        break;
                    case 8:
                        setx.setY.setTextScaleX = obtainStyledAttributes.getDimensionPixelSize(index, setx.setY.setTextScaleX);
                        break;
                    case 9:
                        setIconTintList seticontintlist4 = setx.setY;
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, setx.setY.setAnimationFromJson);
                        if (resourceId4 == -1) {
                            resourceId4 = obtainStyledAttributes.getInt(index, -1);
                        }
                        seticontintlist4.setAnimationFromJson = resourceId4;
                        break;
                    case 10:
                        setIconTintList seticontintlist5 = setx.setY;
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, setx.setY.setZ);
                        if (resourceId5 == -1) {
                            resourceId5 = obtainStyledAttributes.getInt(index, -1);
                        }
                        seticontintlist5.setZ = resourceId5;
                        break;
                    case 11:
                        setx.setY.setMaxEms = obtainStyledAttributes.getDimensionPixelSize(index, setx.setY.setMaxEms);
                        break;
                    case 12:
                        setx.setY.setLayoutDirection = obtainStyledAttributes.getDimensionPixelSize(index, setx.setY.setLayoutDirection);
                        break;
                    case 13:
                        setx.setY.setGuidelinePercent = obtainStyledAttributes.getDimensionPixelSize(index, setx.setY.setGuidelinePercent);
                        break;
                    case 14:
                        setx.setY.setMinAndMaxProgress = obtainStyledAttributes.getDimensionPixelSize(index, setx.setY.setMinAndMaxProgress);
                        break;
                    case 15:
                        setx.setY.setCheckedIconEnabled = obtainStyledAttributes.getDimensionPixelSize(index, setx.setY.setCheckedIconEnabled);
                        break;
                    case 16:
                        setx.setY.setTextAppearanceResource = obtainStyledAttributes.getDimensionPixelSize(index, setx.setY.setTextAppearanceResource);
                        break;
                    case 17:
                        setx.setY.setHasDecor = obtainStyledAttributes.getDimensionPixelOffset(index, setx.setY.setHasDecor);
                        break;
                    case 18:
                        setx.setY.setIconified = obtainStyledAttributes.getDimensionPixelOffset(index, setx.setY.setIconified);
                        break;
                    case 19:
                        setx.setY.SearchView$SavedState$1 = obtainStyledAttributes.getFloat(index, setx.setY.SearchView$SavedState$1);
                        break;
                    case 20:
                        setx.setY.FragmentStateAdapter$5 = obtainStyledAttributes.getFloat(index, setx.setY.FragmentStateAdapter$5);
                        break;
                    case 21:
                        setx.setY.setFloatValues = obtainStyledAttributes.getLayoutDimension(index, setx.setY.setFloatValues);
                        break;
                    case 22:
                        setx.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getInt(index, setx.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0);
                        setx.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0 = setUiOptions[setx.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0];
                        break;
                    case 23:
                        setx.setY.setShrinkMotionSpec = obtainStyledAttributes.getLayoutDimension(index, setx.setY.setShrinkMotionSpec);
                        break;
                    case 24:
                        setx.setY.setAdapter = obtainStyledAttributes.getDimensionPixelSize(index, setx.setY.setAdapter);
                        break;
                    case 25:
                        setIconTintList seticontintlist6 = setx.setY;
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, setx.setY.setFilterTouchesWhenObscured);
                        if (resourceId6 == -1) {
                            resourceId6 = obtainStyledAttributes.getInt(index, -1);
                        }
                        seticontintlist6.setFilterTouchesWhenObscured = resourceId6;
                        break;
                    case 26:
                        setIconTintList seticontintlist7 = setx.setY;
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, setx.setY.setObjectValues);
                        if (resourceId7 == -1) {
                            resourceId7 = obtainStyledAttributes.getInt(index, -1);
                        }
                        seticontintlist7.setObjectValues = resourceId7;
                        break;
                    case 27:
                        setx.setY.setFilterRedundantCalls = obtainStyledAttributes.getInt(index, setx.setY.setFilterRedundantCalls);
                        break;
                    case 28:
                        setx.setY.onActivityResumed = obtainStyledAttributes.getDimensionPixelSize(index, setx.setY.onActivityResumed);
                        break;
                    case 29:
                        setIconTintList seticontintlist8 = setx.setY;
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, setx.setY.getCallingPid);
                        if (resourceId8 == -1) {
                            resourceId8 = obtainStyledAttributes.getInt(index, -1);
                        }
                        seticontintlist8.getCallingPid = resourceId8;
                        break;
                    case 30:
                        setIconTintList seticontintlist9 = setx.setY;
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, setx.setY.setTooltipText);
                        if (resourceId9 == -1) {
                            resourceId9 = obtainStyledAttributes.getInt(index, -1);
                        }
                        seticontintlist9.setTooltipText = resourceId9;
                        break;
                    case 31:
                        setx.setY.createDispatcher = obtainStyledAttributes.getDimensionPixelSize(index, setx.setY.createDispatcher);
                        break;
                    case 32:
                        setIconTintList seticontintlist10 = setx.setY;
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, setx.setY.setCloseIconEndPadding);
                        if (resourceId10 == -1) {
                            resourceId10 = obtainStyledAttributes.getInt(index, -1);
                        }
                        seticontintlist10.setCloseIconEndPadding = resourceId10;
                        break;
                    case 33:
                        setIconTintList seticontintlist11 = setx.setY;
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, setx.setY.FabTransformationBehavior);
                        if (resourceId11 == -1) {
                            resourceId11 = obtainStyledAttributes.getInt(index, -1);
                        }
                        seticontintlist11.FabTransformationBehavior = resourceId11;
                        break;
                    case 34:
                        setx.setY.setRevealInfo = obtainStyledAttributes.getDimensionPixelSize(index, setx.setY.setRevealInfo);
                        break;
                    case 35:
                        setIconTintList seticontintlist12 = setx.setY;
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, setx.setY.Fragment$5);
                        if (resourceId12 == -1) {
                            resourceId12 = obtainStyledAttributes.getInt(index, -1);
                        }
                        seticontintlist12.Fragment$5 = resourceId12;
                        break;
                    case setExpandedTitleMargin.setY.setChipCornerRadius /* 36 */:
                        setIconTintList seticontintlist13 = setx.setY;
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, setx.setY.setLineBreakStyle);
                        if (resourceId13 == -1) {
                            resourceId13 = obtainStyledAttributes.getInt(index, -1);
                        }
                        seticontintlist13.setLineBreakStyle = resourceId13;
                        break;
                    case 37:
                        setx.setY.setNavigationIconTint = obtainStyledAttributes.getFloat(index, setx.setY.setNavigationIconTint);
                        break;
                    case setExpandedTitleMargin.setY.setSupportCheckMarkTintList /* 38 */:
                        setx.setIconTintList = obtainStyledAttributes.getResourceId(index, setx.setIconTintList);
                        break;
                    case setExpandedTitleMargin.setY.setVelocityScale /* 39 */:
                        setx.setY.setSuffixText = obtainStyledAttributes.getFloat(index, setx.setY.setSuffixText);
                        break;
                    case setExpandedTitleMargin.setY.setRightEdgeEffectColor /* 40 */:
                        setx.setY.ActionMenuPresenter$SavedState$1 = obtainStyledAttributes.getFloat(index, setx.setY.ActionMenuPresenter$SavedState$1);
                        break;
                    case setExpandedTitleMargin.setY.setHorizontalScrollbarTrackDrawable /* 41 */:
                        setx.setY.setConstraintSet = obtainStyledAttributes.getInt(index, setx.setY.setConstraintSet);
                        break;
                    case setExpandedTitleMargin.setY.setOnKeyListener /* 42 */:
                        setx.setY.setEmptyView = obtainStyledAttributes.getInt(index, setx.setY.setEmptyView);
                        break;
                    case setExpandedTitleMargin.setY.setForegroundTintList /* 43 */:
                        setx.setLayoutAnimation.setY = obtainStyledAttributes.getFloat(index, setx.setLayoutAnimation.setY);
                        break;
                    case setExpandedTitleMargin.setY.setRecyclerListener /* 44 */:
                        setx.setOnLongClickListener.setY = true;
                        setx.setOnLongClickListener.setIconTintList = obtainStyledAttributes.getDimension(index, setx.setOnLongClickListener.setIconTintList);
                        break;
                    case setExpandedTitleMargin.setY.setPreferKeepClearRects /* 45 */:
                        setx.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getFloat(index, setx.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0);
                        break;
                    case setExpandedTitleMargin.setY.setInterpolator /* 46 */:
                        setx.setOnLongClickListener.setOnLongClickListener = obtainStyledAttributes.getFloat(index, setx.setOnLongClickListener.setOnLongClickListener);
                        break;
                    case setExpandedTitleMargin.setY.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 /* 47 */:
                        setx.setOnLongClickListener.setLayoutAnimation = obtainStyledAttributes.getFloat(index, setx.setOnLongClickListener.setLayoutAnimation);
                        break;
                    case setExpandedTitleMargin.setY.ParcelableSparseArray$1 /* 48 */:
                        setx.setOnLongClickListener.setUiOptions = obtainStyledAttributes.getFloat(index, setx.setOnLongClickListener.setUiOptions);
                        break;
                    case setExpandedTitleMargin.setY.setAutoLinkMask /* 49 */:
                        setx.setOnLongClickListener.setUnboundedRipple = obtainStyledAttributes.getDimension(index, setx.setOnLongClickListener.setUnboundedRipple);
                        break;
                    case setExpandedTitleMargin.setY.setOrientation /* 50 */:
                        setx.setOnLongClickListener.setTextAlignment = obtainStyledAttributes.getDimension(index, setx.setOnLongClickListener.setTextAlignment);
                        break;
                    case 51:
                        setx.setOnLongClickListener.ViewPager$SavedState$1 = obtainStyledAttributes.getDimension(index, setx.setOnLongClickListener.ViewPager$SavedState$1);
                        break;
                    case setExpandedTitleMargin.setY.setSupportCompoundDrawablesTintList /* 52 */:
                        setx.setOnLongClickListener.setIconSize = obtainStyledAttributes.getDimension(index, setx.setOnLongClickListener.setIconSize);
                        break;
                    case setExpandedTitleMargin.setY.setScrollingCacheEnabled /* 53 */:
                        setx.setOnLongClickListener.setCenterIfNoTextEnabled = obtainStyledAttributes.getDimension(index, setx.setOnLongClickListener.setCenterIfNoTextEnabled);
                        break;
                    case 54:
                        setx.setY.setSubmitButtonEnabled = obtainStyledAttributes.getInt(index, setx.setY.setSubmitButtonEnabled);
                        break;
                    case 55:
                        setx.setY.setChipIconTintResource = obtainStyledAttributes.getInt(index, setx.setY.setChipIconTintResource);
                        break;
                    case 56:
                        setx.setY.TextInputLayout$SavedState$1 = obtainStyledAttributes.getDimensionPixelSize(index, setx.setY.TextInputLayout$SavedState$1);
                        break;
                    case 57:
                        setx.setY.FloatingActionButton$BaseBehavior = obtainStyledAttributes.getDimensionPixelSize(index, setx.setY.FloatingActionButton$BaseBehavior);
                        break;
                    case 58:
                        setx.setY.setChipIconEnabledResource = obtainStyledAttributes.getDimensionPixelSize(index, setx.setY.setChipIconEnabledResource);
                        break;
                    case 59:
                        setx.setY.setContentScrimResource = obtainStyledAttributes.getDimensionPixelSize(index, setx.setY.setContentScrimResource);
                        break;
                    case 60:
                        setx.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getFloat(index, setx.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1);
                        break;
                    case 61:
                        setIconTintList seticontintlist14 = setx.setY;
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, setx.setY.setNavigationOnClickListener);
                        if (resourceId14 == -1) {
                            resourceId14 = obtainStyledAttributes.getInt(index, -1);
                        }
                        seticontintlist14.setNavigationOnClickListener = resourceId14;
                        break;
                    case 62:
                        setx.setY.setLayoutAnimation = obtainStyledAttributes.getDimensionPixelSize(index, setx.setY.setLayoutAnimation);
                        break;
                    case 63:
                        setx.setY.setOnLongClickListener = obtainStyledAttributes.getFloat(index, setx.setY.setOnLongClickListener);
                        break;
                    case 64:
                        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda1 = setx.setUiOptions;
                        int resourceId15 = obtainStyledAttributes.getResourceId(index, setx.setUiOptions.setY);
                        if (resourceId15 == -1) {
                            resourceId15 = obtainStyledAttributes.getInt(index, -1);
                        }
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$MenuHostHelper$$ExternalSyntheticLambda1.setY = resourceId15;
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            setx.setUiOptions.setTextAlignment = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            setx.setUiOptions.setTextAlignment = joinThreadPool.setY[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 66:
                        setx.setUiOptions.setX = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 67:
                        setx.setUiOptions.setOnLongClickListener = obtainStyledAttributes.getFloat(index, setx.setUiOptions.setOnLongClickListener);
                        break;
                    case 68:
                        setx.setLayoutAnimation.setIconTintList = obtainStyledAttributes.getFloat(index, setx.setLayoutAnimation.setIconTintList);
                        break;
                    case 69:
                        setx.setY.RemoteActionCompatParcelizer = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 70:
                        setx.setY.FragmentStateAdapter$2 = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        setx.setY.setImageTintMode = obtainStyledAttributes.getInt(index, setx.setY.setImageTintMode);
                        break;
                    case 73:
                        setx.setY.setChipIconEnabled = obtainStyledAttributes.getDimensionPixelSize(index, setx.setY.setChipIconEnabled);
                        break;
                    case 74:
                        setx.setY.FirebaseRemoteConfigKtxRegistrar = obtainStyledAttributes.getString(index);
                        break;
                    case 75:
                        setx.setY.setSelectedChildViewEnabled = obtainStyledAttributes.getBoolean(index, setx.setY.setSelectedChildViewEnabled);
                        break;
                    case 76:
                        setx.setUiOptions.setUiOptions = obtainStyledAttributes.getInt(index, setx.setUiOptions.setUiOptions);
                        break;
                    case 77:
                        setx.setY.RecyclerView$SavedState$1 = obtainStyledAttributes.getString(index);
                        break;
                    case 78:
                        setx.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getInt(index, setx.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1);
                        break;
                    case 79:
                        setx.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getFloat(index, setx.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1);
                        break;
                    case 80:
                        setx.setY.setTextAlignment = obtainStyledAttributes.getBoolean(index, setx.setY.setTextAlignment);
                        break;
                    case 81:
                        setx.setY.ViewPager$SavedState$1 = obtainStyledAttributes.getBoolean(index, setx.setY.ViewPager$SavedState$1);
                        break;
                    case 82:
                        setx.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getInteger(index, setx.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0);
                        break;
                    case 83:
                        setY sety = setx.setOnLongClickListener;
                        int resourceId16 = obtainStyledAttributes.getResourceId(index, setx.setOnLongClickListener.setNavigationOnClickListener);
                        if (resourceId16 == -1) {
                            resourceId16 = obtainStyledAttributes.getInt(index, -1);
                        }
                        sety.setNavigationOnClickListener = resourceId16;
                        break;
                    case 84:
                        setx.setUiOptions.ViewPager$SavedState$1 = obtainStyledAttributes.getInteger(index, setx.setUiOptions.ViewPager$SavedState$1);
                        break;
                    case 85:
                        setx.setUiOptions.setIconSize = obtainStyledAttributes.getFloat(index, setx.setUiOptions.setIconSize);
                        break;
                    case 86:
                        TypedValue peekValue = obtainStyledAttributes.peekValue(index);
                        if (peekValue.type == 1) {
                            setx.setUiOptions.setUnboundedRipple = obtainStyledAttributes.getResourceId(index, -1);
                            if (setx.setUiOptions.setUnboundedRipple != -1) {
                                setx.setUiOptions.setLayoutAnimation = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (peekValue.type == 3) {
                            setx.setUiOptions.setNavigationOnClickListener = obtainStyledAttributes.getString(index);
                            if (setx.setUiOptions.setNavigationOnClickListener.indexOf("/") > 0) {
                                setx.setUiOptions.setUnboundedRipple = obtainStyledAttributes.getResourceId(index, -1);
                                setx.setUiOptions.setLayoutAnimation = -2;
                                break;
                            } else {
                                setx.setUiOptions.setLayoutAnimation = -1;
                                break;
                            }
                        } else {
                            setx.setUiOptions.setLayoutAnimation = obtainStyledAttributes.getInteger(index, setx.setUiOptions.setUnboundedRipple);
                            break;
                        }
                    case 87:
                        StringBuilder sb = new StringBuilder("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(setNavigationOnClickListener.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(setNavigationOnClickListener.get(index));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        setIconTintList seticontintlist15 = setx.setY;
                        int resourceId17 = obtainStyledAttributes.getResourceId(index, setx.setY.MenuHostHelper$$ExternalSyntheticLambda0);
                        if (resourceId17 == -1) {
                            resourceId17 = obtainStyledAttributes.getInt(index, -1);
                        }
                        seticontintlist15.MenuHostHelper$$ExternalSyntheticLambda0 = resourceId17;
                        break;
                    case 92:
                        setIconTintList seticontintlist16 = setx.setY;
                        int resourceId18 = obtainStyledAttributes.getResourceId(index, setx.setY.setIconTintList);
                        if (resourceId18 == -1) {
                            resourceId18 = obtainStyledAttributes.getInt(index, -1);
                        }
                        seticontintlist16.setIconTintList = resourceId18;
                        break;
                    case 93:
                        setx.setY.setX = obtainStyledAttributes.getDimensionPixelSize(index, setx.setY.setX);
                        break;
                    case 94:
                        setx.setY.setOnNavigationItemSelectedListener = obtainStyledAttributes.getDimensionPixelSize(index, setx.setY.setOnNavigationItemSelectedListener);
                        break;
                    case 95:
                        MenuHostHelper$$ExternalSyntheticLambda0(setx.setY, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        MenuHostHelper$$ExternalSyntheticLambda0(setx.setY, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        setx.setY.setHint = obtainStyledAttributes.getInt(index, setx.setY.setHint);
                        break;
                }
            }
            if (setx.setY.FirebaseRemoteConfigKtxRegistrar != null) {
                setx.setY.setTitleMarginEnd = null;
            }
        }
        obtainStyledAttributes.recycle();
        return setx;
    }

    public static setX MenuHostHelper$$ExternalSyntheticLambda1(Context context, XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        setX setx = new setX();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, setExpandedTitleMargin.setY.setDelayedApplicationOfInitialState);
        MenuHostHelper$$ExternalSyntheticLambda1(setx, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return setx;
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda1(setX setx, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1 = new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1();
        setx.setX = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1;
        setx.setUiOptions.setIconTintList = false;
        setx.setY.setViewTranslationCallback = false;
        setx.setLayoutAnimation.setX = false;
        setx.setOnLongClickListener.setX = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (setOnLongClickListener.get(index)) {
                case 2:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(2, typedArray.getDimensionPixelSize(index, setx.setY.MenuHostHelper$$ExternalSyntheticLambda1));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case setExpandedTitleMargin.setY.setChipCornerRadius /* 36 */:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(setNavigationOnClickListener.get(index));
                    Log.w("ConstraintSet", sb.toString());
                    break;
                case 5:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setY(5, typedArray.getString(index));
                    break;
                case 6:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(6, typedArray.getDimensionPixelOffset(index, setx.setY.setCenterIfNoTextEnabled));
                    break;
                case 7:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(7, typedArray.getDimensionPixelOffset(index, setx.setY.setIconSize));
                    break;
                case 8:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(8, typedArray.getDimensionPixelSize(index, setx.setY.setTextScaleX));
                    break;
                case 11:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(11, typedArray.getDimensionPixelSize(index, setx.setY.setMaxEms));
                    break;
                case 12:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(12, typedArray.getDimensionPixelSize(index, setx.setY.setLayoutDirection));
                    break;
                case 13:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(13, typedArray.getDimensionPixelSize(index, setx.setY.setGuidelinePercent));
                    break;
                case 14:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(14, typedArray.getDimensionPixelSize(index, setx.setY.setMinAndMaxProgress));
                    break;
                case 15:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(15, typedArray.getDimensionPixelSize(index, setx.setY.setCheckedIconEnabled));
                    break;
                case 16:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(16, typedArray.getDimensionPixelSize(index, setx.setY.setTextAppearanceResource));
                    break;
                case 17:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(17, typedArray.getDimensionPixelOffset(index, setx.setY.setHasDecor));
                    break;
                case 18:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(18, typedArray.getDimensionPixelOffset(index, setx.setY.setIconified));
                    break;
                case 19:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(19, typedArray.getFloat(index, setx.setY.SearchView$SavedState$1));
                    break;
                case 20:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(20, typedArray.getFloat(index, setx.setY.FragmentStateAdapter$5));
                    break;
                case 21:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(21, typedArray.getLayoutDimension(index, setx.setY.setFloatValues));
                    break;
                case 22:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(22, setUiOptions[typedArray.getInt(index, setx.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0)]);
                    break;
                case 23:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(23, typedArray.getLayoutDimension(index, setx.setY.setShrinkMotionSpec));
                    break;
                case 24:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(24, typedArray.getDimensionPixelSize(index, setx.setY.setAdapter));
                    break;
                case 27:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(27, typedArray.getInt(index, setx.setY.setFilterRedundantCalls));
                    break;
                case 28:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(28, typedArray.getDimensionPixelSize(index, setx.setY.onActivityResumed));
                    break;
                case 31:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(31, typedArray.getDimensionPixelSize(index, setx.setY.createDispatcher));
                    break;
                case 34:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(34, typedArray.getDimensionPixelSize(index, setx.setY.setRevealInfo));
                    break;
                case 37:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(37, typedArray.getFloat(index, setx.setY.setNavigationIconTint));
                    break;
                case setExpandedTitleMargin.setY.setSupportCheckMarkTintList /* 38 */:
                    setx.setIconTintList = typedArray.getResourceId(index, setx.setIconTintList);
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(38, setx.setIconTintList);
                    break;
                case setExpandedTitleMargin.setY.setVelocityScale /* 39 */:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(39, typedArray.getFloat(index, setx.setY.setSuffixText));
                    break;
                case setExpandedTitleMargin.setY.setRightEdgeEffectColor /* 40 */:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(40, typedArray.getFloat(index, setx.setY.ActionMenuPresenter$SavedState$1));
                    break;
                case setExpandedTitleMargin.setY.setHorizontalScrollbarTrackDrawable /* 41 */:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(41, typedArray.getInt(index, setx.setY.setConstraintSet));
                    break;
                case setExpandedTitleMargin.setY.setOnKeyListener /* 42 */:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(42, typedArray.getInt(index, setx.setY.setEmptyView));
                    break;
                case setExpandedTitleMargin.setY.setForegroundTintList /* 43 */:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(43, typedArray.getFloat(index, setx.setLayoutAnimation.setY));
                    break;
                case setExpandedTitleMargin.setY.setRecyclerListener /* 44 */:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(44, true);
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(44, typedArray.getDimension(index, setx.setOnLongClickListener.setIconTintList));
                    break;
                case setExpandedTitleMargin.setY.setPreferKeepClearRects /* 45 */:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(45, typedArray.getFloat(index, setx.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0));
                    break;
                case setExpandedTitleMargin.setY.setInterpolator /* 46 */:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(46, typedArray.getFloat(index, setx.setOnLongClickListener.setOnLongClickListener));
                    break;
                case setExpandedTitleMargin.setY.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 /* 47 */:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(47, typedArray.getFloat(index, setx.setOnLongClickListener.setLayoutAnimation));
                    break;
                case setExpandedTitleMargin.setY.ParcelableSparseArray$1 /* 48 */:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(48, typedArray.getFloat(index, setx.setOnLongClickListener.setUiOptions));
                    break;
                case setExpandedTitleMargin.setY.setAutoLinkMask /* 49 */:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(49, typedArray.getDimension(index, setx.setOnLongClickListener.setUnboundedRipple));
                    break;
                case setExpandedTitleMargin.setY.setOrientation /* 50 */:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(50, typedArray.getDimension(index, setx.setOnLongClickListener.setTextAlignment));
                    break;
                case 51:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(51, typedArray.getDimension(index, setx.setOnLongClickListener.ViewPager$SavedState$1));
                    break;
                case setExpandedTitleMargin.setY.setSupportCompoundDrawablesTintList /* 52 */:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(52, typedArray.getDimension(index, setx.setOnLongClickListener.setIconSize));
                    break;
                case setExpandedTitleMargin.setY.setScrollingCacheEnabled /* 53 */:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(53, typedArray.getDimension(index, setx.setOnLongClickListener.setCenterIfNoTextEnabled));
                    break;
                case 54:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(54, typedArray.getInt(index, setx.setY.setSubmitButtonEnabled));
                    break;
                case 55:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(55, typedArray.getInt(index, setx.setY.setChipIconTintResource));
                    break;
                case 56:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(56, typedArray.getDimensionPixelSize(index, setx.setY.TextInputLayout$SavedState$1));
                    break;
                case 57:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(57, typedArray.getDimensionPixelSize(index, setx.setY.FloatingActionButton$BaseBehavior));
                    break;
                case 58:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(58, typedArray.getDimensionPixelSize(index, setx.setY.setChipIconEnabledResource));
                    break;
                case 59:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(59, typedArray.getDimensionPixelSize(index, setx.setY.setContentScrimResource));
                    break;
                case 60:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(60, typedArray.getFloat(index, setx.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1));
                    break;
                case 62:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(62, typedArray.getDimensionPixelSize(index, setx.setY.setLayoutAnimation));
                    break;
                case 63:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(63, typedArray.getFloat(index, setx.setY.setOnLongClickListener));
                    break;
                case 64:
                    int resourceId = typedArray.getResourceId(index, setx.setUiOptions.setY);
                    if (resourceId == -1) {
                        resourceId = typedArray.getInt(index, -1);
                    }
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(64, resourceId);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setY(65, typedArray.getString(index));
                        break;
                    } else {
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setY(65, joinThreadPool.setY[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(67, typedArray.getFloat(index, setx.setUiOptions.setOnLongClickListener));
                    break;
                case 68:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(68, typedArray.getFloat(index, setx.setLayoutAnimation.setIconTintList));
                    break;
                case 69:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(72, typedArray.getInt(index, setx.setY.setImageTintMode));
                    break;
                case 73:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(73, typedArray.getDimensionPixelSize(index, setx.setY.setChipIconEnabled));
                    break;
                case 74:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setY(74, typedArray.getString(index));
                    break;
                case 75:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(75, typedArray.getBoolean(index, setx.setY.setSelectedChildViewEnabled));
                    break;
                case 76:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(76, typedArray.getInt(index, setx.setUiOptions.setUiOptions));
                    break;
                case 77:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setY(77, typedArray.getString(index));
                    break;
                case 78:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(78, typedArray.getInt(index, setx.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1));
                    break;
                case 79:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(79, typedArray.getFloat(index, setx.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1));
                    break;
                case 80:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(80, typedArray.getBoolean(index, setx.setY.setTextAlignment));
                    break;
                case 81:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(81, typedArray.getBoolean(index, setx.setY.ViewPager$SavedState$1));
                    break;
                case 82:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(82, typedArray.getInteger(index, setx.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0));
                    break;
                case 83:
                    int resourceId2 = typedArray.getResourceId(index, setx.setOnLongClickListener.setNavigationOnClickListener);
                    if (resourceId2 == -1) {
                        resourceId2 = typedArray.getInt(index, -1);
                    }
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(83, resourceId2);
                    break;
                case 84:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(84, typedArray.getInteger(index, setx.setUiOptions.ViewPager$SavedState$1));
                    break;
                case 85:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setX(85, typedArray.getFloat(index, setx.setUiOptions.setIconSize));
                    break;
                case 86:
                    TypedValue peekValue = typedArray.peekValue(index);
                    if (peekValue.type == 1) {
                        setx.setUiOptions.setUnboundedRipple = typedArray.getResourceId(index, -1);
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(89, setx.setUiOptions.setUnboundedRipple);
                        if (setx.setUiOptions.setUnboundedRipple != -1) {
                            setx.setUiOptions.setLayoutAnimation = -2;
                            withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(88, setx.setUiOptions.setLayoutAnimation);
                            break;
                        } else {
                            break;
                        }
                    } else if (peekValue.type == 3) {
                        setx.setUiOptions.setNavigationOnClickListener = typedArray.getString(index);
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setY(90, setx.setUiOptions.setNavigationOnClickListener);
                        if (setx.setUiOptions.setNavigationOnClickListener.indexOf("/") > 0) {
                            setx.setUiOptions.setUnboundedRipple = typedArray.getResourceId(index, -1);
                            withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(89, setx.setUiOptions.setUnboundedRipple);
                            setx.setUiOptions.setLayoutAnimation = -2;
                            withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(88, setx.setUiOptions.setLayoutAnimation);
                            break;
                        } else {
                            setx.setUiOptions.setLayoutAnimation = -1;
                            withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(88, setx.setUiOptions.setLayoutAnimation);
                            break;
                        }
                    } else {
                        setx.setUiOptions.setLayoutAnimation = typedArray.getInteger(index, setx.setUiOptions.setUnboundedRipple);
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(88, setx.setUiOptions.setLayoutAnimation);
                        break;
                    }
                case 87:
                    StringBuilder sb2 = new StringBuilder("unused attribute 0x");
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(setNavigationOnClickListener.get(index));
                    Log.w("ConstraintSet", sb2.toString());
                    break;
                case 93:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(93, typedArray.getDimensionPixelSize(index, setx.setY.setX));
                    break;
                case 94:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(94, typedArray.getDimensionPixelSize(index, setx.setY.setOnNavigationItemSelectedListener));
                    break;
                case 95:
                    MenuHostHelper$$ExternalSyntheticLambda0(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1, typedArray, index, 0);
                    break;
                case 96:
                    MenuHostHelper$$ExternalSyntheticLambda0(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1, typedArray, index, 1);
                    break;
                case 97:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(97, typedArray.getInt(index, setx.setY.setHint));
                    break;
                case 98:
                    if (setSubtitle.setIconTintList) {
                        setx.setIconTintList = typedArray.getResourceId(index, setx.setIconTintList);
                        if (setx.setIconTintList == -1) {
                            setx.MenuHostHelper$$ExternalSyntheticLambda1 = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        setx.MenuHostHelper$$ExternalSyntheticLambda1 = typedArray.getString(index);
                        break;
                    } else {
                        setx.setIconTintList = typedArray.getResourceId(index, setx.setIconTintList);
                        break;
                    }
                case 99:
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(99, typedArray.getBoolean(index, setx.setY.ExtendableSavedState$1));
                    break;
            }
        }
    }

    private static int[] setX(View view, String str) {
        int i;
        Object x;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = setExpandedTitleMargin.setX.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof setMIndicatorOptions) && (x = ((setMIndicatorOptions) view.getParent()).setX(trim)) != null && (x instanceof Integer)) {
                i = ((Integer) x).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public static /* synthetic */ int MenuHostHelper$$ExternalSyntheticLambda1(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public static /* synthetic */ void setIconTintList(setX setx, int i, int i2) {
        if (i == 6) {
            setx.setY.setCenterIfNoTextEnabled = i2;
        } else if (i == 7) {
            setx.setY.setIconSize = i2;
        } else if (i == 8) {
            setx.setY.setTextScaleX = i2;
        } else if (i == 27) {
            setx.setY.setFilterRedundantCalls = i2;
        } else if (i == 28) {
            setx.setY.onActivityResumed = i2;
        } else if (i == 41) {
            setx.setY.setConstraintSet = i2;
        } else if (i == 42) {
            setx.setY.setEmptyView = i2;
        } else if (i == 61) {
            setx.setY.setNavigationOnClickListener = i2;
        } else if (i == 62) {
            setx.setY.setLayoutAnimation = i2;
        } else if (i == 72) {
            setx.setY.setImageTintMode = i2;
        } else if (i == 73) {
            setx.setY.setChipIconEnabled = i2;
        } else if (i == 2) {
            setx.setY.MenuHostHelper$$ExternalSyntheticLambda1 = i2;
        } else if (i == 31) {
            setx.setY.createDispatcher = i2;
        } else if (i == 34) {
            setx.setY.setRevealInfo = i2;
        } else if (i == 38) {
            setx.setIconTintList = i2;
        } else if (i == 64) {
            setx.setUiOptions.setY = i2;
        } else if (i == 66) {
            setx.setUiOptions.setX = i2;
        } else if (i == 76) {
            setx.setUiOptions.setUiOptions = i2;
        } else if (i == 78) {
            setx.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1 = i2;
        } else if (i == 97) {
            setx.setY.setHint = i2;
        } else if (i == 93) {
            setx.setY.setX = i2;
        } else if (i != 94) {
            switch (i) {
                case 11:
                    setx.setY.setMaxEms = i2;
                    return;
                case 12:
                    setx.setY.setLayoutDirection = i2;
                    return;
                case 13:
                    setx.setY.setGuidelinePercent = i2;
                    return;
                case 14:
                    setx.setY.setMinAndMaxProgress = i2;
                    return;
                case 15:
                    setx.setY.setCheckedIconEnabled = i2;
                    return;
                case 16:
                    setx.setY.setTextAppearanceResource = i2;
                    return;
                case 17:
                    setx.setY.setHasDecor = i2;
                    return;
                case 18:
                    setx.setY.setIconified = i2;
                    return;
                default:
                    switch (i) {
                        case 21:
                            setx.setY.setFloatValues = i2;
                            return;
                        case 22:
                            setx.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0 = i2;
                            return;
                        case 23:
                            setx.setY.setShrinkMotionSpec = i2;
                            return;
                        case 24:
                            setx.setY.setAdapter = i2;
                            return;
                        default:
                            switch (i) {
                                case 54:
                                    setx.setY.setSubmitButtonEnabled = i2;
                                    return;
                                case 55:
                                    setx.setY.setChipIconTintResource = i2;
                                    return;
                                case 56:
                                    setx.setY.TextInputLayout$SavedState$1 = i2;
                                    return;
                                case 57:
                                    setx.setY.FloatingActionButton$BaseBehavior = i2;
                                    return;
                                case 58:
                                    setx.setY.setChipIconEnabledResource = i2;
                                    return;
                                case 59:
                                    setx.setY.setContentScrimResource = i2;
                                    return;
                                default:
                                    switch (i) {
                                        case 82:
                                            setx.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0 = i2;
                                            return;
                                        case 83:
                                            setx.setOnLongClickListener.setNavigationOnClickListener = i2;
                                            return;
                                        case 84:
                                            setx.setUiOptions.ViewPager$SavedState$1 = i2;
                                            return;
                                        default:
                                            switch (i) {
                                                case 87:
                                                    return;
                                                case 88:
                                                    setx.setUiOptions.setLayoutAnimation = i2;
                                                    return;
                                                case 89:
                                                    setx.setUiOptions.setUnboundedRipple = i2;
                                                    return;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                                    return;
                                            }
                                    }
                            }
                    }
            }
        } else {
            setx.setY.setOnNavigationItemSelectedListener = i2;
        }
    }

    public static /* synthetic */ void setY(setX setx, int i, float f) {
        if (i == 19) {
            setx.setY.SearchView$SavedState$1 = f;
        } else if (i == 20) {
            setx.setY.FragmentStateAdapter$5 = f;
        } else if (i == 37) {
            setx.setY.setNavigationIconTint = f;
        } else if (i == 60) {
            setx.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1 = f;
        } else if (i == 63) {
            setx.setY.setOnLongClickListener = f;
        } else if (i == 79) {
            setx.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1 = f;
        } else if (i == 85) {
            setx.setUiOptions.setIconSize = f;
        } else if (i != 87) {
            if (i == 39) {
                setx.setY.setSuffixText = f;
            } else if (i != 40) {
                switch (i) {
                    case setExpandedTitleMargin.setY.setForegroundTintList /* 43 */:
                        setx.setLayoutAnimation.setY = f;
                        return;
                    case setExpandedTitleMargin.setY.setRecyclerListener /* 44 */:
                        setx.setOnLongClickListener.setIconTintList = f;
                        setx.setOnLongClickListener.setY = true;
                        return;
                    case setExpandedTitleMargin.setY.setPreferKeepClearRects /* 45 */:
                        setx.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0 = f;
                        return;
                    case setExpandedTitleMargin.setY.setInterpolator /* 46 */:
                        setx.setOnLongClickListener.setOnLongClickListener = f;
                        return;
                    case setExpandedTitleMargin.setY.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 /* 47 */:
                        setx.setOnLongClickListener.setLayoutAnimation = f;
                        return;
                    case setExpandedTitleMargin.setY.ParcelableSparseArray$1 /* 48 */:
                        setx.setOnLongClickListener.setUiOptions = f;
                        return;
                    case setExpandedTitleMargin.setY.setAutoLinkMask /* 49 */:
                        setx.setOnLongClickListener.setUnboundedRipple = f;
                        return;
                    case setExpandedTitleMargin.setY.setOrientation /* 50 */:
                        setx.setOnLongClickListener.setTextAlignment = f;
                        return;
                    case 51:
                        setx.setOnLongClickListener.ViewPager$SavedState$1 = f;
                        return;
                    case setExpandedTitleMargin.setY.setSupportCompoundDrawablesTintList /* 52 */:
                        setx.setOnLongClickListener.setIconSize = f;
                        return;
                    case setExpandedTitleMargin.setY.setScrollingCacheEnabled /* 53 */:
                        setx.setOnLongClickListener.setCenterIfNoTextEnabled = f;
                        return;
                    default:
                        switch (i) {
                            case 67:
                                setx.setUiOptions.setOnLongClickListener = f;
                                return;
                            case 68:
                                setx.setLayoutAnimation.setIconTintList = f;
                                return;
                            case 69:
                                setx.setY.RemoteActionCompatParcelizer = f;
                                return;
                            case 70:
                                setx.setY.FragmentStateAdapter$2 = f;
                                return;
                            default:
                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                return;
                        }
                }
            } else {
                setx.setY.ActionMenuPresenter$SavedState$1 = f;
            }
        }
    }

    public static /* synthetic */ void setX(setX setx, int i, String str) {
        if (i == 5) {
            setx.setY.setChipCornerRadius = str;
        } else if (i == 65) {
            setx.setUiOptions.setTextAlignment = str;
        } else if (i == 74) {
            setx.setY.FirebaseRemoteConfigKtxRegistrar = str;
            setx.setY.setTitleMarginEnd = null;
        } else if (i == 77) {
            setx.setY.RecyclerView$SavedState$1 = str;
        } else if (i != 87) {
            if (i == 90) {
                setx.setUiOptions.setNavigationOnClickListener = str;
            } else {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            }
        }
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(setX setx, int i, boolean z) {
        if (i == 44) {
            setx.setOnLongClickListener.setY = z;
        } else if (i == 75) {
            setx.setY.setSelectedChildViewEnabled = z;
        } else if (i != 87) {
            if (i == 80) {
                setx.setY.setTextAlignment = z;
            } else if (i == 81) {
                setx.setY.ViewPager$SavedState$1 = z;
            } else {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            }
        }
    }
}