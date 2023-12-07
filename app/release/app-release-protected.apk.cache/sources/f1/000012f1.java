package o;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class xI {
    public static final xI MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean setIconTintList;
    private long setX;
    private long setY;
    private static byte[] MenuHostHelper$$ExternalSyntheticLambda0 = {36, -25, -14, -85, 16, -5, -2, -15, 7, 4, -34, 18, 8, -15, -6, 1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1};
    public static final int setNavigationOnClickListener = 36;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 12
            int r7 = r7 + 4
            int r6 = r6 * 7
            int r6 = r6 + 99
            int r8 = r8 * 3
            int r8 = 16 - r8
            byte[] r0 = o.xI.MenuHostHelper$$ExternalSyntheticLambda0
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L1c
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L36
        L1c:
            r3 = 0
        L1d:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L36:
            int r6 = r6 + r7
            int r7 = r8 + 1
            int r6 = r6 + 2
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.xI.f(byte, byte, byte, java.lang.Object[]):void");
    }

    public xI setY(long j, TimeUnit timeUnit) {
        pN.setY(timeUnit, "");
        if (!(j >= 0)) {
            StringBuilder sb = new StringBuilder("timeout < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        this.setX = timeUnit.toNanos(j);
        return this;
    }

    public long setLayoutAnimation() {
        return this.setX;
    }

    public boolean w_() {
        return this.setIconTintList;
    }

    public long v_() {
        if (!this.setIconTintList) {
            throw new IllegalStateException("No deadline".toString());
        }
        return this.setY;
    }

    public xI setX(long j) {
        this.setIconTintList = true;
        this.setY = j;
        return this;
    }

    public xI u_() {
        this.setX = 0L;
        return this;
    }

    public xI t_() {
        this.setIconTintList = false;
        return this;
    }

    public void setOnLongClickListener() {
        if (Thread.interrupted()) {
            try {
                byte b = MenuHostHelper$$ExternalSyntheticLambda0[15];
                byte b2 = b;
                Object[] objArr = new Object[1];
                f(b, b2, (byte) (b2 - 1), objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                byte b3 = (byte) (MenuHostHelper$$ExternalSyntheticLambda0[15] - 1);
                Object[] objArr2 = new Object[1];
                f(b3, b3, MenuHostHelper$$ExternalSyntheticLambda0[15], objArr2);
                ((Thread) cls.getMethod((String) objArr2[0], null).invoke(null, null)).interrupt();
                throw new InterruptedIOException("interrupted");
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } else if (this.setIconTintList && this.setY - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* loaded from: classes.dex */
    public static final class setY {
        private setY() {
        }

        public /* synthetic */ setY(byte b) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList extends xI {
        @Override // o.xI
        public final void setOnLongClickListener() {
        }

        setIconTintList() {
        }

        @Override // o.xI
        public final xI setY(long j, TimeUnit timeUnit) {
            pN.setY(timeUnit, "");
            return this;
        }

        @Override // o.xI
        public final xI setX(long j) {
            return this;
        }
    }

    static {
        new setY((byte) 0);
        MenuHostHelper$$ExternalSyntheticLambda1 = new setIconTintList();
    }
}