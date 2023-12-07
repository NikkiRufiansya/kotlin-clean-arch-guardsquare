package o;

/* loaded from: classes.dex */
final class iC {
    private static final iE MenuHostHelper$$ExternalSyntheticLambda0 = setIconTintList();
    private static final iE MenuHostHelper$$ExternalSyntheticLambda1 = new iB();

    iC() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static iE setX() {
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    private static iE setIconTintList() {
        try {
            return (iE) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}