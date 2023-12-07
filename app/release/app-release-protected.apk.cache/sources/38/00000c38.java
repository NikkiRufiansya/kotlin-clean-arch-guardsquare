package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setHintTextColor {
    private static Class<?> setY = MenuHostHelper$$ExternalSyntheticLambda0();

    setHintTextColor() {
    }

    private static Class<?> MenuHostHelper$$ExternalSyntheticLambda0() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static setStateDescription setX() {
        Class<?> cls = setY;
        if (cls != null) {
            try {
                return (setStateDescription) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return setStateDescription.setY;
    }
}