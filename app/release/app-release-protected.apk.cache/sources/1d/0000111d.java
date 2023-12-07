package o;

import java.util.concurrent.locks.LockSupport;

/* renamed from: o.sq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0464sq extends AbstractC0463sp {
    private static byte[] setY = {95, 98, 60, -42, -16, 5, 2, 15, -7, -4, 34, -18, -8, 15, 6, -1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -36, -18, -8, 15, 6, -1};
    public static final int setNavigationOnClickListener = 35;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 7
            int r8 = r8 + 99
            int r6 = r6 * 12
            int r6 = 15 - r6
            byte[] r0 = o.AbstractC0464sq.setY
            int r7 = r7 * 3
            int r7 = 16 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L18
            r8 = r7
            r4 = r8
            r3 = 0
            r7 = r6
            goto L30
        L18:
            r3 = 0
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L30:
            int r6 = r6 - r4
            int r6 = r6 + 2
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC0464sq.f(byte, short, byte, java.lang.Object[]):void");
    }

    protected abstract Thread setY();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setLayoutAnimation() {
        Thread y = setY();
        try {
            byte b = (byte) (setY[15] + 1);
            Object[] objArr = new Object[1];
            f(b, b, (byte) (-setY[15]), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = (byte) (-setY[15]);
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            f(b2, b3, (byte) (b3 - 1), objArr2);
            if (cls.getMethod((String) objArr2[0], null).invoke(null, null) != y) {
                LockSupport.unpark(y);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setIconTintList(long j, so$MenuHostHelper$$ExternalSyntheticLambda1 so_menuhosthelper__externalsyntheticlambda1) {
        RunnableC0449sb.setY.MenuHostHelper$$ExternalSyntheticLambda0(j, so_menuhosthelper__externalsyntheticlambda1);
    }
}