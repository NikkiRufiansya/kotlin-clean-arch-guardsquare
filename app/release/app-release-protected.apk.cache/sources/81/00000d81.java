package o;

/* loaded from: classes.dex */
final class setMenu {
    private static final Class<?> MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda1("libcore.io.Memory");
    private static final boolean setX;

    setMenu() {
    }

    static {
        setX = MenuHostHelper$$ExternalSyntheticLambda1("org.robolectric.Robolectric") != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return (MenuHostHelper$$ExternalSyntheticLambda0 == null || setX) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> setY() {
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    private static <T> Class<T> MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}