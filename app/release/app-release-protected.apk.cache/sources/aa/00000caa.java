package o;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public final class setIndeterminateDrawable {
    public static int MenuHostHelper$$ExternalSyntheticLambda1(View view, int i) {
        Context context = view.getContext();
        TypedValue iconTintList = setShowDividerVertical.setIconTintList(view.getContext(), i, view.getClass().getCanonicalName());
        if (iconTintList.resourceId != 0) {
            return setLineHeight.setY(context, iconTintList.resourceId);
        }
        return iconTintList.data;
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(Context context, int i, String str) {
        TypedValue iconTintList = setShowDividerVertical.setIconTintList(context, (int) R.attr.res_0x7f040101, str);
        if (iconTintList.resourceId != 0) {
            return setLineHeight.setY(context, iconTintList.resourceId);
        }
        return iconTintList.data;
    }

    public static int setY(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            typedValue = null;
        }
        if (typedValue != null) {
            if (typedValue.resourceId != 0) {
                return setLineHeight.setY(context, typedValue.resourceId);
            }
            return typedValue.data;
        }
        return i2;
    }
}