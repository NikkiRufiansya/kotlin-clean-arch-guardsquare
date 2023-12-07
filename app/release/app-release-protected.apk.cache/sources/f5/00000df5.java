package o;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class setOnDragListener {
    private final AtomicBoolean MenuHostHelper$$ExternalSyntheticLambda1 = new AtomicBoolean(false);
    private volatile setTextSelectHandleRight setX;
    private final MaterialCheckBox$SavedState$1 setY;

    protected abstract String MenuHostHelper$$ExternalSyntheticLambda0();

    public setOnDragListener(MaterialCheckBox$SavedState$1 materialCheckBox$SavedState$1) {
        this.setY = materialCheckBox$SavedState$1;
    }

    private setTextSelectHandleRight setX() {
        String MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        MaterialCheckBox$SavedState$1 materialCheckBox$SavedState$1 = this.setY;
        if (materialCheckBox$SavedState$1.setX || !MaterialCheckBox$SavedState$1.setIconTintList()) {
            materialCheckBox$SavedState$1.setY();
            return materialCheckBox$SavedState$1.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0().setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0);
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(setTextSelectHandleRight settextselecthandleright) {
        if (settextselecthandleright == this.setX) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.set(false);
        }
    }

    public final setTextSelectHandleRight setIconTintList() {
        if (this.setY.setX || !MaterialCheckBox$SavedState$1.setIconTintList()) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1.compareAndSet(false, true)) {
                if (this.setX == null) {
                    this.setX = setX();
                }
                return this.setX;
            }
            return setX();
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }
}