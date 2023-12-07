package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0354oo extends C0352om {
    public static final <T> boolean setY(Collection<? super T> collection, Iterable<? extends T> iterable) {
        pN.setY(collection, "");
        pN.setY(iterable, "");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static final <T> boolean setIconTintList(Collection<? super T> collection, T[] tArr) {
        pN.setY(collection, "");
        pN.setY(tArr, "");
        pN.setY(tArr, "");
        List asList = Arrays.asList(tArr);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) asList, "");
        return collection.addAll(asList);
    }
}