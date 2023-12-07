package o;

import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes.dex */
public final class kR {

    /* loaded from: classes.dex */
    public static final class setX extends hQ<List<? extends String>> {
        setX() {
        }
    }

    public static String setY(List<String> list) {
        if (list == null) {
            return null;
        }
        gS gSVar = new gS();
        Type type = new setX().setY;
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) type, "");
        return gSVar.setX(list, type);
    }

    /* loaded from: classes.dex */
    public static final class setY extends hQ<List<? extends String>> {
        setY() {
        }
    }

    public static List<String> setIconTintList(String str) {
        if (str == null) {
            return null;
        }
        gS gSVar = new gS();
        Type type = new setY().setY;
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) type, "");
        return (List) (str != null ? gSVar.setY(new StringReader(str), type) : null);
    }
}