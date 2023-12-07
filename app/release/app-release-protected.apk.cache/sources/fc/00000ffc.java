package o;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class setSuffixText$MenuHostHelper$$ExternalSyntheticLambda1 implements Drawable.Callback {
    Drawable.Callback MenuHostHelper$$ExternalSyntheticLambda1;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (callback != null) {
            callback.scheduleDrawable(drawable, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (callback != null) {
            callback.unscheduleDrawable(drawable, runnable);
        }
    }
}