package o;

import android.content.Context;
import android.view.View;
import o.setContentHeight;

/* renamed from: o.mv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307mv implements setContentHeight.setUiOptions {
    private final float setIconTintList;
    private final float setX;
    private final float setY;

    public C0307mv(Context context) {
        pN.setY(context, "");
        float dimension = context.getResources().getDimension(R.dimen.res_0x7f07026c);
        this.setY = dimension;
        float dimension2 = context.getResources().getDimension(R.dimen.res_0x7f07026b);
        this.setIconTintList = dimension2;
        this.setX = dimension + dimension2;
    }

    @Override // o.setContentHeight.setUiOptions
    public final void setIconTintList(View view, float f) {
        pN.setY(view, "");
        view.setTranslationX((-this.setX) * f);
        view.setScaleY(1.0f - (Math.abs(f) * 0.12f));
        view.setAlpha((1.0f - Math.abs(f)) + 0.5f);
    }
}