package o;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import o.AbstractC0328np;

/* renamed from: o.nj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0322nj extends C0329nq {
    private C0334nv setIconTintList;

    public C0322nj(Context context) {
        this(context, null, 6, (byte) 0);
    }

    public C0322nj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    private /* synthetic */ C0322nj(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0322nj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        pN.setX(context, "");
        C0338nz.MenuHostHelper$$ExternalSyntheticLambda1(context, attributeSet, this.MenuHostHelper$$ExternalSyntheticLambda1);
        this.setIconTintList = new C0334nv(this.MenuHostHelper$$ExternalSyntheticLambda1);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        AbstractC0328np.setY MenuHostHelper$$ExternalSyntheticLambda0 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(i, i2);
        setMeasuredDimension(MenuHostHelper$$ExternalSyntheticLambda0.setX, MenuHostHelper$$ExternalSyntheticLambda0.setY);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        pN.setX(canvas, "");
        super.onDraw(canvas);
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple == 1) {
            canvas.rotate(90.0f, getWidth() / 2.0f, getWidth() / 2.0f);
        } else if (this.MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple == 3) {
            canvas.rotate(180.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        this.setIconTintList.setX(canvas);
    }

    @Override // o.C0329nq
    public final void setIndicatorOptions(C0337ny c0337ny) {
        pN.setX(c0337ny, "");
        super.setIndicatorOptions(c0337ny);
        C0334nv c0334nv = this.setIconTintList;
        pN.setX(c0337ny, "");
        C0333nu c0333nu = C0333nu.MenuHostHelper$$ExternalSyntheticLambda1;
        c0334nv.setX = C0333nu.MenuHostHelper$$ExternalSyntheticLambda0(c0337ny);
    }

    @Override // o.C0329nq
    public final void setX() {
        this.setIconTintList = new C0334nv(this.MenuHostHelper$$ExternalSyntheticLambda1);
        super.setX();
    }

    public final void setOrientation(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple = i;
    }
}