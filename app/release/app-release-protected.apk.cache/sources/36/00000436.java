package o;

import java.util.concurrent.TimeUnit;

/* renamed from: o.ey  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144ey {
    public TimeUnit MenuHostHelper$$ExternalSyntheticLambda0;
    public long MenuHostHelper$$ExternalSyntheticLambda1;
    public long setX;

    public C0144ey(long j, long j2, TimeUnit timeUnit) {
        this.setX = j;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = j2;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = timeUnit;
    }

    /* renamed from: o.ey$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda0;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            MenuHostHelper$$ExternalSyntheticLambda0 = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}