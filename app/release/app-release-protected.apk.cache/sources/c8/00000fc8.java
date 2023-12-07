package o;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class setStaticLayoutBuilderConfigurer extends setDataDirectorySuffix<Float> implements setHelperTextTextAppearance, RandomAccess, setAutofillId {
    private int MenuHostHelper$$ExternalSyntheticLambda0;
    private float[] setIconTintList;

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        setIconTintList();
        if (i < 0 || i > (i2 = this.MenuHostHelper$$ExternalSyntheticLambda0)) {
            throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda1(i));
        }
        float[] fArr = this.setIconTintList;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.setIconTintList, i, fArr2, i + 1, this.MenuHostHelper$$ExternalSyntheticLambda0 - i);
            this.setIconTintList = fArr2;
        }
        this.setIconTintList[i] = floatValue;
        this.MenuHostHelper$$ExternalSyntheticLambda0++;
        ((AbstractList) this).modCount++;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        setX(((Float) obj).floatValue());
        return true;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        setIconTintList();
        if (i >= 0 && i < this.MenuHostHelper$$ExternalSyntheticLambda0) {
            float[] fArr = this.setIconTintList;
            float f = fArr[i];
            fArr[i] = floatValue;
            return Float.valueOf(f);
        }
        throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda1(i));
    }

    static {
        new setStaticLayoutBuilderConfigurer(new float[0], 0).setX();
    }

    setStaticLayoutBuilderConfigurer() {
        this(new float[10], 0);
    }

    private setStaticLayoutBuilderConfigurer(float[] fArr, int i) {
        this.setIconTintList = fArr;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        setIconTintList();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.setIconTintList;
        System.arraycopy(fArr, i2, fArr, i, this.MenuHostHelper$$ExternalSyntheticLambda0 - i2);
        this.MenuHostHelper$$ExternalSyntheticLambda0 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setStaticLayoutBuilderConfigurer)) {
            return super.equals(obj);
        }
        setStaticLayoutBuilderConfigurer setstaticlayoutbuilderconfigurer = (setStaticLayoutBuilderConfigurer) obj;
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 != setstaticlayoutbuilderconfigurer.MenuHostHelper$$ExternalSyntheticLambda0) {
            return false;
        }
        float[] fArr = setstaticlayoutbuilderconfigurer.setIconTintList;
        for (int i = 0; i < this.MenuHostHelper$$ExternalSyntheticLambda0; i++) {
            if (Float.floatToIntBits(this.setIconTintList[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.MenuHostHelper$$ExternalSyntheticLambda0; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.setIconTintList[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    public final void setX(float f) {
        setIconTintList();
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        float[] fArr = this.setIconTintList;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.setIconTintList = fArr2;
        }
        float[] fArr3 = this.setIconTintList;
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        setIconTintList();
        setViewCacheExtension.setIconTintList(collection);
        if (!(collection instanceof setStaticLayoutBuilderConfigurer)) {
            return super.addAll(collection);
        }
        setStaticLayoutBuilderConfigurer setstaticlayoutbuilderconfigurer = (setStaticLayoutBuilderConfigurer) collection;
        int i = setstaticlayoutbuilderconfigurer.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i == 0) {
            return false;
        }
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.setIconTintList;
        if (i3 > fArr.length) {
            this.setIconTintList = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(setstaticlayoutbuilderconfigurer.setIconTintList, 0, this.setIconTintList, this.MenuHostHelper$$ExternalSyntheticLambda0, setstaticlayoutbuilderconfigurer.MenuHostHelper$$ExternalSyntheticLambda0);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        setIconTintList();
        for (int i = 0; i < this.MenuHostHelper$$ExternalSyntheticLambda0; i++) {
            if (obj.equals(Float.valueOf(this.setIconTintList[i]))) {
                float[] fArr = this.setIconTintList;
                System.arraycopy(fArr, i + 1, fArr, i, (this.MenuHostHelper$$ExternalSyntheticLambda0 - i) - 1);
                this.MenuHostHelper$$ExternalSyntheticLambda0--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    private String MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        StringBuilder sb = new StringBuilder("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        if (i >= 0 && i < this.MenuHostHelper$$ExternalSyntheticLambda0) {
            return Float.valueOf(this.setIconTintList[i]);
        }
        throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda1(i));
    }

    @Override // o.setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1
    public final /* synthetic */ setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1 setX(int i) {
        if (i < this.MenuHostHelper$$ExternalSyntheticLambda0) {
            throw new IllegalArgumentException();
        }
        return new setStaticLayoutBuilderConfigurer(Arrays.copyOf(this.setIconTintList, i), this.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        setIconTintList();
        if (i >= 0 && i < (i2 = this.MenuHostHelper$$ExternalSyntheticLambda0)) {
            float[] fArr = this.setIconTintList;
            float f = fArr[i];
            if (i < i2 - 1) {
                System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0--;
            ((AbstractList) this).modCount++;
            return Float.valueOf(f);
        }
        throw new IndexOutOfBoundsException(MenuHostHelper$$ExternalSyntheticLambda1(i));
    }
}