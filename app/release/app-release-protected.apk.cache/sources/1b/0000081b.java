package o;

/* renamed from: o.pa  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0367pa {
    public static final int MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2, int i3) {
        int i4 = i % i3;
        if (i4 < 0) {
            i4 += i3;
        }
        int i5 = i2 % i3;
        if (i5 < 0) {
            i5 += i3;
        }
        int i6 = (i4 - i5) % i3;
        return i6 < 0 ? i6 + i3 : i6;
    }

    public static final long setY(long j, long j2, long j3) {
        long j4 = j % j3;
        if (j4 < 0) {
            j4 += j3;
        }
        long j5 = j2 % j3;
        if (j5 < 0) {
            j5 += j3;
        }
        long j6 = (j4 - j5) % j3;
        return j6 < 0 ? j6 + j3 : j6;
    }
}