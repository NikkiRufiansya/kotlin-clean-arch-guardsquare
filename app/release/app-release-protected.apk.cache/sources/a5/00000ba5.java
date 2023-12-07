package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class setExpandedTitleMarginTop extends setDataDirectorySuffix<Double> implements setCheckedIconSizeResource, RandomAccess, setAutofillId {
    private double[] setIconTintList;
    private int setX;

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        setIconTintList();
        if (i < 0 || i > (i2 = this.setX)) {
            throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda0(i));
        }
        double[] dArr = this.setIconTintList;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.setIconTintList, i, dArr2, i + 1, this.setX - i);
            this.setIconTintList = dArr2;
        }
        this.setIconTintList[i] = doubleValue;
        this.setX++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        setX(((Double) obj).doubleValue());
        return true;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        setIconTintList();
        if (i >= 0 && i < this.setX) {
            double[] dArr = this.setIconTintList;
            double d = dArr[i];
            dArr[i] = doubleValue;
            return Double.valueOf(d);
        }
        throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda0(i));
    }

    static {
        new setExpandedTitleMarginTop(new double[0], 0).setX();
    }

    setExpandedTitleMarginTop() {
        this(new double[10], 0);
    }

    private setExpandedTitleMarginTop(double[] dArr, int i) {
        this.setIconTintList = dArr;
        this.setX = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        setIconTintList();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.setIconTintList;
        System.arraycopy(dArr, i2, dArr, i, this.setX - i2);
        this.setX -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setExpandedTitleMarginTop)) {
            return super.equals(obj);
        }
        setExpandedTitleMarginTop setexpandedtitlemargintop = (setExpandedTitleMarginTop) obj;
        if (this.setX != setexpandedtitlemargintop.setX) {
            return false;
        }
        double[] dArr = setexpandedtitlemargintop.setIconTintList;
        for (int i = 0; i < this.setX; i++) {
            if (Double.doubleToLongBits(this.setIconTintList[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.setX; i2++) {
            i = (i * 31) + setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(Double.doubleToLongBits(this.setIconTintList[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.setX;
    }

    public final void setX(double d) {
        setIconTintList();
        int i = this.setX;
        double[] dArr = this.setIconTintList;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.setIconTintList = dArr2;
        }
        double[] dArr3 = this.setIconTintList;
        int i2 = this.setX;
        this.setX = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        setIconTintList();
        setViewCacheExtension.setIconTintList(collection);
        if (!(collection instanceof setExpandedTitleMarginTop)) {
            return super.addAll(collection);
        }
        setExpandedTitleMarginTop setexpandedtitlemargintop = (setExpandedTitleMarginTop) collection;
        int i = setexpandedtitlemargintop.setX;
        if (i == 0) {
            return false;
        }
        int i2 = this.setX;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.setIconTintList;
        if (i3 > dArr.length) {
            this.setIconTintList = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(setexpandedtitlemargintop.setIconTintList, 0, this.setIconTintList, this.setX, setexpandedtitlemargintop.setX);
        this.setX = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        setIconTintList();
        for (int i = 0; i < this.setX; i++) {
            if (obj.equals(Double.valueOf(this.setIconTintList[i]))) {
                double[] dArr = this.setIconTintList;
                System.arraycopy(dArr, i + 1, dArr, i, (this.setX - i) - 1);
                this.setX--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    private String MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.setX);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        if (i >= 0 && i < this.setX) {
            return Double.valueOf(this.setIconTintList[i]);
        }
        throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda0(i));
    }

    @Override // o.setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1
    public final /* synthetic */ setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1 setX(int i) {
        if (i < this.setX) {
            throw new IllegalArgumentException();
        }
        return new setExpandedTitleMarginTop(Arrays.copyOf(this.setIconTintList, i), this.setX);
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        setIconTintList();
        if (i >= 0 && i < (i2 = this.setX)) {
            double[] dArr = this.setIconTintList;
            double d = dArr[i];
            if (i < i2 - 1) {
                System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
            }
            this.setX--;
            ((AbstractList) this).modCount++;
            return Double.valueOf(d);
        }
        throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda0(i));
    }
}