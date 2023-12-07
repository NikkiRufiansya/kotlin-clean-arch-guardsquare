package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ExpandableListView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import o.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3;
import o.setEnsureMinTouchTargetSize;
import o.setExpandedTitleMargin;

/* loaded from: classes.dex */
public class setBoxCornerRadiiResources {
    public final FloatingActionButton FragmentStateAdapter$2;
    public ArrayList<setBoxCornerRadiiResources$MenuHostHelper$$ExternalSyntheticLambda0> FragmentStateAdapter$5;
    public FirebaseCommonKtxRegistrar SearchView$SavedState$1;
    public boolean ViewPager$SavedState$1;
    public int setAnimationFromJson;
    public float setCenterIfNoTextEnabled;
    float setCheckedIconEnabled;
    Animator setChipCornerRadius;
    public ArrayList<Animator.AnimatorListener> setChipIconTintResource;
    final getFillColor setGuidelinePercent;
    public setScrollBarDefaultDelayBeforeFade setHasDecor;
    public ArrayList<Animator.AnimatorListener> setIconSize;
    public setWebViewClient setIconified;
    Drawable setLayoutAnimation;
    Drawable setLayoutDirection;
    public int setMaxEms;
    public float setOnNavigationItemSelectedListener;
    public FirebaseCommonKtxRegistrar setTextAlignment;
    public float setTextAppearanceResource;
    public ViewTreeObserver.OnPreDrawListener setTextScaleX;
    public setContextClickable setUnboundedRipple;
    private final FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 setViewTranslationCallback;
    static final TimeInterpolator setY = setCardElevation.setX;
    private static final int FloatingActionButton$BaseBehavior = R.attr.res_0x7f0402f2;
    private static final int setObjectValues = R.attr.res_0x7f040302;
    private static final int setContentScrimResource = R.attr.res_0x7f0402f5;
    private static final int setConstraintSet = R.attr.res_0x7f040300;
    static final int[] setUiOptions = {16842919, 16842910};
    static final int[] setOnLongClickListener = {16843623, 16842908, 16842910};
    static final int[] MenuHostHelper$$ExternalSyntheticLambda0 = {16842908, 16842910};
    static final int[] setIconTintList = {16843623, 16842910};
    static final int[] setX = {16842910};
    static final int[] MenuHostHelper$$ExternalSyntheticLambda1 = new int[0];
    public boolean setMinAndMaxProgress = true;
    public float setZ = 1.0f;
    int setNavigationOnClickListener = 0;
    private final Rect setFilterTouchesWhenObscured = new Rect();
    private final RectF setAdapter = new RectF();
    private final RectF setSuffixText = new RectF();
    public final Matrix ExtendableSavedState$1 = new Matrix();

    /* loaded from: classes.dex */
    public interface setIconTintList {
        void MenuHostHelper$$ExternalSyntheticLambda1();

        void setY();
    }

    boolean setLayoutAnimation() {
        return true;
    }

    public boolean setNavigationOnClickListener() {
        return true;
    }

    public void setUiOptions() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setBoxCornerRadiiResources(FloatingActionButton floatingActionButton, getFillColor getfillcolor) {
        this.FragmentStateAdapter$2 = floatingActionButton;
        this.setGuidelinePercent = getfillcolor;
        FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 = new FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3();
        this.setViewTranslationCallback = fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3;
        int[] iArr = setUiOptions;
        ValueAnimator iconTintList = setIconTintList(new setY());
        FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setX setx = new FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setX(iArr, iconTintList);
        iconTintList.addListener(fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.MenuHostHelper$$ExternalSyntheticLambda1);
        fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setY.add(setx);
        int[] iArr2 = setOnLongClickListener;
        ValueAnimator iconTintList2 = setIconTintList(new setOnLongClickListener() { // from class: o.setBoxCornerRadiiResources$MenuHostHelper$$ExternalSyntheticLambda1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(setBoxCornerRadiiResources.this, (byte) 0);
            }

            @Override // o.setBoxCornerRadiiResources.setOnLongClickListener
            protected final float MenuHostHelper$$ExternalSyntheticLambda0() {
                return setBoxCornerRadiiResources.this.setCenterIfNoTextEnabled + setBoxCornerRadiiResources.this.setOnNavigationItemSelectedListener;
            }
        });
        FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setX setx2 = new FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setX(iArr2, iconTintList2);
        iconTintList2.addListener(fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.MenuHostHelper$$ExternalSyntheticLambda1);
        fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setY.add(setx2);
        int[] iArr3 = MenuHostHelper$$ExternalSyntheticLambda0;
        ValueAnimator iconTintList3 = setIconTintList(new setOnLongClickListener() { // from class: o.setBoxCornerRadiiResources$MenuHostHelper$$ExternalSyntheticLambda1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(setBoxCornerRadiiResources.this, (byte) 0);
            }

            @Override // o.setBoxCornerRadiiResources.setOnLongClickListener
            protected final float MenuHostHelper$$ExternalSyntheticLambda0() {
                return setBoxCornerRadiiResources.this.setCenterIfNoTextEnabled + setBoxCornerRadiiResources.this.setOnNavigationItemSelectedListener;
            }
        });
        FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setX setx3 = new FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setX(iArr3, iconTintList3);
        iconTintList3.addListener(fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.MenuHostHelper$$ExternalSyntheticLambda1);
        fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setY.add(setx3);
        int[] iArr4 = setIconTintList;
        ValueAnimator iconTintList4 = setIconTintList(new setOnLongClickListener() { // from class: o.setBoxCornerRadiiResources$MenuHostHelper$$ExternalSyntheticLambda1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(setBoxCornerRadiiResources.this, (byte) 0);
            }

            @Override // o.setBoxCornerRadiiResources.setOnLongClickListener
            protected final float MenuHostHelper$$ExternalSyntheticLambda0() {
                return setBoxCornerRadiiResources.this.setCenterIfNoTextEnabled + setBoxCornerRadiiResources.this.setOnNavigationItemSelectedListener;
            }
        });
        FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setX setx4 = new FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setX(iArr4, iconTintList4);
        iconTintList4.addListener(fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.MenuHostHelper$$ExternalSyntheticLambda1);
        fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setY.add(setx4);
        int[] iArr5 = setX;
        ValueAnimator iconTintList5 = setIconTintList(new setNavigationOnClickListener());
        FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setX setx5 = new FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setX(iArr5, iconTintList5);
        iconTintList5.addListener(fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.MenuHostHelper$$ExternalSyntheticLambda1);
        fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setY.add(setx5);
        int[] iArr6 = MenuHostHelper$$ExternalSyntheticLambda1;
        ValueAnimator iconTintList6 = setIconTintList(new setX());
        FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setX setx6 = new FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setX(iArr6, iconTintList6);
        iconTintList6.addListener(fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.MenuHostHelper$$ExternalSyntheticLambda1);
        fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setY.add(setx6);
        this.setCheckedIconEnabled = floatingActionButton.getRotation();
    }

    public void setX(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        setWebViewClient MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0();
        this.setIconified = MenuHostHelper$$ExternalSyntheticLambda02;
        MenuHostHelper$$ExternalSyntheticLambda02.setTintList(colorStateList);
        if (mode != null) {
            this.setIconified.setTintMode(mode);
        }
        this.setIconified.setIconSize();
        this.setIconified.setX(this.FragmentStateAdapter$2.getContext());
        setOnQueryTextListener setonquerytextlistener = new setOnQueryTextListener(this.setIconified.setChipIconTintResource.setTextAlignment);
        setonquerytextlistener.setTintList(setChipText.setY(colorStateList2));
        this.setLayoutDirection = setonquerytextlistener;
        this.setLayoutAnimation = new LayerDrawable(new Drawable[]{this.setIconified, setonquerytextlistener});
    }

    public void setY(ColorStateList colorStateList) {
        Drawable drawable = this.setLayoutDirection;
        if (drawable != null) {
            setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(drawable, setChipText.setY(colorStateList));
        }
    }

    float setY() {
        return this.setCenterIfNoTextEnabled;
    }

    public final void setIconTintList(float f, Matrix matrix) {
        Drawable drawable;
        matrix.reset();
        if (this.FragmentStateAdapter$2.getDrawable() == null || this.setMaxEms == 0) {
            return;
        }
        RectF rectF = this.setAdapter;
        RectF rectF2 = this.setSuffixText;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        float f2 = this.setMaxEms;
        rectF2.set(0.0f, 0.0f, f2, f2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f3 = this.setMaxEms / 2.0f;
        matrix.postScale(f, f, f3, f3);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        this.setHasDecor = setscrollbardefaultdelaybeforefade;
        setWebViewClient setwebviewclient = this.setIconified;
        if (setwebviewclient != null) {
            setwebviewclient.setShapeAppearanceModel(setscrollbardefaultdelaybeforefade);
        }
        Drawable drawable = this.setLayoutDirection;
        if (drawable instanceof FragmentManager$LaunchedFragmentInfo$1) {
            ((FragmentManager$LaunchedFragmentInfo$1) drawable).setShapeAppearanceModel(setscrollbardefaultdelaybeforefade);
        }
        setContextClickable setcontextclickable = this.setUnboundedRipple;
        if (setcontextclickable != null) {
            setcontextclickable.setOnLongClickListener = setscrollbardefaultdelaybeforefade;
            setcontextclickable.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ViewPager$SavedState$1() {
        if (this.ViewPager$SavedState$1) {
            FloatingActionButton floatingActionButton = this.FragmentStateAdapter$2;
            if (floatingActionButton.setIconTintList(floatingActionButton.setUnboundedRipple) < this.setAnimationFromJson) {
                return false;
            }
        }
        return true;
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(float f, float f2, float f3) {
        setChipCornerRadius();
        setWebViewClient setwebviewclient = this.setIconified;
        if (setwebviewclient != null) {
            setwebviewclient.setIconSize(f);
        }
    }

    public void setY(int[] iArr) {
        FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setX setx;
        ValueAnimator valueAnimator;
        FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 = this.setViewTranslationCallback;
        int size = fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setY.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                setx = null;
                break;
            }
            setx = fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setY.get(i);
            if (StateSet.stateSetMatches(setx.setX, iArr)) {
                break;
            }
            i++;
        }
        FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setX setx2 = fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setx != setx2) {
            if (setx2 != null && (valueAnimator = fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setX) != null) {
                valueAnimator.cancel();
                fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setX = null;
            }
            fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.MenuHostHelper$$ExternalSyntheticLambda0 = setx;
            if (setx != null) {
                ValueAnimator valueAnimator2 = setx.MenuHostHelper$$ExternalSyntheticLambda1;
                fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setX = valueAnimator2;
                valueAnimator2.start();
            }
        }
    }

    public void setIconTintList() {
        FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 = this.setViewTranslationCallback;
        ValueAnimator valueAnimator = fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setX;
        if (valueAnimator != null) {
            valueAnimator.end();
            fragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.setX = null;
        }
    }

    public final void setY(final setIconTintList seticontintlist, final boolean z) {
        AnimatorSet iconTintList;
        if (MenuHostHelper$$ExternalSyntheticLambda1()) {
            return;
        }
        Animator animator = this.setChipCornerRadius;
        if (animator != null) {
            animator.cancel();
        }
        if (setBaselineAlignBottom.setConstraintSet(this.FragmentStateAdapter$2) && !this.FragmentStateAdapter$2.isInEditMode()) {
            FirebaseCommonKtxRegistrar firebaseCommonKtxRegistrar = this.setTextAlignment;
            if (firebaseCommonKtxRegistrar != null) {
                iconTintList = setY(firebaseCommonKtxRegistrar, 0.0f, 0.0f, 0.0f);
            } else {
                iconTintList = setIconTintList(0.0f, 0.4f, 0.4f, setContentScrimResource, setConstraintSet);
            }
            iconTintList.addListener(new AnimatorListenerAdapter() { // from class: o.setBoxCornerRadiiResources.1
                private boolean MenuHostHelper$$ExternalSyntheticLambda1;
                public static final byte[] $$g = {8, -125, -40, -38};
                public static final int $$h = setExpandedTitleMargin.setY.TextInputLayout$SavedState$1;
                public static final byte[] $$d = {42, -75, 2, 31, 65, -63, -1, -24, -9, -7, 45, -39, -4, -1, 44, -29, -7, -4, 11, -13, 78, 0, -33, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 48, -24, -9, -7, 45, -39, -4, -1, 44, -29, -7, -4, 11, -13, 78, 0, -33, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 49, 65, -72, 40, 42, -79, 14, -15, 27};
                public static final int $$e = 115;
                public static final byte[] $$a = {94, 25, -44, 73, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35};
                public static final int $$b = 132;
                private static byte[] setOnLongClickListener = {76, 9, -56, 93, -17, 6, -18, -1, 2, 1, 50, -57, -16, -3, -10, 11, -13, -10, 66, -25, -48, -3, -10, 11, -23, 0, 1, -5, -13, -10, 7, -15, -9, 45, -29, -22, 7, 33, -48, 7, -5, 5, -25, 17, 47, -66, 7, -17, 3, 53, -41, -42, 2, -5, 11, -12};
                public static final int setIconTintList = 40;
                private static char[] setLayoutAnimation = {41070, 41183, 41181, 41179, 41190, 41178, 41168, 41149, 41144, 41189, 41158, 41142, 41168, 41184, 41187, 41178, 41181, 41166, 41167, 41177, 41181, 41183, 41013, 41071, 41057, 41071, 41078, 41067, 41059, 41052, 41052, 41060, 41057, 41079, 41065, 41068, 41070, 41042, 41130, 41114, 41106, 41123, 41125, 41117, 41118, 41118, 41113, 41127, 41125, 41120, 41124, 41114, 41095, 41081, 41112, 41120, 41089, 41065, 41102, 41125, 41122, 41121, 41121, 41030, 41099, 41108, 41109, 41100, 41102, 41110, 41085, 41087, 41111, 41097, 41101, 41089, 41093, 41101, 41097, 41099, 41097};

                /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0037). Please submit an issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
                    /*
                        byte[] r0 = o.setBoxCornerRadiiResources.AnonymousClass1.$$a
                        int r6 = r6 * 38
                        int r6 = 115 - r6
                        int r8 = r8 * 14
                        int r8 = 17 - r8
                        int r7 = r7 * 25
                        int r7 = r7 + 15
                        byte[] r1 = new byte[r7]
                        int r7 = r7 + (-1)
                        r2 = 0
                        if (r0 != 0) goto L1b
                        r3 = r1
                        r4 = 0
                        r1 = r0
                        r0 = r9
                        r9 = r8
                        goto L37
                    L1b:
                        r3 = 0
                    L1c:
                        int r8 = r8 + 1
                        byte r4 = (byte) r6
                        r1[r3] = r4
                        if (r3 != r7) goto L2b
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        r9[r2] = r6
                        return
                    L2b:
                        int r3 = r3 + 1
                        r4 = r0[r8]
                        r5 = r8
                        r8 = r6
                        r6 = r4
                        r4 = r3
                        r3 = r1
                        r1 = r0
                        r0 = r9
                        r9 = r5
                    L37:
                        int r8 = r8 + r6
                        int r6 = r8 + (-13)
                        r8 = r9
                        r9 = r0
                        r0 = r1
                        r1 = r3
                        r3 = r4
                        goto L1c
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.setBoxCornerRadiiResources.AnonymousClass1.a(short, short, int, java.lang.Object[]):void");
                }

                private static void c(short s, int i, byte b, Object[] objArr) {
                    int i2 = 41 - i;
                    int i3 = s + 97;
                    int i4 = (b * 7) + 16;
                    byte[] bArr = setOnLongClickListener;
                    byte[] bArr2 = new byte[i4];
                    int i5 = -1;
                    int i6 = i4 - 1;
                    if (bArr == null) {
                        i3 = (i6 - i3) - 4;
                        i2++;
                        i6 = i6;
                        objArr = objArr;
                        bArr = bArr;
                        bArr2 = bArr2;
                        i5 = -1;
                    }
                    while (true) {
                        int i7 = i5 + 1;
                        bArr2[i7] = (byte) i3;
                        if (i7 == i6) {
                            objArr[0] = new String(bArr2, 0);
                            return;
                        }
                        int i8 = i6;
                        i3 = (i3 - bArr[i2]) - 4;
                        i2++;
                        i6 = i8;
                        objArr = objArr;
                        bArr = bArr;
                        bArr2 = bArr2;
                        i5 = i7;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please submit an issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void d(short r6, int r7, int r8, java.lang.Object[] r9) {
                    /*
                        int r6 = r6 * 34
                        int r6 = 111 - r6
                        int r8 = r8 * 3
                        int r8 = r8 + 4
                        int r7 = r7 + 4
                        byte[] r0 = o.setBoxCornerRadiiResources.AnonymousClass1.$$d
                        byte[] r1 = new byte[r7]
                        int r7 = r7 + (-1)
                        r2 = 0
                        if (r0 != 0) goto L19
                        r3 = r1
                        r4 = 0
                        r1 = r0
                        r0 = r9
                        r9 = r8
                        goto L31
                    L19:
                        r3 = 0
                    L1a:
                        byte r4 = (byte) r6
                        r1[r3] = r4
                        int r4 = r3 + 1
                        if (r3 != r7) goto L29
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        r9[r2] = r6
                        return
                    L29:
                        r3 = r0[r8]
                        r5 = r9
                        r9 = r8
                        r8 = r3
                        r3 = r1
                        r1 = r0
                        r0 = r5
                    L31:
                        int r8 = -r8
                        int r6 = r6 + r8
                        int r8 = r9 + 1
                        r9 = r0
                        r0 = r1
                        r1 = r3
                        r3 = r4
                        goto L1a
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.setBoxCornerRadiiResources.AnonymousClass1.d(short, int, int, java.lang.Object[]):void");
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please submit an issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void e(short r7, int r8, int r9, java.lang.Object[] r10) {
                    /*
                        int r9 = r9 + 108
                        int r7 = r7 * 4
                        int r7 = r7 + 1
                        int r8 = r8 * 2
                        int r8 = 3 - r8
                        byte[] r0 = o.setBoxCornerRadiiResources.AnonymousClass1.$$g
                        byte[] r1 = new byte[r7]
                        r2 = 0
                        if (r0 != 0) goto L16
                        r3 = r9
                        r5 = 0
                        r9 = r8
                        r8 = r7
                        goto L2e
                    L16:
                        r3 = 0
                    L17:
                        byte r4 = (byte) r9
                        int r8 = r8 + 1
                        int r5 = r3 + 1
                        r1[r3] = r4
                        if (r5 != r7) goto L28
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        r10[r2] = r7
                        return
                    L28:
                        r3 = r0[r8]
                        r6 = r8
                        r8 = r7
                        r7 = r9
                        r9 = r6
                    L2e:
                        int r7 = r7 + r3
                        r3 = r5
                        r6 = r9
                        r9 = r7
                        r7 = r8
                        r8 = r6
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.setBoxCornerRadiiResources.AnonymousClass1.e(short, int, int, java.lang.Object[]):void");
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x038a  */
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onAnimationStart(android.animation.Animator r25) {
                    /*
                        Method dump skipped, instructions count: 1309
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.setBoxCornerRadiiResources.AnonymousClass1.onAnimationStart(android.animation.Animator):void");
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator2) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator2) {
                    setBoxCornerRadiiResources.this.setNavigationOnClickListener = 0;
                    setBoxCornerRadiiResources.this.setChipCornerRadius = null;
                    if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                        return;
                    }
                    FloatingActionButton floatingActionButton = setBoxCornerRadiiResources.this.FragmentStateAdapter$2;
                    boolean z2 = z;
                    floatingActionButton.setIconTintList(z2 ? 8 : 4, z2);
                    setIconTintList seticontintlist2 = seticontintlist;
                    if (seticontintlist2 != null) {
                        seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda1();
                    }
                }

                private static void b(int[] iArr, byte[] bArr, boolean z2, Object[] objArr) {
                    int i;
                    char[] cArr;
                    jx jxVar = new jx();
                    int i2 = 0;
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    int i5 = iArr[2];
                    int i6 = iArr[3];
                    char[] cArr2 = setLayoutAnimation;
                    char c = '0';
                    if (cArr2 != null) {
                        int length = cArr2.length;
                        char[] cArr3 = new char[length];
                        int i7 = 0;
                        while (i7 < length) {
                            try {
                                Object[] objArr2 = new Object[1];
                                objArr2[i2] = Integer.valueOf(cArr2[i7]);
                                Object obj = jC.setTextScaleX.get(-2065108825);
                                if (obj != null) {
                                    cArr = cArr2;
                                } else {
                                    byte b = (byte) i2;
                                    byte b2 = b;
                                    cArr = cArr2;
                                    Object[] objArr3 = new Object[1];
                                    e(b, b2, b2, objArr3);
                                    obj = ((Class) jC.setY(39 - TextUtils.indexOf("", c, i2), (char) (View.combineMeasuredStates(i2, i2) + 35090), 6 - TextUtils.indexOf("", ""))).getMethod((String) objArr3[0], Integer.TYPE);
                                    jC.setTextScaleX.put(-2065108825, obj);
                                }
                                cArr3[i7] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                                i7++;
                                cArr2 = cArr;
                                i2 = 0;
                                c = '0';
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
                    char[] cArr4 = new char[i4];
                    System.arraycopy(cArr2, i3, cArr4, 0, i4);
                    if (bArr != null) {
                        char[] cArr5 = new char[i4];
                        jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
                        char c2 = 0;
                        while (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 < i4) {
                            if (bArr[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] == 1) {
                                int i8 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0;
                                try {
                                    Object[] objArr4 = {Integer.valueOf(cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0]), Integer.valueOf(c2)};
                                    Object obj2 = jC.setTextScaleX.get(1237805447);
                                    if (obj2 == null) {
                                        byte b3 = (byte) 0;
                                        byte b4 = b3;
                                        Object[] objArr5 = new Object[1];
                                        e(b3, b4, (byte) (b4 + 1), objArr5);
                                        obj2 = ((Class) jC.setY(TextUtils.getTrimmedLength("") + 273, (char) (Process.getGidForName("") + 1), 5 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).getMethod((String) objArr5[0], Integer.TYPE, Integer.TYPE);
                                        jC.setTextScaleX.put(1237805447, obj2);
                                    }
                                    cArr5[i8] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else {
                                int i9 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0;
                                try {
                                    Object[] objArr6 = {Integer.valueOf(cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0]), Integer.valueOf(c2)};
                                    Object obj3 = jC.setTextScaleX.get(997913035);
                                    if (obj3 == null) {
                                        byte b5 = (byte) 0;
                                        byte b6 = b5;
                                        Object[] objArr7 = new Object[1];
                                        e(b5, b6, (byte) (b6 + 2), objArr7);
                                        obj3 = ((Class) jC.setY(269 - View.resolveSizeAndState(0, 0, 0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 5)).getMethod((String) objArr7[0], Integer.TYPE, Integer.TYPE);
                                        jC.setTextScaleX.put(997913035, obj3);
                                    }
                                    cArr5[i9] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 == null) {
                                        throw th3;
                                    }
                                    throw cause3;
                                }
                            }
                            c2 = cArr5[jxVar.MenuHostHelper$$ExternalSyntheticLambda0];
                            try {
                                Object[] objArr8 = {jxVar, jxVar};
                                Object obj4 = jC.setTextScaleX.get(1233791110);
                                if (obj4 == null) {
                                    byte b7 = (byte) 0;
                                    byte b8 = b7;
                                    Object[] objArr9 = new Object[1];
                                    e(b7, b8, (byte) (b8 + 3), objArr9);
                                    obj4 = ((Class) jC.setY((KeyEvent.getMaxKeyCode() >> 16) + 236, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 4 - ExpandableListView.getPackedPositionGroup(0L))).getMethod((String) objArr9[0], Object.class, Object.class);
                                    jC.setTextScaleX.put(1233791110, obj4);
                                }
                                ((Method) obj4).invoke(null, objArr8);
                            } catch (Throwable th4) {
                                Throwable cause4 = th4.getCause();
                                if (cause4 == null) {
                                    throw th4;
                                }
                                throw cause4;
                            }
                        }
                        cArr4 = cArr5;
                    }
                    if (i6 > 0) {
                        char[] cArr6 = new char[i4];
                        i = 0;
                        System.arraycopy(cArr4, 0, cArr6, 0, i4);
                        int i10 = i4 - i6;
                        System.arraycopy(cArr6, 0, cArr4, i10, i6);
                        System.arraycopy(cArr6, i6, cArr4, 0, i10);
                    } else {
                        i = 0;
                    }
                    if (z2) {
                        char[] cArr7 = new char[i4];
                        while (true) {
                            jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = i;
                            if (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 >= i4) {
                                break;
                            }
                            cArr7[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr4[(i4 - jxVar.MenuHostHelper$$ExternalSyntheticLambda0) - 1];
                            i = jxVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
                        }
                        cArr4 = cArr7;
                    }
                    if (i5 > 0) {
                        int i11 = 0;
                        while (true) {
                            jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = i11;
                            if (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 >= i4) {
                                break;
                            }
                            cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] = (char) (cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] - iArr[2]);
                            i11 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
                        }
                    }
                    objArr[0] = new String(cArr4);
                }
            });
            ArrayList<Animator.AnimatorListener> arrayList = this.setIconSize;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    iconTintList.addListener(it.next());
                }
            }
            iconTintList.start();
            return;
        }
        this.FragmentStateAdapter$2.setIconTintList(z ? 8 : 4, z);
        if (seticontintlist != null) {
            seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public final void setIconTintList(final setIconTintList seticontintlist, final boolean z) {
        AnimatorSet iconTintList;
        if (setX()) {
            return;
        }
        Animator animator = this.setChipCornerRadius;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = true;
        boolean z3 = this.SearchView$SavedState$1 == null;
        if ((!setBaselineAlignBottom.setConstraintSet(this.FragmentStateAdapter$2) || this.FragmentStateAdapter$2.isInEditMode()) ? false : false) {
            if (this.FragmentStateAdapter$2.getVisibility() != 0) {
                this.FragmentStateAdapter$2.setAlpha(0.0f);
                this.FragmentStateAdapter$2.setScaleY(z3 ? 0.4f : 0.0f);
                this.FragmentStateAdapter$2.setScaleX(z3 ? 0.4f : 0.0f);
                float f = z3 ? 0.4f : 0.0f;
                this.setZ = f;
                Matrix matrix = this.ExtendableSavedState$1;
                setIconTintList(f, matrix);
                this.FragmentStateAdapter$2.setImageMatrix(matrix);
            }
            FirebaseCommonKtxRegistrar firebaseCommonKtxRegistrar = this.SearchView$SavedState$1;
            if (firebaseCommonKtxRegistrar != null) {
                iconTintList = setY(firebaseCommonKtxRegistrar, 1.0f, 1.0f, 1.0f);
            } else {
                iconTintList = setIconTintList(1.0f, 1.0f, 1.0f, FloatingActionButton$BaseBehavior, setObjectValues);
            }
            iconTintList.addListener(new AnimatorListenerAdapter() { // from class: o.setBoxCornerRadiiResources.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator2) {
                    setBoxCornerRadiiResources.this.FragmentStateAdapter$2.setIconTintList(0, z);
                    setBoxCornerRadiiResources.this.setNavigationOnClickListener = 2;
                    setBoxCornerRadiiResources.this.setChipCornerRadius = animator2;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator2) {
                    setBoxCornerRadiiResources.this.setNavigationOnClickListener = 0;
                    setBoxCornerRadiiResources.this.setChipCornerRadius = null;
                    setIconTintList seticontintlist2 = seticontintlist;
                    if (seticontintlist2 != null) {
                        seticontintlist2.setY();
                    }
                }
            });
            ArrayList<Animator.AnimatorListener> arrayList = this.setChipIconTintResource;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    iconTintList.addListener(it.next());
                }
            }
            iconTintList.start();
            return;
        }
        this.FragmentStateAdapter$2.setIconTintList(0, z);
        this.FragmentStateAdapter$2.setAlpha(1.0f);
        this.FragmentStateAdapter$2.setScaleY(1.0f);
        this.FragmentStateAdapter$2.setScaleX(1.0f);
        this.setZ = 1.0f;
        Matrix matrix2 = this.ExtendableSavedState$1;
        setIconTintList(1.0f, matrix2);
        this.FragmentStateAdapter$2.setImageMatrix(matrix2);
        if (seticontintlist != null) {
            seticontintlist.setY();
        }
    }

    private AnimatorSet setY(FirebaseCommonKtxRegistrar firebaseCommonKtxRegistrar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.FragmentStateAdapter$2, View.ALPHA, f);
        firebaseCommonKtxRegistrar.setIconTintList("opacity").MenuHostHelper$$ExternalSyntheticLambda1(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.FragmentStateAdapter$2, View.SCALE_X, f2);
        firebaseCommonKtxRegistrar.setIconTintList("scale").MenuHostHelper$$ExternalSyntheticLambda1(ofFloat2);
        if (Build.VERSION.SDK_INT == 26) {
            ofFloat2.setEvaluator(new TypeEvaluator<Float>() { // from class: o.setBoxCornerRadiiResources.3
                private FloatEvaluator setIconTintList = new FloatEvaluator();

                @Override // android.animation.TypeEvaluator
                public final /* synthetic */ Float evaluate(float f4, Float f5, Float f6) {
                    float floatValue = this.setIconTintList.evaluate(f4, (Number) f5, (Number) f6).floatValue();
                    if (floatValue < 0.1f) {
                        floatValue = 0.0f;
                    }
                    return Float.valueOf(floatValue);
                }
            });
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.FragmentStateAdapter$2, View.SCALE_Y, f2);
        firebaseCommonKtxRegistrar.setIconTintList("scale").MenuHostHelper$$ExternalSyntheticLambda1(ofFloat3);
        if (Build.VERSION.SDK_INT == 26) {
            ofFloat3.setEvaluator(new TypeEvaluator<Float>() { // from class: o.setBoxCornerRadiiResources.3
                private FloatEvaluator setIconTintList = new FloatEvaluator();

                @Override // android.animation.TypeEvaluator
                public final /* synthetic */ Float evaluate(float f4, Float f5, Float f6) {
                    float floatValue = this.setIconTintList.evaluate(f4, (Number) f5, (Number) f6).floatValue();
                    if (floatValue < 0.1f) {
                        floatValue = 0.0f;
                    }
                    return Float.valueOf(floatValue);
                }
            });
        }
        arrayList.add(ofFloat3);
        setIconTintList(f3, this.ExtendableSavedState$1);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.FragmentStateAdapter$2, new CctBackendFactory(), new getVisibleInsets() { // from class: o.setBoxCornerRadiiResources.4
            @Override // o.getVisibleInsets, android.animation.TypeEvaluator
            public final /* synthetic */ Matrix evaluate(float f4, Matrix matrix, Matrix matrix2) {
                setBoxCornerRadiiResources.this.setZ = f4;
                return super.evaluate(f4, matrix, matrix2);
            }

            @Override // o.getVisibleInsets
            public final Matrix setY(float f4, Matrix matrix, Matrix matrix2) {
                setBoxCornerRadiiResources.this.setZ = f4;
                return super.evaluate(f4, matrix, matrix2);
            }
        }, new Matrix(this.ExtendableSavedState$1));
        firebaseCommonKtxRegistrar.setIconTintList("iconScale").MenuHostHelper$$ExternalSyntheticLambda1(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        setImeActionLabel.setX(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet setIconTintList(final float f, final float f2, final float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float alpha = this.FragmentStateAdapter$2.getAlpha();
        final float scaleX = this.FragmentStateAdapter$2.getScaleX();
        final float scaleY = this.FragmentStateAdapter$2.getScaleY();
        final float f4 = this.setZ;
        final Matrix matrix = new Matrix(this.ExtendableSavedState$1);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.setBoxCornerRadiiResources.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                setBoxCornerRadiiResources.this.FragmentStateAdapter$2.setAlpha(setCardElevation.setX(alpha, f, 0.0f, 0.2f, floatValue));
                FloatingActionButton floatingActionButton = setBoxCornerRadiiResources.this.FragmentStateAdapter$2;
                float f5 = scaleX;
                floatingActionButton.setScaleX(f5 + ((f2 - f5) * floatValue));
                FloatingActionButton floatingActionButton2 = setBoxCornerRadiiResources.this.FragmentStateAdapter$2;
                float f6 = scaleY;
                floatingActionButton2.setScaleY(f6 + ((f2 - f6) * floatValue));
                setBoxCornerRadiiResources setboxcornerradiiresources = setBoxCornerRadiiResources.this;
                float f7 = f4;
                setboxcornerradiiresources.setZ = f7 + ((f3 - f7) * floatValue);
                setBoxCornerRadiiResources setboxcornerradiiresources2 = setBoxCornerRadiiResources.this;
                float f8 = f4;
                setboxcornerradiiresources2.setIconTintList(f8 + (floatValue * (f3 - f8)), matrix);
                setBoxCornerRadiiResources.this.FragmentStateAdapter$2.setImageMatrix(matrix);
            }
        });
        arrayList.add(ofFloat);
        setImeActionLabel.setX(animatorSet, arrayList);
        Context context = this.FragmentStateAdapter$2.getContext();
        this.FragmentStateAdapter$2.getContext();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            typedValue = null;
        }
        int i3 = 300;
        if (typedValue != null && typedValue.type == 16) {
            i3 = typedValue.data;
        }
        animatorSet.setDuration(i3);
        animatorSet.setInterpolator(setChipMinHeight.MenuHostHelper$$ExternalSyntheticLambda0(this.FragmentStateAdapter$2.getContext(), i2, setCardElevation.MenuHostHelper$$ExternalSyntheticLambda0));
        return animatorSet;
    }

    public final void setOnLongClickListener() {
        ArrayList<setBoxCornerRadiiResources$MenuHostHelper$$ExternalSyntheticLambda0> arrayList = this.FragmentStateAdapter$5;
        if (arrayList != null) {
            Iterator<setBoxCornerRadiiResources$MenuHostHelper$$ExternalSyntheticLambda0> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setX();
            }
        }
    }

    public final void setUnboundedRipple() {
        ArrayList<setBoxCornerRadiiResources$MenuHostHelper$$ExternalSyntheticLambda0> arrayList = this.FragmentStateAdapter$5;
        if (arrayList != null) {
            Iterator<setBoxCornerRadiiResources$MenuHostHelper$$ExternalSyntheticLambda0> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setY();
            }
        }
    }

    public final void setChipCornerRadius() {
        Rect rect = this.setFilterTouchesWhenObscured;
        MenuHostHelper$$ExternalSyntheticLambda0(rect);
        setY(rect);
        this.setGuidelinePercent.setY(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda0(Rect rect) {
        int i;
        if (this.ViewPager$SavedState$1) {
            int i2 = this.setAnimationFromJson;
            FloatingActionButton floatingActionButton = this.FragmentStateAdapter$2;
            i = (i2 - floatingActionButton.setIconTintList(floatingActionButton.setUnboundedRipple)) / 2;
        } else {
            i = 0;
        }
        float y = this.setMinAndMaxProgress ? setY() + this.setTextAppearanceResource : 0.0f;
        int max = Math.max(i, (int) Math.ceil(y));
        int max2 = Math.max(i, (int) Math.ceil(y * 1.5f));
        rect.set(max, max2, max, max2);
    }

    private void setY(Rect rect) {
        if (this.setLayoutAnimation != null) {
            if (setLayoutAnimation()) {
                this.setGuidelinePercent.setX(new InsetDrawable(this.setLayoutAnimation, rect.left, rect.top, rect.right, rect.bottom));
                return;
            }
            this.setGuidelinePercent.setX(this.setLayoutAnimation);
            return;
        }
        throw new NullPointerException("Didn't initialize content background");
    }

    setWebViewClient MenuHostHelper$$ExternalSyntheticLambda0() {
        return new setWebViewClient(this.setHasDecor);
    }

    public final boolean setX() {
        return this.FragmentStateAdapter$2.getVisibility() != 0 ? this.setNavigationOnClickListener == 2 : this.setNavigationOnClickListener != 1;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.FragmentStateAdapter$2.getVisibility() == 0 ? this.setNavigationOnClickListener == 1 : this.setNavigationOnClickListener != 2;
    }

    private static ValueAnimator setIconTintList(setOnLongClickListener setonlongclicklistener) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(setY);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(setonlongclicklistener);
        valueAnimator.addUpdateListener(setonlongclicklistener);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class setOnLongClickListener extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private float setIconTintList;
        private boolean setX;
        private float setY;

        protected abstract float MenuHostHelper$$ExternalSyntheticLambda0();

        private setOnLongClickListener() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ setOnLongClickListener(setBoxCornerRadiiResources setboxcornerradiiresources, byte b) {
            this();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.setX) {
                this.setIconTintList = setBoxCornerRadiiResources.this.setIconified == null ? 0.0f : setBoxCornerRadiiResources.this.setIconified.setChipIconTintResource.setY;
                this.setY = MenuHostHelper$$ExternalSyntheticLambda0();
                this.setX = true;
            }
            setBoxCornerRadiiResources setboxcornerradiiresources = setBoxCornerRadiiResources.this;
            float f = this.setIconTintList;
            float animatedFraction = (int) (f + ((this.setY - f) * valueAnimator.getAnimatedFraction()));
            setWebViewClient setwebviewclient = setboxcornerradiiresources.setIconified;
            if (setwebviewclient != null) {
                setwebviewclient.setIconSize(animatedFraction);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            setBoxCornerRadiiResources setboxcornerradiiresources = setBoxCornerRadiiResources.this;
            float f = (int) this.setY;
            setWebViewClient setwebviewclient = setboxcornerradiiresources.setIconified;
            if (setwebviewclient != null) {
                setwebviewclient.setIconSize(f);
            }
            this.setX = false;
        }
    }

    /* loaded from: classes.dex */
    class setNavigationOnClickListener extends setOnLongClickListener {
        setNavigationOnClickListener() {
            super(setBoxCornerRadiiResources.this, (byte) 0);
        }

        @Override // o.setBoxCornerRadiiResources.setOnLongClickListener
        protected final float MenuHostHelper$$ExternalSyntheticLambda0() {
            return setBoxCornerRadiiResources.this.setCenterIfNoTextEnabled;
        }
    }

    /* loaded from: classes.dex */
    class setY extends setOnLongClickListener {
        setY() {
            super(setBoxCornerRadiiResources.this, (byte) 0);
        }

        @Override // o.setBoxCornerRadiiResources.setOnLongClickListener
        protected final float MenuHostHelper$$ExternalSyntheticLambda0() {
            return setBoxCornerRadiiResources.this.setCenterIfNoTextEnabled + setBoxCornerRadiiResources.this.setTextAppearanceResource;
        }
    }

    /* loaded from: classes.dex */
    class setX extends setOnLongClickListener {
        @Override // o.setBoxCornerRadiiResources.setOnLongClickListener
        protected final float MenuHostHelper$$ExternalSyntheticLambda0() {
            return 0.0f;
        }

        setX() {
            super(setBoxCornerRadiiResources.this, (byte) 0);
        }
    }

    void setCenterIfNoTextEnabled() {
        int i;
        setWebViewClient setwebviewclient = this.setIconified;
        if (setwebviewclient == null || setwebviewclient.setChipIconTintResource.setChipCornerRadius == (i = (int) this.setCheckedIconEnabled)) {
            return;
        }
        setwebviewclient.setChipIconTintResource.setChipCornerRadius = i;
        setwebviewclient.setX();
    }
}