package o;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: o.uv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525uv<T> {
    public volatile AtomicReferenceArray<T> array;

    public C0525uv(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final void setIconTintList(int i, T t) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, t);
            return;
        }
        int i2 = i + 1;
        int i3 = length << 1;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, t);
        this.array = atomicReferenceArray2;
    }
}