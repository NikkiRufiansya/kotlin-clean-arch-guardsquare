package o;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
class setPadding implements setActivated {
    private final WindowId MenuHostHelper$$ExternalSyntheticLambda0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setPadding(View view) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof setPadding) && ((setPadding) obj).MenuHostHelper$$ExternalSyntheticLambda0.equals(this.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    public int hashCode() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode();
    }
}