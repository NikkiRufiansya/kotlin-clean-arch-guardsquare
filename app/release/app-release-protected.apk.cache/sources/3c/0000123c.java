package o;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: o.vp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0546vp {
    public final Map<String, String> MenuHostHelper$$ExternalSyntheticLambda0;
    public final String setY;

    public C0546vp(String str, Map<String, String> map) {
        String str2;
        pN.setY(str, "");
        pN.setY(map, "");
        this.setY = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) locale, "");
                if (key == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                str2 = key.toLowerCase(locale);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str2, "");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) unmodifiableMap, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = unmodifiableMap;
    }

    public final Charset setY() {
        String str = this.MenuHostHelper$$ExternalSyntheticLambda0.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) forName, "");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) charset, "");
        return charset;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0546vp) {
            C0546vp c0546vp = (C0546vp) obj;
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) c0546vp.setY, (Object) this.setY) && pN.MenuHostHelper$$ExternalSyntheticLambda0(c0546vp.MenuHostHelper$$ExternalSyntheticLambda0, this.MenuHostHelper$$ExternalSyntheticLambda0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.setY.hashCode() + 899) * 31) + this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.setY);
        sb.append(" authParams=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        return sb.toString();
    }
}