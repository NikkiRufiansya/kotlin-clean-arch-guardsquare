package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* loaded from: classes.dex */
public class setCalendarViewShown extends Button implements ProcessLifecycleInitializer, setHorizontalScrollbarTrackDrawable {
    private final setSelectedTabIndicator MenuHostHelper$$ExternalSyntheticLambda0;
    private setSingleLine MenuHostHelper$$ExternalSyntheticLambda1;
    private final setChipTextResource setY;

    public setCalendarViewShown(Context context) {
        this(context, null);
    }

    public setCalendarViewShown(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f040083);
    }

    public setCalendarViewShown(Context context, AttributeSet attributeSet, int i) {
        super(setGuidelineBegin.MenuHostHelper$$ExternalSyntheticLambda0(context), attributeSet, i);
        setCompatPressedTranslationZ.setIconTintList(this, getContext());
        setChipTextResource setchiptextresource = new setChipTextResource(this);
        this.setY = setchiptextresource;
        setchiptextresource.setY(attributeSet, i);
        setSelectedTabIndicator setselectedtabindicator = new setSelectedTabIndicator(this);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setselectedtabindicator;
        setselectedtabindicator.setY(attributeSet, i);
        setselectedtabindicator.MenuHostHelper$$ExternalSyntheticLambda1();
        MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda0(attributeSet, i);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        setChipTextResource setchiptextresource = this.setY;
        if (setchiptextresource != null) {
            setchiptextresource.setIconTintList(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        setChipTextResource setchiptextresource = this.setY;
        if (setchiptextresource != null) {
            setchiptextresource.setY(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setChipTextResource setchiptextresource = this.setY;
        if (setchiptextresource != null) {
            setchiptextresource.MenuHostHelper$$ExternalSyntheticLambda0(colorStateList);
        }
    }

    public ColorStateList k_() {
        setChipTextResource setchiptextresource = this.setY;
        if (setchiptextresource != null) {
            return setchiptextresource.MenuHostHelper$$ExternalSyntheticLambda1();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setChipTextResource setchiptextresource = this.setY;
        if (setchiptextresource != null) {
            setchiptextresource.setY(mode);
        }
    }

    public PorterDuff.Mode setY() {
        setChipTextResource setchiptextresource = this.setY;
        if (setchiptextresource != null) {
            return setchiptextresource.MenuHostHelper$$ExternalSyntheticLambda0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        setChipTextResource setchiptextresource = this.setY;
        if (setchiptextresource != null) {
            setchiptextresource.setX();
        }
        setSelectedTabIndicator setselectedtabindicator = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        setSelectedTabIndicator setselectedtabindicator = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.setX(context, i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setSelectedTabIndicator setselectedtabindicator = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.MenuHostHelper$$ExternalSyntheticLambda0(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (setIconTintList) {
            super.setTextSize(i, f);
            return;
        }
        setSelectedTabIndicator setselectedtabindicator = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.MenuHostHelper$$ExternalSyntheticLambda1(i, f);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null || setIconTintList || !this.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple()) {
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.setY();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (setIconTintList) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        setSelectedTabIndicator setselectedtabindicator = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.MenuHostHelper$$ExternalSyntheticLambda0(i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (setIconTintList) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        setSelectedTabIndicator setselectedtabindicator = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.setX(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (setIconTintList) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        setSelectedTabIndicator setselectedtabindicator = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.MenuHostHelper$$ExternalSyntheticLambda0(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (setIconTintList) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        setSelectedTabIndicator setselectedtabindicator = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setselectedtabindicator != null) {
            return setselectedtabindicator.setLayoutAnimation();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (setIconTintList) {
            return super.getAutoSizeStepGranularity();
        }
        setSelectedTabIndicator setselectedtabindicator = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setselectedtabindicator != null) {
            return setselectedtabindicator.setIconTintList();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (setIconTintList) {
            return super.getAutoSizeMinTextSize();
        }
        setSelectedTabIndicator setselectedtabindicator = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setselectedtabindicator != null) {
            return setselectedtabindicator.setX();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (setIconTintList) {
            return super.getAutoSizeMaxTextSize();
        }
        setSelectedTabIndicator setselectedtabindicator = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setselectedtabindicator != null) {
            return setselectedtabindicator.MenuHostHelper$$ExternalSyntheticLambda0();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (setIconTintList) {
            return super.getAutoSizeTextAvailableSizes();
        }
        setSelectedTabIndicator setselectedtabindicator = this.MenuHostHelper$$ExternalSyntheticLambda0;
        return setselectedtabindicator != null ? setselectedtabindicator.setUiOptions() : new int[0];
    }

    public void setSupportAllCaps(boolean z) {
        setSelectedTabIndicator setselectedtabindicator = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.setY(z);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(this, callback));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(super.getCustomSelectionActionModeCallback());
    }

    @Override // o.setHorizontalScrollbarTrackDrawable
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(colorStateList);
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // o.setHorizontalScrollbarTrackDrawable
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(mode);
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(MenuHostHelper$$ExternalSyntheticLambda1().setY(inputFilterArr));
    }

    private setSingleLine MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new setSingleLine(this);
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        MenuHostHelper$$ExternalSyntheticLambda1().setIconTintList(z);
    }

    public void setEmojiCompatEnabled(boolean z) {
        MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda1(z);
    }
}