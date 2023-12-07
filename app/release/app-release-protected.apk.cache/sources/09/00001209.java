package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class vV {
    public static final vV MenuHostHelper$$ExternalSyntheticLambda1;
    private static final Logger setIconTintList;
    private final Runnable setIconSize;
    private boolean setLayoutAnimation;
    private long setNavigationOnClickListener;
    private final List<vW> setOnLongClickListener;
    private final List<vW> setUiOptions;
    private int setUnboundedRipple;
    final vV$MenuHostHelper$$ExternalSyntheticLambda0 setY;
    private static byte[] setCenterIfNoTextEnabled = {25, 108, 7, 61, 16, -5, -2, -15, 7, 4, -34, 18, 8, -15, -6, 1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1};
    public static final int MenuHostHelper$$ExternalSyntheticLambda0 = 235;
    public static final setIconTintList setX = new setIconTintList((byte) 0);

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 7
            int r8 = 106 - r8
            int r9 = r9 + 4
            int r7 = r7 * 3
            int r7 = 16 - r7
            byte[] r0 = o.vV.setCenterIfNoTextEnabled
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L18
            r8 = r7
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L34
        L18:
            r3 = 0
        L19:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r9]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r6
        L34:
            int r9 = r9 + r7
            int r7 = r9 + 2
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.vV.a(byte, byte, int, java.lang.Object[]):void");
    }

    private vV(vV$MenuHostHelper$$ExternalSyntheticLambda0 vv_menuhosthelper__externalsyntheticlambda0) {
        pN.setY(vv_menuhosthelper__externalsyntheticlambda0, "");
        this.setY = vv_menuhosthelper__externalsyntheticlambda0;
        this.setUnboundedRipple = 10000;
        this.setUiOptions = new ArrayList();
        this.setOnLongClickListener = new ArrayList();
        this.setIconSize = new setX();
    }

    /* loaded from: classes.dex */
    public static final class setX implements Runnable {
        setX() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            vR x;
            long j;
            while (true) {
                synchronized (vV.this) {
                    x = vV.this.setX();
                }
                if (x == null) {
                    return;
                }
                vW vWVar = x.MenuHostHelper$$ExternalSyntheticLambda1;
                pN.setX(vWVar);
                setIconTintList seticontintlist = vV.setX;
                boolean isLoggable = vV.setIconTintList.isLoggable(Level.FINE);
                if (isLoggable) {
                    j = vWVar.setUiOptions.setY.setY();
                    vY.setIconTintList(x, vWVar, "starting");
                } else {
                    j = -1;
                }
                try {
                    vV.setX(vV.this, x);
                    nX nXVar = nX.setX;
                    if (isLoggable) {
                        long y = vWVar.setUiOptions.setY.setY();
                        StringBuilder sb = new StringBuilder("finished run in ");
                        sb.append(vY.MenuHostHelper$$ExternalSyntheticLambda1(y - j));
                        vY.setIconTintList(x, vWVar, sb.toString());
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        long y2 = vWVar.setUiOptions.setY.setY();
                        StringBuilder sb2 = new StringBuilder("failed a run in ");
                        sb2.append(vY.MenuHostHelper$$ExternalSyntheticLambda1(y2 - j));
                        vY.setIconTintList(x, vWVar, sb2.toString());
                    }
                    throw th;
                }
            }
        }
    }

    public final vW MenuHostHelper$$ExternalSyntheticLambda0() {
        int i;
        synchronized (this) {
            i = this.setUnboundedRipple;
            this.setUnboundedRipple = i + 1;
        }
        StringBuilder sb = new StringBuilder("Q");
        sb.append(i);
        return new vW(this, sb.toString());
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList {
        private setIconTintList() {
        }

        public /* synthetic */ setIconTintList(byte b) {
            this();
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(vL.setNavigationOnClickListener);
        sb.append(" TaskRunner");
        MenuHostHelper$$ExternalSyntheticLambda1 = new vV(new vV$MenuHostHelper$$ExternalSyntheticLambda0(vL.setIconTintList(sb.toString(), true)) { // from class: o.vV$MenuHostHelper$$ExternalSyntheticLambda1
            private final ThreadPoolExecutor MenuHostHelper$$ExternalSyntheticLambda1;

            {
                pN.setY(r10, "");
                this.MenuHostHelper$$ExternalSyntheticLambda1 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), r10);
            }

            @Override // o.vV$MenuHostHelper$$ExternalSyntheticLambda0
            public final long setY() {
                return System.nanoTime();
            }

            @Override // o.vV$MenuHostHelper$$ExternalSyntheticLambda0
            public final void setX(vV vVVar, long j) {
                pN.setY(vVVar, "");
                long j2 = j / 1000000;
                if (j2 > 0 || j > 0) {
                    vVVar.wait(j2, (int) (j - (1000000 * j2)));
                }
            }

            @Override // o.vV$MenuHostHelper$$ExternalSyntheticLambda0
            public final void setY(Runnable runnable) {
                pN.setY(runnable, "");
                this.MenuHostHelper$$ExternalSyntheticLambda1.execute(runnable);
            }

            @Override // o.vV$MenuHostHelper$$ExternalSyntheticLambda0
            public final void MenuHostHelper$$ExternalSyntheticLambda1(vV vVVar) {
                pN.setY(vVVar, "");
                vVVar.notify();
            }
        });
        Logger logger = Logger.getLogger(vV.class.getName());
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) logger, "");
        setIconTintList = logger;
    }

    public final void setIconTintList(vW vWVar) {
        pN.setY(vWVar, "");
        boolean z = vL.MenuHostHelper$$ExternalSyntheticLambda0;
        if (vWVar.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            if (!vWVar.MenuHostHelper$$ExternalSyntheticLambda1.isEmpty()) {
                vL.MenuHostHelper$$ExternalSyntheticLambda0(this.setOnLongClickListener, vWVar);
            } else {
                this.setOnLongClickListener.remove(vWVar);
            }
        }
        if (this.setLayoutAnimation) {
            this.setY.MenuHostHelper$$ExternalSyntheticLambda1(this);
        } else {
            this.setY.setY(this.setIconSize);
        }
    }

    private final void MenuHostHelper$$ExternalSyntheticLambda1(vR vRVar, long j) {
        boolean z = vL.MenuHostHelper$$ExternalSyntheticLambda0;
        vW vWVar = vRVar.MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setX(vWVar);
        if (!(vWVar.MenuHostHelper$$ExternalSyntheticLambda0 == vRVar)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean z2 = vWVar.setY;
        vWVar.setY = false;
        vWVar.MenuHostHelper$$ExternalSyntheticLambda0 = null;
        this.setUiOptions.remove(vWVar);
        if (j != -1 && !z2 && !vWVar.setIconTintList) {
            vWVar.setX(vRVar, j, true);
        }
        if (!vWVar.MenuHostHelper$$ExternalSyntheticLambda1.isEmpty()) {
            this.setOnLongClickListener.add(vWVar);
        }
    }

    public final vR setX() {
        boolean z;
        boolean z2 = vL.MenuHostHelper$$ExternalSyntheticLambda0;
        while (!this.setOnLongClickListener.isEmpty()) {
            long y = this.setY.setY();
            Iterator<vW> it = this.setOnLongClickListener.iterator();
            long j = Long.MAX_VALUE;
            vR vRVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                vR vRVar2 = it.next().MenuHostHelper$$ExternalSyntheticLambda1.get(0);
                long max = Math.max(0L, vRVar2.setY - y);
                if (max > 0) {
                    j = Math.min(max, j);
                } else if (vRVar != null) {
                    z = true;
                    break;
                } else {
                    vRVar = vRVar2;
                }
            }
            if (vRVar == null) {
                if (this.setLayoutAnimation) {
                    if (j < this.setNavigationOnClickListener - y) {
                        this.setY.MenuHostHelper$$ExternalSyntheticLambda1(this);
                    }
                    return null;
                }
                this.setLayoutAnimation = true;
                this.setNavigationOnClickListener = y + j;
                try {
                    try {
                        this.setY.setX(this, j);
                    } catch (InterruptedException unused) {
                        for (int size = this.setUiOptions.size() - 1; size >= 0; size--) {
                            this.setUiOptions.get(size).MenuHostHelper$$ExternalSyntheticLambda0();
                        }
                        for (int size2 = this.setOnLongClickListener.size() - 1; size2 >= 0; size2--) {
                            vW vWVar = this.setOnLongClickListener.get(size2);
                            vWVar.MenuHostHelper$$ExternalSyntheticLambda0();
                            if (vWVar.MenuHostHelper$$ExternalSyntheticLambda1.isEmpty()) {
                                this.setOnLongClickListener.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.setLayoutAnimation = false;
                }
            } else {
                boolean z3 = vL.MenuHostHelper$$ExternalSyntheticLambda0;
                vRVar.setY = -1L;
                vW vWVar2 = vRVar.MenuHostHelper$$ExternalSyntheticLambda1;
                pN.setX(vWVar2);
                vWVar2.MenuHostHelper$$ExternalSyntheticLambda1.remove(vRVar);
                this.setOnLongClickListener.remove(vWVar2);
                vWVar2.MenuHostHelper$$ExternalSyntheticLambda0 = vRVar;
                this.setUiOptions.add(vWVar2);
                if (z || (!this.setLayoutAnimation && (!this.setOnLongClickListener.isEmpty()))) {
                    this.setY.setY(this.setIconSize);
                }
                return vRVar;
            }
        }
        return null;
    }

    public static final /* synthetic */ void setX(vV vVVar, vR vRVar) {
        boolean z = vL.MenuHostHelper$$ExternalSyntheticLambda0;
        try {
            byte b = (byte) (setCenterIfNoTextEnabled[15] - 1);
            Object[] objArr = new Object[1];
            a(b, b, setCenterIfNoTextEnabled[22], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = setCenterIfNoTextEnabled[15];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (-b3), objArr2);
            Thread thread = (Thread) cls.getMethod((String) objArr2[0], null).invoke(null, null);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) thread, "");
            String name = thread.getName();
            thread.setName(vRVar.setIconTintList);
            try {
                long MenuHostHelper$$ExternalSyntheticLambda12 = vRVar.MenuHostHelper$$ExternalSyntheticLambda1();
                synchronized (vVVar) {
                    vVVar.MenuHostHelper$$ExternalSyntheticLambda1(vRVar, MenuHostHelper$$ExternalSyntheticLambda12);
                    nX nXVar = nX.setX;
                }
                thread.setName(name);
            } catch (Throwable th) {
                synchronized (vVVar) {
                    vVVar.MenuHostHelper$$ExternalSyntheticLambda1(vRVar, -1L);
                    nX nXVar2 = nX.setX;
                    thread.setName(name);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}