package o;

import android.content.Context;
import android.graphics.Color;

/* loaded from: classes.dex */
public final class setItemBackgroundResource {
    private static final int setY = (int) Math.round(5.1000000000000005d);
    public final int MenuHostHelper$$ExternalSyntheticLambda0;
    private final int MenuHostHelper$$ExternalSyntheticLambda1;
    public final boolean setIconTintList;
    private final int setNavigationOnClickListener;
    private final float setX;

    public setItemBackgroundResource(Context context) {
        this(setShowDividerVertical.setIconTintList(context, (int) R.attr.res_0x7f040170, false), setIndeterminateDrawable.setY(context, R.attr.res_0x7f04016f, 0), setIndeterminateDrawable.setY(context, R.attr.res_0x7f04016e, 0), setIndeterminateDrawable.setY(context, R.attr.res_0x7f040101, 0), context.getResources().getDisplayMetrics().density);
    }

    private setItemBackgroundResource(boolean z, int i, int i2, int i3, float f) {
        this.setIconTintList = z;
        this.setNavigationOnClickListener = i;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i2;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i3;
        this.setX = f;
    }

    public final int setX(int i, float f) {
        if (this.setIconTintList) {
            return setExtended.setIconTintList(i, 255) == this.MenuHostHelper$$ExternalSyntheticLambda0 ? MenuHostHelper$$ExternalSyntheticLambda1(i, f) : i;
        }
        return i;
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda1(int i, float f) {
        int i2;
        float f2 = this.setX;
        float min = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int iconTintList = setExtended.setIconTintList(i, 255);
        int i3 = this.setNavigationOnClickListener;
        int y = setExtended.setY(setExtended.setIconTintList(i3, Math.round(Color.alpha(i3) * min)), iconTintList);
        if (min > 0.0f && (i2 = this.MenuHostHelper$$ExternalSyntheticLambda1) != 0) {
            y = setExtended.setY(setExtended.setIconTintList(i2, setY), y);
        }
        return setExtended.setIconTintList(y, alpha);
    }
}