package o;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public final class setCheckMarkDrawable {
    private static final int[] setX = {16842912};
    private static final int[] setY = new int[0];

    public static boolean setY() {
        return true;
    }

    static {
        new Rect();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setX(Drawable drawable) {
        String name = drawable.getClass().getName();
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            MenuHostHelper$$ExternalSyntheticLambda1(drawable);
        } else if (Build.VERSION.SDK_INT < 29 || Build.VERSION.SDK_INT >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
        } else {
            MenuHostHelper$$ExternalSyntheticLambda1(drawable);
        }
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda1(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(setX);
        } else {
            drawable.setState(setY);
        }
        drawable.setState(state);
    }

    public static PorterDuff.Mode MenuHostHelper$$ExternalSyntheticLambda1(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i == 9) {
                    return PorterDuff.Mode.SRC_ATOP;
                }
                switch (i) {
                    case 14:
                        return PorterDuff.Mode.MULTIPLY;
                    case 15:
                        return PorterDuff.Mode.SCREEN;
                    case 16:
                        return PorterDuff.Mode.ADD;
                    default:
                        return mode;
                }
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}