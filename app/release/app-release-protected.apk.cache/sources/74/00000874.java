package o;

import java.util.NoSuchElementException;

/* renamed from: o.qo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408qo extends AbstractC0364oy {
    private boolean MenuHostHelper$$ExternalSyntheticLambda0;
    private int MenuHostHelper$$ExternalSyntheticLambda1;
    private final int setIconTintList;
    private final int setX;

    public C0408qo(int i, int i2, int i3) {
        this.setIconTintList = i3;
        this.setX = i2;
        boolean z = i3 <= 0 ? i >= i2 : i <= i2;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = z;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.AbstractC0364oy
    public final int setY() {
        int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (i == this.setX) {
            if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
                throw new NoSuchElementException();
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = this.setIconTintList + i;
        }
        return i;
    }
}