package o;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setSize {
    public static final setSize setIconTintList = new setSize();

    private setSize() {
    }

    public static final void setX(Bundle bundle, String str, Size size) {
        pN.setY(bundle, "");
        pN.setY(str, "");
        bundle.putSize(str, size);
    }

    public static final void MenuHostHelper$$ExternalSyntheticLambda0(Bundle bundle, String str, SizeF sizeF) {
        pN.setY(bundle, "");
        pN.setY(str, "");
        bundle.putSizeF(str, sizeF);
    }
}