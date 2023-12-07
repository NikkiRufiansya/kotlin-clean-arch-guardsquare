package o;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.WindowInsetsCompat;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o.setBaselineAlignBottom;
import o.setErrorAccessibilityLabelResource;

/* loaded from: classes.dex */
public class setErrorAccessibilityLabelResource extends ViewGroup {
    private float ExtendableSavedState$1;
    private int FabTransformationBehavior;
    private setNavigationOnClickListener FirebaseRemoteConfigKtxRegistrar;
    private float FloatingActionButton$BaseBehavior;
    private VelocityTracker Fragment$5;
    private boolean FragmentStateAdapter$2;
    private boolean FragmentStateAdapter$5;
    public int MenuHostHelper$$ExternalSyntheticLambda1;
    private setUiOptions RecyclerView$SavedState$1;
    private setOnLongClickListener SearchView$SavedState$1;
    private int ViewPager$SavedState$1;
    private final setIconTintList createDispatcher;
    private EdgeEffect getCallingPid;
    private Scroller onActivityResumed;
    private Drawable setAdapter;
    private final Runnable setAnimationFromJson;
    private int setCenterIfNoTextEnabled;
    private int setCheckedIconEnabled;
    private int setChipCornerRadius;
    private boolean setChipIconEnabled;
    private boolean setChipIconTintResource;
    private boolean setChipSpacingVertical;
    private int setCloseIconEndPadding;
    private final ArrayList<setIconTintList> setConstraintSet;
    private float setContentScrimResource;
    private Parcelable setError;
    private boolean setFilterRedundantCalls;
    private float setFilterTouchesWhenObscured;
    private int setFloatValues;
    private boolean setGuidelinePercent;
    private boolean setHasDecor;
    private int setHint;
    private boolean setIconSize;
    public List<setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda1> setIconTintList;
    private float setIconified;
    private setOnLongClickListener setImageTintMode;
    private int setLayoutDirection;
    private ArrayList<View> setMaxEms;
    private boolean setMinAndMaxProgress;
    private int setObjectValues;
    private int setOnNavigationItemSelectedListener;
    private final Rect setRevealInfo;
    private int setSelectedChildViewEnabled;
    private int setShrinkMotionSpec;
    private EdgeEffect setSuffixText;
    private int setTextAlignment;
    private float setTextAppearanceResource;
    private int setTextScaleX;
    private ClassLoader setTitleMarginEnd;
    private int setTooltipText;
    private int setUiOptions;
    private int setUnboundedRipple;
    private int setViewTranslationCallback;
    public List<setOnLongClickListener> setX;
    public setSelected setY;
    private int setZ;
    static final int[] MenuHostHelper$$ExternalSyntheticLambda0 = {16842931};
    private static final Comparator<setIconTintList> setLayoutAnimation = new Comparator<setIconTintList>() { // from class: o.setErrorAccessibilityLabelResource.4
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(setIconTintList seticontintlist, setIconTintList seticontintlist2) {
            return seticontintlist.setY - seticontintlist2.setY;
        }
    };
    private static final Interpolator setOnLongClickListener = new Interpolator() { // from class: o.setErrorAccessibilityLabelResource.1
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final setLayoutAnimation setNavigationOnClickListener = new setLayoutAnimation();

    /* loaded from: classes.dex */
    public interface setNavigationOnClickListener {
    }

    /* loaded from: classes.dex */
    public interface setOnLongClickListener {
        void MenuHostHelper$$ExternalSyntheticLambda1(int i, float f);

        void setIconTintList(int i);

        void setY(int i);
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface setY {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList {
        float MenuHostHelper$$ExternalSyntheticLambda0;
        Object MenuHostHelper$$ExternalSyntheticLambda1;
        boolean setIconTintList;
        float setX;
        int setY;

        setIconTintList() {
        }
    }

    public setErrorAccessibilityLabelResource(Context context) {
        super(context);
        this.setConstraintSet = new ArrayList<>();
        this.createDispatcher = new setIconTintList();
        this.setRevealInfo = new Rect();
        this.setHint = -1;
        this.setError = null;
        this.setTitleMarginEnd = null;
        this.setTextAppearanceResource = -3.4028235E38f;
        this.setFilterTouchesWhenObscured = Float.MAX_VALUE;
        this.setSelectedChildViewEnabled = 1;
        this.setUnboundedRipple = -1;
        this.setGuidelinePercent = true;
        this.setChipIconEnabled = false;
        this.setAnimationFromJson = new Runnable() { // from class: o.setErrorAccessibilityLabelResource.3
            @Override // java.lang.Runnable
            public final void run() {
                setErrorAccessibilityLabelResource.this.setX(0);
                setErrorAccessibilityLabelResource seterroraccessibilitylabelresource = setErrorAccessibilityLabelResource.this;
                seterroraccessibilitylabelresource.MenuHostHelper$$ExternalSyntheticLambda0(seterroraccessibilitylabelresource.MenuHostHelper$$ExternalSyntheticLambda1);
            }
        };
        this.setTooltipText = 0;
        setLayoutAnimation();
    }

    public setErrorAccessibilityLabelResource(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setConstraintSet = new ArrayList<>();
        this.createDispatcher = new setIconTintList();
        this.setRevealInfo = new Rect();
        this.setHint = -1;
        this.setError = null;
        this.setTitleMarginEnd = null;
        this.setTextAppearanceResource = -3.4028235E38f;
        this.setFilterTouchesWhenObscured = Float.MAX_VALUE;
        this.setSelectedChildViewEnabled = 1;
        this.setUnboundedRipple = -1;
        this.setGuidelinePercent = true;
        this.setChipIconEnabled = false;
        this.setAnimationFromJson = new Runnable() { // from class: o.setErrorAccessibilityLabelResource.3
            @Override // java.lang.Runnable
            public final void run() {
                setErrorAccessibilityLabelResource.this.setX(0);
                setErrorAccessibilityLabelResource seterroraccessibilitylabelresource = setErrorAccessibilityLabelResource.this;
                seterroraccessibilitylabelresource.MenuHostHelper$$ExternalSyntheticLambda0(seterroraccessibilitylabelresource.MenuHostHelper$$ExternalSyntheticLambda1);
            }
        };
        this.setTooltipText = 0;
        setLayoutAnimation();
    }

    private void setLayoutAnimation() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.onActivityResumed = new Scroller(context, setOnLongClickListener);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.setCloseIconEndPadding = viewConfiguration.getScaledPagingTouchSlop();
        this.setViewTranslationCallback = (int) (400.0f * f);
        this.setObjectValues = viewConfiguration.getScaledMaximumFlingVelocity();
        this.setSuffixText = new EdgeEffect(context);
        this.getCallingPid = new EdgeEffect(context);
        this.setCheckedIconEnabled = (int) (25.0f * f);
        this.ViewPager$SavedState$1 = (int) (2.0f * f);
        this.setTextScaleX = (int) (f * 16.0f);
        setBaselineAlignBottom.setX(this, new setX());
        if (setBaselineAlignBottom.setCenterIfNoTextEnabled(this) == 0) {
            setBaselineAlignBottom.setUnboundedRipple(this, 1);
        }
        setBaselineAlignBottom.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1(this, new setCircularRevealScrimColor() { // from class: o.setErrorAccessibilityLabelResource.2
            private final Rect setIconTintList = new Rect();

            @Override // o.setCircularRevealScrimColor
            public final WindowInsetsCompat setIconTintList(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat iconTintList = setBaselineAlignBottom.setIconTintList(view, windowInsetsCompat);
                if (iconTintList.setLayoutAnimation()) {
                    return iconTintList;
                }
                Rect rect = this.setIconTintList;
                rect.left = iconTintList.setNavigationOnClickListener();
                rect.top = iconTintList.setUiOptions();
                rect.right = iconTintList.setOnLongClickListener();
                rect.bottom = iconTintList.setUnboundedRipple();
                int childCount = setErrorAccessibilityLabelResource.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    WindowInsetsCompat x = setBaselineAlignBottom.setX(setErrorAccessibilityLabelResource.this.getChildAt(i), iconTintList);
                    rect.left = Math.min(x.setNavigationOnClickListener(), rect.left);
                    rect.top = Math.min(x.setUiOptions(), rect.top);
                    rect.right = Math.min(x.setOnLongClickListener(), rect.right);
                    rect.bottom = Math.min(x.setUnboundedRipple(), rect.bottom);
                }
                return iconTintList.MenuHostHelper$$ExternalSyntheticLambda1(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.setAnimationFromJson);
        Scroller scroller = this.onActivityResumed;
        if (scroller != null && !scroller.isFinished()) {
            this.onActivityResumed.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    final void setX(int i) {
        if (this.setTooltipText == i) {
            return;
        }
        this.setTooltipText = i;
        if (this.FirebaseRemoteConfigKtxRegistrar != null) {
            setY(i != 0);
        }
        setY(i);
    }

    public void setAdapter(setSelected setselected) {
        setSelected setselected2 = this.setY;
        if (setselected2 != null) {
            synchronized (setselected2) {
                setselected2.setY = null;
            }
            if (this.setConstraintSet.size() > 0) {
                setIconTintList seticontintlist = this.setConstraintSet.get(0);
                int i = seticontintlist.setY;
                Object obj = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1;
                throw new UnsupportedOperationException("Required method destroyItem was not overridden");
            }
            this.setConstraintSet.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda0) getChildAt(i2).getLayoutParams()).setX) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
            scrollTo(0, 0);
        }
        this.setY = setselected;
        this.setOnNavigationItemSelectedListener = 0;
        if (setselected != null) {
            if (this.RecyclerView$SavedState$1 == null) {
                this.RecyclerView$SavedState$1 = new setUiOptions();
            }
            setSelected setselected3 = this.setY;
            setUiOptions setuioptions = this.RecyclerView$SavedState$1;
            synchronized (setselected3) {
                setselected3.setY = setuioptions;
            }
            this.setChipSpacingVertical = false;
            boolean z = this.setGuidelinePercent;
            this.setGuidelinePercent = true;
            this.setOnNavigationItemSelectedListener = this.setY.setIconTintList();
            int i3 = this.setHint;
            if (i3 >= 0) {
                MenuHostHelper$$ExternalSyntheticLambda1(i3, false, true, 0);
                this.setHint = -1;
                this.setError = null;
                this.setTitleMarginEnd = null;
            } else if (z) {
                requestLayout();
            } else {
                MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1);
            }
        }
        List<setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda1> list = this.setIconTintList;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.setIconTintList.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.setIconTintList.get(i4).setIconTintList(this, setselected);
        }
    }

    public void setCurrentItem(int i) {
        this.setChipSpacingVertical = false;
        MenuHostHelper$$ExternalSyntheticLambda1(i, !this.setGuidelinePercent, false, 0);
    }

    public void setCurrentItem(int i, boolean z) {
        this.setChipSpacingVertical = false;
        MenuHostHelper$$ExternalSyntheticLambda1(i, z, false, 0);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(int i, boolean z, boolean z2, int i2) {
        setSelected setselected = this.setY;
        if (setselected != null && setselected.setIconTintList() > 0) {
            if (z2 || this.MenuHostHelper$$ExternalSyntheticLambda1 != i || this.setConstraintSet.size() == 0) {
                if (i < 0) {
                    i = 0;
                } else if (i >= this.setY.setIconTintList()) {
                    i = this.setY.setIconTintList() - 1;
                }
                int i3 = this.setSelectedChildViewEnabled;
                int i4 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                if (i > i4 + i3 || i < i4 - i3) {
                    for (int i5 = 0; i5 < this.setConstraintSet.size(); i5++) {
                        this.setConstraintSet.get(i5).setIconTintList = true;
                    }
                }
                boolean z3 = this.MenuHostHelper$$ExternalSyntheticLambda1 != i;
                if (this.setGuidelinePercent) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
                    if (z3) {
                        MenuHostHelper$$ExternalSyntheticLambda1(i);
                    }
                    requestLayout();
                    return;
                }
                MenuHostHelper$$ExternalSyntheticLambda0(i);
                setY(i, z, i2, z3);
            } else if (this.setFilterRedundantCalls) {
                this.setFilterRedundantCalls = false;
            }
        } else if (this.setFilterRedundantCalls) {
            this.setFilterRedundantCalls = false;
        }
    }

    private void setY(int i, boolean z, int i2, boolean z2) {
        int scrollX;
        int abs;
        setIconTintList onLongClickListener = setOnLongClickListener(i);
        int measuredWidth = onLongClickListener != null ? (int) (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) * Math.max(this.setTextAppearanceResource, Math.min(onLongClickListener.setX, this.setFilterTouchesWhenObscured))) : 0;
        if (!z) {
            if (z2) {
                MenuHostHelper$$ExternalSyntheticLambda1(i);
            }
            setX(false);
            scrollTo(measuredWidth, 0);
            setIconTintList(measuredWidth);
            return;
        }
        if (getChildCount() != 0) {
            Scroller scroller = this.onActivityResumed;
            if ((scroller == null || scroller.isFinished()) ? false : true) {
                scrollX = this.FragmentStateAdapter$5 ? this.onActivityResumed.getCurrX() : this.onActivityResumed.getStartX();
                this.onActivityResumed.abortAnimation();
                if (this.setFilterRedundantCalls) {
                    this.setFilterRedundantCalls = false;
                }
            } else {
                scrollX = getScrollX();
            }
            int i3 = scrollX;
            int scrollY = getScrollY();
            int i4 = measuredWidth - i3;
            int i5 = 0 - scrollY;
            if (i4 == 0 && i5 == 0) {
                setX(false);
                MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1);
                setX(0);
            } else {
                if (!this.setFilterRedundantCalls) {
                    this.setFilterRedundantCalls = true;
                }
                setX(2);
                int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int i6 = measuredWidth2 / 2;
                float f = measuredWidth2;
                float f2 = i6;
                float sin = (float) Math.sin((Math.min(1.0f, Math.abs(i4) / f) - 0.5f) * 0.47123894f);
                int abs2 = Math.abs(i2);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs((f2 + (sin * f2)) / abs2) * 1000.0f) << 2;
                } else {
                    abs = (int) (((Math.abs(i4) / (f + this.setFloatValues)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.FragmentStateAdapter$5 = false;
                this.onActivityResumed.startScroll(i3, scrollY, i4, i5, min);
                setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this);
            }
        } else if (this.setFilterRedundantCalls) {
            this.setFilterRedundantCalls = false;
        }
        if (z2) {
            MenuHostHelper$$ExternalSyntheticLambda1(i);
        }
    }

    @Deprecated
    public void setOnPageChangeListener(setOnLongClickListener setonlongclicklistener) {
        this.setImageTintMode = setonlongclicklistener;
    }

    public void setPageTransformer(boolean z, setNavigationOnClickListener setnavigationonclicklistener) {
        setPageTransformer(z, setnavigationonclicklistener, 2);
    }

    public void setPageTransformer(boolean z, setNavigationOnClickListener setnavigationonclicklistener, int i) {
        boolean z2 = setnavigationonclicklistener != null;
        boolean z3 = z2 != (this.FirebaseRemoteConfigKtxRegistrar != null);
        this.FirebaseRemoteConfigKtxRegistrar = setnavigationonclicklistener;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.setZ = z ? 2 : 1;
            this.setShrinkMotionSpec = i;
        } else {
            this.setZ = 0;
        }
        if (z3) {
            MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.setZ == 2) {
            i2 = (i - 1) - i2;
        }
        return ((setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda0) this.setMaxEms.get(i2).getLayoutParams()).MenuHostHelper$$ExternalSyntheticLambda0;
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder("Requested offscreen page limit ");
            sb.append(i);
            sb.append(" too small; defaulting to 1");
            Log.w("ViewPager", sb.toString());
            i = 1;
        }
        if (i != this.setSelectedChildViewEnabled) {
            this.setSelectedChildViewEnabled = i;
            MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.setFloatValues;
        this.setFloatValues = i;
        int width = getWidth();
        setX(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.setAdapter = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i) {
        Drawable drawable;
        drawable = getContext().getDrawable(i);
        setPageMarginDrawable(drawable);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.setAdapter;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.setAdapter;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    final void setX() {
        int iconTintList = this.setY.setIconTintList();
        this.setOnNavigationItemSelectedListener = iconTintList;
        boolean z = this.setConstraintSet.size() < (this.setSelectedChildViewEnabled << 1) + 1 && this.setConstraintSet.size() < iconTintList;
        int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
        for (int i2 = 0; i2 < this.setConstraintSet.size(); i2++) {
            Object obj = this.setConstraintSet.get(i2).MenuHostHelper$$ExternalSyntheticLambda1;
        }
        Collections.sort(this.setConstraintSet, setLayoutAnimation);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda0 seterroraccessibilitylabelresource_menuhosthelper__externalsyntheticlambda0 = (setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda0) getChildAt(i3).getLayoutParams();
                if (!seterroraccessibilitylabelresource_menuhosthelper__externalsyntheticlambda0.setX) {
                    seterroraccessibilitylabelresource_menuhosthelper__externalsyntheticlambda0.setUnboundedRipple = 0.0f;
                }
            }
            MenuHostHelper$$ExternalSyntheticLambda1(i, false, true, 0);
            requestLayout();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0175, code lost:
        throw new java.lang.UnsupportedOperationException("Required method instantiateItem was not overridden");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        if (r8.setY == r17.MenuHostHelper$$ExternalSyntheticLambda1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0169, code lost:
        new o.setErrorAccessibilityLabelResource.setIconTintList().setY = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void MenuHostHelper$$ExternalSyntheticLambda0(int r18) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setErrorAccessibilityLabelResource.MenuHostHelper$$ExternalSyntheticLambda0(int):void");
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.setZ != 0) {
            ArrayList<View> arrayList = this.setMaxEms;
            if (arrayList == null) {
                this.setMaxEms = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.setMaxEms.add(getChildAt(i));
            }
            Collections.sort(this.setMaxEms, setNavigationOnClickListener);
        }
    }

    private void setY(setIconTintList seticontintlist, int i, setIconTintList seticontintlist2) {
        setIconTintList seticontintlist3;
        setIconTintList seticontintlist4;
        int iconTintList = this.setY.setIconTintList();
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        float f = measuredWidth > 0 ? this.setFloatValues / measuredWidth : 0.0f;
        if (seticontintlist2 != null) {
            int i2 = seticontintlist2.setY;
            if (i2 < seticontintlist.setY) {
                float f2 = seticontintlist2.setX + seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda0 + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= seticontintlist.setY && i4 < this.setConstraintSet.size()) {
                    setIconTintList seticontintlist5 = this.setConstraintSet.get(i4);
                    while (true) {
                        seticontintlist4 = seticontintlist5;
                        if (i3 <= seticontintlist4.setY || i4 >= this.setConstraintSet.size() - 1) {
                            break;
                        }
                        i4++;
                        seticontintlist5 = this.setConstraintSet.get(i4);
                    }
                    while (i3 < seticontintlist4.setY) {
                        f2 += setSelected.setX() + f;
                        i3++;
                    }
                    seticontintlist4.setX = f2;
                    f2 += seticontintlist4.MenuHostHelper$$ExternalSyntheticLambda0 + f;
                    i3++;
                }
            } else if (i2 > seticontintlist.setY) {
                int size = this.setConstraintSet.size() - 1;
                float f3 = seticontintlist2.setX;
                while (true) {
                    i2--;
                    if (i2 < seticontintlist.setY || size < 0) {
                        break;
                    }
                    setIconTintList seticontintlist6 = this.setConstraintSet.get(size);
                    while (true) {
                        seticontintlist3 = seticontintlist6;
                        if (i2 >= seticontintlist3.setY || size <= 0) {
                            break;
                        }
                        size--;
                        seticontintlist6 = this.setConstraintSet.get(size);
                    }
                    while (i2 > seticontintlist3.setY) {
                        f3 -= setSelected.setX() + f;
                        i2--;
                    }
                    f3 -= seticontintlist3.MenuHostHelper$$ExternalSyntheticLambda0 + f;
                    seticontintlist3.setX = f3;
                }
            }
        }
        int size2 = this.setConstraintSet.size();
        float f4 = seticontintlist.setX;
        int i5 = seticontintlist.setY - 1;
        this.setTextAppearanceResource = seticontintlist.setY == 0 ? seticontintlist.setX : -3.4028235E38f;
        int i6 = iconTintList - 1;
        this.setFilterTouchesWhenObscured = seticontintlist.setY == i6 ? (seticontintlist.setX + seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0) - 1.0f : Float.MAX_VALUE;
        int i7 = i - 1;
        while (i7 >= 0) {
            setIconTintList seticontintlist7 = this.setConstraintSet.get(i7);
            while (i5 > seticontintlist7.setY) {
                f4 -= setSelected.setX() + f;
                i5--;
            }
            f4 -= seticontintlist7.MenuHostHelper$$ExternalSyntheticLambda0 + f;
            seticontintlist7.setX = f4;
            if (seticontintlist7.setY == 0) {
                this.setTextAppearanceResource = f4;
            }
            i7--;
            i5--;
        }
        float f5 = seticontintlist.setX + seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0 + f;
        int i8 = seticontintlist.setY + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            setIconTintList seticontintlist8 = this.setConstraintSet.get(i9);
            while (i8 < seticontintlist8.setY) {
                f5 += setSelected.setX() + f;
                i8++;
            }
            if (seticontintlist8.setY == i6) {
                this.setFilterTouchesWhenObscured = (seticontintlist8.MenuHostHelper$$ExternalSyntheticLambda0 + f5) - 1.0f;
            }
            seticontintlist8.setX = f5;
            f5 += seticontintlist8.MenuHostHelper$$ExternalSyntheticLambda0 + f;
            i9++;
            i8++;
        }
        this.setChipIconEnabled = false;
    }

    /* loaded from: classes.dex */
    public static class setUnboundedRipple extends setOrientation {
        ClassLoader MenuHostHelper$$ExternalSyntheticLambda0;
        int MenuHostHelper$$ExternalSyntheticLambda1;
        Parcelable setX;
        private static byte[] setUnboundedRipple = {116, 39, -17, 64, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
        public static final int setY = 175;
        public static final Parcelable.Creator<setUnboundedRipple> CREATOR = new Parcelable.ClassLoaderCreator<setUnboundedRipple>() { // from class: androidx.viewpager.widget.ViewPager$SavedState$1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new setErrorAccessibilityLabelResource.setUnboundedRipple(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ setErrorAccessibilityLabelResource.setUnboundedRipple createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new setErrorAccessibilityLabelResource.setUnboundedRipple(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new setErrorAccessibilityLabelResource.setUnboundedRipple[i];
            }
        };

        /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x0037). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(int r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 15
                int r9 = 18 - r9
                byte[] r0 = o.setErrorAccessibilityLabelResource.setUnboundedRipple.setUnboundedRipple
                int r8 = r8 * 4
                int r8 = 16 - r8
                int r7 = r7 + 105
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r10
                r10 = r9
                r9 = r8
                goto L37
            L18:
                r3 = 0
            L19:
                r6 = r8
                r8 = r7
                r7 = r6
                int r4 = r3 + 1
                int r9 = r9 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L2d
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2d:
                r3 = r0[r9]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                r10 = r9
                r9 = r6
            L37:
                int r9 = r9 + r7
                int r7 = r9 + 2
                r9 = r10
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setErrorAccessibilityLabelResource.setUnboundedRipple.a(int, byte, short, java.lang.Object[]):void");
        }

        public setUnboundedRipple(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // o.setOrientation, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.MenuHostHelper$$ExternalSyntheticLambda1);
            parcel.writeParcelable(this.setX, i);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            try {
                Object[] objArr = {this};
                byte b = (byte) (-setUnboundedRipple[5]);
                byte b2 = (byte) (b - 1);
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b3 = (byte) (setUnboundedRipple[5] + 1);
                Object[] objArr3 = new Object[1];
                a(b3, b3, (byte) (-setUnboundedRipple[5]), objArr3);
                sb.append(Integer.toHexString(((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue()));
                sb.append(" position=");
                sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
                sb.append("}");
                return sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        public setUnboundedRipple(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = parcel.readInt();
            this.setX = parcel.readParcelable(classLoader);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        setUnboundedRipple setunboundedripple = new setUnboundedRipple(super.onSaveInstanceState());
        setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda1 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (this.setY != null) {
            setunboundedripple.setX = setSelected.MenuHostHelper$$ExternalSyntheticLambda1();
        }
        return setunboundedripple;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof setUnboundedRipple)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        setUnboundedRipple setunboundedripple = (setUnboundedRipple) parcelable;
        super.onRestoreInstanceState(setunboundedripple.setUiOptions);
        if (this.setY != null) {
            Parcelable parcelable2 = setunboundedripple.setX;
            ClassLoader classLoader = setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda0;
            MenuHostHelper$$ExternalSyntheticLambda1(setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda1, false, true, 0);
            return;
        }
        this.setHint = setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda1;
        this.setError = setunboundedripple.setX;
        this.setTitleMarginEnd = setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda0 seterroraccessibilitylabelresource_menuhosthelper__externalsyntheticlambda0 = (setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda0) layoutParams;
        seterroraccessibilitylabelresource_menuhosthelper__externalsyntheticlambda0.setX |= view.getClass().getAnnotation(setY.class) != null;
        if (this.setChipIconTintResource) {
            if (seterroraccessibilitylabelresource_menuhosthelper__externalsyntheticlambda0 != null && seterroraccessibilitylabelresource_menuhosthelper__externalsyntheticlambda0.setX) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            seterroraccessibilitylabelresource_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            addViewInLayout(view, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.setChipIconTintResource) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    private setIconTintList setY() {
        for (int i = 0; i < this.setConstraintSet.size(); i++) {
            setIconTintList seticontintlist = this.setConstraintSet.get(i);
            setSelected setselected = this.setY;
            Object obj = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setselected.setY()) {
                return seticontintlist;
            }
        }
        return null;
    }

    private setIconTintList setY(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return setY();
            }
        }
    }

    private setIconTintList setOnLongClickListener(int i) {
        for (int i2 = 0; i2 < this.setConstraintSet.size(); i2++) {
            setIconTintList seticontintlist = this.setConstraintSet.get(i2);
            if (seticontintlist.setY == i) {
                return seticontintlist;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.setGuidelinePercent = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setErrorAccessibilityLabelResource.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.setFloatValues;
            setX(i, i3, i5, i5);
        }
    }

    private void setX(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.setConstraintSet.isEmpty()) {
            if (!this.onActivityResumed.isFinished()) {
                this.onActivityResumed.setFinalX(this.MenuHostHelper$$ExternalSyntheticLambda1 * ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()));
                return;
            }
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - paddingLeft) - paddingRight) + i3)), getScrollY());
            return;
        }
        setIconTintList onLongClickListener = setOnLongClickListener(this.MenuHostHelper$$ExternalSyntheticLambda1);
        int min = (int) ((onLongClickListener != null ? Math.min(onLongClickListener.setX, this.setFilterTouchesWhenObscured) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            setX(false);
            scrollTo(min, getScrollY());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setErrorAccessibilityLabelResource.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void computeScroll() {
        this.FragmentStateAdapter$5 = true;
        if (!this.onActivityResumed.isFinished() && this.onActivityResumed.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.onActivityResumed.getCurrX();
            int currY = this.onActivityResumed.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!setIconTintList(currX)) {
                    this.onActivityResumed.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this);
            return;
        }
        setX(true);
    }

    private boolean setIconTintList(int i) {
        if (this.setConstraintSet.size() == 0) {
            if (this.setGuidelinePercent) {
                return false;
            }
            this.setIconSize = false;
            MenuHostHelper$$ExternalSyntheticLambda1(0, 0.0f, 0);
            if (this.setIconSize) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        setIconTintList MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1();
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int i2 = this.setFloatValues;
        float f = measuredWidth;
        int i3 = MenuHostHelper$$ExternalSyntheticLambda1.setY;
        float f2 = ((i / f) - MenuHostHelper$$ExternalSyntheticLambda1.setX) / (MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 + (i2 / f));
        this.setIconSize = false;
        MenuHostHelper$$ExternalSyntheticLambda1(i3, f2, (int) ((measuredWidth + i2) * f2));
        if (this.setIconSize) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void MenuHostHelper$$ExternalSyntheticLambda1(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r14 = r11.setChipCornerRadius
            r0 = 0
            r1 = 1
            if (r14 <= 0) goto L6a
            int r14 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = 0
        L1b:
            if (r6 >= r5) goto L6a
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            o.setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda0 r8 = (o.setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda0) r8
            boolean r9 = r8.setX
            if (r9 == 0) goto L67
            int r8 = r8.setIconTintList
            r8 = r8 & 7
            if (r8 == r1) goto L4c
            r9 = 3
            if (r8 == r9) goto L46
            r9 = 5
            if (r8 == r9) goto L39
            r8 = r2
            goto L5b
        L39:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
            goto L58
        L46:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5b
        L4c:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
        L58:
            r10 = r8
            r8 = r2
            r2 = r10
        L5b:
            int r2 = r2 + r14
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L66
            r7.offsetLeftAndRight(r2)
        L66:
            r2 = r8
        L67:
            int r6 = r6 + 1
            goto L1b
        L6a:
            r11.setX(r12, r13)
            o.setErrorAccessibilityLabelResource$setNavigationOnClickListener r12 = r11.FirebaseRemoteConfigKtxRegistrar
            if (r12 == 0) goto L97
            r11.getScrollX()
            int r12 = r11.getChildCount()
        L78:
            if (r0 >= r12) goto L97
            android.view.View r13 = r11.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            o.setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda0 r14 = (o.setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda0) r14
            boolean r14 = r14.setX
            if (r14 != 0) goto L94
            r13.getLeft()
            r11.getMeasuredWidth()
            r11.getPaddingLeft()
            r11.getPaddingRight()
        L94:
            int r0 = r0 + 1
            goto L78
        L97:
            r11.setIconSize = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setErrorAccessibilityLabelResource.MenuHostHelper$$ExternalSyntheticLambda1(int, float, int):void");
    }

    private void setX(int i, float f) {
        setOnLongClickListener setonlongclicklistener = this.setImageTintMode;
        if (setonlongclicklistener != null) {
            setonlongclicklistener.MenuHostHelper$$ExternalSyntheticLambda1(i, f);
        }
        List<setOnLongClickListener> list = this.setX;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                setOnLongClickListener setonlongclicklistener2 = this.setX.get(i2);
                if (setonlongclicklistener2 != null) {
                    setonlongclicklistener2.MenuHostHelper$$ExternalSyntheticLambda1(i, f);
                }
            }
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        setOnLongClickListener setonlongclicklistener = this.setImageTintMode;
        if (setonlongclicklistener != null) {
            setonlongclicklistener.setY(i);
        }
        List<setOnLongClickListener> list = this.setX;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                setOnLongClickListener setonlongclicklistener2 = this.setX.get(i2);
                if (setonlongclicklistener2 != null) {
                    setonlongclicklistener2.setY(i);
                }
            }
        }
    }

    private void setY(int i) {
        setOnLongClickListener setonlongclicklistener = this.setImageTintMode;
        if (setonlongclicklistener != null) {
            setonlongclicklistener.setIconTintList(i);
        }
        List<setOnLongClickListener> list = this.setX;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                setOnLongClickListener setonlongclicklistener2 = this.setX.get(i2);
                if (setonlongclicklistener2 != null) {
                    setonlongclicklistener2.setIconTintList(i);
                }
            }
        }
    }

    private void setX(boolean z) {
        boolean z2 = this.setTooltipText == 2;
        if (z2) {
            if (this.setFilterRedundantCalls) {
                this.setFilterRedundantCalls = false;
            }
            if (!this.onActivityResumed.isFinished()) {
                this.onActivityResumed.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.onActivityResumed.getCurrX();
                int currY = this.onActivityResumed.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        setIconTintList(currX);
                    }
                }
            }
        }
        this.setChipSpacingVertical = false;
        for (int i = 0; i < this.setConstraintSet.size(); i++) {
            setIconTintList seticontintlist = this.setConstraintSet.get(i);
            if (seticontintlist.setIconTintList) {
                seticontintlist.setIconTintList = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(this, this.setAnimationFromJson);
            } else {
                this.setAnimationFromJson.run();
            }
        }
    }

    private void setY(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.setShrinkMotionSpec : 0, null);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            setIconTintList();
            return false;
        }
        if (action != 0) {
            if (this.setHasDecor) {
                return true;
            }
            if (this.FragmentStateAdapter$2) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.setIconified = x;
            this.setContentScrimResource = x;
            float y = motionEvent.getY();
            this.ExtendableSavedState$1 = y;
            this.FloatingActionButton$BaseBehavior = y;
            this.setUnboundedRipple = motionEvent.getPointerId(0);
            this.FragmentStateAdapter$2 = false;
            this.FragmentStateAdapter$5 = true;
            this.onActivityResumed.computeScrollOffset();
            if (this.setTooltipText == 2 && Math.abs(this.onActivityResumed.getFinalX() - this.onActivityResumed.getCurrX()) > this.ViewPager$SavedState$1) {
                this.onActivityResumed.abortAnimation();
                this.setChipSpacingVertical = false;
                MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1);
                this.setHasDecor = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setX(1);
            } else {
                setX(false);
                this.setHasDecor = false;
            }
        } else if (action == 2) {
            int i = this.setUnboundedRipple;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.setContentScrimResource;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.ExtendableSavedState$1);
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 != 0) {
                    float f2 = this.setContentScrimResource;
                    if (!((f2 < ((float) this.setLayoutDirection) && i2 > 0) || (f2 > ((float) (getWidth() - this.setLayoutDirection)) && f < 0.0f)) && MenuHostHelper$$ExternalSyntheticLambda1(this, false, (int) f, (int) x2, (int) y2)) {
                        this.setContentScrimResource = x2;
                        this.FloatingActionButton$BaseBehavior = y2;
                        this.FragmentStateAdapter$2 = true;
                        return false;
                    }
                }
                float f3 = this.setCloseIconEndPadding;
                if (abs > f3 && abs * 0.5f > abs2) {
                    this.setHasDecor = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setX(1);
                    float f4 = this.setIconified;
                    float f5 = this.setCloseIconEndPadding;
                    this.setContentScrimResource = i2 > 0 ? f4 + f5 : f4 - f5;
                    this.FloatingActionButton$BaseBehavior = y2;
                    if (!this.setFilterRedundantCalls) {
                        this.setFilterRedundantCalls = true;
                    }
                } else if (abs2 > f3) {
                    this.FragmentStateAdapter$2 = true;
                }
                if (this.setHasDecor && MenuHostHelper$$ExternalSyntheticLambda0(x2)) {
                    setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this);
                }
            }
        } else if (action == 6) {
            MenuHostHelper$$ExternalSyntheticLambda1(motionEvent);
        }
        if (this.Fragment$5 == null) {
            this.Fragment$5 = VelocityTracker.obtain();
        }
        this.Fragment$5.addMovement(motionEvent);
        return this.setHasDecor;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        setSelected setselected;
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (setselected = this.setY) == null || setselected.setIconTintList() == 0) {
            return false;
        }
        if (this.Fragment$5 == null) {
            this.Fragment$5 = VelocityTracker.obtain();
        }
        this.Fragment$5.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.onActivityResumed.abortAnimation();
            this.setChipSpacingVertical = false;
            MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1);
            float x = motionEvent.getX();
            this.setIconified = x;
            this.setContentScrimResource = x;
            float y = motionEvent.getY();
            this.ExtendableSavedState$1 = y;
            this.FloatingActionButton$BaseBehavior = y;
            this.setUnboundedRipple = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.setHasDecor) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.setUnboundedRipple);
                    if (findPointerIndex == -1) {
                        z = setIconTintList();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.setContentScrimResource);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.FloatingActionButton$BaseBehavior);
                        if (abs > this.setCloseIconEndPadding && abs > abs2) {
                            this.setHasDecor = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f = this.setIconified;
                            this.setContentScrimResource = x2 - f > 0.0f ? f + this.setCloseIconEndPadding : f - this.setCloseIconEndPadding;
                            this.FloatingActionButton$BaseBehavior = y2;
                            setX(1);
                            if (!this.setFilterRedundantCalls) {
                                this.setFilterRedundantCalls = true;
                            }
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.setHasDecor) {
                    z = false | MenuHostHelper$$ExternalSyntheticLambda0(motionEvent.getX(motionEvent.findPointerIndex(this.setUnboundedRipple)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.setContentScrimResource = motionEvent.getX(actionIndex);
                    this.setUnboundedRipple = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    MenuHostHelper$$ExternalSyntheticLambda1(motionEvent);
                    this.setContentScrimResource = motionEvent.getX(motionEvent.findPointerIndex(this.setUnboundedRipple));
                }
            } else if (this.setHasDecor) {
                setY(this.MenuHostHelper$$ExternalSyntheticLambda1, true, 0, false);
                z = setIconTintList();
            }
        } else if (this.setHasDecor) {
            VelocityTracker velocityTracker = this.Fragment$5;
            velocityTracker.computeCurrentVelocity(1000, this.setObjectValues);
            int xVelocity = (int) velocityTracker.getXVelocity(this.setUnboundedRipple);
            this.setChipSpacingVertical = true;
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int scrollX = getScrollX();
            setIconTintList MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1();
            float f2 = measuredWidth;
            int i = MenuHostHelper$$ExternalSyntheticLambda1.setY;
            float f3 = ((scrollX / f2) - MenuHostHelper$$ExternalSyntheticLambda1.setX) / (MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 + (this.setFloatValues / f2));
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.setUnboundedRipple)) - this.setIconified)) <= this.setCheckedIconEnabled || Math.abs(xVelocity) <= this.setViewTranslationCallback) {
                i += (int) (f3 + (i >= this.MenuHostHelper$$ExternalSyntheticLambda1 ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                i++;
            }
            if (this.setConstraintSet.size() > 0) {
                ArrayList<setIconTintList> arrayList = this.setConstraintSet;
                i = Math.max(this.setConstraintSet.get(0).setY, Math.min(i, arrayList.get(arrayList.size() - 1).setY));
            }
            MenuHostHelper$$ExternalSyntheticLambda1(i, true, true, xVelocity);
            z = setIconTintList();
        }
        if (z) {
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this);
        }
        return true;
    }

    private boolean setIconTintList() {
        this.setUnboundedRipple = -1;
        this.setHasDecor = false;
        this.FragmentStateAdapter$2 = false;
        VelocityTracker velocityTracker = this.Fragment$5;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.Fragment$5 = null;
        }
        this.setSuffixText.onRelease();
        this.getCallingPid.onRelease();
        return this.setSuffixText.isFinished() || this.getCallingPid.isFinished();
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda0(float f) {
        boolean z;
        boolean z2;
        float f2 = this.setContentScrimResource;
        this.setContentScrimResource = f;
        float scrollX = getScrollX() + (f2 - f);
        float measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        float f3 = this.setTextAppearanceResource * measuredWidth;
        float f4 = this.setFilterTouchesWhenObscured * measuredWidth;
        boolean z3 = false;
        setIconTintList seticontintlist = this.setConstraintSet.get(0);
        ArrayList<setIconTintList> arrayList = this.setConstraintSet;
        setIconTintList seticontintlist2 = arrayList.get(arrayList.size() - 1);
        if (seticontintlist.setY != 0) {
            f3 = seticontintlist.setX * measuredWidth;
            z = false;
        } else {
            z = true;
        }
        if (seticontintlist2.setY != this.setY.setIconTintList() - 1) {
            f4 = seticontintlist2.setX * measuredWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.setSuffixText.onPull(Math.abs(f3 - scrollX) / measuredWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.getCallingPid.onPull(Math.abs(scrollX - f4) / measuredWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.setContentScrimResource += scrollX - i;
        scrollTo(i, getScrollY());
        setIconTintList(i);
        return z3;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        setSelected setselected;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (setselected = this.setY) != null && setselected.setIconTintList() > 1)) {
            if (!this.setSuffixText.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.setTextAppearanceResource * width);
                this.setSuffixText.setSize(height, width);
                z = false | this.setSuffixText.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.getCallingPid.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.setFilterTouchesWhenObscured + 1.0f)) * width2);
                this.getCallingPid.setSize((height2 - paddingTop) - paddingBottom, width2);
                z |= this.getCallingPid.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.setSuffixText.finish();
            this.getCallingPid.finish();
        }
        if (z) {
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.setFloatValues <= 0 || this.setAdapter == null || this.setConstraintSet.size() <= 0 || this.setY == null) {
            return;
        }
        int scrollX = getScrollX();
        float width2 = getWidth();
        float f4 = this.setFloatValues / width2;
        int i = 0;
        setIconTintList seticontintlist = this.setConstraintSet.get(0);
        float f5 = seticontintlist.setX;
        int size = this.setConstraintSet.size();
        int i2 = seticontintlist.setY;
        int i3 = this.setConstraintSet.get(size - 1).setY;
        while (i2 < i3) {
            while (i2 > seticontintlist.setY && i < size) {
                i++;
                seticontintlist = this.setConstraintSet.get(i);
            }
            if (i2 == seticontintlist.setY) {
                f = (seticontintlist.setX + seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0) * width2;
                f2 = seticontintlist.setX + seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0 + f4;
            } else {
                float f6 = f4 + 1.0f + f5;
                f = (f5 + 1.0f) * width2;
                f2 = f6;
            }
            if (this.setFloatValues + f > scrollX) {
                f3 = f4;
                this.setAdapter.setBounds(Math.round(f), this.FabTransformationBehavior, Math.round(this.setFloatValues + f), this.setUiOptions);
                this.setAdapter.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f > scrollX + width) {
                return;
            }
            i2++;
            f5 = f2;
            f4 = f3;
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.setUnboundedRipple) {
            int i = actionIndex == 0 ? 1 : 0;
            this.setContentScrimResource = motionEvent.getX(i);
            this.setUnboundedRipple = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.Fragment$5;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.setY == null) {
            return false;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) measuredWidth) * this.setTextAppearanceResource)) : i > 0 && scrollX < ((int) (((float) measuredWidth) * this.setFilterTouchesWhenObscured));
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (MenuHostHelper$$ExternalSyntheticLambda1(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L62
            int r0 = r6.getAction()
            if (r0 != 0) goto L5e
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L47
            r3 = 22
            if (r0 == r3) goto L35
            r3 = 61
            if (r0 != r3) goto L5e
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2a
            boolean r6 = r5.setLayoutAnimation(r4)
            goto L5f
        L2a:
            boolean r6 = r6.hasModifiers(r2)
            if (r6 == 0) goto L5e
            boolean r6 = r5.setLayoutAnimation(r2)
            goto L5f
        L35:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L40
            boolean r6 = r5.setOnLongClickListener()
            goto L5f
        L40:
            r6 = 66
            boolean r6 = r5.setLayoutAnimation(r6)
            goto L5f
        L47:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L57
            int r6 = r5.MenuHostHelper$$ExternalSyntheticLambda1
            if (r6 <= 0) goto L5e
            int r6 = r6 - r2
            r5.setCurrentItem(r6, r2)
            r6 = 1
            goto L5f
        L57:
            r6 = 17
            boolean r6 = r5.setLayoutAnimation(r6)
            goto L5f
        L5e:
            r6 = 0
        L5f:
            if (r6 != 0) goto L62
            goto L63
        L62:
            r1 = 1
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setErrorAccessibilityLabelResource.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean setLayoutAnimation(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 0
            r2 = 1
            if (r0 != r6) goto L9
            goto L63
        L9:
            if (r0 == 0) goto L64
            android.view.ViewParent r3 = r0.getParent()
        Lf:
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L1c
            if (r3 != r6) goto L17
            r3 = 1
            goto L1d
        L17:
            android.view.ViewParent r3 = r3.getParent()
            goto Lf
        L1c:
            r3 = 0
        L1d:
            if (r3 != 0) goto L64
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
        L33:
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L4c
            java.lang.String r4 = " => "
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
            goto L33
        L4c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "ViewPager"
            android.util.Log.e(r3, r0)
        L63:
            r0 = 0
        L64:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lb9
            if (r3 == r0) goto Lb9
            if (r7 != r5) goto L99
            android.graphics.Rect r4 = r6.setRevealInfo
            android.graphics.Rect r4 = r6.setIconTintList(r4, r3)
            int r4 = r4.left
            android.graphics.Rect r5 = r6.setRevealInfo
            android.graphics.Rect r5 = r6.setIconTintList(r5, r0)
            int r5 = r5.left
            if (r0 == 0) goto L94
            if (r4 < r5) goto L94
            int r0 = r6.MenuHostHelper$$ExternalSyntheticLambda1
            if (r0 <= 0) goto Ld1
            int r0 = r0 - r2
            r6.setCurrentItem(r0, r2)
        L92:
            r1 = 1
            goto Ld1
        L94:
            boolean r0 = r3.requestFocus()
            goto Lc6
        L99:
            if (r7 != r4) goto Ld1
            android.graphics.Rect r1 = r6.setRevealInfo
            android.graphics.Rect r1 = r6.setIconTintList(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.setRevealInfo
            android.graphics.Rect r2 = r6.setIconTintList(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto Lb4
            if (r1 > r2) goto Lb4
            boolean r0 = r6.setOnLongClickListener()
            goto Lc6
        Lb4:
            boolean r0 = r3.requestFocus()
            goto Lc6
        Lb9:
            if (r7 == r5) goto Lc8
            if (r7 == r2) goto Lc8
            if (r7 == r4) goto Lc2
            r0 = 2
            if (r7 != r0) goto Ld1
        Lc2:
            boolean r0 = r6.setOnLongClickListener()
        Lc6:
            r1 = r0
            goto Ld1
        Lc8:
            int r0 = r6.MenuHostHelper$$ExternalSyntheticLambda1
            if (r0 <= 0) goto Ld1
            int r0 = r0 - r2
            r6.setCurrentItem(r0, r2)
            goto L92
        Ld1:
            if (r1 == 0) goto Lda
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Lda:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setErrorAccessibilityLabelResource.setLayoutAnimation(int):boolean");
    }

    private Rect setIconTintList(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private boolean setOnLongClickListener() {
        setSelected setselected = this.setY;
        if (setselected == null || this.MenuHostHelper$$ExternalSyntheticLambda1 >= setselected.setIconTintList() - 1) {
            return false;
        }
        setCurrentItem(this.MenuHostHelper$$ExternalSyntheticLambda1 + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        setIconTintList y;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (y = setY()) != null && y.setY == this.MenuHostHelper$$ExternalSyntheticLambda1) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        setIconTintList y;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (y = setY()) != null && y.setY == this.MenuHostHelper$$ExternalSyntheticLambda1) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        setIconTintList y;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (y = setY()) != null && y.setY == this.MenuHostHelper$$ExternalSyntheticLambda1 && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        setIconTintList y;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (y = setY()) != null && y.setY == this.MenuHostHelper$$ExternalSyntheticLambda1 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda0) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda0(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setX extends setCounterOverflowTextColor {
        setX() {
        }

        @Override // o.setCounterOverflowTextColor
        public final void setIconTintList(View view, AccessibilityEvent accessibilityEvent) {
            super.setIconTintList(view, accessibilityEvent);
            accessibilityEvent.setClassName(setErrorAccessibilityLabelResource.class.getName());
            boolean z = true;
            accessibilityEvent.setScrollable((setErrorAccessibilityLabelResource.this.setY == null || setErrorAccessibilityLabelResource.this.setY.setIconTintList() <= 1) ? false : false);
            if (accessibilityEvent.getEventType() != 4096 || setErrorAccessibilityLabelResource.this.setY == null) {
                return;
            }
            accessibilityEvent.setItemCount(setErrorAccessibilityLabelResource.this.setY.setIconTintList());
            accessibilityEvent.setFromIndex(setErrorAccessibilityLabelResource.this.MenuHostHelper$$ExternalSyntheticLambda1);
            accessibilityEvent.setToIndex(setErrorAccessibilityLabelResource.this.MenuHostHelper$$ExternalSyntheticLambda1);
        }

        @Override // o.setCounterOverflowTextColor
        public final void setY(View view, setDecorPadding setdecorpadding) {
            super.setY(view, setdecorpadding);
            setdecorpadding.setIconTintList(setErrorAccessibilityLabelResource.class.getName());
            setdecorpadding.setIconSize(setErrorAccessibilityLabelResource.this.setY != null && setErrorAccessibilityLabelResource.this.setY.setIconTintList() > 1);
            if (setErrorAccessibilityLabelResource.this.canScrollHorizontally(1)) {
                setdecorpadding.setIconTintList(4096);
            }
            if (setErrorAccessibilityLabelResource.this.canScrollHorizontally(-1)) {
                setdecorpadding.setIconTintList(8192);
            }
        }

        @Override // o.setCounterOverflowTextColor
        public final boolean MenuHostHelper$$ExternalSyntheticLambda1(View view, int i, Bundle bundle) {
            if (super.MenuHostHelper$$ExternalSyntheticLambda1(view, i, bundle)) {
                return true;
            }
            if (i == 4096) {
                if (setErrorAccessibilityLabelResource.this.canScrollHorizontally(1)) {
                    setErrorAccessibilityLabelResource seterroraccessibilitylabelresource = setErrorAccessibilityLabelResource.this;
                    seterroraccessibilitylabelresource.setCurrentItem(seterroraccessibilitylabelresource.MenuHostHelper$$ExternalSyntheticLambda1 + 1);
                    return true;
                }
                return false;
            } else if (i == 8192 && setErrorAccessibilityLabelResource.this.canScrollHorizontally(-1)) {
                setErrorAccessibilityLabelResource seterroraccessibilitylabelresource2 = setErrorAccessibilityLabelResource.this;
                seterroraccessibilitylabelresource2.setCurrentItem(seterroraccessibilitylabelresource2.MenuHostHelper$$ExternalSyntheticLambda1 - 1);
                return true;
            } else {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    class setUiOptions extends DataSetObserver {
        setUiOptions() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            setErrorAccessibilityLabelResource.this.setX();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            setErrorAccessibilityLabelResource.this.setX();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setLayoutAnimation implements Comparator<View> {
        setLayoutAnimation() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda0 seterroraccessibilitylabelresource_menuhosthelper__externalsyntheticlambda0 = (setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams();
            setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda0 seterroraccessibilitylabelresource_menuhosthelper__externalsyntheticlambda02 = (setErrorAccessibilityLabelResource$MenuHostHelper$$ExternalSyntheticLambda0) view2.getLayoutParams();
            if (seterroraccessibilitylabelresource_menuhosthelper__externalsyntheticlambda0.setX != seterroraccessibilitylabelresource_menuhosthelper__externalsyntheticlambda02.setX) {
                return seterroraccessibilitylabelresource_menuhosthelper__externalsyntheticlambda0.setX ? 1 : -1;
            }
            return seterroraccessibilitylabelresource_menuhosthelper__externalsyntheticlambda0.setY - seterroraccessibilitylabelresource_menuhosthelper__externalsyntheticlambda02.setY;
        }
    }

    private setIconTintList MenuHostHelper$$ExternalSyntheticLambda1() {
        int i;
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        float f = 0.0f;
        float scrollX = measuredWidth > 0 ? getScrollX() / measuredWidth : 0.0f;
        float f2 = measuredWidth > 0 ? this.setFloatValues / measuredWidth : 0.0f;
        setIconTintList seticontintlist = null;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.setConstraintSet.size()) {
            setIconTintList seticontintlist2 = this.setConstraintSet.get(i3);
            if (!z && seticontintlist2.setY != (i = i2 + 1)) {
                seticontintlist2 = this.createDispatcher;
                seticontintlist2.setX = f + f3 + f2;
                seticontintlist2.setY = i;
                int i4 = seticontintlist2.setY;
                seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda0 = setSelected.setX();
                i3--;
            }
            f = seticontintlist2.setX;
            float f4 = seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda0;
            if (!z && scrollX < f) {
                return seticontintlist;
            }
            if (scrollX < f4 + f + f2 || i3 == this.setConstraintSet.size() - 1) {
                return seticontintlist2;
            }
            i2 = seticontintlist2.setY;
            f3 = seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda0;
            i3++;
            seticontintlist = seticontintlist2;
            z = false;
        }
        return seticontintlist;
    }
}