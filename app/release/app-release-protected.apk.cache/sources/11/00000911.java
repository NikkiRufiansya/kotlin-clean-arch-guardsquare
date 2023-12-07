package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* loaded from: classes.dex */
public class setAccessibilityTraversalAfter extends ImageButton {
    private boolean MenuHostHelper$$ExternalSyntheticLambda0;
    private final setChipTextResource MenuHostHelper$$ExternalSyntheticLambda1;
    private final setSearchResultHighlightColor setX;

    public setAccessibilityTraversalAfter(Context context) {
        this(context, null);
    }

    public setAccessibilityTraversalAfter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f0401fb);
    }

    public setAccessibilityTraversalAfter(Context context, AttributeSet attributeSet, int i) {
        super(setGuidelineBegin.MenuHostHelper$$ExternalSyntheticLambda0(context), attributeSet, i);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        setCompatPressedTranslationZ.setIconTintList(this, getContext());
        setChipTextResource setchiptextresource = new setChipTextResource(this);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setchiptextresource;
        setchiptextresource.setY(attributeSet, i);
        setSearchResultHighlightColor setsearchresulthighlightcolor = new setSearchResultHighlightColor(this);
        this.setX = setsearchresulthighlightcolor;
        setsearchresulthighlightcolor.setY(attributeSet, i);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.setX.MenuHostHelper$$ExternalSyntheticLambda1(i);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        setSearchResultHighlightColor setsearchresulthighlightcolor = this.setX;
        if (setsearchresulthighlightcolor != null && drawable != null && !this.MenuHostHelper$$ExternalSyntheticLambda0) {
            setsearchresulthighlightcolor.MenuHostHelper$$ExternalSyntheticLambda1(drawable);
        }
        super.setImageDrawable(drawable);
        setSearchResultHighlightColor setsearchresulthighlightcolor2 = this.setX;
        if (setsearchresulthighlightcolor2 != null) {
            setsearchresulthighlightcolor2.setX();
            if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                return;
            }
            this.setX.setIconTintList();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        setSearchResultHighlightColor setsearchresulthighlightcolor = this.setX;
        if (setsearchresulthighlightcolor != null) {
            setsearchresulthighlightcolor.setX();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setSearchResultHighlightColor setsearchresulthighlightcolor = this.setX;
        if (setsearchresulthighlightcolor != null) {
            setsearchresulthighlightcolor.setX();
        }
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

    public void setSupportImageTintList(ColorStateList colorStateList) {
        setSearchResultHighlightColor setsearchresulthighlightcolor = this.setX;
        if (setsearchresulthighlightcolor != null) {
            setsearchresulthighlightcolor.setY(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        setSearchResultHighlightColor setsearchresulthighlightcolor = this.setX;
        if (setsearchresulthighlightcolor != null) {
            setsearchresulthighlightcolor.MenuHostHelper$$ExternalSyntheticLambda1(mode);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        setChipTextResource setchiptextresource = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setchiptextresource != null) {
            setchiptextresource.setX();
        }
        setSearchResultHighlightColor setsearchresulthighlightcolor = this.setX;
        if (setsearchresulthighlightcolor != null) {
            setsearchresulthighlightcolor.setX();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.setX.MenuHostHelper$$ExternalSyntheticLambda1() && super.hasOverlappingRendering();
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
    }
}