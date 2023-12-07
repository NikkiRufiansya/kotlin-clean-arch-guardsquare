package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: o.sr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0465sr extends AbstractC0466ss implements InterfaceC0453sf {
    private final Executor setY;
    private static byte[] setX = {83, -75, 7, 97, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
    public static final int MenuHostHelper$$ExternalSyntheticLambda1 = 146;

    private static void a(int i, int i2, byte b, Object[] objArr) {
        int i3 = 16 - (b * 2);
        byte[] bArr = setX;
        int i4 = 19 - (i2 * 15);
        int i5 = 106 - i;
        byte[] bArr2 = new byte[i3];
        int i6 = -1;
        int i7 = i3 - 1;
        if (bArr == null) {
            i5 = i5 + i4 + 2;
            i4++;
            i7 = i7;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i6 = -1;
        }
        while (true) {
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i5;
            if (i8 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5 = i5 + bArr[i4] + 2;
            i4++;
            i7 = i7;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i6 = i8;
        }
    }

    public C0465sr(Executor executor) {
        this.setY = executor;
        tZ.setX(executor);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0465sr) && ((C0465sr) obj).setY == this.setY;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.setY;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // o.rQ
    public final void setY(oM oMVar, Runnable runnable) {
        try {
            this.setY.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            sB sBVar = (sB) oMVar.get(sB.MenuHostHelper$$ExternalSyntheticLambda1);
            if (sBVar != null) {
                sBVar.MenuHostHelper$$ExternalSyntheticLambda1(cancellationException);
            }
            C0457sj.setY().setY(oMVar, runnable);
        }
    }

    public final int hashCode() {
        try {
            Object[] objArr = {this.setY};
            byte b = (byte) (setX[5] + 1);
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            a(b, b2, b2, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b3 = (byte) (-setX[5]);
            byte b4 = b3;
            Object[] objArr3 = new Object[1];
            a(b3, b4, (byte) (b4 - 1), objArr3);
            return ((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // o.rQ
    public final String toString() {
        return this.setY.toString();
    }
}