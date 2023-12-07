package o;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class setRotation extends ClickableSpan {
    private final setDecorPadding MenuHostHelper$$ExternalSyntheticLambda0;
    private final int setIconTintList;
    private final int setY;

    public setRotation(int i, setDecorPadding setdecorpadding, int i2) {
        this.setY = i;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setdecorpadding;
        this.setIconTintList = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.setY);
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList, bundle);
    }
}