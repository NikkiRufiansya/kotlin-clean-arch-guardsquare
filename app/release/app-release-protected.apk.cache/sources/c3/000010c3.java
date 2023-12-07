package o;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public class setTrimPathOffset {
    public static Interpolator setY(Context context, int i) {
        return AnimationUtils.loadInterpolator(context, i);
    }
}