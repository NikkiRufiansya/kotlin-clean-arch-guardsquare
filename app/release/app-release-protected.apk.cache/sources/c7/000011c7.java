package o;

/* renamed from: o.us  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0522us extends sI implements InterfaceC0453sf {
    private final String MenuHostHelper$$ExternalSyntheticLambda1;
    private final Throwable setY;

    public C0522us(Throwable th, String str) {
        this.setY = th;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
    }

    @Override // o.sI
    public final sI MenuHostHelper$$ExternalSyntheticLambda0() {
        return this;
    }

    @Override // o.rQ
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(oM oMVar) {
        setX();
        throw new nN();
    }

    @Override // o.sI, o.rQ
    public final rQ setIconTintList(int i) {
        setX();
        throw new nN();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Void setX() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.setY
            if (r0 == 0) goto L30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.<init>(r1)
            java.lang.String r1 = r4.MenuHostHelper$$ExternalSyntheticLambda1
            if (r1 == 0) goto L1f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ". "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L21
        L1f:
            java.lang.String r1 = ""
        L21:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.setY
            r1.<init>(r0, r2)
            throw r1
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0522us.setX():java.lang.Void");
    }

    @Override // o.sI, o.rQ
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dispatchers.Main[missing");
        if (this.setY != null) {
            StringBuilder sb2 = new StringBuilder(", cause=");
            sb2.append(this.setY);
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    @Override // o.rQ
    public final /* synthetic */ void setY(oM oMVar, Runnable runnable) {
        setX();
        throw new nN();
    }
}