package o;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class setDividerHeight<K, V> {
    private static Object[] MenuHostHelper$$ExternalSyntheticLambda1;
    private static Object[] setIconTintList;
    private static int setOnLongClickListener;
    private static int setY;
    int MenuHostHelper$$ExternalSyntheticLambda0;
    private int[] setNavigationOnClickListener;
    public Object[] setX;

    private static int MenuHostHelper$$ExternalSyntheticLambda1(int[] iArr, int i, int i2) {
        try {
            return setStatusBarBackground.setIconTintList(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int setY(Object obj, int i) {
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i2 == 0) {
            return -1;
        }
        int MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener, i2, i);
        if (MenuHostHelper$$ExternalSyntheticLambda12 >= 0 && !obj.equals(this.setX[MenuHostHelper$$ExternalSyntheticLambda12 << 1])) {
            int i3 = MenuHostHelper$$ExternalSyntheticLambda12 + 1;
            while (i3 < i2 && this.setNavigationOnClickListener[i3] == i) {
                if (obj.equals(this.setX[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = MenuHostHelper$$ExternalSyntheticLambda12 - 1; i4 >= 0 && this.setNavigationOnClickListener[i4] == i; i4--) {
                if (obj.equals(this.setX[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        }
        return MenuHostHelper$$ExternalSyntheticLambda12;
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i == 0) {
            return -1;
        }
        int MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener, i, 0);
        if (MenuHostHelper$$ExternalSyntheticLambda12 >= 0 && this.setX[MenuHostHelper$$ExternalSyntheticLambda12 << 1] != null) {
            int i2 = MenuHostHelper$$ExternalSyntheticLambda12 + 1;
            while (i2 < i && this.setNavigationOnClickListener[i2] == 0) {
                if (this.setX[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = MenuHostHelper$$ExternalSyntheticLambda12 - 1; i3 >= 0 && this.setNavigationOnClickListener[i3] == 0; i3--) {
                if (this.setX[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        }
        return MenuHostHelper$$ExternalSyntheticLambda12;
    }

    private void setX(int i) {
        if (i == 8) {
            synchronized (setDividerHeight.class) {
                Object[] objArr = setIconTintList;
                if (objArr != null) {
                    this.setX = objArr;
                    setIconTintList = (Object[]) objArr[0];
                    this.setNavigationOnClickListener = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    setOnLongClickListener--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (setDividerHeight.class) {
                Object[] objArr2 = MenuHostHelper$$ExternalSyntheticLambda1;
                if (objArr2 != null) {
                    this.setX = objArr2;
                    MenuHostHelper$$ExternalSyntheticLambda1 = (Object[]) objArr2[0];
                    this.setNavigationOnClickListener = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    setY--;
                    return;
                }
            }
        }
        this.setNavigationOnClickListener = new int[i];
        this.setX = new Object[i << 1];
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda1(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (setDividerHeight.class) {
                if (setOnLongClickListener < 10) {
                    objArr[0] = setIconTintList;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    setIconTintList = objArr;
                    setOnLongClickListener++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (setDividerHeight.class) {
                if (setY < 10) {
                    objArr[0] = MenuHostHelper$$ExternalSyntheticLambda1;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    MenuHostHelper$$ExternalSyntheticLambda1 = objArr;
                    setY++;
                }
            }
        }
    }

    public setDividerHeight() {
        this.setNavigationOnClickListener = setStatusBarBackground.setX;
        this.setX = setStatusBarBackground.setY;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
    }

    public setDividerHeight(int i) {
        if (i == 0) {
            this.setNavigationOnClickListener = setStatusBarBackground.setX;
            this.setX = setStatusBarBackground.setY;
        } else {
            setX(i);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setDividerHeight(setDividerHeight<K, V> setdividerheight) {
        this();
        if (setdividerheight != null) {
            int i = setdividerheight.MenuHostHelper$$ExternalSyntheticLambda0;
            setY(this.MenuHostHelper$$ExternalSyntheticLambda0 + i);
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == 0) {
                if (i > 0) {
                    System.arraycopy(setdividerheight.setNavigationOnClickListener, 0, this.setNavigationOnClickListener, 0, i);
                    System.arraycopy(setdividerheight.setX, 0, this.setX, 0, i << 1);
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
                    return;
                }
                return;
            }
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr = setdividerheight.setX;
                int i3 = i2 << 1;
                put(objArr[i3], objArr[i3 + 1]);
            }
        }
    }

    public void clear() {
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i > 0) {
            int[] iArr = this.setNavigationOnClickListener;
            Object[] objArr = this.setX;
            this.setNavigationOnClickListener = setStatusBarBackground.setX;
            this.setX = setStatusBarBackground.setY;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
            MenuHostHelper$$ExternalSyntheticLambda1(iArr, objArr, i);
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final void setY(int i) {
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int[] iArr = this.setNavigationOnClickListener;
        if (iArr.length < i) {
            Object[] objArr = this.setX;
            setX(i);
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 > 0) {
                System.arraycopy(iArr, 0, this.setNavigationOnClickListener, 0, i2);
                System.arraycopy(objArr, 0, this.setX, 0, i2 << 1);
            }
            MenuHostHelper$$ExternalSyntheticLambda1(iArr, objArr, i2);
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int setIconTintList(Object obj) {
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0 << 1;
        Object[] objArr = this.setX;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(Object obj) {
        return setIconTintList(obj) >= 0;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public boolean isEmpty() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0 <= 0;
    }

    public V put(K k, V v) {
        int i;
        int y;
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (k == null) {
            y = MenuHostHelper$$ExternalSyntheticLambda1();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            y = setY(k, hashCode);
        }
        if (y >= 0) {
            int i3 = (y << 1) + 1;
            Object[] objArr = this.setX;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~y;
        int[] iArr = this.setNavigationOnClickListener;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.setX;
            setX(i5);
            if (i2 != this.MenuHostHelper$$ExternalSyntheticLambda0) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.setNavigationOnClickListener;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.setX, 0, objArr2.length);
            }
            MenuHostHelper$$ExternalSyntheticLambda1(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.setNavigationOnClickListener;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.setX;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.MenuHostHelper$$ExternalSyntheticLambda0 - i4) << 1);
        }
        int i7 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i2 == i7) {
            int[] iArr4 = this.setNavigationOnClickListener;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.setX;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.MenuHostHelper$$ExternalSyntheticLambda0 = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public final V setIconTintList(int i) {
        Object[] objArr = this.setX;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int i4 = 0;
        if (i3 <= 1) {
            MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener, objArr, i3);
            this.setNavigationOnClickListener = setStatusBarBackground.setX;
            this.setX = setStatusBarBackground.setY;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.setNavigationOnClickListener;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                setX(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.MenuHostHelper$$ExternalSyntheticLambda0) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.setNavigationOnClickListener, 0, i);
                    System.arraycopy(objArr, 0, this.setX, 0, i2);
                }
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, this.setNavigationOnClickListener, i, i7);
                    System.arraycopy(objArr, i6 << 1, this.setX, i2, i7 << 1);
                }
            } else {
                if (i < i5) {
                    int i8 = i + 1;
                    int i9 = i5 - i;
                    System.arraycopy(iArr, i8, iArr, i, i9);
                    Object[] objArr2 = this.setX;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i2, i9 << 1);
                }
                Object[] objArr3 = this.setX;
                int i10 = i5 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            }
            i4 = i5;
        }
        if (i3 != this.MenuHostHelper$$ExternalSyntheticLambda0) {
            throw new ConcurrentModificationException();
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i4;
        return v;
    }

    public int size() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setDividerHeight) {
            setDividerHeight setdividerheight = (setDividerHeight) obj;
            if (size() != setdividerheight.size()) {
                return false;
            }
            for (int i = 0; i < this.MenuHostHelper$$ExternalSyntheticLambda0; i++) {
                try {
                    int i2 = i << 1;
                    Object obj2 = this.setX[i2];
                    Object obj3 = this.setX[i2 + 1];
                    Object obj4 = setdividerheight.get(obj2);
                    if (obj3 == null) {
                        if (obj4 != null || !setdividerheight.containsKey(obj2)) {
                            return false;
                        }
                    } else if (!obj3.equals(obj4)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.MenuHostHelper$$ExternalSyntheticLambda0; i3++) {
                try {
                    int i4 = i3 << 1;
                    Object obj5 = this.setX[i4];
                    Object obj6 = this.setX[i4 + 1];
                    Object obj7 = map.get(obj5);
                    if (obj6 == null) {
                        if (obj7 != null || !map.containsKey(obj5)) {
                            return false;
                        }
                    } else if (!obj6.equals(obj7)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.setNavigationOnClickListener;
        Object[] objArr = this.setX;
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.MenuHostHelper$$ExternalSyntheticLambda0 * 28);
        sb.append('{');
        for (int i = 0; i < this.MenuHostHelper$$ExternalSyntheticLambda0; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = i << 1;
            Object obj = this.setX[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.setX[i2 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean containsKey(Object obj) {
        return (obj == null ? MenuHostHelper$$ExternalSyntheticLambda1() : setY(obj, obj.hashCode())) >= 0;
    }

    public V getOrDefault(Object obj, V v) {
        int MenuHostHelper$$ExternalSyntheticLambda12 = obj == null ? MenuHostHelper$$ExternalSyntheticLambda1() : setY(obj, obj.hashCode());
        return MenuHostHelper$$ExternalSyntheticLambda12 >= 0 ? (V) this.setX[(MenuHostHelper$$ExternalSyntheticLambda12 << 1) + 1] : v;
    }

    public V remove(Object obj) {
        int MenuHostHelper$$ExternalSyntheticLambda12 = obj == null ? MenuHostHelper$$ExternalSyntheticLambda1() : setY(obj, obj.hashCode());
        if (MenuHostHelper$$ExternalSyntheticLambda12 >= 0) {
            return setIconTintList(MenuHostHelper$$ExternalSyntheticLambda12);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int MenuHostHelper$$ExternalSyntheticLambda12 = obj == null ? MenuHostHelper$$ExternalSyntheticLambda1() : setY(obj, obj.hashCode());
        if (MenuHostHelper$$ExternalSyntheticLambda12 >= 0) {
            Object obj3 = this.setX[(MenuHostHelper$$ExternalSyntheticLambda12 << 1) + 1];
            if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                setIconTintList(MenuHostHelper$$ExternalSyntheticLambda12);
                return true;
            }
            return false;
        }
        return false;
    }

    public V replace(K k, V v) {
        int MenuHostHelper$$ExternalSyntheticLambda12 = k == null ? MenuHostHelper$$ExternalSyntheticLambda1() : setY(k, k.hashCode());
        if (MenuHostHelper$$ExternalSyntheticLambda12 >= 0) {
            int i = (MenuHostHelper$$ExternalSyntheticLambda12 << 1) + 1;
            Object[] objArr = this.setX;
            V v2 = (V) objArr[i];
            objArr[i] = v;
            return v2;
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int MenuHostHelper$$ExternalSyntheticLambda12 = k == null ? MenuHostHelper$$ExternalSyntheticLambda1() : setY(k, k.hashCode());
        if (MenuHostHelper$$ExternalSyntheticLambda12 >= 0) {
            int i = (MenuHostHelper$$ExternalSyntheticLambda12 << 1) + 1;
            Object obj = this.setX[i];
            if (obj == v || (v != null && v.equals(obj))) {
                Object[] objArr = this.setX;
                Object obj2 = objArr[i];
                objArr[i] = v2;
                return true;
            }
            return false;
        }
        return false;
    }
}