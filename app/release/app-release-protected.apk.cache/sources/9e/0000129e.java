package o;

import java.util.logging.Handler;

/* loaded from: classes.dex */
public final class wT extends Handler {
    public static final wT setX = new wT();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    private wT() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
        r1 = r7 + 1;
     */
    @Override // java.util.logging.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void publish(java.util.logging.LogRecord r9) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            o.pN.setY(r9, r0)
            o.wS r1 = o.wS.MenuHostHelper$$ExternalSyntheticLambda1
            java.lang.String r1 = r9.getLoggerName()
            o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r1, r0)
            java.util.logging.Level r2 = r9.getLevel()
            int r2 = r2.intValue()
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            int r3 = r3.intValue()
            if (r2 <= r3) goto L20
            r2 = 5
            goto L33
        L20:
            java.util.logging.Level r2 = r9.getLevel()
            int r2 = r2.intValue()
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            int r3 = r3.intValue()
            if (r2 != r3) goto L32
            r2 = 4
            goto L33
        L32:
            r2 = 3
        L33:
            java.lang.String r3 = r9.getMessage()
            o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r3, r0)
            java.lang.Throwable r9 = r9.getThrown()
            o.pN.setY(r1, r0)
            o.pN.setY(r3, r0)
            java.util.Map<java.lang.String, java.lang.String> r4 = o.wS.setIconTintList
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            if (r4 == 0) goto L50
            goto L65
        L50:
            o.pN.setY(r1, r0)
            int r4 = r1.length()
            r6 = 23
            if (r6 <= r4) goto L5c
            goto L5e
        L5c:
            r4 = 23
        L5e:
            java.lang.String r4 = r1.substring(r5, r4)
            o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r4, r0)
        L65:
            boolean r1 = android.util.Log.isLoggable(r4, r2)
            if (r1 == 0) goto Lba
            if (r9 == 0) goto L85
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "\n"
            r1.append(r3)
            java.lang.String r9 = android.util.Log.getStackTraceString(r9)
            r1.append(r9)
            java.lang.String r3 = r1.toString()
        L85:
            int r9 = r3.length()
            r1 = 0
        L8a:
            if (r1 >= r9) goto Lba
            r6 = r3
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r7 = 10
            int r6 = o.qR.setX(r6, r7, r1, r5)
            r7 = -1
            if (r6 != r7) goto L99
            r6 = r9
        L99:
            int r7 = r1 + 4000
            int r7 = java.lang.Math.min(r6, r7)
            if (r3 == 0) goto Lb2
            java.lang.String r1 = r3.substring(r1, r7)
            o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r1, r0)
            android.util.Log.println(r2, r4, r1)
            if (r7 < r6) goto Lb0
            int r1 = r7 + 1
            goto L8a
        Lb0:
            r1 = r7
            goto L99
        Lb2:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r9.<init>(r0)
            throw r9
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wT.publish(java.util.logging.LogRecord):void");
    }
}