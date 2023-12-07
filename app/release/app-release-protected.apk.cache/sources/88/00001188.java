package o;

import java.lang.Comparable;
import o.uC;

/* loaded from: classes.dex */
public class uG<T extends uC & Comparable<? super T>> {
    public volatile /* synthetic */ int _size = 0;
    public T[] setX;

    public final T setX(int i) {
        rX.setIconTintList();
        T[] tArr = this.setX;
        pN.setX(tArr);
        this._size--;
        if (this._size > 0) {
            setY(0, this._size);
            setY(0);
        }
        T t = tArr[this._size];
        pN.setX(t);
        rX.setIconTintList();
        tArr[this._size] = null;
        return t;
    }

    public final void setY(int i, int i2) {
        T[] tArr = this.setX;
        pN.setX(tArr);
        T t = tArr[i2];
        pN.setX(t);
        T t2 = tArr[i];
        pN.setX(t2);
        tArr[i] = t;
        tArr[i2] = t2;
    }

    public final T setIconTintList() {
        T t;
        synchronized (this) {
            T[] tArr = this.setX;
            t = tArr != null ? tArr[0] : null;
        }
        return t;
    }

    public final T setX() {
        T x;
        synchronized (this) {
            x = this._size > 0 ? setX(0) : null;
        }
        return x;
    }

    private final void setY(int i) {
        while (true) {
            int i2 = (i << 1) + 1;
            if (i2 >= this._size) {
                return;
            }
            T[] tArr = this.setX;
            pN.setX(tArr);
            int i3 = i2 + 1;
            if (i3 < this._size) {
                T t = tArr[i3];
                pN.setX(t);
                T t2 = tArr[i2];
                pN.setX(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    i2 = i3;
                }
            }
            T t3 = tArr[i];
            pN.setX(t3);
            T t4 = tArr[i2];
            pN.setX(t4);
            if (((Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            setY(i, i2);
            i = i2;
        }
    }
}