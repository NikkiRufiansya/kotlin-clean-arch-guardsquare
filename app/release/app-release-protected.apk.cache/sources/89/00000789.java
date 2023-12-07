package o;

import android.graphics.Canvas;

/* renamed from: o.nr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330nr extends C0332nt {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0330nr(C0337ny c0337ny) {
        super(c0337ny);
        pN.setX(c0337ny, "");
    }

    @Override // o.C0332nt
    protected final void MenuHostHelper$$ExternalSyntheticLambda0(Canvas canvas, float f, float f2) {
        pN.setX(canvas, "");
        canvas.drawRoundRect(setOnLongClickListener(), f, f2, setX());
    }
}