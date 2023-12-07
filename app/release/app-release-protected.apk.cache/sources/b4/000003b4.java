package o;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class dT {
    private final String setOnLongClickListener;
    final long setX;
    static final C0106dm setY = C0106dm.setY();
    private static final long setLayoutAnimation = TimeUnit.SECONDS.toMicros(1);
    ScheduledFuture MenuHostHelper$$ExternalSyntheticLambda1 = null;
    long MenuHostHelper$$ExternalSyntheticLambda0 = -1;
    public final ConcurrentLinkedQueue<eK> setUiOptions = new ConcurrentLinkedQueue<>();
    final ScheduledExecutorService setIconTintList = Executors.newSingleThreadScheduledExecutor();

    public static boolean MenuHostHelper$$ExternalSyntheticLambda1(long j) {
        return j <= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public dT() {
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder("/proc/");
        sb.append(Integer.toString(myPid));
        sb.append("/stat");
        this.setOnLongClickListener = sb.toString();
        this.setX = Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(long j, final eA eAVar) {
        synchronized (this) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = j;
            try {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = this.setIconTintList.scheduleAtFixedRate(new Runnable() { // from class: o.dU
                    @Override // java.lang.Runnable
                    public final void run() {
                        dT dTVar = dT.this;
                        eK MenuHostHelper$$ExternalSyntheticLambda0 = dTVar.MenuHostHelper$$ExternalSyntheticLambda0(eAVar);
                        if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                            dTVar.setUiOptions.add(MenuHostHelper$$ExternalSyntheticLambda0);
                        }
                    }
                }, 0L, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                C0106dm c0106dm = setY;
                StringBuilder sb = new StringBuilder("Unable to start collecting Cpu Metrics: ");
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
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.eK MenuHostHelper$$ExternalSyntheticLambda0(o.eA r13) {
        /*
            r12 = this;
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.NullPointerException -> L89 java.lang.NumberFormatException -> L8b java.lang.ArrayIndexOutOfBoundsException -> L8d java.io.IOException -> Lac
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.NullPointerException -> L89 java.lang.NumberFormatException -> L8b java.lang.ArrayIndexOutOfBoundsException -> L8d java.io.IOException -> Lac
            java.lang.String r3 = r12.setOnLongClickListener     // Catch: java.lang.NullPointerException -> L89 java.lang.NumberFormatException -> L8b java.lang.ArrayIndexOutOfBoundsException -> L8d java.io.IOException -> Lac
            r2.<init>(r3)     // Catch: java.lang.NullPointerException -> L89 java.lang.NumberFormatException -> L8b java.lang.ArrayIndexOutOfBoundsException -> L8d java.io.IOException -> Lac
            r1.<init>(r2)     // Catch: java.lang.NullPointerException -> L89 java.lang.NumberFormatException -> L8b java.lang.ArrayIndexOutOfBoundsException -> L8d java.io.IOException -> Lac
            long r2 = r13.MenuHostHelper$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L7f
            o.eA r4 = new o.eA     // Catch: java.lang.Throwable -> L7f
            r4.<init>()     // Catch: java.lang.Throwable -> L7f
            long r4 = r4.setX     // Catch: java.lang.Throwable -> L7f
            long r6 = r13.setX     // Catch: java.lang.Throwable -> L7f
            long r4 = r4 - r6
            long r2 = r2 + r4
            java.lang.String r13 = r1.readLine()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r4 = " "
            java.lang.String[] r13 = r13.split(r4)     // Catch: java.lang.Throwable -> L7f
            r4 = 13
            r4 = r13[r4]     // Catch: java.lang.Throwable -> L7f
            long r4 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Throwable -> L7f
            r6 = 15
            r6 = r13[r6]     // Catch: java.lang.Throwable -> L7f
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.Throwable -> L7f
            r8 = 14
            r8 = r13[r8]     // Catch: java.lang.Throwable -> L7f
            long r8 = java.lang.Long.parseLong(r8)     // Catch: java.lang.Throwable -> L7f
            r10 = 16
            r13 = r13[r10]     // Catch: java.lang.Throwable -> L7f
            long r10 = java.lang.Long.parseLong(r13)     // Catch: java.lang.Throwable -> L7f
            o.eK$setIconTintList r13 = o.eK.setY()     // Catch: java.lang.Throwable -> L7f
            o.eK$setIconTintList r13 = r13.setX(r2)     // Catch: java.lang.Throwable -> L7f
            long r8 = r8 + r10
            double r2 = (double) r8     // Catch: java.lang.Throwable -> L7f
            long r8 = r12.setX     // Catch: java.lang.Throwable -> L7f
            double r8 = (double) r8     // Catch: java.lang.Throwable -> L7f
            double r2 = r2 / r8
            long r8 = o.dT.setLayoutAnimation     // Catch: java.lang.Throwable -> L7f
            double r8 = (double) r8     // Catch: java.lang.Throwable -> L7f
            double r2 = r2 * r8
            long r2 = java.lang.Math.round(r2)     // Catch: java.lang.Throwable -> L7f
            o.eK$setIconTintList r13 = r13.MenuHostHelper$$ExternalSyntheticLambda0(r2)     // Catch: java.lang.Throwable -> L7f
            long r4 = r4 + r6
            double r2 = (double) r4     // Catch: java.lang.Throwable -> L7f
            long r4 = r12.setX     // Catch: java.lang.Throwable -> L7f
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L7f
            double r2 = r2 / r4
            long r4 = o.dT.setLayoutAnimation     // Catch: java.lang.Throwable -> L7f
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L7f
            double r2 = r2 * r4
            long r2 = java.lang.Math.round(r2)     // Catch: java.lang.Throwable -> L7f
            o.eK$setIconTintList r13 = r13.MenuHostHelper$$ExternalSyntheticLambda1(r2)     // Catch: java.lang.Throwable -> L7f
            o.il r13 = r13.ViewPager$SavedState$1()     // Catch: java.lang.Throwable -> L7f
            o.eK r13 = (o.eK) r13     // Catch: java.lang.Throwable -> L7f
            r1.close()     // Catch: java.lang.NullPointerException -> L89 java.lang.NumberFormatException -> L8b java.lang.ArrayIndexOutOfBoundsException -> L8d java.io.IOException -> Lac
            return r13
        L7f:
            r13 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L84
            goto L88
        L84:
            r1 = move-exception
            r13.addSuppressed(r1)     // Catch: java.lang.NullPointerException -> L89 java.lang.NumberFormatException -> L8b java.lang.ArrayIndexOutOfBoundsException -> L8d java.io.IOException -> Lac
        L88:
            throw r13     // Catch: java.lang.NullPointerException -> L89 java.lang.NumberFormatException -> L8b java.lang.ArrayIndexOutOfBoundsException -> L8d java.io.IOException -> Lac
        L89:
            r13 = move-exception
            goto L8e
        L8b:
            r13 = move-exception
            goto L8e
        L8d:
            r13 = move-exception
        L8e:
            o.dm r1 = o.dT.setY
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected '/proc/[pid]/stat' file format encountered: "
            r2.<init>(r3)
            java.lang.String r13 = r13.getMessage()
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            boolean r2 = r1.MenuHostHelper$$ExternalSyntheticLambda0
            if (r2 == 0) goto Lca
            o.do r1 = r1.MenuHostHelper$$ExternalSyntheticLambda1
            o.Cdo.setX(r13)
            goto Lca
        Lac:
            r13 = move-exception
            o.dm r1 = o.dT.setY
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to read 'proc/[pid]/stat' file: "
            r2.<init>(r3)
            java.lang.String r13 = r13.getMessage()
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            boolean r2 = r1.MenuHostHelper$$ExternalSyntheticLambda0
            if (r2 == 0) goto Lca
            o.do r1 = r1.MenuHostHelper$$ExternalSyntheticLambda1
            o.Cdo.setX(r13)
        Lca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dT.MenuHostHelper$$ExternalSyntheticLambda0(o.eA):o.eK");
    }
}