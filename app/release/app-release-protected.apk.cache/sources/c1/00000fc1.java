package o;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
final class setStartIconTintList {
    static boolean setY = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setX(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (setY) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                setY = false;
            }
        }
    }
}