package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
public class setRippleColorResource extends CheckedTextView implements setHorizontalScrollbarTrackDrawable {
    private setSingleLine MenuHostHelper$$ExternalSyntheticLambda1;
    private final setChipTextResource setIconTintList;
    private final setSelectedTabIndicator setX;
    private final wrap setY;

    public setRippleColorResource(Context context) {
        this(context, null);
    }

    public setRippleColorResource(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f0400a9);
    }

    public setRippleColorResource(Context context, AttributeSet attributeSet, int i) {
        super(setGuidelineBegin.MenuHostHelper$$ExternalSyntheticLambda0(context), attributeSet, i);
        setCompatPressedTranslationZ.setIconTintList(this, getContext());
        setSelectedTabIndicator setselectedtabindicator = new setSelectedTabIndicator(this);
        this.setX = setselectedtabindicator;
        setselectedtabindicator.setY(attributeSet, i);
        setselectedtabindicator.MenuHostHelper$$ExternalSyntheticLambda1();
        setChipTextResource setchiptextresource = new setChipTextResource(this);
        this.setIconTintList = setchiptextresource;
        setchiptextresource.setY(attributeSet, i);
        wrap wrapVar = new wrap(this);
        this.setY = wrapVar;
        wrapVar.setX(attributeSet, i);
        setIconTintList().MenuHostHelper$$ExternalSyntheticLambda0(attributeSet, i);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        wrap wrapVar = this.setY;
        if (wrapVar != null) {
            wrapVar.MenuHostHelper$$ExternalSyntheticLambda0();
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(setFilterTouchesWhenObscured.setIconTintList(getContext(), i));
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        wrap wrapVar = this.setY;
        if (wrapVar != null) {
            wrapVar.setY(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        wrap wrapVar = this.setY;
        if (wrapVar != null) {
            wrapVar.MenuHostHelper$$ExternalSyntheticLambda0(mode);
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

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        setChipTextResource setchiptextresource = this.setIconTintList;
        if (setchiptextresource != null) {
            setchiptextresource.setY(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        setChipTextResource setchiptextresource = this.setIconTintList;
        if (setchiptextresource != null) {
            setchiptextresource.setIconTintList(i);
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

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        setSelectedTabIndicator setselectedtabindicator = this.setX;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.MenuHostHelper$$ExternalSyntheticLambda1();
        }
        setChipTextResource setchiptextresource = this.setIconTintList;
        if (setchiptextresource != null) {
            setchiptextresource.setX();
        }
        wrap wrapVar = this.setY;
        if (wrapVar != null) {
            wrapVar.setIconTintList();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return setScrollY.MenuHostHelper$$ExternalSyntheticLambda1(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(this, callback));
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(super.getCustomSelectionActionModeCallback());
    }

    private setSingleLine setIconTintList() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new setSingleLine(this);
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        setIconTintList().setIconTintList(z);
    }

    public void setEmojiCompatEnabled(boolean z) {
        setIconTintList().MenuHostHelper$$ExternalSyntheticLambda1(z);
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