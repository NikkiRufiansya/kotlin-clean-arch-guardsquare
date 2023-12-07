package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.setScrollBarDefaultDelayBeforeFade;

/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends setCalendarViewShown implements Checkable, FragmentManager$LaunchedFragmentInfo$1 {
    private static final int setUnboundedRipple = 2132083638;
    setX MenuHostHelper$$ExternalSyntheticLambda0;
    public int MenuHostHelper$$ExternalSyntheticLambda1;
    private int ViewPager$SavedState$1;
    private int setCenterIfNoTextEnabled;
    private ColorStateList setChipCornerRadius;
    private int setIconSize;
    private boolean setLayoutAnimation;
    private final LinkedHashSet<setY> setOnNavigationItemSelectedListener;
    private PorterDuff.Mode setTextAlignment;
    private int setTextScaleX;
    private boolean setUiOptions;
    public Drawable setX;
    final LifecycleCoroutineScopeImpl setY;
    private static final int[] setOnLongClickListener = {16842911};
    private static final int[] setNavigationOnClickListener = {16842912};

    /* loaded from: classes.dex */
    interface setX {
        void setY();
    }

    /* loaded from: classes.dex */
    public interface setY {
    }

    public FabTransformationSheetBehavior(Context context) {
        this(context, null);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f0402b0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FabTransformationSheetBehavior(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.FabTransformationSheetBehavior.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // o.setCalendarViewShown, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(MenuHostHelper$$ExternalSyntheticLambda1());
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        accessibilityNodeInfo.setCheckable(lifecycleCoroutineScopeImpl != null && lifecycleCoroutineScopeImpl.setIconTintList);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // o.setCalendarViewShown, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(MenuHostHelper$$ExternalSyntheticLambda1());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        FabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1 fabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1 = new FabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1(super.onSaveInstanceState());
        fabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 = this.setLayoutAnimation;
        return fabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof FabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        FabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1 fabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1 = (FabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1) parcelable;
        super.onRestoreInstanceState(fabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions);
        setChecked(fabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return k_();
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return setY();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // o.setCalendarViewShown, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? setFilterTouchesWhenObscured.setIconTintList(getContext(), i) : null);
    }

    @Override // o.setCalendarViewShown, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (lifecycleCoroutineScopeImpl = this.setY) != null) {
            int i5 = i4 - i2;
            int i6 = i3 - i;
            Drawable drawable = lifecycleCoroutineScopeImpl.setTextAlignment;
            if (drawable != null) {
                drawable.setBounds(lifecycleCoroutineScopeImpl.setNavigationOnClickListener, lifecycleCoroutineScopeImpl.setIconSize, i6 - lifecycleCoroutineScopeImpl.setCenterIfNoTextEnabled, i5 - lifecycleCoroutineScopeImpl.setOnLongClickListener);
            }
        }
        setIconTintList(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // o.setCalendarViewShown, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        setIconTintList(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        boolean z = true;
        if ((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true) {
            setWebViewClient x = this.setY.setX(false);
            if ((x.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0 == null || !x.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList) ? false : false) {
                x.ViewPager$SavedState$1(setTitleMargin.setX(this));
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if ((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true) {
            this.setY.setX(false).setIconSize(f);
        }
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.setX != null) {
            if (this.setX.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        setIconTintList(getMeasuredWidth(), getMeasuredHeight());
    }

    private void setIconTintList(int i, int i2) {
        Layout.Alignment alignment;
        int min;
        if (this.setX == null || getLayout() == null) {
            return;
        }
        int i3 = this.setCenterIfNoTextEnabled;
        if (!(i3 == 1 || i3 == 2)) {
            int i4 = this.setCenterIfNoTextEnabled;
            if (!(i4 == 3 || i4 == 4)) {
                int i5 = this.setCenterIfNoTextEnabled;
                if (i5 == 16 || i5 == 32) {
                    this.setIconSize = 0;
                    if (this.setCenterIfNoTextEnabled == 16) {
                        this.setTextScaleX = 0;
                        MenuHostHelper$$ExternalSyntheticLambda0(false);
                        return;
                    }
                    int i6 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                    if (i6 == 0) {
                        i6 = this.setX.getIntrinsicHeight();
                    }
                    if (getLineCount() > 1) {
                        min = getLayout().getHeight();
                    } else {
                        TextPaint paint = getPaint();
                        String charSequence = getText().toString();
                        if (getTransformationMethod() != null) {
                            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
                        }
                        Rect rect = new Rect();
                        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
                        min = Math.min(rect.height(), getLayout().getHeight());
                    }
                    int max = Math.max(0, (((((i2 - min) - getPaddingTop()) - i6) - this.ViewPager$SavedState$1) - getPaddingBottom()) / 2);
                    if (this.setTextScaleX != max) {
                        this.setTextScaleX = max;
                        MenuHostHelper$$ExternalSyntheticLambda0(false);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        this.setTextScaleX = 0;
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            int gravity = getGravity() & 8388615;
            if (gravity == 1) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else if (gravity == 5 || gravity == 8388613) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
        } else if (textAlignment == 6 || textAlignment == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (textAlignment == 4) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        int i7 = this.setCenterIfNoTextEnabled;
        if (i7 == 1 || i7 == 3 || ((i7 == 2 && alignment == Layout.Alignment.ALIGN_NORMAL) || (this.setCenterIfNoTextEnabled == 4 && alignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.setIconSize = 0;
            MenuHostHelper$$ExternalSyntheticLambda0(false);
            return;
        }
        int i8 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (i8 == 0) {
            i8 = this.setX.getIntrinsicWidth();
        }
        int lineCount = getLineCount();
        int i9 = 0;
        for (int i10 = 0; i10 < lineCount; i10++) {
            CharSequence subSequence = getText().subSequence(getLayout().getLineStart(i10), getLayout().getLineEnd(i10));
            TextPaint paint2 = getPaint();
            String charSequence2 = subSequence.toString();
            if (getTransformationMethod() != null) {
                charSequence2 = getTransformationMethod().getTransformation(charSequence2, this).toString();
            }
            i9 = Math.max(i9, Math.min((int) paint2.measureText(charSequence2), getLayout().getEllipsizedWidth()));
        }
        int onNavigationItemSelectedListener = ((((i - i9) - setBaselineAlignBottom.setOnNavigationItemSelectedListener(this)) - i8) - this.ViewPager$SavedState$1) - setBaselineAlignBottom.setAnimationFromJson(this);
        if (alignment == Layout.Alignment.ALIGN_CENTER) {
            onNavigationItemSelectedListener /= 2;
        }
        if ((setBaselineAlignBottom.ViewPager$SavedState$1(this) == 1) != (this.setCenterIfNoTextEnabled == 4)) {
            onNavigationItemSelectedListener = -onNavigationItemSelectedListener;
        }
        if (this.setIconSize != onNavigationItemSelectedListener) {
            this.setIconSize = onNavigationItemSelectedListener;
            MenuHostHelper$$ExternalSyntheticLambda0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setIconPadding(int i) {
        if (this.ViewPager$SavedState$1 != i) {
            this.ViewPager$SavedState$1 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != i) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
            MenuHostHelper$$ExternalSyntheticLambda0(true);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.setX != drawable) {
            this.setX = drawable;
            MenuHostHelper$$ExternalSyntheticLambda0(true);
            setIconTintList(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? setFilterTouchesWhenObscured.setIconTintList(getContext(), i) : null);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.setChipCornerRadius != colorStateList) {
            this.setChipCornerRadius = colorStateList;
            MenuHostHelper$$ExternalSyntheticLambda0(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(getContext(), i));
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.setTextAlignment != mode) {
            this.setTextAlignment = mode;
            MenuHostHelper$$ExternalSyntheticLambda0(false);
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        Drawable drawable = this.setX;
        boolean z2 = true;
        if (drawable != null) {
            Drawable mutate = setEnsureMinTouchTargetSize.setNavigationOnClickListener(drawable).mutate();
            this.setX = mutate;
            setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda1(mutate, this.setChipCornerRadius);
            PorterDuff.Mode mode = this.setTextAlignment;
            if (mode != null) {
                setEnsureMinTouchTargetSize.setX(this.setX, mode);
            }
            int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (i == 0) {
                i = this.setX.getIntrinsicWidth();
            }
            int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (i2 == 0) {
                i2 = this.setX.getIntrinsicHeight();
            }
            Drawable drawable2 = this.setX;
            int i3 = this.setIconSize;
            int i4 = this.setTextScaleX;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.setX.setVisible(true, z);
        }
        if (z) {
            setLayoutAnimation();
            return;
        }
        Drawable[] y = setPreferKeepClearRects.setY(this);
        Drawable drawable3 = y[0];
        Drawable drawable4 = y[1];
        Drawable drawable5 = y[2];
        int i5 = this.setCenterIfNoTextEnabled;
        if (!(i5 == 1 || i5 == 2) || drawable3 == this.setX) {
            int i6 = this.setCenterIfNoTextEnabled;
            if (!(i6 == 3 || i6 == 4) || drawable5 == this.setX) {
                int i7 = this.setCenterIfNoTextEnabled;
                if (!(i7 == 16 || i7 == 32) || drawable4 == this.setX) {
                    z2 = false;
                }
            }
        }
        if (z2) {
            setLayoutAnimation();
        }
    }

    public void setIconGravity(int i) {
        if (this.setCenterIfNoTextEnabled != i) {
            this.setCenterIfNoTextEnabled = i;
            setIconTintList(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setInsetBottom(int i) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        lifecycleCoroutineScopeImpl.setIconTintList(lifecycleCoroutineScopeImpl.setIconSize, i);
    }

    public void setInsetTop(int i) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        lifecycleCoroutineScopeImpl.setIconTintList(i, lifecycleCoroutineScopeImpl.setOnLongClickListener);
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if (lifecycleCoroutineScopeImpl != null && lifecycleCoroutineScopeImpl.setIconTintList) {
            mergeDrawableStates(onCreateDrawableState, setOnLongClickListener);
        }
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, setNavigationOnClickListener);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.setLayoutAnimation;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.setLayoutAnimation);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.setY.setMaxEms) {
            toggle();
        }
        return super.performClick();
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.setY.setMaxEms = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        setX setx = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setx != null) {
            setx.setY();
        }
        super.setPressed(z);
    }

    private String MenuHostHelper$$ExternalSyntheticLambda1() {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        return (lifecycleCoroutineScopeImpl != null && lifecycleCoroutineScopeImpl.setIconTintList ? CompoundButton.class : Button.class).getName();
    }

    private void setLayoutAnimation() {
        int i = this.setCenterIfNoTextEnabled;
        boolean z = false;
        if (i == 1 || i == 2) {
            setPreferKeepClearRects.setX(this, this.setX, null, null, null);
            return;
        }
        int i2 = this.setCenterIfNoTextEnabled;
        if (i2 == 3 || i2 == 4) {
            setPreferKeepClearRects.setX(this, null, null, this.setX, null);
            return;
        }
        int i3 = this.setCenterIfNoTextEnabled;
        if ((i3 == 16 || i3 == 32) ? true : true) {
            setPreferKeepClearRects.setX(this, null, this.setX, null, null);
        }
    }

    public final setScrollBarDefaultDelayBeforeFade setIconTintList() {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if (!((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true)) {
            throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        }
        return this.setY.setOnNavigationItemSelectedListener;
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda0() {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if ((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true) {
            return this.setY.setZ;
        }
        return 0;
    }

    @Override // o.setCalendarViewShown
    public ColorStateList k_() {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if (!((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true)) {
            return super.k_();
        }
        return this.setY.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.setCalendarViewShown
    public PorterDuff.Mode setY() {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if (!((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true)) {
            return super.setY();
        }
        return this.setY.setX;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if ((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = this.setY;
            if (lifecycleCoroutineScopeImpl2.setX(false) != null) {
                lifecycleCoroutineScopeImpl2.setX(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // o.setCalendarViewShown, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if ((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = this.setY;
                lifecycleCoroutineScopeImpl2.setY = true;
                lifecycleCoroutineScopeImpl2.setChipCornerRadius.setSupportBackgroundTintList(lifecycleCoroutineScopeImpl2.MenuHostHelper$$ExternalSyntheticLambda0);
                lifecycleCoroutineScopeImpl2.setChipCornerRadius.setSupportBackgroundTintMode(lifecycleCoroutineScopeImpl2.setX);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setCheckable(boolean z) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if ((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true) {
            this.setY.setIconTintList = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if ((lifecycleCoroutineScopeImpl != null && lifecycleCoroutineScopeImpl.setIconTintList) && isEnabled() && this.setLayoutAnimation != z) {
            this.setLayoutAnimation = z;
            refreshDrawableState();
            if (getParent() instanceof setCheckMarkTintBlendMode) {
                setCheckMarkTintBlendMode setcheckmarktintblendmode = (setCheckMarkTintBlendMode) getParent();
                boolean z2 = this.setLayoutAnimation;
                if (!setcheckmarktintblendmode.MenuHostHelper$$ExternalSyntheticLambda0) {
                    setcheckmarktintblendmode.MenuHostHelper$$ExternalSyntheticLambda0(getId(), z2);
                }
            }
            if (this.setUiOptions) {
                return;
            }
            this.setUiOptions = true;
            Iterator<setY> it = this.setOnNavigationItemSelectedListener.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.setUiOptions = false;
        }
    }

    public void setCornerRadius(int i) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if ((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = this.setY;
            if (lifecycleCoroutineScopeImpl2.setUiOptions && lifecycleCoroutineScopeImpl2.setUnboundedRipple == i) {
                return;
            }
            lifecycleCoroutineScopeImpl2.setUnboundedRipple = i;
            lifecycleCoroutineScopeImpl2.setUiOptions = true;
            float f = i;
            setScrollBarDefaultDelayBeforeFade.setY sety = new setScrollBarDefaultDelayBeforeFade.setY(lifecycleCoroutineScopeImpl2.setOnNavigationItemSelectedListener);
            sety.setNavigationOnClickListener = new setActionBarVisibilityCallback(f);
            sety.ViewPager$SavedState$1 = new setActionBarVisibilityCallback(f);
            sety.setIconTintList = new setActionBarVisibilityCallback(f);
            sety.setY = new setActionBarVisibilityCallback(f);
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = new setScrollBarDefaultDelayBeforeFade(sety, (byte) 0);
            lifecycleCoroutineScopeImpl2.setOnNavigationItemSelectedListener = setscrollbardefaultdelaybeforefade;
            lifecycleCoroutineScopeImpl2.setX(setscrollbardefaultdelaybeforefade);
        }
    }

    public void setCornerRadiusResource(int i) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if ((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if ((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = this.setY;
            if (lifecycleCoroutineScopeImpl2.ViewPager$SavedState$1 != colorStateList) {
                lifecycleCoroutineScopeImpl2.ViewPager$SavedState$1 = colorStateList;
                boolean z = LifecycleCoroutineScopeImpl.MenuHostHelper$$ExternalSyntheticLambda1;
                if (z && (lifecycleCoroutineScopeImpl2.setChipCornerRadius.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) lifecycleCoroutineScopeImpl2.setChipCornerRadius.getBackground()).setColor(setChipText.setY(colorStateList));
                } else if (z || !(lifecycleCoroutineScopeImpl2.setChipCornerRadius.getBackground() instanceof setOnQueryTextListener)) {
                } else {
                    ((setOnQueryTextListener) lifecycleCoroutineScopeImpl2.setChipCornerRadius.getBackground()).setTintList(setChipText.setY(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if ((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true) {
            setRippleColor(setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(getContext(), i));
        }
    }

    @Override // o.FragmentManager$LaunchedFragmentInfo$1
    public void setShapeAppearanceModel(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if ((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = this.setY;
            lifecycleCoroutineScopeImpl2.setOnNavigationItemSelectedListener = setscrollbardefaultdelaybeforefade;
            lifecycleCoroutineScopeImpl2.setX(setscrollbardefaultdelaybeforefade);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if ((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = this.setY;
            if (lifecycleCoroutineScopeImpl2.setTextScaleX != colorStateList) {
                lifecycleCoroutineScopeImpl2.setTextScaleX = colorStateList;
                lifecycleCoroutineScopeImpl2.MenuHostHelper$$ExternalSyntheticLambda0();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if ((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true) {
            setStrokeColor(setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if ((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = this.setY;
            if (lifecycleCoroutineScopeImpl2.setZ != i) {
                lifecycleCoroutineScopeImpl2.setZ = i;
                lifecycleCoroutineScopeImpl2.MenuHostHelper$$ExternalSyntheticLambda0();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if ((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // o.setCalendarViewShown
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if ((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = this.setY;
            if (lifecycleCoroutineScopeImpl2.MenuHostHelper$$ExternalSyntheticLambda0 != colorStateList) {
                lifecycleCoroutineScopeImpl2.MenuHostHelper$$ExternalSyntheticLambda0 = colorStateList;
                if (lifecycleCoroutineScopeImpl2.setX(false) != null) {
                    setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda1(lifecycleCoroutineScopeImpl2.setX(false), lifecycleCoroutineScopeImpl2.MenuHostHelper$$ExternalSyntheticLambda0);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // o.setCalendarViewShown
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.setY;
        if ((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = this.setY;
            if (lifecycleCoroutineScopeImpl2.setX != mode) {
                lifecycleCoroutineScopeImpl2.setX = mode;
                if (lifecycleCoroutineScopeImpl2.setX(false) == null || lifecycleCoroutineScopeImpl2.setX == null) {
                    return;
                }
                setEnsureMinTouchTargetSize.setX(lifecycleCoroutineScopeImpl2.setX(false), lifecycleCoroutineScopeImpl2.setX);
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }
}