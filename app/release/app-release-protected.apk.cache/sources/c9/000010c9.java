package o;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class setUiOptions {
    private volatile Context MenuHostHelper$$ExternalSyntheticLambda0;
    private final Set<setTextAlignment> setY = new CopyOnWriteArraySet();

    public final void MenuHostHelper$$ExternalSyntheticLambda0(setTextAlignment settextalignment) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            settextalignment.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        this.setY.add(settextalignment);
    }

    public final void setIconTintList(Context context) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = context;
        for (setTextAlignment settextalignment : this.setY) {
            settextalignment.MenuHostHelper$$ExternalSyntheticLambda0(context);
        }
    }

    public final void setY() {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
    }
}