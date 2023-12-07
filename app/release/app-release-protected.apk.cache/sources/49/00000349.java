package o;

import java.util.Locale;
import o.cS;

/* loaded from: classes.dex */
public final class cQ implements cS.setY {
    private static final C0106dm MenuHostHelper$$ExternalSyntheticLambda0 = C0106dm.setY();

    @Override // o.cS.setY
    public final void setIconTintList() {
        try {
            cR.setY();
        } catch (IllegalStateException e) {
            C0106dm c0106dm = MenuHostHelper$$ExternalSyntheticLambda0;
            Object[] objArr = {e};
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setX(String.format(Locale.ENGLISH, "FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", objArr));
            }
        }
    }
}