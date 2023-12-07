package o;

import java.util.RandomAccess;

/* loaded from: classes.dex */
final class oa$MenuHostHelper$$ExternalSyntheticLambda1<E> extends AbstractC0340oa<E> implements RandomAccess {
    private final int MenuHostHelper$$ExternalSyntheticLambda0;
    private final AbstractC0340oa<E> MenuHostHelper$$ExternalSyntheticLambda1;
    private int setIconTintList;

    /* JADX WARN: Multi-variable type inference failed */
    public oa$MenuHostHelper$$ExternalSyntheticLambda1(AbstractC0340oa<? extends E> abstractC0340oa, int i, int i2) {
        pN.setY(abstractC0340oa, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = abstractC0340oa;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        int size = abstractC0340oa.size();
        if (i < 0 || i2 > size) {
            StringBuilder sb = new StringBuilder("fromIndex: ");
            sb.append(i);
            sb.append(", toIndex: ");
            sb.append(i2);
            sb.append(", size: ");
            sb.append(size);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i <= i2) {
            this.setIconTintList = i2 - i;
        } else {
            StringBuilder sb2 = new StringBuilder("fromIndex: ");
            sb2.append(i);
            sb2.append(" > toIndex: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    @Override // o.AbstractC0340oa, java.util.List
    public final E get(int i) {
        int i2 = this.setIconTintList;
        if (i >= 0 && i < i2) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1.get(this.MenuHostHelper$$ExternalSyntheticLambda0 + i);
        }
        StringBuilder sb = new StringBuilder("index: ");
        sb.append(i);
        sb.append(", size: ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // o.nW
    public final int setY() {
        return this.setIconTintList;
    }
}