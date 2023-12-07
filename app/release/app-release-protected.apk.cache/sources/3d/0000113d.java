package o;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class tN extends CancellationException {
    private static byte[] MenuHostHelper$$ExternalSyntheticLambda0 = {112, 91, -28, 61, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 31, -21, 0, 6, -25, 28, -19, 0, 0, -34, 37, -9, 6, -10, 7, 4};
    public static final int setY = 67;
    public final transient InterfaceC0498tx<?> MenuHostHelper$$ExternalSyntheticLambda1;

    public tN(InterfaceC0498tx<?> interfaceC0498tx) {
        super("Flow was aborted, no more elements needed");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = interfaceC0498tx;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004b -> B:15:0x0052). Please submit an issue!!! */
    @Override // java.lang.Throwable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Throwable fillInStackTrace() {
        /*
            r10 = this;
            boolean r0 = o.rX.setX()
            if (r0 == 0) goto Lb
            java.lang.Throwable r0 = super.fillInStackTrace()
            return r0
        Lb:
            byte[] r0 = o.tN.MenuHostHelper$$ExternalSyntheticLambda0
            r1 = 16
            r1 = r0[r1]
            byte r1 = (byte) r1
            byte r2 = (byte) r1
            byte r3 = (byte) r2
            int r1 = r1 * 4
            int r1 = 3 - r1
            int r2 = r2 * 2
            int r2 = r2 + 106
            int r3 = r3 * 3
            int r3 = r3 + 27
            byte[] r4 = new byte[r3]
            int r3 = r3 + (-1)
            r5 = 0
            r7 = r10
            if (r0 != 0) goto L2c
            r8 = r2
            r6 = 0
            r2 = r1
            goto L52
        L2c:
            r6 = 0
        L2d:
            int r1 = r1 + 1
            byte r8 = (byte) r2
            r4[r6] = r8
            if (r6 != r3) goto L4b
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r5)
            java.lang.Class r0 = java.lang.Class.forName(r0)
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r5)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.StackTraceElement[] r0 = (java.lang.StackTraceElement[]) r0
            r7.setStackTrace(r0)
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            return r7
        L4b:
            int r6 = r6 + 1
            r8 = r0[r1]
            r9 = r2
            r2 = r1
            r1 = r9
        L52:
            int r1 = r1 + r8
            int r1 = r1 + 2
            r9 = r2
            r2 = r1
            r1 = r9
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tN.fillInStackTrace():java.lang.Throwable");
    }
}