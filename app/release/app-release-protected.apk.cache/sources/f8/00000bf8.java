package o;

import android.graphics.PointF;
import java.util.Collections;

/* loaded from: classes.dex */
public final class setFriction extends setSubtitleTextAppearance<PointF, PointF> {
    private final setSubtitleTextAppearance<Float, Float> setNavigationOnClickListener;
    private final setSubtitleTextAppearance<Float, Float> setUiOptions;
    private final PointF setUnboundedRipple;

    public setFriction(setSubtitleTextAppearance<Float, Float> setsubtitletextappearance, setSubtitleTextAppearance<Float, Float> setsubtitletextappearance2) {
        super(Collections.emptyList());
        this.setUnboundedRipple = new PointF();
        this.setUiOptions = setsubtitletextappearance;
        this.setNavigationOnClickListener = setsubtitletextappearance2;
        setY(setX());
    }

    @Override // o.setSubtitleTextAppearance
    public final void setY(float f) {
        this.setUiOptions.setY(f);
        this.setNavigationOnClickListener.setY(f);
        this.setUnboundedRipple.set(this.setUiOptions.setOnLongClickListener().floatValue(), this.setNavigationOnClickListener.setOnLongClickListener().floatValue());
        for (int i = 0; i < this.MenuHostHelper$$ExternalSyntheticLambda0.size(); i++) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.get(i).setY();
        }
    }

    @Override // o.setSubtitleTextAppearance
    public final /* bridge */ /* synthetic */ PointF setOnLongClickListener() {
        return this.setUnboundedRipple;
    }

    @Override // o.setSubtitleTextAppearance
    final /* bridge */ /* synthetic */ PointF MenuHostHelper$$ExternalSyntheticLambda1(setChildIndicatorBoundsRelative<PointF> setchildindicatorboundsrelative, float f) {
        return this.setUnboundedRipple;
    }
}