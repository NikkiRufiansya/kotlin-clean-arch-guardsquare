package o;

import java.util.NoSuchElementException;

/* renamed from: o.qm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0406qm extends AbstractC0360ou {
    private long MenuHostHelper$$ExternalSyntheticLambda0;
    private final long MenuHostHelper$$ExternalSyntheticLambda1;
    private final long setIconTintList;
    private boolean setY;

    public C0406qm(long j, long j2, long j3) {
        this.setIconTintList = j3;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = j2;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        boolean z = j3 <= 0 ? i >= 0 : i <= 0;
        this.setY = z;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.setY;
    }

    @Override // o.AbstractC0360ou
    public final long MenuHostHelper$$ExternalSyntheticLambda1() {
        long j = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (j == this.MenuHostHelper$$ExternalSyntheticLambda1) {
            if (!this.setY) {
                throw new NoSuchElementException();
            }
            this.setY = false;
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = this.setIconTintList + j;
        }
        return j;
    }
}