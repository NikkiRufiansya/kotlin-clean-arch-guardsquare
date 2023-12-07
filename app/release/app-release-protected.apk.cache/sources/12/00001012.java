package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* loaded from: classes.dex */
public class setSystemUiVisibility extends EditText implements setCompoundDrawablesRelative, setHorizontalScrollbarTrackDrawable {
    private final setSecondaryProgressTintMode MenuHostHelper$$ExternalSyntheticLambda0;
    private final setOnKeyListener MenuHostHelper$$ExternalSyntheticLambda1;
    private final setChipTextResource setIconTintList;
    private final setSelectedTabIndicator setX;
    private final setInsetBottom setY;

    @Override // android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ CharSequence getText() {
        return getText();
    }

    public setSystemUiVisibility(Context context) {
        this(context, null);
    }

    public setSystemUiVisibility(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f04016c);
    }

    public setSystemUiVisibility(Context context, AttributeSet attributeSet, int i) {
        super(setGuidelineBegin.MenuHostHelper$$ExternalSyntheticLambda0(context), attributeSet, i);
        setCompatPressedTranslationZ.setIconTintList(this, getContext());
        setChipTextResource setchiptextresource = new setChipTextResource(this);
        this.setIconTintList = setchiptextresource;
        setchiptextresource.setY(attributeSet, i);
        setSelectedTabIndicator setselectedtabindicator = new setSelectedTabIndicator(this);
        this.setX = setselectedtabindicator;
        setselectedtabindicator.setY(attributeSet, i);
        setselectedtabindicator.MenuHostHelper$$ExternalSyntheticLambda1();
        this.setY = new setInsetBottom(this);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new setOnKeyListener();
        setSecondaryProgressTintMode setsecondaryprogresstintmode = new setSecondaryProgressTintMode(this);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setsecondaryprogresstintmode;
        setsecondaryprogresstintmode.setY(attributeSet, i);
        MenuHostHelper$$ExternalSyntheticLambda0(setsecondaryprogresstintmode);
    }

    void MenuHostHelper$$ExternalSyntheticLambda0(setSecondaryProgressTintMode setsecondaryprogresstintmode) {
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        setChipTextResource setchiptextresource = this.setIconTintList;
        if (setchiptextresource != null) {
            setchiptextresource.setIconTintList(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        setChipTextResource setchiptextresource = this.setIconTintList;
        if (setchiptextresource != null) {
            setchiptextresource.setY(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setChipTextResource setchiptextresource = this.setIconTintList;
        if (setchiptextresource != null) {
            setchiptextresource.MenuHostHelper$$ExternalSyntheticLambda0(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setChipTextResource setchiptextresource = this.setIconTintList;
        if (setchiptextresource != null) {
            setchiptextresource.setY(mode);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        setChipTextResource setchiptextresource = this.setIconTintList;
        if (setchiptextresource != null) {
            setchiptextresource.setX();
        }
        setSelectedTabIndicator setselectedtabindicator = this.setX;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        setSelectedTabIndicator setselectedtabindicator = this.setX;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.setX(context, i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] maxEms;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0(this, onCreateInputConnection, editorInfo);
        InputConnection MenuHostHelper$$ExternalSyntheticLambda1 = setScrollY.MenuHostHelper$$ExternalSyntheticLambda1(onCreateInputConnection, editorInfo, this);
        if (MenuHostHelper$$ExternalSyntheticLambda1 != null && Build.VERSION.SDK_INT <= 30 && (maxEms = setBaselineAlignBottom.setMaxEms(this)) != null) {
            setOverflowReserved.setX(editorInfo, maxEms);
            MenuHostHelper$$ExternalSyntheticLambda1 = setTextIsSelectable.setY(this, MenuHostHelper$$ExternalSyntheticLambda1, editorInfo);
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda0.setX(MenuHostHelper$$ExternalSyntheticLambda1, editorInfo);
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
    public void setTextClassifier(TextClassifier textClassifier) {
        setInsetBottom setinsetbottom;
        if (Build.VERSION.SDK_INT >= 28 || (setinsetbottom = this.setY) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            setinsetbottom.setY(textClassifier);
        }
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        setInsetBottom setinsetbottom;
        if (Build.VERSION.SDK_INT >= 28 || (setinsetbottom = this.setY) == null) {
            return super.getTextClassifier();
        }
        return setinsetbottom.setY();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (setFocusableInTouchMode.setIconTintList(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (setFocusableInTouchMode.setX(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // o.setCompoundDrawablesRelative
    public setStrokeAlpha setX(setStrokeAlpha setstrokealpha) {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(this, setstrokealpha);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.MenuHostHelper$$ExternalSyntheticLambda0.setY(keyListener));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        setSelectedTabIndicator setselectedtabindicator = this.setX;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.setOnLongClickListener();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        setSelectedTabIndicator setselectedtabindicator = this.setX;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.setOnLongClickListener();
        }
    }

    @Override // o.setHorizontalScrollbarTrackDrawable
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.setX.MenuHostHelper$$ExternalSyntheticLambda1(colorStateList);
        this.setX.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // o.setHorizontalScrollbarTrackDrawable
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.setX.MenuHostHelper$$ExternalSyntheticLambda1(mode);
        this.setX.MenuHostHelper$$ExternalSyntheticLambda1();
    }
}