package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import o.C0603xp;
import o.wB;

/* loaded from: classes.dex */
public final class wF {
    private static byte[] setAnimationFromJson = {123, 85, -72, 69, -16, 5, 2, 15, -7, -4, 34, -18, -8, 15, 6, -1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -36, -18, -8, 15, 6, -1};
    public static final int setCenterIfNoTextEnabled = 142;
    IOException MenuHostHelper$$ExternalSyntheticLambda0;
    public final int MenuHostHelper$$ExternalSyntheticLambda1;
    final setIconTintList ViewPager$SavedState$1;
    private boolean setChipCornerRadius;
    private EnumC0584wx setIconSize;
    long setIconTintList;
    final setY setLayoutAnimation;
    long setNavigationOnClickListener;
    final setIconTintList setOnLongClickListener;
    private final ArrayDeque<C0557vz> setTextAlignment;
    final wF$MenuHostHelper$$ExternalSyntheticLambda1 setUiOptions;
    long setUnboundedRipple;
    public final wB setX;
    long setY;

    static {
        new wF$MenuHostHelper$$ExternalSyntheticLambda0((byte) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.wF.setAnimationFromJson
            int r7 = r7 * 3
            int r7 = r7 + 13
            int r6 = r6 * 12
            int r6 = r6 + 4
            int r8 = r8 * 7
            int r8 = r8 + 99
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r8
            r3 = 0
            r8 = r7
            goto L2e
        L19:
            r3 = 0
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r7 = r7 - r4
            int r7 = r7 + 2
            int r6 = r6 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wF.a(short, int, int, java.lang.Object[]):void");
    }

    public wF(int i, wB wBVar, boolean z, boolean z2, C0557vz c0557vz) {
        pN.setY(wBVar, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        this.setX = wBVar;
        wH wHVar = wBVar.ViewPager$SavedState$1;
        this.setUnboundedRipple = (wHVar.MenuHostHelper$$ExternalSyntheticLambda0 & 128) != 0 ? wHVar.setY[7] : 65535;
        ArrayDeque<C0557vz> arrayDeque = new ArrayDeque<>();
        this.setTextAlignment = arrayDeque;
        wH wHVar2 = wBVar.setChipCornerRadius;
        this.setLayoutAnimation = new setY((wHVar2.MenuHostHelper$$ExternalSyntheticLambda0 & 128) != 0 ? wHVar2.setY[7] : 65535, z2);
        this.setUiOptions = new wF$MenuHostHelper$$ExternalSyntheticLambda1(this, z);
        this.setOnLongClickListener = new setIconTintList();
        this.ViewPager$SavedState$1 = new setIconTintList();
        if (c0557vz != null) {
            if (!(!MenuHostHelper$$ExternalSyntheticLambda0())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(c0557vz);
        } else if (!MenuHostHelper$$ExternalSyntheticLambda0()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final EnumC0584wx setY() {
        EnumC0584wx enumC0584wx;
        synchronized (this) {
            enumC0584wx = this.setIconSize;
        }
        return enumC0584wx;
    }

    public final boolean setUnboundedRipple() {
        synchronized (this) {
            if (this.setIconSize != null) {
                return false;
            }
            if ((this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1 || this.setLayoutAnimation.setY) && (this.setUiOptions.setY || this.setUiOptions.setX)) {
                if (this.setChipCornerRadius) {
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setX.setIconTintList == ((this.MenuHostHelper$$ExternalSyntheticLambda1 & 1) == 1);
    }

    public final C0557vz setNavigationOnClickListener() {
        boolean z;
        C0557vz c0557vz;
        synchronized (this) {
            this.setOnLongClickListener.setIconTintList();
            while (true) {
                z = false;
                if (!this.setTextAlignment.isEmpty() || this.setIconSize != null) {
                    break;
                }
                setLayoutAnimation();
            }
            setIconTintList seticontintlist = this.setOnLongClickListener;
            if (((C0603xp) seticontintlist).setIconTintList) {
                ((C0603xp) seticontintlist).setIconTintList = false;
                C0603xp.setX setx = C0603xp.setX;
                z = C0603xp.setX.setY(seticontintlist);
            }
            if (!z) {
                if (!this.setTextAlignment.isEmpty()) {
                    C0557vz removeFirst = this.setTextAlignment.removeFirst();
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) removeFirst, "");
                    c0557vz = removeFirst;
                } else {
                    IOException iOException = this.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (iOException == null) {
                        EnumC0584wx enumC0584wx = this.setIconSize;
                        pN.setX(enumC0584wx);
                        iOException = new wJ(enumC0584wx);
                    }
                    throw iOException;
                }
            } else {
                throw new SocketTimeoutException("timeout");
            }
        }
        return c0557vz;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0019, B:16:0x0026), top: B:20:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0019 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0019, B:16:0x0026), top: B:20:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.xK setX() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.setChipCornerRadius     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto Le
            boolean r0 = r2.MenuHostHelper$$ExternalSyntheticLambda0()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            if (r0 == 0) goto L19
            o.nX r0 = o.nX.setX     // Catch: java.lang.Throwable -> L27
            monitor-exit(r2)
            o.wF$MenuHostHelper$$ExternalSyntheticLambda1 r0 = r2.setUiOptions
            o.xK r0 = (o.xK) r0
            return r0
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "reply before requesting the sink"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L27
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L27
        L27:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wF.setX():o.xK");
    }

    public final void setX(EnumC0584wx enumC0584wx, IOException iOException) {
        pN.setY(enumC0584wx, "");
        if (MenuHostHelper$$ExternalSyntheticLambda1(enumC0584wx, iOException)) {
            wB wBVar = this.setX;
            int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
            pN.setY(enumC0584wx, "");
            wBVar.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda0(i, enumC0584wx);
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(EnumC0584wx enumC0584wx) {
        synchronized (this) {
            pN.setY(enumC0584wx, "");
            if (this.setIconSize == null) {
                this.setIconSize = enumC0584wx;
                notifyAll();
            }
        }
    }

    /* loaded from: classes.dex */
    public final class setY implements xJ {
        public static final int setLayoutAnimation = 117;
        boolean MenuHostHelper$$ExternalSyntheticLambda1;
        final long setX;
        boolean setY;
        final C0602xo setIconTintList = new C0602xo();
        final C0602xo MenuHostHelper$$ExternalSyntheticLambda0 = new C0602xo();

        public setY(long j, boolean z) {
            this.setX = j;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b4 A[Catch: all -> 0x0117, TryCatch #1 {, blocks: (B:9:0x001b, B:35:0x00aa, B:40:0x00be, B:52:0x00e0, B:53:0x00eb, B:38:0x00b4, B:10:0x0022, B:12:0x002a, B:14:0x0030, B:15:0x0040, B:17:0x0044, B:19:0x004c, B:21:0x006a, B:23:0x0076, B:25:0x007f, B:27:0x0086, B:28:0x0098, B:31:0x009e, B:54:0x00ec, B:55:0x00f5), top: B:70:0x001b }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00be A[Catch: all -> 0x0117, TRY_LEAVE, TryCatch #1 {, blocks: (B:9:0x001b, B:35:0x00aa, B:40:0x00be, B:52:0x00e0, B:53:0x00eb, B:38:0x00b4, B:10:0x0022, B:12:0x002a, B:14:0x0030, B:15:0x0040, B:17:0x0044, B:19:0x004c, B:21:0x006a, B:23:0x0076, B:25:0x007f, B:27:0x0086, B:28:0x0098, B:31:0x009e, B:54:0x00ec, B:55:0x00f5), top: B:70:0x001b }] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x00e0 A[SYNTHETIC] */
        @Override // o.xJ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long setY(o.C0602xo r17, long r18) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.wF.setY.setY(o.xo, long):long");
        }

        @Override // o.xJ
        public final xI setX() {
            return wF.this.setOnLongClickListener;
        }

        @Override // o.xJ, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j;
            synchronized (wF.this) {
                this.setY = true;
                j = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
                C0602xo c0602xo = this.MenuHostHelper$$ExternalSyntheticLambda0;
                c0602xo.setOnLongClickListener(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0);
                wF wFVar = wF.this;
                if (wFVar != null) {
                    wFVar.notifyAll();
                    nX nXVar = nX.setX;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (j > 0) {
                boolean z = vL.MenuHostHelper$$ExternalSyntheticLambda0;
                wF.this.setX.setIconTintList(j);
            }
            wF.this.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public final void setIconTintList() {
        if (this.setUiOptions.setX) {
            throw new IOException("stream closed");
        }
        if (this.setUiOptions.setY) {
            throw new IOException("stream finished");
        }
        EnumC0584wx enumC0584wx = this.setIconSize;
        if (enumC0584wx != null) {
            Throwable th = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (th == null) {
                pN.setX(enumC0584wx);
                th = new wJ(enumC0584wx);
            }
            throw th;
        }
    }

    /* loaded from: classes.dex */
    public final class setIconTintList extends C0603xp {
        public setIconTintList() {
        }

        @Override // o.C0603xp
        public final void setY() {
            wF wFVar = wF.this;
            EnumC0584wx enumC0584wx = EnumC0584wx.CANCEL;
            pN.setY(enumC0584wx, "");
            if (wFVar.MenuHostHelper$$ExternalSyntheticLambda1(enumC0584wx, (IOException) null)) {
                wFVar.setX.setX(wFVar.MenuHostHelper$$ExternalSyntheticLambda1, enumC0584wx);
            }
            wB wBVar = wF.this.setX;
            synchronized (wBVar) {
                long j = wBVar.setLayoutAnimation;
                long j2 = wBVar.setX;
                if (j < j2) {
                    return;
                }
                wBVar.setX = j2 + 1;
                wBVar.setOnLongClickListener = System.nanoTime() + 1000000000;
                nX nXVar = nX.setX;
                vW vWVar = wBVar.setAnimationFromJson;
                StringBuilder sb = new StringBuilder();
                sb.append(wBVar.setY);
                sb.append(" ping");
                String obj = sb.toString();
                vWVar.setX(new wB.setUnboundedRipple(obj, obj, wBVar), 0L);
            }
        }

        @Override // o.C0603xp
        public final IOException setIconTintList(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(EnumC0584wx enumC0584wx, IOException iOException) {
        boolean z = vL.MenuHostHelper$$ExternalSyntheticLambda0;
        synchronized (this) {
            if (this.setIconSize != null) {
                return false;
            }
            if (this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1 && this.setUiOptions.setY) {
                return false;
            }
            this.setIconSize = enumC0584wx;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = iOException;
            notifyAll();
            nX nXVar = nX.setX;
            this.setX.setY(this.MenuHostHelper$$ExternalSyntheticLambda1);
            return true;
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(C0557vz c0557vz, boolean z) {
        boolean unboundedRipple;
        pN.setY(c0557vz, "");
        boolean z2 = vL.MenuHostHelper$$ExternalSyntheticLambda0;
        synchronized (this) {
            if (!this.setChipCornerRadius || !z) {
                this.setChipCornerRadius = true;
                this.setTextAlignment.add(c0557vz);
            }
            if (z) {
                this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            }
            unboundedRipple = setUnboundedRipple();
            notifyAll();
            nX nXVar = nX.setX;
        }
        if (unboundedRipple) {
            return;
        }
        this.setX.setY(this.MenuHostHelper$$ExternalSyntheticLambda1);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        boolean z;
        boolean unboundedRipple;
        boolean z2 = vL.MenuHostHelper$$ExternalSyntheticLambda0;
        synchronized (this) {
            z = !this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1 && this.setLayoutAnimation.setY && (this.setUiOptions.setY || this.setUiOptions.setX);
            unboundedRipple = setUnboundedRipple();
            nX nXVar = nX.setX;
        }
        if (!z) {
            if (unboundedRipple) {
                return;
            }
            this.setX.setY(this.MenuHostHelper$$ExternalSyntheticLambda1);
            return;
        }
        EnumC0584wx enumC0584wx = EnumC0584wx.CANCEL;
        pN.setY(enumC0584wx, "");
        if (MenuHostHelper$$ExternalSyntheticLambda1(enumC0584wx, (IOException) null)) {
            wB wBVar = this.setX;
            int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
            pN.setY(enumC0584wx, "");
            wBVar.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda0(i, enumC0584wx);
        }
    }

    public final void setLayoutAnimation() {
        try {
            try {
                wait();
            } catch (InterruptedException unused) {
                byte b = (byte) (-setAnimationFromJson[15]);
                byte b2 = b;
                Object[] objArr = new Object[1];
                a(b, b2, b2, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                byte b3 = (byte) (setAnimationFromJson[15] + 1);
                byte b4 = b3;
                Object[] objArr2 = new Object[1];
                a(b3, b4, b4, objArr2);
                ((Thread) cls.getMethod((String) objArr2[0], null).invoke(null, null)).interrupt();
                throw new InterruptedIOException();
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}