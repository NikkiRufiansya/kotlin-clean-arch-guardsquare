package o;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import o.C0555vx;
import o.vZ;

/* loaded from: classes.dex */
public final class vZ$MenuHostHelper$$ExternalSyntheticLambda1 implements Runnable {
    public volatile AtomicInteger MenuHostHelper$$ExternalSyntheticLambda1;
    public final InterfaceC0537vg setIconTintList;
    public final /* synthetic */ vZ setY;
    private static byte[] setX = {37, 81, 122, 15, 16, -5, -2, -15, 7, 4, -34, 18, 8, -15, -6, 1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1};
    public static final int MenuHostHelper$$ExternalSyntheticLambda0 = 172;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.vZ$MenuHostHelper$$ExternalSyntheticLambda1.setX
            int r8 = r8 * 7
            int r8 = 106 - r8
            int r6 = r6 * 3
            int r6 = r6 + 13
            int r7 = r7 * 12
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L1d
            r8 = r7
            r3 = r1
            r4 = 0
            r7 = r6
            r1 = r0
            r0 = r9
            r9 = r8
            goto L36
        L1d:
            r3 = 0
        L1e:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2d
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2d:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L36:
            int r8 = r8 + r6
            int r8 = r8 + 2
            int r6 = r9 + 1
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: o.vZ$MenuHostHelper$$ExternalSyntheticLambda1.a(int, int, byte, java.lang.Object[]):void");
    }

    public vZ$MenuHostHelper$$ExternalSyntheticLambda1(vZ vZVar, InterfaceC0537vg interfaceC0537vg) {
        pN.setY(interfaceC0537vg, "");
        this.setY = vZVar;
        this.setIconTintList = interfaceC0537vg;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new AtomicInteger(0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        vZ.setY sety;
        C0547vq c0547vq;
        wR unused;
        StringBuilder sb = new StringBuilder("OkHttp ");
        C0555vx.setIconTintList y = this.setY.setOnLongClickListener.setLayoutAnimation.setY("/...");
        pN.setX(y);
        sb.append(y.MenuHostHelper$$ExternalSyntheticLambda0("").MenuHostHelper$$ExternalSyntheticLambda1("").setY().toString());
        String obj = sb.toString();
        try {
            byte b = setX[15];
            byte b2 = b;
            boolean z = true;
            Object[] objArr = new Object[1];
            a(b, b2, (byte) (b2 - 1), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = (byte) (setX[15] - 1);
            Object[] objArr2 = new Object[1];
            a(b3, b3, setX[15], objArr2);
            Thread thread = (Thread) cls.getMethod((String) objArr2[0], null).invoke(null, null);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) thread, "");
            String name = thread.getName();
            thread.setName(obj);
            try {
                sety = this.setY.ViewPager$SavedState$1;
                sety.setIconTintList();
                try {
                } catch (IOException e) {
                    e = e;
                    z = false;
                } catch (Throwable th) {
                    th = th;
                    z = false;
                }
                try {
                    this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(this.setY, this.setY.setX());
                    c0547vq = this.setY.setIconTintList.setOnLongClickListener;
                } catch (IOException e2) {
                    e = e2;
                    if (z) {
                        wR$MenuHostHelper$$ExternalSyntheticLambda1 wr_menuhosthelper__externalsyntheticlambda1 = wR.setX;
                        unused = wR.MenuHostHelper$$ExternalSyntheticLambda1;
                        StringBuilder sb2 = new StringBuilder("Callback failure for ");
                        sb2.append(vZ.setY(this.setY));
                        wR.setX(sb2.toString(), 4, e);
                    } else {
                        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(this.setY, e);
                    }
                    c0547vq = this.setY.setIconTintList.setOnLongClickListener;
                    pN.setY(this, "");
                    this.MenuHostHelper$$ExternalSyntheticLambda1.decrementAndGet();
                    c0547vq.setX(c0547vq.MenuHostHelper$$ExternalSyntheticLambda1, this);
                } catch (Throwable th2) {
                    th = th2;
                    this.setY.MenuHostHelper$$ExternalSyntheticLambda1();
                    if (!z) {
                        StringBuilder sb3 = new StringBuilder("canceled due to ");
                        sb3.append(th);
                        IOException iOException = new IOException(sb3.toString());
                        IOException iOException2 = iOException;
                        pN.setY((Object) iOException2, "");
                        pN.setY((Object) th, "");
                        if (iOException2 != th) {
                            C0369pc.setX.setX(iOException2, th);
                        }
                        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(this.setY, iOException);
                    }
                    throw th;
                }
                pN.setY(this, "");
                this.MenuHostHelper$$ExternalSyntheticLambda1.decrementAndGet();
                c0547vq.setX(c0547vq.MenuHostHelper$$ExternalSyntheticLambda1, this);
            } finally {
                thread.setName(name);
            }
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause == null) {
                throw th3;
            }
            throw cause;
        }
    }
}