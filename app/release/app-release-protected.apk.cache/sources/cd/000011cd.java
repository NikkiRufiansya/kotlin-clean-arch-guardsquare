package o;

/* renamed from: o.ux  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0527ux {
    private static final int MenuHostHelper$$ExternalSyntheticLambda0 = Runtime.getRuntime().availableProcessors();

    public static final int setIconTintList() {
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    public static final String setX(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}