package o;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.eH;

/* renamed from: o.ee  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124ee {
    static final C0106dm setX = C0106dm.setY();
    ScheduledFuture MenuHostHelper$$ExternalSyntheticLambda0;
    long MenuHostHelper$$ExternalSyntheticLambda1;
    final ScheduledExecutorService setIconTintList;
    private final Runtime setLayoutAnimation;
    public final ConcurrentLinkedQueue<eH> setY;

    public static boolean setIconTintList(long j) {
        return j <= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0124ee() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    private C0124ee(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1L;
        this.setIconTintList = scheduledExecutorService;
        this.setY = new ConcurrentLinkedQueue<>();
        this.setLayoutAnimation = runtime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(long j, final eA eAVar) {
        synchronized (this) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = j;
            try {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = this.setIconTintList.scheduleAtFixedRate(new Runnable() { // from class: o.ec
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0124ee c0124ee = C0124ee.this;
                        eH iconTintList = c0124ee.setIconTintList(eAVar);
                        if (iconTintList != null) {
                            c0124ee.setY.add(iconTintList);
                        }
                    }
                }, 0L, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                C0106dm c0106dm = setX;
                StringBuilder sb = new StringBuilder("Unable to start collecting Memory Metrics: ");
                sb.append(e.getMessage());
                String obj = sb.toString();
                if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                    Cdo.setX(obj);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final eH setIconTintList(eA eAVar) {
        if (eAVar == null) {
            return null;
        }
        eH.setIconTintList MenuHostHelper$$ExternalSyntheticLambda0 = eH.setX().MenuHostHelper$$ExternalSyntheticLambda0(eAVar.MenuHostHelper$$ExternalSyntheticLambda0 + (new eA().setX - eAVar.setX));
        long freeMemory = ((this.setLayoutAnimation.totalMemory() - this.setLayoutAnimation.freeMemory()) * EnumC0145ez.BYTES.MenuHostHelper$$ExternalSyntheticLambda0) / EnumC0145ez.KILOBYTES.MenuHostHelper$$ExternalSyntheticLambda0;
        return MenuHostHelper$$ExternalSyntheticLambda0.setX(freeMemory > 2147483647L ? Integer.MAX_VALUE : freeMemory < -2147483648L ? Integer.MIN_VALUE : (int) freeMemory).ViewPager$SavedState$1();
    }
}