package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: o.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0501u {
    private static final int[] setX = {16842752, R.attr.res_0x7f040446};
    private static final int[] MenuHostHelper$$ExternalSyntheticLambda0 = {R.attr.res_0x7f0402cf};

    private static int setY(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setX);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId == 0 ? resourceId2 : resourceId;
    }

    public static Context MenuHostHelper$$ExternalSyntheticLambda0(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, MenuHostHelper$$ExternalSyntheticLambda0, i, i2);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if ((context instanceof setTitleMarginEnd) && ((setTitleMarginEnd) context).MenuHostHelper$$ExternalSyntheticLambda1 == resourceId) {
            z = true;
        }
        if (resourceId == 0 || z) {
            return context;
        }
        setTitleMarginEnd settitlemarginend = new setTitleMarginEnd(context, resourceId);
        int y = setY(context, attributeSet);
        if (y != 0) {
            settitlemarginend.getTheme().applyStyle(y, true);
        }
        return settitlemarginend;
    }
}