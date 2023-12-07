package o;

import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class onActivityPostStarted extends setChildIndicatorBoundsRelative<PointF> {
    Path MenuHostHelper$$ExternalSyntheticLambda0;
    private final setChildIndicatorBoundsRelative<PointF> setCenterIfNoTextEnabled;

    public onActivityPostStarted(setBoxStrokeErrorColor setboxstrokeerrorcolor, setChildIndicatorBoundsRelative<PointF> setchildindicatorboundsrelative) {
        super(setboxstrokeerrorcolor, setchildindicatorboundsrelative.setUiOptions, setchildindicatorboundsrelative.setIconTintList, setchildindicatorboundsrelative.setUnboundedRipple, setchildindicatorboundsrelative.setOnLongClickListener, setchildindicatorboundsrelative.setX);
        this.setCenterIfNoTextEnabled = setchildindicatorboundsrelative;
        setY();
    }

    public final void setY() {
        boolean z = (this.setIconTintList == 0 || this.setUiOptions == 0 || !((PointF) this.setUiOptions).equals(((PointF) this.setIconTintList).x, ((PointF) this.setIconTintList).y)) ? false : true;
        if (this.setIconTintList == 0 || z) {
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setOnPageChangeListener.setY((PointF) this.setUiOptions, (PointF) this.setIconTintList, this.setCenterIfNoTextEnabled.setNavigationOnClickListener, this.setCenterIfNoTextEnabled.setLayoutAnimation);
    }
}