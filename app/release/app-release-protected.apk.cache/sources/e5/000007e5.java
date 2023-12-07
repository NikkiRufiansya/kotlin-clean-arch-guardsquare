package o;

/* loaded from: classes.dex */
public class onAppEnteredBackground<E> implements Cloneable {
    private static final Object MenuHostHelper$$ExternalSyntheticLambda1 = new Object();
    private Object[] MenuHostHelper$$ExternalSyntheticLambda0;
    private boolean setIconTintList;
    private int[] setX;
    private int setY;

    public onAppEnteredBackground() {
        this(10);
    }

    public onAppEnteredBackground(int i) {
        this.setIconTintList = false;
        if (i == 0) {
            this.setX = setStatusBarBackground.setX;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setStatusBarBackground.setY;
            return;
        }
        int y = setStatusBarBackground.setY(i);
        this.setX = new int[y];
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new Object[y];
    }

    /* renamed from: MenuHostHelper$$ExternalSyntheticLambda1 */
    public onAppEnteredBackground<E> clone() {
        try {
            onAppEnteredBackground<E> onappenteredbackground = (onAppEnteredBackground) super.clone();
            onappenteredbackground.setX = (int[]) this.setX.clone();
            onappenteredbackground.MenuHostHelper$$ExternalSyntheticLambda0 = (Object[]) this.MenuHostHelper$$ExternalSyntheticLambda0.clone();
            return onappenteredbackground;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public E setX(int i) {
        return MenuHostHelper$$ExternalSyntheticLambda0(i, null);
    }

    public E MenuHostHelper$$ExternalSyntheticLambda0(int i, E e) {
        E e2;
        int iconTintList = setStatusBarBackground.setIconTintList(this.setX, this.setY, i);
        return (iconTintList < 0 || (e2 = (E) this.MenuHostHelper$$ExternalSyntheticLambda0[iconTintList]) == MenuHostHelper$$ExternalSyntheticLambda1) ? e : e2;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0() {
        int i = this.setY;
        int[] iArr = this.setX;
        Object[] objArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != MenuHostHelper$$ExternalSyntheticLambda1) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.setIconTintList = false;
        this.setY = i2;
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1(int i, E e) {
        int iconTintList = setStatusBarBackground.setIconTintList(this.setX, this.setY, i);
        if (iconTintList >= 0) {
            this.MenuHostHelper$$ExternalSyntheticLambda0[iconTintList] = e;
            return;
        }
        int i2 = ~iconTintList;
        int i3 = this.setY;
        if (i2 < i3) {
            Object[] objArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (objArr[i2] == MenuHostHelper$$ExternalSyntheticLambda1) {
                this.setX[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.setIconTintList && i3 >= this.setX.length) {
            MenuHostHelper$$ExternalSyntheticLambda0();
            i2 = ~setStatusBarBackground.setIconTintList(this.setX, this.setY, i);
        }
        int i4 = this.setY;
        if (i4 >= this.setX.length) {
            int y = setStatusBarBackground.setY(i4 + 1);
            int[] iArr = new int[y];
            Object[] objArr2 = new Object[y];
            int[] iArr2 = this.setX;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.setX = iArr;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = objArr2;
        }
        int i5 = this.setY - i2;
        if (i5 != 0) {
            int[] iArr3 = this.setX;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5);
            Object[] objArr4 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            System.arraycopy(objArr4, i2, objArr4, i6, this.setY - i2);
        }
        this.setX[i2] = i;
        this.MenuHostHelper$$ExternalSyntheticLambda0[i2] = e;
        this.setY++;
    }

    public int setY() {
        if (this.setIconTintList) {
            MenuHostHelper$$ExternalSyntheticLambda0();
        }
        return this.setY;
    }

    public int setIconTintList(int i) {
        if (this.setIconTintList) {
            MenuHostHelper$$ExternalSyntheticLambda0();
        }
        return this.setX[i];
    }

    public E setY(int i) {
        if (this.setIconTintList) {
            MenuHostHelper$$ExternalSyntheticLambda0();
        }
        return (E) this.MenuHostHelper$$ExternalSyntheticLambda0[i];
    }

    public int setIconTintList(E e) {
        if (this.setIconTintList) {
            MenuHostHelper$$ExternalSyntheticLambda0();
        }
        for (int i = 0; i < this.setY; i++) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public void setX() {
        int i = this.setY;
        Object[] objArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.setY = 0;
        this.setIconTintList = false;
    }

    public void setX(int i, E e) {
        int i2 = this.setY;
        if (i2 != 0 && i <= this.setX[i2 - 1]) {
            MenuHostHelper$$ExternalSyntheticLambda1(i, e);
            return;
        }
        if (this.setIconTintList && i2 >= this.setX.length) {
            MenuHostHelper$$ExternalSyntheticLambda0();
        }
        int i3 = this.setY;
        if (i3 >= this.setX.length) {
            int y = setStatusBarBackground.setY(i3 + 1);
            int[] iArr = new int[y];
            Object[] objArr = new Object[y];
            int[] iArr2 = this.setX;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.setX = iArr;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = objArr;
        }
        this.setX[i3] = i;
        this.MenuHostHelper$$ExternalSyntheticLambda0[i3] = e;
        this.setY = i3 + 1;
    }

    public String toString() {
        if (setY() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.setY * 28);
        sb.append('{');
        for (int i = 0; i < this.setY; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(setIconTintList(i));
            sb.append('=');
            E y = setY(i);
            if (y != this) {
                sb.append(y);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}