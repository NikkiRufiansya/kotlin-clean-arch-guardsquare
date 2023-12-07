package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* loaded from: classes.dex */
class setSupportAllCaps implements setChildDrawingOrderCallback {
    private final ViewGroupOverlay MenuHostHelper$$ExternalSyntheticLambda1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setSupportAllCaps(ViewGroup viewGroup) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = viewGroup.getOverlay();
    }

    @Override // o.setChildDrawingOrderCallback
    public void setX(View view) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.add(view);
    }

    @Override // o.setChildDrawingOrderCallback
    public void setIconTintList(View view) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.remove(view);
    }
}