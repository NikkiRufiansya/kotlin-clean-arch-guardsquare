package o;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class setChipMinHeight {
    public static TimeInterpolator MenuHostHelper$$ExternalSyntheticLambda0(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        boolean z = true;
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            if (typedValue.type != 3) {
                throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            }
            String valueOf = String.valueOf(typedValue.string);
            if (!MenuHostHelper$$ExternalSyntheticLambda0(valueOf, "cubic-bezier") && !MenuHostHelper$$ExternalSyntheticLambda0(valueOf, "path")) {
                z = false;
            }
            if (z) {
                return setIconTintList(valueOf);
            }
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        return timeInterpolator;
    }

    private static TimeInterpolator setIconTintList(String str) {
        Interpolator y;
        Interpolator y2;
        if (MenuHostHelper$$ExternalSyntheticLambda0(str, "cubic-bezier")) {
            String[] split = str.substring(13, str.length() - 1).split(",");
            if (split.length == 4) {
                y2 = setLayoutAnimationListener$MenuHostHelper$$ExternalSyntheticLambda0.setY(setX(split, 0), setX(split, 1), setX(split, 2), setX(split, 3));
                return y2;
            }
            StringBuilder sb = new StringBuilder("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
            sb.append(split.length);
            throw new IllegalArgumentException(sb.toString());
        } else if (MenuHostHelper$$ExternalSyntheticLambda0(str, "path")) {
            y = setLayoutAnimationListener$MenuHostHelper$$ExternalSyntheticLambda0.setY(setIconifiedByDefault.setX(str.substring(5, str.length() - 1)));
            return y;
        } else {
            StringBuilder sb2 = new StringBuilder("Invalid motion easing type: ");
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    private static boolean MenuHostHelper$$ExternalSyntheticLambda0(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    private static float setX(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat < 0.0f || parseFloat > 1.0f) {
            StringBuilder sb = new StringBuilder("Motion easing control point value must be between 0 and 1; instead got: ");
            sb.append(parseFloat);
            throw new IllegalArgumentException(sb.toString());
        }
        return parseFloat;
    }

    public static int setX(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            typedValue = null;
        }
        if (typedValue == null || typedValue.type != 16) {
            return 300;
        }
        return typedValue.data;
    }
}