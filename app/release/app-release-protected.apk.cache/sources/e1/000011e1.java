package o;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C0555vx;
import o.C0557vz;

/* loaded from: classes.dex */
public final class vE {
    public final vF MenuHostHelper$$ExternalSyntheticLambda0;
    public final Map<Class<?>, Object> MenuHostHelper$$ExternalSyntheticLambda1;
    public C0540vj setIconTintList;
    public final C0555vx setLayoutAnimation;
    public final String setX;
    public final C0557vz setY;

    public vE(C0555vx c0555vx, String str, C0557vz c0557vz, vF vFVar, Map<Class<?>, ? extends Object> map) {
        pN.setY(c0555vx, "");
        pN.setY(str, "");
        pN.setY(c0557vz, "");
        pN.setY(map, "");
        this.setLayoutAnimation = c0555vx;
        this.setX = str;
        this.setY = c0557vz;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = vFVar;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = map;
    }

    public final String setIconTintList(String str) {
        pN.setY(str, "");
        C0557vz c0557vz = this.setY;
        pN.setY(str, "");
        C0557vz.setX setx = C0557vz.setX;
        return C0557vz.setX.setY(c0557vz.setIconTintList, str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.setX);
        sb.append(", url=");
        sb.append(this.setLayoutAnimation);
        if (this.setY.setIconTintList.length / 2 != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (nT<? extends String, ? extends String> nTVar : this.setY) {
                if (i >= 0) {
                    nT<? extends String, ? extends String> nTVar2 = nTVar;
                    String str = (String) nTVar2.MenuHostHelper$$ExternalSyntheticLambda0;
                    String str2 = (String) nTVar2.setX;
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                    sb.append(':');
                    sb.append(str2);
                    i++;
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            sb.append(']');
        }
        if (!this.MenuHostHelper$$ExternalSyntheticLambda1.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        sb.append('}');
        String obj = sb.toString();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) obj, "");
        return obj;
    }

    /* loaded from: classes.dex */
    public static class setIconTintList {
        public C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda0;
        private Map<Class<?>, Object> MenuHostHelper$$ExternalSyntheticLambda1;
        private String setIconTintList;
        private vF setX;
        public C0555vx setY;

        public setIconTintList() {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new LinkedHashMap();
            this.setIconTintList = "GET";
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new C0558vz$MenuHostHelper$$ExternalSyntheticLambda0();
        }

        public setIconTintList(vE vEVar) {
            LinkedHashMap linkedHashMap;
            pN.setY(vEVar, "");
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new LinkedHashMap();
            this.setY = vEVar.setLayoutAnimation;
            this.setIconTintList = vEVar.setX;
            this.setX = vEVar.MenuHostHelper$$ExternalSyntheticLambda0;
            if (vEVar.MenuHostHelper$$ExternalSyntheticLambda1.isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            } else {
                Map<Class<?>, Object> map = vEVar.MenuHostHelper$$ExternalSyntheticLambda1;
                pN.setY(map, "");
                linkedHashMap = new LinkedHashMap(map);
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 = linkedHashMap;
            C0557vz c0557vz = vEVar.setY;
            C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 c0558vz$MenuHostHelper$$ExternalSyntheticLambda0 = new C0558vz$MenuHostHelper$$ExternalSyntheticLambda0();
            C0348oi.setIconTintList((Collection) c0558vz$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1, (Object[]) c0557vz.setIconTintList);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = c0558vz$MenuHostHelper$$ExternalSyntheticLambda0;
        }

        public final setIconTintList MenuHostHelper$$ExternalSyntheticLambda1(String str) {
            pN.setY(str, "");
            if (qR.setX(str, "ws:", true)) {
                StringBuilder sb = new StringBuilder("http:");
                String substring = str.substring(3);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
                sb.append(substring);
                str = sb.toString();
            } else if (qR.setX(str, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder("https:");
                String substring2 = str.substring(4);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring2, "");
                sb2.append(substring2);
                str = sb2.toString();
            }
            vx$MenuHostHelper$$ExternalSyntheticLambda1 vx_menuhosthelper__externalsyntheticlambda1 = C0555vx.MenuHostHelper$$ExternalSyntheticLambda0;
            pN.setY(str, "");
            C0555vx y = new C0555vx.setIconTintList().setX((C0555vx) null, str).setY();
            pN.setY(y, "");
            this.setY = y;
            return this;
        }

        public final setIconTintList setX(C0557vz c0557vz) {
            pN.setY(c0557vz, "");
            C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 c0558vz$MenuHostHelper$$ExternalSyntheticLambda0 = new C0558vz$MenuHostHelper$$ExternalSyntheticLambda0();
            C0348oi.setIconTintList((Collection) c0558vz$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1, (Object[]) c0557vz.setIconTintList);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = c0558vz$MenuHostHelper$$ExternalSyntheticLambda0;
            return this;
        }

        public final setIconTintList MenuHostHelper$$ExternalSyntheticLambda1(String str, vF vFVar) {
            pN.setY(str, "");
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (vFVar == null) {
                if (!(true ^ C0572wl.MenuHostHelper$$ExternalSyntheticLambda0(str))) {
                    StringBuilder sb = new StringBuilder("method ");
                    sb.append(str);
                    sb.append(" must have a request body.");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            } else if (!C0572wl.setY(str)) {
                StringBuilder sb2 = new StringBuilder("method ");
                sb2.append(str);
                sb2.append(" must not have a request body.");
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            this.setIconTintList = str;
            this.setX = vFVar;
            return this;
        }

        public final <T> setIconTintList MenuHostHelper$$ExternalSyntheticLambda0(Class<? super T> cls, T t) {
            pN.setY(cls, "");
            if (t == null) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.remove(cls);
            } else {
                if (this.MenuHostHelper$$ExternalSyntheticLambda1.isEmpty()) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.MenuHostHelper$$ExternalSyntheticLambda1;
                T cast = cls.cast(t);
                pN.setX(cast);
                map.put(cls, cast);
            }
            return this;
        }

        public final vE setX() {
            C0555vx c0555vx = this.setY;
            if (c0555vx != null) {
                return new vE(c0555vx, this.setIconTintList, this.MenuHostHelper$$ExternalSyntheticLambda0.setX(), this.setX, vL.setX(this.MenuHostHelper$$ExternalSyntheticLambda1));
            }
            throw new IllegalStateException("url == null".toString());
        }
    }
}