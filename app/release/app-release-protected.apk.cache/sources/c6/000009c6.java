package o;

import android.view.View;

/* JADX INFO: Access modifiers changed from: protected */
/* loaded from: classes.dex */
public class setCallingWorkSourceUid$MenuHostHelper$$ExternalSyntheticLambda1 implements setSelectAllOnFocus {
    final /* synthetic */ setCallingWorkSourceUid MenuHostHelper$$ExternalSyntheticLambda0;
    private boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;
    private int setY;

    /* JADX INFO: Access modifiers changed from: protected */
    public setCallingWorkSourceUid$MenuHostHelper$$ExternalSyntheticLambda1(setCallingWorkSourceUid setcallingworksourceuid) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setcallingworksourceuid;
    }

    public final setCallingWorkSourceUid$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1(setHeaderDividersEnabled setheaderdividersenabled, int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple = setheaderdividersenabled;
        this.setY = i;
        return this;
    }

    @Override // o.setSelectAllOnFocus
    public final void setX(View view) {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
    }

    @Override // o.setSelectAllOnFocus
    public final void MenuHostHelper$$ExternalSyntheticLambda0(View view) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple = null;
        super/*android.view.ViewGroup*/.setVisibility(this.setY);
    }

    @Override // o.setSelectAllOnFocus
    public final void MenuHostHelper$$ExternalSyntheticLambda1(View view) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
    }
}