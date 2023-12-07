package o;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;

/* loaded from: classes.dex */
final class setSelector extends setWebViewClient {
    final RectF setY;

    setSelector() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setSelector(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        super(setscrollbardefaultdelaybeforefade == null ? new setScrollBarDefaultDelayBeforeFade() : setscrollbardefaultdelaybeforefade);
        this.setY = new RectF();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(float f, float f2, float f3, float f4) {
        if (f == this.setY.left && f2 == this.setY.top && f3 == this.setY.right && f4 == this.setY.bottom) {
            return;
        }
        this.setY.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // o.setWebViewClient
    public final void setX(Canvas canvas) {
        if (this.setY.isEmpty()) {
            super.setX(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.setY);
        } else {
            canvas.clipRect(this.setY, Region.Op.DIFFERENCE);
        }
        super.setX(canvas);
        canvas.restore();
    }
}