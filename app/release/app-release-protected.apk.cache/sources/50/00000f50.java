package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import o.setAnimationFromJson;
import o.setSupportCheckMarkTintList;

/* loaded from: classes.dex */
public class setSearchResultHighlightColor {
    private setStripEnabled MenuHostHelper$$ExternalSyntheticLambda0;
    private setStripEnabled MenuHostHelper$$ExternalSyntheticLambda1;
    private int setIconTintList = 0;
    private final ImageView setX;
    private setStripEnabled setY;

    public setSearchResultHighlightColor(ImageView imageView) {
        this.setX = imageView;
    }

    public void setY(AttributeSet attributeSet, int i) {
        int navigationOnClickListener;
        setExpandedHintEnabled MenuHostHelper$$ExternalSyntheticLambda0 = setExpandedHintEnabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setX.getContext(), attributeSet, setAnimationFromJson.setY.setFilterTouchesWhenObscured, i, 0);
        ImageView imageView = this.setX;
        setBaselineAlignBottom.setY(imageView, imageView.getContext(), setAnimationFromJson.setY.setFilterTouchesWhenObscured, attributeSet, MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(), i, 0);
        try {
            Drawable drawable = this.setX.getDrawable();
            if (drawable == null && (navigationOnClickListener = MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener(setAnimationFromJson.setY.setAdapter, -1)) != -1 && (drawable = setFilterTouchesWhenObscured.setIconTintList(this.setX.getContext(), navigationOnClickListener)) != null) {
                this.setX.setImageDrawable(drawable);
            }
            if (drawable != null) {
                setCheckMarkDrawable.setX(drawable);
            }
            if (MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(setAnimationFromJson.setY.setChipIconEnabled)) {
                ImageView imageView2 = this.setX;
                int i2 = setAnimationFromJson.setY.setChipIconEnabled;
                setSupportCheckMarkTintList.setY(imageView2, MenuHostHelper$$ExternalSyntheticLambda0.setY(2));
            }
            if (MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(setAnimationFromJson.setY.RecyclerView$SavedState$1)) {
                ImageView imageView3 = this.setX;
                int i3 = setAnimationFromJson.setY.RecyclerView$SavedState$1;
                setSupportCheckMarkTintList.setX(imageView3, setCheckMarkDrawable.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(3, -1), null));
            }
        } finally {
            MenuHostHelper$$ExternalSyntheticLambda0.setX();
        }
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        if (i != 0) {
            Drawable iconTintList = setFilterTouchesWhenObscured.setIconTintList(this.setX.getContext(), i);
            if (iconTintList != null) {
                setCheckMarkDrawable.setX(iconTintList);
            }
            this.setX.setImageDrawable(iconTintList);
        } else {
            this.setX.setImageDrawable(null);
        }
        setX();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return !(this.setX.getBackground() instanceof RippleDrawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setY(ColorStateList colorStateList) {
        if (this.setY == null) {
            this.setY = new setStripEnabled();
        }
        this.setY.setIconTintList = colorStateList;
        this.setY.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        setX();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda1(PorterDuff.Mode mode) {
        if (this.setY == null) {
            this.setY = new setStripEnabled();
        }
        this.setY.setX = mode;
        this.setY.setY = true;
        setX();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setX() {
        Drawable drawable = this.setX.getDrawable();
        if (drawable != null) {
            setCheckMarkDrawable.setX(drawable);
        }
        if (drawable != null) {
            if (MenuHostHelper$$ExternalSyntheticLambda0() && setIconTintList(drawable)) {
                return;
            }
            setStripEnabled setstripenabled = this.setY;
            if (setstripenabled != null) {
                setSelectionFromTop.setY(drawable, setstripenabled, this.setX.getDrawableState());
                return;
            }
            setStripEnabled setstripenabled2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setstripenabled2 != null) {
                setSelectionFromTop.setY(drawable, setstripenabled2, this.setX.getDrawableState());
            }
        }
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.MenuHostHelper$$ExternalSyntheticLambda1 != null : i == 21;
    }

    private boolean setIconTintList(Drawable drawable) {
        PorterDuff.Mode y;
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new setStripEnabled();
        }
        setStripEnabled setstripenabled = this.MenuHostHelper$$ExternalSyntheticLambda0;
        setstripenabled.setIconTintList = null;
        setstripenabled.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        setstripenabled.setX = null;
        setstripenabled.setY = false;
        ColorStateList x = setSupportCheckMarkTintList.setX(this.setX);
        if (x != null) {
            setstripenabled.MenuHostHelper$$ExternalSyntheticLambda0 = true;
            setstripenabled.setIconTintList = x;
        }
        y = setSupportCheckMarkTintList.setX.setY(this.setX);
        if (y != null) {
            setstripenabled.setY = true;
            setstripenabled.setX = y;
        }
        if (setstripenabled.MenuHostHelper$$ExternalSyntheticLambda0 || setstripenabled.setY) {
            setSelectionFromTop.setY(drawable, setstripenabled, this.setX.getDrawableState());
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda1(Drawable drawable) {
        this.setIconTintList = drawable.getLevel();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIconTintList() {
        if (this.setX.getDrawable() != null) {
            this.setX.getDrawable().setLevel(this.setIconTintList);
        }
    }
}