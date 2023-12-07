package o;

import android.util.Log;
import o.lC;

/* loaded from: classes.dex */
public final class setItemIconSize {
    private static float setY(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    private static float setIconTintList(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int setY(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = (i >>> 24) / 255.0f;
        float iconTintList = setIconTintList(((i >> 16) & 255) / 255.0f);
        float iconTintList2 = setIconTintList(((i >> 8) & 255) / 255.0f);
        float iconTintList3 = setIconTintList((i & 255) / 255.0f);
        float iconTintList4 = setIconTintList(((i2 >> 16) & 255) / 255.0f);
        float iconTintList5 = setIconTintList(((i2 >> 8) & 255) / 255.0f);
        float iconTintList6 = setIconTintList((i2 & 255) / 255.0f);
        float y = setY(iconTintList + ((iconTintList4 - iconTintList) * f));
        float y2 = setY(iconTintList2 + ((iconTintList5 - iconTintList2) * f));
        float y3 = setY(iconTintList3 + ((iconTintList6 - iconTintList3) * f));
        return (Math.round((f2 + ((((i2 >>> 24) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(y * 255.0f) << 16) | (Math.round(y2 * 255.0f) << 8) | Math.round(y3 * 255.0f);
    }

    private static void setY() {
        String str;
        String str2;
        lC.setY sety = lC.MenuHostHelper$$ExternalSyntheticLambda0;
        lC.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        pN.setY("App Tamper Detection", "");
        lC.setY = "App Tamper Detection";
        str = lC.setIconTintList;
        str2 = lC.setY;
        Log.d(str, str2);
    }
}