package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* loaded from: classes.dex */
public final class setFastScrollEnabled {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
        r1 = o.setLineHeight.setIconTintList(r1, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList setX(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L14
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L14
            android.content.res.ColorStateList r1 = o.setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(r1, r0)
            if (r1 == 0) goto L14
            return r1
        L14:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setFastScrollEnabled.setX(android.content.Context, android.content.res.TypedArray, int):android.content.res.ColorStateList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
        r1 = o.setLineHeight.setIconTintList(r1, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList setX(android.content.Context r1, o.setExpandedHintEnabled r2, int r3) {
        /*
            boolean r0 = r2.setLayoutAnimation(r3)
            if (r0 == 0) goto L14
            r0 = 0
            int r0 = r2.setNavigationOnClickListener(r3, r0)
            if (r0 == 0) goto L14
            android.content.res.ColorStateList r1 = o.setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(r1, r0)
            if (r1 == 0) goto L14
            return r1
        L14:
            android.content.res.ColorStateList r1 = r2.setY(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setFastScrollEnabled.setX(android.content.Context, o.setExpandedHintEnabled, int):android.content.res.ColorStateList");
    }

    public static Drawable setIconTintList(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable iconTintList;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (iconTintList = setFilterTouchesWhenObscured.setIconTintList(context, resourceId)) == null) ? typedArray.getDrawable(i) : iconTintList;
    }

    public static int setY(Context context, TypedArray typedArray, int i) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, -1);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }
}