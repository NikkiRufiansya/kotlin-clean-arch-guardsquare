package o;

/* renamed from: o.uk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0514uk extends rQ implements Runnable, InterfaceC0453sf {
    private final int MenuHostHelper$$ExternalSyntheticLambda1;
    private volatile int runningWorkers;
    private final Object setLayoutAnimation;
    private final C0517un<Runnable> setUiOptions;
    private final /* synthetic */ InterfaceC0453sf setX;
    private final rQ setY;

    public RunnableC0514uk(rQ rQVar, int i) {
        this.setY = rQVar;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        InterfaceC0453sf interfaceC0453sf = rQVar instanceof InterfaceC0453sf ? (InterfaceC0453sf) rQVar : null;
        this.setX = interfaceC0453sf == null ? rY.MenuHostHelper$$ExternalSyntheticLambda1 : interfaceC0453sf;
        this.setUiOptions = new C0517un<>();
        this.setLayoutAnimation = new Object();
    }

    @Override // o.rQ
    public final rQ setIconTintList(int i) {
        C0512ui.setX(i);
        return i >= this.MenuHostHelper$$ExternalSyntheticLambda1 ? this : super.setIconTintList(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        r0 = r7.setLayoutAnimation;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        r7.runningWorkers--;
        r1 = ((o.C0521ur) r7.setUiOptions._cur)._state;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (((((int) ((r1 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & r1))) & 1073741823) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        r7.runningWorkers++;
        r1 = o.nX.setX;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
        L0:
            r0 = 0
        L1:
            o.un<java.lang.Runnable> r1 = r7.setUiOptions
            java.lang.Object r1 = r1.MenuHostHelper$$ExternalSyntheticLambda1()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L31
            r1.run()     // Catch: java.lang.Throwable -> Lf
            goto L17
        Lf:
            r1 = move-exception
            o.oL r2 = o.oL.setX
            o.oM r2 = (o.oM) r2
            o.rP.setIconTintList(r2, r1)
        L17:
            int r0 = r0 + 1
            r1 = 16
            if (r0 < r1) goto L1
            o.rQ r1 = r7.setY
            r2 = r7
            o.oM r2 = (o.oM) r2
            boolean r1 = r1.MenuHostHelper$$ExternalSyntheticLambda0(r2)
            if (r1 == 0) goto L1
            o.rQ r0 = r7.setY
            r1 = r7
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.setY(r2, r1)
            return
        L31:
            java.lang.Object r0 = r7.setLayoutAnimation
            monitor-enter(r0)
            int r1 = r7.runningWorkers     // Catch: java.lang.Throwable -> L65
            int r1 = r1 + (-1)
            r7.runningWorkers = r1     // Catch: java.lang.Throwable -> L65
            o.un<java.lang.Runnable> r1 = r7.setUiOptions     // Catch: java.lang.Throwable -> L65
            java.lang.Object r1 = r1._cur     // Catch: java.lang.Throwable -> L65
            o.ur r1 = (o.C0521ur) r1     // Catch: java.lang.Throwable -> L65
            long r1 = r1._state     // Catch: java.lang.Throwable -> L65
            r3 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r3 = r3 & r1
            int r4 = (int) r3
            r3 = 1073741823(0x3fffffff, float:1.9999999)
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r1 = r1 & r5
            r5 = 30
            long r1 = r1 >> r5
            int r2 = (int) r1
            int r2 = r2 - r4
            r1 = r2 & r3
            if (r1 != 0) goto L5b
            monitor-exit(r0)
            return
        L5b:
            int r1 = r7.runningWorkers     // Catch: java.lang.Throwable -> L65
            int r1 = r1 + 1
            r7.runningWorkers = r1     // Catch: java.lang.Throwable -> L65
            o.nX r1 = o.nX.setX     // Catch: java.lang.Throwable -> L65
            monitor-exit(r0)
            goto L0
        L65:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RunnableC0514uk.run():void");
    }

    private final boolean setY() {
        synchronized (this.setLayoutAnimation) {
            if (this.runningWorkers >= this.MenuHostHelper$$ExternalSyntheticLambda1) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    @Override // o.rQ
    public final void setY(oM oMVar, Runnable runnable) {
        this.setUiOptions.setX(runnable);
        if ((this.runningWorkers >= this.MenuHostHelper$$ExternalSyntheticLambda1) || !setY()) {
            return;
        }
        this.setY.setY(this, this);
    }
}