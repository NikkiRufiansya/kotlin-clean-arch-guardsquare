package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import o.setTextStartPaddingResource;

/* loaded from: classes.dex */
public final class setExpandedHintEnabled {
    private TypedValue MenuHostHelper$$ExternalSyntheticLambda0;
    final TypedArray setX;
    private final Context setY;

    public static setExpandedHintEnabled setX(Context context, AttributeSet attributeSet, int[] iArr) {
        return new setExpandedHintEnabled(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static setExpandedHintEnabled MenuHostHelper$$ExternalSyntheticLambda0(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new setExpandedHintEnabled(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static setExpandedHintEnabled setY(Context context, int i, int[] iArr) {
        return new setExpandedHintEnabled(context, context.obtainStyledAttributes(i, iArr));
    }

    private setExpandedHintEnabled(Context context, TypedArray typedArray) {
        this.setY = context;
        this.setX = typedArray;
    }

    public final TypedArray MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setX;
    }

    public final Drawable MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        int resourceId;
        if (this.setX.hasValue(i) && (resourceId = this.setX.getResourceId(i, 0)) != 0) {
            return setFilterTouchesWhenObscured.setIconTintList(this.setY, resourceId);
        }
        return this.setX.getDrawable(i);
    }

    public final Drawable setX(int i) {
        int resourceId;
        if (!this.setX.hasValue(i) || (resourceId = this.setX.getResourceId(i, 0)) == 0) {
            return null;
        }
        return setSelectionFromTop.setIconTintList().setY(this.setY, resourceId, true);
    }

    public final Typeface setX(int i, int i2, setTextStartPaddingResource.setY sety) {
        int resourceId = this.setX.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new TypedValue();
        }
        return setTextStartPaddingResource.setX(this.setY, resourceId, this.MenuHostHelper$$ExternalSyntheticLambda0, i2, sety);
    }

    public final CharSequence setUnboundedRipple(int i) {
        return this.setX.getText(i);
    }

    public final String setNavigationOnClickListener(int i) {
        return this.setX.getString(i);
    }

    public final boolean setIconTintList(int i, boolean z) {
        return this.setX.getBoolean(i, z);
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
        return this.setX.getInt(i, i2);
    }

    public final float setOnLongClickListener(int i) {
        return this.setX.getFloat(i, -1.0f);
    }

    public final int setIconTintList(int i) {
        return this.setX.getColor(i, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0011, code lost:
        r0 = o.setLineHeight.setIconTintList(r2.setY, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.ColorStateList setY(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.setX
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L1a
            android.content.res.TypedArray r0 = r2.setX
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L1a
            android.content.Context r1 = r2.setY
            android.content.res.ColorStateList r0 = o.setFilterTouchesWhenObscured.MenuHostHelper$$ExternalSyntheticLambda0(r1, r0)
            if (r0 == 0) goto L1a
            return r0
        L1a:
            android.content.res.TypedArray r0 = r2.setX
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setExpandedHintEnabled.setY(int):android.content.res.ColorStateList");
    }

    public final int setIconTintList(int i, int i2) {
        return this.setX.getInteger(i, i2);
    }

    public final float MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        return this.setX.getDimension(i, -1.0f);
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2) {
        return this.setX.getDimensionPixelOffset(i, i2);
    }

    public final int setY(int i, int i2) {
        return this.setX.getDimensionPixelSize(i, i2);
    }

    public final int setX(int i, int i2) {
        return this.setX.getLayoutDimension(i, i2);
    }

    public final int setNavigationOnClickListener(int i, int i2) {
        return this.setX.getResourceId(i, i2);
    }

    public final boolean setLayoutAnimation(int i) {
        return this.setX.hasValue(i);
    }

    public final void setX() {
        this.setX.recycle();
    }
}