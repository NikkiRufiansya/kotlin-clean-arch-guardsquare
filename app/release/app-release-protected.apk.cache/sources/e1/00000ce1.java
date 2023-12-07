package o;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setItemChecked extends AbstractC0201h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public setItemChecked(C0174g c0174g) {
        super(c0174g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC0201h
    public final void setUnboundedRipple() {
        C0174g c0174g = this.setUiOptions;
        c0174g.setNavigationOnClickListener = null;
        setMinAndMaxFrame setminandmaxframe = c0174g.setOnLongClickListener;
        setminandmaxframe.setOnLongClickListener(null);
        C0146f.setY(setminandmaxframe, (View.OnLongClickListener) null);
    }
}