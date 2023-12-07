package kotlinx.coroutines.android;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.oI;
import o.oM;

/* loaded from: classes.dex */
public final class AndroidExceptionPreHandler extends oI implements CoroutineExceptionHandler {
    private static byte[] MenuHostHelper$$ExternalSyntheticLambda0 = {16, -72, -107, 15, -16, 5, 2, 15, -7, -4, 34, -18, -8, 15, 6, -1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -36, -18, -8, 15, 6, -1};
    public static final int setIconTintList = 144;
    private volatile Object _preHandler;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 7
            int r7 = r7 + 99
            byte[] r0 = kotlinx.coroutines.android.AndroidExceptionPreHandler.MenuHostHelper$$ExternalSyntheticLambda0
            int r8 = r8 * 3
            int r8 = r8 + 13
            int r6 = r6 * 12
            int r6 = 16 - r6
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L1c
            r7 = r6
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L34
        L1c:
            r3 = 0
        L1d:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r0[r6]
            r5 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L34:
            int r6 = r6 + 1
            int r7 = r7 - r8
            int r7 = r7 + 2
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.android.AndroidExceptionPreHandler.a(int, int, byte, java.lang.Object[]):void");
    }

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.Key);
        this._preHandler = this;
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        boolean z = false;
        try {
            byte b = (byte) (-MenuHostHelper$$ExternalSyntheticLambda0[15]);
            Object[] objArr = new Object[1];
            a((byte) (MenuHostHelper$$ExternalSyntheticLambda0[15] + 1), b, b, objArr);
            Method declaredMethod = Class.forName((String) objArr[0]).getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z = true;
                }
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(oM oMVar, Throwable th) {
        int i = Build.VERSION.SDK_INT;
        if (26 <= i && i < 28) {
            Method preHandler = preHandler();
            Object invoke = preHandler != null ? preHandler.invoke(null, new Object[0]) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
            if (uncaughtExceptionHandler != null) {
                try {
                    byte b = (byte) (-MenuHostHelper$$ExternalSyntheticLambda0[15]);
                    Object[] objArr = new Object[1];
                    a((byte) (MenuHostHelper$$ExternalSyntheticLambda0[15] + 1), b, b, objArr);
                    Class<?> cls = Class.forName((String) objArr[0]);
                    byte b2 = (byte) (-MenuHostHelper$$ExternalSyntheticLambda0[15]);
                    byte b3 = (byte) (b2 - 1);
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    uncaughtExceptionHandler.uncaughtException((Thread) cls.getMethod((String) objArr2[0], null).invoke(null, null), th);
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
        }
    }
}