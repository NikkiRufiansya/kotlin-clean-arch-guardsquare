package o;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class setTransitionAlpha extends setNumStars {
    private final setX MenuHostHelper$$ExternalSyntheticLambda0;
    private final Typeface MenuHostHelper$$ExternalSyntheticLambda1;
    public boolean setX;

    /* loaded from: classes.dex */
    public interface setX {
        void setY(Typeface typeface);
    }

    public setTransitionAlpha(setX setx, Typeface typeface) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = typeface;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setx;
    }

    @Override // o.setNumStars
    public final void setX(int i) {
        Typeface typeface = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (this.setX) {
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.setY(typeface);
    }

    @Override // o.setNumStars
    public final void MenuHostHelper$$ExternalSyntheticLambda0(Typeface typeface, boolean z) {
        if (this.setX) {
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.setY(typeface);
    }
}