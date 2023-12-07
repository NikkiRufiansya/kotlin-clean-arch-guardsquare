package o;

/* loaded from: classes.dex */
final class hV {
    private static final boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private static final Class<?> setX = setIconTintList("libcore.io.Memory");

    static {
        MenuHostHelper$$ExternalSyntheticLambda1 = setIconTintList("org.robolectric.Robolectric") != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setX() {
        return (setX == null || MenuHostHelper$$ExternalSyntheticLambda1) ? false : true;
    }

    private static <T> Class<T> setIconTintList(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}