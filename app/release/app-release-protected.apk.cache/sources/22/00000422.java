package o;

import android.content.Context;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.ej  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129ej {
    final cW MenuHostHelper$$ExternalSyntheticLambda0;
    setIconTintList MenuHostHelper$$ExternalSyntheticLambda1;
    final double setIconTintList;
    private boolean setUiOptions;
    final double setX;
    setIconTintList setY;

    public C0129ej(Context context, C0144ey c0144ey) {
        this(c0144ey, 500L, new C0135ep(), new Random().nextDouble(), new Random().nextDouble(), cW.setY());
        this.setUiOptions = eB.setX(context);
    }

    private C0129ej(C0144ey c0144ey, long j, C0135ep c0135ep, double d, double d2, cW cWVar) {
        this.setY = null;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        boolean z = false;
        this.setUiOptions = false;
        if (!(0.0d <= d && d < 1.0d)) {
            throw new IllegalArgumentException("Sampling bucket ID should be in range [0.0, 1.0).");
        }
        if (0.0d <= d2 && d2 < 1.0d) {
            z = true;
        }
        if (z) {
            this.setIconTintList = d;
            this.setX = d2;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = cWVar;
            this.setY = new setIconTintList(c0144ey, 500L, c0135ep, cWVar, "Trace", this.setUiOptions);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new setIconTintList(c0144ey, 500L, c0135ep, cWVar, "Network", this.setUiOptions);
            return;
        }
        throw new IllegalArgumentException("Fragment sampling bucket ID should be in range [0.0, 1.0).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setX(List<eX> list) {
        if (list.size() <= 0 || list.get(0).sessionVerbosity_.size() <= 0) {
            return false;
        }
        eU x = eU.setX(list.get(0).sessionVerbosity_.MenuHostHelper$$ExternalSyntheticLambda0(0));
        if (x == null) {
            x = eU.SESSION_VERBOSITY_NONE;
        }
        return x == eU.GAUGES_AND_SYSTEM_EVENTS;
    }

    /* renamed from: o.ej$setIconTintList */
    /* loaded from: classes.dex */
    static class setIconTintList {
        private static final C0106dm MenuHostHelper$$ExternalSyntheticLambda1 = C0106dm.setY();
        private static final long setY = TimeUnit.SECONDS.toMicros(1);
        private C0144ey MenuHostHelper$$ExternalSyntheticLambda0;
        private double setChipCornerRadius;
        private long setIconTintList;
        private final C0135ep setLayoutAnimation;
        private long setNavigationOnClickListener;
        private eA setOnLongClickListener = new eA();
        private C0144ey setTextAlignment;
        private final boolean setUiOptions;
        private C0144ey setUnboundedRipple;
        private long setX;

        setIconTintList(C0144ey c0144ey, long j, C0135ep c0135ep, cW cWVar, String str, boolean z) {
            long onLongClickListener;
            long navigationOnClickListener;
            this.setLayoutAnimation = c0135ep;
            this.setX = j;
            this.setTextAlignment = c0144ey;
            this.setChipCornerRadius = j;
            long layoutAnimation = cWVar.setLayoutAnimation();
            if (str == "Trace") {
                onLongClickListener = cWVar.setZ();
            } else {
                onLongClickListener = cWVar.setOnLongClickListener();
            }
            long j2 = onLongClickListener;
            C0144ey c0144ey2 = new C0144ey(j2, layoutAnimation, TimeUnit.SECONDS);
            this.setUnboundedRipple = c0144ey2;
            this.setNavigationOnClickListener = j2;
            if (z) {
                C0106dm c0106dm = MenuHostHelper$$ExternalSyntheticLambda1;
                Object[] objArr = {str, c0144ey2, Long.valueOf(j2)};
                if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                    Cdo.setIconTintList(String.format(Locale.ENGLISH, "Foreground %s logging rate:%f, burst capacity:%d", objArr));
                }
            }
            long layoutAnimation2 = cWVar.setLayoutAnimation();
            if (str == "Trace") {
                navigationOnClickListener = cWVar.setMaxEms();
            } else {
                navigationOnClickListener = cWVar.setNavigationOnClickListener();
            }
            C0144ey c0144ey3 = new C0144ey(navigationOnClickListener, layoutAnimation2, TimeUnit.SECONDS);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = c0144ey3;
            this.setIconTintList = navigationOnClickListener;
            if (z) {
                C0106dm c0106dm2 = MenuHostHelper$$ExternalSyntheticLambda1;
                Object[] objArr2 = {str, c0144ey3, Long.valueOf(navigationOnClickListener)};
                if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
                    Cdo.setIconTintList(String.format(Locale.ENGLISH, "Background %s logging rate:%f, capacity:%d", objArr2));
                }
            }
            this.setUiOptions = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void setX(boolean z) {
            synchronized (this) {
                this.setTextAlignment = z ? this.setUnboundedRipple : this.MenuHostHelper$$ExternalSyntheticLambda0;
                this.setX = z ? this.setNavigationOnClickListener : this.setIconTintList;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006c A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0025, B:14:0x0060, B:16:0x006c, B:17:0x007a, B:19:0x0082, B:22:0x0087, B:24:0x008b, B:26:0x0093, B:10:0x0033, B:12:0x004e, B:11:0x0041, B:13:0x0052), top: B:33:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0025, B:14:0x0060, B:16:0x006c, B:17:0x007a, B:19:0x0082, B:22:0x0087, B:24:0x008b, B:26:0x0093, B:10:0x0033, B:12:0x004e, B:11:0x0041, B:13:0x0052), top: B:33:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0087 A[Catch: all -> 0x009b, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0025, B:14:0x0060, B:16:0x006c, B:17:0x007a, B:19:0x0082, B:22:0x0087, B:24:0x008b, B:26:0x0093, B:10:0x0033, B:12:0x004e, B:11:0x0041, B:13:0x0052), top: B:33:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean setIconTintList() {
            /*
                r10 = this;
                monitor-enter(r10)
                o.eA r0 = new o.eA     // Catch: java.lang.Throwable -> L9b
                r0.<init>()     // Catch: java.lang.Throwable -> L9b
                o.eA r1 = r10.setOnLongClickListener     // Catch: java.lang.Throwable -> L9b
                long r2 = r0.setX     // Catch: java.lang.Throwable -> L9b
                long r4 = r1.setX     // Catch: java.lang.Throwable -> L9b
                long r2 = r2 - r4
                double r1 = (double) r2     // Catch: java.lang.Throwable -> L9b
                o.ey r3 = r10.setTextAlignment     // Catch: java.lang.Throwable -> L9b
                int[] r4 = o.C0144ey.AnonymousClass2.MenuHostHelper$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L9b
                java.util.concurrent.TimeUnit r5 = r3.MenuHostHelper$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L9b
                int r5 = r5.ordinal()     // Catch: java.lang.Throwable -> L9b
                r4 = r4[r5]     // Catch: java.lang.Throwable -> L9b
                r5 = 1
                r6 = 1
                if (r4 == r5) goto L52
                r8 = 2
                if (r4 == r8) goto L41
                r8 = 3
                if (r4 == r8) goto L33
                long r6 = r3.setX     // Catch: java.lang.Throwable -> L9b
                double r6 = (double) r6     // Catch: java.lang.Throwable -> L9b
                java.util.concurrent.TimeUnit r4 = r3.MenuHostHelper$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L9b
                long r8 = r3.MenuHostHelper$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L9b
                long r3 = r4.toSeconds(r8)     // Catch: java.lang.Throwable -> L9b
                double r3 = (double) r3     // Catch: java.lang.Throwable -> L9b
                double r6 = r6 / r3
                goto L60
            L33:
                long r8 = r3.setX     // Catch: java.lang.Throwable -> L9b
                double r8 = (double) r8     // Catch: java.lang.Throwable -> L9b
                long r3 = r3.MenuHostHelper$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L9b
                double r3 = (double) r3     // Catch: java.lang.Throwable -> L9b
                double r8 = r8 / r3
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L9b
                long r3 = r3.toMillis(r6)     // Catch: java.lang.Throwable -> L9b
                goto L4e
            L41:
                long r8 = r3.setX     // Catch: java.lang.Throwable -> L9b
                double r8 = (double) r8     // Catch: java.lang.Throwable -> L9b
                long r3 = r3.MenuHostHelper$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L9b
                double r3 = (double) r3     // Catch: java.lang.Throwable -> L9b
                double r8 = r8 / r3
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L9b
                long r3 = r3.toMicros(r6)     // Catch: java.lang.Throwable -> L9b
            L4e:
                double r3 = (double) r3     // Catch: java.lang.Throwable -> L9b
                double r6 = r8 * r3
                goto L60
            L52:
                long r8 = r3.setX     // Catch: java.lang.Throwable -> L9b
                double r8 = (double) r8     // Catch: java.lang.Throwable -> L9b
                long r3 = r3.MenuHostHelper$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L9b
                double r3 = (double) r3     // Catch: java.lang.Throwable -> L9b
                double r8 = r8 / r3
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L9b
                long r3 = r3.toNanos(r6)     // Catch: java.lang.Throwable -> L9b
                goto L4e
            L60:
                double r1 = r1 * r6
                long r3 = o.C0129ej.setIconTintList.setY     // Catch: java.lang.Throwable -> L9b
                double r3 = (double) r3     // Catch: java.lang.Throwable -> L9b
                double r1 = r1 / r3
                r3 = 0
                int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r6 <= 0) goto L7a
                double r3 = r10.setChipCornerRadius     // Catch: java.lang.Throwable -> L9b
                double r3 = r3 + r1
                long r1 = r10.setX     // Catch: java.lang.Throwable -> L9b
                double r1 = (double) r1     // Catch: java.lang.Throwable -> L9b
                double r1 = java.lang.Math.min(r3, r1)     // Catch: java.lang.Throwable -> L9b
                r10.setChipCornerRadius = r1     // Catch: java.lang.Throwable -> L9b
                r10.setOnLongClickListener = r0     // Catch: java.lang.Throwable -> L9b
            L7a:
                double r0 = r10.setChipCornerRadius     // Catch: java.lang.Throwable -> L9b
                r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L87
                double r0 = r0 - r2
                r10.setChipCornerRadius = r0     // Catch: java.lang.Throwable -> L9b
                monitor-exit(r10)
                return r5
            L87:
                boolean r0 = r10.setUiOptions     // Catch: java.lang.Throwable -> L9b
                if (r0 == 0) goto L98
                o.dm r0 = o.C0129ej.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L9b
                java.lang.String r1 = "Exceeded log rate limit, dropping the log."
                boolean r2 = r0.MenuHostHelper$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L9b
                if (r2 == 0) goto L98
                o.do r0 = r0.MenuHostHelper$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L9b
                o.Cdo.setX(r1)     // Catch: java.lang.Throwable -> L9b
            L98:
                monitor-exit(r10)
                r0 = 0
                return r0
            L9b:
                r0 = move-exception
                monitor-exit(r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0129ej.setIconTintList.setIconTintList():boolean");
        }
    }
}