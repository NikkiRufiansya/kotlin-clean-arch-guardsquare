package o;

import java.io.IOException;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class vi$MenuHostHelper$$ExternalSyntheticLambda1 {
    private vi$MenuHostHelper$$ExternalSyntheticLambda1() {
    }

    public /* synthetic */ vi$MenuHostHelper$$ExternalSyntheticLambda1(byte b) {
        this();
    }

    public static int setY(InterfaceC0607xr interfaceC0607xr) {
        pN.setY(interfaceC0607xr, "");
        try {
            long layoutAnimation = interfaceC0607xr.setLayoutAnimation();
            String textAlignment = interfaceC0607xr.setTextAlignment();
            if (layoutAnimation >= 0 && layoutAnimation <= 2147483647L) {
                if (!(textAlignment.length() > 0)) {
                    return (int) layoutAnimation;
                }
            }
            StringBuilder sb = new StringBuilder("expected an int but was \"");
            sb.append(layoutAnimation);
            sb.append(textAlignment);
            sb.append('\"');
            throw new IOException(sb.toString());
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Set<String> setY(C0557vz c0557vz) {
        int length = c0557vz.setIconTintList.length / 2;
        TreeSet treeSet = null;
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            if ("Vary".equalsIgnoreCase(c0557vz.setIconTintList[i2])) {
                String str = c0557vz.setIconTintList[i2 + 1];
                if (treeSet == null) {
                    pN.setY(pW.setY, "");
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) comparator, "");
                    treeSet = new TreeSet(comparator);
                }
                for (String str2 : qR.setX(str, new char[]{','})) {
                    if (str2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                    treeSet.add(qR.MenuHostHelper$$ExternalSyntheticLambda0((CharSequence) str2).toString());
                }
                continue;
            }
        }
        return treeSet == null ? C0363ox.setY : treeSet;
    }
}