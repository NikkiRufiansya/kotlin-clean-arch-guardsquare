package o;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class setDividerDrawableHorizontal {
    public static <T extends View> T setX(View view, int i) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                T t = (T) viewGroup.getChildAt(i2).findViewById(i);
                if (t != null) {
                    return t;
                }
            }
            return null;
        }
        return null;
    }
}