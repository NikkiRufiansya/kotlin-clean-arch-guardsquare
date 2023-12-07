package o;

import android.graphics.Paint;
import o.setIndicatorBounds;

/* loaded from: classes.dex */
public enum setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda1 {
    MITER,
    ROUND,
    BEVEL;

    public final Paint.Join MenuHostHelper$$ExternalSyntheticLambda1() {
        int i = setIndicatorBounds.AnonymousClass3.MenuHostHelper$$ExternalSyntheticLambda1[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }
        return Paint.Join.BEVEL;
    }
}