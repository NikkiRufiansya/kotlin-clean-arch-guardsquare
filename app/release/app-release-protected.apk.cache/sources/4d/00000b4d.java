package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public class setEndIconTintList extends ToggleButton implements setHorizontalScrollbarTrackDrawable {
    private setSingleLine MenuHostHelper$$ExternalSyntheticLambda1;
    private final setChipTextResource setIconTintList;
    private final setSelectedTabIndicator setY;

    public setEndIconTintList(Context context) {
        this(context, null);
    }

    public setEndIconTintList(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public setEndIconTintList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setCompatPressedTranslationZ.setIconTintList(this, getContext());
        setChipTextResource setchiptextresource = new setChipTextResource(this);
        this.setIconTintList = setchiptextresource;
        setchiptextresource.setY(attributeSet, i);
        setSelectedTabIndicator setselectedtabindicator = new setSelectedTabIndicator(this);
        this.setY = setselectedtabindicator;
        setselectedtabindicator.setY(attributeSet, i);
        setY().MenuHostHelper$$ExternalSyntheticLambda0(attributeSet, i);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        setChipTextResource setchiptextresource = this.setIconTintList;
        if (setchiptextresource != null) {
            setchiptextresource.setIconTintList(i);
        }
    }

    @Override // android.widget.ToggleButton, android.view.View
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

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        setChipTextResource setchiptextresource = this.setIconTintList;
        if (setchiptextresource != null) {
            setchiptextresource.setX();
        }
        setSelectedTabIndicator setselectedtabindicator = this.setY;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(setY().setY(inputFilterArr));
    }

    private setSingleLine setY() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new setSingleLine(this);
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        setY().setIconTintList(z);
    }

    public void setEmojiCompatEnabled(boolean z) {
        setY().MenuHostHelper$$ExternalSyntheticLambda1(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        setSelectedTabIndicator setselectedtabindicator = this.setY;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.setOnLongClickListener();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        setSelectedTabIndicator setselectedtabindicator = this.setY;
        if (setselectedtabindicator != null) {
            setselectedtabindicator.setOnLongClickListener();
        }
    }

    @Override // o.setHorizontalScrollbarTrackDrawable
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1(colorStateList);
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // o.setHorizontalScrollbarTrackDrawable
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1(mode);
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1();
    }
}