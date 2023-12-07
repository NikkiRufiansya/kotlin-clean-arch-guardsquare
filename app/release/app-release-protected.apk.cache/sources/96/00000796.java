package o;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class oB extends oC {
    public static final int setX(int i) {
        if (i >= 0) {
            if (i < 3) {
                return i + 1;
            }
            if (i < 1073741824) {
                return (int) ((i / 0.75f) + 1.0f);
            }
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public static final <K, V> Map<K, V> setY(Map<? extends K, ? extends V> map) {
        pN.setY(map, "");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) singletonMap, "");
        return singletonMap;
    }
}