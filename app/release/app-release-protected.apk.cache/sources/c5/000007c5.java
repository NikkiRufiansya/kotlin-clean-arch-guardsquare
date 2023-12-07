package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: o.of  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0345of extends C0349oj {
    public static final char MenuHostHelper$$ExternalSyntheticLambda1(char[] cArr) {
        pN.setY(cArr, "");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <C extends Collection<? super T>, T> C setIconTintList(T[] tArr, C c) {
        pN.setY(tArr, "");
        pN.setY(c, "");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    public static final <T> List<T> setIconTintList(T[] tArr) {
        pN.setY(tArr, "");
        pN.setY(tArr, "");
        return new ArrayList(new C0343od(tArr, false));
    }
}