package o;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class oA extends oB {
    public static final <K, V> void setX(Map<? super K, ? super V> map, Iterable<? extends nT<? extends K, ? extends V>> iterable) {
        pN.setY(map, "");
        pN.setY(iterable, "");
        for (nT<? extends K, ? extends V> nTVar : iterable) {
            map.put((Object) nTVar.MenuHostHelper$$ExternalSyntheticLambda0, (Object) nTVar.setX);
        }
    }

    public static final <K, V> Map<K, V> setIconTintList(Iterable<? extends nT<? extends K, ? extends V>> iterable) {
        pN.setY(iterable, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                C0361ov c0361ov = C0361ov.MenuHostHelper$$ExternalSyntheticLambda1;
                pN.setX(c0361ov);
                return c0361ov;
            } else if (size == 1) {
                nT<? extends K, ? extends V> next = iterable instanceof List ? (nT<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next();
                pN.setY(next, "");
                Map<K, V> singletonMap = Collections.singletonMap(next.MenuHostHelper$$ExternalSyntheticLambda0, next.setX);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) singletonMap, "");
                return singletonMap;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(C0362ow.setX(collection.size()));
                pN.setY(iterable, "");
                pN.setY(linkedHashMap, "");
                C0362ow.setX(linkedHashMap, iterable);
                return linkedHashMap;
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        pN.setY(iterable, "");
        pN.setY(linkedHashMap2, "");
        C0362ow.setX(linkedHashMap2, iterable);
        return C0362ow.setIconTintList(linkedHashMap2);
    }

    public static final <K, V> Map<K, V> setX(Map<? extends K, ? extends V> map) {
        pN.setY(map, "");
        int size = map.size();
        if (size == 0) {
            C0361ov c0361ov = C0361ov.MenuHostHelper$$ExternalSyntheticLambda1;
            pN.setX(c0361ov);
            return c0361ov;
        } else if (size == 1) {
            return C0362ow.setY(map);
        } else {
            pN.setY(map, "");
            return new LinkedHashMap(map);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> setIconTintList(Map<K, ? extends V> map) {
        pN.setY(map, "");
        int size = map.size();
        if (size != 0) {
            return size == 1 ? C0362ow.setY(map) : map;
        }
        C0361ov c0361ov = C0361ov.MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setX(c0361ov);
        return c0361ov;
    }
}