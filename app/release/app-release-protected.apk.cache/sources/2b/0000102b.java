package o;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class setTabRippleColorResource {
    final HashMap<String, setTitleMarginTop> MenuHostHelper$$ExternalSyntheticLambda1 = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(String str, setTitleMarginTop settitlemargintop) {
        setTitleMarginTop put = this.MenuHostHelper$$ExternalSyntheticLambda1.put(str, settitlemargintop);
        if (put != null) {
            put.setIconTintList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setTitleMarginTop MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.get(str);
    }

    public final void setX() {
        for (setTitleMarginTop settitlemargintop : this.MenuHostHelper$$ExternalSyntheticLambda1.values()) {
            settitlemargintop.MenuHostHelper$$ExternalSyntheticLambda1();
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.clear();
    }
}