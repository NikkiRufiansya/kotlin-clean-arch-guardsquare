package o;

import java.lang.Thread;
import java.util.List;
import java.util.ServiceLoader;
import o.nR;

/* loaded from: classes.dex */
public final class rN {
    private static byte[] MenuHostHelper$$ExternalSyntheticLambda1 = {95, 85, -94, 50, 16, -5, -2, -15, 7, 4, -34, 18, 8, -15, -6, 1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1};
    public static final int setY = 200;
    private static final List<kotlinx.coroutines.CoroutineExceptionHandler> MenuHostHelper$$ExternalSyntheticLambda0 = qI.setIconTintList(qI.MenuHostHelper$$ExternalSyntheticLambda1(ServiceLoader.load(kotlinx.coroutines.CoroutineExceptionHandler.class, kotlinx.coroutines.CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002b -> B:23:0x0033). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 7
            int r6 = 106 - r6
            int r7 = r7 * 3
            int r7 = r7 + 13
            byte[] r0 = o.rN.MenuHostHelper$$ExternalSyntheticLambda1
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L33
        L19:
            r3 = 0
        L1a:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r0[r8]
            r5 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L33:
            int r6 = r6 + r8
            int r6 = r6 + 2
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.rN.a(int, short, short, java.lang.Object[]):void");
    }

    public static final void MenuHostHelper$$ExternalSyntheticLambda0(oM oMVar, Throwable th) {
        RuntimeException runtimeException;
        for (kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler : MenuHostHelper$$ExternalSyntheticLambda0) {
            try {
                coroutineExceptionHandler.handleException(oMVar, th);
            } catch (Throwable th2) {
                try {
                    Object[] objArr = new Object[1];
                    a((byte) (MenuHostHelper$$ExternalSyntheticLambda1[15] - 1), MenuHostHelper$$ExternalSyntheticLambda1[15], MenuHostHelper$$ExternalSyntheticLambda1[22], objArr);
                    Class<?> cls = Class.forName((String) objArr[0]);
                    byte b = MenuHostHelper$$ExternalSyntheticLambda1[15];
                    Object[] objArr2 = new Object[1];
                    a(b, (byte) (b - 1), (byte) (-MenuHostHelper$$ExternalSyntheticLambda1[15]), objArr2);
                    Thread thread = (Thread) cls.getMethod((String) objArr2[0], null).invoke(null, null);
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
                    if (th == th2) {
                        runtimeException = th;
                    } else {
                        runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                        pN.setY((Object) runtimeException, "");
                        pN.setY((Object) th, "");
                        if (runtimeException != th) {
                            C0369pc.setX.setX(runtimeException, th);
                        }
                    }
                    uncaughtExceptionHandler.uncaughtException(thread, runtimeException);
                } catch (Throwable th3) {
                    Throwable cause = th3.getCause();
                    if (cause == null) {
                        throw th3;
                    }
                    throw cause;
                }
            }
        }
        try {
            Object[] objArr3 = new Object[1];
            a((byte) (MenuHostHelper$$ExternalSyntheticLambda1[15] - 1), MenuHostHelper$$ExternalSyntheticLambda1[15], MenuHostHelper$$ExternalSyntheticLambda1[22], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            byte b2 = MenuHostHelper$$ExternalSyntheticLambda1[15];
            Object[] objArr4 = new Object[1];
            a(b2, (byte) (b2 - 1), (byte) (-MenuHostHelper$$ExternalSyntheticLambda1[15]), objArr4);
            Thread thread2 = (Thread) cls2.getMethod((String) objArr4[0], null).invoke(null, null);
            try {
                nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                C0454sg c0454sg = new C0454sg(oMVar);
                pN.setY((Object) th, "");
                pN.setY((Object) c0454sg, "");
                if (th != c0454sg) {
                    C0369pc.setX.setX(th, c0454sg);
                }
                nR.setX(nX.setX);
            } catch (Throwable th4) {
                nR.setIconTintList seticontintlist2 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                pN.setY((Object) th4, "");
                nR.setX(new nR.setX(th4));
            }
            thread2.getUncaughtExceptionHandler().uncaughtException(thread2, th);
        } catch (Throwable th5) {
            Throwable cause2 = th5.getCause();
            if (cause2 == null) {
                throw th5;
            }
            throw cause2;
        }
    }
}