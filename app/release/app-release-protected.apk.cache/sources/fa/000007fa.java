package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.setIconTint;

/* renamed from: o.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366p extends getStableInsets {
    public C0366p(Context context) {
        this(context, null);
    }

    public C0366p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C0366p(Context context, AttributeSet attributeSet, int i) {
        super(C0501u.MenuHostHelper$$ExternalSyntheticLambda0(context, attributeSet, i, 0), attributeSet, i);
        Context context2 = getContext();
        if (setShowDividerVertical.setIconTintList(context2, (int) R.attr.res_0x7f04041d, true)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, setIconTint.setIconTintList.setChipIconTintResource, i, 0);
            int iconTintList = setIconTintList(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (iconTintList != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, setIconTint.setIconTintList.setChipIconTintResource, i, 0);
            int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                setY(theme, resourceId);
            }
        }
    }

    @Override // o.getStableInsets, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (setShowDividerVertical.setIconTintList(context, (int) R.attr.res_0x7f04041d, true)) {
            setY(context.getTheme(), i);
        }
    }

    private void setY(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, setIconTint.setIconTintList.setHasDecor);
        int iconTintList = setIconTintList(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (iconTintList >= 0) {
            setLineHeight(iconTintList);
        }
    }

    private static int setIconTintList(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = setFastScrollEnabled.setY(context, typedArray, iArr[i2]);
        }
        return i;
    }
}