package o;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* loaded from: classes.dex */
public final class setExpandedTitleMarginStart extends Paint {
    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }

    public setExpandedTitleMarginStart() {
    }

    public setExpandedTitleMarginStart(int i) {
        super(i);
    }

    public setExpandedTitleMarginStart(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public setExpandedTitleMarginStart(PorterDuff.Mode mode, byte b) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }
}