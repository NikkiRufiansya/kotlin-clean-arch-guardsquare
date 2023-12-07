package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import o.TextInputLayout$SavedState$1;
import o.setAnimationFromJson;
import o.setNavigationIconTint;
import o.setOnSeekBarChangeListener;

/* loaded from: classes.dex */
public class setTooltipText extends getStableInsets implements TextInputLayout$SavedState$1.setY, View.OnClickListener, setOnSeekBarChangeListener.setX {
    setNavigationIconTint.setIconTintList MenuHostHelper$$ExternalSyntheticLambda0;
    ActionMenuPresenter$SavedState$1 MenuHostHelper$$ExternalSyntheticLambda1;
    private int setIconSize;
    private Drawable setLayoutAnimation;
    private int setNavigationOnClickListener;
    private int setOnLongClickListener;
    private CharSequence setTextAlignment;
    private boolean setUiOptions;
    private onActivityPreStopped setUnboundedRipple;
    private boolean setX;
    setX setY;

    /* loaded from: classes.dex */
    public static abstract class setX {
        public abstract setEdgeEffectFactory setY();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    @Override // o.TextInputLayout$SavedState$1.setY
    public final boolean setIconTintList() {
        return true;
    }

    public void setShortcut(boolean z, char c) {
    }

    public setTooltipText(Context context) {
        this(context, null);
    }

    public setTooltipText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public setTooltipText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.setX = MenuHostHelper$$ExternalSyntheticLambda1();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setAnimationFromJson.setY.setGuidelinePercent, i, 0);
        this.setNavigationOnClickListener = obtainStyledAttributes.getDimensionPixelSize(setAnimationFromJson.setY.setTextAppearanceResource, 0);
        obtainStyledAttributes.recycle();
        this.setOnLongClickListener = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.setIconSize = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.setX = MenuHostHelper$$ExternalSyntheticLambda1();
        setUiOptions();
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.setIconSize = i;
        super.setPadding(i, i2, i3, i4);
    }

    @Override // o.TextInputLayout$SavedState$1.setY
    public final ActionMenuPresenter$SavedState$1 setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.TextInputLayout$SavedState$1.setY
    public final void setIconTintList(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1) {
        CharSequence title;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = actionMenuPresenter$SavedState$1;
        setIcon(actionMenuPresenter$SavedState$1.getIcon());
        if (setIconTintList()) {
            title = actionMenuPresenter$SavedState$1.getTitleCondensed();
        } else {
            title = actionMenuPresenter$SavedState$1.getTitle();
        }
        setTitle(title);
        setId(actionMenuPresenter$SavedState$1.getItemId());
        setVisibility(actionMenuPresenter$SavedState$1.isVisible() ? 0 : 8);
        setEnabled(actionMenuPresenter$SavedState$1.isEnabled());
        if (actionMenuPresenter$SavedState$1.hasSubMenu() && this.setUnboundedRipple == null) {
            this.setUnboundedRipple = new onActivityPreStopped() { // from class: o.setTooltipText$MenuHostHelper$$ExternalSyntheticLambda1
                {
                    super(setTooltipText.this);
                }

                @Override // o.onActivityPreStopped
                public final setEdgeEffectFactory MenuHostHelper$$ExternalSyntheticLambda0() {
                    if (setTooltipText.this.setY != null) {
                        return setTooltipText.this.setY.setY();
                    }
                    return null;
                }

                @Override // o.onActivityPreStopped
                public final boolean setIconTintList() {
                    setEdgeEffectFactory MenuHostHelper$$ExternalSyntheticLambda0;
                    return setTooltipText.this.MenuHostHelper$$ExternalSyntheticLambda0 != null && setTooltipText.this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setTooltipText.this.MenuHostHelper$$ExternalSyntheticLambda1) && (MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0()) != null && MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple();
                }
            };
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        onActivityPreStopped onactivityprestopped;
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.hasSubMenu() && (onactivityprestopped = this.setUnboundedRipple) != null && onactivityprestopped.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        setNavigationIconTint.setIconTintList seticontintlist = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (seticontintlist != null) {
            seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
    }

    public void setItemInvoker(setNavigationIconTint.setIconTintList seticontintlist) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = seticontintlist;
    }

    public void setPopupCallback(setX setx) {
        this.setY = setx;
    }

    public void setExpandedFormat(boolean z) {
        if (this.setUiOptions != z) {
            this.setUiOptions = z;
            ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (actionMenuPresenter$SavedState$1 != null) {
                setNavigationIconTint setnavigationicontint = actionMenuPresenter$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1;
                setnavigationicontint.setUnboundedRipple = true;
                setnavigationicontint.setIconTintList(true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r5.setUiOptions != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setUiOptions() {
        /*
            r5 = this;
            java.lang.CharSequence r0 = r5.setTextAlignment
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            android.graphics.drawable.Drawable r1 = r5.setLayoutAnimation
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L21
            o.ActionMenuPresenter$SavedState$1 r1 = r5.MenuHostHelper$$ExternalSyntheticLambda1
            int r1 = r1.setNavigationOnClickListener
            r4 = 4
            r1 = r1 & r4
            if (r1 != r4) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 == 0) goto L22
            boolean r1 = r5.setX
            if (r1 != 0) goto L21
            boolean r1 = r5.setUiOptions
            if (r1 == 0) goto L22
        L21:
            r2 = 1
        L22:
            r0 = r0 ^ r3
            r0 = r0 & r2
            r1 = 0
            if (r0 == 0) goto L2a
            java.lang.CharSequence r2 = r5.setTextAlignment
            goto L2b
        L2a:
            r2 = r1
        L2b:
            r5.setText(r2)
            o.ActionMenuPresenter$SavedState$1 r2 = r5.MenuHostHelper$$ExternalSyntheticLambda1
            java.lang.CharSequence r2 = r2.getContentDescription()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L48
            if (r0 == 0) goto L3e
            r2 = r1
            goto L44
        L3e:
            o.ActionMenuPresenter$SavedState$1 r2 = r5.MenuHostHelper$$ExternalSyntheticLambda1
            java.lang.CharSequence r2 = r2.getTitle()
        L44:
            r5.setContentDescription(r2)
            goto L4b
        L48:
            r5.setContentDescription(r2)
        L4b:
            o.ActionMenuPresenter$SavedState$1 r2 = r5.MenuHostHelper$$ExternalSyntheticLambda1
            java.lang.CharSequence r2 = r2.getTooltipText()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L64
            if (r0 == 0) goto L5a
            goto L60
        L5a:
            o.ActionMenuPresenter$SavedState$1 r0 = r5.MenuHostHelper$$ExternalSyntheticLambda1
            java.lang.CharSequence r1 = r0.getTitle()
        L60:
            o.transact.setIconTintList(r5, r1)
            return
        L64:
            o.transact.setIconTintList(r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTooltipText.setUiOptions():void");
    }

    public void setIcon(Drawable drawable) {
        this.setLayoutAnimation = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.setOnLongClickListener;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        setUiOptions();
    }

    public void setTitle(CharSequence charSequence) {
        this.setTextAlignment = charSequence;
        setUiOptions();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // o.setOnSeekBarChangeListener.setX
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // o.setOnSeekBarChangeListener.setX
    public final boolean setX() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.MenuHostHelper$$ExternalSyntheticLambda1.getIcon() == null;
    }

    @Override // o.getStableInsets, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean z = !TextUtils.isEmpty(getText());
        if (z && (i4 = this.setIconSize) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.setNavigationOnClickListener);
        } else {
            i3 = this.setNavigationOnClickListener;
        }
        if (mode != 1073741824 && this.setNavigationOnClickListener > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (z || this.setLayoutAnimation == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.setLayoutAnimation.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }
}