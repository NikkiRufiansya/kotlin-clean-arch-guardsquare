package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setTabIconTint extends Drawable implements Drawable.Callback, setExpanded, setButtonDrawable {
    static final PorterDuff.Mode MenuHostHelper$$ExternalSyntheticLambda0 = PorterDuff.Mode.SRC_IN;
    private int MenuHostHelper$$ExternalSyntheticLambda1;
    MaterialButton$SavedState$1 setIconTintList;
    private PorterDuff.Mode setLayoutAnimation;
    private boolean setUiOptions;
    Drawable setX;
    private boolean setY;

    protected boolean setY() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setTabIconTint(MaterialButton$SavedState$1 materialButton$SavedState$1, Resources resources) {
        this.setIconTintList = materialButton$SavedState$1;
        setX(resources);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setTabIconTint(Drawable drawable) {
        this.setIconTintList = setIconTintList();
        setX(drawable);
    }

    private void setX(Resources resources) {
        MaterialButton$SavedState$1 materialButton$SavedState$1 = this.setIconTintList;
        if (materialButton$SavedState$1 == null || materialButton$SavedState$1.setY == null) {
            return;
        }
        setX(this.setIconTintList.setY.newDrawable(resources));
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.setX.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.setX.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.setX;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.setX.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        MaterialButton$SavedState$1 materialButton$SavedState$1 = this.setIconTintList;
        return changingConfigurations | (materialButton$SavedState$1 != null ? materialButton$SavedState$1.getChangingConfigurations() : 0) | this.setX.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.setX.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.setX.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.setX.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.setX.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        MaterialButton$SavedState$1 materialButton$SavedState$1;
        ColorStateList colorStateList = (!setY() || (materialButton$SavedState$1 = this.setIconTintList) == null) ? null : materialButton$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0;
        return (colorStateList != null && colorStateList.isStateful()) || this.setX.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return setY(iArr) || this.setX.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.setX.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.setX.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.setX.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.setX.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.setX.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.setX.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.setX.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.setX.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.setX.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.setX.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.setX.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return setEnsureMinTouchTargetSize.setUnboundedRipple(this.setX);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda0(this.setX, i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return setEnsureMinTouchTargetSize.setIconTintList(this.setX);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        MaterialButton$SavedState$1 materialButton$SavedState$1 = this.setIconTintList;
        if (materialButton$SavedState$1 != null) {
            if (materialButton$SavedState$1.setY != null) {
                this.setIconTintList.setX = getChangingConfigurations();
                return this.setIconTintList;
            }
            return null;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.setUiOptions && super.mutate() == this) {
            this.setIconTintList = setIconTintList();
            Drawable drawable = this.setX;
            if (drawable != null) {
                drawable.mutate();
            }
            MaterialButton$SavedState$1 materialButton$SavedState$1 = this.setIconTintList;
            if (materialButton$SavedState$1 != null) {
                Drawable drawable2 = this.setX;
                materialButton$SavedState$1.setY = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.setUiOptions = true;
        }
        return this;
    }

    private MaterialButton$SavedState$1 setIconTintList() {
        return new MaterialButton$SavedState$1(this.setIconTintList);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.setX.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0 = colorStateList;
        setY(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.setIconTintList.setIconTintList = mode;
        setY(getState());
    }

    private boolean setY(int[] iArr) {
        if (setY()) {
            ColorStateList colorStateList = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0;
            PorterDuff.Mode mode = this.setIconTintList.setIconTintList;
            if (colorStateList != null && mode != null) {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.setY || colorForState != this.MenuHostHelper$$ExternalSyntheticLambda1 || mode != this.setLayoutAnimation) {
                    setColorFilter(colorForState, mode);
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = colorForState;
                    this.setLayoutAnimation = mode;
                    this.setY = true;
                    return true;
                }
            } else {
                this.setY = false;
                clearColorFilter();
            }
            return false;
        }
        return false;
    }

    @Override // o.setExpanded
    public final Drawable MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setX;
    }

    @Override // o.setExpanded
    public final void setX(Drawable drawable) {
        Drawable drawable2 = this.setX;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.setX = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            MaterialButton$SavedState$1 materialButton$SavedState$1 = this.setIconTintList;
            if (materialButton$SavedState$1 != null) {
                materialButton$SavedState$1.setY = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}