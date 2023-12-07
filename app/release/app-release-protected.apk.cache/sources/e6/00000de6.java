package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.List;
import o.setBaselineAlignBottom;
import o.setDecorPadding;
import o.setScrollBarDefaultDelayBeforeFade;
import o.unwrap;

/* loaded from: classes.dex */
public class setOnCloseListener extends setCheckableResource implements DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1, FragmentManager$LaunchedFragmentInfo$1, unwrap<setOnCloseListener> {
    static final Rect MenuHostHelper$$ExternalSyntheticLambda0;
    private static char SearchView$SavedState$1;
    private static char setCheckedIconEnabled;
    private static char setChipIconTintResource;
    private static char setHasDecor;
    private static final int[] setLayoutAnimation;
    private static final int[] setOnLongClickListener;
    private static final int setUiOptions;
    boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private CharSequence ViewPager$SavedState$1;
    private int setAnimationFromJson;
    private boolean setCenterIfNoTextEnabled;
    private boolean setChipCornerRadius;
    private final RectF setGuidelinePercent;
    private boolean setIconSize;
    DynamiteApi setIconTintList;
    private final setIconTintList setLayoutDirection;
    private int setMaxEms;
    private RippleDrawable setMinAndMaxProgress;
    View.OnClickListener setNavigationOnClickListener;
    private InsetDrawable setOnNavigationItemSelectedListener;
    private boolean setTextAlignment;
    private boolean setTextAppearanceResource;
    private final setNumStars setTextScaleX;
    unwrap.setY<setOnCloseListener> setX;
    CompoundButton.OnCheckedChangeListener setY;
    private final Rect setZ;
    public static final byte[] $$g = {84, -107, -124, 66};
    public static final int $$h = 221;
    public static final byte[] $$d = {110, -41, 63, 58, 13, -16, 42, -27, -13, 0, 25, -22, -6, -7, 39, -30, -11, -2, 64, -63, 40};
    public static final int $$e = C0564we.setX;
    public static final byte[] $$a = {59, -103, 22, 57, 1, -28, 15, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 35};
    public static final int $$b = 204;
    private static byte[] ExtendableSavedState$1 = {56, -13, -61, 104, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
    public static final int setUnboundedRipple = 100;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.setOnCloseListener.$$a
            int r8 = r8 * 3
            int r8 = 7 - r8
            int r6 = r6 * 36
            int r6 = 40 - r6
            int r7 = r7 * 38
            int r7 = 115 - r7
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r7
            r4 = 0
            r7 = r6
            goto L2e
        L19:
            r3 = 0
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r8]
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r3 = -r3
            int r8 = r8 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-13)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnCloseListener.a(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 105
            int r8 = r8 + 4
            int r7 = r7 * 4
            int r7 = 16 - r7
            byte[] r0 = o.setOnCloseListener.ExtendableSavedState$1
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L31
        L17:
            r3 = 0
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
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
            int r6 = r6 + r8
            int r6 = r6 + 2
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnCloseListener.c(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 11
            int r7 = r7 + 4
            byte[] r0 = o.setOnCloseListener.$$d
            int r8 = r8 * 4
            int r8 = r8 + 111
            int r6 = r6 * 14
            int r6 = 18 - r6
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L1a
            r8 = r7
            r3 = r8
            r4 = 0
            r7 = r6
            goto L30
        L1a:
            r3 = 0
        L1b:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L30:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-1)
            int r7 = r7 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnCloseListener.d(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = o.setOnCloseListener.$$g
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r9 = r9 * 2
            int r9 = r9 + 117
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L1a
            r9 = r8
            r3 = r1
            r5 = 0
            r1 = r0
            r0 = r10
            r10 = r7
            goto L36
        L1a:
            r3 = 0
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L1f:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L2e
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2e:
            r3 = r0[r9]
            r6 = r10
            r10 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L36:
            int r8 = -r8
            int r7 = r7 + r8
            int r9 = r9 + 1
            r8 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnCloseListener.e(byte, int, byte, java.lang.Object[]):void");
    }

    static void setLayoutAnimation() {
        SearchView$SavedState$1 = (char) 55169;
        setCheckedIconEnabled = (char) 56749;
        setChipIconTintResource = (char) 17434;
        setHasDecor = (char) 51142;
    }

    public void setHideMotionSpec(FirebaseCommonKtxRegistrar firebaseCommonKtxRegistrar) {
    }

    public void setShowMotionSpec(FirebaseCommonKtxRegistrar firebaseCommonKtxRegistrar) {
    }

    static {
        setLayoutAnimation();
        setUiOptions = R.style._res_0x7f1503c4;
        MenuHostHelper$$ExternalSyntheticLambda0 = new Rect();
        setLayoutAnimation = new int[]{16842913};
        setOnLongClickListener = new int[]{16842911};
    }

    public setOnCloseListener(Context context) {
        this(context, null);
    }

    public setOnCloseListener(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f0400bc);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public setOnCloseListener(android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnCloseListener.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0 != null && dynamiteApi.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList) {
            dynamiteApi.ViewPager$SavedState$1(setTitleMargin.setX(this));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setIconSize(f);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        DynamiteApi dynamiteApi = this.setIconTintList;
        accessibilityNodeInfo.setCheckable(dynamiteApi != null && dynamiteApi.setIconTintList);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof setOnGenericMotionListener) {
            setOnGenericMotionListener setongenericmotionlistener = (setOnGenericMotionListener) getParent();
            setDecorPadding y = setDecorPadding.setY(accessibilityNodeInfo);
            if (setongenericmotionlistener.MenuHostHelper$$ExternalSyntheticLambda1()) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= setongenericmotionlistener.getChildCount()) {
                        i3 = -1;
                        break;
                    }
                    View childAt = setongenericmotionlistener.getChildAt(i2);
                    if (childAt instanceof setOnCloseListener) {
                        if (!(setongenericmotionlistener.getChildAt(i2).getVisibility() == 0)) {
                            continue;
                        } else if (((setOnCloseListener) childAt) == this) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i2++;
                }
                i = i3;
            } else {
                i = -1;
            }
            Object tag = getTag(R.id.res_0x7f0a018c);
            y.setY(setDecorPadding.setY.MenuHostHelper$$ExternalSyntheticLambda0(!(tag instanceof Integer) ? -1 : ((Integer) tag).intValue(), 1, i, 1, false, isChecked()));
        }
    }

    private void setNavigationOnClickListener() {
        if (setOnLongClickListener()) {
            DynamiteApi dynamiteApi = this.setIconTintList;
            if ((dynamiteApi != null && dynamiteApi.setTextAlignment) && this.setNavigationOnClickListener != null) {
                setBaselineAlignBottom.setX(this, this.setLayoutDirection);
                this.setTextAppearanceResource = true;
                return;
            }
        }
        setBaselineAlignBottom.setX(this, (setCounterOverflowTextColor) null);
        this.setTextAppearanceResource = false;
    }

    private void setTextAlignment() {
        DynamiteApi dynamiteApi;
        if (TextUtils.isEmpty(getText()) || (dynamiteApi = this.setIconTintList) == null) {
            return;
        }
        float f = dynamiteApi.MenuHostHelper$$ExternalSyntheticLambda0;
        float f2 = this.setIconTintList.setTextAppearanceResource;
        DynamiteApi dynamiteApi2 = this.setIconTintList;
        int i = (int) (f + f2 + (dynamiteApi2.setTextAlignment && dynamiteApi2.setLayoutAnimation != null ? dynamiteApi2.setIconSize + dynamiteApi2.setChipCornerRadius + dynamiteApi2.setUnboundedRipple : 0.0f));
        int MenuHostHelper$$ExternalSyntheticLambda02 = (int) (this.setIconTintList.setUiOptions + this.setIconTintList.setLayoutDirection + this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0());
        if (this.setOnNavigationItemSelectedListener != null) {
            Rect rect = new Rect();
            this.setOnNavigationItemSelectedListener.getPadding(rect);
            MenuHostHelper$$ExternalSyntheticLambda02 += rect.left;
            i += rect.right;
        }
        setBaselineAlignBottom.setX.setX(this, MenuHostHelper$$ExternalSyntheticLambda02, getPaddingTop(), i, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.setMaxEms != i) {
            this.setMaxEms = i;
            setTextAlignment();
        }
    }

    public void setChipDrawable(DynamiteApi dynamiteApi) {
        DynamiteApi dynamiteApi2 = this.setIconTintList;
        if (dynamiteApi2 != dynamiteApi) {
            if (dynamiteApi2 != null) {
                dynamiteApi2.setTextScaleX = new WeakReference<>(null);
            }
            this.setIconTintList = dynamiteApi;
            dynamiteApi.setAnimationFromJson = false;
            this.setIconTintList.setTextScaleX = new WeakReference<>(this);
            MenuHostHelper$$ExternalSyntheticLambda1(this.setAnimationFromJson);
        }
    }

    private void setIconSize() {
        if (setChipText.MenuHostHelper$$ExternalSyntheticLambda0) {
            setChipCornerRadius();
            return;
        }
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (!dynamiteApi.setIconified) {
            dynamiteApi.setIconified = true;
            dynamiteApi.ViewPager$SavedState$1 = dynamiteApi.setIconified ? setChipText.setY(dynamiteApi.setZ) : null;
            dynamiteApi.onStateChange(dynamiteApi.getState());
        }
        Drawable drawable = this.setOnNavigationItemSelectedListener;
        if (drawable == null) {
            drawable = this.setIconTintList;
        }
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(this, drawable);
        setTextAlignment();
        setUnboundedRipple();
    }

    private void setChipCornerRadius() {
        ColorStateList y = setChipText.setY(this.setIconTintList.setZ);
        Drawable drawable = this.setOnNavigationItemSelectedListener;
        if (drawable == null) {
            drawable = this.setIconTintList;
        }
        this.setMinAndMaxProgress = new RippleDrawable(y, drawable, null);
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi.setIconified) {
            dynamiteApi.setIconified = false;
            dynamiteApi.ViewPager$SavedState$1 = dynamiteApi.setIconified ? setChipText.setY(dynamiteApi.setZ) : null;
            dynamiteApi.onStateChange(dynamiteApi.getState());
        }
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(this, this.setMinAndMaxProgress);
        setTextAlignment();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, setLayoutAnimation);
        }
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null && dynamiteApi.setIconTintList) {
            mergeDrawableStates(onCreateDrawableState, setOnLongClickListener);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // o.setCheckableResource, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // o.setCheckableResource, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // o.setCheckableResource, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            return dynamiteApi.setGuidelinePercent;
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.setIconTintList == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setGuidelinePercent = truncateAt;
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setOnNavigationItemSelectedListener = i;
        }
    }

    @Override // o.DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        MenuHostHelper$$ExternalSyntheticLambda1(this.setAnimationFromJson);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi == null) {
            this.setChipCornerRadius = z;
        } else if (dynamiteApi.setIconTintList) {
            super.setChecked(z);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.setY = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.setNavigationOnClickListener = onClickListener;
        setNavigationOnClickListener();
    }

    public final boolean setX() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.setNavigationOnClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.setTextAppearanceResource) {
            this.setLayoutDirection.MenuHostHelper$$ExternalSyntheticLambda1(1, 1);
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.setY()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L43
            if (r0 == r3) goto L2f
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L38
            goto L50
        L21:
            boolean r0 = r5.setCenterIfNoTextEnabled
            if (r0 == 0) goto L50
            if (r1 != 0) goto L4e
            if (r0 == 0) goto L4e
            r5.setCenterIfNoTextEnabled = r2
            r5.refreshDrawableState()
            goto L4e
        L2f:
            boolean r0 = r5.setCenterIfNoTextEnabled
            if (r0 == 0) goto L38
            r5.setX()
            r0 = 1
            goto L39
        L38:
            r0 = 0
        L39:
            boolean r1 = r5.setCenterIfNoTextEnabled
            if (r1 == 0) goto L51
            r5.setCenterIfNoTextEnabled = r2
            r5.refreshDrawableState()
            goto L51
        L43:
            if (r1 == 0) goto L50
            boolean r0 = r5.setCenterIfNoTextEnabled
            if (r0 == r3) goto L4e
            r5.setCenterIfNoTextEnabled = r3
            r5.refreshDrawableState()
        L4e:
            r0 = 1
            goto L51
        L50:
            r0 = 0
        L51:
            if (r0 != 0) goto L59
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
        L59:
            r2 = 1
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnCloseListener.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            boolean contains = setY().contains(motionEvent.getX(), motionEvent.getY());
            if (this.setIconSize != contains) {
                this.setIconSize = contains;
                refreshDrawableState();
            }
        } else if (actionMasked == 10 && this.setIconSize) {
            this.setIconSize = false;
            refreshDrawableState();
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.setTextAppearanceResource) {
            return this.setLayoutDirection.setIconTintList(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.setTextAppearanceResource) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.setLayoutDirection.MenuHostHelper$$ExternalSyntheticLambda0(keyEvent) || ((RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1) this.setLayoutDirection).MenuHostHelper$$ExternalSyntheticLambda1 == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.setTextAppearanceResource) {
            this.setLayoutDirection.MenuHostHelper$$ExternalSyntheticLambda1(z, i, rect);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.setTextAppearanceResource && (((RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1) this.setLayoutDirection).MenuHostHelper$$ExternalSyntheticLambda1 == 1 || this.setLayoutDirection.MenuHostHelper$$ExternalSyntheticLambda0 == 1)) {
            rect.set(setIconTintList());
        } else {
            super.getFocusedRect(rect);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [boolean, int] */
    @Override // o.setCheckableResource, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        DynamiteApi dynamiteApi = this.setIconTintList;
        boolean z = false;
        int i = 0;
        z = false;
        if (dynamiteApi != null) {
            Drawable drawable = dynamiteApi.setLayoutAnimation;
            if (drawable != null && drawable.isStateful()) {
                DynamiteApi dynamiteApi2 = this.setIconTintList;
                ?? isEnabled = isEnabled();
                int i2 = isEnabled;
                if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                    i2 = isEnabled + 1;
                }
                int i3 = i2;
                if (this.setIconSize) {
                    i3 = i2 + 1;
                }
                int i4 = i3;
                if (this.setCenterIfNoTextEnabled) {
                    i4 = i3 + 1;
                }
                int i5 = i4;
                if (isChecked()) {
                    i5 = i4 + 1;
                }
                int[] iArr = new int[i5];
                if (isEnabled()) {
                    iArr[0] = 16842910;
                    i = 1;
                }
                if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                    iArr[i] = 16842908;
                    i++;
                }
                if (this.setIconSize) {
                    iArr[i] = 16843623;
                    i++;
                }
                if (this.setCenterIfNoTextEnabled) {
                    iArr[i] = 16842919;
                    i++;
                }
                if (isChecked()) {
                    iArr[i] = 16842913;
                }
                z = dynamiteApi2.setX(iArr);
            }
        }
        if (z) {
            invalidate();
        }
    }

    private boolean setOnLongClickListener() {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            Drawable drawable = dynamiteApi.setLayoutAnimation;
            if ((drawable != null ? setEnsureMinTouchTargetSize.setOnLongClickListener(drawable) : null) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final android.graphics.RectF setY() {
        /*
            r6 = this;
            android.graphics.RectF r0 = r6.setGuidelinePercent
            r0.setEmpty()
            o.DynamiteApi r0 = r6.setIconTintList
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L19
            android.graphics.drawable.Drawable r0 = r0.setLayoutAnimation
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable r0 = o.setEnsureMinTouchTargetSize.setOnLongClickListener(r0)
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 == 0) goto L6b
            android.view.View$OnClickListener r0 = r6.setNavigationOnClickListener
            if (r0 == 0) goto L6b
            o.DynamiteApi r0 = r6.setIconTintList
            android.graphics.RectF r3 = r6.setGuidelinePercent
            android.graphics.Rect r4 = r0.getBounds()
            r3.setEmpty()
            boolean r5 = r0.setTextAlignment
            if (r5 == 0) goto L34
            android.graphics.drawable.Drawable r5 = r0.setLayoutAnimation
            if (r5 == 0) goto L34
            goto L35
        L34:
            r1 = 0
        L35:
            if (r1 == 0) goto L6b
            float r1 = r0.MenuHostHelper$$ExternalSyntheticLambda0
            float r2 = r0.setUnboundedRipple
            float r1 = r1 + r2
            float r2 = r0.setChipCornerRadius
            float r1 = r1 + r2
            float r2 = r0.setIconSize
            float r1 = r1 + r2
            float r2 = r0.setTextAppearanceResource
            float r1 = r1 + r2
            int r0 = o.setEnsureMinTouchTargetSize.setIconTintList(r0)
            if (r0 != 0) goto L56
            int r0 = r4.right
            float r0 = (float) r0
            r3.right = r0
            float r0 = r3.right
            float r0 = r0 - r1
            r3.left = r0
            goto L61
        L56:
            int r0 = r4.left
            float r0 = (float) r0
            r3.left = r0
            int r0 = r4.left
            float r0 = (float) r0
            float r0 = r0 + r1
            r3.right = r0
        L61:
            int r0 = r4.top
            float r0 = (float) r0
            r3.top = r0
            int r0 = r4.bottom
            float r0 = (float) r0
            r3.bottom = r0
        L6b:
            android.graphics.RectF r0 = r6.setGuidelinePercent
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnCloseListener.setY():android.graphics.RectF");
    }

    final Rect setIconTintList() {
        RectF y = setY();
        this.setZ.set((int) y.left, (int) y.top, (int) y.right, (int) y.bottom);
        return this.setZ;
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        PointerIcon systemIcon;
        if (setY().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            return systemIcon;
        }
        return null;
    }

    @Override // o.unwrap
    public void setInternalOnCheckedChangeListener(unwrap.setY<setOnCloseListener> sety) {
        this.setX = sety;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setIconTintList extends RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 {
        setIconTintList(setOnCloseListener setoncloselistener) {
            super(setoncloselistener);
        }

        @Override // o.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1
        public final int setIconTintList(float f, float f2) {
            return (setOnCloseListener.MenuHostHelper$$ExternalSyntheticLambda0(setOnCloseListener.this) && setOnCloseListener.this.setY().contains(f, f2)) ? 1 : 0;
        }

        @Override // o.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1
        public final void MenuHostHelper$$ExternalSyntheticLambda0(List<Integer> list) {
            boolean z = false;
            list.add(0);
            if (setOnCloseListener.MenuHostHelper$$ExternalSyntheticLambda0(setOnCloseListener.this)) {
                DynamiteApi dynamiteApi = setOnCloseListener.this.setIconTintList;
                if (dynamiteApi != null && dynamiteApi.setTextAlignment) {
                    z = true;
                }
                if (!z || setOnCloseListener.this.setNavigationOnClickListener == null) {
                    return;
                }
                list.add(1);
            }
        }

        @Override // o.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1
        public final void setY(int i, boolean z) {
            if (i == 1) {
                setOnCloseListener.this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
                setOnCloseListener.this.refreshDrawableState();
            }
        }

        @Override // o.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1
        public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, setDecorPadding setdecorpadding) {
            if (i != 1) {
                setdecorpadding.MenuHostHelper$$ExternalSyntheticLambda0("");
                setdecorpadding.setY(setOnCloseListener.MenuHostHelper$$ExternalSyntheticLambda0);
                return;
            }
            DynamiteApi dynamiteApi = setOnCloseListener.this.setIconTintList;
            CharSequence charSequence = dynamiteApi != null ? dynamiteApi.setOnLongClickListener : null;
            if (charSequence != null) {
                setdecorpadding.MenuHostHelper$$ExternalSyntheticLambda0(charSequence);
            } else {
                CharSequence text = setOnCloseListener.this.getText();
                Context context = setOnCloseListener.this.getContext();
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                setdecorpadding.MenuHostHelper$$ExternalSyntheticLambda0(context.getString(R.string.res_0x7f140072, objArr).trim());
            }
            setdecorpadding.setY(setOnCloseListener.this.setIconTintList());
            setdecorpadding.setIconTintList(setDecorPadding.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1);
            setdecorpadding.setUiOptions(setOnCloseListener.this.isEnabled());
        }

        @Override // o.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1
        public final void setX(setDecorPadding setdecorpadding) {
            DynamiteApi dynamiteApi = setOnCloseListener.this.setIconTintList;
            setdecorpadding.setX(dynamiteApi != null && dynamiteApi.setIconTintList);
            setdecorpadding.setIconTintList(setOnCloseListener.this.isClickable());
            setdecorpadding.setIconTintList(setOnCloseListener.this.getAccessibilityClassName());
            CharSequence text = setOnCloseListener.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                setdecorpadding.setNavigationOnClickListener(text);
            } else {
                setdecorpadding.MenuHostHelper$$ExternalSyntheticLambda0(text);
            }
        }

        @Override // o.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1
        public final boolean setX(int i, int i2) {
            if (i2 == 16) {
                if (i == 0) {
                    return setOnCloseListener.this.performClick();
                }
                if (i == 1) {
                    return setOnCloseListener.this.setX();
                }
                return false;
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
        r3 = o.setLineHeight.setIconTintList(r0.setCenterIfNoTextEnabled, r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setChipBackgroundColorResource(int r3) {
        /*
            r2 = this;
            o.DynamiteApi r0 = r2.setIconTintList
            if (r0 == 0) goto L17
            android.content.Context r1 = r0.setCenterIfNoTextEnabled
            android.content.res.ColorStateList r3 = o.setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(r1, r3)
            android.content.res.ColorStateList r1 = r0.setX
            if (r1 == r3) goto L17
            r0.setX = r3
            int[] r3 = r0.getState()
            r0.onStateChange(r3)
        L17:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnCloseListener.setChipBackgroundColorResource(int):void");
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi == null || dynamiteApi.setX == colorStateList) {
            return;
        }
        dynamiteApi.setX = colorStateList;
        dynamiteApi.onStateChange(dynamiteApi.getState());
    }

    public void setChipMinHeightResource(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setX(dynamiteApi.setCenterIfNoTextEnabled.getResources().getDimension(i));
        }
    }

    public void setChipMinHeight(float f) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setX(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            float dimension = dynamiteApi.setCenterIfNoTextEnabled.getResources().getDimension(i);
            if (dynamiteApi.MenuHostHelper$$ExternalSyntheticLambda1 != dimension) {
                dynamiteApi.MenuHostHelper$$ExternalSyntheticLambda1 = dimension;
                setScrollBarDefaultDelayBeforeFade.setY sety = new setScrollBarDefaultDelayBeforeFade.setY(dynamiteApi.setChipIconTintResource.setTextAlignment);
                sety.setNavigationOnClickListener = new setActionBarVisibilityCallback(dimension);
                sety.ViewPager$SavedState$1 = new setActionBarVisibilityCallback(dimension);
                sety.setIconTintList = new setActionBarVisibilityCallback(dimension);
                sety.setY = new setActionBarVisibilityCallback(dimension);
                dynamiteApi.setShapeAppearanceModel(new setScrollBarDefaultDelayBeforeFade(sety, (byte) 0));
            }
        }
    }

    @Override // o.FragmentManager$LaunchedFragmentInfo$1
    public void setShapeAppearanceModel(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        this.setIconTintList.setShapeAppearanceModel(setscrollbardefaultdelaybeforefade);
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi == null || dynamiteApi.MenuHostHelper$$ExternalSyntheticLambda1 == f) {
            return;
        }
        dynamiteApi.MenuHostHelper$$ExternalSyntheticLambda1 = f;
        setScrollBarDefaultDelayBeforeFade.setY sety = new setScrollBarDefaultDelayBeforeFade.setY(dynamiteApi.setChipIconTintResource.setTextAlignment);
        sety.setNavigationOnClickListener = new setActionBarVisibilityCallback(f);
        sety.ViewPager$SavedState$1 = new setActionBarVisibilityCallback(f);
        sety.setIconTintList = new setActionBarVisibilityCallback(f);
        sety.setY = new setActionBarVisibilityCallback(f);
        dynamiteApi.setShapeAppearanceModel(new setScrollBarDefaultDelayBeforeFade(sety, (byte) 0));
    }

    public void setChipStrokeColorResource(int i) {
        ColorStateList iconTintList;
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            iconTintList = setLineHeight.setIconTintList(dynamiteApi.setCenterIfNoTextEnabled, i);
            dynamiteApi.setIconTintList(iconTintList);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setIconTintList(colorStateList);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.MenuHostHelper$$ExternalSyntheticLambda0(dynamiteApi.setCenterIfNoTextEnabled.getResources().getDimension(i));
        }
    }

    public void setChipStrokeWidth(float f) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.MenuHostHelper$$ExternalSyntheticLambda0(f);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList iconTintList;
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            iconTintList = setLineHeight.setIconTintList(dynamiteApi.setCenterIfNoTextEnabled, i);
            dynamiteApi.MenuHostHelper$$ExternalSyntheticLambda0(iconTintList);
            if (this.setIconTintList.setIconified) {
                return;
            }
            setChipCornerRadius();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.MenuHostHelper$$ExternalSyntheticLambda0(colorStateList);
        }
        if (this.setIconTintList.setIconified) {
            return;
        }
        setChipCornerRadius();
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.setIconTintList == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(dynamiteApi.setAnimationFromJson ? null : charSequence, bufferType);
        DynamiteApi dynamiteApi2 = this.setIconTintList;
        if (dynamiteApi2 != null) {
            dynamiteApi2.setX(charSequence);
        }
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextAppearance(setHeight setheight) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setMinAndMaxProgress.MenuHostHelper$$ExternalSyntheticLambda1(setheight, dynamiteApi.setCenterIfNoTextEnabled);
        }
        setCenterIfNoTextEnabled();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setMinAndMaxProgress.MenuHostHelper$$ExternalSyntheticLambda1(new setHeight(dynamiteApi.setCenterIfNoTextEnabled, i), dynamiteApi.setCenterIfNoTextEnabled);
        }
        setCenterIfNoTextEnabled();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setMinAndMaxProgress.MenuHostHelper$$ExternalSyntheticLambda1(new setHeight(dynamiteApi.setCenterIfNoTextEnabled, i), dynamiteApi.setCenterIfNoTextEnabled);
        }
        setCenterIfNoTextEnabled();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            setHeight setheight = dynamiteApi.setMinAndMaxProgress.setIconTintList;
            if (setheight != null) {
                setheight.setOnLongClickListener = applyDimension;
                dynamiteApi.setMinAndMaxProgress.setY.setTextSize(applyDimension);
                DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = dynamiteApi.setTextScaleX.get();
                if (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                    dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
                }
                dynamiteApi.invalidateSelf();
            }
        }
        setCenterIfNoTextEnabled();
    }

    private void setCenterIfNoTextEnabled() {
        TextPaint paint = getPaint();
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            paint.drawableState = dynamiteApi.getState();
        }
        DynamiteApi dynamiteApi2 = this.setIconTintList;
        setHeight setheight = dynamiteApi2 != null ? dynamiteApi2.setMinAndMaxProgress.setIconTintList : null;
        if (setheight != null) {
            setheight.setX(getContext(), paint, this.setTextScaleX);
        }
    }

    public void setChipIconVisible(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setIconTintList(dynamiteApi.setCenterIfNoTextEnabled.getResources().getBoolean(i));
        }
    }

    public void setChipIconVisible(boolean z) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setIconTintList(z);
        }
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    public void setChipIconResource(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.MenuHostHelper$$ExternalSyntheticLambda1(setFilterTouchesWhenObscured.setIconTintList(dynamiteApi.setCenterIfNoTextEnabled, i));
        }
    }

    public void setChipIcon(Drawable drawable) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.MenuHostHelper$$ExternalSyntheticLambda1(drawable);
        }
    }

    public void setChipIconTintResource(int i) {
        ColorStateList iconTintList;
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            iconTintList = setLineHeight.setIconTintList(dynamiteApi.setCenterIfNoTextEnabled, i);
            dynamiteApi.setX(iconTintList);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setX(colorStateList);
        }
    }

    public void setChipIconSizeResource(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.MenuHostHelper$$ExternalSyntheticLambda1(dynamiteApi.setCenterIfNoTextEnabled.getResources().getDimension(i));
        }
    }

    public void setChipIconSize(float f) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.MenuHostHelper$$ExternalSyntheticLambda1(f);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setX(z);
        }
        setNavigationOnClickListener();
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    public void setCloseIconResource(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setX(setFilterTouchesWhenObscured.setIconTintList(dynamiteApi.setCenterIfNoTextEnabled, i));
        }
        setNavigationOnClickListener();
    }

    public void setCloseIcon(Drawable drawable) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setX(drawable);
        }
        setNavigationOnClickListener();
    }

    public void setCloseIconTintResource(int i) {
        ColorStateList iconTintList;
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            iconTintList = setLineHeight.setIconTintList(dynamiteApi.setCenterIfNoTextEnabled, i);
            dynamiteApi.MenuHostHelper$$ExternalSyntheticLambda1(iconTintList);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.MenuHostHelper$$ExternalSyntheticLambda1(colorStateList);
        }
    }

    public void setCloseIconSizeResource(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setUnboundedRipple(dynamiteApi.setCenterIfNoTextEnabled.getResources().getDimension(i));
        }
    }

    public void setCloseIconSize(float f) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setUnboundedRipple(f);
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi == null || dynamiteApi.setOnLongClickListener == charSequence) {
            return;
        }
        setChipEndPadding y = setChipEndPadding.setY();
        dynamiteApi.setOnLongClickListener = y.setY(charSequence, y.setX, true);
        dynamiteApi.invalidateSelf();
    }

    public void setCheckableResource(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.MenuHostHelper$$ExternalSyntheticLambda1(dynamiteApi.setCenterIfNoTextEnabled.getResources().getBoolean(i));
        }
    }

    public void setCheckable(boolean z) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.MenuHostHelper$$ExternalSyntheticLambda1(z);
        }
    }

    public void setCheckedIconVisible(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.MenuHostHelper$$ExternalSyntheticLambda0(dynamiteApi.setCenterIfNoTextEnabled.getResources().getBoolean(i));
        }
    }

    public void setCheckedIconVisible(boolean z) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.MenuHostHelper$$ExternalSyntheticLambda0(z);
        }
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    public void setCheckedIconResource(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setIconTintList(setFilterTouchesWhenObscured.setIconTintList(dynamiteApi.setCenterIfNoTextEnabled, i));
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setIconTintList(drawable);
        }
    }

    public void setCheckedIconTintResource(int i) {
        ColorStateList iconTintList;
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            iconTintList = setLineHeight.setIconTintList(dynamiteApi.setCenterIfNoTextEnabled, i);
            dynamiteApi.setY(iconTintList);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setY(colorStateList);
        }
    }

    public void setShowMotionSpecResource(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            FirebaseCommonKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1(dynamiteApi.setCenterIfNoTextEnabled, i);
        }
    }

    public void setHideMotionSpecResource(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            FirebaseCommonKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1(dynamiteApi.setCenterIfNoTextEnabled, i);
        }
    }

    public void setChipStartPaddingResource(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setIconTintList(dynamiteApi.setCenterIfNoTextEnabled.getResources().getDimension(i));
        }
    }

    public void setChipStartPadding(float f) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setIconTintList(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setUiOptions(dynamiteApi.setCenterIfNoTextEnabled.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setUiOptions(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setOnLongClickListener(dynamiteApi.setCenterIfNoTextEnabled.getResources().getDimension(i));
        }
    }

    public void setIconEndPadding(float f) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setOnLongClickListener(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setCenterIfNoTextEnabled(dynamiteApi.setCenterIfNoTextEnabled.getResources().getDimension(i));
        }
    }

    public void setTextStartPadding(float f) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setCenterIfNoTextEnabled(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setChipCornerRadius(dynamiteApi.setCenterIfNoTextEnabled.getResources().getDimension(i));
        }
    }

    public void setTextEndPadding(float f) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setChipCornerRadius(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setLayoutAnimation(dynamiteApi.setCenterIfNoTextEnabled.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setLayoutAnimation(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setNavigationOnClickListener(dynamiteApi.setCenterIfNoTextEnabled.getResources().getDimension(i));
        }
    }

    public void setCloseIconEndPadding(float f) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setNavigationOnClickListener(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setY(dynamiteApi.setCenterIfNoTextEnabled.getResources().getDimension(i));
        }
    }

    public void setChipEndPadding(float f) {
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (dynamiteApi != null) {
            dynamiteApi.setY(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.setTextAlignment = z;
        MenuHostHelper$$ExternalSyntheticLambda1(this.setAnimationFromJson);
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        this.setAnimationFromJson = i;
        if (!this.setTextAlignment) {
            if (this.setOnNavigationItemSelectedListener != null) {
                setUiOptions();
            } else {
                setIconSize();
            }
            return false;
        }
        int max = Math.max(0, i - this.setIconTintList.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.setIconTintList.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.setOnNavigationItemSelectedListener != null) {
                setUiOptions();
            } else {
                setIconSize();
            }
            return false;
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.setOnNavigationItemSelectedListener != null) {
            Rect rect = new Rect();
            this.setOnNavigationItemSelectedListener.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                setIconSize();
                return true;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.setOnNavigationItemSelectedListener = new InsetDrawable((Drawable) this.setIconTintList, i2, i3, i2, i3);
        setIconSize();
        return true;
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.ViewPager$SavedState$1 = charSequence;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.ViewPager$SavedState$1)) {
            return this.ViewPager$SavedState$1;
        }
        DynamiteApi dynamiteApi = this.setIconTintList;
        if (!(dynamiteApi != null && dynamiteApi.setIconTintList)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof setOnGenericMotionListener) && ((setOnGenericMotionListener) parent).setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setUiOptions() {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnCloseListener.setUiOptions():void");
    }

    static /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda0(setOnCloseListener setoncloselistener) {
        DynamiteApi dynamiteApi = setoncloselistener.setIconTintList;
        if (dynamiteApi != null) {
            Drawable drawable = dynamiteApi.setLayoutAnimation;
            if ((drawable != null ? setEnsureMinTouchTargetSize.setOnLongClickListener(drawable) : null) != null) {
                return true;
            }
        }
        return false;
    }

    private void setUnboundedRipple() {
        Drawable.Callback callback = this.setOnNavigationItemSelectedListener;
        if (callback == null) {
            callback = this.setIconTintList;
        }
        if (callback == this.setOnNavigationItemSelectedListener && this.setIconTintList.getCallback() == null) {
            this.setIconTintList.setCallback(this.setOnNavigationItemSelectedListener);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        Drawable drawable2 = this.setOnNavigationItemSelectedListener;
        if (drawable2 == null) {
            drawable2 = this.setIconTintList;
        }
        if (drawable != drawable2 && drawable != this.setMinAndMaxProgress) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // o.setCheckableResource, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = this.setOnNavigationItemSelectedListener;
        if (drawable2 == null) {
            drawable2 = this.setIconTintList;
        }
        if (drawable != drawable2 && drawable != this.setMinAndMaxProgress) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) {
        jw jwVar = new jw();
        char[] cArr2 = new char[cArr.length];
        jwVar.setX = 0;
        char[] cArr3 = new char[2];
        while (jwVar.setX < cArr.length) {
            cArr3[0] = cArr[jwVar.setX];
            cArr3[1] = cArr[jwVar.setX + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[1]), Integer.valueOf((cArr3[0] + i2) ^ ((cArr3[0] << 4) + ((char) (setHasDecor ^ 7915367849376928708L)))), Integer.valueOf(cArr3[0] >>> 5), Integer.valueOf(setChipIconTintResource)};
                    Object obj = jC.setTextScaleX.get(-496584909);
                    if (obj == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        Object[] objArr3 = new Object[1];
                        e(b, b2, b2, objArr3);
                        obj = ((Class) jC.setY(277 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (42263 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 4)).getMethod((String) objArr3[0], Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                        jC.setTextScaleX.put(-496584909, obj);
                    }
                    cArr3[1] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cArr3[1] + i2) ^ ((cArr3[1] << 4) + ((char) (setCheckedIconEnabled ^ 7915367849376928708L)))), Integer.valueOf(cArr3[1] >>> 5), Integer.valueOf(SearchView$SavedState$1)};
                        Object obj2 = jC.setTextScaleX.get(-496584909);
                        if (obj2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            Object[] objArr5 = new Object[1];
                            e(b3, b4, b4, objArr5);
                            obj2 = ((Class) jC.setY(KeyEvent.normalizeMetaState(0) + 277, (char) (42263 - View.MeasureSpec.getSize(0)), 4 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod((String) objArr5[0], Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                            jC.setTextScaleX.put(-496584909, obj2);
                        }
                        cArr3[0] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                        i2 -= 40503;
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
            cArr2[jwVar.setX] = cArr3[0];
            cArr2[jwVar.setX + 1] = cArr3[1];
            try {
                Object[] objArr6 = {jwVar, jwVar};
                Object obj3 = jC.setTextScaleX.get(655848378);
                if (obj3 == null) {
                    obj3 = ((Class) jC.setY(413 - AndroidCharacter.getMirror('0'), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 55121), 4 - (ViewConfiguration.getTapTimeout() >> 16))).getMethod("A", Object.class, Object.class);
                    jC.setTextScaleX.put(655848378, obj3);
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
        objArr[0] = new String(cArr2, 0, i);
    }
}