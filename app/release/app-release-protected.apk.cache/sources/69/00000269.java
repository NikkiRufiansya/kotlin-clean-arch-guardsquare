package o;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$1;
import o.setDecorPadding;
import o.setNormalColor;

/* loaded from: classes.dex */
public class WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 extends ViewGroup implements setFocusedSearchResultHighlightColor {
    static final boolean MenuHostHelper$$ExternalSyntheticLambda0;
    static final boolean setIconTintList;
    private static final Class<?>[] setTitleMarginEnd;
    static final Interpolator setX;
    private EdgeEffect ActionMenuPresenter$SavedState$1;
    final List<setCheckedIconEnabled> ExtendableSavedState$1;
    private int FabTransformationBehavior;
    private boolean FirebaseRemoteConfigKtxRegistrar;
    boolean FloatingActionButton$BaseBehavior;
    private setNavigationOnClickListener.setX Fragment$5;
    setSplitTrack$MenuHostHelper$$ExternalSyntheticLambda0 FragmentStateAdapter$2;
    setAnimationFromJson FragmentStateAdapter$5;
    Parcelable$ClassLoaderCreator MenuHostHelper$$ExternalSyntheticLambda1;
    final setNormalColor RecyclerView$SavedState$1;
    private final int[] RemoteActionCompatParcelizer;
    public List<setChipCornerRadius> SearchView$SavedState$1;
    private boolean TextInputLayout$SavedState$1;
    boolean ViewPager$SavedState$1;
    private int createDispatcher;
    private boolean getCallingPid;
    private setCenterIfNoTextEnabled minusKey;
    private boolean onActivityResumed;
    final Rect setAdapter;
    boolean setAnimationFromJson;
    private setOnNavigationItemSelectedListener setBackgroundTintMode;
    private float setCallingWorkSourceUid;
    int setCenterIfNoTextEnabled;
    boolean setCheckedIconEnabled;
    private EdgeEffect setCheckedIconEnabledResource;
    setIconSize setChipCornerRadius;
    final Runnable setChipIconEnabled;
    private EdgeEffect setChipIconEnabledResource;
    setTextAlignment setChipIconTintResource;
    private final setTextScaleX setChipSpacingHorizontal;
    private setY setChipSpacingVertical;
    private boolean setCloseIconEndPadding;
    final int[] setConstraintSet;
    final setMaxEms setContentScrimResource;
    private int setDelayedApplicationOfInitialState;
    private int setEdgeEffectFactory;
    private int setEmptyView;
    private EdgeEffect setError;
    private float setErrorIconTintList;
    private final setNormalColor.setX setExpandedTitleTextColor;
    private setX setFilterRedundantCalls;
    Month$1 setFilterTouchesWhenObscured;
    public setUiOptions setGuidelinePercent;
    final ArrayList<setIconSize> setHasDecor;
    private int setHint;
    boolean setIconSize;
    final int setIconified;
    final RectF setImageTintMode;
    setBoxBackgroundColorStateList setLayoutAnimation;
    boolean setLayoutDirection;
    private int setLineBreakStyle;
    boolean setMaxEms;
    boolean setMinAndMaxProgress;
    private final int[] setMinEms;
    private final int[] setNavigationIconTint;
    public WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 setNavigationOnClickListener;
    int setObjectValues;
    final AccessibilityManager setOnLongClickListener;
    final ArrayList<setUnboundedRipple> setOnNavigationItemSelectedListener;
    private VelocityTracker setOnScrollChangeListener;
    private boolean setRevealInfo;
    private final Rect setRowOrderPreserved;
    final setLayoutDirection setSelectedChildViewEnabled;
    private final int setSubmitButtonEnabled;
    public List<setCenterIfNoTextEnabled> setSuffixText;
    setSplitTrack setTextAlignment;
    int setTextAppearanceResource;
    public setNavigationOnClickListener setTextScaleX;
    private int setTooltipText;
    setProgressTintMode setUiOptions;
    public boolean setUnboundedRipple;
    final setMinAndMaxProgress setViewTranslationCallback;
    Runnable setZ;
    private static byte[] GridLayoutManager = {86, 48, -68, 79, -21, 2, -22, -5, -2, -3, 46, -61, -20, -7, -14, 7, -17, -14, 62, -29, -52, -7, -14, 7, -27, -4};
    public static final int setFloatValues = 215;
    private static final int[] setShrinkMotionSpec = {16843830};
    static final boolean setY = false;

    /* loaded from: classes.dex */
    public interface setAnimationFromJson {
    }

    /* loaded from: classes.dex */
    public static abstract class setCenterIfNoTextEnabled {
        public void setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, int i) {
        }

        public void setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, int i, int i2) {
        }
    }

    /* loaded from: classes.dex */
    public interface setChipCornerRadius {
        void setY(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class setGuidelinePercent {
        public abstract View MenuHostHelper$$ExternalSyntheticLambda0();
    }

    /* loaded from: classes.dex */
    public interface setIconSize {
        boolean MenuHostHelper$$ExternalSyntheticLambda0(MotionEvent motionEvent);

        void setIconTintList(MotionEvent motionEvent);
    }

    /* loaded from: classes.dex */
    public static abstract class setTextAlignment {
        public abstract boolean MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2);
    }

    /* loaded from: classes.dex */
    public interface setY {
        int MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0078 -> B:15:0x0081). Please submit an issue!!! */
    static {
        /*
            r0 = 26
            byte[] r0 = new byte[r0]
            r0 = {x0088: FILL_ARRAY_DATA  , data: [86, 48, -68, 79, -21, 2, -22, -5, -2, -3, 46, -61, -20, -7, -14, 7, -17, -14, 62, -29, -52, -7, -14, 7, -27, -4} // fill-array
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.GridLayoutManager = r0
            r0 = 215(0xd7, float:3.01E-43)
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setFloatValues = r0
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setShrinkMotionSpec = r1
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setY = r3
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L22
            r1 = 1
            goto L23
        L22:
            r1 = 0
        L23:
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setIconTintList = r1
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.MenuHostHelper$$ExternalSyntheticLambda0 = r0
            r1 = 4
            java.lang.Class[] r4 = new java.lang.Class[r1]
            byte[] r5 = o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.GridLayoutManager
            r6 = 8
            r6 = r5[r6]
            int r6 = r6 + r0
            byte r6 = (byte) r6
            int r7 = r6 + 1
            byte r7 = (byte) r7
            byte r8 = (byte) r7
            int r6 = r6 + r1
            int r8 = r8 * 4
            int r1 = 97 - r8
            r8 = 3
            int r7 = r7 * 3
            int r7 = r7 + r2
            byte[] r2 = new byte[r7]
            int r7 = r7 + (-1)
            if (r5 != 0) goto L4b
            r9 = r6
            r10 = r7
            r11 = 0
            r6 = r5
            r5 = r4
            goto L81
        L4b:
            r9 = r7
            r10 = 0
            r7 = r6
            r6 = r5
            r5 = r4
        L50:
            int r7 = r7 + r0
            byte r11 = (byte) r1
            r2[r10] = r11
            if (r10 != r9) goto L78
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2, r3)
            java.lang.Class r1 = java.lang.Class.forName(r1)
            r4[r3] = r1
            java.lang.Class<android.util.AttributeSet> r1 = android.util.AttributeSet.class
            r5[r0] = r1
            r0 = 2
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r0] = r1
            java.lang.Class r0 = java.lang.Integer.TYPE
            r5[r8] = r0
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setTitleMarginEnd = r5
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$5 r0 = new o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$5
            r0.<init>()
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setX = r0
            return
        L78:
            int r10 = r10 + 1
            r11 = r6[r7]
            r12 = r9
            r9 = r7
            r7 = r11
            r11 = r10
            r10 = r12
        L81:
            int r1 = r1 - r7
            int r1 = r1 + (-8)
            r7 = r9
            r9 = r10
            r10 = r11
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.<clinit>():void");
    }

    public WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0(Context context) {
        this(context, null);
    }

    public WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f040366);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x036a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    final String setX() {
        StringBuilder sb = new StringBuilder(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.setNavigationOnClickListener);
        sb.append(", layout:");
        sb.append(this.setGuidelinePercent);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    public void setAccessibilityDelegateCompat(Parcelable$ClassLoaderCreator parcelable$ClassLoaderCreator) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = parcelable$ClassLoaderCreator;
        setBaselineAlignBottom.setX(this, parcelable$ClassLoaderCreator);
    }

    public void setHasFixedSize(boolean z) {
        this.setCloseIconEndPadding = z;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.setUnboundedRipple) {
            this.setError = null;
            this.setCheckedIconEnabledResource = null;
            this.setChipIconEnabledResource = null;
            this.ActionMenuPresenter$SavedState$1 = null;
        }
        this.setUnboundedRipple = z;
        super.setClipToPadding(z);
        if (this.ViewPager$SavedState$1) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.setUnboundedRipple;
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i);
                sb.append("; using default value");
                Log.w("RecyclerView", sb.toString());
            } else {
                this.setDelayedApplicationOfInitialState = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.setDelayedApplicationOfInitialState = viewConfiguration.getScaledTouchSlop();
    }

    public void setAdapter(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1) {
        setLayoutFrozen(false);
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda12 = this.setNavigationOnClickListener;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda12 != null) {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda12.setX.unregisterObserver(this.setChipSpacingHorizontal);
        }
        setUiOptions();
        setProgressTintMode setprogresstintmode = this.setUiOptions;
        setprogresstintmode.setY(setprogresstintmode.setOnLongClickListener);
        setprogresstintmode.setY(setprogresstintmode.setLayoutAnimation);
        setprogresstintmode.setY = 0;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda13 = this.setNavigationOnClickListener;
        this.setNavigationOnClickListener = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1.setX.registerObserver(this.setChipSpacingHorizontal);
        }
        setUiOptions setuioptions = this.setGuidelinePercent;
        setMaxEms setmaxems = this.setContentScrimResource;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda14 = this.setNavigationOnClickListener;
        setmaxems.setIconTintList.clear();
        setmaxems.setX();
        if (setmaxems.setY == null) {
            setmaxems.setY = new WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$1();
        }
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$1 = setmaxems.setY;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda13 != null) {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0--;
        }
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 == 0) {
            for (int i = 0; i < windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$1.setY.size(); i++) {
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$1.setY.valueAt(i).setX.clear();
            }
        }
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda14 != null) {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0++;
        }
        this.setViewTranslationCallback.setChipCornerRadius = true;
        setY(false);
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setUiOptions() {
        setNavigationOnClickListener setnavigationonclicklistener = this.setTextScaleX;
        if (setnavigationonclicklistener != null) {
            setnavigationonclicklistener.setX();
        }
        setUiOptions setuioptions = this.setGuidelinePercent;
        if (setuioptions != null) {
            setuioptions.setIconTintList(this.setContentScrimResource);
            this.setGuidelinePercent.MenuHostHelper$$ExternalSyntheticLambda1(this.setContentScrimResource);
        }
        setMaxEms setmaxems = this.setContentScrimResource;
        setmaxems.setIconTintList.clear();
        setmaxems.setX();
    }

    public void setRecyclerListener(setAnimationFromJson setanimationfromjson) {
        this.FragmentStateAdapter$5 = setanimationfromjson;
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.setGuidelinePercent != null) {
            return setUiOptions.setTextAlignment();
        }
        return super.getBaseline();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075 A[LOOP:1: B:24:0x0073->B:25:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setLayoutManager(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions r6) {
        /*
            r5 = this;
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setUiOptions r0 = r5.setGuidelinePercent
            if (r6 != r0) goto L5
            return
        L5:
            int r0 = r5.setObjectValues
            r1 = 0
            if (r0 == 0) goto L12
            r5.setObjectValues = r1
            r5.MenuHostHelper$$ExternalSyntheticLambda0()
            r5.setY(r1)
        L12:
            r5.MenuHostHelper$$ExternalSyntheticLambda0()
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setUiOptions r0 = r5.setGuidelinePercent
            if (r0 == 0) goto L4e
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener r0 = r5.setTextScaleX
            if (r0 == 0) goto L20
            r0.setX()
        L20:
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setUiOptions r0 = r5.setGuidelinePercent
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMaxEms r2 = r5.setContentScrimResource
            r0.setIconTintList(r2)
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setUiOptions r0 = r5.setGuidelinePercent
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMaxEms r2 = r5.setContentScrimResource
            r0.MenuHostHelper$$ExternalSyntheticLambda1(r2)
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMaxEms r0 = r5.setContentScrimResource
            java.util.ArrayList<o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled> r2 = r0.setIconTintList
            r2.clear()
            r0.setX()
            boolean r0 = r5.setMaxEms
            if (r0 == 0) goto L45
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setUiOptions r0 = r5.setGuidelinePercent
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMaxEms r2 = r5.setContentScrimResource
            r0.setTextAlignment = r1
            r0.MenuHostHelper$$ExternalSyntheticLambda0(r5, r2)
        L45:
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setUiOptions r0 = r5.setGuidelinePercent
            r1 = 0
            r0.setX(r1)
            r5.setGuidelinePercent = r1
            goto L58
        L4e:
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMaxEms r0 = r5.setContentScrimResource
            java.util.ArrayList<o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled> r1 = r0.setIconTintList
            r1.clear()
            r0.setX()
        L58:
            o.setBoxBackgroundColorStateList r0 = r5.setLayoutAnimation
            o.setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0 r1 = r0.MenuHostHelper$$ExternalSyntheticLambda1
            r2 = 0
            r1.setIconTintList = r2
            o.setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0 r1 = r1.MenuHostHelper$$ExternalSyntheticLambda1
            if (r1 == 0) goto L6b
        L64:
            r1.setIconTintList = r2
            o.setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0 r1 = r1.MenuHostHelper$$ExternalSyntheticLambda1
            if (r1 == 0) goto L6b
            goto L64
        L6b:
            java.util.List<android.view.View> r1 = r0.setX
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
        L73:
            if (r1 < 0) goto L8a
            o.setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda1 r3 = r0.setY
            java.util.List<android.view.View> r4 = r0.setX
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            r3.setY(r4)
            java.util.List<android.view.View> r3 = r0.setX
            r3.remove(r1)
            int r1 = r1 + (-1)
            goto L73
        L8a:
            o.setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda1 r0 = r0.setY
            r0.MenuHostHelper$$ExternalSyntheticLambda1()
            r5.setGuidelinePercent = r6
            if (r6 == 0) goto Lc7
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 r0 = r6.setMaxEms
            if (r0 != 0) goto La5
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setUiOptions r6 = r5.setGuidelinePercent
            r6.setX(r5)
            boolean r6 = r5.setMaxEms
            if (r6 == 0) goto Lc7
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setUiOptions r6 = r5.setGuidelinePercent
            r6.setTextAlignment = r2
            goto Lc7
        La5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LayoutManager "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = " is already attached to a RecyclerView:"
            r0.append(r1)
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 r6 = r6.setMaxEms
            java.lang.String r6 = r6.setX()
            r0.append(r6)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        Lc7:
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMaxEms r6 = r5.setContentScrimResource
            r6.MenuHostHelper$$ExternalSyntheticLambda0()
            r5.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutManager(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setUiOptions):void");
    }

    public void setOnFlingListener(setTextAlignment settextalignment) {
        this.setChipIconTintResource = settextalignment;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        setOnNavigationItemSelectedListener setonnavigationitemselectedlistener = new setOnNavigationItemSelectedListener(super.onSaveInstanceState());
        setOnNavigationItemSelectedListener setonnavigationitemselectedlistener2 = this.setBackgroundTintMode;
        if (setonnavigationitemselectedlistener2 == null) {
            setUiOptions setuioptions = this.setGuidelinePercent;
            if (setuioptions != null) {
                setonnavigationitemselectedlistener.setX = setuioptions.setNavigationOnClickListener();
            } else {
                setonnavigationitemselectedlistener.setX = null;
            }
        } else {
            setonnavigationitemselectedlistener.setX = setonnavigationitemselectedlistener2.setX;
        }
        return setonnavigationitemselectedlistener;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof setOnNavigationItemSelectedListener)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        setOnNavigationItemSelectedListener setonnavigationitemselectedlistener = (setOnNavigationItemSelectedListener) parcelable;
        this.setBackgroundTintMode = setonnavigationitemselectedlistener;
        super.onRestoreInstanceState(setonnavigationitemselectedlistener.setUiOptions);
        if (this.setGuidelinePercent == null || this.setBackgroundTintMode.setX == null) {
            return;
        }
        this.setGuidelinePercent.MenuHostHelper$$ExternalSyntheticLambda0(this.setBackgroundTintMode.setX);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    void setY(setCheckedIconEnabled setcheckediconenabled) {
        View view = setcheckediconenabled.setIconTintList;
        boolean z = view.getParent() == this;
        this.setContentScrimResource.setIconTintList(setOnLongClickListener(view));
        if ((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 256) != 0) {
            this.setLayoutAnimation.setIconTintList(view, -1, view.getLayoutParams(), true);
        } else if (z) {
            setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
            int MenuHostHelper$$ExternalSyntheticLambda1 = setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda1(view);
            if (MenuHostHelper$$ExternalSyntheticLambda1 < 0) {
                StringBuilder sb = new StringBuilder("view is not a child, cannot hide ");
                sb.append(view);
                throw new IllegalArgumentException(sb.toString());
            }
            setboxbackgroundcolorstatelist.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1);
            setboxbackgroundcolorstatelist.setX.add(view);
            setboxbackgroundcolorstatelist.setY.setIconTintList(view);
        } else {
            this.setLayoutAnimation.setY(view, -1, true);
        }
    }

    public void setRecycledViewPool(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$1) {
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$12;
        setMaxEms setmaxems = this.setContentScrimResource;
        if (setmaxems.setY != null) {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$12.MenuHostHelper$$ExternalSyntheticLambda0--;
        }
        setmaxems.setY = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$1;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$1 == null || WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setNavigationOnClickListener == null) {
            return;
        }
        setmaxems.setY.MenuHostHelper$$ExternalSyntheticLambda0++;
    }

    public void setViewCacheExtension(setGuidelinePercent setguidelinepercent) {
        this.setContentScrimResource.setLayoutAnimation = setguidelinepercent;
    }

    public void setItemViewCacheSize(int i) {
        setMaxEms setmaxems = this.setContentScrimResource;
        setmaxems.setX = i;
        setmaxems.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    public final void setIconTintList(setUnboundedRipple setunboundedripple) {
        setUiOptions setuioptions = this.setGuidelinePercent;
        if (setuioptions != null) {
            setuioptions.MenuHostHelper$$ExternalSyntheticLambda1("Cannot add item decoration during a scroll  or layout");
        }
        if (this.setOnNavigationItemSelectedListener.isEmpty()) {
            setWillNotDraw(false);
        }
        this.setOnNavigationItemSelectedListener.add(setunboundedripple);
        setUnboundedRipple();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(setY sety) {
        if (sety == this.setChipSpacingVertical) {
            return;
        }
        this.setChipSpacingVertical = sety;
        setChildrenDrawingOrderEnabled(sety != null);
    }

    @Deprecated
    public void setOnScrollListener(setCenterIfNoTextEnabled setcenterifnotextenabled) {
        this.minusKey = setcenterifnotextenabled;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        if (this.setLayoutDirection) {
            return;
        }
        if (this.setObjectValues != 0) {
            this.setObjectValues = 0;
            MenuHostHelper$$ExternalSyntheticLambda0();
            setY(0);
        }
        MenuHostHelper$$ExternalSyntheticLambda0();
        setUiOptions setuioptions = this.setGuidelinePercent;
        if (setuioptions == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        setuioptions.setX(i);
        awakenScrollBars();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(int i) {
        if (this.setGuidelinePercent == null) {
            return;
        }
        if (2 != this.setObjectValues) {
            this.setObjectValues = 2;
            setY(2);
        }
        this.setGuidelinePercent.setX(i);
        awakenScrollBars();
    }

    public final void setIconTintList(int i) {
        if (this.setLayoutDirection) {
            return;
        }
        setUiOptions setuioptions = this.setGuidelinePercent;
        if (setuioptions == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            setuioptions.setX(this, i);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        setUiOptions setuioptions = this.setGuidelinePercent;
        if (setuioptions == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.setLayoutDirection) {
        } else {
            boolean MenuHostHelper$$ExternalSyntheticLambda1 = setuioptions.MenuHostHelper$$ExternalSyntheticLambda1();
            boolean iconTintList = this.setGuidelinePercent.setIconTintList();
            if (MenuHostHelper$$ExternalSyntheticLambda1 || iconTintList) {
                if (!MenuHostHelper$$ExternalSyntheticLambda1) {
                    i = 0;
                }
                if (!iconTintList) {
                    i2 = 0;
                }
                setIconTintList(i, i2, null);
            }
        }
    }

    final void setIconTintList() {
        if (!this.ViewPager$SavedState$1 || this.setIconSize) {
            setItemAnimator.MenuHostHelper$$ExternalSyntheticLambda0("RV FullInvalidate");
            ViewPager$SavedState$1();
            setItemAnimator.MenuHostHelper$$ExternalSyntheticLambda0();
            return;
        }
        if (this.setUiOptions.setOnLongClickListener.size() > 0) {
            int i = this.setUiOptions.setY;
            if (this.setUiOptions.setOnLongClickListener.size() > 0) {
                setItemAnimator.MenuHostHelper$$ExternalSyntheticLambda0("RV FullInvalidate");
                ViewPager$SavedState$1();
                setItemAnimator.MenuHostHelper$$ExternalSyntheticLambda0();
            }
        }
    }

    private boolean setIconTintList(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        setIconTintList();
        if (this.setNavigationOnClickListener != null) {
            int[] iArr = this.setConstraintSet;
            iArr[0] = 0;
            iArr[1] = 0;
            setY(i, i2, iArr);
            int[] iArr2 = this.setConstraintSet;
            int i7 = iArr2[0];
            int i8 = iArr2[1];
            i3 = i8;
            i4 = i7;
            i5 = i - i7;
            i6 = i2 - i8;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (!this.setOnNavigationItemSelectedListener.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.setConstraintSet;
        iArr3[0] = 0;
        iArr3[1] = 0;
        MenuHostHelper$$ExternalSyntheticLambda1(i4, i3, i5, i6, this.setMinEms, 0, iArr3);
        int[] iArr4 = this.setConstraintSet;
        int i9 = iArr4[0];
        int i10 = iArr4[1];
        boolean z = (i9 == 0 && i10 == 0) ? false : true;
        int i11 = this.setLineBreakStyle;
        int[] iArr5 = this.setMinEms;
        int i12 = iArr5[0];
        this.setLineBreakStyle = i11 - i12;
        int i13 = this.setEmptyView;
        int i14 = iArr5[1];
        this.setEmptyView = i13 - i14;
        int[] iArr6 = this.RemoteActionCompatParcelizer;
        iArr6[0] = iArr6[0] + i12;
        iArr6[1] = iArr6[1] + i14;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !setPageTransformer.MenuHostHelper$$ExternalSyntheticLambda1(motionEvent, 8194)) {
                MenuHostHelper$$ExternalSyntheticLambda0(motionEvent.getX(), i5 - i9, motionEvent.getY(), i6 - i10);
            }
            setX(i, i2);
        }
        if (i4 != 0 || i3 != 0) {
            MenuHostHelper$$ExternalSyntheticLambda1(i4, i3);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i4 == 0 && i3 == 0) ? false : true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        setUiOptions setuioptions = this.setGuidelinePercent;
        if (setuioptions != null && setuioptions.MenuHostHelper$$ExternalSyntheticLambda1()) {
            return this.setGuidelinePercent.MenuHostHelper$$ExternalSyntheticLambda1(this.setViewTranslationCallback);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        setUiOptions setuioptions = this.setGuidelinePercent;
        if (setuioptions != null && setuioptions.MenuHostHelper$$ExternalSyntheticLambda1()) {
            return this.setGuidelinePercent.setUiOptions(this.setViewTranslationCallback);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        setUiOptions setuioptions = this.setGuidelinePercent;
        if (setuioptions != null && setuioptions.MenuHostHelper$$ExternalSyntheticLambda1()) {
            return this.setGuidelinePercent.setX(this.setViewTranslationCallback);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        setUiOptions setuioptions = this.setGuidelinePercent;
        if (setuioptions != null && setuioptions.setIconTintList()) {
            return this.setGuidelinePercent.setY(this.setViewTranslationCallback);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        setUiOptions setuioptions = this.setGuidelinePercent;
        if (setuioptions != null && setuioptions.setIconTintList()) {
            return this.setGuidelinePercent.setLayoutAnimation(this.setViewTranslationCallback);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        setUiOptions setuioptions = this.setGuidelinePercent;
        if (setuioptions != null && setuioptions.setIconTintList()) {
            return this.setGuidelinePercent.setIconTintList(this.setViewTranslationCallback);
        }
        return 0;
    }

    void setX(boolean z) {
        if (this.setCenterIfNoTextEnabled <= 0) {
            this.setCenterIfNoTextEnabled = 1;
        }
        if (!z && !this.setLayoutDirection) {
            this.setMinAndMaxProgress = false;
        }
        if (this.setCenterIfNoTextEnabled == 1) {
            if (z && this.setMinAndMaxProgress && !this.setLayoutDirection && this.setGuidelinePercent != null && this.setNavigationOnClickListener != null) {
                ViewPager$SavedState$1();
            }
            if (!this.setLayoutDirection) {
                this.setMinAndMaxProgress = false;
            }
        }
        this.setCenterIfNoTextEnabled--;
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.setLayoutDirection) {
            setY("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.setLayoutDirection = false;
                if (this.setMinAndMaxProgress && this.setGuidelinePercent != null && this.setNavigationOnClickListener != null) {
                    requestLayout();
                }
                this.setMinAndMaxProgress = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.setLayoutDirection = true;
            this.setRevealInfo = true;
            if (this.setObjectValues != 0) {
                this.setObjectValues = 0;
                MenuHostHelper$$ExternalSyntheticLambda0();
                setY(0);
            }
            MenuHostHelper$$ExternalSyntheticLambda0();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.setLayoutDirection;
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        setUiOptions setuioptions = this.setGuidelinePercent;
        if (setuioptions == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.setLayoutDirection) {
        } else {
            if (!setuioptions.MenuHostHelper$$ExternalSyntheticLambda1()) {
                i = 0;
            }
            if (!this.setGuidelinePercent.setIconTintList()) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return;
            }
            if (z) {
                int i4 = i != 0 ? 1 : 0;
                if (i2 != 0) {
                    i4 |= 2;
                }
                if (this.setFilterTouchesWhenObscured == null) {
                    this.setFilterTouchesWhenObscured = new Month$1(this);
                }
                this.setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(i4, 1);
            }
            this.setSelectedChildViewEnabled.MenuHostHelper$$ExternalSyntheticLambda0(i, i2, Integer.MIN_VALUE, null);
        }
    }

    final void MenuHostHelper$$ExternalSyntheticLambda0() {
        setLayoutDirection setlayoutdirection = this.setSelectedChildViewEnabled;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.removeCallbacks(setlayoutdirection);
        setlayoutdirection.setY.abortAnimation();
        setUiOptions setuioptions = this.setGuidelinePercent;
        if (setuioptions != null) {
            setuioptions.setOnNavigationItemSelectedListener();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void MenuHostHelper$$ExternalSyntheticLambda0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L20
            r6.setZ()
            android.widget.EdgeEffect r3 = r6.ActionMenuPresenter$SavedState$1
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            o.setHyphenationFrequency.setY(r3, r4, r9)
            goto L39
        L20:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r6.setAnimationFromJson()
            android.widget.EdgeEffect r3 = r6.setChipIconEnabledResource
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            o.setHyphenationFrequency.setY(r3, r4, r9)
        L39:
            r9 = 1
            goto L3c
        L3b:
            r9 = 0
        L3c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L56
            r6.setOnNavigationItemSelectedListener()
            android.widget.EdgeEffect r9 = r6.setCheckedIconEnabledResource
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            o.setHyphenationFrequency.setY(r9, r0, r7)
            goto L72
        L56:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L71
            r6.setMaxEms()
            android.widget.EdgeEffect r9 = r6.setError
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            o.setHyphenationFrequency.setY(r9, r3, r0)
            goto L72
        L71:
            r1 = r9
        L72:
            if (r1 != 0) goto L7c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            o.setBaselineAlignBottom.FloatingActionButton$BaseBehavior(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.MenuHostHelper$$ExternalSyntheticLambda0(float, float, float, float):void");
    }

    private void setCenterIfNoTextEnabled() {
        boolean z;
        EdgeEffect edgeEffect = this.ActionMenuPresenter$SavedState$1;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.ActionMenuPresenter$SavedState$1.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.setCheckedIconEnabledResource;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.setCheckedIconEnabledResource.isFinished();
        }
        EdgeEffect edgeEffect3 = this.setChipIconEnabledResource;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.setChipIconEnabledResource.isFinished();
        }
        EdgeEffect edgeEffect4 = this.setError;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.setError.isFinished();
        }
        if (z) {
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this);
        }
    }

    final void setX(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.ActionMenuPresenter$SavedState$1;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.ActionMenuPresenter$SavedState$1.onRelease();
            z = this.ActionMenuPresenter$SavedState$1.isFinished();
        }
        EdgeEffect edgeEffect2 = this.setChipIconEnabledResource;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.setChipIconEnabledResource.onRelease();
            z |= this.setChipIconEnabledResource.isFinished();
        }
        EdgeEffect edgeEffect3 = this.setCheckedIconEnabledResource;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.setCheckedIconEnabledResource.onRelease();
            z |= this.setCheckedIconEnabledResource.isFinished();
        }
        EdgeEffect edgeEffect4 = this.setError;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.setError.onRelease();
            z |= this.setError.isFinished();
        }
        if (z) {
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this);
        }
    }

    final void setY(int i, int i2) {
        if (i < 0) {
            setZ();
            if (this.ActionMenuPresenter$SavedState$1.isFinished()) {
                this.ActionMenuPresenter$SavedState$1.onAbsorb(-i);
            }
        } else if (i > 0) {
            setAnimationFromJson();
            if (this.setChipIconEnabledResource.isFinished()) {
                this.setChipIconEnabledResource.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            setOnNavigationItemSelectedListener();
            if (this.setCheckedIconEnabledResource.isFinished()) {
                this.setCheckedIconEnabledResource.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            setMaxEms();
            if (this.setError.isFinished()) {
                this.setError.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this);
    }

    private void setZ() {
        if (this.ActionMenuPresenter$SavedState$1 != null) {
            return;
        }
        EdgeEffect y = setX.setY(this);
        this.ActionMenuPresenter$SavedState$1 = y;
        if (this.setUnboundedRipple) {
            int measuredHeight = getMeasuredHeight();
            int paddingTop = getPaddingTop();
            y.setSize((measuredHeight - paddingTop) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            return;
        }
        y.setSize(getMeasuredHeight(), getMeasuredWidth());
    }

    private void setAnimationFromJson() {
        if (this.setChipIconEnabledResource != null) {
            return;
        }
        EdgeEffect y = setX.setY(this);
        this.setChipIconEnabledResource = y;
        if (this.setUnboundedRipple) {
            int measuredHeight = getMeasuredHeight();
            int paddingTop = getPaddingTop();
            y.setSize((measuredHeight - paddingTop) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            return;
        }
        y.setSize(getMeasuredHeight(), getMeasuredWidth());
    }

    private void setOnNavigationItemSelectedListener() {
        if (this.setCheckedIconEnabledResource != null) {
            return;
        }
        EdgeEffect y = setX.setY(this);
        this.setCheckedIconEnabledResource = y;
        if (this.setUnboundedRipple) {
            int measuredWidth = getMeasuredWidth();
            int paddingLeft = getPaddingLeft();
            y.setSize((measuredWidth - paddingLeft) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            return;
        }
        y.setSize(getMeasuredWidth(), getMeasuredHeight());
    }

    private void setMaxEms() {
        if (this.setError != null) {
            return;
        }
        EdgeEffect y = setX.setY(this);
        this.setError = y;
        if (this.setUnboundedRipple) {
            int measuredWidth = getMeasuredWidth();
            int paddingLeft = getPaddingLeft();
            y.setSize((measuredWidth - paddingLeft) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            return;
        }
        y.setSize(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setEdgeEffectFactory(setX setx) {
        this.setFilterRedundantCalls = setx;
        this.setError = null;
        this.setCheckedIconEnabledResource = null;
        this.setChipIconEnabledResource = null;
        this.ActionMenuPresenter$SavedState$1 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x01ba, code lost:
        if (r8 > 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01d8, code lost:
        if (r10 > 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01db, code lost:
        if (r8 < 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01de, code lost:
        if (r10 < 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01e7, code lost:
        if ((r10 * r1) < 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01f0, code lost:
        if ((r10 * r1) > 0) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012d  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        setZ setz = this.setGuidelinePercent.setAnimationFromJson;
        boolean z = true;
        if (!(setz != null && setz.setUiOptions)) {
            if (!(this.setTextAppearanceResource > 0)) {
                z = false;
            }
        }
        if (!z && view2 != null) {
            setX(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    private void setX(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.setAdapter.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof setLayoutAnimation) {
            setLayoutAnimation setlayoutanimation = (setLayoutAnimation) layoutParams;
            if (!setlayoutanimation.setX) {
                Rect rect = setlayoutanimation.setIconTintList;
                this.setAdapter.left -= rect.left;
                this.setAdapter.right += rect.right;
                this.setAdapter.top -= rect.top;
                this.setAdapter.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.setAdapter);
            offsetRectIntoDescendantCoords(view, this.setAdapter);
        }
        this.setGuidelinePercent.MenuHostHelper$$ExternalSyntheticLambda1(this, view, this.setAdapter, !this.ViewPager$SavedState$1, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.setGuidelinePercent.MenuHostHelper$$ExternalSyntheticLambda1(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r0 < 30.0f) goto L19;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.setTextAppearanceResource = r0
            r1 = 1
            r4.setMaxEms = r1
            boolean r2 = r4.ViewPager$SavedState$1
            if (r2 == 0) goto L16
            boolean r2 = r4.isLayoutRequested()
            if (r2 == 0) goto L14
            goto L16
        L14:
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            r4.ViewPager$SavedState$1 = r2
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setUiOptions r2 = r4.setGuidelinePercent
            if (r2 == 0) goto L1f
            r2.setTextAlignment = r1
        L1f:
            r4.FloatingActionButton$BaseBehavior = r0
            boolean r0 = o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.MenuHostHelper$$ExternalSyntheticLambda0
            if (r0 == 0) goto L67
            java.lang.ThreadLocal<o.setSplitTrack> r0 = o.setSplitTrack.setY
            java.lang.Object r0 = r0.get()
            o.setSplitTrack r0 = (o.setSplitTrack) r0
            r4.setTextAlignment = r0
            if (r0 != 0) goto L60
            o.setSplitTrack r0 = new o.setSplitTrack
            r0.<init>()
            r4.setTextAlignment = r0
            android.view.Display r0 = o.setBaselineAlignBottom.setUnboundedRipple(r4)
            boolean r1 = r4.isInEditMode()
            if (r1 != 0) goto L4e
            if (r0 == 0) goto L4e
            float r0 = r0.getRefreshRate()
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L50
        L4e:
            r0 = 1114636288(0x42700000, float:60.0)
        L50:
            o.setSplitTrack r1 = r4.setTextAlignment
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.MenuHostHelper$$ExternalSyntheticLambda0 = r2
            java.lang.ThreadLocal<o.setSplitTrack> r0 = o.setSplitTrack.setY
            o.setSplitTrack r1 = r4.setTextAlignment
            r0.set(r1)
        L60:
            o.setSplitTrack r0 = r4.setTextAlignment
            java.util.ArrayList<o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0> r0 = r0.setIconTintList
            r0.add(r4)
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        setSplitTrack setsplittrack;
        super.onDetachedFromWindow();
        setNavigationOnClickListener setnavigationonclicklistener = this.setTextScaleX;
        if (setnavigationonclicklistener != null) {
            setnavigationonclicklistener.setX();
        }
        if (this.setObjectValues != 0) {
            this.setObjectValues = 0;
            MenuHostHelper$$ExternalSyntheticLambda0();
            setY(0);
        }
        MenuHostHelper$$ExternalSyntheticLambda0();
        this.setMaxEms = false;
        setUiOptions setuioptions = this.setGuidelinePercent;
        if (setuioptions != null) {
            setMaxEms setmaxems = this.setContentScrimResource;
            setuioptions.setTextAlignment = false;
            setuioptions.MenuHostHelper$$ExternalSyntheticLambda0(this, setmaxems);
        }
        this.ExtendableSavedState$1.clear();
        removeCallbacks(this.setZ);
        setNormalColor.setY.setIconTintList();
        if (!MenuHostHelper$$ExternalSyntheticLambda0 || (setsplittrack = this.setTextAlignment) == null) {
            return;
        }
        setsplittrack.setIconTintList.remove(this);
        this.setTextAlignment = null;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.setMaxEms;
    }

    private boolean setX(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.setHasDecor.size();
        for (int i = 0; i < size; i++) {
            setIconSize seticonsize = this.setHasDecor.get(i);
            if (seticonsize.MenuHostHelper$$ExternalSyntheticLambda0(motionEvent) && action != 3) {
                this.setChipCornerRadius = seticonsize;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.setLayoutDirection) {
            return false;
        }
        this.setChipCornerRadius = null;
        if (setX(motionEvent)) {
            setOnLongClickListener();
            return true;
        }
        setUiOptions setuioptions = this.setGuidelinePercent;
        if (setuioptions == null) {
            return false;
        }
        boolean MenuHostHelper$$ExternalSyntheticLambda1 = setuioptions.MenuHostHelper$$ExternalSyntheticLambda1();
        boolean iconTintList = this.setGuidelinePercent.setIconTintList();
        if (this.setOnScrollChangeListener == null) {
            this.setOnScrollChangeListener = VelocityTracker.obtain();
        }
        this.setOnScrollChangeListener.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.setRevealInfo) {
                this.setRevealInfo = false;
            }
            this.setEdgeEffectFactory = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.setLineBreakStyle = x;
            this.FabTransformationBehavior = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.setEmptyView = y;
            this.createDispatcher = y;
            if (this.setObjectValues == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (1 != this.setObjectValues) {
                    this.setObjectValues = 1;
                    MenuHostHelper$$ExternalSyntheticLambda0();
                    setY(1);
                }
                if (this.setFilterTouchesWhenObscured == null) {
                    this.setFilterTouchesWhenObscured = new Month$1(this);
                }
                this.setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(1);
            }
            int[] iArr = this.RemoteActionCompatParcelizer;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = MenuHostHelper$$ExternalSyntheticLambda1;
            if (iconTintList) {
                i = (MenuHostHelper$$ExternalSyntheticLambda1 ? 1 : 0) | true;
            }
            if (this.setFilterTouchesWhenObscured == null) {
                this.setFilterTouchesWhenObscured = new Month$1(this);
            }
            this.setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(i, 0);
        } else if (actionMasked == 1) {
            this.setOnScrollChangeListener.clear();
            if (this.setFilterTouchesWhenObscured == null) {
                this.setFilterTouchesWhenObscured = new Month$1(this);
            }
            this.setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.setEdgeEffectFactory);
            if (findPointerIndex < 0) {
                StringBuilder sb = new StringBuilder("Error processing scroll; pointer index for id ");
                sb.append(this.setEdgeEffectFactory);
                sb.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", sb.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.setObjectValues != 1) {
                int i2 = this.FabTransformationBehavior;
                int i3 = this.createDispatcher;
                if (!MenuHostHelper$$ExternalSyntheticLambda1 || Math.abs(x2 - i2) <= this.setDelayedApplicationOfInitialState) {
                    z = false;
                } else {
                    this.setLineBreakStyle = x2;
                    z = true;
                }
                if (iconTintList && Math.abs(y2 - i3) > this.setDelayedApplicationOfInitialState) {
                    this.setEmptyView = y2;
                    z = true;
                }
                if (z && 1 != this.setObjectValues) {
                    this.setObjectValues = 1;
                    MenuHostHelper$$ExternalSyntheticLambda0();
                    setY(1);
                }
            }
        } else if (actionMasked == 3) {
            setOnLongClickListener();
        } else if (actionMasked == 5) {
            this.setEdgeEffectFactory = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.setLineBreakStyle = x3;
            this.FabTransformationBehavior = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.setEmptyView = y3;
            this.createDispatcher = y3;
        } else if (actionMasked == 6) {
            setIconTintList(motionEvent);
        }
        return this.setObjectValues == 1;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.setHasDecor.size();
        for (int i = 0; i < size; i++) {
            this.setHasDecor.get(i);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0290, code lost:
        if (r0 != false) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9  */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void setIconTintList(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.setEdgeEffectFactory) {
            int i = actionIndex == 0 ? 1 : 0;
            this.setEdgeEffectFactory = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.setLineBreakStyle = x;
            this.FabTransformationBehavior = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.setEmptyView = y;
            this.createDispatcher = y;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setUiOptions r0 = r5.setGuidelinePercent
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.setLayoutDirection
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L76
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setUiOptions r0 = r5.setGuidelinePercent
            boolean r0 = r0.setIconTintList()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setUiOptions r3 = r5.setGuidelinePercent
            boolean r3 = r3.MenuHostHelper$$ExternalSyntheticLambda1()
            if (r3 == 0) goto L60
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L61
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L5f
            r0 = 26
            float r3 = r6.getAxisValue(r0)
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setUiOptions r0 = r5.setGuidelinePercent
            boolean r0 = r0.setIconTintList()
            if (r0 == 0) goto L55
            float r0 = -r3
            goto L60
        L55:
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setUiOptions r0 = r5.setGuidelinePercent
            boolean r0 = r0.MenuHostHelper$$ExternalSyntheticLambda1()
            if (r0 == 0) goto L5f
            r0 = 0
            goto L61
        L5f:
            r0 = 0
        L60:
            r3 = 0
        L61:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L69
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L76
        L69:
            float r2 = r5.setCallingWorkSourceUid
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.setErrorIconTintList
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.setIconTintList(r2, r0, r6)
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setUiOptions setuioptions = this.setGuidelinePercent;
        if (setuioptions == null) {
            setIconTintList(i, i2);
            return;
        }
        boolean z = false;
        if (setuioptions.setUiOptions()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.setGuidelinePercent.setMaxEms.setIconTintList(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (z || this.setNavigationOnClickListener == null) {
                return;
            }
            if (this.setViewTranslationCallback.setUiOptions == 1) {
                setNavigationOnClickListener();
            }
            this.setGuidelinePercent.setIconTintList(i, i2);
            this.setViewTranslationCallback.setUnboundedRipple = true;
            setChipCornerRadius();
            this.setGuidelinePercent.setOnLongClickListener(i, i2);
            if (this.setGuidelinePercent.setChipCornerRadius()) {
                this.setGuidelinePercent.setIconTintList(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.setViewTranslationCallback.setUnboundedRipple = true;
                setChipCornerRadius();
                this.setGuidelinePercent.setOnLongClickListener(i, i2);
            }
        } else if (!this.setCloseIconEndPadding) {
            if (this.setViewTranslationCallback.setCenterIfNoTextEnabled) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 = this.setNavigationOnClickListener;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                this.setViewTranslationCallback.setLayoutAnimation = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1.setY();
            } else {
                this.setViewTranslationCallback.setLayoutAnimation = 0;
            }
            int i3 = this.setCenterIfNoTextEnabled + 1;
            this.setCenterIfNoTextEnabled = i3;
            if (i3 == 1 && !this.setLayoutDirection) {
                this.setMinAndMaxProgress = false;
            }
            this.setGuidelinePercent.setMaxEms.setIconTintList(i, i2);
            setX(false);
            this.setViewTranslationCallback.setIconTintList = false;
        } else {
            this.setGuidelinePercent.setMaxEms.setIconTintList(i, i2);
        }
    }

    final void setIconTintList(int i, int i2) {
        setMeasuredDimension(setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(i, getPaddingLeft() + getPaddingRight(), setBaselineAlignBottom.setTextScaleX(this)), setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(i2, getPaddingTop() + getPaddingBottom(), setBaselineAlignBottom.setIconSize(this)));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.setError = null;
        this.setCheckedIconEnabledResource = null;
        this.setChipIconEnabledResource = null;
        this.ActionMenuPresenter$SavedState$1 = null;
    }

    public void setItemAnimator(setNavigationOnClickListener setnavigationonclicklistener) {
        setNavigationOnClickListener setnavigationonclicklistener2 = this.setTextScaleX;
        if (setnavigationonclicklistener2 != null) {
            setnavigationonclicklistener2.setX();
            this.setTextScaleX.setUiOptions = null;
        }
        this.setTextScaleX = setnavigationonclicklistener;
        if (setnavigationonclicklistener != null) {
            setnavigationonclicklistener.setUiOptions = this.Fragment$5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        int i = this.setTextAppearanceResource - 1;
        this.setTextAppearanceResource = i;
        if (i <= 0) {
            this.setTextAppearanceResource = 0;
            if (z) {
                setLayoutAnimation();
                setTextScaleX();
            }
        }
    }

    private void setLayoutAnimation() {
        int i = this.setTooltipText;
        boolean z = false;
        this.setTooltipText = 0;
        if (i != 0) {
            AccessibilityManager accessibilityManager = this.setOnLongClickListener;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                z = true;
            }
            if (z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(2048);
                setCircleRadius.MenuHostHelper$$ExternalSyntheticLambda1(obtain, i);
                sendAccessibilityEventUnchecked(obtain);
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    private void ViewPager$SavedState$1() {
        if (this.setNavigationOnClickListener == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.setGuidelinePercent == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            boolean z = false;
            this.setViewTranslationCallback.setUnboundedRipple = false;
            if (this.setViewTranslationCallback.setUiOptions == 1) {
                setNavigationOnClickListener();
            } else {
                setProgressTintMode setprogresstintmode = this.setUiOptions;
                if (!setprogresstintmode.setLayoutAnimation.isEmpty() && !setprogresstintmode.setOnLongClickListener.isEmpty()) {
                    z = true;
                }
                if (!z && this.setGuidelinePercent.setGuidelinePercent == getWidth() && this.setGuidelinePercent.ViewPager$SavedState$1 == getHeight()) {
                    this.setGuidelinePercent.setIconTintList(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
                    setTextAlignment();
                }
            }
            this.setGuidelinePercent.setIconTintList(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            setChipCornerRadius();
            setTextAlignment();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x028b, code lost:
        if (r6 == 8) goto L212;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0609 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x044f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0432 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ab  */
    /* JADX WARN: Type inference failed for: r4v55, types: [o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled] */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v63, types: [o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r5v27, types: [o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0] */
    /* JADX WARN: Type inference failed for: r6v10, types: [o.setNormalColor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setNavigationOnClickListener() {
        /*
            Method dump skipped, instructions count: 1569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x02c0, code lost:
        if (r17.setLayoutAnimation.setX.contains(getFocusedChild()) != false) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x039a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setTextAlignment() {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setTextAlignment():void");
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(int[] iArr) {
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
        int MenuHostHelper$$ExternalSyntheticLambda02 = setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size();
        if (MenuHostHelper$$ExternalSyntheticLambda02 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < MenuHostHelper$$ExternalSyntheticLambda02; i3++) {
            setBoxBackgroundColorStateList setboxbackgroundcolorstatelist2 = this.setLayoutAnimation;
            View MenuHostHelper$$ExternalSyntheticLambda1 = setboxbackgroundcolorstatelist2.setY.MenuHostHelper$$ExternalSyntheticLambda1(setboxbackgroundcolorstatelist2.setIconTintList(i3));
            setCheckedIconEnabled setcheckediconenabled = MenuHostHelper$$ExternalSyntheticLambda1 == null ? null : ((setLayoutAnimation) MenuHostHelper$$ExternalSyntheticLambda1.getLayoutParams()).setUnboundedRipple;
            if (!((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 128) != 0)) {
                int i4 = setcheckediconenabled.setTextAlignment;
                if (i4 == -1) {
                    i4 = setcheckediconenabled.setIconSize;
                }
                if (i4 < i) {
                    i = i4;
                }
                if (i4 > i2) {
                    i2 = i4;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        setItemAnimator.MenuHostHelper$$ExternalSyntheticLambda0("RV OnLayout");
        ViewPager$SavedState$1();
        setItemAnimator.MenuHostHelper$$ExternalSyntheticLambda0();
        this.ViewPager$SavedState$1 = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.setCenterIfNoTextEnabled == 0 && !this.setLayoutDirection) {
            super.requestLayout();
        } else {
            this.setMinAndMaxProgress = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setUnboundedRipple() {
        int MenuHostHelper$$ExternalSyntheticLambda02 = this.setLayoutAnimation.setY.MenuHostHelper$$ExternalSyntheticLambda0();
        for (int i = 0; i < MenuHostHelper$$ExternalSyntheticLambda02; i++) {
            ((setLayoutAnimation) this.setLayoutAnimation.setY.MenuHostHelper$$ExternalSyntheticLambda1(i).getLayoutParams()).setX = true;
        }
        this.setContentScrimResource.setY();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.setOnNavigationItemSelectedListener.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.setOnNavigationItemSelectedListener.get(i).setY(canvas);
        }
        EdgeEffect edgeEffect = this.ActionMenuPresenter$SavedState$1;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.setUnboundedRipple ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.ActionMenuPresenter$SavedState$1;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.setCheckedIconEnabledResource;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.setUnboundedRipple) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.setCheckedIconEnabledResource;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.setChipIconEnabledResource;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.setUnboundedRipple ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.setChipIconEnabledResource;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.setError;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.setUnboundedRipple) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.setError;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.setTextScaleX == null || this.setOnNavigationItemSelectedListener.size() <= 0 || !this.setTextScaleX.setY()) {
            z3 = z;
        }
        if (z3) {
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.setOnNavigationItemSelectedListener.size();
        for (int i = 0; i < size; i++) {
            this.setOnNavigationItemSelectedListener.get(i).MenuHostHelper$$ExternalSyntheticLambda0(canvas, this);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof setLayoutAnimation) && this.setGuidelinePercent.MenuHostHelper$$ExternalSyntheticLambda0((setLayoutAnimation) layoutParams);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        setUiOptions setuioptions = this.setGuidelinePercent;
        if (setuioptions == null) {
            StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
            sb.append(setX());
            throw new IllegalStateException(sb.toString());
        }
        return setuioptions.setY();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        setUiOptions setuioptions = this.setGuidelinePercent;
        if (setuioptions == null) {
            StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
            sb.append(setX());
            throw new IllegalStateException(sb.toString());
        }
        return setuioptions.setIconTintList(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        setUiOptions setuioptions = this.setGuidelinePercent;
        if (setuioptions == null) {
            StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
            sb.append(setX());
            throw new IllegalStateException(sb.toString());
        }
        return setuioptions.setX(layoutParams);
    }

    private void setIconSize() {
        int MenuHostHelper$$ExternalSyntheticLambda02 = this.setLayoutAnimation.setY.MenuHostHelper$$ExternalSyntheticLambda0();
        for (int i = 0; i < MenuHostHelper$$ExternalSyntheticLambda02; i++) {
            View MenuHostHelper$$ExternalSyntheticLambda1 = this.setLayoutAnimation.setY.MenuHostHelper$$ExternalSyntheticLambda1(i);
            setCheckedIconEnabled setcheckediconenabled = MenuHostHelper$$ExternalSyntheticLambda1 == null ? null : ((setLayoutAnimation) MenuHostHelper$$ExternalSyntheticLambda1.getLayoutParams()).setUnboundedRipple;
            if (!((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 128) != 0)) {
                setcheckediconenabled.setOnLongClickListener = -1;
                setcheckediconenabled.setTextAlignment = -1;
            }
        }
        this.setContentScrimResource.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    final void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2, boolean z) {
        int MenuHostHelper$$ExternalSyntheticLambda02 = this.setLayoutAnimation.setY.MenuHostHelper$$ExternalSyntheticLambda0();
        for (int i3 = 0; i3 < MenuHostHelper$$ExternalSyntheticLambda02; i3++) {
            View MenuHostHelper$$ExternalSyntheticLambda1 = this.setLayoutAnimation.setY.MenuHostHelper$$ExternalSyntheticLambda1(i3);
            setCheckedIconEnabled setcheckediconenabled = MenuHostHelper$$ExternalSyntheticLambda1 == null ? null : ((setLayoutAnimation) MenuHostHelper$$ExternalSyntheticLambda1.getLayoutParams()).setUnboundedRipple;
            if (setcheckediconenabled != null) {
                if (!((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 128) != 0)) {
                    if (setcheckediconenabled.setIconSize >= i + i2) {
                        setcheckediconenabled.setIconTintList(-i2, z);
                        this.setViewTranslationCallback.setChipCornerRadius = true;
                    } else if (setcheckediconenabled.setIconSize >= i) {
                        setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 |= 8;
                        setcheckediconenabled.setIconTintList(-i2, z);
                        setcheckediconenabled.setIconSize = i - 1;
                        this.setViewTranslationCallback.setChipCornerRadius = true;
                    }
                }
            }
        }
        setMaxEms setmaxems = this.setContentScrimResource;
        for (int size = setmaxems.MenuHostHelper$$ExternalSyntheticLambda0.size() - 1; size >= 0; size--) {
            setCheckedIconEnabled setcheckediconenabled2 = setmaxems.MenuHostHelper$$ExternalSyntheticLambda0.get(size);
            if (setcheckediconenabled2 != null) {
                if (setcheckediconenabled2.setIconSize >= i + i2) {
                    setcheckediconenabled2.setIconTintList(-i2, z);
                } else if (setcheckediconenabled2.setIconSize >= i) {
                    setcheckediconenabled2.MenuHostHelper$$ExternalSyntheticLambda1 |= 8;
                    setmaxems.MenuHostHelper$$ExternalSyntheticLambda0(setmaxems.MenuHostHelper$$ExternalSyntheticLambda0.get(size), true);
                    setmaxems.MenuHostHelper$$ExternalSyntheticLambda0.remove(size);
                }
            }
        }
        requestLayout();
    }

    final void setY(boolean z) {
        this.onActivityResumed = z | this.onActivityResumed;
        this.setIconSize = true;
        int MenuHostHelper$$ExternalSyntheticLambda02 = this.setLayoutAnimation.setY.MenuHostHelper$$ExternalSyntheticLambda0();
        int i = 0;
        while (true) {
            if (i >= MenuHostHelper$$ExternalSyntheticLambda02) {
                break;
            }
            View MenuHostHelper$$ExternalSyntheticLambda1 = this.setLayoutAnimation.setY.MenuHostHelper$$ExternalSyntheticLambda1(i);
            setCheckedIconEnabled setcheckediconenabled = MenuHostHelper$$ExternalSyntheticLambda1 != null ? ((setLayoutAnimation) MenuHostHelper$$ExternalSyntheticLambda1.getLayoutParams()).setUnboundedRipple : null;
            if (setcheckediconenabled != null) {
                if (!((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 128) != 0)) {
                    setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 |= 6;
                }
            }
            i++;
        }
        setUnboundedRipple();
        setMaxEms setmaxems = this.setContentScrimResource;
        int size = setmaxems.MenuHostHelper$$ExternalSyntheticLambda0.size();
        for (int i2 = 0; i2 < size; i2++) {
            setCheckedIconEnabled setcheckediconenabled2 = setmaxems.MenuHostHelper$$ExternalSyntheticLambda0.get(i2);
            if (setcheckediconenabled2 != null) {
                setcheckediconenabled2.MenuHostHelper$$ExternalSyntheticLambda1 |= 6;
                setcheckediconenabled2.setIconTintList(null);
            }
        }
        if (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setNavigationOnClickListener == null || !WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setNavigationOnClickListener.setY) {
            setmaxems.setX();
        }
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.TextInputLayout$SavedState$1 = z;
    }

    public final setCheckedIconEnabled setOnLongClickListener(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            if (view == null) {
                return null;
            }
            return ((setLayoutAnimation) view.getLayoutParams()).setUnboundedRipple;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View MenuHostHelper$$ExternalSyntheticLambda0(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 == r2) goto L17
            r3 = 0
        L17:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.MenuHostHelper$$ExternalSyntheticLambda0(android.view.View):android.view.View");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setCheckedIconEnabled setY(View view) {
        if (view == null) {
            return null;
        }
        return ((setLayoutAnimation) view.getLayoutParams()).setUnboundedRipple;
    }

    private setCheckedIconEnabled MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        if (this.setIconSize) {
            return null;
        }
        int MenuHostHelper$$ExternalSyntheticLambda02 = this.setLayoutAnimation.setY.MenuHostHelper$$ExternalSyntheticLambda0();
        setCheckedIconEnabled setcheckediconenabled = null;
        for (int i2 = 0; i2 < MenuHostHelper$$ExternalSyntheticLambda02; i2++) {
            View MenuHostHelper$$ExternalSyntheticLambda1 = this.setLayoutAnimation.setY.MenuHostHelper$$ExternalSyntheticLambda1(i2);
            setCheckedIconEnabled setcheckediconenabled2 = MenuHostHelper$$ExternalSyntheticLambda1 == null ? null : ((setLayoutAnimation) MenuHostHelper$$ExternalSyntheticLambda1.getLayoutParams()).setUnboundedRipple;
            if (setcheckediconenabled2 != null) {
                if (!((setcheckediconenabled2.MenuHostHelper$$ExternalSyntheticLambda1 & 8) != 0) && setIconTintList(setcheckediconenabled2) == i) {
                    if (!this.setLayoutAnimation.setX.contains(setcheckediconenabled2.setIconTintList)) {
                        return setcheckediconenabled2;
                    }
                    setcheckediconenabled = setcheckediconenabled2;
                }
            }
        }
        return setcheckediconenabled;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    static void setIconTintList(View view, Rect rect) {
        setLayoutAnimation setlayoutanimation = (setLayoutAnimation) view.getLayoutParams();
        Rect rect2 = setlayoutanimation.setIconTintList;
        int left = view.getLeft();
        int i = rect2.left;
        int i2 = ((ViewGroup.MarginLayoutParams) setlayoutanimation).leftMargin;
        int top = view.getTop();
        int i3 = rect2.top;
        int i4 = ((ViewGroup.MarginLayoutParams) setlayoutanimation).topMargin;
        int right = view.getRight();
        int i5 = rect2.right;
        rect.set((left - i) - i2, (top - i3) - i4, right + i5 + ((ViewGroup.MarginLayoutParams) setlayoutanimation).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) setlayoutanimation).bottomMargin);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (((r0.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1 & 4) != 0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Rect setNavigationOnClickListener(android.view.View r9) {
        /*
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setLayoutAnimation r0 = (o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) r0
            boolean r1 = r0.setX
            if (r1 != 0) goto Ld
            android.graphics.Rect r9 = r0.setIconTintList
            return r9
        Ld:
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMinAndMaxProgress r1 = r8.setViewTranslationCallback
            boolean r1 = r1.setIconTintList
            r2 = 0
            if (r1 == 0) goto L31
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled r1 = r0.setUnboundedRipple
            int r1 = r1.MenuHostHelper$$ExternalSyntheticLambda1
            r1 = r1 & 2
            r3 = 1
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            if (r1 != 0) goto L2e
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled r1 = r0.setUnboundedRipple
            int r1 = r1.MenuHostHelper$$ExternalSyntheticLambda1
            r1 = r1 & 4
            if (r1 == 0) goto L2b
            goto L2c
        L2b:
            r3 = 0
        L2c:
            if (r3 == 0) goto L31
        L2e:
            android.graphics.Rect r9 = r0.setIconTintList
            return r9
        L31:
            android.graphics.Rect r1 = r0.setIconTintList
            r1.set(r2, r2, r2, r2)
            java.util.ArrayList<o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setUnboundedRipple> r3 = r8.setOnNavigationItemSelectedListener
            int r3 = r3.size()
            r4 = 0
        L3d:
            if (r4 >= r3) goto L7a
            android.graphics.Rect r5 = r8.setAdapter
            r5.set(r2, r2, r2, r2)
            java.util.ArrayList<o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setUnboundedRipple> r5 = r8.setOnNavigationItemSelectedListener
            java.lang.Object r5 = r5.get(r4)
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setUnboundedRipple r5 = (o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUnboundedRipple) r5
            android.graphics.Rect r6 = r8.setAdapter
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMinAndMaxProgress r7 = r8.setViewTranslationCallback
            r5.MenuHostHelper$$ExternalSyntheticLambda1(r6, r9, r8, r7)
            int r5 = r1.left
            android.graphics.Rect r6 = r8.setAdapter
            int r6 = r6.left
            int r5 = r5 + r6
            r1.left = r5
            int r5 = r1.top
            android.graphics.Rect r6 = r8.setAdapter
            int r6 = r6.top
            int r5 = r5 + r6
            r1.top = r5
            int r5 = r1.right
            android.graphics.Rect r6 = r8.setAdapter
            int r6 = r6.right
            int r5 = r5 + r6
            r1.right = r5
            int r5 = r1.bottom
            android.graphics.Rect r6 = r8.setAdapter
            int r6 = r6.bottom
            int r5 = r5 + r6
            r1.bottom = r5
            int r4 = r4 + 1
            goto L3d
        L7a:
            r0.setX = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener(android.view.View):android.graphics.Rect");
    }

    final void MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2) {
        this.setHint++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        setCenterIfNoTextEnabled setcenterifnotextenabled = this.minusKey;
        if (setcenterifnotextenabled != null) {
            setcenterifnotextenabled.setX(this, i, i2);
        }
        List<setCenterIfNoTextEnabled> list = this.setSuffixText;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.setSuffixText.get(size).setX(this, i, i2);
            }
        }
        this.setHint--;
    }

    final void setY(int i) {
        setUiOptions setuioptions = this.setGuidelinePercent;
        if (setuioptions != null) {
            setuioptions.setNavigationOnClickListener(i);
        }
        setCenterIfNoTextEnabled setcenterifnotextenabled = this.minusKey;
        if (setcenterifnotextenabled != null) {
            setcenterifnotextenabled.setIconTintList(this, i);
        }
        List<setCenterIfNoTextEnabled> list = this.setSuffixText;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.setSuffixText.get(size).setIconTintList(this, i);
            }
        }
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.ViewPager$SavedState$1 && !this.setIconSize) {
            if (!(this.setUiOptions.setOnLongClickListener.size() > 0)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setLayoutDirection implements Runnable {
        int MenuHostHelper$$ExternalSyntheticLambda0;
        int setX;
        OverScroller setY;
        Interpolator setIconTintList = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setX;
        boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;
        boolean setUnboundedRipple = false;

        setLayoutDirection() {
            this.setY = new OverScroller(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.getContext(), WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setX);
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int i2;
            if (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setGuidelinePercent != null) {
                this.setUnboundedRipple = false;
                this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setIconTintList();
                OverScroller overScroller = this.setY;
                if (overScroller.computeScrollOffset()) {
                    int currX = overScroller.getCurrX();
                    int currY = overScroller.getCurrY();
                    int i3 = currX - this.setX;
                    int i4 = currY - this.MenuHostHelper$$ExternalSyntheticLambda0;
                    this.setX = currX;
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = currY;
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setConstraintSet[0] = 0;
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setConstraintSet[1] = 0;
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this;
                    if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.MenuHostHelper$$ExternalSyntheticLambda1(i3, i4, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setConstraintSet, null, 1)) {
                        i3 -= WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setConstraintSet[0];
                        i4 -= WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setConstraintSet[1];
                    }
                    if (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.getOverScrollMode() != 2) {
                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setX(i3, i4);
                    }
                    if (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setNavigationOnClickListener != null) {
                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setConstraintSet[0] = 0;
                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setConstraintSet[1] = 0;
                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this;
                        windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setY(i3, i4, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setConstraintSet);
                        i = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setConstraintSet[0];
                        i2 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setConstraintSet[1];
                        i3 -= i;
                        i4 -= i2;
                        setZ setz = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setGuidelinePercent.setAnimationFromJson;
                        if (setz != null && !setz.setY && setz.setUiOptions) {
                            setMinAndMaxProgress setminandmaxprogress = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setViewTranslationCallback;
                            int i5 = setminandmaxprogress.setIconTintList ? setminandmaxprogress.setNavigationOnClickListener - setminandmaxprogress.setY : setminandmaxprogress.setLayoutAnimation;
                            if (i5 == 0) {
                                setz.setY();
                            } else if (setz.setLayoutAnimation < i5) {
                                setz.setX(i, i2);
                            } else {
                                setz.setLayoutAnimation = i5 - 1;
                                setz.setX(i, i2);
                            }
                        }
                    } else {
                        i = 0;
                        i2 = 0;
                    }
                    if (!WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setOnNavigationItemSelectedListener.isEmpty()) {
                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.invalidate();
                    }
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setConstraintSet[0] = 0;
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setConstraintSet[1] = 0;
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this;
                    windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.MenuHostHelper$$ExternalSyntheticLambda1(i, i2, i3, i4, null, 1, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.setConstraintSet);
                    int i6 = i3 - WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setConstraintSet[0];
                    int i7 = i4 - WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setConstraintSet[1];
                    if (i != 0 || i2 != 0) {
                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.MenuHostHelper$$ExternalSyntheticLambda1(i, i2);
                    }
                    if (!WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.awakenScrollBars()) {
                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.invalidate();
                    }
                    boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                    setZ setz2 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setGuidelinePercent.setAnimationFromJson;
                    if (!(setz2 != null && setz2.setY) && z) {
                        if (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.getOverScrollMode() != 2) {
                            int currVelocity = (int) overScroller.getCurrVelocity();
                            int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                            if (i7 < 0) {
                                currVelocity = -currVelocity;
                            } else if (i7 <= 0) {
                                currVelocity = 0;
                            }
                            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setY(i8, currVelocity);
                        }
                        if (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.MenuHostHelper$$ExternalSyntheticLambda0) {
                            setSplitTrack$MenuHostHelper$$ExternalSyntheticLambda0 setsplittrack_menuhosthelper__externalsyntheticlambda0 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.FragmentStateAdapter$2;
                            int[] iArr = setsplittrack_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1;
                            if (iArr != null) {
                                Arrays.fill(iArr, -1);
                            }
                            setsplittrack_menuhosthelper__externalsyntheticlambda0.setX = 0;
                        }
                    } else {
                        setX();
                        if (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setTextAlignment != null) {
                            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setTextAlignment.MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this, i, i2);
                        }
                    }
                }
                setZ setz3 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setGuidelinePercent.setAnimationFromJson;
                if (setz3 != null && setz3.setY) {
                    setz3.setX(0, 0);
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
                if (!this.setUnboundedRipple) {
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this;
                    if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04.setObjectValues != 0) {
                        windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04.setObjectValues = 0;
                        windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04.MenuHostHelper$$ExternalSyntheticLambda0();
                        windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04.setY(0);
                    }
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline05 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this;
                    if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline05.setFilterTouchesWhenObscured == null) {
                        windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline05.setFilterTouchesWhenObscured = new Month$1(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline05);
                    }
                    windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline05.setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(1);
                    return;
                }
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.removeCallbacks(this);
                setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this, this);
                return;
            }
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.removeCallbacks(this);
            this.setY.abortAnimation();
        }

        private void setX() {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                this.setUnboundedRipple = true;
                return;
            }
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.removeCallbacks(this);
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this, this);
        }

        public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = MenuHostHelper$$ExternalSyntheticLambda0(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setX;
            }
            if (this.setIconTintList != interpolator) {
                this.setIconTintList = interpolator;
                this.setY = new OverScroller(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.getContext(), interpolator);
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
            this.setX = 0;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this;
            if (2 != windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setObjectValues) {
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setObjectValues = 2;
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setY(2);
            }
            this.setY.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.setY.computeScrollOffset();
            }
            setX();
        }

        private int MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
            int i3;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt(0.0d);
            int sqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this;
            int width = z ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getWidth() : windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getHeight();
            int i4 = width / 2;
            float f = width;
            float f2 = i4;
            float sin = (float) Math.sin((Math.min(1.0f, sqrt2 / f) - 0.5f) * 0.47123894f);
            if (sqrt > 0) {
                i3 = Math.round(Math.abs((f2 + (sin * f2)) / sqrt) * 1000.0f) << 2;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i3 = (int) (((abs / f) + 1.0f) * 300.0f);
            }
            return Math.min(i3, 2000);
        }
    }

    private void setMinAndMaxProgress() {
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
        int MenuHostHelper$$ExternalSyntheticLambda02 = setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size();
        for (int i = 0; i < MenuHostHelper$$ExternalSyntheticLambda02; i++) {
            setBoxBackgroundColorStateList setboxbackgroundcolorstatelist2 = this.setLayoutAnimation;
            View MenuHostHelper$$ExternalSyntheticLambda1 = setboxbackgroundcolorstatelist2.setY.MenuHostHelper$$ExternalSyntheticLambda1(setboxbackgroundcolorstatelist2.setIconTintList(i));
            setCheckedIconEnabled onLongClickListener = setOnLongClickListener(MenuHostHelper$$ExternalSyntheticLambda1);
            if (onLongClickListener != null && onLongClickListener.setChipCornerRadius != null) {
                View view = onLongClickListener.setChipCornerRadius.setIconTintList;
                int left = MenuHostHelper$$ExternalSyntheticLambda1.getLeft();
                int top = MenuHostHelper$$ExternalSyntheticLambda1.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setTextScaleX extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda0 {
        setTextScaleX() {
        }

        @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda0
        public final void setY() {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setY((String) null);
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setViewTranslationCallback.setChipCornerRadius = true;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setY(true);
            if (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setUiOptions.setOnLongClickListener.size() > 0) {
                return;
            }
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public static class setX {
        protected static EdgeEffect setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) {
            return new EdgeEffect(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getContext());
        }
    }

    static WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 setIconTintList(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) {
                return (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 iconTintList = setIconTintList(viewGroup.getChildAt(i));
                if (iconTintList != null) {
                    return iconTintList;
                }
            }
            return null;
        }
        return null;
    }

    static void setX(setCheckedIconEnabled setcheckediconenabled) {
        if (setcheckediconenabled.setUnboundedRipple != null) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = setcheckediconenabled.setUnboundedRipple.get();
            while (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 == setcheckediconenabled.setIconTintList) {
                    return;
                }
                ViewParent parent = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getParent();
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = parent instanceof View ? (View) parent : null;
            }
            setcheckediconenabled.setUnboundedRipple = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long setY() {
        if (MenuHostHelper$$ExternalSyntheticLambda0) {
            return System.nanoTime();
        }
        return 0L;
    }

    /* loaded from: classes.dex */
    public final class setMaxEms {
        final ArrayList<setCheckedIconEnabled> MenuHostHelper$$ExternalSyntheticLambda0;
        ArrayList<setCheckedIconEnabled> MenuHostHelper$$ExternalSyntheticLambda1;
        final ArrayList<setCheckedIconEnabled> setIconTintList;
        setGuidelinePercent setLayoutAnimation;
        private int setOnLongClickListener;
        public final List<setCheckedIconEnabled> setUiOptions;
        int setX;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$1 setY;

        public setMaxEms() {
            ArrayList<setCheckedIconEnabled> arrayList = new ArrayList<>();
            this.setIconTintList = arrayList;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList<>();
            this.setUiOptions = Collections.unmodifiableList(arrayList);
            this.setX = 2;
            this.setOnLongClickListener = 2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void MenuHostHelper$$ExternalSyntheticLambda0() {
            this.setOnLongClickListener = this.setX + (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setGuidelinePercent != null ? WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setGuidelinePercent.setZ : 0);
            for (int size = this.MenuHostHelper$$ExternalSyntheticLambda0.size() - 1; size >= 0 && this.MenuHostHelper$$ExternalSyntheticLambda0.size() > this.setOnLongClickListener; size--) {
                MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0.get(size), true);
                this.MenuHostHelper$$ExternalSyntheticLambda0.remove(size);
            }
        }

        private boolean MenuHostHelper$$ExternalSyntheticLambda1(setCheckedIconEnabled setcheckediconenabled, int i, int i2, long j) {
            setcheckediconenabled.setUiOptions = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this;
            int i3 = setcheckediconenabled.setY;
            long y = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setY();
            boolean z = false;
            if (j != Long.MAX_VALUE) {
                long j2 = this.setY.setX(i3).MenuHostHelper$$ExternalSyntheticLambda1;
                if (!(j2 == 0 || j2 + y < j)) {
                    return false;
                }
            }
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setNavigationOnClickListener;
            setcheckediconenabled.setIconSize = i;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1.setY) {
                setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda0 = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1.setY(i);
            }
            setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 = (setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & (-520)) | 1;
            setItemAnimator.MenuHostHelper$$ExternalSyntheticLambda0("RV OnBindView");
            setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda0();
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1.setY(setcheckediconenabled, i);
            List<Object> list = setcheckediconenabled.setNavigationOnClickListener;
            if (list != null) {
                list.clear();
            }
            setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 &= -1025;
            ViewGroup.LayoutParams layoutParams = setcheckediconenabled.setIconTintList.getLayoutParams();
            if (layoutParams instanceof setLayoutAnimation) {
                ((setLayoutAnimation) layoutParams).setX = true;
            }
            setItemAnimator.MenuHostHelper$$ExternalSyntheticLambda0();
            long y2 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setY();
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$1.setY x = this.setY.setX(setcheckediconenabled.setY);
            x.MenuHostHelper$$ExternalSyntheticLambda1 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$1.setIconTintList(x.MenuHostHelper$$ExternalSyntheticLambda1, y2 - y);
            AccessibilityManager accessibilityManager = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setOnLongClickListener;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                z = true;
            }
            if (z) {
                View view = setcheckediconenabled.setIconTintList;
                if (setBaselineAlignBottom.setCenterIfNoTextEnabled(view) == 0) {
                    setBaselineAlignBottom.setUnboundedRipple(view, 1);
                }
                if (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                    Parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0 parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.MenuHostHelper$$ExternalSyntheticLambda1.setX;
                    if (parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0 instanceof Parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0) {
                        Parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0 parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda02 = parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0;
                        setCounterOverflowTextColor y3 = setBaselineAlignBottom.setY(view);
                        if (y3 != null && y3 != parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda02) {
                            parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda1.put(view, y3);
                        }
                    }
                    setBaselineAlignBottom.setX(view, parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0);
                }
            }
            if (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setViewTranslationCallback.setIconTintList) {
                setcheckediconenabled.setTextAlignment = i2;
            }
            return true;
        }

        public final int MenuHostHelper$$ExternalSyntheticLambda1(int i) {
            if (i >= 0) {
                setMinAndMaxProgress setminandmaxprogress = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setViewTranslationCallback;
                if (i < (setminandmaxprogress.setIconTintList ? setminandmaxprogress.setNavigationOnClickListener - setminandmaxprogress.setY : setminandmaxprogress.setLayoutAnimation)) {
                    return !WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setViewTranslationCallback.setIconTintList ? i : WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setUiOptions.setY(i, 0);
                }
            }
            StringBuilder sb = new StringBuilder("invalid position ");
            sb.append(i);
            sb.append(". State item count is ");
            setMinAndMaxProgress setminandmaxprogress2 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setViewTranslationCallback;
            sb.append(setminandmaxprogress2.setIconTintList ? setminandmaxprogress2.setNavigationOnClickListener - setminandmaxprogress2.setY : setminandmaxprogress2.setLayoutAnimation);
            sb.append(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setX());
            throw new IndexOutOfBoundsException(sb.toString());
        }

        public final View setX(int i) {
            return setIconTintList(i, false, Long.MAX_VALUE).setIconTintList;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x0204, code lost:
            if (((r9.MenuHostHelper$$ExternalSyntheticLambda1 & 4) != 0) == false) goto L102;
         */
        /* JADX WARN: Removed duplicated region for block: B:101:0x01d9  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x01eb  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x01ed  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x01f0  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x0222  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0230  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x024c A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01a6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setIconTintList(int r16, boolean r17, long r18) {
            /*
                Method dump skipped, instructions count: 656
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms.setIconTintList(int, boolean, long):o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled");
        }

        public final void setY(View view) {
            setCheckedIconEnabled y = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setY(view);
            boolean z = true;
            if ((y.MenuHostHelper$$ExternalSyntheticLambda1 & 256) != 0) {
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.removeDetachedView(view, false);
            }
            if (y.setCenterIfNoTextEnabled != null) {
                y.setCenterIfNoTextEnabled.setIconTintList(y);
            } else {
                if ((y.MenuHostHelper$$ExternalSyntheticLambda1 & 32) != 0) {
                    y.MenuHostHelper$$ExternalSyntheticLambda1 &= -33;
                }
            }
            MenuHostHelper$$ExternalSyntheticLambda1(y);
            if (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setTextScaleX != null) {
                if (((y.MenuHostHelper$$ExternalSyntheticLambda1 & 16) != 0 || setBaselineAlignBottom.setIconified(y.setIconTintList)) ? false : false) {
                    return;
                }
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setTextScaleX.setX(y);
            }
        }

        final void setX() {
            for (int size = this.MenuHostHelper$$ExternalSyntheticLambda0.size() - 1; size >= 0; size--) {
                MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0.get(size), true);
                this.MenuHostHelper$$ExternalSyntheticLambda0.remove(size);
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.clear();
            if (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.MenuHostHelper$$ExternalSyntheticLambda0) {
                setSplitTrack$MenuHostHelper$$ExternalSyntheticLambda0 setsplittrack_menuhosthelper__externalsyntheticlambda0 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.FragmentStateAdapter$2;
                int[] iArr = setsplittrack_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                setsplittrack_menuhosthelper__externalsyntheticlambda0.setX = 0;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void MenuHostHelper$$ExternalSyntheticLambda0(setCheckedIconEnabled setcheckediconenabled, boolean z) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setX(setcheckediconenabled);
            View view = setcheckediconenabled.setIconTintList;
            if (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                Parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0 parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.MenuHostHelper$$ExternalSyntheticLambda1.setX;
                setBaselineAlignBottom.setX(view, parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0 instanceof Parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0 ? parcelable$ClassLoaderCreator$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.remove(view) : null);
            }
            if (z) {
                MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled);
            }
            setcheckediconenabled.setUiOptions = null;
            if (this.setY == null) {
                this.setY = new WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$ViewPager$SavedState$1();
            }
            this.setY.setY(setcheckediconenabled);
        }

        final void setIconTintList(View view) {
            setCheckedIconEnabled y = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setY(view);
            if (!((y.MenuHostHelper$$ExternalSyntheticLambda1 & 12) != 0)) {
                if ((y.MenuHostHelper$$ExternalSyntheticLambda1 & 2) != 0) {
                    setNavigationOnClickListener setnavigationonclicklistener = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setTextScaleX;
                    if (!(setnavigationonclicklistener == null || setnavigationonclicklistener.setX(y, y.MenuHostHelper$$ExternalSyntheticLambda0()))) {
                        if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                            this.MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayList<>();
                        }
                        y.setCenterIfNoTextEnabled = this;
                        y.setX = true;
                        this.MenuHostHelper$$ExternalSyntheticLambda1.add(y);
                        return;
                    }
                }
            }
            if ((y.MenuHostHelper$$ExternalSyntheticLambda1 & 4) != 0) {
                if (!((y.MenuHostHelper$$ExternalSyntheticLambda1 & 8) != 0) && !WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setNavigationOnClickListener.setY) {
                    StringBuilder sb = new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                    sb.append(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setX());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            y.setCenterIfNoTextEnabled = this;
            y.setX = false;
            this.setIconTintList.add(y);
        }

        final void setIconTintList(setCheckedIconEnabled setcheckediconenabled) {
            if (setcheckediconenabled.setX) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.remove(setcheckediconenabled);
            } else {
                this.setIconTintList.remove(setcheckediconenabled);
            }
            setcheckediconenabled.setCenterIfNoTextEnabled = null;
            setcheckediconenabled.setX = false;
            setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 &= -33;
        }

        private setCheckedIconEnabled setY(int i) {
            int size;
            int y;
            ArrayList<setCheckedIconEnabled> arrayList = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (arrayList == null || (size = arrayList.size()) == 0) {
                return null;
            }
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    setCheckedIconEnabled setcheckediconenabled = this.MenuHostHelper$$ExternalSyntheticLambda1.get(i2);
                    if (!((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 32) != 0)) {
                        int i3 = setcheckediconenabled.setTextAlignment;
                        if (i3 == -1) {
                            i3 = setcheckediconenabled.setIconSize;
                        }
                        if (i3 == i) {
                            setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 |= 32;
                            return setcheckediconenabled;
                        }
                    }
                    i2++;
                } else if (!WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setNavigationOnClickListener.setY || (y = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setUiOptions.setY(i, 0)) <= 0 || y >= WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setNavigationOnClickListener.setY()) {
                    return null;
                } else {
                    long y2 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setNavigationOnClickListener.setY(y);
                    for (int i4 = 0; i4 < size; i4++) {
                        setCheckedIconEnabled setcheckediconenabled2 = this.MenuHostHelper$$ExternalSyntheticLambda1.get(i4);
                        if (!((setcheckediconenabled2.MenuHostHelper$$ExternalSyntheticLambda1 & 32) != 0) && setcheckediconenabled2.MenuHostHelper$$ExternalSyntheticLambda0 == y2) {
                            setcheckediconenabled2.MenuHostHelper$$ExternalSyntheticLambda1 |= 32;
                            return setcheckediconenabled2;
                        }
                    }
                    return null;
                }
            }
        }

        private setCheckedIconEnabled MenuHostHelper$$ExternalSyntheticLambda0(int i, boolean z) {
            View view;
            setCheckedIconEnabled setcheckediconenabled;
            int size = this.setIconTintList.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    setcheckediconenabled = this.setIconTintList.get(i2);
                    if (!((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 32) != 0)) {
                        int i3 = setcheckediconenabled.setTextAlignment;
                        if (i3 == -1) {
                            i3 = setcheckediconenabled.setIconSize;
                        }
                        if (i3 == i) {
                            if (!((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 4) != 0)) {
                                if (!WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setViewTranslationCallback.setIconTintList) {
                                    if (!((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 8) != 0)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    i2++;
                } else {
                    if (!z) {
                        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setLayoutAnimation;
                        int size2 = setboxbackgroundcolorstatelist.setX.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                view = null;
                                break;
                            }
                            view = setboxbackgroundcolorstatelist.setX.get(i4);
                            setCheckedIconEnabled x = setboxbackgroundcolorstatelist.setY.setX(view);
                            int i5 = x.setTextAlignment;
                            if (i5 == -1) {
                                i5 = x.setIconSize;
                            }
                            if (i5 == i) {
                                if (!((x.MenuHostHelper$$ExternalSyntheticLambda1 & 4) != 0)) {
                                    if (!((x.MenuHostHelper$$ExternalSyntheticLambda1 & 8) != 0)) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i4++;
                        }
                        if (view != null) {
                            setCheckedIconEnabled y = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setY(view);
                            setBoxBackgroundColorStateList setboxbackgroundcolorstatelist2 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setLayoutAnimation;
                            int MenuHostHelper$$ExternalSyntheticLambda1 = setboxbackgroundcolorstatelist2.setY.MenuHostHelper$$ExternalSyntheticLambda1(view);
                            if (MenuHostHelper$$ExternalSyntheticLambda1 < 0) {
                                StringBuilder sb = new StringBuilder("view is not a child, cannot hide ");
                                sb.append(view);
                                throw new IllegalArgumentException(sb.toString());
                            } else if (!setboxbackgroundcolorstatelist2.MenuHostHelper$$ExternalSyntheticLambda1.setX(MenuHostHelper$$ExternalSyntheticLambda1)) {
                                StringBuilder sb2 = new StringBuilder("trying to unhide a view that was not hidden");
                                sb2.append(view);
                                throw new RuntimeException(sb2.toString());
                            } else {
                                setboxbackgroundcolorstatelist2.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1);
                                if (setboxbackgroundcolorstatelist2.setX.remove(view)) {
                                    setboxbackgroundcolorstatelist2.setY.setY(view);
                                }
                                int iconTintList = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setLayoutAnimation.setIconTintList(view);
                                if (iconTintList == -1) {
                                    StringBuilder sb3 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                    sb3.append(y);
                                    sb3.append(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setX());
                                    throw new IllegalStateException(sb3.toString());
                                }
                                setBoxBackgroundColorStateList setboxbackgroundcolorstatelist3 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setLayoutAnimation;
                                int iconTintList2 = setboxbackgroundcolorstatelist3.setIconTintList(iconTintList);
                                setboxbackgroundcolorstatelist3.MenuHostHelper$$ExternalSyntheticLambda1.setY(iconTintList2);
                                setboxbackgroundcolorstatelist3.setY.setX(iconTintList2);
                                setIconTintList(view);
                                y.MenuHostHelper$$ExternalSyntheticLambda1 |= 8224;
                                return y;
                            }
                        }
                    }
                    int size3 = this.MenuHostHelper$$ExternalSyntheticLambda0.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        setCheckedIconEnabled setcheckediconenabled2 = this.MenuHostHelper$$ExternalSyntheticLambda0.get(i6);
                        if (!((setcheckediconenabled2.MenuHostHelper$$ExternalSyntheticLambda1 & 4) != 0)) {
                            int i7 = setcheckediconenabled2.setTextAlignment;
                            if (i7 == -1) {
                                i7 = setcheckediconenabled2.setIconSize;
                            }
                            if (i7 == i && !setcheckediconenabled2.setX()) {
                                if (!z) {
                                    this.MenuHostHelper$$ExternalSyntheticLambda0.remove(i6);
                                }
                                return setcheckediconenabled2;
                            }
                        }
                    }
                    return null;
                }
            }
            setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 |= 32;
            return setcheckediconenabled;
        }

        private setCheckedIconEnabled setY(long j, int i, boolean z) {
            for (int size = this.setIconTintList.size() - 1; size >= 0; size--) {
                setCheckedIconEnabled setcheckediconenabled = this.setIconTintList.get(size);
                if (setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda0 == j) {
                    if ((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 32) != 0) {
                        continue;
                    } else if (setcheckediconenabled.setY == 0) {
                        setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 |= 32;
                        if (((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 8) != 0) && !WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setViewTranslationCallback.setIconTintList) {
                            setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 = (setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & (-15)) | 2;
                        }
                        return setcheckediconenabled;
                    } else if (!z) {
                        this.setIconTintList.remove(size);
                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.removeDetachedView(setcheckediconenabled.setIconTintList, false);
                        setCheckedIconEnabled y = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setY(setcheckediconenabled.setIconTintList);
                        y.setCenterIfNoTextEnabled = null;
                        y.setX = false;
                        y.MenuHostHelper$$ExternalSyntheticLambda1 &= -33;
                        MenuHostHelper$$ExternalSyntheticLambda1(y);
                    }
                }
            }
            for (int size2 = this.MenuHostHelper$$ExternalSyntheticLambda0.size() - 1; size2 >= 0; size2--) {
                setCheckedIconEnabled setcheckediconenabled2 = this.MenuHostHelper$$ExternalSyntheticLambda0.get(size2);
                if (setcheckediconenabled2.MenuHostHelper$$ExternalSyntheticLambda0 == j && !setcheckediconenabled2.setX()) {
                    if (setcheckediconenabled2.setY == 0) {
                        if (!z) {
                            this.MenuHostHelper$$ExternalSyntheticLambda0.remove(size2);
                        }
                        return setcheckediconenabled2;
                    } else if (!z) {
                        MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0.get(size2), true);
                        this.MenuHostHelper$$ExternalSyntheticLambda0.remove(size2);
                        return null;
                    }
                }
            }
            return null;
        }

        private void MenuHostHelper$$ExternalSyntheticLambda0(setCheckedIconEnabled setcheckediconenabled) {
            if (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.FragmentStateAdapter$5 != null) {
                setAnimationFromJson setanimationfromjson = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.FragmentStateAdapter$5;
            }
            if (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setNavigationOnClickListener != null) {
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setNavigationOnClickListener;
            }
            if (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setViewTranslationCallback != null) {
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.RecyclerView$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled);
            }
        }

        final void MenuHostHelper$$ExternalSyntheticLambda1() {
            int size = this.MenuHostHelper$$ExternalSyntheticLambda0.size();
            for (int i = 0; i < size; i++) {
                setCheckedIconEnabled setcheckediconenabled = this.MenuHostHelper$$ExternalSyntheticLambda0.get(i);
                setcheckediconenabled.setOnLongClickListener = -1;
                setcheckediconenabled.setTextAlignment = -1;
            }
            int size2 = this.setIconTintList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                setCheckedIconEnabled setcheckediconenabled2 = this.setIconTintList.get(i2);
                setcheckediconenabled2.setOnLongClickListener = -1;
                setcheckediconenabled2.setTextAlignment = -1;
            }
            ArrayList<setCheckedIconEnabled> arrayList = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    setCheckedIconEnabled setcheckediconenabled3 = this.MenuHostHelper$$ExternalSyntheticLambda1.get(i3);
                    setcheckediconenabled3.setOnLongClickListener = -1;
                    setcheckediconenabled3.setTextAlignment = -1;
                }
            }
        }

        final void setY() {
            int size = this.MenuHostHelper$$ExternalSyntheticLambda0.size();
            for (int i = 0; i < size; i++) {
                setLayoutAnimation setlayoutanimation = (setLayoutAnimation) this.MenuHostHelper$$ExternalSyntheticLambda0.get(i).setIconTintList.getLayoutParams();
                if (setlayoutanimation != null) {
                    setlayoutanimation.setX = true;
                }
            }
        }

        public final View setIconTintList(int i) {
            return setIconTintList(i, false, Long.MAX_VALUE).setIconTintList;
        }

        /* JADX WARN: Removed duplicated region for block: B:62:0x00be  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final void MenuHostHelper$$ExternalSyntheticLambda1(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled r7) {
            /*
                Method dump skipped, instructions count: 319
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda1(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled):void");
        }

        private boolean setY(setCheckedIconEnabled setcheckediconenabled) {
            if (!((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 8) != 0)) {
                if (setcheckediconenabled.setIconSize < 0 || setcheckediconenabled.setIconSize >= WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setNavigationOnClickListener.setY()) {
                    StringBuilder sb = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                    sb.append(setcheckediconenabled);
                    sb.append(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setX());
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                if (!WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setViewTranslationCallback.setIconTintList) {
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setNavigationOnClickListener;
                    int i = setcheckediconenabled.setIconSize;
                    if (setcheckediconenabled.setY != 0) {
                        return false;
                    }
                }
                return !WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setNavigationOnClickListener.setY || setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda0 == WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setNavigationOnClickListener.setY(setcheckediconenabled.setIconSize);
            }
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.setViewTranslationCallback.setIconTintList;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class setUiOptions {
        private boolean MenuHostHelper$$ExternalSyntheticLambda1;
        public int ViewPager$SavedState$1;
        public setZ setAnimationFromJson;
        public onActivityPrePaused setCenterIfNoTextEnabled;
        boolean setChipCornerRadius;
        public int setGuidelinePercent;
        public int setIconSize;
        private final onActivityPrePaused$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList;
        public setBoxBackgroundColorStateList setLayoutAnimation;
        public WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 setMaxEms;
        public onActivityPrePaused setMinAndMaxProgress;
        boolean setOnNavigationItemSelectedListener;
        public boolean setTextAlignment;
        public int setTextAppearanceResource;
        public boolean setTextScaleX;
        private final onActivityPrePaused$MenuHostHelper$$ExternalSyntheticLambda1 setX;
        private boolean setY;
        int setZ;

        /* loaded from: classes.dex */
        public static class setIconTintList {
            public int MenuHostHelper$$ExternalSyntheticLambda0;
            public boolean MenuHostHelper$$ExternalSyntheticLambda1;
            public int setIconTintList;
            public boolean setY;
        }

        /* loaded from: classes.dex */
        public interface setX {
            void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2);
        }

        public static int setTextAlignment() {
            return -1;
        }

        public void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
        }

        public void MenuHostHelper$$ExternalSyntheticLambda0(Parcelable parcelable) {
        }

        public void MenuHostHelper$$ExternalSyntheticLambda0(setMinAndMaxProgress setminandmaxprogress) {
        }

        public void MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, setMaxEms setmaxems) {
        }

        public boolean MenuHostHelper$$ExternalSyntheticLambda0() {
            return false;
        }

        public boolean MenuHostHelper$$ExternalSyntheticLambda0(setLayoutAnimation setlayoutanimation) {
            return setlayoutanimation != null;
        }

        public int MenuHostHelper$$ExternalSyntheticLambda1(setMinAndMaxProgress setminandmaxprogress) {
            return 0;
        }

        public void MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2) {
        }

        public boolean MenuHostHelper$$ExternalSyntheticLambda1() {
            return false;
        }

        protected boolean setChipCornerRadius() {
            return false;
        }

        public int setIconTintList(setMinAndMaxProgress setminandmaxprogress) {
            return 0;
        }

        public void setIconTintList(int i, int i2, setMinAndMaxProgress setminandmaxprogress, setX setx) {
        }

        public boolean setIconTintList() {
            return false;
        }

        public int setLayoutAnimation(setMinAndMaxProgress setminandmaxprogress) {
            return 0;
        }

        public Parcelable setNavigationOnClickListener() {
            return null;
        }

        public void setNavigationOnClickListener(int i) {
        }

        public int setUiOptions(setMinAndMaxProgress setminandmaxprogress) {
            return 0;
        }

        public int setX(int i, setMaxEms setmaxems, setMinAndMaxProgress setminandmaxprogress) {
            return 0;
        }

        public int setX(setMinAndMaxProgress setminandmaxprogress) {
            return 0;
        }

        public void setX() {
        }

        public void setX(int i) {
        }

        public void setX(int i, int i2) {
        }

        public int setY(int i, setMaxEms setmaxems, setMinAndMaxProgress setminandmaxprogress) {
            return 0;
        }

        public int setY(setMinAndMaxProgress setminandmaxprogress) {
            return 0;
        }

        public View setY(View view, int i, setMaxEms setmaxems, setMinAndMaxProgress setminandmaxprogress) {
            return null;
        }

        public abstract setLayoutAnimation setY();

        public void setY(int i, int i2) {
        }

        public void setY(int i, setX setx) {
        }

        public setUiOptions() {
            onActivityPrePaused$MenuHostHelper$$ExternalSyntheticLambda1 onactivityprepaused_menuhosthelper__externalsyntheticlambda1 = new onActivityPrePaused$MenuHostHelper$$ExternalSyntheticLambda1() { // from class: o.WindowInsetsCompat$Impl28$.ExternalSyntheticApiModelOutline0.setUiOptions.2
                @Override // o.onActivityPrePaused$MenuHostHelper$$ExternalSyntheticLambda1
                public final View setIconTintList(int i) {
                    return setUiOptions.this.setOnLongClickListener(i);
                }

                @Override // o.onActivityPrePaused$MenuHostHelper$$ExternalSyntheticLambda1
                public final int MenuHostHelper$$ExternalSyntheticLambda1() {
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = setUiOptions.this.setMaxEms;
                    if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                        return windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingLeft();
                    }
                    return 0;
                }

                @Override // o.onActivityPrePaused$MenuHostHelper$$ExternalSyntheticLambda1
                public final int setX() {
                    int i = setUiOptions.this.setGuidelinePercent;
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = setUiOptions.this.setMaxEms;
                    return i - (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingRight() : 0);
                }

                @Override // o.onActivityPrePaused$MenuHostHelper$$ExternalSyntheticLambda1
                public final int setX(View view) {
                    return (view.getLeft() - ((setLayoutAnimation) view.getLayoutParams()).setIconTintList.left) - ((ViewGroup.MarginLayoutParams) ((setLayoutAnimation) view.getLayoutParams())).leftMargin;
                }

                @Override // o.onActivityPrePaused$MenuHostHelper$$ExternalSyntheticLambda1
                public final int setY(View view) {
                    return view.getRight() + ((setLayoutAnimation) view.getLayoutParams()).setIconTintList.right + ((ViewGroup.MarginLayoutParams) ((setLayoutAnimation) view.getLayoutParams())).rightMargin;
                }
            };
            this.setIconTintList = onactivityprepaused_menuhosthelper__externalsyntheticlambda1;
            onActivityPrePaused$MenuHostHelper$$ExternalSyntheticLambda1 onactivityprepaused_menuhosthelper__externalsyntheticlambda12 = new onActivityPrePaused$MenuHostHelper$$ExternalSyntheticLambda1() { // from class: o.WindowInsetsCompat$Impl28$.ExternalSyntheticApiModelOutline0.setUiOptions.3
                @Override // o.onActivityPrePaused$MenuHostHelper$$ExternalSyntheticLambda1
                public final View setIconTintList(int i) {
                    return setUiOptions.this.setOnLongClickListener(i);
                }

                @Override // o.onActivityPrePaused$MenuHostHelper$$ExternalSyntheticLambda1
                public final int MenuHostHelper$$ExternalSyntheticLambda1() {
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = setUiOptions.this.setMaxEms;
                    if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                        return windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingTop();
                    }
                    return 0;
                }

                @Override // o.onActivityPrePaused$MenuHostHelper$$ExternalSyntheticLambda1
                public final int setX() {
                    int i = setUiOptions.this.ViewPager$SavedState$1;
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = setUiOptions.this.setMaxEms;
                    return i - (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingBottom() : 0);
                }

                @Override // o.onActivityPrePaused$MenuHostHelper$$ExternalSyntheticLambda1
                public final int setX(View view) {
                    return (view.getTop() - ((setLayoutAnimation) view.getLayoutParams()).setIconTintList.top) - ((ViewGroup.MarginLayoutParams) ((setLayoutAnimation) view.getLayoutParams())).topMargin;
                }

                @Override // o.onActivityPrePaused$MenuHostHelper$$ExternalSyntheticLambda1
                public final int setY(View view) {
                    return view.getBottom() + ((setLayoutAnimation) view.getLayoutParams()).setIconTintList.bottom + ((ViewGroup.MarginLayoutParams) ((setLayoutAnimation) view.getLayoutParams())).bottomMargin;
                }
            };
            this.setX = onactivityprepaused_menuhosthelper__externalsyntheticlambda12;
            this.setCenterIfNoTextEnabled = new onActivityPrePaused(onactivityprepaused_menuhosthelper__externalsyntheticlambda1);
            this.setMinAndMaxProgress = new onActivityPrePaused(onactivityprepaused_menuhosthelper__externalsyntheticlambda12);
            this.setTextScaleX = false;
            this.setTextAlignment = false;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
            this.setY = true;
            this.setChipCornerRadius = true;
        }

        final void setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) {
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 == null) {
                this.setMaxEms = null;
                this.setLayoutAnimation = null;
                this.setGuidelinePercent = 0;
                this.ViewPager$SavedState$1 = 0;
            } else {
                this.setMaxEms = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
                this.setLayoutAnimation = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation;
                this.setGuidelinePercent = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getWidth();
                this.ViewPager$SavedState$1 = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getHeight();
            }
            this.setTextAppearanceResource = 1073741824;
            this.setIconSize = 1073741824;
        }

        final void setIconTintList(int i, int i2) {
            this.setGuidelinePercent = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.setTextAppearanceResource = mode;
            if (mode == 0 && !WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setIconTintList) {
                this.setGuidelinePercent = 0;
            }
            this.ViewPager$SavedState$1 = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.setIconSize = mode2;
            if (mode2 != 0 || WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setIconTintList) {
                return;
            }
            this.ViewPager$SavedState$1 = 0;
        }

        final void setOnLongClickListener(int i, int i2) {
            int ViewPager$SavedState$1 = ViewPager$SavedState$1();
            if (ViewPager$SavedState$1 == 0) {
                this.setMaxEms.setIconTintList(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < ViewPager$SavedState$1; i7++) {
                View onLongClickListener = setOnLongClickListener(i7);
                Rect rect = this.setMaxEms.setAdapter;
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setIconTintList(onLongClickListener, rect);
                if (rect.left < i3) {
                    i3 = rect.left;
                }
                if (rect.right > i5) {
                    i5 = rect.right;
                }
                if (rect.top < i4) {
                    i4 = rect.top;
                }
                if (rect.bottom > i6) {
                    i6 = rect.bottom;
                }
            }
            this.setMaxEms.setAdapter.set(i3, i4, i5, i6);
            MenuHostHelper$$ExternalSyntheticLambda1(this.setMaxEms.setAdapter, i, i2);
        }

        public void MenuHostHelper$$ExternalSyntheticLambda1(Rect rect, int i, int i2) {
            int width = rect.width();
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
            int paddingLeft = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingLeft() : 0;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = this.setMaxEms;
            int paddingRight = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.getPaddingRight() : 0;
            int height = rect.height();
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03 = this.setMaxEms;
            int paddingTop = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.getPaddingTop() : 0;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04 = this.setMaxEms;
            this.setMaxEms.setMeasuredDimension(MenuHostHelper$$ExternalSyntheticLambda1(i, width + paddingLeft + paddingRight, setBaselineAlignBottom.setTextScaleX(this.setMaxEms)), MenuHostHelper$$ExternalSyntheticLambda1(i2, height + paddingTop + (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04.getPaddingBottom() : 0), setBaselineAlignBottom.setIconSize(this.setMaxEms)));
        }

        public static int MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        public void MenuHostHelper$$ExternalSyntheticLambda1(String str) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setY(str);
            }
        }

        public boolean setUiOptions() {
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        public void MenuHostHelper$$ExternalSyntheticLambda0(setMaxEms setmaxems, setMinAndMaxProgress setminandmaxprogress) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public setLayoutAnimation setX(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof setLayoutAnimation) {
                return new setLayoutAnimation((setLayoutAnimation) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new setLayoutAnimation((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new setLayoutAnimation(layoutParams);
        }

        public setLayoutAnimation setIconTintList(Context context, AttributeSet attributeSet) {
            return new setLayoutAnimation(context, attributeSet);
        }

        public void setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public final void MenuHostHelper$$ExternalSyntheticLambda0(setZ setz) {
            setZ setz2 = this.setAnimationFromJson;
            if (setz2 != null && setz != setz2 && setz2.setUiOptions) {
                this.setAnimationFromJson.setY();
            }
            this.setAnimationFromJson = setz;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
            setLayoutDirection setlayoutdirection = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setSelectedChildViewEnabled;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.removeCallbacks(setlayoutdirection);
            setlayoutdirection.setY.abortAnimation();
            if (setz.setOnLongClickListener) {
                StringBuilder sb = new StringBuilder("An instance of ");
                sb.append(setz.getClass().getSimpleName());
                sb.append(" was started more than once. Each instance of");
                sb.append(setz.getClass().getSimpleName());
                sb.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w("RecyclerView", sb.toString());
            }
            setz.setUnboundedRipple = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
            setz.setIconTintList = this;
            if (setz.setLayoutAnimation == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setViewTranslationCallback.setIconSize = setz.setLayoutAnimation;
            setz.setUiOptions = true;
            setz.setY = true;
            setz.setNavigationOnClickListener = setz.setUnboundedRipple.setGuidelinePercent.MenuHostHelper$$ExternalSyntheticLambda1(setz.setLayoutAnimation);
            setLayoutDirection setlayoutdirection2 = setz.setUnboundedRipple.setSelectedChildViewEnabled;
            if (setlayoutdirection2.MenuHostHelper$$ExternalSyntheticLambda1) {
                setlayoutdirection2.setUnboundedRipple = true;
            } else {
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.removeCallbacks(setlayoutdirection2);
                setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this, setlayoutdirection2);
            }
            setz.setOnLongClickListener = true;
        }

        public final void setIconTintList(View view, int i) {
            setX(view, 0, true);
        }

        public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, int i) {
            setX(view, 0, false);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void setX(android.view.View r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 360
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setX(android.view.View, int, boolean):void");
        }

        public static int setOnLongClickListener(View view) {
            setCheckedIconEnabled setcheckediconenabled = ((setLayoutAnimation) view.getLayoutParams()).setUnboundedRipple;
            int i = setcheckediconenabled.setTextAlignment;
            return i == -1 ? setcheckediconenabled.setIconSize : i;
        }

        public final View setIconTintList(View view) {
            View MenuHostHelper$$ExternalSyntheticLambda0;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 == null || (MenuHostHelper$$ExternalSyntheticLambda0 = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.MenuHostHelper$$ExternalSyntheticLambda0(view)) == null || this.setLayoutAnimation.setX.contains(MenuHostHelper$$ExternalSyntheticLambda0)) {
                return null;
            }
            return MenuHostHelper$$ExternalSyntheticLambda0;
        }

        public final void setY(int i, setMaxEms setmaxems) {
            View onLongClickListener = setOnLongClickListener(i);
            if (setOnLongClickListener(i) != null) {
                this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0(i);
            }
            setmaxems.setY(onLongClickListener);
        }

        public final int ViewPager$SavedState$1() {
            setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
            if (setboxbackgroundcolorstatelist != null) {
                return setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size();
            }
            return 0;
        }

        public final View setOnLongClickListener(int i) {
            setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
            if (setboxbackgroundcolorstatelist != null) {
                return setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda1(setboxbackgroundcolorstatelist.setIconTintList(i));
            }
            return null;
        }

        public final View setCenterIfNoTextEnabled() {
            View focusedChild;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 == null || (focusedChild = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getFocusedChild()) == null || this.setLayoutAnimation.setX.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public final int setIconSize() {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener : null;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                return windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1.setY();
            }
            return 0;
        }

        public void setLayoutAnimation(int i) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation;
                int MenuHostHelper$$ExternalSyntheticLambda0 = setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size();
                for (int i2 = 0; i2 < MenuHostHelper$$ExternalSyntheticLambda0; i2++) {
                    setBoxBackgroundColorStateList setboxbackgroundcolorstatelist2 = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation;
                    setboxbackgroundcolorstatelist2.setY.MenuHostHelper$$ExternalSyntheticLambda1(setboxbackgroundcolorstatelist2.setIconTintList(i2)).offsetLeftAndRight(i);
                }
            }
        }

        public void setUnboundedRipple(int i) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation;
                int MenuHostHelper$$ExternalSyntheticLambda0 = setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size();
                for (int i2 = 0; i2 < MenuHostHelper$$ExternalSyntheticLambda0; i2++) {
                    setBoxBackgroundColorStateList setboxbackgroundcolorstatelist2 = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation;
                    setboxbackgroundcolorstatelist2.setY.MenuHostHelper$$ExternalSyntheticLambda1(setboxbackgroundcolorstatelist2.setIconTintList(i2)).offsetTopAndBottom(i);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final boolean setX(View view, int i, int i2, setLayoutAnimation setlayoutanimation) {
            return (this.setY && setIconTintList(view.getMeasuredWidth(), i, ((ViewGroup.LayoutParams) setlayoutanimation).width) && setIconTintList(view.getMeasuredHeight(), i2, ((ViewGroup.LayoutParams) setlayoutanimation).height)) ? false : true;
        }

        public final boolean MenuHostHelper$$ExternalSyntheticLambda1(View view, int i, int i2, setLayoutAnimation setlayoutanimation) {
            return (!view.isLayoutRequested() && this.setY && setIconTintList(view.getWidth(), i, ((ViewGroup.LayoutParams) setlayoutanimation).width) && setIconTintList(view.getHeight(), i2, ((ViewGroup.LayoutParams) setlayoutanimation).height)) ? false : true;
        }

        private static boolean setIconTintList(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 <= 0 || i == i3) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i;
                } else {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r4 == 1073741824) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int setIconTintList(int r3, int r4, int r5, int r6, boolean r7) {
            /*
                int r3 = r3 - r5
                r5 = 0
                int r3 = java.lang.Math.max(r5, r3)
                r0 = -1
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = 1073741824(0x40000000, float:2.0)
                if (r7 == 0) goto L18
                if (r6 >= 0) goto L1a
                if (r6 != r0) goto L2e
                if (r4 == r1) goto L2b
                if (r4 == 0) goto L2e
                if (r4 == r2) goto L2b
                goto L2e
            L18:
                if (r6 < 0) goto L1d
            L1a:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L2f
            L1d:
                if (r6 != r0) goto L20
                goto L2b
            L20:
                r7 = -2
                if (r6 != r7) goto L2e
                if (r4 == r1) goto L29
                if (r4 == r2) goto L29
                r4 = 0
                goto L2b
            L29:
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
            L2b:
                r6 = r3
                r5 = r4
                goto L2f
            L2e:
                r6 = 0
            L2f:
                int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r5)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setIconTintList(int, int, int, int, boolean):int");
        }

        public static int setUiOptions(View view) {
            Rect rect = ((setLayoutAnimation) view.getLayoutParams()).setIconTintList;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public static int MenuHostHelper$$ExternalSyntheticLambda0(View view) {
            Rect rect = ((setLayoutAnimation) view.getLayoutParams()).setIconTintList;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public static void MenuHostHelper$$ExternalSyntheticLambda0(View view, int i, int i2, int i3, int i4) {
            setLayoutAnimation setlayoutanimation = (setLayoutAnimation) view.getLayoutParams();
            Rect rect = setlayoutanimation.setIconTintList;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) setlayoutanimation).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) setlayoutanimation).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) setlayoutanimation).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) setlayoutanimation).bottomMargin);
        }

        public final void MenuHostHelper$$ExternalSyntheticLambda0(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((setLayoutAnimation) view.getLayoutParams()).setIconTintList;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.setMaxEms != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.setMaxEms.setImageTintMode;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public static int setLayoutAnimation(View view) {
            return ((setLayoutAnimation) view.getLayoutParams()).setIconTintList.top;
        }

        public static int setUnboundedRipple(View view) {
            return ((setLayoutAnimation) view.getLayoutParams()).setIconTintList.left;
        }

        public static int setNavigationOnClickListener(View view) {
            return ((setLayoutAnimation) view.getLayoutParams()).setIconTintList.right;
        }

        final void setOnNavigationItemSelectedListener() {
            setZ setz = this.setAnimationFromJson;
            if (setz != null) {
                setz.setY();
            }
        }

        public final void setIconTintList(setMaxEms setmaxems) {
            for (int ViewPager$SavedState$1 = ViewPager$SavedState$1() - 1; ViewPager$SavedState$1 >= 0; ViewPager$SavedState$1--) {
                if (!((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setY(setOnLongClickListener(ViewPager$SavedState$1)).MenuHostHelper$$ExternalSyntheticLambda1 & 128) != 0)) {
                    View onLongClickListener = setOnLongClickListener(ViewPager$SavedState$1);
                    if (setOnLongClickListener(ViewPager$SavedState$1) != null) {
                        this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0(ViewPager$SavedState$1);
                    }
                    setmaxems.setY(onLongClickListener);
                }
            }
        }

        public void MenuHostHelper$$ExternalSyntheticLambda0(setMaxEms setmaxems, setMinAndMaxProgress setminandmaxprogress, setDecorPadding setdecorpadding) {
            if (this.setMaxEms.canScrollVertically(-1) || this.setMaxEms.canScrollHorizontally(-1)) {
                setdecorpadding.setIconTintList(8192);
                setdecorpadding.setIconSize(true);
            }
            if (this.setMaxEms.canScrollVertically(1) || this.setMaxEms.canScrollHorizontally(1)) {
                setdecorpadding.setIconTintList(4096);
                setdecorpadding.setIconSize(true);
            }
            setdecorpadding.setX(setDecorPadding.setX.setIconTintList(setIconTintList(setmaxems, setminandmaxprogress), MenuHostHelper$$ExternalSyntheticLambda1(setmaxems, setminandmaxprogress), false, 0));
        }

        public void MenuHostHelper$$ExternalSyntheticLambda0(AccessibilityEvent accessibilityEvent) {
            setMaxEms setmaxems = this.setMaxEms.setContentScrimResource;
            setMinAndMaxProgress setminandmaxprogress = this.setMaxEms.setViewTranslationCallback;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.canScrollVertically(1) && !this.setMaxEms.canScrollVertically(-1) && !this.setMaxEms.canScrollHorizontally(-1) && !this.setMaxEms.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            if (this.setMaxEms.setNavigationOnClickListener != null) {
                accessibilityEvent.setItemCount(this.setMaxEms.setNavigationOnClickListener.setY());
            }
        }

        public final void setY(View view, setDecorPadding setdecorpadding) {
            setCheckedIconEnabled y = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setY(view);
            if (y != null) {
                if ((y.MenuHostHelper$$ExternalSyntheticLambda1 & 8) != 0) {
                    return;
                }
                if (this.setLayoutAnimation.setX.contains(y.setIconTintList)) {
                    return;
                }
                setIconTintList(this.setMaxEms.setContentScrimResource, this.setMaxEms.setViewTranslationCallback, view, setdecorpadding);
            }
        }

        public void setIconTintList(setMaxEms setmaxems, setMinAndMaxProgress setminandmaxprogress, View view, setDecorPadding setdecorpadding) {
            int i;
            int i2;
            if (setIconTintList()) {
                setCheckedIconEnabled setcheckediconenabled = ((setLayoutAnimation) view.getLayoutParams()).setUnboundedRipple;
                int i3 = setcheckediconenabled.setTextAlignment;
                if (i3 == -1) {
                    i3 = setcheckediconenabled.setIconSize;
                }
                i = i3;
            } else {
                i = 0;
            }
            if (MenuHostHelper$$ExternalSyntheticLambda1()) {
                setCheckedIconEnabled setcheckediconenabled2 = ((setLayoutAnimation) view.getLayoutParams()).setUnboundedRipple;
                int i4 = setcheckediconenabled2.setTextAlignment;
                i2 = i4 == -1 ? setcheckediconenabled2.setIconSize : i4;
            } else {
                i2 = 0;
            }
            setdecorpadding.setY(setDecorPadding.setY.MenuHostHelper$$ExternalSyntheticLambda0(i, 1, i2, 1, false, false));
        }

        public int setIconTintList(setMaxEms setmaxems, setMinAndMaxProgress setminandmaxprogress) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 == null || windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener == null || !setIconTintList()) {
                return 1;
            }
            return this.setMaxEms.setNavigationOnClickListener.setY();
        }

        public int MenuHostHelper$$ExternalSyntheticLambda1(setMaxEms setmaxems, setMinAndMaxProgress setminandmaxprogress) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 == null || windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener == null || !MenuHostHelper$$ExternalSyntheticLambda1()) {
                return 1;
            }
            return this.setMaxEms.setNavigationOnClickListener.setY();
        }

        public boolean MenuHostHelper$$ExternalSyntheticLambda0(setMaxEms setmaxems, setMinAndMaxProgress setminandmaxprogress, int i, Bundle bundle) {
            int i2;
            int paddingRight;
            int i3;
            int i4;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 == null) {
                return false;
            }
            if (i == 4096) {
                if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.canScrollVertically(1)) {
                    int i5 = this.ViewPager$SavedState$1;
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = this.setMaxEms;
                    int paddingTop = i5 - (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.getPaddingTop() : 0);
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03 = this.setMaxEms;
                    i2 = paddingTop - (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.getPaddingBottom() : 0);
                } else {
                    i2 = 0;
                }
                if (this.setMaxEms.canScrollHorizontally(1)) {
                    int i6 = this.setGuidelinePercent;
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04 = this.setMaxEms;
                    int paddingLeft = i6 - (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04.getPaddingLeft() : 0);
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline05 = this.setMaxEms;
                    paddingRight = paddingLeft - (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline05 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline05.getPaddingRight() : 0);
                    i3 = i2;
                    i4 = paddingRight;
                }
                i3 = i2;
                i4 = 0;
            } else if (i != 8192) {
                i4 = 0;
                i3 = 0;
            } else {
                if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.canScrollVertically(-1)) {
                    int i7 = this.ViewPager$SavedState$1;
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline06 = this.setMaxEms;
                    int paddingTop2 = i7 - (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline06 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline06.getPaddingTop() : 0);
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline07 = this.setMaxEms;
                    i2 = -(paddingTop2 - (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline07 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline07.getPaddingBottom() : 0));
                } else {
                    i2 = 0;
                }
                if (this.setMaxEms.canScrollHorizontally(-1)) {
                    int i8 = this.setGuidelinePercent;
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline08 = this.setMaxEms;
                    int paddingLeft2 = i8 - (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline08 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline08.getPaddingLeft() : 0);
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline09 = this.setMaxEms;
                    paddingRight = -(paddingLeft2 - (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline09 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline09.getPaddingRight() : 0));
                    i3 = i2;
                    i4 = paddingRight;
                }
                i3 = i2;
                i4 = 0;
            }
            if (i3 == 0 && i4 == 0) {
                return false;
            }
            this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0(i4, i3, null, Integer.MIN_VALUE, true);
            return true;
        }

        public static setIconTintList setY(Context context, AttributeSet attributeSet, int i, int i2) {
            setIconTintList seticontintlist = new setIconTintList();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setTitlePositionInterpolator$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0, i, i2);
            seticontintlist.setIconTintList = obtainStyledAttributes.getInt(setTitlePositionInterpolator$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList, 1);
            seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getInt(setTitlePositionInterpolator$MenuHostHelper$$ExternalSyntheticLambda0.setIconSize, 1);
            seticontintlist.setY = obtainStyledAttributes.getBoolean(setTitlePositionInterpolator$MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled, false);
            seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getBoolean(setTitlePositionInterpolator$MenuHostHelper$$ExternalSyntheticLambda0.setChipCornerRadius, false);
            obtainStyledAttributes.recycle();
            return seticontintlist;
        }

        public final void setY(View view) {
            setX(view, -1, true);
        }

        public final void setX(View view) {
            setX(view, -1, false);
        }

        public final void setX(setMaxEms setmaxems) {
            setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
            for (int MenuHostHelper$$ExternalSyntheticLambda0 = (setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0) - 1; MenuHostHelper$$ExternalSyntheticLambda0 >= 0; MenuHostHelper$$ExternalSyntheticLambda0--) {
                setBoxBackgroundColorStateList setboxbackgroundcolorstatelist2 = this.setLayoutAnimation;
                View MenuHostHelper$$ExternalSyntheticLambda1 = setboxbackgroundcolorstatelist2 != null ? setboxbackgroundcolorstatelist2.setY.MenuHostHelper$$ExternalSyntheticLambda1(setboxbackgroundcolorstatelist2.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0)) : null;
                setCheckedIconEnabled y = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setY(MenuHostHelper$$ExternalSyntheticLambda1);
                if (!((y.MenuHostHelper$$ExternalSyntheticLambda1 & 128) != 0)) {
                    if ((y.MenuHostHelper$$ExternalSyntheticLambda1 & 4) != 0) {
                        if (!((y.MenuHostHelper$$ExternalSyntheticLambda1 & 8) != 0) && !this.setMaxEms.setNavigationOnClickListener.setY) {
                            setBoxBackgroundColorStateList setboxbackgroundcolorstatelist3 = this.setLayoutAnimation;
                            if ((setboxbackgroundcolorstatelist3 != null ? setboxbackgroundcolorstatelist3.setY.MenuHostHelper$$ExternalSyntheticLambda1(setboxbackgroundcolorstatelist3.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0)) : null) != null) {
                                this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0);
                            }
                            setmaxems.MenuHostHelper$$ExternalSyntheticLambda1(y);
                        }
                    }
                    setBoxBackgroundColorStateList setboxbackgroundcolorstatelist4 = this.setLayoutAnimation;
                    if (setboxbackgroundcolorstatelist4 != null) {
                        setboxbackgroundcolorstatelist4.setY.MenuHostHelper$$ExternalSyntheticLambda1(setboxbackgroundcolorstatelist4.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0));
                    }
                    setBoxBackgroundColorStateList setboxbackgroundcolorstatelist5 = this.setLayoutAnimation;
                    int iconTintList = setboxbackgroundcolorstatelist5.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0);
                    setboxbackgroundcolorstatelist5.MenuHostHelper$$ExternalSyntheticLambda1.setY(iconTintList);
                    setboxbackgroundcolorstatelist5.setY.setX(iconTintList);
                    setmaxems.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda1);
                    setNormalColor.setY sety = this.setMaxEms.RecyclerView$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1.get(y);
                    if (sety != null) {
                        sety.MenuHostHelper$$ExternalSyntheticLambda1 &= -2;
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
            return r3;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.view.View MenuHostHelper$$ExternalSyntheticLambda1(int r8) {
            /*
                r7 = this;
                o.setBoxBackgroundColorStateList r0 = r7.setLayoutAnimation
                r1 = 0
                if (r0 == 0) goto L13
                o.setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda1 r2 = r0.setY
                int r2 = r2.MenuHostHelper$$ExternalSyntheticLambda0()
                java.util.List<android.view.View> r0 = r0.setX
                int r0 = r0.size()
                int r2 = r2 - r0
                goto L14
            L13:
                r2 = 0
            L14:
                r0 = 0
            L15:
                r3 = 0
                if (r0 >= r2) goto L57
                o.setBoxBackgroundColorStateList r4 = r7.setLayoutAnimation
                if (r4 == 0) goto L26
                int r3 = r4.setIconTintList(r0)
                o.setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda1 r4 = r4.setY
                android.view.View r3 = r4.MenuHostHelper$$ExternalSyntheticLambda1(r3)
            L26:
                o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled r4 = o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setY(r3)
                if (r4 == 0) goto L54
                int r5 = r4.setTextAlignment
                r6 = -1
                if (r5 != r6) goto L33
                int r5 = r4.setIconSize
            L33:
                if (r5 != r8) goto L54
                int r5 = r4.MenuHostHelper$$ExternalSyntheticLambda1
                r5 = r5 & 128(0x80, float:1.8E-43)
                r6 = 1
                if (r5 == 0) goto L3e
                r5 = 1
                goto L3f
            L3e:
                r5 = 0
            L3f:
                if (r5 != 0) goto L54
                o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 r5 = r7.setMaxEms
                o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMinAndMaxProgress r5 = r5.setViewTranslationCallback
                boolean r5 = r5.setIconTintList
                if (r5 != 0) goto L53
                int r4 = r4.MenuHostHelper$$ExternalSyntheticLambda1
                r4 = r4 & 8
                if (r4 == 0) goto L50
                goto L51
            L50:
                r6 = 0
            L51:
                if (r6 != 0) goto L54
            L53:
                return r3
            L54:
                int r0 = r0 + 1
                goto L15
            L57:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(int):android.view.View");
        }

        final void MenuHostHelper$$ExternalSyntheticLambda1(setMaxEms setmaxems) {
            int size = setmaxems.setIconTintList.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = setmaxems.setIconTintList.get(i).setIconTintList;
                setCheckedIconEnabled y = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setY(view);
                if (!((y.MenuHostHelper$$ExternalSyntheticLambda1 & 128) != 0)) {
                    y.MenuHostHelper$$ExternalSyntheticLambda1(false);
                    if ((y.MenuHostHelper$$ExternalSyntheticLambda1 & 256) != 0) {
                        this.setMaxEms.removeDetachedView(view, false);
                    }
                    if (this.setMaxEms.setTextScaleX != null) {
                        this.setMaxEms.setTextScaleX.setX(y);
                    }
                    y.MenuHostHelper$$ExternalSyntheticLambda1(true);
                    setCheckedIconEnabled y2 = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setY(view);
                    y2.setCenterIfNoTextEnabled = null;
                    y2.setX = false;
                    y2.MenuHostHelper$$ExternalSyntheticLambda1 &= -33;
                    setmaxems.MenuHostHelper$$ExternalSyntheticLambda1(y2);
                }
            }
            setmaxems.setIconTintList.clear();
            ArrayList<setCheckedIconEnabled> arrayList = setmaxems.MenuHostHelper$$ExternalSyntheticLambda1;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.setMaxEms.invalidate();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:57:0x00e8, code lost:
            if (r3 == false) goto L45;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean MenuHostHelper$$ExternalSyntheticLambda1(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 r22, android.view.View r23, android.graphics.Rect r24, boolean r25, boolean r26) {
            /*
                Method dump skipped, instructions count: 265
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }
    }

    /* loaded from: classes.dex */
    public static abstract class setUnboundedRipple {
        public void MenuHostHelper$$ExternalSyntheticLambda0(Canvas canvas, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) {
        }

        public void setY(Canvas canvas) {
        }

        public void MenuHostHelper$$ExternalSyntheticLambda1(Rect rect, View view, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, setMinAndMaxProgress setminandmaxprogress) {
            setCheckedIconEnabled setcheckediconenabled = ((setLayoutAnimation) view.getLayoutParams()).setUnboundedRipple;
            if (setcheckediconenabled.setTextAlignment == -1) {
                int i = setcheckediconenabled.setIconSize;
            }
            rect.set(0, 0, 0, 0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class setCheckedIconEnabled {
        private static final List<Object> setAnimationFromJson = Collections.emptyList();
        public int MenuHostHelper$$ExternalSyntheticLambda1;
        public final View setIconTintList;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 setUiOptions;
        WeakReference<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0> setUnboundedRipple;
        public int setIconSize = -1;
        int setOnLongClickListener = -1;
        public long MenuHostHelper$$ExternalSyntheticLambda0 = -1;
        int setY = -1;
        public int setTextAlignment = -1;
        setCheckedIconEnabled ViewPager$SavedState$1 = null;
        setCheckedIconEnabled setChipCornerRadius = null;
        List<Object> setNavigationOnClickListener = null;
        private List<Object> setZ = null;
        private int setTextScaleX = 0;
        setMaxEms setCenterIfNoTextEnabled = null;
        boolean setX = false;
        int setOnNavigationItemSelectedListener = 0;
        int setLayoutAnimation = -1;

        public setCheckedIconEnabled(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.setIconTintList = view;
        }

        final void setIconTintList(int i, boolean z) {
            if (this.setOnLongClickListener == -1) {
                this.setOnLongClickListener = this.setIconSize;
            }
            if (this.setTextAlignment == -1) {
                this.setTextAlignment = this.setIconSize;
            }
            if (z) {
                this.setTextAlignment += i;
            }
            this.setIconSize += i;
            if (this.setIconTintList.getLayoutParams() != null) {
                ((setLayoutAnimation) this.setIconTintList.getLayoutParams()).setX = true;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean setX() {
            return (this.setIconTintList.getParent() == null || this.setIconTintList.getParent() == this.setUiOptions) ? false : true;
        }

        final List<Object> MenuHostHelper$$ExternalSyntheticLambda0() {
            if ((this.MenuHostHelper$$ExternalSyntheticLambda1 & 1024) == 0) {
                List<Object> list = this.setNavigationOnClickListener;
                if (list == null || list.size() == 0) {
                    return setAnimationFromJson;
                }
                return this.setZ;
            }
            return setAnimationFromJson;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void setY() {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
            this.setIconSize = -1;
            this.setOnLongClickListener = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = -1L;
            this.setTextAlignment = -1;
            this.setTextScaleX = 0;
            this.ViewPager$SavedState$1 = null;
            this.setChipCornerRadius = null;
            List<Object> list = this.setNavigationOnClickListener;
            if (list != null) {
                list.clear();
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 &= -1025;
            this.setOnNavigationItemSelectedListener = 0;
            this.setLayoutAnimation = -1;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setX(this);
        }

        /* JADX WARN: Code restructure failed: missing block: B:66:0x0111, code lost:
            if (((r1 & 4) != 0) == false) goto L56;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 307
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled.toString():java.lang.String");
        }

        public final void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
            int i = this.setTextScaleX;
            int i2 = z ? i - 1 : i + 1;
            this.setTextScaleX = i2;
            if (i2 < 0) {
                this.setTextScaleX = 0;
                StringBuilder sb = new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
                Log.e("View", sb.toString());
            } else if (!z && i2 == 1) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 |= 16;
            } else if (z && i2 == 0) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 &= -17;
            }
        }

        final void setIconTintList(Object obj) {
            if (obj != null) {
                if ((this.MenuHostHelper$$ExternalSyntheticLambda1 & 1024) == 0) {
                    if (this.setNavigationOnClickListener == null) {
                        ArrayList arrayList = new ArrayList();
                        this.setNavigationOnClickListener = arrayList;
                        this.setZ = Collections.unmodifiableList(arrayList);
                    }
                    this.setNavigationOnClickListener.add(obj);
                    return;
                }
                return;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 |= 1024;
        }
    }

    private void setTextScaleX() {
        int i;
        for (int size = this.ExtendableSavedState$1.size() - 1; size >= 0; size--) {
            setCheckedIconEnabled setcheckediconenabled = this.ExtendableSavedState$1.get(size);
            if (setcheckediconenabled.setIconTintList.getParent() == this) {
                if (!((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 128) != 0) && (i = setcheckediconenabled.setLayoutAnimation) != -1) {
                    setBaselineAlignBottom.setUnboundedRipple(setcheckediconenabled.setIconTintList, i);
                    setcheckediconenabled.setLayoutAnimation = -1;
                }
            }
        }
        this.ExtendableSavedState$1.clear();
    }

    /* loaded from: classes.dex */
    public static class setLayoutAnimation extends ViewGroup.MarginLayoutParams {
        boolean MenuHostHelper$$ExternalSyntheticLambda0;
        public final Rect setIconTintList;
        public setCheckedIconEnabled setUnboundedRipple;
        boolean setX;

        public setLayoutAnimation(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.setIconTintList = new Rect();
            this.setX = true;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        }

        public setLayoutAnimation(int i, int i2) {
            super(i, i2);
            this.setIconTintList = new Rect();
            this.setX = true;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        }

        public setLayoutAnimation(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.setIconTintList = new Rect();
            this.setX = true;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        }

        public setLayoutAnimation(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.setIconTintList = new Rect();
            this.setX = true;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        }

        public setLayoutAnimation(setLayoutAnimation setlayoutanimation) {
            super((ViewGroup.LayoutParams) setlayoutanimation);
            this.setIconTintList = new Rect();
            this.setX = true;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class setZ {
        setUiOptions setIconTintList;
        View setNavigationOnClickListener;
        boolean setOnLongClickListener;
        public boolean setUiOptions;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 setUnboundedRipple;
        boolean setY;
        public int setLayoutAnimation = -1;
        private final WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0 = new WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1();

        /* loaded from: classes.dex */
        public interface setX {
            PointF setY(int i);
        }

        protected abstract void MenuHostHelper$$ExternalSyntheticLambda0();

        protected abstract void setIconTintList(int i, int i2, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1);

        protected abstract void setIconTintList(View view, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ$MenuHostHelper$$ExternalSyntheticLambda1);

        /* JADX INFO: Access modifiers changed from: protected */
        public final void setY() {
            if (this.setUiOptions) {
                this.setUiOptions = false;
                MenuHostHelper$$ExternalSyntheticLambda0();
                this.setUnboundedRipple.setViewTranslationCallback.setIconSize = -1;
                this.setNavigationOnClickListener = null;
                this.setLayoutAnimation = -1;
                this.setY = false;
                setUiOptions setuioptions = this.setIconTintList;
                if (setuioptions.setAnimationFromJson == this) {
                    setuioptions.setAnimationFromJson = null;
                }
                this.setIconTintList = null;
                this.setUnboundedRipple = null;
            }
        }

        final void setX(int i, int i2) {
            PointF MenuHostHelper$$ExternalSyntheticLambda0;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setUnboundedRipple;
            if (this.setLayoutAnimation == -1 || windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 == null) {
                setY();
            }
            if (this.setY && this.setNavigationOnClickListener == null && this.setIconTintList != null && (MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(this.setLayoutAnimation)) != null && (MenuHostHelper$$ExternalSyntheticLambda0.x != 0.0f || MenuHostHelper$$ExternalSyntheticLambda0.y != 0.0f)) {
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setY((int) Math.signum(MenuHostHelper$$ExternalSyntheticLambda0.x), (int) Math.signum(MenuHostHelper$$ExternalSyntheticLambda0.y), (int[]) null);
            }
            this.setY = false;
            View view = this.setNavigationOnClickListener;
            if (view != null) {
                if (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.MenuHostHelper$$ExternalSyntheticLambda1(view) == this.setLayoutAnimation) {
                    View view2 = this.setNavigationOnClickListener;
                    setMinAndMaxProgress setminandmaxprogress = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setViewTranslationCallback;
                    setIconTintList(view2, this.MenuHostHelper$$ExternalSyntheticLambda0);
                    this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0);
                    setY();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.setNavigationOnClickListener = null;
                }
            }
            if (this.setUiOptions) {
                setMinAndMaxProgress setminandmaxprogress2 = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setViewTranslationCallback;
                setIconTintList(i, i2, this.MenuHostHelper$$ExternalSyntheticLambda0);
                boolean z = this.MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener >= 0;
                this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0);
                if (z && this.setUiOptions) {
                    this.setY = true;
                    setLayoutDirection setlayoutdirection = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setSelectedChildViewEnabled;
                    if (setlayoutdirection.MenuHostHelper$$ExternalSyntheticLambda1) {
                        setlayoutdirection.setUnboundedRipple = true;
                        return;
                    }
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.removeCallbacks(setlayoutdirection);
                    setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this, setlayoutdirection);
                }
            }
        }

        public final PointF MenuHostHelper$$ExternalSyntheticLambda0(int i) {
            setUiOptions setuioptions = this.setIconTintList;
            if (setuioptions instanceof setX) {
                return ((setX) setuioptions).setY(i);
            }
            StringBuilder sb = new StringBuilder("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sb.append(setX.class.getCanonicalName());
            Log.w("RecyclerView", sb.toString());
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class setIconTintList extends Observable<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda0> {
        public final boolean setY() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void MenuHostHelper$$ExternalSyntheticLambda0() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda0) ((Observable) this).mObservers.get(size)).setY();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class setOnNavigationItemSelectedListener extends setOrientation {
        public static final Parcelable.Creator<setOnNavigationItemSelectedListener> CREATOR = new Parcelable.ClassLoaderCreator<setOnNavigationItemSelectedListener>() { // from class: androidx.recyclerview.widget.RecyclerView$SavedState$1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setOnNavigationItemSelectedListener(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setOnNavigationItemSelectedListener createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setOnNavigationItemSelectedListener(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setOnNavigationItemSelectedListener[i];
            }
        };
        Parcelable setX;

        public setOnNavigationItemSelectedListener(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.setX = parcel.readParcelable(classLoader == null ? setUiOptions.class.getClassLoader() : classLoader);
        }

        setOnNavigationItemSelectedListener(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // o.setOrientation, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.setX, 0);
        }
    }

    /* loaded from: classes.dex */
    public static class setMinAndMaxProgress {
        int MenuHostHelper$$ExternalSyntheticLambda0;
        long MenuHostHelper$$ExternalSyntheticLambda1;
        int ViewPager$SavedState$1;
        int setOnLongClickListener;
        private SparseArray<Object> setOnNavigationItemSelectedListener;
        int setX;
        public int setIconSize = -1;
        public int setNavigationOnClickListener = 0;
        public int setY = 0;
        int setUiOptions = 1;
        public int setLayoutAnimation = 0;
        boolean setChipCornerRadius = false;
        public boolean setIconTintList = false;
        boolean setTextScaleX = false;
        boolean setUnboundedRipple = false;
        boolean setTextAlignment = false;
        public boolean setCenterIfNoTextEnabled = false;

        final void setX(int i) {
            if ((this.setUiOptions & i) != 0) {
                return;
            }
            StringBuilder sb = new StringBuilder("Layout state should be one of ");
            sb.append(Integer.toBinaryString(i));
            sb.append(" but it is ");
            sb.append(Integer.toBinaryString(this.setUiOptions));
            throw new IllegalStateException(sb.toString());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.setIconSize);
            sb.append(", mData=");
            sb.append(this.setOnNavigationItemSelectedListener);
            sb.append(", mItemCount=");
            sb.append(this.setLayoutAnimation);
            sb.append(", mIsMeasuring=");
            sb.append(this.setUnboundedRipple);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.setNavigationOnClickListener);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.setY);
            sb.append(", mStructureChanged=");
            sb.append(this.setChipCornerRadius);
            sb.append(", mInPreLayout=");
            sb.append(this.setIconTintList);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.setTextAlignment);
            sb.append(", mRunPredictiveAnimations=");
            sb.append(this.setCenterIfNoTextEnabled);
            sb.append('}');
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    class setOnLongClickListener implements setNavigationOnClickListener.setX {
        setOnLongClickListener() {
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
        @Override // o.WindowInsetsCompat$Impl28$.ExternalSyntheticApiModelOutline0.setNavigationOnClickListener.setX
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void MenuHostHelper$$ExternalSyntheticLambda0(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled r9) {
            /*
                r8 = this;
                r0 = 1
                r9.MenuHostHelper$$ExternalSyntheticLambda1(r0)
                o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled r1 = r9.ViewPager$SavedState$1
                r2 = 0
                if (r1 == 0) goto Lf
                o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled r1 = r9.setChipCornerRadius
                if (r1 != 0) goto Lf
                r9.ViewPager$SavedState$1 = r2
            Lf:
                r9.setChipCornerRadius = r2
                int r1 = r9.MenuHostHelper$$ExternalSyntheticLambda1
                r1 = r1 & 16
                r3 = 0
                if (r1 == 0) goto L1a
                r1 = 1
                goto L1b
            L1a:
                r1 = 0
            L1b:
                if (r1 != 0) goto L98
                o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 r1 = o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this
                android.view.View r4 = r9.setIconTintList
                int r5 = r1.setCenterIfNoTextEnabled
                int r5 = r5 + r0
                r1.setCenterIfNoTextEnabled = r5
                if (r5 != r0) goto L2e
                boolean r5 = r1.setLayoutDirection
                if (r5 != 0) goto L2e
                r1.setMinAndMaxProgress = r3
            L2e:
                o.setBoxBackgroundColorStateList r5 = r1.setLayoutAnimation
                o.setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda1 r6 = r5.setY
                int r6 = r6.MenuHostHelper$$ExternalSyntheticLambda1(r4)
                r7 = -1
                if (r6 != r7) goto L48
                java.util.List<android.view.View> r6 = r5.setX
                boolean r6 = r6.remove(r4)
                if (r6 == 0) goto L46
                o.setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda1 r5 = r5.setY
                r5.setY(r4)
            L46:
                r5 = 1
                goto L69
            L48:
                o.setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0 r7 = r5.MenuHostHelper$$ExternalSyntheticLambda1
                boolean r7 = r7.setX(r6)
                if (r7 == 0) goto L68
                o.setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0 r7 = r5.MenuHostHelper$$ExternalSyntheticLambda1
                r7.setY(r6)
                java.util.List<android.view.View> r7 = r5.setX
                boolean r7 = r7.remove(r4)
                if (r7 == 0) goto L62
                o.setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda1 r7 = r5.setY
                r7.setY(r4)
            L62:
                o.setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda1 r5 = r5.setY
                r5.setIconTintList(r6)
                goto L46
            L68:
                r5 = 0
            L69:
                if (r5 == 0) goto L80
                if (r4 != 0) goto L6e
                goto L76
            L6e:
                android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
                o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setLayoutAnimation r2 = (o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) r2
                o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled r2 = r2.setUnboundedRipple
            L76:
                o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMaxEms r4 = r1.setContentScrimResource
                r4.setIconTintList(r2)
                o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMaxEms r4 = r1.setContentScrimResource
                r4.MenuHostHelper$$ExternalSyntheticLambda1(r2)
            L80:
                r2 = r5 ^ 1
                r1.setX(r2)
                if (r5 != 0) goto L98
                int r1 = r9.MenuHostHelper$$ExternalSyntheticLambda1
                r1 = r1 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L8e
                goto L8f
            L8e:
                r0 = 0
            L8f:
                if (r0 == 0) goto L98
                o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 r0 = o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this
                android.view.View r9 = r9.setIconTintList
                r0.removeDetachedView(r9, r3)
            L98:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled):void");
        }
    }

    /* loaded from: classes.dex */
    public static abstract class setNavigationOnClickListener {
        setX setUiOptions = null;
        private ArrayList<setY> setIconTintList = new ArrayList<>();
        long setLayoutAnimation = 120;
        private long setX = 120;
        long setIconSize = 250;
        long setOnLongClickListener = 250;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public interface setX {
            void MenuHostHelper$$ExternalSyntheticLambda0(setCheckedIconEnabled setcheckediconenabled);
        }

        /* loaded from: classes.dex */
        public interface setY {
        }

        public abstract void MenuHostHelper$$ExternalSyntheticLambda0();

        public abstract boolean MenuHostHelper$$ExternalSyntheticLambda0(setCheckedIconEnabled setcheckediconenabled, setCheckedIconEnabled setcheckediconenabled2, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02);

        public abstract boolean MenuHostHelper$$ExternalSyntheticLambda0(setCheckedIconEnabled setcheckediconenabled, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02);

        public abstract boolean MenuHostHelper$$ExternalSyntheticLambda1(setCheckedIconEnabled setcheckediconenabled, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02);

        public abstract void setX();

        public abstract void setX(setCheckedIconEnabled setcheckediconenabled);

        public abstract boolean setY();

        public boolean setY(setCheckedIconEnabled setcheckediconenabled) {
            return true;
        }

        public abstract boolean setY(setCheckedIconEnabled setcheckediconenabled, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda02);

        public final long setIconTintList() {
            return this.setX;
        }

        static int MenuHostHelper$$ExternalSyntheticLambda1(setCheckedIconEnabled setcheckediconenabled) {
            int i = setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 14;
            if ((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 4) != 0) {
                return 4;
            }
            if ((i & 4) == 0) {
                int i2 = setcheckediconenabled.setOnLongClickListener;
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = setcheckediconenabled.setUiOptions;
                int iconTintList = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 == null ? -1 : windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setIconTintList(setcheckediconenabled);
                return (i2 == -1 || iconTintList == -1 || i2 == iconTintList) ? i : i | 2048;
            }
            return i;
        }

        public boolean setX(setCheckedIconEnabled setcheckediconenabled, List<Object> list) {
            return setY(setcheckediconenabled);
        }

        public final void MenuHostHelper$$ExternalSyntheticLambda1() {
            int size = this.setIconTintList.size();
            for (int i = 0; i < size; i++) {
                this.setIconTintList.get(i);
            }
            this.setIconTintList.clear();
        }

        public static WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0 setOnLongClickListener() {
            return new WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0();
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        setY sety = this.setChipSpacingVertical;
        if (sety == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return sety.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    private void setOnLongClickListener() {
        VelocityTracker velocityTracker = this.setOnScrollChangeListener;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        if (this.setFilterTouchesWhenObscured == null) {
            this.setFilterTouchesWhenObscured = new Month$1(this);
        }
        this.setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(0);
        setCenterIfNoTextEnabled();
        if (this.setObjectValues != 0) {
            this.setObjectValues = 0;
            setLayoutDirection setlayoutdirection = this.setSelectedChildViewEnabled;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.this.removeCallbacks(setlayoutdirection);
            setlayoutdirection.setY.abortAnimation();
            setUiOptions setuioptions = this.setGuidelinePercent;
            if (setuioptions != null) {
                setuioptions.setOnNavigationItemSelectedListener();
            }
            setY(0);
        }
    }

    private void setChipCornerRadius() {
        int i = this.setCenterIfNoTextEnabled + 1;
        this.setCenterIfNoTextEnabled = i;
        if (i == 1 && !this.setLayoutDirection) {
            this.setMinAndMaxProgress = false;
        }
        this.setTextAppearanceResource++;
        this.setViewTranslationCallback.setX(6);
        this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0();
        this.setViewTranslationCallback.setLayoutAnimation = this.setNavigationOnClickListener.setY();
        this.setViewTranslationCallback.setY = 0;
        this.setViewTranslationCallback.setIconTintList = false;
        this.setGuidelinePercent.MenuHostHelper$$ExternalSyntheticLambda0(this.setContentScrimResource, this.setViewTranslationCallback);
        this.setViewTranslationCallback.setChipCornerRadius = false;
        this.setBackgroundTintMode = null;
        setMinAndMaxProgress setminandmaxprogress = this.setViewTranslationCallback;
        setminandmaxprogress.setTextAlignment = setminandmaxprogress.setTextAlignment && this.setTextScaleX != null;
        this.setViewTranslationCallback.setUiOptions = 4;
        MenuHostHelper$$ExternalSyntheticLambda1(true);
        setX(false);
    }

    final void setY(String str) {
        if (this.setTextAppearanceResource > 0) {
            if (str == null) {
                StringBuilder sb = new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sb.append(setX());
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.setHint > 0) {
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(setX());
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(sb2.toString()));
        }
    }

    final void setX(View view) {
        if (view != null) {
            setCheckedIconEnabled setcheckediconenabled = ((setLayoutAnimation) view.getLayoutParams()).setUnboundedRipple;
        }
        List<setChipCornerRadius> list = this.SearchView$SavedState$1;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.SearchView$SavedState$1.get(size);
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        if (this.setFilterTouchesWhenObscured == null) {
            this.setFilterTouchesWhenObscured = new Month$1(this);
        }
        return this.setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent viewParent;
        if (this.setFilterTouchesWhenObscured == null) {
            this.setFilterTouchesWhenObscured = new Month$1(this);
        }
        Month$1 month$1 = this.setFilterTouchesWhenObscured;
        if (!month$1.setIconTintList || (viewParent = month$1.MenuHostHelper$$ExternalSyntheticLambda1) == null) {
            return false;
        }
        return setChipIconResource.setY(viewParent, month$1.setY, f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        if (this.setFilterTouchesWhenObscured == null) {
            this.setFilterTouchesWhenObscured = new Month$1(this);
        }
        return this.setFilterTouchesWhenObscured.setY(i, i2, iArr, iArr2, 0);
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (this.setFilterTouchesWhenObscured == null) {
            this.setFilterTouchesWhenObscured = new Month$1(this);
        }
        return this.setFilterTouchesWhenObscured.setY(i, i2, iArr, iArr2, i3);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        if (this.setFilterTouchesWhenObscured == null) {
            this.setFilterTouchesWhenObscured = new Month$1(this);
        }
        this.setFilterTouchesWhenObscured.setIconTintList(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        if (this.setFilterTouchesWhenObscured == null) {
            this.setFilterTouchesWhenObscured = new Month$1(this);
        }
        return this.setFilterTouchesWhenObscured.setIconTintList(i, i2, i3, i4, iArr, 0, null);
    }

    private void setX(setMinAndMaxProgress setminandmaxprogress) {
        if (this.setObjectValues == 2) {
            OverScroller overScroller = this.setSelectedChildViewEnabled.setY;
            setminandmaxprogress.setOnLongClickListener = overScroller.getFinalX() - overScroller.getCurrX();
            setminandmaxprogress.ViewPager$SavedState$1 = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        setminandmaxprogress.setOnLongClickListener = 0;
        setminandmaxprogress.ViewPager$SavedState$1 = 0;
    }

    final int setIconTintList(setCheckedIconEnabled setcheckediconenabled) {
        if ((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 524) != 0) {
            return -1;
        }
        if ((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 1) != 0) {
            return this.setUiOptions.setY(setcheckediconenabled.setIconSize);
        }
        return -1;
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(View view) {
        setCheckedIconEnabled setcheckediconenabled = view == null ? null : ((setLayoutAnimation) view.getLayoutParams()).setUnboundedRipple;
        if (setcheckediconenabled != null) {
            int i = setcheckediconenabled.setTextAlignment;
            return i == -1 ? setcheckediconenabled.setIconSize : i;
        }
        return -1;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        if (this.setFilterTouchesWhenObscured == null) {
            this.setFilterTouchesWhenObscured = new Month$1(this);
        }
        return this.setFilterTouchesWhenObscured.setY(0);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        if (this.setFilterTouchesWhenObscured == null) {
            this.setFilterTouchesWhenObscured = new Month$1(this);
        }
        return this.setFilterTouchesWhenObscured.setIconTintList;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (this.setTextAppearanceResource > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    final void setX(setCheckedIconEnabled setcheckediconenabled, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0) {
        long j;
        setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 = (setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & (-8193)) | 0;
        if (this.setViewTranslationCallback.setTextScaleX) {
            if ((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 2) != 0) {
                if (!((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 8) != 0)) {
                    if (!((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 128) != 0)) {
                        if (!this.setNavigationOnClickListener.setY) {
                            j = setcheckediconenabled.setIconSize;
                        } else {
                            j = setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda0;
                        }
                        this.RecyclerView$SavedState$1.setY.setX(j, setcheckediconenabled);
                    }
                }
            }
        }
        this.RecyclerView$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setNavigationOnClickListener$MenuHostHelper$$ExternalSyntheticLambda0);
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
        setCheckedIconEnabled setcheckediconenabled = view == null ? null : ((setLayoutAnimation) view.getLayoutParams()).setUnboundedRipple;
        if (setcheckediconenabled != null) {
            if ((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 256) != 0) {
                setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 &= -257;
            } else {
                if (!((setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 & 128) != 0)) {
                    StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                    sb.append(setcheckediconenabled);
                    sb.append(setX());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        view.clearAnimation();
        setX(view);
        super.removeDetachedView(view, z);
    }

    final void setY(int i, int i2, int[] iArr) {
        int i3 = this.setCenterIfNoTextEnabled + 1;
        this.setCenterIfNoTextEnabled = i3;
        if (i3 == 1 && !this.setLayoutDirection) {
            this.setMinAndMaxProgress = false;
        }
        this.setTextAppearanceResource++;
        setItemAnimator.MenuHostHelper$$ExternalSyntheticLambda0("RV Scroll");
        setX(this.setViewTranslationCallback);
        int x = i != 0 ? this.setGuidelinePercent.setX(i, this.setContentScrimResource, this.setViewTranslationCallback) : 0;
        int y = i2 != 0 ? this.setGuidelinePercent.setY(i2, this.setContentScrimResource, this.setViewTranslationCallback) : 0;
        setItemAnimator.MenuHostHelper$$ExternalSyntheticLambda0();
        setMinAndMaxProgress();
        MenuHostHelper$$ExternalSyntheticLambda1(true);
        setX(false);
        if (iArr != null) {
            iArr[0] = x;
            iArr[1] = y;
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        boolean z = true;
        if (this.setTextAppearanceResource > 0) {
            int iconTintList = accessibilityEvent != null ? setCircleRadius.setIconTintList(accessibilityEvent) : 0;
            this.setTooltipText |= iconTintList != 0 ? iconTintList : 0;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    final boolean MenuHostHelper$$ExternalSyntheticLambda0(setCheckedIconEnabled setcheckediconenabled, int i) {
        if (this.setTextAppearanceResource > 0) {
            setcheckediconenabled.setLayoutAnimation = i;
            this.ExtendableSavedState$1.add(setcheckediconenabled);
            return false;
        }
        setBaselineAlignBottom.setUnboundedRipple(setcheckediconenabled.setIconTintList, i);
        return true;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        if (this.setFilterTouchesWhenObscured == null) {
            this.setFilterTouchesWhenObscured = new Month$1(this);
        }
        Month$1 month$1 = this.setFilterTouchesWhenObscured;
        if (month$1.setIconTintList) {
            setBaselineAlignBottom.setAdapter(month$1.setY);
        }
        month$1.setIconTintList = z;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        if (this.setFilterTouchesWhenObscured == null) {
            this.setFilterTouchesWhenObscured = new Month$1(this);
        }
        return this.setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        if (this.setFilterTouchesWhenObscured == null) {
            this.setFilterTouchesWhenObscured = new Month$1(this);
        }
        this.setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(0);
    }
}