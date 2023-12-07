package o;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class setHyphenationFrequency {
    public static EdgeEffect setY(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return setX.MenuHostHelper$$ExternalSyntheticLambda1(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public static float setY(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return setX.setIconTintList(edgeEffect);
        }
        return 0.0f;
    }

    public static void setY(EdgeEffect edgeEffect, float f, float f2) {
        edgeEffect.onPull(f, f2);
    }

    public static float MenuHostHelper$$ExternalSyntheticLambda0(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return setX.MenuHostHelper$$ExternalSyntheticLambda0(edgeEffect, f, f2);
        }
        setY(edgeEffect, f, f2);
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX {
        public static EdgeEffect MenuHostHelper$$ExternalSyntheticLambda1(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float MenuHostHelper$$ExternalSyntheticLambda0(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }

        public static float setIconTintList(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY {
    }
}