package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: o.oh */
/* loaded from: classes.dex */
public class C0347oh extends C0346og {
    public static final <T> List<T> setX(T... tArr) {
        pN.setY(tArr, "");
        if (tArr.length > 0) {
            pN.setY(tArr, "");
            List<T> asList = Arrays.asList(tArr);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) asList, "");
            return asList;
        }
        return C0358os.setIconTintList;
    }

    public static final <T> List<T> setIconTintList(T... tArr) {
        pN.setY(tArr, "");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C0343od(tArr, true));
    }

    public static final <T> ArrayList<T> MenuHostHelper$$ExternalSyntheticLambda1(T... tArr) {
        pN.setY(tArr, "");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new C0343od(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> MenuHostHelper$$ExternalSyntheticLambda0(List<? extends T> list) {
        pN.setY(list, "");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                List<T> singletonList = Collections.singletonList(list.get(0));
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) singletonList, "");
                return singletonList;
            }
            return list;
        }
        return C0358os.setIconTintList;
    }

    public static /* synthetic */ int setIconTintList(List list, Comparable comparable) {
        int size = list.size();
        pN.setY(list, "");
        int size2 = list.size();
        if (size < 0) {
            StringBuilder sb = new StringBuilder("fromIndex (");
            sb.append(0);
            sb.append(") is greater than toIndex (");
            sb.append(size);
            sb.append(").");
            throw new IllegalArgumentException(sb.toString());
        } else if (size > size2) {
            StringBuilder sb2 = new StringBuilder("toIndex (");
            sb2.append(size);
            sb2.append(") is greater than size (");
            sb2.append(size2);
            sb2.append(").");
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            int i = size - 1;
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (i2 > i) {
                    return -(i2 + 1);
                }
                int i4 = (i2 + i) >>> 1;
                Comparable comparable2 = (Comparable) list.get(i4);
                if (comparable2 == comparable) {
                    i3 = 0;
                } else if (comparable2 == null) {
                    i3 = -1;
                } else if (comparable != null) {
                    i3 = comparable2.compareTo(comparable);
                }
                if (i3 < 0) {
                    i2 = i4 + 1;
                } else if (i3 <= 0) {
                    return i4;
                } else {
                    i = i4 - 1;
                }
            }
        }
    }
}