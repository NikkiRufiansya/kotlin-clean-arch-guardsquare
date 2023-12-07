package o;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import o.FirebaseInitProvider;
import o.setBaselineAlignBottom;
import o.setTransitionAlpha;

/* loaded from: classes.dex */
public final class StaggeredGridLayoutManager {
    private static long setCallingWorkSourceUid;
    private float ActionMenuPresenter$SavedState$1;
    private float FabTransformationBehavior;
    private float FirebaseRemoteConfigKtxRegistrar;
    private setTransitionAlpha FloatingActionButton$BaseBehavior;
    private float Fragment$5;
    private float FragmentStateAdapter$2;
    private float FragmentStateAdapter$5;
    public float MenuHostHelper$$ExternalSyntheticLambda0;
    private final RectF RecyclerView$SavedState$1;
    private final TextPaint RemoteActionCompatParcelizer;
    public final TextPaint SearchView$SavedState$1;
    private CharSequence TextInputLayout$SavedState$1;
    public Typeface ViewPager$SavedState$1;
    private float createDispatcher;
    private float getCallingPid;
    private final View minusKey;
    private final Rect onActivityResumed;
    public TimeInterpolator setAnimationFromJson;
    private StaticLayout setBackgroundTintMode;
    public float setCenterIfNoTextEnabled;
    public TimeInterpolator setCheckedIconEnabled;
    public float setChipCornerRadius;
    private float setChipIconEnabled;
    private CharSequence setChipIconEnabledResource;
    private float setChipIconTintResource;
    private float setChipSpacingHorizontal;
    private float setChipSpacingVertical;
    private setTransitionAlpha setCloseIconEndPadding;
    private float setConstraintSet;
    private ColorStateList setContentScrimResource;
    private Typeface setEmptyView;
    private float setError;
    private boolean setErrorIconTintList;
    private float setFilterRedundantCalls;
    private float setFilterTouchesWhenObscured;
    private Typeface setFloatValues;
    private final Rect setHasDecor;
    private float setHint;
    public boolean setIconSize;
    public ColorStateList setIconTintList;
    private boolean setIconified;
    private Typeface setImageTintMode;
    public getTrimPathEnd setLayoutDirection;
    private Typeface setLineBreakStyle;
    public CharSequence setMinAndMaxProgress;
    private float setNavigationIconTint;
    public ColorStateList setNavigationOnClickListener;
    private float setObjectValues;
    public Bitmap setOnLongClickListener;
    private ColorStateList setRevealInfo;
    private Typeface setSelectedChildViewEnabled;
    private int setShrinkMotionSpec;
    private boolean setSubmitButtonEnabled;
    private float setSuffixText;
    public int[] setTextAppearanceResource;
    private float setTitleMarginEnd;
    private Typeface setTooltipText;
    public int setUnboundedRipple;
    private float setViewTranslationCallback;
    public float setX;
    public int setY;
    public static final byte[] $$g = {56, 110, 47, 101};
    public static final int $$h = 58;
    public static final byte[] $$d = {84, -107, -124, 66, -65, 65, 1, -14, 15, -28, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -49, -65, 72, -40, -42, 79, -14, 15, -27};
    public static final int $$e = 216;
    public static final byte[] $$a = {113, -101, 105, 26, 1, -28, 30, -39, -25, -12, 13, -34, -18, -19, 27, -42, -23, -14, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 35};
    public static final int $$b = 7;
    private static byte[] setEdgeEffectFactory = {64, 34, -50, 73, 17, -6, 18, 1, -2, -1, -50, 57, 16, 3, 10, -11, 13, 10, -66, 25, 48, 3, 10, -11, 23, 0, -1, 5, 13, 10, -7, 15, 9, -45, 29, 22, -7, -33, 48, -7, 5, -5, 25, -17, -47, 66, -7, 17, -3, -53, 41, 42, -2, 5, -11, 12};
    public static final int ExtendableSavedState$1 = 247;
    public int setUiOptions = 16;
    public int MenuHostHelper$$ExternalSyntheticLambda1 = 16;
    public float setLayoutAnimation = 15.0f;
    private float setAdapter = 15.0f;
    public TextUtils.TruncateAt setGuidelinePercent = TextUtils.TruncateAt.END;
    public boolean setOnNavigationItemSelectedListener = true;
    public int setMaxEms = 1;
    public float setZ = 0.0f;
    public float setTextScaleX = 1.0f;
    public int setTextAlignment = FirebaseInitProvider.MenuHostHelper$$ExternalSyntheticLambda0;

    static {
        setIconTintList();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0035). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 38
            int r6 = 115 - r6
            int r8 = r8 + 4
            int r7 = r7 * 25
            int r7 = 40 - r7
            byte[] r0 = o.StaggeredGridLayoutManager.$$a
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L35
        L19:
            r3 = 0
        L1a:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L35:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-13)
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.StaggeredGridLayoutManager.a(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = o.StaggeredGridLayoutManager.setEdgeEffectFactory
            int r7 = 106 - r7
            int r6 = r6 * 7
            int r6 = r6 + 16
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L18
            r7 = r6
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L37
        L18:
            r3 = 0
            r5 = r8
            r8 = r7
        L1b:
            r7 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L2d
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2d:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L37:
            int r9 = r9 + r6
            int r6 = r9 + (-4)
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.StaggeredGridLayoutManager.c(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 40 - r8
            int r6 = r6 * 3
            int r6 = 49 - r6
            byte[] r0 = o.StaggeredGridLayoutManager.$$d
            int r7 = r7 * 2
            int r7 = r7 + 77
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r7
            r3 = 0
            r7 = r6
            goto L2c
        L17:
            r3 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2c:
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.StaggeredGridLayoutManager.d(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 5
            int r6 = r6 + 107
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r0 = o.StaggeredGridLayoutManager.$$g
            int r5 = r5 * 3
            int r5 = r5 + 4
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r6
            r3 = 0
            r6 = r5
            goto L2b
        L19:
            r3 = 0
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r0[r5]
            int r3 = r3 + 1
        L2b:
            int r4 = -r4
            int r5 = r5 + 1
            int r6 = r6 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.StaggeredGridLayoutManager.e(int, short, short, java.lang.Object[]):void");
    }

    static void setIconTintList() {
        setCallingWorkSourceUid = 7974823485142730074L;
    }

    public StaggeredGridLayoutManager(View view) {
        this.minusKey = view;
        TextPaint textPaint = new TextPaint(129);
        this.RemoteActionCompatParcelizer = textPaint;
        this.SearchView$SavedState$1 = new TextPaint(textPaint);
        this.setHasDecor = new Rect();
        this.onActivityResumed = new Rect();
        this.RecyclerView$SavedState$1 = new RectF();
        float f = this.setChipCornerRadius;
        this.setCenterIfNoTextEnabled = f + ((1.0f - f) * 0.5f);
        setIconTintList(view.getContext().getResources().getConfiguration());
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2, int i3, int i4) {
        if (MenuHostHelper$$ExternalSyntheticLambda0(this.onActivityResumed, i, i2, i3, i4)) {
            return;
        }
        this.onActivityResumed.set(i, i2, i3, i4);
        this.setIconified = true;
    }

    public final void setX(int i, int i2, int i3, int i4) {
        if (MenuHostHelper$$ExternalSyntheticLambda0(this.setHasDecor, i, i2, i3, i4)) {
            return;
        }
        this.setHasDecor.set(i, i2, i3, i4);
        this.setIconified = true;
    }

    public final void setX(RectF rectF, int i, int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i3;
        int i4;
        boolean MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(this.setMinAndMaxProgress);
        this.setSubmitButtonEnabled = MenuHostHelper$$ExternalSyntheticLambda0;
        if (i2 != 17 && (i2 & 7) != 1) {
            if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
                if (this.setSubmitButtonEnabled) {
                    i4 = this.setHasDecor.left;
                    f3 = i4;
                } else {
                    f = this.setHasDecor.right;
                    f2 = this.setFilterTouchesWhenObscured;
                }
            } else if (MenuHostHelper$$ExternalSyntheticLambda0) {
                f = this.setHasDecor.right;
                f2 = this.setFilterTouchesWhenObscured;
            } else {
                i4 = this.setHasDecor.left;
                f3 = i4;
            }
            rectF.left = Math.max(f3, this.setHasDecor.left);
            rectF.top = this.setHasDecor.top;
            if (i2 == 17 && (i2 & 7) != 1) {
                if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
                    if (this.setSubmitButtonEnabled) {
                        f4 = rectF.left;
                        f5 = this.setFilterTouchesWhenObscured;
                    } else {
                        i3 = this.setHasDecor.right;
                        f6 = i3;
                    }
                } else if (this.setSubmitButtonEnabled) {
                    i3 = this.setHasDecor.right;
                    f6 = i3;
                } else {
                    f4 = rectF.left;
                    f5 = this.setFilterTouchesWhenObscured;
                }
                rectF.right = Math.min(f6, this.setHasDecor.right);
                TextPaint textPaint = this.SearchView$SavedState$1;
                textPaint.setTextSize(this.setAdapter);
                textPaint.setTypeface(this.setSelectedChildViewEnabled);
                textPaint.setLetterSpacing(this.setConstraintSet);
                rectF.bottom = this.setHasDecor.top - this.SearchView$SavedState$1.ascent();
            }
            f4 = i / 2.0f;
            f5 = this.setFilterTouchesWhenObscured / 2.0f;
            f6 = f4 + f5;
            rectF.right = Math.min(f6, this.setHasDecor.right);
            TextPaint textPaint2 = this.SearchView$SavedState$1;
            textPaint2.setTextSize(this.setAdapter);
            textPaint2.setTypeface(this.setSelectedChildViewEnabled);
            textPaint2.setLetterSpacing(this.setConstraintSet);
            rectF.bottom = this.setHasDecor.top - this.SearchView$SavedState$1.ascent();
        }
        f = i / 2.0f;
        f2 = this.setFilterTouchesWhenObscured / 2.0f;
        f3 = f - f2;
        rectF.left = Math.max(f3, this.setHasDecor.left);
        rectF.top = this.setHasDecor.top;
        if (i2 == 17) {
        }
        f4 = i / 2.0f;
        f5 = this.setFilterTouchesWhenObscured / 2.0f;
        f6 = f4 + f5;
        rectF.right = Math.min(f6, this.setHasDecor.right);
        TextPaint textPaint22 = this.SearchView$SavedState$1;
        textPaint22.setTextSize(this.setAdapter);
        textPaint22.setTypeface(this.setSelectedChildViewEnabled);
        textPaint22.setLetterSpacing(this.setConstraintSet);
        rectF.bottom = this.setHasDecor.top - this.SearchView$SavedState$1.ascent();
    }

    public final float MenuHostHelper$$ExternalSyntheticLambda1() {
        TextPaint textPaint = this.SearchView$SavedState$1;
        textPaint.setTextSize(this.setAdapter);
        textPaint.setTypeface(this.setSelectedChildViewEnabled);
        textPaint.setLetterSpacing(this.setConstraintSet);
        return -this.SearchView$SavedState$1.ascent();
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        setHeight setheight = new setHeight(this.minusKey.getContext(), i);
        if (setheight.setLayoutAnimation != null) {
            this.setIconTintList = setheight.setLayoutAnimation;
        }
        if (setheight.setOnLongClickListener != 0.0f) {
            this.setAdapter = setheight.setOnLongClickListener;
        }
        if (setheight.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            this.setContentScrimResource = setheight.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        this.FragmentStateAdapter$2 = setheight.setUiOptions;
        this.setSuffixText = setheight.setUnboundedRipple;
        this.setViewTranslationCallback = setheight.setNavigationOnClickListener;
        this.setConstraintSet = setheight.setIconTintList;
        setTransitionAlpha settransitionalpha = this.FloatingActionButton$BaseBehavior;
        if (settransitionalpha != null) {
            settransitionalpha.setX = true;
        }
        setTransitionAlpha.setX setx = new setTransitionAlpha.setX() { // from class: o.StaggeredGridLayoutManager.2
            @Override // o.setTransitionAlpha.setX
            public final void setY(Typeface typeface) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager.MenuHostHelper$$ExternalSyntheticLambda1(typeface)) {
                    staggeredGridLayoutManager.setY(false);
                }
            }
        };
        setheight.setIconTintList();
        this.FloatingActionButton$BaseBehavior = new setTransitionAlpha(setx, setheight.setX);
        setheight.setY(this.minusKey.getContext(), this.FloatingActionButton$BaseBehavior);
        setY(false);
    }

    public final void setIconTintList(int i) {
        setHeight setheight = new setHeight(this.minusKey.getContext(), i);
        if (setheight.setLayoutAnimation != null) {
            this.setNavigationOnClickListener = setheight.setLayoutAnimation;
        }
        if (setheight.setOnLongClickListener != 0.0f) {
            this.setLayoutAnimation = setheight.setOnLongClickListener;
        }
        if (setheight.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            this.setRevealInfo = setheight.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        this.createDispatcher = setheight.setUiOptions;
        this.Fragment$5 = setheight.setUnboundedRipple;
        this.setNavigationIconTint = setheight.setNavigationOnClickListener;
        this.setX = setheight.setIconTintList;
        setTransitionAlpha settransitionalpha = this.setCloseIconEndPadding;
        if (settransitionalpha != null) {
            settransitionalpha.setX = true;
        }
        setTransitionAlpha.setX setx = new setTransitionAlpha.setX() { // from class: o.StaggeredGridLayoutManager.1
            @Override // o.setTransitionAlpha.setX
            public final void setY(Typeface typeface) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager.setX(typeface)) {
                    staggeredGridLayoutManager.setY(false);
                }
            }
        };
        setheight.setIconTintList();
        this.setCloseIconEndPadding = new setTransitionAlpha(setx, setheight.setX);
        setheight.setY(this.minusKey.getContext(), this.setCloseIconEndPadding);
        setY(false);
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(Typeface typeface) {
        setTransitionAlpha settransitionalpha = this.FloatingActionButton$BaseBehavior;
        if (settransitionalpha != null) {
            settransitionalpha.setX = true;
        }
        if (this.setFloatValues != typeface) {
            this.setFloatValues = typeface;
            Typeface y = setNextFocusForwardId.setY(this.minusKey.getContext().getResources().getConfiguration(), typeface);
            this.setImageTintMode = y;
            if (y == null) {
                y = this.setFloatValues;
            }
            this.setSelectedChildViewEnabled = y;
            return true;
        }
        return false;
    }

    public final boolean setX(Typeface typeface) {
        setTransitionAlpha settransitionalpha = this.setCloseIconEndPadding;
        if (settransitionalpha != null) {
            settransitionalpha.setX = true;
        }
        if (this.setEmptyView != typeface) {
            this.setEmptyView = typeface;
            Typeface y = setNextFocusForwardId.setY(this.minusKey.getContext().getResources().getConfiguration(), typeface);
            this.setLineBreakStyle = y;
            if (y == null) {
                y = this.setEmptyView;
            }
            this.ViewPager$SavedState$1 = y;
            return true;
        }
        return false;
    }

    public final void setIconTintList(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.setFloatValues;
            if (typeface != null) {
                this.setImageTintMode = setNextFocusForwardId.setY(configuration, typeface);
            }
            Typeface typeface2 = this.setEmptyView;
            if (typeface2 != null) {
                this.setLineBreakStyle = setNextFocusForwardId.setY(configuration, typeface2);
            }
            Typeface typeface3 = this.setImageTintMode;
            if (typeface3 == null) {
                typeface3 = this.setFloatValues;
            }
            this.setSelectedChildViewEnabled = typeface3;
            Typeface typeface4 = this.setLineBreakStyle;
            if (typeface4 == null) {
                typeface4 = this.setEmptyView;
            }
            this.ViewPager$SavedState$1 = typeface4;
            setY(true);
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.MenuHostHelper$$ExternalSyntheticLambda0) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = f;
            setX(f);
        }
    }

    public final boolean setY() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.setIconTintList;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.setNavigationOnClickListener) != null && colorStateList.isStateful());
    }

    public final void setX(float f) {
        float f2;
        int defaultColor;
        TextPaint textPaint;
        int i;
        int defaultColor2;
        float x;
        int defaultColor3;
        int defaultColor4;
        MenuHostHelper$$ExternalSyntheticLambda1(f);
        int i2 = 0;
        if (this.setIconSize) {
            if (f < this.setCenterIfNoTextEnabled) {
                this.setChipIconEnabled = this.setFilterRedundantCalls;
                this.setTitleMarginEnd = this.FabTransformationBehavior;
                MenuHostHelper$$ExternalSyntheticLambda1(0.0f, false);
                this.setErrorIconTintList = false;
                setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this.minusKey);
                f2 = 0.0f;
            } else {
                this.setChipIconEnabled = this.setChipIconTintResource;
                this.setTitleMarginEnd = this.FragmentStateAdapter$5 - Math.max(0, this.setY);
                MenuHostHelper$$ExternalSyntheticLambda1(1.0f, false);
                this.setErrorIconTintList = false;
                setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this.minusKey);
                f2 = 1.0f;
            }
        } else {
            float f3 = this.setFilterRedundantCalls;
            float f4 = this.setChipIconTintResource;
            TimeInterpolator timeInterpolator = this.setAnimationFromJson;
            this.setChipIconEnabled = f3 + ((timeInterpolator != null ? timeInterpolator.getInterpolation(f) : f) * (f4 - f3));
            float f5 = this.FabTransformationBehavior;
            float f6 = this.FragmentStateAdapter$5;
            TimeInterpolator timeInterpolator2 = this.setAnimationFromJson;
            this.setTitleMarginEnd = f5 + ((timeInterpolator2 != null ? timeInterpolator2.getInterpolation(f) : f) * (f6 - f5));
            MenuHostHelper$$ExternalSyntheticLambda1(f, false);
            this.setErrorIconTintList = false;
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this.minusKey);
            f2 = f;
        }
        TimeInterpolator timeInterpolator3 = setCardElevation.MenuHostHelper$$ExternalSyntheticLambda0;
        float f7 = 1.0f - f;
        if (timeInterpolator3 != null) {
            f7 = timeInterpolator3.getInterpolation(f7);
        }
        this.setObjectValues = 1.0f - (f7 + 0.0f);
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this.minusKey);
        TimeInterpolator timeInterpolator4 = setCardElevation.MenuHostHelper$$ExternalSyntheticLambda0;
        this.ActionMenuPresenter$SavedState$1 = (-(timeInterpolator4 != null ? timeInterpolator4.getInterpolation(f) : f)) + 1.0f;
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this.minusKey);
        ColorStateList colorStateList = this.setIconTintList;
        ColorStateList colorStateList2 = this.setNavigationOnClickListener;
        if (colorStateList != colorStateList2) {
            textPaint = this.RemoteActionCompatParcelizer;
            if (colorStateList2 == null) {
                defaultColor3 = 0;
            } else {
                int[] iArr = this.setTextAppearanceResource;
                if (iArr != null) {
                    defaultColor3 = colorStateList2.getColorForState(iArr, 0);
                } else {
                    defaultColor3 = colorStateList2.getDefaultColor();
                }
            }
            ColorStateList colorStateList3 = this.setIconTintList;
            if (colorStateList3 == null) {
                defaultColor4 = 0;
            } else {
                int[] iArr2 = this.setTextAppearanceResource;
                if (iArr2 != null) {
                    defaultColor4 = colorStateList3.getColorForState(iArr2, 0);
                } else {
                    defaultColor4 = colorStateList3.getDefaultColor();
                }
            }
            i = MenuHostHelper$$ExternalSyntheticLambda0(defaultColor3, defaultColor4, f2);
        } else {
            TextPaint textPaint2 = this.RemoteActionCompatParcelizer;
            if (colorStateList == null) {
                textPaint = textPaint2;
                i = 0;
            } else {
                int[] iArr3 = this.setTextAppearanceResource;
                if (iArr3 != null) {
                    defaultColor = colorStateList.getColorForState(iArr3, 0);
                } else {
                    defaultColor = colorStateList.getDefaultColor();
                }
                int i3 = defaultColor;
                textPaint = textPaint2;
                i = i3;
            }
        }
        textPaint.setColor(i);
        float f8 = this.setConstraintSet;
        float f9 = this.setX;
        if (f8 != f9) {
            TextPaint textPaint3 = this.RemoteActionCompatParcelizer;
            TimeInterpolator timeInterpolator5 = setCardElevation.MenuHostHelper$$ExternalSyntheticLambda0;
            textPaint3.setLetterSpacing(f9 + ((timeInterpolator5 != null ? timeInterpolator5.getInterpolation(f) : f) * (f8 - f9)));
        } else {
            this.RemoteActionCompatParcelizer.setLetterSpacing(f8);
        }
        float f10 = this.setNavigationIconTint;
        this.getCallingPid = f10 + ((this.setViewTranslationCallback - f10) * f);
        float f11 = this.createDispatcher;
        this.setError = f11 + ((this.FragmentStateAdapter$2 - f11) * f);
        float f12 = this.Fragment$5;
        this.FirebaseRemoteConfigKtxRegistrar = f12 + ((this.setSuffixText - f12) * f);
        ColorStateList colorStateList4 = this.setRevealInfo;
        if (colorStateList4 == null) {
            defaultColor2 = 0;
        } else {
            int[] iArr4 = this.setTextAppearanceResource;
            if (iArr4 != null) {
                defaultColor2 = colorStateList4.getColorForState(iArr4, 0);
            } else {
                defaultColor2 = colorStateList4.getDefaultColor();
            }
        }
        ColorStateList colorStateList5 = this.setContentScrimResource;
        if (colorStateList5 != null) {
            int[] iArr5 = this.setTextAppearanceResource;
            if (iArr5 != null) {
                i2 = colorStateList5.getColorForState(iArr5, 0);
            } else {
                i2 = colorStateList5.getDefaultColor();
            }
        }
        int MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(defaultColor2, i2, f);
        this.setShrinkMotionSpec = MenuHostHelper$$ExternalSyntheticLambda0;
        this.RemoteActionCompatParcelizer.setShadowLayer(this.getCallingPid, this.setError, this.FirebaseRemoteConfigKtxRegistrar, MenuHostHelper$$ExternalSyntheticLambda0);
        if (this.setIconSize) {
            int alpha = this.RemoteActionCompatParcelizer.getAlpha();
            float f13 = this.setCenterIfNoTextEnabled;
            if (f <= f13) {
                x = setCardElevation.setX(1.0f, 0.0f, this.setChipCornerRadius, f13, f);
            } else {
                x = setCardElevation.setX(0.0f, 1.0f, f13, 1.0f, f);
            }
            this.RemoteActionCompatParcelizer.setAlpha((int) (x * alpha));
        }
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this.minusKey);
    }

    private void setX(boolean z) {
        int absoluteGravity;
        StaticLayout staticLayout;
        int absoluteGravity2;
        StaticLayout staticLayout2;
        MenuHostHelper$$ExternalSyntheticLambda1(1.0f, z);
        CharSequence charSequence = this.TextInputLayout$SavedState$1;
        if (charSequence != null && (staticLayout2 = this.setBackgroundTintMode) != null) {
            this.setChipIconEnabledResource = TextUtils.ellipsize(charSequence, this.RemoteActionCompatParcelizer, staticLayout2.getWidth(), this.setGuidelinePercent);
        }
        CharSequence charSequence2 = this.setChipIconEnabledResource;
        float f = 0.0f;
        if (charSequence2 != null) {
            this.setFilterTouchesWhenObscured = this.RemoteActionCompatParcelizer.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.setFilterTouchesWhenObscured = 0.0f;
        }
        absoluteGravity = Gravity.getAbsoluteGravity(this.MenuHostHelper$$ExternalSyntheticLambda1, this.setSubmitButtonEnabled ? 1 : 0);
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.FragmentStateAdapter$5 = this.setHasDecor.top;
        } else if (i == 80) {
            this.FragmentStateAdapter$5 = this.setHasDecor.bottom + this.RemoteActionCompatParcelizer.ascent();
        } else {
            this.FragmentStateAdapter$5 = this.setHasDecor.centerY() - ((this.RemoteActionCompatParcelizer.descent() - this.RemoteActionCompatParcelizer.ascent()) / 2.0f);
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.setChipIconTintResource = this.setHasDecor.centerX() - (this.setFilterTouchesWhenObscured / 2.0f);
        } else if (i2 == 5) {
            this.setChipIconTintResource = this.setHasDecor.right - this.setFilterTouchesWhenObscured;
        } else {
            this.setChipIconTintResource = this.setHasDecor.left;
        }
        MenuHostHelper$$ExternalSyntheticLambda1(0.0f, z);
        float height = this.setBackgroundTintMode != null ? staticLayout.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.setBackgroundTintMode;
        if (staticLayout3 != null && this.setMaxEms > 1) {
            f = staticLayout3.getWidth();
        } else {
            CharSequence charSequence3 = this.TextInputLayout$SavedState$1;
            if (charSequence3 != null) {
                f = this.RemoteActionCompatParcelizer.measureText(charSequence3, 0, charSequence3.length());
            }
        }
        StaticLayout staticLayout4 = this.setBackgroundTintMode;
        this.setUnboundedRipple = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        absoluteGravity2 = Gravity.getAbsoluteGravity(this.setUiOptions, this.setSubmitButtonEnabled ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        if (i3 == 48) {
            this.FabTransformationBehavior = this.onActivityResumed.top;
        } else if (i3 != 80) {
            this.FabTransformationBehavior = this.onActivityResumed.centerY() - (height / 2.0f);
        } else {
            this.FabTransformationBehavior = (this.onActivityResumed.bottom - height) + this.RemoteActionCompatParcelizer.descent();
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.setFilterRedundantCalls = this.onActivityResumed.centerX() - (f / 2.0f);
        } else if (i4 == 5) {
            this.setFilterRedundantCalls = this.onActivityResumed.right - f;
        } else {
            this.setFilterRedundantCalls = this.onActivityResumed.left;
        }
        MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0, false);
        this.setErrorIconTintList = false;
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this.minusKey);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(float f) {
        if (this.setIconSize) {
            this.RecyclerView$SavedState$1.set(f < this.setCenterIfNoTextEnabled ? this.onActivityResumed : this.setHasDecor);
            return;
        }
        RectF rectF = this.RecyclerView$SavedState$1;
        float f2 = this.onActivityResumed.left;
        float f3 = this.setHasDecor.left;
        TimeInterpolator timeInterpolator = this.setAnimationFromJson;
        rectF.left = f2 + ((timeInterpolator != null ? timeInterpolator.getInterpolation(f) : f) * (f3 - f2));
        RectF rectF2 = this.RecyclerView$SavedState$1;
        float f4 = this.FabTransformationBehavior;
        float f5 = this.FragmentStateAdapter$5;
        TimeInterpolator timeInterpolator2 = this.setAnimationFromJson;
        rectF2.top = f4 + ((timeInterpolator2 != null ? timeInterpolator2.getInterpolation(f) : f) * (f5 - f4));
        RectF rectF3 = this.RecyclerView$SavedState$1;
        float f6 = this.onActivityResumed.right;
        float f7 = this.setHasDecor.right;
        TimeInterpolator timeInterpolator3 = this.setAnimationFromJson;
        rectF3.right = f6 + ((timeInterpolator3 != null ? timeInterpolator3.getInterpolation(f) : f) * (f7 - f6));
        RectF rectF4 = this.RecyclerView$SavedState$1;
        float f8 = this.onActivityResumed.bottom;
        float f9 = this.setHasDecor.bottom;
        TimeInterpolator timeInterpolator4 = this.setAnimationFromJson;
        if (timeInterpolator4 != null) {
            f = timeInterpolator4.getInterpolation(f);
        }
        rectF4.bottom = f8 + (f * (f9 - f8));
    }

    public final void setIconTintList(Canvas canvas) {
        int save = canvas.save();
        if (this.TextInputLayout$SavedState$1 == null || this.RecyclerView$SavedState$1.width() <= 0.0f || this.RecyclerView$SavedState$1.height() <= 0.0f) {
            return;
        }
        this.RemoteActionCompatParcelizer.setTextSize(this.setHint);
        float f = this.setChipIconEnabled;
        float f2 = this.setTitleMarginEnd;
        float f3 = this.setChipSpacingHorizontal;
        if (f3 != 1.0f && !this.setIconSize) {
            canvas.scale(f3, f3, f, f2);
        }
        if (setX() && (!this.setIconSize || this.MenuHostHelper$$ExternalSyntheticLambda0 > this.setCenterIfNoTextEnabled)) {
            setIconTintList(canvas, this.setChipIconEnabled - this.setBackgroundTintMode.getLineStart(0), f2);
        } else {
            canvas.translate(f, f2);
            this.setBackgroundTintMode.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    private boolean setX() {
        return this.setMaxEms > 1 && (!this.setSubmitButtonEnabled || this.setIconSize);
    }

    private void setIconTintList(Canvas canvas, float f, float f2) {
        int alpha = this.RemoteActionCompatParcelizer.getAlpha();
        canvas.translate(f, f2);
        float f3 = alpha;
        this.RemoteActionCompatParcelizer.setAlpha((int) (this.ActionMenuPresenter$SavedState$1 * f3));
        if (Build.VERSION.SDK_INT >= 31) {
            TextPaint textPaint = this.RemoteActionCompatParcelizer;
            float f4 = this.getCallingPid;
            float f5 = this.setError;
            float f6 = this.FirebaseRemoteConfigKtxRegistrar;
            int i = this.setShrinkMotionSpec;
            textPaint.setShadowLayer(f4, f5, f6, setExtended.setIconTintList(i, (Color.alpha(i) * textPaint.getAlpha()) / 255));
        }
        this.setBackgroundTintMode.draw(canvas);
        this.RemoteActionCompatParcelizer.setAlpha((int) (this.setObjectValues * f3));
        if (Build.VERSION.SDK_INT >= 31) {
            TextPaint textPaint2 = this.RemoteActionCompatParcelizer;
            float f7 = this.getCallingPid;
            float f8 = this.setError;
            float f9 = this.FirebaseRemoteConfigKtxRegistrar;
            int i2 = this.setShrinkMotionSpec;
            textPaint2.setShadowLayer(f7, f8, f9, setExtended.setIconTintList(i2, (Color.alpha(i2) * textPaint2.getAlpha()) / 255));
        }
        int lineBaseline = this.setBackgroundTintMode.getLineBaseline(0);
        CharSequence charSequence = this.setChipIconEnabledResource;
        float f10 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f10, this.RemoteActionCompatParcelizer);
        if (Build.VERSION.SDK_INT >= 31) {
            this.RemoteActionCompatParcelizer.setShadowLayer(this.getCallingPid, this.setError, this.FirebaseRemoteConfigKtxRegistrar, this.setShrinkMotionSpec);
        }
        if (this.setIconSize) {
            return;
        }
        String trim = this.setChipIconEnabledResource.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.RemoteActionCompatParcelizer.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.setBackgroundTintMode.getLineEnd(0), str.length()), 0.0f, f10, (Paint) this.RemoteActionCompatParcelizer);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        if (this.setMinAndMaxProgress == null) {
            return;
        }
        float width = this.setHasDecor.width();
        float width2 = this.onActivityResumed.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.setAdapter;
            f3 = this.setConstraintSet;
            this.setChipSpacingHorizontal = 1.0f;
            typeface = this.setSelectedChildViewEnabled;
        } else {
            float f4 = this.setLayoutAnimation;
            float f5 = this.setX;
            Typeface typeface2 = this.ViewPager$SavedState$1;
            if (Math.abs(f) < 1.0E-5f) {
                this.setChipSpacingHorizontal = 1.0f;
            } else {
                float f6 = this.setLayoutAnimation;
                float f7 = this.setAdapter;
                TimeInterpolator timeInterpolator = this.setCheckedIconEnabled;
                if (timeInterpolator != null) {
                    f = timeInterpolator.getInterpolation(f);
                }
                this.setChipSpacingHorizontal = (f6 + (f * (f7 - f6))) / this.setLayoutAnimation;
            }
            float f8 = this.setAdapter / this.setLayoutAnimation;
            width = (!z && width2 * f8 > width) ? Math.min(width / f8, width2) : width2;
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        if (width > 0.0f) {
            boolean z2 = this.setHint != f2;
            boolean z3 = this.setChipSpacingVertical != f3;
            boolean z4 = this.setTooltipText != typeface;
            StaticLayout staticLayout = this.setBackgroundTintMode;
            boolean z5 = z2 || z3 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z4 || this.setIconified;
            this.setHint = f2;
            this.setChipSpacingVertical = f3;
            this.setTooltipText = typeface;
            this.setIconified = false;
            this.RemoteActionCompatParcelizer.setLinearText(this.setChipSpacingHorizontal != 1.0f);
            r6 = z5;
        }
        if (this.TextInputLayout$SavedState$1 == null || r6) {
            this.RemoteActionCompatParcelizer.setTextSize(this.setHint);
            this.RemoteActionCompatParcelizer.setTypeface(this.setTooltipText);
            this.RemoteActionCompatParcelizer.setLetterSpacing(this.setChipSpacingVertical);
            this.setSubmitButtonEnabled = MenuHostHelper$$ExternalSyntheticLambda0(this.setMinAndMaxProgress);
            StaticLayout MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(setX() ? this.setMaxEms : 1, width, this.setSubmitButtonEnabled);
            this.setBackgroundTintMode = MenuHostHelper$$ExternalSyntheticLambda1;
            this.TextInputLayout$SavedState$1 = MenuHostHelper$$ExternalSyntheticLambda1.getText();
        }
    }

    private StaticLayout MenuHostHelper$$ExternalSyntheticLambda1(int i, float f, boolean z) {
        StaticLayout staticLayout;
        try {
            Layout.Alignment MenuHostHelper$$ExternalSyntheticLambda0 = i == 1 ? Layout.Alignment.ALIGN_NORMAL : MenuHostHelper$$ExternalSyntheticLambda0();
            FirebaseInitProvider firebaseInitProvider = new FirebaseInitProvider(this.setMinAndMaxProgress, this.RemoteActionCompatParcelizer, (int) f);
            firebaseInitProvider.MenuHostHelper$$ExternalSyntheticLambda1 = this.setGuidelinePercent;
            firebaseInitProvider.setOnLongClickListener = z;
            firebaseInitProvider.setY = MenuHostHelper$$ExternalSyntheticLambda0;
            firebaseInitProvider.setX = false;
            firebaseInitProvider.setUnboundedRipple = i;
            float f2 = this.setZ;
            float f3 = this.setTextScaleX;
            firebaseInitProvider.setLayoutAnimation = f2;
            firebaseInitProvider.setUiOptions = f3;
            firebaseInitProvider.setIconTintList = this.setTextAlignment;
            firebaseInitProvider.setNavigationOnClickListener = this.setLayoutDirection;
            staticLayout = firebaseInitProvider.setY();
        } catch (FirebaseInitProvider.setY e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            staticLayout = null;
        }
        return staticLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0586  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.text.Layout.Alignment MenuHostHelper$$ExternalSyntheticLambda0() {
        /*
            Method dump skipped, instructions count: 1476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.StaggeredGridLayoutManager.MenuHostHelper$$ExternalSyntheticLambda0():android.text.Layout$Alignment");
    }

    public final void setY(boolean z) {
        if ((this.minusKey.getHeight() <= 0 || this.minusKey.getWidth() <= 0) && !z) {
            return;
        }
        setX(z);
        setX(this.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    public final void setX(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.setMinAndMaxProgress, charSequence)) {
            this.setMinAndMaxProgress = charSequence;
            this.TextInputLayout$SavedState$1 = null;
            setY(false);
        }
    }

    private static int MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private static boolean MenuHostHelper$$ExternalSyntheticLambda0(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda0(CharSequence charSequence) {
        int x;
        setBackgroundTint setbackgroundtint;
        x = setBaselineAlignBottom.setX.setX(this.minusKey);
        boolean z = x == 1;
        if (this.setOnNavigationItemSelectedListener) {
            if (z) {
                setbackgroundtint = BaseTransientBottomBar$Behavior.setY;
            } else {
                setbackgroundtint = BaseTransientBottomBar$Behavior.MenuHostHelper$$ExternalSyntheticLambda0;
            }
            return setbackgroundtint.MenuHostHelper$$ExternalSyntheticLambda0(charSequence, 0, charSequence.length());
        }
        return z;
    }

    private static void b(int i, char[] cArr, Object[] objArr) {
        jB jBVar = new jB();
        jBVar.setY = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        jBVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        while (jBVar.MenuHostHelper$$ExternalSyntheticLambda0 < cArr.length) {
            int i2 = jBVar.MenuHostHelper$$ExternalSyntheticLambda0;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[jBVar.MenuHostHelper$$ExternalSyntheticLambda0]), jBVar, jBVar};
                Object obj = jC.setTextScaleX.get(442390202);
                if (obj == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    Object[] objArr3 = new Object[1];
                    e(b, b2, b2, objArr3);
                    obj = ((Class) jC.setY(289 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) KeyEvent.normalizeMetaState(0), 4 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    jC.setTextScaleX.put(442390202, obj);
                }
                jArr[i2] = ((Long) ((Method) obj).invoke(null, objArr2)).longValue() ^ (setCallingWorkSourceUid ^ (-34803645974414051L));
                try {
                    Object[] objArr4 = {jBVar, jBVar};
                    Object obj2 = jC.setTextScaleX.get(-1983260643);
                    if (obj2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        Object[] objArr5 = new Object[1];
                        e(b3, b4, (byte) (b4 - 1), objArr5);
                        obj2 = ((Class) jC.setY(View.resolveSize(0, 0) + 321, (char) (500 - (KeyEvent.getMaxKeyCode() >> 16)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3)).getMethod((String) objArr5[0], Object.class, Object.class);
                        jC.setTextScaleX.put(-1983260643, obj2);
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
        char[] cArr2 = new char[length];
        jBVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        while (jBVar.MenuHostHelper$$ExternalSyntheticLambda0 < cArr.length) {
            cArr2[jBVar.MenuHostHelper$$ExternalSyntheticLambda0] = (char) jArr[jBVar.MenuHostHelper$$ExternalSyntheticLambda0];
            try {
                Object[] objArr6 = {jBVar, jBVar};
                Object obj3 = jC.setTextScaleX.get(-1983260643);
                if (obj3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    Object[] objArr7 = new Object[1];
                    e(b5, b6, (byte) (b6 - 1), objArr7);
                    obj3 = ((Class) jC.setY(321 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (View.resolveSizeAndState(0, 0, 0) + 500), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3)).getMethod((String) objArr7[0], Object.class, Object.class);
                    jC.setTextScaleX.put(-1983260643, obj3);
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
        objArr[0] = new String(cArr2);
    }
}