package o;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

/* loaded from: classes.dex */
public final class setNextFocusForwardId {
    public static Typeface setY(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
            if (i != Integer.MAX_VALUE) {
                i2 = configuration.fontWeightAdjustment;
                if (i2 == 0 || typeface == null) {
                    return null;
                }
                weight = typeface.getWeight();
                i3 = configuration.fontWeightAdjustment;
                int i4 = weight + i3;
                if (i4 <= 0) {
                    i4 = 1;
                } else if (i4 > 1000) {
                    i4 = 1000;
                }
                create = Typeface.create(typeface, i4, typeface.isItalic());
                return create;
            }
            return null;
        }
        return null;
    }
}