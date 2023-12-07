package o;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class setAccessibilityDelegate implements FirebaseSessionsRegistrar<PointF, PointF> {
    private final setOnReceiveContentListener MenuHostHelper$$ExternalSyntheticLambda0;
    private final setOnReceiveContentListener MenuHostHelper$$ExternalSyntheticLambda1;

    public setAccessibilityDelegate(setOnReceiveContentListener setonreceivecontentlistener, setOnReceiveContentListener setonreceivecontentlistener2) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setonreceivecontentlistener;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setonreceivecontentlistener2;
    }

    @Override // o.FirebaseSessionsRegistrar
    public final List<setChildIndicatorBoundsRelative<PointF>> setIconTintList() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // o.FirebaseSessionsRegistrar
    public final boolean setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.setY() && this.MenuHostHelper$$ExternalSyntheticLambda1.setY();
    }

    @Override // o.FirebaseSessionsRegistrar
    public final setSubtitleTextAppearance<PointF, PointF> setX() {
        return new setFriction(new setOnTouchListener(this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1), new setOnTouchListener(this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1));
    }
}