package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import o.setEnsureMinTouchTargetSize;

/* loaded from: classes.dex */
public class setKeyListener extends setScrimVisibleHeightTrigger implements Checkable, FragmentManager$LaunchedFragmentInfo$1 {
    private static final int ViewPager$SavedState$1 = 2132083650;
    private setKeyListener$MenuHostHelper$$ExternalSyntheticLambda1 setAnimationFromJson;
    private final setErrorIconOnLongClickListener setChipCornerRadius;
    private boolean setIconSize;
    private boolean setOnNavigationItemSelectedListener;
    private boolean setTextAlignment;
    private static final int[] setOnLongClickListener = {16842911};
    private static final int[] setNavigationOnClickListener = {16842912};
    private static final int[] setCenterIfNoTextEnabled = {R.attr.res_0x7f0403c7};

    public setKeyListener(Context context) {
        this(context, null);
    }

    public setKeyListener(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f0402c4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public setKeyListener(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setKeyListener.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        setErrorIconOnLongClickListener seterroricononlongclicklistener = this.setChipCornerRadius;
        accessibilityNodeInfo.setCheckable(seterroricononlongclicklistener != null && seterroricononlongclicklistener.setIconTintList);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // o.setScrimVisibleHeightTrigger, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.setChipCornerRadius.setIconTintList(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        setErrorIconOnLongClickListener seterroricononlongclicklistener = this.setChipCornerRadius;
        if (seterroricononlongclicklistener.setAnimationFromJson != colorStateList) {
            seterroricononlongclicklistener.setAnimationFromJson = colorStateList;
            setWebViewClient setwebviewclient = seterroricononlongclicklistener.setLayoutAnimation;
            ColorStateList colorStateList2 = seterroricononlongclicklistener.setAnimationFromJson;
            setwebviewclient.setChipIconTintResource.setMaxEms = seterroricononlongclicklistener.setZ;
            setwebviewclient.invalidateSelf();
            if (setwebviewclient.setChipIconTintResource.setOnNavigationItemSelectedListener != colorStateList2) {
                setwebviewclient.setChipIconTintResource.setOnNavigationItemSelectedListener = colorStateList2;
                setwebviewclient.onStateChange(setwebviewclient.getState());
            }
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        setErrorIconOnLongClickListener seterroricononlongclicklistener = this.setChipCornerRadius;
        if (i != seterroricononlongclicklistener.setZ) {
            seterroricononlongclicklistener.setZ = i;
            setWebViewClient setwebviewclient = seterroricononlongclicklistener.setLayoutAnimation;
            ColorStateList colorStateList = seterroricononlongclicklistener.setAnimationFromJson;
            setwebviewclient.setChipIconTintResource.setMaxEms = seterroricononlongclicklistener.setZ;
            setwebviewclient.invalidateSelf();
            if (setwebviewclient.setChipIconTintResource.setOnNavigationItemSelectedListener != colorStateList) {
                setwebviewclient.setChipIconTintResource.setOnNavigationItemSelectedListener = colorStateList;
                setwebviewclient.onStateChange(setwebviewclient.getState());
            }
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
        if (r1 != false) goto L15;
     */
    @Override // o.setScrimVisibleHeightTrigger
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setRadius(float r6) {
        /*
            r5 = this;
            super.setRadius(r6)
            o.setErrorIconOnLongClickListener r0 = r5.setChipCornerRadius
            o.setScrollBarDefaultDelayBeforeFade r1 = r0.setIconSize
            o.setScrollBarDefaultDelayBeforeFade$setY r2 = new o.setScrollBarDefaultDelayBeforeFade$setY
            r2.<init>(r1)
            o.setActionBarVisibilityCallback r1 = new o.setActionBarVisibilityCallback
            r1.<init>(r6)
            r2.setNavigationOnClickListener = r1
            o.setActionBarVisibilityCallback r1 = new o.setActionBarVisibilityCallback
            r1.<init>(r6)
            r2.ViewPager$SavedState$1 = r1
            o.setActionBarVisibilityCallback r1 = new o.setActionBarVisibilityCallback
            r1.<init>(r6)
            r2.setIconTintList = r1
            o.setActionBarVisibilityCallback r1 = new o.setActionBarVisibilityCallback
            r1.<init>(r6)
            r2.setY = r1
            o.setScrollBarDefaultDelayBeforeFade r6 = new o.setScrollBarDefaultDelayBeforeFade
            r1 = 0
            r6.<init>(r2, r1)
            r0.setX(r6)
            android.graphics.drawable.Drawable r6 = r0.setOnLongClickListener
            r6.invalidateSelf()
            boolean r6 = r0.setIconTintList()
            if (r6 != 0) goto L5c
            o.setKeyListener r6 = r0.setChipCornerRadius
            boolean r6 = r6.setY
            if (r6 == 0) goto L5a
            o.setWebViewClient r6 = r0.MenuHostHelper$$ExternalSyntheticLambda1
            o.setWebViewClient$setIconTintList r2 = r6.setChipIconTintResource
            o.setScrollBarDefaultDelayBeforeFade r2 = r2.setTextAlignment
            android.graphics.RectF r3 = r6.FragmentStateAdapter$2
            android.graphics.Rect r4 = r6.getBounds()
            r3.set(r4)
            android.graphics.RectF r6 = r6.FragmentStateAdapter$2
            boolean r6 = r2.setIconTintList(r6)
            if (r6 != 0) goto L5a
            r1 = 1
        L5a:
            if (r1 == 0) goto L5f
        L5c:
            r0.setX()
        L5f:
            boolean r6 = r0.setIconTintList()
            if (r6 == 0) goto L68
            r0.MenuHostHelper$$ExternalSyntheticLambda1()
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setKeyListener.setRadius(float):void");
    }

    @Override // o.setScrimVisibleHeightTrigger
    public final float setOnLongClickListener() {
        return this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener();
    }

    public void setProgress(float f) {
        setErrorIconOnLongClickListener seterroricononlongclicklistener = this.setChipCornerRadius;
        setWebViewClient setwebviewclient = seterroricononlongclicklistener.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setwebviewclient.setChipIconTintResource.setUiOptions != f) {
            setwebviewclient.setChipIconTintResource.setUiOptions = f;
            setwebviewclient.FloatingActionButton$BaseBehavior = true;
            setwebviewclient.invalidateSelf();
        }
        setWebViewClient setwebviewclient2 = seterroricononlongclicklistener.setLayoutAnimation;
        if (setwebviewclient2 != null && setwebviewclient2.setChipIconTintResource.setUiOptions != f) {
            setwebviewclient2.setChipIconTintResource.setUiOptions = f;
            setwebviewclient2.FloatingActionButton$BaseBehavior = true;
            setwebviewclient2.invalidateSelf();
        }
        setWebViewClient setwebviewclient3 = seterroricononlongclicklistener.setNavigationOnClickListener;
        if (setwebviewclient3 == null || setwebviewclient3.setChipIconTintResource.setUiOptions == f) {
            return;
        }
        setwebviewclient3.setChipIconTintResource.setUiOptions = f;
        setwebviewclient3.FloatingActionButton$BaseBehavior = true;
        setwebviewclient3.invalidateSelf();
    }

    @Override // o.setScrimVisibleHeightTrigger
    public void setContentPadding(int i, int i2, int i3, int i4) {
        setErrorIconOnLongClickListener seterroricononlongclicklistener = this.setChipCornerRadius;
        seterroricononlongclicklistener.setOnNavigationItemSelectedListener.set(i, i2, i3, i4);
        seterroricononlongclicklistener.setX();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    @Override // o.setScrimVisibleHeightTrigger
    public final int h_() {
        return this.setChipCornerRadius.setOnNavigationItemSelectedListener.left;
    }

    @Override // o.setScrimVisibleHeightTrigger
    public final int j_() {
        return this.setChipCornerRadius.setOnNavigationItemSelectedListener.top;
    }

    @Override // o.setScrimVisibleHeightTrigger
    public final int i_() {
        return this.setChipCornerRadius.setOnNavigationItemSelectedListener.right;
    }

    @Override // o.setScrimVisibleHeightTrigger
    public final int g_() {
        return this.setChipCornerRadius.setOnNavigationItemSelectedListener.bottom;
    }

    @Override // o.setScrimVisibleHeightTrigger
    public void setCardBackgroundColor(int i) {
        setErrorIconOnLongClickListener seterroricononlongclicklistener = this.setChipCornerRadius;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        setWebViewClient setwebviewclient = seterroricononlongclicklistener.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setwebviewclient.setChipIconTintResource.setX != valueOf) {
            setwebviewclient.setChipIconTintResource.setX = valueOf;
            setwebviewclient.onStateChange(setwebviewclient.getState());
        }
    }

    @Override // o.setScrimVisibleHeightTrigger
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        setWebViewClient setwebviewclient = this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setwebviewclient.setChipIconTintResource.setX != colorStateList) {
            setwebviewclient.setChipIconTintResource.setX = colorStateList;
            setwebviewclient.onStateChange(setwebviewclient.getState());
        }
    }

    @Override // o.setScrimVisibleHeightTrigger
    public final ColorStateList f_() {
        return this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1.setChipIconTintResource.setX;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        setWebViewClient setwebviewclient = this.setChipCornerRadius.setLayoutAnimation;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        if (setwebviewclient.setChipIconTintResource.setX != colorStateList) {
            setwebviewclient.setChipIconTintResource.setX = colorStateList;
            setwebviewclient.onStateChange(setwebviewclient.getState());
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        setErrorIconOnLongClickListener seterroricononlongclicklistener = this.setChipCornerRadius;
        if (seterroricononlongclicklistener != null) {
            Drawable drawable = seterroricononlongclicklistener.setOnLongClickListener;
            Drawable MenuHostHelper$$ExternalSyntheticLambda0 = seterroricononlongclicklistener.setChipCornerRadius.isClickable() ? seterroricononlongclicklistener.MenuHostHelper$$ExternalSyntheticLambda0() : seterroricononlongclicklistener.setLayoutAnimation;
            seterroricononlongclicklistener.setOnLongClickListener = MenuHostHelper$$ExternalSyntheticLambda0;
            if (drawable != MenuHostHelper$$ExternalSyntheticLambda0) {
                if (Build.VERSION.SDK_INT >= 23 && (seterroricononlongclicklistener.setChipCornerRadius.getForeground() instanceof InsetDrawable)) {
                    ((InsetDrawable) seterroricononlongclicklistener.setChipCornerRadius.getForeground()).setDrawable(MenuHostHelper$$ExternalSyntheticLambda0);
                } else {
                    seterroricononlongclicklistener.setChipCornerRadius.setForeground(seterroricononlongclicklistener.setY(MenuHostHelper$$ExternalSyntheticLambda0));
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setWebViewClient setwebviewclient = this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setwebviewclient.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0 != null && setwebviewclient.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList) {
            setwebviewclient.ViewPager$SavedState$1(setTitleMargin.setX(this));
        }
    }

    @Override // o.setScrimVisibleHeightTrigger
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        setErrorIconOnLongClickListener seterroricononlongclicklistener = this.setChipCornerRadius;
        seterroricononlongclicklistener.MenuHostHelper$$ExternalSyntheticLambda1.setIconSize(setScrimVisibleHeightTrigger.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(seterroricononlongclicklistener.setChipCornerRadius.setX));
    }

    @Override // o.setScrimVisibleHeightTrigger
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // o.setScrimVisibleHeightTrigger
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1();
        this.setChipCornerRadius.setX();
    }

    @Override // o.setScrimVisibleHeightTrigger
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1();
        this.setChipCornerRadius.setX();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.setOnNavigationItemSelectedListener) {
            if (!this.setChipCornerRadius.setCenterIfNoTextEnabled) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.setChipCornerRadius.setCenterIfNoTextEnabled = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.setIconSize;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.setIconSize != z) {
            toggle();
        }
    }

    public void setDragged(boolean z) {
        if (this.setTextAlignment != z) {
            this.setTextAlignment = z;
            refreshDrawableState();
            setNavigationOnClickListener();
            invalidate();
        }
    }

    public void setCheckable(boolean z) {
        this.setChipCornerRadius.setIconTintList = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        setErrorIconOnLongClickListener seterroricononlongclicklistener = this.setChipCornerRadius;
        if (seterroricononlongclicklistener != null && seterroricononlongclicklistener.setIconTintList) {
            mergeDrawableStates(onCreateDrawableState, setOnLongClickListener);
        }
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, setNavigationOnClickListener);
        }
        if (this.setTextAlignment) {
            mergeDrawableStates(onCreateDrawableState, setCenterIfNoTextEnabled);
        }
        return onCreateDrawableState;
    }

    public void setOnCheckedChangeListener(setKeyListener$MenuHostHelper$$ExternalSyntheticLambda1 setkeylistener_menuhosthelper__externalsyntheticlambda1) {
        this.setAnimationFromJson = setkeylistener_menuhosthelper__externalsyntheticlambda1;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        setErrorIconOnLongClickListener seterroricononlongclicklistener = this.setChipCornerRadius;
        seterroricononlongclicklistener.setTextAlignment = colorStateList;
        seterroricononlongclicklistener.setY();
    }

    public void setRippleColorResource(int i) {
        ColorStateList iconTintList;
        setErrorIconOnLongClickListener seterroricononlongclicklistener = this.setChipCornerRadius;
        iconTintList = setLineHeight.setIconTintList(getContext(), i);
        seterroricononlongclicklistener.setTextAlignment = iconTintList;
        seterroricononlongclicklistener.setY();
    }

    public void setCheckedIconResource(int i) {
        this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1(setFilterTouchesWhenObscured.setIconTintList(getContext(), i));
    }

    public void setCheckedIcon(Drawable drawable) {
        this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1(drawable);
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        setErrorIconOnLongClickListener seterroricononlongclicklistener = this.setChipCornerRadius;
        seterroricononlongclicklistener.setUiOptions = colorStateList;
        Drawable drawable = seterroricononlongclicklistener.setX;
        if (drawable != null) {
            setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(drawable, colorStateList);
        }
    }

    public void setCheckedIconSize(int i) {
        this.setChipCornerRadius.setUnboundedRipple = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.setChipCornerRadius.setUnboundedRipple = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconMargin(int i) {
        this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0 = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0 = getResources().getDimensionPixelSize(i);
        }
    }

    private void setNavigationOnClickListener() {
        setErrorIconOnLongClickListener seterroricononlongclicklistener;
        Drawable drawable;
        if (Build.VERSION.SDK_INT <= 26 || (drawable = (seterroricononlongclicklistener = this.setChipCornerRadius).ViewPager$SavedState$1) == null) {
            return;
        }
        Rect bounds = drawable.getBounds();
        int i = bounds.bottom;
        seterroricononlongclicklistener.ViewPager$SavedState$1.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        seterroricononlongclicklistener.ViewPager$SavedState$1.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    public void setCheckedIconGravity(int i) {
        if (this.setChipCornerRadius.setY != i) {
            setErrorIconOnLongClickListener seterroricononlongclicklistener = this.setChipCornerRadius;
            seterroricononlongclicklistener.setY = i;
            seterroricononlongclicklistener.setIconTintList(seterroricononlongclicklistener.setChipCornerRadius.getMeasuredWidth(), seterroricononlongclicklistener.setChipCornerRadius.getMeasuredHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float setUiOptions() {
        return super.setOnLongClickListener();
    }

    @Override // o.FragmentManager$LaunchedFragmentInfo$1
    public void setShapeAppearanceModel(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        RectF rectF = new RectF();
        rectF.set(this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1.getBounds());
        setClipToOutline(setscrollbardefaultdelaybeforefade.setIconTintList(rectF));
        this.setChipCornerRadius.setX(setscrollbardefaultdelaybeforefade);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setErrorIconOnLongClickListener seterroricononlongclicklistener = this.setChipCornerRadius;
        if ((seterroricononlongclicklistener != null && seterroricononlongclicklistener.setIconTintList) && isEnabled()) {
            this.setIconSize = !this.setIconSize;
            refreshDrawableState();
            setNavigationOnClickListener();
            setErrorIconOnLongClickListener seterroricononlongclicklistener2 = this.setChipCornerRadius;
            boolean z = this.setIconSize;
            Drawable drawable = seterroricononlongclicklistener2.setX;
            if (drawable != null) {
                drawable.setAlpha(z ? 255 : 0);
            }
            setKeyListener$MenuHostHelper$$ExternalSyntheticLambda1 setkeylistener_menuhosthelper__externalsyntheticlambda1 = this.setAnimationFromJson;
        }
    }
}