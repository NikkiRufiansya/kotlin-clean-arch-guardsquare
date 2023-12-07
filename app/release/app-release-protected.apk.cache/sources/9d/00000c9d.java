package o;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class setImeHintLocales {
    public static int setIconTintList(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return setY.setIconTintList(marginLayoutParams);
    }

    public static void setIconTintList(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        setY.setIconTintList(marginLayoutParams, i);
    }

    public static void setX(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        setY.setY(marginLayoutParams, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY {
        static int setIconTintList(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static int setX(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        static void setIconTintList(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginStart(i);
        }

        static void setY(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginEnd(i);
        }
    }
}