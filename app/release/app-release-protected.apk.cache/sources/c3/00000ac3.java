package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class setContextClickable extends Drawable {
    final Paint MenuHostHelper$$ExternalSyntheticLambda0;
    int MenuHostHelper$$ExternalSyntheticLambda1;
    private ColorStateList setLayoutAnimation;
    int setNavigationOnClickListener;
    setScrollBarDefaultDelayBeforeFade setOnLongClickListener;
    private int setTextAlignment;
    int setUiOptions;
    float setX;
    int setY;
    private final setExpandedTitleTextAppearance setIconSize = setExpandedTitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0.setY;
    private final Path setCenterIfNoTextEnabled = new Path();
    private final Rect setChipCornerRadius = new Rect();
    private final RectF ViewPager$SavedState$1 = new RectF();
    private final RectF setUnboundedRipple = new RectF();
    private final setY setZ = new setY(this, (byte) 0);
    boolean setIconTintList = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setContextClickable(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        this.setOnLongClickListener = setscrollbardefaultdelaybeforefade;
        Paint paint = new Paint(1);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void setIconTintList(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.setTextAlignment = colorStateList.getColorForState(getState(), this.setTextAlignment);
        }
        this.setLayoutAnimation = colorStateList;
        this.setIconTintList = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.setIconTintList) {
            Paint paint = this.MenuHostHelper$$ExternalSyntheticLambda0;
            Rect rect = this.setChipCornerRadius;
            copyBounds(rect);
            float height = this.setX / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{setExtended.setY(this.setNavigationOnClickListener, this.setTextAlignment), setExtended.setY(this.setUiOptions, this.setTextAlignment), setExtended.setY(setExtended.setIconTintList(this.setUiOptions, 0), this.setTextAlignment), setExtended.setY(setExtended.setIconTintList(this.setY, 0), this.setTextAlignment), setExtended.setY(this.setY, this.setTextAlignment), setExtended.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, this.setTextAlignment)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.setIconTintList = false;
        }
        float strokeWidth = this.MenuHostHelper$$ExternalSyntheticLambda0.getStrokeWidth() / 2.0f;
        copyBounds(this.setChipCornerRadius);
        this.ViewPager$SavedState$1.set(this.setChipCornerRadius);
        setImageURI setimageuri = this.setOnLongClickListener.setCenterIfNoTextEnabled;
        this.setUnboundedRipple.set(getBounds());
        float min = Math.min(setimageuri.setY(this.setUnboundedRipple), this.ViewPager$SavedState$1.width() / 2.0f);
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = this.setOnLongClickListener;
        this.setUnboundedRipple.set(getBounds());
        if (setscrollbardefaultdelaybeforefade.setIconTintList(this.setUnboundedRipple)) {
            this.ViewPager$SavedState$1.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.ViewPager$SavedState$1, min, min, this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = this.setOnLongClickListener;
        this.setUnboundedRipple.set(getBounds());
        if (!setscrollbardefaultdelaybeforefade.setIconTintList(this.setUnboundedRipple)) {
            copyBounds(this.setChipCornerRadius);
            this.ViewPager$SavedState$1.set(this.setChipCornerRadius);
            this.setIconSize.setY(this.setOnLongClickListener, 1.0f, this.ViewPager$SavedState$1, null, this.setCenterIfNoTextEnabled);
            if (this.setCenterIfNoTextEnabled.isConvex()) {
                outline.setConvexPath(this.setCenterIfNoTextEnabled);
                return;
            }
            return;
        }
        setImageURI setimageuri = this.setOnLongClickListener.setCenterIfNoTextEnabled;
        this.setUnboundedRipple.set(getBounds());
        outline.setRoundRect(getBounds(), setimageuri.setY(this.setUnboundedRipple));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = this.setOnLongClickListener;
        this.setUnboundedRipple.set(getBounds());
        if (setscrollbardefaultdelaybeforefade.setIconTintList(this.setUnboundedRipple)) {
            int round = Math.round(this.setX);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.setX > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.setIconTintList = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.setLayoutAnimation;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.setLayoutAnimation;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.setTextAlignment)) != this.setTextAlignment) {
            this.setIconTintList = true;
            this.setTextAlignment = colorForState;
        }
        if (this.setIconTintList) {
            invalidateSelf();
        }
        return this.setIconTintList;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.setZ;
    }

    /* loaded from: classes.dex */
    class setY extends Drawable.ConstantState {
        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        private setY() {
        }

        /* synthetic */ setY(setContextClickable setcontextclickable, byte b) {
            this();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return setContextClickable.this;
        }
    }
}