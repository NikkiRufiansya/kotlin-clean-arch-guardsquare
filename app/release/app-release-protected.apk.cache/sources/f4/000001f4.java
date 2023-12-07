package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MaterialButton$SavedState$1 extends Drawable.ConstantState {
    ColorStateList MenuHostHelper$$ExternalSyntheticLambda0;
    PorterDuff.Mode setIconTintList;
    int setX;
    Drawable.ConstantState setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MaterialButton$SavedState$1(MaterialButton$SavedState$1 materialButton$SavedState$1) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
        this.setIconTintList = setTabIconTint.MenuHostHelper$$ExternalSyntheticLambda0;
        if (materialButton$SavedState$1 != null) {
            this.setX = materialButton$SavedState$1.setX;
            this.setY = materialButton$SavedState$1.setY;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = materialButton$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0;
            this.setIconTintList = materialButton$SavedState$1.setIconTintList;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new setLeft(this, resources);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i = this.setX;
        Drawable.ConstantState constantState = this.setY;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }
}