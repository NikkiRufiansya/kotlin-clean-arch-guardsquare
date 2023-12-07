package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* loaded from: classes.dex */
public class setCheckableResource extends CheckBox implements setRecyclerListener, setHorizontalScrollbarTrackDrawable {
    private setSingleLine MenuHostHelper$$ExternalSyntheticLambda0;
    private final setSelectedTabIndicator MenuHostHelper$$ExternalSyntheticLambda1;
    private final setScrollX setIconTintList;
    private final setChipTextResource setY;

    public setCheckableResource(Context context) {
        this(context, null);
    }

    public setCheckableResource(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f04009e);
    }

    public setCheckableResource(Context context, AttributeSet attributeSet, int i) {
        super(setGuidelineBegin.MenuHostHelper$$ExternalSyntheticLambda0(context), attributeSet, i);
        setCompatPressedTranslationZ.setIconTintList(this, getContext());
        setScrollX setscrollx = new setScrollX(this);
        this.setIconTintList = setscrollx;
        setscrollx.setY(attributeSet, i);
        setChipTextResource setchiptextresource = new setChipTextResource(this);
        this.setY = setchiptextresource;
        setchiptextresource.setY(attributeSet, i);
        setSelectedTabIndicator setselectedtabindicator = new setSelectedTabIndicator(this);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setselectedtabindicator;
        setselectedtabindicator.setY(attributeSet, i);
        setIconTintList().MenuHostHelper$$ExternalSyntheticLambda0(attributeSet, i);
    }

    private setSingleLine setIconTintList() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new setSingleLine(this);
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        setScrollX setscrollx = this.setIconTintList;
        if (setscrollx != null) {
            setscrollx.setIconTintList();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(setFilterTouchesWhenObscured.setIconTintList(getContext(), i));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        setScrollX setscrollx = this.setIconTintList;
        return setscrollx != null ? setscrollx.setX(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // o.setRecyclerListener
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        setScrollX setscrollx = this.setIconTintList;
        if (setscrollx != null) {
            setscrollx.setY(colorStateList);
        }
    }

    @Override // o.setRecyclerListener
    public ColorStateList MenuHostHelper$$ExternalSyntheticLambda0() {
        setScrollX setscrollx = this.setIconTintList;
        if (setscrollx != null) {
            return setscrollx.MenuHostHelper$$ExternalSyntheticLambda0();
        }
        return null;
    }

    @Override // o.setRecyclerListener
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        setScrollX setscrollx = this.setIconTintList;
        if (setscrollx != null) {
            setscrollx.setY(mode);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setChipTextResource setchiptextresource = this.setY;
        if (setchiptextresource != null) {
            setchiptextresource.MenuHostHelper$$ExternalSyntheticLambda0(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setChipTextResource setchiptextresource = this.setY;
        if (setchiptextresource != null) {
            setchiptextresource.setY(mode);
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

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        setChipTextResource setchiptextresource = this.setY;
        if (setchiptextresource != null) {
            setchiptextresource.setIconTintList(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        setChipTextResource setchiptextresource = this.setY;
        if (setchiptextresource != null) {
            setchiptextresource.setX();
        }
        setSelectedTabIndicator setselectedtabindicator = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.MenuHostHelper$$ExternalSyntheticLambda1();
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

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        setSelectedTabIndicator setselectedtabindicator = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.setOnLongClickListener();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        setSelectedTabIndicator setselectedtabindicator = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.setOnLongClickListener();
        }
    }

    @Override // o.setHorizontalScrollbarTrackDrawable
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(colorStateList);
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // o.setHorizontalScrollbarTrackDrawable
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(mode);
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
    }
}