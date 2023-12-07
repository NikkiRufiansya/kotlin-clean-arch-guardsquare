package o;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class suppressLayout implements FirebaseSessionsRegistrar<PointF, PointF> {
    private final List<setChildIndicatorBoundsRelative<PointF>> setX;

    public suppressLayout() {
        this.setX = Collections.singletonList(new setChildIndicatorBoundsRelative(new PointF(0.0f, 0.0f)));
    }

    public suppressLayout(List<setChildIndicatorBoundsRelative<PointF>> list) {
        this.setX = list;
    }

    @Override // o.FirebaseSessionsRegistrar
    public final List<setChildIndicatorBoundsRelative<PointF>> setIconTintList() {
        return this.setX;
    }

    @Override // o.FirebaseSessionsRegistrar
    public final boolean setY() {
        if (this.setX.size() == 1) {
            if (this.setX.get(0).setUnboundedRipple == null) {
                return true;
            }
        }
        return false;
    }

    @Override // o.FirebaseSessionsRegistrar
    public final setSubtitleTextAppearance<PointF, PointF> setX() {
        if (this.setX.get(0).setUnboundedRipple == null) {
            return new setChildIndicatorBounds(this.setX);
        }
        return new setOnActionUpListener(this.setX);
    }
}