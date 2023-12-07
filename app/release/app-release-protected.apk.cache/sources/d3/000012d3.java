package o;

import java.net.Proxy;

/* renamed from: o.ws  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0579ws {
    public static final C0579ws MenuHostHelper$$ExternalSyntheticLambda1 = new C0579ws();

    private C0579ws() {
    }

    public static String setX(vE vEVar, Proxy.Type type) {
        pN.setY(vEVar, "");
        pN.setY(type, "");
        StringBuilder sb = new StringBuilder();
        sb.append(vEVar.setX);
        sb.append(' ');
        if (!vEVar.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1 && type == Proxy.Type.HTTP) {
            sb.append(vEVar.setLayoutAnimation);
        } else {
            sb.append(setIconTintList(vEVar.setLayoutAnimation));
        }
        sb.append(" HTTP/1.1");
        String obj = sb.toString();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) obj, "");
        return obj;
    }

    public static String setIconTintList(C0555vx c0555vx) {
        pN.setY(c0555vx, "");
        String MenuHostHelper$$ExternalSyntheticLambda0 = c0555vx.MenuHostHelper$$ExternalSyntheticLambda0();
        String y = c0555vx.setY();
        if (y != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(MenuHostHelper$$ExternalSyntheticLambda0);
            sb.append('?');
            sb.append(y);
            return sb.toString();
        }
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }
}