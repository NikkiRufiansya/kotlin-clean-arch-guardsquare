package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.if  reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif {
    private static Class<?> setIconTintList = setIconTintList();

    Cif() {
    }

    private static Class<?> setIconTintList() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static C0232id setX() {
        C0232id MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1("getEmptyRegistry");
        return MenuHostHelper$$ExternalSyntheticLambda1 == null ? C0232id.MenuHostHelper$$ExternalSyntheticLambda0 : MenuHostHelper$$ExternalSyntheticLambda1;
    }

    private static final C0232id MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        Class<?> cls = setIconTintList;
        if (cls == null) {
            return null;
        }
        try {
            return (C0232id) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}