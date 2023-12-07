package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class setOutlineAmbientShadowColor extends ImageView {
    private final setSearchResultHighlightColor setIconTintList;
    private final setChipTextResource setX;
    private boolean setY;

    public setOutlineAmbientShadowColor(Context context) {
        this(context, null);
    }

    public setOutlineAmbientShadowColor(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public setOutlineAmbientShadowColor(Context context, AttributeSet attributeSet, int i) {
        super(setGuidelineBegin.MenuHostHelper$$ExternalSyntheticLambda0(context), attributeSet, i);
        this.setY = false;
        setCompatPressedTranslationZ.setIconTintList(this, getContext());
        setChipTextResource setchiptextresource = new setChipTextResource(this);
        this.setX = setchiptextresource;
        setchiptextresource.setY(attributeSet, i);
        setSearchResultHighlightColor setsearchresulthighlightcolor = new setSearchResultHighlightColor(this);
        this.setIconTintList = setsearchresulthighlightcolor;
        setsearchresulthighlightcolor.setY(attributeSet, i);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        setSearchResultHighlightColor setsearchresulthighlightcolor = this.setIconTintList;
        if (setsearchresulthighlightcolor != null) {
            setsearchresulthighlightcolor.MenuHostHelper$$ExternalSyntheticLambda1(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        setSearchResultHighlightColor setsearchresulthighlightcolor = this.setIconTintList;
        if (setsearchresulthighlightcolor != null && drawable != null && !this.setY) {
            setsearchresulthighlightcolor.MenuHostHelper$$ExternalSyntheticLambda1(drawable);
        }
        super.setImageDrawable(drawable);
        setSearchResultHighlightColor setsearchresulthighlightcolor2 = this.setIconTintList;
        if (setsearchresulthighlightcolor2 != null) {
            setsearchresulthighlightcolor2.setX();
            if (this.setY) {
                return;
            }
            this.setIconTintList.setIconTintList();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        setSearchResultHighlightColor setsearchresulthighlightcolor = this.setIconTintList;
        if (setsearchresulthighlightcolor != null) {
            setsearchresulthighlightcolor.setX();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setSearchResultHighlightColor setsearchresulthighlightcolor = this.setIconTintList;
        if (setsearchresulthighlightcolor != null) {
            setsearchresulthighlightcolor.setX();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        setChipTextResource setchiptextresource = this.setX;
        if (setchiptextresource != null) {
            setchiptextresource.setIconTintList(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        setChipTextResource setchiptextresource = this.setX;
        if (setchiptextresource != null) {
            setchiptextresource.setY(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setChipTextResource setchiptextresource = this.setX;
        if (setchiptextresource != null) {
            setchiptextresource.MenuHostHelper$$ExternalSyntheticLambda0(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setChipTextResource setchiptextresource = this.setX;
        if (setchiptextresource != null) {
            setchiptextresource.setY(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        setSearchResultHighlightColor setsearchresulthighlightcolor = this.setIconTintList;
        if (setsearchresulthighlightcolor != null) {
            setsearchresulthighlightcolor.setY(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        setSearchResultHighlightColor setsearchresulthighlightcolor = this.setIconTintList;
        if (setsearchresulthighlightcolor != null) {
            setsearchresulthighlightcolor.MenuHostHelper$$ExternalSyntheticLambda1(mode);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        setChipTextResource setchiptextresource = this.setX;
        if (setchiptextresource != null) {
            setchiptextresource.setX();
        }
        setSearchResultHighlightColor setsearchresulthighlightcolor = this.setIconTintList;
        if (setsearchresulthighlightcolor != null) {
            setsearchresulthighlightcolor.setX();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1() && super.hasOverlappingRendering();
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.setY = true;
    }
}