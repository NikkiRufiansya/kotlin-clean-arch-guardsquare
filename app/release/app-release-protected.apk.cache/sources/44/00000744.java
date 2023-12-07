package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;

/* renamed from: o.my  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310my extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUnboundedRipple {
    private final int setX;

    public C0310my(Context context) {
        pN.setY(context, "");
        this.setX = (int) context.getResources().getDimension(R.dimen.res_0x7f07026b);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUnboundedRipple
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Rect rect, View view, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        pN.setY(rect, "");
        pN.setY(view, "");
        pN.setY(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, "");
        pN.setY(setminandmaxprogress, "");
        rect.right = this.setX << 1;
        rect.left = this.setX << 1;
    }
}