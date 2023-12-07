package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public class GridLayoutManager extends AutoCompleteTextView implements setHorizontalScrollbarTrackDrawable {
    private static final int[] setX = {16843126};
    private final setSelectedTabIndicator MenuHostHelper$$ExternalSyntheticLambda0;
    private final setChipTextResource MenuHostHelper$$ExternalSyntheticLambda1;
    private final setSecondaryProgressTintMode setIconTintList;

    public GridLayoutManager(Context context) {
        this(context, null);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f040039);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i) {
        super(setGuidelineBegin.MenuHostHelper$$ExternalSyntheticLambda0(context), attributeSet, i);
        setCompatPressedTranslationZ.setIconTintList(this, getContext());
        setExpandedHintEnabled MenuHostHelper$$ExternalSyntheticLambda0 = setExpandedHintEnabled.MenuHostHelper$$ExternalSyntheticLambda0(getContext(), attributeSet, setX, i, 0);
        if (MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(0)) {
            setDropDownBackgroundDrawable(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(0));
        }
        MenuHostHelper$$ExternalSyntheticLambda0.setX();
        setChipTextResource setchiptextresource = new setChipTextResource(this);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setchiptextresource;
        setchiptextresource.setY(attributeSet, i);
        setSelectedTabIndicator setselectedtabindicator = new setSelectedTabIndicator(this);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setselectedtabindicator;
        setselectedtabindicator.setY(attributeSet, i);
        setselectedtabindicator.MenuHostHelper$$ExternalSyntheticLambda1();
        setSecondaryProgressTintMode setsecondaryprogresstintmode = new setSecondaryProgressTintMode(this);
        this.setIconTintList = setsecondaryprogresstintmode;
        setsecondaryprogresstintmode.setY(attributeSet, i);
        setX(setsecondaryprogresstintmode);
    }

    void setX(setSecondaryProgressTintMode setsecondaryprogresstintmode) {
        KeyListener keyListener = getKeyListener();
        if (setsecondaryprogresstintmode.setIconTintList(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener y = setsecondaryprogresstintmode.setY(keyListener);
            if (y == keyListener) {
                return;
            }
            super.setKeyListener(y);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(setFilterTouchesWhenObscured.setIconTintList(getContext(), i));
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

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        setChipTextResource setchiptextresource = this.MenuHostHelper$$ExternalSyntheticLambda1;
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.setIconTintList.setX(setScrollY.MenuHostHelper$$ExternalSyntheticLambda1(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(this, callback));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.setIconTintList.setY(keyListener));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.setIconTintList.setIconTintList(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        setSelectedTabIndicator setselectedtabindicator = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.setOnLongClickListener();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        setSelectedTabIndicator setselectedtabindicator = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.setOnLongClickListener();
        }
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
}