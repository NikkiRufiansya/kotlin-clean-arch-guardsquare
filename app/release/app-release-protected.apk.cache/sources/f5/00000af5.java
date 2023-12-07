package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class setDelayedApplicationOfInitialState extends Drawable {
    final setOnScrollChangeListener MenuHostHelper$$ExternalSyntheticLambda0;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public setDelayedApplicationOfInitialState(setOnScrollChangeListener setonscrollchangelistener) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setonscrollchangelistener;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0.setY != null) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.setY.draw(canvas);
                return;
            }
            return;
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.draw(canvas);
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 == null || !this.MenuHostHelper$$ExternalSyntheticLambda0.setX) {
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0.setY != null) {
                setDelayedApplicationOfInitialState$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1, outline);
            }
        } else if (this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            setDelayedApplicationOfInitialState$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1, outline);
        }
    }
}