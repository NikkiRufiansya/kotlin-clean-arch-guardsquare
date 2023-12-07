package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Parcelable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0;
import androidx.core.view.WindowInsetsCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o.R;
import o.jC;
import o.jr;
import o.setActionBarVisibilityCallback;
import o.setBaselineAlignBottom;
import o.setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1;
import o.setDecorPadding;
import o.setFastScrollEnabled;
import o.setHelperTextColor;
import o.setIconTint;
import o.setRowCount;
import o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0;
import o.setScrollBarDefaultDelayBeforeFade;
import o.setShowDividers;
import o.setTitleMargin;
import o.setTitleMargin$MenuHostHelper$$ExternalSyntheticLambda0;
import o.setTitleMargin$MenuHostHelper$$ExternalSyntheticLambda1;
import o.setWebViewClient;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.setIconTintList<V> {
    private static char[] FabTransformationBehavior;
    private static char createDispatcher;
    private static final int setChipIconTintResource;
    WeakReference<V> ExtendableSavedState$1;
    private int FirebaseRemoteConfigKtxRegistrar;
    private int FloatingActionButton$BaseBehavior;
    private boolean Fragment$5;
    private final setRowCount$MenuHostHelper$$ExternalSyntheticLambda0 FragmentStateAdapter$2;
    private boolean FragmentStateAdapter$5;
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private int RecyclerView$SavedState$1;
    public setWebViewClient ViewPager$SavedState$1;
    private int getCallingPid;
    private boolean onActivityResumed;
    private float setAdapter;
    boolean setAnimationFromJson;
    boolean setCenterIfNoTextEnabled;
    setRowCount setCheckedIconEnabled;
    boolean setChipCornerRadius;
    private int setChipIconEnabled;
    private int setChipSpacingVertical;
    private VelocityTracker setCloseIconEndPadding;
    private int setConstraintSet;
    private float setContentScrimResource;
    private boolean setError;
    private int setFilterRedundantCalls;
    private float setFilterTouchesWhenObscured;
    private boolean setFloatValues;
    boolean setGuidelinePercent;
    private ColorStateList setHasDecor;
    private int setHint;
    boolean setIconSize;
    int setIconTintList;
    private int setIconified;
    private int setImageTintMode;
    boolean setLayoutAnimation;
    int setLayoutDirection;
    WeakReference<View> setMaxEms;
    boolean setMinAndMaxProgress;
    int setNavigationOnClickListener;
    private boolean setObjectValues;
    int setOnLongClickListener;
    boolean setOnNavigationItemSelectedListener;
    private final BottomSheetBehavior<V>.setIconTintList setRevealInfo;
    private ValueAnimator setSelectedChildViewEnabled;
    private boolean setShrinkMotionSpec;
    private int setSuffixText;
    int setTextAlignment;
    public int setTextAppearanceResource;
    boolean setTextScaleX;
    private float setTitleMarginEnd;
    private setScrollBarDefaultDelayBeforeFade setTooltipText;
    int setUiOptions;
    int setUnboundedRipple;
    private Map<View, Integer> setViewTranslationCallback;
    public final ArrayList<setY> setX;
    int setY;
    int setZ;
    public static final byte[] $$g = {113, -101, 105, 26};
    public static final int $$h = 94;
    public static final byte[] $$d = {11, 29, 107, 8, 1, -28, 30, -39, -25, -12, 13, -34, -18, -19, 27, -42, -23, -14, 52, -64, 19, 16, -54, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 36};
    public static final int $$e = 255;
    public static final byte[] $$a = {8, -125, -40, -38, -1, 28, -14, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35};
    public static final int $$b = 96;
    private static byte[] setLineBreakStyle = {64, 34, -50, 73, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
    public static final int SearchView$SavedState$1 = 196;

    /* loaded from: classes.dex */
    public static abstract class setY {
        public abstract void MenuHostHelper$$ExternalSyntheticLambda1(View view, int i);

        public abstract void setX(View view);

        protected void setY(View view) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.$$a
            int r8 = r8 + 4
            int r9 = 21 - r9
            int r7 = r7 * 38
            int r7 = r7 + 77
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L30
        L15:
            r3 = 0
            r6 = r9
            r9 = r7
            r7 = r6
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r7]
            r6 = r10
            r10 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L30:
            int r9 = r9 + r7
            int r9 = r9 + (-13)
            int r7 = r10 + 1
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.a(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r6 = 19 - r6
            int r7 = r7 * 2
            int r7 = r7 + 16
            int r8 = 106 - r8
            byte[] r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.setLineBreakStyle
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L1a
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r7
            r7 = r6
            goto L36
        L1a:
            r3 = 0
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L1f:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2e
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2e:
            r3 = r0[r7]
            r5 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L36:
            int r6 = r6 + r8
            int r6 = r6 + 2
            int r7 = r7 + 1
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c(short, int, short, java.lang.Object[]):void");
    }

    private static void d(int i, short s, int i2, Object[] objArr) {
        int i3 = 17 - (i2 * 14);
        int i4 = 115 - (i * 4);
        int i5 = 45 - (s * 30);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i5];
        int i6 = -1;
        int i7 = i5 - 1;
        if (bArr == null) {
            int i8 = (i7 + (-i3)) - 13;
            i3 = i3;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i6 = -1;
            i7 = i7;
            i4 = i8;
        }
        while (true) {
            int i9 = i6 + 1;
            bArr2[i9] = (byte) i4;
            if (i9 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i10 = i3 + 1;
            int i11 = i7;
            Object[] objArr2 = objArr;
            byte[] bArr3 = bArr2;
            byte[] bArr4 = bArr;
            int i12 = (i4 + (-bArr[i10])) - 13;
            i3 = i10;
            objArr = objArr2;
            bArr = bArr4;
            bArr2 = bArr3;
            i6 = i9;
            i7 = i11;
            i4 = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r7 = 106 - r7
            int r9 = r9 * 2
            int r9 = 3 - r9
            byte[] r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.$$g
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L32
        L17:
            r3 = 0
        L18:
            int r4 = r3 + 1
            int r9 = r9 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L32:
            int r7 = r7 + r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e(short, short, short, java.lang.Object[]):void");
    }

    static void setIconTintList() {
        createDispatcher = (char) 63084;
        FabTransformationBehavior = new char[]{50141, 50079, 50070, 50096, 50078, 50081, 50053, 50077, 50080, 50074, 50140, 50066, 50098, 50076, 50055, 50048, 50087, 50072, 50058, 50075, 50049, 50064, 50051, 50071, 50054};
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final void setX(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    static {
        setIconTintList();
        setChipIconTintResource = R.style._res_0x7f150305;
    }

    public BottomSheetBehavior() {
        this.setHint = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        this.Fragment$5 = false;
        this.FirebaseRemoteConfigKtxRegistrar = -1;
        this.setImageTintMode = -1;
        this.setRevealInfo = new setIconTintList(this, (byte) 0);
        this.setAdapter = 0.5f;
        this.setContentScrimResource = -1.0f;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        this.setTextAppearanceResource = 4;
        this.RecyclerView$SavedState$1 = 4;
        this.setFilterTouchesWhenObscured = 0.1f;
        this.setX = new ArrayList<>();
        this.FloatingActionButton$BaseBehavior = -1;
        this.FragmentStateAdapter$2 = new setRowCount$MenuHostHelper$$ExternalSyntheticLambda0() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
            private long setX;

            @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
            public final boolean MenuHostHelper$$ExternalSyntheticLambda1(View view, int i) {
                if (BottomSheetBehavior.this.setTextAppearanceResource == 1 || BottomSheetBehavior.this.setMinAndMaxProgress) {
                    return false;
                }
                if (BottomSheetBehavior.this.setTextAppearanceResource == 3 && BottomSheetBehavior.this.setY == i) {
                    View view2 = BottomSheetBehavior.this.setMaxEms != null ? BottomSheetBehavior.this.setMaxEms.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.setX = System.currentTimeMillis();
                return BottomSheetBehavior.this.ExtendableSavedState$1 != null && BottomSheetBehavior.this.ExtendableSavedState$1.get() == view;
            }

            @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
            public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, int i, int i2) {
                BottomSheetBehavior.this.MenuHostHelper$$ExternalSyntheticLambda1(i2);
            }

            @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
            public final void setY(int i) {
                if (i == 1 && BottomSheetBehavior.this.MenuHostHelper$$ExternalSyntheticLambda1) {
                    BottomSheetBehavior.this.setY(1);
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
                if (java.lang.Math.abs(r4.getTop() - r3.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0()) >= java.lang.Math.abs(r4.getTop() - r3.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions)) goto L7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
                if (java.lang.Math.abs(r5 - r3.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions) < java.lang.Math.abs(r5 - r3.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList)) goto L7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00c8, code lost:
                if (java.lang.Math.abs(r5 - r3.MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener) < java.lang.Math.abs(r5 - r3.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList)) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x00db, code lost:
                if (r5 >= java.lang.Math.abs(r5 - r3.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList)) goto L7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x00f3, code lost:
                if (java.lang.Math.abs(r5 - r3.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions) < java.lang.Math.abs(r5 - r3.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList)) goto L7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
                if (r4.getTop() <= r3.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions) goto L11;
             */
            @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void setX(android.view.View r4, float r5, float r6) {
                /*
                    Method dump skipped, instructions count: 254
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass1.setX(android.view.View, float, float):void");
            }

            @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
            public final int MenuHostHelper$$ExternalSyntheticLambda0(View view, int i) {
                int MenuHostHelper$$ExternalSyntheticLambda0 = BottomSheetBehavior.this.MenuHostHelper$$ExternalSyntheticLambda0();
                int i2 = BottomSheetBehavior.this.setLayoutAnimation ? BottomSheetBehavior.this.setZ : BottomSheetBehavior.this.setIconTintList;
                return i < MenuHostHelper$$ExternalSyntheticLambda0 ? MenuHostHelper$$ExternalSyntheticLambda0 : i > i2 ? i2 : i;
            }

            @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
            public final int setIconTintList(View view, int i) {
                return view.getLeft();
            }

            @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
            public final int setIconTintList() {
                if (BottomSheetBehavior.this.setLayoutAnimation) {
                    return BottomSheetBehavior.this.setZ;
                }
                return BottomSheetBehavior.this.setIconTintList;
            }
        };
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setHint = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        this.Fragment$5 = false;
        this.FirebaseRemoteConfigKtxRegistrar = -1;
        this.setImageTintMode = -1;
        this.setRevealInfo = new setIconTintList(this, (byte) 0);
        this.setAdapter = 0.5f;
        this.setContentScrimResource = -1.0f;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        this.setTextAppearanceResource = 4;
        this.RecyclerView$SavedState$1 = 4;
        this.setFilterTouchesWhenObscured = 0.1f;
        this.setX = new ArrayList<>();
        this.FloatingActionButton$BaseBehavior = -1;
        this.FragmentStateAdapter$2 = new setRowCount$MenuHostHelper$$ExternalSyntheticLambda0() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
            private long setX;

            @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
            public final boolean MenuHostHelper$$ExternalSyntheticLambda1(View view, int i) {
                if (BottomSheetBehavior.this.setTextAppearanceResource == 1 || BottomSheetBehavior.this.setMinAndMaxProgress) {
                    return false;
                }
                if (BottomSheetBehavior.this.setTextAppearanceResource == 3 && BottomSheetBehavior.this.setY == i) {
                    View view2 = BottomSheetBehavior.this.setMaxEms != null ? BottomSheetBehavior.this.setMaxEms.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.setX = System.currentTimeMillis();
                return BottomSheetBehavior.this.ExtendableSavedState$1 != null && BottomSheetBehavior.this.ExtendableSavedState$1.get() == view;
            }

            @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
            public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, int i, int i2) {
                BottomSheetBehavior.this.MenuHostHelper$$ExternalSyntheticLambda1(i2);
            }

            @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
            public final void setY(int i) {
                if (i == 1 && BottomSheetBehavior.this.MenuHostHelper$$ExternalSyntheticLambda1) {
                    BottomSheetBehavior.this.setY(1);
                }
            }

            @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void setX(android.view.View r4, float r5, float r6) {
                /*
                    Method dump skipped, instructions count: 254
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass1.setX(android.view.View, float, float):void");
            }

            @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
            public final int MenuHostHelper$$ExternalSyntheticLambda0(View view, int i) {
                int MenuHostHelper$$ExternalSyntheticLambda0 = BottomSheetBehavior.this.MenuHostHelper$$ExternalSyntheticLambda0();
                int i2 = BottomSheetBehavior.this.setLayoutAnimation ? BottomSheetBehavior.this.setZ : BottomSheetBehavior.this.setIconTintList;
                return i < MenuHostHelper$$ExternalSyntheticLambda0 ? MenuHostHelper$$ExternalSyntheticLambda0 : i > i2 ? i2 : i;
            }

            @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
            public final int setIconTintList(View view, int i) {
                return view.getLeft();
            }

            @Override // o.setRowCount$MenuHostHelper$$ExternalSyntheticLambda0
            public final int setIconTintList() {
                if (BottomSheetBehavior.this.setLayoutAnimation) {
                    return BottomSheetBehavior.this.setZ;
                }
                return BottomSheetBehavior.this.setIconTintList;
            }
        };
        this.setFilterRedundantCalls = context.getResources().getDimensionPixelSize(R.dimen.res_0x7f07020d);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setIconTint.setIconTintList.setUnboundedRipple);
        int i = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.setHasDecor = setFastScrollEnabled.setX(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(20)) {
            this.setTooltipText = new setScrollBarDefaultDelayBeforeFade(setScrollBarDefaultDelayBeforeFade.MenuHostHelper$$ExternalSyntheticLambda0(context, attributeSet, R.attr.res_0x7f04006a, setChipIconTintResource, new setActionBarVisibilityCallback(0.0f)), (byte) 0);
        }
        if (this.setTooltipText != null) {
            setWebViewClient setwebviewclient = new setWebViewClient(this.setTooltipText);
            this.ViewPager$SavedState$1 = setwebviewclient;
            setwebviewclient.setX(context);
            ColorStateList colorStateList = this.setHasDecor;
            if (colorStateList != null) {
                setWebViewClient setwebviewclient2 = this.ViewPager$SavedState$1;
                if (setwebviewclient2.setChipIconTintResource.setX != colorStateList) {
                    setwebviewclient2.setChipIconTintResource.setX = colorStateList;
                    setwebviewclient2.onStateChange(setwebviewclient2.getState());
                }
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.ViewPager$SavedState$1.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.setSelectedChildViewEnabled = ofFloat;
        ofFloat.setDuration(500L);
        this.setSelectedChildViewEnabled.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.ViewPager$SavedState$1 != null) {
                    setWebViewClient setwebviewclient3 = BottomSheetBehavior.this.ViewPager$SavedState$1;
                    if (setwebviewclient3.setChipIconTintResource.setUiOptions != floatValue) {
                        setwebviewclient3.setChipIconTintResource.setUiOptions = floatValue;
                        setwebviewclient3.FloatingActionButton$BaseBehavior = true;
                        setwebviewclient3.invalidateSelf();
                    }
                }
            }
        });
        this.setContentScrimResource = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.FirebaseRemoteConfigKtxRegistrar = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.setImageTintMode = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && peekValue.data == -1) {
            setNavigationOnClickListener(peekValue.data);
        } else {
            setNavigationOnClickListener(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        setX(obtainStyledAttributes.getBoolean(8, false));
        this.FragmentStateAdapter$5 = obtainStyledAttributes.getBoolean(12, false);
        boolean z = obtainStyledAttributes.getBoolean(6, true);
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 != z) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = z;
            if (this.ExtendableSavedState$1 != null) {
                setX();
            }
            setY((this.MenuHostHelper$$ExternalSyntheticLambda0 && this.setTextAppearanceResource == 6) ? i : this.setTextAppearanceResource);
            setUiOptions();
        }
        this.setGuidelinePercent = obtainStyledAttributes.getBoolean(11, false);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getBoolean(4, true);
        this.setHint = obtainStyledAttributes.getInt(10, 0);
        float f = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.setAdapter = f;
        if (this.ExtendableSavedState$1 != null) {
            this.setUiOptions = (int) (this.setZ * (1.0f - f));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 != null && peekValue2.type == 16) {
            int i2 = peekValue2.data;
            if (i2 < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.setConstraintSet = i2;
        } else {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.setConstraintSet = dimensionPixelOffset;
        }
        this.setOnNavigationItemSelectedListener = obtainStyledAttributes.getBoolean(16, false);
        this.setAnimationFromJson = obtainStyledAttributes.getBoolean(17, false);
        this.setTextScaleX = obtainStyledAttributes.getBoolean(18, false);
        this.setError = obtainStyledAttributes.getBoolean(19, true);
        this.setChipCornerRadius = obtainStyledAttributes.getBoolean(13, false);
        this.setIconSize = obtainStyledAttributes.getBoolean(14, false);
        this.setCenterIfNoTextEnabled = obtainStyledAttributes.getBoolean(15, false);
        obtainStyledAttributes.recycle();
        this.setTitleMarginEnd = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final Parcelable MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, V v) {
        return new BottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1(super.MenuHostHelper$$ExternalSyntheticLambda0(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final void setY(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        BottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1 bottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1 = (BottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1) parcelable;
        super.setY(coordinatorLayout, (CoordinatorLayout) v, bottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions);
        int i = this.setHint;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.setLayoutDirection = bottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1.setX;
            }
            int i2 = this.setHint;
            if (i2 == -1 || (i2 & 2) == 2) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = bottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1;
            }
            int i3 = this.setHint;
            if (i3 == -1 || (i3 & 4) == 4) {
                this.setLayoutAnimation = bottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1.setY;
            }
            int i4 = this.setHint;
            if (i4 == -1 || (i4 & 8) == 8) {
                this.setGuidelinePercent = bottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
            }
        }
        if (bottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener == 1 || bottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener == 2) {
            this.setTextAppearanceResource = 4;
            this.RecyclerView$SavedState$1 = 4;
            return;
        }
        int i5 = bottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener;
        this.setTextAppearanceResource = i5;
        this.RecyclerView$SavedState$1 = i5;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final void MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) {
        super.MenuHostHelper$$ExternalSyntheticLambda1(coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0);
        this.ExtendableSavedState$1 = null;
        this.setCheckedIconEnabled = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        super.MenuHostHelper$$ExternalSyntheticLambda1();
        this.ExtendableSavedState$1 = null;
        this.setCheckedIconEnabled = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final boolean setX(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int i5 = marginLayoutParams.leftMargin;
        int y = setY(i, paddingLeft + paddingRight + i5 + marginLayoutParams.rightMargin + i2, this.FirebaseRemoteConfigKtxRegistrar, ((ViewGroup.LayoutParams) marginLayoutParams).width);
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int i6 = marginLayoutParams.topMargin;
        v.measure(y, setY(i3, paddingTop + paddingBottom + i6 + marginLayoutParams.bottomMargin + i4, this.setImageTintMode, ((ViewGroup.LayoutParams) marginLayoutParams).height));
        return true;
    }

    private static int setY(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (setBaselineAlignBottom.setTextAlignment(coordinatorLayout) && !setBaselineAlignBottom.setTextAlignment(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.ExtendableSavedState$1 == null) {
            this.getCallingPid = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.res_0x7f07006d);
            final boolean z = (Build.VERSION.SDK_INT < 29 || this.FragmentStateAdapter$5 || this.onActivityResumed) ? false : true;
            if (this.setOnNavigationItemSelectedListener || this.setAnimationFromJson || this.setTextScaleX || this.setChipCornerRadius || this.setIconSize || this.setCenterIfNoTextEnabled || z) {
                setTitleMargin.setX(v, new setTitleMargin$MenuHostHelper$$ExternalSyntheticLambda0() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
                    @Override // o.setTitleMargin$MenuHostHelper$$ExternalSyntheticLambda0
                    public final WindowInsetsCompat setY(View view, WindowInsetsCompat windowInsetsCompat, setTitleMargin$MenuHostHelper$$ExternalSyntheticLambda1 settitlemargin_menuhosthelper__externalsyntheticlambda1) {
                        int x;
                        boolean z2;
                        setHelperTextColor MenuHostHelper$$ExternalSyntheticLambda0 = windowInsetsCompat.MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat.setNavigationOnClickListener.setIconTintList());
                        setHelperTextColor MenuHostHelper$$ExternalSyntheticLambda02 = windowInsetsCompat.MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1());
                        BottomSheetBehavior.this.setTextAlignment = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1;
                        x = setBaselineAlignBottom.setX.setX(view);
                        boolean z3 = true;
                        boolean z4 = x == 1;
                        int paddingBottom = view.getPaddingBottom();
                        int paddingLeft = view.getPaddingLeft();
                        int paddingRight = view.getPaddingRight();
                        if (BottomSheetBehavior.this.setOnNavigationItemSelectedListener) {
                            BottomSheetBehavior.this.setUnboundedRipple = windowInsetsCompat.setUnboundedRipple();
                            paddingBottom = settitlemargin_menuhosthelper__externalsyntheticlambda1.setX + BottomSheetBehavior.this.setUnboundedRipple;
                        }
                        if (BottomSheetBehavior.this.setAnimationFromJson) {
                            paddingLeft = (z4 ? settitlemargin_menuhosthelper__externalsyntheticlambda1.setY : settitlemargin_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1) + MenuHostHelper$$ExternalSyntheticLambda0.setY;
                        }
                        if (BottomSheetBehavior.this.setTextScaleX) {
                            paddingRight = (z4 ? settitlemargin_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1 : settitlemargin_menuhosthelper__externalsyntheticlambda1.setY) + MenuHostHelper$$ExternalSyntheticLambda0.setX;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        if (!BottomSheetBehavior.this.setChipCornerRadius || marginLayoutParams.leftMargin == MenuHostHelper$$ExternalSyntheticLambda0.setY) {
                            z2 = false;
                        } else {
                            marginLayoutParams.leftMargin = MenuHostHelper$$ExternalSyntheticLambda0.setY;
                            z2 = true;
                        }
                        if (BottomSheetBehavior.this.setIconSize && marginLayoutParams.rightMargin != MenuHostHelper$$ExternalSyntheticLambda0.setX) {
                            marginLayoutParams.rightMargin = MenuHostHelper$$ExternalSyntheticLambda0.setX;
                            z2 = true;
                        }
                        if (!BottomSheetBehavior.this.setCenterIfNoTextEnabled || marginLayoutParams.topMargin == MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1) {
                            z3 = z2;
                        } else {
                            marginLayoutParams.topMargin = MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1;
                        }
                        if (z3) {
                            view.setLayoutParams(marginLayoutParams);
                        }
                        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                        if (z) {
                            BottomSheetBehavior.this.setOnLongClickListener = MenuHostHelper$$ExternalSyntheticLambda02.setIconTintList;
                        }
                        if (BottomSheetBehavior.this.setOnNavigationItemSelectedListener || z) {
                            BottomSheetBehavior.this.MenuHostHelper$$ExternalSyntheticLambda0(false);
                        }
                        return windowInsetsCompat;
                    }
                });
            }
            this.ExtendableSavedState$1 = new WeakReference<>(v);
            setWebViewClient setwebviewclient = this.ViewPager$SavedState$1;
            if (setwebviewclient == null) {
                ColorStateList colorStateList = this.setHasDecor;
                if (colorStateList != null) {
                    setBaselineAlignBottom.setY(v, colorStateList);
                }
            } else {
                setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(v, setwebviewclient);
                setWebViewClient setwebviewclient2 = this.ViewPager$SavedState$1;
                float f = this.setContentScrimResource;
                if (f == -1.0f) {
                    f = setBaselineAlignBottom.setUiOptions(v);
                }
                setwebviewclient2.setIconSize(f);
                boolean z2 = this.setTextAppearanceResource == 3;
                this.setFloatValues = z2;
                setWebViewClient setwebviewclient3 = this.ViewPager$SavedState$1;
                float f2 = z2 ? 0.0f : 1.0f;
                if (setwebviewclient3.setChipIconTintResource.setUiOptions != f2) {
                    setwebviewclient3.setChipIconTintResource.setUiOptions = f2;
                    setwebviewclient3.FloatingActionButton$BaseBehavior = true;
                    setwebviewclient3.invalidateSelf();
                }
            }
            setUiOptions();
            if (setBaselineAlignBottom.setCenterIfNoTextEnabled(v) == 0) {
                setBaselineAlignBottom.setUnboundedRipple(v, 1);
            }
        }
        if (this.setCheckedIconEnabled == null) {
            this.setCheckedIconEnabled = setRowCount.MenuHostHelper$$ExternalSyntheticLambda0(coordinatorLayout, this.FragmentStateAdapter$2);
        }
        int top = v.getTop();
        coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda1(v, i);
        this.setChipSpacingVertical = coordinatorLayout.getWidth();
        this.setZ = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.setIconified = height;
        int i2 = this.setZ;
        int i3 = this.setTextAlignment;
        if (i2 - height < i3) {
            if (this.setError) {
                this.setIconified = i2;
            } else {
                this.setIconified = i2 - i3;
            }
        }
        this.setNavigationOnClickListener = Math.max(0, i2 - this.setIconified);
        this.setUiOptions = (int) (this.setZ * (1.0f - this.setAdapter));
        setX();
        int i4 = this.setTextAppearanceResource;
        if (i4 == 3) {
            setBaselineAlignBottom.setX(v, MenuHostHelper$$ExternalSyntheticLambda0());
        } else if (i4 == 6) {
            setBaselineAlignBottom.setX(v, this.setUiOptions);
        } else if (this.setLayoutAnimation && i4 == 5) {
            setBaselineAlignBottom.setX(v, this.setZ);
        } else if (i4 == 4) {
            setBaselineAlignBottom.setX(v, this.setIconTintList);
        } else if (i4 == 1 || i4 == 2) {
            setBaselineAlignBottom.setX(v, top - v.getTop());
        }
        this.setMaxEms = new WeakReference<>(setX(v));
        for (int i5 = 0; i5 < this.setX.size(); i5++) {
            this.setX.get(i5).setY(v);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final boolean setY(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        setRowCount setrowcount;
        if (!v.isShown() || !this.MenuHostHelper$$ExternalSyntheticLambda1) {
            this.setObjectValues = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.setY = -1;
            VelocityTracker velocityTracker = this.setCloseIconEndPadding;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.setCloseIconEndPadding = null;
            }
        }
        if (this.setCloseIconEndPadding == null) {
            this.setCloseIconEndPadding = VelocityTracker.obtain();
        }
        this.setCloseIconEndPadding.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.setSuffixText = (int) motionEvent.getY();
            if (this.setTextAppearanceResource != 2) {
                WeakReference<View> weakReference = this.setMaxEms;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.setIconTintList(view, x, this.setSuffixText)) {
                    this.setY = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.setMinAndMaxProgress = true;
                }
            }
            this.setObjectValues = this.setY == -1 && !coordinatorLayout.setIconTintList(v, x, this.setSuffixText);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.setMinAndMaxProgress = false;
            this.setY = -1;
            if (this.setObjectValues) {
                this.setObjectValues = false;
                return false;
            }
        }
        if (this.setObjectValues || (setrowcount = this.setCheckedIconEnabled) == null || !setrowcount.setIconTintList(motionEvent)) {
            WeakReference<View> weakReference2 = this.setMaxEms;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            return (actionMasked != 2 || view2 == null || this.setObjectValues || this.setTextAppearanceResource == 1 || coordinatorLayout.setIconTintList(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.setCheckedIconEnabled == null || Math.abs(((float) this.setSuffixText) - motionEvent.getY()) <= ((float) this.setCheckedIconEnabled.setIconTintList)) ? false : true;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (v.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.setTextAppearanceResource == 1 && actionMasked == 0) {
                return true;
            }
            if (setUnboundedRipple()) {
                this.setCheckedIconEnabled.MenuHostHelper$$ExternalSyntheticLambda1(motionEvent);
            }
            if (actionMasked == 0) {
                this.setY = -1;
                VelocityTracker velocityTracker = this.setCloseIconEndPadding;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.setCloseIconEndPadding = null;
                }
            }
            if (this.setCloseIconEndPadding == null) {
                this.setCloseIconEndPadding = VelocityTracker.obtain();
            }
            this.setCloseIconEndPadding.addMovement(motionEvent);
            if (setUnboundedRipple() && actionMasked == 2 && !this.setObjectValues && Math.abs(this.setSuffixText - motionEvent.getY()) > this.setCheckedIconEnabled.setIconTintList) {
                this.setCheckedIconEnabled.setIconTintList(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            return !this.setObjectValues;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.setChipIconEnabled = 0;
        this.setShrinkMotionSpec = false;
        return (i & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final void MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.setMaxEms;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < MenuHostHelper$$ExternalSyntheticLambda0()) {
                int MenuHostHelper$$ExternalSyntheticLambda0 = top - MenuHostHelper$$ExternalSyntheticLambda0();
                iArr[1] = MenuHostHelper$$ExternalSyntheticLambda0;
                setBaselineAlignBottom.setX(v, -MenuHostHelper$$ExternalSyntheticLambda0);
                setY(3);
            } else if (!this.MenuHostHelper$$ExternalSyntheticLambda1) {
                return;
            } else {
                iArr[1] = i2;
                setBaselineAlignBottom.setX(v, -i2);
                setY(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.setIconTintList;
            if (i4 <= i5 || this.setLayoutAnimation) {
                if (!this.MenuHostHelper$$ExternalSyntheticLambda1) {
                    return;
                }
                iArr[1] = i2;
                setBaselineAlignBottom.setX(v, -i2);
                setY(1);
            } else {
                int i6 = top - i5;
                iArr[1] = i6;
                setBaselineAlignBottom.setX(v, -i6);
                setY(4);
            }
        }
        MenuHostHelper$$ExternalSyntheticLambda1(v.getTop());
        this.setChipIconEnabled = i2;
        this.setShrinkMotionSpec = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        if (r3.getTop() > r1.setUiOptions) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
        if (java.lang.Math.abs(r2 - r1.setNavigationOnClickListener) < java.lang.Math.abs(r2 - r1.setIconTintList)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
        if (r2 >= java.lang.Math.abs(r2 - r1.setIconTintList)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
        if (java.lang.Math.abs(r2 - r4) < java.lang.Math.abs(r2 - r1.setIconTintList)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a7, code lost:
        if (java.lang.Math.abs(r2 - r1.setUiOptions) < java.lang.Math.abs(r2 - r1.setIconTintList)) goto L18;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setX(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, int r5) {
        /*
            r1 = this;
            int r2 = r3.getTop()
            int r5 = r1.MenuHostHelper$$ExternalSyntheticLambda0()
            r0 = 3
            if (r2 != r5) goto Lf
            r1.setY(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r2 = r1.setMaxEms
            if (r2 == 0) goto Lb2
            java.lang.Object r2 = r2.get()
            if (r4 != r2) goto Lb2
            boolean r2 = r1.setShrinkMotionSpec
            if (r2 != 0) goto L1f
            goto Lb2
        L1f:
            int r2 = r1.setChipIconEnabled
            if (r2 <= 0) goto L31
            boolean r2 = r1.MenuHostHelper$$ExternalSyntheticLambda0
            if (r2 != 0) goto Lac
            int r2 = r3.getTop()
            int r4 = r1.setUiOptions
            if (r2 <= r4) goto Lac
            goto La9
        L31:
            boolean r2 = r1.setLayoutAnimation
            if (r2 == 0) goto L52
            android.view.VelocityTracker r2 = r1.setCloseIconEndPadding
            if (r2 != 0) goto L3b
            r2 = 0
            goto L4a
        L3b:
            r4 = 1000(0x3e8, float:1.401E-42)
            float r5 = r1.setTitleMarginEnd
            r2.computeCurrentVelocity(r4, r5)
            android.view.VelocityTracker r2 = r1.setCloseIconEndPadding
            int r4 = r1.setY
            float r2 = r2.getYVelocity(r4)
        L4a:
            boolean r2 = r1.setY(r3, r2)
            if (r2 == 0) goto L52
            r0 = 5
            goto Lac
        L52:
            int r2 = r1.setChipIconEnabled
            if (r2 != 0) goto L8f
            int r2 = r3.getTop()
            boolean r4 = r1.MenuHostHelper$$ExternalSyntheticLambda0
            if (r4 == 0) goto L70
            int r4 = r1.setNavigationOnClickListener
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.setIconTintList
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lab
            goto Lac
        L70:
            int r4 = r1.setUiOptions
            if (r2 >= r4) goto L7f
            int r4 = r1.setIconTintList
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r2 < r4) goto Lac
            goto La9
        L7f:
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.setIconTintList
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lab
            goto La9
        L8f:
            boolean r2 = r1.MenuHostHelper$$ExternalSyntheticLambda0
            if (r2 == 0) goto L94
            goto Lab
        L94:
            int r2 = r3.getTop()
            int r4 = r1.setUiOptions
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.setIconTintList
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lab
        La9:
            r0 = 6
            goto Lac
        Lab:
            r0 = 4
        Lac:
            r2 = 0
            r1.setIconTintList(r3, r0, r2)
            r1.setShrinkMotionSpec = r2
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.setX(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.setMaxEms;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.setTextAppearanceResource != 3 || super.MenuHostHelper$$ExternalSyntheticLambda1(coordinatorLayout, v, view, f, f2);
    }

    private void setNavigationOnClickListener(int i) {
        boolean z = true;
        if (i == -1) {
            if (!this.onActivityResumed) {
                this.onActivityResumed = true;
            }
            z = false;
        } else {
            if (this.onActivityResumed || this.setLayoutDirection != i) {
                this.onActivityResumed = false;
                this.setLayoutDirection = Math.max(0, i);
            }
            z = false;
        }
        if (z) {
            MenuHostHelper$$ExternalSyntheticLambda0(false);
        }
    }

    final void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        V v;
        if (this.ExtendableSavedState$1 != null) {
            setX();
            if (this.setTextAppearanceResource != 4 || (v = this.ExtendableSavedState$1.get()) == null) {
                return;
            }
            v.requestLayout();
        }
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            return this.setNavigationOnClickListener;
        }
        return Math.max(this.setConstraintSet, this.setError ? 0 : this.setTextAlignment);
    }

    public final void setX(boolean z) {
        if (this.setLayoutAnimation != z) {
            this.setLayoutAnimation = z;
            if (!z && this.setTextAppearanceResource == 5) {
                setIconTintList(4);
            }
            setUiOptions();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0426  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean setY() {
        /*
            Method dump skipped, instructions count: 1258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.setY():boolean");
    }

    public final void setIconTintList(int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.setLayoutAnimation && i == 5) {
            StringBuilder sb2 = new StringBuilder("Cannot set state: ");
            sb2.append(i);
            Log.w("BottomSheetBehavior", sb2.toString());
        } else {
            final int i2 = (i == 6 && this.MenuHostHelper$$ExternalSyntheticLambda0 && setX(i) <= this.setNavigationOnClickListener) ? 3 : i;
            WeakReference<V> weakReference = this.ExtendableSavedState$1;
            if (weakReference == null || weakReference.get() == null) {
                setY(i);
                return;
            }
            final V v = this.ExtendableSavedState$1.get();
            setIconTintList(v, new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
                @Override // java.lang.Runnable
                public final void run() {
                    BottomSheetBehavior.this.setIconTintList(v, i2, false);
                }
            });
        }
    }

    final void setY(int i) {
        V v;
        if (this.setTextAppearanceResource == i) {
            return;
        }
        this.setTextAppearanceResource = i;
        if (i == 4 || i == 3 || i == 6 || (this.setLayoutAnimation && i == 5)) {
            this.RecyclerView$SavedState$1 = i;
        }
        WeakReference<V> weakReference = this.ExtendableSavedState$1;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            setY(true);
        } else if (i == 6 || i == 5 || i == 4) {
            setY(false);
        }
        MenuHostHelper$$ExternalSyntheticLambda0(i);
        for (int i2 = 0; i2 < this.setX.size(); i2++) {
            this.setX.get(i2).MenuHostHelper$$ExternalSyntheticLambda1(v, i);
        }
        setUiOptions();
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.setFloatValues != z) {
            this.setFloatValues = z;
            if (this.ViewPager$SavedState$1 == null || (valueAnimator = this.setSelectedChildViewEnabled) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.setSelectedChildViewEnabled.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            this.setSelectedChildViewEnabled.setFloatValues(1.0f - f, f);
            this.setSelectedChildViewEnabled.start();
        }
    }

    private int setNavigationOnClickListener() {
        int i;
        if (this.onActivityResumed) {
            return Math.min(Math.max(this.getCallingPid, this.setZ - ((this.setChipSpacingVertical * 9) / 16)), this.setIconified) + this.setUnboundedRipple;
        }
        if (!this.FragmentStateAdapter$5 && !this.setOnNavigationItemSelectedListener && (i = this.setOnLongClickListener) > 0) {
            return Math.max(this.setLayoutDirection, i + this.setFilterRedundantCalls);
        }
        return this.setLayoutDirection + this.setUnboundedRipple;
    }

    private void setX() {
        int navigationOnClickListener = setNavigationOnClickListener();
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            this.setIconTintList = Math.max(this.setZ - navigationOnClickListener, this.setNavigationOnClickListener);
        } else {
            this.setIconTintList = this.setZ - navigationOnClickListener;
        }
    }

    final boolean setY(View view, float f) {
        if (this.setGuidelinePercent) {
            return true;
        }
        if (view.getTop() < this.setIconTintList) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * this.setFilterTouchesWhenObscured)) - ((float) this.setIconTintList)) / ((float) setNavigationOnClickListener()) > 0.5f;
    }

    private View setX(View view) {
        boolean navigationOnClickListener;
        if (view.getVisibility() != 0) {
            return null;
        }
        navigationOnClickListener = setBaselineAlignBottom.setUnboundedRipple.setNavigationOnClickListener(view);
        if (navigationOnClickListener) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View x = setX(viewGroup.getChildAt(i));
                if (x != null) {
                    return x;
                }
            }
        }
        return null;
    }

    private boolean setUnboundedRipple() {
        return this.setCheckedIconEnabled != null && (this.MenuHostHelper$$ExternalSyntheticLambda1 || this.setTextAppearanceResource == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r4 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r1.setX(r4.getLeft(), r0) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void setIconTintList(android.view.View r4, int r5, boolean r6) {
        /*
            r3 = this;
            int r0 = r3.setX(r5)
            o.setRowCount r1 = r3.setCheckedIconEnabled
            r2 = 0
            if (r1 == 0) goto L33
            if (r6 == 0) goto L16
            int r4 = r4.getLeft()
            boolean r4 = r1.setX(r4, r0)
            if (r4 == 0) goto L33
            goto L32
        L16:
            int r6 = r4.getLeft()
            r1.MenuHostHelper$$ExternalSyntheticLambda1 = r4
            r4 = -1
            r1.setY = r4
            boolean r4 = r1.MenuHostHelper$$ExternalSyntheticLambda0(r6, r0, r2, r2)
            if (r4 != 0) goto L30
            int r6 = r1.MenuHostHelper$$ExternalSyntheticLambda0
            if (r6 != 0) goto L30
            android.view.View r6 = r1.MenuHostHelper$$ExternalSyntheticLambda1
            if (r6 == 0) goto L30
            r6 = 0
            r1.MenuHostHelper$$ExternalSyntheticLambda1 = r6
        L30:
            if (r4 == 0) goto L33
        L32:
            r2 = 1
        L33:
            if (r2 == 0) goto L42
            r4 = 2
            r3.setY(r4)
            r3.MenuHostHelper$$ExternalSyntheticLambda0(r5)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$setIconTintList r4 = r3.setRevealInfo
            r4.setX(r5)
            return
        L42:
            r3.setY(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.setIconTintList(android.view.View, int, boolean):void");
    }

    private int setX(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return this.setUiOptions;
                    }
                    StringBuilder sb = new StringBuilder("Invalid state to get top offset: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
                return this.setZ;
            }
            return this.setIconTintList;
        }
        return MenuHostHelper$$ExternalSyntheticLambda0();
    }

    final void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        V v = this.ExtendableSavedState$1.get();
        if (v == null || this.setX.isEmpty()) {
            return;
        }
        int i2 = this.setIconTintList;
        if (i <= i2 && i2 != MenuHostHelper$$ExternalSyntheticLambda0()) {
            MenuHostHelper$$ExternalSyntheticLambda0();
        }
        for (int i3 = 0; i3 < this.setX.size(); i3++) {
            this.setX.get(i3).setX(v);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setIconTintList {
        private final Runnable MenuHostHelper$$ExternalSyntheticLambda0;
        boolean setIconTintList;
        int setY;

        private setIconTintList() {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.setIconTintList.2
                @Override // java.lang.Runnable
                public final void run() {
                    setIconTintList.this.setIconTintList = false;
                    if (BottomSheetBehavior.this.setCheckedIconEnabled != null && BottomSheetBehavior.this.setCheckedIconEnabled.MenuHostHelper$$ExternalSyntheticLambda0()) {
                        setIconTintList seticontintlist = setIconTintList.this;
                        seticontintlist.setX(seticontintlist.setY);
                    } else if (BottomSheetBehavior.this.setTextAppearanceResource == 2) {
                        BottomSheetBehavior.this.setY(setIconTintList.this.setY);
                    }
                }
            };
        }

        /* synthetic */ setIconTintList(BottomSheetBehavior bottomSheetBehavior, byte b) {
            this();
        }

        final void setX(int i) {
            if (BottomSheetBehavior.this.ExtendableSavedState$1 == null || BottomSheetBehavior.this.ExtendableSavedState$1.get() == null) {
                return;
            }
            this.setY = i;
            if (this.setIconTintList) {
                return;
            }
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(BottomSheetBehavior.this.ExtendableSavedState$1.get(), this.MenuHostHelper$$ExternalSyntheticLambda0);
            this.setIconTintList = true;
        }
    }

    public static <V extends View> BottomSheetBehavior<V> MenuHostHelper$$ExternalSyntheticLambda0(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.setIconTintList seticontintlist = ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) layoutParams).setUnboundedRipple;
        if (!(seticontintlist instanceof BottomSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        return (BottomSheetBehavior) seticontintlist;
    }

    private void setY(boolean z) {
        WeakReference<V> weakReference = this.ExtendableSavedState$1;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.setViewTranslationCallback != null) {
                    return;
                }
                this.setViewTranslationCallback = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.ExtendableSavedState$1.get() && z) {
                    this.setViewTranslationCallback.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.setViewTranslationCallback = null;
        }
    }

    private void setUiOptions() {
        V v;
        final int i;
        WeakReference<V> weakReference = this.ExtendableSavedState$1;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        setBaselineAlignBottom.setIconTintList(v, 524288);
        setBaselineAlignBottom.setIconTintList(v, 262144);
        setBaselineAlignBottom.setIconTintList(v, 1048576);
        int i2 = this.FloatingActionButton$BaseBehavior;
        if (i2 != -1) {
            setBaselineAlignBottom.setIconTintList(v, i2);
        }
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0 && this.setTextAppearanceResource != 6) {
            this.FloatingActionButton$BaseBehavior = setBaselineAlignBottom.setX(v, v.getResources().getString(R.string.res_0x7f140022), new setShowDividers() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
                @Override // o.setShowDividers
                public final boolean MenuHostHelper$$ExternalSyntheticLambda0(View view) {
                    BottomSheetBehavior.this.setIconTintList(r2);
                    return true;
                }
            });
        }
        if (this.setLayoutAnimation && this.setTextAppearanceResource != 5) {
            setBaselineAlignBottom.setX(v, setDecorPadding.setIconTintList.setUiOptions, null, new setShowDividers() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
                @Override // o.setShowDividers
                public final boolean MenuHostHelper$$ExternalSyntheticLambda0(View view) {
                    BottomSheetBehavior.this.setIconTintList(r2);
                    return true;
                }
            });
        }
        int i3 = this.setTextAppearanceResource;
        if (i3 == 3) {
            i = this.MenuHostHelper$$ExternalSyntheticLambda0 ? 4 : 6;
            setBaselineAlignBottom.setX(v, setDecorPadding.setIconTintList.setUnboundedRipple, null, new setShowDividers() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
                @Override // o.setShowDividers
                public final boolean MenuHostHelper$$ExternalSyntheticLambda0(View view) {
                    BottomSheetBehavior.this.setIconTintList(i);
                    return true;
                }
            });
        } else if (i3 == 4) {
            i = this.MenuHostHelper$$ExternalSyntheticLambda0 ? 3 : 6;
            setBaselineAlignBottom.setX(v, setDecorPadding.setIconTintList.setTextAlignment, null, new setShowDividers() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
                @Override // o.setShowDividers
                public final boolean MenuHostHelper$$ExternalSyntheticLambda0(View view) {
                    BottomSheetBehavior.this.setIconTintList(i);
                    return true;
                }
            });
        } else if (i3 == 6) {
            setBaselineAlignBottom.setX(v, setDecorPadding.setIconTintList.setUnboundedRipple, null, new setShowDividers() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
                @Override // o.setShowDividers
                public final boolean MenuHostHelper$$ExternalSyntheticLambda0(View view) {
                    BottomSheetBehavior.this.setIconTintList(i);
                    return true;
                }
            });
            setBaselineAlignBottom.setX(v, setDecorPadding.setIconTintList.setTextAlignment, null, new setShowDividers() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
                @Override // o.setShowDividers
                public final boolean MenuHostHelper$$ExternalSyntheticLambda0(View view) {
                    BottomSheetBehavior.this.setIconTintList(i);
                    return true;
                }
            });
        }
    }

    private static void setIconTintList(V v, Runnable runnable) {
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && setBaselineAlignBottom.setChipIconTintResource(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    private static void b(char[] cArr, int i, byte b, Object[] objArr) {
        int i2;
        jr jrVar = new jr();
        char[] cArr2 = FabTransformationBehavior;
        char c = '0';
        int i3 = 6;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object obj = jC.setTextScaleX.get(1058594953);
                    if (obj == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        Object[] objArr3 = new Object[1];
                        e(b2, b3, b3, objArr3);
                        obj = ((Class) jC.setY(166 - ((Process.getThreadPriority(0) + 20) >> i3), (char) (TextUtils.lastIndexOf("", c, 0, 0) + 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 20)).getMethod((String) objArr3[0], Integer.TYPE);
                        jC.setTextScaleX.put(1058594953, obj);
                    }
                    cArr3[i4] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    i4++;
                    c = '0';
                    i3 = 6;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(createDispatcher)};
            Object obj2 = jC.setTextScaleX.get(1058594953);
            if (obj2 == null) {
                byte b4 = (byte) 1;
                byte b5 = (byte) (b4 - 1);
                Object[] objArr5 = new Object[1];
                e(b4, b5, b5, objArr5);
                obj2 = ((Class) jC.setY(View.combineMeasuredStates(0, 0) + 166, (char) (ViewConfiguration.getEdgeSlop() >> 16), 19 - ((byte) KeyEvent.getModifierMetaStateMask()))).getMethod((String) objArr5[0], Integer.TYPE);
                jC.setTextScaleX.put(1058594953, obj2);
            }
            char charValue = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                jrVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
                while (jrVar.MenuHostHelper$$ExternalSyntheticLambda0 < i2) {
                    jrVar.MenuHostHelper$$ExternalSyntheticLambda1 = cArr[jrVar.MenuHostHelper$$ExternalSyntheticLambda0];
                    jrVar.setX = cArr[jrVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1];
                    if (jrVar.MenuHostHelper$$ExternalSyntheticLambda1 == jrVar.setX) {
                        cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0] = (char) (jrVar.MenuHostHelper$$ExternalSyntheticLambda1 - b);
                        cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1] = (char) (jrVar.setX - b);
                    } else {
                        try {
                            Object[] objArr6 = {jrVar, jrVar, Integer.valueOf(charValue), jrVar, jrVar, Integer.valueOf(charValue), jrVar, jrVar, Integer.valueOf(charValue), jrVar, jrVar, Integer.valueOf(charValue), jrVar};
                            Object obj3 = jC.setTextScaleX.get(23685139);
                            if (obj3 == null) {
                                byte b6 = (byte) 3;
                                byte b7 = (byte) (b6 - 3);
                                Object[] objArr7 = new Object[1];
                                e(b6, b7, b7, objArr7);
                                obj3 = ((Class) jC.setY(252 - Color.red(0), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13777), 10 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).getMethod((String) objArr7[0], Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class);
                                jC.setTextScaleX.put(23685139, obj3);
                            }
                            if (((Integer) ((Method) obj3).invoke(null, objArr6)).intValue() == jrVar.setLayoutAnimation) {
                                try {
                                    Object[] objArr8 = {jrVar, jrVar, Integer.valueOf(charValue), Integer.valueOf(charValue), jrVar, jrVar, Integer.valueOf(charValue), Integer.valueOf(charValue), jrVar, Integer.valueOf(charValue), jrVar};
                                    Object obj4 = jC.setTextScaleX.get(-1549003164);
                                    if (obj4 == null) {
                                        byte b8 = (byte) 0;
                                        byte b9 = b8;
                                        Object[] objArr9 = new Object[1];
                                        e(b8, b9, b9, objArr9);
                                        obj4 = ((Class) jC.setY(236 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4)).getMethod((String) objArr9[0], Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class);
                                        jC.setTextScaleX.put(-1549003164, obj4);
                                    }
                                    int intValue = ((Integer) ((Method) obj4).invoke(null, objArr8)).intValue();
                                    int i5 = (jrVar.setY * charValue) + jrVar.setLayoutAnimation;
                                    cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr2[intValue];
                                    cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1] = cArr2[i5];
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else if (jrVar.setIconTintList == jrVar.setY) {
                                jrVar.setOnLongClickListener = ((jrVar.setOnLongClickListener + charValue) - 1) % charValue;
                                jrVar.setLayoutAnimation = ((jrVar.setLayoutAnimation + charValue) - 1) % charValue;
                                int i6 = (jrVar.setIconTintList * charValue) + jrVar.setOnLongClickListener;
                                int i7 = (jrVar.setY * charValue) + jrVar.setLayoutAnimation;
                                cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr2[i6];
                                cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1] = cArr2[i7];
                            } else {
                                int i8 = (jrVar.setIconTintList * charValue) + jrVar.setLayoutAnimation;
                                int i9 = (jrVar.setY * charValue) + jrVar.setOnLongClickListener;
                                cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr2[i8];
                                cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1] = cArr2[i9];
                            }
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    jrVar.MenuHostHelper$$ExternalSyntheticLambda0 += 2;
                }
            }
            for (int i10 = 0; i10 < i; i10++) {
                cArr4[i10] = (char) (cArr4[i10] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }
}