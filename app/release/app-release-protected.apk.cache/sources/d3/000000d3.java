package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.reflect.Method;
import java.util.List;
import o.FabTransformationSheetBehavior;
import o.FirebaseCommonKtxRegistrar;
import o.R;
import o.ReflectiveGenericLifecycleObserver;
import o.getPathData;
import o.jC;
import o.ju;
import o.pingBinder;
import o.setBaselineAlignBottom;
import o.setGroupIndicator;
import o.setIconTint;

/* loaded from: classes.dex */
public final class ExtendedFloatingActionButton extends FabTransformationSheetBehavior implements CoordinatorLayout.setX {
    private static final int setTextAppearanceResource = 2132083666;
    final int ViewPager$SavedState$1;
    public ColorStateList setAnimationFromJson;
    int setCenterIfNoTextEnabled;
    private boolean setCheckedIconEnabled;
    final getPathData setChipCornerRadius;
    private final CoordinatorLayout.setIconTintList<ExtendedFloatingActionButton> setGuidelinePercent;
    final getPathData setIconSize;
    final getPathData setMaxEms;
    private final ReflectiveGenericLifecycleObserver setMinAndMaxProgress;
    boolean setOnNavigationItemSelectedListener;
    int setTextAlignment;
    final getPathData setTextScaleX;
    int setUiOptions;
    boolean setZ;
    public static final Property<View, Float> setOnLongClickListener = new Property<View, Float>(Float.class, "width") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.1
        @Override // android.util.Property
        public final /* synthetic */ Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().width = f.intValue();
            view2.requestLayout();
        }
    };
    public static final Property<View, Float> setUnboundedRipple = new Property<View, Float>(Float.class, "height") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.4
        @Override // android.util.Property
        public final /* synthetic */ Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().height = f.intValue();
            view2.requestLayout();
        }
    };
    public static final Property<View, Float> setLayoutAnimation = new Property<View, Float>(Float.class, "paddingStart") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.9
        @Override // android.util.Property
        public final /* synthetic */ Float get(View view) {
            return Float.valueOf(setBaselineAlignBottom.setAnimationFromJson(view));
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(View view, Float f) {
            View view2 = view;
            setBaselineAlignBottom.setX.setX(view2, f.intValue(), view2.getPaddingTop(), setBaselineAlignBottom.setOnNavigationItemSelectedListener(view2), view2.getPaddingBottom());
        }
    };
    public static final Property<View, Float> setNavigationOnClickListener = new Property<View, Float>(Float.class, "paddingEnd") { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.6
        @Override // android.util.Property
        public final /* synthetic */ Float get(View view) {
            return Float.valueOf(setBaselineAlignBottom.setOnNavigationItemSelectedListener(view));
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(View view, Float f) {
            View view2 = view;
            setBaselineAlignBottom.setX.setX(view2, setBaselineAlignBottom.setAnimationFromJson(view2), view2.getPaddingTop(), f.intValue(), view2.getPaddingBottom());
        }
    };

    /* loaded from: classes.dex */
    interface setIconTintList {
        ViewGroup.LayoutParams MenuHostHelper$$ExternalSyntheticLambda0();

        int MenuHostHelper$$ExternalSyntheticLambda1();

        int setIconTintList();

        int setX();

        int setY();
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f040193);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ExtendedFloatingActionButton(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.TextView
    public final void setTextColor(int i) {
        super.setTextColor(i);
        this.setAnimationFromJson = getTextColors();
    }

    @Override // android.widget.TextView
    public final void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.setAnimationFromJson = getTextColors();
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // o.FabTransformationSheetBehavior, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.setOnNavigationItemSelectedListener && TextUtils.isEmpty(getText()) && this.setX != null) {
            this.setOnNavigationItemSelectedListener = false;
            this.setMaxEms.setLayoutAnimation();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setX
    public final CoordinatorLayout.setIconTintList<ExtendedFloatingActionButton> setX() {
        return this.setGuidelinePercent;
    }

    public final void setExtended(boolean z) {
        if (this.setOnNavigationItemSelectedListener == z) {
            return;
        }
        getPathData getpathdata = z ? this.setIconSize : this.setMaxEms;
        if (getpathdata.setUnboundedRipple()) {
            return;
        }
        getpathdata.setLayoutAnimation();
    }

    public final void setAnimateShowBeforeLayout(boolean z) {
        this.setCheckedIconEnabled = z;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.setOnNavigationItemSelectedListener || this.setZ) {
            return;
        }
        this.setCenterIfNoTextEnabled = i;
        this.setTextAlignment = i3;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.setOnNavigationItemSelectedListener || this.setZ) {
            return;
        }
        this.setCenterIfNoTextEnabled = setBaselineAlignBottom.setAnimationFromJson(this);
        this.setTextAlignment = setBaselineAlignBottom.setOnNavigationItemSelectedListener(this);
    }

    public final void setShowMotionSpec(FirebaseCommonKtxRegistrar firebaseCommonKtxRegistrar) {
        this.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda1(firebaseCommonKtxRegistrar);
    }

    public final void setShowMotionSpecResource(int i) {
        setShowMotionSpec(FirebaseCommonKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1(getContext(), i));
    }

    public final void setHideMotionSpec(FirebaseCommonKtxRegistrar firebaseCommonKtxRegistrar) {
        this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1(firebaseCommonKtxRegistrar);
    }

    public final void setHideMotionSpecResource(int i) {
        setHideMotionSpec(FirebaseCommonKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1(getContext(), i));
    }

    public final void setExtendMotionSpec(FirebaseCommonKtxRegistrar firebaseCommonKtxRegistrar) {
        this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda1(firebaseCommonKtxRegistrar);
    }

    public final void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(FirebaseCommonKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1(getContext(), i));
    }

    public final void setShrinkMotionSpec(FirebaseCommonKtxRegistrar firebaseCommonKtxRegistrar) {
        this.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda1(firebaseCommonKtxRegistrar);
    }

    public final void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(FirebaseCommonKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1(getContext(), i));
    }

    final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return getVisibility() != 0 ? this.setUiOptions == 2 : this.setUiOptions != 1;
    }

    /* loaded from: classes.dex */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.setIconTintList<T> {
        private ExtendedFloatingActionButton$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0;
        private boolean MenuHostHelper$$ExternalSyntheticLambda1;
        private boolean setIconTintList;
        private ExtendedFloatingActionButton$MenuHostHelper$$ExternalSyntheticLambda1 setX;
        private Rect setY;

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> MenuHostHelper$$ExternalSyntheticLambda0 = coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda0(extendedFloatingActionButton);
            int size = MenuHostHelper$$ExternalSyntheticLambda0.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = MenuHostHelper$$ExternalSyntheticLambda0.get(i2);
                if (view2 instanceof AppBarLayout) {
                    if (setIconTintList(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 ? ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) layoutParams).setUnboundedRipple instanceof BottomSheetBehavior : false) && MenuHostHelper$$ExternalSyntheticLambda1(view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda1(extendedFloatingActionButton, i);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                setIconTintList(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 ? ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) layoutParams).setUnboundedRipple instanceof BottomSheetBehavior : false) {
                    MenuHostHelper$$ExternalSyntheticLambda1(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final /* bridge */ /* synthetic */ boolean setX(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return super.setX(coordinatorLayout, (ExtendedFloatingActionButton) view, rect);
        }

        public ExtendedFloatingActionButtonBehavior() {
            this.setIconTintList = false;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setIconTint.setIconTintList.ViewPager$SavedState$1);
            this.setIconTintList = obtainStyledAttributes.getBoolean(0, false);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final void MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) {
            if (coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setY == 0) {
                coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setY = 80;
            }
        }

        private boolean setIconTintList(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.setIconTintList || this.MenuHostHelper$$ExternalSyntheticLambda1) && ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) extendedFloatingActionButton.getLayoutParams()).setNavigationOnClickListener == view.getId();
        }

        private boolean setIconTintList(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (setIconTintList((View) appBarLayout, extendedFloatingActionButton)) {
                if (this.setY == null) {
                    this.setY = new Rect();
                }
                Rect rect = this.setY;
                rect.set(0, 0, appBarLayout.getWidth(), appBarLayout.getHeight());
                pingBinder.MenuHostHelper$$ExternalSyntheticLambda0(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.MenuHostHelper$$ExternalSyntheticLambda1()) {
                    MenuHostHelper$$ExternalSyntheticLambda0(extendedFloatingActionButton);
                    return true;
                }
                setIconTintList(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        private boolean MenuHostHelper$$ExternalSyntheticLambda1(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (setIconTintList(view, extendedFloatingActionButton)) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    MenuHostHelper$$ExternalSyntheticLambda0(extendedFloatingActionButton);
                    return true;
                }
                setIconTintList(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        private void MenuHostHelper$$ExternalSyntheticLambda0(ExtendedFloatingActionButton extendedFloatingActionButton) {
            getPathData getpathdata;
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                getpathdata = extendedFloatingActionButton.setMaxEms;
            } else {
                getpathdata = extendedFloatingActionButton.setChipCornerRadius;
            }
            ExtendedFloatingActionButton.setY(extendedFloatingActionButton, getpathdata, null);
        }

        private void setIconTintList(ExtendedFloatingActionButton extendedFloatingActionButton) {
            getPathData getpathdata;
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                getpathdata = extendedFloatingActionButton.setIconSize;
            } else {
                getpathdata = extendedFloatingActionButton.setTextScaleX;
            }
            ExtendedFloatingActionButton.setY(extendedFloatingActionButton, getpathdata, null);
        }
    }

    /* loaded from: classes.dex */
    class setX extends setGroupIndicator {
        @Override // o.getPathData
        public final int setNavigationOnClickListener() {
            return R.animator.res_0x7f020019;
        }

        public setX(ReflectiveGenericLifecycleObserver reflectiveGenericLifecycleObserver) {
            super(ExtendedFloatingActionButton.this, reflectiveGenericLifecycleObserver);
        }

        @Override // o.getPathData
        public final void setLayoutAnimation() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // o.setGroupIndicator, o.getPathData
        public final void MenuHostHelper$$ExternalSyntheticLambda0(Animator animator) {
            super.MenuHostHelper$$ExternalSyntheticLambda0(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setUiOptions = 2;
        }

        @Override // o.setGroupIndicator, o.getPathData
        public final void setIconTintList() {
            super.setIconTintList();
            ExtendedFloatingActionButton.this.setUiOptions = 0;
        }

        @Override // o.getPathData
        public final boolean setUnboundedRipple() {
            return ExtendedFloatingActionButton.this.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    /* loaded from: classes.dex */
    class setY extends setGroupIndicator {
        private boolean MenuHostHelper$$ExternalSyntheticLambda1;
        public static final byte[] $$g = {41, -91, 83, 107};
        public static final int $$h = 86;
        public static final byte[] $$d = {64, 34, -50, 73, 65, -65, -1, 14, -15, 28, -24, -9, -7, 45, -39, -4, -1, 44, -29, -7, -4, 11, -13, 78, 0, -33, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 49, 65, -72, 40, 42, -79, 14, -15, 27};
        public static final int $$e = 129;
        public static final byte[] $$a = {56, 110, 47, 101, 1, -28, 30, -39, -25, -12, 13, -34, -18, -19, 27, -42, -23, -14, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 35};
        public static final int $$b = 115;
        private static byte[] setLayoutAnimation = {79, 20, 25, -22, -17, 6, -18, -1, 2, 1, 50, -57, -16, -3, -10, 11, -13, -10, 66, -25, -48, -3, -10, 11, -23, 0, 1, -5, -13, -10, 7, -15, -9, 45, -29, -22, 7, 33, -48, 7, -5, 5, -25, 17, 47, -66, 7, -17, 3, 53, -41, -42, 2, -5, 11, -12};
        public static final int setIconTintList = 16;
        private static int setX = 851212240;

        /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0036). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 38
                int r6 = r6 + 77
                int r7 = r7 * 14
                int r7 = 18 - r7
                byte[] r0 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.setY.$$a
                int r8 = r8 * 25
                int r8 = r8 + 15
                byte[] r1 = new byte[r8]
                int r8 = r8 + (-1)
                r2 = 0
                if (r0 != 0) goto L1c
                r6 = r7
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r9
                r9 = r8
                goto L36
            L1c:
                r3 = 0
            L1d:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L2c
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2c:
                r3 = r0[r7]
                r5 = r8
                r8 = r6
                r6 = r7
                r7 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                r9 = r5
            L36:
                int r7 = -r7
                int r8 = r8 + r7
                int r7 = r8 + (-13)
                int r6 = r6 + 1
                r8 = r9
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.setY.a(int, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void c(byte r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 + 4
                byte[] r0 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.setY.setLayoutAnimation
                int r8 = r8 * 7
                int r8 = r8 + 16
                int r7 = 106 - r7
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L16
                r7 = r8
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r10
                r10 = r9
                goto L32
            L16:
                r3 = 0
                r6 = r9
                r9 = r7
            L19:
                r7 = r6
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L29
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L29:
                r3 = r0[r7]
                r6 = r10
                r10 = r7
                r7 = r8
                r8 = r3
                r3 = r1
                r1 = r0
                r0 = r6
            L32:
                int r9 = r9 - r8
                int r9 = r9 + (-4)
                int r8 = r10 + 1
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r6 = r8
                r8 = r7
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.setY.c(byte, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0032). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void d(short r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.setY.$$d
                int r9 = r9 * 2
                int r9 = 115 - r9
                int r7 = r7 + 4
                int r8 = 40 - r8
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r9 = r8
                r3 = r1
                r4 = 0
                r8 = r7
                r1 = r0
                r0 = r10
                r10 = r9
                goto L32
            L17:
                r3 = 0
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                int r7 = r7 + 1
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                r10 = r6
            L32:
                int r7 = -r7
                int r9 = r9 + r7
                r7 = r8
                r8 = r10
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.setY.d(short, int, short, java.lang.Object[]):void");
        }

        private static void e(short s, byte b, byte b2, Object[] objArr) {
            int i = (b2 * 2) + 102;
            int i2 = 1 - (s * 3);
            byte[] bArr = $$g;
            int i3 = (b * 2) + 4;
            byte[] bArr2 = new byte[i2];
            int i4 = -1;
            int i5 = i2 - 1;
            if (bArr == null) {
                i = i3 + i5;
                objArr = objArr;
                bArr = bArr;
                bArr2 = bArr2;
                i4 = -1;
                i3++;
                i5 = i5;
            }
            while (true) {
                int i6 = i4 + 1;
                bArr2[i6] = (byte) i;
                if (i6 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i7 = i3;
                i += bArr[i3];
                objArr = objArr;
                bArr = bArr;
                bArr2 = bArr2;
                i4 = i6;
                i3 = i7 + 1;
                i5 = i5;
            }
        }

        @Override // o.getPathData
        public final int setNavigationOnClickListener() {
            return R.animator.res_0x7f020018;
        }

        public setY(ReflectiveGenericLifecycleObserver reflectiveGenericLifecycleObserver) {
            super(ExtendedFloatingActionButton.this, reflectiveGenericLifecycleObserver);
        }

        @Override // o.getPathData
        public final void setLayoutAnimation() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // o.getPathData
        public final boolean setUnboundedRipple() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            return extendedFloatingActionButton.getVisibility() == 0 ? extendedFloatingActionButton.setUiOptions == 1 : extendedFloatingActionButton.setUiOptions != 2;
        }

        @Override // o.setGroupIndicator, o.getPathData
        public final void MenuHostHelper$$ExternalSyntheticLambda0(Animator animator) {
            super.MenuHostHelper$$ExternalSyntheticLambda0(animator);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setUiOptions = 1;
        }

        @Override // o.setGroupIndicator, o.getPathData
        public final void MenuHostHelper$$ExternalSyntheticLambda1() {
            super.MenuHostHelper$$ExternalSyntheticLambda1();
            this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0449  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0591  */
        /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
        @Override // o.setGroupIndicator, o.getPathData
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void setIconTintList() {
            /*
                Method dump skipped, instructions count: 1492
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.setY.setIconTintList():void");
        }

        private static void b(int i, char[] cArr, int i2, boolean z, int i3, Object[] objArr) {
            ju juVar = new ju();
            char[] cArr2 = new char[i];
            juVar.setX = 0;
            while (juVar.setX < i) {
                juVar.MenuHostHelper$$ExternalSyntheticLambda0 = cArr[juVar.setX];
                cArr2[juVar.setX] = (char) (i2 + juVar.MenuHostHelper$$ExternalSyntheticLambda0);
                int i4 = juVar.setX;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4]), Integer.valueOf(setX)};
                    Object obj = jC.setTextScaleX.get(-1875803360);
                    if (obj == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        Object[] objArr3 = new Object[1];
                        e(b, b2, (byte) (b2 + 1), objArr3);
                        obj = ((Class) jC.setY((ViewConfiguration.getScrollDefaultDelay() >> 16) + 341, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), TextUtils.indexOf("", "", 0, 0) + 4)).getMethod((String) objArr3[0], Integer.TYPE, Integer.TYPE);
                        jC.setTextScaleX.put(-1875803360, obj);
                    }
                    cArr2[i4] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr4 = {juVar, juVar};
                        Object obj2 = jC.setTextScaleX.get(-257319855);
                        if (obj2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            Object[] objArr5 = new Object[1];
                            e(b3, b4, b4, objArr5);
                            obj2 = ((Class) jC.setY(206 - KeyEvent.normalizeMetaState(0), (char) (65232 - TextUtils.lastIndexOf("", '0', 0)), MotionEvent.axisFromString("") + 5)).getMethod((String) objArr5[0], Object.class, Object.class);
                            jC.setTextScaleX.put(-257319855, obj2);
                        }
                        ((Method) obj2).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            if (i3 > 0) {
                juVar.setIconTintList = i3;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - juVar.setIconTintList, juVar.setIconTintList);
                System.arraycopy(cArr3, juVar.setIconTintList, cArr2, 0, i - juVar.setIconTintList);
            }
            if (z) {
                char[] cArr4 = new char[i];
                juVar.setX = 0;
                while (juVar.setX < i) {
                    cArr4[juVar.setX] = cArr2[(i - juVar.setX) - 1];
                    try {
                        Object[] objArr6 = {juVar, juVar};
                        Object obj3 = jC.setTextScaleX.get(-257319855);
                        if (obj3 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            Object[] objArr7 = new Object[1];
                            e(b5, b6, b6, objArr7);
                            obj3 = ((Class) jC.setY((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 206, (char) (65233 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 3 - TextUtils.lastIndexOf("", '0', 0, 0))).getMethod((String) objArr7[0], Object.class, Object.class);
                            jC.setTextScaleX.put(-257319855, obj3);
                        }
                        ((Method) obj3).invoke(null, objArr6);
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }
    }

    static /* synthetic */ void setY(ExtendedFloatingActionButton extendedFloatingActionButton, final getPathData getpathdata, ExtendedFloatingActionButton$MenuHostHelper$$ExternalSyntheticLambda1 extendedFloatingActionButton$MenuHostHelper$$ExternalSyntheticLambda1) {
        if (getpathdata.setUnboundedRipple()) {
            return;
        }
        if (!((setBaselineAlignBottom.setConstraintSet(extendedFloatingActionButton) || (!extendedFloatingActionButton.MenuHostHelper$$ExternalSyntheticLambda1() && extendedFloatingActionButton.setCheckedIconEnabled)) && !extendedFloatingActionButton.isInEditMode())) {
            getpathdata.setLayoutAnimation();
            return;
        }
        extendedFloatingActionButton.measure(0, 0);
        AnimatorSet MenuHostHelper$$ExternalSyntheticLambda0 = getpathdata.MenuHostHelper$$ExternalSyntheticLambda0();
        MenuHostHelper$$ExternalSyntheticLambda0.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.3
            private boolean MenuHostHelper$$ExternalSyntheticLambda1;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                getpathdata.MenuHostHelper$$ExternalSyntheticLambda0(animator);
                this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                getpathdata.MenuHostHelper$$ExternalSyntheticLambda1();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                getpathdata.setIconTintList();
                boolean z = this.MenuHostHelper$$ExternalSyntheticLambda1;
            }
        });
        for (Animator.AnimatorListener animatorListener : getpathdata.setX()) {
            MenuHostHelper$$ExternalSyntheticLambda0.addListener(animatorListener);
        }
        MenuHostHelper$$ExternalSyntheticLambda0.start();
    }

    final int setLayoutAnimation() {
        int i = this.ViewPager$SavedState$1;
        if (i < 0) {
            i = (Math.min(setBaselineAlignBottom.setAnimationFromJson(this), setBaselineAlignBottom.setOnNavigationItemSelectedListener(this)) << 1) + ((FabTransformationSheetBehavior) this).MenuHostHelper$$ExternalSyntheticLambda1;
        }
        return (i - ((FabTransformationSheetBehavior) this).MenuHostHelper$$ExternalSyntheticLambda1) / 2;
    }
}