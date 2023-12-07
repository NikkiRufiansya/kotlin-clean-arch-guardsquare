package o;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class sE extends CancellationException implements rK<sE> {
    private static byte[] setIconTintList = {86, 48, -68, 79, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 31, -21, 0, 6, -25, 28, -19, 0, 0, -34, 37, -9, 6, -10, 7, 4};
    public static final int setX = 41;
    private transient sB MenuHostHelper$$ExternalSyntheticLambda1;

    public sE(String str, Throwable th, sB sBVar) {
        super(str);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = sBVar;
        if (th != null) {
            initCause(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004f -> B:15:0x0054). Please submit an issue!!! */
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
            byte[] r0 = o.sE.setIconTintList
            r1 = 16
            r2 = r0[r1]
            byte r2 = (byte) r2
            int r3 = r2 + (-1)
            byte r3 = (byte) r3
            r1 = r0[r1]
            byte r1 = (byte) r1
            int r2 = r2 * 2
            int r2 = r2 + 106
            int r1 = r1 * 2
            int r1 = r1 + 27
            int r3 = r3 + 4
            byte[] r4 = new byte[r1]
            int r1 = r1 + (-1)
            r5 = 0
            r7 = r10
            if (r0 != 0) goto L2e
            r6 = r2
            r8 = 0
            r2 = r1
            goto L54
        L2e:
            r6 = 0
        L2f:
            byte r8 = (byte) r2
            r4[r6] = r8
            int r3 = r3 + 1
            int r8 = r6 + 1
            if (r6 != r1) goto L4f
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r5)
            java.lang.Class r0 = java.lang.Class.forName(r0)
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r5)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.StackTraceElement[] r0 = (java.lang.StackTraceElement[]) r0
            r7.setStackTrace(r0)
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            return r7
        L4f:
            r6 = r0[r3]
            r9 = r2
            r2 = r1
            r1 = r9
        L54:
            int r1 = r1 + r6
            int r1 = r1 + 2
            r6 = r8
            r9 = r2
            r2 = r1
            r1 = r9
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sE.fillInStackTrace():java.lang.Throwable");
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof sE) {
                sE sEVar = (sE) obj;
                if (!pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) sEVar.getMessage(), (Object) getMessage()) || !pN.MenuHostHelper$$ExternalSyntheticLambda0(sEVar.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda1) || !pN.MenuHostHelper$$ExternalSyntheticLambda0(sEVar.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String message = getMessage();
        pN.setX((Object) message);
        int hashCode = message.hashCode();
        int hashCode2 = this.MenuHostHelper$$ExternalSyntheticLambda1.hashCode();
        Throwable cause = getCause();
        return (((hashCode * 31) + hashCode2) * 31) + (cause != null ? cause.hashCode() : 0);
    }

    @Override // o.rK
    public final /* synthetic */ sE MenuHostHelper$$ExternalSyntheticLambda0() {
        sE sEVar;
        if (rX.setX()) {
            String message = getMessage();
            pN.setX((Object) message);
            sEVar = new sE(message, this, this.MenuHostHelper$$ExternalSyntheticLambda1);
        } else {
            sEVar = null;
        }
        return sEVar;
    }
}