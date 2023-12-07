package o;

import android.view.View;
import java.util.Locale;
import o.setContentHeight;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setOnCapturedPointerListener extends setContentHeight.setY {
    setContentHeight.setUiOptions MenuHostHelper$$ExternalSyntheticLambda0;
    private final androidx.recyclerview.widget.LinearLayoutManager setY;

    @Override // o.setContentHeight.setY
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
    }

    @Override // o.setContentHeight.setY
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setOnCapturedPointerListener(androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        this.setY = linearLayoutManager;
    }

    @Override // o.setContentHeight.setY
    public final void setY(int i, float f, int i2) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            return;
        }
        float f2 = -f;
        for (int i3 = 0; i3 < this.setY.ViewPager$SavedState$1(); i3++) {
            View onLongClickListener = this.setY.setOnLongClickListener(i3);
            if (onLongClickListener == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.setY.ViewPager$SavedState$1())));
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(onLongClickListener, (androidx.recyclerview.widget.LinearLayoutManager.setOnLongClickListener(onLongClickListener) - i) + f2);
        }
    }
}