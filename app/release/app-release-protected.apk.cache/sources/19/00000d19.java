package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setLeft extends setTabIconTint {
    private static Method MenuHostHelper$$ExternalSyntheticLambda1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setLeft(Drawable drawable) {
        super(drawable);
        MenuHostHelper$$ExternalSyntheticLambda1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setLeft(MaterialButton$SavedState$1 materialButton$SavedState$1, Resources resources) {
        super(materialButton$SavedState$1, resources);
        MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.setX.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.setX.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.setX.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.setX.getDirtyBounds();
    }

    @Override // o.setTabIconTint, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (setY()) {
            super.setTintList(colorStateList);
        } else {
            this.setX.setTintList(colorStateList);
        }
    }

    @Override // o.setTabIconTint, android.graphics.drawable.Drawable
    public void setTint(int i) {
        if (setY()) {
            super.setTint(i);
        } else {
            this.setX.setTint(i);
        }
    }

    @Override // o.setTabIconTint, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (setY()) {
            super.setTintMode(mode);
        } else {
            this.setX.setTintMode(mode);
        }
    }

    @Override // o.setTabIconTint, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // o.setTabIconTint
    protected boolean setY() {
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = this.setX;
            return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        if (this.setX != null && (method = MenuHostHelper$$ExternalSyntheticLambda1) != null) {
            try {
                return ((Boolean) method.invoke(this.setX, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        if (MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            try {
                MenuHostHelper$$ExternalSyntheticLambda1 = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }
}