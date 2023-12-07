package o;

import android.content.Context;
import java.net.URI;
import java.util.Locale;

/* loaded from: classes.dex */
public final class dF extends dC {
    private static final C0106dm setIconTintList = C0106dm.setY();
    private final eP setX;
    private final Context setY;

    public dF(eP ePVar, Context context) {
        this.setY = context;
        this.setX = ePVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0  */
    @Override // o.dC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean setIconTintList() {
        /*
            Method dump skipped, instructions count: 804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dF.setIconTintList():boolean");
    }

    private static URI setIconTintList(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e) {
            C0106dm c0106dm = setIconTintList;
            Object[] objArr = {e.getMessage()};
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setX(String.format(Locale.ENGLISH, "getResultUrl throws exception %s", objArr));
            }
            return null;
        }
    }
}