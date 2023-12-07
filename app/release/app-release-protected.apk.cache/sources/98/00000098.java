package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.R;
import o.jC;
import o.jD;
import o.setBaselineAlignBottom;
import o.setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1;
import o.setCardElevation;
import o.setCounterOverflowTextColor;
import o.setDecorPadding;
import o.setEnsureMinTouchTargetSize;
import o.setFilterTouchesWhenObscured;
import o.setIconTint;
import o.setIconTintMode;
import o.setLiftOnScrollTargetViewId;
import o.setOnSystemUiVisibilityChangeListener;
import o.setOrientation;
import o.setShowDividers;
import o.setSplitBackground;
import o.setTitleMargin;
import o.setWebViewClient;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.setX {
    private static final int setLayoutAnimation;
    private static long setMinAndMaxProgress;
    public List<setIconTintList> MenuHostHelper$$ExternalSyntheticLambda0;
    int MenuHostHelper$$ExternalSyntheticLambda1;
    private int ViewPager$SavedState$1;
    private int[] setAnimationFromJson;
    private boolean setCenterIfNoTextEnabled;
    private int setCheckedIconEnabled;
    private ValueAnimator setChipCornerRadius;
    private WeakReference<View> setIconSize;
    boolean setIconTintList;
    private boolean setMaxEms;
    private Behavior setNavigationOnClickListener;
    Drawable setOnLongClickListener;
    private int setOnNavigationItemSelectedListener;
    private int setTextAlignment;
    private boolean setTextScaleX;
    private int setUnboundedRipple;
    final List<AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda0> setX;
    WindowInsetsCompat setY;
    private boolean setZ;
    public static final byte[] $$g = {61, 16, -46, 32};
    public static final int $$h = 193;
    public static final byte[] $$d = {117, -10, 119, -11, 6, -23, 35, -34, -20, -7, 18, -29, -13, -14, 32, -37, -18, -9, 57, -70, 33, 57, -59, 24, 21, -49, -32, -17, -15, 37, -47, -12, -9, 36, -37, -15, -12, 3, -21, 70, -8, -41, -59, -4, 7, -21, -4, 5, -19, 17, -46, 3, -14, 4, -5, -23, 3, -2, 15, -29, -20, 3, -10, -5, 41};
    public static final int $$e = 138;
    public static final byte[] $$a = {8, 17, -121, -18, 1, -28, 14, 1, -28, 30, -39, -25, -12, 13, -34, -18, -19, 27, -42, -23, -14, 1, -28, 15, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 35};
    public static final int $$b = 250;
    private static byte[] setGuidelinePercent = {62, -79, -77, -78, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
    public static final int setUiOptions = 123;

    /* loaded from: classes.dex */
    public interface setIconTintList<T extends AppBarLayout> {
        void setY(int i);
    }

    /* loaded from: classes.dex */
    public interface setUnboundedRipple extends setIconTintList<AppBarLayout> {
    }

    /* loaded from: classes.dex */
    public static abstract class setY {
        public abstract void MenuHostHelper$$ExternalSyntheticLambda0(AppBarLayout appBarLayout, View view, float f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0033). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r7 = 23 - r7
            int r8 = r8 * 38
            int r8 = 115 - r8
            byte[] r0 = com.google.android.material.appbar.AppBarLayout.$$a
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L33
        L18:
            r3 = 0
        L19:
            byte r4 = (byte) r8
            int r7 = r7 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L33:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-13)
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.a(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0033). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r6 = 19 - r6
            int r7 = r7 + 105
            int r8 = r8 * 3
            int r8 = 16 - r8
            byte[] r0 = com.google.android.material.appbar.AppBarLayout.setGuidelinePercent
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L18
            r7 = r6
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L33
        L18:
            r3 = 0
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L33:
            int r8 = r8 - r6
            int r6 = r8 + 2
            int r7 = r7 + 1
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.c(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r8 = 115 - r8
            byte[] r0 = com.google.android.material.appbar.AppBarLayout.$$d
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r1
            r4 = 0
            r7 = r6
            r1 = r0
            r0 = r9
            r9 = r8
            goto L37
        L17:
            r3 = 0
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            int r8 = r8 + 1
            if (r3 != r6) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2c:
            r4 = r0[r8]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L37:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-8)
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.d(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0038). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.google.android.material.appbar.AppBarLayout.$$g
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r9 = r9 * 5
            int r9 = r9 + 116
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L19
            r9 = r8
            r3 = r1
            r5 = 0
            r8 = r7
            r1 = r0
            r0 = r10
            r10 = r9
            goto L38
        L19:
            r3 = 0
            r6 = r9
            r9 = r8
            r8 = r6
        L1d:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r9) goto L2e
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2e:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r6
        L38:
            int r7 = r7 + r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.e(int, short, int, java.lang.Object[]):void");
    }

    static void setNavigationOnClickListener() {
        setMinAndMaxProgress = -9152328486260668120L;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return setIconTintList(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return setIconTintList(layoutParams);
    }

    static {
        setNavigationOnClickListener();
        setLayoutAnimation = R.style._res_0x7f150303;
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f040032);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppBarLayout(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setStatusBarForeground(Drawable drawable) {
        int x;
        Drawable drawable2 = this.setOnLongClickListener;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.setOnLongClickListener = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.setOnLongClickListener.setState(getDrawableState());
                }
                Drawable drawable3 = this.setOnLongClickListener;
                x = setBaselineAlignBottom.setX.setX(this);
                setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda0(drawable3, x);
                this.setOnLongClickListener.setVisible(getVisibility() == 0, false);
                this.setOnLongClickListener.setCallback(this);
            }
            setWillNotDraw(true ^ setIconTintList());
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(setFilterTouchesWhenObscured.setIconTintList(getContext(), i));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (setIconTintList()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.setUnboundedRipple);
            this.setOnLongClickListener.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.setOnLongClickListener;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.setOnLongClickListener;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.setOnLongClickListener;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && setBaselineAlignBottom.setTextAlignment(this) && setLayoutAnimation()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                int measuredHeight2 = getMeasuredHeight();
                WindowInsetsCompat windowInsetsCompat = this.setY;
                int uiOptions = windowInsetsCompat != null ? windowInsetsCompat.setUiOptions() : 0;
                int size = View.MeasureSpec.getSize(i2);
                int i3 = measuredHeight2 + uiOptions;
                measuredHeight = i3 < 0 ? 0 : i3 > size ? size : i3;
            } else if (mode == 0) {
                WindowInsetsCompat windowInsetsCompat2 = this.setY;
                measuredHeight += windowInsetsCompat2 != null ? windowInsetsCompat2.setUiOptions() : 0;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        setUnboundedRipple();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        boolean z3 = true;
        if (setBaselineAlignBottom.setTextAlignment(this) && setLayoutAnimation()) {
            WindowInsetsCompat windowInsetsCompat = this.setY;
            int uiOptions = windowInsetsCompat != null ? windowInsetsCompat.setUiOptions() : 0;
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                setBaselineAlignBottom.setX(getChildAt(childCount), uiOptions);
            }
        }
        setUnboundedRipple();
        this.setIconTintList = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1) getChildAt(i5).getLayoutParams()).setY != null) {
                this.setIconTintList = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.setOnLongClickListener;
        if (drawable != null) {
            int width = getWidth();
            WindowInsetsCompat windowInsetsCompat2 = this.setY;
            drawable.setBounds(0, 0, width, windowInsetsCompat2 != null ? windowInsetsCompat2.setUiOptions() : 0);
        }
        if (this.setMaxEms) {
            return;
        }
        if (!this.setCenterIfNoTextEnabled) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1) getChildAt(i6).getLayoutParams()).MenuHostHelper$$ExternalSyntheticLambda1;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    z2 = true;
                    break;
                }
                i6++;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (this.setTextScaleX != z3) {
            this.setTextScaleX = z3;
            refreshDrawableState();
        }
    }

    final boolean setIconTintList() {
        if (this.setOnLongClickListener != null) {
            WindowInsetsCompat windowInsetsCompat = this.setY;
            return (windowInsetsCompat != null ? windowInsetsCompat.setUiOptions() : 0) > 0;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setUnboundedRipple() {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.setUnboundedRipple():void");
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof setWebViewClient) {
            setWebViewClient setwebviewclient = (setWebViewClient) background;
            if (setwebviewclient.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0 != null && setwebviewclient.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList) {
                setwebviewclient.ViewPager$SavedState$1(setTitleMargin.setX(this));
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setX
    public final CoordinatorLayout.setIconTintList<AppBarLayout> setX() {
        Behavior behavior = new Behavior();
        this.setNavigationOnClickListener = behavior;
        return behavior;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof setWebViewClient) {
            ((setWebViewClient) background).setIconSize(f);
        }
    }

    public void setExpanded(boolean z) {
        setExpanded(z, setBaselineAlignBottom.setConstraintSet(this));
    }

    public void setExpanded(boolean z, boolean z2) {
        MenuHostHelper$$ExternalSyntheticLambda1(z, z2, true);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(boolean z, boolean z2, boolean z3) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1;
    }

    private static AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.setIconSize;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.setIconSize = null;
    }

    public final int setUiOptions() {
        int i = this.setCheckedIconEnabled;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1 appBarLayout$MenuHostHelper$$ExternalSyntheticLambda1 = (AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = appBarLayout$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1;
                if ((i4 & 1) == 0) {
                    break;
                }
                i2 += measuredHeight + ((ViewGroup.MarginLayoutParams) appBarLayout$MenuHostHelper$$ExternalSyntheticLambda1).topMargin + ((ViewGroup.MarginLayoutParams) appBarLayout$MenuHostHelper$$ExternalSyntheticLambda1).bottomMargin;
                if (i3 == 0 && setBaselineAlignBottom.setTextAlignment(childAt)) {
                    WindowInsetsCompat windowInsetsCompat = this.setY;
                    i2 -= windowInsetsCompat != null ? windowInsetsCompat.setUiOptions() : 0;
                }
                if ((i4 & 2) != 0) {
                    i2 -= setBaselineAlignBottom.setIconSize(childAt);
                    break;
                }
            }
            i3++;
        }
        int max = Math.max(0, i2);
        this.setCheckedIconEnabled = max;
        return max;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int setY() {
        /*
            r9 = this;
            int r0 = r9.setTextAlignment
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = 0
        Le:
            if (r0 < 0) goto L67
            android.view.View r3 = r9.getChildAt(r0)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1d
            goto L64
        L1d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1 r4 = (com.google.android.material.appbar.AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.MenuHostHelper$$ExternalSyntheticLambda1
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L62
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L3c
            int r4 = o.setBaselineAlignBottom.setIconSize(r3)
            goto L46
        L3c:
            r4 = r6 & 2
            if (r4 == 0) goto L48
            int r4 = o.setBaselineAlignBottom.setIconSize(r3)
            int r4 = r5 - r4
        L46:
            int r7 = r7 + r4
            goto L49
        L48:
            int r7 = r7 + r5
        L49:
            if (r0 != 0) goto L60
            boolean r3 = o.setBaselineAlignBottom.setTextAlignment(r3)
            if (r3 == 0) goto L60
            androidx.core.view.WindowInsetsCompat r3 = r9.setY
            if (r3 == 0) goto L5a
            int r3 = r3.setUiOptions()
            goto L5b
        L5a:
            r3 = 0
        L5b:
            int r5 = r5 - r3
            int r7 = java.lang.Math.min(r7, r5)
        L60:
            int r2 = r2 + r7
            goto L64
        L62:
            if (r2 > 0) goto L67
        L64:
            int r0 = r0 + (-1)
            goto Le
        L67:
            int r0 = java.lang.Math.max(r1, r2)
            r9.setTextAlignment = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.setY():int");
    }

    final int MenuHostHelper$$ExternalSyntheticLambda0() {
        int i = this.ViewPager$SavedState$1;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1 appBarLayout$MenuHostHelper$$ExternalSyntheticLambda1 = (AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = ((ViewGroup.MarginLayoutParams) appBarLayout$MenuHostHelper$$ExternalSyntheticLambda1).topMargin;
                int i5 = ((ViewGroup.MarginLayoutParams) appBarLayout$MenuHostHelper$$ExternalSyntheticLambda1).bottomMargin;
                int i6 = appBarLayout$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1;
                if ((i6 & 1) == 0) {
                    break;
                }
                i2 += measuredHeight + i4 + i5;
                if ((i6 & 2) != 0) {
                    i2 -= setBaselineAlignBottom.setIconSize(childAt);
                    break;
                }
            }
            i3++;
        }
        int max = Math.max(0, i2);
        this.ViewPager$SavedState$1 = max;
        return max;
    }

    final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        this.setUnboundedRipple = i;
        if (!willNotDraw()) {
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this);
        }
        List<setIconTintList> list = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                setIconTintList seticontintlist = this.MenuHostHelper$$ExternalSyntheticLambda0.get(i2);
                if (seticontintlist != null) {
                    seticontintlist.setY(i);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        if (this.setAnimationFromJson == null) {
            this.setAnimationFromJson = new int[4];
        }
        int[] iArr = this.setAnimationFromJson;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.setTextScaleX ? R.attr.res_0x7f0403ca : -2130969546;
        iArr[1] = (this.setTextScaleX && this.setZ) ? R.attr.res_0x7f0403cb : -2130969547;
        iArr[2] = this.setTextScaleX ? R.attr.res_0x7f0403c6 : -2130969542;
        iArr[3] = (this.setTextScaleX && this.setZ) ? R.attr.res_0x7f0403c5 : -2130969541;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.setMaxEms = z;
    }

    final boolean setIconTintList(boolean z) {
        if (!(!this.setMaxEms) || this.setZ == z) {
            return false;
        }
        this.setZ = z;
        refreshDrawableState();
        if (this.setCenterIfNoTextEnabled && (getBackground() instanceof setWebViewClient)) {
            final setWebViewClient setwebviewclient = (setWebViewClient) getBackground();
            float dimension = getResources().getDimension(R.dimen.res_0x7f07005e);
            float f = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.setChipCornerRadius;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
            this.setChipCornerRadius = ofFloat;
            getResources();
            ofFloat.setDuration(150L);
            this.setChipCornerRadius.setInterpolator(setCardElevation.setY);
            this.setChipCornerRadius.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    setwebviewclient.setIconSize(floatValue);
                    if (AppBarLayout.this.setOnLongClickListener instanceof setWebViewClient) {
                        ((setWebViewClient) AppBarLayout.this.setOnLongClickListener).setIconSize(floatValue);
                    }
                    for (AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda0 appBarLayout$MenuHostHelper$$ExternalSyntheticLambda0 : AppBarLayout.this.setX) {
                        int i = setwebviewclient.setContentScrimResource;
                    }
                }
            });
            this.setChipCornerRadius.start();
        }
        return true;
    }

    public void setLiftOnScroll(boolean z) {
        this.setCenterIfNoTextEnabled = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0505  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean setOnLongClickListener() {
        /*
            Method dump skipped, instructions count: 1496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.setOnLongClickListener():boolean");
    }

    public void setLiftOnScrollTargetView(View view) {
        this.setOnNavigationItemSelectedListener = -1;
        if (view != null) {
            this.setIconSize = new WeakReference<>(view);
            return;
        }
        WeakReference<View> weakReference = this.setIconSize;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.setIconSize = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.setOnNavigationItemSelectedListener = i;
        WeakReference<View> weakReference = this.setIconSize;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.setIconSize = null;
    }

    @Deprecated
    public void setTargetElevation(float f) {
        setSplitBackground.MenuHostHelper$$ExternalSyntheticLambda1(this, f);
    }

    private boolean setLayoutAnimation() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            return (childAt.getVisibility() == 8 || setBaselineAlignBottom.setTextAlignment(childAt)) ? false : true;
        }
        return false;
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ Parcelable MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.MenuHostHelper$$ExternalSyntheticLambda0(coordinatorLayout, (CoordinatorLayout) appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.MenuHostHelper$$ExternalSyntheticLambda0(coordinatorLayout, (CoordinatorLayout) appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.setX(coordinatorLayout, appBarLayout, view, i);
        }

        @Override // o.setOnSystemUiVisibilityChangeListener, androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final /* bridge */ /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.MenuHostHelper$$ExternalSyntheticLambda0(coordinatorLayout, (CoordinatorLayout) view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.MenuHostHelper$$ExternalSyntheticLambda0(coordinatorLayout, (CoordinatorLayout) appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.setX(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.MenuHostHelper$$ExternalSyntheticLambda1(coordinatorLayout, (CoordinatorLayout) appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.MenuHostHelper$$ExternalSyntheticLambda1(coordinatorLayout, (CoordinatorLayout) appBarLayout, view, view2, i, i2);
        }

        @Override // o.setImageTintList
        public final /* bridge */ /* synthetic */ int setIconTintList() {
            return super.setIconTintList();
        }

        @Override // o.setImageTintList
        public final /* bridge */ /* synthetic */ boolean setX(int i) {
            return super.setX(i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ void setY(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.MenuHostHelper$$ExternalSyntheticLambda0(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // o.setOnSystemUiVisibilityChangeListener, androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final /* bridge */ /* synthetic */ boolean setY(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.setY(coordinatorLayout, (CoordinatorLayout) view, motionEvent);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends setOnSystemUiVisibilityChangeListener<T> {
        private static short[] setCenterIfNoTextEnabled;
        int MenuHostHelper$$ExternalSyntheticLambda1;
        private ValueAnimator setNavigationOnClickListener;
        private WeakReference<View> setOnLongClickListener;
        private setX setUiOptions;
        private int setUnboundedRipple;
        setY setX;
        boolean setY;
        public static final byte[] $$g = {63, 26, 111, -17};
        public static final int $$h = 205;
        public static final byte[] $$d = {77, -56, -115, -110, -14, 15, -43, 26, 12, -1, -26, 21, 5, 6, -40, 29, 10, 1, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -49, -65, 64, 12, -65, 72, -40, -42, 79, -14, 15, -27};
        public static final int $$e = 195;
        public static final byte[] $$a = {111, -54, 77, -36, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35};
        public static final int $$b = 191;
        private static byte[] setIconSize = {105, 42, 72, -81, -17, 6, -18, -1, 2, 1, 50, -57, -16, -3, -10, 11, -13, -10, 66, -25, -48, -3, -10, 11, -23, 0, 1, -5, -13, -10, 7, -15, -9, 45, -29, -22, 7, 33, -48, 7, -5, 5, -25, 17, 47, -66, 7, -17, 3, 53, -41, -42, 2, -5, 11, -12};
        public static final int setIconTintList = 8;
        private static int ViewPager$SavedState$1 = 1437176434;
        private static int setTextAlignment = -269771505;
        private static byte[] setChipCornerRadius = {105, -107, 98, 72, -73, 105, -112, 96, -101, 71, 68, -38, 101, 32, -85, -102, -101, -100, 111, -105, 108, -89, 91, -86, 87, 84, -93, 76, -79, -96, -83, 92, 80, -86, 88, -111, 110, 97, -104, -122, 73, -105, -103, 97, -97, 103, -125, -80, -127, 44, -110, -99, -95, 88, 105, 104, 111, -100, 100, -97, 109, -108, 103, -127, 108, 104, 111, 110, -110, -67, 95, -108, -101, 97, -110, 111, Byte.MIN_VALUE, 49, 49, 49, 49};
        private static int setLayoutAnimation = -149489871;

        /* loaded from: classes.dex */
        public static abstract class setX<T extends AppBarLayout> {
        }

        private static void a(byte b, short s, short s2, Object[] objArr) {
            int i = 40 - (s * 25);
            int i2 = 17 - (b * 14);
            byte[] bArr = $$a;
            int i3 = 115 - (s2 * 38);
            byte[] bArr2 = new byte[i];
            int i4 = -1;
            int i5 = i - 1;
            if (bArr == null) {
                i3 = (i5 + i3) - 13;
                i5 = i5;
            }
            while (true) {
                i4++;
                i2++;
                bArr2[i4] = (byte) i3;
                if (i4 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i6 = i3;
                int i7 = i5;
                i3 = (i6 + bArr[i2]) - 13;
                i5 = i7;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0032). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void c(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 + 4
                int r8 = 106 - r8
                byte[] r0 = com.google.android.material.appbar.AppBarLayout.BaseBehavior.setIconSize
                int r9 = r9 * 7
                int r9 = r9 + 16
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L16
                r8 = r7
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r10
                r10 = r9
                goto L32
            L16:
                r3 = 0
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                int r7 = r7 + 1
                if (r4 != r9) goto L28
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L28:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                r10 = r9
                r9 = r6
            L32:
                int r9 = r9 - r7
                int r7 = r9 + (-4)
                r9 = r10
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r6 = r8
                r8 = r7
                r7 = r6
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.c(byte, byte, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0032). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void d(short r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                int r7 = 59 - r7
                int r8 = 40 - r8
                int r9 = r9 * 2
                int r9 = 115 - r9
                byte[] r0 = com.google.android.material.appbar.AppBarLayout.BaseBehavior.$$d
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r10
                r10 = r8
                goto L32
            L15:
                r3 = 0
                r6 = r9
                r9 = r8
                r8 = r6
            L19:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                int r7 = r7 + 1
                if (r4 != r9) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2a:
                r3 = r0[r7]
                r6 = r10
                r10 = r9
                r9 = r3
                r3 = r1
                r1 = r0
                r0 = r6
            L32:
                int r8 = r8 + r9
                r9 = r10
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.d(short, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0034). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void e(byte r7, short r8, byte r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 3
                int r7 = 3 - r7
                int r8 = r8 * 4
                int r8 = r8 + 1
                int r9 = r9 + 113
                byte[] r0 = com.google.android.material.appbar.AppBarLayout.BaseBehavior.$$g
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r1
                r5 = 0
                r1 = r0
                r0 = r10
                r10 = r8
                goto L34
            L17:
                r3 = 0
                r6 = r9
                r9 = r8
                r8 = r6
            L1b:
                int r7 = r7 + 1
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r9) goto L2c
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2c:
                r3 = r0[r7]
                r6 = r10
                r10 = r9
                r9 = r3
                r3 = r1
                r1 = r0
                r0 = r6
            L34:
                int r9 = -r9
                int r8 = r8 + r9
                r9 = r10
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r5
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.e(byte, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final /* bridge */ /* synthetic */ Parcelable MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, View view) {
            return MenuHostHelper$$ExternalSyntheticLambda0(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return MenuHostHelper$$ExternalSyntheticLambda1(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), view2, view3, i, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.setImageTintList, androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, View view, int i) {
            return MenuHostHelper$$ExternalSyntheticLambda0(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), i);
        }

        @Override // o.setOnSystemUiVisibilityChangeListener
        public final /* synthetic */ boolean setIconTintList(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference<View> weakReference = this.setOnLongClickListener;
            if (weakReference != null) {
                View view2 = weakReference.get();
                return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
            }
            return true;
        }

        @Override // o.setOnSystemUiVisibilityChangeListener
        public final /* synthetic */ int setX(View view) {
            return -((AppBarLayout) view).MenuHostHelper$$ExternalSyntheticLambda0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.setOnSystemUiVisibilityChangeListener
        public final /* synthetic */ int setX(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iconTintList = setIconTintList() + this.MenuHostHelper$$ExternalSyntheticLambda1;
            int i6 = 0;
            if (i2 == 0 || iconTintList < i2 || iconTintList > i3) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
            } else {
                if (i < i2) {
                    i = i2;
                } else if (i > i3) {
                    i = i3;
                }
                if (iconTintList != i) {
                    if (appBarLayout.setIconTintList) {
                        int abs = Math.abs(i);
                        int childCount = appBarLayout.getChildCount();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i7);
                            AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1 appBarLayout$MenuHostHelper$$ExternalSyntheticLambda1 = (AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1) childAt.getLayoutParams();
                            Interpolator interpolator = appBarLayout$MenuHostHelper$$ExternalSyntheticLambda1.setY;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i7++;
                            } else if (interpolator != null) {
                                int i8 = appBarLayout$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1;
                                if ((i8 & 1) != 0) {
                                    i5 = childAt.getHeight() + ((ViewGroup.MarginLayoutParams) appBarLayout$MenuHostHelper$$ExternalSyntheticLambda1).topMargin + ((ViewGroup.MarginLayoutParams) appBarLayout$MenuHostHelper$$ExternalSyntheticLambda1).bottomMargin + 0;
                                    if ((i8 & 2) != 0) {
                                        i5 -= setBaselineAlignBottom.setIconSize(childAt);
                                    }
                                } else {
                                    i5 = 0;
                                }
                                if (setBaselineAlignBottom.setTextAlignment(childAt)) {
                                    WindowInsetsCompat windowInsetsCompat = appBarLayout.setY;
                                    i5 -= windowInsetsCompat != null ? windowInsetsCompat.setUiOptions() : 0;
                                }
                                if (i5 > 0) {
                                    float f = i5;
                                    i4 = Integer.signum(i) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation((abs - childAt.getTop()) / f)));
                                }
                            }
                        }
                    }
                    i4 = i;
                    boolean x = setX(i4);
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = i - i4;
                    if (x) {
                        for (int i9 = 0; i9 < appBarLayout.getChildCount(); i9++) {
                            AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1 appBarLayout$MenuHostHelper$$ExternalSyntheticLambda12 = (AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1) appBarLayout.getChildAt(i9).getLayoutParams();
                            setY sety = appBarLayout$MenuHostHelper$$ExternalSyntheticLambda12.setIconTintList;
                            if (sety != null && (appBarLayout$MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda1 & 1) != 0) {
                                sety.MenuHostHelper$$ExternalSyntheticLambda0(appBarLayout, appBarLayout.getChildAt(i9), setIconTintList());
                            }
                        }
                    }
                    if (!x && appBarLayout.setIconTintList) {
                        coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda1(appBarLayout);
                    }
                    appBarLayout.MenuHostHelper$$ExternalSyntheticLambda0(setIconTintList());
                    MenuHostHelper$$ExternalSyntheticLambda1(coordinatorLayout, appBarLayout, i, i < iconTintList ? -1 : 1, false);
                    i6 = iconTintList - i;
                }
            }
            setIconTintList(coordinatorLayout, (CoordinatorLayout) appBarLayout);
            return i6;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final /* synthetic */ boolean setX(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return MenuHostHelper$$ExternalSyntheticLambda1(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), i, i2, i3, i4);
        }

        @Override // o.setOnSystemUiVisibilityChangeListener
        public final /* synthetic */ int setY(View view) {
            return ((AppBarLayout) view).setUiOptions();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.setOnSystemUiVisibilityChangeListener
        public final /* synthetic */ void setY(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            setX(coordinatorLayout, appBarLayout);
            if (appBarLayout.setOnLongClickListener()) {
                appBarLayout.setIconTintList(appBarLayout.MenuHostHelper$$ExternalSyntheticLambda0(setX(coordinatorLayout)));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final /* synthetic */ void setY(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            MenuHostHelper$$ExternalSyntheticLambda0(coordinatorLayout, (CoordinatorLayout) ((AppBarLayout) view), parcelable);
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.setOnLongClickListener() || setX(coordinatorLayout, (CoordinatorLayout) t, view));
            if (z && (valueAnimator = this.setNavigationOnClickListener) != null) {
                valueAnimator.cancel();
            }
            this.setOnLongClickListener = null;
            this.setUnboundedRipple = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        /* renamed from: setY */
        public void MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.setUiOptions();
                    i4 = i6;
                    i5 = t.setY() + i6;
                } else {
                    i4 = -t.setUiOptions();
                    i5 = 0;
                }
                if (i4 != i5) {
                    iArr[1] = setX(coordinatorLayout, t, setX() - i2, i4, i5);
                }
            }
            if (t.setOnLongClickListener()) {
                t.setIconTintList(t.MenuHostHelper$$ExternalSyntheticLambda0(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        /* renamed from: MenuHostHelper$$ExternalSyntheticLambda1 */
        public void setX(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = setX(coordinatorLayout, t, setX() - i4, -t.MenuHostHelper$$ExternalSyntheticLambda0(), 0);
            }
            if (i4 == 0) {
                setIconTintList(coordinatorLayout, (CoordinatorLayout) t);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        /* renamed from: MenuHostHelper$$ExternalSyntheticLambda0 */
        public void setX(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.setUnboundedRipple == 0 || i == 1) {
                setX(coordinatorLayout, t);
                if (t.setOnLongClickListener()) {
                    t.setIconTintList(t.MenuHostHelper$$ExternalSyntheticLambda0(view));
                }
            }
            this.setOnLongClickListener = new WeakReference<>(view);
        }

        public boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.LayoutParams) ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) t.getLayoutParams())).height == -2) {
                coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda0(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
                return true;
            }
            return super.setX(coordinatorLayout, t, i, i2, i3, i4);
        }

        public boolean MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, T t, int i) {
            int round;
            boolean MenuHostHelper$$ExternalSyntheticLambda1 = super.MenuHostHelper$$ExternalSyntheticLambda1(coordinatorLayout, (CoordinatorLayout) t, i);
            int i2 = t.MenuHostHelper$$ExternalSyntheticLambda1;
            setY sety = this.setX;
            if (sety == null || (i2 & 8) != 0) {
                if (i2 != 0) {
                    boolean z = (i2 & 4) != 0;
                    if ((i2 & 2) != 0) {
                        int i3 = -t.setUiOptions();
                        if (z) {
                            MenuHostHelper$$ExternalSyntheticLambda1(coordinatorLayout, (CoordinatorLayout) t, i3);
                        } else {
                            setX(coordinatorLayout, t, i3, Integer.MIN_VALUE, Integer.MAX_VALUE);
                        }
                    } else if ((i2 & 1) != 0) {
                        if (z) {
                            MenuHostHelper$$ExternalSyntheticLambda1(coordinatorLayout, (CoordinatorLayout) t, 0);
                        } else {
                            setX(coordinatorLayout, t, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
                        }
                    }
                }
            } else if (!sety.setLayoutAnimation) {
                if (!this.setX.setY) {
                    View childAt = t.getChildAt(this.setX.setX);
                    int i4 = -childAt.getBottom();
                    if (this.setX.MenuHostHelper$$ExternalSyntheticLambda1) {
                        int iconSize = setBaselineAlignBottom.setIconSize(childAt);
                        WindowInsetsCompat windowInsetsCompat = t.setY;
                        round = iconSize + (windowInsetsCompat != null ? windowInsetsCompat.setUiOptions() : 0);
                    } else {
                        round = Math.round(childAt.getHeight() * this.setX.MenuHostHelper$$ExternalSyntheticLambda0);
                    }
                    setX(coordinatorLayout, t, i4 + round, Integer.MIN_VALUE, Integer.MAX_VALUE);
                } else {
                    setX(coordinatorLayout, t, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
                }
            } else {
                setX(coordinatorLayout, t, -t.setUiOptions(), Integer.MIN_VALUE, Integer.MAX_VALUE);
            }
            t.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
            this.setX = null;
            int iconTintList = setIconTintList();
            int i5 = -t.setUiOptions();
            if (iconTintList < i5) {
                iconTintList = i5;
            } else if (iconTintList > 0) {
                iconTintList = 0;
            }
            setX(iconTintList);
            MenuHostHelper$$ExternalSyntheticLambda1(coordinatorLayout, (AppBarLayout) t, setIconTintList(), 0, true);
            t.MenuHostHelper$$ExternalSyntheticLambda0(setIconTintList());
            setIconTintList(coordinatorLayout, (CoordinatorLayout) t);
            return MenuHostHelper$$ExternalSyntheticLambda1;
        }

        private void setIconTintList(final CoordinatorLayout coordinatorLayout, final T t) {
            final View view;
            boolean z;
            boolean z2;
            setBaselineAlignBottom.setIconTintList(coordinatorLayout, setDecorPadding.setIconTintList.SearchView$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0());
            setBaselineAlignBottom.setIconTintList(coordinatorLayout, setDecorPadding.setIconTintList.setHasDecor.MenuHostHelper$$ExternalSyntheticLambda0());
            if (t.setUiOptions() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            boolean z3 = false;
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    view = null;
                    break;
                }
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) childAt.getLayoutParams()).setUnboundedRipple instanceof ScrollingViewBehavior) {
                    view = childAt;
                    break;
                }
                i++;
            }
            if (view == null) {
                return;
            }
            int childCount2 = t.getChildCount();
            int i2 = 0;
            while (true) {
                z = true;
                if (i2 >= childCount2) {
                    z2 = false;
                    break;
                } else if (((AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1) t.getChildAt(i2).getLayoutParams()).MenuHostHelper$$ExternalSyntheticLambda1 != 0) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                if (!setBaselineAlignBottom.setCheckedIconEnabled(coordinatorLayout)) {
                    setBaselineAlignBottom.setX(coordinatorLayout, new setCounterOverflowTextColor() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.1
                        @Override // o.setCounterOverflowTextColor
                        public final void setY(View view2, setDecorPadding setdecorpadding) {
                            super.setY(view2, setdecorpadding);
                            setdecorpadding.setIconSize(BaseBehavior.this.setY);
                            setdecorpadding.setIconTintList(ScrollView.class.getName());
                        }
                    });
                }
                if (setIconTintList() + this.MenuHostHelper$$ExternalSyntheticLambda1 != (-t.setUiOptions())) {
                    setBaselineAlignBottom.setX(coordinatorLayout, setDecorPadding.setIconTintList.SearchView$SavedState$1, null, new setShowDividers() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.2
                        @Override // o.setShowDividers
                        public final boolean MenuHostHelper$$ExternalSyntheticLambda0(View view2) {
                            t.setExpanded(r3);
                            return true;
                        }
                    });
                    z3 = true;
                }
                if (setIconTintList() + this.MenuHostHelper$$ExternalSyntheticLambda1 != 0) {
                    if (view.canScrollVertically(-1)) {
                        final int i3 = -t.setY();
                        if (i3 != 0) {
                            setBaselineAlignBottom.setX(coordinatorLayout, setDecorPadding.setIconTintList.setHasDecor, null, new setShowDividers() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.5
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // o.setShowDividers
                                public final boolean MenuHostHelper$$ExternalSyntheticLambda0(View view2) {
                                    BaseBehavior.this.MenuHostHelper$$ExternalSyntheticLambda0(coordinatorLayout, t, view, 0, i3, new int[]{0, 0}, 1);
                                    return true;
                                }
                            });
                        }
                    } else {
                        setBaselineAlignBottom.setX(coordinatorLayout, setDecorPadding.setIconTintList.setHasDecor, null, new setShowDividers() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.2
                            @Override // o.setShowDividers
                            public final boolean MenuHostHelper$$ExternalSyntheticLambda0(View view2) {
                                t.setExpanded(r3);
                                return true;
                            }
                        });
                    }
                    this.setY = z;
                }
                z = z3;
                this.setY = z;
            }
        }

        private static View setX(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof setLiftOnScrollTargetViewId) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // o.setOnSystemUiVisibilityChangeListener
        public final int setX() {
            return setIconTintList() + this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        public Parcelable MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable MenuHostHelper$$ExternalSyntheticLambda0 = super.MenuHostHelper$$ExternalSyntheticLambda0(coordinatorLayout, (CoordinatorLayout) t);
            setY MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0, (Parcelable) t);
            return MenuHostHelper$$ExternalSyntheticLambda02 != null ? MenuHostHelper$$ExternalSyntheticLambda02 : MenuHostHelper$$ExternalSyntheticLambda0;
        }

        public void MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof setY) {
                setY sety = (setY) parcelable;
                this.setX = sety;
                super.setY(coordinatorLayout, (CoordinatorLayout) t, sety.setUiOptions);
                return;
            }
            super.setY(coordinatorLayout, (CoordinatorLayout) t, parcelable);
            this.setX = null;
        }

        final setY MenuHostHelper$$ExternalSyntheticLambda0(Parcelable parcelable, T t) {
            int iconTintList = setIconTintList();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + iconTintList;
                if (childAt.getTop() + iconTintList <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = setOrientation.setIconTintList;
                    }
                    setY sety = new setY(parcelable);
                    sety.setY = iconTintList == 0;
                    sety.setLayoutAnimation = !sety.setY && (-iconTintList) >= t.setUiOptions();
                    sety.setX = i;
                    int iconSize = setBaselineAlignBottom.setIconSize(childAt);
                    WindowInsetsCompat windowInsetsCompat = t.setY;
                    sety.MenuHostHelper$$ExternalSyntheticLambda1 = bottom == iconSize + (windowInsetsCompat != null ? windowInsetsCompat.setUiOptions() : 0);
                    sety.MenuHostHelper$$ExternalSyntheticLambda0 = bottom / childAt.getHeight();
                    return sety;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* loaded from: classes.dex */
        public static class setY extends setOrientation {
            public static final Parcelable.Creator<setY> CREATOR = new Parcelable.ClassLoaderCreator<setY>() { // from class: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$1
                @Override // android.os.Parcelable.Creator
                public /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new AppBarLayout.BaseBehavior.setY(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public /* synthetic */ AppBarLayout.BaseBehavior.setY createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new AppBarLayout.BaseBehavior.setY(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new AppBarLayout.BaseBehavior.setY[i];
                }
            };
            float MenuHostHelper$$ExternalSyntheticLambda0;
            boolean MenuHostHelper$$ExternalSyntheticLambda1;
            boolean setLayoutAnimation;
            int setX;
            boolean setY;

            public setY(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.setLayoutAnimation = parcel.readByte() != 0;
                this.setY = parcel.readByte() != 0;
                this.setX = parcel.readInt();
                this.MenuHostHelper$$ExternalSyntheticLambda0 = parcel.readFloat();
                this.MenuHostHelper$$ExternalSyntheticLambda1 = parcel.readByte() != 0;
            }

            public setY(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // o.setOrientation, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.setLayoutAnimation ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.setY ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.setX);
                parcel.writeFloat(this.MenuHostHelper$$ExternalSyntheticLambda0);
                parcel.writeByte(this.MenuHostHelper$$ExternalSyntheticLambda1 ? (byte) 1 : (byte) 0);
            }
        }

        private void MenuHostHelper$$ExternalSyntheticLambda1(final CoordinatorLayout coordinatorLayout, final T t, int i) {
            int height;
            int abs = Math.abs((setIconTintList() + this.MenuHostHelper$$ExternalSyntheticLambda1) - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t.getHeight()) + 1.0f) * 150.0f);
            }
            int iconTintList = setIconTintList() + this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (iconTintList == i) {
                ValueAnimator valueAnimator = this.setNavigationOnClickListener;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.setNavigationOnClickListener.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.setNavigationOnClickListener;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.setNavigationOnClickListener = valueAnimator3;
                valueAnimator3.setInterpolator(setCardElevation.setIconTintList);
                this.setNavigationOnClickListener.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.4
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        BaseBehavior.this.setX(coordinatorLayout, t, ((Integer) valueAnimator4.getAnimatedValue()).intValue(), Integer.MIN_VALUE, Integer.MAX_VALUE);
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.setNavigationOnClickListener.setDuration(Math.min(height, 600));
            this.setNavigationOnClickListener.setIntValues(iconTintList, i);
            this.setNavigationOnClickListener.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x036e  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x04b4  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x04b6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private boolean setX(androidx.coordinatorlayout.widget.CoordinatorLayout r30, T r31, android.view.View r32) {
            /*
                Method dump skipped, instructions count: 1233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.setX(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View):boolean");
        }

        private void setX(CoordinatorLayout coordinatorLayout, T t) {
            WindowInsetsCompat windowInsetsCompat = t.setY;
            int i = 0;
            int uiOptions = (windowInsetsCompat != null ? windowInsetsCompat.setUiOptions() : 0) + t.getPaddingTop();
            int iconTintList = (setIconTintList() + this.MenuHostHelper$$ExternalSyntheticLambda1) - uiOptions;
            int childCount = t.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    i2 = -1;
                    break;
                }
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1 appBarLayout$MenuHostHelper$$ExternalSyntheticLambda1 = (AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1) childAt.getLayoutParams();
                if ((appBarLayout$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1 & 32) == 32) {
                    top -= ((ViewGroup.MarginLayoutParams) appBarLayout$MenuHostHelper$$ExternalSyntheticLambda1).topMargin;
                    bottom += ((ViewGroup.MarginLayoutParams) appBarLayout$MenuHostHelper$$ExternalSyntheticLambda1).bottomMargin;
                }
                int i3 = -iconTintList;
                if (top <= i3 && bottom >= i3) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                View childAt2 = t.getChildAt(i2);
                AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1 appBarLayout$MenuHostHelper$$ExternalSyntheticLambda12 = (AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1) childAt2.getLayoutParams();
                int i4 = appBarLayout$MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda1;
                if ((i4 & 17) == 17) {
                    int i5 = -childAt2.getTop();
                    int i6 = -childAt2.getBottom();
                    if (i2 == 0 && setBaselineAlignBottom.setTextAlignment(t) && setBaselineAlignBottom.setTextAlignment(childAt2)) {
                        WindowInsetsCompat windowInsetsCompat2 = t.setY;
                        i5 -= windowInsetsCompat2 != null ? windowInsetsCompat2.setUiOptions() : 0;
                    }
                    if ((i4 & 2) == 2) {
                        i6 += setBaselineAlignBottom.setIconSize(childAt2);
                    } else {
                        if ((i4 & 5) == 5) {
                            int iconSize = setBaselineAlignBottom.setIconSize(childAt2) + i6;
                            if (iconTintList < iconSize) {
                                i5 = iconSize;
                            } else {
                                i6 = iconSize;
                            }
                        }
                    }
                    if ((i4 & 32) == 32) {
                        i5 += ((ViewGroup.MarginLayoutParams) appBarLayout$MenuHostHelper$$ExternalSyntheticLambda12).topMargin;
                        i6 -= ((ViewGroup.MarginLayoutParams) appBarLayout$MenuHostHelper$$ExternalSyntheticLambda12).bottomMargin;
                    }
                    if (iconTintList < (i6 + i5) / 2) {
                        i5 = i6;
                    }
                    int i7 = i5 + uiOptions;
                    int i8 = -t.setUiOptions();
                    if (i7 < i8) {
                        i = i8;
                    } else if (i7 <= 0) {
                        i = i7;
                    }
                    MenuHostHelper$$ExternalSyntheticLambda1(coordinatorLayout, (CoordinatorLayout) t, i);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
            if (r8 >= (r9 - (r1 != null ? r1.setUiOptions() : 0))) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
            if (r8 < (r9 - (r1 != null ? r1.setUiOptions() : 0))) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
            r8 = true;
         */
        /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void MenuHostHelper$$ExternalSyntheticLambda1(androidx.coordinatorlayout.widget.CoordinatorLayout r6, T r7, int r8, int r9, boolean r10) {
            /*
                int r0 = java.lang.Math.abs(r8)
                int r1 = r7.getChildCount()
                r2 = 0
                r3 = 0
            La:
                if (r3 >= r1) goto L20
                android.view.View r4 = r7.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L1d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L1d
                goto L21
            L1d:
                int r3 = r3 + 1
                goto La
            L20:
                r4 = 0
            L21:
                r0 = 1
                if (r4 == 0) goto L68
                android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1 r1 = (com.google.android.material.appbar.AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1) r1
                int r1 = r1.MenuHostHelper$$ExternalSyntheticLambda1
                r3 = r1 & 1
                if (r3 == 0) goto L68
                int r3 = o.setBaselineAlignBottom.setIconSize(r4)
                if (r9 <= 0) goto L4e
                r9 = r1 & 12
                if (r9 == 0) goto L4e
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r3
                androidx.core.view.WindowInsetsCompat r1 = r7.setY
                if (r1 == 0) goto L49
                int r1 = r1.setUiOptions()
                goto L4a
            L49:
                r1 = 0
            L4a:
                int r9 = r9 - r1
                if (r8 < r9) goto L68
                goto L66
            L4e:
                r9 = r1 & 2
                if (r9 == 0) goto L68
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r3
                androidx.core.view.WindowInsetsCompat r1 = r7.setY
                if (r1 == 0) goto L61
                int r1 = r1.setUiOptions()
                goto L62
            L61:
                r1 = 0
            L62:
                int r9 = r9 - r1
                if (r8 >= r9) goto L66
                goto L68
            L66:
                r8 = 1
                goto L69
            L68:
                r8 = 0
            L69:
                boolean r9 = r7.setOnLongClickListener()
                if (r9 == 0) goto L77
                android.view.View r8 = setX(r6)
                boolean r8 = r7.MenuHostHelper$$ExternalSyntheticLambda0(r8)
            L77:
                boolean r8 = r7.setIconTintList(r8)
                if (r10 != 0) goto La9
                if (r8 == 0) goto Lac
                java.util.List r6 = r6.setIconTintList(r7)
                int r8 = r6.size()
                r9 = 0
            L88:
                if (r9 >= r8) goto La7
                java.lang.Object r10 = r6.get(r9)
                android.view.View r10 = (android.view.View) r10
                android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) r10
                androidx.coordinatorlayout.widget.CoordinatorLayout$setIconTintList r10 = r10.setUnboundedRipple
                boolean r1 = r10 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto La4
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r10 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r10
                int r6 = r10.setX
                if (r6 == 0) goto La7
                r2 = 1
                goto La7
            La4:
                int r9 = r9 + 1
                goto L88
            La7:
                if (r2 == 0) goto Lac
            La9:
                r7.jumpDrawablesToCurrentState()
            Lac:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.MenuHostHelper$$ExternalSyntheticLambda1(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x01c3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void b(short r19, int r20, int r21, int r22, byte r23, java.lang.Object[] r24) {
            /*
                Method dump skipped, instructions count: 743
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.b(short, int, int, int, byte, java.lang.Object[]):void");
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends setIconTintMode {
        @Override // o.setImageTintList, androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final /* bridge */ /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.MenuHostHelper$$ExternalSyntheticLambda1(coordinatorLayout, (CoordinatorLayout) view, i);
        }

        @Override // o.setImageTintList
        public final /* bridge */ /* synthetic */ int setIconTintList() {
            return super.setIconTintList();
        }

        @Override // o.setImageTintList
        public final /* bridge */ /* synthetic */ boolean setX(int i) {
            return super.setX(i);
        }

        @Override // o.setIconTintMode, androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final /* bridge */ /* synthetic */ boolean setX(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.setX(coordinatorLayout, view, i, i2, i3, i4);
        }

        @Override // o.setIconTintMode
        public final /* synthetic */ View setY(List list) {
            return MenuHostHelper$$ExternalSyntheticLambda1(list);
        }

        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setIconTint.setIconTintList.FragmentStateAdapter$2);
            ((setIconTintMode) this).setX = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final boolean setIconTintList(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final void MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                setBaselineAlignBottom.setIconTintList(coordinatorLayout, setDecorPadding.setIconTintList.SearchView$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0());
                setBaselineAlignBottom.setIconTintList(coordinatorLayout, setDecorPadding.setIconTintList.setHasDecor.MenuHostHelper$$ExternalSyntheticLambda0());
                setBaselineAlignBottom.setX(coordinatorLayout, (setCounterOverflowTextColor) null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final boolean setX(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda0(view));
            if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.setIconTintList;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    MenuHostHelper$$ExternalSyntheticLambda1.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // o.setIconTintMode
        public final float setIconTintList(View view) {
            int i;
            int i2;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int uiOptions = appBarLayout.setUiOptions();
                int y = appBarLayout.setY();
                CoordinatorLayout.setIconTintList seticontintlist = ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) appBarLayout.getLayoutParams()).setUnboundedRipple;
                if (seticontintlist instanceof BaseBehavior) {
                    BaseBehavior baseBehavior = (BaseBehavior) seticontintlist;
                    i = baseBehavior.setIconTintList() + baseBehavior.MenuHostHelper$$ExternalSyntheticLambda1;
                } else {
                    i = 0;
                }
                if ((y == 0 || uiOptions + i > y) && (i2 = uiOptions - y) != 0) {
                    return (i / i2) + 1.0f;
                }
            }
            return 0.0f;
        }

        private static AppBarLayout MenuHostHelper$$ExternalSyntheticLambda1(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // o.setIconTintMode
        public final int setX(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).setUiOptions();
            }
            return super.setX(view);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
        public final boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.setIconTintList seticontintlist = ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view2.getLayoutParams()).setUnboundedRipple;
            if (seticontintlist instanceof BaseBehavior) {
                int bottom = view2.getBottom();
                int top = view.getTop();
                int i = ((BaseBehavior) seticontintlist).MenuHostHelper$$ExternalSyntheticLambda1;
                setBaselineAlignBottom.setX(view, (((bottom - top) + i) + setX()) - MenuHostHelper$$ExternalSyntheticLambda0(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.setOnLongClickListener()) {
                    appBarLayout.setIconTintList(appBarLayout.MenuHostHelper$$ExternalSyntheticLambda0(view));
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class setX extends setY {
        private final Rect MenuHostHelper$$ExternalSyntheticLambda0 = new Rect();
        private final Rect setX = new Rect();

        @Override // com.google.android.material.appbar.AppBarLayout.setY
        public final void MenuHostHelper$$ExternalSyntheticLambda0(AppBarLayout appBarLayout, View view, float f) {
            Rect rect = this.MenuHostHelper$$ExternalSyntheticLambda0;
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            WindowInsetsCompat windowInsetsCompat = appBarLayout.setY;
            rect.offset(0, -(windowInsetsCompat != null ? windowInsetsCompat.setUiOptions() : 0));
            float abs = this.MenuHostHelper$$ExternalSyntheticLambda0.top - Math.abs(f);
            if (abs <= 0.0f) {
                float abs2 = Math.abs(abs / this.MenuHostHelper$$ExternalSyntheticLambda0.height());
                float f2 = 1.0f - (abs2 >= 0.0f ? abs2 > 1.0f ? 1.0f : abs2 : 0.0f);
                float height = (-abs) - ((this.MenuHostHelper$$ExternalSyntheticLambda0.height() * 0.3f) * (1.0f - (f2 * f2)));
                view.setTranslationY(height);
                view.getDrawingRect(this.setX);
                this.setX.offset(0, (int) (-height));
                view.setClipBounds(this.setX);
                return;
            }
            view.setClipBounds(null);
            view.setTranslationY(0.0f);
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(setUnboundedRipple setunboundedripple) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList();
        }
        if (setunboundedripple == null || this.MenuHostHelper$$ExternalSyntheticLambda0.contains(setunboundedripple)) {
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.add(setunboundedripple);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AppBarLayout$MenuHostHelper$$ExternalSyntheticLambda1(getContext(), attributeSet);
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
        WindowInsetsCompat windowInsetsCompat = this.setY;
        int uiOptions = windowInsetsCompat != null ? windowInsetsCompat.setUiOptions() : 0;
        int iconSize = setBaselineAlignBottom.setIconSize(this);
        if (iconSize == 0) {
            int childCount = getChildCount();
            int iconSize2 = childCount > 0 ? setBaselineAlignBottom.setIconSize(getChildAt(childCount - 1)) : 0;
            if (iconSize2 == 0) {
                return getHeight() / 3;
            }
            iconSize = iconSize2;
        }
        return (iconSize << 1) + uiOptions;
    }

    final boolean MenuHostHelper$$ExternalSyntheticLambda0(View view) {
        int i;
        if (this.setIconSize == null && (i = this.setOnNavigationItemSelectedListener) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.setOnNavigationItemSelectedListener);
            }
            if (findViewById != null) {
                this.setIconSize = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.setIconSize;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    private static void b(int i, char[] cArr, Object[] objArr) {
        jD jDVar = new jD();
        char[] MenuHostHelper$$ExternalSyntheticLambda0 = jD.MenuHostHelper$$ExternalSyntheticLambda0(setMinAndMaxProgress ^ 2449010268519698653L, cArr, i);
        int i2 = 4;
        jDVar.setIconTintList = 4;
        while (jDVar.setIconTintList < MenuHostHelper$$ExternalSyntheticLambda0.length) {
            jDVar.setX = jDVar.setIconTintList - i2;
            int i3 = jDVar.setIconTintList;
            try {
                Object[] objArr2 = {Long.valueOf(MenuHostHelper$$ExternalSyntheticLambda0[jDVar.setIconTintList] ^ MenuHostHelper$$ExternalSyntheticLambda0[jDVar.setIconTintList % i2]), Long.valueOf(jDVar.setX), Long.valueOf(setMinAndMaxProgress)};
                Object obj = jC.setTextScaleX.get(-244088302);
                if (obj == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    Object[] objArr3 = new Object[1];
                    e(b, b2, b2, objArr3);
                    obj = ((Class) jC.setY((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 276, (char) (TextUtils.getOffsetAfter("", 0) + 42263), 4 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod((String) objArr3[0], Long.TYPE, Long.TYPE, Long.TYPE);
                    jC.setTextScaleX.put(-244088302, obj);
                }
                MenuHostHelper$$ExternalSyntheticLambda0[i3] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr4 = {jDVar, jDVar};
                    Object obj2 = jC.setTextScaleX.get(467845792);
                    if (obj2 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        Object[] objArr5 = new Object[1];
                        e(b3, b4, (byte) (b4 + 1), objArr5);
                        obj2 = ((Class) jC.setY(306 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 36290), ExpandableListView.getPackedPositionGroup(0L) + 4)).getMethod((String) objArr5[0], Object.class, Object.class);
                        jC.setTextScaleX.put(467845792, obj2);
                    }
                    ((Method) obj2).invoke(null, objArr4);
                    i2 = 4;
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
        objArr[0] = new String(MenuHostHelper$$ExternalSyntheticLambda0, 4, MenuHostHelper$$ExternalSyntheticLambda0.length - 4);
    }
}