package o;

import android.content.Context;
import android.view.View;
import o.setDecorPadding;

/* renamed from: o.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0587x extends setCounterOverflowTextColor {
    private final setDecorPadding.setIconTintList setIconTintList;

    public C0587x(Context context, int i) {
        this.setIconTintList = new setDecorPadding.setIconTintList(16, context.getString(i));
    }

    @Override // o.setCounterOverflowTextColor
    public void setY(View view, setDecorPadding setdecorpadding) {
        super.setY(view, setdecorpadding);
        setdecorpadding.setIconTintList(this.setIconTintList);
    }
}