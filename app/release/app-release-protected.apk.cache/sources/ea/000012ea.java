package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class xC {
    private static final xE MenuHostHelper$$ExternalSyntheticLambda0;
    private static final int setIconTintList;
    private static final AtomicReference<xE>[] setX;
    private static final int setY;
    private static byte[] setNavigationOnClickListener = {4, -41, 37, 5, 16, -5, -2, -15, 7, 4, -34, 18, 8, -15, -6, 1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1};
    public static final int MenuHostHelper$$ExternalSyntheticLambda1 = 60;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 7
            int r8 = 106 - r8
            int r6 = r6 * 3
            int r6 = r6 + 13
            byte[] r0 = o.xC.setNavigationOnClickListener
            int r7 = r7 * 12
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L1a
            r8 = r7
            r4 = r8
            r3 = 0
            r7 = r6
            goto L30
        L1a:
            r3 = 0
        L1b:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L30:
            int r8 = r8 + 1
            int r6 = r6 + r4
            int r6 = r6 + 2
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.xC.a(short, short, byte, java.lang.Object[]):void");
    }

    static {
        new xC();
        setIconTintList = 65536;
        MenuHostHelper$$ExternalSyntheticLambda0 = new xE(new byte[0], 0, 0, false);
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() << 1) - 1);
        setY = highestOneBit;
        AtomicReference<xE>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        setX = atomicReferenceArr;
    }

    private xC() {
    }

    public static final xE setIconTintList() {
        AtomicReference<xE> MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0();
        xE xEVar = MenuHostHelper$$ExternalSyntheticLambda0;
        xE andSet = MenuHostHelper$$ExternalSyntheticLambda02.getAndSet(xEVar);
        if (andSet == xEVar) {
            return new xE();
        }
        if (andSet == null) {
            MenuHostHelper$$ExternalSyntheticLambda02.set(null);
            return new xE();
        }
        MenuHostHelper$$ExternalSyntheticLambda02.set(andSet.setY);
        andSet.setY = null;
        andSet.setIconTintList = 0;
        return andSet;
    }

    public static final void setIconTintList(xE xEVar) {
        AtomicReference<xE> MenuHostHelper$$ExternalSyntheticLambda02;
        xE xEVar2;
        pN.setY(xEVar, "");
        boolean z = true;
        if (!(xEVar.setY == null && xEVar.setUiOptions == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (xEVar.setUnboundedRipple || (xEVar2 = (MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0()).get()) == MenuHostHelper$$ExternalSyntheticLambda0) {
            return;
        }
        int i = xEVar2 != null ? xEVar2.setIconTintList : 0;
        if (i >= setIconTintList) {
            return;
        }
        xEVar.setY = xEVar2;
        xEVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        xEVar.setIconTintList = i + 8192;
        while (true) {
            if (!MenuHostHelper$$ExternalSyntheticLambda02.compareAndSet(xEVar2, xEVar)) {
                if (MenuHostHelper$$ExternalSyntheticLambda02.get() != xEVar2) {
                    z = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            return;
        }
        xEVar.setY = null;
    }

    private static AtomicReference<xE> MenuHostHelper$$ExternalSyntheticLambda0() {
        try {
            byte b = setNavigationOnClickListener[15];
            byte b2 = b;
            Object[] objArr = new Object[1];
            a(b, b2, (byte) (b2 - 1), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = (byte) (setNavigationOnClickListener[15] - 1);
            Object[] objArr2 = new Object[1];
            a(b3, b3, setNavigationOnClickListener[15], objArr2);
            Thread thread = (Thread) cls.getMethod((String) objArr2[0], null).invoke(null, null);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) thread, "");
            return setX[(int) (thread.getId() & (setY - 1))];
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}