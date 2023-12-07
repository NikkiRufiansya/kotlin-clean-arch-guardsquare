package o;

/* renamed from: o.wl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0572wl {
    public static final C0572wl MenuHostHelper$$ExternalSyntheticLambda1 = new C0572wl();

    private C0572wl() {
    }

    public static boolean MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        pN.setY(str, "");
        return pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, (Object) "POST") || pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, (Object) "PATCH") || pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, (Object) "PUT") || pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, (Object) "DELETE") || pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, (Object) "MOVE");
    }

    public static final boolean MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        pN.setY(str, "");
        return pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, (Object) "POST") || pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, (Object) "PUT") || pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, (Object) "PATCH") || pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, (Object) "PROPPATCH") || pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, (Object) "REPORT");
    }

    public static final boolean setY(String str) {
        pN.setY(str, "");
        return (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, (Object) "GET") || pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, (Object) "HEAD")) ? false : true;
    }

    public static boolean setX(String str) {
        pN.setY(str, "");
        return pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, (Object) "PROPFIND");
    }

    public static boolean setIconTintList(String str) {
        pN.setY(str, "");
        return !pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, (Object) "PROPFIND");
    }
}