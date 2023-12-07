package o;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class setChildIndicatorBounds extends setMaxHeight<PointF> {
    private final PointF setOnLongClickListener;

    public setChildIndicatorBounds(List<setChildIndicatorBoundsRelative<PointF>> list) {
        super(list);
        this.setOnLongClickListener = new PointF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.setSubtitleTextAppearance
    public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda1(setChildIndicatorBoundsRelative setchildindicatorboundsrelative, float f) {
        if (setchildindicatorboundsrelative.setUiOptions == 0 || setchildindicatorboundsrelative.setIconTintList == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) setchildindicatorboundsrelative.setUiOptions;
        PointF pointF2 = (PointF) setchildindicatorboundsrelative.setIconTintList;
        if (this.setIconTintList != null) {
            setPrompt<A> setprompt = this.setIconTintList;
            float f2 = setchildindicatorboundsrelative.setOnLongClickListener;
            Float f3 = setchildindicatorboundsrelative.setX;
            MenuHostHelper$$ExternalSyntheticLambda1();
            setX();
            Object obj = setprompt.setX;
            PointF pointF3 = (PointF) setprompt.setIconTintList;
            if (pointF3 != null) {
                return pointF3;
            }
        }
        this.setOnLongClickListener.set(pointF.x + ((pointF2.x - pointF.x) * f), pointF.y + (f * (pointF2.y - pointF.y)));
        return this.setOnLongClickListener;
    }
}