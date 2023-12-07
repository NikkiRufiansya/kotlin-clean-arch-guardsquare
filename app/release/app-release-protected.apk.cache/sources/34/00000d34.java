package o;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setListSelection {
    public static final setListSelection MenuHostHelper$$ExternalSyntheticLambda1 = new setListSelection();

    private setListSelection() {
    }

    public static final void MenuHostHelper$$ExternalSyntheticLambda1(Bundle bundle, String str, IBinder iBinder) {
        pN.setY(bundle, "");
        pN.setY(str, "");
        bundle.putBinder(str, iBinder);
    }
}