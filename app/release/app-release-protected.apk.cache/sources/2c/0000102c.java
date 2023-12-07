package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.getTrimPathOffset;
import o.setBaselineAlignBottom;
import o.setEnsureMinTouchTargetSize;
import o.setTabSelected;

/* loaded from: classes.dex */
public final class setTabSelected extends setCheckableResource {
    private static final int setY = 2132083662;
    ColorStateList MenuHostHelper$$ExternalSyntheticLambda0;
    private ColorStateList ViewPager$SavedState$1;
    private ColorStateList setAnimationFromJson;
    private CharSequence setCenterIfNoTextEnabled;
    private boolean setCheckedIconEnabled;
    private PorterDuff.Mode setChipCornerRadius;
    private boolean setGuidelinePercent;
    private int setIconSize;
    private Drawable setLayoutAnimation;
    private final CoordinatorLayout setLayoutDirection;
    private boolean setMaxEms;
    private final LinkedHashSet<setIconTintList> setMinAndMaxProgress;
    private CompoundButton.OnCheckedChangeListener setOnNavigationItemSelectedListener;
    private boolean setTextAlignment;
    private final getTrimPathOffset.setIconTintList setTextAppearanceResource;
    private final LinkedHashSet<setX> setTextScaleX;
    private Drawable setUiOptions;
    private boolean setUnboundedRipple;
    int[] setX;
    private CharSequence setZ;
    private static final int[] setNavigationOnClickListener = {R.attr.res_0x7f0403c9};
    private static final int[] MenuHostHelper$$ExternalSyntheticLambda1 = {R.attr.res_0x7f0403c8};
    private static final int[][] setIconTintList = {new int[]{16842910, R.attr.res_0x7f0403c8}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private static final int setOnLongClickListener = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* loaded from: classes.dex */
    public interface setIconTintList {
    }

    /* loaded from: classes.dex */
    public interface setX {
    }

    public setTabSelected(Context context) {
        this(context, null);
    }

    public setTabSelected(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f04009e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public setTabSelected(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = o.setTabSelected.setY
            android.content.Context r11 = o.C0501u.MenuHostHelper$$ExternalSyntheticLambda0(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            r11.<init>()
            r10.setMinAndMaxProgress = r11
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            r11.<init>()
            r10.setTextScaleX = r11
            android.content.Context r11 = r10.getContext()
            r0 = 2131230899(0x7f0800b3, float:1.8077864E38)
            o.CoordinatorLayout r11 = o.CoordinatorLayout.setX(r11, r0)
            r10.setLayoutDirection = r11
            o.setTabSelected$4 r11 = new o.setTabSelected$4
            r11.<init>()
            r10.setTextAppearanceResource = r11
            android.content.Context r11 = r10.getContext()
            android.graphics.drawable.Drawable r0 = o.getCallingUserHandle.MenuHostHelper$$ExternalSyntheticLambda1(r10)
            r10.setUiOptions = r0
            android.content.res.ColorStateList r0 = r10.MenuHostHelper$$ExternalSyntheticLambda0
            if (r0 == 0) goto L3a
            goto L49
        L3a:
            android.content.res.ColorStateList r0 = super.getButtonTintList()
            if (r0 == 0) goto L45
            android.content.res.ColorStateList r0 = super.getButtonTintList()
            goto L49
        L45:
            android.content.res.ColorStateList r0 = r10.MenuHostHelper$$ExternalSyntheticLambda0()
        L49:
            r10.MenuHostHelper$$ExternalSyntheticLambda0 = r0
            r7 = 0
            r10.setSupportButtonTintList(r7)
            int[] r8 = o.setIconTint.setIconTintList.SearchView$SavedState$1
            r9 = 0
            int[] r5 = new int[r9]
            o.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setY(r11, r12, r13, r6)
            r0 = r11
            r1 = r12
            r2 = r8
            r3 = r13
            r4 = r6
            o.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setY(r0, r1, r2, r3, r4, r5)
            o.setExpandedHintEnabled r12 = o.setExpandedHintEnabled.MenuHostHelper$$ExternalSyntheticLambda0(r11, r12, r8, r13, r6)
            r13 = 2
            android.graphics.drawable.Drawable r13 = r12.MenuHostHelper$$ExternalSyntheticLambda0(r13)
            r10.setLayoutAnimation = r13
            android.graphics.drawable.Drawable r13 = r10.setUiOptions
            r0 = 1
            if (r13 == 0) goto La6
            r13 = 2130969099(0x7f04020b, float:1.754687E38)
            boolean r13 = o.setShowDividerVertical.setIconTintList(r11, r13, r9)
            if (r13 == 0) goto La6
            int r13 = r12.setNavigationOnClickListener(r9, r9)
            int r1 = r12.setNavigationOnClickListener(r0, r9)
            int r2 = o.setTabSelected.setOnLongClickListener
            if (r13 != r2) goto L88
            if (r1 != 0) goto L88
            r13 = 1
            goto L89
        L88:
            r13 = 0
        L89:
            if (r13 == 0) goto La6
            super.setButtonDrawable(r7)
            r13 = 2131230898(0x7f0800b2, float:1.8077862E38)
            android.graphics.drawable.Drawable r13 = o.setFilterTouchesWhenObscured.setIconTintList(r11, r13)
            r10.setUiOptions = r13
            r10.setGuidelinePercent = r0
            android.graphics.drawable.Drawable r13 = r10.setLayoutAnimation
            if (r13 != 0) goto La6
            r13 = 2131230900(0x7f0800b4, float:1.8077866E38)
            android.graphics.drawable.Drawable r13 = o.setFilterTouchesWhenObscured.setIconTintList(r11, r13)
            r10.setLayoutAnimation = r13
        La6:
            r13 = 3
            android.content.res.ColorStateList r11 = o.setFastScrollEnabled.setX(r11, r12, r13)
            r10.ViewPager$SavedState$1 = r11
            r11 = 4
            r13 = -1
            int r11 = r12.MenuHostHelper$$ExternalSyntheticLambda0(r11, r13)
            android.graphics.PorterDuff$Mode r13 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r11 = o.setTitleMargin.setY(r11, r13)
            r10.setChipCornerRadius = r11
            r11 = 10
            boolean r11 = r12.setIconTintList(r11, r9)
            r10.setCheckedIconEnabled = r11
            r11 = 6
            boolean r11 = r12.setIconTintList(r11, r0)
            r10.setTextAlignment = r11
            r11 = 9
            boolean r11 = r12.setIconTintList(r11, r9)
            r10.setMaxEms = r11
            r11 = 8
            java.lang.CharSequence r11 = r12.setUnboundedRipple(r11)
            r10.setZ = r11
            r11 = 7
            boolean r13 = r12.setLayoutAnimation(r11)
            if (r13 == 0) goto Le8
            int r11 = r12.MenuHostHelper$$ExternalSyntheticLambda0(r11, r9)
            r10.setCheckedState(r11)
        Le8:
            r12.setX()
            r10.setX()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTabSelected.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Drawable MenuHostHelper$$ExternalSyntheticLambda12;
        int x;
        if (!this.setTextAlignment || !TextUtils.isEmpty(getText()) || (MenuHostHelper$$ExternalSyntheticLambda12 = getCallingUserHandle.MenuHostHelper$$ExternalSyntheticLambda1(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        x = setBaselineAlignBottom.setX.setX(this);
        int width = ((getWidth() - MenuHostHelper$$ExternalSyntheticLambda12.getIntrinsicWidth()) / 2) * (x == 1 ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = MenuHostHelper$$ExternalSyntheticLambda12.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.setCheckedIconEnabled && this.MenuHostHelper$$ExternalSyntheticLambda0 == null && this.ViewPager$SavedState$1 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.setIconSize == 2) {
            mergeDrawableStates(onCreateDrawableState, setNavigationOnClickListener);
        }
        if (this.setMaxEms) {
            mergeDrawableStates(onCreateDrawableState, MenuHostHelper$$ExternalSyntheticLambda1);
        }
        this.setX = AppCompatSpinner$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.setIconSize == 1;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.setOnNavigationItemSelectedListener = onCheckedChangeListener;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.setMaxEms) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) accessibilityNodeInfo.getText());
            sb.append(", ");
            sb.append((Object) this.setZ);
            accessibilityNodeInfo.setText(sb.toString());
        }
    }

    public final void setCheckedState(int i) {
        Object systemService;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.setIconSize != i) {
            this.setIconSize = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            setY();
            if (this.setUnboundedRipple) {
                return;
            }
            this.setUnboundedRipple = true;
            LinkedHashSet<setX> linkedHashSet = this.setTextScaleX;
            if (linkedHashSet != null) {
                Iterator<setX> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            if (this.setIconSize != 2 && (onCheckedChangeListener = this.setOnNavigationItemSelectedListener) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                systemService = getContext().getSystemService(setCradleVerticalOffset.setIconTintList());
                AutofillManager y = setCradleVerticalOffset.setY(systemService);
                if (y != null) {
                    y.notifyValueChanged(this);
                }
            }
            this.setUnboundedRipple = false;
        }
    }

    public final void setErrorShown(boolean z) {
        if (this.setMaxEms == z) {
            return;
        }
        this.setMaxEms = z;
        refreshDrawableState();
        Iterator<setIconTintList> it = this.setMinAndMaxProgress.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public final void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.setZ = charSequence;
    }

    @Override // o.setCheckableResource, android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        setButtonDrawable(setFilterTouchesWhenObscured.setIconTintList(getContext(), i));
    }

    @Override // o.setCheckableResource, android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        this.setUiOptions = drawable;
        this.setGuidelinePercent = false;
        setX();
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        return this.setUiOptions;
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == colorStateList) {
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = colorStateList;
        setX();
    }

    @Override // android.widget.CompoundButton
    public final ColorStateList getButtonTintList() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        setX();
    }

    public final void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(setFilterTouchesWhenObscured.setIconTintList(getContext(), i));
    }

    public final void setButtonIconDrawable(Drawable drawable) {
        this.setLayoutAnimation = drawable;
        setX();
    }

    public final void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.ViewPager$SavedState$1 == colorStateList) {
            return;
        }
        this.ViewPager$SavedState$1 = colorStateList;
        setX();
    }

    public final void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.setChipCornerRadius == mode) {
            return;
        }
        this.setChipCornerRadius = mode;
        setX();
    }

    public final void setUseMaterialThemeColors(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        this.setCheckedIconEnabled = z;
        if (!z) {
            getCallingUserHandle$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(this, null);
            return;
        }
        if (this.setAnimationFromJson == null) {
            int[][] iArr = setIconTintList;
            int[] iArr2 = new int[iArr.length];
            Context context = getContext();
            TypedValue iconTintList = setShowDividerVertical.setIconTintList(getContext(), (int) R.attr.res_0x7f0400e3, getClass().getCanonicalName());
            if (iconTintList.resourceId != 0) {
                i = setLineHeight.setY(context, iconTintList.resourceId);
            } else {
                i = iconTintList.data;
            }
            Context context2 = getContext();
            TypedValue iconTintList2 = setShowDividerVertical.setIconTintList(getContext(), (int) R.attr.res_0x7f0400e6, getClass().getCanonicalName());
            if (iconTintList2.resourceId != 0) {
                i2 = setLineHeight.setY(context2, iconTintList2.resourceId);
            } else {
                i2 = iconTintList2.data;
            }
            Context context3 = getContext();
            TypedValue iconTintList3 = setShowDividerVertical.setIconTintList(getContext(), (int) R.attr.res_0x7f040101, getClass().getCanonicalName());
            if (iconTintList3.resourceId != 0) {
                i3 = setLineHeight.setY(context3, iconTintList3.resourceId);
            } else {
                i3 = iconTintList3.data;
            }
            Context context4 = getContext();
            TypedValue iconTintList4 = setShowDividerVertical.setIconTintList(getContext(), (int) R.attr.res_0x7f0400f2, getClass().getCanonicalName());
            if (iconTintList4.resourceId != 0) {
                i4 = setLineHeight.setY(context4, iconTintList4.resourceId);
            } else {
                i4 = iconTintList4.data;
            }
            iArr2[0] = setExtended.setY(setExtended.setIconTintList(i2, Math.round(Color.alpha(i2))), i3);
            iArr2[1] = setExtended.setY(setExtended.setIconTintList(i, Math.round(Color.alpha(i))), i3);
            iArr2[2] = setExtended.setY(setExtended.setIconTintList(i4, Math.round(Color.alpha(i4) * 0.54f)), i3);
            iArr2[3] = setExtended.setY(setExtended.setIconTintList(i4, Math.round(Color.alpha(i4) * 0.38f)), i3);
            iArr2[4] = setExtended.setY(setExtended.setIconTintList(i4, Math.round(Color.alpha(i4) * 0.38f)), i3);
            this.setAnimationFromJson = new ColorStateList(iArr, iArr2);
        }
        getCallingUserHandle$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(this, this.setAnimationFromJson);
    }

    public final void setCenterIfNoTextEnabled(boolean z) {
        this.setTextAlignment = z;
    }

    private void setX() {
        PorterDuff.Mode MenuHostHelper$$ExternalSyntheticLambda0;
        Drawable drawable = this.setUiOptions;
        ColorStateList colorStateList = this.MenuHostHelper$$ExternalSyntheticLambda0;
        MenuHostHelper$$ExternalSyntheticLambda0 = getCallingUserHandle$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(this);
        this.setUiOptions = AppCompatSpinner$SavedState$1.setY(drawable, colorStateList, MenuHostHelper$$ExternalSyntheticLambda0, Build.VERSION.SDK_INT < 23);
        this.setLayoutAnimation = AppCompatSpinner$SavedState$1.setY(this.setLayoutAnimation, this.ViewPager$SavedState$1, this.setChipCornerRadius, Build.VERSION.SDK_INT < 23);
        MenuHostHelper$$ExternalSyntheticLambda1();
        setIconTintList();
        super.setButtonDrawable(AppCompatSpinner$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0(this.setUiOptions, this.setLayoutAnimation));
        refreshDrawableState();
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        CoordinatorLayout coordinatorLayout;
        if (this.setGuidelinePercent) {
            CoordinatorLayout coordinatorLayout2 = this.setLayoutDirection;
            if (coordinatorLayout2 != null) {
                coordinatorLayout2.setX(this.setTextAppearanceResource);
                this.setLayoutDirection.setY(this.setTextAppearanceResource);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable = this.setUiOptions;
                if (!(drawable instanceof AnimatedStateListDrawable) || (coordinatorLayout = this.setLayoutDirection) == null) {
                    return;
                }
                ((AnimatedStateListDrawable) drawable).addTransition(R.id.res_0x7f0a007b, R.id.res_0x7f0a020b, coordinatorLayout, false);
                ((AnimatedStateListDrawable) this.setUiOptions).addTransition(R.id.res_0x7f0a00f8, R.id.res_0x7f0a020b, this.setLayoutDirection, false);
            }
        }
    }

    private void setIconTintList() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.setUiOptions;
        if (drawable != null && (colorStateList2 = this.MenuHostHelper$$ExternalSyntheticLambda0) != null) {
            setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(drawable, colorStateList2);
        }
        Drawable drawable2 = this.setLayoutAnimation;
        if (drawable2 == null || (colorStateList = this.ViewPager$SavedState$1) == null) {
            return;
        }
        setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(drawable2, colorStateList);
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final void setStateDescription(CharSequence charSequence) {
        this.setCenterIfNoTextEnabled = charSequence;
        if (charSequence == null) {
            setY();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    private void setY() {
        String str;
        if (Build.VERSION.SDK_INT < 30 || this.setCenterIfNoTextEnabled != null) {
            return;
        }
        int i = this.setIconSize;
        if (i == 1) {
            getResources();
            str = "Checked";
        } else if (i == 0) {
            getResources();
            str = "Not checked";
        } else {
            getResources();
            str = "Partially checked";
        }
        super.setStateDescription(str);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        setY sety = new setY(super.onSaveInstanceState());
        sety.setY = this.setIconSize;
        return sety;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof setY)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        setY sety = (setY) parcelable;
        super.onRestoreInstanceState(sety.getSuperState());
        setCheckedState(sety.setY);
    }

    /* loaded from: classes.dex */
    public static class setY extends View.BaseSavedState {
        int setY;
        private static byte[] setX = {105, 21, -43, 101, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
        public static final int setIconTintList = 216;
        public static final Parcelable.Creator<setY> CREATOR = new Parcelable.Creator<setY>() { // from class: com.google.android.material.checkbox.MaterialCheckBox$SavedState$1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ setTabSelected.setY createFromParcel(Parcel parcel) {
                return new setTabSelected.setY(parcel, (byte) 0);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ setTabSelected.setY[] newArray(int i) {
                return new setTabSelected.setY[i];
            }
        };

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0035). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(byte r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                int r7 = 106 - r7
                int r9 = r9 * 15
                int r9 = 19 - r9
                int r8 = r8 * 4
                int r8 = 16 - r8
                byte[] r0 = o.setTabSelected.setY.setX
                byte[] r1 = new byte[r8]
                int r8 = r8 + (-1)
                r2 = 0
                if (r0 != 0) goto L1a
                r7 = r8
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r10
                r10 = r9
                goto L35
            L1a:
                r3 = 0
            L1b:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2a:
                r3 = r0[r9]
                r5 = r8
                r8 = r7
                r7 = r5
                r6 = r10
                r10 = r9
                r9 = r3
                r3 = r1
                r1 = r0
                r0 = r6
            L35:
                int r8 = r8 + r9
                int r8 = r8 + 2
                int r9 = r10 + 1
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setTabSelected.setY.a(byte, int, short, java.lang.Object[]):void");
        }

        public /* synthetic */ setY(Parcel parcel, byte b) {
            this(parcel);
        }

        setY(Parcelable parcelable) {
            super(parcelable);
        }

        private setY(Parcel parcel) {
            super(parcel);
            this.setY = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.setY));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            try {
                Object[] objArr = {this};
                byte b = (byte) (setX[5] + 1);
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b3 = (byte) (-setX[5]);
                Object[] objArr3 = new Object[1];
                a(b3, (byte) (b3 - 1), (byte) (-setX[5]), objArr3);
                sb.append(Integer.toHexString(((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue()));
                sb.append(" CheckedState=");
                int i = this.setY;
                sb.append(i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked");
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
    }
}