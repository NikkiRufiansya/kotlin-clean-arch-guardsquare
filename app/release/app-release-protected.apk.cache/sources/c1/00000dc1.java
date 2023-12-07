package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class setNextFocusDownId extends Drawable {
    float MenuHostHelper$$ExternalSyntheticLambda1;
    float setIconTintList;
    private final RectF setNavigationOnClickListener;
    private final Rect setOnLongClickListener;
    private PorterDuffColorFilter setUiOptions;
    private ColorStateList setUnboundedRipple;
    ColorStateList setY;
    boolean MenuHostHelper$$ExternalSyntheticLambda0 = false;
    boolean setX = true;
    private PorterDuff.Mode setTextAlignment = PorterDuff.Mode.SRC_IN;
    private final Paint setLayoutAnimation = new Paint(5);

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setNextFocusDownId(ColorStateList colorStateList, float f) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = f;
        MenuHostHelper$$ExternalSyntheticLambda0(colorStateList);
        this.setNavigationOnClickListener = new RectF();
        this.setOnLongClickListener = new Rect();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.setY = colorStateList;
        this.setLayoutAnimation.setColor(colorStateList.getColorForState(getState(), this.setY.getDefaultColor()));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.setLayoutAnimation;
        if (this.setUiOptions == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.setUiOptions);
            z = true;
        }
        RectF rectF = this.setNavigationOnClickListener;
        float f = this.MenuHostHelper$$ExternalSyntheticLambda1;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.setNavigationOnClickListener.set(rect.left, rect.top, rect.right, rect.bottom);
        this.setOnLongClickListener.set(rect);
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            float iconTintList = setMinWidthResource.setIconTintList(this.setIconTintList, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setX);
            this.setOnLongClickListener.inset((int) Math.ceil(setMinWidthResource.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setX)), (int) Math.ceil(iconTintList));
            this.setNavigationOnClickListener.set(this.setOnLongClickListener);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        MenuHostHelper$$ExternalSyntheticLambda0(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.setOnLongClickListener, this.MenuHostHelper$$ExternalSyntheticLambda1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.setLayoutAnimation.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.setLayoutAnimation.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.setUnboundedRipple = colorStateList;
        PorterDuff.Mode mode = this.setTextAlignment;
        this.setUiOptions = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.setTextAlignment = mode;
        ColorStateList colorStateList = this.setUnboundedRipple;
        this.setUiOptions = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.setY;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.setLayoutAnimation.getColor();
        if (z) {
            this.setLayoutAnimation.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.setUnboundedRipple;
        if (colorStateList2 == null || (mode = this.setTextAlignment) == null) {
            return z;
        }
        this.setUiOptions = (colorStateList2 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList2.getColorForState(getState(), 0), mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.setUnboundedRipple;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.setY) != null && colorStateList.isStateful()) || super.isStateful();
    }
}