package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import o.setHighlights;

/* loaded from: classes.dex */
public class getStableInsets extends TextView implements setHorizontalScrollbarTrackDrawable, ProcessLifecycleInitializer {
    private setSingleLine MenuHostHelper$$ExternalSyntheticLambda0;
    private final setChipTextResource MenuHostHelper$$ExternalSyntheticLambda1;
    private final setInsetBottom setLayoutAnimation;
    private final setSelectedTabIndicator setUnboundedRipple;
    private Future<setHighlights> setX;
    private boolean setY;

    public getStableInsets(Context context) {
        this(context, null);
    }

    public getStableInsets(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public getStableInsets(Context context, AttributeSet attributeSet, int i) {
        super(setGuidelineBegin.MenuHostHelper$$ExternalSyntheticLambda0(context), attributeSet, i);
        this.setY = false;
        setCompatPressedTranslationZ.setIconTintList(this, getContext());
        setChipTextResource setchiptextresource = new setChipTextResource(this);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setchiptextresource;
        setchiptextresource.setY(attributeSet, i);
        setSelectedTabIndicator setselectedtabindicator = new setSelectedTabIndicator(this);
        this.setUnboundedRipple = setselectedtabindicator;
        setselectedtabindicator.setY(attributeSet, i);
        setselectedtabindicator.MenuHostHelper$$ExternalSyntheticLambda1();
        this.setLayoutAnimation = new setInsetBottom(this);
        setIconTintList().MenuHostHelper$$ExternalSyntheticLambda0(attributeSet, i);
    }

    private setSingleLine setIconTintList() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new setSingleLine(this);
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        setChipTextResource setchiptextresource = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setchiptextresource != null) {
            setchiptextresource.setIconTintList(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        setChipTextResource setchiptextresource = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setchiptextresource != null) {
            setchiptextresource.setY(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setChipTextResource setchiptextresource = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setchiptextresource != null) {
            setchiptextresource.MenuHostHelper$$ExternalSyntheticLambda0(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setChipTextResource setchiptextresource = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setchiptextresource != null) {
            setchiptextresource.setY(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        setSelectedTabIndicator setselectedtabindicator = this.setUnboundedRipple;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.setX(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(setIconTintList().setY(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        setIconTintList().setIconTintList(z);
    }

    public void setEmojiCompatEnabled(boolean z) {
        setIconTintList().MenuHostHelper$$ExternalSyntheticLambda1(z);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        setChipTextResource setchiptextresource = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setchiptextresource != null) {
            setchiptextresource.setX();
        }
        setSelectedTabIndicator setselectedtabindicator = this.setUnboundedRipple;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setSelectedTabIndicator setselectedtabindicator = this.setUnboundedRipple;
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
        setSelectedTabIndicator setselectedtabindicator = this.setUnboundedRipple;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.MenuHostHelper$$ExternalSyntheticLambda1(i, f);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.setUnboundedRipple == null || setIconTintList || !this.setUnboundedRipple.setUnboundedRipple()) {
            return;
        }
        this.setUnboundedRipple.setY();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (setIconTintList) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        setSelectedTabIndicator setselectedtabindicator = this.setUnboundedRipple;
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
        setSelectedTabIndicator setselectedtabindicator = this.setUnboundedRipple;
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
        setSelectedTabIndicator setselectedtabindicator = this.setUnboundedRipple;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.MenuHostHelper$$ExternalSyntheticLambda0(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (setIconTintList) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        setSelectedTabIndicator setselectedtabindicator = this.setUnboundedRipple;
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
        setSelectedTabIndicator setselectedtabindicator = this.setUnboundedRipple;
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
        setSelectedTabIndicator setselectedtabindicator = this.setUnboundedRipple;
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
        setSelectedTabIndicator setselectedtabindicator = this.setUnboundedRipple;
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
        setSelectedTabIndicator setselectedtabindicator = this.setUnboundedRipple;
        return setselectedtabindicator != null ? setselectedtabindicator.setUiOptions() : new int[0];
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0(this, onCreateInputConnection, editorInfo);
        return setScrollY.MenuHostHelper$$ExternalSyntheticLambda1(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            setPreferKeepClearRects.setY(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            setPreferKeepClearRects.setIconTintList(this, i);
        }
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return setPreferKeepClearRects.setX(this);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda0(this, i);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(this, callback));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(super.getCustomSelectionActionModeCallback());
    }

    public void setTextMetricsParamsCompat(setHighlights.setX setx) {
        setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda0(this, setx);
    }

    public void setPrecomputedText(setHighlights sethighlights) {
        setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(this, sethighlights);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        Future<setHighlights> future = this.setX;
        if (future != null) {
            try {
                this.setX = null;
                setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        MenuHostHelper$$ExternalSyntheticLambda1();
        return super.getText();
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        setInsetBottom setinsetbottom;
        if (Build.VERSION.SDK_INT >= 28 || (setinsetbottom = this.setLayoutAnimation) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            setinsetbottom.setY(textClassifier);
        }
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        setInsetBottom setinsetbottom;
        if (Build.VERSION.SDK_INT >= 28 || (setinsetbottom = this.setLayoutAnimation) == null) {
            return super.getTextClassifier();
        }
        return setinsetbottom.setY();
    }

    public void setTextFuture(Future<setHighlights> future) {
        this.setX = future;
        if (future != null) {
            requestLayout();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        MenuHostHelper$$ExternalSyntheticLambda1();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        setSelectedTabIndicator setselectedtabindicator = this.setUnboundedRipple;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.setOnLongClickListener();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        setSelectedTabIndicator setselectedtabindicator = this.setUnboundedRipple;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.setOnLongClickListener();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        setSelectedTabIndicator setselectedtabindicator = this.setUnboundedRipple;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.setOnLongClickListener();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? setFilterTouchesWhenObscured.setIconTintList(context, i) : null, i2 != 0 ? setFilterTouchesWhenObscured.setIconTintList(context, i2) : null, i3 != 0 ? setFilterTouchesWhenObscured.setIconTintList(context, i3) : null, i4 != 0 ? setFilterTouchesWhenObscured.setIconTintList(context, i4) : null);
        setSelectedTabIndicator setselectedtabindicator = this.setUnboundedRipple;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.setOnLongClickListener();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        setSelectedTabIndicator setselectedtabindicator = this.setUnboundedRipple;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.setOnLongClickListener();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? setFilterTouchesWhenObscured.setIconTintList(context, i) : null, i2 != 0 ? setFilterTouchesWhenObscured.setIconTintList(context, i2) : null, i3 != 0 ? setFilterTouchesWhenObscured.setIconTintList(context, i3) : null, i4 != 0 ? setFilterTouchesWhenObscured.setIconTintList(context, i4) : null);
        setSelectedTabIndicator setselectedtabindicator = this.setUnboundedRipple;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.setOnLongClickListener();
        }
    }

    @Override // o.setHorizontalScrollbarTrackDrawable
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1(colorStateList);
        this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // o.setHorizontalScrollbarTrackDrawable
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1(mode);
        this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        if (this.setY) {
            return;
        }
        Typeface x = (typeface == null || i <= 0) ? null : copyRootViewBounds.setX(getContext(), typeface, i);
        this.setY = true;
        if (x != null) {
            typeface = x;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.setY = false;
        }
    }
}