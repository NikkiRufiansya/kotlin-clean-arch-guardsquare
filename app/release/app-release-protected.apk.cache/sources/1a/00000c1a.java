package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class setHasNonEmbeddedTabs<E> implements Collection<E>, Set<E> {
    private static Object[] setIconTintList;
    private static Object[] setNavigationOnClickListener;
    private static int setUiOptions;
    private static int setUnboundedRipple;
    private setOnConstraintsChanged<E, E> setLayoutAnimation;
    private int[] setOnLongClickListener;
    public Object[] setX;
    int setY;
    private static final int[] MenuHostHelper$$ExternalSyntheticLambda1 = new int[0];
    private static final Object[] MenuHostHelper$$ExternalSyntheticLambda0 = new Object[0];

    final int MenuHostHelper$$ExternalSyntheticLambda1(Object obj, int i) {
        int i2 = this.setY;
        if (i2 == 0) {
            return -1;
        }
        int iconTintList = setStatusBarBackground.setIconTintList(this.setOnLongClickListener, i2, i);
        if (iconTintList >= 0 && !obj.equals(this.setX[iconTintList])) {
            int i3 = iconTintList + 1;
            while (i3 < i2 && this.setOnLongClickListener[i3] == i) {
                if (obj.equals(this.setX[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iconTintList - 1; i4 >= 0 && this.setOnLongClickListener[i4] == i; i4--) {
                if (obj.equals(this.setX[i4])) {
                    return i4;
                }
            }
            return ~i3;
        }
        return iconTintList;
    }

    final int MenuHostHelper$$ExternalSyntheticLambda1() {
        int i = this.setY;
        if (i == 0) {
            return -1;
        }
        int iconTintList = setStatusBarBackground.setIconTintList(this.setOnLongClickListener, i, 0);
        if (iconTintList >= 0 && this.setX[iconTintList] != null) {
            int i2 = iconTintList + 1;
            while (i2 < i && this.setOnLongClickListener[i2] == 0) {
                if (this.setX[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iconTintList - 1; i3 >= 0 && this.setOnLongClickListener[i3] == 0; i3--) {
                if (this.setX[i3] == null) {
                    return i3;
                }
            }
            return ~i2;
        }
        return iconTintList;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        if (i == 8) {
            synchronized (setHasNonEmbeddedTabs.class) {
                Object[] objArr = setNavigationOnClickListener;
                if (objArr != null) {
                    this.setX = objArr;
                    setNavigationOnClickListener = (Object[]) objArr[0];
                    this.setOnLongClickListener = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    setUnboundedRipple--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (setHasNonEmbeddedTabs.class) {
                Object[] objArr2 = setIconTintList;
                if (objArr2 != null) {
                    this.setX = objArr2;
                    setIconTintList = (Object[]) objArr2[0];
                    this.setOnLongClickListener = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    setUiOptions--;
                    return;
                }
            }
        }
        this.setOnLongClickListener = new int[i];
        this.setX = new Object[i];
    }

    private static void setY(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (setHasNonEmbeddedTabs.class) {
                if (setUnboundedRipple < 10) {
                    objArr[0] = setNavigationOnClickListener;
                    objArr[1] = iArr;
                    while (true) {
                        i--;
                        if (i < 2) {
                            break;
                        }
                        objArr[i] = null;
                    }
                    setNavigationOnClickListener = objArr;
                    setUnboundedRipple++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (setHasNonEmbeddedTabs.class) {
                if (setUiOptions < 10) {
                    objArr[0] = setIconTintList;
                    objArr[1] = iArr;
                    while (true) {
                        i--;
                        if (i < 2) {
                            break;
                        }
                        objArr[i] = null;
                    }
                    setIconTintList = objArr;
                    setUiOptions++;
                }
            }
        }
    }

    public setHasNonEmbeddedTabs() {
        this((byte) 0);
    }

    private setHasNonEmbeddedTabs(byte b) {
        this.setOnLongClickListener = MenuHostHelper$$ExternalSyntheticLambda1;
        this.setX = MenuHostHelper$$ExternalSyntheticLambda0;
        this.setY = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.setY;
        if (i != 0) {
            setY(this.setOnLongClickListener, this.setX, i);
            this.setOnLongClickListener = MenuHostHelper$$ExternalSyntheticLambda1;
            this.setX = MenuHostHelper$$ExternalSyntheticLambda0;
            this.setY = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.setY <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int i;
        int MenuHostHelper$$ExternalSyntheticLambda12;
        if (e == null) {
            MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(e, hashCode);
        }
        if (MenuHostHelper$$ExternalSyntheticLambda12 >= 0) {
            return false;
        }
        int i2 = ~MenuHostHelper$$ExternalSyntheticLambda12;
        int i3 = this.setY;
        int[] iArr = this.setOnLongClickListener;
        if (i3 >= iArr.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            Object[] objArr = this.setX;
            MenuHostHelper$$ExternalSyntheticLambda0(i4);
            int[] iArr2 = this.setOnLongClickListener;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.setX, 0, objArr.length);
            }
            setY(iArr, objArr, this.setY);
        }
        int i5 = this.setY;
        if (i2 < i5) {
            int[] iArr3 = this.setOnLongClickListener;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.setX;
            System.arraycopy(objArr2, i2, objArr2, i6, this.setY - i2);
        }
        this.setOnLongClickListener[i2] = i;
        this.setX[i2] = e;
        this.setY++;
        return true;
    }

    public final E setY(int i) {
        Object[] objArr = this.setX;
        E e = (E) objArr[i];
        int i2 = this.setY;
        if (i2 <= 1) {
            setY(this.setOnLongClickListener, objArr, i2);
            this.setOnLongClickListener = MenuHostHelper$$ExternalSyntheticLambda1;
            this.setX = MenuHostHelper$$ExternalSyntheticLambda0;
            this.setY = 0;
        } else {
            int[] iArr = this.setOnLongClickListener;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                MenuHostHelper$$ExternalSyntheticLambda0(i2 > 8 ? i2 + (i2 >> 1) : 8);
                this.setY--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.setOnLongClickListener, 0, i);
                    System.arraycopy(objArr, 0, this.setX, 0, i);
                }
                int i3 = this.setY;
                if (i < i3) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, this.setOnLongClickListener, i, i3 - i);
                    System.arraycopy(objArr, i4, this.setX, i, this.setY - i);
                }
            } else {
                int i5 = i2 - 1;
                this.setY = i5;
                if (i < i5) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, iArr, i, i5 - i);
                    Object[] objArr2 = this.setX;
                    System.arraycopy(objArr2, i6, objArr2, i, this.setY - i);
                }
                this.setX[this.setY] = null;
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.setY;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.setY;
        Object[] objArr = new Object[i];
        System.arraycopy(this.setX, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.setY) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.setY));
        }
        System.arraycopy(this.setX, 0, tArr, 0, this.setY);
        int length = tArr.length;
        int i = this.setY;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.setY; i++) {
                try {
                    if (!set.contains(this.setX[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.setOnLongClickListener;
        int i = this.setY;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.setY * 14);
        sb.append('{');
        for (int i = 0; i < this.setY; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.setX[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = this.setY + collection.size();
        int[] iArr = this.setOnLongClickListener;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.setX;
            MenuHostHelper$$ExternalSyntheticLambda0(size);
            int i = this.setY;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.setOnLongClickListener, 0, i);
                System.arraycopy(objArr, 0, this.setX, 0, this.setY);
            }
            setY(iArr, objArr, this.setY);
        }
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.setY - 1; i >= 0; i--) {
            if (!collection.contains(this.setX[i])) {
                setY(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? MenuHostHelper$$ExternalSyntheticLambda1() : MenuHostHelper$$ExternalSyntheticLambda1(obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        if (this.setLayoutAnimation == null) {
            this.setLayoutAnimation = new setOnConstraintsChanged<E, E>() { // from class: o.setHasNonEmbeddedTabs.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.setOnConstraintsChanged
                public final int setX() {
                    return setHasNonEmbeddedTabs.this.setY;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.setOnConstraintsChanged
                public final Object setY(int i, int i2) {
                    return setHasNonEmbeddedTabs.this.setX[i];
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.setOnConstraintsChanged
                public final int setX(Object obj) {
                    setHasNonEmbeddedTabs sethasnonembeddedtabs = setHasNonEmbeddedTabs.this;
                    return obj == null ? sethasnonembeddedtabs.MenuHostHelper$$ExternalSyntheticLambda1() : sethasnonembeddedtabs.MenuHostHelper$$ExternalSyntheticLambda1(obj, obj.hashCode());
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.setOnConstraintsChanged
                public final int MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
                    setHasNonEmbeddedTabs sethasnonembeddedtabs = setHasNonEmbeddedTabs.this;
                    return obj == null ? sethasnonembeddedtabs.MenuHostHelper$$ExternalSyntheticLambda1() : sethasnonembeddedtabs.MenuHostHelper$$ExternalSyntheticLambda1(obj, obj.hashCode());
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.setOnConstraintsChanged
                public final Map<E, E> MenuHostHelper$$ExternalSyntheticLambda0() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // o.setOnConstraintsChanged
                protected final void MenuHostHelper$$ExternalSyntheticLambda1(E e, E e2) {
                    setHasNonEmbeddedTabs.this.add(e);
                }

                @Override // o.setOnConstraintsChanged
                protected final E setX(int i, E e) {
                    throw new UnsupportedOperationException("not a map");
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.setOnConstraintsChanged
                public final void setY(int i) {
                    setHasNonEmbeddedTabs.this.setY(i);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.setOnConstraintsChanged
                public final void MenuHostHelper$$ExternalSyntheticLambda1() {
                    setHasNonEmbeddedTabs.this.clear();
                }
            };
        }
        setOnConstraintsChanged<E, E> setonconstraintschanged = this.setLayoutAnimation;
        if (setonconstraintschanged.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            setonconstraintschanged.MenuHostHelper$$ExternalSyntheticLambda1 = new setOnConstraintsChanged$MenuHostHelper$$ExternalSyntheticLambda1(setonconstraintschanged);
        }
        return (Iterator<E>) setonconstraintschanged.MenuHostHelper$$ExternalSyntheticLambda1.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int MenuHostHelper$$ExternalSyntheticLambda12 = obj == null ? MenuHostHelper$$ExternalSyntheticLambda1() : MenuHostHelper$$ExternalSyntheticLambda1(obj, obj.hashCode());
        if (MenuHostHelper$$ExternalSyntheticLambda12 >= 0) {
            setY(MenuHostHelper$$ExternalSyntheticLambda12);
            return true;
        }
        return false;
    }
}