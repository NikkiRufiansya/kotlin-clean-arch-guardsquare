package o;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class setOnActionUpListener extends setMaxHeight<PointF> {
    private PathMeasure setLayoutAnimation;
    private final PointF setNavigationOnClickListener;
    private onActivityPostStarted setOnLongClickListener;
    private final float[] setUiOptions;

    public setOnActionUpListener(List<? extends setChildIndicatorBoundsRelative<PointF>> list) {
        super(list);
        this.setNavigationOnClickListener = new PointF();
        this.setUiOptions = new float[2];
        this.setLayoutAnimation = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.setSubtitleTextAppearance
    public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda1(setChildIndicatorBoundsRelative setchildindicatorboundsrelative, float f) {
        onActivityPostStarted onactivitypoststarted = (onActivityPostStarted) setchildindicatorboundsrelative;
        Path path = onactivitypoststarted.MenuHostHelper$$ExternalSyntheticLambda0;
        if (path == null) {
            return (PointF) setchildindicatorboundsrelative.setUiOptions;
        }
        if (this.setIconTintList != null) {
            setPrompt<A> setprompt = this.setIconTintList;
            float f2 = onactivitypoststarted.setOnLongClickListener;
            Float f3 = onactivitypoststarted.setX;
            T t = onactivitypoststarted.setUiOptions;
            T t2 = onactivitypoststarted.setIconTintList;
            MenuHostHelper$$ExternalSyntheticLambda1();
            setX();
            Object obj = setprompt.setX;
            PointF pointF = (PointF) setprompt.setIconTintList;
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.setOnLongClickListener != onactivitypoststarted) {
            this.setLayoutAnimation.setPath(path, false);
            this.setOnLongClickListener = onactivitypoststarted;
        }
        PathMeasure pathMeasure = this.setLayoutAnimation;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.setUiOptions, null);
        PointF pointF2 = this.setNavigationOnClickListener;
        float[] fArr = this.setUiOptions;
        pointF2.set(fArr[0], fArr[1]);
        return this.setNavigationOnClickListener;
    }
}