package o;

/* renamed from: o.sd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0451sd<T> extends uU {
    public int MenuHostHelper$$ExternalSyntheticLambda0;

    public abstract oK<T> setIconTintList();

    public abstract Object setNavigationOnClickListener();

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T setY(Object obj) {
        return obj;
    }

    public void setY(Object obj, Throwable th) {
    }

    public AbstractC0451sd(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
    }

    public Throwable MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        rD rDVar = obj instanceof rD ? (rD) obj : null;
        if (rDVar != null) {
            return rDVar.MenuHostHelper$$ExternalSyntheticLambda1;
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:2|3|(1:5)(1:50)|6|7|(4:9|(2:14|(9:16|(1:(1:46)(1:47))(4:20|(2:25|26)|44|26)|27|(2:29|(1:31)(1:41))|42|33|34|35|36))|48|(0))|49|(1:18)|(0)(0)|27|(0)|42|33|34|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bc, code lost:
        if (r6 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
        r2 = o.nR.MenuHostHelper$$ExternalSyntheticLambda0;
        o.pN.setY((java.lang.Object) r1, "");
        r0 = o.nR.setX(new o.nR.setX(r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[Catch: all -> 0x00e4, TryCatch #2 {all -> 0x00fc, blocks: (B:3:0x0007, B:5:0x001e, B:37:0x00ad, B:40:0x00b6, B:42:0x00be, B:9:0x0026, B:11:0x0034, B:19:0x0041, B:22:0x004f, B:24:0x0055, B:26:0x0067, B:29:0x006c, B:31:0x0078, B:35:0x00a9, B:30:0x0076, B:33:0x008a, B:34:0x009c), top: B:67:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a A[Catch: all -> 0x00e4, TryCatch #2 {all -> 0x00fc, blocks: (B:3:0x0007, B:5:0x001e, B:37:0x00ad, B:40:0x00b6, B:42:0x00be, B:9:0x0026, B:11:0x0034, B:19:0x0041, B:22:0x004f, B:24:0x0055, B:26:0x0067, B:29:0x006c, B:31:0x0078, B:35:0x00a9, B:30:0x0076, B:33:0x008a, B:34:0x009c), top: B:67:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[Catch: all -> 0x00e4, TryCatch #2 {all -> 0x00fc, blocks: (B:3:0x0007, B:5:0x001e, B:37:0x00ad, B:40:0x00b6, B:42:0x00be, B:9:0x0026, B:11:0x0034, B:19:0x0041, B:22:0x004f, B:24:0x0055, B:26:0x0067, B:29:0x006c, B:31:0x0078, B:35:0x00a9, B:30:0x0076, B:33:0x008a, B:34:0x009c), top: B:67:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #2 {all -> 0x00fc, blocks: (B:3:0x0007, B:5:0x001e, B:37:0x00ad, B:40:0x00b6, B:42:0x00be, B:9:0x0026, B:11:0x0034, B:19:0x0041, B:22:0x004f, B:24:0x0055, B:26:0x0067, B:29:0x006c, B:31:0x0078, B:35:0x00a9, B:30:0x0076, B:33:0x008a, B:34:0x009c), top: B:67:0x0007 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC0451sd.run():void");
    }

    public final void setIconTintList(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            pN.setY((Object) th, "");
            pN.setY((Object) th2, "");
            if (th != th2) {
                C0369pc.setX.setX(th, th2);
            }
        }
        if (th == null) {
            th = th2;
        }
        StringBuilder sb = new StringBuilder("Fatal exception in coroutines machinery for ");
        sb.append(this);
        sb.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        String obj = sb.toString();
        pN.setX(th);
        rP.setIconTintList(setIconTintList().setX(), new rT(obj, th));
    }
}