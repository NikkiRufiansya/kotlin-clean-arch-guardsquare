package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import o.setIconTint;

/* loaded from: classes.dex */
public final class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior {
    private static final int[] MenuHostHelper$$ExternalSyntheticLambda1 = {R.attr.res_0x7f0400f8};
    public static final int[] setIconTintList = {R.attr.res_0x7f0400fd};

    public static void setY(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setIconTint.setIconTintList.setFloatValues, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.res_0x7f04020c, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                setY(context, setIconTintList, "Theme.MaterialComponents");
            }
        }
        setY(context, MenuHostHelper$$ExternalSyntheticLambda1, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r0.getResourceId(0, -1) != (-1)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void setY(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
            int[] r0 = o.setIconTint.setIconTintList.setFloatValues
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            r1 = 0
            r2 = 2
            boolean r2 = r0.getBoolean(r2, r1)
            if (r2 != 0) goto L12
            r0.recycle()
            return
        L12:
            int r2 = r10.length
            r3 = 1
            r4 = -1
            if (r2 == 0) goto L32
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            int r6 = r10.length
            r7 = 0
        L1d:
            if (r7 >= r6) goto L2e
            r8 = r10[r7]
            int r8 = r5.getResourceId(r8, r4)
            if (r8 != r4) goto L2b
            r5.recycle()
            goto L39
        L2b:
            int r7 = r7 + 1
            goto L1d
        L2e:
            r5.recycle()
            goto L38
        L32:
            int r5 = r0.getResourceId(r1, r4)
            if (r5 == r4) goto L39
        L38:
            r1 = 1
        L39:
            r0.recycle()
            if (r1 == 0) goto L3f
            return
        L3f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setY(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    private static boolean MenuHostHelper$$ExternalSyntheticLambda1(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static void setY(Context context, int[] iArr, String str) {
        if (MenuHostHelper$$ExternalSyntheticLambda1(context, iArr)) {
            return;
        }
        StringBuilder sb = new StringBuilder("The style on this component requires your app theme to be ");
        sb.append(str);
        sb.append(" (or a descendant).");
        throw new IllegalArgumentException(sb.toString());
    }
}