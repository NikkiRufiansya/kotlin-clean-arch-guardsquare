package o;

/* loaded from: classes.dex */
public final class setPrefixTextAppearance<E> implements Cloneable {
    public static final Object setY = new Object();
    public long[] MenuHostHelper$$ExternalSyntheticLambda0;
    public Object[] MenuHostHelper$$ExternalSyntheticLambda1;
    public boolean setIconTintList;
    public int setX;

    public setPrefixTextAppearance() {
        this(10);
    }

    public setPrefixTextAppearance(int i) {
        this.setIconTintList = false;
        if (i == 0) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setStatusBarBackground.MenuHostHelper$$ExternalSyntheticLambda1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = setStatusBarBackground.setY;
            return;
        }
        int iconTintList = setStatusBarBackground.setIconTintList(i);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new long[iconTintList];
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new Object[iconTintList];
    }

    /* renamed from: MenuHostHelper$$ExternalSyntheticLambda0 */
    public final setPrefixTextAppearance<E> clone() {
        try {
            setPrefixTextAppearance<E> setprefixtextappearance = (setPrefixTextAppearance) super.clone();
            setprefixtextappearance.MenuHostHelper$$ExternalSyntheticLambda0 = (long[]) this.MenuHostHelper$$ExternalSyntheticLambda0.clone();
            setprefixtextappearance.MenuHostHelper$$ExternalSyntheticLambda1 = (Object[]) this.MenuHostHelper$$ExternalSyntheticLambda1.clone();
            return setprefixtextappearance;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final E MenuHostHelper$$ExternalSyntheticLambda0(long j, E e) {
        E e2;
        int y = setStatusBarBackground.setY(this.MenuHostHelper$$ExternalSyntheticLambda0, this.setX, j);
        return (y < 0 || (e2 = (E) this.MenuHostHelper$$ExternalSyntheticLambda1[y]) == setY) ? e : e2;
    }

    public final void setIconTintList() {
        int i = this.setX;
        long[] jArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        Object[] objArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != setY) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.setIconTintList = false;
        this.setX = i2;
    }

    public final void setX(long j, E e) {
        int y = setStatusBarBackground.setY(this.MenuHostHelper$$ExternalSyntheticLambda0, this.setX, j);
        if (y >= 0) {
            this.MenuHostHelper$$ExternalSyntheticLambda1[y] = e;
            return;
        }
        int i = ~y;
        int i2 = this.setX;
        if (i < i2) {
            Object[] objArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (objArr[i] == setY) {
                this.MenuHostHelper$$ExternalSyntheticLambda0[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.setIconTintList && i2 >= this.MenuHostHelper$$ExternalSyntheticLambda0.length) {
            setIconTintList();
            i = ~setStatusBarBackground.setY(this.MenuHostHelper$$ExternalSyntheticLambda0, this.setX, j);
        }
        int i3 = this.setX;
        if (i3 >= this.MenuHostHelper$$ExternalSyntheticLambda0.length) {
            int iconTintList = setStatusBarBackground.setIconTintList(i3 + 1);
            long[] jArr = new long[iconTintList];
            Object[] objArr2 = new Object[iconTintList];
            long[] jArr2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = jArr;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = objArr2;
        }
        int i4 = this.setX - i;
        if (i4 != 0) {
            long[] jArr3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4);
            Object[] objArr4 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            System.arraycopy(objArr4, i, objArr4, i5, this.setX - i);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0[i] = j;
        this.MenuHostHelper$$ExternalSyntheticLambda1[i] = e;
        this.setX++;
    }

    public final void setX() {
        int i = this.setX;
        Object[] objArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.setX = 0;
        this.setIconTintList = false;
    }

    public final void setIconTintList(long j, E e) {
        int i = this.setX;
        if (i != 0 && j <= this.MenuHostHelper$$ExternalSyntheticLambda0[i - 1]) {
            setX(j, e);
            return;
        }
        if (this.setIconTintList && i >= this.MenuHostHelper$$ExternalSyntheticLambda0.length) {
            setIconTintList();
        }
        int i2 = this.setX;
        if (i2 >= this.MenuHostHelper$$ExternalSyntheticLambda0.length) {
            int iconTintList = setStatusBarBackground.setIconTintList(i2 + 1);
            long[] jArr = new long[iconTintList];
            Object[] objArr = new Object[iconTintList];
            long[] jArr2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = jArr;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = objArr;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0[i2] = j;
        this.MenuHostHelper$$ExternalSyntheticLambda1[i2] = e;
        this.setX = i2 + 1;
    }

    public final String toString() {
        if (this.setIconTintList) {
            setIconTintList();
        }
        int i = this.setX;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.setX; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.setIconTintList) {
                setIconTintList();
            }
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0[i2]);
            sb.append('=');
            if (this.setIconTintList) {
                setIconTintList();
            }
            Object obj = this.MenuHostHelper$$ExternalSyntheticLambda1[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}