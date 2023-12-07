package o;

/* loaded from: classes.dex */
public final class tU<T> {
    public int MenuHostHelper$$ExternalSyntheticLambda0;
    public int MenuHostHelper$$ExternalSyntheticLambda1;
    private Object[] setX = new Object[16];

    public final void MenuHostHelper$$ExternalSyntheticLambda1(T t) {
        Object[] objArr = this.setX;
        int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = length;
        if (length == this.MenuHostHelper$$ExternalSyntheticLambda0) {
            setY();
        }
    }

    public final T setX() {
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i == this.MenuHostHelper$$ExternalSyntheticLambda1) {
            return null;
        }
        Object[] objArr = this.setX;
        T t = (T) objArr[i];
        objArr[i] = null;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = (i + 1) & (objArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }

    private final void setY() {
        Object[] objArr = this.setX;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        C0342oc.MenuHostHelper$$ExternalSyntheticLambda0(objArr, objArr2, 0, this.MenuHostHelper$$ExternalSyntheticLambda0, 0, 10);
        Object[] objArr3 = this.setX;
        int length2 = objArr3.length;
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        C0342oc.MenuHostHelper$$ExternalSyntheticLambda0(objArr3, objArr2, length2 - i, 0, i, 4);
        this.setX = objArr2;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = length;
    }
}