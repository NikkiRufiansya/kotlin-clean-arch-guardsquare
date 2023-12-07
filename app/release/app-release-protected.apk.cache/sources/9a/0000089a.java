package o;

/* loaded from: classes.dex */
public final class rR extends oI implements sS<String> {
    private static byte[] MenuHostHelper$$ExternalSyntheticLambda0 = {29, 64, 35, 67, -16, 5, 2, 15, -7, -4, 34, -18, -8, 15, 6, -1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -36, -18, -8, 15, 6, -1};
    public static final int setX = 156;
    public static final setY setY = new setY((byte) 0);
    final long MenuHostHelper$$ExternalSyntheticLambda1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r7 = r7 + 13
            byte[] r0 = o.rR.MenuHostHelper$$ExternalSyntheticLambda0
            int r8 = r8 * 7
            int r8 = 106 - r8
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = 0
            r8 = r7
            goto L2e
        L17:
            r3 = 0
        L18:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r7 = r7 - r3
            int r7 = r7 + 2
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.rR.a(short, short, int, java.lang.Object[]):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rR) && this.MenuHostHelper$$ExternalSyntheticLambda1 == ((rR) obj).MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public final int hashCode() {
        long j = this.MenuHostHelper$$ExternalSyntheticLambda1;
        return (int) (j ^ (j >>> 32));
    }

    @Override // o.sS
    public final /* synthetic */ void setX(String str) {
        String str2 = str;
        try {
            byte b = (byte) (-MenuHostHelper$$ExternalSyntheticLambda0[15]);
            Object[] objArr = new Object[1];
            a(MenuHostHelper$$ExternalSyntheticLambda0[16], b, (byte) (b - 1), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = MenuHostHelper$$ExternalSyntheticLambda0[15];
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 + 1), (byte) (-MenuHostHelper$$ExternalSyntheticLambda0[15]), objArr2);
            ((Thread) cls.getMethod((String) objArr2[0], null).invoke(null, null)).setName(str2);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* loaded from: classes.dex */
    public static final class setY implements oM$MenuHostHelper$$ExternalSyntheticLambda0<rR> {
        public /* synthetic */ setY(byte b) {
            this();
        }

        private setY() {
        }
    }

    public rR(long j) {
        super(setY);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoroutineId(");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.sS
    /* renamed from: MenuHostHelper$$ExternalSyntheticLambda1 */
    public String setIconTintList(oM oMVar) {
        int MenuHostHelper$$ExternalSyntheticLambda02;
        rV rVVar = (rV) oMVar.get(rV.setX);
        if (rVVar != null) {
            String str = rVVar.setY;
        }
        try {
            byte b = (byte) (-MenuHostHelper$$ExternalSyntheticLambda0[15]);
            Object[] objArr = new Object[1];
            a(MenuHostHelper$$ExternalSyntheticLambda0[16], b, (byte) (b - 1), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = MenuHostHelper$$ExternalSyntheticLambda0[15];
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 + 1), (byte) (-MenuHostHelper$$ExternalSyntheticLambda0[15]), objArr2);
            Thread thread = (Thread) cls.getMethod((String) objArr2[0], null).invoke(null, null);
            String name = thread.getName();
            String str2 = name;
            pN.setY(str2, "");
            int length = str2.length() - 1;
            pN.setY(str2, "");
            pN.setY(" @", "");
            if (!(str2 instanceof String)) {
                MenuHostHelper$$ExternalSyntheticLambda02 = C0421ra.MenuHostHelper$$ExternalSyntheticLambda0(str2, " @", length, 0, false, true);
            } else {
                MenuHostHelper$$ExternalSyntheticLambda02 = str2.lastIndexOf(" @", length);
            }
            if (MenuHostHelper$$ExternalSyntheticLambda02 < 0) {
                MenuHostHelper$$ExternalSyntheticLambda02 = name.length();
            }
            StringBuilder sb = new StringBuilder(9 + MenuHostHelper$$ExternalSyntheticLambda02 + 10);
            String substring = name.substring(0, MenuHostHelper$$ExternalSyntheticLambda02);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) substring, "");
            sb.append(substring);
            sb.append(" @");
            sb.append("coroutine");
            sb.append('#');
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
            String obj = sb.toString();
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) obj, "");
            thread.setName(obj);
            return name;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}