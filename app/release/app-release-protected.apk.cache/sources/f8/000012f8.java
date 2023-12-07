package o;

/* loaded from: classes.dex */
public final class xN {
    private static final byte[] setX;

    static {
        pN.setY("0123456789abcdef", "");
        byte[] bytes = "0123456789abcdef".getBytes(qQ.setIconTintList);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) bytes, "");
        setX = bytes;
    }

    public static final byte[] setIconTintList() {
        return setX;
    }

    public static final String setX(C0602xo c0602xo, long j) {
        pN.setY(c0602xo, "");
        if (j > 0) {
            long j2 = j - 1;
            if (c0602xo.MenuHostHelper$$ExternalSyntheticLambda1(j2) == 13) {
                String y = c0602xo.setY(j2, qQ.setIconTintList);
                c0602xo.setOnLongClickListener(2L);
                return y;
            }
        }
        String y2 = c0602xo.setY(j, qQ.setIconTintList);
        c0602xo.setOnLongClickListener(1L);
        return y2;
    }

    public static /* synthetic */ int setY(C0602xo c0602xo, C0612xw c0612xw) {
        return MenuHostHelper$$ExternalSyntheticLambda1(c0602xo, c0612xw, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x009e, code lost:
        if (r19 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00a0, code lost:
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00a1, code lost:
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int MenuHostHelper$$ExternalSyntheticLambda1(o.C0602xo r17, o.C0612xw r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 166
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.xN.MenuHostHelper$$ExternalSyntheticLambda1(o.xo, o.xw, boolean):int");
    }
}