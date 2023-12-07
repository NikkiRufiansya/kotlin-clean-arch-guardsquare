package o;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: o.we  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0564we {
    public static final int setX = 185;
    final ConcurrentLinkedQueue<C0563wd> MenuHostHelper$$ExternalSyntheticLambda0;
    private final long MenuHostHelper$$ExternalSyntheticLambda1;
    final setX setIconTintList;
    private final int setOnLongClickListener;
    final vW setY;

    static {
        new setIconTintList((byte) 0);
    }

    public C0564we(vV vVVar, int i, long j, TimeUnit timeUnit) {
        pN.setY(vVVar, "");
        pN.setY(timeUnit, "");
        this.setOnLongClickListener = 5;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = timeUnit.toNanos(5L);
        this.setY = vVVar.MenuHostHelper$$ExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        sb.append(vL.setNavigationOnClickListener);
        sb.append(" ConnectionPool");
        this.setIconTintList = new setX(sb.toString());
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new ConcurrentLinkedQueue<>();
    }

    /* renamed from: o.we$setX */
    /* loaded from: classes.dex */
    public static final class setX extends vR {
        setX(String str) {
            super(str);
        }

        @Override // o.vR
        public final long MenuHostHelper$$ExternalSyntheticLambda1() {
            return C0564we.this.setY(System.nanoTime());
        }
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(C0532vb c0532vb, vZ vZVar, List<vG> list, boolean z) {
        pN.setY(c0532vb, "");
        pN.setY(vZVar, "");
        Iterator<C0563wd> it = this.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            C0563wd next = it.next();
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) next, "");
            synchronized (next) {
                if (z) {
                    if (!(next.setY != null)) {
                        nX nXVar = nX.setX;
                    }
                }
                if (next.setIconTintList(c0532vb, list)) {
                    vZVar.MenuHostHelper$$ExternalSyntheticLambda1(next);
                    return true;
                }
                nX nXVar2 = nX.setX;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
        if (r9 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        r6 = r6 + 1;
        r9 = r16 - r8.MenuHostHelper$$ExternalSyntheticLambda0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
        if (r9 <= r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
        r3 = o.nX.setX;
        r3 = r8;
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
        r9 = o.nX.setX;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long setY(long r16) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0564we.setY(long):long");
    }

    /* renamed from: o.we$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList {
        private setIconTintList() {
        }

        public /* synthetic */ setIconTintList(byte b) {
            this();
        }
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(C0563wd c0563wd) {
        pN.setY(c0563wd, "");
        boolean z = vL.MenuHostHelper$$ExternalSyntheticLambda0;
        if (!c0563wd.setLayoutAnimation && this.setOnLongClickListener != 0) {
            this.setY.setX(this.setIconTintList, 0L);
            return false;
        }
        c0563wd.setLayoutAnimation = true;
        this.MenuHostHelper$$ExternalSyntheticLambda0.remove(c0563wd);
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.isEmpty()) {
            this.setY.setY();
            return true;
        }
        return true;
    }
}