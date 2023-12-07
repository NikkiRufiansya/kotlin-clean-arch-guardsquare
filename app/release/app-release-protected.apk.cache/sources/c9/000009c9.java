package o;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public final class setCardElevation {
    public static final TimeInterpolator setY = new LinearInterpolator();
    public static final TimeInterpolator MenuHostHelper$$ExternalSyntheticLambda0 = new setOutlineSpotShadowColor();
    public static final TimeInterpolator setX = new LinearLayoutManager();
    public static final TimeInterpolator MenuHostHelper$$ExternalSyntheticLambda1 = new setOverscrollFooter();
    public static final TimeInterpolator setIconTintList = new DecelerateInterpolator();

    public static float setX(float f, float f2, float f3, float f4, float f5) {
        return f5 < f3 ? f : f5 > f4 ? f2 : f + (((f5 - f3) / (f4 - f3)) * (f2 - f));
    }
}