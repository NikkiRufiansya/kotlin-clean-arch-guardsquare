package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class setScrollCaptureHint extends setEndIconCheckable {
    @Override // o.setEndIconCheckable
    final void MenuHostHelper$$ExternalSyntheticLambda1(Canvas canvas, Matrix matrix, int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setScrollCaptureHint(setPointerIcon setpointericon, setSimpleItems setsimpleitems) {
        super(setpointericon, setsimpleitems);
    }

    @Override // o.setEndIconCheckable, o.EmojiCompatInitializer.AnonymousClass1
    public final void setIconTintList(RectF rectF, Matrix matrix, boolean z) {
        super.setIconTintList(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}