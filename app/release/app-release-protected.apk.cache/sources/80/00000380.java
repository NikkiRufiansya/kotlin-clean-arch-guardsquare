package o;

import o.cA;

/* renamed from: o.co  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0081co implements InterfaceC0088cv {
    private setVerticalScrollbarOverlay<String> setY;

    @Override // o.InterfaceC0088cv
    public final boolean setX(Exception exc) {
        return false;
    }

    public C0081co(setVerticalScrollbarOverlay<String> setverticalscrollbaroverlay) {
        this.setY = setverticalscrollbaroverlay;
    }

    @Override // o.InterfaceC0088cv
    public final boolean setY(AbstractC0091cy abstractC0091cy) {
        if (!(abstractC0091cy.setUiOptions() == cA.setIconTintList.UNREGISTERED)) {
            if (!(abstractC0091cy.setUiOptions() == cA.setIconTintList.REGISTERED)) {
                if (!(abstractC0091cy.setUiOptions() == cA.setIconTintList.REGISTER_ERROR)) {
                    return false;
                }
            }
        }
        this.setY.MenuHostHelper$$ExternalSyntheticLambda0.setY(abstractC0091cy.setY());
        return true;
    }
}