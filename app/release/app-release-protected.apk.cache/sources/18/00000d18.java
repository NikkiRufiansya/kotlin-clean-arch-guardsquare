package o;

import android.content.Context;

/* loaded from: classes.dex */
public final class setLayoutTransition {
    public static setLayoutTransition setX = new setLayoutTransition();
    private setTextInputLayoutFocusedRectEnabled setY = null;

    public final setTextInputLayoutFocusedRectEnabled setIconTintList(Context context) {
        setTextInputLayoutFocusedRectEnabled settextinputlayoutfocusedrectenabled;
        synchronized (this) {
            if (this.setY == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.setY = new setTextInputLayoutFocusedRectEnabled(context);
            }
            settextinputlayoutfocusedrectenabled = this.setY;
        }
        return settextinputlayoutfocusedrectenabled;
    }
}