package o;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* loaded from: classes.dex */
public final class setVerticalScrollbarThumbDrawable {
    private final PointerIcon setIconTintList;

    private setVerticalScrollbarThumbDrawable(PointerIcon pointerIcon) {
        this.setIconTintList = pointerIcon;
    }

    public final Object setY() {
        return this.setIconTintList;
    }

    public static setVerticalScrollbarThumbDrawable MenuHostHelper$$ExternalSyntheticLambda0(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new setVerticalScrollbarThumbDrawable(setIconTintList.setY(context, i));
        }
        return new setVerticalScrollbarThumbDrawable(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList {
        static PointerIcon setY(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }
    }
}