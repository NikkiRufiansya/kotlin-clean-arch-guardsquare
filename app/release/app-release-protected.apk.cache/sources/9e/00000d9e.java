package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class setMinWidthResource extends Drawable {
    private static final double setIconTintList = Math.cos(Math.toRadians(45.0d));
    private final RectF MenuHostHelper$$ExternalSyntheticLambda0;
    private boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private float setCenterIfNoTextEnabled;
    private float setChipCornerRadius;
    private Paint setIconSize;
    private final int setLayoutAnimation;
    private Paint setNavigationOnClickListener;
    private Paint setOnLongClickListener;
    private float setTextAlignment;
    private Path setUiOptions;
    private boolean setUnboundedRipple;
    private float setX;
    private ColorStateList setY;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.setUnboundedRipple = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(0.0d);
        int ceil2 = (int) Math.ceil(0.0d);
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float setIconTintList(float f, float f2, boolean z) {
        return z ? (float) ((f * 1.5f) + ((1.0d - setIconTintList) * f2)) : f * 1.5f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float MenuHostHelper$$ExternalSyntheticLambda0(float f, float f2, boolean z) {
        return z ? (float) (f + ((1.0d - setIconTintList) * f2)) : f;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        if (this.setUnboundedRipple) {
            Rect bounds = getBounds();
            this.MenuHostHelper$$ExternalSyntheticLambda0.set(bounds.left + this.setCenterIfNoTextEnabled, bounds.top + 0.0f, bounds.right - this.setCenterIfNoTextEnabled, bounds.bottom);
            RectF rectF = new RectF(-0.0f, -0.0f, 0.0f, 0.0f);
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(-0.0f, -0.0f);
            Path path = this.setUiOptions;
            if (path == null) {
                this.setUiOptions = new Path();
            } else {
                path.reset();
            }
            this.setUiOptions.setFillType(Path.FillType.EVEN_ODD);
            this.setUiOptions.moveTo(-0.0f, 0.0f);
            this.setUiOptions.rLineTo(-0.0f, 0.0f);
            this.setUiOptions.arcTo(rectF2, 180.0f, 90.0f, false);
            this.setUiOptions.arcTo(rectF, 270.0f, -90.0f, false);
            this.setUiOptions.close();
            throw new ArithmeticException();
        }
        canvas.translate(0.0f, this.setChipCornerRadius / 2.0f);
        float f = this.setLayoutAnimation + 0.0f + (this.setChipCornerRadius / 2.0f);
        float f2 = f * 2.0f;
        boolean z = this.MenuHostHelper$$ExternalSyntheticLambda0.width() - f2 > 0.0f;
        boolean z2 = this.MenuHostHelper$$ExternalSyntheticLambda0.height() - f2 > 0.0f;
        int save = canvas.save();
        canvas.translate(this.MenuHostHelper$$ExternalSyntheticLambda0.left + f, this.MenuHostHelper$$ExternalSyntheticLambda0.top + f);
        canvas.drawPath(this.setUiOptions, this.setOnLongClickListener);
        if (z) {
            i = save;
            canvas.drawRect(0.0f, -0.0f, this.MenuHostHelper$$ExternalSyntheticLambda0.width() - f2, -0.0f, null);
        } else {
            i = save;
        }
        canvas.restoreToCount(i);
        int save2 = canvas.save();
        canvas.translate(this.MenuHostHelper$$ExternalSyntheticLambda0.right - f, this.MenuHostHelper$$ExternalSyntheticLambda0.bottom - f);
        canvas.rotate(180.0f);
        canvas.drawPath(this.setUiOptions, this.setOnLongClickListener);
        if (z) {
            canvas.drawRect(0.0f, -0.0f, this.MenuHostHelper$$ExternalSyntheticLambda0.width() - f2, 0.0f, null);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.MenuHostHelper$$ExternalSyntheticLambda0.left + f, this.MenuHostHelper$$ExternalSyntheticLambda0.bottom - f);
        canvas.rotate(270.0f);
        canvas.drawPath(this.setUiOptions, this.setOnLongClickListener);
        if (z2) {
            canvas.drawRect(0.0f, -0.0f, this.MenuHostHelper$$ExternalSyntheticLambda0.height() - f2, -0.0f, null);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        canvas.translate(this.MenuHostHelper$$ExternalSyntheticLambda0.right - f, this.MenuHostHelper$$ExternalSyntheticLambda0.top + f);
        canvas.rotate(90.0f);
        canvas.drawPath(this.setUiOptions, this.setOnLongClickListener);
        if (z2) {
            canvas.drawRect(0.0f, -0.0f, this.MenuHostHelper$$ExternalSyntheticLambda0.height() - f2, -0.0f, null);
        }
        canvas.restoreToCount(save4);
        canvas.translate(0.0f, -0.0f);
        throw null;
    }
}