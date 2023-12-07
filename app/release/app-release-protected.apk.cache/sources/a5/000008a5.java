package o;

import o.nR;

/* loaded from: classes.dex */
public final class rZ {
    private static byte[] MenuHostHelper$$ExternalSyntheticLambda0 = {112, 31, -51, -82, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
    public static final int MenuHostHelper$$ExternalSyntheticLambda1 = 189;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r8 = r8 + 16
            byte[] r0 = o.rZ.MenuHostHelper$$ExternalSyntheticLambda0
            int r7 = r7 + 105
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L30
        L15:
            r3 = 0
        L16:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r6]
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L30:
            int r7 = r7 - r8
            int r7 = r7 + 2
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.rZ.a(short, short, int, java.lang.Object[]):void");
    }

    public static final String setY(Object obj) {
        try {
            Object[] objArr = {obj};
            byte b = MenuHostHelper$$ExternalSyntheticLambda0[5];
            Object[] objArr2 = new Object[1];
            a((byte) (MenuHostHelper$$ExternalSyntheticLambda0[8] + 1), b, (byte) (b - 1), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b2 = (byte) (-MenuHostHelper$$ExternalSyntheticLambda0[5]);
            byte b3 = (byte) (b2 + 1);
            Object[] objArr3 = new Object[1];
            a(b2, b3, b3, objArr3);
            return Integer.toHexString(((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static final String MenuHostHelper$$ExternalSyntheticLambda0(oK<?> oKVar) {
        String x;
        if (oKVar instanceof C0511uh) {
            return oKVar.toString();
        }
        try {
            nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            StringBuilder sb = new StringBuilder();
            sb.append(oKVar);
            sb.append('@');
            sb.append(setY(oKVar));
            x = nR.setX(sb.toString());
        } catch (Throwable th) {
            nR.setIconTintList seticontintlist2 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            pN.setY((Object) th, "");
            x = nR.setX(new nR.setX(th));
        }
        if (nR.setIconTintList(x) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(oKVar.getClass().getName());
            sb2.append('@');
            sb2.append(setY(oKVar));
            x = sb2.toString();
        }
        return (String) x;
    }
}