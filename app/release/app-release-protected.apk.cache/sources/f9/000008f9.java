package o;

/* loaded from: classes.dex */
public final class sY<T> extends uA<T> {
    public ThreadLocal<nT<oM, Object>> setX;

    public sY(oM oMVar, oK<? super T> oKVar) {
        super(oMVar.get(sV.MenuHostHelper$$ExternalSyntheticLambda1) == null ? oMVar.plus(sV.MenuHostHelper$$ExternalSyntheticLambda1) : oMVar, oKVar);
        this.setX = new ThreadLocal<>();
        if (oKVar.setX().get(oN.MenuHostHelper$$ExternalSyntheticLambda0) instanceof rQ) {
            return;
        }
        Object MenuHostHelper$$ExternalSyntheticLambda0 = uD.MenuHostHelper$$ExternalSyntheticLambda0(oMVar, null);
        uD.setX(oMVar, MenuHostHelper$$ExternalSyntheticLambda0);
        this.setX.set(new nT<>(oMVar, MenuHostHelper$$ExternalSyntheticLambda0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (r4 != false) goto L27;
     */
    @Override // o.uA, o.AbstractC0430rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.ThreadLocal<o.nT<o.oM, java.lang.Object>> r0 = r7.setX
            java.lang.Object r0 = r0.get()
            o.nT r0 = (o.nT) r0
            r1 = 0
            if (r0 == 0) goto L19
            A r2 = r0.MenuHostHelper$$ExternalSyntheticLambda0
            o.oM r2 = (o.oM) r2
            B r0 = r0.setX
            o.uD.setX(r2, r0)
            java.lang.ThreadLocal<o.nT<o.oM, java.lang.Object>> r0 = r7.setX
            r0.set(r1)
        L19:
            o.oK<T> r0 = r7.setY
            java.lang.Object r8 = o.rJ.MenuHostHelper$$ExternalSyntheticLambda0(r8, r0)
            o.oK<T> r0 = r7.setY
            o.oM r2 = r0.setX()
            java.lang.Object r3 = o.uD.MenuHostHelper$$ExternalSyntheticLambda0(r2, r1)
            o.uy r4 = o.uD.MenuHostHelper$$ExternalSyntheticLambda1
            if (r3 == r4) goto L32
            o.sY r0 = o.rO.MenuHostHelper$$ExternalSyntheticLambda1(r0, r2, r3)
            goto L33
        L32:
            r0 = r1
        L33:
            r4 = 0
            r5 = 1
            o.oK<T> r6 = r7.setY     // Catch: java.lang.Throwable -> L53
            r6.MenuHostHelper$$ExternalSyntheticLambda0(r8)     // Catch: java.lang.Throwable -> L53
            o.nX r8 = o.nX.setX     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L4f
            java.lang.ThreadLocal<o.nT<o.oM, java.lang.Object>> r8 = r0.setX
            java.lang.Object r8 = r8.get()
            if (r8 != 0) goto L47
            goto L4d
        L47:
            java.lang.ThreadLocal<o.nT<o.oM, java.lang.Object>> r8 = r0.setX
            r8.set(r1)
            r4 = 1
        L4d:
            if (r4 == 0) goto L52
        L4f:
            o.uD.setX(r2, r3)
        L52:
            return
        L53:
            r8 = move-exception
            if (r0 == 0) goto L67
            java.lang.ThreadLocal<o.nT<o.oM, java.lang.Object>> r6 = r0.setX
            java.lang.Object r6 = r6.get()
            if (r6 != 0) goto L5f
            goto L65
        L5f:
            java.lang.ThreadLocal<o.nT<o.oM, java.lang.Object>> r0 = r0.setX
            r0.set(r1)
            r4 = 1
        L65:
            if (r4 == 0) goto L6a
        L67:
            o.uD.setX(r2, r3)
        L6a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sY.MenuHostHelper$$ExternalSyntheticLambda1(java.lang.Object):void");
    }
}