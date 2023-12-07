package o;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class rX {
    private static final boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private static final AtomicLong setIconTintList;
    private static final boolean setX;

    public static final boolean setIconTintList() {
        return false;
    }

    public static final boolean setX() {
        return MenuHostHelper$$ExternalSyntheticLambda1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r0.equals("on") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r0.equals("") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
        if ((r0 != null ? java.lang.Boolean.parseBoolean(r0) : true) != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.debug"
            java.lang.String r0 = o.C0527ux.setX(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L60
            int r3 = r0.hashCode()
            if (r3 == 0) goto L39
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto L30
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto L27
            r4 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r3 != r4) goto L43
            java.lang.String r3 = "auto"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L43
            goto L60
        L27:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L43
            goto L60
        L30:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L43
            goto L41
        L39:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L43
        L41:
            r0 = 1
            goto L61
        L43:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "System property 'kotlinx.coroutines.debug' has unrecognized value '"
            r1.<init>(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L60:
            r0 = 0
        L61:
            o.rX.MenuHostHelper$$ExternalSyntheticLambda1 = r0
            if (r0 == 0) goto L76
            java.lang.String r0 = "kotlinx.coroutines.stacktrace.recovery"
            java.lang.String r0 = o.C0527ux.setX(r0)
            if (r0 == 0) goto L72
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            goto L73
        L72:
            r0 = 1
        L73:
            if (r0 == 0) goto L76
            goto L77
        L76:
            r1 = 0
        L77:
            o.rX.setX = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            o.rX.setIconTintList = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.rX.<clinit>():void");
    }
}