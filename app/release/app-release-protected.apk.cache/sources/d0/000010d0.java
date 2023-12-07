package o;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import o.setContentHeight;

/* loaded from: classes.dex */
public final class setValidator extends setContentHeight.setY {
    public final List<setContentHeight.setY> setIconTintList = new ArrayList(3);

    @Override // o.setContentHeight.setY
    public final void setY(int i, float f, int i2) {
        try {
            for (setContentHeight.setY sety : this.setIconTintList) {
                sety.setY(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // o.setContentHeight.setY
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        try {
            for (setContentHeight.setY sety : this.setIconTintList) {
                sety.MenuHostHelper$$ExternalSyntheticLambda1(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // o.setContentHeight.setY
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        try {
            for (setContentHeight.setY sety : this.setIconTintList) {
                sety.MenuHostHelper$$ExternalSyntheticLambda0(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}