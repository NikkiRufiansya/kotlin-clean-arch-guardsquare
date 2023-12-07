package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class sW extends AbstractC0478td {
    private static byte[] setLayoutAnimation = {44, -51, -23, -10, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
    public static final int setX = 41;
    private final sW MenuHostHelper$$ExternalSyntheticLambda1;
    private volatile sW _immediate;
    private final String setNavigationOnClickListener;
    private final boolean setUiOptions;
    private final Handler setY;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.sW.setLayoutAnimation
            int r6 = r6 * 3
            int r6 = r6 + 16
            int r8 = r8 * 15
            int r8 = 19 - r8
            int r7 = r7 + 105
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L36
        L19:
            r3 = 0
        L1a:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L36:
            int r8 = r8 + 1
            int r9 = r9 + r7
            int r7 = r9 + 2
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sW.a(int, byte, short, java.lang.Object[]):void");
    }

    private sW(Handler handler, String str, boolean z) {
        super((byte) 0);
        this.setY = handler;
        this.setNavigationOnClickListener = str;
        this.setUiOptions = z;
        this._immediate = z ? this : null;
        sW sWVar = this._immediate;
        if (sWVar == null) {
            sWVar = new sW(handler, str, true);
            this._immediate = sWVar;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = sWVar;
    }

    public /* synthetic */ sW(Handler handler) {
        this(handler, null);
    }

    private sW(Handler handler, String str) {
        this(handler, null, false);
    }

    @Override // o.rQ
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(oM oMVar) {
        return (this.setUiOptions && pN.MenuHostHelper$$ExternalSyntheticLambda0(Looper.myLooper(), this.setY.getLooper())) ? false : true;
    }

    @Override // o.rQ
    public final void setY(oM oMVar, Runnable runnable) {
        if (this.setY.post(runnable)) {
            return;
        }
        StringBuilder sb = new StringBuilder("The task was rejected, the handler underlying the dispatcher '");
        sb.append(this);
        sb.append("' was closed");
        CancellationException cancellationException = new CancellationException(sb.toString());
        sB sBVar = (sB) oMVar.get(sB.MenuHostHelper$$ExternalSyntheticLambda1);
        if (sBVar != null) {
            sBVar.MenuHostHelper$$ExternalSyntheticLambda1(cancellationException);
        }
        C0457sj.setY().setY(oMVar, runnable);
    }

    @Override // o.sI, o.rQ
    public final String toString() {
        String y = setY();
        if (y == null) {
            String str = this.setNavigationOnClickListener;
            if (str == null) {
                str = this.setY.toString();
            }
            if (this.setUiOptions) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".immediate");
                return sb.toString();
            }
            return str;
        }
        return y;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof sW) && ((sW) obj).setY == this.setY;
    }

    public final int hashCode() {
        try {
            Object[] objArr = {this.setY};
            byte b = (byte) (-setLayoutAnimation[5]);
            Object[] objArr2 = new Object[1];
            a((byte) (setLayoutAnimation[5] + 1), b, (byte) (b - 1), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b2 = (byte) (setLayoutAnimation[5] + 1);
            Object[] objArr3 = new Object[1];
            a(b2, b2, (byte) (-setLayoutAnimation[5]), objArr3);
            return ((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // o.sI
    public final /* bridge */ /* synthetic */ sI MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }
}