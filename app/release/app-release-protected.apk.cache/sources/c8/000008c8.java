package o;

/* renamed from: o.rr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0438rr {
    private static byte[] setIconTintList = {122, 55, -29, -99, 16, -5, -2, -15, 7, 4, -34, 18, 8, -15, -6, 1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1};
    public static final int setX = 184;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0033). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 12
            int r8 = 15 - r8
            int r9 = r9 * 3
            int r9 = r9 + 13
            byte[] r0 = o.C0438rr.setIconTintList
            int r7 = r7 * 7
            int r7 = 106 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L33
        L19:
            r3 = 0
        L1a:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L2b
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2b:
            r3 = r0[r8]
            r6 = r10
            r10 = r9
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L33:
            int r7 = r7 + r9
            int r7 = r7 + 2
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0438rr.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T MenuHostHelper$$ExternalSyntheticLambda0(oM oMVar, InterfaceC0389pw<? super rU, ? super oK<? super T>, ? extends Object> interfaceC0389pw) {
        AbstractC0463sp iconTintList;
        oM MenuHostHelper$$ExternalSyntheticLambda1;
        try {
            byte b = (byte) (setIconTintList[15] - 1);
            Object[] objArr = new Object[1];
            a(b, b, setIconTintList[15], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = setIconTintList[15];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 - 1), objArr2);
            Thread thread = (Thread) cls.getMethod((String) objArr2[0], null).invoke(null, null);
            oN oNVar = (oN) oMVar.get(oN.MenuHostHelper$$ExternalSyntheticLambda0);
            if (oNVar == null) {
                sT sTVar = sT.MenuHostHelper$$ExternalSyntheticLambda1;
                iconTintList = sT.setY();
                MenuHostHelper$$ExternalSyntheticLambda1 = rO.MenuHostHelper$$ExternalSyntheticLambda1(C0469sv.setX, oMVar.plus(iconTintList));
            } else {
                if (oNVar instanceof AbstractC0463sp) {
                    AbstractC0463sp abstractC0463sp = (AbstractC0463sp) oNVar;
                }
                sT sTVar2 = sT.MenuHostHelper$$ExternalSyntheticLambda1;
                iconTintList = sT.setIconTintList();
                MenuHostHelper$$ExternalSyntheticLambda1 = rO.MenuHostHelper$$ExternalSyntheticLambda1(C0469sv.setX, oMVar);
            }
            C0433rm c0433rm = new C0433rm(MenuHostHelper$$ExternalSyntheticLambda1, thread, iconTintList);
            c0433rm.setX(rW.DEFAULT, c0433rm, interfaceC0389pw);
            return (T) c0433rm.MenuHostHelper$$ExternalSyntheticLambda1();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}