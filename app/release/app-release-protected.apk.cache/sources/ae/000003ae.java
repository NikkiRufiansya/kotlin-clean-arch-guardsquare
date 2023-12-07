package o;

import java.util.regex.Pattern;
import o.eP;

/* loaded from: classes.dex */
public final class dN {
    private static final Pattern setY = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static boolean setIconTintList(String str) {
        return str == null || !setY.matcher(str).matches();
    }

    public static void setX(dA dAVar) {
        if (!dAVar.setY.MenuHostHelper$$ExternalSyntheticLambda0()) {
            dAVar.setY.MenuHostHelper$$ExternalSyntheticLambda0(eP.setX.GENERIC_CLIENT_ERROR);
        }
        dAVar.MenuHostHelper$$ExternalSyntheticLambda1();
    }
}