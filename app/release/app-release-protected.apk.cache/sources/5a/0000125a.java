package o;

import java.util.ArrayList;
import java.util.List;
import o.C0402qi;
import o.C0557vz;

/* renamed from: o.vz$MenuHostHelper$$ExternalSyntheticLambda0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 {
    public final List<String> MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayList(20);

    public final C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 setIconTintList(String str) {
        pN.setY(str, "");
        int x = qR.setX((CharSequence) str, ':', 1, false);
        if (x != -1) {
            String substring = str.substring(0, x);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
            String substring2 = str.substring(x + 1);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring2, "");
            setY(substring, substring2);
        } else if (str.charAt(0) == ':') {
            String substring3 = str.substring(1);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring3, "");
            setY("", substring3);
        } else {
            setY("", str);
        }
        return this;
    }

    public final C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1(String str, String str2) {
        pN.setY(str, "");
        pN.setY(str2, "");
        C0557vz.setX setx = C0557vz.setX;
        C0557vz.setX.MenuHostHelper$$ExternalSyntheticLambda1(str);
        C0557vz.setX setx2 = C0557vz.setX;
        C0557vz.setX.setIconTintList(str2, str);
        setY(str, str2);
        return this;
    }

    public final C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 setY(String str, String str2) {
        pN.setY(str, "");
        pN.setY(str2, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1.add(str);
        this.MenuHostHelper$$ExternalSyntheticLambda1.add(qR.MenuHostHelper$$ExternalSyntheticLambda0((CharSequence) str2).toString());
        return this;
    }

    public final C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 setX(String str) {
        boolean equalsIgnoreCase;
        pN.setY(str, "");
        int i = 0;
        while (i < this.MenuHostHelper$$ExternalSyntheticLambda1.size()) {
            String str2 = this.MenuHostHelper$$ExternalSyntheticLambda1.get(i);
            if (str == null) {
                equalsIgnoreCase = str2 == null;
            } else {
                equalsIgnoreCase = str.equalsIgnoreCase(str2);
            }
            if (equalsIgnoreCase) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.remove(i);
                this.MenuHostHelper$$ExternalSyntheticLambda1.remove(i);
                i -= 2;
            }
            i += 2;
        }
        return this;
    }

    public final C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 setX(String str, String str2) {
        pN.setY(str, "");
        pN.setY(str2, "");
        C0557vz.setX setx = C0557vz.setX;
        C0557vz.setX.MenuHostHelper$$ExternalSyntheticLambda1(str);
        C0557vz.setX setx2 = C0557vz.setX;
        C0557vz.setX.setIconTintList(str2, str);
        setX(str);
        setY(str, str2);
        return this;
    }

    public final String MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        boolean equalsIgnoreCase;
        pN.setY(str, "");
        C0402qi.setX setx = C0402qi.setY;
        C0402qi iconTintList = C0412qs.setIconTintList(new C0402qi(this.MenuHostHelper$$ExternalSyntheticLambda1.size() - 2, 0, -1), 2);
        int iconTintList2 = iconTintList.setIconTintList();
        int i = iconTintList.setIconTintList;
        int i2 = iconTintList.setX;
        if (i2 >= 0) {
            if (iconTintList2 > i) {
                return null;
            }
        } else if (iconTintList2 < i) {
            return null;
        }
        while (true) {
            String str2 = this.MenuHostHelper$$ExternalSyntheticLambda1.get(iconTintList2);
            if (str == null) {
                equalsIgnoreCase = str2 == null;
            } else {
                equalsIgnoreCase = str.equalsIgnoreCase(str2);
            }
            if (equalsIgnoreCase) {
                return this.MenuHostHelper$$ExternalSyntheticLambda1.get(iconTintList2 + 1);
            }
            if (iconTintList2 == i) {
                return null;
            }
            iconTintList2 += i2;
        }
    }

    public final C0557vz setX() {
        Object[] array = this.MenuHostHelper$$ExternalSyntheticLambda1.toArray(new String[0]);
        if (array != null) {
            return new C0557vz((String[]) array, (byte) 0);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}