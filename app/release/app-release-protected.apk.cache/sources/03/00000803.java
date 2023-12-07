package o;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class pH {
    private static final Object[] setY = new Object[0];

    public static final Object[] setIconTintList(Collection<?> collection) {
        pN.setY(collection, "");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr[i] = it.next();
                    if (i2 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            i3 = 2147483645;
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) objArr, "");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i2);
                        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) copyOf, "");
                        return copyOf;
                    }
                    i = i2;
                }
            }
        }
        return setY;
    }

    public static final Object[] MenuHostHelper$$ExternalSyntheticLambda1(Collection<?> collection, Object[] objArr) {
        Object[] objArr2;
        pN.setY(collection, "");
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            pN.setX(newInstance);
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                    i3 = 2147483645;
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) objArr2, "");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i2);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) copyOf, "");
                return copyOf;
            }
            i = i2;
        }
    }
}