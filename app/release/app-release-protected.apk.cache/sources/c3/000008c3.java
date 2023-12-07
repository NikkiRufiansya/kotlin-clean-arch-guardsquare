package o;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.rm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433rm<T> extends AbstractC0430rj<T> {
    private static byte[] setUiOptions = {61, 16, -46, 32, -16, 5, 2, 15, -7, -4, 34, -18, -8, 15, 6, -1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -36, -18, -8, 15, 6, -1};
    public static final int setY = 64;
    private final AbstractC0463sp MenuHostHelper$$ExternalSyntheticLambda0;
    private final Thread setX;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 12
            int r9 = r9 + 4
            byte[] r0 = o.C0433rm.setUiOptions
            int r8 = r8 * 3
            int r8 = 16 - r8
            int r7 = r7 * 7
            int r7 = r7 + 99
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L1c
            r7 = r8
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L37
        L1c:
            r3 = 0
        L1d:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2c
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2c:
            r3 = r0[r9]
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L37:
            int r9 = -r9
            int r10 = r10 + 1
            int r8 = r8 + r9
            int r8 = r8 + 2
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0433rm.a(short, byte, short, java.lang.Object[]):void");
    }

    @Override // o.sK
    protected final boolean r_() {
        return true;
    }

    public C0433rm(oM oMVar, Thread thread, AbstractC0463sp abstractC0463sp) {
        super(oMVar, true);
        this.setX = thread;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = abstractC0463sp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.sK
    public final void setIconTintList(Object obj) {
        try {
            byte b = (byte) (-setUiOptions[15]);
            Object[] objArr = new Object[1];
            a(b, (byte) (b - 1), (byte) (-setUiOptions[15]), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = (byte) (-setUiOptions[15]);
            Object[] objArr2 = new Object[1];
            a((byte) (setUiOptions[15] + 1), b2, (byte) (b2 - 1), objArr2);
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0(cls.getMethod((String) objArr2[0], null).invoke(null, null), this.setX)) {
                return;
            }
            LockSupport.unpark(this.setX);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final T MenuHostHelper$$ExternalSyntheticLambda1() {
        Object obj;
        Object obj2;
        AbstractC0463sp abstractC0463sp = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (abstractC0463sp != null) {
            AbstractC0463sp.MenuHostHelper$$ExternalSyntheticLambda1(abstractC0463sp);
        }
        while (!Thread.interrupted()) {
            AbstractC0463sp abstractC0463sp2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            long MenuHostHelper$$ExternalSyntheticLambda0 = abstractC0463sp2 != null ? abstractC0463sp2.MenuHostHelper$$ExternalSyntheticLambda0() : Long.MAX_VALUE;
            while (true) {
                obj = this._state;
                if (!(obj instanceof AbstractC0524uu)) {
                    break;
                }
                ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
            if (!(!(obj instanceof InterfaceC0470sw))) {
                LockSupport.parkNanos(this, MenuHostHelper$$ExternalSyntheticLambda0);
            } else {
                AbstractC0463sp abstractC0463sp3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (abstractC0463sp3 != null) {
                    abstractC0463sp3.setY(false);
                }
                while (true) {
                    obj2 = this._state;
                    if (!(obj2 instanceof AbstractC0524uu)) {
                        break;
                    }
                    ((AbstractC0524uu) obj2).MenuHostHelper$$ExternalSyntheticLambda1(this);
                }
                T t = (T) sG.MenuHostHelper$$ExternalSyntheticLambda0(obj2);
                rD rDVar = t instanceof rD ? (rD) t : null;
                if (rDVar == null) {
                    return t;
                }
                throw rDVar.MenuHostHelper$$ExternalSyntheticLambda1;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        setX((Object) interruptedException);
        throw interruptedException;
    }
}