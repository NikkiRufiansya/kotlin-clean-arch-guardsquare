package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import o.setEnsureMinTouchTargetSize;

/* loaded from: classes.dex */
public class setObjectValues extends Drawable implements Drawable.Callback {
    private Drawable MenuHostHelper$$ExternalSyntheticLambda1;

    public setObjectValues(Drawable drawable) {
        Drawable drawable2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.MenuHostHelper$$ExternalSyntheticLambda1.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.MenuHostHelper$$ExternalSyntheticLambda1.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.getPadding(rect);
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
        return this.MenuHostHelper$$ExternalSyntheticLambda1.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return setEnsureMinTouchTargetSize.setUnboundedRipple(this.MenuHostHelper$$ExternalSyntheticLambda1);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1, i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        setEnsureMinTouchTargetSize.setX(this.MenuHostHelper$$ExternalSyntheticLambda1, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        setEnsureMinTouchTargetSize.setX(this.MenuHostHelper$$ExternalSyntheticLambda1, f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setHotspotBounds(i, i2, i3, i4);
    }
}